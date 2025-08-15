package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.Executor;

/* renamed from: pt6  reason: default package */
public final class pt6 extends l9f {
    public static final nt6 u = new Object();
    public final qt6 p;
    public final Object q = new Object();
    public bad r;
    public fw6 s;
    public cad t;

    public pt6(st6 st6) {
        super(st6);
        if (((Integer) ((st6) this.f).f(st6.b, 0)).intValue() == 1) {
            this.p = new qt6();
        } else {
            this.p = new vt6((Executor) st6.f(ose.f0, ju0.w()));
        }
        this.p.b = G();
        this.p.c = ((Boolean) ((st6) this.f).f(st6.Z, Boolean.FALSE)).booleanValue();
    }

    public final void A(Matrix matrix) {
        super.A(matrix);
        qt6 qt6 = this.p;
        synchronized (qt6.w0) {
            qt6.Z = matrix;
            new Matrix(qt6.Z);
            qt6.getClass();
        }
    }

    public final void C(Rect rect) {
        this.i = rect;
        qt6 qt6 = this.p;
        synchronized (qt6.w0) {
            qt6.Y = rect;
            new Rect(qt6.Y);
            qt6.getClass();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bad F(defpackage.st6 r14, defpackage.vb0 r15) {
        /*
            r13 = this;
            defpackage.kq0.e()
            android.util.Size r0 = r15.a
            ck6 r1 = defpackage.ju0.w()
            aa0 r2 = defpackage.ose.f0
            java.lang.Object r1 = r14.f(r2, r1)
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            r1.getClass()
            o9f r2 = r13.f
            st6 r2 = (defpackage.st6) r2
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            aa0 r5 = defpackage.st6.b
            java.lang.Object r2 = r2.f(r5, r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r4 = 1
            if (r2 != r4) goto L_0x0042
            o9f r2 = r13.f
            st6 r2 = (defpackage.st6) r2
            r5 = 6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            aa0 r6 = defpackage.st6.c
            java.lang.Object r2 = r2.f(r6, r5)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            goto L_0x0043
        L_0x0042:
            r2 = 4
        L_0x0043:
            aa0 r5 = defpackage.st6.o
            r6 = 0
            java.lang.Object r5 = r14.f(r5, r6)
            defpackage.au1.r(r5)
            hqc r5 = new hqc
            int r7 = r0.getWidth()
            int r8 = r0.getHeight()
            o9f r9 = r13.f
            int r9 = r9.getInputFormat()
            td r2 = defpackage.s36.k(r7, r8, r9, r2)
            r5.<init>(r2)
            ax1 r2 = r13.c()
            if (r2 == 0) goto L_0x008c
            ax1 r2 = r13.c()
            o9f r7 = r13.f
            st6 r7 = (defpackage.st6) r7
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            aa0 r9 = defpackage.st6.Z
            java.lang.Object r7 = r7.f(r9, r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x008c
            int r2 = r13.h(r2, r3)
            int r2 = r2 % 180
            if (r2 == 0) goto L_0x008c
            r2 = r4
            goto L_0x008d
        L_0x008c:
            r2 = r3
        L_0x008d:
            if (r2 == 0) goto L_0x0094
            int r7 = r0.getHeight()
            goto L_0x0098
        L_0x0094:
            int r7 = r0.getWidth()
        L_0x0098:
            if (r2 == 0) goto L_0x009f
            int r2 = r0.getWidth()
            goto L_0x00a3
        L_0x009f:
            int r2 = r0.getHeight()
        L_0x00a3:
            int r8 = r13.G()
            r9 = 2
            r10 = 35
            if (r8 != r9) goto L_0x00ae
            r8 = r4
            goto L_0x00af
        L_0x00ae:
            r8 = r10
        L_0x00af:
            o9f r11 = r13.f
            int r11 = r11.getInputFormat()
            if (r11 != r10) goto L_0x00bf
            int r11 = r13.G()
            if (r11 != r9) goto L_0x00bf
            r9 = r4
            goto L_0x00c0
        L_0x00bf:
            r9 = r3
        L_0x00c0:
            o9f r11 = r13.f
            int r11 = r11.getInputFormat()
            if (r11 != r10) goto L_0x00ed
            ax1 r10 = r13.c()
            if (r10 == 0) goto L_0x00d8
            ax1 r10 = r13.c()
            int r10 = r13.h(r10, r3)
            if (r10 != 0) goto L_0x00ee
        L_0x00d8:
            java.lang.Boolean r10 = java.lang.Boolean.TRUE
            o9f r11 = r13.f
            st6 r11 = (defpackage.st6) r11
            aa0 r12 = defpackage.st6.Y
            java.lang.Object r11 = r11.f(r12, r6)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r4 = r3
        L_0x00ee:
            if (r9 != 0) goto L_0x00f2
            if (r4 == 0) goto L_0x00ff
        L_0x00f2:
            hqc r6 = new hqc
            int r4 = r5.m()
            td r2 = defpackage.s36.k(r7, r2, r8, r4)
            r6.<init>(r2)
        L_0x00ff:
            if (r6 == 0) goto L_0x010d
            qt6 r2 = r13.p
            java.lang.Object r4 = r2.w0
            monitor-enter(r4)
            r2.o = r6     // Catch:{ all -> 0x010a }
            monitor-exit(r4)     // Catch:{ all -> 0x010a }
            goto L_0x010d
        L_0x010a:
            r13 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x010a }
            throw r13
        L_0x010d:
            ax1 r2 = r13.c()
            if (r2 == 0) goto L_0x011b
            qt6 r4 = r13.p
            int r2 = r13.h(r2, r3)
            r4.a = r2
        L_0x011b:
            qt6 r2 = r13.p
            r5.l(r2, r1)
            android.util.Size r1 = r15.a
            bad r14 = defpackage.bad.d(r14, r1)
            ce3 r1 = r15.d
            if (r1 == 0) goto L_0x012f
            u40 r2 = r14.b
            r2.c(r1)
        L_0x012f:
            fw6 r1 = r13.s
            if (r1 == 0) goto L_0x0136
            r1.a()
        L_0x0136:
            fw6 r1 = new fw6
            android.view.Surface r2 = r5.getSurface()
            o9f r3 = r13.f
            int r3 = r3.getInputFormat()
            r1.<init>(r2, r0, r3)
            r13.s = r1
            oq1 r0 = r1.e
            bm7 r0 = defpackage.kq0.w(r0)
            vs5 r1 = new vs5
            r2 = 4
            r1.<init>(r5, r2, r6)
            zh6 r2 = defpackage.ju0.D()
            r0.d(r1, r2)
            android.util.Range r0 = r15.c
            u40 r1 = r14.b
            r1.getClass()
            aa0 r2 = defpackage.kz1.k
            java.lang.Object r1 = r1.f
            mi9 r1 = (defpackage.mi9) r1
            r1.j(r2, r0)
            fw6 r0 = r13.s
            eu4 r15 = r15.b
            r1 = -1
            r14.b(r0, r15, r1)
            cad r15 = r13.t
            if (r15 == 0) goto L_0x0179
            r15.b()
        L_0x0179:
            cad r15 = new cad
            kt6 r0 = new kt6
            r1 = 0
            r0.<init>(r1, r13)
            r15.<init>(r0)
            r13.t = r15
            r14.f = r15
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt6.F(st6, vb0):bad");
    }

    public final int G() {
        return ((Integer) ((st6) this.f).f(st6.X, 1)).intValue();
    }

    public final o9f f(boolean z, r9f r9f) {
        u.getClass();
        st6 st6 = nt6.a;
        ce3 a = r9f.a(st6.N(), 1);
        if (z) {
            a = ce3.K(a, st6);
        }
        if (a == null) {
            return null;
        }
        return new st6(wma.a(((mt6) l(a)).b));
    }

    public final n9f l(ce3 ce3) {
        return new mt6(mi9.c(ce3), 0);
    }

    public final void s() {
        this.p.x0 = true;
    }

    public final String toString() {
        return "ImageAnalysis:".concat(g());
    }

    public final o9f u(yw1 yw1, n9f n9f) {
        Boolean bool = (Boolean) ((st6) this.f).f(st6.Y, (Object) null);
        yw1.p().d(OnePixelShiftQuirk.class);
        qt6 qt6 = this.p;
        if (bool != null) {
            bool.booleanValue();
        }
        qt6.getClass();
        synchronized (this.q) {
        }
        return n9f.J();
    }

    public final vb0 x(ce3 ce3) {
        this.r.a(ce3);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.r.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        x3c a = this.g.a();
        a.X = ce3;
        return a.c();
    }

    public final vb0 y(vb0 vb0, vb0 vb02) {
        e();
        bad F = F((st6) this.f, vb0);
        this.r = F;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{F.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        return vb0;
    }

    public final void z() {
        kq0.e();
        cad cad = this.t;
        if (cad != null) {
            cad.b();
            this.t = null;
        }
        fw6 fw6 = this.s;
        if (fw6 != null) {
            fw6.a();
            this.s = null;
        }
        qt6 qt6 = this.p;
        qt6.x0 = false;
        qt6.c();
    }
}
