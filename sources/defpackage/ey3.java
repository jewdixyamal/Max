package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.CancellationSignal;
import android.view.Surface;
import java.util.concurrent.CancellationException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextGLException;

/* renamed from: ey3  reason: default package */
public final class ey3 extends rd7 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ey3(Object obj, int i, Object obj2) {
        super(1);
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        EGLDisplay eGLDisplay;
        EGLConfig eGLConfig;
        switch (this.a) {
            case 0:
                Throwable th = (Throwable) obj;
                CancellationSignal cancellationSignal = (CancellationSignal) this.b;
                if (cancellationSignal != null) {
                    cancellationSignal.cancel();
                }
                ((x77) this.c).cancel((CancellationException) null);
                return e5f.a;
            case 1:
                fpd fpd = (fpd) obj;
                sl1 sl1 = (sl1) this.b;
                boolean a2 = sl1.b.a.a();
                zad zad = (zad) this.c;
                kg1 kg1 = sl1.b;
                if (a2 || tpa.f(kg1.k, zad)) {
                    eqa eqa = fpd.a;
                    kg1.g(zad, eqa.a);
                    for (dg1 dg1 : eqa.b) {
                        sl1.e.n.onStateChanged(dg1.b, dg1);
                    }
                }
                return e5f.a;
            case 2:
                ((uf0) this.b).d.b((a4c) this.c, "P2PNetworkStatusReporter", (String) obj);
                return e5f.a;
            default:
                me1 me1 = (me1) obj;
                ne1 ne1 = (ne1) this.b;
                me1.e(ne1.a);
                Surface surface = (Surface) this.c;
                EGLSurface eGLSurface = null;
                if (!(!surface.isValid() || (eGLDisplay = me1.e) == null || (eGLConfig = me1.f) == null)) {
                    eGLSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, new int[]{12344}, 0);
                    if (eGLSurface != EGL14.EGL_NO_SURFACE) {
                        me1.b(eGLSurface);
                        GLES20.glPixelStorei(3317, 1);
                        me1.a.log(me1.j, zr6.h(me1.l.incrementAndGet(), "Surface created, total count is "));
                    } else {
                        throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "createSurface()");
                    }
                }
                ne1.a = eGLSurface;
                return e5f.a;
        }
    }
}
