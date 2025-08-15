package defpackage;

/* renamed from: t07  reason: default package */
public final class t07 extends h13 {
    public final wu0 u0;
    public ph4 v0;
    public long w0;
    public volatile boolean x0;

    public t07(r24 r24, z24 z24, oy5 oy5, int i, Object obj, wu0 wu0) {
        super(r24, z24, 2, oy5, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.u0 = wu0;
    }

    public final void a() {
        this.x0 = true;
    }

    public final void load() {
        ra4 ra4;
        boolean z;
        if (this.w0 == 0) {
            this.u0.b(this.v0, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            z24 b = this.b.b(this.w0);
            t1e t1e = this.t0;
            ra4 = new ra4(t1e, b.f, t1e.L(b));
            do {
                if (!this.x0) {
                    int i = this.u0.a.i(ra4, wu0.u0);
                    z = false;
                    np8.f(i != 1);
                    if (i == 0) {
                        z = true;
                        continue;
                    }
                }
                break;
            } while (z);
            break;
            this.w0 = ra4.o - this.b.f;
            kq0.f(this.t0);
        } catch (Throwable th) {
            kq0.f(this.t0);
            throw th;
        }
    }
}
