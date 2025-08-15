package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;
import java.util.ArrayList;

/* renamed from: e43  reason: default package */
public final class e43 extends b9g {
    public final long l;
    public final long m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final ArrayList q;
    public final kue r;
    public c43 s;
    public ClippingMediaSource$IllegalClippingException t;
    public long u;
    public long v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e43(ej0 ej0, long j, long j2, boolean z, boolean z2, boolean z3) {
        super(ej0);
        ej0.getClass();
        fm9.f(j >= 0);
        this.l = j;
        this.m = j2;
        this.n = z;
        this.o = z2;
        this.p = z3;
        this.q = new ArrayList();
        this.r = new kue();
    }

    public final void A(mue mue) {
        if (this.t == null) {
            C(mue);
        }
    }

    public final void C(mue mue) {
        long j;
        long j2;
        long j3;
        kue kue = this.r;
        mue.o(0, kue);
        long j4 = kue.p;
        c43 c43 = this.s;
        ArrayList arrayList = this.q;
        long j5 = this.m;
        long j6 = Long.MIN_VALUE;
        if (c43 == null || arrayList.isEmpty() || this.o) {
            boolean z = this.p;
            long j7 = this.l;
            if (z) {
                long j8 = kue.l;
                j7 += j8;
                j3 = j8 + j5;
            } else {
                j3 = j5;
            }
            this.u = j4 + j7;
            if (j5 != Long.MIN_VALUE) {
                j6 = j4 + j3;
            }
            this.v = j6;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                a43 a43 = (a43) arrayList.get(i);
                long j9 = this.u;
                long j10 = this.v;
                a43.X = j9;
                a43.Y = j10;
            }
            j2 = j7;
            j = j3;
        } else {
            long j11 = this.u - j4;
            if (j5 != Long.MIN_VALUE) {
                j6 = this.v - j4;
            }
            j = j6;
            j2 = j11;
        }
        try {
            c43 c432 = new c43(mue, j2, j);
            this.s = c432;
            n(c432);
        } catch (ClippingMediaSource$IllegalClippingException e) {
            this.t = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((a43) arrayList.get(i2)).Z = this.t;
            }
        }
    }

    public final boolean a(tb8 tb8) {
        ej0 ej0 = this.k;
        return ej0.i().e.equals(tb8.e) && ej0.a(tb8);
    }

    public final zd8 c(yj8 yj8, n64 n64, long j) {
        a43 a43 = new a43(this.k.c(yj8, n64, j), this.n, this.u, this.v);
        this.q.add(a43);
        return a43;
    }

    public final void k() {
        ClippingMediaSource$IllegalClippingException clippingMediaSource$IllegalClippingException = this.t;
        if (clippingMediaSource$IllegalClippingException == null) {
            super.k();
            return;
        }
        throw clippingMediaSource$IllegalClippingException;
    }

    public final void o(zd8 zd8) {
        ArrayList arrayList = this.q;
        fm9.k(arrayList.remove(zd8));
        this.k.o(((a43) zd8).a);
        if (arrayList.isEmpty() && !this.o) {
            c43 c43 = this.s;
            c43.getClass();
            C(c43.e);
        }
    }

    public final void q() {
        super.q();
        this.t = null;
        this.s = null;
    }
}
