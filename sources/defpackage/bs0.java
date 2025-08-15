package defpackage;

import java.util.Arrays;

/* renamed from: bs0  reason: default package */
public final class bs0 {
    public final as0 a;
    public final cs0 b;
    public final gs0 c;
    public final hs0 d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int[] o;
    public final int[] p;

    public bs0(as0 as0, cs0 cs0, gs0 gs0, hs0 hs0, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int[] iArr, int[] iArr2) {
        this.a = as0;
        this.b = cs0;
        this.c = gs0;
        this.d = hs0;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        this.j = i7;
        this.k = i8;
        this.l = i9;
        this.m = i10;
        this.n = i11;
        this.o = iArr;
        this.p = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bs0)) {
            return false;
        }
        bs0 bs0 = (bs0) obj;
        return tpa.f(this.a, bs0.a) && tpa.f(this.b, bs0.b) && tpa.f(this.c, bs0.c) && tpa.f(this.d, bs0.d) && this.e == bs0.e && this.f == bs0.f && this.g == bs0.g && this.h == bs0.h && this.i == bs0.i && this.j == bs0.j && this.k == bs0.k && this.l == bs0.l && this.m == bs0.m && this.n == bs0.n && tpa.f(this.o, bs0.o) && tpa.f(this.p, bs0.p);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int e2 = k7d.e(this.n, k7d.e(this.m, k7d.e(this.l, k7d.e(this.k, k7d.e(this.j, k7d.e(this.i, k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, (hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        return Arrays.hashCode(this.p) + ((Arrays.hashCode(this.o) + e2) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.o);
        String arrays2 = Arrays.toString(this.p);
        StringBuilder sb = new StringBuilder("BubbleBackgroundColors(botButton=");
        sb.append(this.a);
        sb.append(", focus=");
        sb.append(this.b);
        sb.append(", reaction=");
        sb.append(this.c);
        sb.append(", systemAssetGradient=");
        sb.append(this.d);
        sb.append(", action=");
        sb.append(this.e);
        sb.append(", actionFade=");
        sb.append(this.f);
        sb.append(", actionSecondary=");
        sb.append(this.g);
        sb.append(", bubbleSimple=");
        sb.append(this.h);
        sb.append(", iconItem=");
        sb.append(this.i);
        sb.append(", iconItemNegative=");
        sb.append(this.j);
        sb.append(", mention=");
        sb.append(this.k);
        sb.append(", mentionPressed=");
        sb.append(this.l);
        sb.append(", surfaceSecondary=");
        sb.append(this.m);
        sb.append(", textFocus=");
        sb.append(this.n);
        sb.append(", bubbleGradient=");
        sb.append(arrays);
        sb.append(", bubbleOldGradient=");
        return zr6.l(sb, arrays2, ")");
    }
}
