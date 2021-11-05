package com.example.second_task_02_2_hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState != null){
            mCount = savedInstanceState.getInt("COUNT")
            textView_count.setText(mCount.toString())
        }
    }

    fun countUp(view: View) {
        mCount++
        textView_count.setText(mCount.toString())
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("COUNT", mCount)
    }
}