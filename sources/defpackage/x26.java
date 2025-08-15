package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: x26  reason: default package */
public final class x26 extends nj0 {
    public final gef c;
    public final long d;
    public final String e = x26.class.getName();

    public x26(gef gef, long j) {
        this.c = gef;
        this.d = j;
    }

    public final o43 a(Bitmap bitmap, s2b s2b) {
        gef gef = this.c;
        uy b = gef.b();
        if (b == null) {
            hm9.m0(this.e, "No video collage", new Object[0]);
            s2b.getClass();
            return s2b.b(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), (Matrix) null);
        }
        int c2 = (int) gef.c();
        int i = b.X;
        int width = bitmap.getWidth();
        int i2 = b.o;
        int i3 = width / i2;
        int i4 = ((int) this.d) / (c2 / i);
        int i5 = i - 1;
        int i6 = b.c;
        return s2b.b(bitmap, (Math.min(i4, i5) % i3) * i2, (Math.min(i4, i5) / i3) * i6, b.o, i6, (Matrix) null);
    }

    public final ww0 b() {
        StringBuilder k = au1.k(this.c.e(), "videoId=", ", millis=");
        k.append(this.d);
        return new tpd(k.toString());
    }

    public final String getName() {
        return x26.class.getSimpleName();
    }
}
