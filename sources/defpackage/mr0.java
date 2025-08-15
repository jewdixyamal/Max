package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.fragment.app.b;
import com.bluelinelabs.conductor.internal.AndroidXLifecycleHandlerImpl;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.http.HttpStatus;

/* renamed from: mr0  reason: default package */
public abstract class mr0 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, HttpStatus.SC_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final int[] g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] h = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    public static final int[] i = {12445, 13120, 12344, 12344};
    public static final int[] j = {12445, 13632, 12344, 12344};
    public static final int[] k = {12344};
    public static final int[] l = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static sfg m;

    public static EGLDisplay A() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        g("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        g("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        f();
        return eglGetDisplay;
    }

    public static EGLConfig B(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new Exception("eglChooseConfig failed.");
    }

    public static final Field C(Field field, String str) {
        try {
            Field declaredField = ExecutorsRegistrar.class.getDeclaredField(str);
            declaredField.setAccessible(true);
            field.setInt(declaredField, declaredField.getModifiers() & -17);
            return declaredField;
        } catch (Throwable th) {
            hm9.p("ReplaceExecutorRegistrarLogic", "fail to fetch executor field ".concat(str), th);
            return null;
        }
    }

    public static int E() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = new int[2];
        EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        EGL14.eglChooseConfig(eglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] == 0) {
            return 0;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
        int[] iArr3 = new int[1];
        GLES20.glGetIntegerv(3379, iArr3, 0);
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
        EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
        EGL14.eglTerminate(eglGetDisplay);
        return iArr3[0];
    }

    public static int[] F(String str) {
        int i2;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i3 = indexOf4 + 2;
        if (i3 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i3) == '/') {
            i2 = str.indexOf(47, indexOf4 + 3);
            if (i2 == -1 || i2 > indexOf2) {
                i2 = indexOf2;
            }
        } else {
            i2 = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i2;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static final void G(uu3 uu3) {
        Activity activity = uu3.getActivity();
        if (activity != null) {
            H(activity);
        }
    }

    public static final void H(Activity activity) {
        View currentFocus;
        if (activity != null && (currentFocus = activity.getWindow().getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            try {
                ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            } catch (Throwable unused) {
            }
        }
    }

    public static final void I(View view) {
        if (view != null) {
            Context context = view.getContext();
            view.clearFocus();
            try {
                ((InputMethodManager) context.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean J(int i2) {
        return i2 != 0 && s63.e(i2) > 0.5d;
    }

    public static boolean K(int i2, boolean z) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579 && z) {
            return true;
        }
        int[] iArr = l;
        for (int i3 = 0; i3 < 29; i3++) {
            if (iArr[i3] == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean L(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    public static boolean M() {
        return nr0.d;
    }

    public static int N(int i2, float f2, int i3) {
        return s63.g(s63.i(i3, Math.round(((float) Color.alpha(i3)) * f2)), i2);
    }

    public static final void O(Context context) {
        LinkedHashMap linkedHashMap;
        String str;
        if (context.getDatabasePath("androidx.work.workdb").exists()) {
            a14.u().n(i7g.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath = context.getDatabasePath("androidx.work.workdb");
            File file = new File(qk.a.a(context), "androidx.work.workdb");
            String[] strArr = i7g.b;
            int Z = mz7.Z(strArr.length);
            if (Z < 16) {
                Z = 16;
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(Z);
            for (String str2 : strArr) {
                linkedHashMap2.put(new File(databasePath.getPath() + str2), new File(file.getPath() + str2));
            }
            if (linkedHashMap2.isEmpty()) {
                linkedHashMap = Collections.singletonMap(databasePath, file);
            } else {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
                linkedHashMap3.put(databasePath, file);
                linkedHashMap = linkedHashMap3;
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        a14.u().R(i7g.a, "Over-writing contents of " + file3);
                    }
                    if (file2.renameTo(file3)) {
                        str = "Migrated " + file2 + "to " + file3;
                    } else {
                        str = "Renaming " + file2 + " to " + file3 + " failed";
                    }
                    a14.u().n(i7g.a, str);
                }
            }
        }
    }

    public static String Q(int i2, int i3, StringBuilder sb) {
        int i4;
        int i5;
        if (i2 >= i3) {
            return sb.toString();
        }
        if (sb.charAt(i2) == '/') {
            i2++;
        }
        int i6 = i2;
        int i7 = i6;
        while (i6 <= i3) {
            if (i6 == i3) {
                i4 = i6;
            } else if (sb.charAt(i6) == '/') {
                i4 = i6 + 1;
            } else {
                i6++;
            }
            int i8 = i7 + 1;
            if (i6 == i8 && sb.charAt(i7) == '.') {
                sb.delete(i7, i4);
                i3 -= i4 - i7;
            } else {
                if (i6 == i7 + 2 && sb.charAt(i7) == '.' && sb.charAt(i8) == '.') {
                    i5 = sb.lastIndexOf("/", i7 - 2) + 1;
                    int i9 = i5 > i2 ? i5 : i2;
                    sb.delete(i9, i4);
                    i3 -= i4 - i9;
                } else {
                    i5 = i6 + 1;
                }
                i7 = i5;
            }
            i6 = i7;
        }
        return sb.toString();
    }

    public static String R(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] F = F(str2);
        if (F[0] != -1) {
            sb.append(str2);
            Q(F[1], F[2], sb);
            return sb.toString();
        }
        int[] F2 = F(str);
        if (F[3] == 0) {
            sb.append(str, 0, F2[3]);
            sb.append(str2);
            return sb.toString();
        } else if (F[2] == 0) {
            sb.append(str, 0, F2[2]);
            sb.append(str2);
            return sb.toString();
        } else {
            int i2 = F[1];
            if (i2 != 0) {
                int i3 = F2[0] + 1;
                sb.append(str, 0, i3);
                sb.append(str2);
                return Q(F[1] + i3, i3 + F[2], sb);
            } else if (str2.charAt(i2) == '/') {
                sb.append(str, 0, F2[1]);
                sb.append(str2);
                int i4 = F2[1];
                return Q(i4, F[2] + i4, sb);
            } else {
                int i5 = F2[0] + 2;
                int i6 = F2[1];
                if (i5 >= i6 || i6 != F2[2]) {
                    int lastIndexOf = str.lastIndexOf(47, F2[2] - 1);
                    int i7 = lastIndexOf == -1 ? F2[1] : lastIndexOf + 1;
                    sb.append(str, 0, i7);
                    sb.append(str2);
                    return Q(F2[1], i7 + F[2], sb);
                }
                sb.append(str, 0, i6);
                sb.append('/');
                sb.append(str2);
                int i8 = F2[1];
                return Q(i8, F[2] + i8 + 1, sb);
            }
        }
    }

    public static Uri S(String str, String str2) {
        return Uri.parse(R(str, str2));
    }

    public static final void T(Field field, k56 k56) {
        field.set((Object) null, new le7(new bc3(3, k56)));
    }

    public static void U(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static void V(View view) {
        if (view != null) {
            view.requestFocus();
            view.post(new vs5(view, 10, view));
        }
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [iud, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [iud, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0130, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0132, code lost:
        r2 = r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.iud W(defpackage.na5 r21, boolean r22, boolean r23) {
        /*
            r0 = r21
            r1 = r23
            r2 = 1
            long r3 = r21.x()
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r8 = 4096(0x1000, double:2.0237E-320)
            if (r7 == 0) goto L_0x0017
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r8 = r3
        L_0x0017:
            int r8 = (int) r8
            wpa r9 = new wpa
            r10 = 64
            r9.<init>((int) r10)
            r10 = 0
            r11 = r10
            r12 = r11
        L_0x0022:
            if (r11 >= r8) goto L_0x0031
            r14 = 8
            r9.D(r14)
            byte[] r15 = r9.a
            boolean r15 = r0.q(r15, r10, r14, r2)
            if (r15 != 0) goto L_0x0034
        L_0x0031:
            r4 = r10
            goto L_0x0132
        L_0x0034:
            long r15 = r9.w()
            int r13 = r9.g()
            r17 = 1
            int r17 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r17 != 0) goto L_0x0055
            byte[] r15 = r9.a
            r0.l(r14, r15, r14)
            r15 = 16
            r9.F(r15)
            long r17 = r9.o()
            r5 = r17
            r17 = r3
            goto L_0x0070
        L_0x0055:
            r17 = 0
            int r17 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r17 != 0) goto L_0x006c
            long r17 = r21.x()
            int r19 = (r17 > r5 ? 1 : (r17 == r5 ? 0 : -1))
            if (r19 == 0) goto L_0x006c
            long r15 = r21.r()
            long r17 = r17 - r15
            long r5 = (long) r14
            long r15 = r17 + r5
        L_0x006c:
            r17 = r3
            r5 = r15
            r15 = r14
        L_0x0070:
            long r2 = (long) r15
            int r4 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x007b
            buc r0 = new buc
            r0.<init>()
            return r0
        L_0x007b:
            int r11 = r11 + r15
            r4 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r13 != r4) goto L_0x0095
            int r2 = (int) r5
            int r8 = r8 + r2
            if (r7 == 0) goto L_0x0092
            long r2 = (long) r8
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 <= 0) goto L_0x0092
            r2 = r17
            int r8 = (int) r2
        L_0x008d:
            r3 = r2
            r2 = 1
        L_0x008f:
            r5 = -1
            goto L_0x0022
        L_0x0092:
            r2 = r17
            goto L_0x008d
        L_0x0095:
            r4 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r13 == r4) goto L_0x009f
            r4 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r13 != r4) goto L_0x00a2
        L_0x009f:
            r5 = 1
            goto L_0x0130
        L_0x00a2:
            r4 = 1835295092(0x6d646174, float:4.4175247E27)
            if (r13 != r4) goto L_0x00a8
            r12 = 1
        L_0x00a8:
            long r14 = (long) r11
            long r14 = r14 + r5
            long r14 = r14 - r2
            r20 = r11
            long r10 = (long) r8
            int r10 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x00b5
            r2 = 0
            goto L_0x0133
        L_0x00b5:
            long r5 = r5 - r2
            int r2 = (int) r5
            int r11 = r20 + r2
            r3 = 1718909296(0x66747970, float:2.8862439E23)
            if (r13 != r3) goto L_0x0123
            r3 = 8
            if (r2 >= r3) goto L_0x00c8
            buc r0 = new buc
            r0.<init>()
            return r0
        L_0x00c8:
            r9.D(r2)
            byte[] r3 = r9.a
            r4 = 0
            r0.l(r4, r3, r2)
            int r2 = r9.g()
            boolean r2 = K(r2, r1)
            if (r2 == 0) goto L_0x00dc
            r12 = 1
        L_0x00dc:
            r2 = 4
            r9.H(r2)
            int r3 = r9.a()
            int r3 = r3 / r2
            if (r12 != 0) goto L_0x0102
            if (r3 <= 0) goto L_0x0102
            int[] r13 = new int[r3]
            r2 = r4
        L_0x00ec:
            if (r2 >= r3) goto L_0x0100
            int r5 = r9.g()
            r13[r2] = r5
            boolean r5 = K(r5, r1)
            if (r5 == 0) goto L_0x00fd
            r5 = 1
            r12 = 1
            goto L_0x0104
        L_0x00fd:
            r5 = 1
            int r2 = r2 + r5
            goto L_0x00ec
        L_0x0100:
            r5 = 1
            goto L_0x0104
        L_0x0102:
            r5 = 1
            r13 = 0
        L_0x0104:
            if (r12 != 0) goto L_0x012a
            qx7 r0 = new qx7
            r1 = 18
            r0.<init>(r1)
            if (r13 == 0) goto L_0x0120
            int r1 = defpackage.uw6.c
            int r1 = r13.length
            if (r1 != 0) goto L_0x0115
            goto L_0x0122
        L_0x0115:
            uw6 r1 = new uw6
            int r2 = r13.length
            int[] r2 = java.util.Arrays.copyOf(r13, r2)
            r1.<init>(r2)
            goto L_0x0122
        L_0x0120:
            int r1 = defpackage.uw6.c
        L_0x0122:
            return r0
        L_0x0123:
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L_0x012a
            r0.s(r2)
        L_0x012a:
            r10 = r4
            r2 = r5
            r3 = r17
            goto L_0x008f
        L_0x0130:
            r2 = r5
            goto L_0x0133
        L_0x0132:
            r2 = r4
        L_0x0133:
            if (r12 != 0) goto L_0x0138
            lq9 r0 = defpackage.lq9.X
            return r0
        L_0x0138:
            r0 = r22
            if (r0 == r2) goto L_0x0144
            if (r2 == 0) goto L_0x0141
            yxc r0 = defpackage.yxc.Y
            goto L_0x0143
        L_0x0141:
            yxc r0 = defpackage.yxc.Z
        L_0x0143:
            return r0
        L_0x0144:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr0.W(na5, boolean, boolean):iud");
    }

    public static void X(String str, k56 k56) {
        hka hka = new hka(k56);
        hka.setDaemon(true);
        if (str != null) {
            hka.setName(str);
        }
        hka.start();
    }

    /* JADX WARNING: type inference failed for: r9v8, types: [java.lang.Object, bt0] */
    public static final String Y(String str) {
        int i2 = 0;
        int i3 = -1;
        if (w9e.p0(str, ":", false)) {
            InetAddress r = (!eae.o0(str, "[", false) || !str.endsWith("]")) ? r(0, str.length(), str) : r(1, str.length() - 1, str);
            if (r == null) {
                return null;
            }
            byte[] address = r.getAddress();
            if (address.length == 16) {
                int i4 = 0;
                int i5 = 0;
                while (i4 < address.length) {
                    int i6 = i4;
                    while (i6 < 16 && address[i6] == 0 && address[i6 + 1] == 0) {
                        i6 += 2;
                    }
                    int i7 = i6 - i4;
                    if (i7 > i5 && i7 >= 4) {
                        i3 = i4;
                        i5 = i7;
                    }
                    i4 = i6 + 2;
                }
                ? obj = new Object();
                while (i2 < address.length) {
                    if (i2 == i3) {
                        obj.u0(58);
                        i2 += i5;
                        if (i2 == 16) {
                            obj.u0(58);
                        }
                    } else {
                        if (i2 > 0) {
                            obj.u0(58);
                        }
                        byte b2 = address[i2];
                        byte[] bArr = naf.a;
                        obj.w0((long) (((b2 & 255) << 8) | (address[i2 + 1] & 255)));
                        i2 += 2;
                    }
                }
                return obj.p0();
            } else if (address.length == 4) {
                return r.getHostAddress();
            } else {
                throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
            }
        } else {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i8 = 0; i8 < length; i8++) {
                    char charAt = lowerCase.charAt(i8);
                    if (tpa.m(charAt, 31) <= 0) {
                        return null;
                    }
                    if (tpa.m(charAt, 127) >= 0) {
                        return null;
                    }
                    if (w9e.z0(" #%/:?@[\\]", charAt, 0, false, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    public static final void Z(y5f y5f) {
        y5f.e(rff.class, new b6a(21));
        y5f.e(f4b.class, new b6a(22));
        y5f.e(jrd.class, new b6a(23));
        y5f.e(n65.class, new b6a(24));
        y5f.e(gw0.class, new b6a(25));
        y5f.e(ief.class, new b6a(26));
        y5f.e(wrc.class, new uza(1));
        y5f.e(n4b.class, new b6a(27));
    }

    public static void a(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == 10) {
                sb.append("%0A");
            } else if (charAt == 13) {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }

    public static final void a0(y5f y5f) {
        y5f.c(b64.class, new lxc(8));
        y5f.c(pi4.class, new lxc(9));
    }

    public static void b(int i2, int i3) {
        boolean z = true;
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i4 = iArr[0];
        if (i4 <= 0) {
            z = false;
        }
        fm9.j("Create a OpenGL context first or run the GL methods on an OpenGL thread.", z);
        if (i2 < 0 || i3 < 0) {
            throw new Exception("width or height is less than 0");
        } else if (i2 > i4 || i3 > i4) {
            throw new Exception(zr6.h(i4, "width or height is greater than GL_MAX_TEXTURE_SIZE "));
        }
    }

    public static final void b0(y5f y5f) {
        y5f.c(b64.class, new lxc(16));
    }

    public static znc c(Activity activity, w12 w12, Bundle bundle) {
        ft.e();
        wg7 a2 = zg7.a(activity, true);
        AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl = a2;
        if (a2 == null) {
            if (activity instanceof b) {
                AndroidXLifecycleHandlerImpl androidXLifecycleHandlerImpl2 = new AndroidXLifecycleHandlerImpl();
                n16 S = ((b) activity).S();
                S.getClass();
                he0 he0 = new he0(S);
                he0.f(0, androidXLifecycleHandlerImpl2, "LifecycleHandler", 1);
                he0.d(false);
                androidXLifecycleHandlerImpl = androidXLifecycleHandlerImpl2;
            } else {
                w2b w2b = new w2b();
                activity.getFragmentManager().beginTransaction().add(w2b, "LifecycleHandler").commit();
                androidXLifecycleHandlerImpl = w2b;
            }
        }
        androidXLifecycleHandlerImpl.H(activity);
        b8 e2 = androidXLifecycleHandlerImpl.e(w12, bundle);
        e2.I();
        e2.e = 1;
        return e2;
    }

    public static void d(int i2, int i3, int i4) {
        GLES20.glBindTexture(i2, i3);
        f();
        GLES20.glTexParameteri(i2, 10240, i4);
        f();
        GLES20.glTexParameteri(i2, 10241, i4);
        f();
        GLES20.glTexParameteri(i2, 10242, 33071);
        f();
        GLES20.glTexParameteri(i2, 10243, 33071);
        f();
    }

    public static void e(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder o = rh4.o(str, ", error code: 0x");
            o.append(Integer.toHexString(eglGetError));
            throw new Exception(o.toString());
        }
    }

    public static void f() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append(10);
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z = true;
        }
        if (z) {
            throw new Exception(sb.toString());
        }
    }

    public static void g(String str, boolean z) {
        if (!z) {
            throw new Exception(str);
        }
    }

    public static void h() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        f();
    }

    public static void i(t24 t24) {
        if (t24 != null) {
            try {
                t24.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int j(int i2, int i3) {
        return s63.i(i2, (Color.alpha(i2) * i3) / 255);
    }

    public static long k(float f2, float f3) {
        long floatToRawIntBits = (long) Float.floatToRawIntBits(f2);
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (floatToRawIntBits << 32);
    }

    public static float[] l() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static EGLContext m(EGLContext eGLContext, EGLDisplay eGLDisplay, int i2, int[] iArr) {
        boolean z = true;
        fm9.f(Arrays.equals(iArr, g) || Arrays.equals(iArr, h));
        if (!(i2 == 2 || i2 == 3)) {
            z = false;
        }
        fm9.f(z);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, B(eGLDisplay, iArr), eGLContext, new int[]{12440, i2, 12344}, 0);
        if (eglCreateContext != null) {
            f();
            return eglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new Exception(zr6.h(i2, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
    }

    public static EGLSurface o(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        EGLSurface eGLSurface;
        int[] iArr = g;
        if (L("EGL_KHR_surfaceless_context")) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, B(eGLDisplay, iArr), new int[]{12375, 1, 12374, 1, 12344}, 0);
            e("Error creating a new EGL Pbuffer surface");
        }
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        e("Error making context current");
        u(0, 1, 1);
        return eGLSurface;
    }

    public static long p() {
        int[] iArr = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, iArr, 0);
        f();
        if (((long) iArr[0]) < 3) {
            return 0;
        }
        long glFenceSync = GLES30.glFenceSync(37143, 0);
        f();
        GLES20.glFlush();
        f();
        return glFenceSync;
    }

    public static float[] q(List list) {
        float[] fArr = new float[(list.size() * 4)];
        for (int i2 = 0; i2 < list.size(); i2++) {
            System.arraycopy(list.get(i2), 0, fArr, i2 * 4, 4);
        }
        return fArr;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0089, code lost:
        if ((r13 - r9) != 0) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d2, code lost:
        if (r7 == r0) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00d4, code lost:
        if (r8 != -1) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00d6, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00d7, code lost:
        r1 = r7 - r8;
        java.lang.System.arraycopy(r3, r8, r3, 16 - r1, r1);
        java.util.Arrays.fill(r3, r8, (16 - r7) + r8, (byte) 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00ea, code lost:
        return java.net.InetAddress.getByAddress(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.net.InetAddress r(int r17, int r18, java.lang.String r19) {
        /*
            r0 = r18
            r1 = r19
            r2 = 16
            byte[] r3 = new byte[r2]
            r5 = -1
            r7 = 0
            r6 = r17
            r8 = r5
            r9 = r8
        L_0x000e:
            r10 = 0
            if (r6 >= r0) goto L_0x00d1
            if (r7 != r2) goto L_0x0014
            return r10
        L_0x0014:
            int r11 = r6 + 2
            r12 = 255(0xff, float:3.57E-43)
            if (r11 > r0) goto L_0x0031
            java.lang.String r13 = "::"
            boolean r13 = r1.startsWith(r13, r6)
            if (r13 == 0) goto L_0x0031
            if (r8 == r5) goto L_0x0025
            return r10
        L_0x0025:
            int r7 = r7 + 2
            if (r11 != r0) goto L_0x002d
            r0 = r2
            r8 = r7
            goto L_0x00d2
        L_0x002d:
            r8 = r7
            r9 = r11
            goto L_0x00a0
        L_0x0031:
            if (r7 == 0) goto L_0x003d
            java.lang.String r11 = ":"
            boolean r11 = r1.startsWith(r11, r6)
            if (r11 == 0) goto L_0x0040
            int r6 = r6 + 1
        L_0x003d:
            r9 = r6
            goto L_0x00a0
        L_0x0040:
            java.lang.String r11 = "."
            boolean r6 = r1.startsWith(r11, r6)
            if (r6 == 0) goto L_0x009f
            int r6 = r7 + -2
            r11 = r6
        L_0x004b:
            if (r9 >= r0) goto L_0x0096
            if (r11 != r2) goto L_0x0050
            goto L_0x009f
        L_0x0050:
            if (r11 == r6) goto L_0x005d
            char r13 = r1.charAt(r9)
            r14 = 46
            if (r13 == r14) goto L_0x005b
            goto L_0x009f
        L_0x005b:
            int r9 = r9 + 1
        L_0x005d:
            r13 = r9
            r14 = 0
        L_0x005f:
            if (r13 >= r0) goto L_0x0087
            char r15 = r1.charAt(r13)
            r4 = 48
            int r16 = defpackage.tpa.m(r15, r4)
            if (r16 < 0) goto L_0x0087
            r2 = 57
            int r2 = defpackage.tpa.m(r15, r2)
            if (r2 <= 0) goto L_0x0076
            goto L_0x0087
        L_0x0076:
            if (r14 != 0) goto L_0x007b
            if (r9 == r13) goto L_0x007b
            goto L_0x009f
        L_0x007b:
            int r14 = r14 * 10
            int r14 = r14 + r15
            int r14 = r14 - r4
            if (r14 <= r12) goto L_0x0082
            goto L_0x009f
        L_0x0082:
            int r13 = r13 + 1
            r2 = 16
            goto L_0x005f
        L_0x0087:
            int r2 = r13 - r9
            if (r2 != 0) goto L_0x008c
            goto L_0x009f
        L_0x008c:
            int r2 = r11 + 1
            byte r4 = (byte) r14
            r3[r11] = r4
            r11 = r2
            r9 = r13
            r2 = 16
            goto L_0x004b
        L_0x0096:
            int r0 = r7 + 2
            if (r11 != r0) goto L_0x009f
            int r7 = r7 + 2
            r0 = 16
            goto L_0x00d2
        L_0x009f:
            return r10
        L_0x00a0:
            r6 = r9
            r2 = 0
        L_0x00a2:
            if (r6 >= r0) goto L_0x00b5
            char r4 = r1.charAt(r6)
            int r4 = defpackage.naf.q(r4)
            if (r4 != r5) goto L_0x00af
            goto L_0x00b5
        L_0x00af:
            int r2 = r2 << 4
            int r2 = r2 + r4
            int r6 = r6 + 1
            goto L_0x00a2
        L_0x00b5:
            int r4 = r6 - r9
            if (r4 == 0) goto L_0x00d0
            r11 = 4
            if (r4 <= r11) goto L_0x00bd
            goto L_0x00d0
        L_0x00bd:
            int r4 = r7 + 1
            int r10 = r2 >>> 8
            r10 = r10 & r12
            byte r10 = (byte) r10
            r3[r7] = r10
            int r7 = r7 + 2
            r2 = r2 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            r3[r4] = r2
            r2 = 16
            goto L_0x000e
        L_0x00d0:
            return r10
        L_0x00d1:
            r0 = r2
        L_0x00d2:
            if (r7 == r0) goto L_0x00e6
            if (r8 != r5) goto L_0x00d7
            return r10
        L_0x00d7:
            int r1 = r7 - r8
            int r2 = 16 - r1
            java.lang.System.arraycopy(r3, r8, r3, r2, r1)
            int r2 = 16 - r7
            int r2 = r2 + r8
            r0 = 0
            byte r0 = (byte) r0
            java.util.Arrays.fill(r3, r8, r2, r0)
        L_0x00e6:
            java.net.InetAddress r0 = java.net.InetAddress.getByAddress(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mr0.r(int, int, java.lang.String):java.net.InetAddress");
    }

    public static void s(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        if (eGLDisplay != null) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            e("Error releasing context");
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                e("Error destroying context");
            }
            EGL14.eglReleaseThread();
            e("Error releasing thread");
            EGL14.eglTerminate(eGLDisplay);
            e("Error terminating display");
        }
    }

    public static void u(int i2, int i3, int i4) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i2) {
            GLES20.glBindFramebuffer(36160, i2);
        }
        f();
        GLES20.glViewport(0, 0, i3, i4);
        f();
    }

    public static int v(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0 || i2 >= 3 || i3 < 0 || i4 >= 19) {
            return -1;
        }
        int i5 = b[i2];
        if (i5 == 44100) {
            return ((i3 % 2) + f[i4]) * 2;
        }
        int i6 = e[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    public static final tg w(View view) {
        return ((y8a) ((ed3) ((vl) ((ug) view.getContext().getApplicationContext())).c.getValue())).c();
    }

    public static int x(int i2, int i3, Context context) {
        Integer num;
        TypedValue C = kq0.C(context, i2);
        if (C != null) {
            int i4 = C.resourceId;
            num = Integer.valueOf(i4 != 0 ? lt3.a(context, i4) : C.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i3;
    }

    public static int y(int i2, Context context, String str) {
        TypedValue G = kq0.G(i2, context, str);
        int i3 = G.resourceId;
        return i3 != 0 ? lt3.a(context, i3) : G.data;
    }

    public static int z(View view, int i2) {
        Context context = view.getContext();
        TypedValue G = kq0.G(i2, view.getContext(), view.getClass().getCanonicalName());
        int i3 = G.resourceId;
        return i3 != 0 ? lt3.a(context, i3) : G.data;
    }

    public abstract HashMap D(hf5 hf5, int i2);

    public abstract void P(hf5 hf5);

    public abstract hf5 n(fi0 fi0, eab eab);

    public abstract void t(hf5 hf5, h7b h7b);
}
