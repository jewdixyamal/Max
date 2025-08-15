package defpackage;

import java.util.List;

/* renamed from: v69  reason: default package */
public final class v69 {
    public final long a;
    public final long b;
    public final long c;
    public final List d;
    public final boolean e;
    public final boolean f;

    public v69(long j, long j2, long j3, List list, boolean z, boolean z2) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = list;
        this.e = z;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v69)) {
            return false;
        }
        v69 v69 = (v69) obj;
        return this.a == v69.a && this.b == v69.b && this.c == v69.c && tpa.f(this.d, v69.d) && this.e == v69.e && this.f == v69.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ms2.d(k7d.g(this.d, h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesListWidgetArgs(chatId=");
        sb.append(this.a);
        sb.append(", loadMark=");
        sb.append(this.b);
        sb.append(", loadMessageId=");
        sb.append(this.c);
        sb.append(", highlights=");
        sb.append(this.d);
        sb.append(", shouldHighlightMessage=");
        sb.append(this.e);
        sb.append(", shouldSkipUnreadDecoration=");
        return au1.j(sb, this.f, ")");
    }
}
