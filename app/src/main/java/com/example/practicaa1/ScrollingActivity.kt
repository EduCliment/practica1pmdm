package com.example.practicaa1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.webkit.URLUtil
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.practicaa1.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val link1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://aules.edu.gva.es/fp/my/index.php"))



        loadImage()
        loadImage2()
        loadImage3()
    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    private fun loadImage(url: String = "https://img.vavel.com/fb32yeawyaaypa8-1-1662376801173.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard)
    }

    private fun loadImage2(url: String = "https://img.vavel.com/fb32yeawyaaypa8-1-1662376801173.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard2)
    }
    private fun loadImage3(url: String = "https://img.vavel.com/fb32yeawyaaypa8-1-1662376801173.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard3)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}