package com.example.landmarkbook

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.landmarkbook.databinding.ActivityMainBinding
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList: ArrayList<Landmark>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // landmarkList'i burada başlatıyoruz
        landmarkList = ArrayList()

        val pisa = Landmark("Pisa", "Italy", R.drawable.pisa)
        val london = Landmark("London Bridge", "England", R.drawable.london)
        val koln = Landmark("Koln", "Germany", R.drawable.koln)
        val effiel = Landmark("Effiel", "France", R.drawable.effiel)

        landmarkList.add(pisa)
        landmarkList.add(london)
        landmarkList.add(koln)
        landmarkList.add(effiel)
    }
}