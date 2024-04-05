package com.erick.loginregmidmorn

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
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
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.erick.loginregmidmorn.ui.theme.LoginRegMidMornTheme

class RegisterActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoginRegMidMornTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   // Greeting("Android")
                    Register()
                }
            }
        }
    }
}

@Composable
fun Register() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var confirmpaa by remember { mutableStateOf("") }
    val context= LocalContext.current

    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(Color.White)){
        Text(text = "eMoblis Login",
            color = Color.Red,
            fontSize = 30.sp,
            fontFamily = FontFamily.Cursive,
            modifier = Modifier.clickable {


            }
        )
        OutlinedTextField(
            value = name,
            onValueChange ={name=it},
            leadingIcon = { Icon(imageVector = Icons.Default.Person ,
                contentDescription = "pass")
            },
            label = { Text(text = "Enter Name",
                color = Color.Blue,
                fontFamily = FontFamily.Monospace,
                fontSize = 25.sp
            )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        OutlinedTextField(
            value = email,
            onValueChange ={email=it},
            leadingIcon = { Icon(imageVector =Icons.Default.Email ,
                contentDescription = "pass")},
            label = { Text(text = "Enter Email",
                color = Color.Blue,
                fontFamily = FontFamily.Monospace,
                fontSize = 25.sp
            )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        OutlinedTextField(
            value = password,
            onValueChange ={password=it},
            leadingIcon = { Icon(imageVector =Icons.Default.Lock ,
                contentDescription = "pass")},
            label = { Text(text = "Enter password",
                color = Color.Blue,
                fontFamily = FontFamily.Monospace,
                fontSize = 25.sp
            )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        OutlinedTextField(
            value = confirmpaa,
            onValueChange ={confirmpaa=it},
            leadingIcon = { Icon(imageVector =Icons.Default.Lock ,
                contentDescription = "pass")},
            label = { Text(text = "Confirm pass",
                color = Color.Blue,
                fontFamily = FontFamily.Monospace,
                fontSize = 25.sp
            )},
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)
        )
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = { /*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()) {
            Text(text = "Register",
                fontSize = 25.sp)

        }
        Spacer(modifier = Modifier.height(30.dp))
        Button(onClick = {
                         val intent=Intent(context,MainActivity::class.java)
            context.startActivity(intent)
        },
            modifier = Modifier
                .fillMaxWidth()) {
            Text(text = "Click to log in",
                fontSize = 25.sp)

        }


    }


}
@Preview
@Composable
private fun Regprev() {
    Register()
    
}