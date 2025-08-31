package com.example.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui.theme.LightOrange
import com.example.ui.theme.VeryDarkGrayishBlue
import com.example.ui.R
import com.example.ui.theme.ModerateBlue
import com.example.ui.theme.VividRed

@Composable
fun JelloButtonPrimary(
    text: String="Login Now",
    onClick:()->Unit={}
){
    JelloBaseButton(
        text=text,
        onClick = onClick,
        enabled = true,
        modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 16.dp)
            .height(56.dp),
        color= ButtonDefaults.buttonColors(
            containerColor = LightOrange,
            contentColor = VeryDarkGrayishBlue
        )
    )
}

@Composable
fun JelloButtonFacebook(
    text: String="Facebook",
    onClick:()->Unit={},
    modifier: Modifier= Modifier.fillMaxWidth()
        .padding(horizontal = 16.dp)
        .height(56.dp),
){
    JelloWithIconBaseButton(
        text=text,
        onClick = onClick,
        enabled = true,
        modifier = modifier,
        colors= ButtonDefaults.buttonColors(
            containerColor = ModerateBlue,
            contentColor = Color.White
        ),
        srcIcon = R.drawable.icons8_facebook,
        descIcon = "Facebook"
    )
}

@Composable
fun JelloButtonGoogle(
    text: String="Google",
    onClick:()->Unit={},
    modifier: Modifier= Modifier.fillMaxWidth()
        .padding(horizontal = 16.dp)
        .height(56.dp),
){
    JelloWithIconBaseButton(
        text=text,
        onClick = onClick,
        enabled = true,
        modifier = modifier,
        colors= ButtonDefaults.buttonColors(
            containerColor = VividRed,
            contentColor = Color.White
        ),
        srcIcon = R.drawable.ic_google,
        descIcon = "Google"
    )
}

@Preview
@Composable
fun JelloButtonPrimaryPreview(){
    JelloButtonPrimary()
}

@Preview
@Composable
fun JelloButtonFaceBookPreview(){
    JelloButtonFacebook()
}

@Preview
@Composable
fun JelloButtonGooglePreview(){
    JelloButtonGoogle()
}

@Composable
fun JelloButtonSosmedRow(
    onClickGoogle: () -> Unit = {},
    onClickFacebook: () -> Unit = {},
    modifier: Modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 16.dp)
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Tombol Google
        JelloButtonGoogle(
            modifier = Modifier
                .weight(1f)      // membagi ruang sama rata
                .height(56.dp),
            onClick = onClickGoogle
        )

        // Tombol Facebook
        JelloButtonFacebook(
            modifier = Modifier
                .weight(1f)
                .height(56.dp),
            onClick = onClickFacebook
        )
    }
}


@Composable
@Preview
fun JelloButtonSosmedRowPreview(){
    JelloButtonSosmedRow()
}