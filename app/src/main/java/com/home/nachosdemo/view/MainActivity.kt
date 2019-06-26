package com.home.nachosdemo.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.home.nachosdemo.R
import com.home.nachosdemo.viewmodel.PhoneEpoxyController

class MainActivity : AppCompatActivity() {

    private val recyclerView : RecyclerView by lazy { findViewById<RecyclerView>(R.id.recyclerView) } // lazy: 避免使用val宣告變數時 給定初始值
    private val foodEpoxyController : PhoneEpoxyController by lazy { PhoneEpoxyController() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()
    }

    private fun initRecycler(){
        val linearLayoutManager = LinearLayoutManager(this)
        recyclerView.apply {
            layoutManager = linearLayoutManager
            adapter = foodEpoxyController.adapter
            val cacheSize = -1
            setItemViewCacheSize(cacheSize)
        }
        foodEpoxyController.requestModelBuild() // 此語句構建模型, 並將其添加到recycler視圖
    }
}