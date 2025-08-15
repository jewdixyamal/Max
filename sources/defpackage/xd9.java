package defpackage;

/* renamed from: xd9  reason: default package */
public final class xd9 implements yze {
    public qy5 a;
    public final byte[] b = new byte[16000];

    public final void a(long j, int i, int i2, int i3, wze wze) {
    }

    public final void b(wpa wpa, int i, int i2) {
        while (i > 0) {
            byte[] bArr = this.b;
            int min = Math.min(i, bArr.length);
            wpa.e(0, bArr, min);
            i -= min;
        }
    }

    public final int c(m24 m24, int i, boolean z) {
        int i2 = i;
        while (i2 > 0) {
            byte[] bArr = this.b;
            boolean z2 = false;
            int read = m24.read(bArr, 0, Math.min(i2, bArr.length));
            if (read != -1) {
                z2 = true;
            }
            fm9.k(z2);
            i2 -= read;
        }
        return i;
    }

    public final void e(qy5 qy5) {
        this.a = qy5;
    }
}
