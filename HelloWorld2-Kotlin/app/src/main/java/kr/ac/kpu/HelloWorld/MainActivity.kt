package kr.ac.kpu.HelloWorld

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {    //번들타입의 객체, ?는 널일 수도 있다는 것을 나타내는 것
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        var flag = 0

            button2.setOnClickListener {

                if(flag == 0) {
                    textView.setText("버튼이 눌렸습니다.")
                    flag = 1
                    Toast.makeText(applicationContext, "버튼 눌림", Toast.LENGTH_SHORT).show()
                }
                else{
                textView.setText("Hello World")
                flag = 0
            }
        }

    }
}
