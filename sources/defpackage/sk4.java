package defpackage;

import java.io.EOFException;

/* renamed from: sk4  reason: default package */
public final class sk4 implements yze {
    public final byte[] a = new byte[4096];

    public final void a(long j, int i, int i2, int i3, wze wze) {
    }

    public final void b(wpa wpa, int i, int i2) {
        wpa.H(i);
    }

    public final int c(m24 m24, int i, boolean z) {
        byte[] bArr = this.a;
        int read = m24.read(bArr, 0, Math.min(bArr.length, i));
        if (read != -1) {
            return read;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void e(qy5 qy5) {
    }
}
