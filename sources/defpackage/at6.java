package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.apache.http.protocol.HTTP;

/* renamed from: at6  reason: default package */
public final class at6 extends j47 {
    public static final ig5 x0 = new ig5(22);
    public final xs6 w0;

    public at6(xs6 xs6) {
        super(17);
        this.w0 = xs6;
    }

    public static qa6 A0(int i, yaf yaf) {
        int v = yaf.v();
        String J0 = J0(v);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yaf.g(0, bArr, i2);
        int M0 = M0(0, bArr);
        String str = new String(bArr, 0, M0, "ISO-8859-1");
        int i3 = M0 + 1;
        int L0 = L0(i3, bArr, v);
        String D0 = D0(bArr, i3, L0, J0);
        int I0 = I0(v) + L0;
        int L02 = L0(I0, bArr, v);
        String D02 = D0(bArr, I0, L02, J0);
        int I02 = I0(v) + L02;
        return new qa6(str, i2 <= I02 ? maf.f : Arrays.copyOfRange(bArr, I02, i2), D0, D02);
    }

    public static zb9 B0(int i, yaf yaf) {
        int A = yaf.A();
        int x = yaf.x();
        int x2 = yaf.x();
        int v = yaf.v();
        int v2 = yaf.v();
        s02 s02 = new s02(1);
        s02.o(yaf.c, yaf.a);
        s02.q(yaf.b * 8);
        int i2 = ((i - 10) * 8) / (v + v2);
        int[] iArr = new int[i2];
        int[] iArr2 = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = s02.i(v);
            int i5 = s02.i(v2);
            iArr[i3] = i4;
            iArr2[i3] = i5;
        }
        return new zb9(A, x, x2, iArr, iArr2);
    }

    public static f9b C0(int i, yaf yaf) {
        byte[] bArr = new byte[i];
        yaf.g(0, bArr, i);
        int M0 = M0(0, bArr);
        String str = new String(bArr, 0, M0, "ISO-8859-1");
        int i2 = M0 + 1;
        return new f9b(i <= i2 ? maf.f : Arrays.copyOfRange(bArr, i2, i), str);
    }

    public static String D0(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    public static ipe E0(int i, yaf yaf, String str) {
        if (i < 1) {
            return null;
        }
        int v = yaf.v();
        String J0 = J0(v);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yaf.g(0, bArr, i2);
        return new ipe(str, (String) null, new String(bArr, 0, L0(0, bArr, v), J0));
    }

    public static ipe F0(int i, yaf yaf) {
        if (i < 1) {
            return null;
        }
        int v = yaf.v();
        String J0 = J0(v);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yaf.g(0, bArr, i2);
        int L0 = L0(0, bArr, v);
        String str = new String(bArr, 0, L0, J0);
        int I0 = I0(v) + L0;
        return new ipe("TXXX", str, D0(bArr, I0, L0(I0, bArr, v), J0));
    }

    public static h9f G0(int i, yaf yaf, String str) {
        byte[] bArr = new byte[i];
        yaf.g(0, bArr, i);
        return new h9f(str, (String) null, new String(bArr, 0, M0(0, bArr), "ISO-8859-1"));
    }

    public static h9f H0(int i, yaf yaf) {
        if (i < 1) {
            return null;
        }
        int v = yaf.v();
        String J0 = J0(v);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yaf.g(0, bArr, i2);
        int L0 = L0(0, bArr, v);
        String str = new String(bArr, 0, L0, J0);
        int I0 = I0(v) + L0;
        return new h9f("WXXX", str, D0(bArr, I0, M0(I0, bArr), "ISO-8859-1"));
    }

    public static int I0(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    public static String J0(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : HTTP.UTF_16;
    }

    public static String K0(int i, int i2, int i3, int i4, int i5) {
        return i == 2 ? String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}) : String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    public static int L0(int i, byte[] bArr, int i2) {
        int M0 = M0(i, bArr);
        if (i2 == 0 || i2 == 3) {
            return M0;
        }
        while (M0 < bArr.length - 1) {
            if ((M0 - i) % 2 == 0 && bArr[M0 + 1] == 0) {
                return M0;
            }
            M0 = M0(M0 + 1, bArr);
        }
        return bArr.length;
    }

    public static int M0(int i, byte[] bArr) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    public static int N0(int i, yaf yaf) {
        byte[] bArr = yaf.a;
        int i2 = yaf.b;
        int i3 = i2;
        while (true) {
            int i4 = i3 + 1;
            if (i4 >= i2 + i) {
                return i;
            }
            if ((bArr[i3] & 255) == 255 && bArr[i4] == 0) {
                System.arraycopy(bArr, i3 + 2, bArr, i4, (i - (i3 - i2)) - 2);
                i--;
            }
            i3 = i4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0077, code lost:
        if ((r10 & 1) != 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        if ((r10 & 128) != 0) goto L_0x008c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0099 A[SYNTHETIC, Splitter:B:48:0x0099] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0095 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean O0(defpackage.yaf r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r1.b
        L_0x0006:
            int r3 = r18.c()     // Catch:{ all -> 0x0020 }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ac
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0023
            int r7 = r18.h()     // Catch:{ all -> 0x0020 }
            long r8 = r18.w()     // Catch:{ all -> 0x0020 }
            int r10 = r18.A()     // Catch:{ all -> 0x0020 }
            goto L_0x002d
        L_0x0020:
            r0 = move-exception
            goto L_0x00b0
        L_0x0023:
            int r7 = r18.x()     // Catch:{ all -> 0x0020 }
            int r8 = r18.x()     // Catch:{ all -> 0x0020 }
            long r8 = (long) r8
            r10 = r6
        L_0x002d:
            r11 = 0
            if (r7 != 0) goto L_0x003b
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003b
            if (r10 != 0) goto L_0x003b
            r1.H(r2)
            return r4
        L_0x003b:
            r7 = 4
            if (r0 != r7) goto L_0x006c
            if (r21 != 0) goto L_0x006c
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 == 0) goto L_0x004c
            r1.H(r2)
            return r6
        L_0x004c:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006c:
            if (r0 != r7) goto L_0x007c
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0074
            r3 = r4
            goto L_0x0075
        L_0x0074:
            r3 = r6
        L_0x0075:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x007a
            goto L_0x008c
        L_0x007a:
            r4 = r6
            goto L_0x008c
        L_0x007c:
            if (r0 != r3) goto L_0x008a
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0084
            r3 = r4
            goto L_0x0085
        L_0x0084:
            r3 = r6
        L_0x0085:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x007a
            goto L_0x008c
        L_0x008a:
            r3 = r6
            r4 = r3
        L_0x008c:
            if (r4 == 0) goto L_0x0090
            int r3 = r3 + 4
        L_0x0090:
            long r3 = (long) r3
            int r3 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0099
            r1.H(r2)
            return r6
        L_0x0099:
            int r3 = r18.c()     // Catch:{ all -> 0x0020 }
            long r3 = (long) r3
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 >= 0) goto L_0x00a6
            r1.H(r2)
            return r6
        L_0x00a6:
            int r3 = (int) r8
            r1.I(r3)     // Catch:{ all -> 0x0020 }
            goto L_0x0006
        L_0x00ac:
            r1.H(r2)
            return r4
        L_0x00b0:
            r1.H(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at6.O0(yaf, int, int, boolean):boolean");
    }

    public static tl v0(yaf yaf, int i, int i2) {
        int i3;
        String str;
        int v = yaf.v();
        String J0 = J0(v);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        yaf.g(0, bArr, i4);
        if (i2 == 2) {
            String valueOf = String.valueOf(lz7.T(new String(bArr, 0, 3, "ISO-8859-1")));
            str = valueOf.length() != 0 ? "image/".concat(valueOf) : new String("image/");
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = M0(0, bArr);
            str = lz7.T(new String(bArr, 0, i3, "ISO-8859-1"));
            if (str.indexOf(47) == -1) {
                str = str.length() != 0 ? "image/".concat(str) : new String("image/");
            }
        }
        byte b = bArr[i3 + 1] & 255;
        int i5 = i3 + 2;
        int L0 = L0(i5, bArr, v);
        String str2 = new String(bArr, i5, L0 - i5, J0);
        int I0 = I0(v) + L0;
        return new tl(str, str2, b, i4 <= I0 ? maf.f : Arrays.copyOfRange(bArr, I0, i4));
    }

    public static l42 w0(yaf yaf, int i, int i2, boolean z, int i3, xs6 xs6) {
        yaf yaf2 = yaf;
        int i4 = yaf2.b;
        int M0 = M0(i4, yaf2.a);
        String str = new String(yaf2.a, i4, M0 - i4, "ISO-8859-1");
        yaf.H(M0 + 1);
        int h = yaf.h();
        int h2 = yaf.h();
        long w = yaf.w();
        long j = w == 4294967295L ? -1 : w;
        long w2 = yaf.w();
        long j2 = w2 == 4294967295L ? -1 : w2;
        ArrayList arrayList = new ArrayList();
        int i5 = i4 + i;
        while (yaf2.b < i5) {
            ct6 z0 = z0(i2, yaf, z, i3, xs6);
            if (z0 != null) {
                arrayList.add(z0);
            }
        }
        return new l42(str, h, h2, j, j2, (ct6[]) arrayList.toArray(new ct6[0]));
    }

    public static n42 x0(yaf yaf, int i, int i2, boolean z, int i3, xs6 xs6) {
        yaf yaf2 = yaf;
        int i4 = yaf2.b;
        int M0 = M0(i4, yaf2.a);
        String str = new String(yaf2.a, i4, M0 - i4, "ISO-8859-1");
        yaf2.H(M0 + 1);
        int v = yaf.v();
        boolean z2 = (v & 2) != 0;
        boolean z3 = (v & 1) != 0;
        int v2 = yaf.v();
        String[] strArr = new String[v2];
        for (int i5 = 0; i5 < v2; i5++) {
            int i6 = yaf2.b;
            int M02 = M0(i6, yaf2.a);
            strArr[i5] = new String(yaf2.a, i6, M02 - i6, "ISO-8859-1");
            yaf2.H(M02 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i7 = i4 + i;
        while (yaf2.b < i7) {
            ct6 z0 = z0(i2, yaf2, z, i3, xs6);
            if (z0 != null) {
                arrayList.add(z0);
            }
        }
        return new n42(str, z2, z3, strArr, (ct6[]) arrayList.toArray(new ct6[0]));
    }

    public static g73 y0(int i, yaf yaf) {
        if (i < 4) {
            return null;
        }
        int v = yaf.v();
        String J0 = J0(v);
        byte[] bArr = new byte[3];
        yaf.g(0, bArr, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        yaf.g(0, bArr2, i2);
        int L0 = L0(0, bArr2, v);
        String str2 = new String(bArr2, 0, L0, J0);
        int I0 = I0(v) + L0;
        return new g73(str, str2, D0(bArr2, I0, L0(I0, bArr2, v), J0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x016f, code lost:
        if (r13 == 67) goto L_0x0171;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.ct6 z0(int r17, defpackage.yaf r18, boolean r19, int r20, defpackage.xs6 r21) {
        /*
            r0 = r17
            r7 = r18
            int r8 = r18.v()
            int r9 = r18.v()
            int r10 = r18.v()
            r12 = 3
            if (r0 < r12) goto L_0x0019
            int r1 = r18.v()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r18.y()
            if (r19 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r12) goto L_0x0043
            int r1 = r18.y()
            goto L_0x003a
        L_0x0043:
            int r1 = r18.x()
            goto L_0x003a
        L_0x0048:
            if (r0 < r12) goto L_0x0050
            int r1 = r18.A()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0065
            if (r9 != 0) goto L_0x0065
            if (r10 != 0) goto L_0x0065
            if (r13 != 0) goto L_0x0065
            if (r15 != 0) goto L_0x0065
            if (r6 != 0) goto L_0x0065
            int r0 = r7.c
            r7.H(r0)
            return r16
        L_0x0065:
            int r1 = r7.b
            int r5 = r1 + r15
            int r1 = r7.c
            if (r5 <= r1) goto L_0x0071
            r7.H(r1)
            return r16
        L_0x0071:
            if (r21 == 0) goto L_0x0087
            r1 = r21
            r2 = r17
            r3 = r8
            r4 = r9
            r11 = r5
            r5 = r10
            r14 = r6
            r6 = r13
            boolean r1 = r1.c(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x0089
            r7.H(r11)
            return r16
        L_0x0087:
            r11 = r5
            r14 = r6
        L_0x0089:
            r1 = 1
            if (r0 != r12) goto L_0x00a4
            r2 = r14 & 128(0x80, float:1.794E-43)
            if (r2 == 0) goto L_0x0092
            r2 = r1
            goto L_0x0093
        L_0x0092:
            r2 = 0
        L_0x0093:
            r3 = r14 & 64
            if (r3 == 0) goto L_0x0099
            r3 = r1
            goto L_0x009a
        L_0x0099:
            r3 = 0
        L_0x009a:
            r4 = r14 & 32
            if (r4 == 0) goto L_0x00a0
            r4 = r1
            goto L_0x00a1
        L_0x00a0:
            r4 = 0
        L_0x00a1:
            r6 = r2
            r5 = 0
            goto L_0x00ce
        L_0x00a4:
            r2 = 4
            if (r0 != r2) goto L_0x00c9
            r2 = r14 & 64
            if (r2 == 0) goto L_0x00ad
            r4 = r1
            goto L_0x00ae
        L_0x00ad:
            r4 = 0
        L_0x00ae:
            r2 = r14 & 8
            if (r2 == 0) goto L_0x00b4
            r2 = r1
            goto L_0x00b5
        L_0x00b4:
            r2 = 0
        L_0x00b5:
            r3 = r14 & 4
            if (r3 == 0) goto L_0x00bb
            r3 = r1
            goto L_0x00bc
        L_0x00bb:
            r3 = 0
        L_0x00bc:
            r5 = r14 & 2
            if (r5 == 0) goto L_0x00c2
            r5 = r1
            goto L_0x00c3
        L_0x00c2:
            r5 = 0
        L_0x00c3:
            r6 = r14 & 1
            if (r6 == 0) goto L_0x00cd
            r6 = r1
            goto L_0x00ce
        L_0x00c9:
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x00cd:
            r6 = 0
        L_0x00ce:
            if (r2 != 0) goto L_0x01f4
            if (r3 == 0) goto L_0x00d4
            goto L_0x01f4
        L_0x00d4:
            if (r4 == 0) goto L_0x00db
            int r15 = r15 + -1
            r7.I(r1)
        L_0x00db:
            if (r6 == 0) goto L_0x00e3
            int r15 = r15 + -4
            r1 = 4
            r7.I(r1)
        L_0x00e3:
            if (r5 == 0) goto L_0x00eb
            int r1 = N0(r15, r7)
            r2 = r1
            goto L_0x00ec
        L_0x00eb:
            r2 = r15
        L_0x00ec:
            r1 = 2
            r3 = 84
            r4 = 88
            if (r8 != r3) goto L_0x0104
            if (r9 != r4) goto L_0x0104
            if (r10 != r4) goto L_0x0104
            if (r0 == r1) goto L_0x00fb
            if (r13 != r4) goto L_0x0104
        L_0x00fb:
            ipe r1 = F0(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x0101:
            r0 = move-exception
            goto L_0x01ec
        L_0x0104:
            if (r8 != r3) goto L_0x0110
            java.lang.String r1 = K0(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            ipe r1 = E0(r2, r7, r1)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x0110:
            r5 = 87
            if (r8 != r5) goto L_0x0122
            if (r9 != r4) goto L_0x0122
            if (r10 != r4) goto L_0x0122
            if (r0 == r1) goto L_0x011c
            if (r13 != r4) goto L_0x0122
        L_0x011c:
            h9f r1 = H0(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x0122:
            if (r8 != r5) goto L_0x012e
            java.lang.String r1 = K0(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            h9f r1 = G0(r2, r7, r1)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x012e:
            r4 = 73
            r5 = 80
            if (r8 != r5) goto L_0x0144
            r6 = 82
            if (r9 != r6) goto L_0x0144
            if (r10 != r4) goto L_0x0144
            r6 = 86
            if (r13 != r6) goto L_0x0144
            f9b r1 = C0(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x0144:
            r6 = 71
            r12 = 79
            if (r8 != r6) goto L_0x015c
            r6 = 69
            if (r9 != r6) goto L_0x015c
            if (r10 != r12) goto L_0x015c
            r6 = 66
            if (r13 == r6) goto L_0x0156
            if (r0 != r1) goto L_0x015c
        L_0x0156:
            qa6 r1 = A0(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x015c:
            r6 = 65
            r14 = 67
            if (r0 != r1) goto L_0x0169
            if (r8 != r5) goto L_0x0177
            if (r9 != r4) goto L_0x0177
            if (r10 != r14) goto L_0x0177
            goto L_0x0171
        L_0x0169:
            if (r8 != r6) goto L_0x0177
            if (r9 != r5) goto L_0x0177
            if (r10 != r4) goto L_0x0177
            if (r13 != r14) goto L_0x0177
        L_0x0171:
            tl r1 = v0(r7, r2, r0)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x0177:
            r4 = 77
            if (r8 != r14) goto L_0x0188
            if (r9 != r12) goto L_0x0188
            if (r10 != r4) goto L_0x0188
            if (r13 == r4) goto L_0x0183
            if (r0 != r1) goto L_0x0188
        L_0x0183:
            g73 r1 = y0(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x0188:
            if (r8 != r14) goto L_0x01a1
            r1 = 72
            if (r9 != r1) goto L_0x01a1
            if (r10 != r6) goto L_0x01a1
            if (r13 != r5) goto L_0x01a1
            r1 = r18
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            l42 r1 = w0(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x01a1:
            if (r8 != r14) goto L_0x01b8
            if (r9 != r3) goto L_0x01b8
            if (r10 != r12) goto L_0x01b8
            if (r13 != r14) goto L_0x01b8
            r1 = r18
            r3 = r17
            r4 = r19
            r5 = r20
            r6 = r21
            n42 r1 = x0(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x01b8:
            if (r8 != r4) goto L_0x01c7
            r1 = 76
            if (r9 != r1) goto L_0x01c7
            if (r10 != r1) goto L_0x01c7
            if (r13 != r3) goto L_0x01c7
            zb9 r1 = B0(r2, r7)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            goto L_0x01d7
        L_0x01c7:
            java.lang.String r1 = K0(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            byte[] r3 = new byte[r2]     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            r4 = 0
            r7.g(r4, r3, r2)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            em0 r2 = new em0     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            r2.<init>(r3, r1)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            r1 = r2
        L_0x01d7:
            if (r1 != 0) goto L_0x01e8
            java.lang.String r0 = K0(r0, r8, r9, r10, r13)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            int r0 = r0.length()     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            int r0 = r0 + 50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
            r2.<init>(r0)     // Catch:{ UnsupportedEncodingException -> 0x01f0, all -> 0x0101 }
        L_0x01e8:
            r7.H(r11)
            return r1
        L_0x01ec:
            r7.H(r11)
            throw r0
        L_0x01f0:
            r7.H(r11)
            return r16
        L_0x01f4:
            r7.H(r11)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at6.z0(int, yaf, boolean, int, xs6):ct6");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0050, code lost:
        if ((r7 & 64) != 0) goto L_0x0017;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.e99 u0(int r12, byte[] r13) {
        /*
            r11 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            yaf r1 = new yaf
            r1.<init>((int) r12, (byte[]) r13)
            int r12 = r1.c()
            r13 = 2
            r2 = 10
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 4
            if (r12 >= r2) goto L_0x001a
        L_0x0017:
            r9 = r5
            goto L_0x0088
        L_0x001a:
            int r12 = r1.x()
            r7 = 4801587(0x494433, float:6.728456E-39)
            if (r12 == r7) goto L_0x003d
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r7 = "%06X"
            java.lang.String r12 = java.lang.String.format(r7, r12)
            int r7 = r12.length()
            if (r7 == 0) goto L_0x0017
            java.lang.String r7 = "Unexpected first three bytes of ID3 tag header: 0x"
            r7.concat(r12)
            goto L_0x0017
        L_0x003d:
            int r12 = r1.v()
            r1.I(r4)
            int r7 = r1.v()
            int r8 = r1.u()
            if (r12 != r13) goto L_0x0053
            r9 = r7 & 64
            if (r9 == 0) goto L_0x007a
            goto L_0x0017
        L_0x0053:
            r9 = 3
            if (r12 != r9) goto L_0x0064
            r9 = r7 & 64
            if (r9 == 0) goto L_0x007a
            int r9 = r1.h()
            r1.I(r9)
            int r9 = r9 + r6
            int r8 = r8 - r9
            goto L_0x007a
        L_0x0064:
            if (r12 != r6) goto L_0x0017
            r9 = r7 & 64
            if (r9 == 0) goto L_0x0074
            int r9 = r1.u()
            int r10 = r9 + -4
            r1.I(r10)
            int r8 = r8 - r9
        L_0x0074:
            r9 = r7 & 16
            if (r9 == 0) goto L_0x007a
            int r8 = r8 + -10
        L_0x007a:
            if (r12 >= r6) goto L_0x0082
            r7 = r7 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0082
            r7 = r4
            goto L_0x0083
        L_0x0082:
            r7 = r3
        L_0x0083:
            zs6 r9 = new zs6
            r9.<init>(r12, r8, r7)
        L_0x0088:
            if (r9 != 0) goto L_0x008b
            return r5
        L_0x008b:
            int r12 = r1.b
            int r7 = r9.a
            if (r7 != r13) goto L_0x0092
            r2 = 6
        L_0x0092:
            int r13 = r9.c
            boolean r8 = r9.b
            if (r8 == 0) goto L_0x009c
            int r13 = N0(r13, r1)
        L_0x009c:
            int r12 = r12 + r13
            r1.G(r12)
            boolean r12 = O0(r1, r7, r2, r3)
            if (r12 != 0) goto L_0x00b1
            if (r7 != r6) goto L_0x00b0
            boolean r12 = O0(r1, r6, r2, r4)
            if (r12 == 0) goto L_0x00b0
            r3 = r4
            goto L_0x00b1
        L_0x00b0:
            return r5
        L_0x00b1:
            int r12 = r1.c()
            if (r12 < r2) goto L_0x00c3
            xs6 r12 = r11.w0
            ct6 r12 = z0(r7, r1, r3, r2, r12)
            if (r12 == 0) goto L_0x00b1
            r0.add(r12)
            goto L_0x00b1
        L_0x00c3:
            e99 r11 = new e99
            r11.<init>((java.util.List) r0)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.at6.u0(int, byte[]):e99");
    }

    public final e99 w(j99 j99, ByteBuffer byteBuffer) {
        return u0(byteBuffer.limit(), byteBuffer.array());
    }
}
