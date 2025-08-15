package com.facebook.imagepipeline.image;

import android.graphics.Bitmap;
import java.util.Map;

public interface CloseableStaticBitmap extends l43 {
    static CloseableStaticBitmap of(Bitmap bitmap, pic pic, pqb pqb, int i) {
        return of(bitmap, pic, pqb, i, 0);
    }

    o43 cloneUnderlyingBitmapReference();

    /* synthetic */ void close();

    o43 convertToBitmapReference();

    int getExifOrientation();

    /* synthetic */ Map getExtras();

    /* synthetic */ int getHeight();

    /* synthetic */ ru6 getImageInfo();

    /* synthetic */ pqb getQualityInfo();

    int getRotationAngle();

    /* synthetic */ int getSizeInBytes();

    Bitmap getUnderlyingBitmap();

    /* synthetic */ int getWidth();

    /* synthetic */ boolean isClosed();

    /* synthetic */ boolean isStateful();

    static CloseableStaticBitmap of(o43 o43, pqb pqb, int i) {
        return of(o43, pqb, i, 0);
    }

    static CloseableStaticBitmap of(Bitmap bitmap, pic pic, pqb pqb, int i, int i2) {
        int i3 = w84.t0;
        return new w84(bitmap, pic, pqb, i, i2);
    }

    static CloseableStaticBitmap of(o43 o43, pqb pqb, int i, int i2) {
        int i3 = w84.t0;
        return new w84(o43, pqb, i, i2);
    }
}
