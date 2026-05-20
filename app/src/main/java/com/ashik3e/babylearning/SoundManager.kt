package com.ashik3e.babylearning

import android.content.Context
import android.media.MediaPlayer
import android.util.Log

class SoundManager(private val context: Context) {
    private var mediaPlayer: MediaPlayer? = null
    private val TAG = "SoundManager"

    fun playSound(soundResourceId: Int) {
        try {
            stopSound()
            mediaPlayer = MediaPlayer.create(context, soundResourceId)
            mediaPlayer?.setOnCompletionListener {
                Log.d(TAG, "Sound completed")
            }
            mediaPlayer?.start()
            Log.d(TAG, "Playing sound: $soundResourceId")
        } catch (e: Exception) {
            Log.e(TAG, "Error playing sound: ${e.message}")
        }
    }

    fun stopSound() {
        try {
            mediaPlayer?.apply {
                if (isPlaying) {
                    stop()
                }
                release()
            }
            mediaPlayer = null
        } catch (e: Exception) {
            Log.e(TAG, "Error stopping sound: ${e.message}")
        }
    }

    fun isPlaying(): Boolean = mediaPlayer?.isPlaying ?: false

    fun release() {
        try {
            mediaPlayer?.apply {
                if (isPlaying) {
                    stop()
                }
                release()
            }
            mediaPlayer = null
        } catch (e: Exception) {
            Log.e(TAG, "Error releasing: ${e.message}")
        }
    }

    fun setVolume(volume: Float) {
        val vol = volume.coerceIn(0f, 1f)
        mediaPlayer?.setVolume(vol, vol)
    }
}