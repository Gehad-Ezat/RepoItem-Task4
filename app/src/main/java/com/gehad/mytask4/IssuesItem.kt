package com.gehad.mytask4



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableTarget
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp

@Composable
fun RepoItem2(modifier: Modifier= Modifier){
    Row (
        Modifier.fillMaxWidth()
            .padding(horizontal = 8.dp)
            .padding(top = 8.dp)
            .background(
                color=Color.White
                , shape =RoundedCornerShape(12.dp)
            )
            .clickable{
            }
    )
    {
        Image(
            modifier = Modifier.size(50.dp)
                .padding(top=8.dp, start =8.dp)
                .clip(shape = CircleShape)
            ,
            painter = painterResource(R.drawable.ic_launcher_background),
            contentDescription=null,

            )
        Column (
            Modifier.padding(10.dp)
                .weight(4f)

        ){

                Text(
                    modifier= Modifier
                        .padding(end = 8.dp, bottom = 8.dp),
                    text = "repo name repo name repo name repo name fffffffff",
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis)




            Text(text = "NONE")
            Spacer(Modifier.height(8.dp))
            Row {
            Text(text = "Created At :",
               fontWeight = FontWeight.Bold
                )
                Text(text =" 2/12/2005")
        }}
        Column(modifier= Modifier
            .padding(10.dp).weight(1f)) {  Text(text = "Open") }
    }
}