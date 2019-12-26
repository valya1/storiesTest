package ru.mihastrdev.storiestest

import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.napoleonit.monita.util.list.InvalidatableRecyclerAdapter
import kotlinx.android.synthetic.main.item_story.view.*
import ru.mihastrdev.storiestest.base.BaseViewHolder
import ru.mihastrdev.storiestest.base.setSafeOnClickListener

class StoriesAdapter(val onStoryClick: (StoryAdapterItem) -> Unit) :
    InvalidatableRecyclerAdapter<StoryAdapterItem>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
            : BaseViewHolder<StoryAdapterItem> = StoryItem(parent, viewType)

    inner class StoryItem(viewGroup: ViewGroup, layoutId: Int) : BaseViewHolder<StoryAdapterItem>(
        viewGroup,
        layoutId
    ) {
        override fun bindTo(item: StoryAdapterItem) {
            with(itemView) {
                Glide.with(this)
                    .load(item.previewUri)
                    .into(imagePreview)

                tvDescription.text = item.title
            }

            itemView.setSafeOnClickListener { onStoryClick(item) }
        }
    }
}