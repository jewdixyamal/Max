package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Looper;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: fu6  reason: default package */
public final class fu6 extends l9f {
    public static final du6 A = new Object();
    public final int p;
    public final AtomicReference q = new AtomicReference((Object) null);
    public final int r;
    public int s = -1;
    public Rational t = null;
    public gvc u;
    public bad v;
    public jc6 w;
    public vje x;
    public cad y;
    public final o9g z = new o9g(17, (Object) this);

    public fu6(gu6 gu6) {
        super(gu6);
        gu6 gu62 = (gu6) this.f;
        aa0 aa0 = gu6.b;
        if (gu62.o(aa0)) {
            this.p = ((Integer) gu62.h(aa0)).intValue();
        } else {
            this.p = 1;
        }
        this.r = ((Integer) gu62.f(gu6.t0, 0)).intValue();
        this.u = new gvc((eu6) gu62.f(gu6.v0, (Object) null));
    }

    public static boolean I(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public final void F(boolean z2) {
        vje vje;
        kq0.e();
        cad cad = this.y;
        if (cad != null) {
            cad.b();
            this.y = null;
        }
        jc6 jc6 = this.w;
        if (jc6 != null) {
            jc6.l();
            this.w = null;
        }
        if (!z2 && (vje = this.x) != null) {
            vje.b();
            this.x = null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: y7g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v22, resolved type: i99} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: iv1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: iv1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v21, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v37, resolved type: y7g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v38, resolved type: y7g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v24, resolved type: iv1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v25, resolved type: iv1} */
    /* JADX WARNING: type inference failed for: r13v0, types: [java.lang.Object, jc6] */
    /* JADX WARNING: type inference failed for: r12v0, types: [l84, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v18, types: [huc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v35, types: [sp3, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b2, code lost:
        if (r8.intValue() == 4101) goto L_0x00b8;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bad G(java.lang.String r20, defpackage.gu6 r21, defpackage.vb0 r22) {
        /*
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            r4 = 0
            r6 = 1
            r7 = 0
            defpackage.kq0.e()
            java.util.Objects.toString(r22)
            android.util.Size r15 = r2.a
            ax1 r8 = r19.c()
            java.util.Objects.requireNonNull(r8)
            boolean r8 = r8.n()
            r14 = r8 ^ 1
            jc6 r8 = r0.w
            if (r8 == 0) goto L_0x002a
            defpackage.c54.p(r4, r14)
            jc6 r8 = r0.w
            r8.l()
        L_0x002a:
            o9f r8 = r0.f
            aa0 r9 = defpackage.gu6.w0
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            java.lang.Object r8 = r8.f(r9, r10)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L_0x0047
            ax1 r8 = r19.c()
            yv1 r8 = r8.h()
            r8.P()
        L_0x0047:
            jc6 r13 = new jc6
            zgf r8 = r0.m
            r13.<init>()
            defpackage.kq0.e()
            r13.a = r1
            aa0 r9 = defpackage.o9f.j0
            java.lang.Object r9 = r1.f(r9, r4)
            lu1 r9 = (defpackage.lu1) r9
            if (r9 == 0) goto L_0x02bd
            u40 r10 = new u40
            r10.<init>()
            r9.a(r1, r10)
            kz1 r9 = r10.d()
            r13.b = r9
            l84 r12 = new l84
            r12.<init>()
            r12.a = r4
            r12.e = r4
            r13.c = r12
            w9b r11 = new w9b
            q67 r9 = defpackage.ju0.z()
            aa0 r10 = defpackage.n67.M
            java.lang.Object r9 = r1.f(r10, r9)
            java.util.concurrent.Executor r9 = (java.util.concurrent.Executor) r9
            java.util.Objects.requireNonNull(r9)
            if (r8 != 0) goto L_0x02b2
            r11.<init>(r9)
            r13.o = r11
            int r9 = r21.getInputFormat()
            aa0 r8 = defpackage.gu6.X
            java.lang.Object r8 = r1.f(r8, r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L_0x00a2
            int r8 = r8.intValue()
        L_0x00a0:
            r10 = r8
            goto L_0x00b8
        L_0x00a2:
            aa0 r8 = defpackage.tu6.z
            java.lang.Object r8 = r1.f(r8, r4)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L_0x00b5
            int r8 = r8.intValue()
            r10 = 4101(0x1005, float:5.747E-42)
            if (r8 != r10) goto L_0x00b5
            goto L_0x00b8
        L_0x00b5:
            r8 = 256(0x100, float:3.59E-43)
            goto L_0x00a0
        L_0x00b8:
            aa0 r8 = defpackage.gu6.Z
            java.lang.Object r1 = r1.f(r8, r4)
            defpackage.au1.r(r1)
            y90 r1 = new y90
            nu4 r4 = new nu4
            r4.<init>()
            nu4 r8 = new nu4
            r8.<init>()
            r21 = r8
            r8 = r1
            r16 = r9
            r9 = r15
            r20 = r10
            r3 = 4
            r10 = r16
            r17 = r11
            r11 = r20
            r5 = r12
            r12 = r14
            r3 = r13
            r13 = r4
            r18 = r14
            r14 = r21
            r8.<init>(r9, r10, r11, r12, r13, r14)
            r3.X = r1
            java.lang.Object r8 = r5.d
            y90 r8 = (defpackage.y90) r8
            if (r8 != 0) goto L_0x00f7
            java.lang.Object r8 = r5.b
            hqc r8 = (defpackage.hqc) r8
            if (r8 != 0) goto L_0x00f7
            r8 = r6
            goto L_0x00f8
        L_0x00f7:
            r8 = r7
        L_0x00f8:
            java.lang.String r9 = "CaptureNode does not support recreation yet."
            defpackage.c54.p(r9, r8)
            r5.d = r1
            r8 = r18 ^ 1
            oz1 r9 = new oz1
            r9.<init>(r7, r5)
            if (r8 == 0) goto L_0x014a
            i99 r8 = new i99
            int r10 = r15.getWidth()
            int r11 = r15.getHeight()
            r13 = r16
            r12 = 4
            r8.<init>(r10, r11, r13, r12)
            oz1 r10 = r8.b
            r11 = 2
            iv1[] r12 = new defpackage.iv1[r11]
            r12[r7] = r9
            r12[r6] = r10
            java.util.List r9 = java.util.Arrays.asList(r12)
            boolean r10 = r9.isEmpty()
            if (r10 == 0) goto L_0x0131
            kv1 r9 = new kv1
            r9.<init>()
            goto L_0x0144
        L_0x0131:
            int r10 = r9.size()
            if (r10 != r6) goto L_0x013e
            java.lang.Object r9 = r9.get(r7)
            iv1 r9 = (defpackage.iv1) r9
            goto L_0x0144
        L_0x013e:
            jv1 r10 = new jv1
            r10.<init>(r9)
            r9 = r10
        L_0x0144:
            mz1 r10 = new mz1
            r10.<init>(r5, r7)
            goto L_0x0165
        L_0x014a:
            r13 = r16
            y7g r8 = new y7g
            int r10 = r15.getWidth()
            int r11 = r15.getHeight()
            r12 = 4
            td r10 = defpackage.s36.k(r10, r11, r13, r12)
            r8.<init>((defpackage.td) r10)
            r5.e = r8
            mz1 r10 = new mz1
            r10.<init>(r5, r6)
        L_0x0165:
            r1.a = r9
            android.view.Surface r9 = r8.getSurface()
            java.util.Objects.requireNonNull(r9)
            fw6 r11 = r1.b
            if (r11 != 0) goto L_0x0174
            r11 = r6
            goto L_0x0175
        L_0x0174:
            r11 = r7
        L_0x0175:
            java.lang.String r12 = "The surface is already set."
            defpackage.c54.p(r12, r11)
            fw6 r11 = new fw6
            r11.<init>(r9, r15, r13)
            r1.b = r11
            hqc r1 = new hqc
            r1.<init>(r8)
            r5.b = r1
            ync r1 = new ync
            r9 = 29
            r1.<init>(r9, r5)
            zh6 r9 = defpackage.ju0.D()
            r8.l(r1, r9)
            r4.b = r10
            mz1 r1 = new mz1
            r4 = 2
            r1.<init>(r5, r4)
            r4 = r21
            r4.b = r1
            ib0 r1 = new ib0
            nu4 r4 = new nu4
            r4.<init>()
            nu4 r8 = new nu4
            r8.<init>()
            r10 = r20
            r1.<init>(r4, r8, r13, r10)
            r5.c = r1
            r5 = r17
            r5.b = r1
            u9b r1 = new u9b
            r1.<init>(r5, r7)
            r4.b = r1
            u9b r1 = new u9b
            r1.<init>(r5, r6)
            r8.b = r1
            c32 r1 = new c32
            r4 = 15
            r1.<init>(r4, r7)
            r5.c = r1
            fd7 r1 = new fd7
            bj6 r4 = r5.j
            r8 = 17
            r1.<init>((defpackage.bj6) r4, (int) r8)
            r5.d = r1
            nd2 r1 = new nd2
            r4 = 12
            r1.<init>(r4)
            r5.f = r1
            kj6 r1 = new kj6
            r4 = 7
            r1.<init>(r4)
            r5.e = r1
            o84 r1 = new o84
            r4 = 12
            r1.<init>((int) r4)
            r5.g = r1
            huc r1 = new huc
            r1.<init>()
            r5.i = r1
            r1 = 35
            if (r13 == r1) goto L_0x0204
            boolean r1 = r5.k
            if (r1 == 0) goto L_0x020b
        L_0x0204:
            sp3 r1 = new sp3
            r1.<init>()
            r5.h = r1
        L_0x020b:
            r0.w = r3
            vje r1 = r0.x
            if (r1 != 0) goto L_0x021a
            vje r1 = new vje
            o9g r3 = r0.z
            r1.<init>(r3)
            r0.x = r1
        L_0x021a:
            vje r1 = r0.x
            jc6 r3 = r0.w
            r1.getClass()
            defpackage.kq0.e()
            r1.c = r3
            r3.getClass()
            defpackage.kq0.e()
            java.lang.Object r3 = r3.c
            l84 r3 = (defpackage.l84) r3
            r3.getClass()
            defpackage.kq0.e()
            java.lang.Object r4 = r3.b
            hqc r4 = (defpackage.hqc) r4
            if (r4 == 0) goto L_0x023d
            r7 = r6
        L_0x023d:
            java.lang.String r4 = "The ImageReader is not initialized."
            defpackage.c54.p(r4, r7)
            java.lang.Object r3 = r3.b
            hqc r3 = (defpackage.hqc) r3
            java.lang.Object r5 = r3.a
            monitor-enter(r5)
            r3.Y = r1     // Catch:{ all -> 0x02af }
            monitor-exit(r5)     // Catch:{ all -> 0x02af }
            jc6 r1 = r0.w
            android.util.Size r3 = r2.a
            java.lang.Object r4 = r1.a
            gu6 r4 = (defpackage.gu6) r4
            bad r3 = defpackage.bad.d(r4, r3)
            java.lang.Object r1 = r1.X
            y90 r1 = (defpackage.y90) r1
            fw6 r4 = r1.b
            java.util.Objects.requireNonNull(r4)
            eu4 r5 = defpackage.eu4.d
            xe5 r4 = defpackage.rb0.a(r4)
            r4.Y = r5
            rb0 r4 = r4.a()
            java.util.LinkedHashSet r5 = r3.a
            r5.add(r4)
            fw6 r1 = r1.c
            if (r1 == 0) goto L_0x0280
            xe5 r1 = defpackage.rb0.a(r1)
            rb0 r1 = r1.a()
            r3.i = r1
        L_0x0280:
            int r1 = r0.p
            r4 = 2
            if (r1 != r4) goto L_0x0290
            boolean r1 = r2.e
            if (r1 != 0) goto L_0x0290
            hw1 r1 = r19.d()
            r1.j(r3)
        L_0x0290:
            ce3 r1 = r2.d
            if (r1 == 0) goto L_0x0299
            u40 r2 = r3.b
            r2.c(r1)
        L_0x0299:
            cad r1 = r0.y
            if (r1 == 0) goto L_0x02a0
            r1.b()
        L_0x02a0:
            cad r1 = new cad
            kt6 r2 = new kt6
            r2.<init>(r6, r0)
            r1.<init>(r2)
            r0.y = r1
            r3.f = r1
            return r3
        L_0x02af:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x02af }
            throw r0
        L_0x02b2:
            int r0 = r8.a
            r1 = 4
            if (r0 != r1) goto L_0x02b8
            goto L_0x02b9
        L_0x02b8:
            r6 = r7
        L_0x02b9:
            defpackage.c54.k(r6)
            throw r4
        L_0x02bd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Implementation is missing option unpacker for "
            r2.<init>(r3)
            java.lang.String r3 = r21.toString()
            aa0 r4 = defpackage.cne.d0
            java.lang.Object r1 = r1.f(r4, r3)
            java.lang.String r1 = (java.lang.String) r1
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu6.G(java.lang.String, gu6, vb0):bad");
    }

    public final int H() {
        int i;
        synchronized (this.q) {
            i = this.s;
            if (i == -1) {
                i = ((Integer) ((gu6) this.f).f(gu6.c, 2)).intValue();
            }
        }
        return i;
    }

    /* JADX WARNING: type inference failed for: r1v16, types: [androidx.camera.core.ImageCaptureException, java.lang.Exception] */
    public final void J(Executor executor, ey1 ey1) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        ey1 ey12 = ey1;
        if (Looper.getMainLooper() != Looper.myLooper()) {
            ju0.D().execute(new v05((Object) this, executor, (Object) ey12, 9));
            return;
        }
        Executor executor2 = executor;
        kq0.e();
        if (H() == 3 && this.u.a == null) {
            throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
        }
        ax1 c = c();
        Rect rect = null;
        if (c == null) {
            ey12.k(new Exception("Not bound to a valid Camera [" + this + "]", (Throwable) null));
            return;
        }
        vje vje = this.x;
        Objects.requireNonNull(vje);
        Rect rect2 = this.i;
        vb0 vb0 = this.g;
        Size size = vb0 != null ? vb0.a : null;
        Objects.requireNonNull(size);
        if (rect2 != null) {
            rect = rect2;
        } else {
            Rational rational = this.t;
            if (rational == null || rational.floatValue() <= 0.0f || rational.isNaN()) {
                rect = new Rect(0, 0, size.getWidth(), size.getHeight());
            } else {
                ax1 c2 = c();
                Objects.requireNonNull(c2);
                int h = h(c2, false);
                Rational rational2 = new Rational(this.t.getDenominator(), this.t.getNumerator());
                if (!e1f.c(h)) {
                    rational2 = this.t;
                }
                if (rational2 != null && rational2.floatValue() > 0.0f && !rational2.isNaN()) {
                    int width = size.getWidth();
                    int height = size.getHeight();
                    float f = (float) width;
                    float f2 = (float) height;
                    int numerator = rational2.getNumerator();
                    int denominator = rational2.getDenominator();
                    if (rational2.floatValue() > f / f2) {
                        int round = Math.round((f / ((float) numerator)) * ((float) denominator));
                        i4 = (height - round) / 2;
                        i2 = round;
                        i3 = width;
                        i5 = 0;
                    } else {
                        i3 = Math.round((f2 / ((float) denominator)) * ((float) numerator));
                        i5 = (width - i3) / 2;
                        i2 = height;
                        i4 = 0;
                    }
                    rect = new Rect(i5, i4, i3 + i5, i2 + i4);
                }
                Objects.requireNonNull(rect);
            }
        }
        Matrix matrix = this.j;
        int h2 = h(c, false);
        gu6 gu6 = (gu6) this.f;
        aa0 aa0 = gu6.u0;
        if (gu6.o(aa0)) {
            i = ((Integer) gu6.h(aa0)).intValue();
        } else {
            int i6 = this.p;
            if (i6 == 0) {
                i = 100;
            } else if (i6 == 1 || i6 == 2) {
                i = 95;
            } else {
                throw new IllegalStateException(wg0.g(i6, "CaptureMode ", " is invalid"));
            }
        }
        fc0 fc0 = new fc0(executor, ey1, rect, matrix, h2, i, this.p, Collections.unmodifiableList(this.v.e));
        kq0.e();
        vje.a.offer(fc0);
        vje.c();
    }

    public final void K() {
        synchronized (this.q) {
            try {
                if (this.q.get() == null) {
                    d().f(H());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final o9f f(boolean z2, r9f r9f) {
        A.getClass();
        gu6 gu6 = du6.a;
        ce3 a = r9f.a(gu6.N(), this.p);
        if (z2) {
            a = ce3.K(a, gu6);
        }
        if (a == null) {
            return null;
        }
        return new gu6(wma.a(((mt6) l(a)).b));
    }

    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public final n9f l(ce3 ce3) {
        return new mt6(mi9.c(ce3), 1);
    }

    public final void s() {
        c54.o(c(), "Attached camera cannot be null");
        if (H() == 3) {
            ax1 c = c();
            if ((c != null ? c.p().g() : -1) != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    public final void t() {
        K();
        d().g(this.u);
    }

    public final String toString() {
        return "ImageCapture:".concat(g());
    }

    public final o9f u(yw1 yw1, n9f n9f) {
        Object obj;
        Object obj2;
        Object obj3;
        if (yw1.p().d(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            vh9 F = n9f.F();
            aa0 aa0 = gu6.s0;
            Object obj4 = Boolean.TRUE;
            wma wma = (wma) F;
            wma.getClass();
            try {
                obj4 = wma.h(aa0);
            } catch (IllegalArgumentException unused) {
            }
            if (!bool.equals(obj4)) {
                ((mi9) n9f.F()).j(gu6.s0, Boolean.TRUE);
            }
        }
        vh9 F2 = n9f.F();
        Boolean bool2 = Boolean.TRUE;
        aa0 aa02 = gu6.s0;
        Object obj5 = Boolean.FALSE;
        wma wma2 = (wma) F2;
        wma2.getClass();
        try {
            obj5 = wma2.h(aa02);
        } catch (IllegalArgumentException unused2) {
        }
        boolean equals = bool2.equals(obj5);
        Object obj6 = null;
        boolean z2 = false;
        if (equals) {
            if (c() != null) {
                c().h().P();
            }
            try {
                obj3 = wma2.h(gu6.X);
            } catch (IllegalArgumentException unused3) {
                obj3 = null;
            }
            Integer num = (Integer) obj3;
            if (num == null || num.intValue() == 256) {
                z2 = true;
            }
            if (!z2) {
                ((mi9) F2).j(gu6.s0, Boolean.FALSE);
            }
        }
        vh9 F3 = n9f.F();
        aa0 aa03 = gu6.X;
        wma wma3 = (wma) F3;
        wma3.getClass();
        try {
            obj = wma3.h(aa03);
        } catch (IllegalArgumentException unused4) {
            obj = null;
        }
        Integer num2 = (Integer) obj;
        int i = 35;
        if (num2 != null) {
            if (c() != null) {
                c().h().P();
            }
            vh9 F4 = n9f.F();
            aa0 aa04 = tu6.z;
            if (!z2) {
                i = num2.intValue();
            }
            ((mi9) F4).j(aa04, Integer.valueOf(i));
        } else {
            vh9 F5 = n9f.F();
            aa0 aa05 = gu6.Y;
            wma wma4 = (wma) F5;
            wma4.getClass();
            try {
                obj2 = wma4.h(aa05);
            } catch (IllegalArgumentException unused5) {
                obj2 = null;
            }
            if (Objects.equals(obj2, 1)) {
                ((mi9) n9f.F()).j(tu6.z, 4101);
                ((mi9) n9f.F()).j(tu6.A, eu4.c);
            } else if (z2) {
                ((mi9) n9f.F()).j(tu6.z, 35);
            } else {
                vh9 F6 = n9f.F();
                aa0 aa06 = ev6.I;
                wma wma5 = (wma) F6;
                wma5.getClass();
                try {
                    obj6 = wma5.h(aa06);
                } catch (IllegalArgumentException unused6) {
                }
                List list = (List) obj6;
                if (list == null) {
                    ((mi9) n9f.F()).j(tu6.z, 256);
                } else if (I(256, list)) {
                    ((mi9) n9f.F()).j(tu6.z, 256);
                } else if (I(35, list)) {
                    ((mi9) n9f.F()).j(tu6.z, 35);
                }
            }
        }
        return n9f.J();
    }

    public final void w() {
        gvc gvc = this.u;
        gvc.c();
        gvc.b();
        vje vje = this.x;
        if (vje != null) {
            vje.b();
        }
    }

    public final vb0 x(ce3 ce3) {
        this.v.a(ce3);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.v.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        x3c a = this.g.a();
        a.X = ce3;
        return a.c();
    }

    public final vb0 y(vb0 vb0, vb0 vb02) {
        bad G = G(e(), (gu6) this.f, vb0);
        this.v = G;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{G.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        p();
        return vb0;
    }

    public final void z() {
        gvc gvc = this.u;
        gvc.c();
        gvc.b();
        vje vje = this.x;
        if (vje != null) {
            vje.b();
        }
        F(false);
        d().g((eu6) null);
    }
}
