package defpackage;

/* renamed from: mrd  reason: default package */
public final class mrd extends zi0 {
    public final qy5 A0;
    public long B0;
    public boolean C0;
    public final int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mrd(t24 t24, a34 a34, qy5 qy5, int i, Object obj, long j, long j2, long j3, int i2, qy5 qy52) {
        super(t24, a34, qy5, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.z0 = i2;
        this.A0 = qy52;
    }

    public final void a() {
    }

    public final boolean c() {
        return this.C0;
    }

    public final void load() {
        u1e u1e = this.t0;
        qz7 qz7 = this.x0;
        fm9.l(qz7);
        for (erc erc : (erc[]) qz7.c) {
            if (erc.F != 0) {
                erc.F = 0;
                erc.z = true;
            }
        }
        yze Y = qz7.Y(this.z0);
        Y.e(this.A0);
        try {
            long G = u1e.G(this.b.b(this.B0));
            if (G != -1) {
                G += this.B0;
            }
            sa4 sa4 = new sa4(this.t0, this.B0, G);
            for (int i = 0; i != -1; i = Y.c(sa4, Integer.MAX_VALUE, true)) {
                this.B0 += (long) i;
            }
            Y.a(this.Z, 1, (int) this.B0, 0, (wze) null);
            mr0.i(u1e);
            this.C0 = true;
        } catch (Throwable th) {
            mr0.i(u1e);
            throw th;
        }
    }
}
