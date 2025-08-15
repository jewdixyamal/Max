package defpackage;

import android.graphics.Bitmap;

/* renamed from: ju6  reason: default package */
public final class ju6 {
    public static final ju6 c;
    public final Bitmap.Config a;
    public final Bitmap.Config b;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, ph4] */
    static {
        ? obj = new Object();
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        obj.a = config;
        obj.b = config;
        c = new ju6(obj);
    }

    public ju6(ph4 ph4) {
        this.a = (Bitmap.Config) ph4.a;
        this.b = (Bitmap.Config) ph4.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ju6.class != obj.getClass()) {
            return false;
        }
        ju6 ju6 = (ju6) obj;
        return this.a == ju6.a && this.b == ju6.b;
    }

    public final int hashCode() {
        int ordinal = (this.a.ordinal() - 552645669) * 31;
        Bitmap.Config config = this.b;
        return (ordinal + (config != null ? config.ordinal() : 0)) * 29791;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageDecodeOptions{");
        nw4 r0 = j47.r0(this);
        r0.a(100, "minDecodeIntervalMs");
        r0.a(Integer.MAX_VALUE, "maxDimensionPx");
        r0.d("decodePreviewFrame", false);
        r0.d("useLastFrameForPreview", false);
        r0.d("useEncodedImageForPreview", false);
        r0.d("decodeAllFrames", false);
        r0.d("forceStaticImage", false);
        r0.e(this.a.name(), "bitmapConfigName");
        r0.e(this.b.name(), "animatedBitmapConfigName");
        r0.e((Object) null, "customImageDecoder");
        r0.e((Object) null, "bitmapTransformation");
        r0.e((Object) null, "colorSpace");
        return zr6.l(sb, r0.toString(), "}");
    }
}
