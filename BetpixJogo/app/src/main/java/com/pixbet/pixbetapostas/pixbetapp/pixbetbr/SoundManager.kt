package com.pixbet.pixbetapostas.pixbetapp.pixbetbr

import android.content.Context
import android.media.MediaPlayer

class SoundManager private constructor(context: Context) {
    private var mediaPlayer: MediaPlayer? = null
    private var isPlaying = false

    init {
        mediaPlayer = MediaPlayer.create(context, R.raw.game_sound)
        mediaPlayer?.isLooping = true
        start()
    }


    fun start() {
        mediaPlayer?.start()
        isPlaying = true
    }

    fun stop() {
        mediaPlayer?.pause()
        isPlaying = false
    }

    fun release() {
        mediaPlayer?.release()
    }

    fun isPlaying(): Boolean {
        return isPlaying
    }

    companion object {
        @Volatile private var instance: SoundManager? = null

        fun getInstance(context: Context): SoundManager {
            return instance ?: synchronized(this) {
                instance ?: SoundManager(context).also { instance = it }
            }
        }
    }
}