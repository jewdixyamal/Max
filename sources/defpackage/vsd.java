package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: vsd  reason: default package */
public final class vsd {
    public final PointF a = new PointF();
    public final RectF b = new RectF();
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public int p;
    public final xh9 q;
    public final RectF r;
    public float s;

    /* JADX WARNING: type inference failed for: r0v2, types: [xh9, java.lang.Object] */
    public vsd() {
        ? obj = new Object();
        obj.a = new float[16];
        this.q = obj;
        this.r = new RectF();
    }

    public final float a(float f2) {
        int i2 = this.p;
        RectF rectF = this.r;
        if (i2 <= 1) {
            return rectF.left;
        }
        xh9 xh9 = this.q;
        int i3 = 0;
        float a2 = (xh9.a(1) - xh9.a(0)) / 2.0f;
        int i4 = xh9.b - 1;
        float f3 = rectF.left;
        while (i3 <= i4) {
            int i5 = (i3 + i4) / 2;
            float a3 = xh9.a(i5);
            float f4 = a3 - f2;
            if (Math.abs(f4) <= a2) {
                return a3;
            }
            if (Math.abs(f4) < Math.abs(f3 - f2)) {
                f3 = a3;
            }
            if (a3 < f2) {
                i3 = i5 + 1;
            } else {
                i4 = i5 - 1;
            }
        }
        return f3;
    }

    public final void b(int i2) {
        this.p = i2;
        RectF rectF = this.r;
        float G = (float) tu0.G(rectF.width());
        int i3 = this.p - 1;
        if (i3 < 1) {
            i3 = 1;
        }
        float f2 = G / ((float) i3);
        int G2 = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        int i4 = this.f;
        float f3 = (((float) ((this.d - i4) - this.h)) / 2.0f) + ((float) i4);
        float f4 = ((float) G2) / 2.0f;
        this.n = f3 - f4;
        this.o = f3 + f4;
        float f5 = rectF.left;
        int i5 = this.p;
        xh9 xh9 = this.q;
        float[] fArr = xh9.a;
        if (fArr.length < i5) {
            xh9.a = Arrays.copyOf(fArr, Math.max(i5, (fArr.length * 3) / 2));
        }
        int i6 = this.p;
        for (int i7 = 0; i7 < i6; i7++) {
            float f6 = (((float) i7) * f2) + f5;
            int i8 = xh9.b;
            if (i8 <= i7) {
                int i9 = i8 + 1;
                float[] fArr2 = xh9.a;
                if (fArr2.length < i9) {
                    xh9.a = Arrays.copyOf(fArr2, Math.max(i9, (fArr2.length * 3) / 2));
                }
                float[] fArr3 = xh9.a;
                int i10 = xh9.b;
                fArr3[i10] = f6;
                xh9.b = i10 + 1;
            } else if (i7 < 0 || i7 >= i8) {
                StringBuilder n2 = rh4.n(i7, "set index ", " must be between 0 .. ");
                n2.append(xh9.b - 1);
                throw new IndexOutOfBoundsException(n2.toString());
            } else {
                float[] fArr4 = xh9.a;
                float f7 = fArr4[i7];
                fArr4[i7] = f6;
            }
        }
    }

    public final void c(float f2) {
        RectF rectF = this.r;
        this.s = ote.d(f2, rectF.left, rectF.right);
    }

    public final void d() {
        RectF rectF = this.r;
        int i2 = this.f;
        float f2 = (((float) ((this.d - i2) - this.h)) / 2.0f) + ((float) i2);
        rectF.top = f2;
        rectF.bottom = f2;
        float b2 = ote.b(((float) this.e) + this.i, 0.0f);
        rectF.left = b2;
        float b3 = ote.b(((float) (this.c - this.g)) - this.k, b2);
        rectF.right = b3;
        this.s = ote.d(this.s, rectF.left, b3);
    }
}
