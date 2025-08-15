package androidx.media;

public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(jcf jcf) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        Object obj = audioAttributesCompat.a;
        if (jcf.e(1)) {
            obj = jcf.h();
        }
        audioAttributesCompat.a = (AudioAttributesImpl) obj;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, jcf jcf) {
        jcf.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.a;
        jcf.i(1);
        jcf.l(audioAttributesImpl);
    }
}
