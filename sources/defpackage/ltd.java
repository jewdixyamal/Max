package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ltd  reason: default package */
public final class ltd implements lp8 {
    public final long a;
    public final ek2 b;
    public final kke c;
    public final long d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final AtomicInteger h;
    public final q0e i;
    public final q0e j;
    public final w7c k;
    public final w7c l;

    public ltd(long j2, ek2 ek2, q33 q33, je7 je7, je7 je72, je7 je73, kke kke, je7 je74) {
        je7 je75 = je7;
        kke kke2 = kke;
        this.a = j2;
        this.b = ek2;
        this.c = kke2;
        this.d = ((hyc) q33).t();
        this.e = je75;
        this.f = je72;
        this.g = je73;
        AtomicInteger atomicInteger = new AtomicInteger(0);
        this.h = atomicInteger;
        q0e a2 = r0e.a(Integer.valueOf(atomicInteger.get()));
        this.i = a2;
        w9a w9a = (w9a) kke2;
        ContextScope a3 = j1e.a(w9a.a());
        q0e a4 = r0e.a((Object) null);
        this.j = a4;
        q0e a5 = r0e.a((Object) null);
        this.k = new w7c(a5);
        this.l = od2.X(od2.d0(a2, new vp5((Continuation) null, (Object) this, 8)), a3, wld.a, nz4.a);
        j47.T(a3, (lx3) null, (vx3) null, new jtd(je75, this, je74, (Continuation) null), 3);
        od2.L(od2.F(new zn5(new ap8(od2.x(od2.u(a4, 200)), this, 11), new v59(2, a5, ti9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 12), 5), w9a.b()), a3);
    }

    public final void a(String str) {
        this.j.setValue(str);
    }

    public final mn5 b() {
        return this.k;
    }

    public final boolean c() {
        return false;
    }

    public final w7c d() {
        return this.l;
    }

    public final void e() {
        this.i.m((Object) null, Integer.valueOf(this.h.incrementAndGet()));
    }
}
