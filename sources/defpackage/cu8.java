package defpackage;

import java.util.List;

/* renamed from: cu8  reason: default package */
public final class cu8 extends mi0 {
    public final int A0;
    public final long B0;
    public final cu8 C0;
    public final String D0;
    public final String E0;
    public final int F0;
    public final boolean G0;
    public final int H0;
    public final int I0;
    public final long J0;
    public final long K0;
    public final cu8 L0;
    public final int M0;
    public final long N0;
    public final int O0;
    public final int P0;
    public final long Q0;
    public final List R0;
    public final ix8 S0;
    public final ng4 T0;
    public final mg4 U0;
    public final int V0;
    public final long X;
    public final long Y;
    public final long Z;
    public final long c;
    public final long o;
    public final String s0;
    public final long t0;
    public final iu8 u0;
    public final vx8 v0;
    public final long w0;
    public final String x0;
    public final String y0;
    public final k8g z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cu8(long j, long j2, long j3, long j4, long j5, long j6, long j7, String str, iu8 iu8, vx8 vx8, long j8, String str2, String str3, k8g k8g, int i, int i2, long j9, cu8 cu8, String str4, String str5, boolean z, int i3, int i4, int i5, long j10, long j11, cu8 cu82, int i6, long j12, int i7, int i8, long j13, List list, ix8 ix8, ng4 ng4) {
        super(j);
        ng4 ng42 = ng4;
        this.c = j2;
        this.o = j4;
        this.X = j5;
        this.Y = j6;
        this.Z = j7;
        this.s0 = str;
        this.t0 = j3;
        this.u0 = iu8;
        this.v0 = vx8;
        this.w0 = j8;
        this.x0 = str2;
        this.y0 = str3;
        this.A0 = i2;
        this.B0 = j9;
        this.C0 = cu8;
        this.F0 = i;
        this.z0 = k8g;
        this.D0 = str4;
        this.E0 = str5;
        this.G0 = z;
        this.H0 = i3;
        this.I0 = i4;
        this.V0 = i5;
        this.J0 = j10;
        this.K0 = j11;
        this.L0 = cu82;
        this.M0 = i6;
        this.N0 = j12;
        this.O0 = i7;
        this.P0 = i8;
        this.Q0 = j13;
        this.R0 = list;
        this.S0 = ix8;
        this.T0 = ng42;
        this.U0 = ng42 != null ? mg4.DELAYED : mg4.REGULAR;
    }

    public final boolean A() {
        if (n()) {
            if (this.z0.k(g20.c) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean B() {
        if (n()) {
            if (this.z0.k(g20.w0) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean C() {
        if (n()) {
            if (this.z0.k(g20.Z) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean D() {
        if (n()) {
            if (this.z0.k(g20.Y) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean E() {
        if (n()) {
            if (this.z0.k(g20.o) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean F() {
        if (n()) {
            if (this.z0.k(g20.y0) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean G(long j) {
        return v() && ((!d().c() && !d().a()) || this.Y == j);
    }

    public final bu8 H() {
        bu8 bu8 = new bu8();
        bu8.a = this.b;
        bu8.b = this.c;
        bu8.c = this.o;
        bu8.d = this.X;
        bu8.e = this.Y;
        bu8.f = this.Z;
        bu8.g = this.s0;
        bu8.h = this.t0;
        bu8.i = this.u0;
        bu8.j = this.v0;
        bu8.k = this.w0;
        bu8.l = this.x0;
        bu8.m = this.y0;
        bu8.n = this.z0;
        bu8.p = this.A0;
        bu8.q = this.B0;
        bu8.r = this.C0;
        bu8.s = this.D0;
        bu8.t = this.E0;
        bu8.u = this.G0;
        bu8.w = this.I0;
        bu8.v = this.H0;
        bu8.I = this.V0;
        bu8.x = this.J0;
        bu8.y = this.K0;
        bu8.z = this.L0;
        bu8.A = this.M0;
        bu8.B = this.N0;
        bu8.C = this.O0;
        bu8.D = this.P0;
        bu8.E = this.Q0;
        bu8.F = this.R0;
        bu8.G = this.S0;
        bu8.H = this.T0;
        return bu8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: l20} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: l20} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.l20 a(defpackage.g20 r4) {
        /*
            r3 = this;
            boolean r0 = r3.n()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            k8g r3 = r3.z0
            java.lang.Object r3 = r3.a
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x0011
            goto L_0x002f
        L_0x0011:
            java.util.Iterator r3 = r3.iterator()
        L_0x0015:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x002f
            java.lang.Object r0 = r3.next()
            r2 = r0
            l20 r2 = (defpackage.l20) r2     // Catch:{ all -> 0x0028 }
            g20 r2 = r2.a     // Catch:{ all -> 0x0028 }
            if (r2 != r4) goto L_0x0015
            r1 = r0
            goto L_0x002f
        L_0x0028:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
        L_0x002f:
            l20 r1 = (defpackage.l20) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cu8.a(g20):l20");
    }

    public final int b() {
        k8g k8g = this.z0;
        if (k8g != null) {
            return k8g.i();
        }
        return 0;
    }

    public final i10 c() {
        if (!u()) {
            return null;
        }
        return this.z0.k(g20.X).e;
    }

    public final l10 d() {
        if (!v()) {
            return null;
        }
        return this.z0.k(g20.s0).i;
    }

    public final n10 e() {
        if (!w()) {
            return null;
        }
        return this.z0.k(g20.v0).k;
    }

    public final q10 f() {
        if (!x()) {
            return null;
        }
        return this.z0.k(g20.b).c;
    }

    public final s10 g() {
        if (!y()) {
            return null;
        }
        return this.z0.k(g20.u0).j;
    }

    public final long h() {
        long j = this.X;
        long j2 = this.o;
        return j > j2 ? j : j2;
    }

    public final c20 i() {
        if (!C()) {
            return null;
        }
        return this.z0.k(g20.Z).g;
    }

    public final f20 j() {
        if (!D()) {
            return null;
        }
        return this.z0.k(g20.Y).f;
    }

    public final long k() {
        return this.c == 0 ? this.w0 : this.o;
    }

    public final k20 l() {
        if (!E()) {
            return null;
        }
        return this.z0.k(g20.o).d;
    }

    public final boolean m(g20 g20) {
        if (!n()) {
            return false;
        }
        int i = 0;
        while (true) {
            k8g k8g = this.z0;
            if (i >= k8g.i()) {
                return false;
            }
            if (k8g.h(i).a == g20) {
                return true;
            }
            i++;
        }
    }

    public final boolean n() {
        k8g k8g = this.z0;
        return k8g != null && k8g.i() > 0;
    }

    public final boolean o() {
        return this.T0 != null;
    }

    public final boolean p() {
        return this.C0 != null && this.A0 == 2;
    }

    public final boolean q(long j) {
        List<nu8> list = this.R0;
        if (list != null && !list.isEmpty()) {
            for (nu8 nu8 : list) {
                if (nu8.c == mu8.a && nu8.a == j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean r() {
        return this.C0 != null && this.A0 == 1;
    }

    public final boolean s() {
        return this.M0 > 0;
    }

    public final boolean t() {
        return m(g20.o) && l() != null && l().b == 2;
    }

    public final String toString() {
        return cu8.class.getSimpleName() + "{serverId='" + this.c + ",time=" + this.o + ",status" + this.v0 + "}";
    }

    public final boolean u() {
        if (n()) {
            if (this.z0.k(g20.X) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean v() {
        if (n()) {
            if (this.z0.k(g20.s0) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean w() {
        if (n()) {
            if (this.z0.k(g20.v0) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean x() {
        if (n()) {
            if (this.z0.k(g20.b) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        if (n()) {
            if (this.z0.k(g20.u0) != null) {
                return true;
            }
        }
        return false;
    }

    public final boolean z() {
        if (n()) {
            if (this.z0.k(g20.x0) != null) {
                return true;
            }
        }
        return false;
    }
}
