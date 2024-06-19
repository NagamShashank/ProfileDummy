package com.example.profiledummy

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.profiledummy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private lateinit var adapter : UserAdapter

    var empList: ArrayList<UserData> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadList()
        loadRecyclerview()
    }

    private fun loadList(){
        val provider = DataProvider()
        empList.addAll(provider.getData())
    }

    private fun loadRecyclerview(){
        adapter = UserAdapter(this,empList)
        binding.recyclerviewUser.adapter = adapter
        binding.recyclerviewUser.layoutManager = LinearLayoutManager(this)
    }
}