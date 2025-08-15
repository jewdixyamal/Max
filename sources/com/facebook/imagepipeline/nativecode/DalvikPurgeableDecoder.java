package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;

@pm4
public abstract class DalvikPurgeableDecoder implements t2b {
    public static final byte[] b = {-1, -39};
    public final qn0 a;

    @om4
    public static class OreoUtils {
        private OreoUtils() {
        }
    }

    static {
        int i = mv6.a;
        hm9.M("imagepipeline");
    }

    public DalvikPurgeableDecoder() {
        if (rn0.c == null) {
            synchronized (rn0.class) {
                if (rn0.c == null) {
                    rn0.c = new qn0(rn0.b, rn0.a);
                }
            }
        }
        this.a = rn0.c;
    }

    public static boolean e(int i, o43 o43) {
        qq8 qq8 = (qq8) o43.e0();
        return i >= 2 && qq8.o(i + -2) == -1 && qq8.o(i - 1) == -39;
    }

    @pm4
    private static native void nativePinBitmap(Bitmap bitmap);

    public final o43 a(g05 g05, Bitmap.Config config) {
        int i = g05.s0;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        o43 o = o43.o(g05.a);
        o.getClass();
        try {
            return f(b(o, options));
        } finally {
            o43.S(o);
        }
    }

    public abstract Bitmap b(o43 o43, BitmapFactory.Options options);

    public abstract Bitmap c(o43 o43, int i, BitmapFactory.Options options);

    public final o43 d(g05 g05, Bitmap.Config config, int i, ColorSpace colorSpace) {
        int i2 = g05.s0;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i2;
        options.inMutable = true;
        if (colorSpace == null) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        options.inPreferredColorSpace = colorSpace;
        o43 o = o43.o(g05.a);
        o.getClass();
        try {
            return f(c(o, i, options));
        } finally {
            o43.S(o);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        r0 = defpackage.qo0.d(r8);
        r8.recycle();
        r8 = java.util.Locale.US;
        r8 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003e, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1 = r8.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        r2 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r3 = r2.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0048, code lost:
        r8 = r7.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004a, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        r2 = r8.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004d, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004e, code lost:
        r7 = r7.a.b();
        r8 = defpackage.wg0.j("Attempted to pin a bitmap of size ", r0, " bytes. The current pool count is ", r1, ", the current pool size is ");
        r8.append(r3);
        r8.append(" bytes. The current pool max count is ");
        r8.append(r2);
        r8.append(", the current pool max size is ");
        r8.append(r7);
        r8.append(" bytes.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        throw new java.lang.RuntimeException(r8.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.v84 f(android.graphics.Bitmap r8) {
        /*
            r7 = this;
            r8.getClass()
            nativePinBitmap(r8)     // Catch:{ Exception -> 0x008b }
            qn0 r0 = r7.a
            monitor-enter(r0)
            int r1 = defpackage.qo0.d(r8)     // Catch:{ all -> 0x0030 }
            int r2 = r0.a     // Catch:{ all -> 0x0030 }
            int r3 = r0.c     // Catch:{ all -> 0x0030 }
            if (r2 >= r3) goto L_0x0032
            long r3 = r0.b     // Catch:{ all -> 0x0030 }
            long r5 = (long) r1     // Catch:{ all -> 0x0030 }
            long r3 = r3 + r5
            int r1 = r0.d     // Catch:{ all -> 0x0030 }
            long r5 = (long) r1     // Catch:{ all -> 0x0030 }
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L_0x0032
            int r2 = r2 + 1
            r0.a = r2     // Catch:{ all -> 0x0030 }
            r0.b = r3     // Catch:{ all -> 0x0030 }
            monitor-exit(r0)
            qn0 r7 = r7.a
            qqd r7 = r7.e
            buc r0 = defpackage.o43.Y
            v84 r7 = defpackage.o43.p0(r8, r7, r0)
            return r7
        L_0x0030:
            r7 = move-exception
            goto L_0x0089
        L_0x0032:
            monitor-exit(r0)
            int r0 = defpackage.qo0.d(r8)
            r8.recycle()
            java.util.Locale r8 = java.util.Locale.US
            qn0 r8 = r7.a
            monitor-enter(r8)
            int r1 = r8.a     // Catch:{ all -> 0x0086 }
            monitor-exit(r8)
            qn0 r2 = r7.a
            monitor-enter(r2)
            long r3 = r2.b     // Catch:{ all -> 0x0083 }
            monitor-exit(r2)
            qn0 r8 = r7.a
            monitor-enter(r8)
            int r2 = r8.c     // Catch:{ all -> 0x0080 }
            monitor-exit(r8)
            qn0 r7 = r7.a
            int r7 = r7.b()
            java.lang.String r8 = "Attempted to pin a bitmap of size "
            java.lang.String r5 = " bytes. The current pool count is "
            java.lang.String r6 = ", the current pool size is "
            java.lang.StringBuilder r8 = defpackage.wg0.j(r8, r0, r5, r1, r6)
            r8.append(r3)
            java.lang.String r0 = " bytes. The current pool max count is "
            r8.append(r0)
            r8.append(r2)
            java.lang.String r0 = ", the current pool max size is "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = " bytes."
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.facebook.imagepipeline.common.TooManyBitmapsException r8 = new com.facebook.imagepipeline.common.TooManyBitmapsException
            r8.<init>(r7)
            throw r8
        L_0x0080:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0080 }
            throw r7
        L_0x0083:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0083 }
            throw r7
        L_0x0086:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0086 }
            throw r7
        L_0x0089:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r7
        L_0x008b:
            r7 = move-exception
            r8.recycle()
            defpackage.nu0.H(r7)
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder.f(android.graphics.Bitmap):v84");
    }
}
