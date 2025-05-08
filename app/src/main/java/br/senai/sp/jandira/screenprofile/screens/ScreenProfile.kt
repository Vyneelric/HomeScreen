package br.senai.sp.jandira.screenprofile.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.node.ModifierNodeElement
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.screenprofile.R

@Composable
fun ScreenProfile(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)

    ){
        Image(
            modifier = Modifier
                .fillMaxWidth().height(250.dp),
            painter = painterResource(R.drawable.background),
            contentDescription = "",
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(
                modifier = Modifier
                    .padding(10.dp),
            text = "Details",
            color = Color.White
            )

            Card(
                modifier = Modifier
                    .height(70.dp)
                    .width(70.dp),
                shape = CircleShape
            ){}

            Text(
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 6.dp),
                text = "Jenny Wilson",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium
            )

            Text(
                modifier = Modifier
                    .padding(bottom = 10.dp),
                text = "Sr. UI/UX Designer",
                color = Color.White,
                fontSize = 10.sp,
                fontWeight = FontWeight.Light
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ){
                Card(
                    modifier = Modifier
                        .height(65.dp)
                        .width(75.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    ),
                    border = BorderStroke(
                        width = 1.dp,
                        color = Color(0xFFFFFFFF)
                    )

                ){
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        Image(
                            modifier = Modifier
                                .height(20.dp),
                            painter = painterResource(R.drawable.mail),
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(Color.White)
                        )

                        Text(
                            modifier = Modifier
                                .padding(top = 5.dp),
                            text = "Email",
                            color = Color.White
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .height(65.dp)
                        .width(75.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    ),
                    border = BorderStroke(
                        width = 1.dp,
                        color = Color(0xFFFFFFFF)
                    )

                ){
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        Image(
                            modifier = Modifier
                                .height(20.dp),
                            painter = painterResource(R.drawable.telefone),
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(Color.White)
                        )

                        Text(
                            modifier = Modifier
                                .padding(top = 5.dp),
                            text = "Call",
                            color = Color.White
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .height(65.dp)
                        .width(75.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    ),
                    border = BorderStroke(
                        width = 1.dp,
                        color = Color(0xFFFFFFFF)
                    )

                ){
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        Image(
                            modifier = Modifier
                                .height(20.dp),
                            painter = painterResource(R.drawable.whatsapp),
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(Color.White)
                        )

                        Text(
                            modifier = Modifier
                                .padding(top = 5.dp),
                            text = "Whatsapp",
                            color = Color.White
                        )
                    }
                }
                Card(
                    modifier = Modifier
                        .height(65.dp)
                        .width(75.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent
                    ),
                    border = BorderStroke(
                        width = 1.dp,
                        color = Color(0xFFFFFFFF)
                    )

                ){
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {

                        Image(
                            modifier = Modifier
                                .height(20.dp),
                            painter = painterResource(R.drawable.star),
                            contentDescription = "",
                            colorFilter = ColorFilter.tint(Color.White)
                        )

                        Text(
                            modifier = Modifier
                                .padding(top = 5.dp),
                            text = "Favorite",
                            color = Color.White
                        )
                    }
                }
            }
        }

        Column(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
        ){
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ){
                Image(
                    modifier = Modifier
                        .height(16.dp),
                    painter = painterResource(R.drawable.mail),
                    contentDescription = "",
                    colorFilter = ColorFilter.tint(Color.Black)
                )

                Text(
                    modifier = Modifier
                        .padding(top = 5.dp),
                    text = "Email",
                    color = Color.Black
                )

            }

            Column(
                modifier = Modifier
                    .padding(start = 20.dp)
            ){
                Text(
                    modifier = Modifier,
                    text = "Official",
                    color = Color(0xff9896A1),
                    fontSize = 10.sp,
                    fontWeight = FontWeight.W400
                )
                Text(
                    modifier = Modifier
                        .padding(top = 5.dp),
                    text = "michael.mitc@example.com",
                    color = Color.Black,
                    fontSize = 14.sp
                )

                Text(
                    modifier = Modifier,
                    text = "Personal",
                    color = Color(0xff9896A1),
                    fontSize = 10.sp,
                    fontWeight = FontWeight.W400
                )
                Text(
                    modifier = Modifier
                        .padding(top = 5.dp),
                    text = "michael@example.com",
                    color = Color.Black,
                    fontSize = 14.sp
                )
            }
        }
    }
}


@Preview
@Composable
private fun ScreenProfilePreview(){
    ScreenProfile()
}