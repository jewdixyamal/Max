package defpackage;

/* renamed from: vzd  reason: default package */
public final class vzd implements u1d {
    public final /* synthetic */ u1d a;
    public final /* synthetic */ g03 b;

    public vzd(g03 g03, u1d u1d) {
        this.b = g03;
        this.a = u1d;
    }

    public final boolean c() {
        return this.a.c();
    }

    public final s1d e(long j) {
        s1d e = this.a.e(j);
        y1d y1d = e.a;
        long j2 = y1d.a;
        long j3 = y1d.b;
        long j4 = this.b.b;
        y1d y1d2 = new y1d(j2, j3 + j4);
        y1d y1d3 = e.b;
        return new s1d(y1d2, new y1d(y1d3.a, y1d3.b + j4));
    }

    public final long f() {
        return this.a.f();
    }
}
