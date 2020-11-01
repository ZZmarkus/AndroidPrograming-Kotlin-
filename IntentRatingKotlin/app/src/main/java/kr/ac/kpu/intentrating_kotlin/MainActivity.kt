package kr.ac.kpu.intentrating_kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("선호도 투표")


        var voteCount = arrayListOf(0,0,0,0,0,0,0,0,0)
        val imageId = arrayListOf<ImageView>(iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9)
        val imageName = arrayListOf<String>("독서하는 소녀", "꽃장식 모자 소녀", "부채를 든 소녀", "이레느깡 단 베르양",
                            "잠자는 소녀", "테라스의 두 자매", "피아노 레슨", "피아노 앞의 소녀들","해변에서" )

        var i = 0
        for(imageView in imageId){
            var j = i
            imageView.setOnClickListener {
                voteCount[j]++
                Toast.makeText(this,"${imageName[j]} : 총 ${voteCount[j]}표",Toast.LENGTH_SHORT).show()
            }
            i++
        }


        val bundle = Bundle()
        bundle.putSerializable("imageName", imageName)
        bundle.putSerializable("VoteCount", voteCount)

        btnResult.setOnClickListener {
            var intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("bundle",bundle)
            startActivity(intent)
        }
    }
}
