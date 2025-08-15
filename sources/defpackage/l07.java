package defpackage;

import java.util.Arrays;

/* renamed from: l07  reason: default package */
public final class l07 extends qw8 {
    public int a = 0;
    public byte[] b = nd7.g;

    public l07() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int n = i != 0 ? y43.n(1, i) : 0;
        return !Arrays.equals(this.b, nd7.g) ? n + y43.b(2, this.b) : n;
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                this.a = x43.p();
            } else if (s == 18) {
                this.b = x43.g();
            } else if (!x43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(y43 y43) {
        int i = this.a;
        if (i != 0) {
            y43.G(1, i);
        }
        if (!Arrays.equals(this.b, nd7.g)) {
            y43.s(2, this.b);
        }
    }
}
