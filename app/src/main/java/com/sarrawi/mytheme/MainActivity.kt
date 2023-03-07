package com.sarrawi.mytheme

import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.sarrawi.myapplication.NewsAdapter

class MainActivity : AppCompatActivity() {

    lateinit var NewsRecyclerview: RecyclerView
    lateinit var newsAdapter: NewsAdapter
    lateinit var mData: ArrayList<NewsItem>
    lateinit var fabSwitcher: FloatingActionButton
    var isDark = false
    lateinit var rootLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // let's make this activity on full screen
//        requestWindowFeature(Window.FEATURE_NO_TITLE)
//        window.setFlags(
//            WindowManager.LayoutParams.FLAG_FULLSCREEN,
//            WindowManager.LayoutParams.FLAG_FULLSCREEN
//        )
        setContentView(R.layout.activity_main)


        // ini view
        fabSwitcher = findViewById<FloatingActionButton>(R.id.fab_switcher)
        rootLayout = findViewById<ConstraintLayout>(R.id.root_layout)
        NewsRecyclerview = findViewById<RecyclerView>(R.id.news_rv)
        mData = ArrayList<NewsItem>()

        // load theme state


        // load theme state
        isDark = getThemeStatePref()
        if (isDark) {
            // dark theme is on
//            searchInput.setBackgroundResource(R.drawable.search_input_dark_style)
            rootLayout.setBackgroundColor(resources.getColor(R.color.black))

        } else {
            // light theme is on
//            searchInput.setBackgroundResource(R.drawable.search_input_style)
            rootLayout.setBackgroundColor(resources.getColor(R.color.white))
        }

        // fill list news with data
        // just for testing purpose i will fill the news list with random data
        // you may get your data from an api / firebase or sqlite database ...


        // fill list news with data
        // just for testing purpose i will fill the news list with random data
        // you may get your data from an api / firebase or sqlite database ...
        mData.add(
            NewsItem(
                "OnePlus 6T Camera Review:",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                "6 july 1994",
                R.drawable.user
            )
        )
        mData.add(
            NewsItem(
                "I love Programming And Design",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,",
                "6 july 1994",
                R.drawable.circul6
            )
        )
        mData.add(
            NewsItem(
                "My first trip to Thailand story ",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                "6 july 1994",
                R.drawable.uservoyager
            )
        )
        mData.add(
            NewsItem(
                "After Facebook Messenger, Viber now gets...",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,",
                "6 july 1994",
                R.drawable.useillust
            )
        )
        mData.add(
            NewsItem(
                "Isometric Design Grid Concept",
                "lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit",
                "6 july 1994",
                R.drawable.circul6
            )
        )
        mData.add(
            NewsItem(
                "Android R Design Concept 4K",
                "lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit ",
                "6 july 1994",
                R.drawable.user
            )
        )
        mData.add(
            NewsItem(
                "OnePlus 6T Camera Review:",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                "6 july 1994",
                R.drawable.user
            )
        )
        mData.add(
            NewsItem(
                "I love Programming And Design",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,",
                "6 july 1994",
                R.drawable.circul6
            )
        )
        mData.add(
            NewsItem(
                "My first trip to Thailand story ",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                "6 july 1994",
                R.drawable.uservoyager
            )
        )
        mData.add(
            NewsItem(
                "After Facebook Messenger, Viber now gets...",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,",
                "6 july 1994",
                R.drawable.useillust
            )
        )
        mData.add(
            NewsItem(
                "Isometric Design Grid Concept",
                "lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit",
                "6 july 1994",
                R.drawable.circul6
            )
        )
        mData.add(
            NewsItem(
                "Android R Design Concept 4K",
                "lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit ",
                "6 july 1994",
                R.drawable.user
            )
        )
        mData.add(
            NewsItem(
                "OnePlus 6T Camera Review:",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                "6 july 1994",
                R.drawable.user
            )
        )
        mData.add(
            NewsItem(
                "I love Programming And Design",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,",
                "6 july 1994",
                R.drawable.circul6
            )
        )
        mData.add(
            NewsItem(
                "My first trip to Thailand story ",
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.",
                "6 july 1994",
                R.drawable.uservoyager
            )
        )
        mData.add(
            NewsItem(
                "After Facebook Messenger, Viber now gets...",
                "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,",
                "6 july 1994",
                R.drawable.useillust
            )
        )
        mData.add(
            NewsItem(
                "Isometric Design Grid Concept",
                "lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit",
                "6 july 1994",
                R.drawable.circul6
            )
        )
        mData.add(
            NewsItem(
                "Android R Design Concept 4K",
                "lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit lorem ipsum dolor sit ",
                "6 july 1994",
                R.drawable.user
            )
        )


        // adapter ini and setup


        // adapter ini and setup
        newsAdapter = NewsAdapter(this, mData, isDark)
        NewsRecyclerview.adapter = newsAdapter
        NewsRecyclerview.layoutManager = LinearLayoutManager(this)


        fabSwitcher.setOnClickListener {
            isDark = !isDark
            if (isDark) {
                rootLayout.setBackgroundColor(resources.getColor(R.color.black))
//                searchInput.setBackgroundResource(R.drawable.search_input_dark_style)
            } else {
                rootLayout.setBackgroundColor(resources.getColor(R.color.white))
//                searchInput.setBackgroundResource(R.drawable.search_input_style)
            }
            newsAdapter = NewsAdapter(applicationContext, mData, isDark)
//            if (!search.toString().isEmpty()) {
//                newsAdapter.getFilter().filter(search)
//            }
            NewsRecyclerview.adapter = newsAdapter
            saveThemeStatePref(isDark)
        }

//        searchInput.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
//            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
//                newsAdapter.getFilter().filter(s)
//                search = s
//            }
//
//            override fun afterTextChanged(s: Editable) {}
//        })

    }

    private fun saveThemeStatePref(isDark: Boolean) {
        val pref = applicationContext.getSharedPreferences("myPref", MODE_PRIVATE)
        val editor = pref.edit()
        editor.putBoolean("isDark", isDark)
        editor.commit()
    }

    private fun getThemeStatePref(): Boolean {
        val pref =
            applicationContext.getSharedPreferences("myPref", MODE_PRIVATE)
        return pref.getBoolean("isDark", false)
    }
}