package defpackage;

import java.util.ArrayList;

/* renamed from: ws  reason: default package */
public class ws {
    public sud a = null;
    public float b = 0.0f;
    public final ArrayList c = new ArrayList();
    public final ks d;
    public boolean e = false;

    public ws(cjg cjg) {
        this.d = new ks(this, cjg);
    }

    public final void a(zh7 zh7, int i) {
        this.d.j(zh7.j(i), 1.0f);
        this.d.j(zh7.j(i), -1.0f);
    }

    public final void b(sud sud, sud sud2, sud sud3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.d.j(sud, -1.0f);
            this.d.j(sud2, 1.0f);
            this.d.j(sud3, 1.0f);
            return;
        }
        this.d.j(sud, 1.0f);
        this.d.j(sud2, -1.0f);
        this.d.j(sud3, -1.0f);
    }

    public final void c(sud sud, sud sud2, sud sud3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.b = (float) i;
        }
        if (!z) {
            this.d.j(sud, -1.0f);
            this.d.j(sud2, 1.0f);
            this.d.j(sud3, -1.0f);
            return;
        }
        this.d.j(sud, 1.0f);
        this.d.j(sud2, -1.0f);
        this.d.j(sud3, 1.0f);
    }

    public sud d(boolean[] zArr) {
        return f(zArr, (sud) null);
    }

    public boolean e() {
        return this.a == null && this.b == 0.0f && this.d.f() == 0;
    }

    public final sud f(boolean[] zArr, sud sud) {
        int i;
        int f = this.d.f();
        sud sud2 = null;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < f; i2++) {
            float h = this.d.h(i2);
            if (h < 0.0f) {
                sud g = this.d.g(i2);
                if ((zArr == null || !zArr[g.b]) && g != sud && (((i = g.w0) == 3 || i == 4) && h < f2)) {
                    f2 = h;
                    sud2 = g;
                }
            }
        }
        return sud2;
    }

    public final void g(sud sud) {
        sud sud2 = this.a;
        if (sud2 != null) {
            this.d.j(sud2, -1.0f);
            this.a.c = -1;
            this.a = null;
        }
        float k = this.d.k(sud, true) * -1.0f;
        this.a = sud;
        if (k != 1.0f) {
            this.b /= k;
            this.d.d(k);
        }
    }

    public final void h(zh7 zh7, sud sud, boolean z) {
        if (sud != null && sud.Y) {
            float e2 = this.d.e(sud);
            this.b = (sud.X * e2) + this.b;
            this.d.k(sud, z);
            if (z) {
                sud.b(this);
            }
            if (this.d.f() == 0) {
                this.e = true;
                zh7.a = true;
            }
        }
    }

    public void i(zh7 zh7, ws wsVar, boolean z) {
        float l = this.d.l(wsVar, z);
        this.b = (wsVar.b * l) + this.b;
        if (z) {
            wsVar.a.b(this);
        }
        if (this.a != null && this.d.f() == 0) {
            this.e = true;
            zh7.a = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0047, code lost:
        r7 = r10.d.h(r4);
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r10 = this;
            sud r0 = r10.a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0017
        L_0x0007:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = ""
            r0.<init>(r1)
            sud r1 = r10.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0017:
            java.lang.String r1 = " = "
            java.lang.String r0 = defpackage.au1.g(r0, r1)
            float r1 = r10.b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0035
            java.lang.StringBuilder r0 = defpackage.au1.l(r0)
            float r1 = r10.b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r3
            goto L_0x0036
        L_0x0035:
            r1 = r4
        L_0x0036:
            ks r5 = r10.d
            int r5 = r5.f()
        L_0x003c:
            if (r4 >= r5) goto L_0x009c
            ks r6 = r10.d
            sud r6 = r6.g(r4)
            if (r6 != 0) goto L_0x0047
            goto L_0x0099
        L_0x0047:
            ks r7 = r10.d
            float r7 = r7.h(r4)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x0052
            goto L_0x0099
        L_0x0052:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0066
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0076
            java.lang.String r1 = "- "
            java.lang.String r0 = defpackage.au1.g(r0, r1)
        L_0x0064:
            float r7 = r7 * r9
            goto L_0x0076
        L_0x0066:
            if (r8 <= 0) goto L_0x006f
            java.lang.String r1 = " + "
            java.lang.String r0 = defpackage.au1.g(r0, r1)
            goto L_0x0076
        L_0x006f:
            java.lang.String r1 = " - "
            java.lang.String r0 = defpackage.au1.g(r0, r1)
            goto L_0x0064
        L_0x0076:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x0081
            java.lang.String r0 = defpackage.au1.g(r0, r6)
            goto L_0x0098
        L_0x0081:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
        L_0x0098:
            r1 = r3
        L_0x0099:
            int r4 = r4 + 1
            goto L_0x003c
        L_0x009c:
            if (r1 != 0) goto L_0x00a4
            java.lang.String r10 = "0.0"
            java.lang.String r0 = defpackage.au1.g(r0, r10)
        L_0x00a4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ws.toString():java.lang.String");
    }
}
