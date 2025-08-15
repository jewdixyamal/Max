package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: bt0  reason: default package */
public final class bt0 implements fu0, eu0, Cloneable, ByteChannel {
    public k2d a;
    public long b;

    public final /* bridge */ /* synthetic */ eu0 A(int i) {
        x0(i);
        return this;
    }

    public final void A0(String str) {
        z0(0, str.length(), str);
    }

    public final boolean B() {
        return this.b == 0;
    }

    public final void B0(int i) {
        String str;
        int i2 = i;
        int i3 = 0;
        if (i2 < 128) {
            u0(i);
        } else if (i2 < 2048) {
            k2d r0 = r0(2);
            int i4 = r0.c;
            byte[] bArr = r0.a;
            bArr[i4] = (byte) ((i2 >> 6) | 192);
            bArr[1 + i4] = (byte) ((i2 & 63) | 128);
            r0.c = i4 + 2;
            this.b += 2;
        } else if (55296 <= i2 && 57343 >= i2) {
            u0(63);
        } else if (i2 < 65536) {
            k2d r02 = r0(3);
            int i5 = r02.c;
            byte[] bArr2 = r02.a;
            bArr2[i5] = (byte) ((i2 >> 12) | 224);
            bArr2[1 + i5] = (byte) (((i2 >> 6) & 63) | 128);
            bArr2[2 + i5] = (byte) ((i2 & 63) | 128);
            r02.c = i5 + 3;
            this.b += 3;
        } else if (i2 <= 1114111) {
            k2d r03 = r0(4);
            int i6 = r03.c;
            byte[] bArr3 = r03.a;
            bArr3[i6] = (byte) ((i2 >> 18) | 240);
            bArr3[1 + i6] = (byte) (((i2 >> 12) & 63) | 128);
            bArr3[2 + i6] = (byte) (((i2 >> 6) & 63) | 128);
            bArr3[3 + i6] = (byte) ((i2 & 63) | 128);
            r03.c = i6 + 4;
            this.b += 4;
        } else {
            StringBuilder sb = new StringBuilder("Unexpected code point: 0x");
            if (i2 != 0) {
                char[] cArr = z04.a;
                char[] cArr2 = {cArr[(i2 >> 28) & 15], cArr[(i2 >> 24) & 15], cArr[(i2 >> 20) & 15], cArr[(i2 >> 16) & 15], cArr[(i2 >> 12) & 15], cArr[(i2 >> 8) & 15], cArr[(i2 >> 4) & 15], cArr[i2 & 15]};
                while (i3 < 8 && cArr2[i3] == '0') {
                    i3++;
                }
                str = new String(cArr2, i3, 8 - i3);
            } else {
                str = "0";
            }
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final /* bridge */ /* synthetic */ eu0 C(int i) {
        u0(i);
        return this;
    }

    public final eu0 E() {
        return this;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [java.lang.Object, bt0] */
    public final String G(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            byte b2 = (byte) 10;
            long U = U(b2, 0, j2);
            if (U != -1) {
                return jt0.a(this, U);
            }
            if (j2 < this.b && S(j2 - 1) == ((byte) 13) && S(j2) == b2) {
                return jt0.a(this, j2);
            }
            ? obj = new Object();
            o(obj, 0, Math.min((long) 32, this.b));
            throw new EOFException("\\n not found: limit=" + Math.min(this.b, j) + " content=" + obj.e(obj.b).d() + 8230);
        }
        throw new IllegalArgumentException(ey8.h(j, "limit < 0: ").toString());
    }

    public final long K(ux uxVar) {
        long j = this.b;
        if (j > 0) {
            uxVar.N(this, j);
        }
        return j;
    }

    public final /* bridge */ /* synthetic */ eu0 L(String str) {
        A0(str);
        return this;
    }

    public final /* bridge */ /* synthetic */ eu0 M(aw0 aw0) {
        s0(aw0);
        return this;
    }

    public final void N(bt0 bt0, long j) {
        k2d k2d;
        if (bt0 != this) {
            hm9.g(bt0.b, 0, j);
            while (j > 0) {
                k2d k2d2 = bt0.a;
                int i = k2d2.c;
                int i2 = k2d2.b;
                int i3 = 0;
                if (j < ((long) (i - i2))) {
                    k2d k2d3 = this.a;
                    k2d k2d4 = k2d3 != null ? k2d3.g : null;
                    if (k2d4 != null && k2d4.e) {
                        if ((((long) k2d4.c) + j) - ((long) (k2d4.d ? 0 : k2d4.b)) <= ((long) 8192)) {
                            k2d2.d(k2d4, (int) j);
                            bt0.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    int i4 = (int) j;
                    if (i4 <= 0 || i4 > i - i2) {
                        throw new IllegalArgumentException("byteCount out of range".toString());
                    }
                    if (i4 >= 1024) {
                        k2d = k2d2.c();
                    } else {
                        k2d = b3d.b();
                        int i5 = k2d2.b;
                        ys.Y(k2d2.a, i5, k2d.a, i5 + i4);
                    }
                    k2d.c = k2d.b + i4;
                    k2d2.b += i4;
                    k2d2.g.b(k2d);
                    bt0.a = k2d;
                }
                k2d k2d5 = bt0.a;
                long j2 = (long) (k2d5.c - k2d5.b);
                bt0.a = k2d5.a();
                k2d k2d6 = this.a;
                if (k2d6 == null) {
                    this.a = k2d5;
                    k2d5.g = k2d5;
                    k2d5.f = k2d5;
                } else {
                    k2d6.g.b(k2d5);
                    k2d k2d7 = k2d5.g;
                    if (k2d7 == k2d5) {
                        throw new IllegalStateException("cannot compact".toString());
                    } else if (k2d7.e) {
                        int i6 = k2d5.c - k2d5.b;
                        int i7 = 8192 - k2d7.c;
                        if (!k2d7.d) {
                            i3 = k2d7.b;
                        }
                        if (i6 <= i7 + i3) {
                            k2d5.d(k2d7, i6);
                            k2d5.a();
                            b3d.a(k2d5);
                        }
                    }
                }
                bt0.b -= j2;
                this.b += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public final String O(Charset charset) {
        return o0(this.b, charset);
    }

    public final /* bridge */ /* synthetic */ eu0 P(long j) {
        w0(j);
        return this;
    }

    public final void Q(bt0 bt0, long j) {
        long j2 = this.b;
        if (j2 >= j) {
            bt0.N(this, j);
        } else {
            bt0.N(this, j2);
            throw new EOFException();
        }
    }

    public final void R(long j) {
        while (j > 0) {
            k2d k2d = this.a;
            if (k2d != null) {
                int min = (int) Math.min(j, (long) (k2d.c - k2d.b));
                long j2 = (long) min;
                this.b -= j2;
                j -= j2;
                int i = k2d.b + min;
                k2d.b = i;
                if (i == k2d.c) {
                    this.a = k2d.a();
                    b3d.a(k2d);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final byte S(long j) {
        hm9.g(this.b, j, 1);
        k2d k2d = this.a;
        k2d.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                k2d = k2d.g;
                j2 -= (long) (k2d.c - k2d.b);
            }
            return k2d.a[(int) ((((long) k2d.b) + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = k2d.c;
            int i2 = k2d.b;
            long j4 = ((long) (i - i2)) + j3;
            if (j4 > j) {
                return k2d.a[(int) ((((long) i2) + j) - j3)];
            }
            k2d = k2d.f;
            j3 = j4;
        }
    }

    public final long U(byte b2, long j, long j2) {
        k2d k2d;
        byte b3 = b2;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 <= j3 && j4 >= j3) {
            long j6 = this.b;
            if (j4 > j6) {
                j4 = j6;
            }
            if (!(j3 == j4 || (k2d = this.a) == null)) {
                if (j6 - j3 < j3) {
                    while (j6 > j3) {
                        k2d = k2d.g;
                        j6 -= (long) (k2d.c - k2d.b);
                    }
                    while (j6 < j4) {
                        byte[] bArr = k2d.a;
                        int min = (int) Math.min((long) k2d.c, (((long) k2d.b) + j4) - j6);
                        for (int i = (int) ((((long) k2d.b) + j3) - j6); i < min; i++) {
                            if (bArr[i] == b3) {
                                return ((long) (i - k2d.b)) + j6;
                            }
                        }
                        j6 += (long) (k2d.c - k2d.b);
                        k2d = k2d.f;
                        j3 = j6;
                    }
                } else {
                    while (true) {
                        long j7 = ((long) (k2d.c - k2d.b)) + j5;
                        if (j7 > j3) {
                            break;
                        }
                        k2d = k2d.f;
                        j5 = j7;
                    }
                    while (j5 < j4) {
                        byte[] bArr2 = k2d.a;
                        int min2 = (int) Math.min((long) k2d.c, (((long) k2d.b) + j4) - j5);
                        for (int i2 = (int) ((((long) k2d.b) + j3) - j5); i2 < min2; i2++) {
                            if (bArr2[i2] == b3) {
                                return ((long) (i2 - k2d.b)) + j5;
                            }
                        }
                        j5 += (long) (k2d.c - k2d.b);
                        k2d = k2d.f;
                        j3 = j5;
                    }
                }
            }
            return -1;
        }
        StringBuilder sb = new StringBuilder("size=");
        sb.append(this.b);
        au1.q(j3, " fromIndex=", " toIndex=", sb);
        sb.append(j4);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final String X() {
        return G(Long.MAX_VALUE);
    }

    public final /* bridge */ /* synthetic */ eu0 b0(int i, byte[] bArr, int i2) {
        write(bArr, i, i2);
        return this;
    }

    public final long c(bt0 bt0, long j) {
        if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            bt0.N(this, j);
            return j;
        }
        throw new IllegalArgumentException(ey8.h(j, "byteCount < 0: ").toString());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, bt0] */
    public final Object clone() {
        ? obj = new Object();
        if (this.b != 0) {
            k2d k2d = this.a;
            k2d c = k2d.c();
            obj.a = c;
            c.g = c;
            c.f = c;
            for (k2d k2d2 = k2d.f; k2d2 != k2d; k2d2 = k2d2.f) {
                c.g.b(k2d2.c());
            }
            obj.b = this.b;
        }
        return obj;
    }

    public final void close() {
    }

    public final int d0(vma vma) {
        int b2 = jt0.b(this, vma, false);
        if (b2 == -1) {
            return -1;
        }
        R((long) vma.a[b2].c());
        return b2;
    }

    public final aw0 e(long j) {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount: ").toString());
        } else if (this.b < j) {
            throw new EOFException();
        } else if (j < ((long) 4096)) {
            return new aw0(n0(j));
        } else {
            aw0 q0 = q0((int) j);
            R(j);
            return q0;
        }
    }

    public final int e0(byte[] bArr, int i, int i2) {
        hm9.g((long) bArr.length, (long) i, (long) i2);
        k2d k2d = this.a;
        if (k2d == null) {
            return -1;
        }
        int min = Math.min(i2, k2d.c - k2d.b);
        int i3 = k2d.b;
        System.arraycopy(k2d.a, i3, bArr, i, (i3 + min) - i3);
        int i4 = k2d.b + min;
        k2d.b = i4;
        this.b -= (long) min;
        if (i4 != k2d.c) {
            return min;
        }
        this.a = k2d.a();
        b3d.a(k2d);
        return min;
    }

    /* JADX WARNING: type inference failed for: r19v0, types: [java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            if (r0 != r1) goto L_0x0009
        L_0x0006:
            r2 = 1
            goto L_0x006b
        L_0x0009:
            boolean r3 = r1 instanceof defpackage.bt0
            if (r3 != 0) goto L_0x000f
        L_0x000d:
            r2 = 0
            goto L_0x006b
        L_0x000f:
            long r5 = r0.b
            bt0 r1 = (defpackage.bt0) r1
            long r7 = r1.b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 == 0) goto L_0x001a
            goto L_0x000d
        L_0x001a:
            r7 = 0
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 != 0) goto L_0x0021
            goto L_0x0006
        L_0x0021:
            k2d r3 = r0.a
            k2d r1 = r1.a
            int r5 = r3.b
            int r6 = r1.b
            r9 = r7
        L_0x002a:
            long r11 = r0.b
            int r11 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r11 >= 0) goto L_0x0006
            int r11 = r3.c
            int r11 = r11 - r5
            int r12 = r1.c
            int r12 = r12 - r6
            int r11 = java.lang.Math.min(r11, r12)
            long r11 = (long) r11
            r13 = r7
        L_0x003c:
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 >= 0) goto L_0x0056
            int r15 = r5 + 1
            byte[] r2 = r3.a
            byte r2 = r2[r5]
            int r5 = r6 + 1
            byte[] r4 = r1.a
            byte r4 = r4[r6]
            if (r2 == r4) goto L_0x004f
            goto L_0x000d
        L_0x004f:
            r16 = 1
            long r13 = r13 + r16
            r6 = r5
            r5 = r15
            goto L_0x003c
        L_0x0056:
            int r2 = r3.c
            if (r5 != r2) goto L_0x0060
            k2d r2 = r3.f
            int r3 = r2.b
            r5 = r3
            r3 = r2
        L_0x0060:
            int r2 = r1.c
            if (r6 != r2) goto L_0x0069
            k2d r1 = r1.f
            int r2 = r1.b
            r6 = r2
        L_0x0069:
            long r9 = r9 + r11
            goto L_0x002a
        L_0x006b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt0.equals(java.lang.Object):boolean");
    }

    public final void flush() {
    }

    public final bt0 getBuffer() {
        return this;
    }

    public final void h0(long j) {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    public final int hashCode() {
        k2d k2d = this.a;
        if (k2d == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = k2d.c;
            for (int i3 = k2d.b; i3 < i2; i3++) {
                i = (i * 31) + k2d.a[i3];
            }
            k2d = k2d.f;
        } while (k2d != this.a);
        return i;
    }

    public final /* bridge */ /* synthetic */ eu0 i0(long j) {
        v0(j);
        return this;
    }

    public final boolean isOpen() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, bt0] */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0095, code lost:
        if (r12 != r13) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0097, code lost:
        r0.a = r10.a();
        defpackage.b3d.a(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a1, code lost:
        r10.b = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        if (r9 != false) goto L_0x00a9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0070 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long j0() {
        /*
            r18 = this;
            r0 = r18
            r1 = 4
            r3 = 1
            long r4 = r0.b
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x00b0
            r4 = r6
            r8 = 0
            r9 = 0
        L_0x000f:
            k2d r10 = r0.a
            byte[] r11 = r10.a
            int r12 = r10.b
            int r13 = r10.c
        L_0x0017:
            if (r12 >= r13) goto L_0x006e
            byte r14 = r11[r12]
            r15 = 48
            byte r15 = (byte) r15
            if (r14 < r15) goto L_0x0028
            r2 = 57
            byte r2 = (byte) r2
            if (r14 > r2) goto L_0x0028
            int r2 = r14 - r15
            goto L_0x0042
        L_0x0028:
            r2 = 97
            byte r2 = (byte) r2
            if (r14 < r2) goto L_0x0037
            r15 = 102(0x66, float:1.43E-43)
            byte r15 = (byte) r15
            if (r14 > r15) goto L_0x0037
        L_0x0032:
            int r2 = r14 - r2
            int r2 = r2 + 10
            goto L_0x0042
        L_0x0037:
            r2 = 65
            byte r2 = (byte) r2
            if (r14 < r2) goto L_0x006b
            r15 = 70
            byte r15 = (byte) r15
            if (r14 > r15) goto L_0x006b
            goto L_0x0032
        L_0x0042:
            r16 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r16 = r4 & r16
            int r15 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r15 != 0) goto L_0x0050
            long r4 = r4 << r1
            long r14 = (long) r2
            long r4 = r4 | r14
            int r12 = r12 + r3
            int r8 = r8 + r3
            goto L_0x0017
        L_0x0050:
            bt0 r0 = new bt0
            r0.<init>()
            r0.w0(r4)
            r0.u0(r14)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r0 = r0.p0()
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L_0x006b:
            if (r8 == 0) goto L_0x0070
            r9 = r3
        L_0x006e:
            r11 = 0
            goto L_0x0095
        L_0x0070:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            char[] r2 = defpackage.z04.a
            int r1 = r14 >> 4
            r1 = r1 & 15
            char r1 = r2[r1]
            r4 = r14 & 15
            char r2 = r2[r4]
            r4 = 2
            char[] r4 = new char[r4]
            r11 = 0
            r4[r11] = r1
            r4[r3] = r2
            java.lang.String r1 = new java.lang.String
            r1.<init>(r4)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1)
            throw r0
        L_0x0095:
            if (r12 != r13) goto L_0x00a1
            k2d r2 = r10.a()
            r0.a = r2
            defpackage.b3d.a(r10)
            goto L_0x00a3
        L_0x00a1:
            r10.b = r12
        L_0x00a3:
            if (r9 != 0) goto L_0x00a9
            k2d r2 = r0.a
            if (r2 != 0) goto L_0x000f
        L_0x00a9:
            long r1 = r0.b
            long r6 = (long) r8
            long r1 = r1 - r6
            r0.b = r1
            return r4
        L_0x00b0:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt0.j0():long");
    }

    public final InputStream l0() {
        return new us0(this, 0);
    }

    public final void m() {
        R(this.b);
    }

    public final void m0(ss0 ss0) {
        if (ss0.a == null) {
            ss0.a = this;
            ss0.b = true;
            return;
        }
        throw new IllegalStateException("already attached to a buffer".toString());
    }

    public final long n() {
        long j = this.b;
        if (j == 0) {
            return 0;
        }
        k2d k2d = this.a.g;
        int i = k2d.c;
        if (i < 8192 && k2d.e) {
            j -= (long) (i - k2d.b);
        }
        return j;
    }

    public final byte[] n0(long j) {
        if (!(j >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount: ").toString());
        } else if (this.b >= j) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        } else {
            throw new EOFException();
        }
    }

    public final void o(bt0 bt0, long j, long j2) {
        hm9.g(this.b, j, j2);
        if (j2 != 0) {
            bt0.b += j2;
            k2d k2d = this.a;
            while (true) {
                long j3 = (long) (k2d.c - k2d.b);
                if (j < j3) {
                    break;
                }
                j -= j3;
                k2d = k2d.f;
            }
            while (j2 > 0) {
                k2d c = k2d.c();
                int i = c.b + ((int) j);
                c.b = i;
                c.c = Math.min(i + ((int) j2), c.c);
                k2d k2d2 = bt0.a;
                if (k2d2 == null) {
                    c.g = c;
                    c.f = c;
                    bt0.a = c;
                } else {
                    k2d2.g.b(c);
                }
                j2 -= (long) (c.c - c.b);
                k2d = k2d.f;
                j = 0;
            }
        }
    }

    public final String o0(long j, Charset charset) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (!(i >= 0 && j <= ((long) Integer.MAX_VALUE))) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount: ").toString());
        } else if (this.b < j) {
            throw new EOFException();
        } else if (i == 0) {
            return "";
        } else {
            k2d k2d = this.a;
            int i2 = k2d.b;
            if (((long) i2) + j > ((long) k2d.c)) {
                return new String(n0(j), charset);
            }
            int i3 = (int) j;
            String str = new String(k2d.a, i2, i3, charset);
            int i4 = k2d.b + i3;
            k2d.b = i4;
            this.b -= j;
            if (i4 == k2d.c) {
                this.a = k2d.a();
                b3d.a(k2d);
            }
            return str;
        }
    }

    public final oue p() {
        return oue.d;
    }

    public final String p0() {
        return o0(this.b, a52.a);
    }

    public final aw0 q0(int i) {
        if (i == 0) {
            return aw0.o;
        }
        hm9.g(this.b, 0, (long) i);
        k2d k2d = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = k2d.c;
            int i6 = k2d.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                k2d = k2d.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i4][];
        int[] iArr = new int[(i4 * 2)];
        k2d k2d2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            bArr[i7] = k2d2.a;
            i2 += k2d2.c - k2d2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = k2d2.b;
            k2d2.d = true;
            i7++;
            k2d2 = k2d2.f;
        }
        return new c3d(bArr, iArr);
    }

    public final k2d r0(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        k2d k2d = this.a;
        if (k2d == null) {
            k2d b2 = b3d.b();
            this.a = b2;
            b2.g = b2;
            b2.f = b2;
            return b2;
        }
        k2d k2d2 = k2d.g;
        if (k2d2.c + i <= 8192 && k2d2.e) {
            return k2d2;
        }
        k2d b3 = b3d.b();
        k2d2.b(b3);
        return b3;
    }

    public final int read(ByteBuffer byteBuffer) {
        k2d k2d = this.a;
        if (k2d == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), k2d.c - k2d.b);
        byteBuffer.put(k2d.a, k2d.b, min);
        int i = k2d.b + min;
        k2d.b = i;
        this.b -= (long) min;
        if (i == k2d.c) {
            this.a = k2d.a();
            b3d.a(k2d);
        }
        return min;
    }

    public final byte readByte() {
        long j = this.b;
        if (j != 0) {
            k2d k2d = this.a;
            int i = k2d.b;
            int i2 = k2d.c;
            int i3 = i + 1;
            byte b2 = k2d.a[i];
            this.b = j - 1;
            if (i3 == i2) {
                this.a = k2d.a();
                b3d.a(k2d);
            } else {
                k2d.b = i3;
            }
            return b2;
        }
        throw new EOFException();
    }

    public final void readFully(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int e0 = e0(bArr, i, bArr.length - i);
            if (e0 != -1) {
                i += e0;
            } else {
                throw new EOFException();
            }
        }
    }

    public final int readInt() {
        long j = this.b;
        if (j >= 4) {
            k2d k2d = this.a;
            int i = k2d.b;
            int i2 = k2d.c;
            if (((long) (i2 - i)) < 4) {
                return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
            }
            byte[] bArr = k2d.a;
            byte b2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i3 = i + 3;
            int i4 = i + 4;
            byte b3 = b2 | ((bArr[i + 2] & 255) << 8) | (bArr[i3] & 255);
            this.b = j - 4;
            if (i4 == i2) {
                this.a = k2d.a();
                b3d.a(k2d);
            } else {
                k2d.b = i4;
            }
            return b3;
        }
        throw new EOFException();
    }

    public final long readLong() {
        long j = this.b;
        if (j >= 8) {
            k2d k2d = this.a;
            int i = k2d.b;
            int i2 = k2d.c;
            if (((long) (i2 - i)) < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = k2d.a;
            long j2 = ((((long) bArr[i + 1]) & 255) << 48) | ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i + 2]) & 255) << 40) | ((((long) bArr[i + 3]) & 255) << 32) | ((((long) bArr[i + 4]) & 255) << 24);
            int i3 = i2;
            int i4 = i + 7;
            int i5 = i + 8;
            long j3 = j2 | ((((long) bArr[i + 5]) & 255) << 16) | ((((long) bArr[i + 6]) & 255) << 8) | (((long) bArr[i4]) & 255);
            this.b = j - 8;
            if (i5 == i3) {
                this.a = k2d.a();
                b3d.a(k2d);
            } else {
                k2d.b = i5;
            }
            return j3;
        }
        throw new EOFException();
    }

    public final short readShort() {
        long j = this.b;
        if (j >= 2) {
            k2d k2d = this.a;
            int i = k2d.b;
            int i2 = k2d.c;
            if (i2 - i < 2) {
                return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
            }
            int i3 = i + 1;
            byte[] bArr = k2d.a;
            int i4 = i + 2;
            byte b2 = (bArr[i3] & 255) | ((bArr[i] & 255) << 8);
            this.b = j - 2;
            if (i4 == i2) {
                this.a = k2d.a();
                b3d.a(k2d);
            } else {
                k2d.b = i4;
            }
            return (short) b2;
        }
        throw new EOFException();
    }

    public final void s0(aw0 aw0) {
        aw0.k(this, aw0.c());
    }

    public final void t0(yud yud) {
        do {
        } while (yud.c(this, (long) 8192) != -1);
    }

    public final String toString() {
        long j = this.b;
        if (j <= ((long) Integer.MAX_VALUE)) {
            return q0((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.b).toString());
    }

    public final void u0(int i) {
        k2d r0 = r0(1);
        int i2 = r0.c;
        r0.c = i2 + 1;
        r0.a[i2] = (byte) i;
        this.b++;
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00f2 A[LOOP:0: B:67:0x00ec->B:69:0x00f2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0100 A[EDGE_INSN: B:73:0x0100->B:70:0x0100 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v0(long r14) {
        /*
            r13 = this;
            r0 = 0
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x000d
            r14 = 48
            r13.u0(r14)
            goto L_0x0114
        L_0x000d:
            r3 = 0
            r4 = 1
            if (r2 >= 0) goto L_0x0020
            long r14 = -r14
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x001f
            r14 = 20
            java.lang.String r15 = "-9223372036854775808"
            r13.z0(r3, r14, r15)
            goto L_0x0114
        L_0x001f:
            r3 = r4
        L_0x0020:
            r5 = 100000000(0x5f5e100, double:4.94065646E-316)
            int r2 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            r5 = 10
            if (r2 >= 0) goto L_0x006a
            r6 = 10000(0x2710, double:4.9407E-320)
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x004c
            r6 = 100
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0040
            r6 = 10
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x003d
            goto L_0x00e1
        L_0x003d:
            r4 = 2
            goto L_0x00e1
        L_0x0040:
            r6 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x004a
            r2 = 3
        L_0x0047:
            r4 = r2
            goto L_0x00e1
        L_0x004a:
            r2 = 4
            goto L_0x0047
        L_0x004c:
            r6 = 1000000(0xf4240, double:4.940656E-318)
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x005e
            r6 = 100000(0x186a0, double:4.94066E-319)
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x005c
            r2 = 5
            goto L_0x0047
        L_0x005c:
            r2 = 6
            goto L_0x0047
        L_0x005e:
            r6 = 10000000(0x989680, double:4.9406565E-317)
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0067
            r2 = 7
            goto L_0x0047
        L_0x0067:
            r2 = 8
            goto L_0x0047
        L_0x006a:
            r6 = 1000000000000(0xe8d4a51000, double:4.94065645841E-312)
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0097
            r6 = 10000000000(0x2540be400, double:4.9406564584E-314)
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0088
            r6 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0086
            r4 = 9
            goto L_0x00e1
        L_0x0086:
            r4 = r5
            goto L_0x00e1
        L_0x0088:
            r6 = 100000000000(0x174876e800, double:4.9406564584E-313)
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0094
            r2 = 11
            goto L_0x0047
        L_0x0094:
            r2 = 12
            goto L_0x0047
        L_0x0097:
            r6 = 1000000000000000(0x38d7ea4c68000, double:4.940656458412465E-309)
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00bb
            r6 = 10000000000000(0x9184e72a000, double:4.9406564584125E-311)
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ac
            r4 = 13
            goto L_0x00e1
        L_0x00ac:
            r6 = 100000000000000(0x5af3107a4000, double:4.94065645841247E-310)
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00b8
            r2 = 14
            goto L_0x0047
        L_0x00b8:
            r2 = 15
            goto L_0x0047
        L_0x00bb:
            r6 = 100000000000000000(0x16345785d8a0000, double:5.620395787888205E-302)
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00d3
            r6 = 10000000000000000(0x2386f26fc10000, double:5.431165199810528E-308)
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00d0
            r4 = 16
            goto L_0x00e1
        L_0x00d0:
            r4 = 17
            goto L_0x00e1
        L_0x00d3:
            r6 = 1000000000000000000(0xde0b6b3a7640000, double:7.832953389245686E-242)
            int r2 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x00df
            r4 = 18
            goto L_0x00e1
        L_0x00df:
            r4 = 19
        L_0x00e1:
            if (r3 == 0) goto L_0x00e5
            int r4 = r4 + 1
        L_0x00e5:
            k2d r2 = r13.r0(r4)
            int r6 = r2.c
            int r6 = r6 + r4
        L_0x00ec:
            int r7 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            byte[] r8 = r2.a
            if (r7 == 0) goto L_0x0100
            long r9 = (long) r5
            long r11 = r14 % r9
            int r7 = (int) r11
            int r6 = r6 + -1
            byte[] r11 = defpackage.jt0.a
            byte r7 = r11[r7]
            r8[r6] = r7
            long r14 = r14 / r9
            goto L_0x00ec
        L_0x0100:
            if (r3 == 0) goto L_0x0109
            int r6 = r6 + -1
            r14 = 45
            byte r14 = (byte) r14
            r8[r6] = r14
        L_0x0109:
            int r14 = r2.c
            int r14 = r14 + r4
            r2.c = r14
            long r14 = r13.b
            long r0 = (long) r4
            long r14 = r14 + r0
            r13.b = r14
        L_0x0114:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bt0.v0(long):void");
    }

    public final void w0(long j) {
        if (j == 0) {
            u0(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        k2d r0 = r0(i);
        int i2 = r0.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            r0.a[i3] = jt0.a[(int) (15 & j)];
            j >>>= 4;
        }
        r0.c += i;
        this.b += (long) i;
    }

    public final int write(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            k2d r0 = r0(1);
            int min = Math.min(i, 8192 - r0.c);
            byteBuffer.get(r0.a, r0.c, min);
            i -= min;
            r0.c += min;
        }
        this.b += (long) remaining;
        return remaining;
    }

    public final eu0 x() {
        return this;
    }

    public final void x0(int i) {
        k2d r0 = r0(4);
        int i2 = r0.c;
        byte[] bArr = r0.a;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        r0.c = i2 + 4;
        this.b += 4;
    }

    public final /* bridge */ /* synthetic */ eu0 y(int i) {
        y0(i);
        return this;
    }

    public final void y0(int i) {
        k2d r0 = r0(2);
        int i2 = r0.c;
        byte[] bArr = r0.a;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        r0.c = i2 + 2;
        this.b += 2;
    }

    public final void z0(int i, int i2, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(zr6.h(i, "beginIndex < 0: ").toString());
        } else if (i2 < i) {
            throw new IllegalArgumentException(rh4.h("endIndex < beginIndex: ", i2, i, " < ").toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    k2d r0 = r0(1);
                    int i3 = r0.c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    byte[] bArr = r0.a;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i4 + i3] = (byte) charAt2;
                        i4++;
                    }
                    int i5 = r0.c;
                    int i6 = (i3 + i4) - i5;
                    r0.c = i5 + i6;
                    this.b += (long) i6;
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        k2d r02 = r0(2);
                        int i7 = r02.c;
                        byte[] bArr2 = r02.a;
                        bArr2[i7] = (byte) ((charAt >> 6) | 192);
                        bArr2[i7 + 1] = (byte) ((charAt & '?') | 128);
                        r02.c = i7 + 2;
                        this.b += 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        k2d r03 = r0(3);
                        int i8 = r03.c;
                        byte[] bArr3 = r03.a;
                        bArr3[i8] = (byte) ((charAt >> 12) | 224);
                        bArr3[i8 + 1] = (byte) ((63 & (charAt >> 6)) | 128);
                        bArr3[i8 + 2] = (byte) ((charAt & '?') | 128);
                        r03.c = i8 + 3;
                        this.b += 3;
                    } else {
                        int i9 = i + 1;
                        char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                        if (charAt > 56319 || 56320 > charAt3 || 57343 < charAt3) {
                            u0(63);
                            i = i9;
                        } else {
                            int i10 = (((charAt & 1023) << 10) | (charAt3 & 1023)) + 0;
                            k2d r04 = r0(4);
                            int i11 = r04.c;
                            byte[] bArr4 = r04.a;
                            bArr4[i11] = (byte) ((i10 >> 18) | 240);
                            bArr4[i11 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                            bArr4[i11 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                            bArr4[i11 + 3] = (byte) ((i10 & 63) | 128);
                            r04.c = i11 + 4;
                            this.b += 4;
                            i += 2;
                        }
                    }
                    i++;
                }
            }
        } else {
            StringBuilder n = rh4.n(i2, "endIndex > string.length: ", " > ");
            n.append(str.length());
            throw new IllegalArgumentException(n.toString().toString());
        }
    }

    public final eu0 write(byte[] bArr) {
        write(bArr, 0, bArr.length);
        return this;
    }

    public final void write(byte[] bArr, int i, int i2) {
        long j = (long) i2;
        hm9.g((long) bArr.length, (long) i, j);
        int i3 = i2 + i;
        while (i < i3) {
            k2d r0 = r0(1);
            int min = Math.min(i3 - i, 8192 - r0.c);
            int i4 = i + min;
            System.arraycopy(bArr, i, r0.a, r0.c, i4 - i);
            r0.c += min;
            i = i4;
        }
        this.b += j;
    }
}
