package com.nanda.newsapp.Fragment

import android.os.Bundle
import android.provider.ContactsContract
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


class AllNewsFragment : Fragment() {

    private lateinit var  binding : FragmentAllNewsBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAllNewsBinding.inflate(inflater,container,false)

        binding.rvAllNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataAllNews)
        }

        bindingNewsHeadline(binding.newsHeadline, position = 0)


        return binding.root
    }

}