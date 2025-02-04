package com.example.app.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.example.app.domain.model.CategoryItem

@Composable
fun CategoryItem(category: CategoryItem) {
    Column(
        modifier = Modifier
            .padding(8.dp)
            .width(200.dp)
    ) {
        Box(modifier = Modifier.size(200.dp)) {
            Image(
                painter = rememberAsyncImagePainter(category.categoryImage),
                contentDescription = category.categoryName,
                modifier = Modifier
                    .fillMaxSize()
                    .clip(RoundedCornerShape(30.dp))
            )

            Box(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 16.dp, y = 8.dp)
                    .background(Color.Black.copy(alpha = 0.5f), shape = RoundedCornerShape(16.dp))
                    .padding(horizontal = 8.dp)
            ) {
                Text(
                    text = "🔴 ${category.viewCount}",
                    color = Color.White,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(text = category.categoryName, fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color.Black)
        TagRow(category.fixedTags)
    }
}