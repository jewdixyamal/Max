package defpackage;

import android.media.MediaFormat;

/* renamed from: p75  reason: default package */
public final class p75 implements tff, gx1, p4b {
    public tff a;
    public gx1 b;
    public tff c;
    public gx1 o;

    public final void a(int i, Object obj) {
        if (i == 7) {
            this.a = (tff) obj;
        } else if (i == 8) {
            this.b = (gx1) obj;
        } else if (i == 10000) {
            svd svd = (svd) obj;
            if (svd == null) {
                this.c = null;
                this.o = null;
                return;
            }
            this.c = svd.getVideoFrameMetadataListener();
            this.o = svd.getCameraMotionListener();
        }
    }

    public final void b(long j, float[] fArr) {
        gx1 gx1 = this.o;
        if (gx1 != null) {
            gx1.b(j, fArr);
        }
        gx1 gx12 = this.b;
        if (gx12 != null) {
            gx12.b(j, fArr);
        }
    }

    public final void c() {
        gx1 gx1 = this.o;
        if (gx1 != null) {
            gx1.c();
        }
        gx1 gx12 = this.b;
        if (gx12 != null) {
            gx12.c();
        }
    }

    public final void d(long j, long j2, oy5 oy5, MediaFormat mediaFormat) {
        tff tff = this.c;
        if (tff != null) {
            tff.d(j, j2, oy5, mediaFormat);
        }
        tff tff2 = this.a;
        if (tff2 != null) {
            tff2.d(j, j2, oy5, mediaFormat);
        }
    }
}
