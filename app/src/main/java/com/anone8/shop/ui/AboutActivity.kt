package com.anone8.shop.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anone8.shop.R
import com.anone8.shop.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAboutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupToolbar()
        displayProfile()
    }

    private fun setupToolbar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "About Me"
        binding.toolbar.setNavigationOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }
    }

    private fun displayProfile() {
        binding.apply {
            ivProfile.setImageResource(R.drawable.profile)

            tvName.text = "Maulana Kavaldo"
            tvEmail.text = "alkav.maulana@gmail.com"

            tvDescription.text = """
                Currently learning Android development through Dicoding Academy.
                
            """.trimIndent()
        }
    }
}