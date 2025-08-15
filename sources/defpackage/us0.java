package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: us0  reason: default package */
public final class us0 extends InputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ fu0 b;

    public /* synthetic */ us0(fu0 fu0, int i) {
        this.a = i;
        this.b = fu0;
    }

    private final void m() {
    }

    public final int available() {
        switch (this.a) {
            case 0:
                return (int) Math.min(((bt0) this.b).b, (long) Integer.MAX_VALUE);
            default:
                y7c y7c = (y7c) this.b;
                if (!y7c.b) {
                    return (int) Math.min(y7c.a.b, (long) Integer.MAX_VALUE);
                }
                throw new IOException("closed");
        }
    }

    public final void close() {
        switch (this.a) {
            case 0:
                return;
            default:
                ((y7c) this.b).close();
                return;
        }
    }

    public final int read() {
        switch (this.a) {
            case 0:
                bt0 bt0 = (bt0) this.b;
                if (bt0.b > 0) {
                    return bt0.readByte() & 255;
                }
                return -1;
            default:
                y7c y7c = (y7c) this.b;
                if (!y7c.b) {
                    bt0 bt02 = y7c.a;
                    if (bt02.b == 0) {
                        if (y7c.c.c(bt02, (long) 8192) == -1) {
                            return -1;
                        }
                    }
                    return bt02.readByte() & 255;
                }
                throw new IOException("closed");
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ((bt0) this.b) + ".inputStream()";
            default:
                return ((y7c) this.b) + ".inputStream()";
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                return ((bt0) this.b).e0(bArr, i, i2);
            default:
                y7c y7c = (y7c) this.b;
                if (!y7c.b) {
                    hm9.g((long) bArr.length, (long) i, (long) i2);
                    bt0 bt0 = y7c.a;
                    if (bt0.b == 0) {
                        if (y7c.c.c(bt0, (long) 8192) == -1) {
                            return -1;
                        }
                    }
                    return bt0.e0(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }
}
