package defpackage;

import android.net.Uri;

/* renamed from: jj3  reason: default package */
public final class jj3 {
    public final Uri a;
    public final boolean b;

    public jj3(Uri uri, boolean z) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!jj3.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        jj3 jj3 = (jj3) obj;
        return tpa.f(this.a, jj3.a) && this.b == jj3.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
