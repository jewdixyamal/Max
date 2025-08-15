package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.media.ImageWriter;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: rv1  reason: default package */
public final class rv1 extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ rv1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(CameraCaptureSession cameraCaptureSession) {
    }

    public void onActive(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onActive(cameraCaptureSession);
                }
                return;
            case 1:
                ihe ihe = (ihe) this.b;
                ihe.k(cameraCaptureSession);
                ihe.a((jhe) ihe);
                return;
            default:
                super.onActive(cameraCaptureSession);
                return;
        }
    }

    public void onCaptureQueueEmpty(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onCaptureQueueEmpty(cameraCaptureSession);
                }
                return;
            case 1:
                ihe ihe = (ihe) this.b;
                ihe.k(cameraCaptureSession);
                ihe.b((jhe) ihe);
                return;
            default:
                super.onCaptureQueueEmpty(cameraCaptureSession);
                return;
        }
    }

    public void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onClosed(cameraCaptureSession);
                }
                return;
            case 1:
                ihe ihe = (ihe) this.b;
                ihe.k(cameraCaptureSession);
                ihe.c(ihe);
                return;
            default:
                super.onClosed(cameraCaptureSession);
                return;
        }
    }

    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        lq1 lq1;
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigureFailed(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((ihe) this.b).k(cameraCaptureSession);
                    ihe ihe = (ihe) this.b;
                    ihe.d(ihe);
                    synchronized (((ihe) this.b).a) {
                        c54.o(((ihe) this.b).h, "OpenCaptureSession completer should not null");
                        ihe ihe2 = (ihe) this.b;
                        lq1 = ihe2.h;
                        ihe2.h = null;
                    }
                    lq1.d(new IllegalStateException("onConfigureFailed"));
                    return;
                } catch (Throwable th) {
                    synchronized (((ihe) this.b).a) {
                        c54.o(((ihe) this.b).h, "OpenCaptureSession completer should not null");
                        ihe ihe3 = (ihe) this.b;
                        lq1 lq12 = ihe3.h;
                        ihe3.h = null;
                        lq12.d(new IllegalStateException("onConfigureFailed"));
                        throw th;
                    }
                }
            default:
                return;
        }
    }

    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        lq1 lq1;
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onConfigured(cameraCaptureSession);
                }
                return;
            case 1:
                try {
                    ((ihe) this.b).k(cameraCaptureSession);
                    ihe ihe = (ihe) this.b;
                    ihe.e((jhe) ihe);
                    synchronized (((ihe) this.b).a) {
                        c54.o(((ihe) this.b).h, "OpenCaptureSession completer should not null");
                        ihe ihe2 = (ihe) this.b;
                        lq1 = ihe2.h;
                        ihe2.h = null;
                    }
                    lq1.b((Object) null);
                    return;
                } catch (Throwable th) {
                    synchronized (((ihe) this.b).a) {
                        c54.o(((ihe) this.b).h, "OpenCaptureSession completer should not null");
                        ihe ihe3 = (ihe) this.b;
                        lq1 lq12 = ihe3.h;
                        ihe3.h = null;
                        lq12.b((Object) null);
                        throw th;
                    }
                }
            default:
                Surface inputSurface = cameraCaptureSession.getInputSurface();
                if (inputSurface != null) {
                    ((mag) this.b).j = ImageWriter.newInstance(inputSurface, 1);
                    return;
                }
                return;
        }
    }

    public void onReady(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onReady(cameraCaptureSession);
                }
                return;
            case 1:
                ihe ihe = (ihe) this.b;
                ihe.k(cameraCaptureSession);
                ihe.f((jhe) ihe);
                return;
            default:
                super.onReady(cameraCaptureSession);
                return;
        }
    }

    public void onSurfacePrepared(CameraCaptureSession cameraCaptureSession, Surface surface) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((CameraCaptureSession.StateCallback) it.next()).onSurfacePrepared(cameraCaptureSession, surface);
                }
                return;
            case 1:
                ihe ihe = (ihe) this.b;
                ihe.k(cameraCaptureSession);
                ihe.h((jhe) ihe, surface);
                return;
            default:
                super.onSurfacePrepared(cameraCaptureSession, surface);
                return;
        }
    }

    public rv1(List list) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CameraCaptureSession.StateCallback stateCallback = (CameraCaptureSession.StateCallback) it.next();
            if (!(stateCallback instanceof sv1)) {
                ((ArrayList) this.b).add(stateCallback);
            }
        }
    }
}
