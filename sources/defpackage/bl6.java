package defpackage;

/* renamed from: bl6  reason: default package */
public final class bl6 extends hl6 {
    public final long a;
    public final CharSequence b;
    public final String c;
    public final boolean d;

    public bl6(long j, CharSequence charSequence, String str, boolean z) {
        this.a = j;
        this.b = charSequence;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bl6)) {
            return false;
        }
        bl6 bl6 = (bl6) obj;
        return this.a == bl6.a && tpa.f(this.b, bl6.b) && tpa.f(this.c, bl6.c) && this.d == bl6.d;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return Boolean.hashCode(this.d) + ((hashCode2 + i) * 31);
    }

    public final String toString() {
        return "Avatar(avatarColorId=" + this.a + ", abbreviation=" + this.b + ", avatar=" + this.c + ", isCallLink=" + this.d + ")";
    }
}
