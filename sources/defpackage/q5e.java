package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* renamed from: q5e  reason: default package */
public final class q5e extends pnf {
    public static final /* synthetic */ bc7[] z0;
    public final je7 X;
    public final je7 Y;
    public final q0e Z;
    public final long b;
    public final kke c;
    public final je7 o;
    public final w7c s0;
    public final s35 t0 = new s35(0);
    public final q0e u0;
    public final AtomicReference v0;
    public final AtomicReference w0;
    public final w4d x0;
    public vxd y0;

    static {
        oi9 oi9 = new oi9(q5e.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        z0 = new bc7[]{oi9};
    }

    public q5e(long j, je7 je7, bod bod, je7 je72, je7 je73, kke kke) {
        this.b = j;
        this.c = kke;
        this.o = je7;
        this.X = je72;
        this.Y = je73;
        q0e a = r0e.a(szc.c);
        this.Z = a;
        this.s0 = new w7c(a);
        q0e a2 = r0e.a((Object) null);
        this.u0 = a2;
        this.v0 = new AtomicReference(nz4.a);
        this.w0 = new AtomicReference(new l5e((String) null, 3));
        this.x0 = mqd.D();
        od2.L(od2.F(new zn5(od2.Z(new ap8(c37.c(((o2e) bod.a.getValue()).l), bod, 10), 1), new k5e(this, (Continuation) null), 5), ((w9a) kke).b()), this.a);
        od2.L(new zn5(od2.u(new jp5(a2, 0), 200), new shb(2, this, q5e.class, "searchStickersByQuery", "searchStickersByQuery(Ljava/lang/String;)V", 4, 14), 5), this.a);
    }

    public static final z2e q(q5e q5e, d2e d2e) {
        d2e d2e2 = d2e;
        q5e.getClass();
        long j = d2e2.a;
        String str = d2e2.s0;
        if (oag.t(str)) {
            str = d2e2.o;
        }
        String str2 = str;
        String str3 = ((se5) ((qe5) q5e.Y.getValue())).w() ? d2e2.z0 : null;
        long j2 = d2e2.v0;
        return new z2e(j, j2, j2, str2, d2e2.w0, str3, d2e2.b, d2e2.c, false, false, 0, 7744);
    }

    public final boolean r() {
        l5e l5e = (l5e) this.w0.get();
        String str = l5e.a;
        return (l5e.b == 0 || str == null || str.length() == 0 || !(((szc) this.s0.a.getValue()).b.isEmpty() ^ true)) ? false : true;
    }
}
