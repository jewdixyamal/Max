package defpackage;

import android.net.Uri;

/* renamed from: tpd  reason: default package */
public final class tpd implements ww0 {
    public final String a;

    public tpd(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean a(Uri uri) {
        return this.a.contains(uri.toString());
    }

    public final boolean b() {
        return false;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tpd) {
            return this.a.equals(((tpd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
