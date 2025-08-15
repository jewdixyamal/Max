package defpackage;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: mp6  reason: default package */
public final class mp6 implements yud {
    public int X;
    public final fu0 Y;
    public int a;
    public int b;
    public int c;
    public int o;

    public mp6(fu0 fu0) {
        this.Y = fu0;
    }

    public final long c(bt0 bt0, long j) {
        int i;
        int readInt;
        do {
            int i2 = this.o;
            fu0 fu0 = this.Y;
            if (i2 == 0) {
                fu0.R((long) this.X);
                this.X = 0;
                if ((this.b & 4) != 0) {
                    return -1;
                }
                i = this.c;
                int s = naf.s(fu0);
                this.o = s;
                this.a = s;
                byte readByte = fu0.readByte() & 255;
                this.b = fu0.readByte() & 255;
                Logger logger = np6.X;
                if (logger.isLoggable(Level.FINE)) {
                    aw0 aw0 = zo6.a;
                    logger.fine(zo6.a(true, this.c, this.a, readByte, this.b));
                }
                readInt = fu0.readInt() & Integer.MAX_VALUE;
                this.c = readInt;
                if (readByte != 9) {
                    throw new IOException(readByte + " != TYPE_CONTINUATION");
                }
            } else {
                long c2 = fu0.c(bt0, Math.min(j, (long) i2));
                if (c2 == -1) {
                    return -1;
                }
                this.o -= (int) c2;
                return c2;
            }
        } while (readInt == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    public final void close() {
    }

    public final oue p() {
        return this.Y.p();
    }
}
