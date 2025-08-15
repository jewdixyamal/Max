package defpackage;

import com.facebook.animated.gif.GifImage;

/* renamed from: df  reason: default package */
public final class df {
    public static final GifImage a;
    public static final GifImage b;

    static {
        GifImage gifImage;
        GifImage gifImage2 = null;
        try {
            gifImage = GifImage.class.newInstance();
        } catch (Throwable unused) {
            gifImage = null;
        }
        a = gifImage;
        try {
            gifImage2 = (GifImage) Class.forName("com.facebook.animated.webp.WebPImage").newInstance();
        } catch (Throwable unused2) {
        }
        b = gifImage2;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [j43, ei0] */
    public static j43 a(String str, ju6 ju6, GifImage gifImage) {
        ju6.getClass();
        m5d m5d = new m5d(2, gifImage);
        m5d.o = null;
        m5d.X = null;
        m5d.b = str;
        a8g t = m5d.t();
        ? ei0 = new ei0();
        ei0.o = t;
        ei0.X = true;
        return ei0;
    }
}
