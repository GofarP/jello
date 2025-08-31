package com.example.auth

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.auth.signin.SigninScreen
import com.example.auth.signup.SignupScreen

class MainActivity : ComponentActivity() {

    sealed class Screen(val route:String){
        object AuthSignin: Screen("auth/signin")
        object AuthSignup:Screen("auth/signup")

        // Main
        object Home : Screen("home")
        object Account : Screen("account")
        object Product : Screen("product")
        object Order : Screen("order")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            com.example.ui.theme.JelloTheme {
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colorScheme.background
//                ) {
//                    Greeting("Gofar")
//                }
//                SigninScreen()
//                SignupScreen()
                val navController = rememberNavController()

                NavHost(
                    navController = navController, // ✅ pakai yang sama
                    startDestination = Screen.AuthSignin.route
                ) {
                    composable(Screen.AuthSignin.route) {
                        SigninScreen(navController = navController) // ✅ oper ke screen
                    }
                    composable(Screen.AuthSignup.route) {
                        SignupScreen(navController = navController)
                    }
                }

            }
    }
}
}
