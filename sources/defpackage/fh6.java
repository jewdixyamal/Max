package defpackage;

import java.util.ArrayList;

/* renamed from: fh6  reason: default package */
public final class fh6 extends hj3 {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public oi3 t0 = this.J;
    public int u0;
    public boolean v0;

    public fh6() {
        this.u0 = 0;
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    public final boolean A() {
        return this.v0;
    }

    public final boolean B() {
        return this.v0;
    }

    public final void Q(zh7 zh7, boolean z) {
        if (this.T != null) {
            oi3 oi3 = this.t0;
            zh7.getClass();
            int n = zh7.n(oi3);
            if (this.u0 == 1) {
                this.Y = n;
                this.Z = 0;
                L(this.T.k());
                O(0);
                return;
            }
            this.Y = 0;
            this.Z = n;
            O(this.T.q());
            L(0);
        }
    }

    public final void R(int i) {
        this.t0.l(i);
        this.v0 = true;
    }

    public final void S(int i) {
        if (this.u0 != i) {
            this.u0 = i;
            ArrayList arrayList = this.R;
            arrayList.clear();
            if (this.u0 == 1) {
                this.t0 = this.I;
            } else {
                this.t0 = this.J;
            }
            arrayList.add(this.t0);
            oi3[] oi3Arr = this.Q;
            int length = oi3Arr.length;
            for (int i2 = 0; i2 < length; i2++) {
                oi3Arr[i2] = this.t0;
            }
        }
    }

    public final void b(zh7 zh7, boolean z) {
        ij3 ij3 = (ij3) this.T;
        if (ij3 != null) {
            oi3 i = ij3.i(2);
            oi3 i2 = ij3.i(4);
            hj3 hj3 = this.T;
            boolean z2 = true;
            boolean z3 = hj3 != null && hj3.p0[0] == 2;
            if (this.u0 == 0) {
                i = ij3.i(3);
                i2 = ij3.i(5);
                hj3 hj32 = this.T;
                if (hj32 == null || hj32.p0[1] != 2) {
                    z2 = false;
                }
                z3 = z2;
            }
            if (this.v0) {
                oi3 oi3 = this.t0;
                if (oi3.c) {
                    sud k = zh7.k(oi3);
                    zh7.d(k, this.t0.d());
                    if (this.r0 != -1) {
                        if (z3) {
                            zh7.f(zh7.k(i2), k, 0, 5);
                        }
                    } else if (this.s0 != -1 && z3) {
                        sud k2 = zh7.k(i2);
                        zh7.f(k, zh7.k(i), 0, 5);
                        zh7.f(k2, k, 0, 5);
                    }
                    this.v0 = false;
                    return;
                }
            }
            if (this.r0 != -1) {
                sud k3 = zh7.k(this.t0);
                zh7.e(k3, zh7.k(i), this.r0, 8);
                if (z3) {
                    zh7.f(zh7.k(i2), k3, 0, 5);
                }
            } else if (this.s0 != -1) {
                sud k4 = zh7.k(this.t0);
                sud k5 = zh7.k(i2);
                zh7.e(k4, k5, -this.s0, 8);
                if (z3) {
                    zh7.f(k4, zh7.k(i), 0, 5);
                    zh7.f(k5, k4, 0, 5);
                }
            } else if (this.q0 != -1.0f) {
                sud k6 = zh7.k(this.t0);
                sud k7 = zh7.k(i2);
                float f = this.q0;
                ws l = zh7.l();
                l.d.j(k6, -1.0f);
                l.d.j(k7, f);
                zh7.c(l);
            }
        }
    }

    public final boolean c() {
        return true;
    }

    public final oi3 i(int i) {
        int s = au1.s(i);
        if (s != 1) {
            if (s != 2) {
                if (s != 3) {
                    if (s != 4) {
                        return null;
                    }
                }
            }
            if (this.u0 == 0) {
                return this.t0;
            }
            return null;
        }
        if (this.u0 == 1) {
            return this.t0;
        }
        return null;
    }
}
