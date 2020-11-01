package kr.ac.kpu.intentkotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Switch
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var intent = Intent(this, SecondActivity::class.java)


        btnResult.setOnClickListener {
            var num1 = edtNum1.text.toString().toInt()
            var num2 = edtNum2.text.toString().toInt()
            intent.putExtra("Num1", num1)
            intent.putExtra("Num2", num2)
            if(rdoG.checkedRadioButtonId == R.id.btnSum) {
                intent.putExtra("Calc", "+")
                startActivity(intent)
            }
            else if(rdoG.checkedRadioButtonId == R.id.btnMin) {
                intent.putExtra("Calc", "-")
                startActivity(intent)
            }
            else if(rdoG.checkedRadioButtonId == R.id.btnMul) {
                intent.putExtra("Calc", "*")
                startActivity(intent)
            }
            else if(rdoG.checkedRadioButtonId == R.id.btnDiv) {
                intent.putExtra("Calc", "/")
                startActivity(intent)
            }

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        var result : Int?
        if(resultCode == Activity.RESULT_OK){
            result = data!!.getIntExtra("Result", 0)
            Toast.makeText(this, "계산결과 : ${result}", Toast.LENGTH_SHORT).show()
        }
    }
}
