package com.will.drawerdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.will.drawerdemo.databinding.FragmentListBinding
import kotlinx.android.synthetic.main.content_layout.*
import kotlinx.android.synthetic.main.content_layout.view.*

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(layoutInflater)
        requireActivity().collapsingToolbarLayout.title = getString(R.string.list_fragment_title)
        requireActivity().collapsingToolbarLayout.toolbarIconImage.setImageResource(R.drawable.ic_looks_two)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val layoutManager = GridLayoutManager(requireContext(), 2)
        val adapter = MyAdapter(false)

        binding.recyclerView.layoutManager = layoutManager
        binding.recyclerView.adapter = adapter

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