package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: q32  reason: default package */
public final class q32 extends l32 {
    public final int X;
    public final mn5 o;

    public q32(int i, int i2, int i3, lx3 lx3, mn5 mn5) {
        super(lx3, i2, i3);
        this.o = mn5;
        this.X = i;
    }

    public final String h() {
        return "concurrency=" + this.X;
    }

    public final Object j(iab iab, Continuation continuation) {
        int i = g5d.a;
        Object d = this.o.d(new p32((x77) continuation.getContext().get(c32.X), new f5d(this.X, 0), iab, new z5d(iab), 0), continuation);
        return d == tx3.a ? d : e5f.a;
    }

    public final l32 k(lx3 lx3, int i, int i2) {
        return new q32(this.X, i, i2, lx3, this.o);
    }

    public final p8c m(sx3 sx3) {
        k32 k32 = new k32(this, (Continuation) null);
        vx3 vx3 = vx3.a;
        fab fab = new fab(v3c.x(sx3, this.a), c37.a(this.b, 1, 4));
        fab.start(vx3, fab, k32);
        return fab;
    }
}
