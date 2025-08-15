package androidx.media;

import android.media.AudioAttributes;

public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(jcf jcf) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.a = (AudioAttributes) jcf.g(audioAttributesImplApi26.a, 1);
        audioAttributesImplApi26.b = jcf.f(audioAttributesImplApi26.b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, jcf jcf) {
        jcf.getClass();
        jcf.k(audioAttributesImplApi26.a, 1);
        jcf.j(audioAttributesImplApi26.b, 2);
    }
}
