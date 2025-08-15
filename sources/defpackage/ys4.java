package defpackage;

import android.graphics.Bitmap;

/* renamed from: ys4  reason: default package */
public final class ys4 implements go0 {
    public final void e(Object obj) {
        ((Bitmap) obj).recycle();
    }

    public final Object get(int i) {
        return Bitmap.createBitmap(1, (int) Math.ceil(((double) i) / 2.0d), Bitmap.Config.RGB_565);
    }
}
