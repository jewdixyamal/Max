package defpackage;

import java.nio.ByteBuffer;

/* renamed from: el0  reason: default package */
public final class el0 extends p54 {
    public long v0;
    public int w0;
    public int x0;

    public final boolean A() {
        return this.w0 > 0;
    }

    public final void v() {
        super.v();
        this.w0 = 0;
    }

    public final boolean z(p54 p54) {
        ByteBuffer byteBuffer;
        fm9.f(!p54.f(1073741824));
        fm9.f(!p54.f(268435456));
        fm9.f(!p54.f(4));
        if (A()) {
            if (this.w0 >= this.x0) {
                return false;
            }
            ByteBuffer byteBuffer2 = p54.X;
            if (!(byteBuffer2 == null || (byteBuffer = this.X) == null)) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i = this.w0;
        this.w0 = i + 1;
        if (i == 0) {
            this.Z = p54.Z;
            if (p54.f(1)) {
                this.b = 1;
            }
        }
        ByteBuffer byteBuffer3 = p54.X;
        if (byteBuffer3 != null) {
            x(byteBuffer3.remaining());
            this.X.put(byteBuffer3);
        }
        this.v0 = p54.Z;
        return true;
    }
}
