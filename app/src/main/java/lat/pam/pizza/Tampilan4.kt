package lat.pam.pizza

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.containerColor
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import lat.pam.pizzarestaurant.R

@Composable
fun FourthScreen(navController: NavController, bokuname: String?, store: String?) {
    Column {
        Box(){
            Image(
                painter = painterResource(id = R.drawable.main_2),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
                )
            Text(
                text = "Paperoni Pizza",
                style = TextStyle(
                    color = Color.White,
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(start = 20.dp)
                    .padding(bottom = 10.dp)
            )
        }
        Column(
            modifier = Modifier
                .padding(start = 30.dp)
                .padding(end = 30.dp)
                .padding(top = 20.dp)
                .padding(bottom = 20.dp)
        ) {
            Text(
                text = "RP 10000",
                modifier = Modifier
                    .align(Alignment.End)
                    .padding(bottom = 10.dp),
                style = TextStyle(
                    fontSize = 15.sp,
                    color = Color(115,63,14),
                    fontWeight = FontWeight.W500
                )
            )
            Text(
                text = "Pepperoni pizza adalah pizza yang memiliki  topping daging pepperoni sapi asli. Di Italia, pepperoni disebut salame piccante (salami panas). Biasa menjadi bahan baku pizza di Amerika Serikat, yang sering mewakili 30% pelengkap. Pizza ini cocok untuk santap siang ataupun malam anda",
                modifier = Modifier
                    .padding(bottom = 10.dp),
                style = TextStyle(
                    fontSize = 15.sp,
                    color = Color(115,63,14),
                    fontWeight = FontWeight.W500
                )
            )

            Button(onClick = { navController.navigate("Fifth/$bokuname/$store")},
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth()
                    .padding(bottom = 5.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(213, 47, 47)),
                shape = RoundedCornerShape(0)
            ) {
                Text(text = "Order Now")
            }

            Button(onClick = { navController.navigate("Third/$bokuname/$store")},
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = Color(213, 47, 47)),
                shape = RoundedCornerShape(0)
            ) {
                Text(text = "Back")
            }
        }
    }
    
    
}