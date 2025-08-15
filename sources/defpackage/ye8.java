package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.view.Surface;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: ye8  reason: default package */
public final class ye8 implements fh9 {
    public final o45 X;
    public final p7b Y;
    public final f40 Z;
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashSet c = new HashSet();
    public final Context o;
    public final gh3 s0;
    public final ef7 t0;
    public final o1b u0;
    public final m65 v0;

    public ye8(Context context, o45 o45, p7b p7b, uh9 uh9, f40 f40, gh3 gh3, ef7 ef7, ti4 ti4, tg tgVar, au8 au8, dlf dlf, hle hle, o20 o20, ep epVar, av0 av0, p82 p82, m65 m65) {
        uh9 uh92 = uh9;
        this.o = context;
        this.X = o45;
        this.Y = p7b;
        this.Z = f40;
        this.s0 = gh3;
        this.t0 = ef7;
        this.v0 = m65;
        o1b o1b = r3;
        o1b o1b2 = new o1b(context, ef7, ti4, p7b, tgVar, au8, dlf, hle, new qz7(23, (Object) new z16(23, this)), o20, (y1b) epVar.n.getValue(), av0, p82, o45);
        this.u0 = o1b;
        synchronized (uh92.o) {
            uh92.o.add(this);
        }
    }

    public final void a(long j, ub8 ub8) {
    }

    public final void b(long j, ub8 ub8) {
    }

    public final void c(long j, ub8 ub8, long j2, ub8 ub82) {
    }

    public final void d(long j, ub8 ub8) {
    }

    public final void e(long j, ub8 ub8, long j2) {
    }

    public final void f(long j, ub8 ub8) {
    }

    public final void g(long j, ub8 ub8) {
    }

    public final void h(long j, ub8 ub8) {
        HashMap hashMap = this.b;
        we8 we8 = (we8) hashMap.get(ze8.c);
        if (we8 != null) {
            if (q()) {
                bq7 bq7 = (bq7) we8;
                if (bq7.i) {
                    bq7.v();
                }
            }
            ((bq7) we8).n();
        }
        we8 we82 = (we8) hashMap.get(ze8.o);
        if (we82 != null) {
            ((bq7) we82).n();
        }
    }

    public final void i(long j, ub8 ub8) {
    }

    public final void k(long j, ub8 ub8) {
    }

    public final void l(we8 we8) {
        if (!this.c.contains(we8)) {
            m((bq7) we8);
            return;
        }
        throw new IllegalStateException("mediaPlayerController binded to lifecycleOwner -> you can't change lifecycle manually.");
    }

    public final void m(bq7 bq7) {
        ve8 ve8;
        hm9.m("ye8", "attachInternal %s", bq7.a);
        HashMap hashMap = this.b;
        ze8 ze8 = bq7.a;
        bq7 bq72 = (bq7) hashMap.get(ze8);
        if (!(bq72 == null || bq72 == bq7 || (ve8 = bq72.e) == null)) {
            ve8.W0();
        }
        hashMap.put(ze8, bq7);
    }

    public final bq7 n(ze8 ze8, x50 x50) {
        ze8 ze82 = ze8;
        x50 x502 = x50;
        HashMap hashMap = this.b;
        bq7 bq7 = (bq7) hashMap.get(ze82);
        if (bq7 != null) {
            ve8 ve8 = bq7.e;
            if (ve8 != null) {
                ve8.W0();
            }
            bq7.g = null;
        }
        HashMap hashMap2 = this.a;
        u65 u65 = (u65) hashMap2.get(ze82);
        if (u65 == null) {
            u65 = new u65(this.o, this.X, this.v0, this.t0, this.Y.a);
            hashMap2.put(ze82, u65);
        }
        bq7 bq72 = new bq7(ze8, u65, this, this.o, x502.a ? 1.0f : 0.0f, x502.b, x502.c);
        hashMap.put(ze82, bq72);
        return bq72;
    }

    public final void o(we8 we8) {
        if (!this.c.contains(we8)) {
            bq7 bq7 = (bq7) we8;
            hm9.m("ye8", "detachInternal %s", bq7.a);
            ve8 ve8 = bq7.e;
            if (ve8 != null) {
                ve8.W0();
                return;
            }
            return;
        }
        throw new IllegalStateException("mediaPlayerController binded to lifecycleOwner -> you can't change lifecycle manually.");
    }

    public final void p(we8 we8) {
        we8 we82;
        lj9 lj9;
        bq7 bq7 = (bq7) we8;
        ze8 ze8 = bq7.a;
        ze8 ze82 = ze8.c;
        if (ze8 == ze82) {
            boolean l = bq7.l();
            o1b o1b = this.u0;
            if (l) {
                lj9 lj92 = o1b.B0;
                if (lj92 != null) {
                    lj92.pause();
                }
            } else {
                fef fef = o1b.B0 == null ? null : ((bq7) ((we8) o1b.u0.get())).f;
                fef fef2 = bq7.f;
                if (!(fef == null || fef2 == null || !oag.d(fef.l().toString(), fef2.l().toString()) || (lj9 = o1b.B0) == null)) {
                    lj9.pause();
                }
            }
        } else if (ze8 == ze8.o && (we82 = (we8) this.b.get(ze82)) != null) {
            fef fef3 = bq7.f;
            bq7 bq72 = (bq7) we82;
            fef fef4 = bq72.f;
            if (fef3 != null && fef4 != null && oag.d(fef3.l().toString(), fef4.l().toString())) {
                bq72.n();
            } else if (!q() || !bq72.i) {
                bq72.n();
            } else {
                bq72.v();
            }
        }
        if (bq7.l()) {
            f40 f40 = this.Z;
            f40.getClass();
            hm9.m("f40", "pause", new Object[0]);
            uh9 uh9 = f40.c;
            if (uh9.x) {
                uh9.q();
            }
            khe khe = f40.u0;
            if (khe.a()) {
                f40.p((PowerManager.WakeLock) khe.getValue(), 0);
            }
        }
    }

    public final boolean q() {
        gh3 gh3 = this.s0;
        boolean g = gh3.g();
        zh3 b2 = gh3.b();
        p7b p7b = this.Y;
        int i = p7b.c.g.getInt("app.video.auto.play", 1);
        if (i != -1) {
            return i != 0 ? b2 == zh3.c : b2 == zh3.c || p7b.c.n() || !g;
        }
        return false;
    }

    public final void r(we8 we8) {
        if (!this.c.contains(we8)) {
            s((bq7) we8);
            return;
        }
        throw new IllegalStateException("mediaPlayerController binded to lifecycleOwner -> you can't change lifecycle manually.");
    }

    public final void s(bq7 bq7) {
        hm9.m("ye8", "releaseInternal %s", bq7.a);
        this.c.remove(bq7);
        fef fef = bq7.f;
        ze8 ze8 = bq7.a;
        if (!(fef == null || bq7.g == null)) {
            hm9.m("bq7", "Release %s", ze8);
            bq7.g = null;
            ve8 ve8 = bq7.e;
            if (ve8 != null) {
                ve8.W0();
            }
            u65 u65 = bq7.b;
            u65.E();
            u65.u();
            hm9.m("u65", "Clear", new Object[0]);
            zpd zpd = u65.a;
            zpd.Z1();
            t75 t75 = zpd.c;
            t75.s2();
            t75.m2((Surface) null);
            t75.i2(0, 0);
            u65.Y = null;
            u65.Z = null;
            u65.s0 = 0.0f;
            u65.t0 = null;
            u65.u0 = 0;
            u65.v0 = 0;
            u65.w0 = 0;
            u65.x0 = false;
            bq7.p();
        }
        HashMap hashMap = this.b;
        we8 we8 = (we8) hashMap.get(ze8);
        if (we8 == bq7) {
            hashMap.remove(((bq7) we8).a);
        }
    }
}
