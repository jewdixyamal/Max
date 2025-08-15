package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wf3  reason: default package */
public final class wf3 extends pnf implements fg3 {
    public static final /* synthetic */ bc7[] w0;
    public final je7 X;
    public final je7 Y;
    public final q0e Z;
    public final String b;
    public final je7 c;
    public final je7 o;
    public final t03 s0;
    public final w4d t0 = mqd.D();
    public final s35 u0 = new s35(0);
    public final s35 v0 = new s35(0);

    static {
        oi9 oi9 = new oi9(wf3.class, "codeInputJob", "getCodeInputJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        w0 = new bc7[]{oi9};
    }

    public wf3(String str) {
        ehd ehd = ehd.a;
        khe d = ehd.getAccessor().d(q33.class);
        khe d2 = ehd.getAccessor().d(q6f.class);
        je7 b2 = ehd.b();
        khe d3 = ehd.getAccessor().d(o45.class);
        this.b = str;
        this.c = d;
        this.o = d2;
        this.X = b2;
        this.Y = d3;
        q0e a = r0e.a(tf3.a);
        this.Z = a;
        this.s0 = new t03(a, 11);
    }

    public final void e(String str) {
        vxd n = pnf.n(this, ((w9a) ((kke) this.X.getValue())).a().plus(new qj((o45) this.Y.getValue())), (vx3) null, new vf3(str, this, (Continuation) null), 2);
        this.t0.o1(this, w0[0], n);
    }
}
