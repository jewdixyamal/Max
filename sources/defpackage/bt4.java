package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.common.util.GlUtil$GlException;

/* renamed from: bt4  reason: default package */
public final class bt4 extends HandlerThread implements Handler.Callback {
    public Object X;
    public Surface Y;
    public final /* synthetic */ int a;
    public Handler b;
    public Error c;
    public RuntimeException o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bt4(String str, int i) {
        super(str);
        this.a = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r34) {
        /*
            r33 = this;
            r0 = r33
            r1 = r34
            java.lang.String r2 = "eglMakeCurrent failed"
            java.lang.String r3 = "eglCreatePbufferSurface failed"
            java.lang.String r8 = "eglCreateContext failed"
            r9 = 12440(0x3098, float:1.7432E-41)
            r11 = 3
            java.lang.String r15 = "eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s"
            java.lang.String r4 = "eglInitialize failed"
            r7 = 2
            java.lang.String r6 = "eglGetDisplay failed"
            r5 = 1
            r14 = 0
            int r13 = r0.a
            switch(r13) {
                case 0: goto L_0x0132;
                default: goto L_0x001b;
            }
        L_0x001b:
            java.lang.Object r13 = r0.X
            mu4 r13 = (defpackage.mu4) r13
            r13.getClass()
            java.lang.Object r13 = r0.X
            mu4 r13 = (defpackage.mu4) r13
            r13.getClass()
            android.opengl.EGLDisplay r12 = android.opengl.EGL14.eglGetDisplay(r14)
            if (r12 == 0) goto L_0x0031
            r10 = r5
            goto L_0x0032
        L_0x0031:
            r10 = r14
        L_0x0032:
            defpackage.mr0.g(r6, r10)
            int[] r6 = new int[r7]
            boolean r6 = android.opengl.EGL14.eglInitialize(r12, r6, r14, r6, r5)
            defpackage.mr0.g(r4, r6)
            r13.o = r12
            android.opengl.EGLConfig[] r4 = new android.opengl.EGLConfig[r5]
            int[] r6 = new int[r5]
            int[] r18 = defpackage.mu4.t0
            r19 = 0
            r21 = 0
            r22 = 1
            r24 = 0
            r17 = r12
            r20 = r4
            r23 = r6
            boolean r10 = android.opengl.EGL14.eglChooseConfig(r17, r18, r19, r20, r21, r22, r23, r24)
            if (r10 == 0) goto L_0x0064
            r12 = r6[r14]
            if (r12 <= 0) goto L_0x0064
            r12 = r4[r14]
            if (r12 == 0) goto L_0x0064
            r12 = r5
            goto L_0x0065
        L_0x0064:
            r12 = r14
        L_0x0065:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            r6 = r6[r14]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5 = r4[r14]
            java.lang.Object[] r5 = new java.lang.Object[]{r10, r6, r5}
            int r6 = defpackage.oaf.a
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r5 = java.lang.String.format(r6, r15, r5)
            defpackage.mr0.g(r5, r12)
            r4 = r4[r14]
            android.opengl.EGLDisplay r5 = r13.o
            if (r1 != 0) goto L_0x0092
            int[] r6 = new int[r11]
            r6[r14] = r9
            r10 = 1
            r6[r10] = r7
            r12 = 12344(0x3038, float:1.7298E-41)
            r6[r7] = r12
            goto L_0x00a6
        L_0x0092:
            r6 = 5
            r10 = 1
            r12 = 12344(0x3038, float:1.7298E-41)
            int[] r15 = new int[r6]
            r15[r14] = r9
            r15[r10] = r7
            r6 = 12992(0x32c0, float:1.8206E-41)
            r15[r7] = r6
            r15[r11] = r10
            r6 = 4
            r15[r6] = r12
            r6 = r15
        L_0x00a6:
            android.opengl.EGLContext r9 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGLContext r5 = android.opengl.EGL14.eglCreateContext(r5, r4, r9, r6, r14)
            if (r5 == 0) goto L_0x00b0
            r6 = 1
            goto L_0x00b1
        L_0x00b0:
            r6 = r14
        L_0x00b1:
            defpackage.mr0.g(r8, r6)
            r13.X = r5
            android.opengl.EGLDisplay r6 = r13.o
            r8 = 1
            if (r1 != r8) goto L_0x00be
            android.opengl.EGLSurface r3 = android.opengl.EGL14.EGL_NO_SURFACE
            goto L_0x00fe
        L_0x00be:
            if (r1 != r7) goto L_0x00dd
            r9 = 7
            int[] r9 = new int[r9]
            r10 = 12375(0x3057, float:1.7341E-41)
            r9[r14] = r10
            r9[r8] = r8
            r12 = 12374(0x3056, float:1.734E-41)
            r9[r7] = r12
            r9[r11] = r8
            r7 = 12992(0x32c0, float:1.8206E-41)
            r15 = 4
            r9[r15] = r7
            r7 = 5
            r9[r7] = r8
            r7 = 6
            r16 = 12344(0x3038, float:1.7298E-41)
            r9[r7] = r16
            goto L_0x00f1
        L_0x00dd:
            r9 = 5
            r10 = 12375(0x3057, float:1.7341E-41)
            r12 = 12374(0x3056, float:1.734E-41)
            r15 = 4
            r16 = 12344(0x3038, float:1.7298E-41)
            int[] r9 = new int[r9]
            r9[r14] = r10
            r9[r8] = r8
            r9[r7] = r12
            r9[r11] = r8
            r9[r15] = r16
        L_0x00f1:
            android.opengl.EGLSurface r4 = android.opengl.EGL14.eglCreatePbufferSurface(r6, r4, r9, r14)
            if (r4 == 0) goto L_0x00f9
            r7 = 1
            goto L_0x00fa
        L_0x00f9:
            r7 = r14
        L_0x00fa:
            defpackage.mr0.g(r3, r7)
            r3 = r4
        L_0x00fe:
            boolean r4 = android.opengl.EGL14.eglMakeCurrent(r6, r3, r3, r5)
            defpackage.mr0.g(r2, r4)
            r13.Y = r3
            int[] r2 = r13.c
            r3 = 1
            android.opengl.GLES20.glGenTextures(r3, r2, r14)
            defpackage.mr0.f()
            android.graphics.SurfaceTexture r3 = new android.graphics.SurfaceTexture
            r2 = r2[r14]
            r3.<init>(r2)
            r13.Z = r3
            r3.setOnFrameAvailableListener(r13)
            o2b r2 = new o2b
            java.lang.Object r3 = r0.X
            mu4 r3 = (defpackage.mu4) r3
            android.graphics.SurfaceTexture r3 = r3.Z
            r3.getClass()
            if (r1 == 0) goto L_0x012b
            r5 = 1
            goto L_0x012c
        L_0x012b:
            r5 = r14
        L_0x012c:
            r2.<init>(r0, r3, r5)
            r0.Y = r2
            return
        L_0x0132:
            java.lang.Object r5 = r0.X
            mu4 r5 = (defpackage.mu4) r5
            r5.getClass()
            java.lang.Object r5 = r0.X
            mu4 r5 = (defpackage.mu4) r5
            r5.getClass()
            android.opengl.EGLDisplay r10 = android.opengl.EGL14.eglGetDisplay(r14)
            if (r10 == 0) goto L_0x024a
            int[] r6 = new int[r7]
            r12 = 1
            boolean r6 = android.opengl.EGL14.eglInitialize(r10, r6, r14, r6, r12)
            if (r6 == 0) goto L_0x0244
            r5.o = r10
            android.opengl.EGLConfig[] r4 = new android.opengl.EGLConfig[r12]
            int[] r6 = new int[r12]
            int[] r26 = defpackage.mu4.s0
            r27 = 0
            r29 = 0
            r30 = 1
            r32 = 0
            r25 = r10
            r28 = r4
            r31 = r6
            boolean r10 = android.opengl.EGL14.eglChooseConfig(r25, r26, r27, r28, r29, r30, r31, r32)
            if (r10 == 0) goto L_0x0226
            r12 = r6[r14]
            if (r12 <= 0) goto L_0x0226
            r12 = r4[r14]
            if (r12 == 0) goto L_0x0226
            android.opengl.EGLDisplay r4 = r5.o
            if (r1 != 0) goto L_0x0183
            int[] r6 = new int[r11]
            r6[r14] = r9
            r10 = 1
            r6[r10] = r7
            r13 = 12344(0x3038, float:1.7298E-41)
            r6[r7] = r13
            goto L_0x0197
        L_0x0183:
            r6 = 5
            r10 = 1
            r13 = 12344(0x3038, float:1.7298E-41)
            int[] r15 = new int[r6]
            r15[r14] = r9
            r15[r10] = r7
            r6 = 12992(0x32c0, float:1.8206E-41)
            r15[r7] = r6
            r15[r11] = r10
            r6 = 4
            r15[r6] = r13
            r6 = r15
        L_0x0197:
            android.opengl.EGLContext r9 = android.opengl.EGL14.EGL_NO_CONTEXT
            android.opengl.EGLContext r4 = android.opengl.EGL14.eglCreateContext(r4, r12, r9, r6, r14)
            if (r4 == 0) goto L_0x0220
            r5.X = r4
            android.opengl.EGLDisplay r6 = r5.o
            if (r1 != r10) goto L_0x01a8
            android.opengl.EGLSurface r3 = android.opengl.EGL14.EGL_NO_SURFACE
            goto L_0x01e2
        L_0x01a8:
            if (r1 != r7) goto L_0x01c7
            r8 = 7
            int[] r8 = new int[r8]
            r9 = 12375(0x3057, float:1.7341E-41)
            r8[r14] = r9
            r8[r10] = r10
            r13 = 12374(0x3056, float:1.734E-41)
            r8[r7] = r13
            r8[r11] = r10
            r7 = 12992(0x32c0, float:1.8206E-41)
            r15 = 4
            r8[r15] = r7
            r7 = 5
            r8[r7] = r10
            r7 = 6
            r16 = 12344(0x3038, float:1.7298E-41)
            r8[r7] = r16
            goto L_0x01db
        L_0x01c7:
            r8 = 5
            r9 = 12375(0x3057, float:1.7341E-41)
            r13 = 12374(0x3056, float:1.734E-41)
            r15 = 4
            r16 = 12344(0x3038, float:1.7298E-41)
            int[] r8 = new int[r8]
            r8[r14] = r9
            r8[r10] = r10
            r8[r7] = r13
            r8[r11] = r10
            r8[r15] = r16
        L_0x01db:
            android.opengl.EGLSurface r7 = android.opengl.EGL14.eglCreatePbufferSurface(r6, r12, r8, r14)
            if (r7 == 0) goto L_0x021a
            r3 = r7
        L_0x01e2:
            boolean r4 = android.opengl.EGL14.eglMakeCurrent(r6, r3, r3, r4)
            if (r4 == 0) goto L_0x0214
            r5.Y = r3
            int[] r2 = r5.c
            android.opengl.GLES20.glGenTextures(r10, r2, r14)
            defpackage.wmd.h()
            android.graphics.SurfaceTexture r3 = new android.graphics.SurfaceTexture
            r2 = r2[r14]
            r3.<init>(r2)
            r5.Z = r3
            r3.setOnFrameAvailableListener(r5)
            ct4 r2 = new ct4
            java.lang.Object r3 = r0.X
            mu4 r3 = (defpackage.mu4) r3
            android.graphics.SurfaceTexture r3 = r3.Z
            r3.getClass()
            if (r1 == 0) goto L_0x020d
            r5 = r10
            goto L_0x020e
        L_0x020d:
            r5 = r14
        L_0x020e:
            r2.<init>(r0, r3, r5)
            r0.Y = r2
            return
        L_0x0214:
            com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException r0 = new com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException
            r0.<init>(r2)
            throw r0
        L_0x021a:
            com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException r0 = new com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException
            r0.<init>(r3)
            throw r0
        L_0x0220:
            com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException r0 = new com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException
            r0.<init>(r8)
            throw r0
        L_0x0226:
            com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException r0 = new com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)
            r2 = r6[r14]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = r4[r14]
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r2, r3}
            int r2 = defpackage.maf.a
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = java.lang.String.format(r2, r15, r1)
            r0.<init>(r1)
            throw r0
        L_0x0244:
            com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException r0 = new com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException
            r0.<init>(r4)
            throw r0
        L_0x024a:
            com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException r0 = new com.google.android.exoplayer2.util.EGLSurfaceTexture$GlException
            r0.<init>(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt4.a(int):void");
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((mu4) this.X).getClass();
                mu4 mu4 = (mu4) this.X;
                mu4.b.removeCallbacks(mu4);
                try {
                    SurfaceTexture surfaceTexture = mu4.Z;
                    if (surfaceTexture != null) {
                        surfaceTexture.release();
                        GLES20.glDeleteTextures(1, mu4.c, 0);
                    }
                    return;
                } finally {
                    EGLDisplay eGLDisplay = mu4.o;
                    if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGLDisplay eGLDisplay2 = mu4.o;
                        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    }
                    EGLSurface eGLSurface2 = mu4.Y;
                    if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(mu4.o, mu4.Y);
                    }
                    EGLContext eGLContext = mu4.X;
                    if (eGLContext != null) {
                        EGL14.eglDestroyContext(mu4.o, eGLContext);
                    }
                    if (maf.a >= 19) {
                        EGL14.eglReleaseThread();
                    }
                    EGLDisplay eGLDisplay3 = mu4.o;
                    if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(mu4.o);
                    }
                    mu4.o = null;
                    mu4.X = null;
                    mu4.Y = null;
                    mu4.Z = null;
                }
            default:
                ((mu4) this.X).getClass();
                mu4 mu42 = (mu4) this.X;
                mu42.b.removeCallbacks(mu42);
                try {
                    SurfaceTexture surfaceTexture2 = mu42.Z;
                    if (surfaceTexture2 != null) {
                        surfaceTexture2.release();
                        GLES20.glDeleteTextures(1, mu42.c, 0);
                    }
                    return;
                } finally {
                    EGLDisplay eGLDisplay4 = mu42.o;
                    if (eGLDisplay4 != null && !eGLDisplay4.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGLDisplay eGLDisplay5 = mu42.o;
                        EGLSurface eGLSurface3 = EGL14.EGL_NO_SURFACE;
                        EGL14.eglMakeCurrent(eGLDisplay5, eGLSurface3, eGLSurface3, EGL14.EGL_NO_CONTEXT);
                    }
                    EGLSurface eGLSurface4 = mu42.Y;
                    if (eGLSurface4 != null && !eGLSurface4.equals(EGL14.EGL_NO_SURFACE)) {
                        EGL14.eglDestroySurface(mu42.o, mu42.Y);
                    }
                    EGLContext eGLContext2 = mu42.X;
                    if (eGLContext2 != null) {
                        EGL14.eglDestroyContext(mu42.o, eGLContext2);
                    }
                    EGL14.eglReleaseThread();
                    EGLDisplay eGLDisplay6 = mu42.o;
                    if (eGLDisplay6 != null && !eGLDisplay6.equals(EGL14.EGL_NO_DISPLAY)) {
                        EGL14.eglTerminate(mu42.o);
                    }
                    mu42.o = null;
                    mu42.X = null;
                    mu42.Y = null;
                    mu42.Z = null;
                }
        }
    }

    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i == 1) {
                    try {
                        a(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e) {
                        fm9.c("Failed to initialize dummy surface", e);
                        this.o = e;
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e2) {
                        try {
                            fm9.c("Failed to initialize dummy surface", e2);
                            this.c = e2;
                            synchronized (this) {
                                notify();
                            }
                        } catch (Throwable th) {
                            synchronized (this) {
                                notify();
                                throw th;
                            }
                        }
                    }
                } else if (i == 2) {
                    try {
                        b();
                    } catch (Throwable th2) {
                        quit();
                        throw th2;
                    }
                    quit();
                }
                return true;
            default:
                int i2 = message.what;
                if (i2 == 1) {
                    try {
                        a(message.arg1);
                        synchronized (this) {
                            notify();
                        }
                    } catch (RuntimeException e3) {
                        z04.v("Failed to initialize placeholder surface", e3);
                        this.o = e3;
                        synchronized (this) {
                            notify();
                        }
                    } catch (GlUtil$GlException e4) {
                        z04.v("Failed to initialize placeholder surface", e4);
                        this.o = new IllegalStateException(e4);
                        synchronized (this) {
                            notify();
                        }
                    } catch (Error e5) {
                        try {
                            z04.v("Failed to initialize placeholder surface", e5);
                            this.c = e5;
                            synchronized (this) {
                                notify();
                            }
                        } catch (Throwable th3) {
                            synchronized (this) {
                                notify();
                                throw th3;
                            }
                        }
                    }
                } else if (i2 == 2) {
                    try {
                        b();
                    } catch (Throwable th4) {
                        quit();
                        throw th4;
                    }
                    quit();
                }
                return true;
        }
    }
}
