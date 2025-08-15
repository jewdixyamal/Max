package com.facebook.imagepipeline.nativecode;

@pm4
public class NativeJpegTranscoderFactory implements zv6 {
    public final int a;
    public final boolean b;
    public final boolean c;

    @pm4
    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.facebook.imagepipeline.nativecode.NativeJpegTranscoder, yv6, java.lang.Object] */
    @pm4
    public yv6 createImageTranscoder(ou6 ou6, boolean z) {
        if (ou6 != qb4.a) {
            return null;
        }
        ? obj = new Object();
        obj.a = z;
        obj.b = this.a;
        obj.c = this.b;
        if (this.c) {
            fm9.s();
        }
        return obj;
    }
}
