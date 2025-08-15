package defpackage;

/* renamed from: w86  reason: default package */
public final class w86 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final jic f;
    public final boolean g = false;
    public final jic h;

    public w86(int i, int i2, int i3, int i4, int i5, jic jic) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = jic;
        this.h = i5 <= 0 ? null : new jic(0.0f, i5, i5, 12);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.w86) r5;
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
            boolean r1 = r5 instanceof defpackage.w86
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            w86 r5 = (defpackage.w86) r5
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
            jic r1 = r4.f
            jic r3 = r5.f
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x003a
            return r2
        L_0x003a:
            boolean r4 = r4.g
            boolean r5 = r5.g
            if (r4 == r5) goto L_0x0041
            return r2
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w86.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int e2 = k7d.e(this.e, k7d.e(this.d, k7d.e(this.c, k7d.e(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31);
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + e2) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GalleryUiOptions(cellSize=");
        sb.append(this.a);
        sb.append(", threshold=");
        sb.append(this.b);
        sb.append(", spanCount=");
        sb.append(this.c);
        sb.append(", spanSpacing=");
        sb.append(this.d);
        sb.append(", thumbnailSize=");
        sb.append(this.e);
        sb.append(", albumsCoverResizeOptions=");
        sb.append(this.f);
        sb.append(", isItemAnimatorEnabled=");
        return au1.j(sb, this.g, ")");
    }
}
