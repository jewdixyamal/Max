package defpackage;

import android.net.Uri;
import java.io.Closeable;

/* renamed from: ta8  reason: default package */
public final class ta8 implements la5, Closeable {
    public final la5 a;
    public final sa8 b;
    public final Uri c;

    public ta8(la5 la5, sa8 sa8) {
        this.a = la5;
        this.b = sa8;
        Uri uri = sa8.a.getUri();
        if (uri != null) {
            this.c = uri;
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void S(pa5 pa5) {
        this.a.S(pa5);
    }

    public final void close() {
        release();
    }

    public final void d(long j, long j2) {
        this.a.d(j, j2);
    }

    public final int g(na5 na5, lh4 lh4) {
        return this.a.g(na5, lh4);
    }

    public final boolean n(na5 na5) {
        return this.a.n(na5);
    }

    public final void release() {
        this.a.release();
        this.b.close();
    }
}
