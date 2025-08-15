package defpackage;

/* renamed from: i0f  reason: default package */
public class i0f implements su0 {
    public final int A0;
    public final int B0;
    public final zw6 C0;
    public final zw6 D0;
    public final int E0;
    public final boolean F0;
    public final boolean G0;
    public final boolean H0;
    public final e0f I0;
    public final jx6 J0;
    public final int X;
    public final int Y;
    public final int Z;
    public final int a;
    public final int b;
    public final int c;
    public final int o;
    public final int s0;
    public final int t0;
    public final int u0;
    public final boolean v0;
    public final zw6 w0;
    public final int x0;
    public final zw6 y0;
    public final int z0;

    static {
        new i0f(new g0f());
    }

    public i0f(g0f g0f) {
        this.a = g0f.a;
        this.b = g0f.b;
        this.c = g0f.c;
        this.o = g0f.d;
        this.X = g0f.e;
        this.Y = g0f.f;
        this.Z = g0f.g;
        this.s0 = g0f.h;
        this.t0 = g0f.i;
        this.u0 = g0f.j;
        this.v0 = g0f.k;
        this.w0 = g0f.l;
        this.x0 = g0f.m;
        this.y0 = g0f.n;
        this.z0 = g0f.o;
        this.A0 = g0f.p;
        this.B0 = g0f.q;
        this.C0 = g0f.r;
        this.D0 = g0f.s;
        this.E0 = g0f.t;
        this.F0 = g0f.u;
        this.G0 = g0f.v;
        this.H0 = g0f.w;
        this.I0 = g0f.x;
        this.J0 = g0f.y;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i0f i0f = (i0f) obj;
        return this.a == i0f.a && this.b == i0f.b && this.c == i0f.c && this.o == i0f.o && this.X == i0f.X && this.Y == i0f.Y && this.Z == i0f.Z && this.s0 == i0f.s0 && this.v0 == i0f.v0 && this.t0 == i0f.t0 && this.u0 == i0f.u0 && this.w0.equals(i0f.w0) && this.x0 == i0f.x0 && this.y0.equals(i0f.y0) && this.z0 == i0f.z0 && this.A0 == i0f.A0 && this.B0 == i0f.B0 && this.C0.equals(i0f.C0) && this.D0.equals(i0f.D0) && this.E0 == i0f.E0 && this.F0 == i0f.F0 && this.G0 == i0f.G0 && this.H0 == i0f.H0 && this.I0.equals(i0f.I0) && this.J0.equals(i0f.J0);
    }

    public int hashCode() {
        int hashCode = this.w0.hashCode();
        int hashCode2 = this.y0.hashCode();
        int hashCode3 = this.C0.hashCode();
        int hashCode4 = this.D0.hashCode();
        return ((this.I0.a.hashCode() + ((((((((((hashCode4 + ((hashCode3 + ((((((((hashCode2 + ((((hashCode + ((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.o) * 31) + this.X) * 31) + this.Y) * 31) + this.Z) * 31) + this.s0) * 31) + (this.v0 ? 1 : 0)) * 31) + this.t0) * 31) + this.u0) * 31)) * 31) + this.x0) * 31)) * 31) + this.z0) * 31) + this.A0) * 31) + this.B0) * 31)) * 31)) * 31) + this.E0) * 31) + (this.F0 ? 1 : 0)) * 31) + (this.G0 ? 1 : 0)) * 31) + (this.H0 ? 1 : 0)) * 31)) * 31) + this.J0.hashCode();
    }
}
