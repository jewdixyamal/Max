package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* renamed from: b8e  reason: default package */
public final class b8e extends pnf {
    public static final /* synthetic */ bc7[] B0;
    public final w4d A0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final kke b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final q0e t0;
    public final w7c u0;
    public final AtomicLong v0 = new AtomicLong();
    public final q0e w0;
    public final w7c x0;
    public final w4d y0;
    public final w4d z0;

    static {
        Class<b8e> cls = b8e.class;
        B0 = new bc7[]{new oi9(cls, "selectedFindJob", "getSelectedFindJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "addSetInFavoriteJob", "getAddSetInFavoriteJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "clearRecentJob", "getClearRecentJob()Lkotlinx/coroutines/Job;")};
    }

    public b8e(kke kke, je7 je7, je7 je72, je7 je73, je7 je74, khe khe, je7 je75) {
        this.b = kke;
        this.c = je7;
        this.o = je72;
        this.X = je73;
        this.Y = je74;
        this.Z = khe;
        this.s0 = je75;
        nz4 nz4 = nz4.a;
        q0e a = r0e.a(new l7e(nz4, nz4));
        this.t0 = a;
        this.u0 = new w7c(a);
        q0e a2 = r0e.a(new k7e(0, 0, 0, 7));
        this.w0 = a2;
        this.x0 = new w7c(a2);
        this.y0 = mqd.D();
        this.z0 = mqd.D();
        this.A0 = mqd.D();
    }

    public static void q(kl7 kl7, w3e w3e, ArrayList arrayList) {
        e02 e02 = new e02(w3e.a, w3e);
        arrayList.add(e02);
        kl7.add(e02);
        kl7.addAll(w3e.X);
    }

    public final w3e r(m3e m3e, int i) {
        long j = m3e.a;
        String str = m3e.b;
        if (str == null) {
            str = "";
        }
        return new w3e(j, new iqe(str), m3e.c, (Integer) null, s(j, m3e.h), i, false, false, 200);
    }

    public final List s(long j, List list) {
        return l6d.i0(new r1f(l6d.Z(new at(2, list), new w8c(10)), new hmb(j, this, j == -9223372036854775807L || j == -9223372036854775806L || j == -9223372036854775805L)));
    }

    public final void t(long j, m56 m56) {
        vxd S = j47.S(this.a, ((w9a) this.b).b(), vx3.b, new z7e(m56, j, this, (Continuation) null));
        this.y0.o1(this, B0[0], S);
    }
}
