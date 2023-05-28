package com.shrimadbhagwat.instagram

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialogDefaults.shape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shrimadbhagwat.instagram.ui.theme.InstagramTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            InstagramTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    App()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App(modifier: Modifier = Modifier) {
    var mobile_or_email by remember {
        mutableStateOf("")
    }
    var fullname by remember {
        mutableStateOf("")
    }
    var username by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        // Logo
        Row() {
            Image(
                painter = painterResource(id = R.drawable.instagramlogo),
                contentDescription = "Instagram",
                modifier = Modifier.width(250.dp)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        // TextLine
        Text(
            text = "Sign up to see photos and videos",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray
        )
        Text(
            text = "from your friends.",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Gray
        )
        Spacer(modifier = Modifier.height(16.dp))

        // Login with Facebook
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color(0xFF4392ef)),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .padding(all = 5.dp)
                .width(320.dp)
                .height(46.dp)
        ) {

            Image(
                painter = painterResource(id = R.drawable.facebook),
                contentDescription = "fblogo",
                modifier = Modifier.size(24.dp)
            )
            Text(
                text = "  Log in with Facebook",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 18.sp
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        // OR
        Row {

//            Divider(color = Color.LightGray, thickness = 1.dp, modifier = Modifier.width(200.dp))
            Text(
                text = "OR",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray
            )
//            Divider(color = Color.LightGray, thickness = 1.dp, modifier = Modifier.width(200.dp))
        }
        Spacer(modifier = Modifier.height(16.dp))

        // Form
        // Mobile
        Row() {
            TextField(
                value = mobile_or_email,
                onValueChange = { mobile_or_email = it },
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xfffbfafb)),

                placeholder = { Text("Mobile number or email address", color = Color.Gray) },
                modifier = Modifier
                    .width(320.dp)
                    .height(50.dp)
                    .border(1.dp, Color.LightGray)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))

        // Full Name
        Row() {
            TextField(
                value = fullname,
                onValueChange = { fullname = it },
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xfffbfafb)),
                placeholder = { Text("Full Name", color = Color.Gray) },
                modifier = Modifier
                    .width(320.dp)
                    .height(50.dp)
                    .border(1.dp, Color.LightGray)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))

        // Username
        Row() {
            TextField(
                value = username,
                onValueChange = { username = it },
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xfffbfafb)),
                placeholder = { Text("Username", color = Color.Gray) },
                modifier = Modifier
                    .width(320.dp)
                    .height(50.dp)
                    .border(1.dp, Color.LightGray)
            )
        }
        Spacer(modifier = Modifier.height(8.dp))

        // Password
        Row() {
            TextField(
                value = password,
                onValueChange = { password = it },
                colors = TextFieldDefaults.textFieldColors(containerColor = Color(0xfffbfafb)),
                placeholder = { Text("Password", color = Color.Gray) },
                modifier = Modifier
                    .width(320.dp)
                    .height(50.dp)
                    .border(1.dp, Color.LightGray)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        Row() {
            Text(
                text = "People who use our service may have uploaded",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray
            )
        }
        Row() {
            Text(
                text = "your contact information to Instagram. ",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray
            )
            Text(
                text = "Learn",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF385185)
            )
        }
        Row {
            Text(
                text = "more",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF385185)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Row() {
            Text(
                text = "By signing up. you agree to our ",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray
            )
            Text(
                text = "Terms, Privacy",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF385185)
            )
        }
        Row {
            Text(
                text = "Policy ",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF385185)
            )
            Text(
                text = "and ",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Gray
            )
            Text(
                text = "Cookies Policy. ",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF385185)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
//                showMessage(LocalContext.current, mobile_or_email + "\n" + fullname + "\n" + username + "\n" + password);
            },
            colors = ButtonDefaults.buttonColors(Color(0xFF7CB8FF)),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier
                .padding(all = 5.dp)
                .width(320.dp)
        ) {

            Text(
                text = "Sign Up",
                fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 20.sp
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Divider(color = Color.LightGray, thickness = 1.dp, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(12.dp))
        Divider(color = Color.LightGray, thickness = 1.dp, modifier = Modifier.fillMaxWidth())
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Text(
                text = "Have an account? ",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF353535)
            )
            Text(
                text = "Log in",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3576FF)
            )
        }

    }
}

fun showMessage(context: Context, message:String){
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}
