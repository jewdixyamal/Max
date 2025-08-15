package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: nif  reason: default package */
public final class nif implements ckf {
    public dkf X;
    public final kld Y;
    public final v7c Z;
    public final String a = nif.class.getName();
    public vxd b;
    public final ContextScope c;
    public final je7 o;

    public nif(je7 je7, je7 je72) {
        this.c = j1e.a(((w9a) ((kke) je72.getValue())).c().plus(f46.a()));
        this.o = je7;
        kld b2 = lld.b(1, 0, 2, 2);
        this.Y = b2;
        this.Z = new v7c(b2);
    }

    public final void a(long j, wgf wgf, gef gef) {
        je7 je7 = this.o;
        dkf dkf = ((f4b) je7.getValue()).get();
        this.X = dkf;
        kld kld = this.Y;
        if (dkf != null) {
            long j2 = j;
            kld.g(new ijf(j2, wgf.b, wgf, gef, dkf, (f4b) je7.getValue()));
            dkf dkf2 = this.X;
            if (dkf2 != null) {
                dkf2.g(1.0f);
                dkf2.L0(false);
                dkf2.Y = this;
                dkf2.I0(gef);
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public final void h() {
        if (this.X != null) {
            ijf ijf = (ijf) x53.i0(this.Z.a.b());
            if (ijf != null) {
                kld kld = this.Y;
                ijf.X = 4;
                kld.g(ijf);
            }
            vxd vxd = this.b;
            if (vxd != null) {
                vxd.cancel((CancellationException) null);
            }
            this.b = null;
        }
    }

    public final void i() {
        if (this.X != null) {
            ijf ijf = (ijf) x53.i0(this.Z.a.b());
            if (ijf != null) {
                kld kld = this.Y;
                ijf.X = 2;
                kld.g(ijf);
            }
            dkf dkf = this.X;
            if (dkf != null) {
                this.b = j47.T(this.c, (lx3) null, (vx3) null, new iif(dkf, this, (Continuation) null), 3);
            }
        }
    }

    public final void o() {
        if (this.X != null) {
            ijf ijf = (ijf) x53.i0(this.Z.a.b());
            if (ijf != null) {
                kld kld = this.Y;
                ijf.X = 5;
                kld.g(ijf);
            }
            vxd vxd = this.b;
            if (vxd != null) {
                vxd.cancel((CancellationException) null);
            }
            this.b = null;
            dkf dkf = this.X;
            if (dkf != null) {
                hm9.m(dkf.c, "Player. Clear", new Object[0]);
                u75 u75 = dkf.o;
                u75.w2();
                u75.p2((Object) null);
                u75.k2(0, 0);
                dkf.Y = null;
                dkf.Z = null;
            }
            dkf dkf2 = this.X;
            if (dkf2 != null) {
                ((f4b) this.o.getValue()).a(dkf2);
            }
            this.X = null;
        }
    }

    public final void u(float f) {
        dkf dkf = this.X;
        if (dkf != null) {
            dkf.g(f);
        }
    }

    public final void x() {
        if (this.X != null) {
            ijf ijf = (ijf) x53.i0(this.Z.a.b());
            if (ijf != null) {
                kld kld = this.Y;
                ijf.X = 5;
                kld.g(ijf);
            }
            vxd vxd = this.b;
            if (vxd != null) {
                vxd.cancel((CancellationException) null);
            }
            this.b = null;
            dkf dkf = this.X;
            if (dkf != null) {
                hm9.m(dkf.c, "Player. Clear", new Object[0]);
                u75 u75 = dkf.o;
                u75.w2();
                u75.p2((Object) null);
                u75.k2(0, 0);
                dkf.Y = null;
                dkf.Z = null;
            }
            dkf dkf2 = this.X;
            if (dkf2 != null) {
                ((f4b) this.o.getValue()).a(dkf2);
            }
            this.X = null;
        }
    }
}
