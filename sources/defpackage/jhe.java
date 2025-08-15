package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: jhe  reason: default package */
public final class jhe extends ihe {
    public final ScheduledExecutorService n;
    public final Object o = new Object();
    public List p;
    public nl7 q;
    public final x50 r;
    public final fd7 s;
    public final vg8 t;
    public final ae3 u;
    public final AtomicBoolean v;

    /* JADX WARNING: type inference failed for: r3v3, types: [x50, java.lang.Object] */
    public jhe(bj6 bj6, bj6 bj62, q40 q40, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(q40, executor, scheduledExecutorService, handler);
        boolean z = false;
        this.v = new AtomicBoolean(false);
        ? obj = new Object();
        obj.a = bj62.d(TextureViewIsClosedQuirk.class);
        obj.b = bj6.d(PreviewOrientationIncorrectQuirk.class);
        obj.c = bj6.d(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.r = obj;
        this.t = new vg8((bj6.d(CaptureSessionStuckQuirk.class) || bj6.d(IncorrectCaptureStateQuirk.class)) ? true : z);
        this.s = new fd7(bj62, 15);
        this.u = new ae3(bj62, 4);
        this.n = scheduledExecutorService;
    }

    public final void c(ihe ihe) {
        oq1 oq1;
        synchronized (this.o) {
            this.r.b(this.p);
        }
        synchronized (this.a) {
            try {
                if (!this.k) {
                    this.k = true;
                    c54.o(this.g, "Need to call openCaptureSession before using this API.");
                    oq1 = this.g;
                } else {
                    oq1 = null;
                }
            } finally {
                while (true) {
                }
            }
        }
        synchronized (this.a) {
            try {
                List<xf4> list = this.j;
                if (list != null) {
                    for (xf4 b : list) {
                        b.b();
                    }
                    this.j = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        this.t.d();
        if (oq1 != null) {
            oq1.b.d(new hhe(this, ihe, 1), ju0.k());
        }
    }

    public final void e(jhe jhe) {
        ArrayList arrayList;
        ihe ihe;
        ihe ihe2;
        ihe ihe3;
        fd7 fd7 = this.s;
        q40 q40 = this.b;
        synchronized (q40.b) {
            arrayList = new ArrayList((LinkedHashSet) q40.X);
        }
        ArrayList e = this.b.e();
        if (((CaptureSessionOnClosedNotCalledQuirk) fd7.a) != null) {
            LinkedHashSet<ihe> linkedHashSet = new LinkedHashSet<>();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (ihe3 = (ihe) it.next()) != jhe) {
                linkedHashSet.add(ihe3);
            }
            for (ihe ihe4 : linkedHashSet) {
                ihe4.getClass();
                ihe4.d(ihe4);
            }
        }
        Objects.requireNonNull(this.e);
        q40 q402 = this.b;
        synchronized (q402.b) {
            ((LinkedHashSet) q402.c).add(this);
            ((LinkedHashSet) q402.X).remove(this);
        }
        Iterator it2 = q402.h().iterator();
        while (it2.hasNext() && (ihe2 = (ihe) it2.next()) != this) {
            jhe jhe2 = (jhe) ihe2;
            synchronized (jhe2.a) {
                try {
                    List<xf4> list = jhe2.j;
                    if (list != null) {
                        for (xf4 b : list) {
                            b.b();
                        }
                        jhe2.j = null;
                    }
                } catch (Throwable th) {
                    while (true) {
                        throw th;
                    }
                }
            }
            jhe2.t.d();
        }
        this.e.e(jhe);
        if (((CaptureSessionOnClosedNotCalledQuirk) fd7.a) != null) {
            LinkedHashSet<ihe> linkedHashSet2 = new LinkedHashSet<>();
            Iterator it3 = e.iterator();
            while (it3.hasNext() && (ihe = (ihe) it3.next()) != jhe) {
                linkedHashSet2.add(ihe);
            }
            for (ihe ihe5 : linkedHashSet2) {
                ihe5.getClass();
                ihe5.c(ihe5);
            }
        }
    }

    public final int i(ArrayList arrayList, qt1 qt1) {
        CameraCaptureSession.CaptureCallback a = this.t.a(qt1);
        c54.o(this.f, "Need to call openCaptureSession before using this API.");
        return ((CameraCaptureSession) ((ph4) this.f.a).a).captureBurstRequests(arrayList, this.c, a);
    }

    public final void j() {
        if (this.v.compareAndSet(false, true)) {
            if (this.u.b) {
                try {
                    c54.o(this.f, "Need to call openCaptureSession before using this API.");
                    ((CameraCaptureSession) ((ph4) this.f.a).a).abortCaptures();
                } catch (Exception e) {
                    e.toString();
                }
            }
            this.t.c().d(new u3c(26, this), this.c);
        }
    }

    public final bm7 m(CameraDevice cameraDevice, had had, List list) {
        bm7 w;
        synchronized (this.o) {
            try {
                ArrayList e = this.b.e();
                ArrayList arrayList = new ArrayList();
                Iterator it = e.iterator();
                while (it.hasNext()) {
                    jhe jhe = (jhe) ((ihe) it.next());
                    arrayList.add(f8.g(new x72((Object) jhe.t.c(), (Object) jhe.n, 1500, 7)));
                }
                nl7 J = kq0.J(arrayList);
                this.q = J;
                b76 a = b76.a(J);
                of4 of4 = new of4(this, cameraDevice, had, list);
                Executor executor = this.c;
                a.getClass();
                w = kq0.w(kq0.K(a, of4, executor));
            } catch (Throwable th) {
                throw th;
            }
        }
        return w;
    }

    public final int n(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback a = this.t.a(captureCallback);
        c54.o(this.f, "Need to call openCaptureSession before using this API.");
        return ((CameraCaptureSession) ((ph4) this.f.a).a).setSingleRepeatingRequest(captureRequest, this.c, a);
    }

    public final bm7 o(ArrayList arrayList) {
        bm7 o2;
        synchronized (this.o) {
            this.p = arrayList;
            o2 = super.o(arrayList);
        }
        return o2;
    }

    public final boolean p() {
        boolean z;
        synchronized (this.o) {
            try {
                if (l()) {
                    this.r.b(this.p);
                } else {
                    nl7 nl7 = this.q;
                    if (nl7 != null) {
                        nl7.cancel(true);
                    }
                }
                b76 b76 = null;
                try {
                    synchronized (this.a) {
                        if (!this.l) {
                            b76 b762 = this.i;
                            if (b762 != null) {
                                b76 = b762;
                            }
                            this.l = true;
                        }
                        z = !l();
                    }
                    if (b76 != null) {
                        b76.cancel(true);
                    }
                } catch (Throwable th) {
                    if (b76 != null) {
                        b76.cancel(true);
                    }
                    throw th;
                }
            } finally {
            }
        }
        return z;
    }
}
