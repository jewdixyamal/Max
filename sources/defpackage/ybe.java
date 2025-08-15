package defpackage;

/* renamed from: ybe  reason: default package */
public final class ybe {
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final CharSequence e;
    public final String f;
    public final r7b g;
    public final String h;

    public ybe(long j, int i, String str, String str2, CharSequence charSequence, String str3, r7b r7b, String str4) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = charSequence;
        this.f = str3;
        this.g = r7b;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybe)) {
            return false;
        }
        ybe ybe = (ybe) obj;
        return this.a == ybe.a && this.b == ybe.b && tpa.f(this.c, ybe.c) && tpa.f(this.d, ybe.d) && tpa.f(this.e, ybe.e) && tpa.f(this.f, ybe.f) && tpa.f(this.g, ybe.g) && tpa.f(this.h, ybe.h);
    }

    public final int hashCode() {
        int g2 = ey8.g(this.b, Long.hashCode(this.a) * 31, 31);
        int i = 0;
        String str = this.c;
        int hashCode = (g2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        CharSequence charSequence = this.e;
        int hashCode3 = (hashCode2 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        r7b r7b = this.g;
        int hashCode5 = (hashCode4 + (r7b == null ? 0 : r7b.hashCode())) * 31;
        String str4 = this.h;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Suggest(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(k7d.t(this.b));
        sb.append(", title=");
        sb.append(this.c);
        sb.append(", description=");
        sb.append(this.d);
        sb.append(", inputResult=");
        sb.append(this.e);
        sb.append(", avatarUrl=");
        sb.append(this.f);
        sb.append(", presence=");
        sb.append(this.g);
        sb.append(", query=");
        return zr6.l(sb, this.h, ")");
    }
}
