package lat.pam.pizza

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import lat.pam.pizzarestaurant.R
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.setValue
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.toSize
import kotlin.math.exp

@OptIn(ExperimentalMaterial3Api::class)
@ExperimentalMaterial3Api
@Composable
fun FirstScreen(navController: NavController) {
    var name by remember { mutableStateOf("") }
    val list = listOf("Cihampelas", "Cibiru")
    var expandedState by remember { mutableStateOf(false) }
    var selectedItem by remember { mutableStateOf(list[0]) }
    var store by remember { mutableStateOf(selectedItem) }
    Column(
        modifier = Modifier
            .padding(50.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(id = R.drawable.rm_pizza_1_removebg_preview),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .padding(top = 120.dp)
                .padding(bottom = 80.dp)
                .align(Alignment.CenterHorizontally)
                .size(250.dp)
        )
        Text(
            text = stringResource(R.string.store),
            modifier = Modifier
                .align(Alignment.Start),
            color = Color(115,63,14),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )

        ExposedDropdownMenuBox(expanded = expandedState,
            onExpandedChange = {expandedState = !expandedState}) {

            Box {
                TextField(  value = selectedItem,
                    onValueChange = {},
                    trailingIcon = {ExposedDropdownMenuDefaults.TrailingIcon(expanded = expandedState)},
                    readOnly = true,
                    textStyle = TextStyle.Default.copy(fontSize = 16.sp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .menuAnchor(),
                    colors = TextFieldDefaults.textFieldColors(
                        containerColor = Color.White
                    ))

                ExposedDropdownMenu(expanded = expandedState,
                    onDismissRequest = { expandedState = false }) {

                    list.forEach {
                            eachoption -> DropdownMenuItem(
                        onClick = { selectedItem = eachoption
                            expandedState = false},
                        text = { Text(text = eachoption)})
                    }
                    store = selectedItem
                }
            }

        }

        Text(
            text = "Your Name",
            modifier = Modifier
                .align(Alignment.Start)
                .padding(top = 30.dp),
            color = Color(115, 63, 14),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp,)

        TextField(
            value = name,
            onValueChange = {name = it},
            placeholder = { Text(
                text = "Please fill your name")},
            modifier = Modifier
                .fillMaxWidth(),
            colors = TextFieldDefaults.textFieldColors(
                containerColor = Color.White,
                textColor = Color.Black,
                placeholderColor = Color.Gray
            ))

        Button(
            onClick = { navController.navigate("Second/$name/$store") },
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(top = 10.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(213, 47, 47)),
            shape = RoundedCornerShape(0)
        ) {
            Text(
                text = "Submit",
                color = Color.White,
                fontSize = 20.sp
            )
        }
    }

}

