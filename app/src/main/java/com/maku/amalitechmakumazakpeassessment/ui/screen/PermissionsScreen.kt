package com.maku.amalitechmakumazakpeassessment.ui.screen

import android.Manifest
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLifecycleOwner
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import com.google.accompanist.permissions.ExperimentalPermissionsApi
import com.google.accompanist.permissions.PermissionState
import com.google.accompanist.permissions.rememberMultiplePermissionsState
import com.maku.amalitechmakumazakpeassessment.R
import com.maku.amalitechmakumazakpeassessment.ui.theme.AmalitechMakuMazakpeAssessmentTheme

@OptIn(ExperimentalPermissionsApi::class)
@Composable
fun PermissionsScreen() {
    val permissionsState = rememberMultiplePermissionsState(
        permissions = listOf(
            Manifest.permission.RECORD_AUDIO,
            Manifest.permission.CAMERA
        )
    )

    val lifecycleOwner = LocalLifecycleOwner.current
    DisposableEffect( // clean up callbacks or code after use
        key1 = lifecycleOwner,
        effect = {
            val observer = LifecycleEventObserver { _, event ->
                if (event == Lifecycle.Event.ON_START) {
                    permissionsState.launchMultiplePermissionRequest()
                }
            }
            lifecycleOwner.lifecycle.addObserver(observer)

            onDispose {
                lifecycleOwner.lifecycle.removeObserver(observer)
            }
        }
    )

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        permissionsState.permissions.forEach { perm ->
            when (perm.permission) {
                Manifest.permission.CAMERA -> {
                    when {
                        perm.hasPermission -> {
                            Text(
                                text = "Camera permission accepted"
                            )
                        }
                        perm.shouldShowRationale -> {
                            Text(
                                text = "Camera permission is needed to access the camera"
                            )
                        }
                        perm.isPermanentlyDenied() -> {
                            Text(
                                text = stringResource(
                                    id = R.string.deny_camera
                                )
                            )
                        }
                    }
                }
                Manifest.permission.RECORD_AUDIO -> {
                    when {
                        perm.hasPermission -> {
                            Text(
                                text = "Record audio permission accepted"
                            )
                        }
                        perm.shouldShowRationale -> {
                            Text(
                                text = "Record audio permission is needed to access the camera"
                            )
                        }
                        perm.isPermanentlyDenied() -> {
                            Text(
                                text = stringResource(
                                    id = R.string.deny_record
                                )
                            )
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PermissionsScreenPreview() {
    AmalitechMakuMazakpeAssessmentTheme {
        PermissionsScreen()
    }
}

@ExperimentalPermissionsApi
fun PermissionState.isPermanentlyDenied(): Boolean {
    return !shouldShowRationale && !hasPermission
}
