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
    
    private var currentEmojiIndex = 0
    private var score = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        emojiDisplay = findViewById(R.id.emoji_display)
        animalNameText = findViewById(R.id.animal_name)
        nextButton = findViewById(R.id.nextButton)
        scoreText = findViewById(R.id.score_text)
        
        displayEmoji(currentEmojiIndex)
        updateScore()
        
        emojiDisplay.setOnClickListener {
            incrementScore()
        }
        
        nextButton.setOnClickListener {
            nextEmoji()
        }
    }

    private fun displayEmoji(index: Int) {
        val emojis = listOf(
            Pair("🐶", "কুকুর"),
            Pair("🐱", "বিড়াল"),
            Pair("🐭", "ইঁদুর"),
            Pair("🐹", "হ্যামস্টার"),
            Pair("🐰", "খরগোশ"),
            Pair("🦊", "শিয়াল"),
            Pair("🐻", "ভালুক"),
            Pair("🐼", "পান্ডা"),
            Pair("🐨", "কোয়ালা"),
            Pair("🐯", "বাঘ")
        )
        
        if (index < emojis.size) {
            emojiDisplay.text = emojis[index].first
            animalNameText.text = emojis[index].second
        }
    }

    private fun nextEmoji() {
        currentEmojiIndex = (currentEmojiIndex + 1) % 10
        displayEmoji(currentEmojiIndex)
    }

    private fun incrementScore() {
        score++
        updateScore()
    }

    private fun updateScore() {
        scoreText.text = "স্কোর: $score"
    }
}