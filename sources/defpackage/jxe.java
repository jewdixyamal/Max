package defpackage;

/* renamed from: jxe  reason: default package */
public final class jxe {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public jxe(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.jxe) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.jxe
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            jxe r5 = (defpackage.jxe) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            int r1 = r4.b
            int r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            int r1 = r4.c
            int r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            int r1 = r4.d
            int r3 = r5.d
            if (r1 == r3) goto L_0x0028
            return r2
        L_0x0028:
            int r1 = r4.e
            int r3 = r5.e
            if (r1 == r3) goto L_0x002f
            return r2
        L_0x002f:
            int r1 = r4.f
            int r3 = r5.f
            if (r1 == r3) goto L_0x0036
            return r2
        L_0x0036:
            int r4 = r4.g
            int r5 = r5.g
            if (r4 == r5) goto L_0x003d
            return r2
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jxe.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, k7d.e(-1, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopbarIconDefaultColors(contrast=");
        sb.append(this.a);
        sb.append(", contrastStatic=-1, neutralFade=");
        sb.append(this.b);
        sb.append(", primary=");
        sb.append(this.c);
        sb.append(", quaternary=");
        sb.append(this.d);
        sb.append(", secondary=");
        sb.append(this.e);
        sb.append(", tertiary=");
        sb.append(this.f);
        sb.append(", themed=");
        return zr6.j(sb, this.g, ")");
    }
}
