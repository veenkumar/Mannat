package com.mannat.utils

import android.app.Activity
import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.Window.FEATURE_NO_TITLE
import android.view.WindowManager
import androidx.annotation.NonNull
import com.mannat.R

class CustomLoader(@NonNull context: Context) : Dialog(context) {
    companion object {
        private var loader: CustomLoader? = null

        fun showLoader(activity: Activity?) {
            if (loader == null) loader = show(activity, true)
            try {
                loader?.setCancelable(false)
                loader?.show()
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        @Suppress("DEPRECATION")
        private fun show(context: Context?, cancelable: Boolean): CustomLoader {
            val dialog = CustomLoader(context!!)
            dialog.window!!.requestFeature(FEATURE_NO_TITLE)
            dialog.window!!.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN
            )
            dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog.setContentView(R.layout.dialog_loading_box)
            dialog.setCancelable(cancelable)
            dialog.show()
            return dialog
        }

        fun hideLoader() {
            try {
                if (loader != null && loader?.isShowing!!) {
                    loader?.dismiss()
                    loader = null
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}