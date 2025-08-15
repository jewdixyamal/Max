package defpackage;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;

/* renamed from: c0  reason: default package */
public final class c0 extends rd7 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c0() {
        super(1);
        this.a = 7;
        this.b = h8.b;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return obj == ((x1) this.b) ? "(this Collection)" : String.valueOf(obj);
            case 1:
                ((ArrayList) this.b).add((String) obj);
                return e5f.a;
            case 2:
                Throwable th = (Throwable) obj;
                j87 j87 = (j87) this.b;
                if (th == null) {
                    if (!j87.a.isDone()) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else if (th instanceof CancellationException) {
                    j87.a.cancel(true);
                } else {
                    dcd dcd = j87.a;
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        th = cause;
                    }
                    dcd.k(th);
                }
                return e5f.a;
            case 3:
                return obj == ((li9) this.b) ? "(this)" : String.valueOf(obj);
            case 4:
                k9b k9b = k9b.f;
                k9b.d = (ay1) obj;
                lz7.n((Context) this.b);
                return k9b;
            case 5:
                Void voidR = (Void) obj;
                return ((ay1) this.b).j;
            case 6:
                return obj == ((ri9) this.b) ? "(this)" : String.valueOf(obj);
            case 7:
                return ((k56) this.b).invoke();
            case 8:
                ((m56) this.b).invoke(obj);
                return obj;
            case 9:
                j37 j37 = (j37) obj;
                return ((CharSequence) this.b).subSequence(j37.a, j37.b + 1).toString();
            default:
                me1 me1 = (me1) obj;
                EGLSurface eGLSurface = ((cp1) this.b).a;
                if (!(eGLSurface == null || eGLSurface == EGL14.EGL_NO_SURFACE)) {
                    EGLDisplay eGLDisplay = me1.e;
                    if (eGLDisplay != null) {
                        me1.b(eGLSurface);
                        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                        GLES20.glClear(16384);
                        EGL14.eglSwapBuffers(eGLDisplay, eGLSurface);
                        me1.a("clearImage()");
                    } else {
                        throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
                    }
                }
                return e5f.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i, Object obj) {
        super(1);
        this.a = i;
        this.b = obj;
    }
}
