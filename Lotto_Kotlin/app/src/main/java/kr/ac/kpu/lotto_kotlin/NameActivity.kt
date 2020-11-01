package kr.ac.kpu.lotto_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_name.*
import java.text.SimpleDateFormat
import java.util.*

class NameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        goButton.setOnClickListener {
            if(TextUtils.isEmpty(editText.text.toString())) {
                Toast.makeText(applicationContext, "이름을 입력하세요.", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val intent = Intent(this, ResultActivity::class.java)
            intent.putIntegerArrayListExtra("result",
                ArrayList(getLottoNumbersFromHash(editText.text.toString())))
            intent.putExtra("name", editText.text.toString())
            startActivity(intent)
        }
        backButton.setOnClickListener {
            // 액티비티 종료
            finish()
        }
    }

    fun getLottoNumbersFromHash(name: String): MutableList<Int> {
        val list = mutableListOf<Int>()
        for (number in 1..45) {
            list.add(number)
        }
        val targetString = SimpleDateFormat("yyyy-MM-dd", Locale.KOREA).format(Date()) + name
        list.shuffle(Random(targetString.hashCode().toLong()))

        return list.subList(0, 6)
    }

}
