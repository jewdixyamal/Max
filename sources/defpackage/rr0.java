package defpackage;

/* renamed from: rr0  reason: default package */
public final class rr0 extends dl {
    public final qr0 b;
    public final sr0 c;

    public rr0(qr0 qr0, sr0 sr0) {
        super(qr0.a);
        this.b = qr0;
        this.c = sr0;
    }

    public final boolean a() {
        this.b.getClass();
        return this.c.canRepeat();
    }

    public final boolean b() {
        return this.c.isSupplied();
    }

    public final boolean c() {
        this.b.getClass();
        return this.c.shouldPost();
    }

    public final void d(kb7 kb7) {
        sr0 sr0 = this.c;
        if (sr0.shouldSkipParam()) {
            kb7.getClass();
            return;
        }
        kb7.g0(this.b.a);
        sr0.write(kb7);
    }

    public final String toString() {
        return this.a + " = " + this.c;
    }
}
