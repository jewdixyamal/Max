package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;

/* renamed from: sfc  reason: default package */
public final class sfc implements p26 {
    public final iv6 a;
    public final String b = sfc.class.getName();
    public m26 c = m26.d;
    public g0 d;
    public g0 e;

    public sfc(iv6 iv6) {
        this.a = iv6;
    }

    public final m26 c() {
        return this.c;
    }

    public final boolean d() {
        gef gef = this.c.a;
        return (gef != null ? gef.b() : null) != null;
    }

    public final Object e(long j, Continuation continuation) {
        g0 g0Var = this.e;
        if (g0Var != null) {
            g0Var.a();
        }
        this.e = null;
        gef gef = this.c.a;
        uy b2 = gef != null ? gef.b() : null;
        if (gef == null || b2 == null) {
            hm9.p(this.b, "Video collage is null", (Throwable) null);
            return null;
        }
        sy1 sy1 = new sy1(1, v3c.u(continuation));
        sy1.n();
        xv6 d2 = xv6.d(Uri.parse((String) b2.Y));
        d2.p = bp4.c;
        d2.l = new x26(gef, j);
        g0 a2 = this.a.a(d2.a(), (Object) null);
        this.e = a2;
        a2.m(new yu6(sy1, a2, this), qq1.a);
        return sy1.m();
    }

    public final void prepare() {
        gef gef = this.c.a;
        String str = this.b;
        if (gef == null) {
            hm9.p(str, "You should call init before prepare!", (Throwable) null);
            return;
        }
        uy b2 = gef.b();
        if (b2 == null) {
            hm9.p(str, "Video collage is null", (Throwable) null);
            return;
        }
        xv6 d2 = xv6.d(Uri.parse((String) b2.Y));
        d2.p = bp4.c;
        g0 g0Var = this.d;
        if (g0Var != null) {
            g0Var.a();
        }
        this.d = null;
        this.d = this.a.f(d2.a(), (t68) null);
    }
}
