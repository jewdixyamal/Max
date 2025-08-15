package defpackage;

/* renamed from: tte  reason: default package */
public final class tte implements grc {
    public final grc a;
    public final long b;

    public tte(grc grc, long j) {
        this.a = grc;
        this.b = j;
    }

    public final void c() {
        this.a.c();
    }

    public final boolean d() {
        return this.a.d();
    }

    public final int e(long j) {
        return this.a.e(j - this.b);
    }

    public final int j(y7g y7g, p54 p54, int i) {
        int j = this.a.j(y7g, p54, i);
        if (j == -4) {
            p54.Z += this.b;
        }
        return j;
    }
}
