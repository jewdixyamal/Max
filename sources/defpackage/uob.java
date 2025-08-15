package defpackage;

/* renamed from: uob  reason: default package */
public final class uob extends qw8 {
    public zob a;
    public float b;
    public float[] c;

    public final int computeSerializedSize() {
        zob zob = this.a;
        int i = zob != null ? y43.i(1, zob) : 0;
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            i += y43.e(2);
        }
        float[] fArr = this.c;
        return (fArr == null || fArr.length <= 0) ? i : (fArr.length * 4) + i + fArr.length;
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            if (s == 0) {
                break;
            } else if (s == 10) {
                if (this.a == null) {
                    this.a = new zob();
                }
                x43.j(this.a);
            } else if (s == 21) {
                this.b = x43.i();
            } else if (s == 26) {
                int p = x43.p();
                int e = x43.e(p);
                int i = p / 4;
                float[] fArr = this.c;
                int length = fArr == null ? 0 : fArr.length;
                int i2 = i + length;
                float[] fArr2 = new float[i2];
                if (length != 0) {
                    System.arraycopy(fArr, 0, fArr2, 0, length);
                }
                while (length < i2) {
                    fArr2[length] = x43.i();
                    length++;
                }
                this.c = fArr2;
                x43.d(e);
            } else if (s == 29) {
                int w = nd7.w(x43, 29);
                float[] fArr3 = this.c;
                int length2 = fArr3 == null ? 0 : fArr3.length;
                int i3 = w + length2;
                float[] fArr4 = new float[i3];
                if (length2 != 0) {
                    System.arraycopy(fArr3, 0, fArr4, 0, length2);
                }
                while (length2 < i3 - 1) {
                    fArr4[length2] = x43.i();
                    x43.s();
                    length2++;
                }
                fArr4[length2] = x43.i();
                this.c = fArr4;
            } else if (!x43.u(s)) {
                break;
            }
        }
        return this;
    }

    public final void writeTo(y43 y43) {
        zob zob = this.a;
        if (zob != null) {
            y43.y(1, zob);
        }
        if (Float.floatToIntBits(this.b) != Float.floatToIntBits(0.0f)) {
            y43.v(2, this.b);
        }
        float[] fArr = this.c;
        if (fArr != null && fArr.length > 0) {
            int i = 0;
            while (true) {
                float[] fArr2 = this.c;
                if (i < fArr2.length) {
                    y43.v(3, fArr2[i]);
                    i++;
                } else {
                    return;
                }
            }
        }
    }
}
