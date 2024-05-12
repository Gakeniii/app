package com.example.newsprojectpractice.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.newsprojectpractice.db.ArticleDatabase
import com.example.newsprojectpractice.repository.NewsRepository
import com.example.newsprojectpractice.R
import com.example.newsprojectpractice.databinding.ActivityNewsBinding

class MainActivity : AppCompatActivity() {

    lateinit var newsViewModel: NewsViewModel
    lateinit var binding: ActivityNewsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val newsRepository = NewsRepository(ArticleDatabase(this))
        val viewModelProviderFactory = NewsViewModelProviderFactory(application, newsRepository)
        newsViewModel = ViewModelProvider(this, viewModelProviderFactory).get(NewsViewModel::class.java)

        val navHostFragrant = supportFragmentManager.findFragmentById(R.id.newsNavHostFragment) as NavHostFragment
        val navController = navHostFragrant.navController
        binding.bottomNavigationView.setupWithNavController(navController)
    }
}
