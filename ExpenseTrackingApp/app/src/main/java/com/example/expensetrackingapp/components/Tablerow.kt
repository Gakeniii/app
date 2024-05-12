package com.example.expensetrackingapp.components


import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.expensetrackingapp.ui.theme.Destructive
import com.example.expensetrackingapp.ui.theme.TextPrimary
import com.example.expensetrackingapp.ui.theme.Typography


@Composable
fun TableRow(label: String, modifier: Modifier = Modifier, detail: (@Composable RowScope.() -> Unit)?, hasArrow: Boolean = false, isDestructive: Boolean = false) {
    val textColor = if (isDestructive == true) Destructive else TextPrimary

    val topModifier = Modifier.fillMaxWidth()
    if (onClick(label) != null){
        topModifier.clickable { onClick(label) }
    }
    topModifier.padding(horizontal = 16.dp, vertical = 10.dp)

    Row(modifier = Modifier.clickable { onClick(label) }) {

        Row(
            modifier = topModifier.fillMaxWidth()
                .clickable { onClick(label) }
                .padding(horizontal = 16.dp, vertical = 10.dp),
            horizontalArrangement = Arrangement.Absolute.Left
        ) {
            Text(text = label, style = Typography.bodyMedium, color = textColor)
            if (hasArrow) {
                Icon(
                    painter = painterResource(id = com.example.expensetrackingapp.R.drawable.chevron),
                    contentDescription = "Right Arrow"
                )
            }
            if (detail != null) {
                detail()
            }
        }
    }
}

fun onClick(label: String) {


}


