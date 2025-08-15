package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hzc  reason: default package */
public final class hzc extends pnf {
    public final ru3 X = new ru3(9, (Object) this);
    public final w7c Y;
    public final w7c Z;
    public final long b;
    public final o92 c;
    public final fl2 o;
    public final s35 s0;

    public hzc(ezc ezc, long j, o92 o92, fl2 fl2) {
        this.b = j;
        this.c = o92;
        this.o = fl2;
        this.Y = (w7c) fl2.i;
        w7c w7c = (w7c) fl2.j;
        this.Z = w7c;
        this.s0 = new s35(0);
        od2.L(new zn5(new v7c(ezc.a), new fzc(this, (Continuation) null), 5), this.a);
        od2.L(new zn5(new t03(w7c, 11), new gzc(this, (Continuation) null), 5), this.a);
    }

    public final void q() {
        this.X.f(false);
        fl2 fl2 = this.o;
        il2 il2 = (il2) fl2.a;
        il2.g = null;
        il2.a();
        il2.a();
        ((q0e) fl2.h).setValue((Object) null);
        ((q0e) fl2.g).m((Object) null, qzc.a);
    }

    public final void r(boolean z) {
        this.X.f(true);
        fl2 fl2 = this.o;
        fl2.getClass();
        rzc rzc = new rzc(z);
        q0e q0e = (q0e) fl2.g;
        if (!tpa.f(q0e.getValue(), rzc)) {
            q0e.m((Object) null, rzc);
            il2 il2 = (il2) fl2.a;
            j47.T(il2.e, (lx3) null, (vx3) null, new hl2(il2, (Continuation) null), 3);
            il2.g = fl2;
        }
    }
}
