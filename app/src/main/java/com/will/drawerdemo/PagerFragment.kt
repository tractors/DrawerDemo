package com.will.drawerdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.will.drawerdemo.databinding.FragmentPagerBinding
import kotlinx.android.synthetic.main.content_layout.*
import kotlinx.android.synthetic.main.content_layout.view.*
import kotlinx.android.synthetic.main.fragment_pager.*

class PagerFragment : Fragment() {

    private lateinit var binding : FragmentPagerBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPagerBinding.inflate(layoutInflater)
        requireActivity().collapsingToolbarLayout.title = getString(R.string.pager_fragment_title)
        requireActivity().collapsingToolbarLayout.toolbarIconImage.setImageResource(R.drawable.ic_looks_three)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        var adapter = MyAdapter(true)
        viewPager2.adapter = adapter
        adapter.submitList(iconsList())
    }

    private fun iconsList(): List<Int> {
        val array = intArrayOf(
            R.drawable.ic_1,
            R.drawable.ic_2,
            R.drawable.ic_3,
            R.drawable.ic_4,
            R.drawable.ic_5,
            R.drawable.ic_6,
            R.drawable.ic_7,
            R.drawable.ic_8,
            R.drawable.ic_9
        )

        return Array(50) {
            array.random()
        }.toList()
    }
}