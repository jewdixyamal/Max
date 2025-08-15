package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: qs6  reason: default package */
public final class qs6 implements t24 {
    public int X;
    public final t24 a;
    public final int b;
    public final pnb c;
    public final byte[] o;

    public qs6(t24 t24, int i, pnb pnb) {
        fm9.f(i > 0);
        this.a = t24;
        this.b = i;
        this.c = pnb;
        this.o = new byte[1];
        this.X = i;
    }

    public final long G(a34 a34) {
        throw new UnsupportedOperationException();
    }

    public final void H(z0f z0f) {
        z0f.getClass();
        this.a.H(z0f);
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
        t24 t24 = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.o;
            if (t24.read(bArr2, 0, 1) != -1) {
                int i4 = (bArr2[0] & 255) << 4;
                if (i4 != 0) {
                    byte[] bArr3 = new byte[i4];
                    int i5 = i4;
                    int i6 = 0;
                    while (i5 > 0) {
                        int read = t24.read(bArr3, i6, i5);
                        if (read != -1) {
                            i6 += read;
                            i5 -= read;
                        }
                    }
                    while (i4 > 0 && bArr3[i4 - 1] == 0) {
                        i4--;
                    }
                    if (i4 > 0) {
                        wpa wpa = new wpa(i4, bArr3);
                        pnb pnb = this.c;
                        long max = !pnb.x0 ? pnb.u0 : Math.max(pnb.y0.j(true), pnb.u0);
                        int a2 = wpa.a();
                        yze yze = pnb.w0;
                        yze.getClass();
                        yze.b(wpa, a2, 0);
                        yze.a(max, 1, a2, 0, (wze) null);
                        pnb.x0 = true;
                    }
                }
                this.X = this.b;
            }
            return -1;
        }
        int read2 = t24.read(bArr, i, Math.min(this.X, i2));
        if (read2 != -1) {
            this.X -= read2;
        }
        return read2;
    }
}
