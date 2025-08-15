package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import one.me.sdk.gl.effects.VideoMessageStencilHolder;
import one.me.sdk.gl.effects.objects.FrameBuffer;
import one.me.sdk.gl.effects.objects.OesToImage2dRenderer;
import one.me.sdk.gl.effects.objects.TrivialFragmentShader;

/* renamed from: fjf  reason: default package */
public final class fjf extends zm4 {
    public final Size o;
    public final String p;
    public b2e q;
    public OesToImage2dRenderer r;
    public TrivialFragmentShader s;
    public final float[] t = new float[16];
    public long u;
    public int v = -1;
    public m56 w;

    public fjf(Size size, eu4 eu4) {
        this.o = size;
        String name = fjf.class.getName();
        this.p = name;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, name, "init, previewSize=" + size + ", dynamicRange=" + eu4, (Throwable) null);
        }
        n(eu4, Collections.emptyMap());
    }

    public final void q() {
        hm9.m0(this.p, "release", new Object[0]);
        TrivialFragmentShader trivialFragmentShader = this.s;
        if (trivialFragmentShader != null) {
            trivialFragmentShader.release();
        }
        this.s = null;
        OesToImage2dRenderer oesToImage2dRenderer = this.r;
        if (oesToImage2dRenderer != null) {
            oesToImage2dRenderer.release();
        }
        this.r = null;
        b2e b2e = this.q;
        if (b2e != null) {
            hm9.m0(b2e.d, "release", new Object[0]);
            b2e.e.release();
            b2e.f.release();
        }
        this.q = null;
        this.w = null;
        super.q();
    }

    public final void w(SurfaceTexture surfaceTexture, Surface surface, float[] fArr, boolean z) {
        TrivialFragmentShader trivialFragmentShader;
        FrameBuffer frameBuffer;
        m56 m56;
        Surface surface2 = surface;
        float[] fArr2 = fArr;
        db0 l = l(surface2);
        if (l.equals(o76.j)) {
            l = h(surface2);
            if (l != null) {
                ((HashMap) this.d).put(surface2, l);
            } else {
                return;
            }
        }
        db0 db0 = l;
        o76.d((AtomicBoolean) this.c, true);
        o76.c((Thread) this.e);
        int i = this.b;
        long timestamp = surfaceTexture.getTimestamp();
        b2e b2e = this.q;
        if (b2e == null) {
            b2e = new b2e(this.o);
            this.q = b2e;
        }
        b2e b2e2 = b2e;
        OesToImage2dRenderer oesToImage2dRenderer = this.r;
        if (oesToImage2dRenderer == null) {
            oesToImage2dRenderer = new OesToImage2dRenderer();
            this.r = oesToImage2dRenderer;
        }
        TrivialFragmentShader trivialFragmentShader2 = this.s;
        if (trivialFragmentShader2 == null) {
            trivialFragmentShader2 = new TrivialFragmentShader(0, false);
            this.s = trivialFragmentShader2;
        }
        TrivialFragmentShader trivialFragmentShader3 = trivialFragmentShader2;
        int i2 = (timestamp > this.u ? 1 : (timestamp == this.u ? 0 : -1));
        FrameBuffer frameBuffer2 = b2e2.f;
        float[] fArr3 = this.t;
        if (i2 == 0 && i == this.v && Arrays.equals(fArr2, fArr3)) {
            frameBuffer = frameBuffer2;
            trivialFragmentShader = trivialFragmentShader3;
        } else {
            frameBuffer2.bind();
            GLES20.glViewport(0, 0, b2e2.b, b2e2.c);
            frameBuffer = frameBuffer2;
            trivialFragmentShader = trivialFragmentShader3;
            OesToImage2dRenderer.render$default(oesToImage2dRenderer, i, fArr, (float[]) null, 4, (Object) null);
            frameBuffer.unbind();
            System.arraycopy(fArr2, 0, fArr3, 0, fArr2.length);
            this.u = timestamp;
            this.v = i;
        }
        int textureId = frameBuffer.getTextureId();
        Size size = b2e2.a;
        int width = size.getWidth();
        int height = size.getHeight();
        VideoMessageStencilHolder videoMessageStencilHolder = b2e2.e;
        int i3 = db0.b;
        int i4 = db0.c;
        videoMessageStencilHolder.render(textureId, width, height, i3, i4, !z, false);
        boolean f = tpa.f((Surface) this.k, surface2);
        EGLSurface eGLSurface = db0.a;
        if (!f) {
            o(eGLSurface);
            this.k = surface2;
        }
        GLES20.glViewport(0, 0, i3, i4);
        TrivialFragmentShader trivialFragmentShader4 = trivialFragmentShader;
        trivialFragmentShader4.setTextureId(frameBuffer.getTextureId());
        trivialFragmentShader4.render();
        if (this.w != null) {
            int textureId2 = frameBuffer.getTextureId();
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i3 * i4 * 4);
            GLES20.glViewport(0, 0, i3, i4);
            float[] fArr4 = new float[16];
            Matrix.setIdentityM(fArr4, 0);
            Matrix.scaleM(fArr4, 0, 1.0f, -1.0f, 1.0f);
            FrameBuffer frameBuffer3 = new FrameBuffer(i3, i4);
            TrivialFragmentShader trivialFragmentShader5 = new TrivialFragmentShader(0, false);
            trivialFragmentShader5.setTextureId(textureId2);
            trivialFragmentShader5.setMVPMat(fArr4);
            frameBuffer3.bind();
            trivialFragmentShader5.render();
            GLES20.glReadPixels(0, 0, i3, i4, 6408, 5121, allocateDirect);
            frameBuffer3.unbind();
            Bitmap createBitmap = Bitmap.createBitmap(i3, i4, Bitmap.Config.ARGB_8888);
            ImageProcessingUtil.e(createBitmap, allocateDirect, i3 * 4);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                createBitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                if (!(byteArray == null || (m56 = this.w) == null)) {
                    m56.invoke(byteArray);
                }
                this.w = null;
            } finally {
                createBitmap.recycle();
                byteArrayOutputStream.close();
                frameBuffer3.release();
                trivialFragmentShader5.release();
            }
        }
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, timestamp);
        if (!EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            int eglGetError = EGL14.eglGetError();
            nd7.e(16);
            hm9.p(this.p, wg0.i("failed to swap buffers, error=0x", pag.N(16, ((long) eglGetError) & 4294967295L)), (Throwable) null);
            s(surface2, false);
        }
    }
}
