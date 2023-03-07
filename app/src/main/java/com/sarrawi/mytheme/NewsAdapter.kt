package com.sarrawi.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.sarrawi.mytheme.NewsItem
import com.sarrawi.mytheme.R
import java.util.*

class NewsAdapter : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>,
    Filterable {
    var mContext: Context
    var mData: List<NewsItem>
    var mDataFiltered: List<NewsItem>
    var isDark = false

    constructor(mContext: Context, mData: List<NewsItem>, isDark: Boolean) {
        this.mContext = mContext
        this.mData = mData
        this.isDark = isDark
        mDataFiltered = mData
    }

    constructor(mContext: Context, mData: List<NewsItem>) {
        this.mContext = mContext
        this.mData = mData
        mDataFiltered = mData
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): NewsViewHolder {
        val layout: View
        layout = LayoutInflater.from(mContext).inflate(R.layout.item_news, viewGroup, false)
        return NewsViewHolder(layout)
    }

    override fun onBindViewHolder(newsViewHolder: NewsViewHolder, position: Int) {

        // bind data here

        // we apply animation to views here
        // first lets create an animation for user photo
        newsViewHolder.img_user.animation =
            AnimationUtils.loadAnimation(mContext, R.anim.fade_transition_animation)

        // lets create the animation for the whole card
        // first lets create a reference to it
        // you ca use the previous same animation like the following

        // but i want to use a different one so lets create it ..
        newsViewHolder.container.animation =
            AnimationUtils.loadAnimation(mContext, R.anim.fade_scale_animation)
        newsViewHolder.tv_title.setText(mDataFiltered[position].Title)
        newsViewHolder.tv_content.setText(mDataFiltered[position].Content)
        newsViewHolder.tv_date.setText(mDataFiltered[position].Date)
        newsViewHolder.img_user.setImageResource(mDataFiltered[position].userPhoto)
    }

    override fun getItemCount(): Int {
        return mDataFiltered.size
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence): FilterResults {
                val Key = constraint.toString()
                mDataFiltered = if (Key.isEmpty()) {
                    mData
                } else {
                    val lstFiltered: MutableList<NewsItem> = ArrayList<NewsItem>()
                    for (row in mData) {
                        if (row.Title.toLowerCase()
                                .contains(Key.lowercase(Locale.getDefault()))
                        ) {
                            lstFiltered.add(row)
                        }
                    }
                    lstFiltered
                }
                val filterResults = FilterResults()
                filterResults.values = mDataFiltered
                return filterResults
            }

            override fun publishResults(constraint: CharSequence, results: FilterResults) {
                mDataFiltered = results.values as List<NewsItem>
                notifyDataSetChanged()
            }
        }
    }

    inner class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tv_title: TextView
        var tv_content: TextView
        var tv_date: TextView
        var img_user: ImageView
        var container: RelativeLayout
        private fun setDarkTheme() {
            container.setBackgroundResource(R.drawable.card_bg_dark)
        }

        init {
            container = itemView.findViewById(R.id.container)
            tv_title = itemView.findViewById(R.id.tv_title)
            tv_content = itemView.findViewById(R.id.tv_description)
            tv_date = itemView.findViewById(R.id.tv_date)
            img_user = itemView.findViewById(R.id.img_user)
            if (isDark) {
                setDarkTheme()
            }
        }
    }
}