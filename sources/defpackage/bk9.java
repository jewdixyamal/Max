package defpackage;

import android.content.Context;
import android.view.Surface;
import android.view.View;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import ru.ok.messages.media.mediabar.FrgLocalVideo;

/* renamed from: bk9  reason: default package */
public final class bk9 extends u2 implements ol9, jk9, slf, ve8, ue8 {
    public final p4d X;
    public final hle Y;
    public final FrgLocalVideo Z;
    public final we8 c;
    public final Context o;
    public final dlf s0;
    public hkf t0;
    public iq1 u0;
    public sd7 v0;
    public sd7 w0;
    public final y38 x0;

    /* JADX WARNING: type inference failed for: r4v1, types: [hkf, java.lang.Object] */
    public bk9(pl9 pl9, we8 we8, Context context, p4d p4d, hle hle, FrgLocalVideo frgLocalVideo, dlf dlf, y38 y38) {
        super(0, (Object) pl9);
        this.c = we8;
        this.o = context;
        this.X = p4d;
        this.Y = hle;
        this.Z = frgLocalVideo;
        this.s0 = dlf;
        this.x0 = y38;
        ? obj = new Object();
        obj.a = true;
        this.t0 = new hkf(obj);
        ((v2) pl9).r(this);
        ((bq7) we8).e = this;
    }

    public final void D1(Throwable th) {
        hm9.k("bk9", "onPlaybackError");
        hkf a = this.t0.a();
        a.b = false;
        a.c = false;
        hkf hkf = new hkf(a);
        this.t0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo != null) {
            frgLocalVideo.Y(th);
        }
    }

    public final void G(Surface surface) {
        ((bq7) this.c).r(surface);
    }

    public final void H1() {
        b56 r1;
        ((bq7) this.c).n();
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo != null && (r1 = frgLocalVideo.r1()) != null) {
            r1.c(true, true, false);
        }
    }

    public final void K() {
        hm9.k("bk9", "onTrackChanged");
    }

    public final int M0() {
        return ((bq7) this.c).h();
    }

    public final void P(int i, int i2, int i3) {
        ((pl9) ((kk9) this.b)).a(i, i2);
    }

    public final int R() {
        return ((bq7) this.c).j();
    }

    public final void S0() {
        b56 r1;
        hm9.m("bk9", "onPlayClick", new Object[0]);
        ((bq7) this.c).o();
        FrgLocalVideo frgLocalVideo = this.Z;
        if (!(frgLocalVideo == null || (r1 = frgLocalVideo.r1()) == null)) {
            r1.c(true, true, false);
        }
        if (b()) {
            a2();
            Z1();
        }
    }

    public final void T() {
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo != null) {
            frgLocalVideo.T();
        }
    }

    public final void W() {
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo != null) {
            frgLocalVideo.getClass();
        }
    }

    public final void W0() {
        hm9.k("bk9", "onMediaPlayerControllerDetach");
    }

    public final void Y0(long j) {
        ((bq7) this.c).q(j);
    }

    public final void Z0() {
        c2();
        b2();
    }

    public final void Z1() {
        b2();
        if (this.t0.a) {
            r0a n = qy9.l(2, TimeUnit.SECONDS).n(ce.a());
            sd7 sd7 = new sd7(new ak9(this, 2), new jj9(4), ft.d);
            n.a(sd7);
            this.w0 = sd7;
        }
    }

    public final void a2() {
        c2();
        r0a n = qy9.l(100, TimeUnit.MILLISECONDS).n(ce.a());
        sd7 sd7 = new sd7(new ak9(this, 3), new jj9(5), ft.d);
        n.a(sd7);
        this.v0 = sd7;
    }

    public final boolean b() {
        return ((bq7) this.c).k();
    }

    public final void b2() {
        cqc.b(this.w0);
    }

    public final long c() {
        return ((bq7) this.c).g();
    }

    public final boolean c0() {
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
    }

    public final void c2() {
        cqc.b(this.v0);
    }

    public final void f1() {
    }

    public final void h() {
        b56 r1;
        c2();
        b2();
        hkf a = this.t0.a();
        a.b = false;
        a.c = false;
        a.a = true;
        hkf hkf = new hkf(a);
        this.t0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo != null && (r1 = frgLocalVideo.r1()) != null) {
            r1.c(true, true, false);
        }
    }

    public final void i() {
        hkf a = this.t0.a();
        a.b = ((bq7) this.c).k();
        hkf hkf = new hkf(a);
        this.t0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
    }

    public final void i0() {
        hm9.k("bk9", "onRenderedFirstFrame");
        j1();
    }

    public final int i1() {
        return ((bq7) this.c).i();
    }

    public final int j() {
        fef fef = ((bq7) this.c).f;
        if (fef == null) {
            return 0;
        }
        return fef.j();
    }

    public final void j1() {
        hm9.k("bk9", "onPlaybackPrepared");
        boolean k = ((bq7) this.c).k();
        hkf a = this.t0.a();
        a.b = k;
        a.c = false;
        hkf hkf = new hkf(a);
        this.t0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
        if (k) {
            a2();
            Z1();
        }
    }

    public final long k() {
        return ((bq7) this.c).f();
    }

    public final void k1(boolean z) {
        hkf a = this.t0.a();
        a.a = z;
        hkf hkf = new hkf(a);
        this.t0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
        if (!z) {
            b2();
        } else if (this.t0.b) {
            Z1();
        }
    }

    public final void l1(boolean z) {
        hm9.m("bk9", "Release", new Object[0]);
        cqc.b(this.u0);
        c2();
        b2();
        bq7 bq7 = (bq7) this.c;
        if (bq7.g == this) {
            bq7.u();
            bq7.e = null;
            bq7.r((Surface) null);
            bq7.g = null;
        }
        pl9 pl9 = (pl9) ((kk9) this.b);
        ((Set) ((v2) pl9).a).remove(this);
        pl9.release();
    }

    public final void m1(int i) {
        long j = (long) i;
        we8 we8 = this.c;
        bq7 bq7 = (bq7) we8;
        bq7.q(j);
        hkf a = this.t0.a();
        bq7 bq72 = (bq7) we8;
        a.k = bq72.f();
        a.l = bq72.d();
        hkf hkf = new hkf(a);
        this.t0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
        if (bq7.k()) {
            a2();
            Z1();
        }
    }

    public final void o() {
        hm9.k("bk9", "onPlaybackEnded");
        c2();
        b2();
        hkf a = this.t0.a();
        a.b = false;
        a.c = false;
        a.a = true;
        hkf hkf = new hkf(a);
        this.t0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
        FrgLocalVideo frgLocalVideo = this.Z;
        if (frgLocalVideo != null) {
            frgLocalVideo.X();
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
        hm9.k("bk9", "onPlaybackBuffering");
        hkf a = this.t0.a();
        a.c = true;
        hkf hkf = new hkf(a);
        this.t0 = hkf;
        ((pl9) ((kk9) this.b)).d(hkf);
    }
}
