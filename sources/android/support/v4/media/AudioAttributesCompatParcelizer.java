package android.support.v4.media;

import androidx.media.AudioAttributesCompat;

public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(jcf jcf) {
        return androidx.media.AudioAttributesCompatParcelizer.read(jcf);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, jcf jcf) {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, jcf);
    }
}
