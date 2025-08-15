package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bc  reason: default package */
public final class bc extends pnf {
    public static final /* synthetic */ bc7[] t0;
    public final w4d X = mqd.D();
    public final kld Y;
    public final q0e Z;
    public final long b;
    public final pb c;
    public final je7 o;
    public final ac s0;

    static {
        oi9 oi9 = new oi9(bc.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        t0 = new bc7[]{oi9};
    }

    public bc(long j, pb pbVar, je7 je7, je7 je72) {
        this.b = j;
        this.c = pbVar;
        this.o = je7;
        kld b2 = lld.b(0, 0, 0, 7);
        this.Y = b2;
        q0e a = r0e.a((Object) null);
        this.Z = a;
        this.s0 = new ac(new j31(pbVar.j, b2, new c3(this, (Continuation) null, 1), 4), 0, this);
        if (pbVar.g.compareAndSet(false, true)) {
            j47.T(pbVar.f, (lx3) null, (vx3) null, new ob(pbVar, (Continuation) null), 3);
        }
        od2.L(new zn5(pbVar.l, new vb(this, (Continuation) null), 5), this.a);
        od2.L(new zn5(od2.x(od2.u(a, 200)), new xb(this, je72, (Continuation) null), 5), this.a);
    }

    public final boolean q() {
        CharSequence charSequence = (CharSequence) this.Z.getValue();
        return !(charSequence == null || charSequence.length() == 0);
    }
}
