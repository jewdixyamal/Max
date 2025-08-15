package defpackage;

import java.util.Iterator;

/* renamed from: tj6  reason: default package */
public final class tj6 extends r5g {
    public final void a(oh4 oh4) {
        nh0 nh0 = (nh0) this.b;
        int i = nh0.s0;
        sh4 sh4 = this.h;
        Iterator it = sh4.l.iterator();
        int i2 = 0;
        int i3 = -1;
        while (it.hasNext()) {
            int i4 = ((sh4) it.next()).g;
            if (i3 == -1 || i4 < i3) {
                i3 = i4;
            }
            if (i2 < i4) {
                i2 = i4;
            }
        }
        if (i == 0 || i == 2) {
            sh4.d(i3 + nh0.u0);
        } else {
            sh4.d(i2 + nh0.u0);
        }
    }

    public final void d() {
        hj3 hj3 = this.b;
        if (hj3 instanceof nh0) {
            sh4 sh4 = this.h;
            sh4.b = true;
            nh0 nh0 = (nh0) hj3;
            int i = nh0.s0;
            boolean z = nh0.t0;
            int i2 = 0;
            if (i == 0) {
                sh4.e = 4;
                while (i2 < nh0.r0) {
                    hj3 hj32 = nh0.q0[i2];
                    if (z || hj32.g0 != 8) {
                        sh4 sh42 = hj32.d.h;
                        sh42.k.add(sh4);
                        sh4.l.add(sh42);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
            } else if (i == 1) {
                sh4.e = 5;
                while (i2 < nh0.r0) {
                    hj3 hj33 = nh0.q0[i2];
                    if (z || hj33.g0 != 8) {
                        sh4 sh43 = hj33.d.i;
                        sh43.k.add(sh4);
                        sh4.l.add(sh43);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
            } else if (i == 2) {
                sh4.e = 6;
                while (i2 < nh0.r0) {
                    hj3 hj34 = nh0.q0[i2];
                    if (z || hj34.g0 != 8) {
                        sh4 sh44 = hj34.e.h;
                        sh44.k.add(sh4);
                        sh4.l.add(sh44);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
            } else if (i == 3) {
                sh4.e = 7;
                while (i2 < nh0.r0) {
                    hj3 hj35 = nh0.q0[i2];
                    if (z || hj35.g0 != 8) {
                        sh4 sh45 = hj35.e.i;
                        sh45.k.add(sh4);
                        sh4.l.add(sh45);
                    }
                    i2++;
                }
                m(this.b.e.h);
                m(this.b.e.i);
            }
        }
    }

    public final void e() {
        hj3 hj3 = this.b;
        if (hj3 instanceof nh0) {
            int i = ((nh0) hj3).s0;
            sh4 sh4 = this.h;
            if (i == 0 || i == 1) {
                hj3.Y = sh4.g;
            } else {
                hj3.Z = sh4.g;
            }
        }
    }

    public final void f() {
        this.c = null;
        this.h.c();
    }

    public final boolean k() {
        return false;
    }

    public final void m(sh4 sh4) {
        sh4 sh42 = this.h;
        sh42.k.add(sh4);
        sh4.l.add(sh42);
    }
}
