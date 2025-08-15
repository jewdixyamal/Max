package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.location.Location;
import android.media.MediaRoute2Info;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;
import java.io.CharConversionException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;

/* renamed from: np8  reason: default package */
public abstract class np8 {
    public static final xk0 a = new xk0(0);
    public static final byte[] b = {0, 0, 0, 1};
    public static final float[] c = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object d = new Object();
    public static int[] e = new int[10];
    public static final pe5 f;
    public static final pe5[] g;
    public static Boolean h;
    public static Boolean i;
    public static Boolean j;
    public static Boolean k;
    public static Field l;
    public static Integer m;
    public static Integer n;
    public static Integer o;

    static {
        pe5 pe5 = new pe5("app_set_id", 1);
        f = pe5;
        g = new pe5[]{pe5};
    }

    public static boolean A(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (h == null) {
            h = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        h.booleanValue();
        if (i == null) {
            i = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return i.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static float B(zw6 zw6, qy5 qy5) {
        int i2 = qy5.w;
        int i3 = i2 % 180;
        int i4 = qy5.u;
        int i5 = qy5.t;
        int i6 = i3 == 0 ? i5 : i4;
        int i7 = i2 % 180 == 0 ? i4 : i5;
        float f2 = 0.0f;
        for (int i8 = 0; i8 < zw6.size(); i8++) {
            z18 z18 = (z18) zw6.get(i8);
            if (!(z18 instanceof z18)) {
                return -1.0f;
            }
            if (z18 instanceof osc) {
                osc osc = (osc) z18;
                osc.getClass();
                float f3 = osc.a;
                if (f3 % 90.0f != 0.0f) {
                    return -1.0f;
                }
                f2 += f3;
                int i9 = ((f2 % 180.0f) > 0.0f ? 1 : ((f2 % 180.0f) == 0.0f ? 0 : -1));
                i6 = i9 == 0 ? i5 : i4;
                i7 = i9 == 0 ? i4 : i5;
            } else if (!z18.c(i6, i7)) {
                return -1.0f;
            }
        }
        float f4 = f2 % 360.0f;
        if (f4 % 90.0f == 0.0f) {
            return f4;
        }
        return -1.0f;
    }

    public static void C(hj9 hj9, zw6 zw6, qy5 qy5) {
        float B = B(zw6, qy5);
        if (B == 90.0f || B == 180.0f || B == 270.0f) {
            int round = 360 - Math.round(B);
            fm9.j("The additional rotation cannot be changed after adding track formats.", hj9.e.size() == 0 || hj9.v == round);
            hj9.v = round;
        }
    }

    public static final jyc D(Context context) {
        ((OneMeApplication) ((eke) context.getApplicationContext())).getClass();
        return jyc.a;
    }

    public static wl9 E(int i2, byte[] bArr, int i3) {
        s02 s02 = new s02(i2 + 2, i3, 3, bArr);
        int i4 = 4;
        s02.t(4);
        int i5 = s02.i(3);
        s02.s();
        int i6 = s02.i(2);
        boolean h2 = s02.h();
        int i7 = s02.i(5);
        int i8 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (s02.h()) {
                i8 |= 1 << i9;
            }
        }
        int i10 = 6;
        int[] iArr = new int[6];
        for (int i11 = 0; i11 < 6; i11++) {
            iArr[i11] = s02.i(8);
        }
        int i12 = s02.i(8);
        int i13 = 0;
        for (int i14 = 0; i14 < i5; i14++) {
            if (s02.h()) {
                i13 += 89;
            }
            if (s02.h()) {
                i13 += 8;
            }
        }
        s02.t(i13);
        if (i5 > 0) {
            s02.t((8 - i5) * 2);
        }
        s02.m();
        int m2 = s02.m();
        if (m2 == 3) {
            s02.s();
        }
        int m3 = s02.m();
        int m4 = s02.m();
        if (s02.h()) {
            int m5 = s02.m();
            int m6 = s02.m();
            int m7 = s02.m();
            int m8 = s02.m();
            m3 -= (m5 + m6) * ((m2 == 1 || m2 == 2) ? 2 : 1);
            m4 -= (m7 + m8) * (m2 == 1 ? 2 : 1);
        }
        int i15 = m4;
        int i16 = m3;
        s02.m();
        s02.m();
        int m9 = s02.m();
        for (int i17 = s02.h() ? 0 : i5; i17 <= i5; i17++) {
            s02.m();
            s02.m();
            s02.m();
        }
        s02.m();
        s02.m();
        s02.m();
        s02.m();
        s02.m();
        s02.m();
        if (s02.h() && s02.h()) {
            int i18 = 0;
            while (i18 < i4) {
                int i19 = 0;
                while (i19 < i10) {
                    if (!s02.h()) {
                        s02.m();
                    } else {
                        int min = Math.min(64, 1 << ((i18 << 1) + 4));
                        if (i18 > 1) {
                            s02.n();
                        }
                        for (int i20 = 0; i20 < min; i20++) {
                            s02.n();
                        }
                    }
                    i19 += i18 == 3 ? 3 : 1;
                    i10 = 6;
                }
                i18++;
                i4 = 4;
                i10 = 6;
            }
        }
        s02.t(2);
        if (s02.h()) {
            s02.t(8);
            s02.m();
            s02.m();
            s02.s();
        }
        int m10 = s02.m();
        boolean z = false;
        int i21 = 0;
        for (int i22 = 0; i22 < m10; i22++) {
            if (i22 != 0) {
                z = s02.h();
            }
            if (z) {
                s02.s();
                s02.m();
                for (int i23 = 0; i23 <= i21; i23++) {
                    if (!s02.h()) {
                        s02.s();
                    }
                }
            } else {
                int m11 = s02.m();
                int m12 = s02.m();
                int i24 = m11 + m12;
                for (int i25 = 0; i25 < m11; i25++) {
                    s02.m();
                    s02.s();
                }
                for (int i26 = 0; i26 < m12; i26++) {
                    s02.m();
                    s02.s();
                }
                i21 = i24;
            }
        }
        if (s02.h()) {
            for (int i27 = 0; i27 < s02.m(); i27++) {
                s02.t(m9 + 5);
            }
        }
        s02.t(2);
        float f2 = 1.0f;
        if (s02.h()) {
            if (s02.h()) {
                int i28 = s02.i(8);
                if (i28 == 255) {
                    int i29 = s02.i(16);
                    int i30 = s02.i(16);
                    if (!(i29 == 0 || i30 == 0)) {
                        f2 = ((float) i29) / ((float) i30);
                    }
                } else if (i28 < 17) {
                    f2 = c[i28];
                }
            }
            if (s02.h()) {
                s02.s();
            }
            if (s02.h()) {
                s02.t(4);
                if (s02.h()) {
                    s02.t(24);
                }
            }
            if (s02.h()) {
                s02.m();
                s02.m();
            }
            s02.s();
            if (s02.h()) {
                i15 *= 2;
            }
        }
        return new wl9(i6, h2, i7, i8, iArr, i12, i16, i15, f2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0160  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.am9 F(int r22, byte[] r23, int r24) {
        /*
            r0 = 1
            int r1 = r22 + 1
            s02 r2 = new s02
            r3 = 3
            r4 = r23
            r5 = r24
            r2.<init>((int) r1, (int) r5, (int) r3, (byte[]) r4)
            r1 = 8
            int r4 = r2.i(r1)
            int r5 = r2.i(r1)
            int r6 = r2.i(r1)
            int r7 = r2.m()
            r3 = 100
            r8 = 3
            if (r4 == r3) goto L_0x004c
            r3 = 110(0x6e, float:1.54E-43)
            if (r4 == r3) goto L_0x004c
            r3 = 122(0x7a, float:1.71E-43)
            if (r4 == r3) goto L_0x004c
            r3 = 244(0xf4, float:3.42E-43)
            if (r4 == r3) goto L_0x004c
            r3 = 44
            if (r4 == r3) goto L_0x004c
            r3 = 83
            if (r4 == r3) goto L_0x004c
            r3 = 86
            if (r4 == r3) goto L_0x004c
            r3 = 118(0x76, float:1.65E-43)
            if (r4 == r3) goto L_0x004c
            r3 = 128(0x80, float:1.794E-43)
            if (r4 == r3) goto L_0x004c
            r3 = 138(0x8a, float:1.93E-43)
            if (r4 != r3) goto L_0x0049
            goto L_0x004c
        L_0x0049:
            r3 = r0
            r11 = 0
            goto L_0x009e
        L_0x004c:
            int r3 = r2.m()
            if (r3 != r8) goto L_0x0057
            boolean r11 = r2.h()
            goto L_0x0058
        L_0x0057:
            r11 = 0
        L_0x0058:
            r2.m()
            r2.m()
            r2.s()
            boolean r12 = r2.h()
            if (r12 == 0) goto L_0x009e
            if (r3 == r8) goto L_0x006b
            r12 = r1
            goto L_0x006d
        L_0x006b:
            r12 = 12
        L_0x006d:
            r13 = 0
        L_0x006e:
            if (r13 >= r12) goto L_0x009e
            boolean r14 = r2.h()
            if (r14 == 0) goto L_0x009b
            r14 = 6
            if (r13 >= r14) goto L_0x007c
            r14 = 16
            goto L_0x007e
        L_0x007c:
            r14 = 64
        L_0x007e:
            r16 = r1
            r17 = r16
            r15 = 0
        L_0x0083:
            if (r15 >= r14) goto L_0x009b
            if (r16 == 0) goto L_0x0093
            int r16 = r2.n()
            int r10 = r16 + r17
            int r10 = r10 + 256
            int r10 = r10 % 256
            r16 = r10
        L_0x0093:
            if (r16 != 0) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r17 = r16
        L_0x0098:
            int r15 = r15 + 1
            goto L_0x0083
        L_0x009b:
            int r13 = r13 + 1
            goto L_0x006e
        L_0x009e:
            int r10 = r2.m()
            int r13 = r10 + 4
            int r14 = r2.m()
            if (r14 != 0) goto L_0x00b3
            int r10 = r2.m()
            int r10 = r10 + 4
            r0 = r10
        L_0x00b1:
            r1 = 0
            goto L_0x00d5
        L_0x00b3:
            if (r14 != r0) goto L_0x00d3
            boolean r10 = r2.h()
            r2.n()
            r2.n()
            int r12 = r2.m()
            long r8 = (long) r12
            r12 = 0
        L_0x00c5:
            long r0 = (long) r12
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d0
            r2.m()
            int r12 = r12 + 1
            goto L_0x00c5
        L_0x00d0:
            r1 = r10
            r0 = 0
            goto L_0x00d5
        L_0x00d3:
            r0 = 0
            goto L_0x00b1
        L_0x00d5:
            r2.m()
            r2.s()
            int r8 = r2.m()
            r9 = 1
            int r8 = r8 + r9
            int r10 = r2.m()
            int r10 = r10 + r9
            boolean r12 = r2.h()
            int r9 = 2 - r12
            int r10 = r10 * r9
            if (r12 != 0) goto L_0x00f2
            r2.s()
        L_0x00f2:
            r2.s()
            r17 = 16
            int r8 = r8 * 16
            int r10 = r10 * 16
            boolean r17 = r2.h()
            if (r17 == 0) goto L_0x0134
            int r17 = r2.m()
            int r18 = r2.m()
            int r19 = r2.m()
            int r20 = r2.m()
            if (r3 != 0) goto L_0x0115
            r15 = 1
            goto L_0x0128
        L_0x0115:
            r21 = 2
            r15 = 3
            if (r3 != r15) goto L_0x011e
            r22 = 1
        L_0x011c:
            r15 = 1
            goto L_0x0121
        L_0x011e:
            r22 = r21
            goto L_0x011c
        L_0x0121:
            if (r3 != r15) goto L_0x0125
            r15 = r21
        L_0x0125:
            int r9 = r9 * r15
            r15 = r22
        L_0x0128:
            int r17 = r17 + r18
            int r17 = r17 * r15
            int r8 = r8 - r17
            int r19 = r19 + r20
            int r19 = r19 * r9
            int r10 = r10 - r19
        L_0x0134:
            r9 = r10
            boolean r3 = r2.h()
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto L_0x0169
            boolean r3 = r2.h()
            if (r3 == 0) goto L_0x0169
            r3 = 8
            int r3 = r2.i(r3)
            r15 = 255(0xff, float:3.57E-43)
            if (r3 != r15) goto L_0x0160
            r15 = 16
            int r3 = r2.i(r15)
            int r2 = r2.i(r15)
            if (r3 == 0) goto L_0x0169
            if (r2 == 0) goto L_0x0169
            float r3 = (float) r3
            float r2 = (float) r2
            float r10 = r3 / r2
            goto L_0x0169
        L_0x0160:
            r2 = 17
            if (r3 >= r2) goto L_0x0169
            float[] r2 = c
            r2 = r2[r3]
            r10 = r2
        L_0x0169:
            am9 r2 = new am9
            r3 = r2
            r15 = r0
            r16 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np8.F(int, byte[], int):am9");
    }

    public static void G(String str) {
        throw new CharConversionException(zr6.i("Unsupported UCS-4 endianness (", str, ") detected"));
    }

    public static boolean H(qy5 qy5, dd3 dd3, int i2, f1f f1f, v43 v43, hj9 hj9) {
        f99 f99;
        if (dd3.a.size() <= 1) {
            zw6 zw6 = dd3.a;
            if (((mv4) zw6.get(i2)).a.size() <= 1) {
                if (v43.c()) {
                    return true;
                }
                String str = f1f.b;
                if (str != null && !str.equals(qy5.n)) {
                    return true;
                }
                if (f1f.b == null && !hj9.h(qy5.n)) {
                    return true;
                }
                lv4 lv4 = (lv4) ((mv4) zw6.get(i2)).a.get(0);
                if (lv4.d && (f99 = qy5.k) != null) {
                    int i3 = 0;
                    while (true) {
                        d99[] d99Arr = f99.a;
                        if (i3 >= d99Arr.length) {
                            break;
                        } else if (d99Arr[i3] instanceof itd) {
                            return true;
                        } else {
                            i3++;
                        }
                    }
                }
                return !lv4.g.a.isEmpty() || !dd3.c.a.isEmpty();
            }
        }
        return !dd3.e;
    }

    public static boolean I(qy5 qy5, dd3 dd3, int i2, f1f f1f, v43 v43, hj9 hj9) {
        if (dd3.a.size() <= 1) {
            zw6 zw6 = dd3.a;
            if (((mv4) zw6.get(i2)).a.size() <= 1) {
                lv4 lv4 = (lv4) ((mv4) zw6.get(i2)).a.get(0);
                if (v43.a() || f1f.d != 0) {
                    return true;
                }
                String str = f1f.c;
                if (str != null && !str.equals(qy5.n)) {
                    return true;
                }
                if ((str == null && !hj9.h(qy5.n)) || qy5.x != 1.0f) {
                    return true;
                }
                zw6 zw62 = lv4.g.b;
                return !zw62.isEmpty() && B(zw62, qy5) == -1.0f;
            }
        }
        return !dd3.f;
    }

    public static void J(int i2, hj3 hj3, dob dob, boolean z) {
        float f2 = hj3.d0;
        oi3 oi3 = hj3.I;
        int d2 = oi3.f.d();
        oi3 oi32 = hj3.K;
        int d3 = oi32.f.d();
        int e2 = oi3.e() + d2;
        int e3 = d3 - oi32.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int q = hj3.q();
        int i3 = (d3 - d2) - q;
        if (d2 > d3) {
            i3 = (d2 - d3) - q;
        }
        int i4 = ((int) (i3 > 0 ? (f2 * ((float) i3)) + 0.5f : f2 * ((float) i3))) + d2;
        int i5 = i4 + q;
        if (d2 > d3) {
            i5 = i4 - q;
        }
        hj3.J(i4, i5);
        z(i2 + 1, hj3, dob, z);
    }

    public static void K(int i2, hj3 hj3, dob dob, hj3 hj32, boolean z) {
        float f2 = hj32.d0;
        oi3 oi3 = hj32.I;
        int e2 = oi3.e() + oi3.f.d();
        oi3 oi32 = hj32.K;
        int d2 = oi32.f.d() - oi32.e();
        if (d2 >= e2) {
            int q = hj32.q();
            if (hj32.g0 != 8) {
                int i3 = hj32.r;
                if (i3 == 2) {
                    q = (int) (hj32.d0 * 0.5f * ((float) (hj3 instanceof ij3 ? hj3.q() : hj3.T.q())));
                } else if (i3 == 0) {
                    q = d2 - e2;
                }
                q = Math.max(hj32.u, q);
                int i4 = hj32.v;
                if (i4 > 0) {
                    q = Math.min(i4, q);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((float) ((d2 - e2) - q))) + 0.5f));
            hj32.J(i5, q + i5);
            z(i2 + 1, hj32, dob, z);
        }
    }

    public static void L(int i2, hj3 hj3, dob dob) {
        float f2 = hj3.e0;
        oi3 oi3 = hj3.J;
        int d2 = oi3.f.d();
        oi3 oi32 = hj3.L;
        int d3 = oi32.f.d();
        int e2 = oi3.e() + d2;
        int e3 = d3 - oi32.e();
        if (d2 == d3) {
            f2 = 0.5f;
        } else {
            d2 = e2;
            d3 = e3;
        }
        int k2 = hj3.k();
        int i3 = (d3 - d2) - k2;
        if (d2 > d3) {
            i3 = (d2 - d3) - k2;
        }
        int i4 = (int) (i3 > 0 ? (f2 * ((float) i3)) + 0.5f : f2 * ((float) i3));
        int i5 = d2 + i4;
        int i6 = i5 + k2;
        if (d2 > d3) {
            i5 = d2 - i4;
            i6 = i5 - k2;
        }
        hj3.K(i5, i6);
        P(i2 + 1, hj3, dob);
    }

    public static void M(int i2, hj3 hj3, dob dob, hj3 hj32) {
        float f2 = hj32.e0;
        oi3 oi3 = hj32.J;
        int e2 = oi3.e() + oi3.f.d();
        oi3 oi32 = hj32.L;
        int d2 = oi32.f.d() - oi32.e();
        if (d2 >= e2) {
            int k2 = hj32.k();
            if (hj32.g0 != 8) {
                int i3 = hj32.s;
                if (i3 == 2) {
                    k2 = (int) (f2 * 0.5f * ((float) (hj3 instanceof ij3 ? hj3.k() : hj3.T.k())));
                } else if (i3 == 0) {
                    k2 = d2 - e2;
                }
                k2 = Math.max(hj32.x, k2);
                int i4 = hj32.y;
                if (i4 > 0) {
                    k2 = Math.min(i4, k2);
                }
            }
            int i5 = e2 + ((int) ((f2 * ((float) ((d2 - e2) - k2))) + 0.5f));
            hj32.K(i5, k2 + i5);
            P(i2 + 1, hj32, dob);
        }
    }

    public static zf8 N(MediaRoute2Info mediaRoute2Info) {
        if (mediaRoute2Info == null) {
            return null;
        }
        vq7 vq7 = new vq7(mediaRoute2Info.getId(), mediaRoute2Info.getName().toString());
        int a2 = mediaRoute2Info.getConnectionState();
        Bundle bundle = (Bundle) vq7.b;
        bundle.putInt("connectionState", a2);
        bundle.putInt("volumeHandling", mediaRoute2Info.getVolumeHandling());
        bundle.putInt("volumeMax", mediaRoute2Info.getVolumeMax());
        bundle.putInt("volume", mediaRoute2Info.getVolume());
        Bundle j2 = mediaRoute2Info.getExtras();
        if (j2 == null) {
            bundle.putBundle("extras", (Bundle) null);
        } else {
            bundle.putBundle("extras", new Bundle(j2));
        }
        bundle.putBoolean("enabled", true);
        bundle.putBoolean("canDisconnect", false);
        CharSequence z = mediaRoute2Info.getDescription();
        if (z != null) {
            bundle.putString("status", z.toString());
        }
        Uri i2 = mediaRoute2Info.getIconUri();
        if (i2 != null) {
            bundle.putString("iconUri", i2.toString());
        }
        Bundle j3 = mediaRoute2Info.getExtras();
        if (j3 == null || !j3.containsKey("androidx.mediarouter.media.KEY_EXTRAS") || !j3.containsKey("androidx.mediarouter.media.KEY_DEVICE_TYPE") || !j3.containsKey("androidx.mediarouter.media.KEY_CONTROL_FILTERS")) {
            return null;
        }
        Bundle bundle2 = j3.getBundle("androidx.mediarouter.media.KEY_EXTRAS");
        if (bundle2 == null) {
            bundle.putBundle("extras", (Bundle) null);
        } else {
            bundle.putBundle("extras", new Bundle(bundle2));
        }
        bundle.putInt("deviceType", j3.getInt("androidx.mediarouter.media.KEY_DEVICE_TYPE", 0));
        bundle.putInt("playbackType", j3.getInt("androidx.mediarouter.media.KEY_PLAYBACK_TYPE", 1));
        ArrayList parcelableArrayList = j3.getParcelableArrayList("androidx.mediarouter.media.KEY_CONTROL_FILTERS");
        if (parcelableArrayList != null) {
            vq7.h(parcelableArrayList);
        }
        return vq7.k();
    }

    public static int O(int i2, byte[] bArr) {
        int i3;
        synchronized (d) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 >= i2 - 2) {
                        i4 = i2;
                        break;
                    }
                    try {
                        if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                            break;
                        }
                        i4++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = e;
                    if (iArr.length <= i5) {
                        e = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    e[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = e[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006c, code lost:
        r10 = r15.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0076, code lost:
        r10 = r9.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void P(int r16, defpackage.hj3 r17, defpackage.dob r18) {
        /*
            r0 = r17
            r1 = r18
            boolean r2 = r0.n
            if (r2 == 0) goto L_0x0009
            return
        L_0x0009:
            boolean r2 = r0 instanceof defpackage.ij3
            if (r2 != 0) goto L_0x0022
            boolean r2 = r17.z()
            if (r2 == 0) goto L_0x0022
            boolean r2 = b(r17)
            if (r2 == 0) goto L_0x0022
            xk0 r2 = new xk0
            r3 = 0
            r2.<init>(r3)
            defpackage.ij3.V(r0, r1, r2)
        L_0x0022:
            r2 = 3
            oi3 r3 = r0.i(r2)
            r4 = 5
            oi3 r4 = r0.i(r4)
            int r5 = r3.d()
            int r6 = r4.d()
            java.util.HashSet r7 = r3.a
            r8 = 1
            if (r7 == 0) goto L_0x0102
            boolean r3 = r3.c
            if (r3 == 0) goto L_0x0102
            java.util.Iterator r3 = r7.iterator()
        L_0x0041:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0102
            java.lang.Object r7 = r3.next()
            oi3 r7 = (defpackage.oi3) r7
            hj3 r12 = r7.d
            int r13 = r16 + 1
            boolean r14 = b(r12)
            boolean r15 = r12.z()
            if (r15 == 0) goto L_0x0066
            if (r14 == 0) goto L_0x0066
            xk0 r15 = new xk0
            r9 = 0
            r15.<init>(r9)
            defpackage.ij3.V(r12, r1, r15)
        L_0x0066:
            oi3 r9 = r12.J
            oi3 r15 = r12.L
            if (r7 != r9) goto L_0x0074
            oi3 r10 = r15.f
            if (r10 == 0) goto L_0x0074
            boolean r10 = r10.c
            if (r10 != 0) goto L_0x007e
        L_0x0074:
            if (r7 != r15) goto L_0x0080
            oi3 r10 = r9.f
            if (r10 == 0) goto L_0x0080
            boolean r10 = r10.c
            if (r10 == 0) goto L_0x0080
        L_0x007e:
            r10 = r8
            goto L_0x0081
        L_0x0080:
            r10 = 0
        L_0x0081:
            int[] r11 = r12.p0
            r11 = r11[r8]
            if (r11 != r2) goto L_0x00bb
            if (r14 == 0) goto L_0x008a
            goto L_0x00bb
        L_0x008a:
            if (r11 != r2) goto L_0x0041
            int r7 = r12.y
            if (r7 < 0) goto L_0x0041
            int r7 = r12.x
            if (r7 < 0) goto L_0x0041
            int r7 = r12.g0
            r9 = 8
            if (r7 == r9) goto L_0x00a5
            int r7 = r12.s
            if (r7 != 0) goto L_0x0041
            float r7 = r12.W
            r9 = 0
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L_0x0041
        L_0x00a5:
            boolean r7 = r12.y()
            if (r7 != 0) goto L_0x0041
            boolean r7 = r12.F
            if (r7 != 0) goto L_0x0041
            if (r10 == 0) goto L_0x0041
            boolean r7 = r12.y()
            if (r7 != 0) goto L_0x0041
            M(r13, r0, r1, r12)
            goto L_0x0041
        L_0x00bb:
            boolean r11 = r12.z()
            if (r11 == 0) goto L_0x00c3
            goto L_0x0041
        L_0x00c3:
            if (r7 != r9) goto L_0x00db
            oi3 r11 = r15.f
            if (r11 != 0) goto L_0x00db
            int r7 = r9.e()
            int r7 = r7 + r5
            int r9 = r12.k()
            int r9 = r9 + r7
            r12.K(r7, r9)
            P(r13, r12, r1)
            goto L_0x0041
        L_0x00db:
            if (r7 != r15) goto L_0x00f5
            oi3 r7 = r9.f
            if (r7 != 0) goto L_0x00f5
            int r7 = r15.e()
            int r7 = r5 - r7
            int r9 = r12.k()
            int r9 = r7 - r9
            r12.K(r9, r7)
            P(r13, r12, r1)
            goto L_0x0041
        L_0x00f5:
            if (r10 == 0) goto L_0x0041
            boolean r7 = r12.y()
            if (r7 != 0) goto L_0x0041
            L(r13, r12, r1)
            goto L_0x0041
        L_0x0102:
            boolean r3 = r0 instanceof defpackage.fh6
            if (r3 == 0) goto L_0x0107
            return
        L_0x0107:
            java.util.HashSet r3 = r4.a
            if (r3 == 0) goto L_0x01df
            boolean r4 = r4.c
            if (r4 == 0) goto L_0x01df
            java.util.Iterator r3 = r3.iterator()
        L_0x0113:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01df
            java.lang.Object r4 = r3.next()
            oi3 r4 = (defpackage.oi3) r4
            hj3 r5 = r4.d
            int r7 = r16 + 1
            boolean r9 = b(r5)
            boolean r10 = r5.z()
            if (r10 == 0) goto L_0x0138
            if (r9 == 0) goto L_0x0138
            xk0 r10 = new xk0
            r11 = 0
            r10.<init>(r11)
            defpackage.ij3.V(r5, r1, r10)
        L_0x0138:
            oi3 r10 = r5.J
            oi3 r11 = r5.L
            if (r4 != r10) goto L_0x0146
            oi3 r12 = r11.f
            if (r12 == 0) goto L_0x0146
            boolean r12 = r12.c
            if (r12 != 0) goto L_0x0150
        L_0x0146:
            if (r4 != r11) goto L_0x0152
            oi3 r12 = r10.f
            if (r12 == 0) goto L_0x0152
            boolean r12 = r12.c
            if (r12 == 0) goto L_0x0152
        L_0x0150:
            r12 = r8
            goto L_0x0153
        L_0x0152:
            r12 = 0
        L_0x0153:
            int[] r13 = r5.p0
            r13 = r13[r8]
            if (r13 != r2) goto L_0x015b
            if (r9 == 0) goto L_0x015f
        L_0x015b:
            r9 = 8
            r13 = 0
            goto L_0x0198
        L_0x015f:
            if (r13 != r2) goto L_0x0195
            int r4 = r5.y
            if (r4 < 0) goto L_0x0195
            int r4 = r5.x
            if (r4 < 0) goto L_0x0195
            int r4 = r5.g0
            r9 = 8
            if (r4 == r9) goto L_0x017d
            int r4 = r5.s
            if (r4 != 0) goto L_0x017b
            float r4 = r5.W
            r13 = 0
            int r4 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r4 != 0) goto L_0x0113
            goto L_0x017e
        L_0x017b:
            r13 = 0
            goto L_0x0113
        L_0x017d:
            r13 = 0
        L_0x017e:
            boolean r4 = r5.y()
            if (r4 != 0) goto L_0x0113
            boolean r4 = r5.F
            if (r4 != 0) goto L_0x0113
            if (r12 == 0) goto L_0x0113
            boolean r4 = r5.y()
            if (r4 != 0) goto L_0x0113
            M(r7, r0, r1, r5)
            goto L_0x0113
        L_0x0195:
            r9 = 8
            goto L_0x017b
        L_0x0198:
            boolean r14 = r5.z()
            if (r14 == 0) goto L_0x01a0
            goto L_0x0113
        L_0x01a0:
            if (r4 != r10) goto L_0x01b8
            oi3 r14 = r11.f
            if (r14 != 0) goto L_0x01b8
            int r4 = r10.e()
            int r4 = r4 + r6
            int r10 = r5.k()
            int r10 = r10 + r4
            r5.K(r4, r10)
            P(r7, r5, r1)
            goto L_0x0113
        L_0x01b8:
            if (r4 != r11) goto L_0x01d2
            oi3 r4 = r10.f
            if (r4 != 0) goto L_0x01d2
            int r4 = r11.e()
            int r4 = r6 - r4
            int r10 = r5.k()
            int r10 = r4 - r10
            r5.K(r10, r4)
            P(r7, r5, r1)
            goto L_0x0113
        L_0x01d2:
            if (r12 == 0) goto L_0x0113
            boolean r4 = r5.y()
            if (r4 != 0) goto L_0x0113
            L(r7, r5, r1)
            goto L_0x0113
        L_0x01df:
            r3 = 6
            oi3 r3 = r0.i(r3)
            java.util.HashSet r4 = r3.a
            if (r4 == 0) goto L_0x0254
            boolean r4 = r3.c
            if (r4 == 0) goto L_0x0254
            int r4 = r3.d()
            java.util.HashSet r3 = r3.a
            java.util.Iterator r3 = r3.iterator()
        L_0x01f6:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0254
            java.lang.Object r5 = r3.next()
            oi3 r5 = (defpackage.oi3) r5
            hj3 r6 = r5.d
            int r7 = r16 + 1
            boolean r9 = b(r6)
            boolean r10 = r6.z()
            if (r10 == 0) goto L_0x021b
            if (r9 == 0) goto L_0x021b
            xk0 r10 = new xk0
            r11 = 0
            r10.<init>(r11)
            defpackage.ij3.V(r6, r1, r10)
        L_0x021b:
            int[] r10 = r6.p0
            r10 = r10[r8]
            if (r10 != r2) goto L_0x0223
            if (r9 == 0) goto L_0x01f6
        L_0x0223:
            boolean r9 = r6.z()
            if (r9 == 0) goto L_0x022a
            goto L_0x01f6
        L_0x022a:
            oi3 r9 = r6.M
            if (r5 != r9) goto L_0x01f6
            int r5 = r5.e()
            int r5 = r5 + r4
            boolean r10 = r6.E
            if (r10 != 0) goto L_0x0238
            goto L_0x0250
        L_0x0238:
            int r10 = r6.a0
            int r10 = r5 - r10
            int r11 = r6.V
            int r11 = r11 + r10
            r6.Z = r10
            oi3 r12 = r6.J
            r12.l(r10)
            oi3 r10 = r6.L
            r10.l(r11)
            r9.l(r5)
            r6.l = r8
        L_0x0250:
            P(r7, r6, r1)
            goto L_0x01f6
        L_0x0254:
            r0.n = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np8.P(int, hj3, dob):void");
    }

    public static final Iterator Q(Iterator it, int i2, int i3, boolean z) {
        return !it.hasNext() ? mz4.a : m6d.u(new ctd(i2, i3, it, z, (Continuation) null));
    }

    public static String R(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String str2;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i3 >= length) {
                break;
            }
            Object obj = objArr[i3];
            if (obj == null) {
                str2 = "null";
            } else {
                try {
                    str2 = obj.toString();
                } catch (Exception e2) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb.append(name);
                    sb.append("@");
                    sb.append(hexString);
                    String sb2 = sb.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb2), e2);
                    String name2 = e2.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(name2.length() + sb2.length() + 8 + 1);
                    sb3.append("<");
                    sb3.append(sb2);
                    sb3.append(" threw ");
                    sb3.append(name2);
                    sb3.append(">");
                    str2 = sb3.toString();
                }
            }
            objArr[i3] = str2;
            i3++;
        }
        StringBuilder sb4 = new StringBuilder(str.length() + (length * 16));
        int i4 = 0;
        while (true) {
            length2 = objArr.length;
            if (i2 >= length2 || (indexOf = str.indexOf("%s", i4)) == -1) {
                sb4.append(str, i4, str.length());
            } else {
                sb4.append(str, i4, indexOf);
                sb4.append(objArr[i2]);
                i4 = indexOf + 2;
                i2++;
            }
        }
        sb4.append(str, i4, str.length());
        if (i2 < length2) {
            sb4.append(" [");
            sb4.append(objArr[i2]);
            for (int i5 = i2 + 1; i5 < objArr.length; i5++) {
                sb4.append(", ");
                sb4.append(objArr[i5]);
            }
            sb4.append(']');
        }
        return sb4.toString();
    }

    public static final ma9 a(m07 m07, wz7 wz7) {
        m07 m072 = m07;
        long j2 = m072.a;
        String str = m072.b;
        String str2 = m072.c;
        String str3 = str2.length() == 0 ? null : str2;
        String str4 = m072.d;
        q07[] q07Arr = m072.q;
        q07[] q07Arr2 = (q07Arr.length == 0) ^ true ? q07Arr : null;
        String str5 = m072.p;
        String str6 = str5.length() == 0 ? null : str5;
        String str7 = m072.e;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = str7;
        long j3 = m072.f;
        int i2 = m072.g;
        int i3 = m072.h;
        boolean z = m072.i;
        int i4 = i2;
        boolean z2 = m072.j;
        boolean z3 = m072.k;
        long j4 = j3;
        long j5 = m072.l;
        boolean z4 = z;
        long j6 = m072.m;
        Long valueOf = j6 > 0 ? Long.valueOf(j6) : null;
        long j7 = m072.r;
        String str9 = m072.n;
        String str10 = str9.length() == 0 ? null : str9;
        byte[] bArr = m072.o;
        return new ma9(j2, str, str3, str4, q07Arr2, str6, str8, j4, i4, i3, z4, z2, z3, j5, valueOf, j7, m072.s, str10, (bArr.length == 0) ^ true ? bArr : null, (CharSequence) wz7.invoke(m072), m072.t);
    }

    public static boolean b(hj3 hj3) {
        int[] iArr = hj3.p0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        hj3 hj32 = hj3.T;
        ij3 ij3 = hj32 != null ? (ij3) hj32 : null;
        if (ij3 != null) {
            int i4 = ij3.p0[0];
        }
        if (ij3 != null) {
            int i5 = ij3.p0[1];
        }
        boolean z = i2 == 1 || hj3.A() || i2 == 2 || (i2 == 3 && hj3.r == 0 && hj3.W == 0.0f && hj3.t(0)) || (i2 == 3 && hj3.r == 1 && hj3.u(0, hj3.q()));
        boolean z2 = i3 == 1 || hj3.B() || i3 == 2 || (i3 == 3 && hj3.s == 0 && hj3.W == 0.0f && hj3.t(1)) || (i3 == 3 && hj3.s == 1 && hj3.u(1, hj3.k()));
        if (hj3.W <= 0.0f || (!z && !z2)) {
            return z && z2;
        }
        return true;
    }

    public static void c(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void g(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    public static final void h(int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException((i2 != i3 ? wg0.h("Both size ", i2, " and step ", i3, " must be greater than zero.") : wg0.g(i2, "size ", " must be greater than zero.")).toString());
        }
    }

    public static void i(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static int j(long j2, long j3) {
        int i2 = (j2 > j3 ? 1 : (j2 == j3 ? 0 : -1));
        if (i2 < 0) {
            return -1;
        }
        return i2 == 0 ? 0 : 1;
    }

    public static boolean k(String str) {
        HashMap hashMap = zu3.c;
        vu3 vu3 = (vu3) hashMap.get(str);
        if (vu3 == null) {
            return false;
        }
        vu3.a.a();
        hashMap.remove(str);
        return true;
    }

    public static fjb l(Collection collection, jqe jqe, jqe jqe2) {
        return new fjb(jqe, jqe2, y53.M(new mg3(wea.A0, new eqe(yea.f2), 1, false), new mg3(wea.C0, new eqe(yea.g2), 2, false)), dy7.g(new kpa("profile:memberslist:ids_to_delete", x53.E0(collection))));
    }

    public static fjb m(Collection collection, jqe jqe, jqe jqe2) {
        return new fjb(jqe, jqe2, y53.M(new mg3(wea.B0, new eqe(yea.f2), 1, false), new mg3(wea.D0, new eqe(yea.h2), 1, false), new mg3(wea.C0, new eqe(yea.g2), 2, false)), dy7.g(new kpa("profile:memberslist:ids_to_delete", x53.E0(collection))));
    }

    public static final aof n(TextView textView) {
        aof aof = new aof(textView);
        textView.addTextChangedListener(aof);
        textView.addOnAttachStateChangeListener(aof);
        h2a h2a = textView instanceof h2a ? (h2a) textView : null;
        if (h2a != null) {
            h2a.setObserverSpanListener(aof);
        }
        return aof;
    }

    public static int o(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i4 = i3 - i2;
        boolean z = false;
        f(i4 >= 0);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            i(zArr);
            return i2 - 3;
        } else if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            i(zArr);
            return i2 - 2;
        } else if (i4 <= 2 || !zArr[2] || bArr[i2] != 0 || bArr[i2 + 1] != 1) {
            int i5 = i3 - 1;
            int i6 = i2 + 2;
            while (i6 < i5) {
                byte b2 = bArr[i6];
                if ((b2 & 254) == 0) {
                    int i7 = i6 - 2;
                    if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                        i(zArr);
                        return i7;
                    }
                    i6 -= 2;
                }
                i6 += 3;
            }
            zArr[0] = i4 <= 2 ? !(i4 != 2 ? !zArr[1] || bArr[i5] != 1 : !(zArr[2] && bArr[i3 + -2] == 0 && bArr[i5] == 1)) : bArr[i3 + -3] == 0 && bArr[i3 + -2] == 0 && bArr[i5] == 1;
            zArr[1] = i4 <= 1 ? !(!zArr[2] || bArr[i5] != 0) : bArr[i3 + -2] == 0 && bArr[i5] == 0;
            if (bArr[i5] == 0) {
                z = true;
            }
            zArr[2] = z;
            return i3;
        } else {
            i(zArr);
            return i2 - 1;
        }
    }

    public static zu3 p(Bundle bundle) {
        String string;
        Bundle bundle2;
        if (bundle == null || (string = bundle.getString("ControllerChangeHandler.className")) == null || (bundle2 = bundle.getBundle("ControllerChangeHandler.savedState")) == null) {
            return null;
        }
        try {
            Class j2 = ema.j(string, true);
            zu3 zu3 = (zu3) (j2 != null ? j2.newInstance() : null);
            if (zu3 == null) {
                return null;
            }
            zu3.h(bundle2);
            return zu3;
        } catch (Exception e2) {
            StringBuilder m2 = au1.m("An exception occurred while creating a new instance of ", string, ". ");
            m2.append(e2.getMessage());
            throw new RuntimeException(m2.toString());
        }
    }

    public static ne5 q(String str) {
        ne5 ne5;
        ne5[] ne5Arr = ne5.b;
        int length = ne5Arr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                ne5 = null;
                break;
            }
            ne5 = ne5Arr[i2];
            if (tpa.f(ne5.a, str)) {
                break;
            }
            i2++;
        }
        return ne5 == null ? ne5.UNKNOWN : ne5;
    }

    public static /* synthetic */ mn5 r(y66 y66, lx3 lx3, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            lx3 = hz4.a;
        }
        if ((i4 & 2) != 0) {
            i2 = -3;
        }
        if ((i4 & 4) != 0) {
            i3 = 1;
        }
        return y66.e(lx3, i2, i3);
    }

    public static Field s() {
        if (l == null) {
            Field declaredField = Location.class.getDeclaredField("mFieldsMask");
            l = declaredField;
            declaredField.setAccessible(true);
        }
        return l;
    }

    public static int t() {
        if (n == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            n = Integer.valueOf(declaredField.getInt((Object) null));
        }
        return n.intValue();
    }

    public static int u() {
        if (m == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            m = Integer.valueOf(declaredField.getInt((Object) null));
        }
        return m.intValue();
    }

    public static int v() {
        if (o == null) {
            Field declaredField = Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            o = Integer.valueOf(declaredField.getInt((Object) null));
        }
        return o.intValue();
    }

    public static int w(String str) {
        int g2 = ia9.g(str);
        if (g2 == 4) {
            return 2;
        }
        return g2;
    }

    public static ArrayList x(List list) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object i2 : list) {
            MediaRoute2Info i3 = c4.i(i2);
            if (i3 != null) {
                arrayList.add(i3.getId());
            }
        }
        return arrayList;
    }

    public static Matrix y(jt jtVar, jt jtVar2, int i2) {
        int s = au1.s(i2);
        int i3 = jtVar.c;
        int i4 = jtVar.b;
        int i5 = jtVar2.c;
        int i6 = jtVar2.b;
        if (s == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(((float) i4) / ((float) i6), ((float) i3) / ((float) i5), 0.0f, 0.0f);
            return matrix;
        } else if (s == 1) {
            float f2 = ((float) i6) / ((float) i4);
            float f3 = (float) i5;
            float f4 = f3 / ((float) i3);
            float min = Math.min(f2, f4);
            Matrix matrix2 = new Matrix();
            matrix2.setScale(min / f2, min / f4, ((float) i6) / 2.0f, f3 / 2.0f);
            return matrix2;
        } else if (s == 2) {
            float f5 = ((float) i6) / ((float) i4);
            float f6 = (float) i5;
            float f7 = f6 / ((float) i3);
            float max = Math.max(f5, f7);
            Matrix matrix3 = new Matrix();
            matrix3.setScale(max / f5, max / f7, ((float) i6) / 2.0f, f6 / 2.0f);
            return matrix3;
        } else {
            throw new IllegalArgumentException("Unknown scale type = ".concat(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "CENTER_CROP" : "FIT_CENTER" : "NONE"));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006e, code lost:
        r11 = r10.f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0078, code lost:
        r11 = r8.f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void z(int r17, defpackage.hj3 r18, defpackage.dob r19, boolean r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r0.m
            if (r3 == 0) goto L_0x000b
            return
        L_0x000b:
            boolean r3 = r0 instanceof defpackage.ij3
            if (r3 != 0) goto L_0x0024
            boolean r3 = r18.z()
            if (r3 == 0) goto L_0x0024
            boolean r3 = b(r18)
            if (r3 == 0) goto L_0x0024
            xk0 r3 = new xk0
            r4 = 0
            r3.<init>(r4)
            defpackage.ij3.V(r0, r1, r3)
        L_0x0024:
            r3 = 2
            oi3 r3 = r0.i(r3)
            r4 = 4
            oi3 r4 = r0.i(r4)
            int r5 = r3.d()
            int r6 = r4.d()
            java.util.HashSet r7 = r3.a
            r9 = 0
            if (r7 == 0) goto L_0x0103
            boolean r3 = r3.c
            if (r3 == 0) goto L_0x0103
            java.util.Iterator r3 = r7.iterator()
        L_0x0043:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L_0x0103
            java.lang.Object r7 = r3.next()
            oi3 r7 = (defpackage.oi3) r7
            hj3 r13 = r7.d
            int r14 = r17 + 1
            boolean r15 = b(r13)
            boolean r16 = r13.z()
            if (r16 == 0) goto L_0x0068
            if (r15 == 0) goto L_0x0068
            xk0 r8 = new xk0
            r10 = 0
            r8.<init>(r10)
            defpackage.ij3.V(r13, r1, r8)
        L_0x0068:
            oi3 r8 = r13.I
            oi3 r10 = r13.K
            if (r7 != r8) goto L_0x0076
            oi3 r11 = r10.f
            if (r11 == 0) goto L_0x0076
            boolean r11 = r11.c
            if (r11 != 0) goto L_0x0080
        L_0x0076:
            if (r7 != r10) goto L_0x0082
            oi3 r11 = r8.f
            if (r11 == 0) goto L_0x0082
            boolean r11 = r11.c
            if (r11 == 0) goto L_0x0082
        L_0x0080:
            r11 = 1
            goto L_0x0083
        L_0x0082:
            r11 = r9
        L_0x0083:
            int[] r12 = r13.p0
            r12 = r12[r9]
            r9 = 3
            if (r12 != r9) goto L_0x00be
            if (r15 == 0) goto L_0x008d
            goto L_0x00be
        L_0x008d:
            if (r12 != r9) goto L_0x00c4
            int r7 = r13.v
            if (r7 < 0) goto L_0x00c4
            int r7 = r13.u
            if (r7 < 0) goto L_0x00c4
            int r7 = r13.g0
            r8 = 8
            if (r7 == r8) goto L_0x00a8
            int r7 = r13.r
            if (r7 != 0) goto L_0x00c4
            float r7 = r13.W
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x00c4
        L_0x00a8:
            boolean r7 = r13.x()
            if (r7 != 0) goto L_0x00c4
            boolean r7 = r13.F
            if (r7 != 0) goto L_0x00c4
            if (r11 == 0) goto L_0x00c4
            boolean r7 = r13.x()
            if (r7 != 0) goto L_0x00c4
            K(r14, r0, r1, r13, r2)
            goto L_0x00c4
        L_0x00be:
            boolean r9 = r13.z()
            if (r9 == 0) goto L_0x00c7
        L_0x00c4:
            r9 = 0
            goto L_0x0043
        L_0x00c7:
            if (r7 != r8) goto L_0x00de
            oi3 r9 = r10.f
            if (r9 != 0) goto L_0x00de
            int r7 = r8.e()
            int r7 = r7 + r5
            int r8 = r13.q()
            int r8 = r8 + r7
            r13.J(r7, r8)
            z(r14, r13, r1, r2)
            goto L_0x00c4
        L_0x00de:
            if (r7 != r10) goto L_0x00f7
            oi3 r7 = r8.f
            if (r7 != 0) goto L_0x00f7
            int r7 = r10.e()
            int r7 = r5 - r7
            int r8 = r13.q()
            int r8 = r7 - r8
            r13.J(r8, r7)
            z(r14, r13, r1, r2)
            goto L_0x00c4
        L_0x00f7:
            if (r11 == 0) goto L_0x00c4
            boolean r7 = r13.x()
            if (r7 != 0) goto L_0x00c4
            J(r14, r13, r1, r2)
            goto L_0x00c4
        L_0x0103:
            boolean r3 = r0 instanceof defpackage.fh6
            if (r3 == 0) goto L_0x0108
            return
        L_0x0108:
            java.util.HashSet r3 = r4.a
            if (r3 == 0) goto L_0x01e3
            boolean r4 = r4.c
            if (r4 == 0) goto L_0x01e3
            java.util.Iterator r3 = r3.iterator()
        L_0x0114:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x01e3
            java.lang.Object r4 = r3.next()
            oi3 r4 = (defpackage.oi3) r4
            hj3 r5 = r4.d
            r7 = 1
            int r8 = r17 + 1
            boolean r7 = b(r5)
            boolean r9 = r5.z()
            if (r9 == 0) goto L_0x013a
            if (r7 == 0) goto L_0x013a
            xk0 r9 = new xk0
            r10 = 0
            r9.<init>(r10)
            defpackage.ij3.V(r5, r1, r9)
        L_0x013a:
            oi3 r9 = r5.I
            oi3 r10 = r5.K
            if (r4 != r9) goto L_0x0148
            oi3 r11 = r10.f
            if (r11 == 0) goto L_0x0148
            boolean r11 = r11.c
            if (r11 != 0) goto L_0x0152
        L_0x0148:
            if (r4 != r10) goto L_0x0154
            oi3 r11 = r9.f
            if (r11 == 0) goto L_0x0154
            boolean r11 = r11.c
            if (r11 == 0) goto L_0x0154
        L_0x0152:
            r11 = 1
            goto L_0x0155
        L_0x0154:
            r11 = 0
        L_0x0155:
            int[] r12 = r5.p0
            r13 = 0
            r12 = r12[r13]
            r14 = 3
            if (r12 != r14) goto L_0x015f
            if (r7 == 0) goto L_0x0163
        L_0x015f:
            r7 = 8
            r12 = 0
            goto L_0x019c
        L_0x0163:
            if (r12 != r14) goto L_0x0199
            int r4 = r5.v
            if (r4 < 0) goto L_0x0199
            int r4 = r5.u
            if (r4 < 0) goto L_0x0199
            int r4 = r5.g0
            r7 = 8
            if (r4 == r7) goto L_0x0181
            int r4 = r5.r
            if (r4 != 0) goto L_0x017f
            float r4 = r5.W
            r12 = 0
            int r4 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0114
            goto L_0x0182
        L_0x017f:
            r12 = 0
            goto L_0x0114
        L_0x0181:
            r12 = 0
        L_0x0182:
            boolean r4 = r5.x()
            if (r4 != 0) goto L_0x0114
            boolean r4 = r5.F
            if (r4 != 0) goto L_0x0114
            if (r11 == 0) goto L_0x0114
            boolean r4 = r5.x()
            if (r4 != 0) goto L_0x0114
            K(r8, r0, r1, r5, r2)
            goto L_0x0114
        L_0x0199:
            r7 = 8
            goto L_0x017f
        L_0x019c:
            boolean r15 = r5.z()
            if (r15 == 0) goto L_0x01a4
            goto L_0x0114
        L_0x01a4:
            if (r4 != r9) goto L_0x01bc
            oi3 r15 = r10.f
            if (r15 != 0) goto L_0x01bc
            int r4 = r9.e()
            int r4 = r4 + r6
            int r9 = r5.q()
            int r9 = r9 + r4
            r5.J(r4, r9)
            z(r8, r5, r1, r2)
            goto L_0x0114
        L_0x01bc:
            if (r4 != r10) goto L_0x01d6
            oi3 r4 = r9.f
            if (r4 != 0) goto L_0x01d6
            int r4 = r10.e()
            int r4 = r6 - r4
            int r9 = r5.q()
            int r9 = r4 - r9
            r5.J(r9, r4)
            z(r8, r5, r1, r2)
            goto L_0x0114
        L_0x01d6:
            if (r11 == 0) goto L_0x0114
            boolean r4 = r5.x()
            if (r4 != 0) goto L_0x0114
            J(r8, r5, r1, r2)
            goto L_0x0114
        L_0x01e3:
            r1 = 1
            r0.m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.np8.z(int, hj3, dob, boolean):void");
    }
}
