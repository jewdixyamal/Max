package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.telephony.PhoneNumberUtils;
import android.text.Editable;
import android.text.NoCopySpan;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.View;
import android.view.Window;
import android.widget.EdgeEffect;
import androidx.media3.common.ParserException;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import one.me.messages.list.ui.recycler.MessagesLayoutManager;
import org.apache.http.util.LangUtils;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonSyntaxException;

/* renamed from: kp  reason: default package */
public abstract class kp {
    public static final int[] a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final ou6 c = new ou6("SVG", ".svg");
    public static final Object d = null;

    public static void A(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            a6g.a(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & -1793 : systemUiVisibility | 1792);
    }

    public static void B(va7 va7, Appendable appendable) {
        int S = va7.S();
        if (!(S == 34 || S == 49)) {
            boolean z = true;
            if (S == 91) {
                va7.a(appendable);
                while (va7.S() != 93) {
                    if (!z) {
                        va7.d(44);
                        va7.a(appendable);
                    }
                    B(va7, appendable);
                    z = false;
                }
                va7.a(appendable);
                return;
            } else if (!(S == 98 || S == 110)) {
                if (S == 123) {
                    va7.a(appendable);
                    while (va7.S() != 125) {
                        if (!z) {
                            va7.d(44);
                            va7.a(appendable);
                        }
                        va7.d(34);
                        va7.a(appendable);
                        va7.d(58);
                        va7.a(appendable);
                        B(va7, appendable);
                        z = false;
                    }
                    va7.a(appendable);
                    return;
                }
                throw JsonSyntaxException.b((long) va7.o, va7.m(), va7.S());
            }
        }
        va7.a(appendable);
    }

    public static int C(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 90;
        }
        if (i == 2) {
            return 180;
        }
        if (i == 3) {
            return 270;
        }
        throw new IllegalArgumentException(zr6.h(i, "Unsupported surface rotation: "));
    }

    public static final void D(y5f y5f) {
        y5f.e(mb6.class, new mxc(1));
        y5f.e(hhb.class, new mxc(2));
    }

    public static final void E(y5f y5f) {
        y5f.e(wc7.class, new k1e(10));
        y5f.e(b6e.class, new mxc(5));
        y5f.e(g6e.class, new mxc(6));
    }

    public static double a(JSONObject jSONObject, String str, double d2) {
        return jSONObject != null ? jSONObject.optDouble(str, d2) : d2;
    }

    public static boolean b(JSONObject jSONObject, String str, boolean z) {
        return jSONObject != null ? jSONObject.optBoolean(str, z) : z;
    }

    public static final void c(RecyclerView recyclerView, int i, int i2, Runnable runnable, Runnable runnable2) {
        if (recyclerView != null) {
            Handler handler = recyclerView.getHandler();
            if (handler != null && handler.hasMessages(61453)) {
                recyclerView.getHandler().removeMessages(61453, runnable);
            }
            if (!recyclerView.Z() && Looper.getMainLooper().isCurrentThread()) {
                a layoutManager = recyclerView.getLayoutManager();
                MessagesLayoutManager messagesLayoutManager = layoutManager instanceof MessagesLayoutManager ? (MessagesLayoutManager) layoutManager : null;
                if (messagesLayoutManager == null || !messagesLayoutManager.H) {
                    runnable.run();
                    return;
                }
            }
            if (i != i2) {
                gec gec = new gec(recyclerView, i, i2, runnable, runnable2);
                Message obtain = Message.obtain(recyclerView.getHandler(), gec);
                obtain.what = 61453;
                obtain.obj = runnable;
                Handler handler2 = recyclerView.getHandler();
                if (handler2 != null) {
                    handler2.sendMessageAtFrontOfQueue(obtain);
                } else {
                    recyclerView.post(gec);
                }
            } else if (runnable2 != null) {
                runnable2.run();
            }
        } else if (runnable2 != null) {
            runnable2.run();
        }
    }

    public static final boolean e(Uri uri, Uri uri2) {
        if (uri == null || uri2 == null) {
            return false;
        }
        return x53.n0(uri.getPathSegments(), "/", (String) null, (String) null, (m56) null, 62).equals(x53.n0(uri2.getPathSegments(), "/", (String) null, (String) null, (m56) null, 62));
    }

    public static z24 f(khc khc, String str, q4c q4c, int i) {
        y24 y24 = new y24(0);
        y24.b = kq0.F(str, q4c.c);
        y24.g = q4c.a;
        y24.h = q4c.b;
        String a2 = khc.a();
        if (a2 == null) {
            a2 = q4c.b(((lk0) khc.b.get(0)).a).toString();
        }
        y24.e(a2);
        y24.c(i);
        return y24.a();
    }

    public static final void g(Spannable spannable, boolean z) {
        Object[] objArr;
        int spanStart;
        int spanEnd;
        int length;
        try {
            objArr = spannable.getSpans(0, spannable.length(), Object.class);
        } catch (Throwable unused) {
            objArr = null;
        }
        if (objArr != null) {
            for (Object obj : objArr) {
                if (obj == null || ((z && (obj instanceof NoCopySpan)) || (spanStart = spannable.getSpanStart(obj)) < 0 || (spanEnd = spannable.getSpanEnd(obj)) < 0 || spanEnd < spanStart || spanStart > (length = spannable.length()) || spanEnd > length)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static final Map h(Map map) {
        Object obj;
        try {
            obj = map.keySet();
        } catch (Throwable th) {
            obj = new njc(th);
        }
        Object obj2 = wz4.a;
        if (obj instanceof njc) {
            obj = obj2;
        }
        return m6d.n(new qqd(27, (Object) (Iterable) obj));
    }

    public static final boolean i(sk6 sk6, sk6 sk62) {
        if (sk6.g() != sk62.g() || sk6.h() != sk62.h() || sk6.i().size() != sk62.i().size()) {
            return false;
        }
        int size = sk6.i().size();
        for (int i = 0; i < size; i++) {
            i13 i13 = (i13) sk6.i().get(i);
            i13 i132 = (i13) sk62.i().get(i);
            if (i13.a() != i132.a() || i13.b() != i132.b()) {
                return false;
            }
        }
        return true;
    }

    public static final String j(zua zua, String str, String str2, String str3, int i) {
        try {
            qva t = zua.t(str3, str2);
            if (zua.m(t)) {
                str2 = zua.d(t, 2);
            }
        } catch (NumberParseException unused) {
        }
        if (w9e.Y0(str.length(), str2).equals(str)) {
            str2 = str2.substring(str.length(), str2.length());
        }
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str2.charAt(i3);
            if (i2 == i) {
                break;
            }
            sb.append(charAt);
            if (PhoneNumberUtils.isNonSeparator(charAt)) {
                i2++;
            }
        }
        return w9e.b1(sb.toString()).toString();
    }

    public static float k(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return pu4.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final int l(zua zua, String str) {
        qva e = zua.e(str);
        if (!zua.m(e)) {
            return Integer.MAX_VALUE;
        }
        String d2 = zua.d(e, 1);
        int i = e.a;
        return w9e.b1(w9e.K0(d2, "+" + i)).toString().length();
    }

    public static int m(int i, int i2, boolean z) {
        int i3 = z ? ((i2 - i) + 360) % 360 : (i2 + i) % 360;
        if (mqd.u(2, "CameraOrientationUtil")) {
            StringBuilder j = wg0.j("getRelativeImageRotation: destRotationDegrees=", i, ", sourceRotationDegrees=", i2, ", isOppositeFacing=");
            j.append(z);
            j.append(", result=");
            j.append(i3);
        }
        return i3;
    }

    public static int n(s02 s02) {
        int i = s02.i(4);
        if (i == 15) {
            if (s02.b() >= 24) {
                return s02.i(24);
            }
            throw ParserException.a((RuntimeException) null, "AAC header insufficient data");
        } else if (i < 13) {
            return a[i];
        } else {
            throw ParserException.a((RuntimeException) null, "AAC header wrong Sampling Frequency Index");
        }
    }

    public static final String o(zua zua, String str) {
        qva e = zua.e(str);
        if (!zua.m(e)) {
            return null;
        }
        String replaceAll = Pattern.compile("^\\+\\d{1,3}\\s?|[\\(\\)]").matcher(zua.d(e, 2)).replaceAll("");
        Pattern compile = Pattern.compile("\\d");
        String replaceAll2 = compile.matcher(replaceAll).replaceAll(String.valueOf('X'));
        StringBuilder sb = new StringBuilder();
        int length = replaceAll2.length();
        int i = 1;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = replaceAll2.charAt(i2);
            if (charAt == 'X') {
                sb.append(i);
                i = (i + 1) % 10;
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static float q(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return pu4.c(edgeEffect, f, f2);
        }
        ou4.a(edgeEffect, f, f2);
        return f;
    }

    public static e s(s02 s02, boolean z) {
        int i = s02.i(5);
        if (i == 31) {
            i = s02.i(6) + 32;
        }
        int n = n(s02);
        int i2 = s02.i(4);
        String h = zr6.h(i, "mp4a.40.");
        if (i == 5 || i == 29) {
            n = n(s02);
            int i3 = s02.i(5);
            if (i3 == 31) {
                i3 = s02.i(6) + 32;
            }
            i = i3;
            if (i == 22) {
                i2 = s02.i(4);
            }
        }
        if (z) {
            if (!(i == 1 || i == 2 || i == 3 || i == 4 || i == 6 || i == 7 || i == 17)) {
                switch (i) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.c("Unsupported audio object type: " + i);
                }
            }
            if (s02.h()) {
                z04.c0("Unexpected frameLengthFlag = 1");
            }
            if (s02.h()) {
                s02.t(14);
            }
            boolean h2 = s02.h();
            if (i2 != 0) {
                if (i == 6 || i == 20) {
                    s02.t(3);
                }
                if (h2) {
                    if (i == 22) {
                        s02.t(16);
                    }
                    if (i == 17 || i == 19 || i == 20 || i == 23) {
                        s02.t(3);
                    }
                    s02.t(1);
                }
                switch (i) {
                    case LangUtils.HASH_SEED /*17*/:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int i4 = s02.i(2);
                        if (i4 == 2 || i4 == 3) {
                            throw ParserException.c("Unsupported epConfig: " + i4);
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i5 = b[i2];
        if (i5 != -1) {
            return new e(n, i5, h);
        }
        throw ParserException.a((RuntimeException) null, (String) null);
    }

    public static va8 t(yaf yaf) {
        yaf.I(1);
        int x = yaf.x();
        long j = ((long) yaf.b) + ((long) x);
        int i = x / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long p = yaf.p();
            if (p == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = p;
            jArr2[i2] = yaf.p();
            yaf.I(2);
            i2++;
        }
        yaf.I((int) (j - ((long) yaf.b)));
        return new va8((Object) jArr, 18, (Object) jArr2);
    }

    public static final void u(Editable editable, int i, int i2, boolean z, yz7 yz7) {
        Class<?> cls = yz7.getClass();
        String obj = editable.toString();
        List<yz7> m0 = ys.m0(editable.getSpans(i, i2, cls));
        for (yz7 yz72 : m0) {
            if (editable.getSpanStart(yz72) <= i && editable.getSpanEnd(yz72) >= i2) {
                v(editable, yz72, i, i2);
                return;
            }
        }
        if (!z) {
            for (int i3 = i; i3 < i2; i3++) {
                if (!nd7.E(obj.charAt(i3))) {
                    for (yz7 yz73 : m0) {
                        int spanStart = editable.getSpanStart(yz73);
                        if (i3 > editable.getSpanEnd(yz73) || spanStart > i3) {
                        }
                    }
                }
            }
            for (yz7 v : m0) {
                v(editable, v, i, i2);
            }
            return;
        }
        ft.B(editable, yz7, i, i2);
    }

    public static final void v(Spannable spannable, uw3 uw3, int i, int i2) {
        int spanStart = spannable.getSpanStart(uw3);
        if (spanStart != -1) {
            int spanEnd = spannable.getSpanEnd(uw3);
            if (spanStart < i || spanEnd > i2) {
                int spanFlags = spannable.getSpanFlags(uw3);
                spannable.removeSpan(uw3);
                if (spanStart < i) {
                    spannable.setSpan(uw3.copy(), spanStart, i, spanFlags);
                }
                if (spanEnd > i2) {
                    spannable.setSpan(uw3.copy(), i2, spanEnd, spanFlags);
                    return;
                }
                return;
            }
            spannable.removeSpan(uw3);
        }
    }

    public static final void w(Spannable spannable, Class cls, int i, int i2) {
        try {
            for (Object removeSpan : spannable.getSpans(i, i2, cls)) {
                spannable.removeSpan(removeSpan);
            }
        } catch (Throwable unused) {
        }
    }

    public static void x(RecyclerView recyclerView, Runnable runnable) {
        c(recyclerView, 0, 5, runnable, (Runnable) null);
    }

    public static final CharSequence y(CharSequence charSequence) {
        return z(charSequence);
    }

    public static CharSequence z(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        try {
            if (charSequence instanceof gvd) {
                return (SpannableString) charSequence;
            }
            int i = gvd.a;
            return crd.l(charSequence, true);
        } catch (Throwable th) {
            hm9.p("Markdown", "fail to make safeCopy of " + charSequence, th);
            return charSequence;
        }
    }

    public abstract kp d(Object obj);

    public abstract void p();

    public void r() {
    }
}
