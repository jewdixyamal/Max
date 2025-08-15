package defpackage;

import java.util.Arrays;

/* renamed from: v73  reason: default package */
public final class v73 {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public v73(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = iArr;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v73)) {
            return false;
        }
        v73 v73 = (v73) obj;
        return tpa.f(this.a, v73.a) && this.b == v73.b && this.c == v73.c && this.d == v73.d && this.e == v73.e && this.f == v73.f && this.g == v73.g && this.h == v73.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + k7d.e(this.g, k7d.e(452984831, k7d.e(872415231, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Arrays.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder m = au1.m("CommonBackgroundSystemBubbleGradientColors(gradient=", Arrays.toString(this.a), ", qRBackground=");
        m.append(this.b);
        m.append(", qRStep1=");
        m.append(this.c);
        m.append(", qRStep2=");
        m.append(this.d);
        m.append(", qRStep3=");
        m.append(this.e);
        m.append(", qRStep4=");
        m.append(this.f);
        m.append(", strokeFadeStep1=872415231, strokeFadeStep2=452984831, strokeStep1=");
        m.append(this.g);
        m.append(", strokeStep2=");
        return zr6.j(m, this.h, ")");
    }
}
