package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.util.Size;
import android.view.GestureDetector;
import android.view.View;
import androidx.recyclerview.widget.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import org.apache.http.HttpHost;
import org.json.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: s5c  reason: default package */
public abstract class s5c {
    public static final oq9 a = new oq9(10);
    public static final lq9 b = new Object();
    public static final /* synthetic */ int c = 0;

    public static l20 A(cu8 cu8, String str) {
        if (cu8 == null || !cu8.n()) {
            return null;
        }
        int i = 0;
        while (true) {
            k8g k8g = cu8.z0;
            if (i >= k8g.i()) {
                return null;
            }
            l20 h = k8g.h(i);
            if (oag.d(h.r, str)) {
                return h;
            }
            i++;
        }
    }

    public static List B(cjg cjg) {
        String string = ((p7b) ((m7b) cjg.b)).a.g.getString("app.currentProxyList", (String) null);
        if (M(string)) {
            return Collections.emptyList();
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            ArrayList arrayList = new ArrayList(jSONArray.length());
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    eh3 a2 = eh3.a((JSONObject) jSONArray.get(i));
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                } catch (JSONException e) {
                    hm9.p("s5c", "parse proxy from string exception " + e.getMessage(), (Throwable) null);
                }
            }
            return arrayList;
        } catch (JSONException e2) {
            hm9.p("s5c", "parse from string exception " + e2.getMessage(), (Throwable) null);
            return Collections.emptyList();
        }
    }

    public static int C(l20 l20) {
        if (l20.f()) {
            return l20.b.o;
        }
        boolean N = N(l20);
        s10 s10 = l20.j;
        if (N) {
            return s10.d.b.o;
        }
        if (l20.i()) {
            return l20.d.f;
        }
        if (P(l20)) {
            return s10.d.d.f;
        }
        if (l20.h()) {
            return l20.f.d;
        }
        return 0;
    }

    public static byte[] D(l20 l20) {
        x10 x10;
        if (l20.f()) {
            return l20.b.Y;
        }
        if (l20.i()) {
            return l20.d.j;
        }
        boolean N = N(l20);
        s10 s10 = l20.j;
        if (N) {
            return s10.d.b.Y;
        }
        if (P(l20)) {
            return s10.d.d.j;
        }
        if (!l20.g() || (x10 = l20.g.f) == null) {
            return null;
        }
        return x10.Y;
    }

    public static int E(l20 l20) {
        if (l20.f()) {
            return l20.b.c;
        }
        boolean N = N(l20);
        s10 s10 = l20.j;
        if (N) {
            return s10.d.b.c;
        }
        if (l20.i()) {
            return l20.d.e;
        }
        if (P(l20)) {
            return s10.d.d.e;
        }
        if (l20.h()) {
            return l20.f.c;
        }
        return 0;
    }

    public static String F(s10 s10) {
        int lastIndexOf;
        if (s10 == null) {
            return null;
        }
        String str = s10.c;
        if (!oag.t(str) && (lastIndexOf = str.lastIndexOf(46)) != -1 && lastIndexOf < str.length()) {
            return str.substring(lastIndexOf + 1);
        }
        return null;
    }

    public static final Size G(Context context) {
        Size size = new Size(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
        return size.getHeight() > size.getWidth() ? size : new Size(size.getHeight(), size.getWidth());
    }

    public static int H(int i, int i2, int i3, int[] iArr) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static void I(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            t(inputStream, fileOutputStream);
            fileOutputStream.flush();
        } finally {
            n(inputStream);
            m(fileOutputStream);
        }
    }

    public static String J(InputStream inputStream) {
        StringWriter stringWriter = new StringWriter();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        char[] cArr = new char[20480];
        while (true) {
            int read = inputStreamReader.read(cArr);
            if (-1 == read) {
                return stringWriter.toString();
            }
            stringWriter.write(cArr, 0, read);
        }
    }

    public static boolean K(l20 l20) {
        if (l20 == null) {
            return false;
        }
        int ordinal = l20.a.ordinal();
        return ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal == 9 && l20.j.a == 0 : l20.e.a == 0 : l20.d.a == 0 : l20.b.s0 == 0;
    }

    public static boolean L(cu8 cu8) {
        if (!cu8.n()) {
            return false;
        }
        k8g k8g = cu8.z0;
        return k8g.h(0).a() && oag.u(k8g.h(0).e.f);
    }

    public static boolean M(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = defpackage.g20.u0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r1 = (r3 = r3.j).d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean N(defpackage.l20 r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0021
            g20 r1 = defpackage.g20.u0
            g20 r2 = r3.a
            if (r2 == r1) goto L_0x000a
            goto L_0x0021
        L_0x000a:
            s10 r3 = r3.j
            if (r3 == 0) goto L_0x0021
            l20 r1 = r3.d
            if (r1 == 0) goto L_0x0021
            boolean r1 = r1.f()
            if (r1 == 0) goto L_0x0021
            l20 r3 = r3.d
            x10 r3 = r3.b
            boolean r3 = r3.X
            if (r3 != 0) goto L_0x0021
            r0 = 1
        L_0x0021:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5c.N(l20):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        r3 = (r3 = r3.b()).d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean O(defpackage.j10 r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x001b
            g20 r1 = r3.a
            g20 r2 = defpackage.g20.u0
            if (r1 == r2) goto L_0x000a
            goto L_0x001b
        L_0x000a:
            s10 r3 = r3.b()
            if (r3 == 0) goto L_0x001b
            l20 r3 = r3.d
            if (r3 == 0) goto L_0x001b
            boolean r3 = r3.i()
            if (r3 == 0) goto L_0x001b
            r0 = 1
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5c.O(j10):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r1 = defpackage.g20.u0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        r3 = (r3 = r3.j).d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean P(defpackage.l20 r3) {
        /*
            r0 = 0
            if (r3 == 0) goto L_0x0019
            g20 r1 = defpackage.g20.u0
            g20 r2 = r3.a
            if (r2 == r1) goto L_0x000a
            goto L_0x0019
        L_0x000a:
            s10 r3 = r3.j
            if (r3 == 0) goto L_0x0019
            l20 r3 = r3.d
            if (r3 == 0) goto L_0x0019
            boolean r3 = r3.i()
            if (r3 == 0) goto L_0x0019
            r0 = 1
        L_0x0019:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5c.P(l20):boolean");
    }

    public static boolean Q(m7b m7b, k20 k20) {
        return k20 != null && k20.g && ((p7b) m7b).a.n() < k20.k;
    }

    public static boolean R(l20 l20) {
        if (l20 == null) {
            return false;
        }
        d20 d20 = l20.o;
        if (!d20.d()) {
            return false;
        }
        if (P(l20)) {
            s10 s10 = l20.j;
            return s10 != null && s10.a == 0 && !d20.b();
        }
        k20 k20 = l20.d;
        return k20 != null && k20.a == 0 && !d20.b();
    }

    public static int S(Map map) {
        if (map == null) {
            return 0;
        }
        return map.size();
    }

    public static String T(Map map) {
        if (map.isEmpty()) {
            return "{}";
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        while (true) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            str.getClass();
            char c2 = 65535;
            switch (str.hashCode()) {
                case -2132092408:
                    if (str.equals("mt_instanceid")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1690743503:
                    if (str.equals("messageIds")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1291329255:
                    if (str.equals("events")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1033517562:
                    if (str.equals("verifyCode")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -989040443:
                    if (str.equals("phones")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -778929409:
                    if (str.equals("pushToken")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -738997328:
                    if (str.equals("attachments")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case -567451565:
                    if (str.equals("contacts")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case -8339209:
                    if (str.equals("elements")) {
                        c2 = 8;
                        break;
                    }
                    break;
                case 3556653:
                    if (str.equals("text")) {
                        c2 = 9;
                        break;
                    }
                    break;
                case 95844769:
                    if (str.equals("draft")) {
                        c2 = 10;
                        break;
                    }
                    break;
                case 110541305:
                    if (str.equals(ApiProtocol.KEY_TOKEN)) {
                        c2 = 11;
                        break;
                    }
                    break;
                case 139855480:
                    if (str.equals("contactIds")) {
                        c2 = 12;
                        break;
                    }
                    break;
                case 739093568:
                    if (str.equals("chatIds")) {
                        c2 = 13;
                        break;
                    }
                    break;
                case 831145840:
                    if (str.equals("configHash")) {
                        c2 = 14;
                        break;
                    }
                    break;
                case 954925063:
                    if (str.equals("message")) {
                        c2 = 15;
                        break;
                    }
                    break;
                case 1216985755:
                    if (str.equals("password")) {
                        c2 = 16;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 3:
                case 5:
                case 9:
                case 11:
                case Protos.Attaches.Attach.LOCATION /*14*/:
                case 16:
                    o84.Z.getClass();
                    value = "***";
                    break;
                case 1:
                case Protos.Attaches.Attach.PRESENT /*12*/:
                case 13:
                    if (!(value instanceof Iterable)) {
                        if (value instanceof long[]) {
                            long[] jArr = (long[]) value;
                            if (!(jArr == null || jArr.length == 0)) {
                                value = ys.h0(jArr, ",", "[", "]", -1, "...", new g27(9));
                                break;
                            }
                        }
                    } else {
                        Iterable iterable = (Iterable) value;
                        if (iterable != null) {
                            g27 g27 = new g27(8);
                            StringBuilder sb2 = new StringBuilder();
                            x53.l0(iterable, sb2, ",", "[", "]", -1, "...", g27);
                            value = sb2.toString();
                            break;
                        }
                    }
                    break;
                case 2:
                    value = "[]";
                    break;
                case 4:
                case 6:
                case 7:
                case 8:
                    if (!(value instanceof Collection)) {
                        if (!(value instanceof Map)) {
                            if (value instanceof long[]) {
                                value = Integer.valueOf(((long[]) value).length);
                                break;
                            }
                        } else {
                            value = Integer.valueOf(((Map) value).size());
                            break;
                        }
                    } else {
                        value = Integer.valueOf(((Collection) value).size());
                        break;
                    }
                    break;
                case 10:
                case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                    if (value instanceof Map) {
                        value = T((Map) value);
                        break;
                    }
                    break;
            }
            sb.append(str);
            sb.append('=');
            sb.append(value);
            if (!it.hasNext()) {
                sb.append('}');
                return sb.toString();
            }
            sb.append(", ");
        }
    }

    public static boolean U(l20 l20, es8 es8) {
        s10 s10;
        l20 l202 = null;
        if (l20 != null) {
            if (!l20.f() && (l20.a != g20.u0 || (s10 = l20.j) == null || (l20 = s10.d) == null || !l20.f())) {
                l20 = null;
            }
            l202 = l20;
        }
        return l202 != null && l202.f() && l202.z && !l202.y && !es8.b.Y;
    }

    public static String V(String str, List list, d4c d4c, a4c a4c) {
        String[] split = str.split(HTTP.CRLF);
        int i = 0;
        while (true) {
            if (i >= split.length) {
                i = -1;
                break;
            } else if (split[i].startsWith("m=audio")) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            c(d4c, a4c, "failed to find m=audio line in sdp");
            return str;
        }
        dcg a2 = dcg.a(i, split[i]);
        if (a2 == null) {
            c(d4c, a4c, "failed to parse m=audio line");
            return str;
        }
        int i2 = i + 1;
        while (i2 < split.length && !split[i2].startsWith("m=audio")) {
            a2.e(i2, split[i2]);
            i2++;
        }
        if (!a2.d(list)) {
            c(d4c, a4c, "failed to find any desired codecs");
            return str;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i3 = 0; i3 < split.length; i3++) {
            int i4 = a2.c;
            if (i3 == i4) {
                a2.f(sb, list, false);
            } else if (i3 != i4 && !a2.a.contains(Integer.valueOf(i3))) {
                sb.append(split[i3]);
                sb.append(HTTP.CRLF);
            } else if (!z) {
                a2.c(sb, list, false);
                z = true;
            }
        }
        return sb.toString();
    }

    public static void W(String str, Object obj, StringBuffer stringBuffer, StringBuffer stringBuffer2) {
        if (obj != null) {
            int i = 0;
            if (obj instanceof qw8) {
                int length = stringBuffer.length();
                if (str != null) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(u(str));
                    stringBuffer2.append(" <\n");
                    stringBuffer.append("  ");
                }
                Class<?> cls = obj.getClass();
                for (Field field : cls.getFields()) {
                    int modifiers = field.getModifiers();
                    String name = field.getName();
                    if (!"cachedSize".equals(name) && (modifiers & 1) == 1 && (modifiers & 8) != 8 && !name.startsWith("_") && !name.endsWith("_")) {
                        Class<?> type = field.getType();
                        Object obj2 = field.get(obj);
                        if (!type.isArray()) {
                            W(name, obj2, stringBuffer, stringBuffer2);
                        } else if (type.getComponentType() == Byte.TYPE) {
                            W(name, obj2, stringBuffer, stringBuffer2);
                        } else {
                            int length2 = obj2 == null ? 0 : Array.getLength(obj2);
                            for (int i2 = 0; i2 < length2; i2++) {
                                W(name, Array.get(obj2, i2), stringBuffer, stringBuffer2);
                            }
                        }
                    }
                }
                Method[] methods = cls.getMethods();
                int length3 = methods.length;
                while (i < length3) {
                    String name2 = methods[i].getName();
                    if (name2.startsWith("set")) {
                        String substring = name2.substring(3);
                        try {
                            if (((Boolean) cls.getMethod("has" + substring, (Class[]) null).invoke(obj, (Object[]) null)).booleanValue()) {
                                W(substring, cls.getMethod("get" + substring, (Class[]) null).invoke(obj, (Object[]) null), stringBuffer, stringBuffer2);
                            }
                        } catch (NoSuchMethodException unused) {
                        }
                    }
                    i++;
                }
                if (str != null) {
                    stringBuffer.setLength(length);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                }
            } else if (obj instanceof Map) {
                String u = u(str);
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(u);
                    stringBuffer2.append(" <\n");
                    int length4 = stringBuffer.length();
                    stringBuffer.append("  ");
                    W("key", entry.getKey(), stringBuffer, stringBuffer2);
                    W("value", entry.getValue(), stringBuffer, stringBuffer2);
                    stringBuffer.setLength(length4);
                    stringBuffer2.append(stringBuffer);
                    stringBuffer2.append(">\n");
                }
            } else {
                String u2 = u(str);
                stringBuffer2.append(stringBuffer);
                stringBuffer2.append(u2);
                stringBuffer2.append(": ");
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str2.startsWith(HttpHost.DEFAULT_SCHEME_NAME) && str2.length() > 200) {
                        str2 = str2.substring(0, 200) + "[...]";
                    }
                    int length5 = str2.length();
                    StringBuilder sb = new StringBuilder(length5);
                    while (i < length5) {
                        char charAt = str2.charAt(i);
                        if (charAt < ' ' || charAt > '~' || charAt == '\"' || charAt == '\'') {
                            sb.append(String.format("\\u%04x", new Object[]{Integer.valueOf(charAt)}));
                        } else {
                            sb.append(charAt);
                        }
                        i++;
                    }
                    String sb2 = sb.toString();
                    stringBuffer2.append("\"");
                    stringBuffer2.append(sb2);
                    stringBuffer2.append("\"");
                } else if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    stringBuffer2.append('\"');
                    while (i < bArr.length) {
                        byte b2 = bArr[i] & 255;
                        if (b2 == 92 || b2 == 34) {
                            stringBuffer2.append('\\');
                            stringBuffer2.append((char) b2);
                        } else if (b2 < 32 || b2 >= Byte.MAX_VALUE) {
                            stringBuffer2.append(String.format("\\%03o", new Object[]{Integer.valueOf(b2)}));
                        } else {
                            stringBuffer2.append((char) b2);
                        }
                        i++;
                    }
                    stringBuffer2.append('\"');
                } else {
                    stringBuffer2.append(obj);
                }
                stringBuffer2.append("\n");
            }
        }
    }

    public static long X(yaf yaf, int i, int i2) {
        yaf.H(i);
        if (yaf.c() < 5) {
            return -9223372036854775807L;
        }
        int h = yaf.h();
        if ((8388608 & h) != 0 || ((2096896 & h) >> 8) != i2 || (h & 32) == 0 || yaf.v() < 7 || yaf.c() < 7 || (yaf.v() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        yaf.g(0, bArr, 6);
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((((long) bArr[4]) & 255) >> 7);
    }

    public static int Y(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static final void Z(View view, eh7 eh7) {
        view.setTag(ayb.view_tree_lifecycle_owner, eh7);
    }

    public static final q46 a(Context context, k56 k56) {
        GestureDetector gestureDetector = new GestureDetector(context, new ua6(0, k56));
        gestureDetector.setIsLongpressEnabled(false);
        return new q46(gestureDetector, 2);
    }

    public static boolean a0(m7b m7b, k20 k20) {
        if (k20 == null || !k20.g) {
            return false;
        }
        return Q(m7b, k20) || oag.t(k20.d);
    }

    public static dcg b(boolean z, String[] strArr, a4c a4c) {
        String str = z ? "m=audio " : "m=video ";
        int i = 0;
        while (true) {
            if (i >= strArr.length) {
                i = -1;
                break;
            } else if (strArr[i].startsWith(str)) {
                break;
            } else {
                i++;
            }
        }
        String str2 = "m=video";
        if (i == -1) {
            if (z) {
                str2 = "m=audio";
            }
            a4c.log("CodecPrefUtil", "parseMSection: didn't find section: ".concat(str2));
            return null;
        }
        dcg a2 = dcg.a(i, strArr[i]);
        if (a2 == null) {
            if (z) {
                str2 = "m=audio";
            }
            a4c.log("CodecPrefUtil", "parseMSection: failed to parse line: ".concat(str2));
            return null;
        }
        while (true) {
            i++;
            if (i >= strArr.length || strArr[i].startsWith("m=")) {
                return a2;
            }
            a2.e(i, strArr[i]);
        }
        return a2;
    }

    public static boolean b0(p7b p7b, l20 l20) {
        if (l20 == null) {
            return false;
        }
        return a0(p7b, P(l20) ? l20.j.d.d : l20.d);
    }

    public static void c(d4c d4c, a4c a4c, String str) {
        d4c.log(e0e.callPreferH264Sdp, "fail", (String) null);
        a4c.log("CodecPrefUtil", str);
    }

    public static int[] c0(Collection collection) {
        if (collection instanceof o47) {
            o47 o47 = (o47) collection;
            return Arrays.copyOfRange(o47.a, o47.b, o47.c);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final StackTraceElement d(Exception exc, String str) {
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(str), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final gx0 d0(vw0 vw0) {
        switch (vw0.ordinal()) {
            case 0:
                return gx0.b;
            case 1:
                return gx0.c;
            case 2:
                return gx0.o;
            case 3:
                return gx0.X;
            case 4:
                return gx0.Z;
            case 5:
                return gx0.s0;
            case 6:
                return gx0.t0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String e(java.lang.String r22, java.lang.String r23, java.lang.String r24, defpackage.d4c r25, defpackage.a4c r26) {
        /*
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            java.lang.String r5 = "\r\n"
            java.lang.String[] r6 = r0.split(r5)
            r7 = 0
            r8 = r7
        L_0x0012:
            int r9 = r6.length
            java.lang.String r10 = "m=audio"
            r11 = -1
            if (r8 >= r9) goto L_0x0024
            r9 = r6[r8]
            boolean r9 = r9.startsWith(r10)
            if (r9 == 0) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r8 = r8 + 1
            goto L_0x0012
        L_0x0024:
            r8 = r11
        L_0x0025:
            if (r8 != r11) goto L_0x002d
            java.lang.String r1 = "failed to find m=audio line in sdp"
            c(r3, r4, r1)
            return r0
        L_0x002d:
            r9 = r6[r8]
            dcg r9 = defpackage.dcg.a(r8, r9)
            if (r9 != 0) goto L_0x003b
            java.lang.String r1 = "failed to parse m=audio line"
            c(r3, r4, r1)
            return r0
        L_0x003b:
            r11 = 1
            int r8 = r8 + r11
        L_0x003d:
            int r12 = r6.length
            if (r8 >= r12) goto L_0x0051
            r12 = r6[r8]
            boolean r12 = r12.startsWith(r10)
            if (r12 == 0) goto L_0x0049
            goto L_0x0051
        L_0x0049:
            r12 = r6[r8]
            r9.e(r8, r12)
            int r8 = r8 + 1
            goto L_0x003d
        L_0x0051:
            java.lang.String r8 = "opus"
            java.util.ArrayList r10 = r9.b(r8)
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r11
            if (r10 != 0) goto L_0x0064
            java.lang.String r1 = "failed to find desired codec"
            c(r3, r4, r1)
            return r0
        L_0x0064:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r8 = r9.b(r8)
            java.util.Iterator r8 = r8.iterator()
            r12 = 0
            r13 = 0
        L_0x0073:
            boolean r14 = r8.hasNext()
            java.lang.String r15 = "a=fmtp:"
            if (r14 == 0) goto L_0x00a4
            java.lang.Object r12 = r8.next()
            xbg r12 = (defpackage.xbg) r12
            java.lang.String r14 = r12.a
            java.util.ArrayList r12 = r12.c
            java.util.Iterator r12 = r12.iterator()
        L_0x0089:
            boolean r16 = r12.hasNext()
            if (r16 == 0) goto L_0x00a2
            java.lang.Object r16 = r12.next()
            r9 = r16
            java.lang.String r9 = (java.lang.String) r9
            r10.add(r9)
            boolean r16 = r9.startsWith(r15)
            if (r16 == 0) goto L_0x0089
            r13 = r9
            goto L_0x0089
        L_0x00a2:
            r12 = r14
            goto L_0x0073
        L_0x00a4:
            if (r12 != 0) goto L_0x00ac
            java.lang.String r1 = "failed to find desired lines"
            c(r3, r4, r1)
            return r0
        L_0x00ac:
            if (r13 == 0) goto L_0x0129
            boolean r8 = r13.startsWith(r15)
            if (r8 != 0) goto L_0x00b5
            goto L_0x00be
        L_0x00b5:
            r8 = 32
            r9 = 6
            int r8 = r13.indexOf(r8, r9)
            if (r8 >= 0) goto L_0x00c5
        L_0x00be:
            r21 = r12
            r18 = r13
            r14 = 0
            r12 = r7
            goto L_0x011a
        L_0x00c5:
            java.lang.String r9 = r13.substring(r7, r8)
            int r8 = r8 + r11
            java.lang.String r8 = r13.substring(r8)
            b9b r14 = new b9b
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.lang.String r7 = ";"
            java.lang.String[] r7 = r8.split(r7)
            int r8 = r7.length
            r18 = r13
            r13 = 0
        L_0x00df:
            if (r13 >= r8) goto L_0x0114
            r19 = r7[r13]
            r20 = r7
            java.lang.String r7 = r19.trim()
            r19 = r8
            r8 = 61
            int r8 = r7.indexOf(r8)
            if (r8 >= 0) goto L_0x00f8
            r21 = r12
            r8 = 0
            r12 = 0
            goto L_0x0108
        L_0x00f8:
            r21 = r12
            r12 = 0
            java.lang.String r17 = r7.substring(r12, r8)
            int r8 = r8 + 1
            java.lang.String r7 = r7.substring(r8)
            r8 = r7
            r7 = r17
        L_0x0108:
            r11.put(r7, r8)
            int r13 = r13 + 1
            r8 = r19
            r7 = r20
            r12 = r21
            goto L_0x00df
        L_0x0114:
            r21 = r12
            r12 = 0
            r14.<init>((java.lang.String) r9, (java.util.LinkedHashMap) r11)
        L_0x011a:
            if (r14 != 0) goto L_0x011d
            return r0
        L_0x011d:
            boolean r7 = r14.e(r1, r2, r3, r4)
            if (r7 != 0) goto L_0x0124
            return r0
        L_0x0124:
            java.lang.String r0 = r14.toString()
            goto L_0x012f
        L_0x0129:
            r21 = r12
            r18 = r13
            r12 = r7
            r0 = 0
        L_0x012f:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            if (r0 != 0) goto L_0x017a
            r0 = r12
        L_0x0137:
            int r8 = r6.length
            if (r0 >= r8) goto L_0x0196
            r8 = r6[r0]
            r7.append(r8)
            r7.append(r5)
            int r0 = r0 + 1
            int r9 = r6.length
            if (r0 >= r9) goto L_0x0149
            r9 = 1
            goto L_0x014a
        L_0x0149:
            r9 = r12
        L_0x014a:
            boolean r8 = r10.contains(r8)
            if (r8 == 0) goto L_0x015b
            if (r9 == 0) goto L_0x015f
            r8 = r6[r0]
            boolean r8 = r10.contains(r8)
            if (r8 != 0) goto L_0x015b
            goto L_0x015f
        L_0x015b:
            r14 = r21
            r11 = 0
            goto L_0x0177
        L_0x015f:
            b9b r8 = new b9b
            r14 = r21
            java.lang.String r9 = r15.concat(r14)
            r11 = 0
            r8.<init>((java.lang.String) r9, (java.util.LinkedHashMap) r11)
            boolean r9 = r8.e(r1, r2, r3, r4)
            if (r9 == 0) goto L_0x0177
            r7.append(r8)
            r7.append(r5)
        L_0x0177:
            r21 = r14
            goto L_0x0137
        L_0x017a:
            int r1 = r6.length
        L_0x017b:
            if (r12 >= r1) goto L_0x0196
            r2 = r6[r12]
            r13 = r18
            boolean r3 = r2.equals(r13)
            if (r3 == 0) goto L_0x018b
            r7.append(r0)
            goto L_0x018e
        L_0x018b:
            r7.append(r2)
        L_0x018e:
            r7.append(r5)
            int r12 = r12 + 1
            r18 = r13
            goto L_0x017b
        L_0x0196:
            java.lang.String r0 = r7.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5c.e(java.lang.String, java.lang.String, java.lang.String, d4c, a4c):java.lang.String");
    }

    public static final String e0(byte b2) {
        return b2 == 1 ? "quotation mark '\"'" : b2 == 2 ? "string escape sequence '\\'" : b2 == 4 ? "comma ','" : b2 == 5 ? "colon ':'" : b2 == 6 ? "start of the object '{'" : b2 == 7 ? "end of the object '}'" : b2 == 8 ? "start of the array '['" : b2 == 9 ? "end of the array ']'" : b2 == 10 ? "end of the input" : b2 == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }

    public static void f(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    public static Integer f0(String str) {
        Long l;
        byte b2;
        byte b3;
        String str2 = str;
        str.getClass();
        if (!str.isEmpty()) {
            int i = 0;
            if (str2.charAt(0) == '-') {
                i = 1;
            }
            if (i != str.length()) {
                int i2 = i + 1;
                char charAt = str2.charAt(i);
                if (charAt < 128) {
                    b2 = yv7.a[charAt];
                } else {
                    byte[] bArr = yv7.a;
                    b2 = -1;
                }
                if (b2 >= 0 && b2 < 10) {
                    long j = (long) (-b2);
                    long j2 = (long) 10;
                    long j3 = Long.MIN_VALUE / j2;
                    while (true) {
                        if (i2 < str.length()) {
                            int i3 = i2 + 1;
                            char charAt2 = str2.charAt(i2);
                            if (charAt2 < 128) {
                                b3 = yv7.a[charAt2];
                            } else {
                                byte[] bArr2 = yv7.a;
                                b3 = -1;
                            }
                            if (b3 < 0 || b3 >= 10 || j < j3) {
                                break;
                            }
                            long j4 = j * j2;
                            long j5 = (long) b3;
                            if (j4 < j5 - Long.MIN_VALUE) {
                                break;
                            }
                            j = j4 - j5;
                            i2 = i3;
                        } else if (i != 0) {
                            l = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            l = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        l = null;
        if (l == null || l.longValue() != ((long) l.intValue())) {
            return null;
        }
        return Integer.valueOf(l.intValue());
    }

    public static void g(cjg cjg, Set set) {
        List<ly3> list;
        List list2;
        List list3;
        List list4;
        cjg cjg2 = cjg;
        Throwable th = null;
        String string = ((p7b) ((m7b) cjg2.b)).a.g.getString("app.pushProxyList", (String) null);
        if (M(string)) {
            hm9.m("s5c", "getProxiesFromPushString: empty string", new Object[0]);
            list = Collections.emptyList();
        } else {
            String[] split = string.split("\\s*;\\s*");
            ArrayList arrayList = new ArrayList(split.length);
            int length = split.length;
            int i = 0;
            int i2 = 0;
            while (i2 < length) {
                String[] split2 = split[i2].split("\\s*>\\s*");
                if (split2.length != 2) {
                    hm9.p("s5c", "getProxiesFromPushString: failed to parse, no country from proxies delimiter", th);
                } else {
                    String str = split2[i];
                    if (M(str)) {
                        hm9.m("s5c", "getCountriesFromString: empty string", new Object[0]);
                        list3 = Collections.emptyList();
                    } else {
                        list3 = Arrays.asList(str.split("\\s*,\\s*"));
                    }
                    String str2 = split2[1];
                    if (M(str2)) {
                        hm9.k("s5c", "getProxiesFromString: empty string");
                        list4 = Collections.emptyList();
                    } else {
                        String[] split3 = str2.replace("\"", "").split("\\s*,\\s*");
                        if (split3.length == 0) {
                            hm9.m0("s5c", "data field have no data", new Object[i]);
                            list4 = Collections.emptyList();
                        } else {
                            ArrayList arrayList2 = new ArrayList(split3.length);
                            int length2 = split3.length;
                            int i3 = i;
                            while (i3 < length2) {
                                String[] split4 = split3[i3].split("\\s*:\\s*");
                                if (split4.length >= 2) {
                                    String trim = split4[i].trim();
                                    String trim2 = split4[1].trim();
                                    if (!trim.isEmpty() && !trim2.isEmpty()) {
                                        arrayList2.add(new eh3(trim, trim2, true));
                                    }
                                }
                                i3++;
                                i = 0;
                            }
                            list4 = arrayList2;
                        }
                    }
                    arrayList.add(new ly3(list3, list4));
                }
                i2++;
                th = null;
                i = 0;
            }
            list = arrayList;
        }
        if (list != null && !list.isEmpty()) {
            String string2 = ((p7b) ((m7b) cjg2.b)).a.g.getString("app.location.country.code", (String) null);
            if (!M(string2)) {
                String trim3 = string2.toLowerCase().trim();
                for (ly3 ly3 : list) {
                    for (String lowerCase : ly3.a) {
                        if (!lowerCase.toLowerCase().trim().equals(trim3) || (list2 = ly3.b) == null || list2.isEmpty()) {
                            Set set2 = set;
                        } else {
                            set.addAll(list2);
                        }
                    }
                    Set set3 = set;
                }
            }
        }
    }

    public static boolean h(es8 es8, es8 es82) {
        if (es8.a.n() != es82.a.n()) {
            return true;
        }
        cu8 cu8 = es8.a;
        boolean n = cu8.n();
        cu8 cu82 = es82.a;
        if (!n && !cu82.n()) {
            return false;
        }
        List<l20> list = (List) cu8.z0.a;
        List list2 = (List) cu82.z0.a;
        if (list.size() != list2.size()) {
            return true;
        }
        Iterator it = list2.iterator();
        for (l20 l20 : list) {
            if (!oag.d(l20.r, ((l20) it.next()).r)) {
                return true;
            }
        }
        return false;
    }

    public static List i(int... iArr) {
        return iArr.length == 0 ? Collections.emptyList() : new o47(0, iArr.length, iArr);
    }

    public static ArrayList j(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000).array());
        return arrayList;
    }

    public static final byte k(char c2) {
        if (c2 < '~') {
            return r42.b[c2];
        }
        return 0;
    }

    public static int l(long j) {
        int i = (int) j;
        z04.j(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    public static void m(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    public static void n(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int o(Collection collection) {
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }

    public static int p(zdc zdc, ga7 ga7, View view, View view2, a aVar, boolean z) {
        if (aVar.w() == 0 || zdc.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(a.M(view) - a.M(view2)) + 1;
        }
        return Math.min(ga7.n(), ga7.c(view2) - ga7.f(view));
    }

    public static int q(zdc zdc, ga7 ga7, View view, View view2, a aVar, boolean z, boolean z2) {
        if (aVar.w() == 0 || zdc.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (zdc.b() - Math.max(a.M(view), a.M(view2))) - 1) : Math.max(0, Math.min(a.M(view), a.M(view2)));
        if (!z) {
            return max;
        }
        return Math.round((((float) max) * (((float) Math.abs(ga7.c(view2) - ga7.f(view))) / ((float) (Math.abs(a.M(view) - a.M(view2)) + 1)))) + ((float) (ga7.m() - ga7.f(view))));
    }

    public static int r(zdc zdc, ga7 ga7, View view, View view2, a aVar, boolean z) {
        if (aVar.w() == 0 || zdc.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return zdc.b();
        }
        return (int) ((((float) (ga7.c(view2) - ga7.f(view))) / ((float) (Math.abs(a.M(view) - a.M(view2)) + 1))) * ((float) zdc.b()));
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void s(java.io.File r9, java.io.File r10) {
        /*
            boolean r0 = r10.exists()
            if (r0 != 0) goto L_0x0009
            r10.createNewFile()
        L_0x0009:
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ all -> 0x0033 }
            r1.<init>(r9)     // Catch:{ all -> 0x0033 }
            java.nio.channels.FileChannel r9 = r1.getChannel()     // Catch:{ all -> 0x0033 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x002e }
            r1.<init>(r10)     // Catch:{ all -> 0x002e }
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch:{ all -> 0x002e }
            long r6 = r9.size()     // Catch:{ all -> 0x002e }
            r4 = 0
            r2 = r0
            r3 = r9
            r2.transferFrom(r3, r4, r6)     // Catch:{ all -> 0x002e }
            r9.close()
            r0.close()
            return
        L_0x002e:
            r10 = move-exception
            r8 = r0
            r0 = r9
            r9 = r8
            goto L_0x0035
        L_0x0033:
            r10 = move-exception
            r9 = r0
        L_0x0035:
            if (r0 == 0) goto L_0x003a
            r0.close()
        L_0x003a:
            if (r9 == 0) goto L_0x003f
            r9.close()
        L_0x003f:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5c.s(java.io.File, java.io.File):void");
    }

    public static long t(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[20480];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    public static String u(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (i == 0) {
                stringBuffer.append(Character.toLowerCase(charAt));
            } else if (Character.isUpperCase(charAt)) {
                stringBuffer.append('_');
                stringBuffer.append(Character.toLowerCase(charAt));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public static eh3 v(cjg cjg) {
        String D = ((p7b) ((m7b) cjg.b)).a.D();
        p7b p7b = (p7b) ((m7b) cjg.b);
        String E = p7b.a.E();
        if (M(D) || M(E)) {
            return null;
        }
        return new eh3(D, E, p7b.a.d("server.useTls", true));
    }

    public static boolean w(l20 l20) {
        if (P(l20)) {
            l20 = l20.j.d;
        }
        k20 k20 = l20.d;
        return k20 != null && !k20.g && k20.c > 0 && k20.k > 0;
    }

    public static void x(String str, a4c a4c) {
        String[] split = str.split(HTTP.CRLF);
        dcg b2 = b(true, split, a4c);
        if (b2 == null) {
            a4c.log("CodecPrefUtil", "dumpCodecs: failed to parse m=audio line");
        } else {
            a4c.log("CodecPrefUtil", "dumpCodecs: m=audio section priority:");
            for (Map.Entry value : b2.d.entrySet()) {
                a4c.log("CodecPrefUtil", "dumpCodecs: " + ((xbg) value.getValue()).b);
            }
        }
        dcg b3 = b(false, split, a4c);
        if (b3 == null) {
            a4c.log("CodecPrefUtil", "dumpCodecs: failed to parse m=video line");
            return;
        }
        a4c.log("CodecPrefUtil", "dumpCodecs: m=video section priority:");
        for (Map.Entry value2 : b3.d.entrySet()) {
            a4c.log("CodecPrefUtil", "dumpCodecs: " + ((xbg) value2.getValue()).b);
        }
    }

    public static boolean y(String str, String str2) {
        return !oag.t(str) && !oag.t(str2) && oag.d(str, str2);
    }

    public static int z(byte[] bArr) {
        boolean z = bArr.length >= 4;
        int length = bArr.length;
        if (z) {
            return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
        }
        throw new IllegalArgumentException(i24.t("array too small: %s < %s", Integer.valueOf(length), 4));
    }
}
