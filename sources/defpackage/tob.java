package defpackage;

/* renamed from: tob  reason: default package */
public final class tob extends qw8 {
    public static volatile tob[] c;
    public int a = 0;
    public int b = 0;

    public tob() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int f = i != 0 ? y43.f(1, i) : 0;
        int i2 = this.b;
        return i2 != 0 ? f + y43.f(2, i2) : f;
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                int p = x43.p();
                if (p == 0) {
                    this.a = p;
                }
            } else if (s == 16) {
                this.b = x43.p();
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
    }
}
