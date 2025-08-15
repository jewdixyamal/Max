package defpackage;

import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;

/* renamed from: vj0  reason: default package */
public abstract class vj0 implements q4b {
    public mue A0;
    public jgc B0;
    public int X;
    public j4b Y;
    public she Z;
    public final Object a = new Object();
    public final int b;
    public final y7g c;
    public lgc o;
    public int s0;
    public grc t0;
    public qy5[] u0;
    public long v0;
    public long w0;
    public long x0;
    public boolean y0;
    public boolean z0;

    public vj0(int i) {
        this.b = i;
        this.c = new y7g(18);
        this.x0 = Long.MIN_VALUE;
        this.A0 = mue.a;
    }

    public static int b(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | 128 | i4;
    }

    public static int h(int i) {
        return i & 384;
    }

    public static int i(int i) {
        return i & 64;
    }

    public static boolean n(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public final void A(qy5[] qy5Arr, grc grc, long j, long j2, yj8 yj8) {
        fm9.k(!this.y0);
        this.t0 = grc;
        if (this.x0 == Long.MIN_VALUE) {
            this.x0 = j;
        }
        this.u0 = qy5Arr;
        this.v0 = j2;
        x(qy5Arr, j, j2);
    }

    public final void B() {
        fm9.k(this.s0 == 0);
        this.c.t();
        u();
    }

    public void C(float f, float f2) {
    }

    public abstract int D(qy5 qy5);

    public int E() {
        return 0;
    }

    public void a(int i, Object obj) {
    }

    public final ExoPlaybackException c(MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, qy5 qy5) {
        return e(mediaCodecUtil$DecoderQueryException, qy5, false, 4002);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.media3.exoplayer.ExoPlaybackException e(java.lang.Throwable r12, defpackage.qy5 r13, boolean r14, int r15) {
        /*
            r11 = this;
            r2 = 4
            if (r13 == 0) goto L_0x001b
            boolean r3 = r11.z0
            if (r3 != 0) goto L_0x001b
            r3 = 1
            r11.z0 = r3
            r3 = 0
            int r4 = r11.D(r13)     // Catch:{ ExoPlaybackException -> 0x0019, all -> 0x0014 }
            r4 = r4 & 7
            r11.z0 = r3
            goto L_0x001c
        L_0x0014:
            r0 = move-exception
            r2 = r0
            r11.z0 = r3
            throw r2
        L_0x0019:
            r11.z0 = r3
        L_0x001b:
            r4 = r2
        L_0x001c:
            java.lang.String r5 = r11.k()
            int r6 = r11.X
            androidx.media3.exoplayer.ExoPlaybackException r10 = new androidx.media3.exoplayer.ExoPlaybackException
            if (r13 != 0) goto L_0x0028
            r8 = r2
            goto L_0x0029
        L_0x0028:
            r8 = r4
        L_0x0029:
            r2 = 1
            r1 = r10
            r3 = r12
            r4 = r15
            r7 = r13
            r9 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj0.e(java.lang.Throwable, qy5, boolean, int):androidx.media3.exoplayer.ExoPlaybackException");
    }

    public void g() {
    }

    public m78 j() {
        return null;
    }

    public abstract String k();

    public final boolean l() {
        return this.x0 == Long.MIN_VALUE;
    }

    public abstract boolean m();

    public abstract boolean o();

    public void p() {
    }

    public void q(boolean z, boolean z2) {
    }

    public void r(long j, boolean z) {
    }

    public void s() {
    }

    public void u() {
    }

    public void v() {
    }

    public void w() {
    }

    public abstract void x(qy5[] qy5Arr, long j, long j2);

    public final int y(y7g y7g, p54 p54, int i) {
        grc grc = this.t0;
        grc.getClass();
        int j = grc.j(y7g, p54, i);
        if (j == -4) {
            if (p54.f(4)) {
                this.x0 = Long.MIN_VALUE;
                return this.y0 ? -4 : -3;
            }
            long j2 = p54.Z + this.v0;
            p54.Z = j2;
            this.x0 = Math.max(this.x0, j2);
        } else if (j == -5) {
            qy5 qy5 = (qy5) y7g.c;
            qy5.getClass();
            long j3 = qy5.s;
            if (j3 != Long.MAX_VALUE) {
                ny5 a2 = qy5.a();
                a2.r = j3 + this.v0;
                y7g.c = a2.a();
            }
        }
        return j;
    }

    public abstract void z(long j, long j2);
}
