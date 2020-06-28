package kr.co.namu.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        dialBtn.setOnClickListener {
            // 입력한 폰번을 받아와거 그 번호에 전화 연겨 (ACTION_DIAL)

            // 적혀있는 폰번 받아오기

            val inputPhoneNum = phoneNumEdt.text.toString()
            // 전화를 걸 번로를 가지고 uri 생성
            val myUri = Uri.parse( uristring:"tel:${inputPhoneNum}")

            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }
    }
}