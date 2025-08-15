package androidx.camera.core;

import android.graphics.Bitmap;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;

public abstract class ImageProcessingUtil {
    public static int a;

    static {
        System.loadLibrary("image_processing_util_jni");
    }

    public static ov6 a(hqc hqc, byte[] bArr) {
        c54.k(hqc.j() == 256);
        bArr.getClass();
        Surface surface = hqc.getSurface();
        surface.getClass();
        if (nativeWriteJpegToSurface(bArr, surface) != 0) {
            return null;
        }
        return hqc.g();
    }

    public static Bitmap b(ov6 ov6) {
        if (ov6.k0() == 35) {
            int width = ov6.getWidth();
            int height = ov6.getHeight();
            int A = ov6.v()[0].A();
            int A2 = ov6.v()[1].A();
            int A3 = ov6.v()[2].A();
            int w = ov6.v()[0].w();
            int w2 = ov6.v()[1].w();
            Bitmap createBitmap = Bitmap.createBitmap(ov6.getWidth(), ov6.getHeight(), Bitmap.Config.ARGB_8888);
            int rowBytes = createBitmap.getRowBytes();
            if (nativeConvertAndroid420ToBitmap(ov6.v()[0].t(), A, ov6.v()[1].t(), A2, ov6.v()[2].t(), A3, w, w2, createBitmap, rowBytes, width, height) == 0) {
                return createBitmap;
            }
            throw new UnsupportedOperationException("YUV to RGB conversion failed");
        }
        throw new IllegalArgumentException("Input image format must be YUV_420_888");
    }

    public static ut6 c(ov6 ov6, qv6 qv6, ByteBuffer byteBuffer, int i, boolean z) {
        int i2 = i;
        if (!(ov6.k0() == 35 && ov6.v().length == 3)) {
            return null;
        }
        System.currentTimeMillis();
        if (i2 != 0 && i2 != 90 && i2 != 180 && i2 != 270) {
            return null;
        }
        Surface surface = qv6.getSurface();
        int width = ov6.getWidth();
        int height = ov6.getHeight();
        int A = ov6.v()[0].A();
        int A2 = ov6.v()[1].A();
        int A3 = ov6.v()[2].A();
        int w = ov6.v()[0].w();
        int w2 = ov6.v()[1].w();
        if (nativeConvertAndroid420ToABGR(ov6.v()[0].t(), A, ov6.v()[1].t(), A2, ov6.v()[2].t(), A3, w, w2, surface, byteBuffer, width, height, z ? w : 0, z ? w2 : 0, z ? w2 : 0, i) != 0) {
            return null;
        }
        if (Log.isLoggable("MH", 3)) {
            Locale locale = Locale.US;
            System.currentTimeMillis();
            a++;
        }
        ov6 g = qv6.g();
        if (g == null) {
            return null;
        }
        ut6 ut6 = new ut6(g);
        ut6.a(new nv6(g, ov6));
        return ut6;
    }

    public static void d(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, bitmap.getRowBytes(), i, bitmap.getWidth(), bitmap.getHeight(), false);
    }

    public static void e(Bitmap bitmap, ByteBuffer byteBuffer, int i) {
        nativeCopyBetweenByteBufferAndBitmap(bitmap, byteBuffer, i, bitmap.getRowBytes(), bitmap.getWidth(), bitmap.getHeight(), true);
    }

    public static void f(byte[] bArr, Surface surface) {
        surface.getClass();
        nativeWriteJpegToSurface(bArr, surface);
    }

    private static native int nativeConvertAndroid420ToABGR(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Surface surface, ByteBuffer byteBuffer4, int i6, int i7, int i8, int i9, int i10, int i11);

    private static native int nativeConvertAndroid420ToBitmap(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, Bitmap bitmap, int i6, int i7, int i8);

    private static native int nativeCopyBetweenByteBufferAndBitmap(Bitmap bitmap, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, boolean z);

    private static native int nativeWriteJpegToSurface(byte[] bArr, Surface surface);
}
