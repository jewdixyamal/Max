package defpackage;

import android.graphics.Matrix;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.webrtc.EglBase;
import org.webrtc.EglBase14;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.ThreadUtils;
import org.webrtc.VideoFrame;
import org.webrtc.VideoFrameDrawer;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.webrtc.opengl.CallOpenGLContext$CallOpenGLContextNotInitialized;

/* renamed from: oe1  reason: default package */
public final class oe1 {
    public final a4c a;
    public final EglBase.Context b;
    public final re c;
    public final String d;
    public final me1 e;
    public final Matrix f = new Matrix();
    public final VideoFrameDrawer g = new VideoFrameDrawer();
    public final GlRectDrawer h = new GlRectDrawer();
    public final ArrayList i = new ArrayList();

    public oe1(a4c a4c, EglBase.Context context, int[] iArr, String str) {
        EglBase.Context context2 = context;
        this.a = a4c;
        this.b = context2;
        this.d = wg0.i("CallOpenGL_renderer_", str);
        me1 me1 = new me1(a4c, ((EglBase14.Context) context2).getRawContext(), iArr, new om8(1, this, oe1.class, "onReleaseContext", "onReleaseContext(Lru/ok/android/webrtc/opengl/CallOpenGLContext;)V", 0, 29), str);
        this.e = me1;
        re reVar = new re(7, this);
        try {
            me1.k.postDelayed(reVar, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        } catch (IllegalStateException e2) {
            me1.a.reportException(me1.j, "OpenGL tread died, is it fine?", e2);
        }
        this.c = reVar;
    }

    public final void a() {
        me1 me1 = this.e;
        me1.a.log(me1.j, "Release requested");
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (me1.h) {
            if (!me1.i) {
                me1.a.log(me1.j, "Already released, ignore");
                countDownLatch.countDown();
            } else {
                me1.i = false;
                me1.k.postAtFrontOfQueue(new c(me1, 15, countDownLatch));
                me1.a.log(me1.j, "Release action submitted");
            }
        }
        ThreadUtils.awaitUninterruptibly(countDownLatch);
    }

    public final void b(me1 me1, cp1 cp1, VideoFrame videoFrame, sh1 sh1) {
        me1 me12 = me1;
        cp1 cp12 = cp1;
        sh1 sh12 = sh1;
        EGLSurface eGLSurface = cp12.a;
        if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            long nanoTime = System.nanoTime();
            me12.b(eGLSurface);
            me1.a("makeCurrent()");
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            GLES20.glClear(16384);
            Matrix matrix = this.f;
            matrix.reset();
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preScale(sh12.c ? -1.0f : 1.0f, 1.0f);
            matrix.preScale(sh12.a, sh12.b);
            matrix.preTranslate(-0.5f, -0.5f);
            RendererCommon.GlDrawer glDrawer = cp12.k;
            if (glDrawer == null) {
                glDrawer = this.h;
            }
            RendererCommon.GlDrawer glDrawer2 = glDrawer;
            EGLDisplay eGLDisplay = me12.e;
            if (eGLDisplay != null) {
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(eGLDisplay, eGLSurface, 12375, iArr, 0);
                int i2 = iArr[0];
                EGLDisplay eGLDisplay2 = me12.e;
                if (eGLDisplay2 != null) {
                    int[] iArr2 = new int[1];
                    EGL14.eglQuerySurface(eGLDisplay2, eGLSurface, 12374, iArr2, 0);
                    this.g.drawFrame(videoFrame, glDrawer2, matrix, 0, 0, i2, iArr2[0]);
                    me1.a("drawFrame()");
                    long nanoTime2 = System.nanoTime();
                    EGLDisplay eGLDisplay3 = me12.e;
                    if (eGLDisplay3 != null) {
                        EGL14.eglSwapBuffers(eGLDisplay3, eGLSurface);
                        me1.a("swapBuffers()");
                        long nanoTime3 = System.nanoTime();
                        dp1 dp1 = cp12.l;
                        dp1.h += nanoTime3 - nanoTime;
                        dp1.i += nanoTime3 - nanoTime2;
                        me1.a("swapBuffers()");
                        return;
                    }
                    throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
                }
                throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
            }
            throw new CallOpenGLContext$CallOpenGLContextNotInitialized();
        }
    }
}
