package defpackage;

import java.io.IOException;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: pp6  reason: default package */
public final class pp6 implements yud {
    public boolean X;
    public final /* synthetic */ rp6 Y;
    public final bt0 a = new Object();
    public final bt0 b = new Object();
    public boolean c;
    public final long o;

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, bt0] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, bt0] */
    public pp6(rp6 rp6, long j, boolean z) {
        this.Y = rp6;
        this.o = j;
        this.X = z;
    }

    public final void a(long j) {
        byte[] bArr = naf.a;
        this.Y.n.o(j);
    }

    public final long c(bt0 bt0, long j) {
        Throwable th;
        boolean z;
        long j2;
        long j3 = j;
        long j4 = 0;
        if (j3 >= 0) {
            while (true) {
                synchronized (this.Y) {
                    this.Y.i.i();
                    try {
                        if (this.Y.f() != 0) {
                            th = this.Y.l;
                            if (th == null) {
                                th = new StreamResetException(this.Y.f());
                            }
                        } else {
                            th = null;
                        }
                        if (!this.c) {
                            bt0 bt02 = this.b;
                            long j5 = bt02.b;
                            z = false;
                            if (j5 > j4) {
                                j2 = bt02.c(bt0, Math.min(j3, j5));
                                rp6 rp6 = this.Y;
                                long j6 = rp6.a + j2;
                                rp6.a = j6;
                                long j7 = j6 - rp6.b;
                                if (th == null && j7 >= ((long) (rp6.n.C0.a() / 2))) {
                                    rp6 rp62 = this.Y;
                                    rp62.n.e0(rp62.m, j7);
                                    rp6 rp63 = this.Y;
                                    rp63.b = rp63.a;
                                }
                            } else {
                                bt0 bt03 = bt0;
                                if (!this.X && th == null) {
                                    this.Y.k();
                                    z = true;
                                }
                                j2 = -1;
                            }
                        } else {
                            throw new IOException("stream closed");
                        }
                    } finally {
                        this.Y.i.m();
                    }
                }
                if (z) {
                    j4 = 0;
                } else if (j2 != -1) {
                    a(j2);
                    return j2;
                } else if (th == null) {
                    return -1;
                } else {
                    throw th;
                }
            }
        } else {
            throw new IllegalArgumentException(ey8.h(j3, "byteCount < 0: ").toString());
        }
    }

    public final void close() {
        long j;
        synchronized (this.Y) {
            this.c = true;
            bt0 bt0 = this.b;
            j = bt0.b;
            bt0.m();
            rp6 rp6 = this.Y;
            if (rp6 != null) {
                rp6.notifyAll();
            } else {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
            }
        }
        if (j > 0) {
            a(j);
        }
        this.Y.a();
    }

    public final oue p() {
        return this.Y.i;
    }
}
