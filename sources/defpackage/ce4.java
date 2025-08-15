package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ce4  reason: default package */
public final class ce4 implements lee, SurfaceTexture.OnFrameAvailableListener {
    public final AtomicBoolean X = new AtomicBoolean(false);
    public final float[] Y = new float[16];
    public final float[] Z = new float[16];
    public final zm4 a;
    public final HandlerThread b;
    public final zh6 c;
    public final Handler o;
    public final LinkedHashMap s0 = new LinkedHashMap();
    public int t0 = 0;
    public boolean u0 = false;
    public final ArrayList v0 = new ArrayList();

    public ce4(eu4 eu4) {
        Map emptyMap = Collections.emptyMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.o = handler;
        this.c = new zh6(handler);
        this.a = new zm4();
        try {
            f8.g(new u00((Object) this, (Object) eu4, (Object) emptyMap, 5)).get();
        } catch (InterruptedException | ExecutionException e) {
            e = e;
            e = e instanceof ExecutionException ? e.getCause() : e;
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
        } catch (RuntimeException e2) {
            release();
            throw e2;
        }
    }

    public final void a(see see) {
        if (this.X.get()) {
            see.d();
        } else {
            e(new wt1(this, 25, see), new ae4(see, 0));
        }
    }

    public final bm7 b(int i, int i2) {
        return kq0.w(f8.g(new a74(i, i2, this)));
    }

    public final void c(kee kee) {
        if (this.X.get()) {
            kee.close();
            return;
        }
        wt1 wt1 = new wt1(this, 24, kee);
        Objects.requireNonNull(kee);
        e(wt1, new dd4(1, kee));
    }

    public final void d() {
        if (this.u0 && this.t0 == 0) {
            LinkedHashMap linkedHashMap = this.s0;
            for (kee close : linkedHashMap.keySet()) {
                close.close();
            }
            Iterator it = this.v0.iterator();
            while (it.hasNext()) {
                ((ca0) it.next()).c.d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            this.a.q();
            this.b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new f5((Object) this, (Object) runnable2, (Object) runnable, 19));
        } catch (RejectedExecutionException unused) {
            runnable2.run();
        }
    }

    public final void f(Exception exc) {
        ArrayList arrayList = this.v0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((ca0) it.next()).c.d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap g(Size size, float[] fArr, int i) {
        int i2 = i;
        float[] fArr2 = (float[]) fArr.clone();
        a14.F(fArr2, (float) i2);
        a14.G(fArr2);
        Size g = e1f.g(size, i2);
        zm4 zm4 = this.a;
        zm4.getClass();
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(g.getHeight() * g.getWidth() * 4);
        c54.j("ByteBuffer capacity is not equal to width * height * 4.", allocateDirect.capacity() == (g.getHeight() * g.getWidth()) * 4);
        c54.j("ByteBuffer is not direct.", allocateDirect.isDirect());
        int[] iArr = o76.a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        o76.b("glGenTextures");
        int i3 = iArr2[0];
        GLES20.glActiveTexture(33985);
        o76.b("glActiveTexture");
        GLES20.glBindTexture(3553, i3);
        o76.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, g.getWidth(), g.getHeight(), 0, 6407, 5121, (Buffer) null);
        o76.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        o76.b("glGenFramebuffers");
        int i4 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i4);
        o76.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i3, 0);
        o76.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        o76.b("glActiveTexture");
        GLES20.glBindTexture(36197, zm4.b);
        o76.b("glBindTexture");
        zm4.k = null;
        GLES20.glViewport(0, 0, g.getWidth(), g.getHeight());
        GLES20.glScissor(0, 0, g.getWidth(), g.getHeight());
        m76 m76 = (m76) zm4.m;
        m76.getClass();
        if (m76 instanceof n76) {
            GLES20.glUniformMatrix4fv(((n76) m76).f, 1, false, fArr2, 0);
            o76.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        o76.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, g.getWidth(), g.getHeight(), 6408, 5121, allocateDirect);
        o76.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i3}, 0);
        o76.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i4}, 0);
        o76.b("glDeleteFramebuffers");
        int i5 = zm4.b;
        GLES20.glActiveTexture(33984);
        o76.b("glActiveTexture");
        GLES20.glBindTexture(36197, i5);
        o76.b("glBindTexture");
        Bitmap createBitmap = Bitmap.createBitmap(g.getWidth(), g.getHeight(), Bitmap.Config.ARGB_8888);
        allocateDirect.rewind();
        ImageProcessingUtil.e(createBitmap, allocateDirect, g.getWidth() * 4);
        return createBitmap;
    }

    public final void h(a3f a3f) {
        ByteArrayOutputStream byteArrayOutputStream;
        ArrayList arrayList = this.v0;
        if (!arrayList.isEmpty()) {
            if (a3f == null) {
                f(new Exception("Failed to snapshot: no JPEG Surface."));
                return;
            }
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                Iterator it = arrayList.iterator();
                int i = -1;
                int i2 = -1;
                Bitmap bitmap = null;
                byte[] bArr = null;
                while (it.hasNext()) {
                    ca0 ca0 = (ca0) it.next();
                    int i3 = ca0.b;
                    if (i != i3 || bitmap == null) {
                        if (bitmap != null) {
                            bitmap.recycle();
                        }
                        bitmap = g((Size) a3f.b, (float[]) a3f.c, i3);
                        i2 = -1;
                        i = i3;
                    }
                    int i4 = ca0.a;
                    if (i2 != i4) {
                        byteArrayOutputStream.reset();
                        bitmap.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                        bArr = byteArrayOutputStream.toByteArray();
                        i2 = i4;
                    }
                    Objects.requireNonNull(bArr);
                    ImageProcessingUtil.f(bArr, (Surface) a3f.a);
                    ca0.c.b((Object) null);
                    it.remove();
                }
                byteArrayOutputStream.close();
                return;
            } catch (IOException e) {
                f(e);
                return;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            return;
        }
        throw th;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (!this.X.get()) {
            surfaceTexture.updateTexImage();
            float[] fArr = this.Y;
            surfaceTexture.getTransformMatrix(fArr);
            a3f a3f = null;
            for (Map.Entry entry : this.s0.entrySet()) {
                Surface surface = (Surface) entry.getValue();
                kee kee = (kee) entry.getKey();
                float[] fArr2 = this.Z;
                kee.n(fArr2, fArr);
                int i = kee.c;
                if (i == 34) {
                    try {
                        this.a.t(surfaceTexture.getTimestamp(), fArr2, surface);
                    } catch (RuntimeException unused) {
                    }
                } else {
                    boolean z = true;
                    c54.p("Unsupported format: " + i, i == 256);
                    if (a3f != null) {
                        z = false;
                    }
                    c54.p("Only one JPEG output is supported.", z);
                    a3f = new a3f(surface, kee.o, (float[]) fArr2.clone());
                }
            }
            try {
                h(a3f);
            } catch (RuntimeException e) {
                f(e);
            }
        }
    }

    public final void release() {
        if (!this.X.getAndSet(true)) {
            e(new dd4(2, this), new kc(5));
        }
    }
}
