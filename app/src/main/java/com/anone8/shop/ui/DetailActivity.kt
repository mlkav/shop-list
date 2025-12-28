package com.anone8.shop.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anone8.shop.R
import com.anone8.shop.data.Shop
import com.anone8.shop.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_SHOP = "extra_shop"
    }

    private lateinit var binding: ActivityDetailBinding
    private lateinit var shop: Shop

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        shop = if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra(EXTRA_SHOP, Shop::class.java)
        } else {
            @Suppress("DEPRECATION")
            intent.getParcelableExtra(EXTRA_SHOP)
        } ?: throw IllegalStateException("Shop data missing")

        setupToolbar()
        displayShopDetails()
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = shop.title
        binding.toolbar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        binding.toolbar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.action_share -> {
                    shareShop()
                    true
                }
                else -> false
            }
        }
    }

    private fun displayShopDetails() {
        binding.apply {
            ivShopImage.setImageResource(shop.imageResId)
            tvShopTitle.text = shop.title
            tvShopDescription.text = shop.description
            tvShopCategory.text = shop.category
            tvShopCompany.text = "Company: ${shop.company}"
            tvShopDate.text = "Published: ${shop.date}"
            tvRegion.text = shop.region
        }
        binding.btnVisitShop.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, android.net.Uri.parse(shop.url))
            startActivity(intent)
        }
    }

    private fun shareShop() {
        val shareIntent = Intent().apply {
            action = Intent.ACTION_SEND
            type = "text/plain"
            putExtra(Intent.EXTRA_SUBJECT, shop.title)
            putExtra(Intent.EXTRA_TEXT,
                "${shop.title}\n\n${shop.overview}\n\nRead more in the Shop App!")
        }
        startActivity(Intent.createChooser(shareIntent, "Share Shop"))
    }

    override fun onCreateOptionsMenu(menu: android.view.Menu?): Boolean {
        menuInflater.inflate(R.menu.detail_menu, menu)
        return true
    }
}