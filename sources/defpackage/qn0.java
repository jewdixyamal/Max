package defpackage;

import android.graphics.Bitmap;

/* renamed from: qn0  reason: default package */
public final class qn0 {
    public int a;
    public long b;
    public final int c;
    public final int d;
    public final qqd e;

    public qn0(int i, int i2) {
        boolean z = false;
        if (i > 0) {
            if (i2 > 0 ? true : z) {
                this.c = i;
                this.d = i2;
                this.e = new qqd(4, (Object) this);
                return;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public final synchronized void a(Bitmap bitmap) {
        int d2 = qo0.d(bitmap);
        boolean z = false;
        od2.k("No bitmaps registered.", this.a > 0);
        long j = (long) d2;
        if (j <= this.b) {
            z = true;
        }
        od2.l(z, "Bitmap size bigger than the total registered size: %d, %d", Integer.valueOf(d2), Long.valueOf(this.b));
        this.b -= j;
        this.a--;
    }

    public final synchronized int b() {
        return this.d;
    }
}
