package com.home.nachosdemo.model.epoxy

import android.view.View
import android.widget.FrameLayout
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.home.nachosdemo.R
import com.home.nachosdemo.model.data.PhoneData
import me.zhouzhuo.zzhorizontalprogressbar.ZzHorizontalProgressBar

/**
 * @EpoxyModelClass(): 設置具體的佈局
 * @EpoxyAttribute: 標記需要從外部傳入的數據
 */
@EpoxyModelClass(layout = R.layout.activity_main_recycler_view_item)
abstract class PhoneEpoxyModelWithHolder(@EpoxyAttribute var food: PhoneData) :
    EpoxyModelWithHolder<PhoneEpoxyModelWithHolder.FoodHolder>() {

    override fun bind(holder: FoodHolder) {
        if (food.isShowLabel) {
            holder.labelFrameLayout.visibility = View.VISIBLE
            holder.labelTextView.text = food.labelName
        } else {
            holder.labelFrameLayout.visibility = View.GONE
        }
        holder.phoneModelTextView.text = food.phoneModel
        holder.phoneDetailTextView.text = food.phoneDetail
        holder.phoneScoreTextView.text = food.phoneScore.toString()

        // 如果只有設置一次, 進度圖沒有反應, 需要設置兩次
        holder.progressBar.progress = food.phoneScore
        holder.progressBar.max = food.userPhoneScore
        holder.progressBar.progress = food.phoneScore
        holder.progressBar.max = food.userPhoneScore
    }

    /**
     * 相當於Google的RecyclerView.ViewHolder類
     */
    inner class FoodHolder : BaseEpoxyHolder() {
        val labelFrameLayout by bind<FrameLayout>(R.id.labelFrameLayout)
        val labelTextView by bind<TextView>(R.id.labelTextView)
        val phoneModelTextView by bind<TextView>(R.id.phoneModelTextView)
        val phoneDetailTextView by bind<TextView>(R.id.phoneDetailTextView)
        val phoneScoreTextView by bind<TextView>(R.id.phoneScoreTextView)
        val progressBar by bind<ZzHorizontalProgressBar>(R.id.progressBar)
    }
}


