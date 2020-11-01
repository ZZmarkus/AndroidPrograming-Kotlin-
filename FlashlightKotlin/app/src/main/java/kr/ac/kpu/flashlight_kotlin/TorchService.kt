package kr.ac.kpu.flashlight_kotlin

import android.app.Service
import android.content.Intent
import android.os.IBinder

class TorchService : Service() {
    private var isRunning = false
    private val torch: Torch by lazy {
        Torch(this)
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        when(intent?.action){
            "on" -> {
                torch.flashOn()
            }
            "off" -> {
                torch.flashOff()
            }
            else -> {
                isRunning = !isRunning
                if(isRunning){
                    torch.flashOn()
                }
                else{
                    torch.flashOff()
                }
            }
        }
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }
}
