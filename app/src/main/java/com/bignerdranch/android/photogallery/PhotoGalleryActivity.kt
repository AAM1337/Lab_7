package com.bignerdranch.android.photogallery
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.content.Context
import android.content.Intent


class PhotoGalleryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_photo_gallery)
        val isFragmentContainerEmpty =
            savedInstanceState == null
        if (isFragmentContainerEmpty) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragmentContainer, PhotoGalleryFragment.newInstance())
                .commit()
        }
    }

    companion object {
        fun newIntent(context: Context): Intent
        {
            return Intent(context,
                PhotoGalleryActivity::class.java)
        }
    }

}