package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: wre  reason: default package */
public final class wre implements ol7 {
    public final boolean a;
    public final String b;
    public final sba c;
    public final Drawable o;

    public wre(boolean z, String str, sba sba, Drawable drawable) {
        this.a = z;
        this.b = str;
        this.c = sba;
        this.o = drawable;
    }

    public static wre k(wre wre, boolean z, rre rre, int i) {
        if ((i & 1) != 0) {
            z = wre.a;
        }
        Drawable drawable = rre;
        if ((i & 8) != 0) {
            drawable = wre.o;
        }
        return new wre(z, wre.b, wre.c, drawable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.wre) r5;
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
            boolean r1 = r5 instanceof defpackage.wre
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            wre r5 = (defpackage.wre) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            sba r1 = r4.c
            sba r3 = r5.c
            boolean r1 = defpackage.tpa.f(r1, r3)
            if (r1 != 0) goto L_0x0029
            return r2
        L_0x0029:
            android.graphics.drawable.Drawable r4 = r4.o
            android.graphics.drawable.Drawable r5 = r5.o
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x0034
            return r2
        L_0x0034:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wre.equals(java.lang.Object):boolean");
    }

    public final long getItemId() {
        return (long) this.b.hashCode();
    }

    public final boolean h(ol7 ol7) {
        return getItemId() == ol7.getItemId();
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + rh4.d(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31;
        Drawable drawable = this.o;
        return hashCode + (drawable == null ? 0 : drawable.hashCode());
    }

    public final int l() {
        return 0;
    }

    public final Object n(Object obj) {
        boolean z;
        ol7 ol7 = (ol7) obj;
        wre wre = ol7 instanceof wre ? (wre) ol7 : null;
        if (wre == null || this.a == (z = wre.a)) {
            return null;
        }
        return new ure(z);
    }

    public final String toString() {
        return "ThemeItem(isSelected=" + this.a + ", themeName=" + this.b + ", theme=" + this.c + ", backgroundDrawable=" + this.o + ")";
    }
}
