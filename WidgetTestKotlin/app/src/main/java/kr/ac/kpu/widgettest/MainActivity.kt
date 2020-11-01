package kr.ac.kpu.widgettest

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.annotation.IntegerRes
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_second.btn1
import kotlinx.android.synthetic.main.activity_second.btn2

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSum.setOnClickListener {
            result.text = "계산결과 : " + (Integer.parseInt(edt1.text.toString()) + Integer.parseInt(edt2.text.toString())).toString()
        }
        btnMin.setOnClickListener {
            result.text =  "계산결과 : " + (Integer.parseInt(edt1.text.toString()) - Integer.parseInt(edt2.text.toString())).toString()
        }
        btnMul.setOnClickListener {
            result.text =  "계산결과 : " + (Integer.parseInt(edt1.text.toString()) * Integer.parseInt(edt2.text.toString())).toString()
        }
        btnDiv.setOnClickListener {
            result.text =  "계산결과\n" + "몫 : " + (Integer.parseInt(edt1.text.toString()) / Integer.parseInt(edt2.text.toString())).toString() + ", 나머지 : " +
                    (Integer.parseInt(edt1.text.toString()) % Integer.parseInt(edt2.text.toString())).toString()
        }
    }
}
