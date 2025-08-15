package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: as3  reason: default package */
public final class as3 implements qza {
    public static final /* synthetic */ bc7[] h;
    public final x3c a;
    public final je7 b;
    public final je7 c;
    public sx3 d;
    public final w4d e = mqd.D();
    public final kld f;
    public final v7c g;

    static {
        oi9 oi9 = new oi9(as3.class, "collectJob", "getCollectJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        h = new bc7[]{oi9};
    }

    public as3(je7 je7, je7 je72, x3c x3c) {
        this.a = x3c;
        this.b = je7;
        this.c = je72;
        kld b2 = lld.b(0, Integer.MAX_VALUE, 0, 5);
        this.f = b2;
        this.g = new v7c(b2);
    }

    public final void a() {
        this.d = null;
    }

    public final void b(gza gza) {
        ((AtomicReference) this.a.Y).updateAndGet(new iz0(9, gza));
    }

    public final void c(sx3 sx3) {
        this.d = sx3;
    }

    public final void e(long j) {
        ((AtomicReference) this.a.Y).updateAndGet(new v79(j, 3));
    }
}
