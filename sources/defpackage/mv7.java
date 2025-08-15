package defpackage;

import java.util.concurrent.LinkedBlockingQueue;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: mv7  reason: default package */
public final class mv7 extends pnf {
    public static final /* synthetic */ bc7[] v0;
    public final LinkedBlockingQueue X = new LinkedBlockingQueue(1);
    public final q0e Y;
    public final LinkedBlockingQueue Z;
    public final uca b;
    public final kke c;
    public final khe o = new khe(new vu7(this, 0));
    public final q0e s0;
    public final w4d t0;
    public z87 u0;

    static {
        oi9 oi9 = new oi9(mv7.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        v0 = new bc7[]{oi9};
    }

    public mv7(uca uca, kke kke) {
        this.b = uca;
        this.c = kke;
        nz4 nz4 = nz4.a;
        this.Y = r0e.a(nz4);
        this.Z = new LinkedBlockingQueue(1);
        this.s0 = r0e.a(nz4);
        this.t0 = mqd.D();
        y77 a = pag.a();
        a.H();
        this.u0 = a;
        pnf.n(this, ((w9a) kke).b(), (vx3) null, new av7(this, (Continuation) null), 2);
        q();
    }

    public final void q() {
        if (this.u0.isCompleted()) {
            x77 x77 = (x77) this.t0.T0(this, v0[0]);
            kke kke = this.c;
            ContextScope contextScope = this.a;
            this.u0 = (x77 == null || !x77.isActive()) ? j47.T(contextScope, ((w9a) kke).b(), (vx3) null, new fv7(this, (Continuation) null), 2) : j47.T(contextScope, ((w9a) kke).b(), (vx3) null, new ev7(this, (Continuation) null), 2);
        }
    }
}
