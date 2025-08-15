package defpackage;

/* renamed from: meb  reason: default package */
public final class meb {
    public final String a;
    public final long b;
    public final CharSequence c;
    public final CharSequence d;
    public final boolean e;
    public final boolean f;
    public final int g;

    public meb(String str, long j, CharSequence charSequence, CharSequence charSequence2, boolean z, boolean z2, int i) {
        this.a = str;
        this.b = j;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = z;
        this.f = z2;
        this.g = i;
    }

    public static meb a(meb meb, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            str = meb.a;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            z = meb.e;
        }
        return new meb(str2, meb.b, meb.c, meb.d, z, meb.f, meb.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof meb)) {
            return false;
        }
        meb meb = (meb) obj;
        return tpa.f(this.a, meb.a) && this.b == meb.b && tpa.f(this.c, meb.c) && tpa.f(this.d, meb.d) && this.e == meb.e && this.f == meb.f && this.g == meb.g;
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int m = h4f.m((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        CharSequence charSequence = this.c;
        int hashCode = (m + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        CharSequence charSequence2 = this.d;
        if (charSequence2 != null) {
            i = charSequence2.hashCode();
        }
        return au1.s(this.g) + ms2.d(ms2.d((hashCode + i) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProfileEditAppBarState(avatarUrl=");
        sb.append(this.a);
        sb.append(", avatarSourceId=");
        sb.append(this.b);
        sb.append(", firstName=");
        sb.append(this.c);
        sb.append(", abbreviation=");
        sb.append(this.d);
        sb.append(", showAcceptChanges=");
        sb.append(this.e);
        sb.append(", showAddPhoto=");
        sb.append(this.f);
        sb.append(", confirmType=");
        int i = this.g;
        sb.append(i != 1 ? i != 2 ? "null" : "TOOLBAR_ACTION" : "BUTTON");
        sb.append(")");
        return sb.toString();
    }
}
