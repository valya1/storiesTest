package com.napoleonit.monita.util.list

import ru.mihastrdev.storiestest.base.BaseAdapter
import ru.mihastrdev.storiestest.base.BaseAdapterItem


abstract class InvalidatableRecyclerAdapter<T : BaseAdapterItem> : BaseAdapter<T>() {

    protected val items = mutableListOf<T>()

    override fun getItemCount() = items.size

    override fun getItem(position: Int) = items[position]

    open fun submitList(items: List<T>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    fun clear() {
        items.clear()
        notifyDataSetChanged()
    }
}