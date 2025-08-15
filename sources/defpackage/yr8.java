package defpackage;

/* renamed from: yr8  reason: default package */
public final class yr8 implements frc {
    public final frc a;
    public final long b;

    public yr8(frc frc, long j) {
        this.a = frc;
        this.b = j;
    }

    public final void c() {
        this.a.c();
    }

    public final boolean d() {
        return this.a.d();
    }

    public final int e(long j) {
        return this.a.e(j - this.b);
    }

    public final int g(imc imc, o54 o54, int i) {
        int g = this.a.g(imc, o54, i);
        if (g == -4) {
            o54.Y = Math.max(0, o54.Y + this.b);
        }
        return g;
    }
}
