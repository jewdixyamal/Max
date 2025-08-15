package defpackage;

/* renamed from: hu1  reason: default package */
public final class hu1 extends bn8 {
    public xm7 m;
    public final Object n;

    public hu1(Object obj) {
        this.n = obj;
    }

    public final Object d() {
        xm7 xm7 = this.m;
        return xm7 == null ? this.n : xm7.d();
    }

    public final void l(xm7 xm7, g2a g2a) {
        throw null;
    }

    public final void m(xm7 xm7) {
        an8 an8;
        xm7 xm72 = this.m;
        if (!(xm72 == null || (an8 = (an8) this.l.c(xm72)) == null)) {
            an8.a.j(an8);
        }
        this.m = xm7;
        super.l(xm7, new gu1(0, this));
    }
}
