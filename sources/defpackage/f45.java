package defpackage;

/* renamed from: f45  reason: default package */
public final class f45 implements frc {
    public j45 X;
    public boolean Y;
    public int Z;
    public final oy5 a;
    public final y7g b = new y7g(16);
    public long[] c;
    public boolean o;
    public long s0 = -9223372036854775807L;

    public f45(j45 j45, oy5 oy5, boolean z) {
        this.a = oy5;
        this.X = j45;
        this.c = j45.b;
        a(j45, z);
    }

    public final void a(j45 j45, boolean z) {
        int i = this.Z;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.o = z;
        this.X = j45;
        long[] jArr = j45.b;
        this.c = jArr;
        long j3 = this.s0;
        if (j3 != -9223372036854775807L) {
            int b2 = maf.b(jArr, j3, true);
            this.Z = b2;
            if (this.o && b2 == this.c.length) {
                j = j3;
            }
            this.s0 = j;
        } else if (j2 != -9223372036854775807L) {
            this.Z = maf.b(jArr, j2, false);
        }
    }

    public final void c() {
    }

    public final boolean d() {
        return true;
    }

    public final int e(long j) {
        int max = Math.max(this.Z, maf.b(this.c, j, true));
        int i = max - this.Z;
        this.Z = max;
        return i;
    }

    public final int g(imc imc, o54 o54, int i) {
        int i2 = this.Z;
        boolean z = i2 == this.c.length;
        if (z && !this.o) {
            o54.b = 4;
            return -4;
        } else if ((i & 2) != 0 || !this.Y) {
            imc.c = this.a;
            this.Y = true;
            return -5;
        } else if (z) {
            return -3;
        } else {
            if ((i & 1) == 0) {
                this.Z = i2 + 1;
            }
            if ((i & 4) == 0) {
                byte[] w = this.b.w(this.X.a[i2]);
                o54.x(w.length);
                o54.o.put(w);
            }
            o54.Y = this.c[i2];
            o54.b = 1;
            return -4;
        }
    }
}
