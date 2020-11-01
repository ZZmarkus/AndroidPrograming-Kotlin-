package kr.ac.kpu.intentlogcat_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnPrev.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        Log.i("logcat", "SecondActivity Start")
        super.onStart()
    }

    override fun onDestroy() {
        Log.i("logcat", "Finish SecondActivity")
        super.onDestroy()
    }
}
