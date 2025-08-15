package defpackage;

import java.util.List;

/* renamed from: hg1  reason: default package */
public final class hg1 implements ig1 {
    public final gg1 a;
    public final rd8 b;
    public final rd8 c;
    public final rd8 d;
    public final boolean e;
    public final boolean f;
    public final llf g;
    public final llf h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final long n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final List u;
    public final int v;

    public hg1(gg1 gg1, rd8 rd8, rd8 rd82, rd8 rd83, boolean z, boolean z2, llf llf, llf llf2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j2, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, List list, int i2) {
        this.a = gg1;
        this.b = rd8;
        this.c = rd82;
        this.d = rd83;
        this.e = z;
        this.f = z2;
        this.g = llf;
        this.h = llf2;
        this.i = z3;
        this.j = z4;
        this.k = z5;
        this.l = z6;
        this.m = z7;
        this.n = j2;
        this.o = z8;
        this.p = z9;
        this.q = z10;
        this.r = z11;
        this.s = z12;
        this.t = z13;
        this.u = list;
        this.v = i2;
    }

    public final boolean b() {
        return this.e;
    }

    public final boolean e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hg1)) {
            return false;
        }
        hg1 hg1 = (hg1) obj;
        return tpa.f(this.a, hg1.a) && this.b == hg1.b && this.c == hg1.c && this.d == hg1.d && this.e == hg1.e && this.f == hg1.f && tpa.f(this.g, hg1.g) && tpa.f(this.h, hg1.h) && this.i == hg1.i && this.j == hg1.j && this.k == hg1.k && this.l == hg1.l && this.m == hg1.m && this.n == hg1.n && this.o == hg1.o && this.p == hg1.p && this.q == hg1.q && this.r == hg1.r && this.s == hg1.s && this.t == hg1.t && tpa.f(this.u, hg1.u) && this.v == hg1.v;
    }

    public final boolean f() {
        return this.f;
    }

    public final boolean g() {
        return this.p;
    }

    public final gg1 getId() {
        return this.a;
    }

    public final boolean h() {
        return this.r;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int d2 = ms2.d(ms2.d((this.d.hashCode() + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e), 31, this.f);
        return au1.s(this.v) + k7d.g(this.u, ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(ms2.d(h4f.m(ms2.d(ms2.d(ms2.d(ms2.d(ms2.d((this.h.hashCode() + ((this.g.hashCode() + d2) * 31)) * 31, 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31);
    }

    public final boolean i() {
        return this.j;
    }

    public final boolean isConnected() {
        return this.l;
    }

    public final boolean k() {
        return this.q;
    }

    public final boolean n() {
        return this.k;
    }

    public final boolean o() {
        return this.o;
    }

    public final llf p() {
        return this.h;
    }

    public final int r() {
        return this.v;
    }

    public final llf s() {
        return this.g;
    }

    public final boolean t() {
        return this.m;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallParticipantImpl(id=");
        sb.append(this.a);
        sb.append(", audioOptionState=");
        sb.append(this.b);
        sb.append(", videoOptionState=");
        sb.append(this.c);
        sb.append(", screenShareOptionState=");
        sb.append(this.d);
        sb.append(", isAudioEnabled=");
        sb.append(this.e);
        sb.append(", isShareAudioEnabled=");
        sb.append(this.f);
        sb.append(", videoState=");
        sb.append(this.g);
        sb.append(", screenCaptureState=");
        sb.append(this.h);
        sb.append(", isCreator=");
        sb.append(this.i);
        sb.append(", isAdmin=");
        sb.append(this.j);
        sb.append(", isConnectedOnce=");
        sb.append(this.k);
        sb.append(", isConnected=");
        sb.append(this.l);
        sb.append(", isAccepted=");
        sb.append(this.m);
        sb.append(", acceptCallEpochMs=");
        sb.append(this.n);
        sb.append(", isSelf=");
        sb.append(this.o);
        sb.append(", isPrimarySpeaker=");
        sb.append(this.p);
        sb.append(", isTalking=");
        sb.append(this.q);
        sb.append(", isRaiseHand=");
        sb.append(this.r);
        sb.append(", hasRegisteredPeers=");
        sb.append(this.s);
        sb.append(", hasMediaBytes=");
        sb.append(this.t);
        sb.append(", movies=");
        sb.append(this.u);
        sb.append(", networkStatus=");
        int i2 = this.v;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "BAD" : "MEDIUM" : "GOOD");
        sb.append(")");
        return sb.toString();
    }
}
