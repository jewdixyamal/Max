package defpackage;

import kotlin.coroutines.Continuation;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: cc2  reason: default package */
public final class cc2 extends ol implements lme {
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final String s0;
    public final int t0;
    public final long u0;
    public final int v0;
    public final long w0;
    public final boolean x0;
    public final boolean y0;
    public final mg4 z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cc2(long j, long j2, long j3, long j4, long j5, String str, int i, int i2, long j6, mg4 mg4, int i3) {
        super(j);
        int i4 = i3;
        String str2 = (i4 & 32) != 0 ? null : str;
        int i5 = (i4 & 64) != 0 ? 0 : i;
        int i6 = (i4 & 256) != 0 ? 0 : i2;
        long j7 = (i4 & 512) != 0 ? 0 : j6;
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
        this.s0 = str2;
        this.t0 = i5;
        this.u0 = 0;
        this.v0 = i6;
        this.w0 = j7;
        this.x0 = false;
        this.y0 = true;
        this.z0 = mg4;
    }

    public final void e(gle gle) {
        une j;
        dc2 dc2 = (dc2) gle;
        try {
            Object unused = j47.f0(hz4.a, new bc2(this, dc2, (Continuation) null));
        } catch (TamErrorException unused2) {
            String name = cc2.class.getName();
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.s0, name, "fail to get missed contacts for chat history", (Throwable) null);
            }
        }
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((jc2) plVar.T.getValue()).a(this.a, this.o, this.Y, this.t0, this.u0, this.v0, this.w0, dc2, this.z0);
        long j2 = this.Z;
        if (j2 != 0 && (j = t().j(j2)) != null) {
            pl plVar2 = this.c;
            if (plVar2 == null) {
                plVar2 = null;
            }
            ((s8g) plVar2.g.getValue()).a((q9d) j.f);
        }
    }

    public final void g(pke pke) {
        uj3 l;
        if ("not.found".equals(pke.b)) {
            e52 C = m().C(this.o);
            if (!(C == null || !C.M() || (l = C.l()) == null)) {
                n().o(l.n());
            }
        } else {
            l().c(new oi0(this.a, pke));
        }
        long j = this.Z;
        if (j == 0) {
            return;
        }
        if (pke instanceof gke) {
            t().n(j, goe.WAITING);
        } else {
            t().d(j);
        }
    }

    public final dle i() {
        return new au(this.X, this.Y, this.t0, this.u0, this.v0, this.w0, this.x0, this.y0, this.s0, this.z0);
    }
}
