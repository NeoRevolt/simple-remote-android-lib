package com.neorevolt.my_remote_library

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neorevolt.my_remote_library.databinding.ActivityDetailLibraryBinding

class DetailLibraryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailLibraryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailLibraryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val detail = intent.getStringExtra(EXTRA_DETAIL)

        binding.apply {
            tvDetail.text = detail
        }
    }

    companion object{
        const val EXTRA_DETAIL = "extra_detail"
    }
}