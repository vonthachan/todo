package com.example.simpletodo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.simpletodo.data.Task

class TodoAdapter(private var taskList: List<Task>) : RecyclerView.Adapter<TodoAdapter.ViewHolder>(){

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val textView: TextView

        init {
            textView = view.findViewById(R.id.tvTitle)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_todo, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = taskList[position].task.toString()
    }

    override fun getItemCount(): Int {
        return taskList.size
    }
}