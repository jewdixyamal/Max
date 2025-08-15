package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ru.ok.messages.location.FrgLocationMap;

/* renamed from: fk9  reason: default package */
public final class fk9 extends u2 implements lr7 {
    public final m7b A0;
    public final FrgLocationMap B0;
    public ir7 C0;
    public er7 D0;
    public e08 E0;
    public boolean F0;
    public final xpb G0;
    public final xpb H0;
    public sd7 I0;
    public final iq1 J0;
    public g28 K0;
    public final hc3 X;
    public final nr7 Y;
    public final rke Z;
    public final ConcurrentHashMap c;
    public final ConcurrentHashMap o = new ConcurrentHashMap();
    public final cn7 s0;
    public final long t0;
    public final long u0;
    public final String v0;
    public final e08 w0;
    public final el3 x0;
    public final k8g y0;
    public final hle z0;

    /* JADX WARNING: type inference failed for: r13v1, types: [hc3, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public fk9(defpackage.ir7 r17, defpackage.ny7 r18, defpackage.er7 r19, boolean r20, defpackage.el9 r21, defpackage.nr7 r22, defpackage.rke r23, defpackage.cn7 r24, long r25, long r27, java.lang.String r29, defpackage.e08 r30, ru.ok.messages.location.FrgLocationMap r31, defpackage.el3 r32, defpackage.k8g r33, defpackage.ri4 r34, defpackage.hle r35, defpackage.m7b r36) {
        /*
            r16 = this;
            r0 = r16
            r1 = r21
            r2 = r24
            r3 = r25
            r5 = r29
            r6 = r30
            r7 = r35
            r9 = 3
            r10 = 1
            r11 = 0
            r0.<init>((int) r11, (java.lang.Object) r1)
            java.util.concurrent.ConcurrentHashMap r12 = new java.util.concurrent.ConcurrentHashMap
            r12.<init>()
            r0.c = r12
            java.util.concurrent.ConcurrentHashMap r13 = new java.util.concurrent.ConcurrentHashMap
            r13.<init>()
            r0.o = r13
            hc3 r13 = new hc3
            r13.<init>()
            r0.X = r13
            r14 = r17
            r0.C0 = r14
            r14 = r19
            r0.D0 = r14
            r14 = r20
            r0.F0 = r14
            r14 = r22
            r0.Y = r14
            r14 = r23
            r0.Z = r14
            r0.s0 = r2
            r0.t0 = r3
            r14 = r27
            r0.u0 = r14
            r0.v0 = r5
            r0.w0 = r6
            r0.z0 = r7
            d08 r14 = new d08
            er7 r15 = defpackage.er7.Z
            r14.<init>(r15)
            r14.i = r10
            e08 r15 = new e08
            r15.<init>(r14)
            r0.E0 = r15
            r14 = r31
            r0.B0 = r14
            r14 = r32
            r0.x0 = r14
            r14 = r33
            r0.y0 = r14
            r14 = r36
            r0.A0 = r14
            ir7 r14 = r0.C0
            boolean r14 = r14.a
            fj0 r15 = new fj0
            r8 = 17
            r15.<init>(r8)
            r0.b2(r15)
            if (r6 == 0) goto L_0x0084
            long r10 = r6.c
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r12.put(r10, r6)
        L_0x0084:
            ir7 r6 = r0.C0
            int r6 = r6.d
            if (r6 != r9) goto L_0x00ab
            r10 = 0
            java.lang.Long r6 = java.lang.Long.valueOf(r10)
            er7 r10 = r0.D0
            d08 r11 = new d08
            r11.<init>(r10)
            r11.b = r3
            r3 = 1
            r11.h = r3
            r11.e = r5
            i08 r4 = defpackage.i08.c
            r11.d = r4
            r11.k = r3
            e08 r3 = r11.a()
            r12.put(r6, r3)
        L_0x00ab:
            r1.r(r0)
            r3 = r18
            r1.L0 = r3
            ru.ok.messages.location.TamSupportMapFragment r3 = r1.B0
            r4 = 1117782016(0x42a00000, float:80.0)
            defpackage.bk4.a(r4)
            r3.getClass()
            rde r4 = new rde
            vy7 r5 = r1.Z
            ztc r6 = r1.x0
            r4.<init>(r5, r6, r1)
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Looper r5 = android.os.Looper.myLooper()
            if (r1 != r5) goto L_0x01a9
            moa r1 = r3.l1
            java.lang.Object r3 = r1.a
            b9b r3 = (defpackage.b9b) r3
            if (r3 == 0) goto L_0x00db
            r3.m(r4)
            goto L_0x00e2
        L_0x00db:
            java.lang.Object r1 = r1.s0
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.add(r4)
        L_0x00e2:
            r1 = 0
            r0.h2(r1)
            r16.c2()
            r16.f2()
            xpb r1 = new xpb
            r1.<init>()
            r0.H0 = r1
            r3 = r7
            jle r3 = (defpackage.jle) r3
            ztc r4 = r3.a()
            r0a r1 = r1.n(r4)
            jj9 r4 = new jj9
            r5 = 12
            r4.<init>((int) r5)
            ty9 r5 = new ty9
            r6 = 1
            r5.<init>(r1, r4, r6)
            ck9 r1 = new ck9
            r4 = 0
            r1.<init>(r0, r4)
            e0a r4 = new e0a
            r4.<init>(r5, r1, r9)
            ztc r1 = defpackage.ce.a()
            r0a r1 = r4.n(r1)
            ck9 r4 = new ck9
            r4.<init>(r0, r6)
            jj9 r5 = new jj9
            r6 = 6
            r5.<init>((int) r6)
            r66 r6 = defpackage.ft.d
            sd7 r7 = new sd7
            r7.<init>(r4, r5, r6)
            r1.a(r7)
            r13.a(r7)
            ir7 r1 = r0.C0
            int r1 = r1.c
            r4 = 1
            if (r1 != r4) goto L_0x0171
            xpb r1 = new xpb
            r1.<init>()
            r0.G0 = r1
            ck9 r4 = new ck9
            r5 = 2
            r4.<init>(r0, r5)
            jj9 r5 = new jj9
            r7 = 7
            r5.<init>((int) r7)
            sd7 r7 = new sd7
            r7.<init>(r4, r5, r6)
            r1.a(r7)
            r13.a(r7)
            xpb r1 = r0.G0
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r1.e(r4)
            r24.getClass()
            java.lang.String r1 = "fk9"
            java.lang.String r5 = "onLiveLocationUpdate"
            defpackage.hm9.m(r1, r5, new java.lang.Object[0])
            xpb r1 = r0.G0
            r1.e(r4)
        L_0x0171:
            if (r14 == 0) goto L_0x01a8
            r1 = r2
            dn7 r1 = (defpackage.dn7) r1
            r1.getClass()
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            q1a r1 = defpackage.iqd.g(r1)
            ztc r2 = r3.a()
            drd r1 = r1.m(r2)
            ztc r2 = defpackage.ce.a()
            drd r1 = r1.i(r2)
            ck9 r2 = new ck9
            r3 = 8
            r2.<init>(r0, r3)
            jj9 r3 = new jj9
            r4 = 11
            r3.<init>((int) r4)
            iq1 r4 = new iq1
            r5 = 2
            r4.<init>(r2, r5, r3)
            r1.k(r4)
            r0.J0 = r4
        L_0x01a8:
            return
        L_0x01a9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getMapAsync must be called on the main thread."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fk9.<init>(ir7, ny7, er7, boolean, el9, nr7, rke, cn7, long, long, java.lang.String, e08, ru.ok.messages.location.FrgLocationMap, el3, k8g, ri4, hle, m7b):void");
    }

    public final void U0() {
    }

    public final void Z1() {
        b2(new cy1(1, this));
        ConcurrentHashMap concurrentHashMap = this.c;
        h2((concurrentHashMap.size() < 1 || !concurrentHashMap.containsKey(0L)) ? null : new ck9(this, 4));
        f2();
    }

    public final void a2(int i) {
        ((p7b) this.A0).c.k(i, "app.location.map.type");
        el9 el9 = (el9) ((kk9) this.b);
        qy7 qy7 = el9.K0;
        if (qy7 != null && qy7.d.Y() != i) {
            el9.K0.f(i);
        }
    }

    public final void b2(tj3 tj3) {
        ir7 ir7 = this.C0;
        ir7.getClass();
        gr7 gr7 = new gr7();
        gr7.a = ir7.a;
        gr7.b = ir7.b;
        gr7.c = ir7.c;
        gr7.d = ir7.d;
        gr7.e = ir7.e;
        gr7.f = ir7.f;
        gr7.g = ir7.g;
        gr7.h = ir7.h;
        gr7.i = ir7.i;
        gr7.j = ir7.j;
        gr7.k = ir7.k;
        gr7.l = ir7.l;
        gr7.m = ir7.m;
        gr7.n = ir7.n;
        gr7.o = ir7.o;
        gr7.p = ir7.p;
        gr7.q = ir7.q;
        gr7.r = ir7.r;
        tj3.accept(gr7);
        this.C0 = new ir7(gr7);
    }

    public final void c2() {
        ck9 ck9 = new ck9(this, 7);
        nr7 nr7 = this.Y;
        nr7.getClass();
        String[] strArr = wmd.f;
        Context context = nr7.o;
        if (!wmd.j(context, strArr)) {
            try {
                ck9.accept(Boolean.FALSE);
            } catch (Throwable th) {
                hm9.p("nr7", "isServiceAvailable", th);
            }
        } else {
            fd7 fd7 = new fd7(ck9);
            ((oe6) nr7.Z.get()).getClass();
            oe6.a(context, fd7);
        }
    }

    public final void d2() {
        for (e08 e : this.c.values()) {
            this.H0.e(e);
        }
        if (this.C0.d == 2) {
            d08 a = this.E0.a();
            a.i = true;
            e08 e08 = new e08(a);
            this.E0 = e08;
            this.H0.e(e08);
            f2();
        }
    }

    /* JADX WARNING: type inference failed for: r5v6, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r12v4, types: [cdg] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0077, code lost:
        if (r11.isEmpty() != false) goto L_0x0079;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0370  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:257:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0154  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01ab  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x023c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0255  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e2() {
        /*
            r24 = this;
            r0 = r24
            r4 = 8
            java.lang.Object r5 = r0.b
            kk9 r5 = (defpackage.kk9) r5
            el9 r5 = (defpackage.el9) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.concurrent.ConcurrentHashMap r0 = r0.c
            java.util.Collection r0 = r0.values()
            r6.<init>(r0)
            r5.getClass()
            int r0 = r6.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r7 = "el9"
            java.lang.String r8 = "Bind %d markers"
            defpackage.hm9.m(r7, r8, r0)
            long r8 = java.lang.System.nanoTime()
            mj9 r0 = r5.H0
            ir7 r10 = r5.O0
            java.util.Comparator r11 = r0.c
            java.util.Collections.sort(r6, r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r6)
            java.util.Iterator r12 = r11.iterator()
        L_0x0041:
            boolean r13 = r12.hasNext()
            r14 = 0
            if (r13 == 0) goto L_0x0059
            java.lang.Object r13 = r12.next()
            e08 r13 = (defpackage.e08) r13
            long r1 = r13.c
            int r1 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r1 != 0) goto L_0x0041
            r12.remove()
            goto L_0x0041
        L_0x0059:
            int r1 = r11.size()
            r2 = 1
            if (r1 > r2) goto L_0x0061
            r11 = 0
        L_0x0061:
            e08 r1 = r10.a(r6)
            java.lang.Object r0 = r0.b
            kk9 r0 = (defpackage.kk9) r0
            nk9 r0 = (defpackage.nk9) r0
            pk9 r0 = (defpackage.pk9) r0
            r13 = 0
            if (r11 == 0) goto L_0x0079
            r0.getClass()
            boolean r16 = r11.isEmpty()
            if (r16 == 0) goto L_0x007b
        L_0x0079:
            if (r1 == 0) goto L_0x0099
        L_0x007b:
            java.lang.Object r12 = r0.c
            android.view.View r12 = (android.view.View) r12
            if (r12 != 0) goto L_0x0091
            int r12 = defpackage.pk9.D0
            android.view.ViewStub r3 = r0.Z
            r3.setLayoutResource(r12)
            android.view.View r3 = r3.inflate()
            r0.c = r3
            r0.m()
        L_0x0091:
            java.lang.Object r3 = r0.c
            android.view.View r3 = (android.view.View) r3
            r3.setVisibility(r13)
            goto L_0x00a2
        L_0x0099:
            java.lang.Object r3 = r0.c
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L_0x00a2
            r3.setVisibility(r4)
        L_0x00a2:
            if (r11 == 0) goto L_0x00ac
            boolean r3 = r11.isEmpty()
            if (r3 != 0) goto L_0x00ac
            r3 = r2
            goto L_0x00ad
        L_0x00ac:
            r3 = r13
        L_0x00ad:
            r17 = -1
            if (r1 != 0) goto L_0x00b4
            r14 = r17
            goto L_0x00b6
        L_0x00b4:
            long r14 = r1.c
        L_0x00b6:
            if (r3 == 0) goto L_0x00cc
            androidx.recyclerview.widget.RecyclerView r3 = r0.A0
            r3.setVisibility(r13)
            android.view.View r3 = r0.B0
            r3.setVisibility(r13)
            ip3 r3 = r0.C0
            r3.X = r11
            r3.Y = r14
            r3.m()
            goto L_0x00d8
        L_0x00cc:
            androidx.recyclerview.widget.RecyclerView r3 = r0.A0
            if (r3 == 0) goto L_0x00d8
            r3.setVisibility(r4)
            android.view.View r3 = r0.B0
            r3.setVisibility(r4)
        L_0x00d8:
            if (r1 != 0) goto L_0x00f4
            androidx.constraintlayout.widget.Group r1 = r0.t0
            if (r1 == 0) goto L_0x00eb
            r1.setVisibility(r4)
            android.widget.ImageView r1 = r0.v0
            r1.setVisibility(r4)
            android.widget.TextView r0 = r0.z0
            r0.setVisibility(r4)
        L_0x00eb:
            r3 = r5
            r23 = r6
            r19 = r7
            r20 = r8
            goto L_0x036a
        L_0x00f4:
            m7b r3 = r0.Y
            p7b r3 = (defpackage.p7b) r3
            t33 r11 = r3.a
            long r11 = r11.n()
            long r14 = r1.j
            long r11 = r11 - r14
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            z7d r13 = r3.b
            r13.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r4 = ru.ok.tamtam.android.prefs.PmsKey.f60livelocationsendtimeout
            r19 = r7
            r7 = 60
            r20 = r8
            long r7 = (long) r7
            long r7 = r13.q(r4, r7)
            int r4 = (int) r7
            long r7 = (long) r4
            long r7 = r2.toMillis(r7)
            long r9 = r10.o
            boolean r2 = r1.k
            boolean r4 = r1.h
            if (r4 == 0) goto L_0x0143
            if (r2 == 0) goto L_0x0143
            r22 = 2
            long r7 = r7 * r22
            int r7 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
            if (r7 < 0) goto L_0x0143
            r7 = 0
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 > 0) goto L_0x0143
            ri4 r7 = r0.s0
            java.lang.String r7 = r7.a()
            java.lang.String r8 = r1.l
            boolean r7 = defpackage.oag.d(r8, r7)
            if (r7 != 0) goto L_0x0143
            r7 = 1
            goto L_0x0144
        L_0x0143:
            r7 = 0
        L_0x0144:
            if (r7 == 0) goto L_0x0154
            android.widget.ImageView r8 = r0.v0
            r11 = 8
            r8.setVisibility(r11)
            android.widget.ProgressBar r8 = r0.w0
            r11 = 0
            r8.setVisibility(r11)
            goto L_0x016d
        L_0x0154:
            r11 = 0
            if (r4 == 0) goto L_0x0161
            if (r2 == 0) goto L_0x0161
            android.widget.ImageView r8 = r0.v0
            r8.setVisibility(r11)
            r12 = 8
            goto L_0x0168
        L_0x0161:
            android.widget.ImageView r8 = r0.v0
            r12 = 8
            r8.setVisibility(r12)
        L_0x0168:
            android.widget.ProgressBar r8 = r0.w0
            r8.setVisibility(r12)
        L_0x016d:
            androidx.constraintlayout.widget.Group r8 = r0.t0
            r8.setVisibility(r11)
            t33 r3 = r3.a
            long r11 = r3.t()
            r3 = r5
            r8 = r6
            long r5 = r1.b
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x018c
            if (r4 == 0) goto L_0x018c
            if (r2 == 0) goto L_0x018c
            android.widget.TextView r5 = r0.z0
            r6 = 8
            r5.setVisibility(r6)
            goto L_0x0192
        L_0x018c:
            android.widget.TextView r5 = r0.z0
            r6 = 0
            r5.setVisibility(r6)
        L_0x0192:
            android.widget.TextView r5 = r0.u0
            ida r6 = r0.o
            tx4 r11 = r6.j
            java.lang.String r12 = r1.e
            java.lang.CharSequence r11 = r11.e(r12)
            r5.setText(r11)
            boolean r5 = r1.i
            java.lang.Object r11 = r0.b
            android.content.Context r11 = (android.content.Context) r11
            java.lang.String r12 = ""
            if (r5 == 0) goto L_0x01c2
            android.widget.TextView r1 = r0.z0
            r1.setText(r12)
            android.widget.TextView r1 = r0.y0
            int r5 = defpackage.jpc.t0
            java.lang.String r5 = r11.getString(r5)
            r1.setText(r5)
        L_0x01bb:
            r5 = r2
            r23 = r8
            r22 = r12
            goto L_0x023a
        L_0x01c2:
            java.lang.String r5 = r1.f
            boolean r13 = defpackage.oag.t(r5)
            if (r13 == 0) goto L_0x01d6
            android.widget.TextView r5 = r0.y0
            int r13 = defpackage.jpc.g3
            java.lang.String r13 = r11.getString(r13)
            r5.setText(r13)
            goto L_0x01db
        L_0x01d6:
            android.widget.TextView r13 = r0.y0
            r13.setText(r5)
        L_0x01db:
            float r1 = r1.g
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x01e9
            android.widget.TextView r1 = r0.z0
            r1.setText(r12)
            goto L_0x01bb
        L_0x01e9:
            int r5 = defpackage.zqe.a
            java.text.DecimalFormatSymbols r5 = new java.text.DecimalFormatSymbols
            java.util.Locale r13 = java.util.Locale.ENGLISH
            r5.<init>(r13)
            r13 = 46
            r5.setDecimalSeparator(r13)
            r13 = 1148846080(0x447a0000, float:1000.0)
            int r22 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r22 >= 0) goto L_0x0216
            java.text.DecimalFormat r13 = new java.text.DecimalFormat
            r22 = r12
            java.lang.String r12 = "0"
            r13.<init>(r12, r5)
            r12 = r2
            double r1 = (double) r1
            java.lang.String r1 = r13.format(r1)
            int r2 = defpackage.jpc.D1
            java.lang.String r2 = r11.getString(r2)
            r23 = r8
            r5 = r12
            goto L_0x022f
        L_0x0216:
            r22 = r12
            r12 = r2
            java.text.DecimalFormat r2 = new java.text.DecimalFormat
            r23 = r8
            java.lang.String r8 = "0.#"
            r2.<init>(r8, r5)
            float r1 = r1 / r13
            r5 = r12
            double r12 = (double) r1
            java.lang.String r1 = r2.format(r12)
            int r2 = defpackage.jpc.l0
            java.lang.String r2 = r11.getString(r2)
        L_0x022f:
            java.lang.String r8 = " "
            java.lang.String r1 = defpackage.rh4.j(r1, r8, r2)
            android.widget.TextView r2 = r0.z0
            r2.setText(r1)
        L_0x023a:
            if (r7 == 0) goto L_0x0255
            android.widget.TextView r0 = r0.x0
            int r1 = defpackage.dpc.w
            java.lang.String r2 = r6.d(r14)
            java.lang.String r2 = defpackage.are.e(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r1 = r11.getString(r1, r2)
            r0.setText(r1)
            goto L_0x036a
        L_0x0255:
            r1 = 0
            int r7 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x026a
            android.widget.TextView r0 = r0.x0
            java.lang.String r1 = r6.d(r9)
            java.lang.String r1 = defpackage.are.e(r1)
            r0.setText(r1)
            goto L_0x036a
        L_0x026a:
            if (r4 == 0) goto L_0x035d
            if (r5 == 0) goto L_0x02e6
            android.widget.TextView r0 = r0.x0
            t33 r1 = r6.c
            long r4 = r1.n()
            b11 r2 = defpackage.ay7.o(r14, r4)
            java.util.Locale r1 = r1.v()
            java.lang.String[] r4 = defpackage.are.b
            int r4 = r2.b
            int r4 = defpackage.au1.s(r4)
            android.content.Context r5 = r6.a
            long r6 = r2.c
            switch(r4) {
                case 0: goto L_0x02db;
                case 1: goto L_0x02d3;
                case 2: goto L_0x02cb;
                case 3: goto L_0x02b8;
                case 4: goto L_0x02b0;
                case 5: goto L_0x02a8;
                case 6: goto L_0x02a0;
                case 7: goto L_0x0290;
                default: goto L_0x028d;
            }
        L_0x028d:
            r12 = r22
            goto L_0x02e1
        L_0x0290:
            int r2 = defpackage.c2c.tt_dates_full_last_update
            r4 = 1
            java.lang.String r1 = defpackage.ay7.q(r1, r6, r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r12 = r5.getString(r2, r1)
            goto L_0x02e1
        L_0x02a0:
            int r1 = defpackage.fzb.tt_dates_months_last_update
            int r2 = (int) r6
            java.lang.String r12 = defpackage.are.s(r1, r2, r5)
            goto L_0x02e1
        L_0x02a8:
            int r1 = defpackage.fzb.tt_dates_weeks_last_update
            int r2 = (int) r6
            java.lang.String r12 = defpackage.are.s(r1, r2, r5)
            goto L_0x02e1
        L_0x02b0:
            int r1 = defpackage.fzb.tt_dates_days_last_update
            int r2 = (int) r6
            java.lang.String r12 = defpackage.are.s(r1, r2, r5)
            goto L_0x02e1
        L_0x02b8:
            int r2 = defpackage.c2c.tt_dates_yesterday_last_update
            java.lang.String r2 = r5.getString(r2)
            java.lang.String r1 = defpackage.ay7.k(r5, r6, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r12 = java.lang.String.format(r2, r1)
            goto L_0x02e1
        L_0x02cb:
            int r1 = defpackage.fzb.tt_dates_hours_last_update
            int r2 = (int) r6
            java.lang.String r12 = defpackage.are.s(r1, r2, r5)
            goto L_0x02e1
        L_0x02d3:
            int r1 = defpackage.fzb.tt_dates_minutes_last_update
            int r2 = (int) r6
            java.lang.String r12 = defpackage.are.s(r1, r2, r5)
            goto L_0x02e1
        L_0x02db:
            int r1 = defpackage.c2c.tt_dates_right_now_last_update
            java.lang.String r12 = r5.getString(r1)
        L_0x02e1:
            r0.setText(r12)
            goto L_0x036a
        L_0x02e6:
            android.widget.TextView r0 = r0.x0
            t33 r1 = r6.c
            long r4 = r1.n()
            b11 r2 = defpackage.ay7.o(r14, r4)
            java.util.Locale r1 = r1.v()
            java.lang.String[] r4 = defpackage.are.b
            int r4 = r2.b
            int r4 = defpackage.au1.s(r4)
            android.content.Context r5 = r6.a
            long r6 = r2.c
            switch(r4) {
                case 0: goto L_0x0353;
                case 1: goto L_0x034b;
                case 2: goto L_0x0343;
                case 3: goto L_0x0330;
                case 4: goto L_0x0328;
                case 5: goto L_0x0320;
                case 6: goto L_0x0318;
                case 7: goto L_0x0308;
                default: goto L_0x0305;
            }
        L_0x0305:
            r12 = r22
            goto L_0x0359
        L_0x0308:
            int r2 = defpackage.c2c.tt_dates_full_live_location_end
            r4 = 1
            java.lang.String r1 = defpackage.ay7.q(r1, r6, r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r12 = r5.getString(r2, r1)
            goto L_0x0359
        L_0x0318:
            int r1 = defpackage.fzb.tt_dates_months_live_location_end
            int r2 = (int) r6
            java.lang.String r12 = defpackage.are.s(r1, r2, r5)
            goto L_0x0359
        L_0x0320:
            int r1 = defpackage.fzb.tt_dates_weeks_live_location_end
            int r2 = (int) r6
            java.lang.String r12 = defpackage.are.s(r1, r2, r5)
            goto L_0x0359
        L_0x0328:
            int r1 = defpackage.fzb.tt_dates_days_live_location_end
            int r2 = (int) r6
            java.lang.String r12 = defpackage.are.s(r1, r2, r5)
            goto L_0x0359
        L_0x0330:
            int r2 = defpackage.c2c.tt_dates_yesterday_live_location_end
            java.lang.String r2 = r5.getString(r2)
            java.lang.String r1 = defpackage.ay7.k(r5, r6, r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r12 = java.lang.String.format(r2, r1)
            goto L_0x0359
        L_0x0343:
            int r1 = defpackage.fzb.tt_dates_hours_live_location_end
            int r2 = (int) r6
            java.lang.String r12 = defpackage.are.s(r1, r2, r5)
            goto L_0x0359
        L_0x034b:
            int r1 = defpackage.fzb.tt_dates_minutes_live_location_end
            int r2 = (int) r6
            java.lang.String r12 = defpackage.are.s(r1, r2, r5)
            goto L_0x0359
        L_0x0353:
            int r1 = defpackage.c2c.tt_dates_right_now_live_location_end
            java.lang.String r12 = r5.getString(r1)
        L_0x0359:
            r0.setText(r12)
            goto L_0x036a
        L_0x035d:
            android.widget.TextView r0 = r0.x0
            java.lang.String r1 = r6.d(r14)
            java.lang.String r1 = defpackage.are.e(r1)
            r0.setText(r1)
        L_0x036a:
            qy7 r0 = r3.K0
            if (r0 != 0) goto L_0x0370
            goto L_0x06fe
        L_0x0370:
            java.util.Iterator r1 = r23.iterator()
        L_0x0374:
            boolean r2 = r1.hasNext()
            java.util.LinkedHashMap r4 = r0.a
            r5 = 1056964608(0x3f000000, float:0.5)
            if (r2 == 0) goto L_0x04ca
            java.lang.Object r2 = r1.next()
            e08 r2 = (defpackage.e08) r2
            long r6 = r2.c
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object r6 = r4.get(r6)
            xi0 r6 = (defpackage.xi0) r6
            er7 r7 = r2.a
            double r8 = r7.a
            double r10 = r7.b
            r7 = 1073741824(0x40000000, float:2.0)
            i08 r12 = r2.d
            long r13 = r2.c
            if (r6 != 0) goto L_0x03f8
            kp7 r6 = r0.j
            java.lang.Object r6 = r6.b()
            h08 r6 = (defpackage.h08) r6
            com.google.android.gms.maps.model.LatLng r15 = new com.google.android.gms.maps.model.LatLng
            r15.<init>(r8, r10)
            g08 r8 = r6.a
            r8.a = r15
            r9 = 0
            r8.Z = r9
            java.lang.String r9 = r2.e
            r8.b = r9
            java.lang.String r9 = r2.f
            r8.c = r9
            r9 = 0
            int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x03c1
            goto L_0x03c3
        L_0x03c1:
            float r7 = r12.a
        L_0x03c3:
            r8.y0 = r7
            r8.X = r5
            r5 = 1064514355(0x3f733333, float:0.95)
            r8.Y = r5
            r5 = 0
            r8.s0 = r5
            qx7 r5 = r0.h
            r5.getClass()
            sn0 r5 = defpackage.qx7.h()
            rxd r5 = r5.a
            r8.o = r5
            rxd r5 = r0.d
            y8 r5 = r5.T(r6)
            java.lang.Long r6 = java.lang.Long.valueOf(r13)
            r5.H(r6)
            xi0 r6 = new xi0
            r6.<init>(r2, r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r13)
            r4.put(r5, r6)
            boolean r2 = r2.k
            goto L_0x0440
        L_0x03f8:
            e08 r4 = r6.b
            i08 r5 = r4.d
            r6.b = r2
            y8 r2 = r6.a
            r2.getClass()
            com.google.android.gms.maps.model.LatLng r15 = new com.google.android.gms.maps.model.LatLng
            r15.<init>(r8, r10)
            java.lang.Object r8 = r2.a
            b08 r8 = (defpackage.b08) r8
            r8.getClass()
            lfg r8 = r8.a
            r9 = r8
            jfg r9 = (defpackage.jfg) r9     // Catch:{ RemoteException -> 0x04c3 }
            android.os.Parcel r10 = r9.G0()     // Catch:{ RemoteException -> 0x04c3 }
            defpackage.agg.b(r10, r15)     // Catch:{ RemoteException -> 0x04c3 }
            r11 = 3
            r9.H0(r10, r11)     // Catch:{ RemoteException -> 0x04c3 }
            java.lang.Long r9 = java.lang.Long.valueOf(r13)
            r2.H(r9)
            r9 = 0
            int r2 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x042d
            goto L_0x042f
        L_0x042d:
            float r7 = r12.a
        L_0x042f:
            jfg r8 = (defpackage.jfg) r8     // Catch:{ RemoteException -> 0x04bc }
            android.os.Parcel r2 = r8.G0()     // Catch:{ RemoteException -> 0x04bc }
            r2.writeFloat(r7)     // Catch:{ RemoteException -> 0x04bc }
            r7 = 27
            r8.H0(r2, r7)     // Catch:{ RemoteException -> 0x04bc }
            boolean r2 = r4.k
            r12 = r5
        L_0x0440:
            zl4 r4 = r6.c
            if (r4 == 0) goto L_0x0453
            e08 r4 = r6.b
            i08 r5 = r4.d
            if (r12 != r5) goto L_0x0453
            boolean r4 = r4.k
            if (r2 != r4) goto L_0x0453
            r4 = 0
            r8 = 2
            goto L_0x0374
        L_0x0453:
            e08 r2 = r6.b
            boolean r4 = r2.h
            java.lang.Object r5 = r3.b
            r13 = r5
            android.content.Context r13 = (android.content.Context) r13
            vy7 r8 = r0.e
            if (r4 == 0) goto L_0x047e
            long r9 = r2.b
            r4 = 0
            int r7 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r7 != 0) goto L_0x0469
            goto L_0x0480
        L_0x0469:
            r8.getClass()
            ry7 r14 = new ry7
            i08 r11 = r2.d
            boolean r12 = r2.k
            r7 = r14
            r7.<init>(r8, r9, r11, r12, r13)
            hb3 r2 = new hb3
            r7 = 2
            r2.<init>(r7, r14)
            r8 = 2
            goto L_0x0492
        L_0x047e:
            r4 = 0
        L_0x0480:
            r8.getClass()
            u00 r7 = new u00
            i08 r2 = r2.d
            r9 = 14
            r7.<init>((java.lang.Object) r8, (java.lang.Object) r2, (java.lang.Object) r13, (int) r9)
            hb3 r2 = new hb3
            r8 = 2
            r2.<init>(r8, r7)
        L_0x0492:
            ztc r7 = r0.f
            s1a r2 = r2.r(r7)
            ztc r7 = defpackage.ce.a()
            r0a r2 = r2.n(r7)
            ync r7 = new ync
            r9 = 9
            r7.<init>(r9, r6)
            xw0 r9 = new xw0
            r10 = 26
            r9.<init>(r10)
            r66 r10 = defpackage.ft.d
            sd7 r11 = new sd7
            r11.<init>(r7, r9, r10)
            r2.a(r11)
            r6.c = r11
            goto L_0x0374
        L_0x04bc:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x04c3:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x04ca:
            java.util.Collection r0 = r4.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x04d2:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0509
            java.lang.Object r1 = r0.next()
            xi0 r1 = (defpackage.xi0) r1
            java.util.Iterator r2 = r23.iterator()
        L_0x04e2:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x04f9
            java.lang.Object r4 = r2.next()
            e08 r4 = (defpackage.e08) r4
            long r6 = r4.c
            e08 r4 = r1.b
            long r8 = r4.c
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x04e2
            goto L_0x04d2
        L_0x04f9:
            r0.remove()
            zl4 r2 = r1.c
            if (r2 == 0) goto L_0x0503
            r2.g()
        L_0x0503:
            y8 r1 = r1.a
            r1.F()
            goto L_0x04d2
        L_0x0509:
            ir7 r0 = r3.O0
            long r1 = r0.h
            int r1 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x0518
            qy7 r0 = r3.K0
            r0.a()
            goto L_0x06df
        L_0x0518:
            r1 = r23
            e08 r0 = r0.a(r1)
            if (r0 == 0) goto L_0x06da
            boolean r1 = r0.h
            if (r1 == 0) goto L_0x06da
            boolean r1 = r0.k
            if (r1 == 0) goto L_0x06da
            er7 r0 = r0.a
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x0532
            goto L_0x06da
        L_0x0532:
            java.lang.Object r1 = r3.c
            android.view.View r1 = (android.view.View) r1
            android.content.Context r1 = r1.getContext()
            khe r2 = defpackage.sme.a0
            sme r1 = defpackage.fm9.R(r1)
            qy7 r2 = r3.K0
            float r3 = r0.o
            double r3 = (double) r3
            int r6 = r1.k
            r7 = 1036831949(0x3dcccccd, float:0.1)
            int r6 = defpackage.ote.b0(r6, r7)
            int r5 = defpackage.bk4.a(r5)
            float r5 = (float) r5
            bkg r7 = r2.s
            double r8 = r0.a
            double r10 = r0.b
            int r0 = r1.k
            r1 = 0
            if (r7 != 0) goto L_0x05d7
            kp7 r7 = r2.m
            java.lang.Object r7 = r7.b()
            x13 r7 = (defpackage.x13) r7
            com.google.android.gms.maps.model.LatLng r12 = new com.google.android.gms.maps.model.LatLng
            r12.<init>(r8, r10)
            w13 r7 = r7.a
            r7.getClass()
            r7.a = r12
            r8 = 0
            r7.s0 = r8
            r7.X = r6
            r7.b = r3
            r7.o = r0
            r7.c = r5
            r0 = 1
            r7.Z = r0
            r7.Y = r1
            rxd r0 = r2.d
            r0.getClass()
            java.lang.Object r0 = r0.b
            y7g r0 = (defpackage.y7g) r0
            r0.getClass()
            v13 r1 = new v13     // Catch:{ RemoteException -> 0x05d0 }
            java.lang.Object r0 = r0.b     // Catch:{ RemoteException -> 0x05d0 }
            eig r0 = (defpackage.eig) r0     // Catch:{ RemoteException -> 0x05d0 }
            android.os.Parcel r3 = r0.G0()     // Catch:{ RemoteException -> 0x05d0 }
            defpackage.agg.b(r3, r7)     // Catch:{ RemoteException -> 0x05d0 }
            r4 = 35
            android.os.Parcel r0 = r0.R(r3, r4)     // Catch:{ RemoteException -> 0x05d0 }
            android.os.IBinder r3 = r0.readStrongBinder()     // Catch:{ RemoteException -> 0x05d0 }
            int r4 = defpackage.ijg.d     // Catch:{ RemoteException -> 0x05d0 }
            if (r3 != 0) goto L_0x05ab
            r12 = 0
            goto L_0x05bf
        L_0x05ab:
            java.lang.String r4 = "com.google.android.gms.maps.model.internal.ICircleDelegate"
            android.os.IInterface r5 = r3.queryLocalInterface(r4)     // Catch:{ RemoteException -> 0x05d0 }
            boolean r6 = r5 instanceof defpackage.ojg     // Catch:{ RemoteException -> 0x05d0 }
            if (r6 == 0) goto L_0x05b9
            r12 = r5
            ojg r12 = (defpackage.ojg) r12     // Catch:{ RemoteException -> 0x05d0 }
            goto L_0x05bf
        L_0x05b9:
            fjg r12 = new fjg     // Catch:{ RemoteException -> 0x05d0 }
            r5 = 3
            r12.<init>(r3, r4, r5)     // Catch:{ RemoteException -> 0x05d0 }
        L_0x05bf:
            r0.recycle()     // Catch:{ RemoteException -> 0x05d0 }
            r1.<init>(r12)     // Catch:{ RemoteException -> 0x05d0 }
            bkg r0 = new bkg
            r3 = 8
            r0.<init>(r3, r1)
            r2.s = r0
            goto L_0x06df
        L_0x05d0:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x05d7:
            com.google.android.gms.maps.model.LatLng r12 = new com.google.android.gms.maps.model.LatLng
            r12.<init>(r8, r10)
            java.lang.Object r7 = r7.b
            v13 r7 = (defpackage.v13) r7
            r7.getClass()
            ojg r7 = r7.a     // Catch:{ RemoteException -> 0x06d3 }
            fjg r7 = (defpackage.fjg) r7     // Catch:{ RemoteException -> 0x06d3 }
            android.os.Parcel r8 = r7.G0()     // Catch:{ RemoteException -> 0x06d3 }
            defpackage.agg.b(r8, r12)     // Catch:{ RemoteException -> 0x06d3 }
            r9 = 3
            r7.H0(r8, r9)     // Catch:{ RemoteException -> 0x06d3 }
            bkg r7 = r2.s
            java.lang.Object r7 = r7.b
            v13 r7 = (defpackage.v13) r7
            r7.getClass()
            ojg r7 = r7.a     // Catch:{ RemoteException -> 0x06cc }
            fjg r7 = (defpackage.fjg) r7     // Catch:{ RemoteException -> 0x06cc }
            android.os.Parcel r8 = r7.G0()     // Catch:{ RemoteException -> 0x06cc }
            r9 = 0
            r8.writeInt(r9)     // Catch:{ RemoteException -> 0x06cc }
            r9 = 19
            r7.H0(r8, r9)     // Catch:{ RemoteException -> 0x06cc }
            bkg r7 = r2.s
            java.lang.Object r7 = r7.b
            v13 r7 = (defpackage.v13) r7
            r7.getClass()
            ojg r7 = r7.a     // Catch:{ RemoteException -> 0x06c5 }
            fjg r7 = (defpackage.fjg) r7     // Catch:{ RemoteException -> 0x06c5 }
            android.os.Parcel r8 = r7.G0()     // Catch:{ RemoteException -> 0x06c5 }
            r8.writeInt(r6)     // Catch:{ RemoteException -> 0x06c5 }
            r6 = 11
            r7.H0(r8, r6)     // Catch:{ RemoteException -> 0x06c5 }
            bkg r6 = r2.s
            java.lang.Object r6 = r6.b
            v13 r6 = (defpackage.v13) r6
            r6.getClass()
            ojg r6 = r6.a     // Catch:{ RemoteException -> 0x06be }
            fjg r6 = (defpackage.fjg) r6     // Catch:{ RemoteException -> 0x06be }
            android.os.Parcel r7 = r6.G0()     // Catch:{ RemoteException -> 0x06be }
            r7.writeDouble(r3)     // Catch:{ RemoteException -> 0x06be }
            r3 = 5
            r6.H0(r7, r3)     // Catch:{ RemoteException -> 0x06be }
            bkg r3 = r2.s
            java.lang.Object r3 = r3.b
            v13 r3 = (defpackage.v13) r3
            r3.getClass()
            ojg r3 = r3.a     // Catch:{ RemoteException -> 0x06b7 }
            fjg r3 = (defpackage.fjg) r3     // Catch:{ RemoteException -> 0x06b7 }
            android.os.Parcel r4 = r3.G0()     // Catch:{ RemoteException -> 0x06b7 }
            r4.writeInt(r0)     // Catch:{ RemoteException -> 0x06b7 }
            r0 = 9
            r3.H0(r4, r0)     // Catch:{ RemoteException -> 0x06b7 }
            bkg r0 = r2.s
            java.lang.Object r0 = r0.b
            v13 r0 = (defpackage.v13) r0
            r0.getClass()
            ojg r0 = r0.a     // Catch:{ RemoteException -> 0x06b0 }
            fjg r0 = (defpackage.fjg) r0     // Catch:{ RemoteException -> 0x06b0 }
            android.os.Parcel r3 = r0.G0()     // Catch:{ RemoteException -> 0x06b0 }
            r3.writeFloat(r5)     // Catch:{ RemoteException -> 0x06b0 }
            r4 = 7
            r0.H0(r3, r4)     // Catch:{ RemoteException -> 0x06b0 }
            bkg r0 = r2.s
            java.lang.Object r0 = r0.b
            v13 r0 = (defpackage.v13) r0
            r0.getClass()
            ojg r0 = r0.a     // Catch:{ RemoteException -> 0x06a9 }
            fjg r0 = (defpackage.fjg) r0     // Catch:{ RemoteException -> 0x06a9 }
            android.os.Parcel r3 = r0.G0()     // Catch:{ RemoteException -> 0x06a9 }
            r4 = 1
            r3.writeInt(r4)     // Catch:{ RemoteException -> 0x06a9 }
            r4 = 15
            r0.H0(r3, r4)     // Catch:{ RemoteException -> 0x06a9 }
            bkg r0 = r2.s
            java.lang.Object r0 = r0.b
            v13 r0 = (defpackage.v13) r0
            r0.getClass()
            ojg r0 = r0.a     // Catch:{ RemoteException -> 0x06a2 }
            fjg r0 = (defpackage.fjg) r0     // Catch:{ RemoteException -> 0x06a2 }
            android.os.Parcel r2 = r0.G0()     // Catch:{ RemoteException -> 0x06a2 }
            r2.writeFloat(r1)     // Catch:{ RemoteException -> 0x06a2 }
            r1 = 13
            r0.H0(r2, r1)     // Catch:{ RemoteException -> 0x06a2 }
            goto L_0x06df
        L_0x06a2:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x06a9:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x06b0:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x06b7:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x06be:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x06c5:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x06cc:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x06d3:
            r0 = move-exception
            com.google.android.gms.maps.model.RuntimeRemoteException r1 = new com.google.android.gms.maps.model.RuntimeRemoteException
            r1.<init>(r0)
            throw r1
        L_0x06da:
            qy7 r0 = r3.K0
            r0.a()
        L_0x06df:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = java.lang.System.nanoTime()
            long r1 = r1 - r20
            long r1 = java.lang.Math.abs(r1)
            long r0 = r0.toMillis(r1)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "bindMarkers takes %dms"
            r2 = r19
            defpackage.hm9.m(r2, r1, r0)
        L_0x06fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fk9.e2():void");
    }

    public final void f2() {
        ir7 ir7;
        e08 e08 = this.E0;
        il9 il9 = ((el9) ((kk9) this.b)).J0;
        if (il9 != null && (ir7 = il9.w0) != null && ir7.d == 2) {
            boolean z = e08.i;
            Context context = (Context) il9.b;
            if (z) {
                il9.t0.setSubtitle(context.getString(jpc.t0));
                return;
            }
            String str = e08.f;
            if (oag.t(str)) {
                il9.t0.setSubtitle(context.getString(jpc.g3));
            } else {
                il9.t0.setSubtitle(str);
            }
        }
    }

    public final void g2(long j) {
        e08 e08;
        cqc.b(this.K0);
        hm9.m("fk9", "Update track for message %d", Long.valueOf(j));
        if (this.C0.d == 1) {
            ConcurrentHashMap concurrentHashMap = this.c;
            e08 e082 = (e08) concurrentHashMap.get(Long.valueOf(j));
            if (e082 != null && e082.h) {
                List list = (List) this.o.get(Long.valueOf(j));
                if (list == null) {
                    list = Collections.emptyList();
                }
                ((el9) ((kk9) this.b)).C(list, e082.k);
                ir7 ir7 = this.C0;
                if (!(ir7.o == -1 || (e08 = (e08) concurrentHashMap.get(Long.valueOf(ir7.h))) == null)) {
                    this.H0.e(e08);
                }
                hm9.m("fk9", "Update track for message %d: load track", Long.valueOf(j));
                this.s0.getClass();
                m28 m28 = m28.a;
                hle hle = this.z0;
                hle.getClass();
                a38 f = m28.h(((jle) hle).a()).f(ce.a());
                g28 g28 = new g28(new x72((Object) this, j, (Object) e082, 9), new c10(j, 25), new mc5(j, 6));
                f.a(g28);
                this.K0 = g28;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v24, types: [rsd, gqf, w1f] */
    /* JADX WARNING: type inference failed for: r1v17, types: [java.lang.Object, eod] */
    public final void h2(ck9 ck9) {
        int i;
        el9 el9 = (el9) ((kk9) this.b);
        ir7 ir7 = this.C0;
        ir7 ir72 = el9.O0;
        el9.O0 = ir7;
        tg tgVar = el9.v0;
        if (tgVar.p()) {
            e2f e2f = new e2f();
            e2f.R(new w1f());
            e2f.I(200);
            e2f.s0 = w1f.o(e2f.s0, xxb.layout_contact_location__rv_markers);
            e2f.p(xxb.frg_location_map__top_no_permission_panel_anchor);
            if (ir72 == null || (((i = ir72.d) == 1 && ir7.d == 3) || (i == 3 && ir7.d == 1))) {
                ? gqf = new gqf();
                gqf.T0 = rsd.W0;
                ? obj = new Object();
                obj.a = 3.0f;
                obj.b = 80;
                gqf.I0 = obj;
                e2f.R(gqf);
            } else {
                e2f.R(new gqf());
            }
            if (ck9 != null) {
                e2f.Q(new jj0(0, ck9));
            }
            c2f.b((ViewGroup) ((View) el9.c));
            c2f.a((ViewGroup) ((View) el9.c), e2f);
        }
        ir7 ir73 = el9.O0;
        int s = au1.s(ir73.d);
        if (s == 0) {
            View view = (View) el9.J0.c;
            if (view != null) {
                view.setVisibility(8);
            }
            el9.D0.setVisibility(8);
        } else if (s == 1) {
            il9 il9 = el9.J0;
            if (((View) il9.c) == null) {
                int i2 = il9.y0;
                ViewStub viewStub = el9.I0;
                viewStub.setLayoutResource(i2);
                il9.c = viewStub.inflate();
                il9.m();
                el9.J0.r(el9);
            }
            ((View) el9.J0.c).setVisibility(0);
            el9.J0.A(ir73);
            el9.D0.setVisibility(0);
        } else if (s == 2) {
            il9 il92 = el9.J0;
            if (((View) il92.c) == null) {
                int i3 = il9.y0;
                ViewStub viewStub2 = el9.I0;
                viewStub2.setLayoutResource(i3);
                il92.c = viewStub2.inflate();
                il92.m();
                el9.J0.r(el9);
            }
            ((View) el9.J0.c).setVisibility(0);
            el9.J0.A(ir73);
            el9.D0.setVisibility(8);
        }
        boolean z = el9.O0.j;
        el9.y0.e();
        ir7 ir74 = el9.O0;
        boolean z2 = ir74.m;
        if (ir74.f) {
            boolean z3 = ir74.g;
        }
        if ((!tgVar.p()) && ck9 != null) {
            fk9 fk9 = ck9.b;
            fk9.c.remove(0L);
            fk9.e2();
        }
    }

    public final void p1(er7 er7) {
        qy7 qy7;
        boolean a = this.D0.a();
        kk9 kk9 = (kk9) this.b;
        if (!a) {
            el9 el9 = (el9) kk9;
            qy7 qy72 = el9.K0;
            if (qy72 != null) {
                qy72.g((Context) el9.b, true);
            }
            if (!(this.C0.d == 1 || (qy7 = el9.K0) == null)) {
                Float valueOf = Float.valueOf(14.0f);
                Float valueOf2 = Float.valueOf(0.0f);
                Float valueOf3 = Float.valueOf(0.0f);
                qy7.d(er7.a, er7.b, valueOf, valueOf2, valueOf3);
            }
        }
        if (this.C0.d != 1 && this.F0 && this.D0.a()) {
            ((el9) kk9).B(er7.a, er7.b, false);
        }
        if (this.C0.d == 3) {
            ConcurrentHashMap concurrentHashMap = this.c;
            e08 e08 = (e08) concurrentHashMap.get(0L);
            if (e08 != null) {
                d08 a2 = e08.a();
                a2.a = er7;
                concurrentHashMap.put(Long.valueOf(e08.c), new e08(a2));
            } else {
                d08 d08 = new d08(er7);
                d08.b = this.t0;
                d08.h = true;
                d08.e = this.v0;
                d08.d = i08.c;
                d08.k = true;
                concurrentHashMap.put(0L, d08.a());
            }
            e2();
        }
        if (this.C0.d == 2 && this.F0) {
            d08 a3 = this.E0.a();
            a3.a = er7;
            this.E0 = new e08(a3);
        }
        er7 er72 = this.D0;
        double d = er72.a;
        if (!((nd) this.Z).f(er7.a, er7.b, d, er72.b)) {
            d2();
        }
        this.D0 = er7;
        if (!this.E0.a.a()) {
            double[] D = ((el9) kk9).D();
            d08 a4 = this.E0.a();
            a4.a = new er7(D[0], D[1]);
            this.E0 = new e08(a4);
            if (this.C0.d == 2) {
                d2();
            }
        }
    }
}
