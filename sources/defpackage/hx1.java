package defpackage;

import java.nio.ByteBuffer;

/* renamed from: hx1  reason: default package */
public final class hx1 extends uj0 {
    public gx1 A0;
    public long B0;
    public final o54 x0 = new o54(1);
    public final yaf y0 = new yaf(3, false);
    public long z0;

    public hx1() {
        super(6);
    }

    public final int A(oy5 oy5) {
        return "application/x-camera-motion".equals(oy5.w0) ? uj0.b(4, 0, 0) : uj0.b(0, 0, 0);
    }

    public final void a(int i, Object obj) {
        if (i == 8) {
            this.A0 = (gx1) obj;
        }
    }

    public final String i() {
        return "CameraMotionRenderer";
    }

    public final boolean k() {
        return j();
    }

    public final boolean l() {
        return true;
    }

    public final void m() {
        gx1 gx1 = this.A0;
        if (gx1 != null) {
            gx1.c();
        }
    }

    public final void o(long j, boolean z) {
        this.B0 = Long.MIN_VALUE;
        gx1 gx1 = this.A0;
        if (gx1 != null) {
            gx1.c();
        }
    }

    public final void s(oy5[] oy5Arr, long j, long j2) {
        this.z0 = j2;
    }

    public final void w(long j, long j2) {
        float[] fArr;
        while (!j() && this.B0 < 100000 + j) {
            o54 o54 = this.x0;
            o54.v();
            imc imc = this.b;
            imc.N();
            if (v(imc, o54, 0) == -4 && !o54.f(4)) {
                this.B0 = o54.Y;
                if (this.A0 != null && !o54.f(Integer.MIN_VALUE)) {
                    o54.y();
                    ByteBuffer byteBuffer = o54.o;
                    int i = maf.a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        yaf yaf = this.y0;
                        yaf.F(limit, array);
                        yaf.H(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i2 = 0; i2 < 3; i2++) {
                            fArr2[i2] = Float.intBitsToFloat(yaf.j());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.A0.b(this.B0 - this.z0, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }
}
