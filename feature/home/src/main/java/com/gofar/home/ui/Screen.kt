import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Composition




@Composable
fun ProductScreen(){
    ScreenContent(title="Product")

}

@Composable
fun OrderScreen(){
    ScreenContent(title="order")
}

@Composable
fun AccountScreen(){
    ScreenContent(title="Account")
}

@Composable
fun ScreenContent(title: String){
   Column{
        Text(title)
   }
}