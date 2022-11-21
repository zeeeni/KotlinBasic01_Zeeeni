package com.example.kotlinbasic01_zeeeni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        문법 연습 (변수)

//        변수 만들기
        val myName = "코딩티쳐지니" // value : 상수, 변수 생성 + 대입 => 변수의 초기화
//        var myAge : Int // variable : 변수
        Log.d("변수값", myName)

        clickBtn.setOnClickListener {

            // 코드에 메모 남기기 - 주석
//            Ctrl + / : 커서가 있는 줄을 주석 처리.
//            이 { } 안 에 있는 코드만, 버튼이 눌렀을 때 실행됨

            Log.d("메인화면로그", "클릭용 버튼 눌림")
            Log.e("메인화면로그", "에러 관련 로그")


        }

        smallBtn.setOnClickListener {

            Toast.makeText(this, "작은 버튼 눌림", Toast.LENGTH_SHORT).show()

        }


    }
}