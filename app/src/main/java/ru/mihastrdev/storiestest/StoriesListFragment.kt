package ru.mihastrdev.storiestest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_stories_list.*
import ru.mihastrdev.storiestest.base.MarginItemDecoration

class StoriesListFragment : Fragment() {

    lateinit var storiesAdapter: StoriesAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_stories_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        storiesAdapter = StoriesAdapter {
            openAnalogsStory()
        }

        rvStories.adapter = storiesAdapter
        rvStories.addItemDecoration(MarginItemDecoration(R.dimen.story_margin))

    }

    private fun openAnalogsStory() {



    }
}