package defpackage;

import android.media.CamcorderProfile;
import javax.inject.Provider;
import org.apache.http.util.LangUtils;

/* renamed from: c32  reason: default package */
public final class c32 implements b66, kx3, qj3, ht1, vaf, pa5, xld, Provider {
    public static final /* synthetic */ c32 X = new c32(4, (byte) 0);
    public static final c32 Y = new c32(5, (byte) 0);
    public static final c32 Z = new c32(6, (byte) 0);
    public static final long[] b = new long[0];
    public static final c32 c = new c32(2, (byte) 0);
    public static final c32 o = new c32(3, (byte) 0);
    public final /* synthetic */ int a;

    public /* synthetic */ c32(int i, byte b2) {
        this.a = i;
    }

    public static c32 d(s77[] s77Arr) {
        if (s77Arr.length <= 31) {
            int i = 0;
            for (s77 s77 : s77Arr) {
                if (s77.a()) {
                    i |= s77.b();
                }
            }
            return new c32(i);
        }
        throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", new Object[]{s77Arr[0].getClass().getName(), Integer.valueOf(s77Arr.length)}));
    }

    public yze B(int i, int i2) {
        return new sk4();
    }

    public void J(v1d v1d) {
    }

    public CamcorderProfile a(int i, int i2) {
        return CamcorderProfile.get(i, i2);
    }

    public void accept(Object obj) {
        hm9.p("v7g", "failure!", (Throwable) obj);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: ref} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: ref} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: ref} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: p55} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v14, resolved type: ref} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v36, resolved type: pv1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v27, resolved type: pv1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: ref} */
    /* JADX WARNING: type inference failed for: r9v0, types: [pv1] */
    /* JADX WARNING: type inference failed for: r9v1, types: [pv1] */
    /* JADX WARNING: type inference failed for: r0v13, types: [p55] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object apply(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 0
            int r10 = r10.a
            switch(r10) {
                case 2: goto L_0x018f;
                case 3: goto L_0x0154;
                default: goto L_0x0006;
            }
        L_0x0006:
            jb0 r11 = (defpackage.jb0) r11
            ov6 r2 = r11.b
            x9b r10 = r11.a
            int r11 = r2.k0()
            boolean r11 = defpackage.f46.V(r11)
            r1 = 0
            if (r11 == 0) goto L_0x004b
            yu0 r11 = defpackage.p55.b     // Catch:{ IOException -> 0x004d }
            sy4[] r11 = r2.v()     // Catch:{ IOException -> 0x004d }
            r11 = r11[r1]     // Catch:{ IOException -> 0x004d }
            java.nio.ByteBuffer r11 = r11.t()     // Catch:{ IOException -> 0x004d }
            r11.rewind()     // Catch:{ IOException -> 0x004d }
            int r0 = r11.capacity()     // Catch:{ IOException -> 0x004d }
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x004d }
            r11.get(r0)     // Catch:{ IOException -> 0x004d }
            java.io.ByteArrayInputStream r11 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x004d }
            r11.<init>(r0)     // Catch:{ IOException -> 0x004d }
            p55 r0 = new p55     // Catch:{ IOException -> 0x004d }
            c65 r3 = new c65     // Catch:{ IOException -> 0x004d }
            r3.<init>((java.io.InputStream) r11)     // Catch:{ IOException -> 0x004d }
            r0.<init>(r3)     // Catch:{ IOException -> 0x004d }
            sy4[] r11 = r2.v()     // Catch:{ IOException -> 0x004d }
            r11 = r11[r1]     // Catch:{ IOException -> 0x004d }
            java.nio.ByteBuffer r11 = r11.t()     // Catch:{ IOException -> 0x004d }
            r11.rewind()     // Catch:{ IOException -> 0x004d }
        L_0x004b:
            r3 = r0
            goto L_0x0056
        L_0x004d:
            r10 = move-exception
            androidx.camera.core.ImageCaptureException r11 = new androidx.camera.core.ImageCaptureException
            java.lang.String r0 = "Failed to extract EXIF data."
            r11.<init>(r0, r10)
            throw r11
        L_0x0056:
            bj6 r11 = defpackage.wi4.a
            java.lang.Class<androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk> r0 = androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk.class
            vrb r11 = r11.e(r0)
            androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk r11 = (androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk) r11
            if (r11 == 0) goto L_0x0066
            aa0 r11 = defpackage.kz1.i
            goto L_0x010f
        L_0x0066:
            int r11 = r2.k0()
            boolean r11 = defpackage.f46.V(r11)
            if (r11 == 0) goto L_0x010f
            java.lang.String r11 = "JPEG image must have exif."
            defpackage.c54.o(r3, r11)
            android.util.Size r11 = new android.util.Size
            int r0 = r2.getWidth()
            int r4 = r2.getHeight()
            r11.<init>(r0, r4)
            int r0 = r10.c
            int r4 = r3.a()
            int r0 = r0 - r4
            int r4 = defpackage.e1f.i(r0)
            boolean r4 = defpackage.e1f.c(r4)
            if (r4 == 0) goto L_0x00a2
            android.util.Size r4 = new android.util.Size
            int r5 = r11.getHeight()
            int r6 = r11.getWidth()
            r4.<init>(r5, r6)
            r5 = r4
            goto L_0x00a3
        L_0x00a2:
            r5 = r11
        L_0x00a3:
            android.graphics.RectF r4 = new android.graphics.RectF
            int r6 = r11.getWidth()
            float r6 = (float) r6
            int r11 = r11.getHeight()
            float r11 = (float) r11
            r7 = 0
            r4.<init>(r7, r7, r6, r11)
            android.graphics.RectF r11 = new android.graphics.RectF
            int r6 = r5.getWidth()
            float r6 = (float) r6
            int r8 = r5.getHeight()
            float r8 = (float) r8
            r11.<init>(r7, r7, r6, r8)
            android.graphics.Matrix r11 = defpackage.e1f.a(r4, r11, r0, r1)
            android.graphics.RectF r0 = new android.graphics.RectF
            android.graphics.Rect r1 = r10.b
            r0.<init>(r1)
            r11.mapRect(r0)
            r0.sort()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r0.round(r6)
            int r7 = r3.a()
            android.graphics.Matrix r8 = new android.graphics.Matrix
            android.graphics.Matrix r10 = r10.e
            r8.<init>(r10)
            r8.postConcat(r11)
            su6 r10 = r2.getImageInfo()
            boolean r10 = r10 instanceof defpackage.qv1
            if (r10 == 0) goto L_0x00fb
            su6 r10 = r2.getImageInfo()
            qv1 r10 = (defpackage.qv1) r10
            pv1 r10 = r10.a
        L_0x00f9:
            r9 = r10
            goto L_0x0101
        L_0x00fb:
            sp3 r10 = new sp3
            r10.<init>()
            goto L_0x00f9
        L_0x0101:
            r2.k0()
            eb0 r10 = new eb0
            int r4 = r2.k0()
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0153
        L_0x010f:
            android.graphics.Rect r6 = r10.b
            su6 r11 = r2.getImageInfo()
            boolean r11 = r11 instanceof defpackage.qv1
            if (r11 == 0) goto L_0x0123
            su6 r11 = r2.getImageInfo()
            qv1 r11 = (defpackage.qv1) r11
            pv1 r11 = r11.a
        L_0x0121:
            r9 = r11
            goto L_0x0129
        L_0x0123:
            sp3 r11 = new sp3
            r11.<init>()
            goto L_0x0121
        L_0x0129:
            int r7 = r10.c
            android.graphics.Matrix r8 = r10.e
            android.util.Size r5 = new android.util.Size
            int r10 = r2.getWidth()
            int r11 = r2.getHeight()
            r5.<init>(r10, r11)
            int r10 = r2.k0()
            boolean r10 = defpackage.f46.V(r10)
            if (r10 == 0) goto L_0x0149
            java.lang.String r10 = "JPEG image must have Exif."
            defpackage.c54.o(r3, r10)
        L_0x0149:
            eb0 r10 = new eb0
            int r4 = r2.k0()
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x0153:
            return r10
        L_0x0154:
            np4 r11 = (defpackage.np4) r11
            lp4 r10 = new lp4
            ep4 r2 = new ep4
            fp4 r1 = r11.a
            long r3 = r1.a
            java.lang.String r1 = r1.b
            r2.<init>(r3, r1)
            i20 r1 = r11.e
            if (r1 != 0) goto L_0x0169
        L_0x0167:
            r7 = r0
            goto L_0x0184
        L_0x0169:
            i20 r0 = new i20
            r3 = 1
            r0.<init>(r3)
            mqb r3 = r1.a
            r0.a = r3
            float r3 = r1.c
            r0.c = r3
            float r3 = r1.b
            r0.b = r3
            boolean r1 = r1.d
            r0.d = r1
            ref r0 = r0.a()
            goto L_0x0167
        L_0x0184:
            int r6 = r11.d
            java.lang.String r3 = r11.b
            long r4 = r11.c
            r1 = r10
            r1.<init>(r2, r3, r4, r6, r7)
            return r10
        L_0x018f:
            ztc r11 = (defpackage.ztc) r11
            khe r10 = defpackage.sd3.g
            java.lang.Object r10 = r10.getValue()
            hle r10 = (defpackage.hle) r10
            jle r10 = (defpackage.jle) r10
            khe r10 = r10.c
            java.lang.Object r10 = r10.getValue()
            ztc r10 = (defpackage.ztc) r10
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c32.apply(java.lang.Object):java.lang.Object");
    }

    public mn5 b(j0e j0e) {
        return new qn5(3, vld.a);
    }

    public boolean c(int i, int i2) {
        return CamcorderProfile.hasProfile(i, i2);
    }

    public Object get() {
        return new d9f(1);
    }

    public int j(Object obj) {
        return ((l43) obj).getSizeInBytes();
    }

    public String toString() {
        switch (this.a) {
            case LangUtils.HASH_SEED /*17*/:
                return "SharingStarted.Eagerly";
            default:
                return super.toString();
        }
    }

    public void w() {
    }

    public c32(int i) {
        this.a = 12;
    }
}
