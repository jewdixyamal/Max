package defpackage;

import android.net.Uri;

/* renamed from: yn6  reason: default package */
public final class yn6 extends ok0 {
    public final String j;
    public final int k;
    public final int l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yn6(String str, String str2, long j2, long j3, long j4, boolean z, uy uyVar, boolean z2, int i, int i2, int i3, int i4) {
        super(i, i2, j3, j2, j4, uyVar, str, z, z2);
        this.j = str2;
        this.k = i3;
        this.l = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yn6.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        yn6 yn6 = (yn6) obj;
        if (this.k == yn6.k && this.l == yn6.l) {
            return this.j.equals(yn6.j);
        }
        return false;
    }

    public final int getHeight() {
        return this.l;
    }

    public final int getWidth() {
        return this.k;
    }

    public final int hashCode() {
        return ((rh4.d(super.hashCode() * 31, 31, this.j) + this.k) * 31) + this.l;
    }

    public final int j() {
        return 2;
    }

    public final Uri l() {
        return Uri.parse(this.j);
    }
}
