package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* renamed from: a4f  reason: default package */
public abstract class a4f {
    public static final kj6 a = new kj6();
    public static final mw7 b = new mw7(16);

    public static Typeface a(Context context, vx5[] vx5Arr, int i) {
        ParcelFileDescriptor openFileDescriptor;
        a.getClass();
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (vx5 vx5 : vx5Arr) {
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(vx5.a, "r", (CancellationSignal) null);
                    if (openFileDescriptor != null) {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(vx5.c).setSlant(vx5.d ? 1 : 0).setTtcIndex(vx5.b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } else if (openFileDescriptor == null) {
                    }
                    openFileDescriptor.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(kj6.k(build2, i).getStyle()).build();
            throw th;
        } catch (Exception unused2) {
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [java.lang.Object, mfe] */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r3.equals(r5) == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface b(android.content.Context r14, defpackage.rx5 r15, android.content.res.Resources r16, int r17, java.lang.String r18, int r19, int r20, defpackage.tu0 r21, boolean r22) {
        /*
            r0 = r15
            r6 = r20
            r1 = r21
            r2 = 29
            r7 = 2
            r8 = 1
            boolean r3 = r0 instanceof defpackage.ux5
            r4 = 0
            r9 = 0
            r10 = -3
            if (r3 == 0) goto L_0x0188
            ux5 r0 = (defpackage.ux5) r0
            java.lang.String r3 = r0.d
            if (r3 == 0) goto L_0x0030
            boolean r5 = r3.isEmpty()
            if (r5 == 0) goto L_0x001d
            goto L_0x0030
        L_0x001d:
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r4)
            android.graphics.Typeface r5 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r5, r4)
            if (r3 == 0) goto L_0x0030
            boolean r5 = r3.equals(r5)
            if (r5 != 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r3 = r9
        L_0x0031:
            if (r3 == 0) goto L_0x0047
            if (r1 == 0) goto L_0x0046
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r0.<init>(r4)
            do9 r4 = new do9
            r4.<init>(r1, r2, r3)
            r0.post(r4)
        L_0x0046:
            return r3
        L_0x0047:
            if (r22 == 0) goto L_0x004f
            int r2 = r0.c
            if (r2 != 0) goto L_0x0052
        L_0x004d:
            r4 = r8
            goto L_0x0052
        L_0x004f:
            if (r1 != 0) goto L_0x0052
            goto L_0x004d
        L_0x0052:
            r2 = -1
            if (r22 == 0) goto L_0x0059
            int r3 = r0.b
            r11 = r3
            goto L_0x005a
        L_0x0059:
            r11 = r2
        L_0x005a:
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r3.<init>(r5)
            mfe r5 = new mfe
            r5.<init>()
            r5.a = r1
            bg4 r12 = r0.a
            y7g r13 = new y7g
            r0 = 7
            r13.<init>((java.lang.Object) r5, (int) r0, (java.lang.Object) r3)
            if (r4 == 0) goto L_0x00f7
            mw7 r0 = defpackage.px5.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r12.Y
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = r0.toString()
            mw7 r0 = defpackage.px5.a
            java.lang.Object r0 = r0.c(r1)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x00a3
            i76 r1 = new i76
            r1.<init>((java.lang.Object) r5, (int) r7, (java.lang.Object) r0)
            r3.post(r1)
        L_0x00a0:
            r9 = r0
            goto L_0x0182
        L_0x00a3:
            if (r11 != r2) goto L_0x00b1
            r2 = r14
            ox5 r0 = defpackage.px5.a(r1, r14, r12, r6)
            r13.C(r0)
            android.graphics.Typeface r9 = r0.a
            goto L_0x0182
        L_0x00b1:
            r2 = r14
            nx5 r7 = new nx5
            r5 = 0
            r0 = r7
            r3 = r12
            r4 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r0 = defpackage.px5.b     // Catch:{ InterruptedException -> 0x00e5 }
            java.util.concurrent.Future r0 = r0.submit(r7)     // Catch:{ InterruptedException -> 0x00e5 }
            long r1 = (long) r11
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException -> 0x00d4, InterruptedException -> 0x00d2, TimeoutException -> 0x00d6 }
            java.lang.Object r0 = r0.get(r1, r3)     // Catch:{ ExecutionException -> 0x00d4, InterruptedException -> 0x00d2, TimeoutException -> 0x00d6 }
            ox5 r0 = (defpackage.ox5) r0     // Catch:{ InterruptedException -> 0x00e5 }
            r13.C(r0)     // Catch:{ InterruptedException -> 0x00e5 }
            android.graphics.Typeface r9 = r0.a     // Catch:{ InterruptedException -> 0x00e5 }
            goto L_0x0182
        L_0x00d2:
            r0 = move-exception
            goto L_0x00de
        L_0x00d4:
            r0 = move-exception
            goto L_0x00df
        L_0x00d6:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch:{ InterruptedException -> 0x00e5 }
            java.lang.String r1 = "timeout"
            r0.<init>(r1)     // Catch:{ InterruptedException -> 0x00e5 }
            throw r0     // Catch:{ InterruptedException -> 0x00e5 }
        L_0x00de:
            throw r0     // Catch:{ InterruptedException -> 0x00e5 }
        L_0x00df:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch:{ InterruptedException -> 0x00e5 }
            r1.<init>(r0)     // Catch:{ InterruptedException -> 0x00e5 }
            throw r1     // Catch:{ InterruptedException -> 0x00e5 }
        L_0x00e5:
            zj0 r0 = new zj0
            java.lang.Object r1 = r13.b
            mfe r1 = (defpackage.mfe) r1
            r0.<init>(r10, r8, r1)
            java.lang.Object r1 = r13.c
            android.os.Handler r1 = (android.os.Handler) r1
            r1.post(r0)
            goto L_0x0182
        L_0x00f7:
            r2 = r14
            mw7 r0 = defpackage.px5.a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r12.Y
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r6)
            java.lang.String r10 = r0.toString()
            mw7 r0 = defpackage.px5.a
            java.lang.Object r0 = r0.c(r10)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L_0x0126
            i76 r1 = new i76
            r1.<init>((java.lang.Object) r5, (int) r7, (java.lang.Object) r0)
            r3.post(r1)
            goto L_0x00a0
        L_0x0126:
            nu4 r0 = new nu4
            r0.<init>(r8, r13)
            java.lang.Object r3 = defpackage.px5.c
            monitor-enter(r3)
            qpd r1 = defpackage.px5.d     // Catch:{ all -> 0x013d }
            java.lang.Object r4 = r1.get(r10)     // Catch:{ all -> 0x013d }
            java.util.ArrayList r4 = (java.util.ArrayList) r4     // Catch:{ all -> 0x013d }
            if (r4 == 0) goto L_0x013f
            r4.add(r0)     // Catch:{ all -> 0x013d }
            monitor-exit(r3)     // Catch:{ all -> 0x013d }
            goto L_0x0182
        L_0x013d:
            r0 = move-exception
            goto L_0x0186
        L_0x013f:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x013d }
            r4.<init>()     // Catch:{ all -> 0x013d }
            r4.add(r0)     // Catch:{ all -> 0x013d }
            r1.put(r10, r4)     // Catch:{ all -> 0x013d }
            monitor-exit(r3)     // Catch:{ all -> 0x013d }
            nx5 r8 = new nx5
            r5 = 1
            r0 = r8
            r1 = r10
            r2 = r14
            r3 = r12
            r4 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r0 = defpackage.px5.b
            nu4 r1 = new nu4
            r1.<init>(r7, r10)
            android.os.Looper r2 = android.os.Looper.myLooper()
            if (r2 != 0) goto L_0x016e
            android.os.Handler r2 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r2.<init>(r3)
            goto L_0x0173
        L_0x016e:
            android.os.Handler r2 = new android.os.Handler
            r2.<init>()
        L_0x0173:
            wi3 r3 = new wi3
            r4 = 5
            r3.<init>(r4)
            r3.b = r8
            r3.c = r1
            r3.o = r2
            r0.execute(r3)
        L_0x0182:
            r13 = r16
            goto L_0x0207
        L_0x0186:
            monitor-exit(r3)     // Catch:{ all -> 0x013d }
            throw r0
        L_0x0188:
            kj6 r3 = a
            sx5 r0 = (defpackage.sx5) r0
            r3.getClass()
            tx5[] r0 = r0.a     // Catch:{ Exception -> 0x01c9 }
            int r3 = r0.length     // Catch:{ Exception -> 0x01c9 }
            r5 = r9
        L_0x0193:
            if (r4 >= r3) goto L_0x01d0
            r7 = r0[r4]     // Catch:{ Exception -> 0x01c9 }
            android.graphics.fonts.Font$Builder r11 = new android.graphics.fonts.Font$Builder     // Catch:{ IOException -> 0x01cc }
            int r12 = r7.e     // Catch:{ IOException -> 0x01cc }
            r13 = r16
            r11.<init>(r13, r12)     // Catch:{ IOException -> 0x01ce }
            int r12 = r7.a     // Catch:{ IOException -> 0x01ce }
            android.graphics.fonts.Font$Builder r11 = r11.setWeight(r12)     // Catch:{ IOException -> 0x01ce }
            boolean r12 = r7.b     // Catch:{ IOException -> 0x01ce }
            android.graphics.fonts.Font$Builder r11 = r11.setSlant(r12)     // Catch:{ IOException -> 0x01ce }
            int r12 = r7.d     // Catch:{ IOException -> 0x01ce }
            android.graphics.fonts.Font$Builder r11 = r11.setTtcIndex(r12)     // Catch:{ IOException -> 0x01ce }
            java.lang.String r7 = r7.c     // Catch:{ IOException -> 0x01ce }
            android.graphics.fonts.Font$Builder r7 = r11.setFontVariationSettings(r7)     // Catch:{ IOException -> 0x01ce }
            android.graphics.fonts.Font r7 = r7.build()     // Catch:{ IOException -> 0x01ce }
            if (r5 != 0) goto L_0x01c5
            android.graphics.fonts.FontFamily$Builder r11 = new android.graphics.fonts.FontFamily$Builder     // Catch:{ IOException -> 0x01ce }
            r11.<init>(r7)     // Catch:{ IOException -> 0x01ce }
            r5 = r11
            goto L_0x01ce
        L_0x01c5:
            r5.addFont(r7)     // Catch:{ IOException -> 0x01ce }
            goto L_0x01ce
        L_0x01c9:
            r13 = r16
            goto L_0x01ee
        L_0x01cc:
            r13 = r16
        L_0x01ce:
            int r4 = r4 + r8
            goto L_0x0193
        L_0x01d0:
            r13 = r16
            if (r5 != 0) goto L_0x01d5
            goto L_0x01ee
        L_0x01d5:
            android.graphics.fonts.FontFamily r0 = r5.build()     // Catch:{ Exception -> 0x01ee }
            android.graphics.Typeface$CustomFallbackBuilder r3 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch:{ Exception -> 0x01ee }
            r3.<init>(r0)     // Catch:{ Exception -> 0x01ee }
            android.graphics.fonts.Font r0 = defpackage.kj6.k(r0, r6)     // Catch:{ Exception -> 0x01ee }
            android.graphics.fonts.FontStyle r0 = r0.getStyle()     // Catch:{ Exception -> 0x01ee }
            android.graphics.Typeface$CustomFallbackBuilder r0 = r3.setStyle(r0)     // Catch:{ Exception -> 0x01ee }
            android.graphics.Typeface r9 = r0.build()     // Catch:{ Exception -> 0x01ee }
        L_0x01ee:
            if (r1 == 0) goto L_0x0207
            if (r9 == 0) goto L_0x0204
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r0.<init>(r3)
            do9 r3 = new do9
            r3.<init>(r1, r2, r9)
            r0.post(r3)
            goto L_0x0207
        L_0x0204:
            r1.c(r10)
        L_0x0207:
            if (r9 == 0) goto L_0x0212
            mw7 r0 = b
            java.lang.String r1 = d(r16, r17, r18, r19, r20)
            r0.d(r1, r9)
        L_0x0212:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4f.b(android.content.Context, rx5, android.content.res.Resources, int, java.lang.String, int, int, tu0, boolean):android.graphics.Typeface");
    }

    public static Typeface c(Resources resources, int i, String str, int i2, int i3) {
        Typeface typeface;
        a.getClass();
        try {
            Font build = new Font.Builder(resources, i).build();
            typeface = new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            typeface = null;
        }
        if (typeface != null) {
            b.d(d(resources, i, str, i2, i3), typeface);
        }
        return typeface;
    }

    public static String d(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
