package defpackage;

import android.graphics.Rect;
import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: rdf  reason: default package */
public final class rdf extends l9f {
    public static final pdf D = new Object();
    public qdf A;
    public cad B;
    public final xrb C = new xrb(2, this);
    public xf4 p;
    public iee q;
    public ub0 r = ub0.d;
    public bad s = new aad();
    public oq1 t = null;
    public see u;
    public int v = 3;
    public nw4 w;
    public Rect x;
    public int y;
    public boolean z = false;

    /* JADX WARNING: type inference failed for: r2v2, types: [bad, aad] */
    public rdf(sdf sdf) {
        super(sdf);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0027 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void F(java.util.HashSet r2, int r3, int r4, android.util.Size r5, defpackage.dff r6) {
        /*
            int r0 = r5.getWidth()
            if (r3 > r0) goto L_0x0041
            int r5 = r5.getHeight()
            if (r4 <= r5) goto L_0x000d
            goto L_0x0041
        L_0x000d:
            android.util.Range r5 = r6.v1(r3)     // Catch:{ IllegalArgumentException -> 0x0027 }
            android.util.Size r0 = new android.util.Size     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.lang.Comparable r5 = r5.clamp(r1)     // Catch:{ IllegalArgumentException -> 0x0027 }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ IllegalArgumentException -> 0x0027 }
            int r5 = r5.intValue()     // Catch:{ IllegalArgumentException -> 0x0027 }
            r0.<init>(r3, r5)     // Catch:{ IllegalArgumentException -> 0x0027 }
            r2.add(r0)     // Catch:{ IllegalArgumentException -> 0x0027 }
        L_0x0027:
            android.util.Range r5 = r6.r1(r4)     // Catch:{ IllegalArgumentException -> 0x0041 }
            android.util.Size r6 = new android.util.Size     // Catch:{ IllegalArgumentException -> 0x0041 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0041 }
            java.lang.Comparable r3 = r5.clamp(r3)     // Catch:{ IllegalArgumentException -> 0x0041 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ IllegalArgumentException -> 0x0041 }
            int r3 = r3.intValue()     // Catch:{ IllegalArgumentException -> 0x0041 }
            r6.<init>(r3, r4)     // Catch:{ IllegalArgumentException -> 0x0041 }
            r2.add(r6)     // Catch:{ IllegalArgumentException -> 0x0041 }
        L_0x0041:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdf.F(java.util.HashSet, int, int, android.util.Size, dff):void");
    }

    public static int G(boolean z2, int i, int i2, Range range) {
        int i3 = i % i2;
        if (i3 != 0) {
            i = z2 ? i - i3 : i + (i2 - i3);
        }
        return ((Integer) range.clamp(Integer.valueOf(i))).intValue();
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [mde] */
    /* JADX WARNING: type inference failed for: r1v2, types: [cff] */
    /* JADX WARNING: type inference failed for: r1v3, types: [fc3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.dff O(defpackage.l66 r9, defpackage.nc0 r10, defpackage.ab0 r11, android.util.Size r12, defpackage.eu4 r13, android.util.Range r14) {
        /*
            kc0 r0 = defpackage.eef.b(r11, r13, r10)
            bue r3 = defpackage.bue.a
            mc0 r4 = r11.a
            ha0 r6 = r0.c
            if (r6 == 0) goto L_0x0018
            fc3 r11 = new fc3
            java.lang.String r2 = r0.a
            r1 = r11
            r5 = r12
            r7 = r13
            r8 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x0023
        L_0x0018:
            cff r11 = new cff
            java.lang.String r2 = r0.a
            r1 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7)
        L_0x0023:
            java.lang.Object r11 = r11.get()
            ic0 r11 = (defpackage.ic0) r11
            java.lang.Object r9 = r9.apply(r11)
            dff r9 = (defpackage.dff) r9
            r11 = 0
            if (r9 != 0) goto L_0x0033
            return r11
        L_0x0033:
            if (r10 == 0) goto L_0x0040
            android.util.Size r11 = new android.util.Size
            ha0 r10 = r10.f
            int r12 = r10.e
            int r10 = r10.f
            r11.<init>(r12, r10)
        L_0x0040:
            dff r9 = defpackage.fff.a(r9, r11)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdf.O(l66, nc0, ab0, android.util.Size, eu4, android.util.Range):dff");
    }

    public final void C(Rect rect) {
        this.i = rect;
        P();
    }

    public final void H(bad bad, ub0 ub0, vb0 vb0) {
        xf4 xf4;
        boolean z2 = true;
        boolean z3 = ub0.a == -1;
        if (ub0.b != 1) {
            z2 = false;
        }
        if (!z3 || !z2) {
            bad.a.clear();
            ((HashSet) bad.b.e).clear();
            eu4 eu4 = vb0.b;
            if (!z3 && (xf4 = this.p) != null) {
                if (z2) {
                    bad.b(xf4, eu4, -1);
                } else {
                    xe5 a = rb0.a(xf4);
                    if (eu4 != null) {
                        a.Y = eu4;
                        bad.a.add(a.a());
                    } else {
                        throw new NullPointerException("Null dynamicRange");
                    }
                }
            }
            oq1 oq1 = this.t;
            if (oq1 != null) {
                oq1.cancel(false);
            }
            oq1 g = f8.g(new ypc(this, 23, bad));
            this.t = g;
            kq0.a(g, new td((Object) this, (Object) g, z2, 16), ju0.D());
            return;
        }
        throw new IllegalStateException("Unexpected stream state, stream is error but active");
    }

    public final void I() {
        kq0.e();
        cad cad = this.B;
        if (cad != null) {
            cad.b();
            this.B = null;
        }
        xf4 xf4 = this.p;
        if (xf4 != null) {
            xf4.a();
            this.p = null;
        }
        nw4 nw4 = this.w;
        if (nw4 != null) {
            nw4.n();
            this.w = null;
        }
        iee iee = this.q;
        if (iee != null) {
            iee.c();
            this.q = null;
        }
        this.x = null;
        this.u = null;
        this.r = ub0.d;
        this.y = 0;
        this.z = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v6, resolved type: ab0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v56, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v57, resolved type: ab0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v59, resolved type: ab0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bad J(defpackage.sdf r28, defpackage.vb0 r29) {
        /*
            r27 = this;
            r0 = r27
            r8 = r28
            r9 = r29
            defpackage.kq0.e()
            ax1 r10 = r27.c()
            r10.getClass()
            android.util.Size r7 = r9.a
            ule r11 = new ule
            r1 = 10
            r11.<init>(r1, r0)
            android.util.Range r1 = r9.c
            android.util.Range r2 = defpackage.vb0.f
            boolean r2 = java.util.Objects.equals(r1, r2)
            if (r2 == 0) goto L_0x0025
            android.util.Range r1 = defpackage.pdf.b
        L_0x0025:
            r12 = r1
            wjf r1 = r27.L()
            ry9 r1 = r1.b()
            bm7 r1 = r1.j()
            boolean r2 = r1.isDone()
            if (r2 != 0) goto L_0x003a
            r1 = 0
            goto L_0x003e
        L_0x003a:
            java.lang.Object r1 = r1.get()     // Catch:{ InterruptedException | ExecutionException -> 0x049f }
        L_0x003e:
            r3 = r1
            ab0 r3 = (defpackage.ab0) r3
            java.util.Objects.requireNonNull(r3)
            yw1 r1 = r10.p()
            wjf r2 = r27.L()
            kdf r1 = r2.g(r1)
            eu4 r14 = r9.b
            nc0 r2 = r1.a(r7, r14)
            aa0 r1 = defpackage.sdf.c
            java.lang.Object r1 = r8.h(r1)
            l66 r1 = (defpackage.l66) r1
            java.util.Objects.requireNonNull(r1)
            r4 = r7
            r5 = r14
            r6 = r12
            dff r1 = O(r1, r2, r3, r4, r5, r6)
            int r2 = r0.K(r10)
            r0.y = r2
            android.graphics.Rect r2 = r0.i
            r3 = 0
            if (r2 == 0) goto L_0x0074
            goto L_0x0081
        L_0x0074:
            android.graphics.Rect r2 = new android.graphics.Rect
            int r4 = r7.getWidth()
            int r5 = r7.getHeight()
            r2.<init>(r3, r3, r4, r5)
        L_0x0081:
            r15 = 1
            if (r1 == 0) goto L_0x0092
            int r4 = r2.width()
            int r5 = r2.height()
            boolean r4 = r1.Q0(r4, r5)
            if (r4 == 0) goto L_0x0097
        L_0x0092:
            r6 = r3
            r16 = r11
            goto L_0x0206
        L_0x0097:
            java.lang.String r4 = defpackage.e1f.f(r2)
            int r5 = r1.a1()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = r1.w1()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            android.util.Range r13 = r1.x1()
            android.util.Range r3 = r1.E1()
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r5, r6, r13, r3}
            java.lang.String r4 = "Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s"
            java.lang.String.format(r4, r3)
            android.util.Range r3 = r1.x1()
            int r4 = r2.width()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x00e1
            android.util.Range r3 = r1.E1()
            int r4 = r2.height()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x00e1
            goto L_0x0111
        L_0x00e1:
            boolean r3 = r1.h1()
            if (r3 == 0) goto L_0x0111
            android.util.Range r3 = r1.E1()
            int r4 = r2.width()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0111
            android.util.Range r3 = r1.x1()
            int r4 = r2.height()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L_0x0111
            lge r3 = new lge
            r3.<init>(r1)
            goto L_0x0112
        L_0x0111:
            r3 = r1
        L_0x0112:
            int r4 = r3.a1()
            int r5 = r3.w1()
            android.util.Range r6 = r3.x1()
            android.util.Range r13 = r3.E1()
            int r9 = r2.width()
            int r9 = G(r15, r9, r4, r6)
            int r15 = r2.width()
            r16 = r11
            r11 = 0
            int r4 = G(r11, r15, r4, r6)
            int r6 = r2.height()
            r15 = 1
            int r6 = G(r15, r6, r5, r13)
            int r15 = r2.height()
            int r5 = G(r11, r15, r5, r13)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            F(r11, r9, r6, r7, r3)
            F(r11, r9, r5, r7, r3)
            F(r11, r4, r6, r7, r3)
            F(r11, r4, r5, r7, r3)
            boolean r3 = r11.isEmpty()
            if (r3 == 0) goto L_0x0160
        L_0x015d:
            r6 = 0
            goto L_0x0206
        L_0x0160:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r11)
            r3.toString()
            ca3 r4 = new ca3
            r5 = 7
            r4.<init>(r5, r2)
            java.util.Collections.sort(r3, r4)
            r3.toString()
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            android.util.Size r3 = (android.util.Size) r3
            int r4 = r3.getWidth()
            int r3 = r3.getHeight()
            int r5 = r2.width()
            if (r4 != r5) goto L_0x0190
            int r5 = r2.height()
            if (r3 != r5) goto L_0x0190
            goto L_0x015d
        L_0x0190:
            int r5 = r4 % 2
            if (r5 != 0) goto L_0x01a7
            int r5 = r3 % 2
            if (r5 != 0) goto L_0x01a7
            int r5 = r7.getWidth()
            if (r4 > r5) goto L_0x01a7
            int r5 = r7.getHeight()
            if (r3 > r5) goto L_0x01a7
            r5 = 1
        L_0x01a5:
            r6 = 0
            goto L_0x01a9
        L_0x01a7:
            r5 = 0
            goto L_0x01a5
        L_0x01a9:
            defpackage.c54.p(r6, r5)
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r2)
            int r6 = r2.width()
            if (r4 == r6) goto L_0x01d7
            int r6 = r2.centerX()
            int r9 = r4 / 2
            int r6 = r6 - r9
            r9 = 0
            int r6 = java.lang.Math.max(r9, r6)
            r5.left = r6
            int r6 = r6 + r4
            r5.right = r6
            int r9 = r7.getWidth()
            if (r6 <= r9) goto L_0x01d7
            int r6 = r7.getWidth()
            r5.right = r6
            int r6 = r6 - r4
            r5.left = r6
        L_0x01d7:
            int r4 = r2.height()
            if (r3 == r4) goto L_0x01fe
            int r4 = r2.centerY()
            int r6 = r3 / 2
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r5.top = r4
            int r4 = r4 + r3
            r5.bottom = r4
            int r9 = r7.getHeight()
            if (r4 <= r9) goto L_0x01ff
            int r4 = r7.getHeight()
            r5.bottom = r4
            int r4 = r4 - r3
            r5.top = r4
            goto L_0x01ff
        L_0x01fe:
            r6 = 0
        L_0x01ff:
            defpackage.e1f.f(r2)
            defpackage.e1f.f(r5)
            r2 = r5
        L_0x0206:
            int r3 = r0.y
            ub0 r4 = r0.r
            cc0 r4 = r4.c
            if (r4 == 0) goto L_0x0220
            r4.getClass()
            android.graphics.Rect r4 = r4.a
            android.util.Size r4 = defpackage.e1f.e(r4)
            android.util.Size r3 = defpackage.e1f.g(r4, r3)
            android.graphics.Rect r3 = defpackage.e1f.h(r3)
            goto L_0x0221
        L_0x0220:
            r3 = r2
        L_0x0221:
            r0.x = r3
            ub0 r4 = r0.r
            cc0 r4 = r4.c
            if (r4 == 0) goto L_0x0259
            boolean r4 = r3.equals(r2)
            if (r4 != 0) goto L_0x0259
            int r3 = r3.height()
            float r3 = (float) r3
            int r2 = r2.height()
            float r2 = (float) r2
            float r3 = r3 / r2
            android.util.Size r2 = new android.util.Size
            int r4 = r7.getWidth()
            float r4 = (float) r4
            float r4 = r4 * r3
            double r4 = (double) r4
            double r4 = java.lang.Math.ceil(r4)
            int r4 = (int) r4
            int r5 = r7.getHeight()
            float r5 = (float) r5
            float r5 = r5 * r3
            r3 = r7
            double r6 = (double) r5
            double r5 = java.lang.Math.ceil(r6)
            int r5 = (int) r5
            r2.<init>(r4, r5)
            goto L_0x025b
        L_0x0259:
            r3 = r7
            r2 = r3
        L_0x025b:
            ub0 r4 = r0.r
            cc0 r4 = r4.c
            if (r4 == 0) goto L_0x0264
            r4 = 1
            r0.z = r4
        L_0x0264:
            android.graphics.Rect r4 = r0.x
            int r11 = r0.y
            boolean r5 = r0.M(r10, r8, r4, r3)
            bj6 r6 = defpackage.xi4.a
            java.lang.Class<androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk> r7 = androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk.class
            vrb r6 = r6.e(r7)
            androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk r6 = (androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk) r6
            if (r6 == 0) goto L_0x02e6
            if (r5 == 0) goto L_0x027b
            goto L_0x027c
        L_0x027b:
            r11 = 0
        L_0x027c:
            android.util.Size r5 = defpackage.e1f.e(r4)
            android.util.Size r5 = defpackage.e1f.g(r5, r11)
            java.lang.String r6 = "motorola"
            java.lang.String r7 = android.os.Build.BRAND
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x02ab
            java.lang.String r6 = "moto c"
            java.lang.String r7 = android.os.Build.MODEL
            boolean r6 = r6.equalsIgnoreCase(r7)
            if (r6 == 0) goto L_0x02ab
            java.util.HashSet r6 = new java.util.HashSet
            android.util.Size r7 = new android.util.Size
            r9 = 720(0x2d0, float:1.009E-42)
            r11 = 1280(0x500, float:1.794E-42)
            r7.<init>(r9, r11)
            java.util.List r7 = java.util.Collections.singletonList(r7)
            r6.<init>(r7)
            goto L_0x02af
        L_0x02ab:
            java.util.Set r6 = java.util.Collections.emptySet()
        L_0x02af:
            boolean r6 = r6.contains(r5)
            if (r6 != 0) goto L_0x02b6
            goto L_0x02e6
        L_0x02b6:
            if (r1 == 0) goto L_0x02bf
            int r1 = r1.w1()
            int r1 = r1 / 2
            goto L_0x02c1
        L_0x02bf:
            r1 = 8
        L_0x02c1:
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r4)
            int r4 = r4.width()
            int r5 = r5.getHeight()
            if (r4 != r5) goto L_0x02db
            int r4 = r6.left
            int r4 = r4 + r1
            r6.left = r4
            int r4 = r6.right
            int r4 = r4 - r1
            r6.right = r4
            goto L_0x02e5
        L_0x02db:
            int r4 = r6.top
            int r4 = r4 + r1
            r6.top = r4
            int r4 = r6.bottom
            int r4 = r4 - r1
            r6.bottom = r4
        L_0x02e5:
            r4 = r6
        L_0x02e6:
            r0.x = r4
            boolean r1 = r0.M(r10, r8, r4, r3)
            if (r1 == 0) goto L_0x030a
            nw4 r6 = new nw4
            ax1 r1 = r27.c()
            java.util.Objects.requireNonNull(r1)
            zgf r3 = r0.m
            if (r3 == 0) goto L_0x0301
            mee r4 = new mee
            r4.<init>(r3)
            goto L_0x0306
        L_0x0301:
            ce4 r4 = new ce4
            r4.<init>(r14)
        L_0x0306:
            r6.<init>((defpackage.ax1) r1, (defpackage.lee) r4)
            goto L_0x030b
        L_0x030a:
            r6 = 0
        L_0x030b:
            r0.w = r6
            if (r6 != 0) goto L_0x031a
            boolean r1 = r10.n()
            if (r1 != 0) goto L_0x0316
            goto L_0x031a
        L_0x0316:
            bue r1 = defpackage.bue.a
        L_0x0318:
            r9 = r1
            goto L_0x0323
        L_0x031a:
            yw1 r1 = r10.p()
            bue r1 = r1.h()
            goto L_0x0318
        L_0x0323:
            yw1 r1 = r10.p()
            bue r1 = r1.h()
            java.util.Objects.toString(r1)
            java.util.Objects.toString(r9)
            x3c r1 = r29.a()
            if (r2 == 0) goto L_0x0497
            r1.b = r2
            if (r12 == 0) goto L_0x048f
            r1.o = r12
            vb0 r20 = r1.c()
            iee r1 = r0.q
            if (r1 != 0) goto L_0x0348
            r1 = 1
        L_0x0346:
            r2 = 0
            goto L_0x034a
        L_0x0348:
            r1 = 0
            goto L_0x0346
        L_0x034a:
            defpackage.c54.p(r2, r1)
            iee r1 = new iee
            android.graphics.Matrix r2 = r0.j
            boolean r22 = r10.n()
            android.graphics.Rect r3 = r0.x
            int r4 = r0.y
            int r25 = r27.b()
            boolean r5 = r10.n()
            if (r5 == 0) goto L_0x036c
            boolean r5 = r0.n(r10)
            if (r5 == 0) goto L_0x036c
            r26 = 1
            goto L_0x036e
        L_0x036c:
            r26 = 0
        L_0x036e:
            r18 = 2
            r19 = 34
            r17 = r1
            r21 = r2
            r23 = r3
            r24 = r4
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0.q = r1
            r2 = r16
            r1.a(r2)
            nw4 r1 = r0.w
            if (r1 == 0) goto L_0x0417
            iee r1 = r0.q
            int r2 = r1.f
            int r3 = r1.i
            android.graphics.Rect r4 = r1.d
            android.util.Size r5 = defpackage.e1f.e(r4)
            android.util.Size r21 = defpackage.e1f.g(r5, r3)
            int r3 = r1.i
            cb0 r5 = new cb0
            java.util.UUID r17 = java.util.UUID.randomUUID()
            int r6 = r1.a
            boolean r1 = r1.e
            r24 = 0
            r16 = r5
            r18 = r2
            r19 = r6
            r20 = r4
            r22 = r3
            r23 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            iee r1 = r0.q
            java.util.List r2 = java.util.Collections.singletonList(r5)
            ac0 r3 = new ac0
            r3.<init>(r1, r2)
            nw4 r1 = r0.w
            xs4 r1 = r1.r(r3)
            java.lang.Object r1 = r1.get(r5)
            r11 = r1
            iee r11 = (defpackage.iee) r11
            java.util.Objects.requireNonNull(r11)
            vq1 r12 = new vq1
            r7 = 8
            r1 = r12
            r2 = r27
            r3 = r11
            r4 = r10
            r5 = r28
            r6 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r11.a(r12)
            r1 = 1
            see r2 = r11.d(r10, r1)
            r0.u = r2
            iee r1 = r0.q
            r1.getClass()
            defpackage.kq0.e()
            r1.b()
            boolean r2 = r1.j
            r3 = 1
            r2 = r2 ^ r3
            java.lang.String r4 = "Consumer can only be linked once."
            defpackage.c54.p(r4, r2)
            r1.j = r3
            hee r1 = r1.l
            r0.p = r1
            oq1 r2 = r1.e
            bm7 r2 = defpackage.kq0.w(r2)
            fre r3 = new fre
            r4 = 4
            r3.<init>(r0, r4, r1)
            zh6 r1 = defpackage.ju0.D()
            r2.d(r3, r1)
            goto L_0x0424
        L_0x0417:
            iee r1 = r0.q
            r2 = 1
            see r1 = r1.d(r10, r2)
            r0.u = r1
            fw6 r1 = r1.l
            r0.p = r1
        L_0x0424:
            aa0 r1 = defpackage.sdf.b
            java.lang.Object r1 = r8.h(r1)
            wjf r1 = (defpackage.wjf) r1
            java.util.Objects.requireNonNull(r1)
            see r2 = r0.u
            r1.f(r2, r9)
            r27.P()
            xf4 r1 = r0.p
            java.lang.Class<android.media.MediaCodec> r2 = android.media.MediaCodec.class
            r1.j = r2
            r1 = r29
            android.util.Size r2 = r1.a
            bad r2 = defpackage.bad.d(r8, r2)
            android.util.Range r3 = r1.c
            u40 r4 = r2.b
            r4.getClass()
            aa0 r5 = defpackage.kz1.k
            java.lang.Object r4 = r4.f
            mi9 r4 = (defpackage.mi9) r4
            r4.j(r5, r3)
            int r3 = r28.O()
            if (r3 == 0) goto L_0x046f
            u40 r4 = r2.b
            r4.getClass()
            if (r3 == 0) goto L_0x046f
            aa0 r5 = defpackage.o9f.q0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object r4 = r4.f
            mi9 r4 = (defpackage.mi9) r4
            r4.j(r5, r3)
        L_0x046f:
            cad r3 = r0.B
            if (r3 == 0) goto L_0x0476
            r3.b()
        L_0x0476:
            cad r3 = new cad
            kt6 r4 = new kt6
            r5 = 5
            r4.<init>(r5, r0)
            r3.<init>(r4)
            r0.B = r3
            r2.f = r3
            ce3 r0 = r1.d
            if (r0 == 0) goto L_0x048e
            u40 r1 = r2.b
            r1.c(r0)
        L_0x048e:
            return r2
        L_0x048f:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null expectedFrameRateRange"
            r0.<init>(r1)
            throw r0
        L_0x0497:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null resolution"
            r0.<init>(r1)
            throw r0
        L_0x049f:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdf.J(sdf, vb0):bad");
    }

    public final int K(ax1 ax1) {
        boolean n = n(ax1);
        int h = h(ax1, n);
        cc0 cc0 = this.r.c;
        if (cc0 == null) {
            return h;
        }
        Objects.requireNonNull(cc0);
        boolean z2 = cc0.f;
        int i = cc0.b;
        if (n != z2) {
            i = -i;
        }
        return e1f.i(h - i);
    }

    public final wjf L() {
        wjf wjf = (wjf) ((sdf) this.f).h(sdf.b);
        Objects.requireNonNull(wjf);
        return wjf;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (r4.booleanValue() != false) goto L_0x0066;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean M(defpackage.ax1 r3, defpackage.sdf r4, android.graphics.Rect r5, android.util.Size r6) {
        /*
            r2 = this;
            zgf r0 = r2.m
            if (r0 != 0) goto L_0x0066
            boolean r0 = r3.n()
            if (r0 == 0) goto L_0x001e
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            aa0 r1 = defpackage.sdf.o
            java.lang.Object r4 = r4.f(r1, r0)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            java.util.Objects.requireNonNull(r4)
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x001e
            goto L_0x0066
        L_0x001e:
            boolean r4 = r3.n()
            if (r4 == 0) goto L_0x003b
            bj6 r4 = defpackage.xi4.a
            boolean r4 = androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.d(r4)
            if (r4 != 0) goto L_0x0066
            yw1 r4 = r3.p()
            bj6 r4 = r4.p()
            boolean r4 = androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk.d(r4)
            if (r4 == 0) goto L_0x003b
            goto L_0x0066
        L_0x003b:
            int r4 = r6.getWidth()
            int r0 = r5.width()
            if (r4 != r0) goto L_0x0066
            int r4 = r6.getHeight()
            int r5 = r5.height()
            if (r4 == r5) goto L_0x0050
            goto L_0x0066
        L_0x0050:
            boolean r4 = r3.n()
            if (r4 == 0) goto L_0x005d
            boolean r3 = r2.n(r3)
            if (r3 == 0) goto L_0x005d
            goto L_0x0066
        L_0x005d:
            ub0 r2 = r2.r
            cc0 r2 = r2.c
            if (r2 == 0) goto L_0x0064
            goto L_0x0066
        L_0x0064:
            r2 = 0
            goto L_0x0067
        L_0x0066:
            r2 = 1
        L_0x0067:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdf.M(ax1, sdf, android.graphics.Rect, android.util.Size):boolean");
    }

    public final void N() {
        if (c() != null) {
            I();
            vb0 vb0 = this.g;
            vb0.getClass();
            bad J = J((sdf) this.f, vb0);
            this.s = J;
            H(J, this.r, this.g);
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{this.s.c()}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            E(Collections.unmodifiableList(arrayList));
            q();
        }
    }

    public final void P() {
        ax1 c = c();
        iee iee = this.q;
        if (c != null && iee != null) {
            int K = K(c);
            this.y = K;
            kq0.H(new ft0(iee, K, b(), 5));
        }
    }

    public final o9f f(boolean z2, r9f r9f) {
        D.getClass();
        sdf sdf = pdf.a;
        ce3 a = r9f.a(sdf.N(), 1);
        if (z2) {
            a = ce3.K(a, sdf);
        }
        if (a == null) {
            return null;
        }
        return new sdf(wma.a(((mt6) l(a)).b));
    }

    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    public final n9f l(ce3 ce3) {
        return new mt6(mi9.c(ce3), 3);
    }

    public final String toString() {
        return "VideoCapture:".concat(g());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v6, resolved type: mb0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v8, resolved type: mb0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.o9f u(defpackage.yw1 r20, defpackage.n9f r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = -1
            r3 = 1
            wjf r4 = r19.L()
            ry9 r4 = r4.b()
            bm7 r4 = r4.j()
            boolean r5 = r4.isDone()
            if (r5 != 0) goto L_0x001a
            r4 = 0
            goto L_0x001e
        L_0x001a:
            java.lang.Object r4 = r4.get()     // Catch:{ InterruptedException | ExecutionException -> 0x031b }
        L_0x001e:
            ab0 r4 = (defpackage.ab0) r4
            r5 = 0
            if (r4 == 0) goto L_0x0025
            r7 = r3
            goto L_0x0026
        L_0x0025:
            r7 = r5
        L_0x0026:
            java.lang.String r8 = "Unable to update target resolution by null MediaSpec."
            defpackage.c54.j(r8, r7)
            o9f r7 = r0.f
            aa0 r8 = defpackage.tu6.A
            boolean r7 = r7.o(r8)
            if (r7 == 0) goto L_0x003d
            o9f r7 = r0.f
            eu4 r7 = r7.u()
        L_0x003b:
            r13 = r7
            goto L_0x0040
        L_0x003d:
            eu4 r7 = defpackage.pdf.c
            goto L_0x003b
        L_0x0040:
            wjf r7 = r19.L()
            kdf r14 = r7.g(r1)
            java.util.ArrayList r7 = r14.c(r13)
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x0054
            goto L_0x030e
        L_0x0054:
            mc0 r8 = r4.a
            b9b r9 = r8.a
            r9.getClass()
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto L_0x0068
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L_0x016c
        L_0x0068:
            r7.toString()
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            java.lang.Object r11 = r9.b
            java.util.List r11 = (java.util.List) r11
            java.util.Iterator r11 = r11.iterator()
        L_0x0078:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00aa
            java.lang.Object r12 = r11.next()
            mb0 r12 = (defpackage.mb0) r12
            mb0 r15 = defpackage.mb0.i
            if (r12 != r15) goto L_0x008c
            r10.addAll(r7)
            goto L_0x00aa
        L_0x008c:
            mb0 r15 = defpackage.mb0.h
            if (r12 != r15) goto L_0x009c
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r7)
            java.util.Collections.reverse(r11)
            r10.addAll(r11)
            goto L_0x00aa
        L_0x009c:
            boolean r15 = r7.contains(r12)
            if (r15 == 0) goto L_0x00a6
            r10.add(r12)
            goto L_0x0078
        L_0x00a6:
            java.util.Objects.toString(r12)
            goto L_0x0078
        L_0x00aa:
            boolean r11 = r7.isEmpty()
            if (r11 == 0) goto L_0x00b2
            goto L_0x0167
        L_0x00b2:
            boolean r11 = r10.containsAll(r7)
            if (r11 == 0) goto L_0x00ba
            goto L_0x0167
        L_0x00ba:
            java.lang.Object r11 = r9.c
            la0 r11 = (defpackage.la0) r11
            java.util.Objects.toString(r11)
            la0 r12 = defpackage.la0.c
            if (r11 != r12) goto L_0x00c7
            goto L_0x0167
        L_0x00c7:
            boolean r12 = r11 instanceof defpackage.la0
            java.lang.String r15 = "Currently only support type RuleStrategy"
            defpackage.c54.p(r15, r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            java.util.List r15 = defpackage.mb0.l
            r12.<init>(r15)
            mb0 r15 = r11.a
            mb0 r6 = defpackage.mb0.i
            if (r15 != r6) goto L_0x00e3
            java.lang.Object r6 = r12.get(r5)
            r15 = r6
            mb0 r15 = (defpackage.mb0) r15
            goto L_0x00ee
        L_0x00e3:
            mb0 r6 = defpackage.mb0.h
            if (r15 != r6) goto L_0x00ee
            java.lang.Object r6 = defpackage.wg0.f(r12, r3)
            r15 = r6
            mb0 r15 = (defpackage.mb0) r15
        L_0x00ee:
            int r6 = r12.indexOf(r15)
            if (r6 == r2) goto L_0x00f7
            r2 = r3
        L_0x00f5:
            r5 = 0
            goto L_0x00f9
        L_0x00f7:
            r2 = r5
            goto L_0x00f5
        L_0x00f9:
            defpackage.c54.p(r5, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r18 = r6 + -1
            r5 = r18
        L_0x0105:
            if (r5 < 0) goto L_0x011c
            java.lang.Object r18 = r12.get(r5)
            r3 = r18
            mb0 r3 = (defpackage.mb0) r3
            boolean r18 = r7.contains(r3)
            if (r18 == 0) goto L_0x0118
            r2.add(r3)
        L_0x0118:
            r3 = -1
            int r5 = r5 + r3
            r3 = 1
            goto L_0x0105
        L_0x011c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0121:
            r5 = 1
            int r6 = r6 + r5
            int r5 = r12.size()
            if (r6 >= r5) goto L_0x0139
            java.lang.Object r5 = r12.get(r6)
            mb0 r5 = (defpackage.mb0) r5
            boolean r16 = r7.contains(r5)
            if (r16 == 0) goto L_0x0121
            r3.add(r5)
            goto L_0x0121
        L_0x0139:
            r5 = 1
            r12.toString()
            java.util.Objects.toString(r15)
            r2.toString()
            r3.toString()
            int r6 = r11.b
            if (r6 == 0) goto L_0x0167
            if (r6 != r5) goto L_0x0153
            r10.addAll(r2)
            r10.addAll(r3)
            goto L_0x0167
        L_0x0153:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unhandled fallback strategy: "
            r1.<init>(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0167:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r10)
        L_0x016c:
            r2.toString()
            r9.toString()
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x0313
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.ArrayList r5 = r14.c(r13)
            java.util.Iterator r5 = r5.iterator()
        L_0x0185:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01a7
            java.lang.Object r6 = r5.next()
            mb0 r6 = (defpackage.mb0) r6
            nc0 r7 = r14.b(r6, r13)
            java.util.Objects.requireNonNull(r7)
            android.util.Size r9 = new android.util.Size
            ha0 r7 = r7.f
            int r10 = r7.e
            int r7 = r7.f
            r9.<init>(r10, r7)
            r3.put(r6, r9)
            goto L_0x0185
        L_0x01a7:
            rqb r5 = new rqb
            o9f r0 = r0.f
            int r0 = r0.getInputFormat()
            java.util.List r0 = r1.q(r0)
            r5.<init>(r0, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r2.iterator()
        L_0x01bf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01eb
            java.lang.Object r2 = r1.next()
            mb0 r2 = (defpackage.mb0) r2
            lb0 r6 = new lb0
            int r7 = r8.d
            r6.<init>(r2, r7)
            java.util.HashMap r2 = r5.a
            java.lang.Object r2 = r2.get(r6)
            java.util.List r2 = (java.util.List) r2
            java.util.ArrayList r6 = new java.util.ArrayList
            if (r2 == 0) goto L_0x01e3
            r6.<init>(r2)
            r2 = 0
            goto L_0x01e7
        L_0x01e3:
            r2 = 0
            r6.<init>(r2)
        L_0x01e7:
            r0.addAll(r6)
            goto L_0x01bf
        L_0x01eb:
            o9f r1 = r21.J()
            sdf r1 = (defpackage.sdf) r1
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x01f9
            goto L_0x0300
        L_0x01f9:
            java.util.Iterator r2 = r0.iterator()
        L_0x01fd:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0300
            java.lang.Object r5 = r2.next()
            android.util.Size r5 = (android.util.Size) r5
            boolean r6 = r3.containsValue(r5)
            if (r6 == 0) goto L_0x0210
            goto L_0x01fd
        L_0x0210:
            nc0 r6 = r14.a(r5, r13)
            if (r6 != 0) goto L_0x0217
            goto L_0x01fd
        L_0x0217:
            aa0 r7 = defpackage.sdf.c
            java.lang.Object r7 = r1.h(r7)
            r15 = r7
            l66 r15 = (defpackage.l66) r15
            java.util.Objects.requireNonNull(r15)
            android.util.Range r7 = defpackage.pdf.b
            aa0 r8 = defpackage.o9f.l0
            java.lang.Object r7 = r1.f(r8, r7)
            r16 = r7
            android.util.Range r16 = (android.util.Range) r16
            java.util.Objects.requireNonNull(r16)
            boolean r7 = r13.b()
            if (r7 == 0) goto L_0x0247
            r7 = r15
            r8 = r6
            r9 = r4
            r10 = r5
            r11 = r13
            r12 = r16
            dff r6 = O(r7, r8, r9, r10, r11, r12)
            r19 = r1
            goto L_0x02e9
        L_0x0247:
            java.util.List r7 = r6.d
            java.util.Iterator r17 = r7.iterator()
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r7
            r18 = 0
        L_0x0252:
            boolean r7 = r17.hasNext()
            if (r7 == 0) goto L_0x02e5
            java.lang.Object r7 = r17.next()
            ha0 r7 = (defpackage.ha0) r7
            boolean r8 = defpackage.hu4.a(r7, r13)
            if (r8 == 0) goto L_0x02e1
            eu4 r11 = new eu4
            java.util.HashMap r8 = defpackage.hu4.d
            int r9 = r7.j
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            boolean r10 = r8.containsKey(r10)
            defpackage.c54.k(r10)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r8 = r8.get(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.util.Objects.requireNonNull(r8)
            int r8 = r8.intValue()
            java.util.HashMap r9 = defpackage.hu4.c
            int r7 = r7.h
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r10 = r9.containsKey(r10)
            defpackage.c54.k(r10)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object r7 = r9.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            java.util.Objects.requireNonNull(r7)
            int r7 = r7.intValue()
            r11.<init>(r8, r7)
            r7 = r15
            r8 = r6
            r9 = r4
            r10 = r5
            r19 = r1
            r1 = r12
            r12 = r16
            dff r7 = O(r7, r8, r9, r10, r11, r12)
            if (r7 != 0) goto L_0x02bc
        L_0x02b8:
            r12 = r1
        L_0x02b9:
            r1 = r19
            goto L_0x0252
        L_0x02bc:
            android.util.Range r8 = r7.x1()
            java.lang.Comparable r8 = r8.getUpper()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            android.util.Range r9 = r7.E1()
            java.lang.Comparable r9 = r9.getUpper()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            android.util.Size r10 = defpackage.msd.a
            int r8 = r8 * r9
            if (r8 <= r1) goto L_0x02b8
            r18 = r7
            r12 = r8
            goto L_0x02b9
        L_0x02e1:
            r19 = r1
            r1 = r12
            goto L_0x02b8
        L_0x02e5:
            r19 = r1
            r6 = r18
        L_0x02e9:
            if (r6 == 0) goto L_0x02fc
            int r1 = r5.getWidth()
            int r5 = r5.getHeight()
            boolean r1 = r6.Q0(r1, r5)
            if (r1 != 0) goto L_0x02fc
            r2.remove()
        L_0x02fc:
            r1 = r19
            goto L_0x01fd
        L_0x0300:
            r0.toString()
            vh9 r1 = r21.F()
            aa0 r2 = defpackage.ev6.K
            mi9 r1 = (defpackage.mi9) r1
            r1.j(r2, r0)
        L_0x030e:
            o9f r0 = r21.J()
            return r0
        L_0x0313:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unable to find supported quality by QualitySelector"
            r0.<init>(r1)
            throw r0
        L_0x031b:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rdf.u(yw1, n9f):o9f");
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [qdf, java.lang.Object] */
    public final void v() {
        e();
        vb0 vb0 = this.g;
        if (vb0 != null && this.u == null) {
            ry9 d = L().d();
            Object obj = ub0.d;
            bm7 j = d.j();
            if (j.isDone()) {
                try {
                    obj = j.get();
                } catch (InterruptedException | ExecutionException e) {
                    throw new IllegalStateException(e);
                }
            }
            this.r = (ub0) obj;
            bad J = J((sdf) this.f, vb0);
            this.s = J;
            H(J, this.r, vb0);
            ArrayList arrayList = new ArrayList(1);
            Object obj2 = new Object[]{this.s.c()}[0];
            Objects.requireNonNull(obj2);
            arrayList.add(obj2);
            E(Collections.unmodifiableList(arrayList));
            p();
            L().d().f(ju0.D(), this.C);
            qdf qdf = this.A;
            if (qdf != null) {
                c54.p("SourceStreamRequirementObserver can be closed from main thread only", kq0.t());
                hw1 hw1 = qdf.a;
                if (hw1 != null) {
                    if (qdf.b) {
                        qdf.b = false;
                        hw1.a();
                    }
                    qdf.a = null;
                }
            }
            hw1 d2 = d();
            ? obj3 = new Object();
            obj3.b = false;
            obj3.a = d2;
            this.A = obj3;
            L().e().f(ju0.D(), this.A);
            if (2 != this.v) {
                this.v = 2;
                L().c(2);
            }
        }
    }

    public final void w() {
        c54.p("VideoCapture can only be detached on the main thread.", kq0.t());
        if (this.A != null) {
            L().e().l(this.A);
            qdf qdf = this.A;
            qdf.getClass();
            c54.p("SourceStreamRequirementObserver can be closed from main thread only", kq0.t());
            hw1 hw1 = qdf.a;
            if (hw1 != null) {
                if (qdf.b) {
                    qdf.b = false;
                    hw1.a();
                }
                qdf.a = null;
            }
            this.A = null;
        }
        if (3 != this.v) {
            this.v = 3;
            L().c(3);
        }
        L().d().l(this.C);
        oq1 oq1 = this.t;
        if (oq1 != null) {
            oq1.cancel(false);
        }
        I();
    }

    public final vb0 x(ce3 ce3) {
        this.s.a(ce3);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.s.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        vb0 vb0 = this.g;
        Objects.requireNonNull(vb0);
        x3c a = vb0.a();
        a.X = ce3;
        return a.c();
    }

    public final vb0 y(vb0 vb0, vb0 vb02) {
        Objects.toString(vb0);
        ArrayList arrayList = null;
        List list = (List) ((sdf) this.f).f(ev6.K, (Object) null);
        if (list != null) {
            arrayList = new ArrayList(list);
        }
        if (arrayList != null && !arrayList.contains(vb0.a)) {
            Objects.toString(vb0.a);
            arrayList.toString();
        }
        return vb0;
    }
}
