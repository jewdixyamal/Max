package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ajd  reason: default package */
public final class ajd extends pnf implements fg3 {
    public static final /* synthetic */ bc7[] Y;
    public final s35 X = new s35(0);
    public final je7 b;
    public final je7 c;
    public final w4d o = mqd.D();

    static {
        oi9 oi9 = new oi9(ajd.class, "codeJob", "getCodeJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        Y = new bc7[]{oi9};
    }

    public ajd() {
        ehd ehd = ehd.a;
        je7 b2 = ehd.b();
        khe d = ehd.getAccessor().d(o45.class);
        this.b = b2;
        this.c = d;
    }

    public final void e(String str) {
        vxd S = j47.S(this.a, ((w9a) ((kke) this.b.getValue())).a().plus(new qj((o45) this.c.getValue())), vx3.b, new zid(str, this, (Continuation) null));
        this.o.o1(this, Y[0], S);
    }
}
