package com.example.auth.signin

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Devices.NEXUS_5
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.auth.MainActivity
import com.example.ui.components.JelloButtonPrimary
import com.example.ui.components.JelloButtonSosmedRow
import com.example.ui.components.JelloEditText
import com.example.ui.components.JelloImageViewClick
import com.example.ui.components.JelloTextHeader
import com.example.ui.components.JelloTextRegular
import com.example.ui.components.JelloTextRegulerWithClick
import com.example.ui.components.JelloTextViewRow

@Composable
fun SigninScreen(
    navController: NavController= rememberNavController()
){
    Column(
        modifier = Modifier
            .padding(30.dp)
            .background(Color.White)
    ) {
        JelloImageViewClick(
            onClick = {


            }
        )

        Spacer(modifier = Modifier.height(30.dp))
        JelloTextHeader(
            text="Welcome to login",
            modifier = Modifier.padding(horizontal = 16.dp)
        )
        Spacer(modifier = Modifier.height(10.dp))
        JelloTextRegulerWithClick(
            text="Please fill E-mail & password to login your app account.",
            modifier = Modifier.padding(horizontal = 16.dp),
            textClick = " Sign Up",
            onClick={
                    navController.navigate(MainActivity.Screen.AuthSignup.route)
            }
        )

        Spacer(modifier = Modifier.height(25.dp))
        JelloTextRegular(
            text="E-mail",
            modifier = Modifier.padding(horizontal = 16.dp)

        )
        Spacer(modifier = Modifier.height(10.dp))

        JelloEditText(

        )

        Spacer(modifier = Modifier.height(20.dp))

        JelloTextRegular(
            text="Password",
            modifier = Modifier.padding(horizontal = 16.dp)

        )
        Spacer(modifier=Modifier.height(10.dp))
        JelloEditText(
            visualTransformation = PasswordVisualTransformation()

        )

        Spacer(modifier = Modifier.height(30.dp))

        JelloTextViewRow()

        Spacer(modifier = Modifier.height(10.dp))

        JelloButtonPrimary()

        Spacer(modifier = Modifier.height(20.dp))
        JelloButtonSosmedRow(
            {},
            {},
        )
        Spacer(modifier = Modifier.height(30.dp))
    }
}

@Preview(
    showBackground = true,
    device = NEXUS_5
)
@Composable
fun signInPreview(){
    SigninScreen()
}