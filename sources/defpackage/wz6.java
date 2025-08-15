package defpackage;

/* renamed from: wz6  reason: default package */
public final class wz6 implements c2d {
    public final long a;
    public final nv7 b;
    public final nv7 c;
    public long d;

    public wz6(long j, long j2, long j3) {
        this.d = j;
        this.a = j3;
        nv7 nv7 = new nv7(0);
        this.b = nv7;
        nv7 nv72 = new nv7(0);
        this.c = nv72;
        nv7.a(0);
        nv72.a(j2);
    }

    public final long a() {
        return this.a;
    }

    public final long b(long j) {
        return this.b.b(maf.d(this.c, j));
    }

    public final boolean c() {
        return true;
    }

    public final boolean d(long j) {
        nv7 nv7 = this.b;
        return j - nv7.b(nv7.b - 1) < 100000;
    }

    public final s1d e(long j) {
        nv7 nv7 = this.b;
        int d2 = maf.d(nv7, j);
        long b2 = nv7.b(d2);
        nv7 nv72 = this.c;
        y1d y1d = new y1d(b2, nv72.b(d2));
        if (b2 == j || d2 == nv7.b - 1) {
            return new s1d(y1d, y1d);
        }
        int i = d2 + 1;
        return new s1d(y1d, new y1d(nv7.b(i), nv72.b(i)));
    }

    public final long f() {
        return this.d;
    }
}
