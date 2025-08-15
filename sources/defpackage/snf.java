package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: snf  reason: default package */
public final class snf implements dh3 {
    public final m56 a;
    public final je7 b;
    public final kld c;
    public final v7c o;

    public snf(je7 je7, m56 m56) {
        this.a = m56;
        this.b = je7;
        kld b2 = lld.b(0, 0, 0, 7);
        this.c = b2;
        this.o = new v7c(b2);
    }

    public final x77 a(sx3 sx3, lx3 lx3, vx3 vx3, a66 a66) {
        return j47.S(sx3, lx3, vx3, new rnf(this, a66, (Continuation) null));
    }

    public final v7c f() {
        return this.o;
    }
}
