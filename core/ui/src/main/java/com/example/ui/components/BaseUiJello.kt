package com.example.ui.components

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ui.R

@Composable
fun JelloBaseButton(
    modifier: Modifier= Modifier.fillMaxWidth()
        .padding(16.dp)
        .height(56.dp),
    text: String ="Login Now",
    onClick:()->Unit={},
    enabled: Boolean =true,
    shapes: Shape = RoundedCornerShape(8.dp),
    color: ButtonColors= ButtonDefaults.buttonColors(
        containerColor = Color.Black,
        contentColor = Color.White
    )
){
    Button(
        modifier=modifier,
        enabled = enabled ,
        onClick = {onClick()},
        colors = color,
        shape = shapes
    ) {
        Text(
            text=text
        )
    }
}

@Preview
@Composable
fun JelloBaseButtonPreview(){
    JelloBaseButton()
}


@Composable
fun JelloWithIconBaseButton(
    modifier:Modifier=Modifier,
    text:String="Default text",
    onClick: () -> Unit={},
    enabled: Boolean=true,
    shape: Shape=RoundedCornerShape(8.dp),
    colors:ButtonColors= ButtonDefaults.buttonColors(
        containerColor=Color.Black,
        contentColor =Color.White
    ),
    color:Color=Color.White,
    srcIcon:Int=R.drawable.icons8_facebook,
    descIcon: String="Facebook"
){

    Button(
        modifier=modifier,
        enabled = enabled,
        shape = shape,
        colors = colors,
        onClick = {onClick()}
    ) {

        Icon(
            painter = painterResource(id= srcIcon),
            contentDescription = descIcon,
            modifier= Modifier.size(24.dp),
            tint=color
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text=descIcon
        )
    }
}

@Preview
@Composable
fun JelloWithIconBaseButtonPreview(){
    JelloWithIconBaseButton()
}