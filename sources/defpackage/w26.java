package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import java.util.Locale;

/* renamed from: w26  reason: default package */
public final class w26 extends nj0 {
    public final fef c;
    public final long d;

    public w26(fef fef, long j) {
        this.c = fef;
        this.d = j;
    }

    public final o43 a(Bitmap bitmap, s2b s2b) {
        ok0 ok0 = (ok0) this.c;
        uy uyVar = ok0.f;
        if (uyVar == null) {
            hm9.p("w26", "No video collage", (Throwable) null);
            s2b.getClass();
            return s2b.b(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), (Matrix) null);
        }
        int i = (int) ok0.a;
        int i2 = uyVar.X;
        int width = bitmap.getWidth();
        int i3 = uyVar.o;
        int i4 = width / i3;
        int i5 = ((int) this.d) / (i / i2);
        int i6 = i2 - 1;
        int i7 = uyVar.c;
        return s2b.b(bitmap, (Math.min(i5, i6) % i4) * i3, (Math.min(i5, i6) / i4) * i7, uyVar.o, i7, (Matrix) null);
    }

    public final ww0 b() {
        Locale locale = Locale.ENGLISH;
        StringBuilder k = au1.k(((ok0) this.c).e, "videoId=", ", millis=");
        k.append(this.d);
        return new tpd(k.toString());
    }

    public final String getName() {
        return w26.class.getSimpleName();
    }
}
