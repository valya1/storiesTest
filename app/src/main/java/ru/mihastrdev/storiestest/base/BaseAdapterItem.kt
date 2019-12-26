package ru.mihastrdev.storiestest.base

import androidx.annotation.LayoutRes

interface BaseAdapterItem {
    @get:LayoutRes
    val layoutId: Int
}

