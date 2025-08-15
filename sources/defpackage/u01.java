package defpackage;

/* renamed from: u01  reason: default package */
public final class u01 implements w01 {
    public final long a;
    public final boolean b;
    public final String c;

    public u01(long j, String str, boolean z) {
        this.a = j;
        this.b = z;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u01)) {
            return false;
        }
        u01 u01 = (u01) obj;
        return this.a == u01.a && this.b == u01.b && tpa.f(this.c, u01.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ms2.d(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chat(chatId=");
        sb.append(this.a);
        sb.append(", isVideo=");
        sb.append(this.b);
        sb.append(", link=");
        return zr6.l(sb, this.c, ")");
    }
}
