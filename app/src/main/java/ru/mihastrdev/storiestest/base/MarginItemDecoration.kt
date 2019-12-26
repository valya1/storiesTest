package ru.mihastrdev.storiestest.base

import android.graphics.Rect
import android.view.View
import androidx.annotation.DimenRes
import androidx.recyclerview.widget.RecyclerView

class MarginItemDecoration(@DimenRes private val spacing: Int) : RecyclerView.ItemDecoration() {

    companion object {
        const val HORIZONTAL = 0
        const val VERTICAL = 1
    }

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        with(outRect) {

            val itemCount = state.itemCount
            val position = parent.getChildAdapterPosition(view)

            when (resolveDisplayMode(parent.layoutManager)) {
                HORIZONTAL -> {
                    left = spacing
                    right = if (position == itemCount - 1) spacing else 0
                    top = spacing
                    bottom = spacing
                }

                VERTICAL -> {
                    left = spacing
                    right = spacing
                    top = spacing
                    bottom = if (position == itemCount - 1) spacing else 0
                }
            }
        }
    }

    private fun resolveDisplayMode(layoutManager: RecyclerView.LayoutManager?): Int {
        return if (layoutManager != null) {
            when {
                layoutManager.canScrollHorizontally() -> HORIZONTAL
                else -> VERTICAL
            }
        } else
            VERTICAL
    }
}