package defpackage;

/* renamed from: bxc  reason: default package */
public final class bxc {
    public static final bxc e = new bxc(0, false, false, (axc) null);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final axc d;

    public bxc(int i, boolean z, boolean z2, axc axc) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = axc;
    }

    public static bxc a(bxc bxc, int i, boolean z, boolean z2, axc axc, int i2) {
        if ((i2 & 1) != 0) {
            i = bxc.a;
        }
        if ((i2 & 2) != 0) {
            z = bxc.b;
        }
        if ((i2 & 4) != 0) {
            z2 = bxc.c;
        }
        if ((i2 & 8) != 0) {
            axc = bxc.d;
        }
        bxc.getClass();
        return new bxc(i, z, z2, axc);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.bxc) r5;
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
            boolean r1 = r5 instanceof defpackage.bxc
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            bxc r5 = (defpackage.bxc) r5
            int r1 = r5.a
            int r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            boolean r1 = r4.b
            boolean r3 = r5.b
            if (r1 == r3) goto L_0x001a
            return r2
        L_0x001a:
            boolean r1 = r4.c
            boolean r3 = r5.c
            if (r1 == r3) goto L_0x0021
            return r2
        L_0x0021:
            axc r4 = r4.d
            axc r5 = r5.d
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 != 0) goto L_0x002c
            return r2
        L_0x002c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxc.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int d2 = ms2.d(ms2.d(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        axc axc = this.d;
        return d2 + (axc == null ? 0 : axc.hashCode());
    }

    public final String toString() {
        return "ScrollState(unreadMessages=" + this.a + ", isUnreadButtonVisible=" + this.b + ", isMentionButtonVisible=" + this.c + ", lastReaction=" + this.d + ")";
    }
}
