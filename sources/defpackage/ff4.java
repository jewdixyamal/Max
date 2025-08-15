package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil$GlException;

/* renamed from: ff4  reason: default package */
public final /* synthetic */ class ff4 implements xff {
    public final /* synthetic */ int a;
    public final /* synthetic */ kf4 b;

    public /* synthetic */ ff4(kf4 kf4, int i) {
        this.a = i;
        this.b = kf4;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                kf4 kf4 = this.b;
                kf4.getClass();
                EGLDisplay A = mr0.A();
                kf4.m = A;
                int[] iArr = mr0.g;
                va8 va8 = kf4.c;
                kf4.n = va8.u(va8.r(A, 2, iArr), kf4.m);
                return;
            case 1:
                kf4 kf42 = this.b;
                va8 va82 = kf42.c;
                try {
                    bkb bkb = kf42.e;
                    bkb.getClass();
                    try {
                        cd6 cd6 = (cd6) bkb.c;
                        if (cd6 != null) {
                            GLES20.glDeleteProgram(cd6.a);
                            mr0.f();
                        }
                    } catch (GlUtil$GlException e) {
                        z04.v("Error releasing GL Program", e);
                    }
                    kf42.i.d();
                    EGLDisplay eGLDisplay = kf42.m;
                    EGLSurface eGLSurface = kf42.n;
                    if (eGLDisplay != null) {
                        if (eGLSurface != null) {
                            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
                            mr0.e("Error destroying surface");
                        }
                    }
                    try {
                        EGLDisplay eGLDisplay2 = kf42.m;
                        eGLDisplay2.getClass();
                        va82.C(eGLDisplay2);
                        return;
                    } catch (GlUtil$GlException e2) {
                        z04.v("Error releasing GL objects", e2);
                        return;
                    }
                } catch (GlUtil$GlException e3) {
                    z04.v("Error releasing GL resources", e3);
                    EGLDisplay eGLDisplay3 = kf42.m;
                    eGLDisplay3.getClass();
                    va82.C(eGLDisplay3);
                    return;
                } catch (Throwable th) {
                    try {
                        EGLDisplay eGLDisplay4 = kf42.m;
                        eGLDisplay4.getClass();
                        va82.C(eGLDisplay4);
                    } catch (GlUtil$GlException e4) {
                        z04.v("Error releasing GL objects", e4);
                    }
                    throw th;
                }
            default:
                this.b.b();
                return;
        }
    }
}
