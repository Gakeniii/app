package com.example.newsprojectpractice.ui.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.newsprojectpractice.adapters.NewsAdapter
import com.example.newsprojectpractice.ui.MainActivity
import com.example.newsprojectpractice.ui.NewsViewModel
import com.example.newsprojectpractice.R
import com.example.newsprojectpractice.databinding.FragmentFavouriteBinding
import com.google.android.material.snackbar.Snackbar


class FavouriteFragment: Fragment(R.layout.fragment_favourite) {

    lateinit var newsViewModel: NewsViewModel
    lateinit var newsAdapter: NewsAdapter
    lateinit var binding: FragmentFavouriteBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFavouriteBinding.bind(view)

        newsViewModel = (activity as MainActivity).newsViewModel
        setupFavouriteRecycler()

        newsAdapter.setOnItemCLickListener {
            val bundle = Bundle().apply {
                putSerializable("article", it)
            }
            findNavController().navigate(R.id.action_favouriteFragment_to_articleFragment, bundle)
        }

        val itemTouchHelperCallback = object : ItemTouchHelper.SimpleCallback(
            ItemTouchHelper.UP or ItemTouchHelper.DOWN,
            ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
        ){
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: ViewHolder,
                target: ViewHolder
            ): Boolean {
                return true
            }

            @SuppressLint("ShowToast")
            override fun onSwiped(viewHolder: ViewHolder, direction: Int) {
                val position = viewHolder.adapterPosition
                val article = newsAdapter.differ.currentList[position]
                newsViewModel.deleteArticle(article)
                Snackbar.make(view, "Removed from favourites", Snackbar.LENGTH_LONG).apply {
                    setAction("Undo"){
                        newsViewModel.addToFavourites(article)
                    }
                    show()
                }
            }
        }
        ItemTouchHelper(itemTouchHelperCallback).apply {
            attachToRecyclerView(binding.recyclerFavourites)
        }
        newsViewModel.getFavouriteNews().observe(viewLifecycleOwner, Observer { articles ->
            newsAdapter.differ.submitList(articles)
        })
    }
    private fun setupFavouriteRecycler() {
        newsAdapter = NewsAdapter()
        binding.recyclerFavourites.apply {
            adapter = newsAdapter
            layoutManager = LinearLayoutManager(activity)
        }
    }
}