package defpackage;

import android.content.Context;
import android.os.Looper;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: z04  reason: default package */
public abstract class z04 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final Object b = new Object();
    public static final c32 c = new c32(18, (byte) 0);
    public static xig d;

    public static String I(Throwable th) {
        boolean z;
        if (th == null) {
            return null;
        }
        synchronized (b) {
            Throwable th2 = th;
            while (true) {
                if (th2 == null) {
                    z = false;
                    break;
                }
                try {
                    if (th2 instanceof UnknownHostException) {
                        z = true;
                        break;
                    }
                    th2 = th2.getCause();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (z) {
                return "UnknownHostException (no network)";
            }
            String replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
            return replace;
        }
    }

    public static void J(String str) {
        synchronized (b) {
            c(str, (Throwable) null);
        }
    }

    public static boolean L(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str);
    }

    public static boolean O(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean P(XmlPullParser xmlPullParser, String str) {
        return O(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static String R(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static xo9 S(gy8 gy8) {
        int i;
        String str;
        String str2;
        try {
            i = lz7.N(gy8);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                i = 0;
            } else if (s != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        if (i == 0) {
            return null;
        }
        List list = nz4.a;
        String str3 = null;
        List list2 = list;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int s2 = au1.s(k7d.a);
                if (s2 == 0) {
                    str = null;
                } else if (s2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                if (str.equals("name")) {
                    try {
                        str2 = lz7.P(gy8);
                    } catch (Throwable th3) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                        Iterator it3 = u7d.a.iterator();
                        while (it3.hasNext()) {
                            ((r4a) it3.next()).getClass();
                            r4a.a(th3);
                        }
                        int s3 = au1.s(k7d.a);
                        if (s3 == 0) {
                            str2 = null;
                        } else if (s3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th3;
                        }
                    }
                    if (str2 != null) {
                        str3 = str2;
                    }
                } else if (str.equals("avatars")) {
                    ArrayList W = lz7.W(gy8, new jj9(16));
                    list2 = W != null ? x53.e0(W) : null;
                    if (list2 == null) {
                        list2 = list;
                    }
                } else {
                    try {
                        gy8.z();
                    } catch (Throwable th4) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                        Iterator it4 = u7d.a.iterator();
                        while (it4.hasNext()) {
                            ((r4a) it4.next()).getClass();
                            r4a.a(th4);
                        }
                        int s4 = au1.s(k7d.a);
                        if (s4 != 0) {
                            if (s4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            }
                            throw th4;
                        }
                    }
                }
            }
        }
        if (str3 == null || str3.length() == 0 || list2.isEmpty()) {
            return null;
        }
        if (str3 != null) {
            return new xo9(str3, list2);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static e T(gy8 gy8) {
        int i;
        String str;
        try {
            i = lz7.N(gy8);
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                i = 0;
            } else if (s != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th;
            }
        }
        if (i == 0) {
            return null;
        }
        int i2 = 0;
        int i3 = 0;
        String str2 = null;
        for (int i4 = 0; i4 < i; i4++) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th2) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th2);
                }
                int s2 = au1.s(k7d.a);
                if (s2 == 0) {
                    str = null;
                } else if (s2 != 1) {
                    throw new NoWhenBranchMatchedException();
                } else {
                    throw th2;
                }
            }
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1221029593) {
                    if (hashCode != 116079) {
                        if (hashCode == 113126854 && str.equals("width")) {
                            try {
                                i2 = lz7.L(gy8);
                            } catch (Throwable th3) {
                                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                                Iterator it3 = u7d.a.iterator();
                                while (it3.hasNext()) {
                                    ((r4a) it3.next()).getClass();
                                    r4a.a(th3);
                                }
                                int s3 = au1.s(k7d.a);
                                if (s3 == 0) {
                                    i2 = 0;
                                } else if (s3 != 1) {
                                    throw new NoWhenBranchMatchedException();
                                } else {
                                    throw th3;
                                }
                            }
                        }
                    } else if (str.equals("url")) {
                        try {
                            str2 = lz7.P(gy8);
                        } catch (Throwable th4) {
                            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                            Iterator it4 = u7d.a.iterator();
                            while (it4.hasNext()) {
                                ((r4a) it4.next()).getClass();
                                r4a.a(th4);
                            }
                            int s4 = au1.s(k7d.a);
                            if (s4 == 0) {
                                str2 = null;
                            } else if (s4 != 1) {
                                throw new NoWhenBranchMatchedException();
                            } else {
                                throw th4;
                            }
                        }
                    }
                } else if (str.equals("height")) {
                    try {
                        i3 = lz7.L(gy8);
                    } catch (Throwable th5) {
                        hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th5);
                        Iterator it5 = u7d.a.iterator();
                        while (it5.hasNext()) {
                            ((r4a) it5.next()).getClass();
                            r4a.a(th5);
                        }
                        int s5 = au1.s(k7d.a);
                        if (s5 == 0) {
                            i3 = 0;
                        } else if (s5 != 1) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            throw th5;
                        }
                    }
                }
                try {
                    gy8.z();
                } catch (Throwable th6) {
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th6);
                    Iterator it6 = u7d.a.iterator();
                    while (it6.hasNext()) {
                        ((r4a) it6.next()).getClass();
                        r4a.a(th6);
                    }
                    int s6 = au1.s(k7d.a);
                    if (s6 != 0) {
                        if (s6 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th6;
                    }
                }
            }
        }
        if (str2 == null || str2.length() == 0) {
            return null;
        }
        if (str2 != null) {
            return new e(str2, i2, i3);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    public static void U(bbe bbe, int i, pj3 pj3) {
        long i2 = bbe.i(i);
        List p = bbe.p(i2);
        if (!p.isEmpty()) {
            if (i != bbe.u() - 1) {
                long i3 = bbe.i(i + 1) - bbe.i(i);
                if (i3 > 0) {
                    pj3.accept(new b04(i2, i3, p));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a A[LOOP:0: B:21:0x0054->B:23:0x005a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void Y(defpackage.bbe r13, defpackage.nbe r14, defpackage.pj3 r15) {
        /*
            long r0 = r14.b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r5 = 0
            if (r4 != 0) goto L_0x000e
            r4 = r5
            goto L_0x0027
        L_0x000e:
            int r4 = r13.g(r0)
            r6 = -1
            if (r4 != r6) goto L_0x0019
            int r4 = r13.u()
        L_0x0019:
            if (r4 <= 0) goto L_0x0027
            int r6 = r4 + -1
            long r6 = r13.i(r6)
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x0027
            int r4 = r4 + -1
        L_0x0027:
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x0052
            int r2 = r13.u()
            if (r4 >= r2) goto L_0x0052
            java.util.List r11 = r13.p(r0)
            long r2 = r13.i(r4)
            boolean r6 = r11.isEmpty()
            if (r6 != 0) goto L_0x0052
            long r7 = r14.b
            int r6 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0052
            b04 r12 = new b04
            long r9 = r2 - r7
            r6 = r12
            r6.<init>(r7, r9, r11)
            r15.accept(r12)
            r2 = 1
            goto L_0x0053
        L_0x0052:
            r2 = r5
        L_0x0053:
            r3 = r4
        L_0x0054:
            int r6 = r13.u()
            if (r3 >= r6) goto L_0x0060
            U(r13, r3, r15)
            int r3 = r3 + 1
            goto L_0x0054
        L_0x0060:
            boolean r14 = r14.a
            if (r14 == 0) goto L_0x0089
            if (r2 == 0) goto L_0x0068
            int r4 = r4 + -1
        L_0x0068:
            if (r5 >= r4) goto L_0x0070
            U(r13, r5, r15)
            int r5 = r5 + 1
            goto L_0x0068
        L_0x0070:
            if (r2 == 0) goto L_0x0089
            b04 r14 = new b04
            java.util.List r11 = r13.p(r0)
            long r7 = r13.i(r4)
            long r2 = r13.i(r4)
            long r9 = r0 - r2
            r6 = r14
            r6.<init>(r7, r9, r11)
            r15.accept(r14)
        L_0x0089:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z04.Y(bbe, nbe, pj3):void");
    }

    public static final Set Z(String str) {
        if (str.length() == 0) {
            return null;
        }
        int A0 = w9e.A0(str, ",", 0, false, 4);
        if (A0 == -1) {
            return Collections.singleton(str);
        }
        xs xsVar = new xs(10);
        int i = 0;
        do {
            xsVar.add(str.substring(i, A0));
            i = A0 + 1;
            A0 = w9e.A0(str, ",", i, false, 4);
        } while (A0 != -1);
        xsVar.add(str.substring(i, str.length()));
        return xsVar;
    }

    public static final int a(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        if ('a' <= c2 && 'f' >= c2) {
            return c2 - 'W';
        }
        if ('A' <= c2 && 'F' >= c2) {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [hu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.jte r4, defpackage.c66 r5, java.lang.Throwable r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof defpackage.ap5
            if (r0 == 0) goto L_0x0013
            r0 = r7
            ap5 r0 = (defpackage.ap5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            ap5 r0 = new ap5
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Throwable r6 = r0.o
            defpackage.od2.a0(r7)     // Catch:{ all -> 0x0029 }
            goto L_0x0041
        L_0x0029:
            r4 = move-exception
            goto L_0x0044
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.od2.a0(r7)
            r0.o = r6     // Catch:{ all -> 0x0029 }
            r0.Y = r3     // Catch:{ all -> 0x0029 }
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch:{ all -> 0x0029 }
            if (r4 != r1) goto L_0x0041
            goto L_0x0043
        L_0x0041:
            e5f r1 = defpackage.e5f.a
        L_0x0043:
            return r1
        L_0x0044:
            if (r6 == 0) goto L_0x004b
            if (r6 == r4) goto L_0x004b
            defpackage.j47.e(r4, r6)
        L_0x004b:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z04.b(jte, c66, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void c(String str, Throwable th) {
        String I = I(th);
        if (!TextUtils.isEmpty(I)) {
            I.replace("\n", "\n  ");
        }
    }

    public static void c0(String str) {
        synchronized (b) {
            c(str, (Throwable) null);
        }
    }

    public static String d(int i, int i2, String str) {
        if (i < 0) {
            return i24.t("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return i24.t("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(zr6.h(i2, "negative size: "));
    }

    public static void d0(String str, Throwable th) {
        synchronized (b) {
            c(str, th);
        }
    }

    public static final Object e0(ilc ilc, m56 m56, Continuation continuation) {
        llc llc = new llc(ilc, m56, (Continuation) null);
        v0f v0f = (v0f) continuation.getContext().get(v0f.c);
        iu3 iu3 = v0f != null ? v0f.a : null;
        if (iu3 != null) {
            return j47.t0(iu3, llc, continuation);
        }
        lx3 context = continuation.getContext();
        sy1 sy1 = new sy1(1, v3c.u(continuation));
        sy1.n();
        try {
            qm qmVar = ilc.c;
            if (qmVar == null) {
                qmVar = null;
            }
            qmVar.execute(new r8g(5, context, sy1, ilc, llc, false));
        } catch (RejectedExecutionException e) {
            sy1.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e));
        }
        return sy1.m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0016, code lost:
        r0 = r3.getClass().getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void g(java.lang.StringBuilder r2, java.lang.Object r3) {
        /*
            if (r3 != 0) goto L_0x0008
            java.lang.String r3 = "null"
            r2.append(r3)
            goto L_0x003f
        L_0x0008:
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getSimpleName()
            int r1 = r0.length()
            if (r1 > 0) goto L_0x002c
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x002c
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x002c:
            r2.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r2.append(r0)
            int r3 = java.lang.System.identityHashCode(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r2.append(r3)
        L_0x003f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z04.g(java.lang.StringBuilder, java.lang.Object):void");
    }

    public static void j(long j, String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(i24.t(str, Long.valueOf(j)));
        }
    }

    public static void k(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = i24.t("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 >= 0) {
                str = i24.t("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                throw new IllegalArgumentException(zr6.h(i2, "negative size: "));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void l(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void m(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(d(i, i2, "index"));
        }
    }

    public static void n(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? d(i, i3, "start index") : (i2 < 0 || i2 > i3) ? d(i2, i3, "end index") : i24.t("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static float o(float f, float f2, float f3) {
        return f < f2 ? f2 : f > f3 ? f3 : f;
    }

    public static int p(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    public static void q(long j, wpa wpa, yze[] yzeArr) {
        int i;
        while (true) {
            boolean z = true;
            if (wpa.a() > 1) {
                int i2 = 0;
                while (true) {
                    if (wpa.a() != 0) {
                        int u = wpa.u();
                        i2 += u;
                        if (u != 255) {
                            i = i2;
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                int i3 = 0;
                while (true) {
                    if (wpa.a() != 0) {
                        int u2 = wpa.u();
                        i3 += u2;
                        if (u2 != 255) {
                            break;
                        }
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                int i4 = wpa.b + i3;
                if (i3 == -1 || i3 > wpa.a()) {
                    c0("Skipping remainder of malformed SEI NAL unit.");
                    i4 = wpa.c;
                } else if (i == 4 && i3 >= 8) {
                    int u3 = wpa.u();
                    int A = wpa.A();
                    int g = A == 49 ? wpa.g() : 0;
                    int u4 = wpa.u();
                    if (A == 47) {
                        wpa.H(1);
                    }
                    boolean z2 = u3 == 181 && (A == 49 || A == 47) && u4 == 3;
                    if (A == 49) {
                        if (g != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        r(j, wpa, yzeArr);
                    }
                }
                wpa.G(i4);
            } else {
                return;
            }
        }
    }

    public static void r(long j, wpa wpa, yze[] yzeArr) {
        wpa wpa2 = wpa;
        yze[] yzeArr2 = yzeArr;
        int u = wpa.u();
        if ((u & 64) != 0) {
            wpa2.H(1);
            int i = (u & 31) * 3;
            int i2 = wpa2.b;
            for (yze yze : yzeArr2) {
                wpa2.G(i2);
                yze.b(wpa2, i, 0);
                fm9.k(j != -9223372036854775807L);
                yze.a(j, 1, i, 0, (wze) null);
            }
        }
    }

    public static void s(Exception exc, String str) {
        synchronized (b) {
            c(str, exc);
        }
    }

    public static void t(String str) {
        synchronized (b) {
            c(str, (Throwable) null);
        }
    }

    public static void u(String str) {
        synchronized (b) {
            c(str, (Throwable) null);
        }
    }

    public static void v(String str, Throwable th) {
        synchronized (b) {
            c(str, th);
        }
    }

    public static awe w(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return awe.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return awe.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return awe.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return awe.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return awe.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static String x(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static String y(uj3 uj3, n10 n10) {
        String d2;
        if (uj3 != null && (d2 = uj3.d()) != null && d2.length() != 0) {
            String d3 = uj3.d();
            return d3 == null ? "" : d3;
        } else if (n10.d.length() <= 0) {
            return "Unknown";
        } else {
            String str = n10.d;
            String str2 = n10.e;
            return (str2 == null || str2.isEmpty()) ? str : rh4.j(str, " ", str2);
        }
    }

    public abstract int A();

    public abstract InputFilter[] B(InputFilter[] inputFilterArr);

    public abstract int C();

    public abstract int D();

    public abstract int E();

    public abstract int F(View view);

    public abstract int G(CoordinatorLayout coordinatorLayout);

    public abstract int H();

    public abstract boolean K();

    public abstract boolean M(float f);

    public abstract boolean N(View view);

    public abstract boolean Q(float f, float f2);

    public abstract void V(boolean z);

    public abstract void W(boolean z);

    public abstract boolean X(View view, float f);

    public abstract void a0(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    public abstract void b0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public ok e(Context context, Looper looper, kad kad, Object obj, ge6 ge6, he6 he6) {
        return f(context, looper, kad, obj, ge6, he6);
    }

    public ok f(Context context, Looper looper, kad kad, Object obj, ge6 ge6, he6 he6) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract TransformationMethod f0(TransformationMethod transformationMethod);

    public abstract int h(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float i(int i);

    public abstract int z(ViewGroup.MarginLayoutParams marginLayoutParams);
}
