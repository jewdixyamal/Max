package defpackage;

import android.app.PendingIntent;

/* renamed from: zeg  reason: default package */
public final class zeg extends hkc {
    public final PendingIntent a;
    public final boolean b;

    public zeg(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            this.a = pendingIntent;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hkc) {
            hkc hkc = (hkc) obj;
            return this.a.equals(((zeg) hkc).a) && this.b == ((zeg) hkc).b;
        }
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return au1.j(au1.m("ReviewInfo{pendingIntent=", this.a.toString(), ", isNoOp="), this.b, "}");
    }
}
