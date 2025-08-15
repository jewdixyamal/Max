package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l31  reason: default package */
public final class l31 implements b31 {
    public static final /* synthetic */ bc7[] p;
    public final jr1 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final q0e j;
    public final q0e k;
    public final khe l;
    public final w4d m = mqd.D();
    public final w4d n = mqd.D();
    public Long o;

    static {
        Class<l31> cls = l31.class;
        p = new bc7[]{new oi9(cls, "eventsJob", "getEventsJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "observeJob", "getObserveJob()Lkotlinx/coroutines/Job;")};
    }

    public l31(jr1 jr1, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77, je7 je78) {
        this.a = jr1;
        this.b = je7;
        this.c = je72;
        this.d = je73;
        this.e = je74;
        this.f = je75;
        this.g = je76;
        this.h = je77;
        this.i = je78;
        q0e a2 = r0e.a(y21.h);
        this.j = a2;
        this.k = a2;
        this.l = new khe(new z30(1, je75));
    }

    public final iy2 a() {
        return (iy2) this.b.getValue();
    }

    public final vxd b(y66 y66, long j2) {
        int i2 = ft4.o;
        mn5 F = od2.F(new ac(new zn5(new t03(new zn5(nu0.Q(y66, z7.R(1, kt4.SECONDS)), new d31(j2, this, (Continuation) null), 5), 11), new e31(this, (Continuation) null), 5), 18, new f31(this, (Continuation) null, 0)), (nx3) this.l.getValue());
        return j47.T(this.a, (lx3) null, vx3.b, new io5(F, (Continuation) null), 1);
    }
}
