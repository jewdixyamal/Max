package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Rect;

/* renamed from: md3  reason: default package */
public final class md3 implements yv6 {
    public static final md3 c = new md3(true, 1);
    public final boolean a;
    public final int b;

    public /* synthetic */ md3(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public String a() {
        return "SimpleImageTranscoder";
    }

    public fm5 b(g05 g05, rq8 rq8, anc anc, jic jic, ColorSpace colorSpace) {
        Bitmap bitmap;
        fm5 fm5;
        g05 g052 = g05;
        ColorSpace colorSpace2 = colorSpace;
        Integer num = 85;
        anc anc2 = anc == null ? anc.b : anc;
        int i = 1;
        int g = !this.a ? 1 : mqd.g(anc2, jic, g052, this.b);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = g;
        if (colorSpace2 != null) {
            options.inPreferredColorSpace = colorSpace2;
        }
        try {
            Matrix matrix = null;
            Bitmap decodeStream = BitmapFactory.decodeStream(g05.n(), (Rect) null, options);
            if (decodeStream == null) {
                if (ta5.a.i(6)) {
                    ta5.a.e("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
                }
                return new fm5(2, 7);
            }
            wz wzVar = r97.a;
            g05.o0();
            if (r97.a.contains(Integer.valueOf(g052.X))) {
                int a2 = r97.a(anc2, g052);
                Matrix matrix2 = new Matrix();
                if (a2 == 2) {
                    matrix2.setScale(-1.0f, 1.0f);
                } else if (a2 == 7) {
                    matrix2.setRotate(-90.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (a2 == 4) {
                    matrix2.setRotate(180.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                } else if (a2 == 5) {
                    matrix2.setRotate(90.0f);
                    matrix2.postScale(-1.0f, 1.0f);
                }
                matrix = matrix2;
            } else {
                int b2 = r97.b(anc2, g052);
                if (b2 != 0) {
                    matrix = new Matrix();
                    matrix.setRotate((float) b2);
                }
            }
            Matrix matrix3 = matrix;
            if (matrix3 != null) {
                try {
                    bitmap = Bitmap.createBitmap(decodeStream, 0, 0, decodeStream.getWidth(), decodeStream.getHeight(), matrix3, false);
                } catch (OutOfMemoryError e) {
                    e = e;
                    bitmap = decodeStream;
                    try {
                        ta5.c("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                        fm5 = new fm5(2, 7);
                        bitmap.recycle();
                        decodeStream.recycle();
                        return fm5;
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bitmap = decodeStream;
                    bitmap.recycle();
                    decodeStream.recycle();
                    throw th;
                }
            } else {
                bitmap = decodeStream;
            }
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, num.intValue(), rq8);
                if (g > 1) {
                    i = 0;
                }
                fm5 = new fm5(i, 7);
            } catch (OutOfMemoryError e2) {
                e = e2;
                ta5.c("SimpleImageTranscoder", "Out-Of-Memory during transcode", e);
                fm5 = new fm5(2, 7);
                bitmap.recycle();
                decodeStream.recycle();
                return fm5;
            }
            bitmap.recycle();
            decodeStream.recycle();
            return fm5;
        } catch (OutOfMemoryError e3) {
            ta5.c("SimpleImageTranscoder", "Out-Of-Memory during transcode", e3);
            return new fm5(2, 7);
        }
    }

    public boolean c(ou6 ou6) {
        return ou6 == qb4.k || ou6 == qb4.a;
    }

    public boolean d(g05 g05, anc anc, jic jic) {
        if (anc == null) {
            anc = anc.b;
        }
        return this.a && mqd.g(anc, jic, g05, this.b) > 1;
    }

    public md3(int i, boolean z) {
        this.b = i;
        this.a = z;
    }
}
