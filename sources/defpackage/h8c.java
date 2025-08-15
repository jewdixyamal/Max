package defpackage;

import android.opengl.GLES20;
import android.opengl.GLES30;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;

/* renamed from: h8c  reason: default package */
public final class h8c implements gcg {
    public int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;

    public h8c(int i2, int i3, float[] fArr, float[] fArr2) {
        this.f = IntBuffer.allocate(1);
        this.g = IntBuffer.allocate(2);
        this.a = i2;
        this.b = i3;
        this.c = 2;
        this.e = 5;
        this.d = 4;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        this.h = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(fArr2.length * 4);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.put(fArr2);
        asFloatBuffer2.position(0);
        this.i = asFloatBuffer2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v2, resolved type: mhc} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: od} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.h8c c(defpackage.h8c r9, int r10, defpackage.od r11, defpackage.mhc r12, int r13) {
        /*
            r0 = r13 & 1
            if (r0 == 0) goto L_0x0006
            int r10 = r9.b
        L_0x0006:
            r3 = r10
            r10 = r13 & 2
            if (r10 == 0) goto L_0x0010
            java.lang.Object r10 = r9.h
            r11 = r10
            od r11 = (defpackage.od) r11
        L_0x0010:
            r4 = r11
            r10 = r13 & 4
            if (r10 == 0) goto L_0x001a
            java.lang.Object r10 = r9.i
            r12 = r10
            mhc r12 = (defpackage.mhc) r12
        L_0x001a:
            r5 = r12
            int r6 = r9.c
            int r7 = r9.d
            int r8 = r9.e
            h8c r10 = new h8c
            java.lang.Object r11 = r9.f
            r1 = r11
            b8c r1 = (defpackage.b8c) r1
            java.lang.Object r9 = r9.g
            r2 = r9
            java.util.List r2 = (java.util.List) r2
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h8c.c(h8c, int, od, mhc, int):h8c");
    }

    public void a() {
        FloatBuffer floatBuffer;
        IntBuffer intBuffer = (IntBuffer) this.f;
        if (intBuffer.get(0) == 0) {
            FloatBuffer floatBuffer2 = (FloatBuffer) this.h;
            if (floatBuffer2 != null && (floatBuffer = (FloatBuffer) this.i) != null) {
                GLES30.glGenVertexArrays(1, intBuffer);
                IntBuffer intBuffer2 = (IntBuffer) this.g;
                GLES20.glGenBuffers(2, intBuffer2);
                GLES20.glBindBuffer(34962, intBuffer2.get(0));
                nd7.b("glBindBuffer");
                GLES20.glBufferData(34962, floatBuffer2.remaining() * 4, floatBuffer2, 35044);
                nd7.b("glBufferData");
                GLES20.glBindBuffer(34962, 0);
                nd7.b("glBindBuffer");
                GLES20.glBindBuffer(34962, intBuffer2.get(1));
                nd7.b("glBindBuffer");
                GLES20.glBufferData(34962, floatBuffer.remaining() * 4, floatBuffer, 35044);
                nd7.b("glBufferData");
                GLES20.glBindBuffer(34962, 0);
                nd7.b("glBindBuffer");
                GLES30.glBindVertexArray(intBuffer.get(0));
                nd7.b("glBindVertexArray");
                intBuffer2.rewind();
                GLES20.glBindBuffer(34962, intBuffer2.get(0));
                nd7.b("glBindBuffer");
                int i2 = this.c;
                GLES20.glVertexAttribPointer(this.a, i2, 5126, false, i2 * 4, 0);
                nd7.b("glVertexAttribPointer");
                GLES20.glBindBuffer(34962, 0);
                nd7.b("glBindBuffer");
                intBuffer2.rewind();
                GLES20.glBindBuffer(34962, intBuffer2.get(1));
                nd7.b("glBindBuffer");
                GLES20.glVertexAttribPointer(this.b, 2, 5126, false, 8, 0);
                nd7.b("glVertexAttribPointer");
                GLES20.glBindBuffer(34962, 0);
                nd7.b("glBindBuffer");
                GLES30.glBindVertexArray(0);
                nd7.b("glBindVertexArray");
            } else {
                return;
            }
        }
        GLES30.glBindVertexArray(intBuffer.get(0));
        nd7.b("glBindVertexArray");
        int i3 = this.a;
        GLES20.glEnableVertexAttribArray(i3);
        nd7.b("glEnableVertexAttribArray");
        int i4 = this.b;
        GLES20.glEnableVertexAttribArray(i4);
        nd7.b("glEnableVertexAttribArray");
        GLES20.glDrawArrays(this.e, 0, this.d);
        nd7.b("glDrawArrays");
        GLES20.glDisableVertexAttribArray(i3);
        nd7.b("glDisableVertexAttribArray");
        GLES20.glDisableVertexAttribArray(i4);
        nd7.b("glDisableVertexAttribArray");
        GLES30.glBindVertexArray(0);
        nd7.b("glBindVertexArray");
    }

    public void b() {
        GLES20.glDeleteBuffers(2, (IntBuffer) this.g);
        nd7.b("glDeleteBuffers");
        GLES30.glDeleteVertexArrays(1, (IntBuffer) this.f);
        nd7.b("glDeleteVertexArrays");
    }

    public yic d(mhc mhc) {
        List list = (List) this.g;
        int size = list.size();
        int i2 = this.b;
        if (i2 < size) {
            this.a++;
            od odVar = (od) this.h;
            if (odVar != null) {
                vq6 vq6 = mhc.b;
                vq6 vq62 = ((v45) odVar.X).h.a;
                if (vq6.f != vq62.f || !tpa.f(vq6.e, vq62.e)) {
                    throw new IllegalStateException(("network interceptor " + ((p37) list.get(i2 - 1)) + " must retain the same host and port").toString());
                } else if (this.a != 1) {
                    throw new IllegalStateException(("network interceptor " + ((p37) list.get(i2 - 1)) + " must call proceed() exactly once").toString());
                }
            }
            int i3 = i2 + 1;
            h8c c2 = c(this, i3, (od) null, mhc, 58);
            p37 p37 = (p37) list.get(i2);
            yic a2 = p37.a(c2);
            if (a2 == null) {
                throw new NullPointerException("interceptor " + p37 + " returned null");
            } else if (odVar != null && i3 < list.size() && c2.a != 1) {
                throw new IllegalStateException(("network interceptor " + p37 + " must call proceed() exactly once").toString());
            } else if (a2.Z != null) {
                return a2;
            } else {
                throw new IllegalStateException(("interceptor " + p37 + " returned a response with no body").toString());
            }
        } else {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public h8c(b8c b8c, List list, int i2, od odVar, mhc mhc, int i3, int i4, int i5) {
        this.f = b8c;
        this.g = list;
        this.b = i2;
        this.h = odVar;
        this.i = mhc;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }
}
