package defpackage;

/* renamed from: qs3  reason: default package */
public final class qs3 extends yi0 {
    public final long A0;
    public final wu0 B0;
    public long C0;
    public volatile boolean D0;
    public boolean E0;
    public final int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public qs3(r24 r24, z24 z24, oy5 oy5, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, wu0 wu0) {
        super(r24, z24, oy5, i, obj, j, j2, j3, j4, j5);
        this.z0 = i2;
        this.A0 = j6;
        this.B0 = wu0;
    }

    public final void a() {
        this.D0 = true;
    }

    public final long b() {
        return this.u0 + ((long) this.z0);
    }

    public final boolean c() {
        return this.E0;
    }

    public final void load() {
        ra4 ra4;
        boolean z;
        if (this.C0 == 0) {
            ph4 ph4 = this.x0;
            np8.g(ph4);
            long j = this.A0;
            for (drc drc : (drc[]) ph4.b) {
                if (drc.F != j) {
                    drc.F = j;
                    drc.z = true;
                }
            }
            wu0 wu0 = this.B0;
            long j2 = this.v0;
            long j3 = -9223372036854775807L;
            long j4 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.A0;
            long j5 = this.w0;
            if (j5 != -9223372036854775807L) {
                j3 = j5 - this.A0;
            }
            wu0.b(ph4, j4, j3);
        }
        try {
            z24 b = this.b.b(this.C0);
            t1e t1e = this.t0;
            ra4 = new ra4(t1e, b.f, t1e.L(b));
            do {
                if (!this.D0) {
                    int i = this.B0.a.i(ra4, wu0.u0);
                    np8.f(i != 1);
                    if (i == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                }
                break;
            } while (z);
            break;
            this.C0 = ra4.o - this.b.f;
            kq0.f(this.t0);
            this.E0 = !this.D0;
        } catch (Throwable th) {
            kq0.f(this.t0);
            throw th;
        }
    }
}
