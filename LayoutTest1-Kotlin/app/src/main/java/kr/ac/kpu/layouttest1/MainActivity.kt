package kr.ac.kpu.layouttest1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn0.setOnClickListener {
            if(edt1.isFocused)
                edt1.append("0")
            else if (edt2.isFocused)
                edt2.append("0")
        }
        btn1.setOnClickListener {
            if(edt1.isFocused)
                edt1.append("1")
            else if (edt2.isFocused)
                edt2.append("1")
        }
        btn2.setOnClickListener {
            if(edt1.isFocused)
                edt1.append("2")
            else if (edt2.isFocused)
                edt2.append("2")
        }
        btn3.setOnClickListener {
            if(edt1.isFocused)
                edt1.append("3")
            else if (edt2.isFocused)
                edt2.append("3")
        }
        btn4.setOnClickListener {
            if(edt1.isFocused)
                edt1.append("4")
            else if (edt2.isFocused)
                edt2.append("4")
        }
        btn5.setOnClickListener {
            if(edt1.isFocused)
                edt1.append("5")
            else if (edt2.isFocused)
                edt2.append("5")
        }
        btn6.setOnClickListener {
            if(edt1.isFocused)
                edt1.append("6")
            else if (edt2.isFocused)
                edt2.append("6")
        }
        btn7.setOnClickListener {
            if(edt1.isFocused)
                edt1.append("7")
            else if (edt2.isFocused)
                edt2.append("7")
        }
        btn8.setOnClickListener {
            if(edt1.isFocused)
                edt1.append("8")
            else if (edt2.isFocused)
                edt2.append("8")
        }
        btn9.setOnClickListener {
            if(edt1.isFocused)
                edt1.append("9")
            else if (edt2.isFocused)
                edt2.append("9")
        }

        btnSum.setOnClickListener {
            result.text = "계산 결과 : " + (Integer.parseInt(edt1.text.toString()) +
                    Integer.parseInt(edt2.text.toString())).toString()
        }

        btnMin.setOnClickListener {
            result.text = "계산 결과 : " + (Integer.parseInt(edt1.text.toString()) -
                    Integer.parseInt(edt2.text.toString())).toString()
        }

        btnMul.setOnClickListener {
            result.text = "계산 결과 : " + (Integer.parseInt(edt1.text.toString()) *
                    Integer.parseInt(edt2.text.toString())).toString()

        }

        btnDiv.setOnClickListener {
            result.text = "계산 결과\n" + "몫 : " + (Integer.parseInt(edt1.text.toString()) /
            Integer.parseInt(edt2.text.toString())).toString() +
                    "\n나머지 : " + (Integer.parseInt(edt1.text.toString()) %
                    Integer.parseInt(edt2.text.toString())).toString()

        }

    }
}
