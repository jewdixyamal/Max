package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: y7c  reason: default package */
public final class y7c implements fu0 {
    public final bt0 a = new Object();
    public boolean b;
    public final yud c;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, bt0] */
    public y7c(yud yud) {
        this.c = yud;
    }

    public final boolean B() {
        if (!this.b) {
            bt0 bt0 = this.a;
            if (bt0.B()) {
                if (this.c.c(bt0, (long) 8192) == -1) {
                    return true;
                }
            }
            return false;
        }
        throw new IllegalStateException("closed".toString());
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [java.lang.Object, bt0] */
    public final String G(long j) {
        long j2 = j;
        if (j2 >= 0) {
            long j3 = j2 == Long.MAX_VALUE ? Long.MAX_VALUE : j2 + 1;
            byte b2 = (byte) 10;
            long a2 = a(b2, 0, j3);
            int i = (a2 > -1 ? 1 : (a2 == -1 ? 0 : -1));
            bt0 bt0 = this.a;
            if (i != 0) {
                return jt0.a(bt0, a2);
            }
            if (j3 < Long.MAX_VALUE && n(j3) && bt0.S(j3 - 1) == ((byte) 13) && n(1 + j3) && bt0.S(j3) == b2) {
                return jt0.a(bt0, j3);
            }
            ? obj = new Object();
            bt0.o(obj, 0, Math.min((long) 32, bt0.b));
            throw new EOFException("\\n not found: limit=" + Math.min(bt0.b, j2) + " content=" + obj.e(obj.b).d() + "…");
        }
        throw new IllegalArgumentException(ey8.h(j2, "limit < 0: ").toString());
    }

    public final long K(ux uxVar) {
        bt0 bt0;
        long j = 0;
        while (true) {
            yud yud = this.c;
            bt0 = this.a;
            if (yud.c(bt0, (long) 8192) == -1) {
                break;
            }
            long n = bt0.n();
            if (n > 0) {
                j += n;
                uxVar.N(bt0, n);
            }
        }
        long j2 = bt0.b;
        if (j2 <= 0) {
            return j;
        }
        long j3 = j + j2;
        uxVar.N(bt0, j2);
        return j3;
    }

    public final String O(Charset charset) {
        bt0 bt0 = this.a;
        bt0.t0(this.c);
        return bt0.o0(bt0.b, charset);
    }

    public final void Q(bt0 bt0, long j) {
        bt0 bt02 = this.a;
        try {
            h0(j);
            bt02.Q(bt0, j);
        } catch (EOFException e) {
            bt0.t0(bt02);
            throw e;
        }
    }

    public final void R(long j) {
        if (!this.b) {
            while (j > 0) {
                bt0 bt0 = this.a;
                if (bt0.b == 0) {
                    if (this.c.c(bt0, (long) 8192) == -1) {
                        throw new EOFException();
                    }
                }
                long min = Math.min(j, bt0.b);
                bt0.R(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final String X() {
        return G(Long.MAX_VALUE);
    }

    public final long a(byte b2, long j, long j2) {
        if (!this.b) {
            long j3 = 0;
            if (j2 >= 0) {
                while (j3 < j2) {
                    long U = this.a.U(b2, j3, j2);
                    if (U != -1) {
                        return U;
                    }
                    bt0 bt0 = this.a;
                    long j4 = bt0.b;
                    if (j4 >= j2) {
                        return -1;
                    }
                    if (this.c.c(bt0, (long) 8192) == -1) {
                        return -1;
                    }
                    j3 = Math.max(j3, j4);
                }
                return -1;
            }
            throw new IllegalArgumentException(ey8.h(j2, "fromIndex=0 toIndex=").toString());
        }
        throw new IllegalStateException("closed".toString());
    }

    public final long c(bt0 bt0, long j) {
        if (j < 0) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount < 0: ").toString());
        } else if (!this.b) {
            bt0 bt02 = this.a;
            if (bt02.b == 0) {
                if (this.c.c(bt02, (long) 8192) == -1) {
                    return -1;
                }
            }
            return bt02.c(bt0, Math.min(j, bt02.b));
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final void close() {
        if (!this.b) {
            this.b = true;
            this.c.close();
            this.a.m();
        }
    }

    public final int d0(vma vma) {
        if (!this.b) {
            while (true) {
                bt0 bt0 = this.a;
                int b2 = jt0.b(bt0, vma, true);
                if (b2 == -2) {
                    if (this.c.c(bt0, (long) 8192) == -1) {
                        break;
                    }
                } else if (b2 != -1) {
                    bt0.R((long) vma.a[b2].c());
                    return b2;
                }
            }
            return -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final aw0 e(long j) {
        h0(j);
        return this.a.e(j);
    }

    public final bt0 getBuffer() {
        return this.a;
    }

    public final void h0(long j) {
        if (!n(j)) {
            throw new EOFException();
        }
    }

    public final boolean isOpen() {
        return !this.b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long j0() {
        /*
            r6 = this;
            r0 = 1
            r6.h0(r0)
            r0 = 0
        L_0x0006:
            int r1 = r0 + 1
            long r2 = (long) r1
            boolean r2 = r6.n(r2)
            bt0 r3 = r6.a
            if (r2 == 0) goto L_0x0052
            long r4 = (long) r0
            byte r2 = r3.S(r4)
            r4 = 48
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x0020
            r4 = 57
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
        L_0x0020:
            r4 = 97
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x002a
            r4 = 102(0x66, float:1.43E-43)
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
        L_0x002a:
            r4 = 65
            byte r4 = (byte) r4
            if (r2 < r4) goto L_0x0037
            r4 = 70
            byte r4 = (byte) r4
            if (r2 <= r4) goto L_0x0035
            goto L_0x0037
        L_0x0035:
            r0 = r1
            goto L_0x0006
        L_0x0037:
            if (r0 == 0) goto L_0x003a
            goto L_0x0052
        L_0x003a:
            java.lang.NumberFormatException r6 = new java.lang.NumberFormatException
            r0 = 16
            defpackage.nd7.e(r0)
            defpackage.nd7.e(r0)
            java.lang.String r0 = java.lang.Integer.toString(r2, r0)
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r6.<init>(r0)
            throw r6
        L_0x0052:
            long r0 = r3.j0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y7c.j0():long");
    }

    public final InputStream l0() {
        return new us0(this, 1);
    }

    public final int m() {
        h0(4);
        int readInt = this.a.readInt();
        return ((readInt & 255) << 24) | ((-16777216 & readInt) >>> 24) | ((16711680 & readInt) >>> 8) | ((65280 & readInt) << 8);
    }

    public final boolean n(long j) {
        bt0 bt0;
        if (j < 0) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount < 0: ").toString());
        } else if (!this.b) {
            do {
                bt0 = this.a;
                if (bt0.b >= j) {
                    return true;
                }
            } while (this.c.c(bt0, (long) 8192) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed".toString());
        }
    }

    public final oue p() {
        return this.c.p();
    }

    public final int read(ByteBuffer byteBuffer) {
        bt0 bt0 = this.a;
        if (bt0.b == 0) {
            if (this.c.c(bt0, (long) 8192) == -1) {
                return -1;
            }
        }
        return bt0.read(byteBuffer);
    }

    public final byte readByte() {
        h0(1);
        return this.a.readByte();
    }

    public final void readFully(byte[] bArr) {
        bt0 bt0 = this.a;
        try {
            h0((long) bArr.length);
            bt0.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                long j = bt0.b;
                if (j > 0) {
                    int e0 = bt0.e0(bArr, i, (int) j);
                    if (e0 != -1) {
                        i += e0;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public final int readInt() {
        h0(4);
        return this.a.readInt();
    }

    public final long readLong() {
        h0(8);
        return this.a.readLong();
    }

    public final short readShort() {
        h0(2);
        return this.a.readShort();
    }

    public final String toString() {
        return "buffer(" + this.c + ')';
    }
}
