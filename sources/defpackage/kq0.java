package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import org.apache.http.HttpStatus;

/* renamed from: kq0  reason: default package */
public abstract class kq0 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, HttpStatus.SC_EXPECTATION_FAILED, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final g76 g = new Object();
    public static final Object h = new Object();
    public static Constructor i;
    public static Method j;
    public static Method k;

    public static String A(int i2, int i3, StringBuilder sb) {
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

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r3 = defpackage.j1e.k(new defpackage.rgc(r3, r4, r5, (kotlin.coroutines.Continuation) null), r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object B(defpackage.gh7 r3, defpackage.fg7 r4, defpackage.a66 r5, kotlin.coroutines.Continuation r6) {
        /*
            fg7 r0 = defpackage.fg7.b
            if (r4 == r0) goto L_0x001d
            fg7 r0 = r3.d
            fg7 r1 = defpackage.fg7.a
            e5f r2 = defpackage.e5f.a
            if (r0 != r1) goto L_0x000d
            return r2
        L_0x000d:
            rgc r0 = new rgc
            r1 = 0
            r0.<init>(r3, r4, r5, r1)
            java.lang.Object r3 = defpackage.j1e.k(r0, r6)
            tx3 r4 = defpackage.tx3.a
            if (r3 != r4) goto L_0x001c
            return r3
        L_0x001c:
            return r2
        L_0x001d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state."
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq0.B(gh7, fg7, a66, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static TypedValue C(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static String D(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] p = p(str2);
        if (p[0] != -1) {
            sb.append(str2);
            A(p[1], p[2], sb);
            return sb.toString();
        }
        int[] p2 = p(str);
        if (p[3] == 0) {
            sb.append(str, 0, p2[3]);
            sb.append(str2);
            return sb.toString();
        } else if (p[2] == 0) {
            sb.append(str, 0, p2[2]);
            sb.append(str2);
            return sb.toString();
        } else {
            int i2 = p[1];
            if (i2 != 0) {
                int i3 = p2[0] + 1;
                sb.append(str, 0, i3);
                sb.append(str2);
                return A(p[1] + i3, i3 + p[2], sb);
            } else if (str2.charAt(i2) == '/') {
                sb.append(str, 0, p2[1]);
                sb.append(str2);
                int i4 = p2[1];
                return A(i4, p[2] + i4, sb);
            } else {
                int i5 = p2[0] + 2;
                int i6 = p2[1];
                if (i5 >= i6 || i6 != p2[2]) {
                    int lastIndexOf = str.lastIndexOf(47, p2[2] - 1);
                    int i7 = lastIndexOf == -1 ? p2[1] : lastIndexOf + 1;
                    sb.append(str, 0, i7);
                    sb.append(str2);
                    return A(p2[1], i7 + p[2], sb);
                }
                sb.append(str, 0, i6);
                sb.append('/');
                sb.append(str2);
                int i8 = p2[1];
                return A(i8, p[2] + i8 + 1, sb);
            }
        }
    }

    public static boolean E(int i2, Context context, boolean z) {
        TypedValue C = C(context, i2);
        return (C == null || C.type != 18) ? z : C.data != 0;
    }

    public static Uri F(String str, String str2) {
        return Uri.parse(D(str, str2));
    }

    public static TypedValue G(int i2, Context context, String str) {
        TypedValue C = C(context, i2);
        if (C != null) {
            return C;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i2)}));
    }

    public static void H(Runnable runnable) {
        if (t()) {
            runnable.run();
        } else {
            c54.p("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static void I(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static nl7 J(ArrayList arrayList) {
        return new nl7(new ArrayList(arrayList), false, ju0.k());
    }

    public static k12 K(bm7 bm7, wu wuVar, Executor executor) {
        k12 k12 = new k12(wuVar, bm7);
        bm7.d(k12, executor);
        return k12;
    }

    public static final void L(y5f y5f) {
        y5f.c(b64.class, new lxc(6));
        y5f.c(pi4.class, new lxc(7));
    }

    public static final void M(y5f y5f) {
        y5f.c(b64.class, new lxc(15));
    }

    public static void a(bm7 bm7, a76 a76, Executor executor) {
        a76.getClass();
        bm7.d(new i76((Object) bm7, 0, (Object) a76), executor);
    }

    public static nl7 b(Collection collection) {
        return new nl7(new ArrayList(collection), true, ju0.k());
    }

    public static w1b d(Context context, float f2, float f3, int i2, int i3, j1b j1b) {
        ivc u = tpa.u(context);
        float f4 = (float) 16;
        return new w1b((-f2) + ((float) tu0.G(fk4.d().getDisplayMetrics().density * f4)), ((((float) u.b) - f2) - ((float) i2)) - ((float) tu0.G(fk4.d().getDisplayMetrics().density * f4)), (-f3) + ((float) tu0.G(fk4.d().getDisplayMetrics().density * f4)) + ((float) u.c) + ((float) j1b.a), (((((float) (u.a - u.d)) - f3) - ((float) i3)) - ((float) tu0.G(f4 * fk4.d().getDisplayMetrics().density))) - ((float) j1b.b));
    }

    public static void e() {
        c54.p("Not in application's main thread", t());
    }

    public static void f(r24 r24) {
        if (r24 != null) {
            try {
                r24.close();
            } catch (IOException unused) {
            }
        }
    }

    public static qnf h(Class cls) {
        try {
            return (qnf) cls.getDeclaredConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        }
    }

    public static String i(dx1 dx1, Integer num, List list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) dx1.a("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        } else if (num.intValue() == 0 && ((Integer) dx1.a("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        } else {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00da, code lost:
        if (r7 == 1) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00dc, code lost:
        if (r7 == 2) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00de, code lost:
        if (r7 == 3) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e0, code lost:
        if (r7 == 4) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e3, code lost:
        r15 = r9 + 1;
        r3[r9] = (byte) (r8 >> 10);
        r9 = r9 + 2;
        r3[r15] = (byte) (r8 >> 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f2, code lost:
        r3[r9] = (byte) (r8 >> 4);
        r9 = r9 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fa, code lost:
        if (r9 != r1) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fd, code lost:
        r15 = new byte[r9];
        java.lang.System.arraycopy(r3, 0, r15, 0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        return r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        return r3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00da A[EDGE_INSN: B:55:0x00da->B:40:0x00da ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] j(java.lang.String r15) {
        /*
            byte[] r15 = r15.getBytes()
            int r0 = r15.length
            int r1 = r0 * 3
            r2 = 4
            int r1 = r1 / r2
            byte[] r3 = new byte[r1]
            int[] r4 = defpackage.oh0.i
            r5 = 0
            r6 = r5
            r7 = r6
            r8 = r7
            r9 = r8
        L_0x0012:
            r10 = 3
            r11 = 2
            r12 = 1
            if (r6 >= r0) goto L_0x00da
            if (r7 != 0) goto L_0x005f
        L_0x0019:
            int r13 = r6 + 4
            if (r13 > r0) goto L_0x005b
            byte r8 = r15[r6]
            r8 = r8 & 255(0xff, float:3.57E-43)
            r8 = r4[r8]
            int r8 = r8 << 18
            int r14 = r6 + 1
            byte r14 = r15[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r14 = r4[r14]
            int r14 = r14 << 12
            r8 = r8 | r14
            int r14 = r6 + 2
            byte r14 = r15[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r14 = r4[r14]
            int r14 = r14 << 6
            r8 = r8 | r14
            int r14 = r6 + 3
            byte r14 = r15[r14]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r14 = r4[r14]
            r8 = r8 | r14
            if (r8 < 0) goto L_0x005b
            int r6 = r9 + 2
            byte r14 = (byte) r8
            r3[r6] = r14
            int r6 = r9 + 1
            int r14 = r8 >> 8
            byte r14 = (byte) r14
            r3[r6] = r14
            int r6 = r8 >> 16
            byte r6 = (byte) r6
            r3[r9] = r6
            int r9 = r9 + 3
            r6 = r13
            goto L_0x0019
        L_0x005b:
            if (r6 < r0) goto L_0x005f
            goto L_0x00da
        L_0x005f:
            int r13 = r6 + 1
            byte r6 = r15[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r6 = r4[r6]
            r14 = -1
            if (r7 == 0) goto L_0x00d2
            if (r7 == r12) goto L_0x00cc
            r12 = -2
            if (r7 == r11) goto L_0x00b5
            r11 = 5
            if (r7 == r10) goto L_0x0085
            if (r7 == r2) goto L_0x007c
            if (r7 == r11) goto L_0x0078
            goto L_0x00d7
        L_0x0078:
            if (r6 != r14) goto L_0x0104
            goto L_0x00d7
        L_0x007c:
            if (r6 != r12) goto L_0x0082
            int r7 = r7 + 1
            goto L_0x00d7
        L_0x0082:
            if (r6 != r14) goto L_0x0104
            goto L_0x00d7
        L_0x0085:
            if (r6 < 0) goto L_0x00a0
            int r7 = r8 << 6
            r6 = r6 | r7
            int r7 = r9 + 2
            byte r8 = (byte) r6
            r3[r7] = r8
            int r7 = r9 + 1
            int r8 = r6 >> 8
            byte r8 = (byte) r8
            r3[r7] = r8
            int r7 = r6 >> 16
            byte r7 = (byte) r7
            r3[r9] = r7
            int r9 = r9 + 3
            r7 = r5
        L_0x009e:
            r8 = r6
            goto L_0x00d7
        L_0x00a0:
            if (r6 != r12) goto L_0x00b2
            int r6 = r9 + 1
            int r7 = r8 >> 2
            byte r7 = (byte) r7
            r3[r6] = r7
            int r6 = r8 >> 10
            byte r6 = (byte) r6
            r3[r9] = r6
            int r9 = r9 + 2
            r7 = r11
            goto L_0x00d7
        L_0x00b2:
            if (r6 != r14) goto L_0x0104
            goto L_0x00d7
        L_0x00b5:
            if (r6 < 0) goto L_0x00bd
        L_0x00b7:
            int r8 = r8 << 6
            r6 = r6 | r8
        L_0x00ba:
            int r7 = r7 + 1
            goto L_0x009e
        L_0x00bd:
            if (r6 != r12) goto L_0x00c9
            int r6 = r9 + 1
            int r7 = r8 >> 4
            byte r7 = (byte) r7
            r3[r9] = r7
            r7 = r2
            r9 = r6
            goto L_0x00d7
        L_0x00c9:
            if (r6 != r14) goto L_0x0104
            goto L_0x00d7
        L_0x00cc:
            if (r6 < 0) goto L_0x00cf
            goto L_0x00b7
        L_0x00cf:
            if (r6 != r14) goto L_0x0104
            goto L_0x00d7
        L_0x00d2:
            if (r6 < 0) goto L_0x00d5
            goto L_0x00ba
        L_0x00d5:
            if (r6 != r14) goto L_0x0104
        L_0x00d7:
            r6 = r13
            goto L_0x0012
        L_0x00da:
            if (r7 == r12) goto L_0x0104
            if (r7 == r11) goto L_0x00f2
            if (r7 == r10) goto L_0x00e3
            if (r7 == r2) goto L_0x0104
            goto L_0x00fa
        L_0x00e3:
            int r15 = r9 + 1
            int r0 = r8 >> 10
            byte r0 = (byte) r0
            r3[r9] = r0
            int r9 = r9 + 2
            int r0 = r8 >> 2
            byte r0 = (byte) r0
            r3[r15] = r0
            goto L_0x00fa
        L_0x00f2:
            int r15 = r9 + 1
            int r0 = r8 >> 4
            byte r0 = (byte) r0
            r3[r9] = r0
            r9 = r15
        L_0x00fa:
            if (r9 != r1) goto L_0x00fd
            goto L_0x0103
        L_0x00fd:
            byte[] r15 = new byte[r9]
            java.lang.System.arraycopy(r3, r5, r15, r5, r9)
            r3 = r15
        L_0x0103:
            return r3
        L_0x0104:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bad base-64"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq0.j(java.lang.String):byte[]");
    }

    public static byte[] k(byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = oh0.j;
        int i2 = (length / 3) * 4;
        if (length % 3 > 0) {
            i2 += 4;
        }
        if (length > 0) {
            i2 += ((length - 1) / 57) + 1;
        }
        byte[] bArr3 = new byte[i2];
        int i3 = 0;
        int i4 = 19;
        int i5 = 0;
        while (true) {
            int i6 = i3 + 3;
            if (i6 > length) {
                break;
            }
            byte b2 = (bArr[i3 + 2] & 255) | ((bArr[i3] & 255) << 16) | ((bArr[i3 + 1] & 255) << 8);
            bArr3[i5] = bArr2[(b2 >> 18) & 63];
            bArr3[i5 + 1] = bArr2[(b2 >> 12) & 63];
            bArr3[i5 + 2] = bArr2[(b2 >> 6) & 63];
            bArr3[i5 + 3] = bArr2[b2 & 63];
            int i7 = i5 + 4;
            i4--;
            if (i4 == 0) {
                i5 += 5;
                bArr3[i7] = 10;
                i4 = 19;
            } else {
                i5 = i7;
            }
            i3 = i6;
        }
        if (i3 == length - 1) {
            int i8 = (bArr[i3] & 255) << 4;
            bArr3[i5] = bArr2[(i8 >> 6) & 63];
            bArr3[i5 + 1] = bArr2[i8 & 63];
            bArr3[i5 + 2] = 61;
            bArr3[i5 + 3] = 61;
            bArr3[i5 + 4] = 10;
        } else if (i3 == length - 2) {
            int i9 = ((bArr[i3 + 1] & 255) << 2) | ((bArr[i3] & 255) << 10);
            bArr3[i5] = bArr2[(i9 >> 12) & 63];
            bArr3[i5 + 1] = bArr2[(i9 >> 6) & 63];
            bArr3[i5 + 2] = bArr2[i9 & 63];
            bArr3[i5 + 3] = 61;
            bArr3[i5 + 4] = 10;
        } else if (i5 > 0 && i4 != 19) {
            bArr3[i5] = 10;
        }
        return bArr3;
    }

    public static int m(int i2, int i3) {
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

    public static Object n(Future future) {
        boolean isDone = future.isDone();
        c54.p("Future was expected to be done, " + future, isDone);
        return o(future);
    }

    public static Object o(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static int[] p(String str) {
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

    public static dw6 r(Object obj) {
        return obj == null ? dw6.c : new dw6(0, obj);
    }

    public static boolean s(ync ync) {
        Boolean bool;
        try {
            bool = (Boolean) ync.b(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException unused) {
            if (zi4.a.e(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", new Object[]{Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)});
            } else {
                String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", new Object[]{Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT)});
            }
            bool = Boolean.FALSE;
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static boolean t() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static final void u(yx4 yx4, List list) {
        yx4.b("history↓");
        if (list.isEmpty()) {
            yx4.b("empty");
            return;
        }
        StringBuilder sb = new StringBuilder();
        vk6 h2 = ft.h(list);
        if (h2 != null) {
            sb.append(h2.getId());
            sb.append(" ");
        }
        sb.append("║║");
        int size = list.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            vk6 vk6 = (vk6) list.get(i2);
            if (vk6 instanceof uk6) {
                sb.append(" GAP ║║");
            } else {
                vk6 vk62 = null;
                vk6 vk63 = i2 > 0 ? (vk6) list.get(i2 - 1) : null;
                if ((vk63 instanceof uk6) || vk63 == null) {
                    sb.append(" ");
                    sb.append(yx4.a(vk6.k()));
                    sb.append(" - ");
                    i3 = 0;
                }
                i3++;
                if (i2 < list.size() - 1) {
                    vk62 = (vk6) list.get(i2 + 1);
                }
                if ((vk62 instanceof uk6) || vk62 == null) {
                    sb.append(yx4.a(vk6.k()));
                    sb.append(" (" + i3 + ")");
                    sb.append(" ║║");
                }
            }
            i2++;
        }
        vk6 o = ft.o(list);
        if (o != null) {
            sb.append(" ");
            sb.append(o.getId());
        }
        yx4.b(sb.toString());
    }

    public static final void v(yx4 yx4, sk6 sk6) {
        yx4.b("bounds↓");
        StringBuilder sb = new StringBuilder("firstId: ");
        sb.append(sk6.g());
        sb.append(" ║║ lastId: ");
        sb.append(sk6.h());
        sb.append(" ║║ chunks: ");
        if (sk6.i().isEmpty()) {
            sb.append("empty");
        } else {
            sb.append("║║");
            for (i13 i13 : sk6.i()) {
                sb.append(" ");
                sb.append(yx4.a(i13.a()));
                sb.append(" - ");
                sb.append(yx4.a(i13.b()));
                sb.append(" ║║");
            }
        }
        yx4.b(sb.toString());
    }

    public static bm7 w(bm7 bm7) {
        bm7.getClass();
        return bm7.isDone() ? bm7 : f8.g(new f76(bm7, 1));
    }

    public static final void x(ViewGroup viewGroup, View view, View view2, View view3, float f2) {
        if (view2 != null) {
            view2.setTranslationY(((float) viewGroup.getContext().getResources().getDisplayMetrics().heightPixels) * f2);
        }
        if (view3 != null) {
            view3.setAlpha(1.0f - Math.abs(f2));
        }
        float abs = Math.abs(f2) * ((float) 3);
        if (abs > 1.0f) {
            abs = 1.0f;
        }
        if (view != null) {
            view.setPivotX(((float) view.getWidth()) / 2.0f);
        }
        if (view != null) {
            view.setPivotY(((float) view.getHeight()) / 2.0f);
        }
        if (view != null) {
            view.setScaleX(((((float) 1) - abs) * 0.1f) + 1.0f);
        }
        if (view != null) {
            view.setScaleY(((((float) 1) - abs) * 0.1f) + 1.0f);
        }
    }

    public static void y(bm7 bm7, lq1 lq1) {
        z(true, bm7, lq1, ju0.k());
    }

    public static void z(boolean z, bm7 bm7, lq1 lq1, ok4 ok4) {
        bm7.getClass();
        lq1.getClass();
        ok4.getClass();
        a(bm7, new va8(lq1), ok4);
        if (z) {
            lq1.a(new re(26, bm7), ju0.k());
        }
    }

    public sh0 c() {
        wmd.i(2, "expectedValuesPerKey");
        return new sh0(this);
    }

    public abstract Map g();

    public abstract pma l();

    public abstract xm7 q();
}
