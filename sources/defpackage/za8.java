package defpackage;

/* renamed from: za8  reason: default package */
public final class za8 {
    public long a;
    public long b = Long.MIN_VALUE;
    public boolean c;
    public boolean d;
    public boolean e;

    public bb8 a() {
        return new bb8(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ab8, cb8] */
    public cb8 b() {
        return new ab8(this);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [bb8, db8] */
    public db8 c() {
        return new bb8(this);
    }

    public void d(long j) {
        fm9.f(j == Long.MIN_VALUE || j >= 0);
        this.b = j;
    }

    public void e(long j) {
        f(oaf.S(j));
    }

    public void f(long j) {
        fm9.f(j >= 0);
        this.a = j;
    }

    public void g(boolean z) {
        this.e = z;
    }
}
