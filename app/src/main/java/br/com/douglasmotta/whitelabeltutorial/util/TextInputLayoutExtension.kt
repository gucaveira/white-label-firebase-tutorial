package br.com.douglasmotta.whitelabeltutorial.util

import android.app.Activity
import com.google.android.material.textfield.TextInputLayout

fun TextInputLayout.setError(stringResId: Int?, activity: Activity?) {
    error = if (stringResId != null) {
        activity?.getString(stringResId)
    } else null
}