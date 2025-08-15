package defpackage;

import android.graphics.Bitmap;

/* renamed from: rs0  reason: default package */
public final class rs0 extends mj0 implements go0 {
    public rs0(qq9 qq9, n5b n5b, rq9 rq9) {
        super(qq9, n5b, rq9);
        this.u0 = false;
        qq9.getClass();
        rq9.getClass();
    }

    public final Object a(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }

    public final void c(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        bitmap.recycle();
    }

    public final int f(int i) {
        return i;
    }

    public final int g(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return bitmap.getAllocationByteCount();
    }

    public final int h(int i) {
        return i;
    }

    public final Object i(ps0 ps0) {
        Bitmap bitmap = (Bitmap) super.i(ps0);
        if (bitmap != null) {
            bitmap.eraseColor(0);
        }
        return bitmap;
    }

    public final boolean k(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        bitmap.getClass();
        return !bitmap.isRecycled() && bitmap.isMutable();
    }
}
