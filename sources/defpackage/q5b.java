package defpackage;

import java.io.InputStream;

/* renamed from: q5b  reason: default package */
public final class q5b extends InputStream {
    public final qq8 a;
    public int b;
    public int c;

    public q5b(qq8 qq8) {
        boolean n0;
        synchronized (qq8) {
            n0 = o43.n0(qq8.b);
        }
        if (n0) {
            this.a = qq8;
            this.b = 0;
            this.c = 0;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final int available() {
        return this.a.U() - this.b;
    }

    public final void mark(int i) {
        this.c = this.b;
    }

    public final boolean markSupported() {
        return true;
    }

    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        int i = this.b;
        this.b = i + 1;
        return this.a.o(i) & 255;
    }

    public final void reset() {
        this.b = this.c;
    }

    public final long skip(long j) {
        od2.j(Boolean.valueOf(j >= 0));
        int min = Math.min((int) j, available());
        this.b += min;
        return (long) min;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder sb = new StringBuilder("length=");
            ms2.k(sb, bArr.length, "; regionStart=", i, "; regionLength=");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int available = available();
        if (available <= 0) {
            return -1;
        }
        if (i2 <= 0) {
            return 0;
        }
        int min = Math.min(available, i2);
        this.a.S(this.b, i, min, bArr);
        this.b += min;
        return min;
    }
}
