package defpackage;

/* renamed from: u07  reason: default package */
public final class u07 extends j13 {
    public final k13 u0;
    public qz7 v0;
    public long w0;
    public volatile boolean x0;

    public u07(t24 t24, a34 a34, qy5 qy5, int i, Object obj, k13 k13) {
        super(t24, a34, 2, qy5, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.u0 = k13;
    }

    public final void a() {
        this.x0 = true;
    }

    public final void load() {
        sa4 sa4;
        boolean z;
        if (this.w0 == 0) {
            ((xu0) this.u0).b(this.v0, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            a34 b = this.b.b(this.w0);
            u1e u1e = this.t0;
            sa4 = new sa4(u1e, b.f, u1e.G(b));
            do {
                if (!this.x0) {
                    int g = ((xu0) this.u0).a.g(sa4, xu0.v0);
                    z = false;
                    fm9.k(g != 1);
                    if (g == 0) {
                        z = true;
                        continue;
                    }
                }
                break;
            } while (z);
            break;
            this.w0 = sa4.o - this.b.f;
            mr0.i(this.t0);
        } catch (Throwable th) {
            mr0.i(this.t0);
            throw th;
        }
    }
}
