package defpackage;

/* renamed from: x33  reason: default package */
public final class x33 implements frc {
    public final frc a;
    public boolean b;
    public final /* synthetic */ z33 c;

    public x33(z33 z33, frc frc) {
        this.c = z33;
        this.a = frc;
    }

    public final void c() {
        this.a.c();
    }

    public final boolean d() {
        return !this.c.b() && this.a.d();
    }

    public final int e(long j) {
        if (this.c.b()) {
            return -3;
        }
        return this.a.e(j);
    }

    public final int g(imc imc, o54 o54, int i) {
        z33 z33 = this.c;
        if (z33.b()) {
            return -3;
        }
        if (this.b) {
            o54.b = 4;
            return -4;
        }
        int g = this.a.g(imc, o54, i);
        if (g == -5) {
            oy5 oy5 = (oy5) imc.c;
            oy5.getClass();
            int i2 = oy5.N0;
            int i3 = oy5.M0;
            if (!(i3 == 0 && i2 == 0)) {
                if (z33.X != 0) {
                    i3 = 0;
                }
                if (z33.Y != Long.MIN_VALUE) {
                    i2 = 0;
                }
                my5 a2 = oy5.a();
                a2.A = i3;
                a2.B = i2;
                imc.c = a2.a();
            }
            return -5;
        }
        long j = z33.Y;
        if (j == Long.MIN_VALUE || ((g != -4 || o54.Y < j) && (g != -3 || z33.r() != Long.MIN_VALUE || o54.X))) {
            return g;
        }
        o54.v();
        o54.b = 4;
        this.b = true;
        return -4;
    }
}
