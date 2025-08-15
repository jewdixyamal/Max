package defpackage;

import java.io.Closeable;

/* renamed from: yic  reason: default package */
public final class yic implements Closeable {
    public final fi6 X;
    public final cj6 Y;
    public final i8c Z;
    public final mhc a;
    public final sob b;
    public final String c;
    public final int o;
    public final yic s0;
    public final yic t0;
    public final yic u0;
    public final long v0;
    public final long w0;
    public final od x0;

    public yic(mhc mhc, sob sob, String str, int i, fi6 fi6, cj6 cj6, i8c i8c, yic yic, yic yic2, yic yic3, long j, long j2, od odVar) {
        this.a = mhc;
        this.b = sob;
        this.c = str;
        this.o = i;
        this.X = fi6;
        this.Y = cj6;
        this.Z = i8c;
        this.s0 = yic;
        this.t0 = yic2;
        this.u0 = yic3;
        this.v0 = j;
        this.w0 = j2;
        this.x0 = odVar;
    }

    public static String a(yic yic, String str) {
        String a2 = yic.Y.a(str);
        if (a2 != null) {
            return a2;
        }
        return null;
    }

    public final void close() {
        i8c i8c = this.Z;
        if (i8c != null) {
            i8c.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final boolean m() {
        int i = this.o;
        return 200 <= i && 299 >= i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [xic, java.lang.Object] */
    public final xic n() {
        ? obj = new Object();
        obj.a = this.a;
        obj.b = this.b;
        obj.c = this.o;
        obj.d = this.c;
        obj.e = this.X;
        obj.f = this.Y.c();
        obj.g = this.Z;
        obj.h = this.s0;
        obj.i = this.t0;
        obj.j = this.u0;
        obj.k = this.v0;
        obj.l = this.w0;
        obj.m = this.x0;
        return obj;
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.o + ", message=" + this.c + ", url=" + this.a.b + '}';
    }
}
