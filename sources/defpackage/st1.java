package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.ImageWriter;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.AeFpsRangeLegacyQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: st1  reason: default package */
public final class st1 implements hw1 {
    public final qt1 b;
    public final Executor c;
    public final Object d = new Object();
    public final xv1 e;
    public final sy4 f;
    public final bad g;
    public final xs5 h;
    public final od i;
    public final bye j;
    public final td k;
    public final mag l;
    public final nx0 m;
    public final u40 n;
    public final bdb o;
    public int p;
    public eu6 q;
    public volatile boolean r;
    public volatile int s;
    public final wmc t;
    public final oq0 u;
    public final AtomicLong v;
    public volatile bm7 w;
    public int x;
    public long y;
    public final pt1 z;

    /* JADX WARNING: type inference failed for: r0v1, types: [bad, aad] */
    /* JADX WARNING: type inference failed for: r10v7, types: [od, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v10, types: [java.lang.Object, wmc] */
    public st1(xv1 xv1, zh6 zh6, q6d q6d, sy4 sy4, bj6 bj6) {
        ? aad = new aad();
        this.g = aad;
        this.p = 0;
        this.r = false;
        this.s = 2;
        this.v = new AtomicLong(0);
        this.w = dw6.c;
        this.x = 1;
        this.y = 0;
        pt1 pt1 = new pt1();
        pt1.b = new HashSet();
        pt1.c = new ArrayMap();
        this.z = pt1;
        this.e = xv1;
        this.f = sy4;
        this.c = q6d;
        this.o = new bdb(q6d);
        qt1 qt1 = new qt1(q6d);
        this.b = qt1;
        aad.b.c = this.x;
        aad.b.b(new jz1(qt1));
        aad.b.b(pt1);
        this.k = new td(this, q6d);
        this.h = new xs5(this, zh6, q6d, bj6);
        ? obj = new Object();
        obj.a = false;
        bag bag = new bag(obj);
        obj.b = this;
        obj.c = q6d;
        cag b2 = od.b(xv1);
        obj.Y = b2;
        hag hag = new hag(b2.c(), b2.d());
        obj.o = hag;
        hag.f(1.0f);
        obj.X = new xm7(sa0.e(hag));
        p(bag);
        this.i = obj;
        this.j = new bye(this, xv1, q6d);
        this.l = new mag(xv1);
        ? obj2 = new Object();
        AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk = (AeFpsRangeLegacyQuirk) bj6.e(AeFpsRangeLegacyQuirk.class);
        if (aeFpsRangeLegacyQuirk == null) {
            obj2.a = null;
        } else {
            obj2.a = aeFpsRangeLegacyQuirk.a;
        }
        this.t = obj2;
        this.u = new oq0(bj6, 2);
        this.m = new nx0(this, q6d);
        this.n = new u40(this, xv1, bj6, q6d, zh6);
    }

    public static int t(xv1 xv1, int i2) {
        int[] iArr = (int[]) xv1.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return w(i2, iArr) ? i2 : w(1, iArr) ? 1 : 0;
    }

    public static boolean w(int i2, int[] iArr) {
        for (int i3 : iArr) {
            if (i2 == i3) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r4 = (java.lang.Long) ((defpackage.nje) r4).a.get("CameraControlSessionUpdateId");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean x(android.hardware.camera2.TotalCaptureResult r4, long r5) {
        /*
            android.hardware.camera2.CaptureRequest r0 = r4.getRequest()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.hardware.camera2.CaptureRequest r4 = r4.getRequest()
            java.lang.Object r4 = r4.getTag()
            boolean r0 = r4 instanceof defpackage.nje
            if (r0 == 0) goto L_0x002d
            nje r4 = (defpackage.nje) r4
            java.util.Map r4 = r4.a
            java.lang.String r0 = "CameraControlSessionUpdateId"
            java.lang.Object r4 = r4.get(r0)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto L_0x0023
            return r1
        L_0x0023:
            long r2 = r4.longValue()
            int r4 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x002d
            r4 = 1
            return r4
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st1.x(android.hardware.camera2.TotalCaptureResult, long):boolean");
    }

    public final long A() {
        this.y = this.v.getAndIncrement();
        ((fu1) this.f.b).K();
        return this.y;
    }

    public final void a() {
        bdb bdb = this.o;
        bdb.getClass();
        ((Executor) bdb.b).execute(new rlf(bdb, 0));
    }

    public final bm7 b(float f2) {
        bm7 bm7;
        sa0 e2;
        if (!v()) {
            return new dw6(1, new Exception("Camera is not active."));
        }
        od odVar = this.i;
        synchronized (((hag) odVar.o)) {
            try {
                ((hag) odVar.o).e(f2);
                e2 = sa0.e((hag) odVar.o);
            } catch (IllegalArgumentException e3) {
                bm7 = new dw6(1, e3);
            }
        }
        odVar.h(e2);
        bm7 = f8.g(new z9g(odVar, e2, 1));
        return kq0.w(bm7);
    }

    public final void c(ce3 ce3) {
        nx0 nx0 = this.m;
        re6 u2 = wd6.w(ce3).u();
        synchronized (nx0.X) {
            re6 re6 = (re6) nx0.Z;
            re6.getClass();
            be3 be3 = be3.o;
            for (aa0 aa0 : u2.g()) {
                ((mi9) re6.b).d(aa0, be3, u2.h(aa0));
            }
        }
        kq0.w(f8.g(new kt1(nx0, 0))).d(new kc(5), ju0.k());
    }

    public final bm7 d(float f2) {
        bm7 bm7;
        sa0 e2;
        if (!v()) {
            return new dw6(1, new Exception("Camera is not active."));
        }
        od odVar = this.i;
        synchronized (((hag) odVar.o)) {
            try {
                ((hag) odVar.o).f(f2);
                e2 = sa0.e((hag) odVar.o);
            } catch (IllegalArgumentException e3) {
                bm7 = new dw6(1, e3);
            }
        }
        odVar.h(e2);
        bm7 = f8.g(new z9g(odVar, e2, 0));
        return kq0.w(bm7);
    }

    public final Rect e() {
        Rect rect = (Rect) this.e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    public final void f(int i2) {
        if (v()) {
            this.s = i2;
            mag mag = this.l;
            boolean z2 = true;
            if (!(this.s == 1 || this.s == 0)) {
                z2 = false;
            }
            mag.d = z2;
            this.w = kq0.w(f8.g(new ync(22, this)));
        }
    }

    public final void g(eu6 eu6) {
        this.q = eu6;
    }

    public final bm7 h(bw4 bw4) {
        if (!v()) {
            return new dw6(1, new Exception("Camera is not active."));
        }
        xs5 xs5 = this.h;
        xs5.getClass();
        return kq0.w(f8.g(new x72(xs5, bw4)));
    }

    public final bm7 i(ArrayList arrayList, int i2, int i3) {
        if (!v()) {
            return new dw6(1, new Exception("Camera is not active."));
        }
        int i4 = this.s;
        b76 a = b76.a(kq0.w(this.w));
        nt1 nt1 = new nt1(this, arrayList, i2, i4, i3);
        Executor executor = this.c;
        a.getClass();
        return kq0.K(a, nt1, executor);
    }

    public final void j(bad bad) {
        HashMap hashMap;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        mag mag = this.l;
        xv1 xv1 = mag.a;
        while (true) {
            nag nag = mag.b;
            if (nag.g()) {
                break;
            }
            ((ov6) nag.d()).close();
        }
        fw6 fw6 = mag.i;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (fw6 != null) {
            hqc hqc = mag.g;
            if (hqc != null) {
                kq0.w(fw6.e).d(new nz1(hqc, 2), ju0.D());
                mag.g = null;
            }
            fw6.a();
            mag.i = null;
        }
        ImageWriter imageWriter = mag.j;
        if (imageWriter != null) {
            imageWriter.close();
            mag.j = null;
        }
        boolean z2 = mag.c;
        u40 u40 = bad.b;
        if (z2) {
            u40.c = 1;
        } else if (mag.f) {
            u40.c = 1;
        } else {
            try {
                streamConfigurationMap2 = (StreamConfigurationMap) xv1.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            } catch (AssertionError e2) {
                e2.getMessage();
            }
            if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
                hashMap = new HashMap();
            } else {
                hashMap = new HashMap();
                for (int i2 : streamConfigurationMap2.getInputFormats()) {
                    Size[] inputSizes = streamConfigurationMap2.getInputSizes(i2);
                    if (inputSizes != null) {
                        Arrays.sort(inputSizes, new x93(true));
                        hashMap.put(Integer.valueOf(i2), inputSizes[0]);
                    }
                }
            }
            if (mag.e && !hashMap.isEmpty() && hashMap.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) xv1.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
                for (int i3 : validOutputFormatsForInput) {
                    if (i3 == 256) {
                        Size size = (Size) hashMap.get(34);
                        i99 i99 = new i99(size.getWidth(), size.getHeight(), 34, 9);
                        mag.h = i99.b;
                        mag.g = new hqc(i99);
                        i99.l(new gte(24, (Object) mag), ju0.z());
                        fw6 fw62 = new fw6(mag.g.getSurface(), new Size(mag.g.getWidth(), mag.g.getHeight()), 34);
                        mag.i = fw62;
                        hqc hqc2 = mag.g;
                        bm7 w2 = kq0.w(fw62.e);
                        Objects.requireNonNull(hqc2);
                        w2.d(new nz1(hqc2, 2), ju0.D());
                        bad.b(mag.i, eu4.d, -1);
                        oz1 oz1 = mag.h;
                        u40.b(oz1);
                        ArrayList arrayList = bad.e;
                        if (!arrayList.contains(oz1)) {
                            arrayList.add(oz1);
                        }
                        rv1 rv1 = new rv1(2, mag);
                        ArrayList arrayList2 = bad.d;
                        if (!arrayList2.contains(rv1)) {
                            arrayList2.add(rv1);
                        }
                        bad.g = new InputConfiguration(mag.g.getWidth(), mag.g.getHeight(), mag.g.j());
                        return;
                    }
                }
            }
            u40.c = 1;
        }
    }

    public final bm7 k(boolean z2) {
        bm7 bm7;
        if (!v()) {
            return new dw6(1, new Exception("Camera is not active."));
        }
        bye bye = this.j;
        if (!bye.c) {
            bm7 = new dw6(1, new IllegalStateException("No flash unit"));
        } else {
            bye.b(bye.b, Integer.valueOf(z2 ? 1 : 0));
            bm7 = f8.g(new fe4(bye, z2, 5));
        }
        return kq0.w(bm7);
    }

    public final bm7 l(int i2, int i3) {
        if (!v()) {
            return new dw6(1, new Exception("Camera is not active."));
        }
        int i4 = this.s;
        b76 a = b76.a(kq0.w(this.w));
        ot1 ot1 = new ot1(this, i2, i4, i3);
        Executor executor = this.c;
        a.getClass();
        return kq0.K(a, ot1, executor);
    }

    public final ce3 m() {
        re6 re6;
        nx0 nx0 = this.m;
        synchronized (nx0.X) {
            re6 re62 = (re6) nx0.Z;
            re62.getClass();
            re6 = new re6(8, (Object) wma.a((mi9) re62.b));
        }
        return re6;
    }

    public final void n() {
        nx0 nx0 = this.m;
        synchronized (nx0.X) {
            nx0.Z = new re6(7);
        }
        kq0.w(f8.g(new kt1(nx0, 1))).d(new kc(5), ju0.k());
    }

    public final void o() {
        bdb bdb = this.o;
        bdb.getClass();
        ((Executor) bdb.b).execute(new rlf(bdb, 1));
    }

    public final void p(rt1 rt1) {
        ((HashSet) this.b.b).add(rt1);
    }

    public final void q() {
        synchronized (this.d) {
            try {
                int i2 = this.p;
                if (i2 != 0) {
                    this.p = i2 - 1;
                } else {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(boolean z2) {
        this.r = z2;
        if (!z2) {
            u40 u40 = new u40();
            u40.c = this.x;
            u40.b = true;
            mi9 b2 = mi9.b();
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            b2.j(cv1.v0(key), Integer.valueOf(t(this.e, 1)));
            b2.j(cv1.v0(CaptureRequest.FLASH_MODE), 0);
            u40.c(new re6(8, (Object) wma.a(b2)));
            z(Collections.singletonList(u40.d()));
        }
        A();
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final defpackage.fad s() {
        /*
            r9 = this;
            bad r0 = r9.g
            int r1 = r9.x
            u40 r2 = r0.b
            r2.c = r1
            re6 r1 = new re6
            r2 = 7
            r1.<init>(r2)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r3 = 1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r1.r0(r2, r4)
            xs5 r2 = r9.h
            boolean r4 = r2.g
            r5 = 3
            if (r4 == 0) goto L_0x0021
            r4 = r3
            goto L_0x0028
        L_0x0021:
            int r4 = r2.n
            if (r4 == r5) goto L_0x0027
            r4 = 4
            goto L_0x0028
        L_0x0027:
            r4 = r5
        L_0x0028:
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            st1 r7 = r2.a
            int r4 = r7.u(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.r0(r6, r4)
            android.hardware.camera2.params.MeteringRectangle[] r4 = r2.q
            int r6 = r4.length
            if (r6 == 0) goto L_0x0041
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AF_REGIONS
            r1.r0(r6, r4)
        L_0x0041:
            android.hardware.camera2.params.MeteringRectangle[] r4 = r2.r
            int r6 = r4.length
            if (r6 == 0) goto L_0x004b
            android.hardware.camera2.CaptureRequest$Key r6 = android.hardware.camera2.CaptureRequest.CONTROL_AE_REGIONS
            r1.r0(r6, r4)
        L_0x004b:
            android.hardware.camera2.params.MeteringRectangle[] r2 = r2.s
            int r4 = r2.length
            if (r4 == 0) goto L_0x0055
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_REGIONS
            r1.r0(r4, r2)
        L_0x0055:
            wmc r2 = r9.t
            java.lang.Object r2 = r2.a
            android.util.Range r2 = (android.util.Range) r2
            if (r2 == 0) goto L_0x0062
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            r1.r0(r4, r2)
        L_0x0062:
            od r2 = r9.i
            java.lang.Object r2 = r2.Y
            cag r2 = (defpackage.cag) r2
            r2.b(r1)
            xs5 r2 = r9.h
            boolean r2 = r2.v
            if (r2 == 0) goto L_0x0073
            r2 = 5
            goto L_0x0074
        L_0x0073:
            r2 = r3
        L_0x0074:
            boolean r4 = r9.r
            r6 = 2
            if (r4 == 0) goto L_0x0083
            android.hardware.camera2.CaptureRequest$Key r4 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r1.r0(r4, r5)
            goto L_0x008b
        L_0x0083:
            int r4 = r9.s
            if (r4 == 0) goto L_0x008f
            if (r4 == r3) goto L_0x009b
            if (r4 == r6) goto L_0x008d
        L_0x008b:
            r5 = r2
            goto L_0x009b
        L_0x008d:
            r5 = r3
            goto L_0x009b
        L_0x008f:
            oq0 r2 = r9.u
            boolean r4 = r2.a
            if (r4 != 0) goto L_0x008d
            boolean r2 = r2.b
            if (r2 == 0) goto L_0x009a
            goto L_0x008d
        L_0x009a:
            r5 = r6
        L_0x009b:
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            xv1 r4 = r9.e
            int r4 = t(r4, r5)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r1.r0(r2, r4)
            android.hardware.camera2.CaptureRequest$Key r2 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_MODE
            xv1 r4 = r9.e
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES
            java.lang.Object r4 = r4.a(r5)
            int[] r4 = (int[]) r4
            r5 = 0
            if (r4 != 0) goto L_0x00bb
        L_0x00b9:
            r3 = r5
            goto L_0x00c8
        L_0x00bb:
            boolean r6 = w(r3, r4)
            if (r6 == 0) goto L_0x00c2
            goto L_0x00c8
        L_0x00c2:
            boolean r4 = w(r3, r4)
            if (r4 == 0) goto L_0x00b9
        L_0x00c8:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.r0(r2, r3)
            td r2 = r9.k
            r2.getClass()
            android.hardware.camera2.CaptureRequest$Key r3 = android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION
            java.lang.Object r2 = r2.c
            sh0 r2 = (defpackage.sh0) r2
            java.lang.Object r4 = r2.c
            monitor-enter(r4)
            int r2 = r2.b     // Catch:{ all -> 0x0150 }
            monitor-exit(r4)     // Catch:{ all -> 0x0150 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.r0(r3, r2)
            nx0 r2 = r9.m
            java.lang.Object r3 = r2.X
            monitor-enter(r3)
            java.lang.Object r2 = r2.Z     // Catch:{ all -> 0x014d }
            re6 r2 = (defpackage.re6) r2     // Catch:{ all -> 0x014d }
            java.lang.Object r2 = r2.b     // Catch:{ all -> 0x014d }
            mi9 r2 = (defpackage.mi9) r2     // Catch:{ all -> 0x014d }
            be3 r4 = defpackage.be3.a     // Catch:{ all -> 0x014d }
            java.util.Set r5 = r2.g()     // Catch:{ all -> 0x014d }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x014d }
        L_0x00fe:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x014d }
            if (r6 == 0) goto L_0x0116
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x014d }
            aa0 r6 = (defpackage.aa0) r6     // Catch:{ all -> 0x014d }
            java.lang.Object r7 = r1.b     // Catch:{ all -> 0x014d }
            mi9 r7 = (defpackage.mi9) r7     // Catch:{ all -> 0x014d }
            java.lang.Object r8 = r2.h(r6)     // Catch:{ all -> 0x014d }
            r7.d(r6, r4, r8)     // Catch:{ all -> 0x014d }
            goto L_0x00fe
        L_0x0116:
            monitor-exit(r3)     // Catch:{ all -> 0x014d }
            cv1 r2 = new cv1
            java.lang.Object r1 = r1.b
            mi9 r1 = (defpackage.mi9) r1
            wma r1 = defpackage.wma.a(r1)
            r3 = 8
            r2.<init>((int) r3, (java.lang.Object) r1)
            u40 r0 = r0.b
            r0.getClass()
            mi9 r1 = defpackage.mi9.c(r2)
            r0.f = r1
            bad r0 = r9.g
            java.lang.String r1 = "CameraControlSessionUpdateId"
            long r2 = r9.y
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            u40 r0 = r0.b
            java.lang.Object r0 = r0.g
            ui9 r0 = (defpackage.ui9) r0
            java.util.Map r0 = r0.a
            r0.put(r1, r2)
            bad r9 = r9.g
            fad r9 = r9.c()
            return r9
        L_0x014d:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x014d }
            throw r9
        L_0x0150:
            r9 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0150 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st1.s():fad");
    }

    public final int u(int i2) {
        int[] iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (w(i2, iArr)) {
            return i2;
        }
        if (w(4, iArr)) {
            return 4;
        }
        return w(1, iArr) ? 1 : 0;
    }

    public final boolean v() {
        int i2;
        synchronized (this.d) {
            i2 = this.p;
        }
        return i2 > 0;
    }

    public final void y(boolean z2) {
        sa0 e2;
        xs5 xs5 = this.h;
        if (z2 != xs5.d) {
            xs5.d = z2;
            if (!xs5.d) {
                xs5.b();
            }
        }
        od odVar = this.i;
        if (odVar.a != z2) {
            odVar.a = z2;
            if (!z2) {
                synchronized (((hag) odVar.o)) {
                    ((hag) odVar.o).f(1.0f);
                    e2 = sa0.e((hag) odVar.o);
                }
                odVar.h(e2);
                ((cag) odVar.Y).g();
                ((st1) odVar.b).A();
            }
        }
        bye bye = this.j;
        if (bye.e != z2) {
            bye.e = z2;
            if (!z2) {
                if (bye.g) {
                    bye.g = false;
                    bye.a.r(false);
                    bye.b(bye.b, 0);
                }
                lq1 lq1 = bye.f;
                if (lq1 != null) {
                    lq1.d(new Exception("Camera is not active."));
                    bye.f = null;
                }
            }
        }
        td tdVar = this.k;
        if (z2 != tdVar.b) {
            tdVar.b = z2;
            if (!z2) {
                sh0 sh0 = (sh0) tdVar.c;
                synchronized (sh0.c) {
                    sh0.b = 0;
                }
            }
        }
        nx0 nx0 = this.m;
        nx0.getClass();
        ((Executor) nx0.o).execute(new u60((Object) nx0, z2, 6));
        if (!z2) {
            this.q = null;
            ((AtomicInteger) this.o.c).set(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0078, code lost:
        r7 = r3.h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z(java.util.List r21) {
        /*
            r20 = this;
            r0 = r20
            sy4 r0 = r0.f
            r0.getClass()
            r21.getClass()
            java.lang.Object r0 = r0.b
            fu1 r0 = (defpackage.fu1) r0
            r0.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r21.iterator()
        L_0x001a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x018b
            java.lang.Object r3 = r2.next()
            kz1 r3 = (defpackage.kz1) r3
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            defpackage.mi9.b()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            defpackage.ui9.a()
            java.util.List r6 = r3.a
            r4.addAll(r6)
            ce3 r6 = r3.b
            mi9 r6 = defpackage.mi9.c(r6)
            java.util.List r7 = r3.e
            r5.addAll(r7)
            android.util.ArrayMap r7 = new android.util.ArrayMap
            r7.<init>()
            nje r8 = r3.g
            java.util.Map r9 = r8.a
            java.util.Set r9 = r9.keySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x0057:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x006d
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            java.util.Map r11 = r8.a
            java.lang.Object r11 = r11.get(r10)
            r7.put(r10, r11)
            goto L_0x0057
        L_0x006d:
            ui9 r8 = new ui9
            r8.<init>(r7)
            r7 = 5
            int r9 = r3.c
            r10 = 0
            if (r9 != r7) goto L_0x007f
            pv1 r7 = r3.h
            if (r7 == 0) goto L_0x007f
            r19 = r7
            goto L_0x0081
        L_0x007f:
            r19 = r10
        L_0x0081:
            java.util.List r7 = r3.a
            java.util.List r7 = java.util.Collections.unmodifiableList(r7)
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x013c
            boolean r7 = r3.f
            if (r7 == 0) goto L_0x013c
            boolean r7 = r4.isEmpty()
            if (r7 != 0) goto L_0x0098
            goto L_0x001a
        L_0x0098:
            gaa r7 = r0.a
            r7.getClass()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.Object r7 = r7.a
            java.util.LinkedHashMap r7 = (java.util.LinkedHashMap) r7
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x00ae:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x00d4
            java.lang.Object r10 = r7.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getValue()
            m9f r11 = (defpackage.m9f) r11
            boolean r12 = r11.f
            if (r12 == 0) goto L_0x00ae
            boolean r11 = r11.e
            if (r11 == 0) goto L_0x00ae
            java.lang.Object r10 = r10.getValue()
            m9f r10 = (defpackage.m9f) r10
            fad r10 = r10.a
            r9.add(r10)
            goto L_0x00ae
        L_0x00d4:
            java.util.Collection r7 = java.util.Collections.unmodifiableCollection(r9)
            java.util.Iterator r7 = r7.iterator()
        L_0x00dc:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L_0x0134
            java.lang.Object r9 = r7.next()
            fad r9 = (defpackage.fad) r9
            kz1 r9 = r9.g
            java.util.List r10 = r9.a
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            boolean r11 = r10.isEmpty()
            if (r11 != 0) goto L_0x00dc
            int r11 = r9.b()
            if (r11 == 0) goto L_0x010b
            int r11 = r9.b()
            if (r11 == 0) goto L_0x010b
            aa0 r12 = defpackage.o9f.p0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r6.j(r12, r11)
        L_0x010b:
            int r11 = r9.c()
            if (r11 == 0) goto L_0x0120
            int r9 = r9.c()
            if (r9 == 0) goto L_0x0120
            aa0 r11 = defpackage.o9f.q0
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r6.j(r11, r9)
        L_0x0120:
            java.util.Iterator r9 = r10.iterator()
        L_0x0124:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00dc
            java.lang.Object r10 = r9.next()
            xf4 r10 = (defpackage.xf4) r10
            r4.add(r10)
            goto L_0x0124
        L_0x0134:
            boolean r7 = r4.isEmpty()
            if (r7 == 0) goto L_0x013c
            goto L_0x001a
        L_0x013c:
            kz1 r7 = new kz1
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r4)
            wma r13 = defpackage.wma.a(r6)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r5)
            nje r5 = defpackage.nje.b
            android.util.ArrayMap r5 = new android.util.ArrayMap
            r5.<init>()
            java.util.Map r6 = r8.a
            java.util.Set r8 = r6.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x015d:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0171
            java.lang.Object r9 = r8.next()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r6.get(r9)
            r5.put(r9, r10)
            goto L_0x015d
        L_0x0171:
            nje r6 = new nje
            r6.<init>(r5)
            int r14 = r3.c
            boolean r15 = r3.d
            boolean r3 = r3.f
            r11 = r7
            r16 = r4
            r17 = r3
            r18 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r1.add(r7)
            goto L_0x001a
        L_0x018b:
            r0.toString()
            sz1 r0 = r0.w0
            r0.j(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st1.z(java.util.List):void");
    }
}
