package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer$InsufficientCapacityException;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f88  reason: default package */
public abstract class f88 extends uj0 {
    public static final byte[] P1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final float A0;
    public int A1;
    public final o54 B0;
    public boolean B1;
    public final o54 C0;
    public boolean C1;
    public final o54 D0;
    public boolean D1;
    public final dl0 E0;
    public long E1;
    public final due F0;
    public long F1;
    public final ArrayList G0;
    public boolean G1;
    public final MediaCodec.BufferInfo H0;
    public boolean H1;
    public final long[] I0;
    public boolean I1;
    public final long[] J0;
    public boolean J1;
    public final long[] K0;
    public ExoPlaybackException K1;
    public oy5 L0;
    public n54 L1;
    public oy5 M0;
    public long M1;
    public er4 N0;
    public long N1;
    public er4 O0;
    public int O1;
    public MediaCrypto P0;
    public boolean Q0;
    public final long R0;
    public float S0;
    public float T0;
    public r78 U0;
    public oy5 V0;
    public MediaFormat W0;
    public boolean X0;
    public float Y0;
    public ArrayDeque Z0;
    public MediaCodecRenderer$DecoderInitializationException a1;
    public x78 b1;
    public int c1;
    public boolean d1;
    public boolean e1;
    public boolean f1;
    public boolean g1;
    public boolean h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public boolean m1;
    public dw0 n1;
    public long o1;
    public int p1;
    public int q1;
    public ByteBuffer r1;
    public boolean s1;
    public boolean t1;
    public boolean u1;
    public boolean v1;
    public boolean w1;
    public final p78 x0;
    public boolean x1;
    public final xw0 y0;
    public int y1;
    public final boolean z0 = false;
    public int z1;

    /* JADX WARNING: type inference failed for: r4v4, types: [dl0, o54] */
    public f88(int i, p78 p78, xw0 xw0, float f) {
        super(i);
        this.x0 = p78;
        xw0.getClass();
        this.y0 = xw0;
        this.A0 = f;
        this.B0 = new o54(0);
        this.C0 = new o54(0);
        this.D0 = new o54(2);
        ? o54 = new o54(2);
        o54.w0 = 32;
        this.E0 = o54;
        this.F0 = new due(0);
        this.G0 = new ArrayList();
        this.H0 = new MediaCodec.BufferInfo();
        this.S0 = 1.0f;
        this.T0 = 1.0f;
        this.R0 = -9223372036854775807L;
        this.I0 = new long[10];
        this.J0 = new long[10];
        this.K0 = new long[10];
        this.M1 = -9223372036854775807L;
        this.N1 = -9223372036854775807L;
        o54.x(0);
        o54.o.order(ByteOrder.nativeOrder());
        this.Y0 = -1.0f;
        this.c1 = 0;
        this.y1 = 0;
        this.p1 = -1;
        this.q1 = -1;
        this.o1 = -9223372036854775807L;
        this.E1 = -9223372036854775807L;
        this.F1 = -9223372036854775807L;
        this.z1 = 0;
        this.A1 = 0;
    }

    public final int A(oy5 oy5) {
        try {
            return n0(this.y0, oy5);
        } catch (MediaCodecUtil$DecoderQueryException e) {
            throw c(e, oy5);
        }
    }

    public final int B() {
        return 8;
    }

    public final boolean C(long j, long j2) {
        boolean z;
        dl0 dl0;
        np8.f(!this.H1);
        dl0 dl02 = this.E0;
        int i = dl02.v0;
        if (i > 0) {
            dl0 dl03 = dl02;
            if (!e0(j, j2, (r78) null, dl02.o, this.q1, 0, i, dl02.Y, dl02.f(Integer.MIN_VALUE), dl02.f(4), this.M0)) {
                return false;
            }
            dl0 = dl03;
            a0(dl0.u0);
            dl0.v();
            z = false;
        } else {
            z = false;
            dl0 = dl02;
        }
        if (this.G1) {
            this.H1 = true;
            return z;
        }
        boolean z2 = this.v1;
        o54 o54 = this.D0;
        if (z2) {
            np8.f(dl0.z(o54));
            this.v1 = z;
        }
        if (this.w1) {
            if (dl0.v0 > 0) {
                return true;
            }
            F();
            this.w1 = z;
            T();
            if (!this.u1) {
                return z;
            }
        }
        np8.f(!this.G1);
        imc imc = this.b;
        imc.N();
        o54.v();
        while (true) {
            o54.v();
            int v = v(imc, o54, z ? 1 : 0);
            if (v != -5) {
                if (v == -4) {
                    if (!o54.f(4)) {
                        if (this.I1) {
                            oy5 oy5 = this.L0;
                            oy5.getClass();
                            this.M0 = oy5;
                            Z(oy5, (MediaFormat) null);
                            this.I1 = z;
                        }
                        o54.y();
                        if (!dl0.z(o54)) {
                            this.v1 = true;
                            break;
                        }
                    } else {
                        this.G1 = true;
                        break;
                    }
                } else if (v != -3) {
                    throw new IllegalStateException();
                }
            } else {
                Y(imc);
                break;
            }
        }
        if (dl0.v0 > 0) {
            dl0.y();
        }
        if (dl0.v0 <= 0 && !this.G1 && !this.w1) {
            return z;
        }
        return true;
    }

    public abstract r54 D(x78 x78, oy5 oy5, oy5 oy52);

    public MediaCodecDecoderException E(IllegalStateException illegalStateException, x78 x78) {
        return new MediaCodecDecoderException(illegalStateException, x78);
    }

    public final void F() {
        this.w1 = false;
        this.E0.v();
        this.D0.v();
        this.v1 = false;
        this.u1 = false;
    }

    public final boolean G() {
        if (this.B1) {
            this.z1 = 1;
            if (this.e1 || this.g1) {
                this.A1 = 3;
                return false;
            }
            this.A1 = 2;
        } else {
            p0();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x0140  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean H(long r22, long r24) {
        /*
            r21 = this;
            r15 = r21
            int r0 = r15.q1
            r14 = 0
            r13 = 1
            if (r0 < 0) goto L_0x000a
            r0 = r13
            goto L_0x000b
        L_0x000a:
            r0 = r14
        L_0x000b:
            android.media.MediaCodec$BufferInfo r12 = r15.H0
            if (r0 != 0) goto L_0x00fc
            boolean r0 = r15.h1
            if (r0 == 0) goto L_0x0029
            boolean r0 = r15.C1
            if (r0 == 0) goto L_0x0029
            r78 r0 = r15.U0     // Catch:{ IllegalStateException -> 0x001e }
            int r0 = r0.g(r12)     // Catch:{ IllegalStateException -> 0x001e }
            goto L_0x002f
        L_0x001e:
            r21.d0()
            boolean r0 = r15.H1
            if (r0 == 0) goto L_0x0028
            r21.g0()
        L_0x0028:
            return r14
        L_0x0029:
            r78 r0 = r15.U0
            int r0 = r0.g(r12)
        L_0x002f:
            if (r0 >= 0) goto L_0x0074
            r1 = -2
            if (r0 != r1) goto L_0x0063
            r15.D1 = r13
            r78 r0 = r15.U0
            android.media.MediaFormat r0 = r0.getOutputFormat()
            int r1 = r15.c1
            if (r1 == 0) goto L_0x0055
            java.lang.String r1 = "width"
            int r1 = r0.getInteger(r1)
            r2 = 32
            if (r1 != r2) goto L_0x0055
            java.lang.String r1 = "height"
            int r1 = r0.getInteger(r1)
            if (r1 != r2) goto L_0x0055
            r15.l1 = r13
            goto L_0x0062
        L_0x0055:
            boolean r1 = r15.j1
            if (r1 == 0) goto L_0x005e
            java.lang.String r1 = "channel-count"
            r0.setInteger(r1, r13)
        L_0x005e:
            r15.W0 = r0
            r15.X0 = r13
        L_0x0062:
            return r13
        L_0x0063:
            boolean r0 = r15.m1
            if (r0 == 0) goto L_0x0073
            boolean r0 = r15.G1
            if (r0 != 0) goto L_0x0070
            int r0 = r15.z1
            r1 = 2
            if (r0 != r1) goto L_0x0073
        L_0x0070:
            r21.d0()
        L_0x0073:
            return r14
        L_0x0074:
            boolean r1 = r15.l1
            if (r1 == 0) goto L_0x0080
            r15.l1 = r14
            r78 r1 = r15.U0
            r1.releaseOutputBuffer(r0, r14)
            return r13
        L_0x0080:
            int r1 = r12.size
            if (r1 != 0) goto L_0x008e
            int r1 = r12.flags
            r1 = r1 & 4
            if (r1 == 0) goto L_0x008e
            r21.d0()
            return r14
        L_0x008e:
            r15.q1 = r0
            r78 r1 = r15.U0
            java.nio.ByteBuffer r0 = r1.getOutputBuffer(r0)
            r15.r1 = r0
            if (r0 == 0) goto L_0x00a9
            int r1 = r12.offset
            r0.position(r1)
            java.nio.ByteBuffer r0 = r15.r1
            int r1 = r12.offset
            int r2 = r12.size
            int r1 = r1 + r2
            r0.limit(r1)
        L_0x00a9:
            boolean r0 = r15.i1
            if (r0 == 0) goto L_0x00c8
            long r0 = r12.presentationTimeUs
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00c8
            int r0 = r12.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x00c8
            long r0 = r15.E1
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00c8
            r12.presentationTimeUs = r0
        L_0x00c8:
            long r0 = r12.presentationTimeUs
            java.util.ArrayList r2 = r15.G0
            int r3 = r2.size()
            r4 = r14
        L_0x00d1:
            if (r4 >= r3) goto L_0x00e9
            java.lang.Object r5 = r2.get(r4)
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x00e6
            r2.remove(r4)
            r0 = r13
            goto L_0x00ea
        L_0x00e6:
            int r4 = r4 + 1
            goto L_0x00d1
        L_0x00e9:
            r0 = r14
        L_0x00ea:
            r15.s1 = r0
            long r0 = r15.F1
            long r2 = r12.presentationTimeUs
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x00f6
            r0 = r13
            goto L_0x00f7
        L_0x00f6:
            r0 = r14
        L_0x00f7:
            r15.t1 = r0
            r15.q0(r2)
        L_0x00fc:
            boolean r0 = r15.h1
            if (r0 == 0) goto L_0x0144
            boolean r0 = r15.C1
            if (r0 == 0) goto L_0x0144
            r78 r5 = r15.U0     // Catch:{ IllegalStateException -> 0x0137 }
            java.nio.ByteBuffer r6 = r15.r1     // Catch:{ IllegalStateException -> 0x0137 }
            int r7 = r15.q1     // Catch:{ IllegalStateException -> 0x0137 }
            int r8 = r12.flags     // Catch:{ IllegalStateException -> 0x0137 }
            long r10 = r12.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0137 }
            boolean r9 = r15.s1     // Catch:{ IllegalStateException -> 0x0137 }
            boolean r3 = r15.t1     // Catch:{ IllegalStateException -> 0x0137 }
            oy5 r4 = r15.M0     // Catch:{ IllegalStateException -> 0x0137 }
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
            boolean r0 = r0.e0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x0139 }
            r15 = r20
            goto L_0x016f
        L_0x0137:
            r17 = r14
        L_0x0139:
            r21.d0()
            boolean r0 = r15.H1
            if (r0 == 0) goto L_0x0143
            r21.g0()
        L_0x0143:
            return r17
        L_0x0144:
            r20 = r12
            r16 = r13
            r17 = r14
            r78 r5 = r15.U0
            java.nio.ByteBuffer r6 = r15.r1
            int r7 = r15.q1
            r14 = r20
            int r8 = r14.flags
            long r10 = r14.presentationTimeUs
            boolean r12 = r15.s1
            boolean r13 = r15.t1
            oy5 r9 = r15.M0
            r18 = 1
            r0 = r21
            r1 = r22
            r3 = r24
            r19 = r9
            r9 = r18
            r15 = r14
            r14 = r19
            boolean r0 = r0.e0(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x016f:
            if (r0 == 0) goto L_0x0190
            long r0 = r15.presentationTimeUs
            r2 = r21
            r3 = r15
            r2.a0(r0)
            int r0 = r3.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0182
            r14 = r16
            goto L_0x0184
        L_0x0182:
            r14 = r17
        L_0x0184:
            r0 = -1
            r2.q1 = r0
            r0 = 0
            r2.r1 = r0
            if (r14 != 0) goto L_0x018d
            return r16
        L_0x018d:
            r21.d0()
        L_0x0190:
            return r17
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f88.H(long, long):boolean");
    }

    public final boolean I() {
        boolean z;
        rz3 rz3;
        r78 r78 = this.U0;
        if (r78 == null || this.z1 == 2 || this.G1) {
            return false;
        }
        int i = this.p1;
        o54 o54 = this.C0;
        if (i < 0) {
            int e = r78.e();
            this.p1 = e;
            if (e < 0) {
                return false;
            }
            o54.o = this.U0.getInputBuffer(e);
            o54.v();
        }
        if (this.z1 == 1) {
            if (!this.m1) {
                this.C1 = true;
                this.U0.a(0, this.p1, 0, 4);
                this.p1 = -1;
                o54.o = null;
            }
            this.z1 = 2;
            return false;
        } else if (this.k1) {
            this.k1 = false;
            o54.o.put(P1);
            this.U0.a(0, this.p1, 38, 0);
            this.p1 = -1;
            o54.o = null;
            this.B1 = true;
            return true;
        } else {
            if (this.y1 == 1) {
                for (int i2 = 0; i2 < this.V0.y0.size(); i2++) {
                    o54.o.put((byte[]) this.V0.y0.get(i2));
                }
                this.y1 = 2;
            }
            int position = o54.o.position();
            imc imc = this.b;
            imc.N();
            try {
                int v = v(imc, o54, 0);
                if (j()) {
                    this.F1 = this.E1;
                }
                if (v == -3) {
                    return false;
                }
                if (v == -5) {
                    if (this.y1 == 2) {
                        o54.v();
                        this.y1 = 1;
                    }
                    Y(imc);
                    return true;
                }
                if (o54.f(4)) {
                    if (this.y1 == 2) {
                        o54.v();
                        this.y1 = 1;
                    }
                    this.G1 = true;
                    if (!this.B1) {
                        d0();
                        return false;
                    }
                    try {
                        if (!this.m1) {
                            this.C1 = true;
                            this.U0.a(0, this.p1, 0, 4);
                            this.p1 = -1;
                            o54.o = null;
                        }
                        return false;
                    } catch (MediaCodec.CryptoException e2) {
                        throw e(e2, this.L0, false, maf.r(e2.getErrorCode()));
                    }
                } else if (this.B1 || o54.f(1)) {
                    boolean f = o54.f(1073741824);
                    rz3 rz32 = o54.c;
                    if (f) {
                        if (position == 0) {
                            rz32.getClass();
                        } else {
                            if (((int[]) rz32.d) == null) {
                                int[] iArr = new int[1];
                                rz32.d = iArr;
                                ((MediaCodec.CryptoInfo) rz32.i).numBytesOfClearData = iArr;
                            }
                            int[] iArr2 = (int[]) rz32.d;
                            iArr2[0] = iArr2[0] + position;
                        }
                    }
                    if (this.d1 && !f) {
                        ByteBuffer byteBuffer = o54.o;
                        int position2 = byteBuffer.position();
                        int i3 = 0;
                        int i4 = 0;
                        while (true) {
                            int i5 = i3 + 1;
                            if (i5 >= position2) {
                                byteBuffer.clear();
                                break;
                            }
                            byte b = byteBuffer.get(i3) & 255;
                            if (i4 == 3) {
                                if (b == 1 && (byteBuffer.get(i5) & 31) == 7) {
                                    ByteBuffer duplicate = byteBuffer.duplicate();
                                    duplicate.position(i3 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer.position(0);
                                    byteBuffer.put(duplicate);
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
                        if (o54.o.position() == 0) {
                            return true;
                        }
                        this.d1 = false;
                    }
                    long j = o54.Y;
                    dw0 dw0 = this.n1;
                    if (dw0 != null) {
                        oy5 oy5 = this.L0;
                        if (dw0.c == 0) {
                            dw0.b = j;
                        }
                        if (!dw0.a) {
                            ByteBuffer byteBuffer2 = o54.o;
                            byteBuffer2.getClass();
                            int i6 = 0;
                            byte b2 = 0;
                            for (int i7 = 4; i6 < i7; i7 = 4) {
                                b2 = (b2 << 8) | (byteBuffer2.get(i6) & 255);
                                i6++;
                            }
                            int E = ay7.E(b2);
                            if (E == -1) {
                                dw0.a = true;
                                dw0.c = 0;
                                j = o54.Y;
                                dw0.b = j;
                            } else {
                                z = f;
                                j = Math.max(0, ((dw0.c - 529) * 1000000) / ((long) oy5.K0)) + dw0.b;
                                dw0.c += (long) E;
                                long j2 = this.E1;
                                dw0 dw02 = this.n1;
                                oy5 oy52 = this.L0;
                                dw02.getClass();
                                rz3 = rz32;
                                this.E1 = Math.max(j2, Math.max(0, ((dw02.c - 529) * 1000000) / ((long) oy52.K0)) + dw02.b);
                            }
                        }
                        z = f;
                        long j22 = this.E1;
                        dw0 dw022 = this.n1;
                        oy5 oy522 = this.L0;
                        dw022.getClass();
                        rz3 = rz32;
                        this.E1 = Math.max(j22, Math.max(0, ((dw022.c - 529) * 1000000) / ((long) oy522.K0)) + dw022.b);
                    } else {
                        z = f;
                        rz3 = rz32;
                    }
                    if (o54.f(Integer.MIN_VALUE)) {
                        this.G0.add(Long.valueOf(j));
                    }
                    if (this.I1) {
                        this.F0.a(j, this.L0);
                        this.I1 = false;
                    }
                    this.E1 = Math.max(this.E1, j);
                    o54.y();
                    if (o54.f(268435456)) {
                        R(o54);
                    }
                    c0(o54);
                    if (z) {
                        try {
                            this.U0.k(this.p1, rz3, j);
                        } catch (MediaCodec.CryptoException e3) {
                            throw e(e3, this.L0, false, maf.r(e3.getErrorCode()));
                        }
                    } else {
                        this.U0.a(j, this.p1, o54.o.limit(), 0);
                    }
                    this.p1 = -1;
                    o54.o = null;
                    this.B1 = true;
                    this.y1 = 0;
                    this.L1.d++;
                    return true;
                } else {
                    o54.v();
                    if (this.y1 == 2) {
                        this.y1 = 1;
                    }
                    return true;
                }
            } catch (DecoderInputBuffer$InsufficientCapacityException e4) {
                V(e4);
                f0(0);
                J();
                return true;
            }
        }
    }

    public final void J() {
        try {
            this.U0.flush();
        } finally {
            i0();
        }
    }

    public final boolean K() {
        if (this.U0 == null) {
            return false;
        }
        if (this.A1 == 3 || this.e1 || ((this.f1 && !this.D1) || (this.g1 && this.C1))) {
            g0();
            return true;
        }
        J();
        return false;
    }

    public final List L(boolean z) {
        oy5 oy5 = this.L0;
        xw0 xw0 = this.y0;
        ArrayList O = O(xw0, oy5, z);
        if (O.isEmpty() && z) {
            O = O(xw0, this.L0, false);
            if (!O.isEmpty()) {
                String str = this.L0.w0;
                String valueOf = String.valueOf(O);
                new StringBuilder(valueOf.length() + rh4.e(99, str));
            }
        }
        return O;
    }

    public boolean M() {
        return false;
    }

    public abstract float N(float f, oy5[] oy5Arr);

    public abstract ArrayList O(xw0 xw0, oy5 oy5, boolean z);

    public final a36 P(er4 er4) {
        pz3 e = er4.e();
        if (e == null || (e instanceof a36)) {
            return (a36) e;
        }
        String valueOf = String.valueOf(e);
        StringBuilder sb = new StringBuilder(valueOf.length() + 43);
        sb.append("Expecting FrameworkCryptoConfig but found: ");
        sb.append(valueOf);
        throw e(new IllegalArgumentException(sb.toString()), this.L0, false, 6001);
    }

    public abstract n78 Q(x78 x78, oy5 oy5, MediaCrypto mediaCrypto, float f);

    public void R(o54 o54) {
    }

    /* JADX WARNING: type inference failed for: r1v9, types: [java.lang.Object, dw0] */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x015b, code lost:
        if ("stvm8".equals(r5) == false) goto L_0x016f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x016b, code lost:
        if ("OMX.amlogic.avc.decoder.awesome.secure".equals(r4) == false) goto L_0x016f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x01dc  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S(defpackage.x78 r17, android.media.MediaCrypto r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.String r4 = r1.a
            int r2 = defpackage.maf.a
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 23
            if (r2 >= r5) goto L_0x0010
            r6 = r3
            goto L_0x001b
        L_0x0010:
            float r6 = r0.T0
            oy5[] r7 = r0.s0
            r7.getClass()
            float r6 = r0.N(r6, r7)
        L_0x001b:
            float r7 = r0.A0
            int r7 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r7 > 0) goto L_0x0022
            goto L_0x0023
        L_0x0022:
            r3 = r6
        L_0x0023:
            long r6 = android.os.SystemClock.elapsedRealtime()
            oy5 r8 = r0.L0
            r9 = r18
            n78 r8 = r0.Q(r1, r8, r9, r3)
            r9 = 31
            if (r2 < r9) goto L_0x003b
            i4b r9 = r0.X
            r9.getClass()
            defpackage.b88.a(r8, r9)
        L_0x003b:
            java.lang.String r9 = "createCodec:"
            java.lang.String r10 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x004c }
            int r11 = r10.length()     // Catch:{ all -> 0x004c }
            if (r11 == 0) goto L_0x004f
            java.lang.String r9 = r9.concat(r10)     // Catch:{ all -> 0x004c }
            goto L_0x0055
        L_0x004c:
            r0 = move-exception
            goto L_0x0263
        L_0x004f:
            java.lang.String r10 = new java.lang.String     // Catch:{ all -> 0x004c }
            r10.<init>(r9)     // Catch:{ all -> 0x004c }
            r9 = r10
        L_0x0055:
            defpackage.j47.k(r9)     // Catch:{ all -> 0x004c }
            p78 r9 = r0.x0     // Catch:{ all -> 0x004c }
            r78 r8 = r9.i(r8)     // Catch:{ all -> 0x004c }
            r0.U0 = r8     // Catch:{ all -> 0x004c }
            defpackage.j47.A()
            long r8 = android.os.SystemClock.elapsedRealtime()
            r0.b1 = r1
            r0.Y0 = r3
            oy5 r3 = r0.L0
            r0.V0 = r3
            java.lang.String r10 = "OMX.Exynos.avc.dec.secure"
            r11 = 25
            r13 = 1
            if (r2 > r11) goto L_0x00a0
            boolean r14 = r10.equals(r4)
            if (r14 == 0) goto L_0x00a0
            java.lang.String r14 = defpackage.maf.d
            java.lang.String r15 = "SM-T585"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L_0x009e
            java.lang.String r15 = "SM-A510"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L_0x009e
            java.lang.String r15 = "SM-A520"
            boolean r15 = r14.startsWith(r15)
            if (r15 != 0) goto L_0x009e
            java.lang.String r15 = "SM-J700"
            boolean r14 = r14.startsWith(r15)
            if (r14 == 0) goto L_0x00a0
        L_0x009e:
            r14 = 2
            goto L_0x00d9
        L_0x00a0:
            r14 = 24
            if (r2 >= r14) goto L_0x00d8
            java.lang.String r14 = "OMX.Nvidia.h264.decode"
            boolean r14 = r14.equals(r4)
            if (r14 != 0) goto L_0x00b4
            java.lang.String r14 = "OMX.Nvidia.h264.decode.secure"
            boolean r14 = r14.equals(r4)
            if (r14 == 0) goto L_0x00d8
        L_0x00b4:
            java.lang.String r14 = defpackage.maf.b
            java.lang.String r15 = "flounder"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x00d6
            java.lang.String r15 = "flounder_lte"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x00d6
            java.lang.String r15 = "grouper"
            boolean r15 = r15.equals(r14)
            if (r15 != 0) goto L_0x00d6
            java.lang.String r15 = "tilapia"
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x00d8
        L_0x00d6:
            r14 = r13
            goto L_0x00d9
        L_0x00d8:
            r14 = 0
        L_0x00d9:
            r0.c1 = r14
            oy5 r14 = r0.V0
            r15 = 21
            if (r2 >= r15) goto L_0x00f3
            java.util.List r14 = r14.y0
            boolean r14 = r14.isEmpty()
            if (r14 == 0) goto L_0x00f3
            java.lang.String r14 = "OMX.MTK.VIDEO.DECODER.AVC"
            boolean r14 = r14.equals(r4)
            if (r14 == 0) goto L_0x00f3
            r14 = r13
            goto L_0x00f4
        L_0x00f3:
            r14 = 0
        L_0x00f4:
            r0.d1 = r14
            r14 = 19
            r12 = 18
            if (r2 < r12) goto L_0x012b
            if (r2 != r12) goto L_0x010e
            java.lang.String r3 = "OMX.SEC.avc.dec"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012b
            java.lang.String r3 = "OMX.SEC.avc.dec.secure"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012b
        L_0x010e:
            if (r2 != r14) goto L_0x0129
            java.lang.String r3 = defpackage.maf.d
            java.lang.String r11 = "SM-G800"
            boolean r3 = r3.startsWith(r11)
            if (r3 == 0) goto L_0x0129
            java.lang.String r3 = "OMX.Exynos.avc.dec"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x012b
            boolean r3 = r10.equals(r4)
            if (r3 == 0) goto L_0x0129
            goto L_0x012b
        L_0x0129:
            r3 = 0
            goto L_0x012c
        L_0x012b:
            r3 = r13
        L_0x012c:
            r0.e1 = r3
            r3 = 29
            if (r2 != r3) goto L_0x013c
            java.lang.String r10 = "c2.android.aac.decoder"
            boolean r10 = r10.equals(r4)
            if (r10 == 0) goto L_0x013c
            r10 = r13
            goto L_0x013d
        L_0x013c:
            r10 = 0
        L_0x013d:
            r0.f1 = r10
            if (r2 > r5) goto L_0x0149
            java.lang.String r5 = "OMX.google.vorbis.decoder"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x016d
        L_0x0149:
            if (r2 > r14) goto L_0x016f
            java.lang.String r5 = defpackage.maf.b
            java.lang.String r10 = "hb2000"
            boolean r10 = r10.equals(r5)
            if (r10 != 0) goto L_0x015d
            java.lang.String r10 = "stvm8"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x016f
        L_0x015d:
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L_0x016d
            java.lang.String r5 = "OMX.amlogic.avc.decoder.awesome.secure"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x016f
        L_0x016d:
            r5 = r13
            goto L_0x0170
        L_0x016f:
            r5 = 0
        L_0x0170:
            r0.g1 = r5
            if (r2 != r15) goto L_0x017e
            java.lang.String r5 = "OMX.google.aac.decoder"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x017e
            r5 = r13
            goto L_0x017f
        L_0x017e:
            r5 = 0
        L_0x017f:
            r0.h1 = r5
            if (r2 >= r15) goto L_0x01c9
            java.lang.String r5 = "OMX.SEC.mp3.dec"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x01c9
            java.lang.String r5 = "samsung"
            java.lang.String r10 = defpackage.maf.c
            boolean r5 = r5.equals(r10)
            if (r5 == 0) goto L_0x01c9
            java.lang.String r5 = defpackage.maf.b
            java.lang.String r10 = "baffin"
            boolean r10 = r5.startsWith(r10)
            if (r10 != 0) goto L_0x01c7
            java.lang.String r10 = "grand"
            boolean r10 = r5.startsWith(r10)
            if (r10 != 0) goto L_0x01c7
            java.lang.String r10 = "fortuna"
            boolean r10 = r5.startsWith(r10)
            if (r10 != 0) goto L_0x01c7
            java.lang.String r10 = "gprimelte"
            boolean r10 = r5.startsWith(r10)
            if (r10 != 0) goto L_0x01c7
            java.lang.String r10 = "j2y18lte"
            boolean r10 = r5.startsWith(r10)
            if (r10 != 0) goto L_0x01c7
            java.lang.String r10 = "ms01"
            boolean r5 = r5.startsWith(r10)
            if (r5 == 0) goto L_0x01c9
        L_0x01c7:
            r5 = r13
            goto L_0x01ca
        L_0x01c9:
            r5 = 0
        L_0x01ca:
            r0.i1 = r5
            oy5 r5 = r0.V0
            if (r2 > r12) goto L_0x01de
            int r5 = r5.J0
            if (r5 != r13) goto L_0x01de
            java.lang.String r5 = "OMX.MTK.AUDIO.DECODER.MP3"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L_0x01de
            r5 = r13
            goto L_0x01df
        L_0x01de:
            r5 = 0
        L_0x01df:
            r0.j1 = r5
            java.lang.String r5 = r1.a
            r10 = 25
            if (r2 > r10) goto L_0x01ef
            java.lang.String r10 = "OMX.rk.video_decoder.avc"
            boolean r10 = r10.equals(r5)
            if (r10 != 0) goto L_0x022c
        L_0x01ef:
            r10 = 17
            if (r2 > r10) goto L_0x01fb
            java.lang.String r10 = "OMX.allwinner.video.decoder.avc"
            boolean r10 = r10.equals(r5)
            if (r10 != 0) goto L_0x022c
        L_0x01fb:
            if (r2 > r3) goto L_0x020d
            java.lang.String r2 = "OMX.broadcom.video_decoder.tunnel"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x022c
            java.lang.String r2 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x022c
        L_0x020d:
            java.lang.String r2 = "Amazon"
            java.lang.String r3 = defpackage.maf.c
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0226
            java.lang.String r2 = "AFTS"
            java.lang.String r3 = defpackage.maf.d
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0226
            boolean r1 = r1.f
            if (r1 == 0) goto L_0x0226
            goto L_0x022c
        L_0x0226:
            boolean r1 = r16.M()
            if (r1 == 0) goto L_0x022e
        L_0x022c:
            r12 = r13
            goto L_0x022f
        L_0x022e:
            r12 = 0
        L_0x022f:
            r0.m1 = r12
            r78 r1 = r0.U0
            r1.getClass()
            java.lang.String r1 = "c2.android.mp3.decoder"
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L_0x0245
            dw0 r1 = new dw0
            r1.<init>()
            r0.n1 = r1
        L_0x0245:
            int r1 = r0.Y
            r2 = 2
            if (r1 != r2) goto L_0x0253
            long r1 = android.os.SystemClock.elapsedRealtime()
            r10 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 + r10
            r0.o1 = r1
        L_0x0253:
            n54 r1 = r0.L1
            int r2 = r1.b
            int r2 = r2 + r13
            r1.b = r2
            long r5 = r8 - r6
            r1 = r16
            r2 = r8
            r1.W(r2, r4, r5)
            return
        L_0x0263:
            defpackage.j47.A()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f88.S(x78, android.media.MediaCrypto):void");
    }

    public final void T() {
        oy5 oy5;
        if (this.U0 == null && !this.u1 && (oy5 = this.L0) != null) {
            if (this.O0 != null || !m0(oy5)) {
                k0(this.O0);
                String str = this.L0.w0;
                er4 er4 = this.N0;
                if (er4 != null) {
                    if (this.P0 == null) {
                        a36 P = P(er4);
                        if (P != null) {
                            try {
                                MediaCrypto mediaCrypto = new MediaCrypto(P.a, P.b);
                                this.P0 = mediaCrypto;
                                this.Q0 = !P.c && mediaCrypto.requiresSecureDecoderComponent(str);
                            } catch (MediaCryptoException e) {
                                throw e(e, this.L0, false, 6006);
                            }
                        } else if (this.N0.d() == null) {
                            return;
                        }
                    }
                    if (a36.d) {
                        int state = this.N0.getState();
                        if (state == 1) {
                            DrmSession$DrmSessionException d = this.N0.d();
                            d.getClass();
                            throw e(d, this.L0, false, d.a);
                        } else if (state != 4) {
                            return;
                        }
                    }
                }
                try {
                    U(this.P0, this.Q0);
                } catch (MediaCodecRenderer$DecoderInitializationException e2) {
                    throw e(e2, this.L0, false, 4001);
                }
            } else {
                oy5 oy52 = this.L0;
                F();
                String str2 = oy52.w0;
                boolean equals = "audio/mp4a-latm".equals(str2);
                dl0 dl0 = this.E0;
                if (equals || "audio/mpeg".equals(str2) || "audio/opus".equals(str2)) {
                    dl0.getClass();
                    dl0.w0 = 32;
                } else {
                    dl0.getClass();
                    dl0.w0 = 1;
                }
                this.u1 = true;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: x78} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void U(android.media.MediaCrypto r12, boolean r13) {
        /*
            r11 = this;
            java.util.ArrayDeque r0 = r11.Z0
            r1 = 0
            if (r0 != 0) goto L_0x003a
            java.util.List r0 = r11.L(r13)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            r2.<init>()     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            r11.Z0 = r2     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            boolean r3 = r11.z0     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            if (r3 == 0) goto L_0x001a
            r2.addAll(r0)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            goto L_0x002c
        L_0x0018:
            r12 = move-exception
            goto L_0x002f
        L_0x001a:
            boolean r2 = r0.isEmpty()     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            if (r2 != 0) goto L_0x002c
            java.util.ArrayDeque r2 = r11.Z0     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            x78 r0 = (defpackage.x78) r0     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            r2.add(r0)     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
        L_0x002c:
            r11.a1 = r1     // Catch:{ MediaCodecUtil$DecoderQueryException -> 0x0018 }
            goto L_0x003a
        L_0x002f:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r0 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            oy5 r11 = r11.L0
            r1 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r11, r12, r13, r1)
            throw r0
        L_0x003a:
            java.util.ArrayDeque r0 = r11.Z0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0112
            java.util.ArrayDeque r0 = r11.Z0
            java.lang.Object r0 = r0.peekFirst()
            x78 r0 = (defpackage.x78) r0
        L_0x004a:
            r78 r2 = r11.U0
            if (r2 != 0) goto L_0x010f
            java.util.ArrayDeque r2 = r11.Z0
            java.lang.Object r2 = r2.peekFirst()
            r8 = r2
            x78 r8 = (defpackage.x78) r8
            boolean r2 = r11.l0(r8)
            if (r2 != 0) goto L_0x005e
            return
        L_0x005e:
            r11.S(r8, r12)     // Catch:{ Exception -> 0x0062 }
            goto L_0x004a
        L_0x0062:
            r2 = move-exception
            if (r8 != r0) goto L_0x0071
            r2 = 50
            java.lang.Thread.sleep(r2)     // Catch:{ Exception -> 0x006e }
            r11.S(r8, r12)     // Catch:{ Exception -> 0x006e }
            goto L_0x004a
        L_0x006e:
            r2 = move-exception
            r5 = r2
            goto L_0x0072
        L_0x0071:
            throw r2     // Catch:{ Exception -> 0x006e }
        L_0x0072:
            java.lang.String r2 = java.lang.String.valueOf(r8)
            int r3 = r2.length()
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Failed to initialize decoder: "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            defpackage.fm9.c(r2, r5)
            java.util.ArrayDeque r2 = r11.Z0
            r2.removeFirst()
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            oy5 r3 = r11.L0
            java.lang.String r4 = r8.a
            java.lang.String r6 = java.lang.String.valueOf(r3)
            r7 = 23
            int r7 = defpackage.rh4.e(r7, r4)
            int r9 = r6.length()
            int r9 = r9 + r7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r9)
            java.lang.String r9 = "Decoder init failed: "
            r7.append(r9)
            r7.append(r4)
            java.lang.String r4 = ", "
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            java.lang.String r6 = r3.w0
            int r3 = defpackage.maf.a
            r7 = 21
            if (r3 < r7) goto L_0x00da
            boolean r3 = r5 instanceof android.media.MediaCodec.CodecException
            if (r3 == 0) goto L_0x00d7
            r3 = r5
            android.media.MediaCodec$CodecException r3 = (android.media.MediaCodec.CodecException) r3
            java.lang.String r3 = r3.getDiagnosticInfo()
            goto L_0x00d8
        L_0x00d7:
            r3 = r1
        L_0x00d8:
            r9 = r3
            goto L_0x00db
        L_0x00da:
            r9 = r1
        L_0x00db:
            r3 = r2
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11.V(r2)
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r3 = r11.a1
            if (r3 != 0) goto L_0x00ea
            r11.a1 = r2
            goto L_0x0102
        L_0x00ea:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r2 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            java.lang.String r5 = r3.getMessage()
            java.lang.Throwable r6 = r3.getCause()
            java.lang.String r7 = r3.a
            boolean r8 = r3.b
            x78 r9 = r3.c
            java.lang.String r10 = r3.o
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.a1 = r2
        L_0x0102:
            java.util.ArrayDeque r2 = r11.Z0
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x010c
            goto L_0x004a
        L_0x010c:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r11 = r11.a1
            throw r11
        L_0x010f:
            r11.Z0 = r1
            return
        L_0x0112:
            com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException r12 = new com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException
            oy5 r11 = r11.L0
            r0 = -49999(0xffffffffffff3cb1, float:NaN)
            r12.<init>(r11, r1, r13, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f88.U(android.media.MediaCrypto, boolean):void");
    }

    public abstract void V(Exception exc);

    public abstract void W(long j, String str, long j2);

    public abstract void X(String str);

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007f, code lost:
        if (r13 != false) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bb, code lost:
        if (G() == false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00ee, code lost:
        if (G() == false) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0100, code lost:
        if (G() == false) goto L_0x0128;
     */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x013f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.r54 Y(defpackage.imc r13) {
        /*
            r12 = this;
            r0 = 1
            r12.I1 = r0
            java.lang.Object r1 = r13.c
            r5 = r1
            oy5 r5 = (defpackage.oy5) r5
            r5.getClass()
            r1 = 0
            java.lang.String r2 = r5.w0
            if (r2 == 0) goto L_0x015d
            java.lang.Object r13 = r13.b
            er4 r13 = (defpackage.er4) r13
            er4 r3 = r12.O0
            r4 = 0
            if (r3 != r13) goto L_0x001a
            goto L_0x0024
        L_0x001a:
            if (r13 == 0) goto L_0x001f
            r13.g(r4)
        L_0x001f:
            if (r3 == 0) goto L_0x0024
            r3.f(r4)
        L_0x0024:
            r12.O0 = r13
            r12.L0 = r5
            boolean r3 = r12.u1
            if (r3 == 0) goto L_0x002f
            r12.w1 = r0
            return r4
        L_0x002f:
            r78 r3 = r12.U0
            if (r3 != 0) goto L_0x0039
            r12.Z0 = r4
            r12.T()
            return r4
        L_0x0039:
            x78 r4 = r12.b1
            oy5 r6 = r12.V0
            er4 r7 = r12.N0
            r8 = 3
            r9 = 23
            if (r7 != r13) goto L_0x0045
            goto L_0x0083
        L_0x0045:
            if (r13 == 0) goto L_0x0140
            if (r7 != 0) goto L_0x004b
            goto L_0x0140
        L_0x004b:
            int r10 = defpackage.maf.a
            if (r10 >= r9) goto L_0x0051
            goto L_0x0140
        L_0x0051:
            java.util.UUID r10 = defpackage.bw0.e
            java.util.UUID r7 = r7.a()
            boolean r7 = r10.equals(r7)
            if (r7 != 0) goto L_0x0140
            java.util.UUID r7 = r13.a()
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x0069
            goto L_0x0140
        L_0x0069:
            a36 r7 = r12.P(r13)
            if (r7 != 0) goto L_0x0071
            goto L_0x0140
        L_0x0071:
            boolean r7 = r7.c
            if (r7 == 0) goto L_0x0077
            r13 = r1
            goto L_0x007b
        L_0x0077:
            boolean r13 = r13.c(r2)
        L_0x007b:
            boolean r2 = r4.f
            if (r2 != 0) goto L_0x0083
            if (r13 == 0) goto L_0x0083
            goto L_0x0140
        L_0x0083:
            er4 r13 = r12.O0
            er4 r2 = r12.N0
            if (r13 == r2) goto L_0x008b
            r13 = r0
            goto L_0x008c
        L_0x008b:
            r13 = r1
        L_0x008c:
            if (r13 == 0) goto L_0x0095
            int r2 = defpackage.maf.a
            if (r2 < r9) goto L_0x0093
            goto L_0x0095
        L_0x0093:
            r2 = r1
            goto L_0x0096
        L_0x0095:
            r2 = r0
        L_0x0096:
            defpackage.np8.f(r2)
            r54 r2 = r12.D(r4, r6, r5)
            int r7 = r2.d
            if (r7 == 0) goto L_0x0118
            r9 = 16
            r10 = 2
            if (r7 == r0) goto L_0x00f1
            if (r7 == r10) goto L_0x00c5
            if (r7 != r8) goto L_0x00bf
            boolean r0 = r12.o0(r5)
            if (r0 != 0) goto L_0x00b3
        L_0x00b0:
            r10 = r9
            goto L_0x0128
        L_0x00b3:
            r12.V0 = r5
            if (r13 == 0) goto L_0x0127
            boolean r13 = r12.G()
            if (r13 != 0) goto L_0x0127
            goto L_0x0128
        L_0x00bf:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x00c5:
            boolean r11 = r12.o0(r5)
            if (r11 != 0) goto L_0x00cc
            goto L_0x00b0
        L_0x00cc:
            r12.x1 = r0
            r12.y1 = r0
            int r9 = r12.c1
            if (r9 == r10) goto L_0x00e4
            if (r9 != r0) goto L_0x00e3
            int r9 = r6.B0
            int r11 = r5.B0
            if (r11 != r9) goto L_0x00e3
            int r9 = r5.C0
            int r11 = r6.C0
            if (r9 != r11) goto L_0x00e3
            goto L_0x00e4
        L_0x00e3:
            r0 = r1
        L_0x00e4:
            r12.k1 = r0
            r12.V0 = r5
            if (r13 == 0) goto L_0x0127
            boolean r13 = r12.G()
            if (r13 != 0) goto L_0x0127
            goto L_0x0128
        L_0x00f1:
            boolean r11 = r12.o0(r5)
            if (r11 != 0) goto L_0x00f8
            goto L_0x00b0
        L_0x00f8:
            r12.V0 = r5
            if (r13 == 0) goto L_0x0103
            boolean r13 = r12.G()
            if (r13 != 0) goto L_0x0127
            goto L_0x0128
        L_0x0103:
            boolean r13 = r12.B1
            if (r13 == 0) goto L_0x0127
            r12.z1 = r0
            boolean r13 = r12.e1
            if (r13 != 0) goto L_0x0115
            boolean r13 = r12.g1
            if (r13 == 0) goto L_0x0112
            goto L_0x0115
        L_0x0112:
            r12.A1 = r0
            goto L_0x0127
        L_0x0115:
            r12.A1 = r8
            goto L_0x0128
        L_0x0118:
            boolean r13 = r12.B1
            if (r13 == 0) goto L_0x0121
            r12.z1 = r0
            r12.A1 = r8
            goto L_0x0127
        L_0x0121:
            r12.g0()
            r12.T()
        L_0x0127:
            r10 = r1
        L_0x0128:
            if (r7 == 0) goto L_0x013f
            r78 r13 = r12.U0
            if (r13 != r3) goto L_0x0132
            int r12 = r12.A1
            if (r12 != r8) goto L_0x013f
        L_0x0132:
            r54 r12 = new r54
            java.lang.String r3 = r4.a
            r13 = 0
            r2 = r12
            r4 = r6
            r6 = r13
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x013f:
            return r2
        L_0x0140:
            boolean r13 = r12.B1
            if (r13 == 0) goto L_0x0149
            r12.z1 = r0
            r12.A1 = r8
            goto L_0x014f
        L_0x0149:
            r12.g0()
            r12.T()
        L_0x014f:
            r54 r12 = new r54
            java.lang.String r3 = r4.a
            r13 = 0
            r7 = 128(0x80, float:1.794E-43)
            r2 = r12
            r4 = r6
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7)
            return r12
        L_0x015d:
            java.lang.IllegalArgumentException r13 = new java.lang.IllegalArgumentException
            r13.<init>()
            r0 = 4005(0xfa5, float:5.612E-42)
            com.google.android.exoplayer2.ExoPlaybackException r12 = r12.e(r13, r5, r1, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f88.Y(imc):r54");
    }

    public abstract void Z(oy5 oy5, MediaFormat mediaFormat);

    public void a0(long j) {
        while (true) {
            int i = this.O1;
            if (i != 0) {
                long[] jArr = this.K0;
                if (j >= jArr[0]) {
                    long[] jArr2 = this.I0;
                    this.M1 = jArr2[0];
                    long[] jArr3 = this.J0;
                    this.N1 = jArr3[0];
                    int i2 = i - 1;
                    this.O1 = i2;
                    System.arraycopy(jArr2, 1, jArr2, 0, i2);
                    System.arraycopy(jArr3, 1, jArr3, 0, this.O1);
                    System.arraycopy(jArr, 1, jArr, 0, this.O1);
                    b0();
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public abstract void b0();

    public abstract void c0(o54 o54);

    public final void d0() {
        int i = this.A1;
        if (i == 1) {
            J();
        } else if (i == 2) {
            J();
            p0();
        } else if (i != 3) {
            this.H1 = true;
            h0();
        } else {
            g0();
            T();
        }
    }

    public abstract boolean e0(long j, long j2, r78 r78, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, oy5 oy5);

    public final boolean f0(int i) {
        imc imc = this.b;
        imc.N();
        o54 o54 = this.B0;
        o54.v();
        int v = v(imc, o54, i | 4);
        if (v == -5) {
            Y(imc);
            return true;
        } else if (v != -4 || !o54.f(4)) {
            return false;
        } else {
            this.G1 = true;
            d0();
            return false;
        }
    }

    public final void g0() {
        try {
            r78 r78 = this.U0;
            if (r78 != null) {
                r78.release();
                this.L1.c++;
                X(this.b1.a);
            }
            this.U0 = null;
            try {
                MediaCrypto mediaCrypto = this.P0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.P0 = null;
                k0((er4) null);
                j0();
            }
        } catch (Throwable th) {
            this.U0 = null;
            MediaCrypto mediaCrypto2 = this.P0;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.P0 = null;
            k0((er4) null);
            j0();
        }
    }

    public void h0() {
    }

    public void i0() {
        this.p1 = -1;
        this.C0.o = null;
        this.q1 = -1;
        this.r1 = null;
        this.o1 = -9223372036854775807L;
        this.C1 = false;
        this.B1 = false;
        this.k1 = false;
        this.l1 = false;
        this.s1 = false;
        this.t1 = false;
        this.G0.clear();
        this.E1 = -9223372036854775807L;
        this.F1 = -9223372036854775807L;
        dw0 dw0 = this.n1;
        if (dw0 != null) {
            dw0.b = 0;
            dw0.c = 0;
            dw0.a = false;
        }
        this.z1 = 0;
        this.A1 = 0;
        this.y1 = this.x1 ? 1 : 0;
    }

    public final void j0() {
        i0();
        this.K1 = null;
        this.n1 = null;
        this.Z0 = null;
        this.b1 = null;
        this.V0 = null;
        this.W0 = null;
        this.X0 = false;
        this.D1 = false;
        this.Y0 = -1.0f;
        this.c1 = 0;
        this.d1 = false;
        this.e1 = false;
        this.f1 = false;
        this.g1 = false;
        this.h1 = false;
        this.i1 = false;
        this.j1 = false;
        this.m1 = false;
        this.x1 = false;
        this.y1 = 0;
        this.Q0 = false;
    }

    public boolean k() {
        return this.H1;
    }

    public final void k0(er4 er4) {
        er4 er42 = this.N0;
        if (er42 != er4) {
            if (er4 != null) {
                er4.g((kr4) null);
            }
            if (er42 != null) {
                er42.f((kr4) null);
            }
        }
        this.N0 = er4;
    }

    public boolean l() {
        boolean z;
        if (this.L0 == null) {
            return false;
        }
        if (j()) {
            z = this.v0;
        } else {
            frc frc = this.Z;
            frc.getClass();
            z = frc.d();
        }
        if (!z) {
            if (!(this.q1 >= 0) && (this.o1 == -9223372036854775807L || SystemClock.elapsedRealtime() >= this.o1)) {
                return false;
            }
        }
        return true;
    }

    public boolean l0(x78 x78) {
        return true;
    }

    public boolean m0(oy5 oy5) {
        return false;
    }

    public abstract int n0(xw0 xw0, oy5 oy5);

    public void o(long j, boolean z) {
        int i;
        this.G1 = false;
        this.H1 = false;
        this.J1 = false;
        if (this.u1) {
            this.E0.v();
            this.D0.v();
            this.v1 = false;
        } else if (K()) {
            T();
        }
        due due = this.F0;
        synchronized (due) {
            i = due.e;
        }
        if (i > 0) {
            this.I1 = true;
        }
        this.F0.b();
        int i2 = this.O1;
        if (i2 != 0) {
            int i3 = i2 - 1;
            this.N1 = this.J0[i3];
            this.M1 = this.I0[i3];
            this.O1 = 0;
        }
    }

    public final boolean o0(oy5 oy5) {
        if (!(maf.a < 23 || this.U0 == null || this.A1 == 3 || this.Y == 0)) {
            float f = this.T0;
            oy5[] oy5Arr = this.s0;
            oy5Arr.getClass();
            float N = N(f, oy5Arr);
            float f2 = this.Y0;
            if (f2 == N) {
                return true;
            }
            if (N == -1.0f) {
                if (this.B1) {
                    this.z1 = 1;
                    this.A1 = 3;
                    return false;
                }
                g0();
                T();
                return false;
            } else if (f2 == -1.0f && N <= this.A0) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", N);
                this.U0.setParameters(bundle);
                this.Y0 = N;
            }
        }
        return true;
    }

    public final void p0() {
        try {
            this.P0.setMediaDrmSession(P(this.O0).b);
            k0(this.O0);
            this.z1 = 0;
            this.A1 = 0;
        } catch (MediaCryptoException e) {
            throw e(e, this.L0, false, 6006);
        }
    }

    public final void q0(long j) {
        Object d;
        Object g;
        due due = this.F0;
        synchronized (due) {
            d = due.d(j, true);
        }
        oy5 oy5 = (oy5) d;
        if (oy5 == null && this.X0) {
            due due2 = this.F0;
            synchronized (due2) {
                g = due2.e == 0 ? null : due2.g();
            }
            oy5 = (oy5) g;
        }
        if (oy5 != null) {
            this.M0 = oy5;
        } else if (!this.X0 || this.M0 == null) {
            return;
        }
        Z(this.M0, this.W0);
        this.X0 = false;
    }

    public final void s(oy5[] oy5Arr, long j, long j2) {
        boolean z = true;
        if (this.N1 == -9223372036854775807L) {
            if (this.M1 != -9223372036854775807L) {
                z = false;
            }
            np8.f(z);
            this.M1 = j;
            this.N1 = j2;
            return;
        }
        int i = this.O1;
        long[] jArr = this.J0;
        if (i == jArr.length) {
            long j3 = jArr[i - 1];
        } else {
            this.O1 = i + 1;
        }
        int i2 = this.O1 - 1;
        this.I0[i2] = j;
        jArr[i2] = j2;
        this.K0[i2] = this.E1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x006b A[Catch:{ IllegalStateException -> 0x0017 }, LOOP:1: B:28:0x004b->B:38:0x006b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0087 A[Catch:{ IllegalStateException -> 0x0017 }, LOOP:2: B:39:0x006c->B:49:0x0087, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x006c A[EDGE_INSN: B:81:0x006c->B:84:0x006c ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0088 A[EDGE_INSN: B:83:0x0088->B:50:0x0088 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void w(long r12, long r14) {
        /*
            r11 = this;
            boolean r0 = r11.J1
            r1 = 0
            if (r0 == 0) goto L_0x000a
            r11.J1 = r1
            r11.d0()
        L_0x000a:
            com.google.android.exoplayer2.ExoPlaybackException r0 = r11.K1
            if (r0 != 0) goto L_0x00f1
            r0 = 1
            boolean r2 = r11.H1     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x001a
            r11.h0()     // Catch:{ IllegalStateException -> 0x0017 }
            return
        L_0x0017:
            r12 = move-exception
            goto L_0x00a7
        L_0x001a:
            oy5 r2 = r11.L0     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 != 0) goto L_0x0026
            r2 = 2
            boolean r2 = r11.f0(r2)     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 != 0) goto L_0x0026
            return
        L_0x0026:
            r11.T()     // Catch:{ IllegalStateException -> 0x0017 }
            boolean r2 = r11.u1     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x003e
            java.lang.String r2 = "bypassRender"
            defpackage.j47.k(r2)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x0032:
            boolean r2 = r11.C(r12, r14)     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x0039
            goto L_0x0032
        L_0x0039:
            defpackage.j47.A()     // Catch:{ IllegalStateException -> 0x0017 }
            goto L_0x00a2
        L_0x003e:
            r78 r2 = r11.U0     // Catch:{ IllegalStateException -> 0x0017 }
            if (r2 == 0) goto L_0x008c
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            java.lang.String r4 = "drainAndFeed"
            defpackage.j47.k(r4)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x004b:
            boolean r4 = r11.H(r12, r14)     // Catch:{ IllegalStateException -> 0x0017 }
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 == 0) goto L_0x006c
            long r7 = r11.R0     // Catch:{ IllegalStateException -> 0x0017 }
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x0068
            long r9 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            long r9 = r9 - r2
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 >= 0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            r4 = r1
            goto L_0x0069
        L_0x0068:
            r4 = r0
        L_0x0069:
            if (r4 == 0) goto L_0x006c
            goto L_0x004b
        L_0x006c:
            boolean r12 = r11.I()     // Catch:{ IllegalStateException -> 0x0017 }
            if (r12 == 0) goto L_0x0088
            long r12 = r11.R0     // Catch:{ IllegalStateException -> 0x0017 }
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L_0x0084
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0017 }
            long r14 = r14 - r2
            int r12 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r12 >= 0) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r12 = r1
            goto L_0x0085
        L_0x0084:
            r12 = r0
        L_0x0085:
            if (r12 == 0) goto L_0x0088
            goto L_0x006c
        L_0x0088:
            defpackage.j47.A()     // Catch:{ IllegalStateException -> 0x0017 }
            goto L_0x00a2
        L_0x008c:
            n54 r14 = r11.L1     // Catch:{ IllegalStateException -> 0x0017 }
            int r15 = r14.e     // Catch:{ IllegalStateException -> 0x0017 }
            frc r2 = r11.Z     // Catch:{ IllegalStateException -> 0x0017 }
            r2.getClass()     // Catch:{ IllegalStateException -> 0x0017 }
            long r3 = r11.t0     // Catch:{ IllegalStateException -> 0x0017 }
            long r12 = r12 - r3
            int r12 = r2.e(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            int r15 = r15 + r12
            r14.e = r15     // Catch:{ IllegalStateException -> 0x0017 }
            r11.f0(r0)     // Catch:{ IllegalStateException -> 0x0017 }
        L_0x00a2:
            n54 r12 = r11.L1     // Catch:{ IllegalStateException -> 0x0017 }
            monitor-enter(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            monitor-exit(r12)     // Catch:{ IllegalStateException -> 0x0017 }
            return
        L_0x00a7:
            int r13 = defpackage.maf.a
            r14 = 21
            if (r13 < r14) goto L_0x00b2
            boolean r15 = r12 instanceof android.media.MediaCodec.CodecException
            if (r15 == 0) goto L_0x00b2
            goto L_0x00c7
        L_0x00b2:
            java.lang.StackTraceElement[] r15 = r12.getStackTrace()
            int r2 = r15.length
            if (r2 <= 0) goto L_0x00f0
            r15 = r15[r1]
            java.lang.String r15 = r15.getClassName()
            java.lang.String r2 = "android.media.MediaCodec"
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto L_0x00f0
        L_0x00c7:
            r11.V(r12)
            if (r13 < r14) goto L_0x00dc
            boolean r13 = r12 instanceof android.media.MediaCodec.CodecException
            if (r13 == 0) goto L_0x00d8
            r13 = r12
            android.media.MediaCodec$CodecException r13 = (android.media.MediaCodec.CodecException) r13
            boolean r13 = r13.isRecoverable()
            goto L_0x00d9
        L_0x00d8:
            r13 = r1
        L_0x00d9:
            if (r13 == 0) goto L_0x00dc
            r1 = r0
        L_0x00dc:
            if (r1 == 0) goto L_0x00e1
            r11.g0()
        L_0x00e1:
            x78 r13 = r11.b1
            com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException r12 = r11.E(r12, r13)
            oy5 r13 = r11.L0
            r14 = 4003(0xfa3, float:5.61E-42)
            com.google.android.exoplayer2.ExoPlaybackException r11 = r11.e(r12, r13, r1, r14)
            throw r11
        L_0x00f0:
            throw r12
        L_0x00f1:
            r12 = 0
            r11.K1 = r12
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f88.w(long, long):void");
    }

    public void z(float f, float f2) {
        this.S0 = f;
        this.T0 = f2;
        o0(this.V0);
    }
}
