package com.erdemakatay.turkcell_gygy50_portfolyo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProfileCard()
        }
    }
}

@Composable
fun ProfileCard() {

    val isim="Erdem"
    val soyisim="Akatay"
    val universite="İskenderun Teknik Üniversitesi"
    val meslek="Bilgisayar Mühendisi"
    val yas= "23"
    val yetenekler=listOf("Kotlin","Android Studio","Jetpack Compose","React","SQL","Git","Github")

    Column(modifier = Modifier.fillMaxSize().padding(15.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Spacer(modifier = Modifier.height(55.dp))
        Box(
            modifier = Modifier
                .size(72.dp)
                .background(Color(0xFFEEEDFE), shape = CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "${isim[0]}${soyisim[0]}",
                fontSize = 28.sp,
                color = Color(0xFF3C3489),
                fontWeight = FontWeight.Medium
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "$isim $soyisim",
            fontWeight = FontWeight.Bold,
            fontSize =25.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = "$universite",
            fontSize = 20.sp,
            fontWeight= FontWeight.Light)


        Spacer(modifier = Modifier.height(8.dp))


        Box(
            modifier = Modifier
                .background(
                    color = Color(0xFFEEEDFE),
                    shape = RoundedCornerShape(50.dp)
                )
                .padding(horizontal = 20.dp, vertical = 6.dp)
        ) {
            Text(
                text = "$meslek · $yas",
                color = Color(0xFF3F51B5),
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium
            )
        }


        Spacer(modifier = Modifier.height(45.dp))

        Text(
            text = "Yeteneklerim",
            modifier = Modifier.align(Alignment.Start),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 16.sp)



        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = Modifier.padding(top = 8.dp)
        ) {
            items(yetenekler) {
                yetenek ->
                SkillCard(yetenek)
            }
        }
    }
}

@Composable
fun SkillCard(yetenek: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .background(
                color = Color(0xFFEEEDFE),  //
                shape = RoundedCornerShape(8.dp)
            )
            .padding(horizontal = 14.dp, vertical = 10.dp)
    ) {
        Box(
            modifier = Modifier
                .size(8.dp)
                .background(Color(0xFF534AB7), shape = CircleShape)
        )
        Spacer(modifier = Modifier.width(12.dp))
        Text(
            text = yetenek,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            color = Color(0xFF2C2C2A)
        )
    }
}













