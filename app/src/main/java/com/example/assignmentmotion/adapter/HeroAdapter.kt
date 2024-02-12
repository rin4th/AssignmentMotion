package com.example.assignmentmotion.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmentmotion.R
import com.example.assignmentmotion.model.Hero


class HeroAdapter(private val heroes: List<Hero>) : RecyclerView.Adapter<HeroAdapter.ViewHolder>() {

    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

        private val name : TextView = itemView.findViewById(R.id.tv_name_hero)
        private val description : TextView = itemView.findViewById(R.id.tv_description_hero)
        private val photo : ImageView = itemView.findViewById(R.id.iv_hero)

        fun bindData(hero: Hero){
            name.text = hero.name
            description.text = hero.description
            photo.setImageResource(hero.photo)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return heroes.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindData(heroes[position])
    }
}