package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.serialization.MissingFieldException;
import org.apache.http.HttpStatus;
import org.xmlpull.v1.XmlPullParser;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* renamed from: ju0  reason: default package */
public abstract class ju0 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, MultiFileUploader.MSG_TRY_UPLOAD_NEXT, 1000, 960, 800, 800, 480, HttpStatus.SC_BAD_REQUEST, HttpStatus.SC_BAD_REQUEST, 2048};
    public static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final int[] c = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean A(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static final boolean B(String str) {
        return eae.o0(str, "mailto:", false);
    }

    public static final boolean C(String str) {
        return eae.o0(str, "tel:", false);
    }

    public static zh6 D() {
        if (dy7.a != null) {
            return dy7.a;
        }
        synchronized (dy7.class) {
            try {
                if (dy7.a == null) {
                    dy7.a = new zh6(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return dy7.a;
    }

    public static void E(Intent intent, ArrayList arrayList) {
        ClipData clipData = new ClipData((CharSequence) null, new String[]{intent.getType()}, new ClipData.Item(intent.getCharSequenceExtra("android.intent.extra.TEXT"), intent.getStringExtra("android.intent.extra.HTML_TEXT"), (Intent) null, (Uri) arrayList.get(0)));
        int size = arrayList.size();
        for (int i = 1; i < size; i++) {
            clipData.addItem(new ClipData.Item((Uri) arrayList.get(i)));
        }
        intent.setClipData(clipData);
        intent.addFlags(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        if (r9 != 11) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        if (r9 != 11) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r9 != 8) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.w3 F(defpackage.s02 r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L_0x0018
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L_0x0032
        L_0x0029:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L_0x0029
        L_0x0032:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L_0x0047
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L_0x0047
            r9.t(r1)
        L_0x0047:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L_0x0055
            r5 = r7
            goto L_0x0056
        L_0x0055:
            r5 = r6
        L_0x0056:
            int r9 = r9.i(r3)
            int[] r8 = a
            if (r5 != r6) goto L_0x0065
            r6 = 13
            if (r9 != r6) goto L_0x0065
            r9 = r8[r9]
            goto L_0x0093
        L_0x0065:
            if (r5 != r7) goto L_0x0092
            r6 = 14
            if (r9 >= r6) goto L_0x0092
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L_0x008b
            r7 = 11
            if (r2 == r1) goto L_0x0086
            if (r2 == r4) goto L_0x008b
            if (r2 == r3) goto L_0x007d
            goto L_0x0090
        L_0x007d:
            if (r9 == r4) goto L_0x0083
            if (r9 == r8) goto L_0x0083
            if (r9 != r7) goto L_0x0090
        L_0x0083:
            int r9 = r6 + 1
            goto L_0x0093
        L_0x0086:
            if (r9 == r8) goto L_0x0083
            if (r9 != r7) goto L_0x0090
            goto L_0x0083
        L_0x008b:
            if (r9 == r4) goto L_0x0083
            if (r9 != r8) goto L_0x0090
            goto L_0x0083
        L_0x0090:
            r9 = r6
            goto L_0x0093
        L_0x0092:
            r9 = 0
        L_0x0093:
            w3 r1 = new w3
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju0.F(s02):w3");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e5, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00fc, code lost:
        r0 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean H(defpackage.ma5 r21, boolean r22, boolean r23) {
        /*
            r0 = r21
            long r1 = r21.x()
            r3 = -1
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 4096(0x1000, double:2.0237E-320)
            if (r5 == 0) goto L_0x0014
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r6 = r1
        L_0x0014:
            int r6 = (int) r6
            yaf r7 = new yaf
            r8 = 64
            r7.<init>((int) r8)
            r8 = 0
            r9 = r8
            r10 = r9
        L_0x001f:
            r11 = 1
            if (r9 >= r6) goto L_0x002f
            r12 = 8
            r7.E(r12)
            byte[] r13 = r7.a
            boolean r13 = r0.q(r13, r8, r12, r11)
            if (r13 != 0) goto L_0x0033
        L_0x002f:
            r5 = r8
            r8 = r11
            goto L_0x00fe
        L_0x0033:
            long r13 = r7.w()
            int r15 = r7.h()
            r16 = 1
            int r16 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r16 != 0) goto L_0x0053
            byte[] r13 = r7.a
            r0.l(r12, r13, r12)
            r13 = 16
            r7.G(r13)
            long r16 = r7.p()
            r3 = r13
            r13 = r16
            goto L_0x006b
        L_0x0053:
            r16 = 0
            int r16 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r16 != 0) goto L_0x006a
            long r16 = r21.x()
            int r18 = (r16 > r3 ? 1 : (r16 == r3 ? 0 : -1))
            if (r18 == 0) goto L_0x006a
            long r13 = r21.r()
            long r16 = r16 - r13
            long r13 = (long) r12
            long r13 = r16 + r13
        L_0x006a:
            r3 = r12
        L_0x006b:
            long r11 = (long) r3
            int r19 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r19 >= 0) goto L_0x0071
            return r8
        L_0x0071:
            int r9 = r9 + r3
            r3 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r15 != r3) goto L_0x0084
            int r3 = (int) r13
            int r6 = r6 + r3
            if (r5 == 0) goto L_0x0081
            long r3 = (long) r6
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x0081
            int r6 = (int) r1
        L_0x0081:
            r3 = -1
            goto L_0x001f
        L_0x0084:
            r3 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r15 == r3) goto L_0x008e
            r3 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r15 != r3) goto L_0x0092
        L_0x008e:
            r5 = r8
            r8 = 1
            goto L_0x00fc
        L_0x0092:
            r3 = r5
            long r4 = (long) r9
            long r4 = r4 + r13
            long r4 = r4 - r11
            r20 = r9
            long r8 = (long) r6
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 < 0) goto L_0x00a1
            r5 = 0
            r8 = 1
            goto L_0x00fe
        L_0x00a1:
            long r13 = r13 - r11
            int r4 = (int) r13
            int r9 = r20 + r4
            r5 = 1718909296(0x66747970, float:2.8862439E23)
            if (r15 != r5) goto L_0x00f3
            r5 = 8
            if (r4 >= r5) goto L_0x00b0
            r5 = 0
            return r5
        L_0x00b0:
            r5 = 0
            r7.E(r4)
            byte[] r8 = r7.a
            r0.l(r5, r8, r4)
            int r4 = r4 / 4
            r5 = 0
        L_0x00bc:
            if (r5 >= r4) goto L_0x00ed
            r8 = 1
            if (r5 != r8) goto L_0x00c6
            r11 = 4
            r7.I(r11)
            goto L_0x00ea
        L_0x00c6:
            int r11 = r7.h()
            int r12 = r11 >>> 8
            r13 = 3368816(0x336770, float:4.720717E-39)
            if (r12 != r13) goto L_0x00d2
            goto L_0x00e5
        L_0x00d2:
            r12 = 1751476579(0x68656963, float:4.333464E24)
            if (r11 != r12) goto L_0x00da
            if (r23 == 0) goto L_0x00da
            goto L_0x00e5
        L_0x00da:
            int[] r12 = c
            r13 = 0
        L_0x00dd:
            r14 = 29
            if (r13 >= r14) goto L_0x00ea
            r14 = r12[r13]
            if (r14 != r11) goto L_0x00e7
        L_0x00e5:
            r10 = r8
            goto L_0x00ed
        L_0x00e7:
            int r13 = r13 + 1
            goto L_0x00dd
        L_0x00ea:
            int r5 = r5 + 1
            goto L_0x00bc
        L_0x00ed:
            if (r10 != 0) goto L_0x00f1
            r5 = 0
            return r5
        L_0x00f1:
            r5 = 0
            goto L_0x00f9
        L_0x00f3:
            r5 = 0
            if (r4 == 0) goto L_0x00f9
            r0.s(r4)
        L_0x00f9:
            r8 = r5
            r5 = r3
            goto L_0x0081
        L_0x00fc:
            r0 = r8
            goto L_0x00ff
        L_0x00fe:
            r0 = r5
        L_0x00ff:
            if (r10 == 0) goto L_0x0106
            r1 = r22
            if (r1 != r0) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            r8 = r5
        L_0x0107:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju0.H(ma5, boolean, boolean):boolean");
    }

    public static final void I(int i, int i2, r6d r6d) {
        String str;
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(r6d.g(i4));
            }
            i3 >>>= 1;
        }
        String a2 = r6d.a();
        if (arrayList.size() == 1) {
            str = "Field '" + ((String) arrayList.get(0)) + "' is required for type with serial name '" + a2 + "', but it was missing";
        } else {
            str = "Fields " + arrayList + " are required for type with serial name '" + a2 + "', but they were missing";
        }
        throw new MissingFieldException(arrayList, str, (MissingFieldException) null);
    }

    public static String J(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        int i2 = maf.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static final void K(y5f y5f) {
        y5f.c(b64.class, new lxc(17));
    }

    public static final int a(ju0 ju0, XmlPullParser xmlPullParser, String str) {
        ju0.getClass();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean b(l7b l7b, String str) {
        Long l = (Long) ((Map) ((AtomicReference) ((khe) l7b.b).getValue()).get()).get(str);
        return l != null && System.currentTimeMillis() < l.longValue();
    }

    public static final boolean c(ju0 ju0, int i) {
        ju0.getClass();
        return i != -1;
    }

    public static final void d(ky7 ky7, String str, Long l) {
        Long l2;
        if (l.longValue() <= 0) {
            l2 = null;
        } else {
            l2 = Long.valueOf(l.longValue() + System.currentTimeMillis());
        }
        ky7.put(str, l2);
    }

    public static final void e(Appendable appendable, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            appendable.append("\t");
        }
    }

    public static final void f(Throwable th, Appendable appendable) {
        g(th, appendable, 0, "", th.getStackTrace(), 0, new IdentityHashMap());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b A[LOOP:1: B:16:0x0059->B:17:0x005b, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a8 A[LOOP:2: B:24:0x00a6->B:25:0x00a8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(java.lang.Throwable r8, java.lang.Appendable r9, int r10, java.lang.String r11, java.lang.StackTraceElement[] r12, int r13, java.util.IdentityHashMap r14) {
        /*
            boolean r0 = r14.containsKey(r8)
            r1 = 10
            r2 = 1
            if (r0 == 0) goto L_0x0024
            e(r9, r2)
            java.lang.String r10 = "[CIRCULAR REFERENCE: "
            java.lang.Appendable r9 = r9.append(r10)
            java.lang.String r8 = r8.toString()
            java.lang.Appendable r8 = r9.append(r8)
            java.lang.String r9 = "]"
            java.lang.Appendable r8 = r8.append(r9)
            r8.append(r1)
            return
        L_0x0024:
            e5f r0 = defpackage.e5f.a
            r14.put(r8, r0)
            e(r9, r10)
            java.lang.Appendable r11 = r9.append(r11)
            java.lang.String r0 = r8.toString()
            java.lang.Appendable r11 = r11.append(r0)
            r11.append(r1)
            boolean r11 = r8 instanceof java.lang.StackOverflowError
            r0 = 0
            if (r11 == 0) goto L_0x0051
            r11 = r12[r0]
            int r3 = r12.length
        L_0x0043:
            if (r2 >= r3) goto L_0x0051
            r4 = r12[r2]
            boolean r4 = defpackage.tpa.f(r11, r4)
            if (r4 == 0) goto L_0x004e
            goto L_0x0052
        L_0x004e:
            int r2 = r2 + 1
            goto L_0x0043
        L_0x0051:
            r2 = r0
        L_0x0052:
            if (r2 <= 0) goto L_0x0056
            r11 = r2
            goto L_0x0058
        L_0x0056:
            int r11 = r12.length
            int r11 = r11 - r13
        L_0x0058:
            r3 = r0
        L_0x0059:
            if (r3 >= r11) goto L_0x0066
            r4 = r12[r3]
            int r5 = r10 + 1
            r6 = 4
            h(r4, r9, r5, r6)
            int r3 = r3 + 1
            goto L_0x0059
        L_0x0066:
            java.lang.String r11 = "... "
            if (r2 <= 0) goto L_0x0085
            int r13 = r10 + 1
            e(r9, r13)
            java.lang.Appendable r11 = r9.append(r11)
            java.lang.String r13 = java.lang.String.valueOf(r2)
            java.lang.Appendable r11 = r11.append(r13)
            java.lang.String r13 = " calls repeat"
            java.lang.Appendable r11 = r11.append(r13)
            r11.append(r1)
            goto L_0x00a1
        L_0x0085:
            if (r13 == 0) goto L_0x00a1
            int r2 = r10 + 1
            e(r9, r2)
            java.lang.Appendable r11 = r9.append(r11)
            java.lang.String r13 = java.lang.String.valueOf(r13)
            java.lang.Appendable r11 = r11.append(r13)
            java.lang.String r13 = " more"
            java.lang.Appendable r11 = r11.append(r13)
            r11.append(r1)
        L_0x00a1:
            java.lang.Throwable[] r11 = r8.getSuppressed()
            int r13 = r11.length
        L_0x00a6:
            if (r0 >= r13) goto L_0x00be
            r1 = r11[r0]
            java.lang.StackTraceElement[] r5 = r1.getStackTrace()
            int r3 = r10 + 1
            int r6 = m(r12, r5)
            java.lang.String r4 = "Suppressed: "
            r2 = r9
            r7 = r14
            g(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r0 + 1
            goto L_0x00a6
        L_0x00be:
            java.lang.Throwable r1 = r8.getCause()
            if (r1 == 0) goto L_0x00d4
            java.lang.StackTraceElement[] r5 = r1.getStackTrace()
            int r6 = m(r12, r5)
            java.lang.String r4 = "Caused by: "
            r2 = r9
            r3 = r10
            r7 = r14
            g(r1, r2, r3, r4, r5, r6, r7)
        L_0x00d4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju0.g(java.lang.Throwable, java.lang.Appendable, int, java.lang.String, java.lang.StackTraceElement[], int, java.util.IdentityHashMap):void");
    }

    public static void h(StackTraceElement stackTraceElement, Appendable appendable, int i, int i2) {
        String str;
        if ((i2 & 2) != 0) {
            i = 1;
        }
        e(appendable, i);
        appendable.append("at ");
        if (stackTraceElement.isNativeMethod()) {
            str = "Native Method";
        } else {
            str = stackTraceElement.getFileName();
            if (str == null) {
                str = "Unknown Source";
            }
        }
        appendable.append(stackTraceElement.getClassName()).append(".").append(stackTraceElement.getMethodName()).append("(").append(str);
        if (stackTraceElement.getLineNumber() >= 0) {
            appendable.append(":").append(String.valueOf(stackTraceElement.getLineNumber()));
        }
        appendable.append(")").append(10);
    }

    public static final void i(Animator animator) {
        animator.removeAllListeners();
        animator.cancel();
    }

    public static String j(String str) {
        StringBuilder sb = new StringBuilder(rh4.e(rh4.e(5, str), str));
        sb.append(".");
        sb.append(str);
        sb.append(",.");
        sb.append(str);
        sb.append(" *");
        return sb.toString();
    }

    public static ok4 k() {
        if (ok4.b != null) {
            return ok4.b;
        }
        synchronized (ok4.class) {
            try {
                if (ok4.b == null) {
                    ok4.b = new ok4(0);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return ok4.b;
    }

    public static void l(Activity activity, eg7 eg7) {
        if (activity instanceof eh7) {
            gh7 Q = ((eh7) activity).Q();
            if (Q instanceof gh7) {
                Q.d(eg7);
            }
        }
    }

    public static final int m(StackTraceElement[] stackTraceElementArr, StackTraceElement[] stackTraceElementArr2) {
        int length = stackTraceElementArr.length - 1;
        int length2 = stackTraceElementArr2.length - 1;
        while (length >= 0 && length2 >= 0 && tpa.f(stackTraceElementArr[length], stackTraceElementArr2[length2])) {
            length--;
            length2--;
        }
        return (stackTraceElementArr.length - 1) - length;
    }

    public static final l7g n(h8g h8g) {
        return new l7g(h8g.a, h8g.t);
    }

    public static void o(int i, yaf yaf) {
        yaf.E(7);
        byte[] bArr = yaf.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r2 = defpackage.z7.n(r2, (r0 = r0.getResourceId(r4, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList p(android.content.Context r2, defpackage.k8g r3, int r4) {
        /*
            java.lang.Object r0 = r3.b
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r4)
            if (r1 == 0) goto L_0x0018
            r1 = 0
            int r0 = r0.getResourceId(r4, r1)
            if (r0 == 0) goto L_0x0018
            android.content.res.ColorStateList r2 = defpackage.z7.n(r2, r0)
            if (r2 == 0) goto L_0x0018
            return r2
        L_0x0018:
            android.content.res.ColorStateList r2 = r3.l(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju0.p(android.content.Context, k8g, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = defpackage.z7.n(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList q(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = defpackage.z7.n(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju0.q(android.content.Context, android.content.res.TypedArray, int):android.content.res.ColorStateList");
    }

    public static int r(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = defpackage.s36.n(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable s(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = defpackage.s36.n(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju0.s(android.content.Context, android.content.res.TypedArray, int):android.graphics.drawable.Drawable");
    }

    public static String t(String str, kk0 kk0, jk0 jk0) {
        int ordinal = kk0.ordinal();
        jk0 jk02 = jk0.a;
        String str2 = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : jk0 == jk02 ? "sqr_720" : "w_1440" : jk0 == jk02 ? "sqr_480" : "w_1080" : jk0 == jk02 ? "sqr_192" : "w_480" : jk0 == jk02 ? "sqr_96" : "w_240" : jk0 == jk02 ? "sqr_64" : "w_180";
        if (oag.t(str)) {
            return null;
        }
        return rh4.j(str, "&fn=", str2);
    }

    public static final void v(Activity activity) {
        View currentFocus;
        if (activity != null && (currentFocus = activity.getWindow().getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            try {
                ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            } catch (Throwable unused) {
            }
        }
    }

    public static ck6 w() {
        if (ck6.c != null) {
            return ck6.c;
        }
        synchronized (ck6.class) {
            try {
                if (ck6.c == null) {
                    ck6.c = new ck6();
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return ck6.c;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [g0, ypd] */
    public static ypd x(Throwable th) {
        ? g0Var = new g0();
        th.getClass();
        g0Var.j(th, (Map) null);
        return g0Var;
    }

    public static void y(Activity activity) {
        ahc.Companion.getClass();
        activity.registerActivityLifecycleCallbacks(new ahc());
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static q67 z() {
        if (q67.c != null) {
            return q67.c;
        }
        synchronized (q67.class) {
            try {
                if (q67.c == null) {
                    q67.c = new q67(0);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return q67.c;
    }

    public abstract void G(Object obj, float f);

    public abstract float u(Object obj);
}
