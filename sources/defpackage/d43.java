package defpackage;

import android.os.Handler;
import com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* renamed from: d43  reason: default package */
public final class d43 extends oc3 {
    public final dj0 k;
    public final long l = 0;
    public final long m;
    public final boolean n;
    public final ArrayList o;
    public final jue p;
    public b43 q;
    public ClippingMediaSource$IllegalClippingException r;
    public long s;
    public long t;

    public d43(znb znb, long j) {
        this.k = znb;
        this.m = j;
        this.n = true;
        this.o = new ArrayList();
        this.p = new jue();
    }

    public final yd8 a(xj8 xj8, n64 n64, long j) {
        z33 z33 = new z33(this.k.a(xj8, n64, j), this.n, this.s, this.t);
        this.o.add(z33);
        return z33;
    }

    public final rb8 f() {
        return this.k.f();
    }

    public final void g() {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.r;
        if (clippingMediaSource$IllegalClippingException == null) {
            super.g();
            return;
        }
        throw clippingMediaSource$IllegalClippingException;
    }

    public final void i(y0f y0f) {
        this.j = y0f;
        this.i = maf.m((Handler.Callback) null);
        r((Integer) null, this.k);
    }

    public final void k(yd8 yd8) {
        ArrayList arrayList = this.o;
        np8.f(arrayList.remove(yd8));
        this.k.k(((z33) yd8).a);
        if (arrayList.isEmpty()) {
            b43 b43 = this.q;
            b43.getClass();
            s(b43.b);
        }
    }

    public final void m() {
        super.m();
        this.r = null;
        this.q = null;
    }

    public final void q(Integer num, dj0 dj0, lue lue) {
        Void voidR = (Void) num;
        if (this.r == null) {
            s(lue);
        }
    }

    public final void s(lue lue) {
        long j;
        jue jue = this.p;
        lue.o(0, jue);
        long j2 = jue.B0;
        b43 b43 = this.q;
        ArrayList arrayList = this.o;
        long j3 = this.m;
        long j4 = Long.MIN_VALUE;
        if (b43 == null || arrayList.isEmpty()) {
            j = this.l;
            this.s = j2 + j;
            if (j3 != Long.MIN_VALUE) {
                j4 = j2 + j3;
            }
            this.t = j4;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                z33 z33 = (z33) arrayList.get(i);
                long j5 = this.s;
                long j6 = this.t;
                z33.X = j5;
                z33.Y = j6;
            }
        } else {
            j = this.s - j2;
            if (j3 != Long.MIN_VALUE) {
                j4 = this.t - j2;
            }
            j3 = j4;
        }
        try {
            b43 b432 = new b43(lue, j, j3);
            this.q = b432;
            j(b432);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.r = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((z33) arrayList.get(i2)).Z = this.r;
            }
        }
    }
}
