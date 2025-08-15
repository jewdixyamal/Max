package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;

/* renamed from: ct4  reason: default package */
public final class ct4 extends Surface {
    public static boolean X;
    public static int o;
    public final boolean a;
    public final bt4 b;
    public boolean c;

    public ct4(bt4 bt4, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = bt4;
        this.a = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        r5 = android.opengl.EGL14.eglQueryString(android.opengl.EGL14.eglGetDisplay(0), 12373);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(android.content.Context r5) {
        /*
            int r0 = defpackage.maf.a
            r1 = 24
            r2 = 0
            if (r0 >= r1) goto L_0x0008
            goto L_0x005f
        L_0x0008:
            r1 = 26
            if (r0 >= r1) goto L_0x0021
            java.lang.String r3 = "samsung"
            java.lang.String r4 = defpackage.maf.c
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x005f
            java.lang.String r3 = "XT1650"
            java.lang.String r4 = defpackage.maf.d
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0021
            goto L_0x005f
        L_0x0021:
            if (r0 >= r1) goto L_0x0030
            android.content.pm.PackageManager r5 = r5.getPackageManager()
            java.lang.String r1 = "android.hardware.vr.high_performance"
            boolean r5 = r5.hasSystemFeature(r1)
            if (r5 != 0) goto L_0x0030
            goto L_0x005f
        L_0x0030:
            android.opengl.EGLDisplay r5 = android.opengl.EGL14.eglGetDisplay(r2)
            r1 = 12373(0x3055, float:1.7338E-41)
            java.lang.String r5 = android.opengl.EGL14.eglQueryString(r5, r1)
            if (r5 == 0) goto L_0x005f
            java.lang.String r3 = "EGL_EXT_protected_content"
            boolean r5 = r5.contains(r3)
            if (r5 == 0) goto L_0x005f
            r5 = 17
            if (r0 >= r5) goto L_0x0049
            goto L_0x005d
        L_0x0049:
            android.opengl.EGLDisplay r5 = android.opengl.EGL14.eglGetDisplay(r2)
            java.lang.String r5 = android.opengl.EGL14.eglQueryString(r5, r1)
            if (r5 == 0) goto L_0x005d
            java.lang.String r0 = "EGL_KHR_surfaceless_context"
            boolean r5 = r5.contains(r0)
            if (r5 == 0) goto L_0x005d
            r5 = 1
            return r5
        L_0x005d:
            r5 = 2
            return r5
        L_0x005f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct4.a(android.content.Context):int");
    }

    public static synchronized boolean b(Context context) {
        boolean z;
        synchronized (ct4.class) {
            try {
                z = true;
                if (!X) {
                    o = a(context);
                    X = true;
                }
                if (o == 0) {
                    z = false;
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return z;
    }

    public static ct4 c(Context context, boolean z) {
        boolean z2 = false;
        np8.f(!z || b(context));
        bt4 bt4 = new bt4("ExoPlayer:DummySurface", 0);
        int i = z ? o : 0;
        bt4.start();
        Handler handler = new Handler(bt4.getLooper(), bt4);
        bt4.b = handler;
        bt4.X = new mu4(handler, 0);
        synchronized (bt4) {
            bt4.b.obtainMessage(1, i, 0).sendToTarget();
            while (((ct4) bt4.Y) == null && bt4.o == null && bt4.c == null) {
                try {
                    bt4.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = bt4.o;
        if (runtimeException == null) {
            Error error = bt4.c;
            if (error == null) {
                ct4 ct4 = (ct4) bt4.Y;
                ct4.getClass();
                return ct4;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    bt4 bt4 = this.b;
                    bt4.b.getClass();
                    bt4.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
