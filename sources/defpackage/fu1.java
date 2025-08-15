package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: fu1  reason: default package */
public final class fu1 implements ax1 {
    public final l0f A0;
    public final ux1 B0;
    public final boolean C0;
    public final boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public x99 H0;
    public final q40 I0;
    public final z23 J0;
    public final HashSet K0;
    public yv1 L0;
    public final Object M0;
    public boolean N0;
    public final ul4 O0;
    public final o9g P0;
    public final bee Q0;
    public final imc R0;
    public volatile int S0 = 3;
    public final va8 X;
    public final imc Y;
    public final st1 Z;
    public final gaa a;
    public final dx1 b;
    public final q6d c;
    public final zh6 o;
    public final eu1 s0;
    public final iu1 t0;
    public CameraDevice u0;
    public int v0;
    public sz1 w0;
    public final LinkedHashMap x0;
    public int y0;
    public final yt1 z0;

    /* JADX WARNING: type inference failed for: r1v17, types: [java.lang.Object, z23] */
    public fu1(Context context, dx1 dx1, String str, iu1 iu1, l0f l0f, ux1 ux1, Executor executor, Handler handler, ul4 ul4, long j) {
        String str2 = str;
        iu1 iu12 = iu1;
        ux1 ux12 = ux1;
        Handler handler2 = handler;
        va8 va8 = new va8(22, (byte) 0);
        this.X = va8;
        this.v0 = 0;
        new AtomicInteger(0);
        this.x0 = new LinkedHashMap();
        this.y0 = 0;
        this.E0 = false;
        this.F0 = false;
        this.G0 = true;
        this.K0 = new HashSet();
        this.L0 = bw1.a;
        this.M0 = new Object();
        this.N0 = false;
        this.R0 = new imc(this);
        this.b = dx1;
        this.A0 = l0f;
        this.B0 = ux12;
        zh6 zh6 = new zh6(handler2);
        this.o = zh6;
        q6d q6d = new q6d(executor);
        this.c = q6d;
        eu1 eu1 = r1;
        eu1 eu12 = new eu1(this, q6d, zh6, j);
        this.s0 = eu1;
        this.a = new gaa(str2, 29);
        ((ci9) va8.b).i(new an7(zw1.CLOSED));
        imc imc = new imc(ux12);
        this.Y = imc;
        q40 q40 = new q40(q6d);
        this.I0 = q40;
        this.O0 = ul4;
        try {
            xv1 a2 = dx1.a(str);
            st1 st1 = r1;
            st1 st12 = new st1(a2, zh6, q6d, new sy4(7, (Object) this), iu12.j);
            this.Z = st1;
            this.t0 = iu12;
            iu12.t(st1);
            iu12.h.m((ci9) imc.c);
            this.P0 = o9g.x(a2);
            this.w0 = z();
            bj6 bj6 = iu12.j;
            bj6 bj62 = zi4.a;
            ? obj = new Object();
            obj.b = q6d;
            obj.a = zh6;
            obj.c = handler2;
            obj.d = q40;
            obj.e = bj6;
            obj.f = bj62;
            this.J0 = obj;
            this.C0 = iu12.j.d(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.D0 = iu12.j.d(LegacyCameraSurfaceCleanupQuirk.class);
            yt1 yt1 = new yt1(this, str2);
            this.z0 = yt1;
            ey1 ey1 = new ey1(7, this);
            synchronized (ux12.b) {
                c54.p("Camera is already registered: " + this, !ux12.e.containsKey(this));
                ux12.e.put(this, new sx1(q6d, ey1, yt1));
            }
            dx1 dx12 = dx1;
            dx12.a.b0(q6d, yt1);
            this.Q0 = new bee(context, str2, dx12, new c32(8, (byte) 0));
        } catch (CameraAccessExceptionCompat e) {
            throw new Exception(e);
        }
    }

    public static String v(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE" : "ERROR_CAMERA_DEVICE" : "ERROR_CAMERA_DISABLED" : "ERROR_MAX_CAMERAS_IN_USE" : "ERROR_CAMERA_IN_USE" : "ERROR_NONE";
    }

    public static String w(x99 x99) {
        StringBuilder sb = new StringBuilder("MeteringRepeating");
        x99.getClass();
        sb.append(x99.hashCode());
        return sb.toString();
    }

    public static String x(l9f l9f) {
        return l9f.g() + l9f.hashCode();
    }

    public final void A(boolean z) {
        if (!z) {
            this.s0.e.b = -1;
        }
        this.s0.a();
        this.R0.K();
        toString();
        F(8);
        try {
            dx1 dx1 = this.b;
            dx1.a.Z(this.t0.a, this.c, t());
        } catch (CameraAccessExceptionCompat e) {
            e.getMessage();
            toString();
            if (e.a != 10001) {
                imc imc = this.R0;
                if (((fu1) imc.c).S0 != 8) {
                    ((fu1) imc.c).toString();
                    return;
                }
                ((fu1) imc.c).toString();
                imc.K();
                imc.b = new bkb(imc);
                return;
            }
            E(3, new v90(e, 7), true);
        } catch (SecurityException e2) {
            e2.getMessage();
            toString();
            F(7);
            this.s0.b();
        }
    }

    public final void B() {
        c54.p((String) null, this.S0 == 9);
        ead m = this.a.m();
        if (!m.l || !m.k) {
            toString();
        } else if (!this.B0.e(this.u0.getId(), this.A0.B(this.u0.getId()))) {
            int i = this.A0.b;
            toString();
        } else {
            HashMap hashMap = new HashMap();
            Collection<fad> n = this.a.n();
            Collection s = this.a.s();
            aa0 aa0 = e9e.a;
            ArrayList arrayList = new ArrayList(s);
            Iterator it = n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                fad fad = (fad) it.next();
                ce3 ce3 = fad.g.b;
                aa0 aa02 = e9e.a;
                if (ce3.o(aa02) && fad.b().size() != 1) {
                    String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", new Object[]{Integer.valueOf(fad.b().size())});
                    break;
                } else if (fad.g.b.o(aa02)) {
                    int i2 = 0;
                    for (fad fad2 : n) {
                        if (((o9f) arrayList.get(i2)).N() == q9f.Y) {
                            c54.p("MeteringRepeating should contain a surface", !fad2.b().isEmpty());
                            hashMap.put((xf4) fad2.b().get(0), 1L);
                        } else if (fad2.g.b.o(aa02) && !fad2.b().isEmpty()) {
                            hashMap.put((xf4) fad2.b().get(0), (Long) fad2.g.b.h(aa02));
                        }
                        i2++;
                    }
                }
            }
            sz1 sz1 = this.w0;
            synchronized (sz1.a) {
                sz1.l = hashMap;
            }
            sz1 sz12 = this.w0;
            fad b2 = m.b();
            CameraDevice cameraDevice = this.u0;
            cameraDevice.getClass();
            z23 z23 = this.J0;
            kq0.a(sz12.l(b2, cameraDevice, new jhe((bj6) z23.e, (bj6) z23.f, (q40) z23.d, (Executor) z23.b, (ScheduledExecutorService) z23.a, (Handler) z23.c)), new h7b((Object) this, 9, (Object) sz12), this.c);
        }
    }

    public final void C() {
        if (this.H0 != null) {
            StringBuilder sb = new StringBuilder("MeteringRepeating");
            this.H0.getClass();
            sb.append(this.H0.hashCode());
            String sb2 = sb.toString();
            gaa gaa = this.a;
            LinkedHashMap linkedHashMap = (LinkedHashMap) gaa.a;
            if (linkedHashMap.containsKey(sb2)) {
                m9f m9f = (m9f) linkedHashMap.get(sb2);
                m9f.e = false;
                if (!m9f.f) {
                    linkedHashMap.remove(sb2);
                }
            }
            StringBuilder sb3 = new StringBuilder("MeteringRepeating");
            this.H0.getClass();
            sb3.append(this.H0.hashCode());
            String sb4 = sb3.toString();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) gaa.a;
            if (linkedHashMap2.containsKey(sb4)) {
                m9f m9f2 = (m9f) linkedHashMap2.get(sb4);
                m9f2.f = false;
                if (!m9f2.e) {
                    linkedHashMap2.remove(sb4);
                }
            }
            x99 x99 = this.H0;
            fw6 fw6 = (fw6) x99.a;
            if (fw6 != null) {
                fw6.a();
            }
            x99.a = null;
            this.H0 = null;
        }
    }

    public final void D() {
        fad fad;
        List unmodifiableList;
        c54.p((String) null, this.w0 != null);
        toString();
        sz1 sz1 = this.w0;
        synchronized (sz1.a) {
            fad = sz1.f;
        }
        synchronized (sz1.a) {
            unmodifiableList = Collections.unmodifiableList(sz1.b);
        }
        sz1 z = z();
        this.w0 = z;
        z.n(fad);
        this.w0.j(unmodifiableList);
        if (au1.s(this.S0) != 8) {
            sz1.h();
            toString();
        } else if (this.C0 && sz1.h()) {
            toString();
            F(6);
        }
        if (this.D0 && sz1.h()) {
            toString();
            this.E0 = true;
        }
        sz1.a();
        bm7 m = sz1.m();
        wg0.o(this.S0);
        toString();
        this.x0.put(sz1, m);
        kq0.a(m, new va8(this, sz1, false, 9), ju0.k());
    }

    public final void E(int i, v90 v90, boolean z) {
        zw1 zw1;
        zw1 zw12;
        u90 u90;
        HashMap hashMap;
        String B;
        toString();
        boolean z2 = false;
        if (hye.a()) {
            Trace.setCounter(c37.F("CX:C2State[" + this + "]"), (long) au1.s(i));
            if (v90 != null) {
                this.y0++;
            }
            if (this.y0 > 0) {
                Trace.setCounter(c37.F("CX:C2StateErrorCode[" + this + "]"), (long) (v90 != null ? v90.a : 0));
            }
        }
        this.S0 = i;
        switch (au1.s(i)) {
            case 0:
                zw1 = zw1.RELEASED;
                break;
            case 1:
                zw1 = zw1.RELEASING;
                break;
            case 2:
                zw1 = zw1.CLOSED;
                break;
            case 3:
                zw1 = zw1.PENDING_OPEN;
                break;
            case 4:
            case 5:
                zw1 = zw1.CLOSING;
                break;
            case 6:
            case 7:
                zw1 = zw1.OPENING;
                break;
            case 8:
                zw1 = zw1.OPEN;
                break;
            case 9:
                zw1 = zw1.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: ".concat(wg0.r(i)));
        }
        ux1 ux1 = this.B0;
        synchronized (ux1.b) {
            try {
                int i2 = ux1.f;
                if (zw1 == zw1.RELEASED) {
                    sx1 sx1 = (sx1) ux1.e.remove(this);
                    if (sx1 != null) {
                        ux1.b();
                        zw12 = sx1.a;
                    } else {
                        zw12 = null;
                    }
                } else {
                    sx1 sx12 = (sx1) ux1.e.get(this);
                    c54.o(sx12, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                    zw1 zw13 = sx12.a;
                    sx12.a = zw1;
                    zw1 zw14 = zw1.OPENING;
                    if (zw1 == zw14) {
                        if (zw1.a || zw13 == zw14) {
                            z2 = true;
                        }
                        c54.p("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", z2);
                    }
                    if (zw13 != zw1) {
                        ux1.c(this, zw1);
                        ux1.b();
                    }
                    zw12 = zw13;
                }
                if (zw12 != zw1) {
                    sx1 a2 = (ux1.d.b == 2 && zw1 == zw1.CONFIGURED && (B = ux1.d.B(p().d())) != null) ? ux1.a(B) : null;
                    if (i2 < 1 && ux1.f > 0) {
                        hashMap = new HashMap();
                        for (Map.Entry entry : ux1.e.entrySet()) {
                            if (((sx1) entry.getValue()).a == zw1.PENDING_OPEN) {
                                hashMap.put((fv1) entry.getKey(), (sx1) entry.getValue());
                            }
                        }
                    } else if (zw1 != zw1.PENDING_OPEN || ux1.f <= 0) {
                        hashMap = null;
                    } else {
                        hashMap = new HashMap();
                        hashMap.put(this, (sx1) ux1.e.get(this));
                    }
                    if (hashMap != null && !z) {
                        hashMap.remove(this);
                    }
                    if (hashMap != null) {
                        for (sx1 sx13 : hashMap.values()) {
                            sx13.getClass();
                            try {
                                Executor executor = sx13.b;
                                tx1 tx1 = sx13.d;
                                Objects.requireNonNull(tx1);
                                executor.execute(new cu1(4, (yt1) tx1));
                            } catch (RejectedExecutionException unused) {
                            }
                        }
                    }
                    if (a2 != null) {
                        try {
                            Executor executor2 = a2.b;
                            ey1 ey1 = a2.c;
                            Objects.requireNonNull(ey1);
                            executor2.execute(new cu1(5, ey1));
                        } catch (RejectedExecutionException unused2) {
                        }
                    }
                }
            } finally {
                while (true) {
                }
            }
        }
        ((ci9) this.X.b).i(new an7(zw1));
        imc imc = this.Y;
        imc.getClass();
        switch (zw1.ordinal()) {
            case 0:
            case 2:
                u90 = new u90(5, v90);
                break;
            case 1:
            case 4:
                u90 = new u90(4, v90);
                break;
            case 3:
                ux1 ux12 = (ux1) imc.b;
                synchronized (ux12.b) {
                    Iterator it = ux12.e.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((sx1) ((Map.Entry) it.next()).getValue()).a == zw1.CLOSING) {
                                u90 = new u90(2, (v90) null);
                                break;
                            }
                        } else {
                            u90 = new u90(1, (v90) null);
                            break;
                        }
                    }
                }
            case 5:
                u90 = new u90(2, v90);
                break;
            case 6:
            case 7:
                u90 = new u90(3, v90);
                break;
            default:
                throw new IllegalStateException("Unknown internal camera state: " + zw1);
        }
        u90.toString();
        zw1.toString();
        Objects.toString(v90);
        if (!Objects.equals((u90) ((ci9) imc.c).d(), u90)) {
            u90.toString();
            ((ci9) imc.c).i(u90);
        }
    }

    public final void F(int i) {
        E(i, (v90) null, true);
    }

    public final ArrayList G(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l9f l9f = (l9f) it.next();
            boolean z = this.G0;
            String x = x(l9f);
            Class<?> cls = l9f.getClass();
            fad fad = z ? l9f.n : l9f.o;
            o9f o9f = l9f.f;
            vb0 vb0 = l9f.g;
            arrayList2.add(new t90(x, cls, fad, o9f, vb0 != null ? vb0.a : null, vb0, l9f.c() == null ? null : c9e.J(l9f)));
        }
        return arrayList2;
    }

    public final void H(ArrayList arrayList) {
        boolean z;
        Size size;
        boolean isEmpty = this.a.n().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            z = true;
            if (!it.hasNext()) {
                break;
            }
            t90 t90 = (t90) it.next();
            if (!this.a.C(t90.a)) {
                gaa gaa = this.a;
                String str = t90.a;
                fad fad = t90.c;
                o9f o9f = t90.d;
                vb0 vb0 = t90.f;
                List list = t90.g;
                LinkedHashMap linkedHashMap = (LinkedHashMap) gaa.a;
                m9f m9f = (m9f) linkedHashMap.get(str);
                if (m9f == null) {
                    m9f = new m9f(fad, o9f, vb0, list);
                    linkedHashMap.put(str, m9f);
                }
                m9f.e = true;
                gaa.I(str, fad, o9f, vb0, list);
                arrayList2.add(t90.a);
                if (t90.b == h8b.class && (size = t90.e) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            TextUtils.join(", ", arrayList2);
            toString();
            if (isEmpty) {
                this.Z.y(true);
                st1 st1 = this.Z;
                synchronized (st1.d) {
                    st1.p++;
                }
            }
            q();
            L();
            K();
            D();
            if (this.S0 == 9) {
                B();
            } else {
                int s = au1.s(this.S0);
                if (s == 2 || s == 3) {
                    I(false);
                } else if (s != 4) {
                    toString();
                } else {
                    F(7);
                    if (!this.x0.isEmpty() && !this.F0 && this.v0 == 0) {
                        if (this.u0 == null) {
                            z = false;
                        }
                        c54.p("Camera Device should be open if session close is not complete", z);
                        F(9);
                        B();
                    }
                }
            }
            if (rational != null) {
                this.Z.h.e = rational;
            }
        }
    }

    public final void I(boolean z) {
        toString();
        if (!this.B0.d(this)) {
            toString();
            F(4);
            return;
        }
        A(z);
    }

    public final void J(boolean z) {
        toString();
        if (!this.z0.b || !this.B0.d(this)) {
            toString();
            F(4);
            return;
        }
        A(z);
    }

    public final void K() {
        gaa gaa = this.a;
        gaa.getClass();
        ead ead = new ead();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) gaa.a).entrySet()) {
            m9f m9f = (m9f) entry.getValue();
            if (m9f.f && m9f.e) {
                ead.a(m9f.a);
                arrayList.add((String) entry.getKey());
            }
        }
        arrayList.toString();
        boolean z = ead.l && ead.k;
        st1 st1 = this.Z;
        if (z) {
            int i = ead.b().g.c;
            st1.x = i;
            st1.h.n = i;
            st1.n.c = i;
            ead.a(st1.s());
            this.w0.n(ead.b());
            return;
        }
        st1.x = 1;
        st1.h.n = 1;
        st1.n.c = 1;
        this.w0.n(st1.s());
    }

    public final void L() {
        boolean z = false;
        for (o9f f : this.a.s()) {
            z |= ((Boolean) f.f(o9f.m0, Boolean.FALSE)).booleanValue();
        }
        this.Z.l.c = z;
    }

    public final void b(yv1 yv1) {
        if (yv1 == null) {
            yv1 = bw1.a;
        }
        yv1.P();
        this.L0 = yv1;
        synchronized (this.M0) {
        }
    }

    public final void c(l9f l9f) {
        l9f.getClass();
        this.c.execute(new vt1(this, x(l9f), this.G0 ? l9f.n : l9f.o, l9f.f, l9f.g, l9f.c() == null ? null : c9e.J(l9f), 0));
    }

    public final void e(l9f l9f) {
        l9f.getClass();
        this.c.execute(new vt1(this, x(l9f), this.G0 ? l9f.n : l9f.o, l9f.f, l9f.g, l9f.c() == null ? null : c9e.J(l9f), 2));
    }

    public final ry9 f() {
        return this.X;
    }

    public final hw1 g() {
        return this.Z;
    }

    public final yv1 h() {
        return this.L0;
    }

    public final void i(l9f l9f) {
        l9f.getClass();
        this.c.execute(new vt1(this, x(l9f), this.G0 ? l9f.n : l9f.o, l9f.f, l9f.g, l9f.c() == null ? null : c9e.J(l9f), 1));
    }

    public final void j(boolean z) {
        this.c.execute(new u60((Object) this, z, 7));
    }

    public final void k(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (!arrayList.isEmpty()) {
            st1 st1 = this.Z;
            synchronized (st1.d) {
                st1.p++;
            }
            Iterator it = new ArrayList(arrayList).iterator();
            while (it.hasNext()) {
                l9f l9f = (l9f) it.next();
                String x = x(l9f);
                HashSet hashSet = this.K0;
                if (!hashSet.contains(x)) {
                    hashSet.add(x);
                    l9f.v();
                    l9f.t();
                }
            }
            try {
                this.c.execute(new ut1(this, new ArrayList(G(arrayList)), 1));
            } catch (RejectedExecutionException unused) {
                toString();
                st1.q();
            }
        }
    }

    public final void l(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(G(arrayList2));
            Iterator it = new ArrayList(arrayList2).iterator();
            while (it.hasNext()) {
                l9f l9f = (l9f) it.next();
                String x = x(l9f);
                HashSet hashSet = this.K0;
                if (hashSet.contains(x)) {
                    l9f.w();
                    hashSet.remove(x);
                }
            }
            this.c.execute(new ut1(this, arrayList3, 0));
        }
    }

    public final void m(l9f l9f) {
        l9f.getClass();
        this.c.execute(new wt1(this, 2, x(l9f)));
    }

    public final void o(boolean z) {
        this.G0 = z;
    }

    public final yw1 p() {
        return this.t0;
    }

    public final void q() {
        x99 x99;
        gaa gaa = this.a;
        fad b2 = gaa.m().b();
        kz1 kz1 = b2.g;
        int size = Collections.unmodifiableList(kz1.a).size();
        int size2 = b2.b().size();
        if (b2.b().isEmpty()) {
            return;
        }
        if (Collections.unmodifiableList(kz1.a).isEmpty()) {
            if (this.H0 == null) {
                this.H0 = new x99(this.t0.b, this.O0, new tt1(this, 2));
            }
            if (y() && (x99 = this.H0) != null) {
                String w = w(x99);
                x99 x992 = this.H0;
                fad fad = (fad) x992.b;
                q9f q9f = q9f.Y;
                List singletonList = Collections.singletonList(q9f);
                LinkedHashMap linkedHashMap = (LinkedHashMap) gaa.a;
                m9f m9f = (m9f) linkedHashMap.get(w);
                w99 w99 = (w99) x992.c;
                if (m9f == null) {
                    m9f = new m9f(fad, w99, (vb0) null, singletonList);
                    linkedHashMap.put(w, m9f);
                }
                m9f.e = true;
                gaa.I(w, fad, w99, (vb0) null, singletonList);
                x99 x993 = this.H0;
                fad fad2 = (fad) x993.b;
                List singletonList2 = Collections.singletonList(q9f);
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) gaa.a;
                m9f m9f2 = (m9f) linkedHashMap2.get(w);
                if (m9f2 == null) {
                    m9f2 = new m9f(fad2, (w99) x993.c, (vb0) null, singletonList2);
                    linkedHashMap2.put(w, m9f2);
                }
                m9f2.f = true;
            }
        } else if (size2 == 1 && size == 1) {
            C();
        } else if (size >= 2) {
            C();
        } else if (this.H0 != null && !y()) {
            C();
        }
    }

    public final void r() {
        ArrayList<kz1> arrayList;
        boolean z = this.S0 == 5 || this.S0 == 2 || (this.S0 == 7 && this.v0 != 0);
        c54.p("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + wg0.r(this.S0) + " (error: " + v(this.v0) + ")", z);
        D();
        sz1 sz1 = this.w0;
        synchronized (sz1.a) {
            try {
                if (!sz1.b.isEmpty()) {
                    arrayList = new ArrayList<>(sz1.b);
                    sz1.b.clear();
                } else {
                    arrayList = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (arrayList != null) {
            for (kz1 kz1 : arrayList) {
                for (iv1 a2 : kz1.e) {
                    a2.a(kz1.a());
                }
            }
        }
    }

    public final void s() {
        c54.p((String) null, this.S0 == 2 || this.S0 == 5);
        c54.p((String) null, this.x0.isEmpty());
        if (!this.E0) {
            u();
        } else if (this.F0) {
            toString();
        } else if (!this.z0.b) {
            this.E0 = false;
            u();
            toString();
        } else {
            toString();
            oq1 g = f8.g(new tt1(this, 1));
            this.F0 = true;
            g.b.d(new b(28, (Object) this), this.c);
        }
    }

    public final CameraDevice.StateCallback t() {
        ArrayList arrayList = new ArrayList(this.a.m().b().c);
        arrayList.add((nw1) this.I0.Y);
        arrayList.add(this.s0);
        return xfg.g(arrayList);
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", new Object[]{Integer.valueOf(hashCode()), this.t0.a});
    }

    public final void u() {
        c54.p((String) null, this.S0 == 2 || this.S0 == 5);
        c54.p((String) null, this.x0.isEmpty());
        this.u0 = null;
        if (this.S0 == 5) {
            F(3);
            return;
        }
        this.b.a.g0(this.z0);
        F(1);
    }

    public final boolean y() {
        int i;
        ArrayList arrayList = new ArrayList();
        synchronized (this.M0) {
            try {
                i = this.A0.b == 2 ? 1 : 0;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        gaa gaa = this.a;
        gaa.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) gaa.a).entrySet()) {
            if (((m9f) entry.getValue()).e) {
                arrayList2.add((m9f) entry.getValue());
            }
        }
        for (m9f m9f : Collections.unmodifiableCollection(arrayList2)) {
            List list = m9f.d;
            if (list == null || list.get(0) != q9f.Y) {
                if (m9f.c == null || m9f.d == null) {
                    m9f.toString();
                    return false;
                }
                fad fad = m9f.a;
                o9f o9f = m9f.b;
                for (xf4 xf4 : fad.b()) {
                    bee bee = this.Q0;
                    int inputFormat = o9f.getInputFormat();
                    xb0 b2 = xb0.b(i, inputFormat, xf4.h, bee.i(inputFormat));
                    int inputFormat2 = o9f.getInputFormat();
                    Size size = xf4.h;
                    vb0 vb0 = m9f.c;
                    arrayList.add(new l90(b2, inputFormat2, size, vb0.b, m9f.d, vb0.d, (Range) o9f.f(o9f.l0, (Object) null)));
                }
            }
        }
        this.H0.getClass();
        HashMap hashMap = new HashMap();
        x99 x99 = this.H0;
        hashMap.put((w99) x99.c, Collections.singletonList((Size) x99.o));
        try {
            this.Q0.g(i, arrayList, hashMap, false, false);
            toString();
            return true;
        } catch (IllegalArgumentException unused) {
            toString();
            return false;
        }
    }

    public final sz1 z() {
        sz1 sz1;
        synchronized (this.M0) {
            sz1 = new sz1(this.P0, this.t0.j, false);
        }
        return sz1;
    }
}
