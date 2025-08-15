package defpackage;

/* renamed from: n13  reason: default package */
public final class n13 {
    public final yze a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long[] k;
    public int[] l;

    public n13(int i2, int i3, long j2, int i4, yze yze) {
        boolean z = true;
        if (!(i3 == 1 || i3 == 2)) {
            z = false;
        }
        fm9.f(z);
        this.d = j2;
        this.e = i4;
        this.a = yze;
        int i5 = (((i2 % 10) + 48) << 8) | ((i2 / 10) + 48);
        this.b = (i3 == 2 ? 1667497984 : 1651965952) | i5;
        this.c = i3 == 2 ? i5 | 1650720768 : -1;
        this.k = new long[512];
        this.l = new int[512];
    }

    public final z1d a(int i2) {
        return new z1d(((this.d * ((long) 1)) / ((long) this.e)) * ((long) this.l[i2]), this.k[i2]);
    }

    public final t1d b(long j2) {
        int i2 = (int) (j2 / ((this.d * ((long) 1)) / ((long) this.e)));
        int e2 = oaf.e(this.l, i2, true, true);
        if (this.l[e2] == i2) {
            z1d a2 = a(e2);
            return new t1d(a2, a2);
        }
        z1d a3 = a(e2);
        int i3 = e2 + 1;
        return i3 < this.k.length ? new t1d(a3, a(i3)) : new t1d(a3, a3);
    }
}
