package com.example.ui.components

import android.view.Surface
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height

import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.rememberPagerState
import com.example.ui.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield

@OptIn(ExperimentalPagerApi::class)
@Composable
fun BannerSliderUiJello(
    bannerImage:List<Painter>,
    onCLick:(Int)-> Unit
) {
    val pagerState=rememberPagerState()
    val scope=rememberCoroutineScope()
    Column{
        HorizontalPager(
          count=bannerImage.size,
            state=pagerState,
            modifier=Modifier.height(150.dp)
        ) { page->
            Surface{
                Image(painter = bannerImage[page],
                    contentDescription = "Banner Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxWidth()
                    )
            }
        }
    }

    LaunchedEffect(pagerState) {
        while(true){
            yield()
            delay(2000)
            scope.launch {
                val nextPage = (pagerState.currentPage + 1) % (bannerImage.size)
                pagerState.animateScrollToPage(nextPage)
            }
        }
    }
}

@Preview
@Composable
fun BannerSliderUiJelloPreview(){
    val images=listOf(
        painterResource(id = R.drawable.sample_slide1),
        painterResource(id = R.drawable.sample_slide1),
        painterResource(id = R.drawable.sample_slide1),
        )
    BannerSliderUiJello(
        bannerImage = images,
        onCLick = {

        }
    )

}