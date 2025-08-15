package defpackage;

/* renamed from: g45  reason: default package */
public final class g45 implements grc {
    public k45 X;
    public boolean Y;
    public int Z;
    public final qy5 a;
    public final ph4 b = new ph4(18);
    public long[] c;
    public boolean o;
    public long s0 = -9223372036854775807L;

    public g45(k45 k45, qy5 qy5, boolean z) {
        this.a = qy5;
        this.X = k45;
        this.c = k45.b;
        a(k45, z);
    }

    public final void a(k45 k45, boolean z) {
        int i = this.Z;
        long j = -9223372036854775807L;
        long j2 = i == 0 ? -9223372036854775807L : this.c[i - 1];
        this.o = z;
        this.X = k45;
        long[] jArr = k45.b;
        this.c = jArr;
        long j3 = this.s0;
        if (j3 != -9223372036854775807L) {
            int b2 = oaf.b(jArr, j3, true);
            this.Z = b2;
            if (this.o && b2 == this.c.length) {
                j = j3;
            }
            this.s0 = j;
        } else if (j2 != -9223372036854775807L) {
            this.Z = oaf.b(jArr, j2, false);
        }
    }

    public final void c() {
    }

    public final boolean d() {
        return true;
    }

    public final int e(long j) {
        int max = Math.max(this.Z, oaf.b(this.c, j, true));
        int i = max - this.Z;
        this.Z = max;
        return i;
    }

    public final int j(y7g y7g, p54 p54, int i) {
        int i2 = this.Z;
        boolean z = i2 == this.c.length;
        if (z && !this.o) {
            p54.b = 4;
            return -4;
        } else if ((i & 2) != 0 || !this.Y) {
            y7g.c = this.a;
            this.Y = true;
            return -5;
        } else if (z) {
            return -3;
        } else {
            if ((i & 1) == 0) {
                this.Z = i2 + 1;
            }
            if ((i & 4) == 0) {
                byte[] j = this.b.j(this.X.a[i2]);
                p54.x(j.length);
                p54.X.put(j);
            }
            p54.Z = this.c[i2];
            p54.b = 1;
            return -4;
        }
    }
}
