package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: rz1  reason: default package */
public final class rz1 extends ghe {
    public final /* synthetic */ int a;
    public final Object b;

    public rz1(sz1 sz1) {
        this.a = 0;
        this.b = sz1;
    }

    private final void i(ihe ihe) {
    }

    public void a(jhe jhe) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onActive((CameraCaptureSession) ((ph4) jhe.q().a).a);
                return;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((ghe) it.next()).a(jhe);
                }
                return;
            default:
                return;
        }
    }

    public void b(jhe jhe) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onCaptureQueueEmpty((CameraCaptureSession) ((ph4) jhe.q().a).a);
                return;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((ghe) it.next()).b(jhe);
                }
                return;
            default:
                return;
        }
    }

    public void c(ihe ihe) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onClosed((CameraCaptureSession) ((ph4) ihe.q().a).a);
                return;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((ghe) it.next()).c(ihe);
                }
                return;
            default:
                return;
        }
    }

    public final void d(ihe ihe) {
        switch (this.a) {
            case 0:
                synchronized (((sz1) this.b).a) {
                    try {
                        switch (au1.s(((sz1) this.b).i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                                throw new IllegalStateException("onConfigureFailed() should not be possible in state: ".concat(wg0.t(((sz1) this.b).i)));
                            case 3:
                            case 5:
                            case 6:
                                ((sz1) this.b).d();
                                break;
                        }
                        int i = ((sz1) this.b).i;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onConfigureFailed((CameraCaptureSession) ((ph4) ihe.q().a).a);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((ghe) it.next()).d(ihe);
                }
                return;
        }
    }

    public final void e(jhe jhe) {
        switch (this.a) {
            case 0:
                synchronized (((sz1) this.b).a) {
                    try {
                        switch (au1.s(((sz1) this.b).i)) {
                            case 0:
                            case 1:
                            case 2:
                            case 4:
                            case 7:
                                throw new IllegalStateException("onConfigured() should not be possible in state: ".concat(wg0.t(((sz1) this.b).i)));
                            case 3:
                                sz1 sz1 = (sz1) this.b;
                                sz1.i = 5;
                                sz1.e = jhe;
                                sz1.k(sz1.f);
                                sz1 sz12 = (sz1) this.b;
                                sz12.o.c().d(new cu1(8, sz12), ju0.k());
                                break;
                            case 5:
                                ((sz1) this.b).e = jhe;
                                break;
                            case 6:
                                jhe.j();
                                break;
                        }
                        int i = ((sz1) this.b).i;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onConfigured((CameraCaptureSession) ((ph4) jhe.q().a).a);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((ghe) it.next()).e(jhe);
                }
                return;
        }
    }

    public final void f(jhe jhe) {
        switch (this.a) {
            case 0:
                synchronized (((sz1) this.b).a) {
                    try {
                        if (au1.s(((sz1) this.b).i) != 0) {
                            int i = ((sz1) this.b).i;
                        } else {
                            throw new IllegalStateException("onReady() should not be possible in state: ".concat(wg0.t(((sz1) this.b).i)));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onReady((CameraCaptureSession) ((ph4) jhe.q().a).a);
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((ghe) it.next()).f(jhe);
                }
                return;
        }
    }

    public final void g(ihe ihe) {
        switch (this.a) {
            case 0:
                synchronized (((sz1) this.b).a) {
                    try {
                        sz1 sz1 = (sz1) this.b;
                        if (sz1.i != 1) {
                            sz1.d();
                        } else {
                            throw new IllegalStateException("onSessionFinished() should not be possible in state: ".concat(wg0.t(((sz1) this.b).i)));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            case 1:
                return;
            default:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((ghe) it.next()).g(ihe);
                }
                return;
        }
    }

    public void h(jhe jhe, Surface surface) {
        switch (this.a) {
            case 1:
                ((CameraCaptureSession.StateCallback) this.b).onSurfacePrepared((CameraCaptureSession) ((ph4) jhe.q().a).a, surface);
                return;
            case 2:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((ghe) it.next()).h(jhe, surface);
                }
                return;
            default:
                return;
        }
    }

    public rz1(int i, List list) {
        Object obj;
        this.a = i;
        switch (i) {
            case 2:
                ArrayList arrayList = new ArrayList();
                this.b = arrayList;
                arrayList.addAll(list);
                return;
            default:
                if (list.isEmpty()) {
                    obj = new CameraCaptureSession.StateCallback();
                } else if (list.size() == 1) {
                    obj = (CameraCaptureSession.StateCallback) list.get(0);
                } else {
                    obj = new rv1(list);
                }
                this.b = obj;
                return;
        }
    }
}
