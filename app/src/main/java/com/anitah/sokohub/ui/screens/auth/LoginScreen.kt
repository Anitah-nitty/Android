package com.Moses.W.N.sokohub.ui.screens.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


import com.anitah.sokohub.R

@Composable
fun LoginScreen (){



    Column(

        modifier = Modifier
            .fillMaxSize()
            .paint(painter = painterResource(R.drawable.ic_launcher_background), contentScale = ContentScale.FillBounds),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center



    ) {

        Image(
            painter= painterResource(R.drawable.ic_launcher_foreground),
            contentDescription = "register",
            modifier = Modifier.size(200.dp),


            )
        Spacer(modifier = Modifier.width(20.dp))

        Text(
            text = "Welcome Back!!",
            fontSize = 15.sp,
            fontWeight = FontWeight.SemiBold,

            )
        Spacer(modifier = Modifier.width(20.dp))

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }


        OutlinedTextField(

            value = email,
            onValueChange = {email= it},
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
            placeholder = { Text(text = "Email") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedTextColor = Yellow,

                focusedTextColor = Color.Black,
                unfocusedTrailingIconColor = Yellow,

                )

        )
        Spacer(modifier = Modifier.width(10.dp))

        OutlinedTextField(

            value = password,
            onValueChange = {password = it},
            modifier = Modifier.width(350.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
            placeholder = { Text(text = "PassWord") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedTextColor = Yellow,
                focusedTextColor = Color.Black,
                unfocusedTrailingIconColor = Yellow,

                ),
            visualTransformation = PasswordVisualTransformation()

        )
        Spacer(modifier = Modifier.width(10.dp))
        Button(
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(contentColor = Blue),
            modifier = Modifier.width(350.dp),
            onClick = {}


        ) {
            Text(
                text = "Login",

                )
        }
        Spacer(modifier = Modifier.width(10.dp))
        Text(
            text = "Don't have an account?? Register",
            fontSize = 12.sp,


            )

































    }

}

@Preview(showBackground = true)
@Composable
fun LoginScreenPreview(){
    LoginScreen()

}