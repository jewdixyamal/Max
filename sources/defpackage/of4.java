package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.impl.DeferrableSurface$SurfaceClosedException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: of4  reason: default package */
public final /* synthetic */ class of4 implements mq1, wu {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ of4(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public void a() {
        rf4 rf4 = (rf4) this.a;
        Executor executor = (Executor) this.b;
        agf agf = (agf) this.c;
        nx0 nx0 = (nx0) this.o;
        if (rf4.r) {
            Objects.requireNonNull(agf);
            executor.execute(new dd4(3, agf));
            d54.a();
            return;
        }
        synchronized (rf4.o) {
            try {
                jn jnVar = rf4.l;
                if (jnVar != null) {
                    nx0.v(new mf4(rf4, jnVar, 1));
                    rf4.l = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public bm7 apply(Object obj) {
        bm7 bm7;
        jhe jhe = (jhe) this.a;
        CameraDevice cameraDevice = (CameraDevice) this.b;
        had had = (had) this.c;
        List list = (List) this.o;
        List list2 = (List) obj;
        if (jhe.u.b) {
            Iterator it = jhe.b.e().iterator();
            while (it.hasNext()) {
                ((ihe) it.next()).j();
            }
        }
        synchronized (jhe.a) {
            try {
                if (jhe.l) {
                    bm7 = new dw6(1, new CancellationException("Opener is disabled"));
                } else {
                    q40 q40 = jhe.b;
                    synchronized (q40.b) {
                        ((LinkedHashSet) q40.X).add(jhe);
                    }
                    oq1 g = f8.g(new of4(jhe, list, new rxd(cameraDevice), had));
                    jhe.g = g;
                    kq0.a(g, new u5e(jhe), ju0.k());
                    bm7 = kq0.w(jhe.g);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bm7;
    }

    public String q(lq1 lq1) {
        boolean z;
        String str;
        int i;
        ihe ihe = (ihe) this.a;
        List list = (List) this.b;
        rxd rxd = (rxd) this.c;
        had had = (had) this.o;
        synchronized (ihe.a) {
            try {
                synchronized (ihe.a) {
                    synchronized (ihe.a) {
                        try {
                            List<xf4> list2 = ihe.j;
                            if (list2 != null) {
                                for (xf4 b2 : list2) {
                                    b2.b();
                                }
                                ihe.j = null;
                            }
                        } catch (DeferrableSurface$SurfaceClosedException e) {
                            for (int i2 = i - 1; i2 >= 0; i2--) {
                                ((xf4) list.get(i2)).b();
                            }
                            throw e;
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                            }
                        }
                    }
                    z = false;
                    if (!list.isEmpty()) {
                        i = 0;
                        do {
                            ((xf4) list.get(i)).d();
                            i++;
                        } while (i < list.size());
                    }
                    ihe.j = list;
                }
                if (ihe.h == null) {
                    z = true;
                }
                c54.p("The openCaptureSessionCompleter can only set once!", z);
                ihe.h = lq1;
                mw1 mw1 = (mw1) rxd.b;
                mw1.getClass();
                SessionConfiguration sessionConfiguration = had.a.a;
                sessionConfiguration.getClass();
                ((CameraDevice) mw1.b).createCaptureSession(sessionConfiguration);
                str = "openCaptureSession[session=" + ihe + "]";
            } catch (CameraAccessException e2) {
                throw new CameraAccessExceptionCompat(e2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
