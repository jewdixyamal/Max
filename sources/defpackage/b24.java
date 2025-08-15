package defpackage;

import android.net.Uri;

/* renamed from: b24  reason: default package */
public final class b24 extends ok0 {
    public final String j;
    public final int k;
    public final int l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b24(String str, String str2, long j2, long j3, long j4, boolean z, uy uyVar, boolean z2, int i, int i2, int i3, int i4) {
        super(i, i2, j3, j2, j4, uyVar, str, z, z2);
        this.j = str2;
        this.k = i3;
        this.l = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b24.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        b24 b24 = (b24) obj;
        if (this.k == b24.k && this.l == b24.l) {
            return this.j.equals(b24.j);
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
