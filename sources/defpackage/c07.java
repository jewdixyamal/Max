package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* renamed from: c07  reason: default package */
public final class c07 implements yud {
    public int a;
    public boolean b;
    public final fu0 c;
    public final Inflater o;

    public c07(y7c y7c, Inflater inflater) {
        this.c = y7c;
        this.o = inflater;
    }

    public final long a(bt0 bt0, long j) {
        Inflater inflater = this.o;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException(ey8.h(j, "byteCount < 0: ").toString());
        } else if (!(!this.b)) {
            throw new IllegalStateException("closed".toString());
        } else if (i == 0) {
            return 0;
        } else {
            try {
                k2d r0 = bt0.r0(1);
                int min = (int) Math.min(j, (long) (8192 - r0.c));
                boolean needsInput = inflater.needsInput();
                fu0 fu0 = this.c;
                if (needsInput) {
                    if (!fu0.B()) {
                        k2d k2d = fu0.getBuffer().a;
                        int i2 = k2d.c;
                        int i3 = k2d.b;
                        int i4 = i2 - i3;
                        this.a = i4;
                        inflater.setInput(k2d.a, i3, i4);
                    }
                }
                int inflate = inflater.inflate(r0.a, r0.c, min);
                int i5 = this.a;
                if (i5 != 0) {
                    int remaining = i5 - inflater.getRemaining();
                    this.a -= remaining;
                    fu0.R((long) remaining);
                }
                if (inflate > 0) {
                    r0.c += inflate;
                    long j2 = (long) inflate;
                    bt0.b += j2;
                    return j2;
                }
                if (r0.b == r0.c) {
                    bt0.a = r0.a();
                    b3d.a(r0);
                }
                return 0;
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
    }

    public final long c(bt0 bt0, long j) {
        do {
            long a2 = a(bt0, j);
            if (a2 > 0) {
                return a2;
            }
            Inflater inflater = this.o;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1;
            }
        } while (!this.c.B());
        throw new EOFException("source exhausted prematurely");
    }

    public final void close() {
        if (!this.b) {
            this.o.end();
            this.b = true;
            this.c.close();
        }
    }

    public final oue p() {
        return this.c.p();
    }
}
