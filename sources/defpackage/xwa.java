package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: xwa  reason: default package */
public final class xwa implements qza {
    public static final /* synthetic */ bc7[] l;
    public final long a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final kld g;
    public final v7c h;
    public final AtomicLong i = new AtomicLong();
    public final w4d j = mqd.D();
    public sx3 k;

    static {
        oi9 oi9 = new oi9(xwa.class, "addSubscribersJob", "getAddSubscribersJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        l = new bc7[]{oi9};
    }

    public xwa(long j2, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75) {
        this.a = j2;
        this.b = je7;
        this.c = je72;
        this.d = je73;
        this.e = je74;
        this.f = je75;
        kld b2 = lld.b(0, Integer.MAX_VALUE, 0, 5);
        this.g = b2;
        this.h = new v7c(b2);
    }

    public final void a() {
        this.k = null;
    }

    public final void b(gza gza) {
    }

    public final void c(sx3 sx3) {
        this.k = sx3;
        od2.L(new zn5(new v7c(((dxa) this.e.getValue()).a), new vwa(this, (Continuation) null), 5), sx3);
    }

    public final void e(long j2) {
    }
}
