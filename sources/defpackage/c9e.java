package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Size;
import androidx.camera.core.ProcessingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* renamed from: c9e  reason: default package */
public final class c9e extends l9f {
    public bad A;
    public bad B;
    public cad C;
    public final d9e p;
    public final aqf q;
    public final ge7 r;
    public final ge7 s;
    public nw4 t;
    public nw4 u;
    public o23 v;
    public iee w;
    public iee x;
    public iee y;
    public iee z;

    public c9e(ax1 ax1, ax1 ax12, ge7 ge7, ge7 ge72, HashSet hashSet, r9f r9f) {
        super(K(hashSet));
        this.p = K(hashSet);
        this.r = ge7;
        this.s = ge72;
        this.q = new aqf(ax1, ax12, hashSet, r9f, new bqc(19, this));
    }

    public static ArrayList J(l9f l9f) {
        ArrayList arrayList = new ArrayList();
        if (l9f instanceof c9e) {
            for (l9f l9f2 : ((c9e) l9f).q.a) {
                arrayList.add(l9f2.f.N());
            }
        } else {
            arrayList.add(l9f.f.N());
        }
        return arrayList;
    }

    public static d9e K(HashSet hashSet) {
        mi9 b = mi9.b();
        new gaa(b);
        b.j(tu6.z, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            l9f l9f = (l9f) it.next();
            if (l9f.f.o(o9f.o0)) {
                arrayList.add(l9f.f.N());
            }
        }
        b.j(d9e.b, arrayList);
        b.j(ev6.E, 2);
        return new d9e(wma.a(b));
    }

    public final void F() {
        cad cad = this.C;
        if (cad != null) {
            cad.b();
            this.C = null;
        }
        iee iee = this.w;
        if (iee != null) {
            iee.c();
            this.w = null;
        }
        iee iee2 = this.x;
        if (iee2 != null) {
            iee2.c();
            this.x = null;
        }
        iee iee3 = this.y;
        if (iee3 != null) {
            iee3.c();
            this.y = null;
        }
        iee iee4 = this.z;
        if (iee4 != null) {
            iee4.c();
            this.z = null;
        }
        nw4 nw4 = this.u;
        if (nw4 != null) {
            nw4.n();
            this.u = null;
        }
        o23 o23 = this.v;
        if (o23 != null) {
            ((lee) o23.a).release();
            kq0.H(new dd4(9, o23));
            this.v = null;
        }
        nw4 nw42 = this.t;
        if (nw42 != null) {
            nw42.n();
            this.t = null;
        }
    }

    public final List G(String str, String str2, o9f o9f, vb0 vb0, vb0 vb02) {
        boolean z2;
        nw4 nw4;
        vb0 vb03 = vb0;
        vb0 vb04 = vb02;
        kq0.e();
        aqf aqf = this.q;
        if (vb04 == null) {
            H(str, str2, o9f, vb0, (vb0) null);
            ax1 c = c();
            Objects.requireNonNull(c);
            zgf zgf = this.m;
            if (zgf == null || zgf.b != 1) {
                nw4 = new nw4(c, (lee) new ce4(vb03.b));
            } else {
                nw4 = new nw4(c, (lee) new mee(zgf));
                this.t = nw4;
            }
            this.u = nw4;
            boolean z3 = this.i != null;
            iee iee = this.y;
            int k = k();
            aqf.getClass();
            HashMap hashMap = new HashMap();
            for (l9f l9f : aqf.a) {
                hashMap.put(l9f, aqf.q(l9f, aqf.v0, aqf.Y, iee, k, z3));
            }
            xs4 r2 = this.u.r(new ac0(this.y, new ArrayList(hashMap.values())));
            HashMap hashMap2 = new HashMap();
            for (Map.Entry entry : hashMap.entrySet()) {
                hashMap2.put((l9f) entry.getKey(), (iee) r2.get(entry.getValue()));
            }
            aqf.u(hashMap2);
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{this.A.c()}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        H(str, str2, o9f, vb0, vb02);
        Matrix matrix = this.j;
        ax1 i = i();
        Objects.requireNonNull(i);
        boolean n = i.n();
        Rect rect = this.i;
        if (rect != null) {
            z2 = false;
        } else {
            Size size = vb04.a;
            z2 = false;
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        ax1 i2 = i();
        Objects.requireNonNull(i2);
        int h = h(i2, z2);
        ax1 i3 = i();
        Objects.requireNonNull(i3);
        boolean n2 = n(i3);
        aqf aqf2 = aqf;
        iee iee2 = new iee(3, 34, vb02, matrix, n, rect, h, -1, n2);
        this.x = iee2;
        ax1 i4 = i();
        Objects.requireNonNull(i4);
        this.z = L(iee2, i4);
        bad I = I(this.x, o9f, vb04);
        this.B = I;
        cad cad = this.C;
        if (cad != null) {
            cad.b();
        }
        aqf aqf3 = aqf2;
        boolean z4 = z2;
        cad cad2 = new cad(new b9e(this, str, str2, o9f, vb0, vb02));
        this.C = cad2;
        I.f = cad2;
        this.v = new o23(c(), i(), (lee) new vs4(vb03.b, this.r, this.s));
        boolean z5 = this.i != null ? true : z4;
        iee iee3 = this.y;
        iee iee4 = this.z;
        int k2 = k();
        aqf3.getClass();
        HashMap hashMap3 = new HashMap();
        for (l9f l9f2 : aqf3.a) {
            aqf aqf4 = aqf3;
            int i5 = k2;
            l9f l9f3 = l9f2;
            cb0 q2 = aqf4.q(l9f2, aqf3.v0, aqf3.Y, iee3, i5, z5);
            ax1 ax1 = aqf3.Z;
            Objects.requireNonNull(ax1);
            hashMap3.put(l9f3, new da0(q2, aqf4.q(l9f3, aqf3.w0, ax1, iee4, i5, z5)));
        }
        o23 o23 = this.v;
        ea0 ea0 = new ea0(this.y, this.z, new ArrayList(hashMap3.values()));
        o23.getClass();
        lee lee = (lee) o23.a;
        kq0.e();
        o23.X = ea0;
        o23.o = new HashMap();
        ea0 ea02 = (ea0) o23.X;
        iee iee5 = ea02.a;
        for (da0 da0 : ea02.c) {
            xs4 xs4 = (xs4) o23.o;
            cb0 cb0 = da0.a;
            Rect rect2 = cb0.d;
            Matrix matrix2 = new Matrix();
            Size e = e1f.e(rect2);
            int i6 = cb0.f;
            Size g = e1f.g(e, i6);
            Size size2 = cb0.e;
            c54.k(e1f.d(g, z4, size2));
            Rect h2 = e1f.h(size2);
            x3c a = iee5.g.a();
            a.b = size2;
            xs4.put(da0, new iee(cb0.b, cb0.c, a.c(), matrix2, false, h2, iee5.i - i6, -1, iee5.e != cb0.g ? true : z4));
        }
        try {
            lee.a(iee5.d((ax1) o23.b, true));
        } catch (ProcessingException unused) {
        }
        iee iee6 = ea02.b;
        try {
            lee.a(iee6.d((ax1) o23.c, z4));
        } catch (ProcessingException unused2) {
        }
        for (Map.Entry entry2 : ((xs4) o23.o).entrySet()) {
            ax1 ax12 = (ax1) o23.b;
            ax1 ax13 = (ax1) o23.c;
            o23.e(ax12, ax13, iee5, iee6, entry2);
            ((iee) entry2.getValue()).a(new ws4(o23, ax12, ax13, iee5, iee6, entry2, 0));
        }
        xs4 xs42 = (xs4) o23.o;
        HashMap hashMap4 = new HashMap();
        for (Map.Entry entry3 : hashMap3.entrySet()) {
            hashMap4.put((l9f) entry3.getKey(), (iee) xs42.get(entry3.getValue()));
        }
        aqf3.u(hashMap4);
        Object[] objArr = {this.A.c(), this.B.c()};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i7 = z4; i7 < 2; i7++) {
            Object obj2 = objArr[i7];
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    public final void H(String str, String str2, o9f o9f, vb0 vb0, vb0 vb02) {
        vb0 vb03 = vb0;
        Matrix matrix = this.j;
        ax1 c = c();
        Objects.requireNonNull(c);
        boolean n = c.n();
        Size size = vb03.a;
        Rect rect = this.i;
        if (rect == null) {
            rect = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        Rect rect2 = rect;
        ax1 c2 = c();
        Objects.requireNonNull(c2);
        int h = h(c2, false);
        ax1 c3 = c();
        Objects.requireNonNull(c3);
        iee iee = new iee(3, 34, vb0, matrix, n, rect2, h, -1, n(c3));
        this.w = iee;
        ax1 c4 = c();
        Objects.requireNonNull(c4);
        this.y = L(iee, c4);
        bad I = I(this.w, o9f, vb03);
        this.A = I;
        cad cad = this.C;
        if (cad != null) {
            cad.b();
        }
        cad cad2 = new cad(new b9e(this, str, str2, o9f, vb0, vb02));
        this.C = cad2;
        I.f = cad2;
    }

    public final bad I(iee iee, o9f o9f, vb0 vb0) {
        bad d = bad.d(o9f, vb0.a);
        aqf aqf = this.q;
        int i = -1;
        for (l9f l9f : aqf.a) {
            int i2 = ((fad) l9f.f.h(o9f.g0)).g.c;
            Integer valueOf = Integer.valueOf(i);
            List list = fad.j;
            if (list.indexOf(valueOf) < list.indexOf(Integer.valueOf(i2))) {
                i = i2;
            }
        }
        u40 u40 = d.b;
        if (i != -1) {
            u40.c = i;
        }
        for (l9f l9f2 : aqf.a) {
            fad c = bad.d(l9f2.f, vb0.a).c();
            kz1 kz1 = c.g;
            u40.a(kz1.e);
            for (iv1 iv1 : c.e) {
                u40.b(iv1);
                ArrayList arrayList = d.e;
                if (!arrayList.contains(iv1)) {
                    arrayList.add(iv1);
                }
            }
            for (CameraCaptureSession.StateCallback stateCallback : c.d) {
                ArrayList arrayList2 = d.d;
                if (!arrayList2.contains(stateCallback)) {
                    arrayList2.add(stateCallback);
                }
            }
            for (CameraDevice.StateCallback stateCallback2 : c.c) {
                ArrayList arrayList3 = d.c;
                if (!arrayList3.contains(stateCallback2)) {
                    arrayList3.add(stateCallback2);
                }
            }
            d.a(kz1.b);
        }
        iee.getClass();
        kq0.e();
        iee.b();
        c54.p("Consumer can only be linked once.", !iee.j);
        iee.j = true;
        d.b(iee.l, vb0.b, -1);
        u40.b(aqf.s0);
        ce3 ce3 = vb0.d;
        if (ce3 != null) {
            u40.c(ce3);
        }
        return d;
    }

    public final iee L(iee iee, ax1 ax1) {
        int i;
        boolean z2;
        zgf zgf = this.m;
        if (zgf == null || zgf.c == 2) {
            return iee;
        }
        boolean z3 = true;
        if (zgf.b == 1) {
            return iee;
        }
        this.t = new nw4(ax1, (lee) new mee(zgf));
        zgf zgf2 = this.m;
        zgf2.getClass();
        if (zgf2.c == 1) {
            ax1 c = c();
            c.getClass();
            i = h(c, false);
        } else {
            i = 0;
        }
        zgf zgf3 = this.m;
        zgf3.getClass();
        Rect h = zgf3.c == 1 ? e1f.h(iee.g.a) : iee.d;
        Size g = e1f.g(e1f.e(h), i);
        zgf zgf4 = this.m;
        zgf4.getClass();
        if (zgf4.c == 1) {
            ax1 c2 = c();
            c2.getClass();
            if (!c2.d() || !c2.n()) {
                z3 = false;
            }
            z2 = z3;
        } else {
            z2 = false;
        }
        cb0 cb0 = new cb0(UUID.randomUUID(), iee.f, iee.a, h, g, i, z2, true);
        iee iee2 = (iee) this.t.r(new ac0(iee, Collections.singletonList(cb0))).get(cb0);
        Objects.requireNonNull(iee2);
        return iee2;
    }

    public final o9f f(boolean z2, r9f r9f) {
        d9e d9e = this.p;
        ce3 a = r9f.a(d9e.N(), 1);
        if (z2) {
            a = ce3.K(a, d9e.a);
        }
        if (a == null) {
            return null;
        }
        return ((gaa) l(a)).J();
    }

    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    public final n9f l(ce3 ce3) {
        return new gaa(mi9.c(ce3));
    }

    public final void s() {
        aqf aqf = this.q;
        for (l9f l9f : aqf.a) {
            zpf zpf = (zpf) aqf.c.get(l9f);
            Objects.requireNonNull(zpf);
            l9f.a(zpf, (ax1) null, (o9f) null, l9f.f(true, aqf.X));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.o9f u(defpackage.yw1 r12, defpackage.n9f r13) {
        /*
            r11 = this;
            r12 = 1
            vh9 r0 = r13.F()
            aqf r11 = r11.q
            mic r1 = r11.v0
            yw1 r2 = r1.f
            r3 = 34
            java.util.List r4 = r2.q(r3)
            java.util.Set r5 = r1.d
            java.util.Iterator r6 = r5.iterator()
        L_0x0017:
            boolean r7 = r6.hasNext()
            r8 = 0
            if (r7 == 0) goto L_0x0056
            java.lang.Object r7 = r6.next()
            o9f r7 = (defpackage.o9f) r7
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            aa0 r10 = defpackage.o9f.n0
            java.lang.Object r9 = r7.f(r10, r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x0035
            goto L_0x0017
        L_0x0035:
            boolean r9 = r7 instanceof defpackage.ev6
            if (r9 == 0) goto L_0x0017
            ev6 r7 = (defpackage.ev6) r7
            aa0 r9 = defpackage.ev6.J
            java.lang.Object r7 = r7.f(r9, r8)
            kic r7 = (defpackage.kic) r7
            if (r7 == 0) goto L_0x0017
            int r7 = r7.c
            if (r7 != r12) goto L_0x0017
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            java.util.List r2 = r2.k(r3)
            r6.addAll(r2)
            r4 = r6
        L_0x0056:
            aa0 r2 = defpackage.ev6.I
            r6 = r0
            wma r6 = (defpackage.wma) r6
            r6.getClass()
            java.lang.Object r2 = r6.h(r2)     // Catch:{ IllegalArgumentException -> 0x0063 }
            goto L_0x0064
        L_0x0063:
            r2 = r8
        L_0x0064:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x0096
            java.util.Iterator r2 = r2.iterator()
        L_0x006c:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0090
            java.lang.Object r4 = r2.next()
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r6 = r4.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x006c
            java.lang.Object r2 = r4.second
            android.util.Size[] r2 = (android.util.Size[]) r2
            java.util.List r2 = java.util.Arrays.asList(r2)
        L_0x008e:
            r4 = r2
            goto L_0x0096
        L_0x0090:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            goto L_0x008e
        L_0x0096:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x00a4:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00b8
            java.lang.Object r6 = r5.next()
            o9f r6 = (defpackage.o9f) r6
            java.util.List r6 = r1.b(r6)
            r3.addAll(r6)
            goto L_0x00a4
        L_0x00b8:
            java.util.Iterator r3 = r3.iterator()
        L_0x00bc:
            boolean r5 = r3.hasNext()
            r6 = 0
            android.util.Rational r7 = r1.c
            if (r5 == 0) goto L_0x00de
            java.lang.Object r5 = r3.next()
            android.util.Size r5 = (android.util.Size) r5
            android.util.Rational r9 = defpackage.lt.a
            android.util.Size r9 = defpackage.msd.c
            boolean r5 = defpackage.lt.a(r5, r7, r9)
            if (r5 != 0) goto L_0x00bc
            android.util.Rational r3 = r1.b
            java.util.ArrayList r3 = r1.f(r3, r4, r6)
            r2.addAll(r3)
        L_0x00de:
            java.util.ArrayList r3 = r1.f(r7, r4, r6)
            r2.addAll(r3)
            java.util.ArrayList r3 = r1.e(r4, r6)
            r2.addAll(r3)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x00f9
            java.util.ArrayList r1 = r1.e(r4, r12)
            r2.addAll(r1)
        L_0x00f9:
            r2.toString()
            aa0 r1 = defpackage.ev6.K
            mi9 r0 = (defpackage.mi9) r0
            r0.j(r1, r2)
            aa0 r1 = defpackage.o9f.k0
            java.util.HashSet r2 = r11.t0
            java.util.Iterator r3 = r2.iterator()
            r4 = r6
        L_0x010c:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x012d
            java.lang.Object r5 = r3.next()
            o9f r5 = (defpackage.o9f) r5
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            aa0 r9 = defpackage.o9f.k0
            java.lang.Object r5 = r5.f(r9, r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            int r4 = java.lang.Math.max(r4, r5)
            goto L_0x010c
        L_0x012d:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r0.j(r1, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x013d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0151
            java.lang.Object r3 = r2.next()
            o9f r3 = (defpackage.o9f) r3
            eu4 r3 = r3.u()
            r1.add(r3)
            goto L_0x013d
        L_0x0151:
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0159
            goto L_0x01f9
        L_0x0159:
            java.lang.Object r2 = r1.get(r6)
            eu4 r2 = (defpackage.eu4) r2
            int r3 = r2.a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r2 = r2.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4 = r12
        L_0x016c:
            int r5 = r1.size()
            if (r4 >= r5) goto L_0x01ec
            java.lang.Object r5 = r1.get(r4)
            eu4 r5 = (defpackage.eu4) r5
            int r7 = r5.a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r6)
            boolean r10 = r3.equals(r9)
            if (r10 == 0) goto L_0x018a
        L_0x0188:
            r3 = r7
            goto L_0x01c4
        L_0x018a:
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x0191
            goto L_0x01c4
        L_0x0191:
            r9 = 2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            boolean r10 = r3.equals(r10)
            if (r10 == 0) goto L_0x01a7
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)
            boolean r10 = r7.equals(r10)
            if (r10 != 0) goto L_0x01a7
            goto L_0x0188
        L_0x01a7:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            boolean r9 = r7.equals(r9)
            if (r9 == 0) goto L_0x01bc
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            boolean r9 = r3.equals(r9)
            if (r9 != 0) goto L_0x01bc
            goto L_0x01c4
        L_0x01bc:
            boolean r7 = r3.equals(r7)
            if (r7 == 0) goto L_0x01c3
            goto L_0x01c4
        L_0x01c3:
            r3 = r8
        L_0x01c4:
            int r5 = r5.b
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            boolean r9 = r2.equals(r7)
            if (r9 == 0) goto L_0x01d6
            r2 = r5
            goto L_0x01e5
        L_0x01d6:
            boolean r7 = r5.equals(r7)
            if (r7 == 0) goto L_0x01dd
            goto L_0x01e5
        L_0x01dd:
            boolean r5 = r2.equals(r5)
            if (r5 == 0) goto L_0x01e4
            goto L_0x01e5
        L_0x01e4:
            r2 = r8
        L_0x01e5:
            if (r3 == 0) goto L_0x01f9
            if (r2 != 0) goto L_0x01ea
            goto L_0x01f9
        L_0x01ea:
            int r4 = r4 + r12
            goto L_0x016c
        L_0x01ec:
            eu4 r8 = new eu4
            int r12 = r3.intValue()
            int r1 = r2.intValue()
            r8.<init>(r12, r1)
        L_0x01f9:
            if (r8 == 0) goto L_0x0246
            aa0 r12 = defpackage.tu6.A
            r0.j(r12, r8)
            java.util.Set r11 = r11.a
            java.util.Iterator r11 = r11.iterator()
        L_0x0206:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0241
            java.lang.Object r12 = r11.next()
            l9f r12 = (defpackage.l9f) r12
            o9f r1 = r12.f
            int r1 = r1.O()
            if (r1 == 0) goto L_0x0229
            aa0 r1 = defpackage.o9f.q0
            o9f r2 = r12.f
            int r2 = r2.O()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.j(r1, r2)
        L_0x0229:
            o9f r1 = r12.f
            int r1 = r1.X()
            if (r1 == 0) goto L_0x0206
            aa0 r1 = defpackage.o9f.p0
            o9f r12 = r12.f
            int r12 = r12.X()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.j(r1, r12)
            goto L_0x0206
        L_0x0241:
            o9f r11 = r13.J()
            return r11
        L_0x0246:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r12 = "Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children."
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c9e.u(yw1, n9f):o9f");
    }

    public final void v() {
        for (l9f l9f : this.q.a) {
            l9f.v();
            l9f.t();
        }
    }

    public final void w() {
        for (l9f w2 : this.q.a) {
            w2.w();
        }
    }

    public final vb0 x(ce3 ce3) {
        this.A.a(ce3);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.A.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        x3c a = this.g.a();
        a.X = ce3;
        return a.c();
    }

    public final vb0 y(vb0 vb0, vb0 vb02) {
        E(G(e(), i() == null ? null : i().p().d(), this.f, vb0, vb02));
        p();
        return vb0;
    }

    public final void z() {
        F();
        aqf aqf = this.q;
        for (l9f l9f : aqf.a) {
            zpf zpf = (zpf) aqf.c.get(l9f);
            Objects.requireNonNull(zpf);
            l9f.D(zpf);
        }
    }
}
