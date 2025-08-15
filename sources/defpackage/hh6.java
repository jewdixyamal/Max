package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* renamed from: hh6  reason: default package */
public final class hh6 implements yud {
    public final CRC32 X = new CRC32();
    public byte a;
    public final y7c b;
    public final Inflater c;
    public final c07 o;

    public hh6(yud yud) {
        y7c y7c = new y7c(yud);
        this.b = y7c;
        Inflater inflater = new Inflater(true);
        this.c = inflater;
        this.o = new c07(y7c, inflater);
    }

    public static void a(int i, int i2, String str) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    public final long c(bt0 bt0, long j) {
        y7c y7c;
        bt0 bt02;
        long j2;
        bt0 bt03 = bt0;
        long j3 = j;
        int i = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException(ey8.h(j3, "byteCount < 0: ").toString());
        } else if (i == 0) {
            return 0;
        } else {
            byte b2 = this.a;
            CRC32 crc32 = this.X;
            y7c y7c2 = this.b;
            if (b2 == 0) {
                y7c2.h0(10);
                bt0 bt04 = y7c2.a;
                byte S = bt04.S(3);
                boolean z = ((S >> 1) & 1) == 1;
                if (z) {
                    d(y7c2.a, 0, 10);
                }
                a(8075, y7c2.readShort(), "ID1ID2");
                y7c2.R(8);
                if (((S >> 2) & 1) == 1) {
                    y7c2.h0(2);
                    if (z) {
                        d(y7c2.a, 0, 2);
                    }
                    short readShort = bt04.readShort();
                    long j4 = (long) ((short) (((readShort & 255) << 8) | ((readShort & 65280) >>> 8)));
                    y7c2.h0(j4);
                    if (z) {
                        d(y7c2.a, 0, j4);
                        j2 = j4;
                    } else {
                        j2 = j4;
                    }
                    y7c2.R(j2);
                }
                if (((S >> 3) & 1) == 1) {
                    bt02 = bt04;
                    y7c y7c3 = y7c2;
                    long a2 = y7c2.a((byte) 0, 0, Long.MAX_VALUE);
                    if (a2 != -1) {
                        if (z) {
                            y7c = y7c3;
                            d(y7c3.a, 0, a2 + 1);
                        } else {
                            y7c = y7c3;
                        }
                        y7c.R(a2 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    bt02 = bt04;
                    y7c = y7c2;
                }
                if (((S >> 4) & 1) == 1) {
                    long a3 = y7c.a((byte) 0, 0, Long.MAX_VALUE);
                    if (a3 != -1) {
                        if (z) {
                            d(y7c.a, 0, a3 + 1);
                        }
                        y7c.R(a3 + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (z) {
                    y7c.h0(2);
                    short readShort2 = bt02.readShort();
                    a((short) (((readShort2 & 255) << 8) | ((readShort2 & 65280) >>> 8)), (short) ((int) crc32.getValue()), "FHCRC");
                    crc32.reset();
                }
                this.a = 1;
            } else {
                y7c = y7c2;
            }
            if (this.a == 1) {
                long j5 = bt03.b;
                long c2 = this.o.c(bt03, j3);
                if (c2 != -1) {
                    d(bt0, j5, c2);
                    return c2;
                }
                this.a = 2;
            }
            if (this.a != 2) {
                return -1;
            }
            a(y7c.m(), (int) crc32.getValue(), "CRC");
            a(y7c.m(), (int) this.c.getBytesWritten(), "ISIZE");
            this.a = 3;
            if (y7c.B()) {
                return -1;
            }
            throw new IOException("gzip finished without exhausting source");
        }
    }

    public final void close() {
        this.o.close();
    }

    public final void d(bt0 bt0, long j, long j2) {
        k2d k2d = bt0.a;
        while (true) {
            int i = k2d.c;
            int i2 = k2d.b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            k2d = k2d.f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) k2d.b) + j);
            int min = (int) Math.min((long) (k2d.c - i3), j2);
            this.X.update(k2d.a, i3, min);
            j2 -= (long) min;
            k2d = k2d.f;
            j = 0;
        }
    }

    public final oue p() {
        return this.b.c.p();
    }
}
