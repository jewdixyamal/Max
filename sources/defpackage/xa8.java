package defpackage;

import android.net.Uri;

/* renamed from: xa8  reason: default package */
public final class xa8 {
    public static final String b = Integer.toString(0, 36);
    public final Uri a;

    static {
        int i = oaf.a;
    }

    public xa8(o9g o9g) {
        this.a = (Uri) o9g.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xa8)) {
            return false;
        }
        return this.a.equals(((xa8) obj).a) && oaf.a((Object) null, (Object) null);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
}
