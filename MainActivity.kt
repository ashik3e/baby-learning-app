import android.app.Activity
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : Activity() {
    private lateinit var emojiImageView: ImageView
    private lateinit var nextButton: Button
    private lateinit var mediaPlayer: MediaPlayer
    private val emojis = arrayOf("😊", "😂", "🥰", "🤔", "😎")
    private var currentEmojiIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        emojiImageView = findViewById(R.id.emojiImageView)
        nextButton = findViewById(R.id.nextButton)

        mediaPlayer = MediaPlayer.create(this, R.raw.sound_playback)

        displayEmoji()

        nextButton.setOnClickListener { 
            mediaPlayer.start()
            nextEmoji()
        }
    }

    private fun displayEmoji() {
        emojiImageView.text = emojis[currentEmojiIndex]
    }

    private fun nextEmoji() {
        currentEmojiIndex = (currentEmojiIndex + 1) % emojis.size
        displayEmoji()
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release() // Release the media player resources
    }
}