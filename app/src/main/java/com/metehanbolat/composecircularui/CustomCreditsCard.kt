package com.metehanbolat.composecircularui

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.metehanbolat.composecircularui.ui.theme.Green

@Composable
fun CustomCreditCards(
    indicatorValue: Int,
    maxIndicatorValue: Int,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(240.dp)
            .padding(10.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = 10.dp

    ) {
        Column(
            modifier = Modifier.fillMaxHeight()
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "İhtiyaç Kredisi",
                    modifier = Modifier
                        .padding(start = 10.dp)
                        .weight(3f),
                    fontWeight = FontWeight.Bold
                )
                OutlinedButton(
                    modifier = Modifier
                        .weight(1f),
                    onClick = { println("Click") }
                ) {
                    Text(
                        text = "İşlemler",
                        color = Green,
                        fontSize = 9.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            Divider(modifier = Modifier.height(2.dp))
            Row(
                Modifier.fillMaxHeight(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .weight(1f)
                        .padding(start = 20.dp),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(text = "Ödenecek Taksitler Toplamı", fontSize = 12.sp)
                    Text(text = "241.741,14 TL", fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "Taksit Tutarı", fontSize = 12.sp)
                    Text(text = "15.451,60 TL", fontWeight = FontWeight.ExtraBold)
                    Spacer(modifier = Modifier.height(10.dp))
                    Text(text = "Ödeme Tarihi", fontSize = 12.sp)
                    Text(text = "11 Şubat 2023", fontWeight = FontWeight.Bold, fontSize = 12.sp)
                }
                CustomComponent(
                    modifier = Modifier.padding(top = 10.dp, end = 20.dp),
                    indicatorValue = indicatorValue,
                    maxIndicatorValue = maxIndicatorValue
                )
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun CustomCreditCardsPreview() {
    CustomCreditCards(2, 18)
}