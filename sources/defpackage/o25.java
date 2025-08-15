package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o25  reason: default package */
public final class o25 extends pnf implements fg3 {
    public static final /* synthetic */ bc7[] u0;
    public final s35 X = new s35(0);
    public final s35 Y = new s35(0);
    public final s35 Z = new s35(0);
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final w4d s0 = mqd.D();
    public boolean t0;

    static {
        oi9 oi9 = new oi9(o25.class, "codeJob", "getCodeJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        u0 = new bc7[]{oi9};
    }

    public o25() {
        ehd ehd = ehd.a;
        khe d = ehd.getAccessor().d(q33.class);
        je7 b2 = ehd.b();
        khe d2 = ehd.getAccessor().d(o45.class);
        this.b = d;
        this.c = b2;
        this.o = d2;
    }

    public final void e(String str) {
        vxd S = j47.S(this.a, ((w9a) ((kke) this.c.getValue())).a().plus(new qj((o45) this.o.getValue())), vx3.b, new n25(this, str, (Continuation) null));
        this.s0.o1(this, u0[0], S);
    }
}
