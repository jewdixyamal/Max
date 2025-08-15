package defpackage;

import java.io.InputStream;

/* renamed from: w24  reason: default package */
public final class w24 extends InputStream {
    public final Object X;
    public final Object Y;
    public final /* synthetic */ int a = 0;
    public final byte[] b;
    public boolean c = false;
    public boolean o = false;

    public w24(r24 r24, z24 z24) {
        this.X = r24;
        this.Y = z24;
        this.b = new byte[1];
    }

    public final void close() {
        switch (this.a) {
            case 0:
                if (!this.o) {
                    ((r24) this.X).close();
                    this.o = true;
                    return;
                }
                return;
            default:
                if (!this.o) {
                    ((t24) this.X).close();
                    this.o = true;
                    return;
                }
                return;
        }
    }

    public final void m() {
        switch (this.a) {
            case 0:
                if (!this.c) {
                    ((r24) this.X).L((z24) this.Y);
                    this.c = true;
                    return;
                }
                return;
            default:
                if (!this.c) {
                    ((t24) this.X).G((a34) this.Y);
                    this.c = true;
                    return;
                }
                return;
        }
    }

    public final int read() {
        switch (this.a) {
            case 0:
                byte[] bArr = this.b;
                if (read(bArr, 0, bArr.length) == -1) {
                    return -1;
                }
                return bArr[0] & 255;
            default:
                byte[] bArr2 = this.b;
                if (read(bArr2, 0, bArr2.length) == -1) {
                    return -1;
                }
                return bArr2[0] & 255;
        }
    }

    public final int read(byte[] bArr) {
        switch (this.a) {
            case 0:
                return read(bArr, 0, bArr.length);
            default:
                return read(bArr, 0, bArr.length);
        }
    }

    public w24(t24 t24, a34 a34) {
        this.X = t24;
        this.Y = a34;
        this.b = new byte[1];
    }

    public final int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                np8.f(!this.o);
                m();
                int read = ((r24) this.X).read(bArr, i, i2);
                if (read == -1) {
                    return -1;
                }
                return read;
            default:
                fm9.k(!this.o);
                m();
                int read2 = ((t24) this.X).read(bArr, i, i2);
                if (read2 == -1) {
                    return -1;
                }
                return read2;
        }
    }
}
