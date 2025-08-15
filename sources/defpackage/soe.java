package defpackage;

import java.util.Objects;

/* renamed from: soe  reason: default package */
public final class soe extends v2 {
    public sg9 X;
    public t26 Y;
    public final va8 Z;
    public l0f o;

    public soe(va8 va8, nx0 nx0) {
        super(nx0);
        this.Z = va8;
    }

    public final void h() {
        this.o.getClass();
        l0f l0f = this.o;
        Objects.requireNonNull(l0f);
        ((nx0) this.a).v(new nf4(4, l0f));
    }

    public final synchronized void i() {
        l0f l0f = this.o;
        l0f.getClass();
        l0f.v();
        super.i();
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 112 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int k() {
        /*
            r1 = this;
            l0f r1 = r1.o
            r1.getClass()
            monitor-enter(r1)
            java.lang.Object r0 = r1.c     // Catch:{ all -> 0x0012 }
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch:{ all -> 0x0012 }
            int r0 = r0.size()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)
            return r0
        L_0x0010:
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            throw r0
        L_0x0012:
            r0 = move-exception
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.soe.k():int");
    }

    public final void p(int i, long j) {
        t26 t26 = this.Y;
        t26.getClass();
        this.X.getClass();
        ((nx0) this.a).v(new roe(this, i, t26, j));
    }

    public final void release() {
    }

    public final void s(hd6 hd6) {
        ((nx0) this.a).v(new i12(this, 4, hd6));
    }

    public final void w(t26 t26) {
        this.Y = t26;
    }

    public final void x(sg9 sg9) {
        this.X = sg9;
    }

    public final void y(od4 od4) {
        this.o = new l0f(this.Z, od4, (nx0) this.a);
    }

    public final void z() {
        ((nx0) this.a).v(new nf4(3, this));
    }
}
