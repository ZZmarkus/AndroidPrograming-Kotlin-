package kr.ac.kpu.menudialog_kotlin

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerForContextMenu(button1)
        registerForContextMenu(button2)
        registerForContextMenu(baseLayout)

        var btnScaleX = button2.scaleX
        var btnScaleY = button2.scaleY
        button1.setOnClickListener {
            baseLayout.setBackgroundColor((Color.WHITE))
        }
        button2.setOnClickListener {
            button2.scaleX = btnScaleX
            button2.scaleY = btnScaleY
            button2.rotation = 0f
        }

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val mInflater = menuInflater
        when (v) {
            button1 -> {
                menu!!.setHeaderTitle("배경색 변경")
                mInflater.inflate(R.menu.menu, menu)
            }
            button2 -> {
                menu!!.setHeaderTitle("배경 모양 변경")
                mInflater.inflate(R.menu.menu2, menu)
            }
            baseLayout -> {
                menu!!.setHeaderTitle("초기화")
                mInflater.inflate(R.menu.baselayout, menu)
            }
        }
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        super.onContextItemSelected(item)

        when(item.itemId){
            R.id.itemRed -> {
                baseLayout.setBackgroundColor((Color.RED))
                return true
            }
            R.id.itemGreen -> {
                baseLayout.setBackgroundColor((Color.GREEN))
                return true
            }
            R.id.itemBlue -> {
                baseLayout.setBackgroundColor((Color.BLUE))
                return true
            }
            R.id.subRotate -> {
                button2.rotation = button2.rotation + 45F
                return true
            }
            R.id.subSize -> {
                button2.scaleX = button2.scaleX * 2F
                button2.scaleY = button2.scaleY * 2F
                return true
            }
            R.id.Finish -> {
                baseLayout.setBackgroundColor((Color.WHITE))
                var btnScaleX = button1.scaleX
                var btnScaleY = button1.scaleY
                button2.scaleX = btnScaleX
                button2.scaleY = btnScaleY
                button2.rotation = 0f
            }
        }
        return false
    }
}
