package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.neorevolt.my_remote_library.Bekasi
import com.neorevolt.my_remote_library.DetailLibraryActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val jalan = Bekasi.jalan[1]

        binding.apply {
            btnToLib.setOnClickListener {
                Intent(
                    this@MainActivity,
                    Class.forName("com.neorevolt.my_remote_library.DetailLibraryActivity")
                ).also {
                    it.putExtra(DetailLibraryActivity.EXTRA_DETAIL, jalan)
                    startActivity(it)
                }
            }
        }
    }
}