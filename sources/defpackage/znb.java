package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: znb  reason: default package */
public final class znb extends dj0 {
    public final rb8 h;
    public final kb8 i;
    public final p24 j;
    public final yt8 k;
    public final sr4 l;
    public final buc m;
    public final int n = 1048576;
    public boolean o = true;
    public long p = -9223372036854775807L;
    public boolean q;
    public boolean r;
    public y0f s;

    public znb(rb8 rb8, p24 p24, yt8 yt8, sr4 sr4, buc buc) {
        kb8 kb8 = rb8.b;
        kb8.getClass();
        this.i = kb8;
        this.h = rb8;
        this.j = p24;
        this.k = yt8;
        this.l = sr4;
        this.m = buc;
    }

    public final yd8 a(xj8 xj8, n64 n64, long j2) {
        r24 a = this.j.a();
        y0f y0f = this.s;
        if (y0f != null) {
            a.N(y0f);
        }
        Uri uri = this.i.a;
        np8.g(this.g);
        glc glc = new glc(2, (Object) (ua4) ((qa5) this.k.b));
        kr4 kr4 = new kr4(this.d.c, 0, xj8);
        gk8 gk8 = new gk8((CopyOnWriteArrayList) this.c.d, 0, xj8, 0);
        return new unb(uri, a, glc, this.l, kr4, this.m, gk8, this, n64, this.n);
    }

    public final rb8 f() {
        return this.h;
    }

    public final void g() {
    }

    public final void i(y0f y0f) {
        this.s = y0f;
        sr4 sr4 = this.l;
        sr4.prepare();
        Looper myLooper = Looper.myLooper();
        myLooper.getClass();
        i4b i4b = this.g;
        np8.g(i4b);
        sr4.c(myLooper, i4b);
        p();
    }

    public final void k(yd8 yd8) {
        unb unb = (unb) yd8;
        if (unb.G0) {
            for (drc drc : unb.D0) {
                drc.i();
                er4 er4 = drc.h;
                if (er4 != null) {
                    er4.f(drc.e);
                    drc.h = null;
                    drc.g = null;
                }
            }
        }
        unb.v0.p(unb);
        unb.A0.removeCallbacksAndMessages((Object) null);
        unb.B0 = null;
        unb.W0 = true;
    }

    public final void m() {
        this.l.release();
    }

    public final void p() {
        long j2 = this.p;
        boolean z = this.q;
        boolean z2 = this.r;
        rb8 rb8 = this.h;
        hrd hrd = r1;
        hrd hrd2 = new hrd(-9223372036854775807L, -9223372036854775807L, j2, j2, 0, 0, z, false, false, (pq9) null, rb8, z2 ? rb8.c : null);
        j(this.o ? new r06(hrd) : hrd);
    }

    public final void q(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.p;
        }
        if (this.o || this.p != j2 || this.q != z || this.r != z2) {
            this.p = j2;
            this.q = z;
            this.r = z2;
            this.o = false;
            p();
        }
    }
}
