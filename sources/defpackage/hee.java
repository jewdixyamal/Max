package defpackage;

import android.util.Size;

/* renamed from: hee  reason: default package */
public final class hee extends xf4 {
    public final oq1 n = f8.g(new bqc(23, this));
    public lq1 o;
    public xf4 p;
    public kee q;

    public hee(Size size, int i) {
        super(size, i);
    }

    public final void a() {
        super.a();
        kq0.H(new fee(this, 2));
    }

    public final bm7 e() {
        return this.n;
    }

    public final boolean f(xf4 xf4, Runnable runnable) {
        boolean z;
        kq0.e();
        xf4.getClass();
        xf4 xf42 = this.p;
        boolean z2 = false;
        if (xf42 == xf4) {
            return false;
        }
        c54.p("A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider", xf42 == null);
        Size size = this.h;
        Size size2 = xf4.h;
        c54.j("The provider's size(" + size + ") must match the parent(" + size2 + ")", size.equals(size2));
        int i = xf4.i;
        int i2 = this.i;
        if (i2 == i) {
            z2 = true;
        }
        c54.j(wg0.h("The provider's format(", i2, ") must match the parent(", i, ")"), z2);
        synchronized (this.a) {
            z = this.c;
        }
        c54.p("The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.", !z);
        this.p = xf4;
        kq0.y(xf4.c(), this.o);
        xf4.d();
        kq0.w(this.e).d(new wf4(xf4, 2), ju0.k());
        kq0.w(xf4.g).d(runnable, ju0.D());
        return true;
    }
}
