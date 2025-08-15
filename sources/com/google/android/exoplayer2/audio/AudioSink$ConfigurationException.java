package com.google.android.exoplayer2.audio;

public final class AudioSink$ConfigurationException extends Exception {
    public final oy5 a;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, oy5 oy5) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.a = oy5;
    }

    public AudioSink$ConfigurationException(String str, oy5 oy5) {
        super(str);
        this.a = oy5;
    }
}
