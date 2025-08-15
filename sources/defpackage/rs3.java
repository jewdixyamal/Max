package defpackage;

/* renamed from: rs3  reason: default package */
public final class rs3 extends zi0 {
    public final long A0;
    public final k13 B0;
    public long C0;
    public volatile boolean D0;
    public boolean E0;
    public final int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rs3(t24 t24, a34 a34, qy5 qy5, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, k13 k13) {
        super(t24, a34, qy5, i, obj, j, j2, j3, j4, j5);
        this.z0 = i2;
        this.A0 = j6;
        this.B0 = k13;
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

    public final void e(qz7 qz7) {
        qy5 qy5 = this.o;
        if (ia9.i(qy5.m)) {
            int i = qy5.I;
            int i2 = qy5.J;
            if ((i > 1 || i2 > 1) && i != -1 && i2 != -1) {
                yze Y = qz7.Y(4);
                int i3 = i * i2;
                long j = (this.s0 - this.Z) / ((long) i3);
                for (int i4 = 1; i4 < i3; i4++) {
                    Y.b(new wpa(), 0, 0);
                    Y.a(((long) i4) * j, 0, 0, 0, (wze) null);
                }
            }
        }
    }

    public final void load() {
        sa4 sa4;
        qz7 qz7 = this.x0;
        fm9.l(qz7);
        if (this.C0 == 0) {
            long j = this.A0;
            for (erc erc : (erc[]) qz7.c) {
                if (erc.F != j) {
                    erc.F = j;
                    erc.z = true;
                }
            }
            k13 k13 = this.B0;
            long j2 = this.v0;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.A0;
            long j4 = this.w0;
            ((xu0) k13).b(qz7, j3, j4 == -9223372036854775807L ? -9223372036854775807L : j4 - this.A0);
        }
        try {
            a34 b = this.b.b(this.C0);
            u1e u1e = this.t0;
            sa4 = new sa4(u1e, b.f, u1e.G(b));
            while (!this.D0) {
                int g = ((xu0) this.B0).a.g(sa4, xu0.v0);
                fm9.k(g != 1);
                if (!(g == 0)) {
                    break;
                }
            }
            e(qz7);
            this.C0 = sa4.o - this.b.f;
            mr0.i(this.t0);
            this.E0 = !this.D0;
        } catch (Throwable th) {
            mr0.i(this.t0);
            throw th;
        }
    }
}
