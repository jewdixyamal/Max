package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: rvd  reason: default package */
public final class rvd implements GLSurfaceView.Renderer, cna {
    public final float[] X;
    public final float[] Y;
    public float Z;
    public final xsc a;
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] o;
    public float s0;
    public final float[] t0;
    public final float[] u0;
    public final /* synthetic */ svd v0;

    public rvd(svd svd, xsc xsc) {
        this.v0 = svd;
        float[] fArr = new float[16];
        this.o = fArr;
        float[] fArr2 = new float[16];
        this.X = fArr2;
        float[] fArr3 = new float[16];
        this.Y = fArr3;
        this.t0 = new float[16];
        this.u0 = new float[16];
        this.a = xsc;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.s0 = 3.1415927f;
    }

    public final synchronized void a(float[] fArr, float f) {
        float[] fArr2 = this.o;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.s0 = f2;
        Matrix.setRotateM(this.X, 0, -this.Z, (float) Math.cos((double) f2), (float) Math.sin((double) this.s0), 0.0f);
    }

    /* JADX WARNING: type inference failed for: r4v12, types: [ty, java.lang.Object] */
    public final void onDrawFrame(GL10 gl10) {
        Object d;
        Object d2;
        Object d3;
        synchronized (this) {
            Matrix.multiplyMM(this.u0, 0, this.o, 0, this.Y, 0);
            Matrix.multiplyMM(this.t0, 0, this.X, 0, this.u0, 0);
        }
        Matrix.multiplyMM(this.c, 0, this.b, 0, this.t0, 0);
        xsc xsc = this.a;
        float[] fArr = this.c;
        xsc.getClass();
        GLES20.glClear(16384);
        wmd.h();
        if (xsc.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = xsc.u0;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            wmd.h();
            if (xsc.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(xsc.Z, 0);
            }
            long timestamp = xsc.u0.getTimestamp();
            due due = xsc.X;
            synchronized (due) {
                d = due.d(timestamp, false);
            }
            Long l = (Long) d;
            if (l != null) {
                w36 w36 = xsc.o;
                float[] fArr2 = xsc.Z;
                long longValue = l.longValue();
                due due2 = (due) w36.o;
                synchronized (due2) {
                    d3 = due2.d(longValue, true);
                }
                float[] fArr3 = (float[]) d3;
                if (fArr3 != null) {
                    float f = fArr3[0];
                    float f2 = -fArr3[1];
                    float f3 = -fArr3[2];
                    float length = Matrix.length(f, f2, f3);
                    int i = (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1));
                    float[] fArr4 = (float[]) w36.c;
                    if (i != 0) {
                        Matrix.setRotateM(fArr4, 0, (float) Math.toDegrees((double) length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr4, 0);
                    }
                    if (!w36.a) {
                        w36.h((float[]) w36.b, (float[]) w36.c);
                        w36.a = true;
                    }
                    Matrix.multiplyMM(fArr2, 0, (float[]) w36.b, 0, (float[]) w36.c, 0);
                }
            }
            due due3 = xsc.Y;
            synchronized (due3) {
                d2 = due3.d(timestamp, true);
            }
            cob cob = (cob) d2;
            if (cob != null) {
                dob dob = xsc.c;
                dob.getClass();
                if (dob.b(cob)) {
                    dob.a = cob.c;
                    ty tyVar = cob.a.a[0];
                    ? obj = new Object();
                    float[] fArr5 = (float[]) tyVar.c;
                    obj.a = fArr5.length / 3;
                    obj.c = (FloatBuffer) ByteBuffer.allocateDirect(fArr5.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr5).flip();
                    float[] fArr6 = (float[]) tyVar.o;
                    obj.o = (FloatBuffer) ByteBuffer.allocateDirect(fArr6.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr6).flip();
                    int i2 = tyVar.b;
                    if (i2 == 1) {
                        obj.b = 5;
                    } else if (i2 != 2) {
                        obj.b = 4;
                    } else {
                        obj.b = 6;
                    }
                    dob.g = obj;
                    if (!cob.d) {
                        ty tyVar2 = cob.b.a[0];
                        float[] fArr7 = (float[]) tyVar2.c;
                        int length2 = fArr7.length;
                        FloatBuffer floatBuffer = (FloatBuffer) ByteBuffer.allocateDirect(fArr7.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr7).flip();
                        float[] fArr8 = (float[]) tyVar2.o;
                        FloatBuffer floatBuffer2 = (FloatBuffer) ByteBuffer.allocateDirect(fArr8.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr8).flip();
                    }
                }
            }
        }
        Matrix.multiplyMM(xsc.s0, 0, fArr, 0, xsc.Z, 0);
        dob dob2 = xsc.c;
        int i3 = xsc.t0;
        float[] fArr9 = xsc.s0;
        ty tyVar3 = (ty) dob2.g;
        if (tyVar3 != null) {
            int i4 = dob2.a;
            GLES20.glUniformMatrix3fv(dob2.c, 1, false, i4 == 1 ? dob.j : i4 == 2 ? dob.k : dob.i, 0);
            GLES20.glUniformMatrix4fv(dob2.b, 1, false, fArr9, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i3);
            GLES20.glUniform1i(dob2.f, 0);
            wmd.h();
            GLES20.glVertexAttribPointer(dob2.d, 3, 5126, false, 12, (FloatBuffer) tyVar3.c);
            wmd.h();
            GLES20.glVertexAttribPointer(dob2.e, 2, 5126, false, 8, (FloatBuffer) tyVar3.o);
            wmd.h();
            GLES20.glDrawArrays(tyVar3.b, 0, tyVar3.a);
            wmd.h();
        }
    }

    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = ((float) i) / ((float) i2);
        Matrix.perspectiveM(this.b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        svd svd = this.v0;
        svd.s0.post(new flc(svd, 21, this.a.a()));
    }
}
