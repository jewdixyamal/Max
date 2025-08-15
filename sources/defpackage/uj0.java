package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;

/* renamed from: uj0  reason: default package */
public abstract class uj0 implements p4b {
    public i4b X;
    public int Y;
    public frc Z;
    public final int a;
    public final imc b = new imc(19);
    public kgc c;
    public int o;
    public oy5[] s0;
    public long t0;
    public long u0 = Long.MIN_VALUE;
    public boolean v0;
    public boolean w0;

    public uj0(int i) {
        this.a = i;
    }

    public static int b(int i, int i2, int i3) {
        return i | i2 | i3 | 128;
    }

    public static int f(int i) {
        return i & 128;
    }

    public static int g(int i) {
        return i & 64;
    }

    public abstract int A(oy5 oy5);

    public int B() {
        return 0;
    }

    public void a(int i, Object obj) {
    }

    public final ExoPlaybackException c(MediaCodecUtil$DecoderQueryException mediaCodecUtil$DecoderQueryException, oy5 oy5) {
        return e(mediaCodecUtil$DecoderQueryException, oy5, false, 4002);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.exoplayer2.ExoPlaybackException e(java.lang.Exception r12, defpackage.oy5 r13, boolean r14, int r15) {
        /*
            r11 = this;
            r2 = 4
            if (r13 == 0) goto L_0x001b
            boolean r3 = r11.w0
            if (r3 != 0) goto L_0x001b
            r3 = 1
            r11.w0 = r3
            r3 = 0
            int r4 = r11.A(r13)     // Catch:{ ExoPlaybackException -> 0x0019, all -> 0x0014 }
            r4 = r4 & 7
            r11.w0 = r3
            goto L_0x001c
        L_0x0014:
            r0 = move-exception
            r2 = r0
            r11.w0 = r3
            throw r2
        L_0x0019:
            r11.w0 = r3
        L_0x001b:
            r4 = r2
        L_0x001c:
            java.lang.String r5 = r11.i()
            int r6 = r11.o
            com.google.android.exoplayer2.ExoPlaybackException r10 = new com.google.android.exoplayer2.ExoPlaybackException
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uj0.e(java.lang.Exception, oy5, boolean, int):com.google.android.exoplayer2.ExoPlaybackException");
    }

    public l78 h() {
        return null;
    }

    public abstract String i();

    public final boolean j() {
        return this.u0 == Long.MIN_VALUE;
    }

    public abstract boolean k();

    public abstract boolean l();

    public abstract void m();

    public void n(boolean z, boolean z2) {
    }

    public abstract void o(long j, boolean z);

    public void p() {
    }

    public void q() {
    }

    public void r() {
    }

    public abstract void s(oy5[] oy5Arr, long j, long j2);

    public final int v(imc imc, o54 o54, int i) {
        frc frc = this.Z;
        frc.getClass();
        int g = frc.g(imc, o54, i);
        if (g == -4) {
            if (o54.f(4)) {
                this.u0 = Long.MIN_VALUE;
                return this.v0 ? -4 : -3;
            }
            long j = o54.Y + this.t0;
            o54.Y = j;
            this.u0 = Math.max(this.u0, j);
        } else if (g == -5) {
            oy5 oy5 = (oy5) imc.c;
            oy5.getClass();
            long j2 = oy5.A0;
            if (j2 != Long.MAX_VALUE) {
                my5 a2 = oy5.a();
                a2.o = j2 + this.t0;
                imc.c = a2.a();
            }
        }
        return g;
    }

    public abstract void w(long j, long j2);

    public final void x(oy5[] oy5Arr, frc frc, long j, long j2) {
        np8.f(!this.v0);
        this.Z = frc;
        if (this.u0 == Long.MIN_VALUE) {
            this.u0 = j;
        }
        this.s0 = oy5Arr;
        this.t0 = j2;
        s(oy5Arr, j, j2);
    }

    public final void y() {
        np8.f(this.Y == 0);
        this.b.N();
        p();
    }

    public void z(float f, float f2) {
    }
}
