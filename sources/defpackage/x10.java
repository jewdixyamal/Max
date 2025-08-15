package defpackage;

import java.io.Serializable;

/* renamed from: x10  reason: default package */
public final class x10 implements Serializable {
    public static final x10 w0 = new Object().a();
    public final boolean X;
    public final byte[] Y;
    public final String Z;
    public final String a;
    public final String b;
    public final int c;
    public final int o;
    public final long s0;
    public final String t0;
    public final String u0;
    public final String v0;

    public x10(w10 w10) {
        this.a = w10.a;
        this.b = w10.b;
        this.c = w10.c;
        this.o = w10.d;
        this.X = w10.e;
        this.Y = w10.f;
        this.Z = w10.g;
        this.s0 = w10.h;
        this.t0 = w10.i;
        this.u0 = w10.j;
        this.v0 = w10.k;
    }

    public final String a() {
        String str = this.b;
        if (!oag.t(str)) {
            return str;
        }
        String str2 = this.a;
        if (!oag.t(str2)) {
            return ju0.t(str2, kk0.X, jk0.b);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [w10, java.lang.Object] */
    public final w10 b() {
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
        return obj;
    }
}
