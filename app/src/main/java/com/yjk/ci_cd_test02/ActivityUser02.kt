package com.yjk.ci_cd_test02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/**
 * 개발자 B 클래스
 * 특별한 기능없음 ..
 */
class ActivityUser02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()
    }

    fun test() {
        Log.d("###", "test()..")
    }
}