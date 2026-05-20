package com.ashik3e.babylearning

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var emojiDisplay: TextView
    private lateinit var animalNameText: TextView
    private lateinit var nextButton: Button
    private lateinit var scoreText: TextView
    private lateinit var soundManager: SoundManager
    
    private var currentEmojiIndex = 0
    private var score = 0
    private val emojiList = EmojiDatabase.getEmojiList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        emojiDisplay = findViewById(R.id.emoji_display)
        animalNameText = findViewById(R.id.animal_name)
        nextButton = findViewById(R.id.nextButton)
        scoreText = findViewById(R.id.score_text)
        
        soundManager = SoundManager(this)
        
        displayEmoji(currentEmojiIndex)
        updateScore()
        
        emojiDisplay.setOnClickListener {
            playEmojiSound()
            incrementScore()
        }
        
        nextButton.setOnClickListener {
            nextEmoji()
        }
    }

    private fun displayEmoji(index: Int) {
        if (emojiList.isNotEmpty()) {
            val emoji = emojiList[index]
            emojiDisplay.text = emoji.englishName
            animalNameText.text = emoji.bengaliName
        }
    }

    private fun playEmojiSound() {
        if (emojiList.isNotEmpty()) {
            val emoji = emojiList[currentEmojiIndex]
            soundManager.playSound(emoji.soundResourceId)
        }
    }

    private fun nextEmoji() {
        currentEmojiIndex = (currentEmojiIndex + 1) % emojiList.size
        displayEmoji(currentEmojiIndex)
    }

    private fun incrementScore() {
        score++
        updateScore()
    }

    private fun updateScore() {
        scoreText.text = "স্কোর: $score"
    }

    override fun onDestroy() {
        super.onDestroy()
        soundManager.release()
    }
}