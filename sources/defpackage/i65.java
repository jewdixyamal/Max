package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* renamed from: i65  reason: default package */
public final class i65 extends j65 {
    public final u43 P0;
    public boolean Q0;

    public i65(glc glc, g03 g03, wt wtVar) {
        super(1, g03, wtVar);
        this.P0 = glc;
    }

    public final boolean G() {
        p54 d = this.E0.d();
        if (d == null) {
            return false;
        }
        if (!this.Q0) {
            if (this.F0.d()) {
                ByteBuffer byteBuffer = d.X;
                byteBuffer.getClass();
                byteBuffer.limit(0);
                d.a(4);
                this.G0 = this.E0.f();
                return false;
            }
            ByteBuffer c = this.F0.c();
            if (c == null) {
                return false;
            }
            d.x(c.limit());
            d.X.put(c).flip();
            y84 y84 = this.F0;
            MediaCodec.BufferInfo bufferInfo = y84.f(false) ? y84.a : null;
            bufferInfo.getClass();
            d.Z = bufferInfo.presentationTimeUs;
            d.b = bufferInfo.flags;
            this.F0.i();
            this.Q0 = true;
        }
        if (!this.E0.f()) {
            return false;
        }
        this.Q0 = false;
        return true;
    }

    public final void H(qy5 qy5) {
        this.F0 = this.P0.g(qy5);
    }

    public final boolean P(p54 p54) {
        if (p54.f(4)) {
            return false;
        }
        long j = p54.Z - this.C0;
        p54.Z = j;
        if (this.F0 == null || j >= 0) {
            return false;
        }
        p54.v();
        return true;
    }

    public final String k() {
        return "ExoAssetLoaderAudioRenderer";
    }
}
