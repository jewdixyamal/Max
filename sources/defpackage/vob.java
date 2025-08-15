package defpackage;

/* renamed from: vob  reason: default package */
public final class vob extends qw8 {
    public static volatile vob[] c;
    public int a = 0;
    public float[] b = nd7.e;

    public vob() {
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i = this.a;
        int f = i != 0 ? y43.f(1, i) : 0;
        float[] fArr = this.b;
        return (fArr == null || fArr.length <= 0) ? f : (fArr.length * 4) + f + fArr.length;
    }

    public final qw8 mergeFrom(x43 x43) {
        while (true) {
            int s = x43.s();
            if (s == 0) {
                break;
            } else if (s == 8) {
                int p = x43.p();
                if (p == 0 || p == 1) {
                    this.a = p;
                }
            } else if (s == 18) {
                int p2 = x43.p();
                int e = x43.e(p2);
                int i = p2 / 4;
                float[] fArr = this.b;
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
                this.b = fArr2;
                x43.d(e);
            } else if (s == 21) {
                int w = nd7.w(x43, 21);
                float[] fArr3 = this.b;
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
                this.b = fArr4;
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
        float[] fArr = this.b;
        if (fArr != null && fArr.length > 0) {
            int i2 = 0;
            while (true) {
                float[] fArr2 = this.b;
                if (i2 < fArr2.length) {
                    y43.v(2, fArr2[i2]);
                    i2++;
                } else {
                    return;
                }
            }
        }
    }
}
