package lat.pam.pizza

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import lat.pam.pizzarestaurant.R

@Composable
fun SecondScreen(navController: NavController, myname : String?, mystore : String?) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.person_male_1),
                contentDescription = null,
                modifier = Modifier
                    .size(50.dp)
                    .background(Color.White)
                    .padding(8.dp)
            )
            Text(
                text = "Hello $myname",
                modifier = Modifier
                    .background(color = Color.White)
                    .padding(10.dp),
                style = TextStyle(
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold
                )
            )
        }
        Image(
            painter = painterResource(id = R.drawable.main_1),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()

        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Store",
                modifier = Modifier
                    .padding(30.dp)
            )
            Spacer(Modifier.weight(1f))
            Text(
                text = "$mystore",
                modifier = Modifier
                    .padding(30.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text(
                text = "Location",
                modifier = Modifier
                    .padding(start = 30.dp)
            )
            Spacer(Modifier.weight(1f))
            Text(
                text = "Find on Maps",
                modifier = Modifier
                    .padding(end = 30.dp)
            )
        }
        Button(
            onClick = { navController.navigate("Third/$myname/$mystore") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(213, 47, 47)),
            shape = RoundedCornerShape(0)

        ) {
            Text(text = "See Menus")
        }
    }
}