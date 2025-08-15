package com.facebook.animated.gif;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

@pm4
public class GifImage {
    public static volatile boolean b;
    public Bitmap.Config a = null;
    @pm4
    private long mNativeContext;

    @pm4
    public GifImage() {
    }

    public static GifImage a(ByteBuffer byteBuffer, ju6 ju6) {
        c();
        byteBuffer.rewind();
        ju6.getClass();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, Integer.MAX_VALUE, false);
        nativeCreateFromDirectByteBuffer.a = ju6.b;
        return nativeCreateFromDirectByteBuffer;
    }

    public static GifImage b(long j, int i, ju6 ju6) {
        c();
        if (j != 0) {
            ju6.getClass();
            GifImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j, i, Integer.MAX_VALUE, false);
            nativeCreateFromNativeMemory.a = ju6.b;
            return nativeCreateFromNativeMemory;
        }
        throw new IllegalArgumentException();
    }

    public static synchronized void c() {
        synchronized (GifImage.class) {
            if (!b) {
                b = true;
                hm9.M("gifimage");
            }
        }
    }

    @pm4
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    @pm4
    private static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    @pm4
    private static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    @pm4
    private native void nativeDispose();

    @pm4
    private native void nativeFinalize();

    @pm4
    private native int nativeGetDuration();

    @pm4
    private native GifFrame nativeGetFrame(int i);

    @pm4
    private native int nativeGetFrameCount();

    @pm4
    private native int[] nativeGetFrameDurations();

    @pm4
    private native int nativeGetHeight();

    @pm4
    private native int nativeGetLoopCount();

    @pm4
    private native int nativeGetSizeInBytes();

    @pm4
    private native int nativeGetWidth();

    @pm4
    private native boolean nativeIsAnimated();

    public final GifFrame d(int i) {
        return nativeGetFrame(i);
    }

    public final int e() {
        return nativeGetFrameCount();
    }

    public final int[] f() {
        return nativeGetFrameDurations();
    }

    public final void finalize() {
        nativeFinalize();
    }

    public final ve g(int i) {
        GifFrame nativeGetFrame = nativeGetFrame(i);
        try {
            int e = nativeGetFrame.e();
            int f = nativeGetFrame.f();
            int d = nativeGetFrame.d();
            int c = nativeGetFrame.c();
            int b2 = nativeGetFrame.b();
            int i2 = 1;
            if (b2 != 0) {
                if (b2 != 1) {
                    int i3 = 2;
                    if (b2 != 2) {
                        i3 = 3;
                        if (b2 == 3) {
                        }
                    }
                    i2 = i3;
                }
            }
            return new ve(e, f, d, c, i2);
        } finally {
            nativeGetFrame.a();
        }
    }

    public final int h() {
        return nativeGetHeight();
    }

    public final int i() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        if (nativeGetLoopCount != 0) {
            return nativeGetLoopCount + 1;
        }
        return 0;
    }

    public final int j() {
        return nativeGetSizeInBytes();
    }

    public final int k() {
        return nativeGetWidth();
    }

    @pm4
    public GifImage(long j) {
        this.mNativeContext = j;
    }
}
