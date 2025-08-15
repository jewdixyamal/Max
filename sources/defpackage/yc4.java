package defpackage;

/* renamed from: yc4  reason: default package */
public final class yc4 {
    public final String a;
    public int b;
    public long c;
    public final yj8 d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ zc4 g;

    public yc4(zc4 zc4, String str, int i, yj8 yj8) {
        this.g = zc4;
        this.a = str;
        this.b = i;
        this.c = yj8 == null ? -1 : yj8.d;
        if (yj8 != null && yj8.b()) {
            this.d = yj8;
        }
    }

    public final boolean a(fd fdVar) {
        yj8 yj8 = fdVar.d;
        if (yj8 == null) {
            return this.b != fdVar.c;
        }
        long j = this.c;
        if (j == -1) {
            return false;
        }
        if (yj8.d > j) {
            return true;
        }
        yj8 yj82 = this.d;
        if (yj82 == null) {
            return false;
        }
        mue mue = fdVar.b;
        int b2 = mue.b(yj8.a);
        int b3 = mue.b(yj82.a);
        if (yj8.d < yj82.d || b2 < b3) {
            return false;
        }
        if (b2 > b3) {
            return true;
        }
        boolean b4 = yj8.b();
        int i = yj82.b;
        if (b4) {
            int i2 = yj8.b;
            if (i2 <= i) {
                return i2 == i && yj8.c > yj82.c;
            }
            return true;
        }
        int i3 = yj8.e;
        return i3 == -1 || i3 > i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0 < r8.p()) goto L_0x0037;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(defpackage.mue r7, defpackage.mue r8) {
        /*
            r6 = this;
            int r0 = r6.b
            int r1 = r7.p()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L_0x0011
            int r7 = r8.p()
            if (r0 >= r7) goto L_0x0036
            goto L_0x0037
        L_0x0011:
            zc4 r1 = r6.g
            kue r4 = r1.a
            r7.o(r0, r4)
            kue r0 = r1.a
            int r4 = r0.n
        L_0x001c:
            int r5 = r0.o
            if (r4 > r5) goto L_0x0036
            java.lang.Object r5 = r7.m(r4)
            int r5 = r8.b(r5)
            if (r5 == r3) goto L_0x0033
            hue r7 = r1.b
            hue r7 = r8.g(r5, r7, r2)
            int r0 = r7.c
            goto L_0x0037
        L_0x0033:
            int r4 = r4 + 1
            goto L_0x001c
        L_0x0036:
            r0 = r3
        L_0x0037:
            r6.b = r0
            if (r0 != r3) goto L_0x003c
            return r2
        L_0x003c:
            yj8 r6 = r6.d
            r7 = 1
            if (r6 != 0) goto L_0x0042
            return r7
        L_0x0042:
            java.lang.Object r6 = r6.a
            int r6 = r8.b(r6)
            if (r6 == r3) goto L_0x004b
            r2 = r7
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yc4.b(mue, mue):boolean");
    }
}
