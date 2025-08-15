package defpackage;

import java.util.Arrays;

/* renamed from: q07  reason: default package */
public final class q07 extends qw8 {
    public static volatile q07[] e;
    public int a = 0;
    public int b = 0;
    public int c = 0;
    public byte[] d = nd7.g;

    public q07() {
        this.cachedSize = -1;
    }

    public static q07[] a() {
        if (e == null) {
            synchronized (y37.b) {
                try {
                    if (e == null) {
                        e = new q07[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int f = i != 0 ? y43.f(1, i) : 0;
        int i2 = this.b;
        if (i2 != 0) {
            f += y43.n(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            f += y43.n(3, i3);
        }
        return !Arrays.equals(this.d, nd7.g) ? f + y43.b(4, this.d) : f;
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                int p = x43.p();
                if (p == 0 || p == 1 || p == 2 || p == 3 || p == 4) {
                    this.a = p;
                }
            } else if (s == 16) {
                this.b = x43.p();
            } else if (s == 24) {
                this.c = x43.p();
            } else if (s == 34) {
                this.d = x43.g();
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
            y43.G(2, i2);
        }
        int i3 = this.c;
        if (i3 != 0) {
            y43.G(3, i3);
        }
        if (!Arrays.equals(this.d, nd7.g)) {
            y43.s(4, this.d);
        }
    }
}
