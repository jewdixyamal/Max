package defpackage;

import java.nio.ByteBuffer;

/* renamed from: x7c  reason: default package */
public final class x7c implements eu0 {
    public final bt0 a = new Object();
    public boolean b;
    public final ksd c;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, bt0] */
    public x7c(ksd ksd) {
        this.c = ksd;
    }

    public final eu0 A(int i) {
        if (!this.b) {
            this.a.x0(i);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final eu0 C(int i) {
        if (!this.b) {
            this.a.u0(i);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final eu0 E() {
        if (!this.b) {
            bt0 bt0 = this.a;
            long n = bt0.n();
            if (n > 0) {
                this.c.N(bt0, n);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final eu0 L(String str) {
        if (!this.b) {
            this.a.A0(str);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final eu0 M(aw0 aw0) {
        if (!this.b) {
            this.a.s0(aw0);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void N(bt0 bt0, long j) {
        if (!this.b) {
            this.a.N(bt0, j);
            E();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final eu0 P(long j) {
        if (!this.b) {
            this.a.w0(j);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final eu0 b0(int i, byte[] bArr, int i2) {
        if (!this.b) {
            this.a.write(bArr, i, i2);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final void close() {
        ksd ksd = this.c;
        if (!this.b) {
            try {
                bt0 bt0 = this.a;
                long j = bt0.b;
                if (j > 0) {
                    ksd.N(bt0, j);
                }
                th = null;
            } catch (Throwable th) {
                th = th;
            }
            try {
                ksd.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.b = true;
            if (th != null) {
                throw th;
            }
        }
    }

    public final void flush() {
        if (!this.b) {
            bt0 bt0 = this.a;
            long j = bt0.b;
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            ksd ksd = this.c;
            if (i > 0) {
                ksd.N(bt0, j);
            }
            ksd.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final bt0 getBuffer() {
        return this.a;
    }

    public final eu0 i0(long j) {
        if (!this.b) {
            this.a.v0(j);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final boolean isOpen() {
        return !this.b;
    }

    public final oue p() {
        return this.c.p();
    }

    public final String toString() {
        return "buffer(" + this.c + ')';
    }

    public final int write(ByteBuffer byteBuffer) {
        if (!this.b) {
            int write = this.a.write(byteBuffer);
            E();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final eu0 x() {
        if (!this.b) {
            bt0 bt0 = this.a;
            long j = bt0.b;
            if (j > 0) {
                this.c.N(bt0, j);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final eu0 y(int i) {
        if (!this.b) {
            this.a.y0(i);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    public final eu0 write(byte[] bArr) {
        if (!this.b) {
            bt0 bt0 = this.a;
            bt0.getClass();
            bt0.write(bArr, 0, bArr.length);
            E();
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }
}
