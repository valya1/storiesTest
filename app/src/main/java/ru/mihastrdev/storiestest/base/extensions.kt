package ru.mihastrdev.storiestest.base

import android.view.View
import ru.mihastrdev.storiestest.base.SafeClickListener

fun View.setSafeOnClickListener(onSafeClick: (View) -> Unit) {
    val safeClickListener = SafeClickListener {
        onSafeClick(it)
    }
    setOnClickListener(safeClickListener)
}