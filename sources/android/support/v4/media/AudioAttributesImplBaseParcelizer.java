package android.support.v4.media;

import androidx.media.AudioAttributesImplBase;

public final class AudioAttributesImplBaseParcelizer extends androidx.media.AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(jcf jcf) {
        return androidx.media.AudioAttributesImplBaseParcelizer.read(jcf);
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, jcf jcf) {
        androidx.media.AudioAttributesImplBaseParcelizer.write(audioAttributesImplBase, jcf);
    }
}
