package com.example.simpletodo

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.simpletodo.data.Tasks

class MainActivity : AppCompatActivity() {

    private lateinit var addButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addButton = findViewById(R.id.btnAddTodo)
        val data = Tasks().taskList()
        val todoAdapter = TodoAdapter(data)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.adapter = todoAdapter

        addButton.setOnClickListener {
            Toast.makeText(this, "You clicked add", Toast.LENGTH_SHORT).show()
        }


    }
}