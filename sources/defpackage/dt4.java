package defpackage;

import java.io.EOFException;

/* renamed from: dt4  reason: default package */
public final class dt4 implements xze {
    public final byte[] a = new byte[4096];

    public final int a(l24 l24, int i, boolean z) {
        byte[] bArr = this.a;
        int read = l24.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void b(long j, int i, int i2, int i3, vze vze) {
    }

    public final void c(int i, yaf yaf) {
        yaf.I(i);
    }

    public final void d(oy5 oy5) {
    }
}
