package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: ps6  reason: default package */
public final class ps6 implements r24 {
    public int X;
    public final r24 a;
    public final int b;
    public final onb c;
    public final byte[] o;

    public ps6(r24 r24, int i, onb onb) {
        np8.d(i > 0);
        this.a = r24;
        this.b = i;
        this.c = onb;
        this.o = new byte[1];
        this.X = i;
    }

    public final long L(z24 z24) {
        throw new UnsupportedOperationException();
    }

    public final void N(y0f y0f) {
        y0f.getClass();
        this.a.N(y0f);
    }

    public final Map a() {
        return this.a.a();
    }

    public final void close() {
        throw new UnsupportedOperationException();
    }

    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.X;
        r24 r24 = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.o;
            int i4 = 0;
            if (r24.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int read = r24.read(bArr3, i4, i6);
                        if (read != -1) {
                            i4 += read;
                            i6 -= read;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        yaf yaf = new yaf(i5, bArr3);
                        onb onb = this.c;
                        long max = !onb.y0 ? onb.u0 : Math.max(onb.z0.g(), onb.u0);
                        int c2 = yaf.c();
                        drc drc = onb.x0;
                        drc.getClass();
                        drc.c(c2, yaf);
                        drc.b(max, 1, c2, 0, (vze) null);
                        onb.y0 = true;
                    }
                }
                this.X = this.b;
            }
            return -1;
        }
        int read2 = r24.read(bArr, i, Math.min(this.X, i2));
        if (read2 != -1) {
            this.X -= read2;
        }
        return read2;
    }
}
