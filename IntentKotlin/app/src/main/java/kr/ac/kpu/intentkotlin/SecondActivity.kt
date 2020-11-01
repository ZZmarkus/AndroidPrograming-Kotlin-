package kr.ac.kpu.intentkotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var intent = getIntent()


        var Num = intent.getStringExtra("Calc")
        var edt1 = intent.getIntExtra("Num1", 0)
        var edt2 = intent.getIntExtra("Num2", 0)

        if(Num == "+"){
            var Calc = edt1 + edt2
            var rIntent = Intent(this, MainActivity::class.java)
            rIntent.putExtra("Result", Calc)
            setResult(Activity.RESULT_OK, rIntent)
            finish()
        }
        else if(Num == "-"){
            var Calc = edt1 - edt2
            var rIntent = Intent(this, MainActivity::class.java)
            rIntent.putExtra("Result", Calc)
            setResult(Activity.RESULT_OK, rIntent)
            finish()
        }
        else if(Num == "*"){
            var Calc = edt1 * edt2
            var rIntent = Intent(this, MainActivity::class.java)
            rIntent.putExtra("Result", Calc)
            setResult(Activity.RESULT_OK, rIntent)
            finish()
        }
        else if(Num == "/"){
            var Calc = edt1 / edt2
            var rIntent = Intent(this, MainActivity::class.java)
            rIntent.putExtra("Result", Calc)
            setResult(Activity.RESULT_OK, rIntent)
            finish()
        }
    }
}
