package defpackage;

/* renamed from: hg2  reason: default package */
public final class hg2 extends pg2 {
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;

    public hg2(long j, long j2, String str, boolean z) {
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg2)) {
            return false;
        }
        hg2 hg2 = (hg2) obj;
        return this.b == hg2.b && this.c == hg2.c && tpa.f(this.d, hg2.d) && this.e == hg2.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + rh4.d(h4f.m(Long.hashCode(this.b) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OpenImage(chatId=");
        sb.append(this.b);
        sb.append(", messageId=");
        sb.append(this.c);
        sb.append(", attachLocalId=");
        sb.append(this.d);
        sb.append(", isSingleAttach=");
        return au1.j(sb, this.e, ")");
    }
}
