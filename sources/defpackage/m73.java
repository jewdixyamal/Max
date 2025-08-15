package defpackage;

import java.util.Arrays;

/* renamed from: m73  reason: default package */
public final class m73 {
    public final l73 a;
    public final n73 b;
    public final q73 c;
    public final v73 d;
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
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int[] v;
    public final int[] w;
    public final int[] x;
    public final int[] y;

    public m73(l73 l73, n73 n73, q73 q73, v73 v73, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.a = l73;
        this.b = n73;
        this.c = q73;
        this.d = v73;
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
        this.o = i12;
        this.p = i13;
        this.q = i14;
        this.r = i15;
        this.s = i16;
        this.t = i17;
        this.u = i18;
        this.v = iArr;
        this.w = iArr2;
        this.x = iArr3;
        this.y = iArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m73)) {
            return false;
        }
        m73 m73 = (m73) obj;
        return tpa.f(this.a, m73.a) && tpa.f(this.b, m73.b) && tpa.f(this.c, m73.c) && tpa.f(this.d, m73.d) && this.e == m73.e && this.f == m73.f && this.g == m73.g && this.h == m73.h && this.i == m73.i && this.j == m73.j && this.k == m73.k && this.l == m73.l && this.m == m73.m && this.n == m73.n && this.o == m73.o && this.p == m73.p && this.q == m73.q && this.r == m73.r && this.s == m73.s && this.t == m73.t && this.u == m73.u && tpa.f(this.v, m73.v) && tpa.f(this.w, m73.w) && tpa.f(this.x, m73.x) && tpa.f(this.y, m73.y);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int e2 = k7d.e(1392508927, k7d.e(-1191182337, k7d.e(this.u, k7d.e(this.t, k7d.e(this.s, k7d.e(this.r, k7d.e(this.q, k7d.e(this.p, k7d.e(this.o, k7d.e(this.n, k7d.e(this.m, k7d.e(this.l, k7d.e(1543503872, k7d.e(this.k, k7d.e(-1, k7d.e(this.j, k7d.e(this.i, k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, (hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int hashCode4 = Arrays.hashCode(this.w);
        int hashCode5 = Arrays.hashCode(this.x);
        return Arrays.hashCode(this.y) + ((hashCode5 + ((hashCode4 + ((Arrays.hashCode(this.v) + e2) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.v);
        String arrays2 = Arrays.toString(this.w);
        String arrays3 = Arrays.toString(this.x);
        String arrays4 = Arrays.toString(this.y);
        StringBuilder sb = new StringBuilder("CommonBackgroundColors(chatBackground=");
        sb.append(this.a);
        sb.append(", fileType=");
        sb.append(this.b);
        sb.append(", skeleton=");
        sb.append(this.c);
        sb.append(", systemBubbleGradient=");
        sb.append(this.d);
        sb.append(", accent=");
        sb.append(this.e);
        sb.append(", capsule=");
        sb.append(this.f);
        sb.append(", capsuleOutside=");
        sb.append(this.g);
        sb.append(", capsuleSecondary=");
        sb.append(this.h);
        sb.append(", chatFAB=");
        sb.append(this.i);
        sb.append(", contrastFloatingSecondary=");
        sb.append(this.j);
        sb.append(", contrastStatic=-1, neutral=");
        sb.append(this.k);
        sb.append(", neutralFade=1543503872, neutralFadeSecondary=");
        sb.append(this.l);
        sb.append(", neutralFadeTertiary=");
        sb.append(this.m);
        sb.append(", neutralThemed=");
        sb.append(this.n);
        sb.append(", overlay=");
        sb.append(this.o);
        sb.append(", overlayHard=");
        sb.append(this.p);
        sb.append(", overlaySecondary=");
        sb.append(this.q);
        sb.append(", pattern=");
        sb.append(this.r);
        sb.append(", searchHighlight=");
        sb.append(this.s);
        sb.append(", stickerBlank=");
        sb.append(this.t);
        sb.append(", surfaceGround=");
        sb.append(this.u);
        sb.append(", timelineActive=-1191182337, timelinePassive=1392508927, capsuleGradient=");
        sb.append(arrays);
        sb.append(", capsuleSecondaryGradient=");
        sb.append(arrays2);
        sb.append(", glassLightGradient=");
        sb.append(arrays3);
        sb.append(", spaceThemeGradient=");
        return zr6.l(sb, arrays4, ")");
    }
}
