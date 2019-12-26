package ru.mihastrdev.storiestest

import ru.mihastrdev.storiestest.base.BaseAdapterItem
import ru.mihastrdev.storiestest.entity.AnalogModel

import android.net.Uri

sealed class StoryAdapterItem : BaseAdapterItem {

    override val layoutId: Int = R.layout.item_story

    abstract val previewUri: Uri

    abstract val title: String

    class AnalogsStoryItem(
        override val title: String,
        override val previewUri: Uri,
        val analogs: List<AnalogModel>
    ) : StoryAdapterItem()

//    class FirsPriceStoryItem(
//            override val title: String,
//            override val previewUri: Uri,
//            val firstPriceAnalogs: List<AnalogModel>
//    ) : StoryAdapterItem()

}