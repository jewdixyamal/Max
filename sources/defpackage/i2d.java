package defpackage;

/* renamed from: i2d  reason: default package */
public final class i2d {
    public final long a;
    public final long b;
    public final int c;
    public final int d;

    public i2d(gtd gtd, int i, int i2) {
        this.a = oaf.S(gtd.a);
        this.b = oaf.S(gtd.b);
        int i3 = gtd.c;
        this.c = i3;
        int i4 = i3;
        while (true) {
            if (i4 <= 0) {
                break;
            }
            boolean z = true;
            if ((i4 & 1) == 1) {
                z = (i4 >> 1) != 0 ? false : z;
                fm9.j("Invalid speed divisor: " + i3, z);
            } else {
                i2++;
                i4 >>= 1;
            }
        }
        this.d = Math.min(i2, i);
    }
}
