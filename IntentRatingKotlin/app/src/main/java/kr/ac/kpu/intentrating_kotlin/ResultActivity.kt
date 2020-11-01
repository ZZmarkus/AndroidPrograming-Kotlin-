package kr.ac.kpu.intentrating_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        setTitle("투표 결과")


        val bundle = intent.getBundleExtra("bundle") ?: null
        val imageName = bundle?.getSerializable("imageName") as? ArrayList<String>
        val voteResult = bundle?.getSerializable("VoteCount") as? ArrayList<Int>

        val imgID = arrayListOf(R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.pic5,
            R.drawable.pic6, R.drawable.pic7, R.drawable.pic8, R.drawable.pic9)
        var textView = arrayListOf<TextView>(tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9)
        val ratingBar = arrayListOf<RatingBar>(rbar1,rbar2,rbar3,rbar4,rbar5,rbar6,rbar7,rbar8,rbar9)
        var i = 0
        var j = 0
        var result = 0
        var count = 0

        textView.forEach { tv ->
            tv.text = imageName?.get(i)
            i++
        }
        ratingBar.forEach { rbar ->
            if(result < voteResult?.get(j)?.toFloat()!!) {
                result = voteResult?.get(j)
                count = j
            }

            rbar.rating = voteResult?.get(j)?.toFloat()!!
            j++
        }
        btnReturn.setOnClickListener {
            finish()
        }

        tvResult.text = imageName?.get(count)
        imgResult.setImageResource(imgID[count])

    }
}
