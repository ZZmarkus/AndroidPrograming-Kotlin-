package kr.ac.kpu.layoutframe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var imageIndex = 0
        button.setOnClickListener {
            if (imageIndex == 0) {
                imageView01.visibility = View.INVISIBLE
                imageView02.visibility = View.VISIBLE
                imageIndex++
            } else {
                imageView02.visibility = View.INVISIBLE
                imageView01.visibility = View.VISIBLE
                imageIndex--
            }
        }
    }
}
