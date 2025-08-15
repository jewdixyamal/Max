package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: jib  reason: default package */
public final class jib extends pnf {
    public static final /* synthetic */ bc7[] D0;
    public final w7c A0;
    public final s35 B0;
    public final s35 C0;
    public final je7 X;
    public final kld Y;
    public final je7 Z;
    public final long b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final ehb u0;
    public final w4d v0 = mqd.D();
    public final AtomicLong w0 = new AtomicLong();
    public final AtomicLong x0 = new AtomicLong(-9223372036854775807L);
    public final AtomicBoolean y0 = new AtomicBoolean(false);
    public final q0e z0;

    static {
        oi9 oi9 = new oi9(jib.class, "getChatLinkJob", "getGetChatLinkJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        D0 = new bc7[]{oi9};
    }

    public jib(long j, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77) {
        long j2 = j;
        this.b = j2;
        this.c = je72;
        this.o = je73;
        this.X = je74;
        kld b2 = lld.b(0, 0, 0, 7);
        this.Y = b2;
        this.Z = je7;
        this.s0 = je76;
        this.t0 = je77;
        ehb ehb = (ehb) xcb.a.getAccessor().c(ehb.class);
        this.u0 = ehb;
        m32 N = od2.N(new t03(b2, 11), new fib(((rh0) je75.getValue()).b, this, 1));
        q0e a = r0e.a(nz4.a);
        this.z0 = a;
        this.A0 = new w7c(a);
        this.B0 = new s35(0);
        this.C0 = new s35(0);
        od2.L(od2.F(new fib(new zn5(new mqc(new iib(new t03(((jz2) ((iy2) je72.getValue())).m(j2), 11), (Continuation) null, this)), new zhb(this, (Continuation) null), 5), this, 0), ((w9a) ((kke) je73.getValue())).a()), this.a);
        od2.L(od2.F(new zn5(N, new shb(2, this, jib.class, "handleApiError", "handleApiError(Lone/me/profile/screens/invite/CreateLinkErrors;)V", 4, 1), 5), ((w9a) ((kke) je73.getValue())).a()), this.a);
        od2.L(new zn5(new v7c(ehb.b), new aib(this, (Continuation) null), 5), this.a);
    }

    public final void p() {
        ehb ehb = this.u0;
        ehb.a.f(ehb);
        bc7[] bc7Arr = D0;
        bc7 bc7 = bc7Arr[0];
        w4d w4d = this.v0;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        w4d.o1(this, bc7Arr[0], (Object) null);
    }

    public final void q(e52 e52) {
        boolean z;
        boolean z2;
        jqe jqe;
        e52 e522 = e52;
        kl7 l = j1e.l();
        l.add(new mib(e522.b.r0 == 2 ? yea.g1 : e52.J() ? yea.T0 : yea.Q0, (kqe) null, 6));
        String str = e522.b.I;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        String g = e522.g(kk0.c, jk0.a);
        long j = e522.b.a;
        e52.l0();
        l.add(new rib(new nc2(g, j, e522.x0, e52.q(), str2, !this.y0.get() && str2.length() == 0, e52.Z(), oag.s(e522.e(((hyc) ((q33) this.t0.getValue())).t()), 128))));
        l.add(new mib(yea.U0, i4f.p, 2));
        int i = e52.I() ? yea.R0 : yea.h1;
        int i2 = wea.O;
        vfd vfd = new vfd((long) i2, 0, new eqe(i), (jfd) null, (jqe) null, Integer.valueOf(woc.Z1), (hfd) null, (zed) null, (jqe) null, 0, (wed) null, 2008);
        String s = s();
        if (s == null || s.length() == 0) {
            z2 = true;
            z = true;
        } else {
            z2 = true;
            z = false;
        }
        l.add(new yib(i2, vfd, !z, 536879104));
        int i3 = wea.P;
        vfd vfd2 = new vfd((long) i3, 0, new eqe(yea.a), (jfd) null, (jqe) null, Integer.valueOf(gpc.h0), (hfd) null, (zed) null, (jqe) null, 0, (wed) null, 2008);
        String s2 = s();
        l.add(new yib(i3, vfd2, !((s2 == null || s2.length() == 0) ? z2 : false), -2147475456));
        if (e52.J() && e52.d0()) {
            se5 se5 = (se5) ((qe5) this.s0.getValue());
            se5.getClass();
            if (se5.n(PmsKey.f35editchattypescreenenabled, false)) {
                int i4 = e522.b.r0;
                int i5 = i4 == 0 ? -1 : bib.$EnumSwitchMapping$0[au1.s(i4)];
                if (i5 == -1) {
                    jqe = jqe.a;
                } else if (i5 == z2) {
                    jqe = new eqe(yea.n);
                } else if (i5 == 2) {
                    jqe = new eqe(yea.m);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                int i6 = wea.M;
                l.add(new yib(i6, new vfd((long) i6, 0, new eqe(yea.b1), (jfd) null, (jqe) null, Integer.valueOf(woc.f2), new dfd(jqe, (Integer) null), (zed) null, (jqe) null, 0, (wed) null, 1944), z2, 8192));
            }
        }
        this.z0.setValue(j1e.d(l));
    }

    public final e52 r() {
        return (e52) ((jz2) ((iy2) this.c.getValue())).m(this.b).a.getValue();
    }

    public final String s() {
        k92 k92;
        String str;
        e52 r = r();
        if (r == null || (k92 = r.b) == null || (str = k92.I) == null || str.length() == 0) {
            return null;
        }
        return str;
    }
}
