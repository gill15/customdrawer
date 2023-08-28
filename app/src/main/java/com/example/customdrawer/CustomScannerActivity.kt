package com.example.customdrawer

import android.view.KeyEvent
import com.journeyapps.barcodescanner.CaptureActivity

class CustomScannerActivity : CaptureActivity() {

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            finish()
            return true
        }
        return super.onKeyDown(keyCode, event)
    }
}
