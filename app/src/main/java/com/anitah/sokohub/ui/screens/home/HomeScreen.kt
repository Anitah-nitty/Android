package com.anitah.sokohub.ui.screens.home

import android.graphics.Color.blue
import android.graphics.Color.green
import android.graphics.Color.red
import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.anitah.sokohub.R
import com.anitah.sokohub.ui.theme.Newblue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize()


    ) {
         //TopAppBar

        TopAppBar(
            title = { Text(text = "Home") },

            //starting icon
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                }
            },
            //icons towards the end
            actions = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "cart")
                }
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Notifications, contentDescription = "")
                }

            },

            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Newblue,
                navigationIconContentColor = Color.Black,
                titleContentColor = Color.Black,


                )
        )
        //End of TopAppBar

        Spacer(modifier = Modifier.height(10.dp))

        //searchbar

        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search, onValueChange = {search = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            //starting icon
            leadingIcon = {Icon(imageVector = Icons.Default.Search, contentDescription = "search")},

            placeholder = {Text(text = "Search products,categories...")}



        )




        //End of searchbar

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Featured Products",
            fontSize =20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Serif,
            color = Newblue,
            modifier = Modifier.padding(start = 20.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        //row

        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState())
        ) {

            Spacer(modifier = Modifier.width(10.dp))
            Column() {
                Image(

                    painter = painterResource(R.drawable.grocery),
                    contentDescription = "product",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop

                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Groceries",
                    fontSize =20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    color = Newblue,
                    modifier = Modifier.padding(start = 20.dp)
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Newblue),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.padding(start = 20.dp)


                ) {
                    Text(text = "Shop Now")

                }
            }

            Spacer(modifier = Modifier.width(20.dp))


            Column() {
                Image(

                    painter = painterResource(R.drawable.kitchenware),
                    contentDescription = "product",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop

                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Kitchenware",
                    fontSize =20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    color = Newblue,
                    modifier = Modifier.padding(start = 20.dp)
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Newblue),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.padding(start = 20.dp)


                ) {
                    Text(text = "Shop Now")

                }
            }

            Spacer(modifier = Modifier.width(10.dp))

            Column() {
                Image(

                    painter = painterResource(R.drawable.household),
                    contentDescription = "product",
                    modifier = Modifier.size(200.dp).clip(shape = RoundedCornerShape(20.dp)),
                    contentScale = ContentScale.Crop

                )
                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Household",
                    fontSize =20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.Serif,
                    color = Newblue,
                    modifier = Modifier.padding(start = 20.dp)
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(Newblue),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.padding(start = 20.dp)


                ) {
                    Text(text = "Shop Now")

                }
            }



        }




        //end of row



    }










}



@Preview(showBackground = true)
@Composable
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())



}