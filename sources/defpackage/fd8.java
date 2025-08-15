package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;

/* renamed from: fd8  reason: default package */
public final class fd8 implements su0 {
    public static final fd8 S0 = new fd8(new Object());
    public static final wa8 T0 = new wa8(6);
    public final Integer A0;
    public final Boolean B0;
    public final Integer C0;
    public final Integer D0;
    public final Integer E0;
    public final Integer F0;
    public final Integer G0;
    public final Integer H0;
    public final Integer I0;
    public final CharSequence J0;
    public final CharSequence K0;
    public final CharSequence L0;
    public final Integer M0;
    public final Integer N0;
    public final CharSequence O0;
    public final CharSequence P0;
    public final CharSequence Q0;
    public final Bundle R0;
    public final CharSequence X;
    public final CharSequence Y;
    public final CharSequence Z;
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence o;
    public final Uri s0;
    public final d5c t0;
    public final d5c u0;
    public final byte[] v0;
    public final Integer w0;
    public final Uri x0;
    public final Integer y0;
    public final Integer z0;

    public fd8(dd8 dd8) {
        this.a = dd8.a;
        this.b = dd8.b;
        this.c = dd8.c;
        this.o = dd8.d;
        this.X = dd8.e;
        this.Y = dd8.f;
        this.Z = dd8.g;
        this.s0 = dd8.h;
        this.t0 = dd8.i;
        this.u0 = dd8.j;
        this.v0 = dd8.k;
        this.w0 = dd8.l;
        this.x0 = dd8.m;
        this.y0 = dd8.n;
        this.z0 = dd8.o;
        this.A0 = dd8.p;
        this.B0 = dd8.q;
        Integer num = dd8.r;
        this.C0 = num;
        this.D0 = num;
        this.E0 = dd8.s;
        this.F0 = dd8.t;
        this.G0 = dd8.u;
        this.H0 = dd8.v;
        this.I0 = dd8.w;
        this.J0 = dd8.x;
        this.K0 = dd8.y;
        this.L0 = dd8.z;
        this.M0 = dd8.A;
        this.N0 = dd8.B;
        this.O0 = dd8.C;
        this.P0 = dd8.D;
        this.Q0 = dd8.E;
        this.R0 = dd8.F;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [dd8, java.lang.Object] */
    public final dd8 a() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.c;
        obj.d = this.o;
        obj.e = this.X;
        obj.f = this.Y;
        obj.g = this.Z;
        obj.h = this.s0;
        obj.i = this.t0;
        obj.j = this.u0;
        obj.k = this.v0;
        obj.l = this.w0;
        obj.m = this.x0;
        obj.n = this.y0;
        obj.o = this.z0;
        obj.p = this.A0;
        obj.q = this.B0;
        obj.r = this.D0;
        obj.s = this.E0;
        obj.t = this.F0;
        obj.u = this.G0;
        obj.v = this.H0;
        obj.w = this.I0;
        obj.x = this.J0;
        obj.y = this.K0;
        obj.z = this.L0;
        obj.A = this.M0;
        obj.B = this.N0;
        obj.C = this.O0;
        obj.D = this.P0;
        obj.E = this.Q0;
        obj.F = this.R0;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fd8.class != obj.getClass()) {
            return false;
        }
        fd8 fd8 = (fd8) obj;
        return maf.a(this.a, fd8.a) && maf.a(this.b, fd8.b) && maf.a(this.c, fd8.c) && maf.a(this.o, fd8.o) && maf.a(this.X, fd8.X) && maf.a(this.Y, fd8.Y) && maf.a(this.Z, fd8.Z) && maf.a(this.s0, fd8.s0) && maf.a(this.t0, fd8.t0) && maf.a(this.u0, fd8.u0) && Arrays.equals(this.v0, fd8.v0) && maf.a(this.w0, fd8.w0) && maf.a(this.x0, fd8.x0) && maf.a(this.y0, fd8.y0) && maf.a(this.z0, fd8.z0) && maf.a(this.A0, fd8.A0) && maf.a(this.B0, fd8.B0) && maf.a(this.D0, fd8.D0) && maf.a(this.E0, fd8.E0) && maf.a(this.F0, fd8.F0) && maf.a(this.G0, fd8.G0) && maf.a(this.H0, fd8.H0) && maf.a(this.I0, fd8.I0) && maf.a(this.J0, fd8.J0) && maf.a(this.K0, fd8.K0) && maf.a(this.L0, fd8.L0) && maf.a(this.M0, fd8.M0) && maf.a(this.N0, fd8.N0) && maf.a(this.O0, fd8.O0) && maf.a(this.P0, fd8.P0) && maf.a(this.Q0, fd8.Q0);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.o, this.X, this.Y, this.Z, this.s0, this.t0, this.u0, Integer.valueOf(Arrays.hashCode(this.v0)), this.w0, this.x0, this.y0, this.z0, this.A0, this.B0, this.D0, this.E0, this.F0, this.G0, this.H0, this.I0, this.J0, this.K0, this.L0, this.M0, this.N0, this.O0, this.P0, this.Q0});
    }
}
