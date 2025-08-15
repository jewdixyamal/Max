package defpackage;

import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: gv4  reason: default package */
public abstract class gv4 {
    public final sx3 a;
    public final q0e b;
    public final q0e c;
    public final kld d = lld.b(0, 0, 0, 7);
    public final kld e = lld.b(0, 0, 0, 7);
    public final mn5 f;
    public final je7 g;
    public final je7 h;
    public final q0e i;
    public final q0e j;
    public jv4 k;
    public final AtomicLong l;
    public final AtomicLong m;

    public gv4(sx3 sx3) {
        this.a = sx3;
        je7 d2 = neb.a.d();
        q0e a2 = r0e.a((Object) null);
        this.b = a2;
        q0e a3 = r0e.a(nz4.a);
        this.c = a3;
        this.f = od2.F(new j31(new t03(a2, 11), a3, new xh0(3, (Continuation) null, 9), 4), ((w9a) ((kke) d2.getValue())).a());
        this.g = tu0.r(3, new zf3(23));
        this.h = tu0.r(3, new zf3(24));
        this.i = r0e.a((Object) null);
        q0e a4 = r0e.a((Object) null);
        this.j = a4;
        this.l = new AtomicLong();
        this.m = new AtomicLong();
        od2.L(od2.F(new zn5(a4, new ev4(this, (Continuation) null), 5), ((w9a) ((kke) d2.getValue())).a()), sx3);
    }

    public abstract void a(int i2);

    public abstract void b();

    public final iv4 c() {
        return (iv4) this.h.getValue();
    }

    public abstract boolean d();

    public abstract long e();

    public final zu4 f() {
        return (zu4) this.g.getValue();
    }

    public abstract void g(int i2);

    public abstract Object h(String str, RectF rectF, Continuation continuation);

    public abstract e5f i();

    public abstract void j();

    public abstract void k();

    public abstract Object l(Continuation continuation);

    public abstract void m(int i2, String str);
}
