package com.nanda.newsapp.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.nanda.newsapp.DataNews
import com.nanda.newsapp.NewsAdapter
import com.nanda.newsapp.R
import com.nanda.newsapp.bindingNewsHeadline
import com.nanda.newsapp.databinding.FragmentAllNewsBinding
import com.nanda.newsapp.databinding.FragmentPopularBinding


class PopularFragment : Fragment() {

    private lateinit var  binding : FragmentPopularBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPopularBinding.inflate(inflater,container,false)

        binding.rvPopularNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataPopularNews)
        }
        bindingNewsHeadline(binding.newsHeadline, position = 1)
        return binding.root
    }

}