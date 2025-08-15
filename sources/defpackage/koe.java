package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: koe  reason: default package */
public final class koe implements r24 {
    public final r24 a;
    public final kw0 b;
    public boolean c;
    public long o;

    public koe(r24 r24, kw0 kw0) {
        r24.getClass();
        this.a = r24;
        kw0.getClass();
        this.b = kw0;
    }

    public final long L(z24 z24) {
        long L = this.a.L(z24);
        this.o = L;
        if (L == 0) {
            return 0;
        }
        if (z24.g == -1 && L != -1) {
            z24 = z24.c(0, L);
        }
        this.c = true;
        kw0 kw0 = this.b;
        kw0.getClass();
        z24.h.getClass();
        int i = (z24.g > -1 ? 1 : (z24.g == -1 ? 0 : -1));
        int i2 = z24.i;
        if (i == 0 && (i2 & 2) == 2) {
            kw0.j = null;
        } else {
            kw0.j = z24;
            kw0.d = (i2 & 4) == 4 ? kw0.b : Long.MAX_VALUE;
            kw0.h = 0;
            try {
                kw0.b(z24);
            } catch (IOException e) {
                throw new IOException(e);
            }
        }
        return this.o;
    }

    public final void N(y0f y0f) {
        y0f.getClass();
        this.a.N(y0f);
    }

    public final Map a() {
        return this.a.a();
    }

    public final void close() {
        boolean z;
        z24 z24;
        kw0 kw0 = this.b;
        try {
            this.a.close();
            if (!z) {
                return;
            }
            if (z24 != null) {
                try {
                } catch (IOException e) {
                    throw new IOException(e);
                }
            }
        } finally {
            if (this.c) {
                this.c = false;
                if (((z24) kw0.j) != null) {
                    try {
                        kw0.a();
                    } catch (IOException e2) {
                        throw new IOException(e2);
                    }
                }
            }
        }
    }

    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.o == 0) {
            return -1;
        }
        int read = this.a.read(bArr, i, i2);
        if (read > 0) {
            kw0 kw0 = this.b;
            z24 z24 = (z24) kw0.j;
            if (z24 != null) {
                int i3 = 0;
                while (i3 < read) {
                    try {
                        if (kw0.g == kw0.d) {
                            kw0.a();
                            kw0.b(z24);
                        }
                        int min = (int) Math.min((long) (read - i3), kw0.d - kw0.g);
                        OutputStream outputStream = kw0.f;
                        int i4 = maf.a;
                        outputStream.write(bArr, i + i3, min);
                        i3 += min;
                        long j = (long) min;
                        kw0.g += j;
                        kw0.h += j;
                    } catch (IOException e) {
                        throw new IOException(e);
                    }
                }
            }
            long j2 = this.o;
            if (j2 != -1) {
                this.o = j2 - ((long) read);
            }
        }
        return read;
    }
}
