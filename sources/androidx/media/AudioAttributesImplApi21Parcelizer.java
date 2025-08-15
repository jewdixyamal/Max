package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(jcf jcf) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.a = (AudioAttributes) jcf.g(audioAttributesImplApi21.a, 1);
        audioAttributesImplApi21.b = jcf.f(audioAttributesImplApi21.b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, jcf jcf) {
        jcf.getClass();
        jcf.k(audioAttributesImplApi21.a, 1);
        jcf.j(audioAttributesImplApi21.b, 2);
    }
}
