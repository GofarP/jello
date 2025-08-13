package com.example.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ui.theme.VividMagenta
import org.w3c.dom.Text

@Composable
fun JelloTextHeader(
    text: String = "Welcome To Login",
    color:Color = Color.Black,
    modifier: Modifier=Modifier.padding(16.dp),
){
    Text(
        text=text,
        modifier=modifier,
        style= TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 24.sp,
            color = Color.Black,
            textAlign = TextAlign.Left
        ),
        overflow = TextOverflow.Ellipsis,
        color=color,
        maxLines = 1
    );
}
@Preview
@Composable
fun JelloTextHeaderPreview(){
   JelloTextHeader("Gofar Putra Perdana Punyanya siapa ya?")
}

@Composable
fun JelloTextRegulerWithClick(
    text: String="Please Fill E-Mail & Password to login to your app acount. ",
    textClick:String="Sign Up",
    onClick:()->Unit={},
    modifier: Modifier= Modifier.padding(16.dp)
){
    val annotatedText= buildAnnotatedString {
        append(text)
        pushStringAnnotation(
            tag = "TEXT_CLICKED",
            annotation = textClick
        )
        withStyle(
            style = SpanStyle(
                color = VividMagenta,
                fontWeight = FontWeight.Bold
            )
        ){
            append(textClick)
        }
        pop()
    }
    ClickableText(
        text = annotatedText,
        modifier=modifier,
        style= TextStyle(
            fontSize = 20.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 24.sp,
            color = Color.Black,
            textAlign = TextAlign.Left
        ),
        onClick={offset->annotatedText.getStringAnnotations(
            tag = "TEXT_CLICK",
            start = offset,
            end=offset
        ).firstOrNull()?.let {
            onClick()
        }
        }
    )
}

@Preview
@Composable
fun JelloTextRegulerWithClickPreview(){
    JelloTextRegulerWithClick()
}

@Composable
fun JelloTextRegular(
    text: String="E-mail",
    modifier: Modifier=Modifier.padding(16.dp),
    color: Color=Color.Black
){
    Text(
        text=text,
        modifier= modifier ,
        style= TextStyle(
            fontSize = 14.sp,
            fontWeight = FontWeight.Normal,
            lineHeight = 16.sp,
            color = Color.Black,
            textAlign = TextAlign.Left
        ),
        color=color
    )
}

@Preview
@Composable
fun JelloTextRegularPreview(){
    JelloTextRegular()
}