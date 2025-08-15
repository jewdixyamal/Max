package defpackage;

/* renamed from: m7f  reason: default package */
public final class m7f {
    public final long a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;

    public m7f(long j, long j2, String str, long j3, String str2, String str3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = j2;
        this.e = j3;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7f)) {
            return false;
        }
        m7f m7f = (m7f) obj;
        return this.a == m7f.a && tpa.f(this.b, m7f.b) && tpa.f(this.c, m7f.c) && this.d == m7f.d && this.e == m7f.e && tpa.f(this.f, m7f.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + h4f.m(h4f.m(rh4.d(rh4.d(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Input(requestId=");
        sb.append(this.a);
        sb.append(", externalUrl=");
        sb.append(this.b);
        sb.append(", attachLocalId=");
        sb.append(this.c);
        sb.append(", messageId=");
        sb.append(this.d);
        sb.append(", chatId=");
        sb.append(this.e);
        sb.append(", stickerId=");
        return zr6.l(sb, this.f, ")");
    }
}
