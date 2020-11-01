package kr.ac.kpu.widget2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Cstart.setOnCheckedChangeListener { _, isChecked ->
            if(isChecked){
                tv.visibility = View.VISIBLE
                btnResult.visibility = View.VISIBLE
                radioG.visibility = View.VISIBLE
                imgView.visibility = View.VISIBLE
            }
            else{
                tv.visibility = View.INVISIBLE
                btnResult.visibility = View.INVISIBLE
                radioG.visibility = View.INVISIBLE
                imgView.visibility = View.INVISIBLE
            }
        }

        radioG.setOnCheckedChangeListener { group, checkedId ->
            if(checkedId == R.id.Dog)
                imgView.setImageResource(R.drawable.dog)
            else if(checkedId == R.id.Cat)
                imgView.setImageResource(R.drawable.cat)
            else if(checkedId == R.id.Rabbit)
                imgView.setImageResource(R.drawable.rabbit)
        }
        btnResult.setOnClickListener {
            Cstart.isChecked = false
        }
    }
}
