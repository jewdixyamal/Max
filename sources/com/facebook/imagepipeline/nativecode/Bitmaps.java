package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

@pm4
public class Bitmaps {
    public static final /* synthetic */ int a = 0;

    static {
        int i = mv6.a;
        hm9.M("imagepipeline");
    }

    @pm4
    public static void copyBitmap(Bitmap bitmap, Bitmap bitmap2) {
        boolean z = false;
        od2.j(Boolean.valueOf(bitmap2.getConfig() == bitmap.getConfig()));
        od2.j(Boolean.valueOf(bitmap.isMutable()));
        od2.j(Boolean.valueOf(bitmap.getWidth() == bitmap2.getWidth()));
        if (bitmap.getHeight() == bitmap2.getHeight()) {
            z = true;
        }
        od2.j(Boolean.valueOf(z));
        nativeCopyBitmap(bitmap, bitmap.getRowBytes(), bitmap2, bitmap2.getRowBytes(), bitmap.getHeight());
    }

    @pm4
    private static native void nativeCopyBitmap(Bitmap bitmap, int i, Bitmap bitmap2, int i2, int i3);
}
