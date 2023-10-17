package com.example.modul22

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.modul22.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val list = ArrayList<Users>()

        list.addAll(
            arrayOf(
                Users("inisatu"),
                Users("inidua"),
                Users("initiga"),
                Users("iniempat"),
                Users("inilima"),
                Users("inienam"),
                Users("initujuh"),
                Users("inidelapan"),
                Users("inisembilan"),
                Users("inisepuluh"),
                Users("inisebelas"),
                Users("iniduabelas"),
                Users("initigabelas"),
                Users("iniempatbelas"),
                Users("inilimabelas"),
                Users("inienambelas"),
                Users("initujuhbelas"),
                Users("inidelapanbelas"),
                Users("inisembilanbelas"),
                Users("iniduapuluh"),
            )
        )

        val myAdapter = MainAdapter(list)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = myAdapter
    }
}