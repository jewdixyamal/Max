package defpackage;

import android.os.Looper;

/* renamed from: aob  reason: default package */
public final class aob extends ej0 {
    public final q24 h;
    public final yt8 i;
    public final tr4 j;
    public final huc k;
    public final int l;
    public boolean m = true;
    public long n = -9223372036854775807L;
    public boolean o;
    public boolean p;
    public z0f q;
    public tb8 r;

    public aob(tb8 tb8, q24 q24, yt8 yt8, tr4 tr4, huc huc, int i2) {
        this.r = tb8;
        this.h = q24;
        this.i = yt8;
        this.j = tr4;
        this.k = huc;
        this.l = i2;
    }

    public final boolean a(tb8 tb8) {
        ib8 ib8 = i().b;
        ib8.getClass();
        ib8 ib82 = tb8.b;
        return ib82 != null && ib82.a.equals(ib8.a) && ib82.i == ib8.i && oaf.a(ib82.f, ib8.f);
    }

    public final zd8 c(yj8 yj8, n64 n64, long j2) {
        t24 a = this.h.a();
        z0f z0f = this.q;
        if (z0f != null) {
            a.H(z0f);
        }
        ib8 ib8 = i().b;
        ib8.getClass();
        fm9.l(this.g);
        k8g k8g = new k8g((Object) (ra5) this.i.b);
        lr4 lr4 = new lr4(this.d.c, 0, yj8);
        jn b = b(yj8);
        long S = oaf.S(ib8.i);
        return new vnb(ib8.a, a, k8g, this.j, lr4, this.k, b, this, n64, ib8.f, this.l, S);
    }

    public final synchronized tb8 i() {
        return this.r;
    }

    public final void k() {
    }

    public final void m(z0f z0f) {
        this.q = z0f;
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        j4b j4b = this.g;
        fm9.l(j4b);
        tr4 tr4 = this.j;
        tr4.c(myLooper, j4b);
        tr4.prepare();
        u();
    }

    public final void o(zd8 zd8) {
        vnb vnb = (vnb) zd8;
        if (vnb.H0) {
            for (erc erc : vnb.E0) {
                erc.h();
                fr4 fr4 = erc.h;
                if (fr4 != null) {
                    fr4.f(erc.e);
                    erc.h = null;
                    erc.g = null;
                }
            }
        }
        vnb.w0.s(vnb);
        vnb.B0.removeCallbacksAndMessages((Object) null);
        vnb.C0 = null;
        vnb.Y0 = true;
    }

    public final void q() {
        this.j.release();
    }

    public final synchronized void t(tb8 tb8) {
        this.r = tb8;
    }

    public final void u() {
        long j2 = this.n;
        boolean z = this.o;
        boolean z2 = this.p;
        tb8 i2 = i();
        ird ird = r1;
        ird ird2 = new ird(-9223372036854775807L, -9223372036854775807L, j2, j2, 0, 0, z, false, false, (qq9) null, i2, z2 ? i2.c : null);
        n(this.m ? new s06(ird) : ird);
    }

    public final void v(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.n;
        }
        if (this.m || this.n != j2 || this.o != z || this.p != z2) {
            this.n = j2;
            this.o = z;
            this.p = z2;
            this.m = false;
            u();
        }
    }
}
