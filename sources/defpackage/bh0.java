package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: bh0  reason: default package */
public final class bh0 extends pnf {
    public static final /* synthetic */ bc7[] u0;
    public static final long v0 = ((long) new yxc(7).hashCode());
    public final je7 X;
    public final q0e Y;
    public final q0e Z;
    public final kke b;
    public final jh0 c;
    public final k56 o;
    public final w7c s0;
    public final w4d t0;

    static {
        oi9 oi9 = new oi9(bh0.class, "bannerJob", "getBannerJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        u0 = new bc7[]{oi9};
    }

    public bh0(je7 je7, boolean z, po3 po3, int i) {
        dh0 dh0 = dh0.a;
        ug0 ug0 = (ug0) dh0.getAccessor().c(ug0.class);
        kke kke = (kke) dh0.getAccessor().c(kke.class);
        jh0 jh0 = (jh0) dh0.getAccessor().c(jh0.class);
        z = (i & 16) != 0 ? false : z;
        k56 mVar = (i & 32) != 0 ? new m(20) : po3;
        this.b = kke;
        this.c = jh0;
        this.o = mVar;
        this.X = je7;
        q0e a = r0e.a(Boolean.valueOf(z));
        this.Y = a;
        w7c w7c = new w7c(a);
        boolean z2 = !jh0.e && !jh0.g && !jh0.f;
        nz4 nz4 = nz4.a;
        q0e a2 = r0e.a(z2 ? nz4 : q(z));
        this.Z = a2;
        this.s0 = od2.X(new qw(a2, 6), this.a, wld.a, nz4);
        this.t0 = mqd.D();
        od2.L(new zn5(new j31(new cp5(new zn5(od2.E(new qn5(2, new mn5[]{new v7c(ug0.b), new qw(ug0.d, 4), new qw(ug0.e, 5)})), new tg0(ug0, (Continuation) null)), new br((Object) ug0, (Continuation) null, 1)), w7c, new ffe(3, (Continuation) null), 4), new zg0(this, je7, (Continuation) null), 5), this.a);
    }

    public final List q(boolean z) {
        yq3 yq3;
        yq3 yq32;
        kl7 l = j1e.l();
        jh0 jh0 = this.c;
        yq3 yq33 = null;
        if (jh0.e) {
            yq3 = new yq3(((Boolean) this.o.invoke()).booleanValue() ? 1 : z ? 2 : 3);
        } else {
            yq3 = null;
        }
        l.add(yq3);
        if (!jh0.g) {
            yq32 = null;
        } else {
            yq32 = new yq3(z ? 5 : 4);
        }
        l.add(yq32);
        if (jh0.f) {
            yq33 = new yq3(z ? 7 : 6);
        }
        l.add(yq33);
        List e0 = x53.e0(j1e.d(l));
        boolean z2 = !((ArrayList) e0).isEmpty();
        je7 je7 = this.X;
        if (z2) {
            m56 b2 = ((vg0) je7.getValue()).b();
            ArrayList arrayList = new ArrayList();
            for (Object next : e0) {
                if (((Boolean) b2.invoke(next)).booleanValue()) {
                    arrayList.add(next);
                }
            }
            e0 = arrayList;
        }
        return e0.isEmpty() ^ true ? x53.x0(e0, ((vg0) je7.getValue()).a()) : e0;
    }
}
