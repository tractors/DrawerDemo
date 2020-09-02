package com.will.drawerdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.will.drawerdemo.databinding.FragmentTextBinding
import kotlinx.android.synthetic.main.content_layout.*
import kotlinx.android.synthetic.main.content_layout.view.*

class TextFragment : Fragment() {

    private lateinit var binding : FragmentTextBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentTextBinding.inflate(layoutInflater)
        requireActivity().collapsingToolbarLayout.title = getString(R.string.text_fragment_title)
        requireActivity().collapsingToolbarLayout.toolbarIconImage.setImageResource(R.drawable.ic_looks_one)
        return binding.root
    }
}