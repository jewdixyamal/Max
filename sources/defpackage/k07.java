package defpackage;

import java.util.Arrays;

/* renamed from: k07  reason: default package */
public final class k07 extends qw8 {
    public byte[] a = nd7.g;

    public k07() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        if (!Arrays.equals(this.a, nd7.g)) {
            return y43.b(1, this.a);
        }
        return 0;
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                this.a = x43.g();
            } else if (!x43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(y43 y43) {
        if (!Arrays.equals(this.a, nd7.g)) {
            y43.s(1, this.a);
        }
    }
}
