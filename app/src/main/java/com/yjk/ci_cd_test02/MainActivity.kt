package com.yjk.ci_cd_test02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


// CI Test
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()
    }

    fun test(){
        Log.d("###", "test()..")
    }
}