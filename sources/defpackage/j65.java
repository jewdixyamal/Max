package defpackage;

import androidx.media3.transformer.ExportException;

/* renamed from: j65  reason: default package */
public abstract class j65 extends vj0 {
    public long C0;
    public long D0;
    public wqc E0;
    public y84 F0;
    public boolean G0;
    public qy5 H0;
    public qy5 I0;
    public final g03 J0;
    public final wt K0;
    public final p54 L0 = new p54(0);
    public boolean M0;
    public boolean N0;
    public boolean O0;

    public j65(int i, g03 g03, wt wtVar) {
        super(i);
        this.J0 = g03;
        this.K0 = wtVar;
    }

    public final int D(qy5 qy5) {
        return vj0.b(ia9.g(qy5.n) == this.b ? 4 : 0, 0, 0, 0);
    }

    public final boolean F() {
        if (this.E0 != null) {
            return true;
        }
        if (this.I0 == null) {
            if (this.F0 == null || np8.w(this.H0.n) != 1) {
                this.I0 = M(this.H0);
            } else {
                y84 y84 = this.F0;
                y84.f(false);
                qy5 qy5 = y84.j;
                if (qy5 == null) {
                    return false;
                }
                this.I0 = M(qy5);
            }
        }
        wqc c = this.K0.c(this.I0);
        if (c == null) {
            return false;
        }
        this.E0 = c;
        return true;
    }

    public abstract boolean G();

    public abstract void H(qy5 qy5);

    public void J(p54 p54) {
    }

    public void K(qy5 qy5) {
    }

    public qy5 L(qy5 qy5) {
        return qy5;
    }

    public qy5 M(qy5 qy5) {
        return qy5;
    }

    public final boolean N(p54 p54) {
        y7g y7g = this.c;
        y7g.t();
        int y = y(y7g, p54, 0);
        if (y == -5) {
            throw new IllegalStateException("Format changes are not supported.");
        } else if (y != -4) {
            return false;
        } else {
            p54.y();
            if (p54.f(4)) {
                return true;
            }
            this.J0.c0(this.b, p54.Z);
            return true;
        }
    }

    public final boolean O() {
        qy5 qy5 = this.H0;
        if (qy5 != null && !this.N0) {
            return true;
        }
        if (qy5 == null) {
            y7g y7g = this.c;
            y7g.t();
            if (y(y7g, this.L0, 2) != -5) {
                return false;
            }
            qy5 qy52 = (qy5) y7g.c;
            qy52.getClass();
            qy5 L = L(qy52);
            this.H0 = L;
            K(L);
            this.N0 = this.K0.g(3, this.H0);
        }
        if (this.N0) {
            if (np8.w(this.H0.n) == 2 && !F()) {
                return false;
            }
            H(this.H0);
            this.N0 = false;
        }
        return true;
    }

    public abstract boolean P(p54 p54);

    public final m78 j() {
        return this.J0;
    }

    public final boolean m() {
        return this.G0;
    }

    public final boolean o() {
        return true;
    }

    public final void q(boolean z, boolean z2) {
        this.J0.c0(this.b, 0);
    }

    public final void u() {
        y84 y84 = this.F0;
        if (y84 != null) {
            y84.h();
        }
    }

    public final void v() {
        this.M0 = true;
    }

    public final void w() {
        this.M0 = false;
    }

    public final void x(qy5[] qy5Arr, long j, long j2) {
        this.C0 = j;
        this.D0 = j2;
    }

    public final void z(long j, long j2) {
        boolean z;
        boolean G;
        boolean z2;
        try {
            if (this.M0 && !this.G0) {
                if (O()) {
                    if (this.F0 != null) {
                        do {
                            G = F() ? G() : false;
                            y84 y84 = this.F0;
                            p54 p54 = this.L0;
                            if (y84.e(p54)) {
                                if (N(p54)) {
                                    if (!P(p54)) {
                                        J(p54);
                                        this.F0.g(p54);
                                    }
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        } while (G | z2);
                    } else if (F()) {
                        do {
                            p54 d = this.E0.d();
                            if (d != null) {
                                if (!this.O0) {
                                    if (N(d)) {
                                        if (P(d)) {
                                            z = true;
                                            continue;
                                        } else {
                                            this.O0 = true;
                                        }
                                    }
                                }
                                boolean f = d.f(4);
                                if (this.E0.f()) {
                                    this.O0 = false;
                                    this.G0 = f;
                                    z = !f;
                                    continue;
                                }
                            }
                            z = false;
                            continue;
                        } while (z);
                    }
                }
            }
        } catch (ExportException e) {
            this.M0 = false;
            this.K0.d(e);
        }
    }
}
