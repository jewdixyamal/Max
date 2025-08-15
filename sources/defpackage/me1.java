package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.HandlerThread;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextGLException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;

/* renamed from: me1  reason: default package */
public final class me1 {
    public static final AtomicInteger l = new AtomicInteger(0);
    public final a4c a;
    public final m56 b;
    public final HandlerThread c;
    public EGLContext d;
    public EGLDisplay e;
    public EGLConfig f;
    public EGLSurface g;
    public final Object h;
    public boolean i;
    public final String j;
    public final jbg k;

    public me1(a4c a4c, EGLContext eGLContext, int[] iArr, om8 om8, String str) {
        a4c a4c2 = a4c;
        this.a = a4c2;
        this.b = om8;
        HandlerThread handlerThread = new HandlerThread((str == null ? "VoipGLRenderer" : str).concat("Thread"));
        this.c = handlerThread;
        this.g = EGL14.EGL_NO_SURFACE;
        Object obj = new Object();
        this.h = obj;
        String str2 = str == null ? "CallOpenGL" : str;
        this.j = str2;
        handlerThread.start();
        jbg jbg = new jbg(handlerThread.getLooper(), a4c2, str2.concat("_timings"), new om8(1, this, me1.class, "processError", "processError(Ljava/lang/Throwable;)V", 0, 24));
        this.k = jbg;
        a4c2.log(str2, "OpenGL context initialization requested");
        synchronized (obj) {
            if (this.i) {
                a4c2.log(str2, "OpenGL context is already initialized");
                return;
            }
            this.i = true;
            jbg.postAtFrontOfQueue(new f5((Object) this, (Object) iArr, (Object) eGLContext, 9));
            a4c2.log(str2, "OpenGL context initialization task submitted");
        }
    }

    public static void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new CallOpenGLContext$CallOpenGLContextGLException(eglGetError, str);
        }
    }

    public final void b(EGLSurface eGLSurface) {
        if (eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGLContext eGLContext = this.d;
            if (eGLContext != null) {
                EGLDisplay eGLDisplay = this.e;
                if (eGLDisplay == null) {
                    throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
                } else if (tpa.f(EGL14.eglGetCurrentContext(), this.d) && tpa.f(this.g, eGLSurface)) {
                } else {
                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
                        this.g = eGLSurface;
                        return;
                    }
                    throw new CallOpenGLContext$CallOpenGLContextGLException(EGL14.eglGetError(), "makeCurrent()");
                }
            } else {
                throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
            }
        } else {
            throw new RuntimeException("Wrong surface in makeCurrent()");
        }
    }

    public final boolean c(m56 m56) {
        try {
            return this.k.post(new le1(m56, this, 0));
        } catch (IllegalStateException e2) {
            this.a.reportException(this.j, "OpenGL tread died, is it fine?", e2);
            return false;
        }
    }

    public final boolean d(m56 m56) {
        try {
            return this.k.postAtFrontOfQueue(new le1(m56, this, 1));
        } catch (IllegalStateException e2) {
            this.a.reportException(this.j, "OpenGL tread died, is it fine?", e2);
            return false;
        }
    }

    public final void e(EGLSurface eGLSurface) {
        if (eGLSurface != null && eGLSurface != EGL14.EGL_NO_SURFACE) {
            EGLDisplay eGLDisplay = this.e;
            if (eGLDisplay != null) {
                EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                int decrementAndGet = l.decrementAndGet();
                this.a.log(this.j, "Surface destroyed, total count is " + decrementAndGet);
                return;
            }
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
    }
}
