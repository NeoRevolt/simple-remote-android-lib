package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMainBinding
import com.neorevolt.drawimage.EditImageActivity
import com.neorevolt.my_remote_library.Bekasi
import com.neorevolt.my_remote_library.DetailLibraryActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val jalan = Bekasi.jalan[0]

        binding.apply {
            btnToLib.setOnClickListener {
//                Intent(
//                    this@MainActivity,
//                    Class.forName("com.neorevolt.my_remote_library.DetailLibraryActivity")
//                ).also {
//                    it.putExtra(DetailLibraryActivity.EXTRA_DETAIL, jalan)
//                    startActivity(it)
//                }
                Intent(this@MainActivity, Class.forName("com.neorevolt.drawimage.EditImageActivity")).also {
                    it.putExtra(EditImageActivity.EXTRA_REQ,"remote")
                    it.putExtra(EditImageActivity.EXTRA_PHOTO,"https://w0.peakpx.com/wallpaper/205/460/HD-wallpaper-sea-beach-beautiful-scene-clouds-deep-sea-natural-graphy-nature-beauty-graphy-lover-portrait.jpg")
                    startActivity(it)
                }
            }
        }
    }
}