package defpackage;

/* renamed from: zob  reason: default package */
public final class zob extends qw8 {
    public float a = 0.0f;
    public float b = 0.0f;
    public float c = 0.0f;
    public float d = 0.0f;

    public zob() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int e = Float.floatToIntBits(this.a) != Float.floatToIntBits(0.0f) ? y43.e(1) : 0;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            e += y43.e(2);
        }
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            e += y43.e(3);
        }
        return Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f) ? e + y43.e(4) : e;
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
            } else if (s == 29) {
                this.c = x43.i();
            } else if (s == 37) {
                this.d = x43.i();
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
        if (Float.floatToIntBits(this.c) != Float.floatToIntBits(0.0f)) {
            y43.v(3, this.c);
        }
        if (Float.floatToIntBits(this.d) != Float.floatToIntBits(0.0f)) {
            y43.v(4, this.d);
        }
    }
}
