package defpackage;

import androidx.media3.exoplayer.source.ClippingMediaSource$IllegalClippingException;

/* renamed from: c43  reason: default package */
public final class c43 extends s06 {
    public final long f;
    public final long g;
    public final long h;
    public final boolean i;

    public c43(mue mue, long j, long j2) {
        super(mue);
        boolean z = false;
        if (mue.i() == 1) {
            kue n = mue.n(0, new kue(), 0);
            long max = Math.max(0, j);
            if (n.k || max == 0 || n.h) {
                long max2 = j2 == Long.MIN_VALUE ? n.m : Math.max(0, j2);
                long j3 = n.m;
                if (j3 != -9223372036854775807L) {
                    max2 = max2 > j3 ? j3 : max2;
                    if (max > max2) {
                        throw new ClippingMediaSource$IllegalClippingException(2);
                    }
                }
                this.f = max;
                this.g = max2;
                int i2 = (max2 > -9223372036854775807L ? 1 : (max2 == -9223372036854775807L ? 0 : -1));
                this.h = i2 == 0 ? -9223372036854775807L : max2 - max;
                if (n.i && (i2 == 0 || (j3 != -9223372036854775807L && max2 == j3))) {
                    z = true;
                }
                this.i = z;
                return;
            }
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        throw new ClippingMediaSource$IllegalClippingException(0);
    }

    public final hue g(int i2, hue hue, boolean z) {
        this.e.g(0, hue, z);
        long j = hue.e - this.f;
        long j2 = this.h;
        hue.j(hue.a, hue.b, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, s8.g, false);
        return hue;
    }

    public final kue n(int i2, kue kue, long j) {
        this.e.n(0, kue, 0);
        long j2 = kue.p;
        long j3 = this.f;
        kue.p = j2 + j3;
        kue.m = this.h;
        kue.i = this.i;
        long j4 = kue.l;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            kue.l = max;
            long j5 = this.g;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            kue.l = max - j3;
        }
        long h0 = oaf.h0(j3);
        long j6 = kue.e;
        if (j6 != -9223372036854775807L) {
            kue.e = j6 + h0;
        }
        long j7 = kue.f;
        if (j7 != -9223372036854775807L) {
            kue.f = j7 + h0;
        }
        return kue;
    }
}
