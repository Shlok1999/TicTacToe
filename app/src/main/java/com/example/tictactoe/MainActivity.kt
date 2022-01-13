package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView



class MainActivity : AppCompatActivity() {

    //Player representation
    //0 -- X
    //1 -- O

    var activePlayer: Int = 0

    val gameState = arrayOf(2,2,2,2,2,2,2,2,2)
    //State Meanings
    //0 -- X
    //1 -- O
    //2 -- Blank

    val winPos = arrayOf(
        arrayOf(0,1,2), arrayOf(3,4,5), arrayOf(6,7,8),
        arrayOf(0,3,6), arrayOf(1,4,7), arrayOf(2,5,8),
        arrayOf(0,4,8), arrayOf(2,4,6)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun playerTap(view: android.view.View) {
        val img: ImageView = view as ImageView
//        val tappedImg = Integer.parseInt(img.getTag().toString())
        val tappedImg = img.getTag().toString().toInt()

        if(gameState[tappedImg]==2){
            gameState[tappedImg]= activePlayer
//            img.translationY = -1000f
            img.setTranslationY(-1000f)
            if(activePlayer == 0){
                img.setImageResource(R.drawable.x)
                activePlayer =1
            }else{
                img.setImageResource(R.drawable.zero)
                activePlayer = 0
            }
        }

        img.animate().translationYBy(1000f).setDuration(3)



    }
}


