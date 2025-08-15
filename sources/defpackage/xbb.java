package defpackage;

import android.net.Uri;

/* renamed from: xbb  reason: default package */
public final class xbb implements acb {
    public final Uri a;

    public xbb(Uri uri) {
        this.a = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xbb)) {
            return false;
        }
        return tpa.f(this.a, ((xbb) obj).a) && "image/*".equals("image/*");
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1911932022;
    }

    public final String toString() {
        return "ShareMedia(localUrl=" + this.a + ", mimetype=image/*)";
    }
}
