package defpackage;

/* renamed from: apb  reason: default package */
public final class apb extends qw8 {
    public float a;
    public float b;
    public int c;
    public boolean d;

    public final int computeSerializedSize() {
        int e = Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f) ? y43.e(1) : 0;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            e += y43.e(2);
        }
        int i = this.c;
        if (i != 0) {
            e += y43.f(3, i);
        }
        return this.d ? e + y43.a(4) : e;
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            if (s == 0) {
                break;
            } else if (s == 13) {
                this.a = x43.i();
            } else if (s == 21) {
                this.b = x43.i();
            } else if (s == 24) {
                this.c = x43.p();
            } else if (s == 32) {
                this.d = x43.f();
            } else if (!x43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(y43 y43) {
        if (Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f)) {
            y43.v(1, this.a);
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            y43.v(2, this.b);
        }
        int i = this.c;
        if (i != 0) {
            y43.w(3, i);
        }
        boolean z = this.d;
        if (z) {
            y43.r(4, z);
        }
    }
}
