package com.first.miwebview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.first.miwebview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {



    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val webSettings = binding.webView.settings
        webSettings.javaScriptEnabled = true

        binding.btnGitHub.setOnClickListener {
            val urlPagina = "https://github.com/yaderyaima"
            binding.webView.loadUrl(urlPagina)

        }

        binding.btnYouTube.setOnClickListener {
            val urlPagina = "https://www.youtube.com/channel/UCxl8RG60Ai5G-Ps8367Wo_g"
            binding.webView.loadUrl(urlPagina)
        }
    }
}