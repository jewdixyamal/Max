package androidx.media3.exoplayer.audio;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;

public final class AudioSink$ConfigurationException extends Exception {
    public final qy5 a;

    public AudioSink$ConfigurationException(AudioProcessor$UnhandledAudioFormatException audioProcessor$UnhandledAudioFormatException, qy5 qy5) {
        super(audioProcessor$UnhandledAudioFormatException);
        this.a = qy5;
    }

    public AudioSink$ConfigurationException(qy5 qy5, String str) {
        super(str);
        this.a = qy5;
    }
}
