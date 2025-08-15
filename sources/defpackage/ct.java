package defpackage;

import android.graphics.Bitmap;

/* renamed from: ct  reason: default package */
public final class ct extends s2b {
    public final go0 a;
    public final wd6 b;

    public ct(go0 go0, wd6 wd6) {
        this.a = go0;
        this.b = wd6;
    }

    public final o43 c(int i, int i2, Bitmap.Config config) {
        int c = qo0.c(i, i2, config);
        go0 go0 = this.a;
        Bitmap bitmap = (Bitmap) go0.get(c);
        if (bitmap.getAllocationByteCount() >= qo0.b(config) * i * i2) {
            bitmap.reconfigure(i, i2, config);
            return o43.p0(bitmap, go0, (sy4) this.b.b);
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
