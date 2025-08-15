package defpackage;

/* renamed from: zpd  reason: default package */
public final class zpd extends u2 {
    public final t75 c;
    public final ae3 o;

    public zpd(w65 w65) {
        super(2);
        ae3 ae3 = new ae3(0, false);
        this.o = ae3;
        try {
            this.c = new t75(w65, this);
            ae3.g();
        } catch (Throwable th) {
            this.o.g();
            throw th;
        }
    }

    public final int B() {
        Z1();
        return this.c.B();
    }

    public final int O() {
        Z1();
        return this.c.O();
    }

    public final lue O1() {
        Z1();
        return this.c.O1();
    }

    public final void Q1() {
        Z1();
        this.c.s2();
    }

    public final void Y(boolean z) {
        Z1();
        t75 t75 = this.c;
        t75.s2();
        t75.s2();
        int d = t75.I0.d(t75.k1.e, z);
        int i = 1;
        if (z && d != 1) {
            i = 2;
        }
        t75.p2(d, i, z);
    }

    public final void Z1() {
        this.o.b();
    }

    public final long b0() {
        Z1();
        return this.c.b0();
    }

    public final float e() {
        Z1();
        t75 t75 = this.c;
        t75.s2();
        return t75.e1;
    }

    public final int getRepeatMode() {
        Z1();
        t75 t75 = this.c;
        t75.s2();
        return t75.N0;
    }

    public final long k() {
        Z1();
        return this.c.k();
    }

    public final boolean n() {
        Z1();
        return this.c.n();
    }

    public final int o0() {
        Z1();
        return this.c.o0();
    }

    public final int p0() {
        Z1();
        return this.c.p0();
    }

    public final long q() {
        Z1();
        return this.c.q();
    }

    public final void r(int i, long j) {
        Z1();
        this.c.r(i, j);
    }
}
