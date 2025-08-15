package defpackage;

/* renamed from: nh0  reason: default package */
public final class nh0 extends uj6 {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    public final boolean A() {
        return this.v0;
    }

    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.r0;
            if (i4 >= i) {
                break;
            }
            hj3 hj3 = this.q0[i4];
            if ((this.t0 || hj3.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !hj3.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !hj3.B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.r0; i6++) {
            hj3 hj32 = this.q0[i6];
            if (this.t0 || hj32.c()) {
                if (!z2) {
                    int i7 = this.s0;
                    if (i7 == 0) {
                        i5 = hj32.i(2).d();
                    } else if (i7 == 1) {
                        i5 = hj32.i(4).d();
                    } else if (i7 == 2) {
                        i5 = hj32.i(3).d();
                    } else if (i7 == 3) {
                        i5 = hj32.i(5).d();
                    }
                    z2 = true;
                }
                int i8 = this.s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, hj32.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, hj32.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, hj32.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, hj32.i(5).d());
                }
            }
        }
        int i9 = i5 + this.u0;
        int i10 = this.s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    public final void b(zh7 zh7, boolean z) {
        boolean z2;
        int i;
        int i2;
        zh7 zh72 = zh7;
        oi3[] oi3Arr = this.Q;
        oi3 oi3 = this.I;
        oi3Arr[0] = oi3;
        oi3 oi32 = this.J;
        int i3 = 2;
        oi3Arr[2] = oi32;
        oi3 oi33 = this.K;
        oi3Arr[1] = oi33;
        oi3 oi34 = this.L;
        oi3Arr[3] = oi34;
        for (oi3 oi35 : oi3Arr) {
            oi35.i = zh72.k(oi35);
        }
        int i4 = this.s0;
        if (i4 >= 0 && i4 < 4) {
            oi3 oi36 = oi3Arr[i4];
            if (!this.v0) {
                T();
            }
            if (this.v0) {
                this.v0 = false;
                int i5 = this.s0;
                if (i5 == 0 || i5 == 1) {
                    zh72.d(oi3.i, this.Y);
                    zh72.d(oi33.i, this.Y);
                } else if (i5 == 2 || i5 == 3) {
                    zh72.d(oi32.i, this.Z);
                    zh72.d(oi34.i, this.Z);
                }
            } else {
                int i6 = 0;
                while (true) {
                    if (i6 >= this.r0) {
                        z2 = false;
                        break;
                    }
                    hj3 hj3 = this.q0[i6];
                    if ((this.t0 || hj3.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && hj3.p0[0] == 3 && hj3.I.f != null && hj3.K.f != null) || ((i2 == 2 || i2 == 3) && hj3.p0[1] == 3 && hj3.J.f != null && hj3.L.f != null))) {
                        z2 = true;
                    } else {
                        i6++;
                    }
                }
                boolean z3 = oi3.g() || oi33.g();
                boolean z4 = oi32.g() || oi34.g();
                int i7 = (z2 || (((i = this.s0) != 0 || !z3) && ((i != 2 || !z4) && ((i != 1 || !z3) && (i != 3 || !z4))))) ? 4 : 5;
                int i8 = 0;
                while (i8 < this.r0) {
                    hj3 hj32 = this.q0[i8];
                    if (this.t0 || hj32.c()) {
                        sud k = zh72.k(hj32.Q[this.s0]);
                        int i9 = this.s0;
                        oi3 oi37 = hj32.Q[i9];
                        oi37.i = k;
                        oi3 oi38 = oi37.f;
                        int i10 = (oi38 == null || oi38.d != this) ? 0 : oi37.g;
                        if (i9 == 0 || i9 == i3) {
                            ws l = zh7.l();
                            sud m = zh7.m();
                            m.o = 0;
                            l.c(oi36.i, k, m, this.u0 - i10);
                            zh72.c(l);
                        } else {
                            ws l2 = zh7.l();
                            sud m2 = zh7.m();
                            m2.o = 0;
                            l2.b(oi36.i, k, m2, this.u0 + i10);
                            zh72.c(l2);
                        }
                        zh72.e(oi36.i, k, this.u0 + i10, i7);
                    }
                    i8++;
                    i3 = 2;
                }
                int i11 = this.s0;
                if (i11 == 0) {
                    zh72.e(oi33.i, oi3.i, 0, 8);
                    zh72.e(oi3.i, this.T.K.i, 0, 4);
                    zh72.e(oi3.i, this.T.I.i, 0, 0);
                } else if (i11 == 1) {
                    zh72.e(oi3.i, oi33.i, 0, 8);
                    zh72.e(oi3.i, this.T.I.i, 0, 4);
                    zh72.e(oi3.i, this.T.K.i, 0, 0);
                } else if (i11 == 2) {
                    zh72.e(oi34.i, oi32.i, 0, 8);
                    zh72.e(oi32.i, this.T.L.i, 0, 4);
                    zh72.e(oi32.i, this.T.J.i, 0, 0);
                } else if (i11 == 3) {
                    zh72.e(oi32.i, oi34.i, 0, 8);
                    zh72.e(oi32.i, this.T.J.i, 0, 4);
                    zh72.e(oi32.i, this.T.L.i, 0, 0);
                }
            }
        }
    }

    public final boolean c() {
        return true;
    }

    public final String toString() {
        String l = zr6.l(new StringBuilder("[Barrier] "), this.h0, " {");
        for (int i = 0; i < this.r0; i++) {
            hj3 hj3 = this.q0[i];
            if (i > 0) {
                l = au1.g(l, ", ");
            }
            StringBuilder l2 = au1.l(l);
            l2.append(hj3.h0);
            l = l2.toString();
        }
        return au1.g(l, "}");
    }
}
