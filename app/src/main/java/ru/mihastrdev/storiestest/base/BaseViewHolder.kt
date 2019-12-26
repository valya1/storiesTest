package ru.mihastrdev.storiestest.base

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.pawegio.kandroid.inflateLayout

abstract class BaseViewHolder<T : BaseAdapterItem>(parent: ViewGroup, @LayoutRes layoutId: Int) :
    RecyclerView.ViewHolder(parent.context.inflateLayout(layoutId, parent, false)) {

    abstract fun bindTo(item: T)

}