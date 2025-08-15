package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: s37  reason: default package */
public final class s37 implements Runnable {
    public final float X;
    public final float Y;
    public final float Z;
    public final WeakReference a;
    public final long b = 200;
    public final long c = System.currentTimeMillis();
    public final float o;

    public s37(t37 t37, float f, float f2, float f3, float f4) {
        this.a = new WeakReference(t37);
        this.o = f;
        this.X = f2;
        this.Y = f3;
        this.Z = f4;
    }

    public final void run() {
        t37 t37 = (t37) this.a.get();
        if (t37 != null) {
            long currentTimeMillis = System.currentTimeMillis() - this.c;
            long j = this.b;
            float min = (float) Math.min(j, currentTimeMillis);
            float f = (float) j;
            float i = pag.i(min, this.X, f);
            if (min < f) {
                t37.j(this.o + i, this.Y, this.Z);
                t37.post(this);
                return;
            }
            t37.setImageToWrapCropBounds(true);
        }
    }
}
