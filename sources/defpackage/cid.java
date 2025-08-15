package defpackage;

import java.util.ArrayList;
import kotlin.coroutines.Continuation;

/* renamed from: cid  reason: default package */
public final class cid extends pnf {
    public static final /* synthetic */ bc7[] O0;
    public final w7c A0;
    public final w4d B0 = mqd.D();
    public final w4d C0 = mqd.D();
    public final w4d D0 = mqd.D();
    public final w4d E0 = mqd.D();
    public final w4d F0 = mqd.D();
    public Long G0;
    public Long H0;
    public w9d I0;
    public final ArrayList J0 = new ArrayList();
    public long K0;
    public final kld L0;
    public final v7c M0;
    public final s35 N0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final rdd b;
    public final l7b c;
    public final kke o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final q0e z0;

    static {
        Class<cid> cls = cid.class;
        O0 = new bc7[]{new oi9(cls, "updateHowSeeOnlineJob", "getUpdateHowSeeOnlineJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "updateWhoCanCallJob", "getUpdateWhoCanCallJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "updateWhoCanAddToChatJob", "getUpdateWhoCanAddToChatJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "searchByPhoneJob", "getSearchByPhoneJob()Lkotlinx/coroutines/Job;"), new oi9(cls, "updateUnsafeFilesJob", "getUpdateUnsafeFilesJob()Lkotlinx/coroutines/Job;")};
    }

    public cid(rdd rdd, l7b l7b, kke kke, je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, ie3 ie3) {
        ehd ehd = ehd.a;
        khe d = ehd.getAccessor().d(q6f.class);
        khe d2 = ehd.getAccessor().d(i6f.class);
        khe d3 = ehd.getAccessor().d(t6f.class);
        khe d4 = ehd.getAccessor().d(mtf.class);
        this.b = rdd;
        this.c = l7b;
        this.o = kke;
        this.X = je7;
        this.Y = je75;
        this.Z = je76;
        this.s0 = je72;
        this.t0 = je73;
        this.u0 = je74;
        this.v0 = d;
        this.w0 = d2;
        this.x0 = d3;
        this.y0 = d4;
        q0e a = r0e.a(nz4.a);
        this.z0 = a;
        this.A0 = new w7c(a);
        kld b2 = lld.b(1, Integer.MAX_VALUE, 0, 4);
        this.L0 = b2;
        this.M0 = new v7c(b2);
        this.N0 = new s35(0);
        if (this.G0 == null) {
            k4a k4a = (k4a) r();
            this.G0 = Long.valueOf(k4a.v(k4a, new lad(((p7b) k4a.y()).a.o(), 1)));
        }
        pnf.n(this, (lx3) null, (vx3) null, new phd(this, (Continuation) null), 3);
        od2.L(new zn5(new v7c(rdd.b), new qhd(this, (Continuation) null), 5), this.a);
        od2.L(od2.F(new zn5(new v7c(ie3.a), new rhd(this, (Continuation) null), 5), ((w9a) kke).a()), this.a);
    }

    public static final Object q(cid cid, Continuation continuation) {
        Object t02 = j47.t0(((w9a) cid.o).a(), new xhd(cid, (Continuation) null), continuation);
        return t02 == tx3.a ? t02 : e5f.a;
    }

    public static eqe u(String str) {
        int i = shd.$EnumSwitchMapping$0[au1.s(h4f.d(str))];
        return i != 1 ? i != 2 ? new eqe(jpc.b) : new eqe(jpc.G1) : new eqe(jpc.Q);
    }

    public final void p() {
        rdd rdd = this.b;
        ((av0) rdd.a.getValue()).f(rdd);
    }

    public final pk r() {
        return (pk) this.Y.getValue();
    }

    public final kxc s() {
        return (kxc) this.X.getValue();
    }

    public final q33 t() {
        return (q33) this.t0.getValue();
    }

    public final y7d v() {
        return (y7d) this.s0.getValue();
    }

    public final void w(wm9 wm9) {
        this.L0.g(wm9);
    }

    public final void x() {
        w(ydd.b);
    }
}
