package defpackage;

import android.net.Uri;

/* renamed from: xc6  reason: default package */
public final class xc6 implements gef {
    public final Uri a;
    public final int b;
    public final int c;

    public xc6(Uri uri, int i, int i2) {
        this.a = uri;
        this.b = i;
        this.c = i2;
    }

    public final long c() {
        return 0;
    }

    public final boolean c0() {
        return false;
    }

    public final long d() {
        return 0;
    }

    public final long e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc6)) {
            return false;
        }
        xc6 xc6 = (xc6) obj;
        return tpa.f(this.a, xc6.a) && this.b == xc6.b && this.c == xc6.c;
    }

    public final int getHeight() {
        return this.c;
    }

    public final int getWidth() {
        return this.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + k7d.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final long k() {
        return 0;
    }

    public final Uri l() {
        return this.a;
    }

    public final long m() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GifVideoContent(contentUri=");
        sb.append(this.a);
        sb.append(", width=");
        sb.append(this.b);
        sb.append(", height=");
        return zr6.j(sb, this.c, ")");
    }
}
