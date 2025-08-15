package defpackage;

/* renamed from: gh6  reason: default package */
public final class gh6 extends r5g {
    public final void a(oh4 oh4) {
        sh4 sh4 = this.h;
        if (sh4.c && !sh4.j) {
            sh4.d((int) ((((float) ((sh4) sh4.l.get(0)).g) * ((fh6) this.b).q0) + 0.5f));
        }
    }

    public final void d() {
        hj3 hj3 = this.b;
        fh6 fh6 = (fh6) hj3;
        int i = fh6.r0;
        int i2 = fh6.s0;
        int i3 = fh6.u0;
        sh4 sh4 = this.h;
        if (i3 == 1) {
            if (i != -1) {
                sh4.l.add(hj3.T.d.h);
                this.b.T.d.h.k.add(sh4);
                sh4.f = i;
            } else if (i2 != -1) {
                sh4.l.add(hj3.T.d.i);
                this.b.T.d.i.k.add(sh4);
                sh4.f = -i2;
            } else {
                sh4.b = true;
                sh4.l.add(hj3.T.d.i);
                this.b.T.d.i.k.add(sh4);
            }
            m(this.b.d.h);
            m(this.b.d.i);
            return;
        }
        if (i != -1) {
            sh4.l.add(hj3.T.e.h);
            this.b.T.e.h.k.add(sh4);
            sh4.f = i;
        } else if (i2 != -1) {
            sh4.l.add(hj3.T.e.i);
            this.b.T.e.i.k.add(sh4);
            sh4.f = -i2;
        } else {
            sh4.b = true;
            sh4.l.add(hj3.T.e.i);
            this.b.T.e.i.k.add(sh4);
        }
        m(this.b.e.h);
        m(this.b.e.i);
    }

    public final void e() {
        hj3 hj3 = this.b;
        int i = ((fh6) hj3).u0;
        sh4 sh4 = this.h;
        if (i == 1) {
            hj3.Y = sh4.g;
        } else {
            hj3.Z = sh4.g;
        }
    }

    public final void f() {
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
