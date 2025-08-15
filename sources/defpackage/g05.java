package defpackage;

import android.graphics.ColorSpace;
import java.io.Closeable;
import java.io.InputStream;

/* renamed from: g05  reason: default package */
public final class g05 implements Closeable {
    public int X = 0;
    public int Y = -1;
    public int Z = -1;
    public final o43 a;
    public final ide b;
    public ou6 c = ou6.c;
    public int o = -1;
    public int s0 = 1;
    public int t0 = -1;
    public ColorSpace u0;
    public String v0;

    public g05(o43 o43) {
        if (o43.n0(o43)) {
            this.a = o43.m();
            this.b = null;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static boolean U(g05 g05) {
        return g05.o >= 0 && g05.Y >= 0 && g05.Z >= 0;
    }

    public static g05 a(g05 g05) {
        g05 g052 = null;
        if (g05 != null) {
            ide ide = g05.b;
            if (ide != null) {
                g052 = new g05(ide, g05.t0);
            } else {
                o43 o2 = o43.o(g05.a);
                if (o2 != null) {
                    try {
                        g052 = new g05(o2);
                    } catch (Throwable th) {
                        o43.S(o2);
                        throw th;
                    }
                }
                o43.S(o2);
            }
            if (g052 != null) {
                g052.g(g05);
            }
        }
        return g052;
    }

    public static void d(g05 g05) {
        if (g05 != null) {
            g05.close();
        }
    }

    public static boolean m0(g05 g05) {
        return g05 != null && g05.e0();
    }

    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v25 */
    /* JADX WARNING: type inference failed for: r5v26, types: [kpa] */
    /* JADX WARNING: type inference failed for: r5v27 */
    /* JADX WARNING: type inference failed for: r5v30 */
    /* JADX WARNING: type inference failed for: r5v32, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v34 */
    /* JADX WARNING: type inference failed for: r5v35 */
    /* JADX WARNING: type inference failed for: r5v36 */
    /* JADX WARNING: type inference failed for: r5v37 */
    /* JADX WARNING: type inference failed for: r5v38 */
    /* JADX WARNING: type inference failed for: r5v39 */
    /* JADX WARNING: type inference failed for: r5v40 */
    /* JADX WARNING: type inference failed for: r5v41 */
    /* JADX WARNING: type inference failed for: r5v42 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01f0 A[Catch:{ IOException -> 0x0237 }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x014d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void S() {
        /*
            r15 = this;
            r0 = 2
            r1 = -1
            r2 = 8
            r3 = 1
            java.io.InputStream r4 = r15.n()
            je7 r5 = defpackage.pu6.d
            r5 = 0
            ou6 r4 = defpackage.i24.o(r4)     // Catch:{ IOException -> 0x0295 }
            r15.c = r4
            ou6 r6 = defpackage.qb4.f
            r7 = 0
            if (r4 == r6) goto L_0x0026
            ou6 r6 = defpackage.qb4.g
            if (r4 == r6) goto L_0x0026
            ou6 r6 = defpackage.qb4.h
            if (r4 == r6) goto L_0x0026
            ou6 r6 = defpackage.qb4.i
            if (r4 != r6) goto L_0x0024
            goto L_0x0026
        L_0x0024:
            r6 = r7
            goto L_0x0027
        L_0x0026:
            r6 = r3
        L_0x0027:
            r8 = 255(0xff, float:3.57E-43)
            r9 = 4
            if (r6 != 0) goto L_0x0067
            ou6 r6 = defpackage.qb4.j
            if (r4 != r6) goto L_0x0031
            goto L_0x0067
        L_0x0031:
            java.io.InputStream r5 = r15.n()     // Catch:{ all -> 0x005a }
            h7b r6 = defpackage.qo0.a(r5)     // Catch:{ all -> 0x005a }
            java.lang.Object r10 = r6.b     // Catch:{ all -> 0x005a }
            android.graphics.ColorSpace r10 = (android.graphics.ColorSpace) r10     // Catch:{ all -> 0x005a }
            r15.u0 = r10     // Catch:{ all -> 0x005a }
            java.lang.Object r6 = r6.c
            kpa r6 = (defpackage.kpa) r6
            if (r6 == 0) goto L_0x005c
            java.lang.Object r10 = r6.a     // Catch:{ all -> 0x005a }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x005a }
            int r10 = r10.intValue()     // Catch:{ all -> 0x005a }
            r15.Y = r10     // Catch:{ all -> 0x005a }
            java.lang.Object r10 = r6.b     // Catch:{ all -> 0x005a }
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch:{ all -> 0x005a }
            int r10 = r10.intValue()     // Catch:{ all -> 0x005a }
            r15.Z = r10     // Catch:{ all -> 0x005a }
            goto L_0x005c
        L_0x005a:
            r15 = move-exception
            goto L_0x0061
        L_0x005c:
            r5.close()     // Catch:{ IOException -> 0x0162 }
            goto L_0x0162
        L_0x0061:
            if (r5 == 0) goto L_0x0066
            r5.close()     // Catch:{ IOException -> 0x0066 }
        L_0x0066:
            throw r15
        L_0x0067:
            java.io.InputStream r6 = r15.n()
            if (r6 != 0) goto L_0x006f
            goto L_0x0161
        L_0x006f:
            byte[] r10 = new byte[r9]
            r6.read(r10)     // Catch:{ IOException -> 0x011e }
            java.lang.String r11 = "RIFF"
            boolean r11 = defpackage.z7.d(r10, r11)     // Catch:{ IOException -> 0x011e }
            if (r11 != 0) goto L_0x0087
            r6.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x014b
        L_0x0081:
            r6 = move-exception
            r6.printStackTrace()
            goto L_0x014b
        L_0x0087:
            defpackage.z7.r(r6)     // Catch:{ IOException -> 0x011e }
            r6.read(r10)     // Catch:{ IOException -> 0x011e }
            java.lang.String r11 = "WEBP"
            boolean r11 = defpackage.z7.d(r10, r11)     // Catch:{ IOException -> 0x011e }
            if (r11 != 0) goto L_0x009a
            r6.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x014b
        L_0x009a:
            r6.read(r10)     // Catch:{ IOException -> 0x011e }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x011e }
            r11.<init>()     // Catch:{ IOException -> 0x011e }
            r12 = r7
        L_0x00a3:
            if (r12 >= r9) goto L_0x00b2
            byte r13 = r10[r12]     // Catch:{ IOException -> 0x011e }
            short r13 = (short) r13     // Catch:{ IOException -> 0x011e }
            r14 = 65535(0xffff, float:9.1834E-41)
            r13 = r13 & r14
            char r13 = (char) r13     // Catch:{ IOException -> 0x011e }
            r11.append(r13)     // Catch:{ IOException -> 0x011e }
            int r12 = r12 + r3
            goto L_0x00a3
        L_0x00b2:
            java.lang.String r10 = r11.toString()     // Catch:{ IOException -> 0x011e }
            int r11 = r10.hashCode()     // Catch:{ IOException -> 0x011e }
            r12 = 2640674(0x284b22, float:3.700372E-39)
            if (r11 == r12) goto L_0x0131
            r12 = 2640718(0x284b4e, float:3.700434E-39)
            if (r11 == r12) goto L_0x0120
            r12 = 2640730(0x284b5a, float:3.700451E-39)
            if (r11 == r12) goto L_0x00cb
            goto L_0x0141
        L_0x00cb:
            java.lang.String r11 = "VP8X"
            boolean r10 = r10.equals(r11)     // Catch:{ IOException -> 0x011e }
            if (r10 != 0) goto L_0x00d5
            goto L_0x0141
        L_0x00d5:
            r10 = 8
            r6.skip(r10)     // Catch:{ IOException -> 0x011e }
            kpa r10 = new kpa     // Catch:{ IOException -> 0x011e }
            int r11 = r6.read()     // Catch:{ IOException -> 0x011e }
            r11 = r11 & r8
            int r12 = r6.read()     // Catch:{ IOException -> 0x011e }
            r12 = r12 & r8
            int r13 = r6.read()     // Catch:{ IOException -> 0x011e }
            r13 = r13 & r8
            int r13 = r13 << 16
            int r12 = r12 << r2
            r12 = r12 | r13
            r11 = r11 | r12
            int r11 = r11 + r3
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ IOException -> 0x011e }
            int r12 = r6.read()     // Catch:{ IOException -> 0x011e }
            r12 = r12 & r8
            int r13 = r6.read()     // Catch:{ IOException -> 0x011e }
            r13 = r13 & r8
            int r14 = r6.read()     // Catch:{ IOException -> 0x011e }
            r14 = r14 & r8
            int r14 = r14 << 16
            int r13 = r13 << r2
            r13 = r13 | r14
            r12 = r12 | r13
            int r12 = r12 + r3
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ IOException -> 0x011e }
            r10.<init>(r11, r12)     // Catch:{ IOException -> 0x011e }
            r6.close()     // Catch:{ IOException -> 0x0115 }
            goto L_0x0119
        L_0x0115:
            r5 = move-exception
            r5.printStackTrace()
        L_0x0119:
            r5 = r10
            goto L_0x014b
        L_0x011b:
            r15 = move-exception
            goto L_0x028c
        L_0x011e:
            r10 = move-exception
            goto L_0x0145
        L_0x0120:
            java.lang.String r11 = "VP8L"
            boolean r10 = r10.equals(r11)     // Catch:{ IOException -> 0x011e }
            if (r10 != 0) goto L_0x0129
            goto L_0x0141
        L_0x0129:
            kpa r5 = defpackage.z7.E(r6)     // Catch:{ IOException -> 0x011e }
            r6.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x014b
        L_0x0131:
            java.lang.String r11 = "VP8 "
            boolean r10 = r10.equals(r11)     // Catch:{ IOException -> 0x011e }
            if (r10 == 0) goto L_0x0141
            kpa r5 = defpackage.z7.D(r6)     // Catch:{ IOException -> 0x011e }
            r6.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x014b
        L_0x0141:
            r6.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x014b
        L_0x0145:
            r10.printStackTrace()     // Catch:{ all -> 0x011b }
            r6.close()     // Catch:{ IOException -> 0x0081 }
        L_0x014b:
            if (r5 == 0) goto L_0x0161
            java.lang.Object r6 = r5.a
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r15.Y = r6
            java.lang.Object r6 = r5.b
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r15.Z = r6
        L_0x0161:
            r6 = r5
        L_0x0162:
            ou6 r5 = defpackage.qb4.a
            r10 = 3
            if (r4 != r5) goto L_0x0240
            int r5 = r15.o
            if (r5 != r1) goto L_0x0240
            if (r6 == 0) goto L_0x028b
            java.io.InputStream r4 = r15.n()
        L_0x0171:
            int r5 = defpackage.tu0.C(r4, r3, r7)     // Catch:{ IOException -> 0x0237 }
            if (r5 != r8) goto L_0x01b5
            r5 = r8
        L_0x0178:
            if (r5 != r8) goto L_0x017f
            int r5 = defpackage.tu0.C(r4, r3, r7)     // Catch:{ IOException -> 0x0237 }
            goto L_0x0178
        L_0x017f:
            r6 = 225(0xe1, float:3.15E-43)
            if (r5 != r6) goto L_0x019d
            int r5 = defpackage.tu0.C(r4, r0, r7)     // Catch:{ IOException -> 0x0237 }
            int r6 = r5 + -2
            r8 = 6
            if (r6 <= r8) goto L_0x01b5
            int r6 = defpackage.tu0.C(r4, r9, r7)     // Catch:{ IOException -> 0x0237 }
            int r8 = defpackage.tu0.C(r4, r0, r7)     // Catch:{ IOException -> 0x0237 }
            int r5 = r5 - r2
            r11 = 1165519206(0x45786966, float:3974.5874)
            if (r6 != r11) goto L_0x01b5
            if (r8 != 0) goto L_0x01b5
            goto L_0x01b6
        L_0x019d:
            if (r5 == r3) goto L_0x0171
            r6 = 216(0xd8, float:3.03E-43)
            if (r5 == r6) goto L_0x0171
            r6 = 217(0xd9, float:3.04E-43)
            if (r5 == r6) goto L_0x01b5
            r6 = 218(0xda, float:3.05E-43)
            if (r5 == r6) goto L_0x01b5
            int r5 = defpackage.tu0.C(r4, r0, r7)     // Catch:{ IOException -> 0x0237 }
            int r5 = r5 - r0
            long r5 = (long) r5     // Catch:{ IOException -> 0x0237 }
            r4.skip(r5)     // Catch:{ IOException -> 0x0237 }
            goto L_0x0171
        L_0x01b5:
            r5 = r7
        L_0x01b6:
            if (r5 != 0) goto L_0x01ba
            goto L_0x0237
        L_0x01ba:
            if (r5 > r2) goto L_0x01c0
        L_0x01bc:
            r5 = r7
            r6 = r5
            r11 = r6
            goto L_0x01ed
        L_0x01c0:
            int r6 = defpackage.tu0.C(r4, r9, r7)     // Catch:{ IOException -> 0x0237 }
            java.lang.Class<ote> r8 = defpackage.ote.class
            r11 = 1229531648(0x49492a00, float:823968.0)
            if (r6 == r11) goto L_0x01d6
            r12 = 1296891946(0x4d4d002a, float:2.14958752E8)
            if (r6 == r12) goto L_0x01d6
            java.lang.String r5 = "Invalid TIFF header"
            defpackage.ta5.a(r8, r5)     // Catch:{ IOException -> 0x0237 }
            goto L_0x01bc
        L_0x01d6:
            if (r6 != r11) goto L_0x01da
            r6 = r3
            goto L_0x01db
        L_0x01da:
            r6 = r7
        L_0x01db:
            int r11 = defpackage.tu0.C(r4, r9, r6)     // Catch:{ IOException -> 0x0237 }
            int r5 = r5 + -8
            if (r11 < r2) goto L_0x01e7
            int r12 = r11 + -8
            if (r12 <= r5) goto L_0x01ed
        L_0x01e7:
            java.lang.String r5 = "Invalid offset"
            defpackage.ta5.a(r8, r5)     // Catch:{ IOException -> 0x0237 }
            r5 = r7
        L_0x01ed:
            int r11 = r11 - r2
            if (r5 == 0) goto L_0x0237
            if (r11 <= r5) goto L_0x01f3
            goto L_0x0237
        L_0x01f3:
            long r12 = (long) r11     // Catch:{ IOException -> 0x0237 }
            r4.skip(r12)     // Catch:{ IOException -> 0x0237 }
            int r5 = r5 - r11
            r2 = 14
            if (r5 >= r2) goto L_0x01fe
        L_0x01fc:
            r11 = r7
            goto L_0x0220
        L_0x01fe:
            int r2 = defpackage.tu0.C(r4, r0, r6)     // Catch:{ IOException -> 0x0237 }
            int r5 = r5 + -2
        L_0x0204:
            int r8 = r2 + -1
            if (r2 <= 0) goto L_0x01fc
            r2 = 12
            if (r5 < r2) goto L_0x01fc
            int r2 = defpackage.tu0.C(r4, r0, r6)     // Catch:{ IOException -> 0x0237 }
            int r11 = r5 + -2
            r12 = 274(0x112, float:3.84E-43)
            if (r2 != r12) goto L_0x0217
            goto L_0x0220
        L_0x0217:
            r11 = 10
            r4.skip(r11)     // Catch:{ IOException -> 0x0237 }
            int r5 = r5 + -12
            r2 = r8
            goto L_0x0204
        L_0x0220:
            r1 = 10
            if (r11 >= r1) goto L_0x0225
            goto L_0x0237
        L_0x0225:
            int r1 = defpackage.tu0.C(r4, r0, r6)     // Catch:{ IOException -> 0x0237 }
            if (r1 == r10) goto L_0x022c
            goto L_0x0237
        L_0x022c:
            int r1 = defpackage.tu0.C(r4, r9, r6)     // Catch:{ IOException -> 0x0237 }
            if (r1 == r3) goto L_0x0233
            goto L_0x0237
        L_0x0233:
            int r7 = defpackage.tu0.C(r4, r0, r6)     // Catch:{ IOException -> 0x0237 }
        L_0x0237:
            r15.X = r7
            int r0 = defpackage.oag.q(r7)
            r15.o = r0
            goto L_0x028b
        L_0x0240:
            ou6 r0 = defpackage.qb4.k
            if (r4 != r0) goto L_0x0285
            int r0 = r15.o
            if (r0 != r1) goto L_0x0285
            java.io.InputStream r0 = r15.n()
            java.lang.String r1 = "HeifExifUtil"
            if (r0 != 0) goto L_0x0260
            ft7 r0 = defpackage.ta5.a
            boolean r0 = r0.i(r10)
            if (r0 == 0) goto L_0x027c
            ft7 r0 = defpackage.ta5.a
            java.lang.String r2 = "Trying to read Heif Exif from null inputStream -> ignoring"
            r0.d(r1, r2)
            goto L_0x027c
        L_0x0260:
            c65 r2 = new c65     // Catch:{ IOException -> 0x026c }
            r2.<init>((java.io.InputStream) r0)     // Catch:{ IOException -> 0x026c }
            java.lang.String r0 = "Orientation"
            int r7 = r2.e(r3, r0)     // Catch:{ IOException -> 0x026c }
            goto L_0x027c
        L_0x026c:
            r0 = move-exception
            ft7 r2 = defpackage.ta5.a
            boolean r2 = r2.i(r10)
            if (r2 == 0) goto L_0x027c
            ft7 r2 = defpackage.ta5.a
            java.lang.String r3 = "Failed reading Heif Exif orientation -> ignoring"
            r2.d(r1, r3, r0)
        L_0x027c:
            r15.X = r7
            int r0 = defpackage.oag.q(r7)
            r15.o = r0
            goto L_0x028b
        L_0x0285:
            int r0 = r15.o
            if (r0 != r1) goto L_0x028b
            r15.o = r7
        L_0x028b:
            return
        L_0x028c:
            r6.close()     // Catch:{ IOException -> 0x0290 }
            goto L_0x0294
        L_0x0290:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0294:
            throw r15
        L_0x0295:
            r15 = move-exception
            defpackage.nu0.H(r15)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g05.S():void");
    }

    public final void close() {
        o43.S(this.a);
    }

    public final synchronized boolean e0() {
        return o43.n0(this.a) || this.b != null;
    }

    public final void g(g05 g05) {
        g05.o0();
        this.c = g05.c;
        g05.o0();
        this.Y = g05.Y;
        g05.o0();
        this.Z = g05.Z;
        g05.o0();
        this.o = g05.o;
        g05.o0();
        this.X = g05.X;
        this.s0 = g05.s0;
        this.t0 = g05.o();
        g05.getClass();
        g05.o0();
        this.u0 = g05.u0;
    }

    /* JADX INFO: finally extract failed */
    public final String m() {
        o43 o2 = o43.o(this.a);
        if (o2 == null) {
            return "";
        }
        int min = Math.min(o(), 10);
        byte[] bArr = new byte[min];
        try {
            ((qq8) o2.e0()).S(0, 0, min, bArr);
            o2.close();
            StringBuilder sb = new StringBuilder(min * 2);
            for (int i = 0; i < min; i++) {
                sb.append(String.format("%02X", new Object[]{Byte.valueOf(bArr[i])}));
            }
            return sb.toString();
        } catch (Throwable th) {
            o2.close();
            throw th;
        }
    }

    public final InputStream n() {
        ide ide = this.b;
        if (ide != null) {
            return (InputStream) ide.get();
        }
        o43 o2 = o43.o(this.a);
        if (o2 == null) {
            return null;
        }
        try {
            return new q5b((qq8) o2.e0());
        } finally {
            o43.S(o2);
        }
    }

    public final void n0() {
        S();
    }

    public final int o() {
        o43 o43 = this.a;
        if (o43 == null) {
            return this.t0;
        }
        o43.e0();
        return ((qq8) o43.e0()).U();
    }

    public final void o0() {
        if (this.Y < 0 || this.Z < 0) {
            S();
        }
    }

    public g05(ide ide, int i) {
        ide.getClass();
        this.a = null;
        this.b = ide;
        this.t0 = i;
    }
}
