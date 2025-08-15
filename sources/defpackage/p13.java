package defpackage;

/* renamed from: p13  reason: default package */
public final class p13 implements grc {
    public final /* synthetic */ t13 X;
    public final t13 a;
    public final erc b;
    public final int c;
    public boolean o;

    public p13(t13 t13, t13 t132, erc erc, int i) {
        this.X = t13;
        this.a = t132;
        this.b = erc;
        this.c = i;
    }

    public final void a() {
        if (!this.o) {
            t13 t13 = this.X;
            jn jnVar = t13.Z;
            int[] iArr = t13.b;
            int i = this.c;
            jnVar.m(iArr[i], t13.c[i], 0, (Object) null, t13.E0);
            this.o = true;
        }
    }

    public final void b() {
        t13 t13 = this.X;
        boolean[] zArr = t13.o;
        int i = this.c;
        fm9.k(zArr[i]);
        t13.o[i] = false;
    }

    public final void c() {
    }

    public final boolean d() {
        t13 t13 = this.X;
        return !t13.y() && this.b.s(t13.H0);
    }

    public final int e(long j) {
        t13 t13 = this.X;
        if (t13.y()) {
            return 0;
        }
        boolean z = t13.H0;
        erc erc = this.b;
        int p = erc.p(j, z);
        zi0 zi0 = t13.G0;
        if (zi0 != null) {
            p = Math.min(p, zi0.d(this.c + 1) - erc.n());
        }
        erc.B(p);
        if (p > 0) {
            a();
        }
        return p;
    }

    public final int j(y7g y7g, p54 p54, int i) {
        t13 t13 = this.X;
        if (t13.y()) {
            return -3;
        }
        zi0 zi0 = t13.G0;
        erc erc = this.b;
        if (zi0 != null && zi0.d(this.c + 1) <= erc.n()) {
            return -3;
        }
        a();
        return erc.x(y7g, p54, i, t13.H0);
    }
}
