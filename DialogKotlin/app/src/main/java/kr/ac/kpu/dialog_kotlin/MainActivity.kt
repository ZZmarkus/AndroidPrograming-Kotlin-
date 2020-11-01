package kr.ac.kpu.dialog_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener {
            val dlgView = layoutInflater.inflate(R.layout.dialog, null)
            val dlgBuilder = AlertDialog.Builder(this)
            val etName = dlgView.findViewById<EditText>(R.id.dlgEdt1)
            val etEmail = dlgView.findViewById<EditText>(R.id.dlgEdt2)
            dlgBuilder.setTitle("사용자 정보 입력")
            dlgBuilder.setIcon(R.drawable.ic_menu_allfriends)
            dlgBuilder.setView(dlgView)
            etName.text = tvName.text
            etEmail.text = tvEmail.text
            dlgBuilder.setPositiveButton("확인") { dialogInterface, i ->

            }.setNegativeButton("취소") { dialogInterface, i ->
                val toast = Toast(this)
                val toastView = layoutInflater.inflate(R.layout.toast, null);
                val toastTextView = toastView.findViewById<TextView>(R.id.toastText)
                toastTextView.text = "취소했습니다."
                toast.setView(toastView)
                toast.show()
            }.show()
        }
    }
}
