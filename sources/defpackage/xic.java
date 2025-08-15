package defpackage;

/* renamed from: xic  reason: default package */
public final class xic {
    public mhc a;
    public sob b;
    public int c = -1;
    public String d;
    public fi6 e;
    public bj6 f = new bj6();
    public i8c g;
    public yic h;
    public yic i;
    public yic j;
    public long k;
    public long l;
    public od m;

    public static void b(yic yic, String str) {
        if (yic == null) {
            return;
        }
        if (yic.Z != null) {
            throw new IllegalArgumentException(str.concat(".body != null").toString());
        } else if (yic.s0 != null) {
            throw new IllegalArgumentException(str.concat(".networkResponse != null").toString());
        } else if (yic.t0 != null) {
            throw new IllegalArgumentException(str.concat(".cacheResponse != null").toString());
        } else if (yic.u0 != null) {
            throw new IllegalArgumentException(str.concat(".priorResponse != null").toString());
        }
    }

    public final yic a() {
        int i2 = this.c;
        if (i2 >= 0) {
            mhc mhc = this.a;
            if (mhc != null) {
                sob sob = this.b;
                if (sob != null) {
                    String str = this.d;
                    if (str != null) {
                        return new yic(mhc, sob, str, i2, this.e, this.f.c(), this.g, this.h, this.i, this.j, this.k, this.l, this.m);
                    }
                    throw new IllegalStateException("message == null".toString());
                }
                throw new IllegalStateException("protocol == null".toString());
            }
            throw new IllegalStateException("request == null".toString());
        }
        throw new IllegalStateException(("code < 0: " + this.c).toString());
    }
}
