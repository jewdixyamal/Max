package defpackage;

import java.io.EOFException;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: on6  reason: default package */
public final class on6 implements xze {
    public static final oy5 g;
    public static final oy5 h;
    public final wo a = new wo(1);
    public final xze b;
    public final oy5 c;
    public oy5 d;
    public byte[] e;
    public int f;

    static {
        my5 my5 = new my5();
        my5.k = "application/id3";
        g = my5.a();
        my5 my52 = new my5();
        my52.k = "application/x-emsg";
        h = my52.a();
    }

    public on6(xze xze, int i) {
        this.b = xze;
        if (i == 1) {
            this.c = g;
        } else if (i == 3) {
            this.c = h;
        } else {
            throw new IllegalArgumentException(z7b.h(33, i, "Unknown metadataType: "));
        }
        this.e = new byte[0];
        this.f = 0;
    }

    public final int a(l24 l24, int i, boolean z) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i2) {
            this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        int read = l24.read(this.e, this.f, i);
        if (read != -1) {
            this.f += read;
            return read;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void b(long j, int i, int i2, int i3, vze vze) {
        this.d.getClass();
        int i4 = this.f - i3;
        yaf yaf = new yaf(Arrays.copyOfRange(this.e, i4 - i2, i4));
        byte[] bArr = this.e;
        System.arraycopy(bArr, i4, bArr, 0, i3);
        this.f = i3;
        String str = this.d.w0;
        oy5 oy5 = this.c;
        if (!maf.a(str, oy5.w0)) {
            if ("application/x-emsg".equals(this.d.w0)) {
                this.a.getClass();
                c45 u0 = wo.u0(yaf);
                oy5 k = u0.k();
                if (k == null || !maf.a(oy5.w0, k.w0)) {
                    Objects.toString(u0.k());
                    return;
                }
                byte[] o = u0.o();
                o.getClass();
                yaf = new yaf(o);
            } else {
                String valueOf = String.valueOf(this.d.w0);
                if (valueOf.length() != 0) {
                    "Ignoring sample for unsupported format: ".concat(valueOf);
                    return;
                }
                return;
            }
        }
        int c2 = yaf.c();
        this.b.c(c2, yaf);
        this.b.b(j, i, c2, i3, vze);
    }

    public final void c(int i, yaf yaf) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (bArr.length < i2) {
            this.e = Arrays.copyOf(bArr, (i2 / 2) + i2);
        }
        yaf.g(this.f, this.e, i);
        this.f += i;
    }

    public final void d(oy5 oy5) {
        this.d = oy5;
        this.b.d(this.c);
    }
}
