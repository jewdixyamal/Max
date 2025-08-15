package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ts4  reason: default package */
public final class ts4 extends zm4 {
    public int o = -1;
    public int p = -1;
    public final ge7 q;
    public final ge7 r;

    public ts4(ge7 ge7, ge7 ge72) {
        this.q = ge7;
        this.r = ge72;
    }

    public final na0 n(eu4 eu4, Map map) {
        na0 n = super.n(eu4, map);
        this.o = o76.g();
        this.p = o76.g();
        return n;
    }

    public final void q() {
        super.q();
        this.o = -1;
        this.p = -1;
    }

    public final void w(long j, Surface surface, kee kee, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        o76.d((AtomicBoolean) this.c, true);
        o76.c((Thread) this.e);
        db0 l = l(surface);
        if (l == o76.j) {
            l = h(surface);
            if (l != null) {
                ((HashMap) this.d).put(surface, l);
            } else {
                return;
            }
        }
        Surface surface2 = (Surface) this.k;
        EGLSurface eGLSurface = l.a;
        if (surface != surface2) {
            o(eGLSurface);
            this.k = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        db0 db0 = l;
        kee kee2 = kee;
        SurfaceTexture surfaceTexture3 = surfaceTexture;
        x(db0, kee2, surfaceTexture3, this.q, this.o);
        SurfaceTexture surfaceTexture4 = surfaceTexture2;
        x(db0, kee2, surfaceTexture4, this.r, this.p);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, j);
        if (!EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            Integer.toHexString(EGL14.eglGetError());
            s(surface, false);
        }
    }

    public final void x(db0 db0, kee kee, SurfaceTexture surfaceTexture, ge7 ge7, int i) {
        db0 db02 = db0;
        ge7 ge72 = ge7;
        v(i);
        int i2 = db02.b;
        int i3 = db02.c;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        kee.n(fArr2, fArr);
        m76 m76 = (m76) this.m;
        m76.getClass();
        if (m76 instanceof n76) {
            GLES20.glUniformMatrix4fv(((n76) m76).f, 1, false, fArr2, 0);
            o76.b("glUniformMatrix4fv");
        }
        float f = ge72.e;
        Size size = new Size((int) (((float) i2) * ge72.d), (int) (((float) i3) * f));
        Size size2 = new Size(i2, i3);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, ((float) size.getWidth()) / ((float) size2.getWidth()), ((float) size.getHeight()) / ((float) size2.getHeight()), 1.0f);
        Matrix.translateM(fArr4, 0, ge72.b / ge72.d, ge72.c / f, 0.0f);
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(m76.b, 1, false, fArr5, 0);
        o76.b("glUniformMatrix4fv");
        GLES20.glUniform1f(m76.c, ge72.a);
        o76.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        o76.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
