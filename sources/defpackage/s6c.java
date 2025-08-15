package defpackage;

/* renamed from: s6c  reason: default package */
public final class s6c {
    public final v5c a;
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;

    public s6c(v5c v5c, long j, long j2, String str, boolean z) {
        this.a = v5c;
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6c)) {
            return false;
        }
        s6c s6c = (s6c) obj;
        return tpa.f(this.a, s6c.a) && this.b == s6c.b && this.c == s6c.c && tpa.f(this.d, s6c.d) && this.e == s6c.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rh4.d(h4f.m(h4f.m(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddReaction(selfReaction=");
        sb.append(this.a);
        sb.append(", msgLocalId=");
        sb.append(this.b);
        sb.append(", msgTime=");
        sb.append(this.c);
        sb.append(", effectLottieUrl=");
        sb.append(this.d);
        sb.append(", checkIsVisibleInWindow=");
        return au1.j(sb, this.e, ")");
    }
}
