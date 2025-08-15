package defpackage;

import com.google.android.exoplayer2.source.ClippingMediaSource$IllegalClippingException;

/* renamed from: b43  reason: default package */
public final class b43 extends r06 {
    public final long X;
    public final boolean Y;
    public final long c;
    public final long o;

    public b43(lue lue, long j, long j2) {
        super(lue);
        boolean z = false;
        if (lue.i() == 1) {
            jue n = lue.n(0, new jue(), 0);
            long max = Math.max(0, j);
            if (n.w0 || max == 0 || n.s0) {
                long max2 = j2 == Long.MIN_VALUE ? n.y0 : Math.max(0, j2);
                long j3 = n.y0;
                if (j3 != -9223372036854775807L) {
                    max2 = max2 > j3 ? j3 : max2;
                    if (max > max2) {
                        throw new ClippingMediaSource$IllegalClippingException(2);
                    }
                }
                this.c = max;
                this.o = max2;
                int i = (max2 > -9223372036854775807L ? 1 : (max2 == -9223372036854775807L ? 0 : -1));
                this.X = i == 0 ? -9223372036854775807L : max2 - max;
                if (n.t0 && (i == 0 || (j3 != -9223372036854775807L && max2 == j3))) {
                    z = true;
                }
                this.Y = z;
                return;
            }
            throw new ClippingMediaSource$IllegalClippingException(1);
        }
        throw new ClippingMediaSource$IllegalClippingException(0);
    }

    public final gue g(int i, gue gue, boolean z) {
        this.b.g(0, gue, z);
        long j = gue.X - this.c;
        long j2 = this.X;
        gue.h(gue.a, gue.b, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, r8.Y, false);
        return gue;
    }

    public final jue n(int i, jue jue, long j) {
        this.b.n(0, jue, 0);
        long j2 = jue.B0;
        long j3 = this.c;
        jue.B0 = j2 + j3;
        jue.y0 = this.X;
        jue.t0 = this.Y;
        long j4 = jue.x0;
        if (j4 != -9223372036854775807L) {
            long max = Math.max(j4, j3);
            jue.x0 = max;
            long j5 = this.o;
            if (j5 != -9223372036854775807L) {
                max = Math.min(max, j5);
            }
            jue.x0 = max - j3;
        }
        long M = maf.M(j3);
        long j6 = jue.X;
        if (j6 != -9223372036854775807L) {
            jue.X = j6 + M;
        }
        long j7 = jue.Y;
        if (j7 != -9223372036854775807L) {
            jue.Y = j7 + M;
        }
        return jue;
    }
}
