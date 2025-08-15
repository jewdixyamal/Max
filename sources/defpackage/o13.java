package defpackage;

/* renamed from: o13  reason: default package */
public final class o13 implements frc {
    public final /* synthetic */ s13 X;
    public final s13 a;
    public final drc b;
    public final int c;
    public boolean o;

    public o13(s13 s13, s13 s132, drc drc, int i) {
        this.X = s13;
        this.a = s132;
        this.b = drc;
        this.c = i;
    }

    public final void a() {
        if (!this.o) {
            s13 s13 = this.X;
            gk8 gk8 = s13.Z;
            int[] iArr = s13.b;
            int i = this.c;
            gk8.b(iArr[i], s13.c[i], 0, (Object) null, s13.E0);
            this.o = true;
        }
    }

    public final void c() {
    }

    public final boolean d() {
        s13 s13 = this.X;
        return !s13.m() && this.b.t(s13.H0);
    }

    public final int e(long j) {
        s13 s13 = this.X;
        if (s13.m()) {
            return 0;
        }
        boolean z = s13.H0;
        drc drc = this.b;
        int q = drc.q(j, z);
        yi0 yi0 = s13.G0;
        if (yi0 != null) {
            q = Math.min(q, yi0.d(this.c + 1) - drc.o());
        }
        drc.B(q);
        if (q > 0) {
            a();
        }
        return q;
    }

    public final int g(imc imc, o54 o54, int i) {
        s13 s13 = this.X;
        if (s13.m()) {
            return -3;
        }
        yi0 yi0 = s13.G0;
        drc drc = this.b;
        if (yi0 != null && yi0.d(this.c + 1) <= drc.o()) {
            return -3;
        }
        a();
        return drc.y(imc, o54, i, s13.H0);
    }
}
