package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: t1e  reason: default package */
public final class t1e implements r24 {
    public final r24 a;
    public long b;
    public Uri c = Uri.EMPTY;
    public Map o = Collections.emptyMap();

    public t1e(r24 r24) {
        r24.getClass();
        this.a = r24;
    }

    public final long L(z24 z24) {
        this.c = z24.a;
        this.o = Collections.emptyMap();
        r24 r24 = this.a;
        long L = r24.L(z24);
        Uri uri = r24.getUri();
        uri.getClass();
        this.c = uri;
        this.o = r24.a();
        return L;
    }

    public final void N(y0f y0f) {
        y0f.getClass();
        this.a.N(y0f);
    }

    public final Map a() {
        return this.a.a();
    }

    public final void close() {
        this.a.close();
    }

    public final Uri getUri() {
        return this.a.getUri();
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += (long) read;
        }
        return read;
    }
}
