package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: g88  reason: default package */
public abstract class g88 extends vj0 {
    public static final byte[] P1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public int A1;
    public boolean B1;
    public final q78 C0;
    public boolean C1;
    public final xw0 D0;
    public boolean D1;
    public final boolean E0 = false;
    public long E1;
    public final float F0;
    public long F1;
    public final p54 G0;
    public boolean G1;
    public final p54 H0;
    public boolean H1;
    public final p54 I0;
    public boolean I1;
    public final el0 J0;
    public boolean J1;
    public final MediaCodec.BufferInfo K0;
    public ExoPlaybackException K1;
    public final ArrayDeque L0;
    public n54 L1;
    public final l2a M0;
    public e88 M1;
    public qy5 N0;
    public long N1;
    public qy5 O0;
    public boolean O1;
    public fr4 P0;
    public fr4 Q0;
    public w75 R0;
    public MediaCrypto S0;
    public final long T0;
    public float U0;
    public float V0;
    public s78 W0;
    public qy5 X0;
    public MediaFormat Y0;
    public boolean Z0;
    public float a1;
    public ArrayDeque b1;
    public MediaCodecRenderer$DecoderInitializationException c1;
    public y78 d1;
    public int e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public boolean n1;
    public long o1;
    public int p1;
    public int q1;
    public ByteBuffer r1;
    public boolean s1;
    public boolean t1;
    public boolean u1;
    public boolean v1;
    public boolean w1;
    public boolean x1;
    public int y1;
    public int z1;

    /* JADX WARNING: type inference failed for: r5v4, types: [el0, p54] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g88(int i, q78 q78, float f) {
        super(i);
        xw0 xw0 = xw0.Z;
        this.C0 = q78;
        this.D0 = xw0;
        this.F0 = f;
        this.G0 = new p54(0);
        this.H0 = new p54(0);
        this.I0 = new p54(2);
        ? p54 = new p54(2);
        p54.x0 = 32;
        this.J0 = p54;
        this.K0 = new MediaCodec.BufferInfo();
        this.U0 = 1.0f;
        this.V0 = 1.0f;
        this.T0 = -9223372036854775807L;
        this.L0 = new ArrayDeque();
        this.M1 = e88.e;
        p54.x(0);
        p54.X.order(ByteOrder.nativeOrder());
        l2a l2a = new l2a(0);
        l2a.o = m60.a;
        l2a.c = 0;
        l2a.b = 2;
        this.M0 = l2a;
        this.a1 = -1.0f;
        this.e1 = 0;
        this.y1 = 0;
        this.p1 = -1;
        this.q1 = -1;
        this.o1 = -9223372036854775807L;
        this.E1 = -9223372036854775807L;
        this.F1 = -9223372036854775807L;
        this.N1 = -9223372036854775807L;
        this.z1 = 0;
        this.A1 = 0;
        this.L1 = new n54(1);
    }

    public void C(float f, float f2) {
        this.U0 = f;
        this.V0 = f2;
        w0(this.X0);
    }

    public final int D(qy5 qy5) {
        try {
            return v0(this.D0, qy5);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw c(e, qy5);
        }
    }

    public final int E() {
        return 8;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: byte[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x032a, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0330, code lost:
        r15.v1 = true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x032c A[LOOP:0: B:23:0x0096->B:120:0x032c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x032a A[EDGE_INSN: B:137:0x032a->B:119:0x032a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean F(long r27, long r29) {
        /*
            r26 = this;
            r15 = r26
            boolean r0 = r15.H1
            r14 = 1
            r0 = r0 ^ r14
            defpackage.fm9.k(r0)
            el0 r13 = r15.J0
            boolean r0 = r13.A()
            r12 = 0
            if (r0 == 0) goto L_0x0056
            java.nio.ByteBuffer r6 = r13.X
            int r7 = r15.q1
            int r9 = r13.w0
            long r3 = r13.Z
            long r0 = r15.w0
            long r10 = r13.v0
            boolean r17 = r15.X(r0, r10)
            r10 = 4
            boolean r16 = r13.f(r10)
            qy5 r11 = r15.O0
            r11.getClass()
            r5 = 0
            r8 = 0
            r0 = r26
            r1 = r27
            r18 = r3
            r3 = r29
            r20 = r11
            r10 = r18
            r12 = r17
            r22 = r13
            r13 = r16
            r14 = r20
            boolean r0 = r0.l0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
            if (r0 == 0) goto L_0x0054
            r0 = r22
            long r1 = r0.v0
            r15.g0(r1)
            r0.v()
            r1 = 0
            goto L_0x0058
        L_0x0054:
            r1 = 0
            return r1
        L_0x0056:
            r1 = r12
            r0 = r13
        L_0x0058:
            boolean r2 = r15.G1
            if (r2 == 0) goto L_0x0060
            r2 = 1
            r15.H1 = r2
            return r1
        L_0x0060:
            r2 = 1
            boolean r3 = r15.v1
            p54 r4 = r15.I0
            if (r3 == 0) goto L_0x0070
            boolean r3 = r0.z(r4)
            defpackage.fm9.k(r3)
            r15.v1 = r1
        L_0x0070:
            boolean r3 = r15.w1
            if (r3 == 0) goto L_0x0088
            boolean r3 = r0.A()
            if (r3 == 0) goto L_0x007b
            return r2
        L_0x007b:
            r26.J()
            r15.w1 = r1
            r26.Y()
            boolean r3 = r15.u1
            if (r3 != 0) goto L_0x0088
            return r1
        L_0x0088:
            boolean r3 = r15.G1
            r3 = r3 ^ r2
            defpackage.fm9.k(r3)
            y7g r3 = r15.c
            r3.t()
            r4.v()
        L_0x0096:
            r4.v()
            int r5 = r15.y(r3, r4, r1)
            r6 = -5
            if (r5 == r6) goto L_0x0333
            r6 = -4
            if (r5 == r6) goto L_0x00ba
            r3 = -3
            if (r5 != r3) goto L_0x00b4
            boolean r3 = r26.l()
            if (r3 == 0) goto L_0x00b0
            long r3 = r15.E1
            r15.F1 = r3
        L_0x00b0:
            r7 = r1
            r1 = r2
            goto L_0x0338
        L_0x00b4:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00ba:
            r5 = 4
            boolean r6 = r4.f(r5)
            if (r6 == 0) goto L_0x00c8
            r15.G1 = r2
            long r3 = r15.E1
            r15.F1 = r3
            goto L_0x00b0
        L_0x00c8:
            long r6 = r15.E1
            long r8 = r4.Z
            long r6 = java.lang.Math.max(r6, r8)
            r15.E1 = r6
            boolean r6 = r26.l()
            if (r6 != 0) goto L_0x00e2
            p54 r6 = r15.H0
            r7 = 536870912(0x20000000, float:1.0842022E-19)
            boolean r6 = r6.f(r7)
            if (r6 == 0) goto L_0x00e6
        L_0x00e2:
            long r6 = r15.E1
            r15.F1 = r6
        L_0x00e6:
            boolean r6 = r15.I1
            r7 = 8
            r8 = 255(0xff, float:3.57E-43)
            r9 = 0
            java.lang.String r10 = "audio/opus"
            if (r6 == 0) goto L_0x0139
            qy5 r6 = r15.N0
            r6.getClass()
            r15.O0 = r6
            java.lang.String r6 = r6.n
            boolean r6 = java.util.Objects.equals(r6, r10)
            if (r6 == 0) goto L_0x0132
            qy5 r6 = r15.O0
            java.util.List r6 = r6.q
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto L_0x0132
            qy5 r6 = r15.O0
            java.util.List r6 = r6.q
            java.lang.Object r6 = r6.get(r1)
            byte[] r6 = (byte[]) r6
            r11 = 11
            byte r11 = r6[r11]
            r11 = r11 & r8
            int r11 = r11 << r7
            r12 = 10
            byte r6 = r6[r12]
            r6 = r6 & r8
            r6 = r6 | r11
            qy5 r11 = r15.O0
            r11.getClass()
            ny5 r11 = r11.a()
            r11.D = r6
            qy5 r6 = new qy5
            r6.<init>(r11)
            r15.O0 = r6
        L_0x0132:
            qy5 r6 = r15.O0
            r15.e0(r6, r9)
            r15.I1 = r1
        L_0x0139:
            r4.y()
            qy5 r6 = r15.O0
            if (r6 == 0) goto L_0x030c
            java.lang.String r6 = r6.n
            boolean r6 = java.util.Objects.equals(r6, r10)
            if (r6 == 0) goto L_0x030c
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            boolean r6 = r4.f(r6)
            if (r6 == 0) goto L_0x0157
            qy5 r6 = r15.O0
            r4.c = r6
            r15.V(r4)
        L_0x0157:
            long r10 = r15.w0
            long r12 = r4.Z
            long r10 = r10 - r12
            r12 = 80000(0x13880, double:3.95253E-319)
            int r6 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r6 > 0) goto L_0x030c
            qy5 r6 = r15.O0
            r6.getClass()
            l2a r10 = r15.M0
            r10.getClass()
            java.nio.ByteBuffer r11 = r4.X
            r11.getClass()
            java.nio.ByteBuffer r11 = r4.X
            int r11 = r11.limit()
            java.nio.ByteBuffer r12 = r4.X
            int r12 = r12.position()
            int r11 = r11 - r12
            if (r11 != 0) goto L_0x0183
            goto L_0x030c
        L_0x0183:
            int r11 = r10.b
            r12 = 2
            if (r11 != r12) goto L_0x019e
            java.util.List r6 = r6.q
            int r11 = r6.size()
            if (r11 == r2) goto L_0x0197
            int r11 = r6.size()
            r13 = 3
            if (r11 != r13) goto L_0x019e
        L_0x0197:
            java.lang.Object r6 = r6.get(r1)
            r9 = r6
            byte[] r9 = (byte[]) r9
        L_0x019e:
            java.nio.ByteBuffer r6 = r4.X
            int r11 = r6.position()
            int r13 = r6.limit()
            int r14 = r13 - r11
            int r5 = r14 + 255
            int r5 = r5 / r8
            int r16 = r5 + 27
            int r16 = r16 + r14
            int r8 = r10.b
            if (r8 != r12) goto L_0x01c4
            if (r9 == 0) goto L_0x01bb
            int r8 = r9.length
            int r8 = r8 + 28
            goto L_0x01bd
        L_0x01bb:
            r8 = 47
        L_0x01bd:
            int r17 = r8 + 44
            int r16 = r17 + r16
        L_0x01c1:
            r2 = r16
            goto L_0x01c6
        L_0x01c4:
            r8 = r1
            goto L_0x01c1
        L_0x01c6:
            java.lang.Object r1 = r10.o
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.capacity()
            if (r1 >= r2) goto L_0x01dd
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r1 = r1.order(r2)
            r10.o = r1
            goto L_0x01e4
        L_0x01dd:
            java.lang.Object r1 = r10.o
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r1.clear()
        L_0x01e4:
            java.lang.Object r1 = r10.o
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r2 = r10.b
            if (r2 != r12) goto L_0x0243
            if (r9 == 0) goto L_0x0235
            r21 = 0
            r23 = 0
            r24 = 1
            r25 = 1
            r20 = r1
            defpackage.l2a.f(r20, r21, r23, r24, r25)
            int r2 = r9.length
            r17 = r13
            long r12 = (long) r2
            r2 = 8
            long r18 = r12 >> r2
            r20 = 0
            int r2 = (r18 > r20 ? 1 : (r18 == r20 ? 0 : -1))
            if (r2 != 0) goto L_0x020b
            r2 = 1
            goto L_0x020c
        L_0x020b:
            r2 = 0
        L_0x020c:
            java.lang.String r7 = "out of range: %s"
            defpackage.z04.j(r12, r7, r2)
            int r2 = (int) r12
            byte r2 = (byte) r2
            r1.put(r2)
            r1.put(r9)
            byte[] r2 = r1.array()
            int r7 = r1.arrayOffset()
            int r12 = r9.length
            int r12 = r12 + 28
            r13 = 0
            int r2 = defpackage.oaf.n(r7, r12, r13, r2)
            r7 = 22
            r1.putInt(r7, r2)
            int r2 = r9.length
            int r2 = r2 + 28
            r1.position(r2)
            goto L_0x023c
        L_0x0235:
            r17 = r13
            byte[] r2 = defpackage.l2a.X
            r1.put(r2)
        L_0x023c:
            byte[] r2 = defpackage.l2a.Y
            r1.put(r2)
        L_0x0241:
            r2 = 0
            goto L_0x0246
        L_0x0243:
            r17 = r13
            goto L_0x0241
        L_0x0246:
            byte r7 = r6.get(r2)
            int r2 = r6.limit()
            r9 = 1
            if (r2 <= r9) goto L_0x0256
            byte r12 = r6.get(r9)
            goto L_0x0257
        L_0x0256:
            r12 = 0
        L_0x0257:
            long r12 = defpackage.wmd.q(r7, r12)
            r18 = 48000(0xbb80, double:2.3715E-319)
            long r12 = r12 * r18
            r18 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r12 / r18
            int r2 = (int) r12
            int r7 = r10.c
            int r7 = r7 + r2
            r10.c = r7
            long r12 = (long) r7
            int r2 = r10.b
            r25 = 0
            r20 = r1
            r21 = r12
            r23 = r2
            r24 = r5
            defpackage.l2a.f(r20, r21, r23, r24, r25)
            r12 = 0
        L_0x027c:
            if (r12 >= r5) goto L_0x0292
            r2 = 255(0xff, float:3.57E-43)
            if (r14 < r2) goto L_0x028a
            r7 = -1
            r1.put(r7)
            int r7 = r14 + -255
            r14 = r7
            goto L_0x028f
        L_0x028a:
            byte r7 = (byte) r14
            r1.put(r7)
            r14 = 0
        L_0x028f:
            int r12 = r12 + 1
            goto L_0x027c
        L_0x0292:
            r2 = r17
        L_0x0294:
            if (r11 >= r2) goto L_0x02a0
            byte r5 = r6.get(r11)
            r1.put(r5)
            int r11 = r11 + 1
            goto L_0x0294
        L_0x02a0:
            int r2 = r6.limit()
            r6.position(r2)
            r1.flip()
            int r2 = r10.b
            r5 = 2
            if (r2 != r5) goto L_0x02ce
            byte[] r2 = r1.array()
            int r5 = r1.arrayOffset()
            int r5 = r5 + r8
            int r5 = r5 + 44
            int r6 = r1.limit()
            int r7 = r1.position()
            int r6 = r6 - r7
            r7 = 0
            int r2 = defpackage.oaf.n(r5, r6, r7, r2)
            int r8 = r8 + 66
            r1.putInt(r8, r2)
            goto L_0x02e9
        L_0x02ce:
            r7 = 0
            byte[] r2 = r1.array()
            int r5 = r1.arrayOffset()
            int r6 = r1.limit()
            int r8 = r1.position()
            int r6 = r6 - r8
            int r2 = defpackage.oaf.n(r5, r6, r7, r2)
            r5 = 22
            r1.putInt(r5, r2)
        L_0x02e9:
            int r2 = r10.b
            r5 = 1
            int r2 = r2 + r5
            r10.b = r2
            r10.o = r1
            r4.v()
            java.lang.Object r1 = r10.o
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            int r1 = r1.remaining()
            r4.x(r1)
            java.nio.ByteBuffer r1 = r4.X
            java.lang.Object r2 = r10.o
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            r1.put(r2)
            r4.y()
            goto L_0x030d
        L_0x030c:
            r7 = r1
        L_0x030d:
            boolean r1 = r0.A()
            if (r1 != 0) goto L_0x0314
            goto L_0x0324
        L_0x0314:
            long r1 = r15.w0
            long r5 = r0.v0
            boolean r5 = r15.X(r1, r5)
            long r8 = r4.Z
            boolean r1 = r15.X(r1, r8)
            if (r5 != r1) goto L_0x032a
        L_0x0324:
            boolean r1 = r0.z(r4)
            if (r1 != 0) goto L_0x032c
        L_0x032a:
            r1 = 1
            goto L_0x0330
        L_0x032c:
            r1 = r7
            r2 = 1
            goto L_0x0096
        L_0x0330:
            r15.v1 = r1
            goto L_0x0338
        L_0x0333:
            r7 = r1
            r1 = r2
            r15.d0(r3)
        L_0x0338:
            boolean r2 = r0.A()
            if (r2 == 0) goto L_0x0341
            r0.y()
        L_0x0341:
            boolean r0 = r0.A()
            if (r0 != 0) goto L_0x0352
            boolean r0 = r15.G1
            if (r0 != 0) goto L_0x0352
            boolean r0 = r15.w1
            if (r0 == 0) goto L_0x0350
            goto L_0x0352
        L_0x0350:
            r14 = r7
            goto L_0x0353
        L_0x0352:
            r14 = r1
        L_0x0353:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g88.F(long, long):boolean");
    }

    public abstract s54 G(y78 y78, qy5 qy5, qy5 qy52);

    public MediaCodecDecoderException H(IllegalStateException illegalStateException, y78 y78) {
        return new MediaCodecDecoderException(illegalStateException, y78);
    }

    public final void J() {
        this.w1 = false;
        this.J0.v();
        this.I0.v();
        this.v1 = false;
        this.u1 = false;
        l2a l2a = this.M0;
        l2a.getClass();
        l2a.o = m60.a;
        l2a.c = 0;
        l2a.b = 2;
    }

    public final boolean K() {
        if (this.B1) {
            this.z1 = 1;
            if (this.g1 || this.i1) {
                this.A1 = 3;
                return false;
            }
            this.A1 = 2;
        } else {
            x0();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:86:0x0125  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean L(long r22, long r24) {
        /*
            r21 = this;
            r15 = r21
            s78 r5 = r15.W0
            r5.getClass()
            int r0 = r15.q1
            r14 = 0
            r13 = 1
            if (r0 < 0) goto L_0x000f
            r0 = r13
            goto L_0x0010
        L_0x000f:
            r0 = r14
        L_0x0010:
            android.media.MediaCodec$BufferInfo r12 = r15.K0
            if (r0 != 0) goto L_0x00e0
            boolean r0 = r15.j1
            if (r0 == 0) goto L_0x002c
            boolean r0 = r15.C1
            if (r0 == 0) goto L_0x002c
            int r0 = r5.g(r12)     // Catch:{ IllegalStateException -> 0x0021 }
            goto L_0x0030
        L_0x0021:
            r21.k0()
            boolean r0 = r15.H1
            if (r0 == 0) goto L_0x002b
            r21.n0()
        L_0x002b:
            return r14
        L_0x002c:
            int r0 = r5.g(r12)
        L_0x0030:
            if (r0 >= 0) goto L_0x006f
            r1 = -2
            if (r0 != r1) goto L_0x005e
            r15.D1 = r13
            s78 r0 = r15.W0
            r0.getClass()
            android.media.MediaFormat r0 = r0.getOutputFormat()
            int r1 = r15.e1
            if (r1 == 0) goto L_0x0059
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x0059
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x0059
            r15.m1 = r13
            goto L_0x005d
        L_0x0059:
            r15.Y0 = r0
            r15.Z0 = r13
        L_0x005d:
            return r13
        L_0x005e:
            boolean r0 = r15.n1
            if (r0 == 0) goto L_0x006e
            boolean r0 = r15.G1
            if (r0 != 0) goto L_0x006b
            int r0 = r15.z1
            r1 = 2
            if (r0 != r1) goto L_0x006e
        L_0x006b:
            r21.k0()
        L_0x006e:
            return r14
        L_0x006f:
            boolean r1 = r15.m1
            if (r1 == 0) goto L_0x0079
            r15.m1 = r14
            r5.releaseOutputBuffer(r0, r14)
            return r13
        L_0x0079:
            int r1 = r12.size
            if (r1 != 0) goto L_0x0087
            int r1 = r12.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0087
            r21.k0()
            return r14
        L_0x0087:
            r15.q1 = r0
            java.nio.ByteBuffer r0 = r5.getOutputBuffer(r0)
            r15.r1 = r0
            if (r0 == 0) goto L_0x00a0
            int r1 = r12.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.r1
            int r1 = r12.offset
            int r2 = r12.size
            int r1 = r1 + r2
            r0.limit(r1)
        L_0x00a0:
            boolean r0 = r15.k1
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 == 0) goto L_0x00c1
            long r3 = r12.presentationTimeUs
            r6 = 0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x00c1
            int r0 = r12.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00c1
            long r3 = r15.E1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00c1
            long r3 = r15.F1
            r12.presentationTimeUs = r3
        L_0x00c1:
            long r3 = r12.presentationTimeUs
            long r6 = r15.w0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00cb
            r0 = r13
            goto L_0x00cc
        L_0x00cb:
            r0 = r14
        L_0x00cc:
            r15.s1 = r0
            long r6 = r15.F1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00da
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x00da
            r0 = r13
            goto L_0x00db
        L_0x00da:
            r0 = r14
        L_0x00db:
            r15.t1 = r0
            r15.y0(r3)
        L_0x00e0:
            boolean r0 = r15.j1
            if (r0 == 0) goto L_0x0129
            boolean r0 = r15.C1
            if (r0 == 0) goto L_0x0129
            java.nio.ByteBuffer r6 = r15.r1     // Catch:{ IllegalStateException -> 0x011c }
            int r7 = r15.q1     // Catch:{ IllegalStateException -> 0x011c }
            int r8 = r12.flags     // Catch:{ IllegalStateException -> 0x011c }
            long r10 = r12.presentationTimeUs     // Catch:{ IllegalStateException -> 0x011c }
            boolean r9 = r15.s1     // Catch:{ IllegalStateException -> 0x011c }
            boolean r3 = r15.t1     // Catch:{ IllegalStateException -> 0x011c }
            qy5 r4 = r15.O0     // Catch:{ IllegalStateException -> 0x011c }
            r4.getClass()     // Catch:{ IllegalStateException -> 0x011c }
            r16 = 1
            r0 = r21
            r1 = r22
            r17 = r3
            r18 = r4
            r3 = r24
            r19 = r9
            r9 = r16
            r20 = r12
            r12 = r19
            r16 = r13
            r13 = r17
            r17 = r14
            r14 = r18
            boolean r0 = r0.l0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x011e }
            r15 = r20
            goto L_0x0155
        L_0x011c:
            r17 = r14
        L_0x011e:
            r21.k0()
            boolean r0 = r15.H1
            if (r0 == 0) goto L_0x0128
            r21.n0()
        L_0x0128:
            return r17
        L_0x0129:
            r20 = r12
            r16 = r13
            r17 = r14
            java.nio.ByteBuffer r6 = r15.r1
            int r7 = r15.q1
            r14 = r20
            int r8 = r14.flags
            long r10 = r14.presentationTimeUs
            boolean r12 = r15.s1
            boolean r13 = r15.t1
            qy5 r9 = r15.O0
            r9.getClass()
            r18 = 1
            r0 = r21
            r1 = r22
            r3 = r24
            r19 = r9
            r9 = r18
            r15 = r14
            r14 = r19
            boolean r0 = r0.l0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x0155:
            if (r0 == 0) goto L_0x0176
            long r0 = r15.presentationTimeUs
            r2 = r21
            r3 = r15
            r2.g0(r0)
            int r0 = r3.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0168
            r14 = r16
            goto L_0x016a
        L_0x0168:
            r14 = r17
        L_0x016a:
            r0 = -1
            r2.q1 = r0
            r0 = 0
            r2.r1 = r0
            if (r14 != 0) goto L_0x0173
            return r16
        L_0x0173:
            r21.k0()
        L_0x0176:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g88.L(long, long):boolean");
    }

    public final boolean M() {
        s78 s78 = this.W0;
        if (s78 == null || this.z1 == 2 || this.G1) {
            return false;
        }
        int i = this.p1;
        p54 p54 = this.H0;
        if (i < 0) {
            int e = s78.e();
            this.p1 = e;
            if (e < 0) {
                return false;
            }
            p54.X = s78.getInputBuffer(e);
            p54.v();
        }
        if (this.z1 == 1) {
            if (!this.n1) {
                this.C1 = true;
                s78.a(0, this.p1, 0, 4);
                this.p1 = -1;
                p54.X = null;
            }
            this.z1 = 2;
            return false;
        } else if (this.l1) {
            this.l1 = false;
            ByteBuffer byteBuffer = p54.X;
            byteBuffer.getClass();
            byteBuffer.put(P1);
            s78.a(0, this.p1, 38, 0);
            this.p1 = -1;
            p54.X = null;
            this.B1 = true;
            return true;
        } else {
            if (this.y1 == 1) {
                int i2 = 0;
                while (true) {
                    qy5 qy5 = this.X0;
                    qy5.getClass();
                    if (i2 >= qy5.q.size()) {
                        break;
                    }
                    ByteBuffer byteBuffer2 = p54.X;
                    byteBuffer2.getClass();
                    byteBuffer2.put((byte[]) this.X0.q.get(i2));
                    i2++;
                }
                this.y1 = 2;
            }
            ByteBuffer byteBuffer3 = p54.X;
            byteBuffer3.getClass();
            int position = byteBuffer3.position();
            y7g y7g = this.c;
            y7g.t();
            try {
                int y = y(y7g, p54, 0);
                if (y == -3) {
                    if (l()) {
                        this.F1 = this.E1;
                    }
                    return false;
                } else if (y == -5) {
                    if (this.y1 == 2) {
                        p54.v();
                        this.y1 = 1;
                    }
                    d0(y7g);
                    return true;
                } else if (p54.f(4)) {
                    this.F1 = this.E1;
                    if (this.y1 == 2) {
                        p54.v();
                        this.y1 = 1;
                    }
                    this.G1 = true;
                    if (!this.B1) {
                        k0();
                        return false;
                    }
                    try {
                        if (!this.n1) {
                            this.C1 = true;
                            s78.a(0, this.p1, 0, 4);
                            this.p1 = -1;
                            p54.X = null;
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e2) {
                        throw e(e2, this.N0, false, oaf.x(e2.getErrorCode()));
                    }
                } else if (this.B1 || p54.f(1)) {
                    boolean f = p54.f(1073741824);
                    if (f) {
                        rz3 rz3 = p54.o;
                        if (position == 0) {
                            rz3.getClass();
                        } else {
                            if (((int[]) rz3.d) == null) {
                                int[] iArr = new int[1];
                                rz3.d = iArr;
                                ((MediaCodec.CryptoInfo) rz3.i).numBytesOfClearData = iArr;
                            }
                            int[] iArr2 = (int[]) rz3.d;
                            iArr2[0] = iArr2[0] + position;
                        }
                    }
                    if (this.f1 && !f) {
                        ByteBuffer byteBuffer4 = p54.X;
                        byteBuffer4.getClass();
                        int position2 = byteBuffer4.position();
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int i5 = i3 + 1;
                            if (i5 >= position2) {
                                byteBuffer4.clear();
                                break;
                            }
                            byte b = byteBuffer4.get(i3) & 255;
                            if (i4 == 3) {
                                if (b == 1 && (byteBuffer4.get(i5) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer4.duplicate();
                                    duplicate.position(i3 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer4.position(0);
                                    byteBuffer4.put(duplicate);
                                    break;
                                }
                            } else if (b == 0) {
                                i4++;
                            }
                            if (b != 0) {
                                i4 = 0;
                            }
                            i3 = i5;
                        }
                        ByteBuffer byteBuffer5 = p54.X;
                        byteBuffer5.getClass();
                        if (byteBuffer5.position() == 0) {
                            return true;
                        }
                        this.f1 = false;
                    }
                    long j = p54.Z;
                    if (this.I1) {
                        ArrayDeque arrayDeque = this.L0;
                        if (!arrayDeque.isEmpty()) {
                            due due = ((e88) arrayDeque.peekLast()).d;
                            qy5 qy52 = this.N0;
                            qy52.getClass();
                            due.a(j, qy52);
                        } else {
                            due due2 = this.M1.d;
                            qy5 qy53 = this.N0;
                            qy53.getClass();
                            due2.a(j, qy53);
                        }
                        this.I1 = false;
                    }
                    this.E1 = Math.max(this.E1, j);
                    if (l() || p54.f(536870912)) {
                        this.F1 = this.E1;
                    }
                    p54.y();
                    if (p54.f(268435456)) {
                        V(p54);
                    }
                    i0(p54);
                    int Q = Q(p54);
                    if (f) {
                        try {
                            s78.i(this.p1, p54.o, j, Q);
                        } catch (MediaCodec.CryptoException e3) {
                            throw e(e3, this.N0, false, oaf.x(e3.getErrorCode()));
                        }
                    } else {
                        int i6 = this.p1;
                        ByteBuffer byteBuffer6 = p54.X;
                        byteBuffer6.getClass();
                        s78.a(j, i6, byteBuffer6.limit(), Q);
                    }
                    this.p1 = -1;
                    p54.X = null;
                    this.B1 = true;
                    this.y1 = 0;
                    this.L1.d++;
                    return true;
                } else {
                    p54.v();
                    if (this.y1 == 2) {
                        this.y1 = 1;
                    }
                    return true;
                }
            } catch (DecoderInputBuffer$InsufficientCapacityException e4) {
                a0(e4);
                m0(0);
                N();
                return true;
            }
        }
    }

    public final void N() {
        try {
            s78 s78 = this.W0;
            fm9.l(s78);
            s78.flush();
        } finally {
            p0();
        }
    }

    public final boolean O() {
        if (this.W0 == null) {
            return false;
        }
        int i = this.A1;
        if (i == 3 || this.g1 || ((this.h1 && !this.D1) || (this.i1 && this.C1))) {
            n0();
            return true;
        }
        if (i == 2) {
            int i2 = oaf.a;
            fm9.k(i2 >= 23);
            if (i2 >= 23) {
                try {
                    x0();
                } catch (ExoPlaybackException e) {
                    z04.d0("Failed to update the DRM session, releasing the codec instead.", e);
                    n0();
                    return true;
                }
            }
        }
        N();
        return false;
    }

    public final List P(boolean z) {
        qy5 qy5 = this.N0;
        qy5.getClass();
        xw0 xw0 = this.D0;
        ArrayList T = T(xw0, qy5, z);
        if (T.isEmpty() && z) {
            T = T(xw0, qy5, false);
            if (!T.isEmpty()) {
                z04.c0("Drm session requires secure decoder for " + qy5.n + ", but no secure decoder available. Trying to proceed with " + T + ".");
            }
        }
        return T;
    }

    public int Q(p54 p54) {
        return 0;
    }

    public boolean R() {
        return false;
    }

    public abstract float S(float f, qy5[] qy5Arr);

    public abstract ArrayList T(xw0 xw0, qy5 qy5, boolean z);

    public abstract o78 U(y78 y78, qy5 qy5, MediaCrypto mediaCrypto, float f);

    public abstract void V(p54 p54);

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0182, code lost:
        if ("stvm8".equals(r7) == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0192, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r4) == false) goto L_0x0196;
     */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void W(defpackage.y78 r17, android.media.MediaCrypto r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r2 = "createCodec:"
            qy5 r3 = r0.N0
            r3.getClass()
            java.lang.String r4 = r1.a
            int r5 = defpackage.oaf.a
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7 = 23
            if (r5 >= r7) goto L_0x0017
            r8 = r6
            goto L_0x0022
        L_0x0017:
            float r8 = r0.V0
            qy5[] r9 = r0.u0
            r9.getClass()
            float r8 = r0.S(r8, r9)
        L_0x0022:
            float r9 = r0.F0
            int r9 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r9 > 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r6 = r8
        L_0x002a:
            r0.j0(r3)
            she r8 = r0.Z
            r8.getClass()
            long r8 = android.os.SystemClock.elapsedRealtime()
            r10 = r18
            o78 r10 = r0.U(r1, r3, r10, r6)
            r11 = 31
            if (r5 < r11) goto L_0x0048
            j4b r11 = r0.Y
            r11.getClass()
            defpackage.c88.a(r10, r11)
        L_0x0048:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x006d }
            r11.<init>(r2)     // Catch:{ all -> 0x006d }
            r11.append(r4)     // Catch:{ all -> 0x006d }
            java.lang.String r2 = r11.toString()     // Catch:{ all -> 0x006d }
            android.os.Trace.beginSection(r2)     // Catch:{ all -> 0x006d }
            q78 r2 = r0.C0     // Catch:{ all -> 0x006d }
            s78 r2 = r2.i(r10)     // Catch:{ all -> 0x006d }
            r0.W0 = r2     // Catch:{ all -> 0x006d }
            r10 = 21
            if (r5 < r10) goto L_0x0070
            d88 r13 = new d88     // Catch:{ all -> 0x006d }
            r13.<init>(r0)     // Catch:{ all -> 0x006d }
            boolean r2 = defpackage.a88.a(r2, r13)     // Catch:{ all -> 0x006d }
            goto L_0x0070
        L_0x006d:
            r0 = move-exception
            goto L_0x027d
        L_0x0070:
            android.os.Trace.endSection()
            she r2 = r0.Z
            r2.getClass()
            long r13 = android.os.SystemClock.elapsedRealtime()
            boolean r2 = r1.d(r3)
            if (r2 != 0) goto L_0x00a6
            java.lang.String r2 = defpackage.qy5.e(r3)
            java.util.Locale r15 = java.util.Locale.US
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            java.lang.String r11 = "Format exceeds selected codec's capabilities ["
            r15.<init>(r11)
            r15.append(r2)
            java.lang.String r2 = ", "
            r15.append(r2)
            r15.append(r4)
            java.lang.String r2 = "]"
            r15.append(r2)
            java.lang.String r2 = r15.toString()
            defpackage.z04.c0(r2)
        L_0x00a6:
            r0.d1 = r1
            r0.a1 = r6
            r0.X0 = r3
            r2 = 2
            java.lang.String r3 = "OMX.Exynos.avc.dec.secure"
            r6 = 25
            if (r5 > r6) goto L_0x00dd
            boolean r11 = r3.equals(r4)
            if (r11 == 0) goto L_0x00dd
            java.lang.String r11 = defpackage.oaf.d
            java.lang.String r15 = "SM-T585"
            boolean r15 = r11.startsWith(r15)
            if (r15 != 0) goto L_0x00db
            java.lang.String r15 = "SM-A510"
            boolean r15 = r11.startsWith(r15)
            if (r15 != 0) goto L_0x00db
            java.lang.String r15 = "SM-A520"
            boolean r15 = r11.startsWith(r15)
            if (r15 != 0) goto L_0x00db
            java.lang.String r15 = "SM-J700"
            boolean r11 = r11.startsWith(r15)
            if (r11 == 0) goto L_0x00dd
        L_0x00db:
            r11 = r2
            goto L_0x0116
        L_0x00dd:
            r11 = 24
            if (r5 >= r11) goto L_0x0115
            java.lang.String r11 = "OMX.Nvidia.h264.decode"
            boolean r11 = r11.equals(r4)
            if (r11 != 0) goto L_0x00f1
            java.lang.String r11 = "OMX.Nvidia.h264.decode.secure"
            boolean r11 = r11.equals(r4)
            if (r11 == 0) goto L_0x0115
        L_0x00f1:
            java.lang.String r11 = defpackage.oaf.b
            java.lang.String r15 = "flounder"
            boolean r15 = r15.equals(r11)
            if (r15 != 0) goto L_0x0113
            java.lang.String r15 = "flounder_lte"
            boolean r15 = r15.equals(r11)
            if (r15 != 0) goto L_0x0113
            java.lang.String r15 = "grouper"
            boolean r15 = r15.equals(r11)
            if (r15 != 0) goto L_0x0113
            java.lang.String r15 = "tilapia"
            boolean r11 = r15.equals(r11)
            if (r11 == 0) goto L_0x0115
        L_0x0113:
            r11 = 1
            goto L_0x0116
        L_0x0115:
            r11 = 0
        L_0x0116:
            r0.e1 = r11
            qy5 r11 = r0.X0
            r11.getClass()
            if (r5 >= r10) goto L_0x0131
            java.util.List r11 = r11.q
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0131
            java.lang.String r11 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r11 = r11.equals(r4)
            if (r11 == 0) goto L_0x0131
            r11 = 1
            goto L_0x0132
        L_0x0131:
            r11 = 0
        L_0x0132:
            r0.f1 = r11
            r11 = 19
            if (r5 != r11) goto L_0x0152
            java.lang.String r15 = defpackage.oaf.d
            java.lang.String r12 = "SM-G800"
            boolean r12 = r15.startsWith(r12)
            if (r12 == 0) goto L_0x0152
            java.lang.String r12 = "OMX.Exynos.avc.dec"
            boolean r12 = r12.equals(r4)
            if (r12 != 0) goto L_0x0150
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0152
        L_0x0150:
            r3 = 1
            goto L_0x0153
        L_0x0152:
            r3 = 0
        L_0x0153:
            r0.g1 = r3
            r3 = 29
            if (r5 != r3) goto L_0x0163
            java.lang.String r12 = "c2.android.aac.decoder"
            boolean r12 = r12.equals(r4)
            if (r12 == 0) goto L_0x0163
            r12 = 1
            goto L_0x0164
        L_0x0163:
            r12 = 0
        L_0x0164:
            r0.h1 = r12
            if (r5 > r7) goto L_0x0170
            java.lang.String r7 = "OMX.google.vorbis.decoder"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x0194
        L_0x0170:
            if (r5 != r11) goto L_0x0196
            java.lang.String r7 = defpackage.oaf.b
            java.lang.String r11 = "hb2000"
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x0184
            java.lang.String r11 = "stvm8"
            boolean r7 = r11.equals(r7)
            if (r7 == 0) goto L_0x0196
        L_0x0184:
            java.lang.String r7 = "OMX.amlogic.avc.decoder.awesome"
            boolean r7 = r7.equals(r4)
            if (r7 != 0) goto L_0x0194
            java.lang.String r7 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x0196
        L_0x0194:
            r7 = 1
            goto L_0x0197
        L_0x0196:
            r7 = 0
        L_0x0197:
            r0.i1 = r7
            if (r5 != r10) goto L_0x01a5
            java.lang.String r7 = "OMX.google.aac.decoder"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x01a5
            r7 = 1
            goto L_0x01a6
        L_0x01a5:
            r7 = 0
        L_0x01a6:
            r0.j1 = r7
            if (r5 >= r10) goto L_0x01f0
            java.lang.String r7 = "OMX.SEC.mp3.dec"
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L_0x01f0
            java.lang.String r7 = "samsung"
            java.lang.String r10 = defpackage.oaf.c
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x01f0
            java.lang.String r7 = defpackage.oaf.b
            java.lang.String r10 = "baffin"
            boolean r10 = r7.startsWith(r10)
            if (r10 != 0) goto L_0x01ee
            java.lang.String r10 = "grand"
            boolean r10 = r7.startsWith(r10)
            if (r10 != 0) goto L_0x01ee
            java.lang.String r10 = "fortuna"
            boolean r10 = r7.startsWith(r10)
            if (r10 != 0) goto L_0x01ee
            java.lang.String r10 = "gprimelte"
            boolean r10 = r7.startsWith(r10)
            if (r10 != 0) goto L_0x01ee
            java.lang.String r10 = "j2y18lte"
            boolean r10 = r7.startsWith(r10)
            if (r10 != 0) goto L_0x01ee
            java.lang.String r10 = "ms01"
            boolean r7 = r7.startsWith(r10)
            if (r7 == 0) goto L_0x01f0
        L_0x01ee:
            r7 = 1
            goto L_0x01f1
        L_0x01f0:
            r7 = 0
        L_0x01f1:
            r0.k1 = r7
            java.lang.String r7 = r1.a
            if (r5 > r6) goto L_0x01ff
            java.lang.String r6 = "OMX.rk.video_decoder.avc"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L_0x0250
        L_0x01ff:
            if (r5 > r3) goto L_0x0231
            java.lang.String r3 = "OMX.broadcom.video_decoder.tunnel"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
            java.lang.String r3 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
            java.lang.String r3 = "OMX.bcm.vdec.avc.tunnel"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
            java.lang.String r3 = "OMX.bcm.vdec.avc.tunnel.secure"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
            java.lang.String r3 = "OMX.bcm.vdec.hevc.tunnel"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
            java.lang.String r3 = "OMX.bcm.vdec.hevc.tunnel.secure"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0250
        L_0x0231:
            java.lang.String r3 = "Amazon"
            java.lang.String r5 = defpackage.oaf.c
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x024a
            java.lang.String r3 = "AFTS"
            java.lang.String r5 = defpackage.oaf.d
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x024a
            boolean r1 = r1.f
            if (r1 == 0) goto L_0x024a
            goto L_0x0250
        L_0x024a:
            boolean r1 = r16.R()
            if (r1 == 0) goto L_0x0252
        L_0x0250:
            r11 = 1
            goto L_0x0253
        L_0x0252:
            r11 = 0
        L_0x0253:
            r0.n1 = r11
            s78 r1 = r0.W0
            r1.getClass()
            int r1 = r0.s0
            if (r1 != r2) goto L_0x026c
            she r1 = r0.Z
            r1.getClass()
            long r1 = android.os.SystemClock.elapsedRealtime()
            r5 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 + r5
            r0.o1 = r1
        L_0x026c:
            n54 r1 = r0.L1
            int r2 = r1.b
            r3 = 1
            int r2 = r2 + r3
            r1.b = r2
            long r5 = r13 - r8
            r1 = r16
            r2 = r13
            r1.b0(r2, r4, r5)
            return
        L_0x027d:
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g88.W(y78, android.media.MediaCrypto):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.O0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean X(long r2, long r4) {
        /*
            r1 = this;
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x001d
            qy5 r1 = r1.O0
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = r1.n
            java.lang.String r0 = "audio/opus"
            boolean r1 = java.util.Objects.equals(r1, r0)
            if (r1 == 0) goto L_0x001b
            long r2 = r2 - r4
            r4 = 80000(0x13880, double:3.95253E-319)
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r1 = 1
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g88.X(long, long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0076, code lost:
        if (r6 != 4) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        if (r1.d() != null) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Y() {
        /*
            r8 = this;
            s78 r0 = r8.W0
            if (r0 != 0) goto L_0x00da
            boolean r0 = r8.u1
            if (r0 != 0) goto L_0x00da
            qy5 r0 = r8.N0
            if (r0 != 0) goto L_0x000e
            goto L_0x00da
        L_0x000e:
            fr4 r1 = r8.Q0
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x001c
            boolean r1 = r8.u0(r0)
            if (r1 == 0) goto L_0x001c
            r1 = r3
            goto L_0x001d
        L_0x001c:
            r1 = r2
        L_0x001d:
            java.lang.String r4 = r0.n
            if (r1 == 0) goto L_0x004e
            r8.J()
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r4)
            el0 r1 = r8.J0
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0044
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0044
            r1.getClass()
            r1.x0 = r3
            goto L_0x004b
        L_0x0044:
            r1.getClass()
            r0 = 32
            r1.x0 = r0
        L_0x004b:
            r8.u1 = r3
            return
        L_0x004e:
            fr4 r1 = r8.Q0
            r8.r0(r1)
            fr4 r1 = r8.P0
            if (r1 == 0) goto L_0x00ae
            android.media.MediaCrypto r1 = r8.S0
            if (r1 != 0) goto L_0x005d
            r1 = r3
            goto L_0x005e
        L_0x005d:
            r1 = r2
        L_0x005e:
            defpackage.fm9.k(r1)
            fr4 r1 = r8.P0
            qz3 r5 = r1.e()
            boolean r6 = defpackage.b36.c
            if (r6 == 0) goto L_0x0089
            boolean r6 = r5 instanceof defpackage.b36
            if (r6 == 0) goto L_0x0089
            int r6 = r1.getState()
            if (r6 == r3) goto L_0x0079
            r7 = 4
            if (r6 == r7) goto L_0x0089
            goto L_0x00c4
        L_0x0079:
            androidx.media3.exoplayer.drm.DrmSession$DrmSessionException r0 = r1.d()
            r0.getClass()
            qy5 r1 = r8.N0
            int r3 = r0.a
            androidx.media3.exoplayer.ExoPlaybackException r8 = r8.e(r0, r1, r2, r3)
            throw r8
        L_0x0089:
            if (r5 != 0) goto L_0x0092
            androidx.media3.exoplayer.drm.DrmSession$DrmSessionException r1 = r1.d()
            if (r1 == 0) goto L_0x00c4
            goto L_0x00ae
        L_0x0092:
            boolean r1 = r5 instanceof defpackage.b36
            if (r1 == 0) goto L_0x00ae
            b36 r5 = (defpackage.b36) r5
            android.media.MediaCrypto r1 = new android.media.MediaCrypto     // Catch:{ MediaCryptoException -> 0x00a4 }
            java.util.UUID r6 = r5.a     // Catch:{ MediaCryptoException -> 0x00a4 }
            byte[] r5 = r5.b     // Catch:{ MediaCryptoException -> 0x00a4 }
            r1.<init>(r6, r5)     // Catch:{ MediaCryptoException -> 0x00a4 }
            r8.S0 = r1     // Catch:{ MediaCryptoException -> 0x00a4 }
            goto L_0x00ae
        L_0x00a4:
            r0 = move-exception
            qy5 r1 = r8.N0
            r3 = 6006(0x1776, float:8.416E-42)
            androidx.media3.exoplayer.ExoPlaybackException r8 = r8.e(r0, r1, r2, r3)
            throw r8
        L_0x00ae:
            fr4 r1 = r8.P0     // Catch:{ MediaCodecRenderer$DecoderInitializationException -> 0x00bc }
            if (r1 == 0) goto L_0x00be
            defpackage.fm9.l(r4)     // Catch:{ MediaCodecRenderer$DecoderInitializationException -> 0x00bc }
            boolean r1 = r1.c(r4)     // Catch:{ MediaCodecRenderer$DecoderInitializationException -> 0x00bc }
            if (r1 == 0) goto L_0x00be
            goto L_0x00bf
        L_0x00bc:
            r1 = move-exception
            goto L_0x00d3
        L_0x00be:
            r3 = r2
        L_0x00bf:
            android.media.MediaCrypto r1 = r8.S0     // Catch:{ MediaCodecRenderer$DecoderInitializationException -> 0x00bc }
            r8.Z(r1, r3)     // Catch:{ MediaCodecRenderer$DecoderInitializationException -> 0x00bc }
        L_0x00c4:
            android.media.MediaCrypto r0 = r8.S0
            if (r0 == 0) goto L_0x00d2
            s78 r1 = r8.W0
            if (r1 != 0) goto L_0x00d2
            r0.release()
            r0 = 0
            r8.S0 = r0
        L_0x00d2:
            return
        L_0x00d3:
            r3 = 4001(0xfa1, float:5.607E-42)
            androidx.media3.exoplayer.ExoPlaybackException r8 = r8.e(r1, r0, r2, r3)
            throw r8
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g88.Y():void");
    }

    public final void Z(MediaCrypto mediaCrypto, boolean z) {
        String str;
        qy5 qy5 = this.N0;
        qy5.getClass();
        if (this.b1 == null) {
            try {
                List P = P(z);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.b1 = arrayDeque;
                if (this.E0) {
                    arrayDeque.addAll(P);
                } else if (!P.isEmpty()) {
                    this.b1.add((y78) P.get(0));
                }
                this.c1 = null;
            } catch (MediaCodecUtil$DecoderQueryException e) {
                throw new MediaCodecRenderer$DecoderInitializationException(qy5, e, z, -49998);
            }
        }
        if (!this.b1.isEmpty()) {
            ArrayDeque arrayDeque2 = this.b1;
            arrayDeque2.getClass();
            while (this.W0 == null) {
                y78 y78 = (y78) arrayDeque2.peekFirst();
                y78.getClass();
                if (t0(y78)) {
                    try {
                        W(y78, mediaCrypto);
                    } catch (Exception e2) {
                        z04.d0("Failed to initialize decoder: " + y78, e2);
                        arrayDeque2.removeFirst();
                        String str2 = "Decoder init failed: " + y78.a + ", " + qy5;
                        if (oaf.a >= 21) {
                            str = e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null;
                        } else {
                            str = null;
                        }
                        MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException(str2, e2, qy5.n, z, y78, str);
                        a0(mediaCodecRenderer$DecoderInitializationException);
                        MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException2 = this.c1;
                        if (mediaCodecRenderer$DecoderInitializationException2 == null) {
                            this.c1 = mediaCodecRenderer$DecoderInitializationException;
                        } else {
                            this.c1 = new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException2.getMessage(), mediaCodecRenderer$DecoderInitializationException2.getCause(), mediaCodecRenderer$DecoderInitializationException2.a, mediaCodecRenderer$DecoderInitializationException2.b, mediaCodecRenderer$DecoderInitializationException2.c, mediaCodecRenderer$DecoderInitializationException2.o);
                        }
                        if (arrayDeque2.isEmpty()) {
                            throw this.c1;
                        }
                    }
                } else {
                    return;
                }
            }
            this.b1 = null;
            return;
        }
        throw new MediaCodecRenderer$DecoderInitializationException(qy5, (MediaCodecUtil$DecoderQueryException) null, z, -49999);
    }

    public abstract void a0(Exception exc);

    public abstract void b0(long j, String str, long j2);

    public abstract void c0(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00cf, code lost:
        if (r4.c(r3) != false) goto L_0x018d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x010b, code lost:
        if (K() == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013e, code lost:
        if (K() == false) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0150, code lost:
        if (K() == false) goto L_0x0178;
     */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0182  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x018c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.s54 d0(defpackage.y7g r13) {
        /*
            r12 = this;
            r0 = 1
            r12.I1 = r0
            java.lang.Object r1 = r13.c
            qy5 r1 = (defpackage.qy5) r1
            r1.getClass()
            r2 = 0
            java.lang.String r3 = r1.n
            if (r3 == 0) goto L_0x01a8
            java.lang.String r4 = "video/av01"
            boolean r3 = r3.equals(r4)
            r4 = 0
            if (r3 == 0) goto L_0x002d
            java.util.List r3 = r1.q
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x002d
            ny5 r1 = r1.a()
            r1.p = r4
            qy5 r3 = new qy5
            r3.<init>(r1)
            r8 = r3
            goto L_0x002e
        L_0x002d:
            r8 = r1
        L_0x002e:
            java.lang.Object r13 = r13.b
            fr4 r13 = (defpackage.fr4) r13
            fr4 r1 = r12.Q0
            if (r1 != r13) goto L_0x0037
            goto L_0x0041
        L_0x0037:
            if (r13 == 0) goto L_0x003c
            r13.g(r4)
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.f(r4)
        L_0x0041:
            r12.Q0 = r13
            r12.N0 = r8
            boolean r13 = r12.u1
            if (r13 == 0) goto L_0x004c
            r12.w1 = r0
            return r4
        L_0x004c:
            s78 r13 = r12.W0
            if (r13 != 0) goto L_0x0056
            r12.b1 = r4
            r12.Y()
            return r4
        L_0x0056:
            y78 r1 = r12.d1
            r1.getClass()
            qy5 r7 = r12.X0
            r7.getClass()
            fr4 r3 = r12.P0
            fr4 r4 = r12.Q0
            r5 = 3
            r6 = 23
            if (r3 != r4) goto L_0x006b
            goto L_0x00d3
        L_0x006b:
            if (r4 == 0) goto L_0x018d
            if (r3 != 0) goto L_0x0071
            goto L_0x018d
        L_0x0071:
            qz3 r9 = r4.e()
            if (r9 != 0) goto L_0x0079
            goto L_0x018d
        L_0x0079:
            qz3 r10 = r3.e()
            if (r10 == 0) goto L_0x018d
            java.lang.Class r11 = r9.getClass()
            java.lang.Class r10 = r10.getClass()
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x008f
            goto L_0x018d
        L_0x008f:
            boolean r9 = r9 instanceof defpackage.b36
            if (r9 != 0) goto L_0x0094
            goto L_0x00d3
        L_0x0094:
            java.util.UUID r9 = r4.a()
            java.util.UUID r10 = r3.a()
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00a4
            goto L_0x018d
        L_0x00a4:
            int r9 = defpackage.oaf.a
            if (r9 >= r6) goto L_0x00aa
            goto L_0x018d
        L_0x00aa:
            java.util.UUID r9 = defpackage.ew0.e
            java.util.UUID r3 = r3.a()
            boolean r3 = r9.equals(r3)
            if (r3 != 0) goto L_0x018d
            java.util.UUID r3 = r4.a()
            boolean r3 = r9.equals(r3)
            if (r3 == 0) goto L_0x00c2
            goto L_0x018d
        L_0x00c2:
            boolean r3 = r1.f
            if (r3 != 0) goto L_0x00d3
            java.lang.String r3 = r8.n
            r3.getClass()
            boolean r3 = r4.c(r3)
            if (r3 == 0) goto L_0x00d3
            goto L_0x018d
        L_0x00d3:
            fr4 r3 = r12.Q0
            fr4 r4 = r12.P0
            if (r3 == r4) goto L_0x00db
            r3 = r0
            goto L_0x00dc
        L_0x00db:
            r3 = r2
        L_0x00dc:
            if (r3 == 0) goto L_0x00e5
            int r4 = defpackage.oaf.a
            if (r4 < r6) goto L_0x00e3
            goto L_0x00e5
        L_0x00e3:
            r4 = r2
            goto L_0x00e6
        L_0x00e5:
            r4 = r0
        L_0x00e6:
            defpackage.fm9.k(r4)
            s54 r4 = r12.G(r1, r7, r8)
            int r6 = r4.d
            if (r6 == 0) goto L_0x0168
            r9 = 16
            r10 = 2
            if (r6 == r0) goto L_0x0141
            if (r6 == r10) goto L_0x0115
            if (r6 != r5) goto L_0x010f
            boolean r0 = r12.w0(r8)
            if (r0 != 0) goto L_0x0103
        L_0x0100:
            r10 = r9
            goto L_0x0178
        L_0x0103:
            r12.X0 = r8
            if (r3 == 0) goto L_0x0177
            boolean r0 = r12.K()
            if (r0 != 0) goto L_0x0177
            goto L_0x0178
        L_0x010f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x0115:
            boolean r11 = r12.w0(r8)
            if (r11 != 0) goto L_0x011c
            goto L_0x0100
        L_0x011c:
            r12.x1 = r0
            r12.y1 = r0
            int r9 = r12.e1
            if (r9 == r10) goto L_0x0134
            if (r9 != r0) goto L_0x0133
            int r9 = r8.t
            int r11 = r7.t
            if (r9 != r11) goto L_0x0133
            int r9 = r8.u
            int r11 = r7.u
            if (r9 != r11) goto L_0x0133
            goto L_0x0134
        L_0x0133:
            r0 = r2
        L_0x0134:
            r12.l1 = r0
            r12.X0 = r8
            if (r3 == 0) goto L_0x0177
            boolean r0 = r12.K()
            if (r0 != 0) goto L_0x0177
            goto L_0x0178
        L_0x0141:
            boolean r11 = r12.w0(r8)
            if (r11 != 0) goto L_0x0148
            goto L_0x0100
        L_0x0148:
            r12.X0 = r8
            if (r3 == 0) goto L_0x0153
            boolean r0 = r12.K()
            if (r0 != 0) goto L_0x0177
            goto L_0x0178
        L_0x0153:
            boolean r3 = r12.B1
            if (r3 == 0) goto L_0x0177
            r12.z1 = r0
            boolean r3 = r12.g1
            if (r3 != 0) goto L_0x0165
            boolean r3 = r12.i1
            if (r3 == 0) goto L_0x0162
            goto L_0x0165
        L_0x0162:
            r12.A1 = r0
            goto L_0x0177
        L_0x0165:
            r12.A1 = r5
            goto L_0x0178
        L_0x0168:
            boolean r3 = r12.B1
            if (r3 == 0) goto L_0x0171
            r12.z1 = r0
            r12.A1 = r5
            goto L_0x0177
        L_0x0171:
            r12.n0()
            r12.Y()
        L_0x0177:
            r10 = r2
        L_0x0178:
            if (r6 == 0) goto L_0x018c
            s78 r0 = r12.W0
            if (r0 != r13) goto L_0x0182
            int r12 = r12.A1
            if (r12 != r5) goto L_0x018c
        L_0x0182:
            s54 r12 = new s54
            java.lang.String r6 = r1.a
            r9 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            return r12
        L_0x018c:
            return r4
        L_0x018d:
            boolean r13 = r12.B1
            if (r13 == 0) goto L_0x0196
            r12.z1 = r0
            r12.A1 = r5
            goto L_0x019c
        L_0x0196:
            r12.n0()
            r12.Y()
        L_0x019c:
            s54 r12 = new s54
            r10 = 128(0x80, float:1.794E-43)
            java.lang.String r6 = r1.a
            r9 = 0
            r5 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            return r12
        L_0x01a8:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Sample MIME type is null."
            r13.<init>(r0)
            r0 = 4005(0xfa5, float:5.612E-42)
            androidx.media3.exoplayer.ExoPlaybackException r12 = r12.e(r13, r1, r2, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g88.d0(y7g):s54");
    }

    public abstract void e0(qy5 qy5, MediaFormat mediaFormat);

    public void f0() {
    }

    public void g0(long j) {
        this.N1 = j;
        while (true) {
            ArrayDeque arrayDeque = this.L0;
            if (!arrayDeque.isEmpty() && j >= ((e88) arrayDeque.peek()).a) {
                e88 e88 = (e88) arrayDeque.poll();
                e88.getClass();
                s0(e88);
                h0();
            } else {
                return;
            }
        }
    }

    public abstract void h0();

    public void i0(p54 p54) {
    }

    public void j0(qy5 qy5) {
    }

    public final void k0() {
        int i = this.A1;
        if (i == 1) {
            N();
        } else if (i == 2) {
            N();
            x0();
        } else if (i != 3) {
            this.H1 = true;
            o0();
        } else {
            n0();
            Y();
        }
    }

    public abstract boolean l0(long j, long j2, s78 s78, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, qy5 qy5);

    public final boolean m0(int i) {
        y7g y7g = this.c;
        y7g.t();
        p54 p54 = this.G0;
        p54.v();
        int y = y(y7g, p54, i | 4);
        if (y == -5) {
            d0(y7g);
            return true;
        } else if (y != -4 || !p54.f(4)) {
            return false;
        } else {
            this.G1 = true;
            k0();
            return false;
        }
    }

    public final void n0() {
        try {
            s78 s78 = this.W0;
            if (s78 != null) {
                s78.release();
                this.L1.c++;
                y78 y78 = this.d1;
                y78.getClass();
                c0(y78.a);
            }
            this.W0 = null;
            try {
                MediaCrypto mediaCrypto = this.S0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.S0 = null;
                r0((fr4) null);
                q0();
            }
        } catch (Throwable th) {
            this.W0 = null;
            MediaCrypto mediaCrypto2 = this.S0;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.S0 = null;
            r0((fr4) null);
            q0();
        }
    }

    public boolean o() {
        boolean z;
        if (this.N0 == null) {
            return false;
        }
        if (l()) {
            z = this.y0;
        } else {
            grc grc = this.t0;
            grc.getClass();
            z = grc.d();
        }
        if (!z) {
            if (!(this.q1 >= 0)) {
                if (this.o1 == -9223372036854775807L) {
                    return false;
                }
                this.Z.getClass();
                if (SystemClock.elapsedRealtime() >= this.o1) {
                    return false;
                }
            }
        }
        return true;
    }

    public void o0() {
    }

    public void p() {
        this.N0 = null;
        s0(e88.e);
        this.L0.clear();
        O();
    }

    public void p0() {
        this.p1 = -1;
        this.H0.X = null;
        this.q1 = -1;
        this.r1 = null;
        this.o1 = -9223372036854775807L;
        this.C1 = false;
        this.B1 = false;
        this.l1 = false;
        this.m1 = false;
        this.s1 = false;
        this.t1 = false;
        this.E1 = -9223372036854775807L;
        this.F1 = -9223372036854775807L;
        this.N1 = -9223372036854775807L;
        this.z1 = 0;
        this.A1 = 0;
        this.y1 = this.x1 ? 1 : 0;
    }

    public final void q0() {
        p0();
        this.K1 = null;
        this.b1 = null;
        this.d1 = null;
        this.X0 = null;
        this.Y0 = null;
        this.Z0 = false;
        this.D1 = false;
        this.a1 = -1.0f;
        this.e1 = 0;
        this.f1 = false;
        this.g1 = false;
        this.h1 = false;
        this.i1 = false;
        this.j1 = false;
        this.k1 = false;
        this.n1 = false;
        this.x1 = false;
        this.y1 = 0;
    }

    public void r(long j, boolean z) {
        this.G1 = false;
        this.H1 = false;
        this.J1 = false;
        if (this.u1) {
            this.J0.v();
            this.I0.v();
            this.v1 = false;
            l2a l2a = this.M0;
            l2a.getClass();
            l2a.o = m60.a;
            l2a.c = 0;
            l2a.b = 2;
        } else if (O()) {
            Y();
        }
        if (this.M1.d.h() > 0) {
            this.I1 = true;
        }
        this.M1.d.b();
        this.L0.clear();
    }

    public final void r0(fr4 fr4) {
        fr4 fr42 = this.P0;
        if (fr42 != fr4) {
            if (fr4 != null) {
                fr4.g((lr4) null);
            }
            if (fr42 != null) {
                fr42.f((lr4) null);
            }
        }
        this.P0 = fr4;
    }

    public final void s0(e88 e88) {
        this.M1 = e88;
        if (e88.c != -9223372036854775807L) {
            this.O1 = true;
            f0();
        }
    }

    public boolean t0(y78 y78) {
        return true;
    }

    public boolean u0(qy5 qy5) {
        return false;
    }

    public abstract int v0(xw0 xw0, qy5 qy5);

    public final boolean w0(qy5 qy5) {
        if (!(oaf.a < 23 || this.W0 == null || this.A1 == 3 || this.s0 == 0)) {
            float f = this.V0;
            qy5.getClass();
            qy5[] qy5Arr = this.u0;
            qy5Arr.getClass();
            float S = S(f, qy5Arr);
            float f2 = this.a1;
            if (f2 == S) {
                return true;
            }
            if (S == -1.0f) {
                if (this.B1) {
                    this.z1 = 1;
                    this.A1 = 3;
                    return false;
                }
                n0();
                Y();
                return false;
            } else if (f2 == -1.0f && S <= this.F0) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", S);
                s78 s78 = this.W0;
                s78.getClass();
                s78.setParameters(bundle);
                this.a1 = S;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0036, code lost:
        if (r7 >= r5) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(defpackage.qy5[] r13, long r14, long r16) {
        /*
            r12 = this;
            r0 = r12
            e88 r1 = r0.M1
            long r1 = r1.c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0020
            e88 r1 = new e88
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.s0(r1)
            goto L_0x0063
        L_0x0020:
            java.util.ArrayDeque r1 = r0.L0
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x0055
            long r5 = r0.E1
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0038
            long r7 = r0.N1
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x0055
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x0055
        L_0x0038:
            e88 r1 = new e88
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.s0(r1)
            e88 r1 = r0.M1
            long r1 = r1.c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0063
            r12.h0()
            goto L_0x0063
        L_0x0055:
            e88 r9 = new e88
            long r3 = r0.E1
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g88.x(qy5[], long, long):void");
    }

    public final void x0() {
        fr4 fr4 = this.Q0;
        fr4.getClass();
        qz3 e = fr4.e();
        if (e instanceof b36) {
            try {
                MediaCrypto mediaCrypto = this.S0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(((b36) e).b);
            } catch (MediaCryptoException e2) {
                throw e(e2, this.N0, false, 6006);
            }
        }
        r0(this.Q0);
        this.z1 = 0;
        this.A1 = 0;
    }

    public final void y0(long j) {
        qy5 qy5 = (qy5) this.M1.d.f(j);
        if (qy5 == null && this.O1 && this.Y0 != null) {
            qy5 = (qy5) this.M1.d.e();
        }
        if (qy5 != null) {
            this.O0 = qy5;
        } else if (!this.Z0 || this.O0 == null) {
            return;
        }
        qy5 qy52 = this.O0;
        qy52.getClass();
        e0(qy52, this.Y0);
        this.Z0 = false;
        this.O1 = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0075 A[Catch:{ IllegalStateException -> 0x0017 }, LOOP:1: B:28:0x0050->B:38:0x0075, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0096 A[Catch:{ IllegalStateException -> 0x0017 }, LOOP:2: B:39:0x0076->B:49:0x0096, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0076 A[EDGE_INSN: B:84:0x0076->B:88:0x0076 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0097 A[EDGE_INSN: B:86:0x0097->B:50:0x0097 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void z(long r12, long r14) {
        /*
            r11 = this;
            boolean r0 = r11.J1
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r11.J1 = r1
            r11.k0()
        L_0x000a:
            androidx.media3.exoplayer.ExoPlaybackException r0 = r11.K1
            if (r0 != 0) goto L_0x0109
            r0 = 1
            boolean r2 = r11.H1     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x001a
            r11.o0()     // Catch:{ IllegalStateException -> 0x0017 }
            return
        L_0x0017:
            r12 = move-exception
            goto L_0x00b6
        L_0x001a:
            qy5 r2 = r11.N0     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 != 0) goto L_0x0026
            r2 = 2
            boolean r2 = r11.m0(r2)     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 != 0) goto L_0x0026
            return
        L_0x0026:
            r11.Y()     // Catch:{ IllegalStateException -> 0x0017 }
            boolean r2 = r11.u1     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x003e
            java.lang.String r2 = "bypassRender"
            android.os.Trace.beginSection(r2)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x0032:
            boolean r2 = r11.F(r12, r14)     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x0039
            goto L_0x0032
        L_0x0039:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x0017 }
            goto L_0x00b1
        L_0x003e:
            s78 r2 = r11.W0     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x009b
            she r2 = r11.Z     // Catch:{ IllegalStateException -> 0x0017 }
            r2.getClass()     // Catch:{ IllegalStateException -> 0x0017 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            java.lang.String r4 = "drainAndFeed"
            android.os.Trace.beginSection(r4)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x0050:
            boolean r4 = r11.L(r12, r14)     // Catch:{ IllegalStateException -> 0x0017 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x0076
            long r7 = r11.T0     // Catch:{ IllegalStateException -> 0x0017 }
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0072
            she r4 = r11.Z     // Catch:{ IllegalStateException -> 0x0017 }
            r4.getClass()     // Catch:{ IllegalStateException -> 0x0017 }
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            long r9 = r9 - r2
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0070
            goto L_0x0072
        L_0x0070:
            r4 = r1
            goto L_0x0073
        L_0x0072:
            r4 = r0
        L_0x0073:
            if (r4 == 0) goto L_0x0076
            goto L_0x0050
        L_0x0076:
            boolean r12 = r11.M()     // Catch:{ IllegalStateException -> 0x0017 }
            if (r12 == 0) goto L_0x0097
            long r12 = r11.T0     // Catch:{ IllegalStateException -> 0x0017 }
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x0093
            she r14 = r11.Z     // Catch:{ IllegalStateException -> 0x0017 }
            r14.getClass()     // Catch:{ IllegalStateException -> 0x0017 }
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            long r14 = r14 - r2
            int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x0091
            goto L_0x0093
        L_0x0091:
            r12 = r1
            goto L_0x0094
        L_0x0093:
            r12 = r0
        L_0x0094:
            if (r12 == 0) goto L_0x0097
            goto L_0x0076
        L_0x0097:
            android.os.Trace.endSection()     // Catch:{ IllegalStateException -> 0x0017 }
            goto L_0x00b1
        L_0x009b:
            n54 r14 = r11.L1     // Catch:{ IllegalStateException -> 0x0017 }
            int r15 = r14.e     // Catch:{ IllegalStateException -> 0x0017 }
            grc r2 = r11.t0     // Catch:{ IllegalStateException -> 0x0017 }
            r2.getClass()     // Catch:{ IllegalStateException -> 0x0017 }
            long r3 = r11.v0     // Catch:{ IllegalStateException -> 0x0017 }
            long r12 = r12 - r3
            int r12 = r2.e(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            int r15 = r15 + r12
            r14.e = r15     // Catch:{ IllegalStateException -> 0x0017 }
            r11.m0(r0)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x00b1:
            n54 r12 = r11.L1     // Catch:{ IllegalStateException -> 0x0017 }
            monitor-enter(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            monitor-exit(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            return
        L_0x00b6:
            int r13 = defpackage.oaf.a
            r14 = 21
            if (r13 < r14) goto L_0x00c1
            boolean r15 = r12 instanceof android.media.MediaCodec.CodecException
            if (r15 == 0) goto L_0x00c1
            goto L_0x00d6
        L_0x00c1:
            java.lang.StackTraceElement[] r15 = r12.getStackTrace()
            int r2 = r15.length
            if (r2 <= 0) goto L_0x0108
            r15 = r15[r1]
            java.lang.String r15 = r15.getClassName()
            java.lang.String r2 = "android.media.MediaCodec"
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto L_0x0108
        L_0x00d6:
            r11.a0(r12)
            if (r13 < r14) goto L_0x00eb
            boolean r13 = r12 instanceof android.media.MediaCodec.CodecException
            if (r13 == 0) goto L_0x00e7
            r13 = r12
            android.media.MediaCodec$CodecException r13 = (android.media.MediaCodec.CodecException) r13
            boolean r13 = r13.isRecoverable()
            goto L_0x00e8
        L_0x00e7:
            r13 = r1
        L_0x00e8:
            if (r13 == 0) goto L_0x00eb
            r1 = r0
        L_0x00eb:
            if (r1 == 0) goto L_0x00f0
            r11.n0()
        L_0x00f0:
            y78 r13 = r11.d1
            androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException r12 = r11.H(r12, r13)
            int r13 = r12.a
            r14 = 1101(0x44d, float:1.543E-42)
            if (r13 != r14) goto L_0x00ff
            r13 = 4006(0xfa6, float:5.614E-42)
            goto L_0x0101
        L_0x00ff:
            r13 = 4003(0xfa3, float:5.61E-42)
        L_0x0101:
            qy5 r14 = r11.N0
            androidx.media3.exoplayer.ExoPlaybackException r11 = r11.e(r12, r14, r1, r13)
            throw r11
        L_0x0108:
            throw r12
        L_0x0109:
            r12 = 0
            r11.K1 = r12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g88.z(long, long):void");
    }
}
