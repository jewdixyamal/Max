package defpackage;

/* renamed from: cpb  reason: default package */
public final class cpb extends qw8 {
    public static volatile cpb[] e;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public zw5 d = null;

    public cpb() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int f = i != 0 ? y43.f(1, i) : 0;
        int i2 = this.b;
        if (i2 != 0) {
            f += y43.f(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            f += y43.f(3, i3);
        }
        zw5 zw5 = this.d;
        return zw5 != null ? f + y43.i(4, zw5) : f;
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                this.a = x43.p();
            } else if (s == 16) {
                this.b = x43.p();
            } else if (s == 24) {
                this.c = x43.p();
            } else if (s == 34) {
                if (this.d == null) {
                    this.d = new zw5(3);
                }
                x43.j(this.d);
            } else if (!x43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(y43 y43) {
        int i = this.a;
        if (i != 0) {
            y43.w(1, i);
        }
        int i2 = this.b;
        if (i2 != 0) {
            y43.w(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            y43.w(3, i3);
        }
        zw5 zw5 = this.d;
        if (zw5 != null) {
            y43.y(4, zw5);
        }
    }
}
