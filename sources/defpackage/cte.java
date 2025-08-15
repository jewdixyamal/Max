package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: cte  reason: default package */
public final class cte extends pnf {
    public static final /* synthetic */ bc7[] X;
    public final q0e b = r0e.a(nz4.a);
    public final w4d c;
    public final List o;

    static {
        oi9 oi9 = new oi9(cte.class, "loadJob", "getLoadJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        X = new bc7[]{oi9};
    }

    public cte(iba iba) {
        w4d D = mqd.D();
        this.c = D;
        kpa kpa = new kpa("single", iba.d());
        bc7[] bc7Arr = iba.p;
        bc7 bc7 = bc7Arr[5];
        kpa kpa2 = new kpa("trnsmt", iba.e(iba.k));
        bc7 bc72 = bc7Arr[4];
        kpa kpa3 = new kpa("net", iba.e(iba.j));
        bc7 bc73 = bc7Arr[3];
        this.o = y53.M(kpa, kpa2, kpa3, new kpa("single-low", iba.e(iba.i)));
        D.o1(this, X[0], pnf.n(this, (lx3) null, vx3.b, new bte(this, (Continuation) null), 1));
    }
}
