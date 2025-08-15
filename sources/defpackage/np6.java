package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: np6  reason: default package */
public final class np6 implements Closeable {
    public static final Logger X = Logger.getLogger(zo6.class.getName());
    public final mp6 a;
    public final qo6 b;
    public final fu0 c;
    public final boolean o;

    public np6(fu0 fu0, boolean z) {
        this.c = fu0;
        this.o = z;
        mp6 mp6 = new mp6(fu0);
        this.a = mp6;
        this.b = new qo6(mp6);
    }

    public final boolean a(boolean z, cc1 cc1) {
        int i;
        int readInt;
        int i2;
        rp6[] rp6Arr;
        cc1 cc12 = cc1;
        int i3 = 0;
        try {
            this.c.h0(9);
            int s = naf.s(this.c);
            if (s <= 16384) {
                byte readByte = this.c.readByte() & 255;
                byte readByte2 = this.c.readByte();
                byte b2 = readByte2 & 255;
                int readInt2 = this.c.readInt();
                int i4 = Integer.MAX_VALUE & readInt2;
                Logger logger = X;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(zo6.a(true, i4, s, readByte, b2));
                }
                if (!z || readByte == 4) {
                    switch (readByte) {
                        case 0:
                            g(cc12, s, b2, i4);
                            return true;
                        case 1:
                            n(cc12, s, b2, i4);
                            return true;
                        case 2:
                            if (s != 5) {
                                throw new IOException(wg0.g(s, "TYPE_PRIORITY length: ", " != 5"));
                            } else if (i4 != 0) {
                                fu0 fu0 = this.c;
                                fu0.readInt();
                                fu0.readByte();
                                cc1.getClass();
                                return true;
                            } else {
                                throw new IOException("TYPE_PRIORITY streamId == 0");
                            }
                        case 3:
                            if (s != 4) {
                                throw new IOException(wg0.g(s, "TYPE_RST_STREAM length: ", " != 4"));
                            } else if (i4 != 0) {
                                int readInt3 = this.c.readInt();
                                int[] v = au1.v(14);
                                int length = v.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < length) {
                                        int i6 = v[i5];
                                        if (au1.s(i6) == readInt3) {
                                            i = i6;
                                        } else {
                                            i5++;
                                        }
                                    } else {
                                        i = 0;
                                    }
                                }
                                if (i != 0) {
                                    kp6 kp6 = (kp6) cc12.c;
                                    kp6.getClass();
                                    if (i4 != 0 && (readInt2 & 1) == 0) {
                                        i3 = 1;
                                    }
                                    if (i3 != 0) {
                                        kp6.u0.c(new hp6(kp6.o + '[' + i4 + "] onReset", kp6, i4, i), 0);
                                        return true;
                                    }
                                    rp6 m = kp6.m(i4);
                                    if (m == null) {
                                        return true;
                                    }
                                    synchronized (m) {
                                        if (m.k == 0) {
                                            m.k = i;
                                            m.notifyAll();
                                        }
                                    }
                                    return true;
                                }
                                throw new IOException(zr6.h(readInt3, "TYPE_RST_STREAM unexpected error code: "));
                            } else {
                                throw new IOException("TYPE_RST_STREAM streamId == 0");
                            }
                        case 4:
                            if (i4 != 0) {
                                throw new IOException("TYPE_SETTINGS streamId != 0");
                            } else if ((readByte2 & 1) != 0) {
                                if (s == 0) {
                                    return true;
                                }
                                throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                            } else if (s % 6 == 0) {
                                ded ded = new ded();
                                h37 X2 = ote.X(ote.Y(0, s), 6);
                                int i7 = X2.a;
                                int i8 = X2.b;
                                int i9 = X2.c;
                                if (i9 < 0 ? i7 >= i8 : i7 <= i8) {
                                    while (true) {
                                        fu0 fu02 = this.c;
                                        short readShort = fu02.readShort();
                                        byte[] bArr = naf.a;
                                        short s2 = readShort & 65535;
                                        readInt = fu02.readInt();
                                        if (s2 != 2) {
                                            if (s2 == 3) {
                                                s2 = 4;
                                            } else if (s2 != 4) {
                                                if (s2 == 5) {
                                                    if (readInt < 16384 || readInt > 16777215) {
                                                    }
                                                }
                                            } else if (readInt >= 0) {
                                                s2 = 7;
                                            } else {
                                                throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                            }
                                        } else if (!(readInt == 0 || readInt == 1)) {
                                            throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                        }
                                        ded.b(s2, readInt);
                                        if (i7 != i8) {
                                            i7 += i9;
                                        }
                                    }
                                    throw new IOException(zr6.h(readInt, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                                }
                                kp6 kp62 = (kp6) cc12.c;
                                kp62.t0.c(new fp6(zr6.l(new StringBuilder(), kp62.o, " applyAndAckSettings"), cc12, ded), 0);
                                return true;
                            } else {
                                throw new IOException(zr6.h(s, "TYPE_SETTINGS length % 6 != 0: "));
                            }
                        case 5:
                            o(cc12, s, b2, i4);
                            return true;
                        case 6:
                            if (s != 8) {
                                throw new IOException(zr6.h(s, "TYPE_PING length != 8: "));
                            } else if (i4 == 0) {
                                int readInt4 = this.c.readInt();
                                int readInt5 = this.c.readInt();
                                if ((readByte2 & 1) != 0) {
                                    synchronized (((kp6) cc12.c)) {
                                        if (readInt4 == 1) {
                                            ((kp6) cc12.c).y0++;
                                        } else if (readInt4 == 2) {
                                            ((kp6) cc12.c).A0++;
                                        } else if (readInt4 == 3) {
                                            try {
                                                kp6 kp63 = (kp6) cc12.c;
                                                kp63.getClass();
                                                kp63.notifyAll();
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                    return true;
                                }
                                ((kp6) cc12.c).t0.c(new ep6(zr6.l(new StringBuilder(), ((kp6) cc12.c).o, " ping"), cc1, readInt4, readInt5, 0), 0);
                                return true;
                            } else {
                                throw new IOException("TYPE_PING streamId != 0");
                            }
                        case 7:
                            if (s < 8) {
                                throw new IOException(zr6.h(s, "TYPE_GOAWAY length < 8: "));
                            } else if (i4 == 0) {
                                int readInt6 = this.c.readInt();
                                int readInt7 = this.c.readInt();
                                int i10 = s - 8;
                                int[] v2 = au1.v(14);
                                int length2 = v2.length;
                                int i11 = 0;
                                while (true) {
                                    if (i11 < length2) {
                                        i2 = v2[i11];
                                        if (au1.s(i2) != readInt7) {
                                            i11++;
                                        }
                                    } else {
                                        i2 = 0;
                                    }
                                }
                                if (i2 != 0) {
                                    aw0 aw0 = aw0.o;
                                    if (i10 > 0) {
                                        aw0 = this.c.e((long) i10);
                                    }
                                    aw0.c();
                                    synchronized (((kp6) cc12.c)) {
                                        Object[] array = ((kp6) cc12.c).c.values().toArray(new rp6[0]);
                                        if (array != null) {
                                            rp6Arr = (rp6[]) array;
                                            ((kp6) cc12.c).Z = true;
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                        }
                                    }
                                    int length3 = rp6Arr.length;
                                    while (i3 < length3) {
                                        rp6 rp6 = rp6Arr[i3];
                                        if (rp6.m > readInt6 && rp6.h()) {
                                            synchronized (rp6) {
                                                if (rp6.k == 0) {
                                                    rp6.k = 8;
                                                    rp6.notifyAll();
                                                }
                                            }
                                            ((kp6) cc12.c).m(rp6.m);
                                        }
                                        i3++;
                                    }
                                    return true;
                                }
                                throw new IOException(zr6.h(readInt7, "TYPE_GOAWAY unexpected error code: "));
                            } else {
                                throw new IOException("TYPE_GOAWAY streamId != 0");
                            }
                        case 8:
                            if (s == 4) {
                                long readInt8 = ((long) this.c.readInt()) & 2147483647L;
                                int i12 = (readInt8 > 0 ? 1 : (readInt8 == 0 ? 0 : -1));
                                if (i12 == 0) {
                                    throw new IOException("windowSizeIncrement was 0");
                                } else if (i4 == 0) {
                                    synchronized (((kp6) cc12.c)) {
                                        kp6 kp64 = (kp6) cc12.c;
                                        kp64.H0 += readInt8;
                                        kp64.notifyAll();
                                    }
                                    return true;
                                } else {
                                    rp6 g = ((kp6) cc12.c).g(i4);
                                    if (g == null) {
                                        return true;
                                    }
                                    synchronized (g) {
                                        g.d += readInt8;
                                        if (i12 > 0) {
                                            g.notifyAll();
                                        }
                                    }
                                    return true;
                                }
                            } else {
                                throw new IOException(zr6.h(s, "TYPE_WINDOW_UPDATE length !=4: "));
                            }
                        default:
                            this.c.R((long) s);
                            return true;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                    String[] strArr = zo6.b;
                    sb.append(readByte < strArr.length ? strArr[readByte] : naf.h("0x%02x", Integer.valueOf(readByte)));
                    throw new IOException(sb.toString());
                }
            } else {
                throw new IOException(zr6.h(s, "FRAME_SIZE_ERROR: "));
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void close() {
        this.c.close();
    }

    public final void d(cc1 cc1) {
        if (!this.o) {
            aw0 aw0 = zo6.a;
            aw0 e = this.c.e((long) aw0.c.length);
            Level level = Level.FINE;
            Logger logger = X;
            if (logger.isLoggable(level)) {
                logger.fine(naf.h("<< CONNECTION " + e.d(), new Object[0]));
            }
            if (!aw0.equals(e)) {
                throw new IOException("Expected a connection header but was ".concat(e.j()));
            }
        } else if (!a(true, cc1)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.Object, bt0] */
    public final void g(cc1 cc1, int i, int i2, int i3) {
        byte b2;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        cc1 cc12 = cc1;
        int i5 = i2;
        int i6 = i3;
        if (i6 != 0) {
            boolean z4 = (i5 & 1) != 0;
            if ((i5 & 32) == 0) {
                if ((i5 & 8) != 0) {
                    byte readByte = this.c.readByte();
                    byte[] bArr = naf.a;
                    b2 = readByte & 255;
                    i4 = i;
                } else {
                    i4 = i;
                    b2 = 0;
                }
                int A = nu0.A(i4, i5, b2);
                fu0 fu0 = this.c;
                ((kp6) cc12.c).getClass();
                if (i6 != 0 && (i6 & 1) == 0) {
                    kp6 kp6 = (kp6) cc12.c;
                    kp6.getClass();
                    ? obj = new Object();
                    long j2 = (long) A;
                    fu0.h0(j2);
                    fu0.c(obj, j2);
                    kp6.u0.c(new gp6(kp6.o + '[' + i6 + "] onData", kp6, i3, obj, A, z4), 0);
                } else {
                    rp6 g = ((kp6) cc12.c).g(i6);
                    if (g == null) {
                        ((kp6) cc12.c).U(i6, 2);
                        long j3 = (long) A;
                        ((kp6) cc12.c).o(j3);
                        fu0.R(j3);
                    } else {
                        byte[] bArr2 = naf.a;
                        pp6 pp6 = g.g;
                        long j4 = (long) A;
                        pp6.getClass();
                        while (true) {
                            if (j4 <= 0) {
                                z = z4;
                                break;
                            }
                            synchronized (pp6.Y) {
                                z2 = pp6.X;
                                z = z4;
                                z3 = pp6.b.b + j4 > pp6.o;
                            }
                            if (z3) {
                                fu0.R(j4);
                                pp6.Y.e(4);
                                break;
                            } else if (z2) {
                                fu0.R(j4);
                                break;
                            } else {
                                long c2 = fu0.c(pp6.a, j4);
                                if (c2 != -1) {
                                    j4 -= c2;
                                    synchronized (pp6.Y) {
                                        try {
                                            if (pp6.c) {
                                                bt0 bt0 = pp6.a;
                                                j = bt0.b;
                                                bt0.m();
                                            } else {
                                                bt0 bt02 = pp6.b;
                                                boolean z5 = bt02.b == 0;
                                                bt02.t0(pp6.a);
                                                if (z5) {
                                                    rp6 rp6 = pp6.Y;
                                                    if (rp6 != null) {
                                                        rp6.notifyAll();
                                                    } else {
                                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                                                    }
                                                }
                                                j = 0;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                    }
                                    if (j > 0) {
                                        pp6.a(j);
                                    }
                                    z4 = z;
                                } else {
                                    throw new EOFException();
                                }
                            }
                        }
                        if (z) {
                            g.j(naf.b, true);
                        }
                    }
                }
                this.c.R((long) b2);
                return;
            }
            throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        throw new java.io.IOException(defpackage.zr6.h(r7, "Header index too large "));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List m(int r6, int r7, int r8, int r9) {
        /*
            r5 = this;
            r0 = 32
            r1 = 64
            r2 = 128(0x80, float:1.794E-43)
            mp6 r3 = r5.a
            r3.o = r6
            r3.a = r6
            r3.X = r7
            r3.b = r8
            r3.c = r9
        L_0x0012:
            qo6 r6 = r5.b
            y7c r7 = r6.b
            boolean r8 = r7.B()
            java.util.ArrayList r9 = r6.a
            if (r8 != 0) goto L_0x0122
            byte r7 = r7.readByte()
            byte[] r8 = defpackage.naf.a
            r8 = r7 & 255(0xff, float:3.57E-43)
            if (r8 == r2) goto L_0x011a
            r3 = r7 & 128(0x80, float:1.794E-43)
            if (r3 != r2) goto L_0x0065
            r7 = 127(0x7f, float:1.78E-43)
            int r7 = r6.e(r8, r7)
            int r8 = r7 + -1
            if (r8 < 0) goto L_0x0043
            vi6[] r3 = defpackage.so6.a
            int r4 = r3.length
            int r4 = r4 + -1
            if (r8 > r4) goto L_0x0043
            r6 = r3[r8]
            r9.add(r6)
            goto L_0x0012
        L_0x0043:
            vi6[] r3 = defpackage.so6.a
            int r3 = r3.length
            int r8 = r8 - r3
            int r3 = r6.d
            int r3 = r3 + 1
            int r3 = r3 + r8
            if (r3 < 0) goto L_0x0059
            vi6[] r6 = r6.c
            int r8 = r6.length
            if (r3 >= r8) goto L_0x0059
            r6 = r6[r3]
            r9.add(r6)
            goto L_0x0012
        L_0x0059:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "Header index too large "
            java.lang.String r6 = defpackage.zr6.h(r7, r6)
            r5.<init>(r6)
            throw r5
        L_0x0065:
            if (r8 != r1) goto L_0x007d
            vi6[] r7 = defpackage.so6.a
            aw0 r7 = r6.d()
            defpackage.so6.a(r7)
            aw0 r8 = r6.d()
            vi6 r9 = new vi6
            r9.<init>((defpackage.aw0) r7, (defpackage.aw0) r8)
            r6.c(r9)
            goto L_0x0012
        L_0x007d:
            r3 = r7 & 64
            if (r3 != r1) goto L_0x009b
            r7 = 63
            int r7 = r6.e(r8, r7)
            int r7 = r7 + -1
            aw0 r7 = r6.b(r7)
            aw0 r8 = r6.d()
            vi6 r9 = new vi6
            r9.<init>((defpackage.aw0) r7, (defpackage.aw0) r8)
            r6.c(r9)
            goto L_0x0012
        L_0x009b:
            r7 = r7 & r0
            if (r7 != r0) goto L_0x00e2
            r7 = 31
            int r7 = r6.e(r8, r7)
            r6.g = r7
            if (r7 < 0) goto L_0x00cc
            r8 = 4096(0x1000, float:5.74E-42)
            if (r7 > r8) goto L_0x00cc
            int r8 = r6.f
            if (r7 >= r8) goto L_0x0012
            if (r7 != 0) goto L_0x00c6
            vi6[] r7 = r6.c
            r8 = 0
            defpackage.ys.c0(r7, r8)
            vi6[] r7 = r6.c
            int r7 = r7.length
            int r7 = r7 + -1
            r6.d = r7
            r7 = 0
            r6.e = r7
            r6.f = r7
            goto L_0x0012
        L_0x00c6:
            int r8 = r8 - r7
            r6.a(r8)
            goto L_0x0012
        L_0x00cc:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Invalid dynamic table size update "
            r7.<init>(r8)
            int r6 = r6.g
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r5.<init>(r6)
            throw r5
        L_0x00e2:
            r7 = 16
            if (r8 == r7) goto L_0x0103
            if (r8 != 0) goto L_0x00e9
            goto L_0x0103
        L_0x00e9:
            r7 = 15
            int r7 = r6.e(r8, r7)
            int r7 = r7 + -1
            aw0 r7 = r6.b(r7)
            aw0 r6 = r6.d()
            vi6 r8 = new vi6
            r8.<init>((defpackage.aw0) r7, (defpackage.aw0) r6)
            r9.add(r8)
            goto L_0x0012
        L_0x0103:
            vi6[] r7 = defpackage.so6.a
            aw0 r7 = r6.d()
            defpackage.so6.a(r7)
            aw0 r6 = r6.d()
            vi6 r8 = new vi6
            r8.<init>((defpackage.aw0) r7, (defpackage.aw0) r6)
            r9.add(r8)
            goto L_0x0012
        L_0x011a:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "index == 0"
            r5.<init>(r6)
            throw r5
        L_0x0122:
            java.util.List r5 = defpackage.x53.D0(r9)
            r9.clear()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np6.m(int, int, int, int):java.util.List");
    }

    public final void n(cc1 cc1, int i, int i2, int i3) {
        byte b2;
        boolean z = true;
        if (i3 != 0) {
            boolean z2 = (i2 & 1) != 0;
            if ((i2 & 8) != 0) {
                byte readByte = this.c.readByte();
                byte[] bArr = naf.a;
                b2 = readByte & 255;
            } else {
                b2 = 0;
            }
            if ((i2 & 32) != 0) {
                fu0 fu0 = this.c;
                fu0.readInt();
                fu0.readByte();
                byte[] bArr2 = naf.a;
                cc1.getClass();
                i -= 5;
            }
            List m = m(nu0.A(i, i2, b2), b2, i2, i3);
            ((kp6) cc1.c).getClass();
            if (i3 == 0 || (i3 & 1) != 0) {
                z = false;
            }
            if (z) {
                kp6 kp6 = (kp6) cc1.c;
                kp6.u0.c(new hp6(kp6.o + '[' + i3 + "] onHeaders", kp6, i3, m, z2), 0);
                return;
            }
            synchronized (((kp6) cc1.c)) {
                rp6 g = ((kp6) cc1.c).g(i3);
                if (g == null) {
                    kp6 kp62 = (kp6) cc1.c;
                    if (!kp62.Z) {
                        if (i3 > kp62.X) {
                            if (i3 % 2 != kp62.Y % 2) {
                                rp6 rp6 = new rp6(i3, (kp6) cc1.c, false, z2, naf.u(m));
                                kp6 kp63 = (kp6) cc1.c;
                                kp63.X = i3;
                                kp63.c.put(Integer.valueOf(i3), rp6);
                                ((kp6) cc1.c).s0.f().c(new dp6(((kp6) cc1.c).o + '[' + i3 + "] onStream", rp6, cc1), 0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                g.j(naf.u(m), z2);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
    }

    public final void o(cc1 cc1, int i, int i2, int i3) {
        byte b2;
        if (i3 != 0) {
            if ((i2 & 8) != 0) {
                byte readByte = this.c.readByte();
                byte[] bArr = naf.a;
                b2 = readByte & 255;
            } else {
                b2 = 0;
            }
            int readInt = this.c.readInt() & Integer.MAX_VALUE;
            List m = m(nu0.A(i - 4, i2, b2), b2, i2, i3);
            kp6 kp6 = (kp6) cc1.c;
            synchronized (kp6) {
                if (kp6.L0.contains(Integer.valueOf(readInt))) {
                    kp6.U(readInt, 2);
                    return;
                }
                kp6.L0.add(Integer.valueOf(readInt));
                coe coe = kp6.u0;
                coe.c(new hp6(kp6.o + '[' + readInt + "] onRequest", kp6, readInt, m), 0);
                return;
            }
        }
        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
    }
}
