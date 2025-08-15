package defpackage;

import android.net.Uri;

/* renamed from: cf  reason: default package */
public final class cf implements ww0 {
    public final ww0 a;
    public final int b;

    public cf(ww0 ww0, int i) {
        this.a = ww0;
        this.b = i;
    }

    public final boolean a(Uri uri) {
        return this.a.a(uri);
    }

    public final boolean b() {
        return false;
    }

    public final String c() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cf)) {
            return false;
        }
        cf cfVar = (cf) obj;
        return this.b == cfVar.b && this.a.equals(cfVar.a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 1013) + this.b;
    }

    public final String toString() {
        nw4 r0 = j47.r0(this);
        r0.e(this.a, "imageCacheKey");
        r0.a(this.b, "frameIndex");
        return r0.toString();
    }
}
