package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: bwa  reason: default package */
public final class bwa extends nj0 {
    public final /* synthetic */ int c;
    public final int d;

    public /* synthetic */ bwa(int i, int i2) {
        this.c = i2;
        this.d = i;
    }

    public final o43 a(Bitmap bitmap, s2b s2b) {
        switch (this.c) {
            case 0:
                Matrix matrix = new Matrix();
                int i = this.d;
                if (i > 0) {
                    matrix.postRotate((float) i, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
                }
                return o43.p0(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true), new jj9(26), o43.Y);
            default:
                Matrix matrix2 = new Matrix();
                int i2 = this.d;
                if (i2 > 0) {
                    matrix2.postRotate((float) i2, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
                }
                return o43.p0(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true), new jj9(27), o43.Y);
        }
    }

    public final ww0 b() {
        switch (this.c) {
            case 0:
                return new tpd(String.valueOf(this.d));
            default:
                return new tpd(String.valueOf(this.d));
        }
    }
}
