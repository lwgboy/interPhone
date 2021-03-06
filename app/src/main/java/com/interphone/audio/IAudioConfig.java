package com.interphone.audio;

import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaRecorder;

public interface IAudioConfig {
    /**
     * 采样率
     */
    int sampleRateInHz = 8000;

    /**
     * 音频通道
     */
    int channelConfig = AudioFormat.CHANNEL_IN_STEREO;

    /**
     * 音频数据的格式
     */
    int audioFormat = AudioFormat.ENCODING_PCM_16BIT;

    /**
     * 音频源
     */
    int audioSource = MediaRecorder.AudioSource.MIC;

    /**
     * 输出模式
     */
    int defaultMode = AudioTrack.MODE_STREAM;

    /**
     * 音频类型
     */
    int streamType = AudioManager.STREAM_MUSIC;
}
