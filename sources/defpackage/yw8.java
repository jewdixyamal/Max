package defpackage;

import java.util.List;

/* renamed from: yw8  reason: default package */
public final class yw8 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final String h;
    public final List i;
    public final ix8 j;
    public final int k;
    public final long l;
    public final boolean m;
    public final long n;
    public final String o;
    public final String p;
    public final vx8 q;
    public final int r;
    public final int s;
    public final long t;
    public final int u;
    public final int v;
    public final long w;
    public final Long x;
    public final Boolean y;

    public yw8(long j2, long j3, long j4, long j5, long j6, long j7, long j8, String str, List list, ix8 ix8, int i2, long j9, boolean z, long j10, String str2, String str3, vx8 vx8, int i3, int i4, long j11, int i5, int i6, long j12, Long l2, Boolean bool) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = j5;
        this.e = j6;
        this.f = j7;
        this.g = j8;
        this.h = str;
        this.i = list;
        this.j = ix8;
        this.k = i2;
        this.l = j9;
        this.m = z;
        this.n = j10;
        this.o = str2;
        this.p = str3;
        this.q = vx8;
        this.r = i3;
        this.s = i4;
        this.t = j11;
        this.u = i5;
        this.v = i6;
        this.w = j12;
        this.x = l2;
        this.y = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yw8)) {
            return false;
        }
        yw8 yw8 = (yw8) obj;
        return this.a == yw8.a && this.b == yw8.b && this.c == yw8.c && this.d == yw8.d && this.e == yw8.e && this.f == yw8.f && this.g == yw8.g && tpa.f(this.h, yw8.h) && tpa.f(this.i, yw8.i) && tpa.f(this.j, yw8.j) && this.k == yw8.k && this.l == yw8.l && this.m == yw8.m && this.n == yw8.n && tpa.f(this.o, yw8.o) && tpa.f(this.p, yw8.p) && this.q == yw8.q && this.r == yw8.r && this.s == yw8.s && this.t == yw8.t && this.u == yw8.u && this.v == yw8.v && this.w == yw8.w && tpa.f(this.x, yw8.x) && tpa.f(this.y, yw8.y);
    }

    public final int hashCode() {
        int m2 = h4f.m(h4f.m(h4f.m(h4f.m(h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        int i2 = 0;
        String str = this.h;
        int g2 = k7d.g(this.i, (m2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        ix8 ix8 = this.j;
        int m3 = h4f.m(ms2.d(h4f.m(k7d.e(this.k, (g2 + (ix8 == null ? 0 : ix8.hashCode())) * 31, 31), 31, this.l), 31, this.m), 31, this.n);
        String str2 = this.o;
        int hashCode = (m3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.p;
        int m4 = h4f.m(k7d.e(this.v, k7d.e(this.u, h4f.m(k7d.e(this.s, ey8.g(this.r, (this.q.hashCode() + ((hashCode + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31, 31), 31), 31, this.t), 31), 31), 31, this.w);
        Long l2 = this.x;
        int hashCode2 = (m4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.y;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "MessagePartEntity(id=" + this.a + ", serverId=" + this.b + ", time=" + this.c + ", chatId=" + this.d + ", updateTime=" + this.e + ", sender=" + this.f + ", cid=" + this.g + ", text=" + this.h + ", elements=" + this.i + ", reactions=" + this.j + ", messagesLinkType=" + this.k + ", messagesLinkId=" + this.l + ", insertedFromMessageLink=" + this.m + ", messagesLinkChatId=" + this.n + ", messageLinkChatName=" + this.o + ", messageLinkChatLink=" + this.p + ", status=" + this.q + ", type=" + ey8.n(this.r) + ", ttl=" + this.s + ", viewTime=" + this.t + ", zoom=" + this.u + ", options=" + this.v + ", liveUntil=" + this.w + ", timeToFire=" + this.x + ", notifySender=" + this.y + ")";
    }
}
