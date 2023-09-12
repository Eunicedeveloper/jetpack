package com.example.task1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Phone
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.task1.ui.theme.Task1Theme

class signin : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Sign()

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun Sign() {
    val firstname by remember {
        mutableStateOf("")


    }
    val lastname by remember {
        mutableStateOf("")
    }

    val email by remember {
        mutableStateOf("")
    }

    val phonenumber by remember {
        mutableStateOf("")
    }

    val password by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier
            .background(Color.Gray)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {
        Text(text = "This is the SignUp Page", color = Color.Black, fontSize = 25.sp)

        Spacer(modifier = Modifier.height(15.dp))


        TextField(
            value = firstname,
            onValueChange = { firstname },
            label = { Text(text = "firstname") },
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = "username person") },

            )
        Spacer(modifier = Modifier.height(15.dp))

        TextField(value = lastname,
            onValueChange = { lastname },
            label = { Text(text = "lastname") },
            leadingIcon = { Icon(Icons.Default.Person, contentDescription = "username person") }
        )
        Spacer(modifier = Modifier.height(15.dp))

        TextField(value = email,
            onValueChange = { email },
            label = { Text(text = "email") },
            leadingIcon = { Icon(Icons.Default.Email, contentDescription = "username email") }

        )

        Spacer(modifier = Modifier.height(15.dp))


        TextField(value = phonenumber,
            onValueChange = { phonenumber },
            label = { Text(text = "phonenumber") },
            leadingIcon = { Icon(Icons.Default.Phone, contentDescription = "username phonenumber") }
        )

        Spacer(modifier = Modifier.height(15.dp))


        TextField(value = password,
            onValueChange = { password },
            label = { Text(text = "password") },
            leadingIcon = { Icon(Icons.Default.Lock, contentDescription = "username phonenumber") }
        )









    }
}