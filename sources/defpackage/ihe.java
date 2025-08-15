package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: ihe  reason: default package */
public abstract class ihe extends ghe {
    public final Object a = new Object();
    public final q40 b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public ghe e;
    public fd7 f;
    public oq1 g;
    public lq1 h;
    public b76 i;
    public List j = null;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;

    public ihe(q40 q40, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.b = q40;
        this.c = executor;
        this.d = scheduledExecutorService;
    }

    public final void a(jhe jhe) {
        Objects.requireNonNull(this.e);
        this.e.a(jhe);
    }

    public final void b(jhe jhe) {
        Objects.requireNonNull(this.e);
        this.e.b(jhe);
    }

    public abstract void c(ihe ihe);

    public final void d(ihe ihe) {
        ihe ihe2;
        Objects.requireNonNull(this.e);
        jhe jhe = (jhe) this;
        synchronized (jhe.a) {
            try {
                List<xf4> list = jhe.j;
                if (list != null) {
                    for (xf4 b2 : list) {
                        b2.b();
                    }
                    jhe.j = null;
                }
            } finally {
                while (true) {
                }
            }
        }
        jhe.t.d();
        q40 q40 = this.b;
        Iterator it = q40.h().iterator();
        while (it.hasNext() && (ihe2 = (ihe) it.next()) != this) {
            jhe jhe2 = (jhe) ihe2;
            synchronized (jhe2.a) {
                try {
                    List<xf4> list2 = jhe2.j;
                    if (list2 != null) {
                        for (xf4 b3 : list2) {
                            b3.b();
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
        synchronized (q40.b) {
            ((LinkedHashSet) q40.X).remove(this);
        }
        this.e.d(ihe);
    }

    public final void f(jhe jhe) {
        Objects.requireNonNull(this.e);
        this.e.f(jhe);
    }

    public final void g(ihe ihe) {
        oq1 oq1;
        synchronized (this.a) {
            try {
                if (!this.m) {
                    this.m = true;
                    c54.o(this.g, "Need to call openCaptureSession before using this API.");
                    oq1 = this.g;
                } else {
                    oq1 = null;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        if (oq1 != null) {
            oq1.b.d(new hhe(this, ihe, 0), ju0.k());
        }
    }

    public final void h(jhe jhe, Surface surface) {
        Objects.requireNonNull(this.e);
        this.e.h(jhe, surface);
    }

    public abstract int i(ArrayList arrayList, qt1 qt1);

    public abstract void j();

    /* JADX WARNING: type inference failed for: r0v1, types: [fd7, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, ph4] */
    public final void k(CameraCaptureSession cameraCaptureSession) {
        if (this.f == null) {
            ? obj = new Object();
            ? obj2 = new Object();
            cameraCaptureSession.getClass();
            obj2.a = cameraCaptureSession;
            obj2.b = null;
            obj.a = obj2;
            this.f = obj;
        }
    }

    public final boolean l() {
        boolean z;
        synchronized (this.a) {
            z = this.g != null;
        }
        return z;
    }

    public abstract bm7 m(CameraDevice cameraDevice, had had, List list);

    public abstract int n(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback);

    public bm7 o(ArrayList arrayList) {
        synchronized (this.a) {
            try {
                if (this.l) {
                    dw6 dw6 = new dw6(1, new CancellationException("Opener is disabled"));
                    return dw6;
                }
                b76 a2 = b76.a(f46.b0(arrayList, this.c, this.d));
                ypc ypc = new ypc(this, 8, arrayList);
                Executor executor = this.c;
                a2.getClass();
                k12 K = kq0.K(a2, ypc, executor);
                this.i = K;
                bm7 w = kq0.w(K);
                return w;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract boolean p();

    public final fd7 q() {
        this.f.getClass();
        return this.f;
    }
}
