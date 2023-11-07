package lat.pam.pizza

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.navArgument


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Nav() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "home"){
        composable(route = "home"){
           FirstScreen(navController)
        }
        composable(
            route = "Second/{name}/{mystore}",
            arguments = listOf(
                navArgument(name = "name"){
                    type = NavType.StringType
                },
                navArgument(name = "mystore"){
                    type = NavType.StringType
                }
            )
        ){ backstackEntry ->
            SecondScreen(navController,
                myname = backstackEntry.arguments?.getString("name"),
                mystore = backstackEntry?.arguments?.getString("mystore")
            )
        }
        composable(
            route = "Third/{myname}/{mystore}",
            arguments = listOf(
                navArgument(name = "myname"){
                    type = NavType.StringType
                },
                navArgument(name = "mystore"){
                    type = NavType.StringType
                }
            )

        ) {backstateEntry ->
            ThridScreen(navController,
                bokuname = backstateEntry.arguments?.getString("myname"),
                store = backstateEntry.arguments?.getString("mystore")
            )
        }

        composable(
            route = "Fourth/{bokuname}/{store}",
                arguments = listOf(
                    navArgument(name = "bokuname"){
                        type = NavType.StringType },
                    navArgument(name = "store"){
                        type = NavType.StringType }
                )
            ){backstateEntry ->
            FourthScreen(navController,
                bokuname = backstateEntry.arguments?.getString("bokuname"),
                store = backstateEntry.arguments?.getString("store")
            )
        }
        composable(route = "Fifth/{bokuname}/{store}",
            arguments = listOf(
                navArgument(name = "bokuname"){
                    type = NavType.StringType
                },
                navArgument(name = "store"){
                    type = NavType.StringType
                }
            )
        ){backstateEntry ->
            FifthScreen(navController,
                bokuname = backstateEntry.arguments?.getString("bokuname"),
                store = backstateEntry.arguments?.getString("store")
            )
        }


    }


}