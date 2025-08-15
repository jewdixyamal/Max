package defpackage;

import java.nio.ByteBuffer;

/* renamed from: ix1  reason: default package */
public final class ix1 extends vj0 {
    public final p54 C0 = new p54(1);
    public final wpa D0 = new wpa();
    public long E0;
    public q75 F0;
    public long G0;

    public ix1() {
        super(6);
    }

    public final int D(qy5 qy5) {
        return "application/x-camera-motion".equals(qy5.n) ? vj0.b(4, 0, 0, 0) : vj0.b(0, 0, 0, 0);
    }

    public final void a(int i, Object obj) {
        if (i == 8) {
            this.F0 = (q75) obj;
        }
    }

    public final String k() {
        return "CameraMotionRenderer";
    }

    public final boolean m() {
        return l();
    }

    public final boolean o() {
        return true;
    }

    public final void p() {
        q75 q75 = this.F0;
        if (q75 != null) {
            q75.c();
        }
    }

    public final void r(long j, boolean z) {
        this.G0 = Long.MIN_VALUE;
        q75 q75 = this.F0;
        if (q75 != null) {
            q75.c();
        }
    }

    public final void x(qy5[] qy5Arr, long j, long j2) {
        this.E0 = j2;
    }

    public final void z(long j, long j2) {
        float[] fArr;
        while (!l() && this.G0 < 100000 + j) {
            p54 p54 = this.C0;
            p54.v();
            y7g y7g = this.c;
            y7g.t();
            if (y(y7g, p54, 0) == -4 && !p54.f(4)) {
                long j3 = p54.Z;
                this.G0 = j3;
                boolean z = j3 < this.w0;
                if (this.F0 != null && !z) {
                    p54.y();
                    ByteBuffer byteBuffer = p54.X;
                    int i = oaf.a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        wpa wpa = this.D0;
                        wpa.E(limit, array);
                        wpa.G(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i2 = 0; i2 < 3; i2++) {
                            fArr2[i2] = Float.intBitsToFloat(wpa.i());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.F0.b(this.G0 - this.E0, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }
}
