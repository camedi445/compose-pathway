package com.camedi.composepathway

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.camedi.composepathway.ui.theme.ComposePathwayTheme

@Composable
fun OnBoardingScreen(modifier: Modifier = Modifier) {
    var shouldShowOnBoarding by rememberSaveable { mutableStateOf(true) }

    Surface(modifier) {
        if (shouldShowOnBoarding) {
            OnBoardingStart(onContinueClicked = { shouldShowOnBoarding = false })
        } else {
            GreetingList()
        }
    }
}

@Composable
fun OnBoardingStart(
    onContinueClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Welcome")
        Button(
            modifier = Modifier.padding(vertical = 24.dp),
            onClick = onContinueClicked
        ) {
            Text("Continue")
        }
    }
}

@Preview(showBackground = true, widthDp = 320, heightDp = 320)
@Composable
fun OnBoardingPreview() {
    ComposePathwayTheme {
        OnBoardingScreen(Modifier.fillMaxSize())
    }
}