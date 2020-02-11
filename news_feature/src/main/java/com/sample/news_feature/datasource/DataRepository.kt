package com.sample.news_feature.datasource

import android.annotation.SuppressLint
import com.sample.news_feature.model.NewsDataClass
import java.util.*

object DataRepository {
    @SuppressLint("NewApi")
    fun getNews(): List<NewsDataClass> {
        val output = ArrayList<NewsDataClass>()
        (1..5).forEach { index ->
            output.add(NewsDataClass(index, "News Title $index", "News Description $index", index * 2))
        }

        return output
    }
}
