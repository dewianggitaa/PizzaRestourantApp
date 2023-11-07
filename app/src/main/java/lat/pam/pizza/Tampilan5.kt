package lat.pam.pizza

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun FifthScreen(navController: NavController, bokuname : String?, store: String?) {
    var radiostate by remember { mutableStateOf(-1) }
    val context = LocalContext.current
    var selectedOption by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .padding(start = 30.dp)
            .padding(end = 30.dp)
            .padding(top = 20.dp),
    ) {
        Text(
            text ="Order Detail",
            modifier = Modifier
                .padding(bottom = 20.dp),
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(115,63,14)
            )
        )
        Text(text = "Nama:  $bokuname")
        Row {
            Text(text = "Store:  $store")
        }
        Row {
            Text(text = "Papperoni Pizza")
            Text(text = " sudah dipesan")
        }
        Text(
            text = "Pengiriman",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
                color = Color(115,63,14)
            ),
            modifier = Modifier
                .padding(top = 20.dp)

        )
        Column(
        ){
            val radiooption = listOf("Ambil Sendiri", "Fast Delivery (minimal 30 menit sampai)")
            radiooption.forEachIndexed{i, option:String ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp)
                        .padding(horizontal = 16.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    RadioButton(selected = radiostate == i,
                        onClick = {
                            radiostate = i
                            selectedOption = option}

                    )
                    Spacer(modifier = Modifier.size(0.dp))
                    Text(option)
                }
            }

        }
        Button(
            onClick = {
                if (selectedOption.isNotBlank()) {
                    val message = "Terimakasih $bokuname sudah memesan di toko kami. Pesanan Paperoni Pizza Anda dikirim menggunakan $selectedOption"
                    Toast.makeText(context, message, Toast.LENGTH_LONG).show()
                }
            },
            modifier = Modifier
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(containerColor = Color(213, 47, 47)),
            shape = RoundedCornerShape(0)
            ) {
            Text(text = "Done")
        }

    }
}
