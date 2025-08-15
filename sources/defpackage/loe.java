package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: loe  reason: default package */
public final class loe implements t24 {
    public final t24 a;
    public final kw0 b;
    public boolean c;
    public long o;

    public loe(t24 t24, kw0 kw0) {
        t24.getClass();
        this.a = t24;
        kw0.getClass();
        this.b = kw0;
    }

    public final long G(a34 a34) {
        long G = this.a.G(a34);
        this.o = G;
        if (G == 0) {
            return 0;
        }
        if (a34.g == -1 && G != -1) {
            a34 = a34.c(0, G);
        }
        this.c = true;
        kw0 kw0 = this.b;
        kw0.getClass();
        a34.h.getClass();
        int i = (a34.g > -1 ? 1 : (a34.g == -1 ? 0 : -1));
        int i2 = a34.i;
        if (i == 0 && (i2 & 2) == 2) {
            kw0.j = null;
        } else {
            kw0.j = a34;
            kw0.d = (i2 & 4) == 4 ? kw0.b : Long.MAX_VALUE;
            kw0.h = 0;
            try {
                kw0.c(a34);
            } catch (IOException e) {
                throw new IOException(e);
            }
        }
        return this.o;
    }

    public final void H(z0f z0f) {
        z0f.getClass();
        this.a.H(z0f);
    }

    public final Map a() {
        return this.a.a();
    }

    public final void close() {
        boolean z;
        a34 a34;
        kw0 kw0 = this.b;
        try {
            this.a.close();
            if (!z) {
                return;
            }
            if (a34 != null) {
                try {
                } catch (IOException e) {
                    throw new IOException(e);
                }
            }
        } finally {
            if (this.c) {
                this.c = false;
                if (((a34) kw0.j) != null) {
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
            a34 a34 = (a34) kw0.j;
            if (a34 != null) {
                int i3 = 0;
                while (i3 < read) {
                    try {
                        if (kw0.g == kw0.d) {
                            kw0.a();
                            kw0.c(a34);
                        }
                        int min = (int) Math.min((long) (read - i3), kw0.d - kw0.g);
                        OutputStream outputStream = kw0.f;
                        int i4 = oaf.a;
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
