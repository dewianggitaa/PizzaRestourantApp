package lat.pam.pizza

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import lat.pam.pizzarestaurant.R

@Composable
fun ThridScreen(navController: NavController, bokuname: String?, store: String?) {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,

        ) {
            Image(
                painter = painterResource(id = R.drawable.person_male_1),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .background(Color.Transparent)
                    .padding(8.dp)
            )
            Text(
                text = "Hello $bokuname",
                modifier = Modifier
                    .background(color = Color.Transparent)
                    .padding(10.dp)
                    .padding(end = 20.dp),
                style = TextStyle(
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Column(
            modifier = Modifier
                .padding(top = 10.dp)
        ) {
            Button(
                onClick = { navController.navigate("Fourth/$bokuname/$store") },
                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                shape = RoundedCornerShape(0)
                ){
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.circle_cropped__27__1),
                        contentDescription = null,
                        Modifier.size(130.dp)
                    )
                    Column(
                        Modifier.padding(15.dp)
                    ) {
                        Text(
                            text = "Pepperoni Pizza",
                            style = TextStyle(
                                fontSize = 20.sp,
                                fontWeight = FontWeight.Bold,
                                color = Color(115,63,14)
                            )
                        )
                        Text(
                            text = "Cocok bagi anda yang ingin merasakan pizza original dengan taburan keju dan danging asap yang lezat",
                            style = TextStyle(
                                color = Color(115,63,14),
                                fontSize = 16.sp
                            )

                        )
                    }
                }
            }
            Row(
                modifier = Modifier
                    .padding(25.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.circle_cropped__26__1),
                    contentDescription = null,
                    Modifier.size(130.dp)
                )
                Column(
                    Modifier.padding(15.dp)
                ) {
                    Text(
                        text = "Spaghetti",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(115,63,14)
                        )
                    )
                    Text(
                        text = "Cocok bagi anda yang ingin merasakan spaghetti original dengan rasa oriental",
                        style = TextStyle(
                            color = Color(115,63,14),
                            fontSize = 16.sp
                        )

                    )
                }
            }
            Row(modifier = Modifier.padding(15.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.circle_cropped__25__1),
                    contentDescription = null,
                    Modifier.size(130.dp)
                )
                Column(
                    Modifier.padding(start = 15.dp)
                ) {
                    Text(
                        text = "Burger",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(115,63,14)
                        )
                    )
                    Text(
                        text = "Cocok bagi anda yang ingin merasakan kelembutan burger berlapis keju, sayuran dan daging yang tebal",
                        style = TextStyle(
                            color = Color(115,63,14),
                            fontSize = 16.sp
                        )

                    )
                }
            }
            Row(modifier = Modifier.padding(25.dp)) {
                Image(
                    painter = painterResource(id = R.drawable.circle_cropped__25__2),
                    contentDescription = null,
                    Modifier.size(130.dp)
                )
                Column(
                    Modifier.padding(start = 15.dp)
                ) {
                    Text(
                        text = "Steak",
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color(115,63,14)
                        )
                    )
                    Text(
                        text = "Cocok bagi anda yang ingin merasakan lezatnya daging steak dipadukan dengan kentang yang lezat",
                        style = TextStyle(
                            color = Color(115,63,14),
                            fontSize = 16.sp
                        )

                    )
                }
            }
        }
    }
}