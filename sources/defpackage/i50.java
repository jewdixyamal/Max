package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import org.webrtc.HardwareVideoEncoderFactory;
import ru.ok.android.externcalls.analytics.events.EventItemValueKt;
import ru.ok.android.externcalls.analytics.events.EventItemsMap;

/* renamed from: i50  reason: default package */
public final class i50 implements tj8 {
    public Object X;
    public Object Y;
    public Object Z;
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public Object o;
    public Object s0;

    public /* synthetic */ i50(y1f y1f, ViewGroup viewGroup, Object obj, View view, Object obj2, boolean z, Object obj3, int i) {
        this.a = i;
        this.s0 = y1f;
        this.c = viewGroup;
        this.o = obj;
        this.X = view;
        this.Y = obj2;
        this.b = z;
        this.Z = obj3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x0119 A[Catch:{ IllegalArgumentException -> 0x0139 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.tv1 a(defpackage.jx1 r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            java.lang.String r2 = "requested initial facing is "
            java.lang.String r3 = "OKRTCSvcFactory"
            java.lang.Object r4 = r1.o
            a4c r4 = (defpackage.a4c) r4
            java.lang.String r5 = "creating camera capturer adapter using camera api "
            java.lang.Object r6 = r1.s0
            android.content.Context r6 = (android.content.Context) r6
            r7 = 0
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0139 }
            r8.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x0139 }
            boolean r5 = r1.b     // Catch:{ IllegalArgumentException -> 0x0139 }
            r9 = 1
            if (r5 == 0) goto L_0x001f
            r5 = 2
            goto L_0x0020
        L_0x001f:
            r5 = r9
        L_0x0020:
            r8.append(r5)     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.String r5 = r8.toString()     // Catch:{ IllegalArgumentException -> 0x0139 }
            r4.log(r3, r5)     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r0 == 0) goto L_0x003c
            r5 = 3
            int r8 = r0.a
            if (r8 == r5) goto L_0x003c
            java.lang.String r5 = defpackage.wg0.s(r8)     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.String r2 = r2.concat(r5)     // Catch:{ IllegalArgumentException -> 0x0139 }
            r4.log(r3, r2)     // Catch:{ IllegalArgumentException -> 0x0139 }
        L_0x003c:
            boolean r2 = r1.b     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r2 == 0) goto L_0x0049
            if (r6 == 0) goto L_0x0049
            it1 r2 = new it1     // Catch:{ IllegalArgumentException -> 0x0139 }
            r2.<init>((android.content.Context) r6, (defpackage.a4c) r4)     // Catch:{ IllegalArgumentException -> 0x0139 }
        L_0x0047:
            r13 = r2
            goto L_0x0052
        L_0x0049:
            it1 r2 = new it1     // Catch:{ IllegalArgumentException -> 0x0139 }
            boolean r5 = defpackage.jb9.a     // Catch:{ IllegalArgumentException -> 0x0139 }
            r5 = r5 ^ r9
            r2.<init>((defpackage.a4c) r4, (boolean) r5)     // Catch:{ IllegalArgumentException -> 0x0139 }
            goto L_0x0047
        L_0x0052:
            java.util.ArrayList r2 = r13.F()     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ IllegalArgumentException -> 0x0139 }
            r5 = r7
            r6 = r5
            r8 = r6
            r10 = r8
        L_0x005e:
            boolean r11 = r2.hasNext()     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r11 == 0) goto L_0x008b
            java.lang.Object r11 = r2.next()     // Catch:{ IllegalArgumentException -> 0x0139 }
            ww1 r11 = (defpackage.ww1) r11     // Catch:{ IllegalArgumentException -> 0x0139 }
            boolean r12 = r11 instanceof defpackage.uw1     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r12 == 0) goto L_0x009b
            if (r5 != 0) goto L_0x005e
            r12 = r11
            uw1 r12 = (defpackage.uw1) r12     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.util.List r12 = r12.b     // Catch:{ IllegalArgumentException -> 0x0139 }
            boolean r12 = r12.isEmpty()     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r12 != 0) goto L_0x008e
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x0139 }
            r10 = r11
            uw1 r10 = (defpackage.uw1) r10     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.util.List r10 = r10.b     // Catch:{ IllegalArgumentException -> 0x0139 }
            r5.<init>(r10)     // Catch:{ IllegalArgumentException -> 0x0139 }
            uw1 r11 = (defpackage.uw1) r11     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.String r10 = r11.a     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r6 == 0) goto L_0x005e
        L_0x008b:
            r14 = r5
            r15 = r6
            goto L_0x00ca
        L_0x008e:
            java.lang.String r11 = "camera.enumerator.npe.front"
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.String r14 = "No supported formats for front camera"
            r12.<init>(r14)     // Catch:{ IllegalArgumentException -> 0x0139 }
            r4.reportException(r3, r11, r12)     // Catch:{ IllegalArgumentException -> 0x0139 }
            goto L_0x005e
        L_0x009b:
            boolean r12 = r11 instanceof defpackage.tw1     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r12 == 0) goto L_0x005e
            if (r6 != 0) goto L_0x005e
            r12 = r11
            tw1 r12 = (defpackage.tw1) r12     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.util.List r12 = r12.b     // Catch:{ IllegalArgumentException -> 0x0139 }
            boolean r12 = r12.isEmpty()     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r12 != 0) goto L_0x00bd
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x0139 }
            r8 = r11
            tw1 r8 = (defpackage.tw1) r8     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.util.List r8 = r8.b     // Catch:{ IllegalArgumentException -> 0x0139 }
            r6.<init>(r8)     // Catch:{ IllegalArgumentException -> 0x0139 }
            tw1 r11 = (defpackage.tw1) r11     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.String r8 = r11.a     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r5 == 0) goto L_0x005e
            goto L_0x008b
        L_0x00bd:
            java.lang.String r11 = "camera.enumeratore.npe.back"
            java.lang.RuntimeException r12 = new java.lang.RuntimeException     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.String r14 = "No supported formats for back camera"
            r12.<init>(r14)     // Catch:{ IllegalArgumentException -> 0x0139 }
            r4.reportException(r3, r11, r12)     // Catch:{ IllegalArgumentException -> 0x0139 }
            goto L_0x005e
        L_0x00ca:
            if (r0 == 0) goto L_0x00d2
            int r0 = r0.a     // Catch:{ IllegalArgumentException -> 0x0139 }
            if (r0 != r9) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r9 = 0
        L_0x00d2:
            r16 = r9
            if (r16 == 0) goto L_0x00d7
            goto L_0x00d8
        L_0x00d7:
            r10 = r8
        L_0x00d8:
            java.lang.Object r0 = r1.Z
            r2 = r0
            lz1 r2 = (defpackage.lz1) r2
            java.lang.Object r0 = r1.Y
            r5 = r0
            wd6 r5 = (defpackage.wd6) r5
            if (r10 == 0) goto L_0x00f8
            org.webrtc.CameraVideoCapturer r0 = r13.createCapturer(r10, r5, r2)     // Catch:{ Exception -> 0x00ea }
            r12 = r0
            goto L_0x00f9
        L_0x00ea:
            r0 = move-exception
            r6 = r0
            java.lang.String r0 = "camera.enumerator.create"
            java.lang.RuntimeException r9 = new java.lang.RuntimeException     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.String r10 = "Cant create front camera capturer"
            r9.<init>(r10, r6)     // Catch:{ IllegalArgumentException -> 0x0139 }
            r4.reportException(r3, r0, r9)     // Catch:{ IllegalArgumentException -> 0x0139 }
        L_0x00f8:
            r12 = r7
        L_0x00f9:
            if (r12 == 0) goto L_0x0117
            if (r14 == 0) goto L_0x0117
            if (r15 != 0) goto L_0x0105
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x0139 }
            r0.<init>(r14)     // Catch:{ IllegalArgumentException -> 0x0139 }
            r15 = r0
        L_0x0105:
            tv1 r0 = new tv1     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.Object r2 = r1.c     // Catch:{ IllegalArgumentException -> 0x0139 }
            r11 = r2
            gy9 r11 = (defpackage.gy9) r11     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.Object r1 = r1.o     // Catch:{ IllegalArgumentException -> 0x0139 }
            r17 = r1
            a4c r17 = (defpackage.a4c) r17     // Catch:{ IllegalArgumentException -> 0x0139 }
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ IllegalArgumentException -> 0x0139 }
            return r0
        L_0x0117:
            if (r15 == 0) goto L_0x013e
            if (r14 != 0) goto L_0x0121
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ IllegalArgumentException -> 0x0139 }
            r0.<init>(r15)     // Catch:{ IllegalArgumentException -> 0x0139 }
            r14 = r0
        L_0x0121:
            tv1 r0 = new tv1     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.Object r6 = r1.c     // Catch:{ IllegalArgumentException -> 0x0139 }
            r11 = r6
            gy9 r11 = (defpackage.gy9) r11     // Catch:{ IllegalArgumentException -> 0x0139 }
            org.webrtc.CameraVideoCapturer r12 = r13.createCapturer(r8, r5, r2)     // Catch:{ IllegalArgumentException -> 0x0139 }
            java.lang.Object r1 = r1.o     // Catch:{ IllegalArgumentException -> 0x0139 }
            r17 = r1
            a4c r17 = (defpackage.a4c) r17     // Catch:{ IllegalArgumentException -> 0x0139 }
            r16 = 0
            r10 = r0
            r10.<init>(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ IllegalArgumentException -> 0x0139 }
            return r0
        L_0x0139:
            java.lang.String r0 = "IAE @ camera enumeration"
            r4.log(r3, r0)
        L_0x013e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Cant find camera capturer"
            r0.<init>(r1)
            java.lang.String r1 = "camera.enumerator.null"
            r4.reportException(r3, r1, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i50.a(jx1):tv1");
    }

    public void b(yha yha) {
        tge callback;
        int ordinal = yha.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
            }
            uge uge = (uge) this.X;
            if (!(uge == null || (callback = uge.getCallback()) == null)) {
                callback.onDismiss();
            }
            xha xha = (xha) this.Y;
            if (xha != null) {
                xha.I(yha);
                return;
            }
            return;
        }
        uge uge2 = (uge) this.X;
        if (uge2 != null) {
            yf3 yf3 = new yf3(this, 28, yha);
            tge tge = uge2.o;
            if (tge != null) {
                if (tge.q().getHeight() > 0) {
                    uge uge3 = uge2;
                    uge3.c(tge.h(), tge.y(), new zja(yf3, 26, tge), new xid(21), new sge(uge2, 1));
                }
                uge2.invalidate();
            }
        }
    }

    public void c(dpd dpd) {
        rod rod;
        dpd dpd2 = (dpd) this.s0;
        if (dpd2 != null) {
            if (!dpd2.equals(dpd) || this.b) {
                boolean z = true;
                if (((py0) ((mfe) this.o).a).K1) {
                    this.b = true;
                    return;
                }
                py0 py0 = (py0) ((mfe) this.o).a;
                if (py0.N0) {
                    if ((py0.B0 || py0.s()) && (rod = ((py0) ((wmc) this.c).a).Z) != null) {
                        ag1 ag1 = (ag1) this.Y;
                        boolean z2 = ag1 != null && ag1.u;
                        if (ag1 == null || !ag1.v) {
                            z = false;
                        }
                        rod.d(new wod(dpd, z2, z), false, (qod) null, (jy0) this.Z);
                        this.s0 = dpd;
                        this.b = false;
                    }
                }
            }
        }
    }

    public void d() {
        if (!this.b) {
            if (((Long) this.Z) != null) {
                ((a4c) this.X).log((String) this.Y, "Duplicate accept event");
            }
            ((wte) ((vte) this.c)).getClass();
            this.Z = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    public void e(dpd dpd) {
        this.s0 = dpd;
    }

    public void f() {
        if (!this.b) {
            Long l = (Long) this.Z;
            if (l == null) {
                ((a4c) this.X).log((String) this.Y, "Data is received but accept event wasn't triggered");
                return;
            }
            ((wte) ((vte) this.c)).getClass();
            ((n61) ((m61) this.o)).c("first_media_received", EventItemValueKt.toEventItemValue(SystemClock.elapsedRealtime() - l.longValue()), new EventItemsMap(Collections.singletonMap("call_type", EventItemValueKt.toEventItemValue((String) this.s0))));
            this.b = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r11v2, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r11v3 */
    /* JADX WARNING: type inference failed for: r3v13, types: [qpd, us] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0228  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0237  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void g() {
        /*
            r23 = this;
            r0 = r23
            int r1 = r0.a
            switch(r1) {
                case 4: goto L_0x0040;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r1 = r0.s0
            y1f r1 = (defpackage.y1f) r1
            boolean r1 = r1.o
            if (r1 != 0) goto L_0x003f
            java.lang.Object r1 = r0.o
            w1f r1 = (defpackage.w1f) r1
            java.lang.Object r2 = r0.c
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            defpackage.c2f.a(r2, r1)
            java.lang.Object r1 = r0.o
            r7 = r1
            w1f r7 = (defpackage.w1f) r7
            boolean r8 = r0.b
            java.lang.Object r1 = r0.s0
            r3 = r1
            y1f r3 = (defpackage.y1f) r3
            java.lang.Object r1 = r0.c
            r4 = r1
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            java.lang.Object r1 = r0.X
            r5 = r1
            android.view.View r5 = (android.view.View) r5
            java.lang.Object r1 = r0.Y
            r6 = r1
            android.view.View r6 = (android.view.View) r6
            r3.k(r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.Z
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r2.post(r0)
        L_0x003f:
            return
        L_0x0040:
            java.lang.Object r1 = r0.s0
            fld r1 = (defpackage.fld) r1
            r1.getClass()
            android.view.View r10 = new android.view.View
            java.lang.Object r2 = r0.c
            r11 = r2
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            android.content.Context r2 = r11.getContext()
            r10.<init>(r2)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.lang.Object r2 = r0.o
            r14 = r2
            android.view.View r14 = (android.view.View) r14
            java.lang.Object r2 = r0.X
            r15 = r2
            android.view.View r15 = (android.view.View) r15
            r9 = 0
            if (r15 == 0) goto L_0x00bb
            if (r14 != 0) goto L_0x006f
            goto L_0x00bb
        L_0x006f:
            us r2 = r1.Z
            boolean r3 = r2.isEmpty()
            r4 = 0
            if (r3 != 0) goto L_0x0099
            w1f r3 = r1.w0
            if (r3 != 0) goto L_0x007d
            goto L_0x0099
        L_0x007d:
            us r3 = new us
            r3.<init>(r4)
            defpackage.hm9.y(r3, r14)
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.Set r6 = r2.keySet()
            r5.<init>(r6)
            r3.l(r5)
            java.util.Set r5 = r3.keySet()
            r2.l(r5)
            goto L_0x009d
        L_0x0099:
            r2.clear()
            r3 = r9
        L_0x009d:
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x00a6
            r1.w0 = r9
            goto L_0x00af
        L_0x00a6:
            if (r3 == 0) goto L_0x00af
            java.util.Collection r5 = r3.values()
            r12.addAll(r5)
        L_0x00af:
            w1f r5 = r1.v0
            if (r5 != 0) goto L_0x00c3
            w1f r5 = r1.u0
            if (r5 != 0) goto L_0x00c3
            w1f r5 = r1.w0
            if (r5 != 0) goto L_0x00c3
        L_0x00bb:
            r19 = r13
            r17 = r14
            r13 = r9
            r9 = r11
            goto L_0x0207
        L_0x00c3:
            w1f r5 = r1.w0
            if (r5 == 0) goto L_0x01ec
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            w1f r6 = r1.w0
            java.util.ArrayList r7 = r6.Y
            r7.clear()
            int r8 = r12.size()
            r9 = r4
        L_0x00d8:
            if (r9 >= r8) goto L_0x0161
            java.lang.Object r16 = r12.get(r9)
            r4 = r16
            android.view.View r4 = (android.view.View) r4
            r16 = r8
            int r8 = r7.size()
            r17 = r14
            r14 = 0
        L_0x00eb:
            if (r14 >= r8) goto L_0x00fe
            r18 = r11
            java.lang.Object r11 = r7.get(r14)
            if (r11 != r4) goto L_0x00f9
        L_0x00f5:
            r19 = r13
            goto L_0x0154
        L_0x00f9:
            int r14 = r14 + 1
            r11 = r18
            goto L_0x00eb
        L_0x00fe:
            r18 = r11
            r7.add(r4)
            r4 = r8
        L_0x0104:
            int r11 = r7.size()
            if (r4 >= r11) goto L_0x00f5
            java.lang.Object r11 = r7.get(r4)
            android.view.View r11 = (android.view.View) r11
            boolean r14 = r11 instanceof android.view.ViewGroup
            if (r14 == 0) goto L_0x0149
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            int r14 = r11.getChildCount()
            r19 = r13
            r13 = 0
        L_0x011d:
            if (r13 >= r14) goto L_0x0146
            r20 = r14
            android.view.View r14 = r11.getChildAt(r13)
            r21 = r11
            r11 = 0
        L_0x0128:
            if (r11 >= r8) goto L_0x0138
            r22 = r8
            java.lang.Object r8 = r7.get(r11)
            if (r8 != r14) goto L_0x0133
            goto L_0x013d
        L_0x0133:
            int r11 = r11 + 1
            r8 = r22
            goto L_0x0128
        L_0x0138:
            r22 = r8
            r7.add(r14)
        L_0x013d:
            int r13 = r13 + 1
            r14 = r20
            r11 = r21
            r8 = r22
            goto L_0x011d
        L_0x0146:
            r22 = r8
            goto L_0x014d
        L_0x0149:
            r22 = r8
            r19 = r13
        L_0x014d:
            int r4 = r4 + 1
            r13 = r19
            r8 = r22
            goto L_0x0104
        L_0x0154:
            int r9 = r9 + 1
            r8 = r16
            r14 = r17
            r11 = r18
            r13 = r19
            r4 = 0
            goto L_0x00d8
        L_0x0161:
            r18 = r11
            r19 = r13
            r17 = r14
            r7.add(r10)
            r12.add(r10)
            defpackage.hm9.b(r6, r12)
            int r4 = r2.c
            if (r4 <= 0) goto L_0x01dd
            if (r3 == 0) goto L_0x01dd
            r4 = 0
            java.lang.Object r2 = r2.f(r4)
            java.lang.Object r2 = r3.get(r2)
            android.view.View r2 = (android.view.View) r2
            w1f r3 = r1.w0
            r4 = 2
            r6 = 1
            if (r3 == 0) goto L_0x01b0
            if (r2 == 0) goto L_0x01b0
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            int[] r8 = new int[r4]
            r2.getLocationOnScreen(r8)
            r9 = 0
            r11 = r8[r9]
            r9 = r8[r6]
            int r13 = r2.getWidth()
            int r13 = r13 + r11
            r8 = r8[r6]
            int r14 = r2.getHeight()
            int r14 = r14 + r8
            r7.set(r11, r9, r13, r14)
            bld r8 = new bld
            r9 = 1
            r8.<init>(r9, r7)
            r3.J(r8)
        L_0x01b0:
            w1f r3 = r1.u0
            if (r3 == 0) goto L_0x01dd
            if (r2 == 0) goto L_0x01dd
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            int[] r4 = new int[r4]
            r2.getLocationOnScreen(r4)
            r8 = 0
            r8 = r4[r8]
            r9 = r4[r6]
            int r11 = r2.getWidth()
            int r11 = r11 + r8
            r4 = r4[r6]
            int r2 = r2.getHeight()
            int r2 = r2 + r4
            r7.set(r8, r9, r11, r2)
            bld r2 = new bld
            r4 = 1
            r2.<init>(r4, r7)
            r3.J(r2)
        L_0x01dd:
            w1f r2 = r1.v0
            if (r2 == 0) goto L_0x01ea
            bld r3 = new bld
            r4 = 0
            r3.<init>(r4, r5)
            r2.J(r3)
        L_0x01ea:
            r9 = r5
            goto L_0x01f3
        L_0x01ec:
            r18 = r11
            r19 = r13
            r17 = r14
            r9 = 0
        L_0x01f3:
            ald r11 = new ald
            boolean r5 = r0.b
            r2 = r11
            r3 = r1
            r4 = r15
            r6 = r19
            r7 = r10
            r8 = r12
            r13 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r9 = r18
            defpackage.dld.a(r9, r11)
        L_0x0207:
            w1f r2 = r1.u0
            if (r2 == 0) goto L_0x0228
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            if (r17 == 0) goto L_0x0217
            r4 = r17
            defpackage.fld.n(r3, r4)
        L_0x0217:
            r3.removeAll(r12)
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L_0x0226
            r3.add(r10)
            defpackage.hm9.b(r2, r3)
        L_0x0226:
            r11 = r3
            goto L_0x0229
        L_0x0228:
            r11 = r13
        L_0x0229:
            if (r11 == 0) goto L_0x0231
            boolean r2 = r11.isEmpty()
            if (r2 == 0) goto L_0x0233
        L_0x0231:
            r1.u0 = r13
        L_0x0233:
            w1f r2 = r1.v0
            if (r2 == 0) goto L_0x023a
            r2.b(r10)
        L_0x023a:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            w1f r3 = r1.v0
            w1f r5 = r1.u0
            w1f r7 = r1.w0
            cld r13 = new cld
            r2 = r13
            r4 = r12
            r6 = r11
            r8 = r19
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.Object r2 = r0.Y
            w1f r2 = (defpackage.w1f) r2
            r2.a(r13)
            ald r13 = new ald
            r2 = r13
            r3 = r1
            r4 = r10
            r5 = r15
            r6 = r19
            r7 = r12
            r8 = r11
            r2.<init>(r3, r4, r5, r6, r7, r8)
            defpackage.dld.a(r9, r13)
            h76 r2 = new h76
            r3 = 22
            r4 = 0
            r5 = r19
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r5, (boolean) r4, (int) r3)
            defpackage.dld.a(r9, r2)
            i76 r2 = new i76
            r3 = 20
            r4 = 0
            r2.<init>((java.lang.Object) r1, (java.lang.Object) r5, (boolean) r4, (int) r3)
            defpackage.dld.a(r9, r2)
            java.lang.Object r0 = r0.Z
            i50 r0 = (defpackage.i50) r0
            r0.g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i50.g():void");
    }

    public void h() {
        if (((Long) this.Z) != null && !this.b) {
            this.b = true;
            ((t33) ((q33) ((je7) this.Y).getValue())).j("app.audio_onboarding_ended", true);
        }
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return jb9.c(this);
            default:
                return super.toString();
        }
    }

    public i50(od odVar) {
        this.a = 5;
        this.X = (aq7) odVar.X;
        a4c a4c = (a4c) odVar.c;
        this.o = a4c;
        this.c = (gy9) odVar.b;
        a4c.log("OKRTCSvcFactory", "Is VIDEO HW acceleration enabled ? ".concat(jb9.a ^ true ? "yes" : "no"));
        a4c.log("OKRTCSvcFactory", "Is Camera2 API enabled ? " + odVar.a);
        this.b = odVar.a;
        this.s0 = (Context) odVar.Y;
        this.Y = new wd6(27, (Object) a4c);
        this.Z = new lz1(a4c);
        HardwareVideoEncoderFactory.odklSupportedH264HwCodecPrefixes.clear();
        HardwareVideoEncoderFactory.odklSupportedH264HwCodecPrefixes.addAll((List) odVar.o);
    }

    public i50(wmc wmc, mfe mfe, a4c a4c, ag1 ag1) {
        this.a = 1;
        this.s0 = null;
        this.b = false;
        this.c = wmc;
        this.o = mfe;
        this.X = a4c;
        this.Z = new jy0(1, this);
        this.Y = ag1;
    }

    public i50(wte wte, m61 m61, a4c a4c, String str, String str2) {
        this.a = 3;
        this.c = wte;
        this.o = m61;
        this.X = a4c;
        this.Y = str;
        this.s0 = str2;
    }

    public i50(ch9 ch9, sx3 sx3, je7 je7) {
        this.a = 0;
        this.c = ch9;
        kld b2 = lld.b(0, Integer.MAX_VALUE, 0, 5);
        this.o = b2;
        this.X = new v7c(b2);
        this.Y = je7;
        boolean z = ((t33) ((q33) je7.getValue())).g.getBoolean("app.audio_onboarding_ended", false);
        this.b = z;
        qqd qqd = new qqd(3, (Object) this);
        this.s0 = qqd;
        if (!z) {
            ((uh9) ch9).e(qqd);
            pag.n(sx3.getCoroutineContext()).invokeOnCompletion(new l(12, this));
        }
    }

    public i50(WeakReference weakReference) {
        this.a = 2;
        this.c = weakReference;
        this.o = uia.Z;
        this.Z = new ck(6, this);
        this.s0 = new zha(this);
    }
}
