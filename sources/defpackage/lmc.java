package defpackage;

import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: lmc  reason: default package */
public final class lmc extends xm7 {
    public final ilc l;
    public final ph4 m;
    public final boolean n = true;
    public final Callable o;
    public final ay3 p;
    public final AtomicBoolean q;
    public final AtomicBoolean r;
    public final AtomicBoolean s;
    public final kmc t;
    public final kmc u;

    public lmc(ilc ilc, ph4 ph4, oef oef, String[] strArr) {
        this.l = ilc;
        this.m = ph4;
        this.o = oef;
        this.p = new ay3(strArr, this, 1);
        this.q = new AtomicBoolean(true);
        this.r = new AtomicBoolean(false);
        this.s = new AtomicBoolean(false);
        this.t = new kmc(this, 0);
        this.u = new kmc(this, 1);
    }

    public final void g() {
        Executor executor;
        ((Set) this.m.b).add(this);
        Executor executor2 = null;
        boolean z = this.n;
        ilc ilc = this.l;
        if (!z ? (executor = ilc.b) != null : (executor = ilc.c) != null) {
            executor2 = executor;
        }
        executor2.execute(this.t);
    }

    public final void h() {
        ((Set) this.m.b).remove(this);
    }
}
