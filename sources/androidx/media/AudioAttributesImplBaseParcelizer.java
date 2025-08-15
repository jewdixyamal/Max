package androidx.media;

public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(jcf jcf) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = jcf.f(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.b = jcf.f(audioAttributesImplBase.b, 2);
        audioAttributesImplBase.c = jcf.f(audioAttributesImplBase.c, 3);
        audioAttributesImplBase.d = jcf.f(audioAttributesImplBase.d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, jcf jcf) {
        jcf.getClass();
        jcf.j(audioAttributesImplBase.a, 1);
        jcf.j(audioAttributesImplBase.b, 2);
        jcf.j(audioAttributesImplBase.c, 3);
        jcf.j(audioAttributesImplBase.d, 4);
    }
}
