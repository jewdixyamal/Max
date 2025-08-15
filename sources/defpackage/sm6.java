package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/* renamed from: sm6  reason: default package */
public final class sm6 extends ej0 implements in6 {
    public final am6 h;
    public final w4d i;
    public final oq9 j;
    public final tr4 k;
    public final huc l;
    public final boolean m;
    public final int n;
    public final boolean o = false;
    public final hb4 p;
    public final long q;
    public final long r = 0;
    public hb8 s;
    public z0f t;
    public tb8 u;

    static {
        nc8.a("media3.exoplayer.hls");
    }

    public sm6(tb8 tb8, w4d w4d, am6 am6, oq9 oq9, tr4 tr4, huc huc, hb4 hb4, long j2, boolean z, int i2) {
        this.u = tb8;
        this.s = tb8.c;
        this.i = w4d;
        this.h = am6;
        this.j = oq9;
        this.k = tr4;
        this.l = huc;
        this.p = hb4;
        this.q = j2;
        this.m = z;
        this.n = i2;
    }

    public static hm6 u(long j2, List list) {
        hm6 hm6 = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            hm6 hm62 = (hm6) list.get(i2);
            long j3 = hm62.X;
            if (j3 <= j2 && hm62.w0) {
                hm6 = hm62;
            } else if (j3 > j2) {
                break;
            }
        }
        return hm6;
    }

    public final boolean a(tb8 tb8) {
        tb8 i2 = i();
        ib8 ib8 = i2.b;
        ib8.getClass();
        ib8 ib82 = tb8.b;
        return ib82 != null && ib82.a.equals(ib8.a) && ib82.e.equals(ib8.e) && oaf.a(ib82.c, ib8.c) && i2.c.equals(tb8.c);
    }

    public final zd8 c(yj8 yj8, n64 n64, long j2) {
        jn b = b(yj8);
        lr4 lr4 = new lr4(this.d.c, 0, yj8);
        z0f z0f = this.t;
        j4b j4b = this.g;
        fm9.l(j4b);
        return new fm6(this.h, this.p, this.i, z0f, this.k, lr4, this.l, b, n64, this.j, this.m, this.n, this.o, j4b, this.r);
    }

    public final synchronized tb8 i() {
        return this.u;
    }

    public final void k() {
        hb4 hb4 = this.p;
        vq7 vq7 = (vq7) hb4.w0;
        if (vq7 != null) {
            vq7.c();
        }
        Uri uri = hb4.X;
        if (uri != null) {
            gb4 gb4 = (gb4) hb4.b.get(uri);
            gb4.b.c();
            IOException iOException = gb4.u0;
            if (iOException != null) {
                throw iOException;
            }
        }
    }

    public final void m(z0f z0f) {
        this.t = z0f;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j4b j4b = this.g;
        fm9.l(j4b);
        tr4 tr4 = this.k;
        tr4.c(myLooper, j4b);
        tr4.prepare();
        jn b = b((yj8) null);
        ib8 ib8 = i().b;
        ib8.getClass();
        hb4 hb4 = this.p;
        hb4.getClass();
        hb4.o = oaf.o((Handler.Callback) null);
        hb4.v0 = b;
        hb4.x0 = this;
        bqa bqa = new bqa(((q24) ((w4d) hb4.s0).b).a(), ib8.a, 4, ((en6) hb4.t0).f());
        fm9.k(((vq7) hb4.w0) == null);
        vq7 vq7 = new vq7("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        hb4.w0 = vq7;
        int i2 = bqa.c;
        b.F(new yn7(bqa.a, bqa.b, vq7.v(bqa, hb4, ((huc) hb4.u0).p(i2))), i2, -1, (qy5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
    }

    public final void o(zd8 zd8) {
        fm6 fm6 = (fm6) zd8;
        fm6.b.c.remove(fm6);
        for (tn6 tn6 : fm6.G0) {
            if (tn6.O0) {
                for (rn6 rn6 : tn6.G0) {
                    rn6.h();
                    fr4 fr4 = rn6.h;
                    if (fr4 != null) {
                        fr4.f(rn6.e);
                        rn6.h = null;
                        rn6.g = null;
                    }
                }
            }
            xl6 xl6 = tn6.o;
            gb4 gb4 = (gb4) xl6.g.b.get(xl6.e[xl6.r.i()]);
            if (gb4 != null) {
                gb4.v0 = false;
            }
            xl6.o = null;
            tn6.u0.s(tn6);
            tn6.C0.removeCallbacksAndMessages((Object) null);
            tn6.S0 = true;
            tn6.D0.clear();
        }
        fm6.D0 = null;
    }

    public final void q() {
        hb4 hb4 = this.p;
        hb4.X = null;
        hb4.z0 = null;
        hb4.y0 = null;
        hb4.Z = -9223372036854775807L;
        ((vq7) hb4.w0).s((io7) null);
        hb4.w0 = null;
        HashMap hashMap = hb4.b;
        for (gb4 gb4 : hashMap.values()) {
            gb4.b.s((io7) null);
        }
        hb4.o.removeCallbacksAndMessages((Object) null);
        hb4.o = null;
        hashMap.clear();
        this.k.release();
    }

    public final synchronized void t(tb8 tb8) {
        this.u = tb8;
    }

    /* JADX WARNING: type inference failed for: r25v0, types: [qq9, java.lang.Object] */
    public final void v(qm6 qm6) {
        ird ird;
        long j2;
        long j3;
        int i2;
        long j4;
        qm6 qm62 = qm6;
        boolean z = qm62.p;
        long j5 = qm62.h;
        long h0 = z ? oaf.h0(j5) : -9223372036854775807L;
        int i3 = qm62.d;
        long j6 = (i3 == 2 || i3 == 1) ? h0 : -9223372036854775807L;
        hb4 hb4 = this.p;
        ((ym6) hb4.y0).getClass();
        ? obj = new Object();
        boolean z2 = hb4.Y;
        int i4 = i3;
        long j7 = qm62.u;
        zw6 zw6 = qm62.r;
        boolean z3 = qm62.g;
        long j8 = qm62.e;
        if (z2) {
            long j9 = h0;
            long j10 = j5 - hb4.Z;
            boolean z4 = qm62.o;
            long j11 = z4 ? j10 + j7 : -9223372036854775807L;
            long S = qm62.p ? oaf.S(oaf.B(this.q)) - (j5 + j7) : 0;
            long j12 = this.s.a;
            int i5 = (j12 > -9223372036854775807L ? 1 : (j12 == -9223372036854775807L ? 0 : -1));
            om6 om6 = qm62.v;
            if (i5 != 0) {
                j2 = oaf.S(j12);
            } else {
                if (j8 != -9223372036854775807L) {
                    j4 = j7 - j8;
                } else {
                    long j13 = om6.d;
                    if (j13 != -9223372036854775807L) {
                        long j14 = j13;
                        if (qm62.n != -9223372036854775807L) {
                            j4 = j14;
                        }
                    }
                    j4 = om6.c;
                    if (j4 == -9223372036854775807L) {
                        j4 = qm62.m * 3;
                    }
                }
                j2 = j4 + S;
            }
            long j15 = j7 + S;
            long k2 = oaf.k(j2, S, j15);
            hb8 hb8 = i().c;
            boolean z5 = false;
            boolean z6 = hb8.d == -3.4028235E38f && hb8.e == -3.4028235E38f && om6.c == -9223372036854775807L && om6.d == -9223372036854775807L;
            fb8 fb8 = new fb8();
            fb8.a = oaf.h0(k2);
            float f = 1.0f;
            fb8.d = z6 ? 1.0f : this.s.d;
            if (!z6) {
                f = this.s.e;
            }
            fb8.e = f;
            hb8 hb82 = new hb8(fb8);
            this.s = hb82;
            if (j8 == -9223372036854775807L) {
                j8 = j15 - oaf.S(hb82.a);
            }
            if (z3) {
                j3 = j8;
            } else {
                hm6 u2 = u(j8, qm62.s);
                if (u2 != null) {
                    j3 = u2.X;
                } else if (zw6.isEmpty()) {
                    i2 = i4;
                    j3 = 0;
                    if (i2 == 2 && qm62.f) {
                        z5 = true;
                    }
                    ird = new ird(j6, j9, j11, qm62.u, j10, j3, true, !z4, z5, obj, i(), this.s);
                } else {
                    lm6 lm6 = (lm6) zw6.get(oaf.d(Long.valueOf(j8), zw6, true));
                    hm6 u3 = u(j8, lm6.x0);
                    j3 = u3 != null ? u3.X : lm6.X;
                }
            }
            i2 = i4;
            z5 = true;
            ird = new ird(j6, j9, j11, qm62.u, j10, j3, true, !z4, z5, obj, i(), this.s);
        } else {
            long j16 = h0;
            long j17 = (j8 == -9223372036854775807L || zw6.isEmpty()) ? 0 : (z3 || j8 == j7) ? j8 : ((lm6) zw6.get(oaf.d(Long.valueOf(j8), zw6, true))).X;
            tb8 i6 = i();
            long j18 = qm62.u;
            ird = new ird(j6, j16, j18, j18, 0, j17, true, false, true, obj, i6, (hb8) null);
        }
        n(ird);
    }
}
