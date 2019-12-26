package ru.mihastrdev.storiestest

import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import ru.mihastrdev.storiestest.base.BaseViewHolder

class StoryAdapter(fm: FragmentManager) : FragmentStateAdapter(fm) {

    val items = mutableListOf<StoryAdapterItem>()

    override fun createFragment(position: Int): Fragment {
        return StoryFragment(items.get(position) as StoryAdapterItem.AnalogsStoryItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        StoryViewHolder(parent, viewType)

    inner class StoryViewHolder(parent: ViewGroup, layoutId: Int) :
        BaseViewHolder<StoryAdapterItem>(parent, layoutId) {
        override fun bindTo(item: StoryAdapterItem) {

            with(itemView) {

            }

        }
    }
}
