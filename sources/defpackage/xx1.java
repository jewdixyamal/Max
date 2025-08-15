package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: xx1  reason: default package */
public final class xx1 implements fv1 {
    public c9e A0;
    public final ejc B0;
    public final fjc C0;
    public final fjc D0;
    public final ge7 E0;
    public final ge7 F0;
    public final x90 X;
    public final ArrayList Y = new ArrayList();
    public final ArrayList Z = new ArrayList();
    public final ax1 a;
    public final ax1 b;
    public final y7g c;
    public final r9f o;
    public final l0f s0;
    public uof t0;
    public List u0 = Collections.emptyList();
    public final yv1 v0;
    public final Object w0 = new Object();
    public boolean x0 = true;
    public ce3 y0 = null;
    public l9f z0;

    public xx1(ax1 ax1, ax1 ax12, fjc fjc, fjc fjc2, l0f l0f, y7g y7g, ev1 ev1) {
        ge7 ge7 = ge7.f;
        this.a = ax1;
        this.b = ax12;
        this.E0 = ge7;
        this.F0 = ge7;
        this.s0 = l0f;
        this.c = y7g;
        this.o = ev1;
        yv1 yv1 = fjc.c;
        this.v0 = yv1;
        yv1.P();
        this.B0 = new ejc(ax1.g());
        this.C0 = fjc;
        this.D0 = fjc2;
        this.X = t(fjc, fjc2);
    }

    public static ArrayList A(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l9f l9f = (l9f) it.next();
            l9f.getClass();
            l9f.m = null;
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                zgf zgf = (zgf) it2.next();
                if (l9f.m(zgf.a)) {
                    boolean z = l9f.m == null;
                    c54.p(l9f + " already has effect" + l9f.m, z);
                    c54.k(l9f.m(zgf.a));
                    l9f.m = zgf;
                    arrayList2.remove(zgf);
                }
            }
        }
        return arrayList2;
    }

    public static Matrix m(Rect rect, Size size) {
        c54.j("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, (float) size.getWidth(), (float) size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public static x90 t(fjc fjc, fjc fjc2) {
        StringBuilder sb = new StringBuilder();
        sb.append(fjc.a.d());
        sb.append(fjc2 == null ? "" : fjc2.a.d());
        return new x90(sb.toString(), ((aw1) fjc.c).a);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [wx1, java.lang.Object] */
    public static HashMap u(ArrayList arrayList, r9f r9f, r9f r9f2) {
        o9f o9f;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l9f l9f = (l9f) it.next();
            if (l9f instanceof c9e) {
                c9e c9e = (c9e) l9f;
                o9f f = new mt6(2).b().f(false, r9f);
                if (f == null) {
                    o9f = null;
                } else {
                    mi9 c2 = mi9.c(f);
                    c2.a.remove(cne.e0);
                    o9f = ((gaa) c9e.l(c2)).J();
                }
            } else {
                o9f = l9f.f(false, r9f);
            }
            o9f f2 = l9f.f(true, r9f2);
            ? obj = new Object();
            obj.a = o9f;
            obj.b = f2;
            hashMap.put(l9f, obj);
        }
        return hashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean y(defpackage.vb0 r4, defpackage.fad r5) {
        /*
            kz1 r0 = r5.g
            ce3 r0 = r0.b
            ce3 r4 = r4.d
            java.util.Set r1 = r4.g()
            int r1 = r1.size()
            kz1 r5 = r5.g
            ce3 r5 = r5.b
            java.util.Set r5 = r5.g()
            int r5 = r5.size()
            r2 = 1
            if (r1 == r5) goto L_0x001e
            return r2
        L_0x001e:
            java.util.Set r5 = r4.g()
            java.util.Iterator r5 = r5.iterator()
        L_0x0026:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r5.next()
            aa0 r1 = (defpackage.aa0) r1
            boolean r3 = r0.o(r1)
            if (r3 == 0) goto L_0x0046
            java.lang.Object r3 = r0.h(r1)
            java.lang.Object r1 = r4.h(r1)
            boolean r1 = java.util.Objects.equals(r3, r1)
            if (r1 != 0) goto L_0x0026
        L_0x0046:
            return r2
        L_0x0047:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xx1.y(vb0, fad):boolean");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final void B(java.util.LinkedHashSet r20, boolean r21, boolean r22) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            java.lang.Object r9 = r7.w0
            monitor-enter(r9)
            r19.x()     // Catch:{ all -> 0x0100 }
            java.lang.Object r1 = r7.w0     // Catch:{ all -> 0x0100 }
            monitor-enter(r1)     // Catch:{ all -> 0x0100 }
            java.util.List r0 = r7.u0     // Catch:{ all -> 0x0052 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0052 }
            r11 = 1
            if (r0 != 0) goto L_0x0055
            java.util.Iterator r0 = r20.iterator()     // Catch:{ all -> 0x0052 }
        L_0x001a:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0046
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0052 }
            l9f r2 = (defpackage.l9f) r2     // Catch:{ all -> 0x0052 }
            boolean r3 = r2 instanceof defpackage.fu6     // Catch:{ all -> 0x0052 }
            if (r3 != 0) goto L_0x002b
            goto L_0x001a
        L_0x002b:
            o9f r2 = r2.f     // Catch:{ all -> 0x0052 }
            aa0 r3 = defpackage.gu6.Y     // Catch:{ all -> 0x0052 }
            boolean r4 = r2.o(r3)     // Catch:{ all -> 0x0052 }
            if (r4 == 0) goto L_0x001a
            java.lang.Object r2 = r2.h(r3)     // Catch:{ all -> 0x0052 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ all -> 0x0052 }
            r2.getClass()     // Catch:{ all -> 0x0052 }
            int r2 = r2.intValue()     // Catch:{ all -> 0x0052 }
            if (r2 != r11) goto L_0x001a
            r0 = r11
            goto L_0x0047
        L_0x0046:
            r0 = 0
        L_0x0047:
            if (r0 != 0) goto L_0x004a
            goto L_0x0055
        L_0x004a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0052 }
            java.lang.String r2 = "Ultra HDR image capture does not support for use with CameraEffect."
            r0.<init>(r2)     // Catch:{ all -> 0x0052 }
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            goto L_0x0262
        L_0x0055:
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            if (r21 != 0) goto L_0x005b
            r19.x()     // Catch:{ all -> 0x0100 }
        L_0x005b:
            c9e r0 = r19.r(r20, r21)     // Catch:{ all -> 0x0100 }
            l9f r12 = r7.i(r8, r0)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0100 }
            r13.<init>(r8)     // Catch:{ all -> 0x0100 }
            if (r12 == 0) goto L_0x006d
            r13.add(r12)     // Catch:{ all -> 0x0100 }
        L_0x006d:
            if (r0 == 0) goto L_0x0079
            r13.add(r0)     // Catch:{ all -> 0x0100 }
            aqf r1 = r0.q     // Catch:{ all -> 0x0100 }
            java.util.Set r1 = r1.a     // Catch:{ all -> 0x0100 }
            r13.removeAll(r1)     // Catch:{ all -> 0x0100 }
        L_0x0079:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0100 }
            r14.<init>(r13)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.Z     // Catch:{ all -> 0x0100 }
            r14.removeAll(r1)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0100 }
            r15.<init>(r13)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.Z     // Catch:{ all -> 0x0100 }
            r15.retainAll(r1)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.Z     // Catch:{ all -> 0x0100 }
            r6.<init>(r1)     // Catch:{ all -> 0x0100 }
            r6.removeAll(r13)     // Catch:{ all -> 0x0100 }
            yv1 r1 = r7.v0     // Catch:{ all -> 0x0100 }
            p9f r2 = defpackage.r9f.a     // Catch:{ all -> 0x0100 }
            aa0 r3 = defpackage.yv1.g     // Catch:{ all -> 0x0100 }
            java.lang.Object r1 = r1.f(r3, r2)     // Catch:{ all -> 0x0100 }
            r9f r1 = (defpackage.r9f) r1     // Catch:{ all -> 0x0100 }
            r9f r2 = r7.o     // Catch:{ all -> 0x0100 }
            java.util.HashMap r5 = u(r14, r1, r2)     // Catch:{ all -> 0x0100 }
            java.util.Map r16 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0100 }
            r4 = 2
            java.lang.Object r1 = r7.w0     // Catch:{ IllegalArgumentException -> 0x0247 }
            monitor-enter(r1)     // Catch:{ IllegalArgumentException -> 0x0247 }
            l0f r2 = r7.s0     // Catch:{ all -> 0x00ba }
            int r2 = r2.b     // Catch:{ all -> 0x00ba }
            if (r2 != r4) goto L_0x00be
            monitor-exit(r1)     // Catch:{ all -> 0x00ba }
            r2 = r11
            goto L_0x00c0
        L_0x00ba:
            r0 = move-exception
            r10 = r4
            goto L_0x024a
        L_0x00be:
            monitor-exit(r1)     // Catch:{ all -> 0x00ba }
            r2 = 0
        L_0x00c0:
            ax1 r1 = r7.a     // Catch:{ IllegalArgumentException -> 0x0247 }
            yw1 r3 = r1.p()     // Catch:{ IllegalArgumentException -> 0x0247 }
            r1 = r19
            r10 = r4
            r4 = r14
            r17 = r5
            r5 = r15
            r18 = r6
            r6 = r17
            java.util.HashMap r6 = r1.q(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0103 }
            ax1 r1 = r7.b     // Catch:{ IllegalArgumentException -> 0x0103 }
            if (r1 == 0) goto L_0x0108
            java.lang.Object r1 = r7.w0     // Catch:{ IllegalArgumentException -> 0x0103 }
            monitor-enter(r1)     // Catch:{ IllegalArgumentException -> 0x0103 }
            l0f r2 = r7.s0     // Catch:{ all -> 0x00e5 }
            int r2 = r2.b     // Catch:{ all -> 0x00e5 }
            if (r2 != r10) goto L_0x00e7
            monitor-exit(r1)     // Catch:{ all -> 0x00e5 }
            r2 = r11
            goto L_0x00e9
        L_0x00e5:
            r0 = move-exception
            goto L_0x0106
        L_0x00e7:
            monitor-exit(r1)     // Catch:{ all -> 0x00e5 }
            r2 = 0
        L_0x00e9:
            ax1 r1 = r7.b     // Catch:{ IllegalArgumentException -> 0x0103 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ IllegalArgumentException -> 0x0103 }
            yw1 r3 = r1.p()     // Catch:{ IllegalArgumentException -> 0x0103 }
            r1 = r19
            r4 = r14
            r5 = r15
            r11 = r6
            r6 = r17
            java.util.HashMap r16 = r1.q(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0103 }
        L_0x00fd:
            r1 = r16
            goto L_0x010a
        L_0x0100:
            r0 = move-exception
            goto L_0x0264
        L_0x0103:
            r0 = move-exception
            goto L_0x024e
        L_0x0106:
            monitor-exit(r1)     // Catch:{ all -> 0x00e5 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0103 }
        L_0x0108:
            r11 = r6
            goto L_0x00fd
        L_0x010a:
            r7.C(r11, r13)     // Catch:{ all -> 0x0100 }
            java.util.List r2 = r7.u0     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r2 = A(r13, r2)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x0100 }
            r3.<init>(r8)     // Catch:{ all -> 0x0100 }
            r3.removeAll(r13)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r2 = A(r3, r2)     // Catch:{ all -> 0x0100 }
            int r3 = r2.size()     // Catch:{ all -> 0x0100 }
            if (r3 <= 0) goto L_0x0128
            r2.toString()     // Catch:{ all -> 0x0100 }
        L_0x0128:
            java.util.Iterator r2 = r18.iterator()     // Catch:{ all -> 0x0100 }
        L_0x012c:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0100 }
            if (r3 == 0) goto L_0x013e
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0100 }
            l9f r3 = (defpackage.l9f) r3     // Catch:{ all -> 0x0100 }
            ax1 r4 = r7.a     // Catch:{ all -> 0x0100 }
            r3.D(r4)     // Catch:{ all -> 0x0100 }
            goto L_0x012c
        L_0x013e:
            ax1 r2 = r7.a     // Catch:{ all -> 0x0100 }
            r3 = r18
            r2.l(r3)     // Catch:{ all -> 0x0100 }
            ax1 r2 = r7.b     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x016a
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x0100 }
        L_0x014d:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x0162
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0100 }
            l9f r4 = (defpackage.l9f) r4     // Catch:{ all -> 0x0100 }
            ax1 r5 = r7.b     // Catch:{ all -> 0x0100 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x0100 }
            r4.D(r5)     // Catch:{ all -> 0x0100 }
            goto L_0x014d
        L_0x0162:
            ax1 r2 = r7.b     // Catch:{ all -> 0x0100 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x0100 }
            r2.l(r3)     // Catch:{ all -> 0x0100 }
        L_0x016a:
            boolean r2 = r3.isEmpty()     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x01af
            java.util.Iterator r2 = r15.iterator()     // Catch:{ all -> 0x0100 }
        L_0x0174:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0100 }
            if (r3 == 0) goto L_0x01af
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0100 }
            l9f r3 = (defpackage.l9f) r3     // Catch:{ all -> 0x0100 }
            boolean r4 = r11.containsKey(r3)     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x0174
            java.lang.Object r4 = r11.get(r3)     // Catch:{ all -> 0x0100 }
            vb0 r4 = (defpackage.vb0) r4     // Catch:{ all -> 0x0100 }
            ce3 r5 = r4.d     // Catch:{ all -> 0x0100 }
            if (r5 == 0) goto L_0x0174
            fad r6 = r3.n     // Catch:{ all -> 0x0100 }
            boolean r4 = y(r4, r6)     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x0174
            vb0 r4 = r3.x(r5)     // Catch:{ all -> 0x0100 }
            r3.g = r4     // Catch:{ all -> 0x0100 }
            boolean r4 = r7.x0     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x0174
            ax1 r4 = r7.a     // Catch:{ all -> 0x0100 }
            r4.i(r3)     // Catch:{ all -> 0x0100 }
            ax1 r4 = r7.b     // Catch:{ all -> 0x0100 }
            if (r4 == 0) goto L_0x0174
            r4.i(r3)     // Catch:{ all -> 0x0100 }
            goto L_0x0174
        L_0x01af:
            java.util.Iterator r2 = r14.iterator()     // Catch:{ all -> 0x0100 }
        L_0x01b3:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0100 }
            if (r3 == 0) goto L_0x0209
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0100 }
            l9f r3 = (defpackage.l9f) r3     // Catch:{ all -> 0x0100 }
            r4 = r17
            java.lang.Object r5 = r4.get(r3)     // Catch:{ all -> 0x0100 }
            wx1 r5 = (defpackage.wx1) r5     // Catch:{ all -> 0x0100 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x0100 }
            ax1 r6 = r7.b     // Catch:{ all -> 0x0100 }
            if (r6 == 0) goto L_0x01ed
            ax1 r10 = r7.a     // Catch:{ all -> 0x0100 }
            o9f r15 = r5.a     // Catch:{ all -> 0x0100 }
            o9f r5 = r5.b     // Catch:{ all -> 0x0100 }
            r3.a(r10, r6, r15, r5)     // Catch:{ all -> 0x0100 }
            java.lang.Object r5 = r11.get(r3)     // Catch:{ all -> 0x0100 }
            vb0 r5 = (defpackage.vb0) r5     // Catch:{ all -> 0x0100 }
            r5.getClass()     // Catch:{ all -> 0x0100 }
            java.lang.Object r6 = r1.get(r3)     // Catch:{ all -> 0x0100 }
            vb0 r6 = (defpackage.vb0) r6     // Catch:{ all -> 0x0100 }
            vb0 r5 = r3.y(r5, r6)     // Catch:{ all -> 0x0100 }
            r3.g = r5     // Catch:{ all -> 0x0100 }
            goto L_0x0206
        L_0x01ed:
            ax1 r6 = r7.a     // Catch:{ all -> 0x0100 }
            o9f r10 = r5.a     // Catch:{ all -> 0x0100 }
            o9f r5 = r5.b     // Catch:{ all -> 0x0100 }
            r15 = 0
            r3.a(r6, r15, r10, r5)     // Catch:{ all -> 0x0100 }
            java.lang.Object r5 = r11.get(r3)     // Catch:{ all -> 0x0100 }
            vb0 r5 = (defpackage.vb0) r5     // Catch:{ all -> 0x0100 }
            r5.getClass()     // Catch:{ all -> 0x0100 }
            vb0 r5 = r3.y(r5, r15)     // Catch:{ all -> 0x0100 }
            r3.g = r5     // Catch:{ all -> 0x0100 }
        L_0x0206:
            r17 = r4
            goto L_0x01b3
        L_0x0209:
            boolean r1 = r7.x0     // Catch:{ all -> 0x0100 }
            if (r1 == 0) goto L_0x0219
            ax1 r1 = r7.a     // Catch:{ all -> 0x0100 }
            r1.k(r14)     // Catch:{ all -> 0x0100 }
            ax1 r1 = r7.b     // Catch:{ all -> 0x0100 }
            if (r1 == 0) goto L_0x0219
            r1.k(r14)     // Catch:{ all -> 0x0100 }
        L_0x0219:
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x0100 }
        L_0x021d:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0100 }
            if (r2 == 0) goto L_0x022d
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0100 }
            l9f r2 = (defpackage.l9f) r2     // Catch:{ all -> 0x0100 }
            r2.r()     // Catch:{ all -> 0x0100 }
            goto L_0x021d
        L_0x022d:
            java.util.ArrayList r1 = r7.Y     // Catch:{ all -> 0x0100 }
            r1.clear()     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.Y     // Catch:{ all -> 0x0100 }
            r1.addAll(r8)     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.Z     // Catch:{ all -> 0x0100 }
            r1.clear()     // Catch:{ all -> 0x0100 }
            java.util.ArrayList r1 = r7.Z     // Catch:{ all -> 0x0100 }
            r1.addAll(r13)     // Catch:{ all -> 0x0100 }
            r7.z0 = r12     // Catch:{ all -> 0x0100 }
            r7.A0 = r0     // Catch:{ all -> 0x0100 }
            monitor-exit(r9)     // Catch:{ all -> 0x0100 }
            return
        L_0x0247:
            r0 = move-exception
            r10 = r4
            goto L_0x024e
        L_0x024a:
            monitor-exit(r1)     // Catch:{ all -> 0x024c }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0103 }
        L_0x024c:
            r0 = move-exception
            goto L_0x024a
        L_0x024e:
            if (r21 != 0) goto L_0x0261
            r19.x()     // Catch:{ all -> 0x0100 }
            l0f r1 = r7.s0     // Catch:{ all -> 0x0100 }
            int r1 = r1.b     // Catch:{ all -> 0x0100 }
            if (r1 == r10) goto L_0x0261
            r1 = r22
            r2 = 1
            r7.B(r8, r2, r1)     // Catch:{ all -> 0x0100 }
            monitor-exit(r9)     // Catch:{ all -> 0x0100 }
            return
        L_0x0261:
            throw r0     // Catch:{ all -> 0x0100 }
        L_0x0262:
            monitor-exit(r1)     // Catch:{ all -> 0x0052 }
            throw r0     // Catch:{ all -> 0x0100 }
        L_0x0264:
            monitor-exit(r9)     // Catch:{ all -> 0x0100 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xx1.B(java.util.LinkedHashSet, boolean, boolean):void");
    }

    public final void C(HashMap hashMap, ArrayList arrayList) {
        synchronized (this.w0) {
            try {
                if (this.t0 != null && !arrayList.isEmpty()) {
                    boolean z = this.a.p().g() == 0;
                    Rect e = this.a.g().e();
                    Rational rational = this.t0.b;
                    int l = this.a.p().l(this.t0.c);
                    uof uof = this.t0;
                    HashMap h = ema.h(e, z, rational, l, uof.a, uof.d, hashMap);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        l9f l9f = (l9f) it.next();
                        Rect rect = (Rect) h.get(l9f);
                        rect.getClass();
                        l9f.C(rect);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    l9f l9f2 = (l9f) it2.next();
                    Rect e2 = this.a.g().e();
                    vb0 vb0 = (vb0) hashMap.get(l9f2);
                    vb0.getClass();
                    l9f2.A(m(e2, vb0.a));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final yw1 a() {
        return this.C0;
    }

    public final void c(List list) {
        synchronized (this.w0) {
            try {
                this.a.b(this.v0);
                ax1 ax1 = this.b;
                if (ax1 != null) {
                    ax1.b(this.v0);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.Y);
                linkedHashSet.addAll(list);
                ax1 ax12 = this.b;
                boolean z = false;
                boolean z2 = ax12 != null;
                if (ax12 != null) {
                    z = true;
                }
                B(linkedHashSet, z2, z);
            } catch (IllegalArgumentException e) {
                throw new Exception(e);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.w0) {
            try {
                if (!this.x0) {
                    if (!this.Z.isEmpty()) {
                        this.a.b(this.v0);
                        ax1 ax1 = this.b;
                        if (ax1 != null) {
                            ax1.b(this.v0);
                        }
                    }
                    this.a.k(this.Z);
                    ax1 ax12 = this.b;
                    if (ax12 != null) {
                        ax12.k(this.Z);
                    }
                    synchronized (this.w0) {
                        if (this.y0 != null) {
                            this.a.g().c(this.y0);
                        }
                    }
                    Iterator it = this.Z.iterator();
                    while (it.hasNext()) {
                        ((l9f) it.next()).r();
                    }
                    this.x0 = true;
                }
            } catch (Throwable th) {
                throw th;
            } finally {
                while (true) {
                }
            }
        }
    }

    public final l9f i(LinkedHashSet linkedHashSet, c9e c9e) {
        boolean z;
        boolean z2;
        h8b h8b;
        synchronized (this.w0) {
            try {
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (c9e != null) {
                    arrayList.add(c9e);
                    arrayList.removeAll(c9e.q.a);
                }
                synchronized (this.w0) {
                    z = false;
                    z2 = ((Integer) this.v0.f(yv1.h, 0)).intValue() == 1;
                }
                if (z2) {
                    Iterator it = arrayList.iterator();
                    boolean z3 = false;
                    boolean z4 = false;
                    while (it.hasNext()) {
                        l9f l9f = (l9f) it.next();
                        if (!(l9f instanceof h8b)) {
                            if (!(l9f instanceof c9e)) {
                                if (l9f instanceof fu6) {
                                    z3 = true;
                                }
                            }
                        }
                        z4 = true;
                    }
                    if (!z3 || z4) {
                        Iterator it2 = arrayList.iterator();
                        boolean z5 = false;
                        while (it2.hasNext()) {
                            l9f l9f2 = (l9f) it2.next();
                            if (!(l9f2 instanceof h8b)) {
                                if (!(l9f2 instanceof c9e)) {
                                    if (l9f2 instanceof fu6) {
                                        z5 = true;
                                    }
                                }
                            }
                            z = true;
                        }
                        if (z && !z5) {
                            l9f l9f3 = this.z0;
                            if (l9f3 instanceof fu6) {
                                h8b = l9f3;
                            } else {
                                mt6 mt6 = new mt6(1);
                                mt6.b.j(cne.d0, "ImageCapture-Extra");
                                h8b = mt6.a();
                            }
                        }
                    } else {
                        l9f l9f4 = this.z0;
                        if (l9f4 instanceof h8b) {
                            h8b = l9f4;
                        } else {
                            mt6 mt62 = new mt6(2);
                            mt62.b.j(cne.d0, "Preview-Extra");
                            h8b b2 = mt62.b();
                            b2.G(new un0(14));
                            h8b = b2;
                        }
                    }
                }
                h8b = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h8b;
    }

    public final HashMap q(int i, yw1 yw1, ArrayList arrayList, ArrayList arrayList2, HashMap hashMap) {
        Size size;
        y7g y7g;
        Rect rect;
        boolean z;
        boolean z2;
        xb0 xb0;
        yw1 yw12 = yw1;
        ArrayList arrayList3 = new ArrayList();
        String d = yw1.d();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            size = null;
            y7g = this.c;
            if (!hasNext) {
                break;
            }
            l9f l9f = (l9f) it.next();
            int inputFormat = l9f.f.getInputFormat();
            vb0 vb0 = l9f.g;
            Size size2 = vb0 != null ? vb0.a : null;
            bee bee = (bee) ((HashMap) y7g.b).get(d);
            if (bee != null) {
                xb0 = xb0.b(i, inputFormat, size2, bee.i(inputFormat));
            } else {
                int i2 = i;
                xb0 = null;
            }
            int inputFormat2 = l9f.f.getInputFormat();
            vb0 vb02 = l9f.g;
            Size size3 = vb02 != null ? vb02.a : null;
            vb02.getClass();
            l90 l90 = new l90(xb0, inputFormat2, size3, vb02.b, c9e.J(l9f), l9f.g.d, (Range) l9f.f.f(o9f.l0, (Object) null));
            arrayList3.add(l90);
            hashMap3.put(l90, l9f);
            hashMap2.put(l9f, l9f.g);
        }
        int i3 = i;
        if (!arrayList.isEmpty()) {
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            try {
                rect = this.a.g().e();
            } catch (NullPointerException unused) {
                rect = null;
            }
            if (rect != null) {
                size = e1f.e(rect);
            }
            jo7 jo7 = new jo7(yw12, size);
            Iterator it2 = arrayList.iterator();
            loop1:
            while (true) {
                z = false;
                while (true) {
                    if (!it2.hasNext()) {
                        break loop1;
                    }
                    l9f l9f2 = (l9f) it2.next();
                    wx1 wx1 = (wx1) hashMap.get(l9f2);
                    o9f o2 = l9f2.o(yw12, wx1.a, wx1.b);
                    hashMap4.put(o2, l9f2);
                    hashMap5.put(o2, jo7.k(o2));
                    o9f o9f = l9f2.f;
                    if (o9f instanceof i8b) {
                        if (((i8b) o9f).X() == 2) {
                            z = true;
                        }
                    }
                }
            }
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z2 = false;
                    break;
                }
                l9f l9f3 = (l9f) it3.next();
                if (l9f3 != null) {
                    if (!l9f3.f.o(o9f.o0)) {
                        l9f3.toString();
                    } else if (l9f3.f.N() == q9f.o) {
                        z2 = true;
                        break;
                    }
                }
            }
            y7g.getClass();
            c54.j("No new use cases to be bound.", !hashMap5.isEmpty());
            bee bee2 = (bee) ((HashMap) y7g.b).get(d);
            if (bee2 != null) {
                Pair g = bee2.g(i, arrayList3, hashMap5, z, z2);
                for (Map.Entry entry : hashMap4.entrySet()) {
                    hashMap2.put((l9f) entry.getValue(), (vb0) ((Map) g.first).get(entry.getKey()));
                }
                for (Map.Entry entry2 : ((Map) g.second).entrySet()) {
                    if (hashMap3.containsKey(entry2.getKey())) {
                        hashMap2.put((l9f) hashMap3.get(entry2.getKey()), (vb0) entry2.getValue());
                    }
                }
            } else {
                throw new IllegalArgumentException(wg0.i("No such camera id in supported combination list: ", d));
            }
        }
        return hashMap2;
    }

    public final c9e r(LinkedHashSet linkedHashSet, boolean z) {
        synchronized (this.w0) {
            try {
                HashSet v = v(linkedHashSet, z);
                if (v.size() < 2) {
                    x();
                    return null;
                }
                c9e c9e = this.A0;
                if (c9e == null || !c9e.q.a.equals(v)) {
                    int[] iArr = {1, 2, 4};
                    HashSet hashSet = new HashSet();
                    Iterator it = v.iterator();
                    while (it.hasNext()) {
                        l9f l9f = (l9f) it.next();
                        int i = 0;
                        while (true) {
                            if (i < 3) {
                                int i2 = iArr[i];
                                if (l9f.m(i2)) {
                                    if (hashSet.contains(Integer.valueOf(i2))) {
                                        return null;
                                    }
                                    hashSet.add(Integer.valueOf(i2));
                                }
                                i++;
                            }
                        }
                    }
                    c9e c9e2 = new c9e(this.a, this.b, this.E0, this.F0, v, this.o);
                    return c9e2;
                }
                c9e c9e3 = this.A0;
                Objects.requireNonNull(c9e3);
                return c9e3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s() {
        synchronized (this.w0) {
            try {
                if (this.x0) {
                    this.a.l(new ArrayList(this.Z));
                    ax1 ax1 = this.b;
                    if (ax1 != null) {
                        ax1.l(new ArrayList(this.Z));
                    }
                    synchronized (this.w0) {
                        hw1 g = this.a.g();
                        this.y0 = g.m();
                        g.n();
                    }
                    this.x0 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet v(LinkedHashSet linkedHashSet, boolean z) {
        int i;
        HashSet hashSet = new HashSet();
        synchronized (this.w0) {
            try {
                Iterator it = this.u0.iterator();
                zgf zgf = null;
                while (true) {
                    boolean z2 = true;
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    zgf zgf2 = (zgf) it.next();
                    int i2 = 0;
                    for (int i3 = zgf2.a; i3 != 0; i3 >>= 1) {
                        i2 += i3 & 1;
                    }
                    if (i2 > 1) {
                        if (zgf != null) {
                            z2 = false;
                        }
                        c54.p("Can only have one sharing effect.", z2);
                        zgf = zgf2;
                    }
                }
                if (zgf != null) {
                    i = zgf.a;
                }
                if (z) {
                    i |= 3;
                }
            } finally {
                while (true) {
                }
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            l9f l9f = (l9f) it2.next();
            c54.j("Only support one level of sharing for now.", !(l9f instanceof c9e));
            if (l9f.m(i)) {
                hashSet.add(l9f);
            }
        }
        return hashSet;
    }

    public final List w() {
        ArrayList arrayList;
        synchronized (this.w0) {
            arrayList = new ArrayList(this.Y);
        }
        return arrayList;
    }

    public final void x() {
        synchronized (this.w0) {
            this.v0.P();
        }
    }

    public final void z(ArrayList arrayList) {
        synchronized (this.w0) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.Y);
            linkedHashSet.removeAll(arrayList);
            ax1 ax1 = this.b;
            boolean z = false;
            boolean z2 = ax1 != null;
            if (ax1 != null) {
                z = true;
            }
            B(linkedHashSet, z2, z);
        }
    }
}
