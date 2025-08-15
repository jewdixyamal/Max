package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* renamed from: u1e  reason: default package */
public final class u1e implements t24 {
    public final t24 a;
    public long b;
    public Uri c = Uri.EMPTY;

    public u1e(t24 t24) {
        t24.getClass();
        this.a = t24;
        Collections.emptyMap();
    }

    public final long G(a34 a34) {
        this.c = a34.a;
        Collections.emptyMap();
        t24 t24 = this.a;
        long G = t24.G(a34);
        Uri uri = t24.getUri();
        uri.getClass();
        this.c = uri;
        t24.a();
        return G;
    }

    public final void H(z0f z0f) {
        z0f.getClass();
        this.a.H(z0f);
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
