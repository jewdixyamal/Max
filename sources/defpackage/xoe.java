package defpackage;

/* renamed from: xoe  reason: default package */
public final class xoe {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public xoe(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        this.a = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
        this.f = i7;
        this.g = i8;
        this.h = i9;
        this.i = i10;
        this.j = i11;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.xoe) r5;
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
            boolean r1 = r5 instanceof defpackage.xoe
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            xoe r5 = (defpackage.xoe) r5
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
            int r1 = r4.g
            int r3 = r5.g
            if (r1 == r3) goto L_0x003d
            return r2
        L_0x003d:
            int r1 = r4.h
            int r3 = r5.h
            if (r1 == r3) goto L_0x0044
            return r2
        L_0x0044:
            int r1 = r4.i
            int r3 = r5.i
            if (r1 == r3) goto L_0x004b
            return r2
        L_0x004b:
            int r4 = r4.j
            int r5 = r5.j
            if (r4 == r5) goto L_0x0052
            return r2
        L_0x0052:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xoe.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + k7d.e(this.i, k7d.e(this.h, k7d.e(this.g, k7d.e(this.f, k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, k7d.e(-520093697, k7d.e(-1, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextColors(contrast=");
        sb.append(this.a);
        sb.append(", contrastStatic=-1, fileType=-520093697, negative=");
        sb.append(this.b);
        sb.append(", neutralThemed=");
        sb.append(this.c);
        sb.append(", positive=");
        sb.append(this.d);
        sb.append(", primary=");
        sb.append(this.e);
        sb.append(", primaryStatic=");
        sb.append(this.f);
        sb.append(", secondary=");
        sb.append(this.g);
        sb.append(", subhead=");
        sb.append(this.h);
        sb.append(", tertiary=");
        sb.append(this.i);
        sb.append(", themed=");
        return zr6.j(sb, this.j, ")");
    }
}
