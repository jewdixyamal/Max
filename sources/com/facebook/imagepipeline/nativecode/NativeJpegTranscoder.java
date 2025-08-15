package com.facebook.imagepipeline.nativecode;

import android.graphics.ColorSpace;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@pm4
public class NativeJpegTranscoder implements yv6 {
    public boolean a;
    public int b;
    public boolean c;

    public static void e(InputStream inputStream, rq8 rq8, int i, int i2, int i3) {
        fm9.s();
        boolean z = false;
        if (i2 >= 1) {
            if (i2 <= 16) {
                if (i3 >= 0) {
                    if (i3 <= 100) {
                        wz wzVar = r97.a;
                        if (i >= 0 && i <= 270 && i % 90 == 0) {
                            if (!(i2 == 8 && i == 0)) {
                                z = true;
                            }
                            od2.k("no transformation requested", z);
                            nativeTranscodeJpeg(inputStream, rq8, i, i2, i3);
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static void f(InputStream inputStream, rq8 rq8, int i, int i2, int i3) {
        boolean z;
        fm9.s();
        boolean z2 = false;
        if (i2 >= 1) {
            if (i2 <= 16) {
                if (i3 >= 0) {
                    if (i3 <= 100) {
                        wz wzVar = r97.a;
                        switch (i) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                                z = true;
                                break;
                            default:
                                z = false;
                                break;
                        }
                        if (z) {
                            if (!(i2 == 8 && i == 1)) {
                                z2 = true;
                            }
                            od2.k("no transformation requested", z2);
                            nativeTranscodeJpegWithExifOrientation(inputStream, rq8, i, i2, i3);
                            return;
                        }
                        throw new IllegalArgumentException();
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @pm4
    private static native void nativeTranscodeJpeg(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    @pm4
    private static native void nativeTranscodeJpegWithExifOrientation(InputStream inputStream, OutputStream outputStream, int i, int i2, int i3) throws IOException;

    public final String a() {
        return "NativeJpegTranscoder";
    }

    /* JADX INFO: finally extract failed */
    public final fm5 b(g05 g05, rq8 rq8, anc anc, jic jic, ColorSpace colorSpace) {
        Integer num = 85;
        if (anc == null) {
            anc = anc.b;
        }
        int g = mqd.g(anc, jic, g05, this.b);
        InputStream inputStream = null;
        try {
            int c2 = r97.c(anc, jic, g05, this.a);
            int i = 1;
            int max = Math.max(1, 8 / g);
            if (this.c) {
                c2 = max;
            }
            inputStream = g05.n();
            wz wzVar = r97.a;
            g05.o0();
            if (wzVar.contains(Integer.valueOf(g05.X))) {
                int a2 = r97.a(anc, g05);
                od2.o(inputStream, "Cannot transcode from null input stream!");
                f(inputStream, rq8, a2, c2, num.intValue());
            } else {
                int b2 = r97.b(anc, g05);
                od2.o(inputStream, "Cannot transcode from null input stream!");
                e(inputStream, rq8, b2, c2, num.intValue());
            }
            q43.b(inputStream);
            if (g != 1) {
                i = 0;
            }
            return new fm5(i, 7);
        } catch (Throwable th) {
            q43.b(inputStream);
            throw th;
        }
    }

    public final boolean c(ou6 ou6) {
        return ou6 == qb4.a;
    }

    public final boolean d(g05 g05, anc anc, jic jic) {
        if (anc == null) {
            anc = anc.b;
        }
        return r97.c(anc, jic, g05, this.a) < 8;
    }
}
