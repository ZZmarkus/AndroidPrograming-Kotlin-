package kr.ac.kpu.threadstopwatch_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.concurrent.timer
import kotlin.concurrent.timerTask

class MainActivity : AppCompatActivity() {
    private var time = 0
    private var timerTask : Timer? = null
    private var isRunning = false
    private var lap = 1

    private fun recordLapTime(){
        var lapTime = this.time
        var textView = TextView(this)
        textView.text = "$lap LAB : ${lapTime / 100} .${lapTime % 100}"

        lapLayout.addView(textView, 0)
        lap++
    }

    private fun start(){
        startFab.setImageResource(R.drawable.ic_pause_black_24dp)

        timerTask = timer(period = 10){
            time++
            val sec = time / 100
            var milli = time% 100
            runOnUiThread {
                secTextView.text = "$sec"
                milliTextView.text = "$milli"
            }
        }
    }

    private fun reset(){
        timerTask?.cancel()

        time = 0
        isRunning = false
        startFab.setImageResource(R.drawable.ic_play_arrow_black_24dp)
        secTextView.text = "0"
        milliTextView.text = "00"

        lapLayout.removeAllViews()
        lap = 1
    }

    private fun pause(){
        startFab.setImageResource(R.drawable.ic_play_arrow_black_24dp)
        timerTask?.cancel()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        startFab.setOnClickListener {
            isRunning = !isRunning
            if(isRunning){
                start()
            }
            else{
                pause()
            }
        }

        lapButton.setOnClickListener {
            recordLapTime()
        }

        resetFab.setOnClickListener {
            reset()
        }
    }
}