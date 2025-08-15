package defpackage;

/* renamed from: ua8  reason: default package */
public final class ua8 implements yze {
    public qy5 a;
    public final khe b = new khe(new j78(1));

    public final void a(long j, int i, int i2, int i3, wze wze) {
    }

    public final void b(wpa wpa, int i, int i2) {
        while (i > 0) {
            khe khe = this.b;
            int min = Math.min(i, ((byte[]) khe.getValue()).length);
            wpa.e(0, (byte[]) khe.getValue(), min);
            i -= min;
        }
    }

    public final int c(m24 m24, int i, boolean z) {
        int i2 = i;
        while (i2 > 0) {
            khe khe = this.b;
            int read = m24.read((byte[]) khe.getValue(), 0, Math.min(i2, ((byte[]) khe.getValue()).length));
            if (read != -1) {
                i2 -= read;
            } else {
                throw new RuntimeException("Unexpected end of track");
            }
        }
        return i;
    }

    public final void e(qy5 qy5) {
        this.a = qy5;
    }
}
