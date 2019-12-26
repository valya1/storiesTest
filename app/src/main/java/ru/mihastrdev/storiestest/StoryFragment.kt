package ru.mihastrdev.storiestest

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import ru.mihastrdev.storiestest.entity.AnalogModel

class StoryFragment : Fragment() {

    companion object {

        const val ANALOG = "analog"

        fun newInstance(analog: AnalogModel): StoryFragment {
            return StoryFragment().apply {
                arguments = bundleOf(ANALOG to analog)
            }
        }

    }

    private val analog by lazy {
        arguments?.getParcelable<AnalogModel>(ANALOG)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.layout_story, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)




    }


}
