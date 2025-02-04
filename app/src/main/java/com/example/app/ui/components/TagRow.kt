package com.example.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.app.ui.theme.ExtraLightGray


@OptIn(ExperimentalLayoutApi::class)
@Composable
fun TagRow(tags: List<String>) {
    FlowRow(
        modifier = Modifier
            .padding(top = 8.dp)
            .width(200.dp),
        horizontalArrangement = Arrangement.spacedBy(4.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        tags.forEach { tag ->
            Text(
                text = tag,
                modifier = Modifier
                    .background(ExtraLightGray, shape = RoundedCornerShape(12.dp))
                    .padding(horizontal = 6.dp),
                color = Color.DarkGray,
                fontSize = 12.sp
            )
        }
    }
}