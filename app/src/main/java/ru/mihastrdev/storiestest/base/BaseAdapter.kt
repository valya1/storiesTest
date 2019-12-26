package ru.mihastrdev.storiestest.base

import androidx.recyclerview.widget.RecyclerView

abstract class BaseAdapter<T : BaseAdapterItem> : RecyclerView.Adapter<BaseViewHolder<T>>() {

    abstract fun getItem(position: Int): T

    final override fun onBindViewHolder(holder: BaseViewHolder<T>, position: Int) {
        holder.bindTo(getItem(position))
    }

    override fun getItemViewType(position: Int) = getItem(position).layoutId

}