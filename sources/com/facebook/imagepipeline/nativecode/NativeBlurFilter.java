package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;

@pm4
public class NativeBlurFilter {
    static {
        hm9.M("native-filters");
    }

    @pm4
    private static native void nativeIterativeBoxBlur(Bitmap bitmap, int i, int i2);
}
