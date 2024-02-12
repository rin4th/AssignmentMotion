package com.example.assignmentmotion

import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.assignmentmotion.adapter.HeroAdapter
import com.example.assignmentmotion.model.Hero
import androidx.recyclerview.widget.LinearLayoutManager

class HeroActivity : AppCompatActivity() {

    private lateinit var rv : RecyclerView

    private lateinit var dataName : Array<String>
    private lateinit var dataDesc : Array<String>
    private lateinit var dataPhoto : TypedArray

    private var heroes = arrayListOf<Hero>()

    private lateinit var heroAdapter: HeroAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hero)
        prepareResoure()
        prepareHeroes()
        prepareRecycleView()
        prepareAdapter()
    }

    private fun prepareResoure(){
        dataName = resources.getStringArray(R.array.data_name)
        dataDesc = resources.getStringArray(R.array.data_description)
        dataPhoto = resources.obtainTypedArray(R.array.data_photo)
    }

    private fun prepareHeroes(){
        for (position in dataName.indices){
            val hero = Hero(
                dataName[position],
                dataDesc[position],
                dataPhoto.getResourceId(position, -1)
            )
            heroes.add(hero)
        }
    }

    private fun prepareRecycleView(){
        rv = findViewById(R.id.rv_heroes)
        rv.layoutManager = LinearLayoutManager(this)
//        rv.setHasFixedSize(true)
//        rv.adapter = HeroesAdapter(heroes)
    }

    private fun prepareAdapter(){
        heroAdapter = HeroAdapter(heroes)
        rv.adapter = heroAdapter
    }

}
