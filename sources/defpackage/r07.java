package defpackage;

/* renamed from: r07  reason: default package */
public final class r07 extends qw8 {
    public int a = 0;

    public r07() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        if (i != 0) {
            return y43.n(1, i);
        }
        return 0;
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                this.a = x43.p();
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
    }
}
