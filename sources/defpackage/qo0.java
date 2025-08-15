package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: qo0  reason: default package */
public abstract class qo0 {
    public static final khe a = new khe(new m(21));

    public static final h7b a(InputStream inputStream) {
        if (inputStream != null) {
            khe khe = a;
            ByteBuffer byteBuffer = (ByteBuffer) ((v5b) khe.getValue()).f();
            if (byteBuffer == null) {
                yu0 yu0 = f54.a;
                byteBuffer = ByteBuffer.allocate(16384);
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            try {
                options.inTempStorage = byteBuffer.array();
                BitmapFactory.decodeStream(inputStream, (Rect) null, options);
                return new h7b(options.outWidth, options.outHeight, options.outColorSpace);
            } finally {
                ((v5b) khe.getValue()).e(byteBuffer);
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }

    public static final int b(Bitmap.Config config) {
        switch (config == null ? -1 : po0.$EnumSwitchMapping$0[config.ordinal()]) {
            case 1:
            case 6:
            case 7:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static final int c(int i, int i2, Bitmap.Config config) {
        if (i <= 0) {
            throw new IllegalArgumentException(zr6.h(i, "width must be > 0, width is: ").toString());
        } else if (i2 > 0) {
            int b = b(config);
            int i3 = i * i2 * b;
            if (i3 > 0) {
                return i3;
            }
            StringBuilder j = wg0.j("size must be > 0: size: ", i3, ", width: ", i, ", height: ");
            j.append(i2);
            j.append(", pixelSize: ");
            j.append(b);
            throw new IllegalStateException(j.toString().toString());
        } else {
            throw new IllegalArgumentException(zr6.h(i2, "height must be > 0, height is: ").toString());
        }
    }

    public static final int d(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }
}
