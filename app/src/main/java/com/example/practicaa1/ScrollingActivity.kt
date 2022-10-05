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

        val link1 = Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Cristiano_Ronaldo"))
        val link2 = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.realmadrid.com/landings/copas-de-europa-ganadas/index.html"))
        val link3 = Intent(Intent.ACTION_VIEW, Uri.parse("https://es.wikipedia.org/wiki/Copa_del_Rey_de_f%C3%BAtbol_2021-22")) // JEJEJEJE LA PIERDE EL VALENCIA NOBATOS
        // JEJEJEJE LA PIERDE EL VALENCIA NOBATOS

        binding.content.btnBuy.setOnClickListener{startActivity(link1)}
        binding.content.btnBuy2.setOnClickListener{startActivity(link2)}
        binding.content.btnBuy3.setOnClickListener{startActivity(link3)}

        loadImage()
        loadImage2()
        loadImage3()
    }



    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    private fun loadImage(url: String = "https://e00-expansion.uecdn.es/assets/multimedia/imagenes/2021/06/10/16233199183125.jpg") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard)
    }

    private fun loadImage2(url: String = "https://www.larazon.es/resizer/X2BVfs5s0pKmmodTqnyTD5lC4Fg=/600x400/smart/filters:format(webp):quality(65)/cloudfront-eu-central-1.images.arcpublishing.com/larazon/BTIILBNG5FAO7DQH6ZAUN4VYO4.PNG") {
        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .centerCrop()
            .into(binding.content.imgCard2)
    }
    private fun loadImage3(url: String = "https://www.futbolred.com/files/article_main/uploads/2018/02/09/5a7d9b15b304c.jpeg") {
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