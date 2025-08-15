package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: iu1  reason: default package */
public final class iu1 implements yw1 {
    public final String a;
    public final xv1 b;
    public final wd6 c;
    public final Object d = new Object();
    public st1 e;
    public hu1 f = null;
    public hu1 g = null;
    public final hu1 h;
    public ArrayList i = null;
    public final bj6 j;
    public final ay k;

    public iu1(dx1 dx1, String str) {
        str.getClass();
        this.a = str;
        xv1 a2 = dx1.a(str);
        this.b = a2;
        wd6 wd6 = new wd6(6, false);
        wd6.b = this;
        this.c = wd6;
        bj6 i2 = ft.i(a2);
        this.j = i2;
        this.k = new ay(str, i2);
        this.h = new hu1(new u90(5, (v90) null));
    }

    public final Set a() {
        return ((iu4) o9g.x(this.b).b).a();
    }

    public final int b() {
        return l(0);
    }

    public final boolean c() {
        int[] iArr = (int[]) this.b.a(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
        if (iArr != null) {
            for (int i2 : iArr) {
                if (i2 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public final String d() {
        return this.a;
    }

    public final xm7 e() {
        synchronized (this.d) {
            try {
                st1 st1 = this.e;
                if (st1 == null) {
                    if (this.f == null) {
                        this.f = new hu1(0);
                    }
                    hu1 hu1 = this.f;
                    return hu1;
                }
                hu1 hu12 = this.f;
                if (hu12 != null) {
                    return hu12;
                }
                ci9 ci9 = st1.j.b;
                return ci9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int g() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.LENS_FACING);
        c54.j("Unable to get the lens facing of the camera.", num != null);
        int intValue = num.intValue();
        if (intValue == 0) {
            return 0;
        }
        if (intValue == 1) {
            return 1;
        }
        if (intValue == 2) {
            return 2;
        }
        throw new IllegalArgumentException(wg0.g(intValue, "The given lens facing integer: ", " can not be recognized."));
    }

    public final bue h() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE);
        num.getClass();
        return num.intValue() != 1 ? bue.a : bue.b;
    }

    public final String j() {
        Integer num = (Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        num.getClass();
        return num.intValue() == 2 ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: android.util.Size[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.util.Size[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List k(int r5) {
        /*
            r4 = this;
            xv1 r4 = r4.b
            c8d r4 = r4.b()
            java.lang.Object r0 = r4.o
            java.util.HashMap r0 = (java.util.HashMap) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            boolean r1 = r0.containsKey(r1)
            r2 = 0
            if (r1 == 0) goto L_0x0034
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r0.get(r4)
            android.util.Size[] r4 = (android.util.Size[]) r4
            if (r4 != 0) goto L_0x0022
            goto L_0x005d
        L_0x0022:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r0.get(r4)
            android.util.Size[] r4 = (android.util.Size[]) r4
            java.lang.Object r4 = r4.clone()
            r2 = r4
            android.util.Size[] r2 = (android.util.Size[]) r2
            goto L_0x005d
        L_0x0034:
            java.lang.Object r1 = r4.a
            fd7 r1 = (defpackage.fd7) r1
            java.lang.Object r1 = r1.a
            android.hardware.camera2.params.StreamConfigurationMap r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1
            android.util.Size[] r1 = r1.getHighResolutionOutputSizes(r5)
            if (r1 == 0) goto L_0x004d
            int r3 = r1.length
            if (r3 <= 0) goto L_0x004d
            java.lang.Object r4 = r4.b
            y7g r4 = (defpackage.y7g) r4
            android.util.Size[] r1 = r4.p(r1, r5)
        L_0x004d:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            r0.put(r4, r1)
            if (r1 == 0) goto L_0x005d
            java.lang.Object r4 = r1.clone()
            r2 = r4
            android.util.Size[] r2 = (android.util.Size[]) r2
        L_0x005d:
            if (r2 == 0) goto L_0x0064
            java.util.List r4 = java.util.Arrays.asList(r2)
            goto L_0x0068
        L_0x0064:
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x0068:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iu1.k(int):java.util.List");
    }

    public final int l(int i2) {
        Integer num = (Integer) this.b.a(CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        int intValue = num.intValue();
        int C = kp.C(i2);
        boolean z = true;
        if (1 != g()) {
            z = false;
        }
        return kp.m(C, intValue, z);
    }

    public final boolean m() {
        xv1 xv1 = this.b;
        Objects.requireNonNull(xv1);
        return kq0.s(new ync(23, xv1));
    }

    public final void n(ok4 ok4, pt1 pt1) {
        synchronized (this.d) {
            try {
                st1 st1 = this.e;
                if (st1 == null) {
                    if (this.i == null) {
                        this.i = new ArrayList();
                    }
                    this.i.add(new Pair(pt1, ok4));
                    return;
                }
                st1.c.execute(new f5((Object) st1, (Object) ok4, (Object) pt1, 12));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final e15 o() {
        return this.k;
    }

    public final bj6 p() {
        return this.j;
    }

    public final List q(int i2) {
        Size[] s = this.b.b().s(i2);
        return s != null ? Arrays.asList(s) : Collections.emptyList();
    }

    public final xm7 r() {
        synchronized (this.d) {
            try {
                st1 st1 = this.e;
                if (st1 == null) {
                    if (this.g == null) {
                        cag b2 = od.b(this.b);
                        hag hag = new hag(b2.c(), b2.d());
                        hag.f(1.0f);
                        this.g = new hu1(sa0.e(hag));
                    }
                    hu1 hu1 = this.g;
                    return hu1;
                }
                hu1 hu12 = this.g;
                if (hu12 != null) {
                    return hu12;
                }
                ci9 ci9 = (ci9) st1.i.X;
                return ci9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void s(iv1 iv1) {
        synchronized (this.d) {
            try {
                st1 st1 = this.e;
                if (st1 == null) {
                    ArrayList arrayList = this.i;
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            if (((Pair) it.next()).first == iv1) {
                                it.remove();
                            }
                        }
                        return;
                    }
                    return;
                }
                st1.c.execute(new c(st1, 27, iv1));
            } finally {
            }
        }
    }

    public final void t(st1 st1) {
        synchronized (this.d) {
            try {
                this.e = st1;
                hu1 hu1 = this.g;
                if (hu1 != null) {
                    hu1.m((ci9) st1.i.X);
                }
                hu1 hu12 = this.f;
                if (hu12 != null) {
                    hu12.m(this.e.j.b);
                }
                ArrayList arrayList = this.i;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        st1 st12 = this.e;
                        st12.getClass();
                        st12.c.execute(new f5((Object) st12, (Object) (Executor) pair.second, (Object) (iv1) pair.first, 12));
                    }
                    this.i = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        ((Integer) this.b.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).getClass();
    }
}
