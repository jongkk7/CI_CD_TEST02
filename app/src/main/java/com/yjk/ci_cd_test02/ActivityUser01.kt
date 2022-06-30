package com.yjk.ci_cd_test02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/**
 * 개발자 A 클래스
 * 함수 괄호를 밑으로 사용함.
 */
class ActivityUser01 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        test()
    }

    fun test()
    {

        Log.d("###", "test()..")

    }

    interface ICallbackTest{
        fun onCall01()
        fun onCall02()
        fun onCall03()
        fun onCall04()
        fun onCall05()
        fun onCall06()
        fun onCall07()
        fun onCall08()
        fun onCall09()
    }

    fun test2(){
        test()
        test()
        test()
        test()
        test()
        test()
        test()
        test()
        test()
        test()
        test()
    }
}