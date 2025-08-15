package defpackage;

import android.webkit.URLUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: k92  reason: default package */
public final class k92 {
    public final long A;
    public final List B;
    public final c92 C;
    public final int D;
    public final String E;
    public final List F;
    public final int G;
    public final z82 H;
    public final String I;
    public final fm5 J;
    public final f92 K;
    public final long L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final long P;
    public final int Q;
    public final Map R;
    public final int S;
    public final k10 T;
    public final long U;
    public final int V;
    public final long W;
    public final int X;
    public final long Y;
    public final long Z;
    public final long a;
    public final List a0;
    public final j92 b;
    public final long b0;
    public final i92 c;
    public final long c0;
    public final long d;
    public final long d0;
    public final Map e;
    public final oq0 e0;
    public final long f;
    public final uaa f0;
    public final String g;
    public final long g0;
    public final String h;
    public final long h0;
    public final String i;
    public boolean i0;
    public final long j;
    public final long j0;
    public final long k;
    public final boolean k0;
    public final long l;
    public final long l0;
    public final int m;
    public final String m0;
    public final e92 n;
    public final Map n0;
    public final String o;
    public final g92 o0;
    public final b92 p;
    public final long p0;
    public final x82 q;
    public final long q0;
    public final x82 r;
    public final int r0;
    public final x82 s;
    public final x82 t;
    public final x82 u;
    public final x82 v;
    public final x82 w;
    public final long x;
    public final List y;
    public final List z;

    public k92(u82 u82) {
        this.a = u82.a;
        j92 j92 = u82.b;
        if (j92 == null) {
            this.b = j92.a;
        } else {
            this.b = j92;
        }
        i92 i92 = u82.c;
        if (i92 == null) {
            this.c = i92.a;
        } else {
            this.c = i92;
        }
        this.d = u82.d;
        Map map = u82.e;
        this.e = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f = u82.f;
        this.g = u82.g;
        this.h = u82.h;
        this.i = u82.i;
        this.j = u82.j;
        this.k = u82.k;
        this.l = u82.l;
        this.m = u82.m;
        e92 e92 = u82.n;
        this.n = e92 != null ? e92.b(true) : new e92();
        this.o = u82.o;
        this.p = u82.p;
        this.q = u82.q;
        this.r = u82.r;
        this.s = u82.s;
        this.t = u82.t;
        this.u = u82.u;
        this.v = u82.v;
        this.w = u82.w;
        this.x = u82.x;
        List list = u82.y;
        this.y = list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
        List list2 = u82.z;
        this.z = list2 != null ? Collections.unmodifiableList(list2) : Collections.emptyList();
        this.A = u82.A;
        List list3 = u82.B;
        this.B = list3 != null ? Collections.unmodifiableList(list3) : Collections.emptyList();
        this.C = u82.D;
        this.D = u82.G;
        this.E = u82.H;
        List list4 = u82.I;
        if (list4 == null) {
            this.F = Collections.emptyList();
        } else {
            this.F = list4;
        }
        this.G = u82.J;
        z82 z82 = u82.K;
        if (z82 == null) {
            this.H = z82.j;
        } else {
            this.H = z82;
        }
        this.r0 = u82.r0;
        this.I = u82.E;
        fm5 fm5 = u82.F;
        this.J = fm5 == null ? fm5.d : fm5;
        this.K = u82.C;
        this.L = u82.L;
        this.M = u82.M;
        this.N = u82.N;
        this.O = u82.O;
        this.P = u82.P;
        this.Q = u82.Q;
        this.R = u82.R;
        this.S = u82.S;
        this.T = u82.T;
        this.U = u82.U;
        this.V = u82.V;
        this.W = u82.W;
        this.X = u82.X;
        this.Y = u82.Y;
        this.Z = u82.Z;
        this.a0 = u82.a0;
        this.b0 = u82.b0;
        this.c0 = u82.c0;
        this.e0 = u82.d0;
        this.d0 = u82.e0;
        this.f0 = u82.f0;
        this.g0 = u82.g0;
        this.h0 = u82.h0;
        this.i0 = u82.i0;
        this.n0 = u82.j0;
        this.j0 = u82.k0;
        this.k0 = u82.l0;
        this.o0 = u82.m0;
        this.l0 = u82.n0;
        this.m0 = u82.o0;
        this.p0 = u82.p0;
        this.q0 = u82.q0;
    }

    public final b92 a() {
        b92 b92 = this.p;
        return b92 != null ? b92 : b92.h;
    }

    public final String b(kk0 kk0, jk0 jk0) {
        String str = this.h;
        if (URLUtil.isContentUrl(str) || URLUtil.isFileUrl(str)) {
            return str;
        }
        if (!oag.t(str)) {
            return ju0.t(str, kk0, jk0);
        }
        return null;
    }

    public final int c() {
        if (this.b == j92.a) {
            return 2;
        }
        return this.D;
    }

    public final boolean d() {
        return this.c == i92.a;
    }

    public final boolean e() {
        return this.b == j92.a;
    }

    public final boolean f(long j2) {
        if (this.a == 0 && this.b == j92.a && this.d == j2) {
            Map map = this.e;
            return map.size() == 1 && map.containsKey(Long.valueOf(j2));
        }
    }

    public final boolean g() {
        int ordinal = this.b.ordinal();
        if (ordinal == 0) {
            if (this.c == i92.Z) {
                return false;
            }
        } else if (ordinal != 1 && ordinal != 2) {
            throw new IllegalStateException("invalid chat type");
        } else if (this.a == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [qpd, java.util.Map, us] */
    public final u82 h() {
        u82 u82 = new u82();
        u82.a = this.a;
        u82.b = this.b;
        u82.c = this.c;
        u82.d = this.d;
        Map map = this.e;
        ? qpd = new qpd(map.size());
        qpd.putAll(map);
        u82.e = qpd;
        u82.f = this.f;
        u82.g = this.g;
        u82.h = this.h;
        u82.i = this.i;
        u82.j = this.j;
        u82.k = this.k;
        u82.l = this.l;
        u82.m = this.m;
        u82.n = this.n.b(false);
        u82.o = this.o;
        u82.p = this.p;
        u82.q = this.q;
        u82.r = this.r;
        u82.s = this.s;
        u82.t = this.t;
        u82.u = this.u;
        u82.v = this.v;
        u82.w = this.w;
        u82.x = this.x;
        u82.y = new ArrayList(this.y);
        u82.z = new ArrayList(this.z);
        u82.A = this.A;
        u82.B = new ArrayList(this.B);
        u82.C = this.K;
        u82.D = this.C;
        u82.r0 = this.r0;
        u82.E = this.I;
        u82.F = this.J;
        u82.G = this.D;
        u82.H = this.E;
        u82.I = new ArrayList(this.F);
        u82.J = this.G;
        u82.K = this.H;
        u82.L = this.L;
        u82.M = this.M;
        u82.N = this.N;
        u82.O = this.O;
        u82.P = this.P;
        u82.Q = this.Q;
        u82.e(this.R);
        u82.S = this.S;
        u82.T = this.T;
        u82.U = this.U;
        u82.V = this.V;
        u82.W = this.W;
        u82.X = this.X;
        u82.Y = this.Y;
        u82.Z = this.Z;
        u82.a0 = this.a0;
        u82.d0 = this.e0;
        u82.b0 = this.b0;
        u82.c0 = this.c0;
        u82.e0 = this.d0;
        u82.f0 = this.f0;
        u82.g0 = this.g0;
        u82.h0 = this.h0;
        u82.i0 = this.i0;
        u82.j0 = this.n0;
        u82.l0 = this.k0;
        u82.m0 = this.o0;
        u82.k0 = this.j0;
        u82.n0 = this.l0;
        u82.o0 = this.m0;
        u82.p0 = this.p0;
        u82.q0 = this.q0;
        return u82;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChatData{serverId=");
        sb.append(this.a);
        sb.append(", type=");
        j92 j92 = this.b;
        sb.append(j92);
        sb.append(", status=");
        sb.append(this.c);
        sb.append(", owner=");
        sb.append(this.d);
        sb.append(", participants={");
        j92 j922 = j92.a;
        Map map = this.e;
        sb.append(j92 == j922 ? oag.v(map.keySet()) : Integer.valueOf(map.size()));
        sb.append("}, title='");
        sb.append(this.g);
        sb.append("', lastMessageId=");
        sb.append(this.j);
        sb.append(", lastEventTime=");
        sb.append(this.k);
        sb.append(", newMessages=");
        sb.append(this.m);
        sb.append(", lastPushMessage=");
        sb.append(this.o0);
        sb.append(", markedAsUnread=");
        sb.append(this.k0);
        sb.append(", chatSettings=");
        sb.append(this.p);
        sb.append(", lastReactionMessageId= ");
        sb.append(this.l0);
        sb.append(", lastReaction");
        return rh4.m(sb, this.m0, '}');
    }
}
