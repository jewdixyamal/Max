package defpackage;

import java.util.List;

/* renamed from: ru8  reason: default package */
public final class ru8 {
    public final int A;
    public final long B;
    public final int C;
    public final int D;
    public final long E;
    public final List F;
    public final ix8 G;
    public final Long H;
    public final Boolean I;
    public final int J;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final iu8 h;
    public final vx8 i;
    public final long j;
    public final String k;
    public final String l;
    public final k8g m;
    public final int n;
    public final boolean o;
    public final int p;
    public final long q;
    public final boolean r;
    public final long s;
    public final String t;
    public final String u;
    public final long v;
    public final long w;
    public final long x;
    public final int y;
    public final int z;

    public ru8(long j2, long j3, long j4, long j5, long j6, long j7, String str, iu8 iu8, vx8 vx8, long j8, String str2, String str3, k8g k8g, int i2, boolean z2, int i3, long j9, boolean z3, long j10, String str4, String str5, long j11, long j12, int i4, long j13, int i5, int i6, int i7, long j14, int i8, int i9, long j15, List list, ix8 ix8, Long l2, Boolean bool) {
        this.a = j2;
        this.b = j3;
        this.c = j4;
        this.d = j5;
        this.e = j6;
        this.f = j7;
        this.g = str;
        this.h = iu8;
        this.i = vx8;
        this.j = j8;
        this.k = str2;
        this.l = str3;
        this.m = k8g;
        this.n = i2;
        this.o = z2;
        this.p = i3;
        this.q = j9;
        this.r = z3;
        this.s = j10;
        this.t = str4;
        this.u = str5;
        this.v = j11;
        this.w = j12;
        this.J = i4;
        this.x = j13;
        this.y = i5;
        this.z = i6;
        this.A = i7;
        this.B = j14;
        this.C = i8;
        this.D = i9;
        this.E = j15;
        this.F = list;
        this.G = ix8;
        this.H = l2;
        this.I = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru8)) {
            return false;
        }
        ru8 ru8 = (ru8) obj;
        return this.a == ru8.a && this.b == ru8.b && this.c == ru8.c && this.d == ru8.d && this.e == ru8.e && this.f == ru8.f && tpa.f(this.g, ru8.g) && this.h == ru8.h && this.i == ru8.i && this.j == ru8.j && tpa.f(this.k, ru8.k) && tpa.f(this.l, ru8.l) && tpa.f(this.m, ru8.m) && this.n == ru8.n && this.o == ru8.o && this.p == ru8.p && this.q == ru8.q && this.r == ru8.r && this.s == ru8.s && tpa.f(this.t, ru8.t) && tpa.f(this.u, ru8.u) && this.v == ru8.v && this.w == ru8.w && this.J == ru8.J && this.x == ru8.x && this.y == ru8.y && this.z == ru8.z && this.A == ru8.A && this.B == ru8.B && this.C == ru8.C && this.D == ru8.D && this.E == ru8.E && tpa.f(this.F, ru8.F) && tpa.f(this.G, ru8.G) && tpa.f(this.H, ru8.H) && tpa.f(this.I, ru8.I);
    }

    public final int hashCode() {
        int m2 = h4f.m(h4f.m(h4f.m(h4f.m(h4f.m(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        int i2 = 0;
        String str = this.g;
        int m3 = h4f.m((this.i.hashCode() + ((this.h.hashCode() + ((m2 + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31, 31, this.j);
        String str2 = this.k;
        int hashCode = (m3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int hashCode2 = (hashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        k8g k8g = this.m;
        int m4 = h4f.m(ms2.d(h4f.m(k7d.e(this.p, ms2.d(k7d.e(this.n, (hashCode2 + (k8g == null ? 0 : k8g.hashCode())) * 31, 31), 31, this.o), 31), 31, this.q), 31, this.r), 31, this.s);
        String str4 = this.t;
        int hashCode3 = (m4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.u;
        int g2 = k7d.g(this.F, h4f.m(k7d.e(this.D, k7d.e(this.C, h4f.m(k7d.e(this.A, k7d.e(this.z, k7d.e(this.y, h4f.m(ey8.g(this.J, h4f.m(h4f.m((hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.v), 31, this.w), 31), 31, this.x), 31), 31), 31), 31, this.B), 31), 31), 31, this.E), 31);
        ix8 ix8 = this.G;
        int hashCode4 = (g2 + (ix8 == null ? 0 : ix8.hashCode())) * 31;
        Long l2 = this.H;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool = this.I;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode5 + i2;
    }

    public final String toString() {
        return "MessageEntity(id=" + this.a + ", serverId=" + this.b + ", time=" + this.c + ", updateTime=" + this.d + ", sender=" + this.e + ", cid=" + this.f + ", text=" + this.g + ", deliveryStatus=" + this.h + ", status=" + this.i + ", timeLocal=" + this.j + ", error=" + this.k + ", localizedError=" + this.l + ", attaches=" + this.m + ", mediaType=" + this.n + ", detectShare=" + this.o + ", messagesLinkType=" + this.p + ", messagesLinkId=" + this.q + ", insertedFromMessageLink=" + this.r + ", messagesLinkChatId=" + this.s + ", messageLinkChatName=" + this.t + ", messageLinkChatLink=" + this.u + ", messageLinkOutChatId=" + this.v + ", messageLinkOutMessageId=" + this.w + ", type=" + ey8.n(this.J) + ", chatId=" + this.x + ", ttl=" + this.y + ", channelViews=" + this.z + ", channelForwards=" + this.A + ", viewTime=" + this.B + ", zoom=" + this.C + ", options=" + this.D + ", liveUntil=" + this.E + ", elements=" + this.F + ", reactions=" + this.G + ", timeToFire=" + this.H + ", notifySender=" + this.I + ")";
    }
}
