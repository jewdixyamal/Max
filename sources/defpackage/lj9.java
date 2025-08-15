package defpackage;

import android.net.Uri;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.video.fetcher.FetcherException;
import ru.ok.tamtam.util.HandledException;

/* renamed from: lj9  reason: default package */
public final class lj9 extends u2 implements ol9, jk9, slf, ve8, ue8 {
    public k20 A0;
    public g8c B0;
    public iq1 C0;
    public sd7 D0;
    public sd7 E0;
    public sd7 F0;
    public long G0;
    public long H0;
    public boolean I0;
    public final hle X;
    public final ef7 Y;
    public final o20 Z;
    public final we8 c;
    public final dlf o;
    public final au8 s0;
    public final m7b t0;
    public final kj9 u0;
    public final o45 v0;
    public final ti4 w0;
    public cu8 x0;
    public l20 y0;
    public hkf z0;

    /* JADX WARNING: type inference failed for: r4v1, types: [hkf, java.lang.Object] */
    public lj9(pl9 pl9, we8 we8, dlf dlf, hle hle, ef7 ef7, o20 o20, au8 au8, m7b m7b, kj9 kj9, o45 o45, ti4 ti4, boolean z, boolean z2) {
        super(0, (Object) pl9);
        this.c = we8;
        this.o = dlf;
        this.X = hle;
        this.Y = ef7;
        this.Z = o20;
        this.s0 = au8;
        this.t0 = m7b;
        this.u0 = kj9;
        this.v0 = o45;
        this.w0 = ti4;
        ? obj = new Object();
        bq7 bq7 = (bq7) we8;
        obj.e = bq7.l();
        obj.a = z;
        obj.d = z2;
        this.z0 = new hkf(obj);
        ((v2) pl9).r(this);
        bq7.e = this;
    }

    public final boolean B0(int i, KeyEvent keyEvent) {
        boolean c2 = c2();
        we8 we8 = this.c;
        if (c2 || !((bq7) we8).l()) {
            bq7 bq7 = (bq7) we8;
            if (bq7.c()) {
                if (i != 24 && i != 25) {
                    return false;
                }
                ef7 ef7 = this.Y;
                if (ef7.get() != null) {
                    ((ad) ef7.get()).f("ENABLE_VIDEO_AUTO_PLAY_SOUND_BY_VOLUME_BUTTON");
                }
                bq7.t(1.0f);
                hkf a = this.z0.a();
                a.e = true;
                hkf hkf = new hkf(a);
                this.z0 = hkf;
                ((pl9) ((kk9) this.b)).d(hkf);
                g8c g8c = this.B0;
                if (g8c != null) {
                    ef7 ef72 = (ef7) g8c.e;
                    if (ef72.get() != null) {
                        ((ad) ef72.get()).d(1, "SWITCH_AUDIO_MODE");
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void D1(Throwable th) {
        hm9.k("lj9", "onPlaybackError");
        g8c g8c = this.B0;
        if (g8c != null) {
            g8c.d(th);
        }
        hkf a = this.z0.a();
        a.b = false;
        a.c = false;
        hkf hkf = new hkf(a);
        this.z0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
        kj9 kj9 = this.u0;
        if (kj9 != null) {
            k20 k20 = this.A0;
            if (k20 != null) {
                String str = k20.h;
                if (!oag.t(str)) {
                    kj9.k(str);
                    return;
                }
            }
            kj9.Y(th);
        }
    }

    public final void F1() {
        g8c g8c = this.B0;
        if (g8c != null) {
            String str = g8c.b == 2 ? "message" : "viewer";
            ef7 ef7 = (ef7) g8c.e;
            if (ef7.get() != null) {
                ((ad) ef7.get()).g("ACTION_PIP_OPEN", str);
            }
            e2();
        }
    }

    public final void G(Surface surface) {
        ((bq7) this.c).r(surface);
    }

    public final void H1() {
        hm9.m("lj9", "onPauseClick", new Object[0]);
        pause();
        kj9 kj9 = this.u0;
        if (kj9 != null) {
            kj9.r(true);
        }
        f2(true);
    }

    public final void I1() {
        hm9.m("lj9", "onPipClick", new Object[0]);
        kj9 kj9 = this.u0;
        if (kj9 != null) {
            kj9.n();
        }
        f2(true);
    }

    public final void J1() {
        hm9.m("lj9", "onFullScreenClick", new Object[0]);
        kj9 kj9 = this.u0;
        if (kj9 != null) {
            kj9.s();
        }
        f2(false);
    }

    public final void K() {
        hm9.m("lj9", "onTrackChanged", new Object[0]);
        n2();
        hkf a = this.z0.a();
        a.r = c2();
        a.j = ((bq7) this.c).g();
        hkf hkf = new hkf(a);
        this.z0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
        kj9 kj9 = this.u0;
        if (kj9 != null) {
            kj9.K();
        }
    }

    public final int M0() {
        if (!b2()) {
            return 0;
        }
        return ((bq7) this.c).h();
    }

    public final void P(int i, int i2, int i3) {
        ((pl9) ((kk9) this.b)).a(i, i2);
        kj9 kj9 = this.u0;
        if (kj9 != null) {
            kj9.P(i, i2, i3);
        }
    }

    public final int R() {
        if (!b2()) {
            return 0;
        }
        return ((bq7) this.c).j();
    }

    public final void S0() {
        hm9.m("lj9", "onPlayClick", new Object[0]);
        g8c g8c = this.B0;
        if (g8c != null) {
            hm9.m("g8c", "sendVideoPlayToggleStat", new Object[0]);
            g8c.e((Object) null, "play_toggle");
        }
        we8 we8 = this.c;
        ((bq7) we8).o();
        we8.getClass();
        kj9 kj9 = this.u0;
        if (kj9 != null) {
            kj9.r(true);
        }
        f2(false);
    }

    public final void T() {
        hm9.k("lj9", "onVideoViewClick");
        kj9 kj9 = this.u0;
        if (kj9 != null) {
            kj9.T();
        }
    }

    public final void V0() {
        hm9.m("lj9", "onCloseClick", new Object[0]);
        kj9 kj9 = this.u0;
        if (kj9 != null) {
            kj9.G();
        }
    }

    public final void W() {
        hm9.k("lj9", "onVideoViewLongClick");
        kj9 kj9 = this.u0;
        if (kj9 != null) {
            kj9.W();
        }
    }

    public final void W0() {
        hm9.m("lj9", "onMediaPlayerControllerDetach", new Object[0]);
        e2();
    }

    public final void X0() {
        if (this.B0 != null) {
            bq7 bq7 = (bq7) this.c;
            bq7.n();
            g8c g8c = this.B0;
            String str = g8c.b == 2 ? "message" : "pip";
            ef7 ef7 = (ef7) g8c.e;
            if (ef7.get() != null) {
                ((ad) ef7.get()).g("ACTION_FULLSCREEN_OPEN", str);
            }
            e2();
            if (b2()) {
                bq7.r((Surface) null);
            }
        }
    }

    public final void Y0(long j) {
        we8 we8 = this.c;
        ((bq7) we8).q(j);
        hkf a = this.z0.a();
        bq7 bq7 = (bq7) we8;
        a.k = bq7.f();
        a.l = bq7.d();
        a.q = null;
        a.p = null;
        hkf hkf = new hkf(a);
        this.z0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
    }

    public final void Z0() {
        this.I0 = true;
        m2();
        l2();
    }

    public final void Z1(l20 l20, long j, cu8 cu8, int i, boolean z) {
        we8 we8 = this.c;
        ((bq7) we8).j = z;
        hm9.m("lj9", "Bind attach %s", l20.r);
        this.I0 = false;
        this.H0 = System.currentTimeMillis();
        cqc.b(this.C0);
        m2();
        l2();
        cqc.b(this.F0);
        this.y0 = l20;
        this.G0 = j;
        k20 k20 = s5c.P(l20) ? l20.j.d.d : l20.d;
        this.A0 = k20;
        this.x0 = cu8;
        kk9 kk9 = (kk9) this.b;
        if (k20 == null) {
            d2(new FetcherException(11, "Video is null"));
            hkf a = this.z0.a();
            a.b = false;
            a.c = false;
            a.h = false;
            hkf hkf = new hkf(a);
            this.z0 = hkf;
            ((pl9) kk9).d(hkf);
            return;
        }
        m7b m7b = this.t0;
        boolean Q = s5c.Q(m7b, k20);
        if (Q) {
            cqc.b(this.F0);
            r0a n = qy9.l(1, TimeUnit.SECONDS).n(ce.a());
            sd7 sd7 = new sd7(new ij9(this, 3), new hj8(29), ft.d);
            n.a(sd7);
            this.F0 = sd7;
        }
        Uri a2 = this.Z.a(l20);
        hkf a3 = this.z0.a();
        a3.e = ((bq7) we8).l();
        a3.f = false;
        k20 k202 = this.A0;
        a3.g = k202.g;
        a3.h = s5c.a0(m7b, k202);
        a3.i = Q;
        k20 k203 = this.A0;
        a3.j = k203.c;
        a3.k = k203.k;
        a3.n = null;
        a3.o = k203;
        a3.p = null;
        a3.q = a2;
        c2();
        a3.s = true;
        a3.t = false;
        a3.r = true;
        hkf hkf2 = new hkf(a3);
        this.z0 = hkf2;
        ((pl9) kk9).d(hkf2);
        hkf a4 = this.z0.a();
        a4.p = null;
        a4.q = null;
        hkf hkf3 = new hkf(a4);
        this.z0 = hkf3;
        ((pl9) kk9).d(hkf3);
        we8.getClass();
        k20 k204 = this.A0;
        this.B0 = new g8c(k204.a, i, k204.i, this.Y);
        if (!Q) {
            i2();
        }
    }

    public final List a2() {
        oy5 oy5;
        bq7 bq7 = (bq7) this.c;
        if (bq7.f == null) {
            return Collections.emptyList();
        }
        kad kad = bq7.b.b;
        zpd zpd = (zpd) kad.b;
        zpd.Z1();
        t75 t75 = zpd.c;
        t75.s2();
        m85[] m85Arr = (m85[]) t75.k1.i.X;
        int length = m85Arr.length;
        mze mze = null;
        oy5 oy52 = null;
        for (int i = 0; i < length; i++) {
            if (i < length) {
                m85 m85 = m85Arr[i];
                if (m85 instanceof m85) {
                    oy5 = m85.j();
                    if (oy5 != null && ha9.g(oy5.w0) == 2) {
                        oy52 = oy5;
                    }
                }
            }
            oy5 = null;
            oy52 = oy5;
        }
        if (oy52 == null) {
            return Collections.emptyList();
        }
        Iterator it = ((List) kad.o).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            mze mze2 = (mze) it.next();
            if (kad.a(mze2.a, oy52)) {
                mze = mze2;
                break;
            }
        }
        return mze == null ? Collections.emptyList() : mze.b;
    }

    public final boolean b() {
        if (!b2()) {
            return false;
        }
        return ((bq7) this.c).k();
    }

    public final boolean b2() {
        return ((bq7) this.c).g == this;
    }

    public final long c() {
        if (!b2()) {
            return 0;
        }
        return ((bq7) this.c).g();
    }

    public final boolean c0() {
        if (!b2()) {
            return false;
        }
        bq7 bq7 = (bq7) this.c;
        if (bq7.f == null) {
            return false;
        }
        u65 u65 = bq7.b;
        zpd zpd = u65.a;
        lue O1 = zpd.O1();
        return (!O1.q() && O1.n(zpd.p0(), (jue) zpd.b, 0).t0) || u65.v() == -9223372036854775807L;
    }

    public final void c1() {
        hm9.m("lj9", "onMediaPlayerControllerOwnerChanged", new Object[0]);
        if (this.y0 != null) {
            g2();
            this.c.getClass();
            h2();
            o();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r0.l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c2() {
        /*
            r1 = this;
            k20 r0 = r1.A0
            if (r0 == 0) goto L_0x000c
            j20 r0 = r0.l
            if (r0 == 0) goto L_0x000c
            boolean r0 = r0.d
            if (r0 != 0) goto L_0x0018
        L_0x000c:
            we8 r1 = r1.c
            bq7 r1 = (defpackage.bq7) r1
            lze r1 = r1.e()
            lze r0 = defpackage.lze.u0
            if (r1 != r0) goto L_0x001a
        L_0x0018:
            r1 = 1
            goto L_0x001b
        L_0x001a:
            r1 = 0
        L_0x001b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj9.c2():boolean");
    }

    public final void d1() {
        hm9.k("lj9", "onVolumeChange");
        hkf a = this.z0.a();
        a.e = ((bq7) this.c).l();
        hkf hkf = new hkf(a);
        this.z0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
    }

    public final void d2(Throwable th) {
        k20 k20;
        g8c g8c = this.B0;
        if (g8c != null) {
            g8c.d(th);
        }
        hkf a = this.z0.a();
        a.b = false;
        a.c = false;
        hkf hkf = new hkf(a);
        this.z0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
        kj9 kj9 = this.u0;
        if (kj9 != null && (k20 = this.A0) != null) {
            String str = k20.h;
            if (this.o.a(th) || this.A0 == null || oag.t(str)) {
                kj9.Y(th);
            } else {
                kj9.k(str);
            }
        }
    }

    public final void e1() {
        hm9.k("lj9", "onSettingsClick");
        kj9 kj9 = this.u0;
        if (kj9 != null) {
            kj9.L();
        }
    }

    public final void e2() {
        if (b2()) {
            this.c.getClass();
            h2();
            g2();
        }
    }

    public final void f1() {
        if (b2()) {
            we8 we8 = this.c;
            if (((bq7) we8).k()) {
                we8.getClass();
                h2();
            }
        }
    }

    public final void f2(boolean z) {
        cu8 cu8;
        l20 l20;
        if (((bq7) this.c).c.q() && (cu8 = this.x0) != null && (l20 = this.y0) != null) {
            au8 au8 = this.s0;
            au8.getClass();
            au8.t(cu8, l20.r, new l01(z, 11));
        }
    }

    public final void g1() {
        hm9.m("lj9", "onSoundClick", new Object[0]);
        if (c2()) {
            ((cba) this.v0).c(new HandledException(new IllegalStateException("Receive onSoundClick but video is muted")), true);
            return;
        }
        bq7 bq7 = (bq7) this.c;
        if (bq7.l()) {
            bq7.t(0.0f);
        } else {
            bq7.t(1.0f);
        }
        boolean l = bq7.l();
        ef7 ef7 = this.Y;
        if (ef7.get() != null) {
            ((ad) ef7.get()).d(l ? 1 : 0, "VIDEO_AUTO_PLAY_SOUND_CLICK");
        }
    }

    public final void g2() {
        l20 l20;
        cu8 cu8;
        hm9.m("lj9", "saveVideoPosition", new Object[0]);
        if (!c0()) {
            long k = k();
            long c2 = c();
            if ((k > 0 || c2 > 0) && (l20 = this.y0) != null && (cu8 = this.x0) != null) {
                boolean c0 = c0();
                au8 au8 = this.s0;
                au8.getClass();
                au8.t(cu8, l20.r, new zt8(k, c2, c0));
            }
        }
    }

    public final void h() {
        hm9.m("lj9", "onVideoPaused", new Object[0]);
        m2();
        l2();
        cqc.b(this.F0);
        hkf a = this.z0.a();
        a.b = false;
        a.c = false;
        a.a = true;
        hkf hkf = new hkf(a);
        this.z0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
        kj9 kj9 = this.u0;
        if (kj9 != null) {
            kj9.h();
            kj9.r(true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        r5 = (defpackage.pl9) ((defpackage.kk9) r11.b);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h2() {
        /*
            r11 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            java.lang.String r3 = "lj9"
            java.lang.String r4 = "saveVideoScreenShot"
            defpackage.hm9.m(r3, r4, new java.lang.Object[0])
            l20 r3 = r11.y0
            if (r3 == 0) goto L_0x010a
            boolean r3 = r11.c0()
            if (r3 == 0) goto L_0x0016
            goto L_0x010a
        L_0x0016:
            long r3 = r11.k()
            long r5 = r11.c()
            r7 = 0
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 > 0) goto L_0x0029
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto L_0x0029
            return
        L_0x0029:
            l20 r5 = r11.y0
            o20 r6 = r11.Z
            java.util.HashMap r7 = r6.d
            java.lang.String r5 = r5.r
            boolean r8 = r7.containsKey(r5)
            if (r8 != 0) goto L_0x0038
            goto L_0x004e
        L_0x0038:
            java.lang.Object r5 = r7.get(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            long r7 = r5.longValue()
            long r7 = r7 - r3
            long r7 = java.lang.Math.abs(r7)
            r9 = 50
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 > 0) goto L_0x004e
            return
        L_0x004e:
            ti4 r5 = r11.w0
            vi4 r5 = r5.b()
            r5.getClass()
            vi4 r7 = defpackage.vi4.c
            if (r5 != r7) goto L_0x005c
            return
        L_0x005c:
            java.lang.Object r5 = r11.b
            kk9 r5 = (defpackage.kk9) r5
            pl9 r5 = (defpackage.pl9) r5
            android.graphics.drawable.BitmapDrawable r7 = r5.e()
            if (r7 != 0) goto L_0x0069
            return
        L_0x0069:
            l20 r8 = r11.y0
            android.graphics.Bitmap r9 = r7.getBitmap()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.util.HashMap r4 = r6.d
            java.lang.String r10 = r8.r
            r4.put(r10, r3)
            y00 r3 = r6.b
            r3.getClass()
            u00 r4 = new u00
            r4.<init>((java.lang.Object) r3, (java.lang.Object) r8, (java.lang.Object) r9, (int) r2)
            q1a r9 = new q1a
            r9.<init>(r1, r4)
            xw0 r4 = new xw0
            r10 = 23
            r4.<init>(r10)
            uqd r4 = r9.h(r4)
            f55 r9 = r3.e
            drd r4 = r4.m(r9)
            hle r9 = r3.a
            jle r9 = (defpackage.jle) r9
            ztc r9 = r9.b()
            drd r4 = r4.i(r9)
            w00 r9 = new w00
            r9.<init>(r3, r8, r2)
            rqd r2 = new rqd
            r2.<init>(r4, r9, r0)
            x00 r4 = new x00
            r4.<init>(r3)
            rqd r9 = new rqd
            r9.<init>(r2, r4, r1)
            hc3 r1 = r3.f
            java.util.Objects.requireNonNull(r1)
            ync r2 = new ync
            r3 = 5
            r2.<init>(r3, r1)
            y7g r1 = new y7g
            r3 = 3
            r1.<init>((java.lang.Object) r6, (int) r3, (java.lang.Object) r8)
            oz7 r3 = defpackage.ft.f
            iq1 r4 = new iq1
            r4.<init>(r1, r0, r3)
            java.lang.String r0 = "observer is null"
            java.util.Objects.requireNonNull(r4, r0)
            td r0 = new td     // Catch:{ NullPointerException -> 0x0108, all -> 0x00f9 }
            r1 = 15
            r0.<init>((java.lang.Object) r4, (int) r1, (java.lang.Object) r2)     // Catch:{ NullPointerException -> 0x0108, all -> 0x00f9 }
            r9.k(r0)     // Catch:{ NullPointerException -> 0x0108, all -> 0x00f9 }
            hc3 r0 = r6.h
            r0.a(r4)
            hkf r0 = r11.z0
            hkf r0 = r0.a()
            r0.p = r7
            hkf r1 = new hkf
            r1.<init>(r0)
            r11.z0 = r1
            r5.d(r1)
            return
        L_0x00f9:
            r11 = move-exception
            defpackage.c37.B(r11)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "subscribeActual failed"
            r0.<init>(r1)
            r0.initCause(r11)
            throw r0
        L_0x0108:
            r11 = move-exception
            throw r11
        L_0x010a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj9.h2():void");
    }

    public final void i() {
        hm9.m("lj9", "onVideoPlay", new Object[0]);
        we8 we8 = this.c;
        boolean k = ((bq7) we8).k();
        hkf a = this.z0.a();
        a.b = k;
        hkf hkf = new hkf(a);
        this.z0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
        if (k) {
            k2();
            we8.getClass();
            j2();
        }
        kj9 kj9 = this.u0;
        if (kj9 != null) {
            kj9.i();
        }
    }

    public final void i0() {
        hm9.k("lj9", "onRenderedFirstFrame");
        g8c g8c = this.B0;
        if (g8c != null) {
            long j = this.H0;
            g8c.getClass();
            long currentTimeMillis = System.currentTimeMillis() - j;
            g8c.e(Long.valueOf(currentTimeMillis), "first_frame");
            hm9.m("g8c", "sendVideoFirstFrameStat: %d", Long.valueOf(currentTimeMillis));
            g8c.e((Object) null, "play");
        }
        j1();
    }

    public final int i1() {
        if (!b2()) {
            return 0;
        }
        return ((bq7) this.c).i();
    }

    public final void i2() {
        cqc.b(this.C0);
        if (this.y0 != null && this.x0 != null) {
            hkf a = this.z0.a();
            a.c = true;
            a.b = ((bq7) this.c).j;
            hkf hkf = new hkf(a);
            this.z0 = hkf;
            ((pl9) ((kk9) this.b)).d(hkf);
            uqd c2 = this.o.c(this.y0, this.G0, this.x0.c);
            jle jle = (jle) this.X;
            drd i = c2.m(jle.a()).i(jle.b());
            iq1 iq1 = new iq1(new ij9(this, 1), 2, new ij9(this, 2));
            i.k(iq1);
            this.C0 = iq1;
        }
    }

    public final int j() {
        fef fef;
        if (b2() && (fef = ((bq7) this.c).f) != null) {
            return fef.j();
        }
        return 0;
    }

    public final void j1() {
        hm9.k("lj9", "onPlaybackPrepared");
        we8 we8 = this.c;
        boolean k = ((bq7) we8).k();
        hkf a = this.z0.a();
        a.b = k;
        a.t = true;
        a.c = false;
        hkf hkf = new hkf(a);
        this.z0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
        if (k) {
            k2();
            we8.getClass();
            j2();
        }
    }

    public final void j2() {
        l2();
        if (this.z0.a) {
            r0a n = qy9.l(2, TimeUnit.SECONDS).n(ce.a());
            sd7 sd7 = new sd7(new ij9(this, 0), new hj8(28), ft.d);
            n.a(sd7);
            this.E0 = sd7;
        }
    }

    public final long k() {
        if (!b2()) {
            return 0;
        }
        return ((bq7) this.c).f();
    }

    public final void k1(boolean z) {
        hkf hkf = this.z0;
        if (z != hkf.a) {
            hkf a = hkf.a();
            a.a = z;
            hkf hkf2 = new hkf(a);
            this.z0 = hkf2;
            ((pl9) ((kk9) this.b)).d(hkf2);
            kj9 kj9 = this.u0;
            if (kj9 != null) {
                kj9.r(z);
            }
        }
        if (!z) {
            l2();
        } else if (this.z0.b) {
            this.c.getClass();
            j2();
        }
    }

    public final void k2() {
        m2();
        if (!this.I0) {
            r0a n = qy9.l(100, TimeUnit.MILLISECONDS).n(ce.a());
            sd7 sd7 = new sd7(new ij9(this, 4), new jj9(0), ft.d);
            n.a(sd7);
            this.D0 = sd7;
        }
    }

    public final void l1(boolean z) {
        hm9.m("lj9", "Release", new Object[0]);
        g8c g8c = this.B0;
        if (g8c != null) {
            hm9.m("g8c", "sendVideoStopStat userAction: %s", Boolean.valueOf(z));
            g8c.e(z ? "user" : "scroll", "stop");
        }
        cqc.b(this.C0);
        m2();
        l2();
        cqc.b(this.F0);
        e2();
        this.y0 = null;
        this.x0 = null;
        this.B0 = null;
        this.G0 = 0;
        this.I0 = false;
        if (b2()) {
            we8 we8 = this.c;
            we8.getClass();
            bq7 bq7 = (bq7) we8;
            bq7.u();
            bq7.e = null;
            bq7.r((Surface) null);
            bq7.g = null;
        }
        pl9 pl9 = (pl9) ((kk9) this.b);
        ((Set) ((v2) pl9).a).remove(this);
        pl9.release();
    }

    public final void l2() {
        cqc.b(this.E0);
    }

    public final void m1(int i) {
        this.I0 = false;
        long j = (long) i;
        we8 we8 = this.c;
        bq7 bq7 = (bq7) we8;
        bq7.q(j);
        hkf a = this.z0.a();
        bq7 bq72 = (bq7) we8;
        a.k = bq72.f();
        a.l = bq72.d();
        a.q = null;
        a.p = null;
        hkf hkf = new hkf(a);
        this.z0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
        if (bq7.k()) {
            k2();
            we8.getClass();
            j2();
        }
    }

    public final void m2() {
        cqc.b(this.D0);
    }

    public final void n2() {
        mqb mqb;
        we8 we8 = this.c;
        bq7 bq7 = (bq7) we8;
        if ((bq7.f == null ? Collections.emptyList() : (List) bq7.b.b.o).size() > 1) {
            we8.getClass();
            bq7 bq72 = (bq7) we8;
            mze b = bq72.f == null ? mze.c : bq72.b.b.b();
            if (b != mze.c) {
                lze lze = b.a;
                mqb = j1e.H(lze.o, lze.X);
                hkf a = this.z0.a();
                a.f = false;
                a.m = mqb;
                hkf hkf = new hkf(a);
                this.z0 = hkf;
                ((pl9) ((kk9) this.b)).d(hkf);
            }
        }
        mqb = null;
        hkf a2 = this.z0.a();
        a2.f = false;
        a2.m = mqb;
        hkf hkf2 = new hkf(a2);
        this.z0 = hkf2;
        ((pl9) ((kk9) this.b)).d(hkf2);
    }

    public final void o() {
        hm9.k("lj9", "onPlaybackEnded");
        m2();
        l2();
        hkf a = this.z0.a();
        a.b = false;
        a.c = false;
        a.a = true;
        hkf hkf = new hkf(a);
        this.z0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
        kj9 kj9 = this.u0;
        if (kj9 != null) {
            kj9.X();
        }
    }

    public final void pause() {
        hm9.k("lj9", "Pause");
        if (b2()) {
            g8c g8c = this.B0;
            we8 we8 = this.c;
            if (g8c != null) {
                long f = ((bq7) we8).f();
                g8c.getClass();
                long j = 0;
                if (f > 0) {
                    j = f / 1000;
                }
                hm9.m("g8c", "sendVideoPauseStat: %d", Long.valueOf(j));
                g8c.e(Long.valueOf(j), "pause");
            }
            ((bq7) we8).n();
            we8.getClass();
        }
    }

    public final View u1() {
        View view = (View) ((v2) ((pl9) ((kk9) this.b))).c;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Mvc view root is null");
    }

    public final void y0() {
        hm9.k("lj9", "onPlaybackBuffering");
        hkf a = this.z0.a();
        a.c = true;
        hkf hkf = new hkf(a);
        this.z0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
    }
}
