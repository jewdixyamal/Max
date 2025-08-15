package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yce  reason: default package */
public final class yce extends pnf {
    public static final /* synthetic */ bc7[] S0;
    public final je7 A0;
    public gde B0 = gde.g;
    public final q0e C0;
    public final w7c D0;
    public final kld E0;
    public final kld F0;
    public final q0e G0;
    public final q0e H0;
    public final q0e I0;
    public final w7c J0;
    public final q0e K0;
    public final q0e L0;
    public final w4d M0;
    public final w4d N0;
    public moa O0;
    public j92 P0;
    public cjg Q0;
    public a66 R0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final j0e b;
    public final k56 c;
    public final ph4 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final je7 x0;
    public final je7 y0;
    public final je7 z0;

    static {
        Class<yce> cls = yce.class;
        S0 = new bc7[]{new oi9(cls, "loadingJob", "getLoadingJob()Lkotlinx/coroutines/Job;"), rh4.g(nec.a, cls, "processTextJob", "getProcessTextJob()Lkotlinx/coroutines/Job;")};
    }

    public yce(w7c w7c, k56 k56, ph4 ph4) {
        je7 je7 = iyc.q;
        je7 je72 = iyc.z;
        je7 je73 = iyc.g;
        je7 je74 = iyc.o;
        je7 je75 = iyc.j;
        je7 je76 = iyc.i;
        je7 je77 = iyc.x;
        je7 je78 = iyc.l;
        je7 je79 = iyc.k;
        je7 je710 = iyc.f;
        je7 je711 = iyc.s;
        je7 je712 = iyc.u;
        je7 je713 = iyc.n;
        je7 je714 = iyc.h;
        this.b = w7c;
        this.c = k56;
        this.o = ph4;
        this.X = je714;
        this.Y = je78;
        this.Z = je73;
        this.s0 = je74;
        this.t0 = je76;
        this.u0 = je75;
        this.v0 = je77;
        this.w0 = je79;
        this.x0 = je710;
        this.y0 = je711;
        this.z0 = je712;
        this.A0 = je713;
        q0e a = r0e.a((Object) null);
        this.C0 = a;
        this.D0 = new w7c(a);
        kld b2 = lld.b(0, 0, 0, 7);
        this.E0 = b2;
        this.F0 = b2;
        q0e a2 = r0e.a((Object) null);
        this.G0 = a2;
        this.H0 = r0e.a(0);
        q0e a3 = r0e.a((Object) null);
        this.I0 = a3;
        this.J0 = new w7c(a3);
        q0e a4 = r0e.a((Object) null);
        this.K0 = a4;
        this.L0 = a4;
        this.M0 = mqd.D();
        this.N0 = mqd.D();
        od2.L(new zn5(a2, new uce(this, (Continuation) null), 5), this.a);
    }

    public final void q(int i, String str) {
        moa moa;
        cjg cjg;
        q0e q0e;
        Object value;
        j92 j92 = this.P0;
        if (j92 != null && (moa = this.O0) != null && (cjg = this.Q0) != null) {
            if (str == null || w9e.C0(str)) {
                this.B0 = gde.g;
                do {
                    q0e = this.C0;
                    value = q0e.getValue();
                    kce kce = (kce) value;
                } while (!q0e.c(value, (Object) null));
                return;
            }
            vxd T = j47.T(this.a, ((w9a) ((kke) this.Y.getValue())).b(), (vx3) null, new wce(this, str, i, j92, moa, cjg, (Continuation) null), 2);
            this.M0.o1(this, S0[0], T);
        }
    }

    public final void r(CharSequence charSequence) {
        if (charSequence != null && !w9e.C0(charSequence)) {
            vxd T = j47.T(this.a, (lx3) null, (vx3) null, new xce(this, charSequence, (Continuation) null), 3);
            this.N0.o1(this, S0[1], T);
        }
    }
}
