package defpackage;

import android.os.Parcelable;

/* renamed from: ig2  reason: default package */
public final class ig2 extends pg2 {
    public final Parcelable b;
    public final String c;
    public final boolean d;

    public ig2(xw8 xw8, String str, boolean z) {
        this.b = xw8;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig2)) {
            return false;
        }
        ig2 ig2 = (ig2) obj;
        return tpa.f(this.b, ig2.b) && tpa.f(this.c, ig2.c) && this.d == ig2.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + rh4.d(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenImageLegacy(message=");
        sb.append(this.b);
        sb.append(", attachLocalId=");
        sb.append(this.c);
        sb.append(", isSingleAttach=");
        return au1.j(sb, this.d, ")");
    }
}
