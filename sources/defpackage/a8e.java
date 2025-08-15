package defpackage;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: a8e  reason: default package */
public final class a8e extends pnf {
    public static final /* synthetic */ bc7[] C0;
    public final s35 A0;
    public final khe B0;
    public final kke X;
    public final je7 Y;
    public final je7 Z;
    public final a5e b;
    public final long c;
    public final Context o;
    public final je7 s0;
    public final je7 t0;
    public final w4d u0 = mqd.D();
    public final w4d v0 = mqd.D();
    public final w4d w0 = mqd.D();
    public final q0e x0;
    public final w7c y0;
    public final w7c z0;

    static {
        Class<a8e> cls = a8e.class;
        C0 = new bc7[]{new oi9(cls, "clearJob", "getClearJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "deleteStickersJob", "getDeleteStickersJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "deleteSetJob", "getDeleteSetJob()Lkotlinx/coroutines/Job;")};
    }

    public a8e(a5e a5e, long j, Context context, kke kke, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76) {
        mn5 mn5;
        mn5 mn52;
        a5e a5e2 = a5e;
        long j2 = j;
        kke kke2 = kke;
        this.b = a5e2;
        this.c = j2;
        this.o = context;
        this.X = kke2;
        this.Y = je72;
        this.Z = je73;
        this.s0 = je74;
        this.t0 = je76;
        q0e a = r0e.a(nz4.a);
        this.x0 = a;
        this.y0 = new w7c(a);
        a5e a5e3 = a5e.SET;
        if (a5e2 != a5e3 || j2 == -1) {
            mn5 = new mqc(new u7e(new m7e(a5e2 == a5e.RECENT ? new eqe(hja.q) : new eqe(hja.e), (String) null, (String) null, q(false)), (Continuation) null));
        } else {
            kq1 c2 = c37.c(((a4e) je75.getValue()).b(j2));
            sc5 sc5 = (sc5) je74.getValue();
            sc5.getClass();
            c10 c10 = new c10(j2, 15);
            ml0 ml0 = sc5.s0;
            ml0.getClass();
            mn5 = new ap8(new j31(c2, c37.c(new e0a(ml0, c10, 1)), t7e.s0, 4), this, 13);
        }
        w9a w9a = (w9a) kke2;
        this.z0 = od2.X(od2.F(mn5, w9a.b()), this.a, wld.a, (Object) null);
        this.A0 = new s35(0);
        this.B0 = new khe(new rzd(4, this));
        if (a5e2 == a5e3 && j2 == -1) {
            String name = a8e.class.getName();
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.Z, name, "Try load stickers from stickerSet by invalid id: -1", (Throwable) null);
            }
            mn52 = lz4.a;
        } else {
            int ordinal = a5e.ordinal();
            if (ordinal == 0) {
                mn52 = c37.c(((o2e) je7.getValue()).a());
            } else if (ordinal == 1) {
                mn52 = c37.c(((md5) je73.getValue()).a());
            } else if (ordinal == 2) {
                mn52 = new ovc(c37.c(((a4e) je75.getValue()).b(j2)), 4);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        od2.L(od2.F(new zn5(mn52, new shb(2, this, a8e.class, "processStickers", "processStickers(Ljava/util/List;)V", 4, 20), 5), w9a.b()), this.a);
    }

    public final kl7 q(boolean z) {
        kl7 l = j1e.l();
        a5e a5e = a5e.SET;
        a5e a5e2 = this.b;
        if (a5e2 != a5e) {
            l.add(new tt3(gja.u, (jqe) new eqe(hja.z), Integer.valueOf(woc.F), Integer.valueOf(wfa.Q), 4));
        } else {
            l.add(new tt3(gja.i, (jqe) new eqe(hja.f), Integer.valueOf(woc.t), Integer.valueOf(wfa.Q), 4));
            if (z) {
                l.add(new tt3(gja.j, (jqe) new eqe(hja.m), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P)));
            }
        }
        int ordinal = a5e2.ordinal();
        Integer valueOf = ordinal != 0 ? ordinal != 1 ? null : Integer.valueOf(gja.t) : Integer.valueOf(gja.w);
        if (valueOf != null) {
            l.add(new tt3(valueOf.intValue(), (jqe) new eqe(hja.D), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P)));
        }
        return j1e.d(l);
    }

    public final dg9 r() {
        return (dg9) this.B0.getValue();
    }

    public final String s(int i) {
        return this.o.getResources().getQuantityString(uga.a, i, new Object[]{Integer.valueOf(i)});
    }
}
