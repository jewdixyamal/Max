package defpackage;

import com.google.android.exoplayer2.source.BehindLiveWindowException;

/* renamed from: c94  reason: default package */
public final class c94 {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public /* synthetic */ c94(long j, Object obj, Object obj2, Object obj3, long j2, Object obj4, int i) {
        this.a = i;
        this.b = j;
        this.e = obj;
        this.f = obj2;
        this.c = j2;
        this.d = obj3;
        this.g = obj4;
    }

    public c94 a(long j, khc khc) {
        long j2;
        long j3 = j;
        z14 c2 = ((khc) this.e).c();
        z14 c3 = khc.c();
        if (c2 == null) {
            return new c94(j, khc, (lk0) this.f, (wu0) this.d, this.c, c2, 0);
        } else if (!c2.A()) {
            return new c94(j, khc, (lk0) this.f, (wu0) this.d, this.c, c3, 0);
        } else {
            long D = c2.D(j3);
            if (D == 0) {
                return new c94(j, khc, (lk0) this.f, (wu0) this.d, this.c, c3, 0);
            }
            long C = c2.C();
            long b2 = c2.b(C);
            long j4 = D + C;
            long j5 = j4 - 1;
            long j6 = c2.j(j5, j3) + c2.b(j5);
            long C2 = c3.C();
            z14 z14 = c2;
            long b3 = c3.b(C2);
            int i = (j6 > b3 ? 1 : (j6 == b3 ? 0 : -1));
            long j7 = C;
            long j8 = this.c;
            if (i != 0) {
                if (i < 0) {
                    throw new BehindLiveWindowException();
                } else if (b3 < b2) {
                    j2 = j8 - (c3.v(b2, j3) - j7);
                    return new c94(j, khc, (lk0) this.f, (wu0) this.d, j2, c3, 0);
                } else {
                    j4 = z14.v(b3, j3);
                }
            }
            j2 = (j4 - C2) + j8;
            return new c94(j, khc, (lk0) this.f, (wu0) this.d, j2, c3, 0);
        }
    }

    public c94 b(long j, lhc lhc) {
        long j2;
        long j3 = j;
        a24 c2 = ((lhc) this.e).c();
        a24 c3 = lhc.c();
        if (c2 == null) {
            return new c94(j, lhc, (mk0) this.f, (k13) this.d, this.c, c2, 1);
        } else if (!c2.A()) {
            return new c94(j, lhc, (mk0) this.f, (k13) this.d, this.c, c3, 1);
        } else {
            long D = c2.D(j3);
            if (D == 0) {
                return new c94(j, lhc, (mk0) this.f, (k13) this.d, this.c, c3, 1);
            }
            fm9.l(c3);
            long C = c2.C();
            long b2 = c2.b(C);
            long j4 = D + C;
            long j5 = j4 - 1;
            long j6 = c2.j(j5, j3) + c2.b(j5);
            long C2 = c3.C();
            a24 a24 = c2;
            long b3 = c3.b(C2);
            int i = (j6 > b3 ? 1 : (j6 == b3 ? 0 : -1));
            long j7 = C;
            long j8 = this.c;
            if (i != 0) {
                if (i < 0) {
                    throw new androidx.media3.exoplayer.source.BehindLiveWindowException();
                } else if (b3 < b2) {
                    j2 = j8 - (c3.v(b2, j3) - j7);
                    return new c94(j, lhc, (mk0) this.f, (k13) this.d, j2, c3, 1);
                } else {
                    j4 = a24.v(b3, j3);
                }
            }
            j2 = (j4 - C2) + j8;
            return new c94(j, lhc, (mk0) this.f, (k13) this.d, j2, c3, 1);
        }
    }

    public long c(long j) {
        a24 a24 = (a24) this.g;
        fm9.l(a24);
        return a24.k(this.b, j) + this.c;
    }

    public final long d(long j) {
        switch (this.a) {
            case 0:
                z14 z14 = (z14) this.g;
                long j2 = this.b;
                return (z14.E(j2, j) + (z14.k(j2, j) + this.c)) - 1;
            default:
                long c2 = c(j);
                a24 a24 = (a24) this.g;
                fm9.l(a24);
                return (a24.E(this.b, j) + c2) - 1;
        }
    }

    public long e() {
        a24 a24 = (a24) this.g;
        fm9.l(a24);
        return a24.D(this.b);
    }

    public final long f(long j) {
        switch (this.a) {
            case 0:
                return ((z14) this.g).j(j - this.c, this.b) + g(j);
            default:
                long g2 = g(j);
                a24 a24 = (a24) this.g;
                fm9.l(a24);
                return a24.j(j - this.c, this.b) + g2;
        }
    }

    public final long g(long j) {
        switch (this.a) {
            case 0:
                return ((z14) this.g).b(j - this.c);
            default:
                a24 a24 = (a24) this.g;
                fm9.l(a24);
                return a24.b(j - this.c);
        }
    }

    public boolean h(long j, long j2) {
        a24 a24 = (a24) this.g;
        fm9.l(a24);
        return a24.A() || j2 == -9223372036854775807L || f(j) <= j2;
    }
}
