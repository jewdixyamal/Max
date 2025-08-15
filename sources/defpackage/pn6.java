package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* renamed from: pn6  reason: default package */
public final class pn6 implements yze {
    public static final qy5 g;
    public static final qy5 h;
    public final xo a = new xo(1);
    public final yze b;
    public final qy5 c;
    public qy5 d;
    public byte[] e;
    public int f;

    static {
        ny5 ny5 = new ny5();
        ny5.m = ia9.l("application/id3");
        g = ny5.a();
        ny5 ny52 = new ny5();
        ny52.m = ia9.l("application/x-emsg");
        h = ny52.a();
    }

    public pn6(yze yze, int i) {
        this.b = yze;
        if (i == 1) {
            this.c = g;
        } else if (i == 3) {
            this.c = h;
        } else {
            throw new IllegalArgumentException(zr6.h(i, "Unknown metadataType: "));
        }
        this.e = new byte[0];
        this.f = 0;
    }

    public final void a(long j, int i, int i2, int i3, wze wze) {
        int i4 = i3;
        this.d.getClass();
        int i5 = this.f - i4;
        wpa wpa = new wpa(Arrays.copyOfRange(this.e, i5 - i2, i5));
        byte[] bArr = this.e;
        System.arraycopy(bArr, i5, bArr, 0, i4);
        this.f = i4;
        String str = this.d.n;
        qy5 qy5 = this.c;
        if (!oaf.a(str, qy5.n)) {
            if ("application/x-emsg".equals(this.d.n)) {
                this.a.getClass();
                d45 X = xo.X(wpa);
                qy5 k = X.k();
                String str2 = qy5.n;
                if (k == null || !oaf.a(str2, k.n)) {
                    qy5 k2 = X.k();
                    z04.c0("Ignoring EMSG. Expected it to contain wrapped " + str2 + " but actual wrapped format: " + k2);
                    return;
                }
                byte[] o = X.o();
                o.getClass();
                wpa = new wpa(o);
            } else {
                z04.c0("Ignoring sample for unsupported format: " + this.d.n);
                return;
            }
        }
        int a2 = wpa.a();
        this.b.b(wpa, a2, 0);
        this.b.a(j, i, a2, 0, wze);
    }

    public final void b(wpa wpa, int i, int i2) {
        int i3 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i3) {
            this.e = Arrays.copyOf(bArr, (i3 / 2) + i3);
        }
        wpa.e(this.f, this.e, i);
        this.f += i;
    }

    public final int c(m24 m24, int i, boolean z) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i2) {
            this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int read = m24.read(this.e, this.f, i);
        if (read != -1) {
            this.f += read;
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void e(qy5 qy5) {
        this.d = qy5;
        this.b.e(this.c);
    }
}
