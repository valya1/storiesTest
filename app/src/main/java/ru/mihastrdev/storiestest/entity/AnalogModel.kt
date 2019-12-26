package ru.mihastrdev.storiestest.entity

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class AnalogModel(

    @SerializedName("product_id")
    val productId: Long? = null,

    @SerializedName("name")
    val name: String = "",

    @SerializedName("volume")
    val volume: String = "",

    @SerializedName("is_analog")
    val isAnalog: Boolean = false,

    @SerializedName("has_analog")
    val hasAnalog: Boolean = false,

    @SerializedName("analog_desc")
    val analogDesc: String = "",

    @SerializedName("category_id")
    val categoryId: Int? = null,

    @SerializedName("preview_url")
    val previewUrl: String? = null,

    @SerializedName("image_url")
    val imageUrl: String? = null,

    @SerializedName("first_price")
    val isFirstPrice: Boolean = false
) : Parcelable