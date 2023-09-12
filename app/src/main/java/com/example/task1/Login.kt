package com.example.task1

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class login : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Login()

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true)
fun Login(){
    val username by remember {
        mutableStateOf("")


    }

    val password by remember {
        mutableStateOf("")

    }



    Column (
        modifier = Modifier
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top













    ){
        Image(painter = painterResource(R.drawable.logo), contentDescription =null)


        Text(text = "Login Page" , color = Color.Black, fontSize = 25.sp)

        Spacer(modifier = Modifier.height(15.dp))

        TextField(value = username,
            onValueChange = { username } ,
            label = { Text(text = "username") },
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = "username person") },

            )

        Spacer(modifier = Modifier.height(10.dp))





        TextField(value = password,
            onValueChange = { password } ,
            label = { Text(text = "password")},
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "username lock") },

            )

        Spacer(modifier = Modifier.height(17.dp))
        Button(onClick = { /*TODO*/ },
        ) {
            Text(text = "Login")

        }



    }




}