package defpackage;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.lifecycle.SavedStateHandlesVM;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.exoplayer2.ParserException;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpStatus;
import org.apache.http.cookie.ClientCookie;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: z7  reason: default package */
public abstract class z7 {
    public static final Object a = null;
    public static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final ye4 d = new ye4(4);
    public static final vu4 e = new Object();
    public static final ob6 f = new Object();
    public static final o84 g = new o84(16);

    public static int A(Context context) {
        int G = tu0.G(((float) 81) * fk4.d().getDisplayMetrics().density);
        int G2 = (context.getResources().getDisplayMetrics().widthPixels - (tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density) * 2)) / (G + tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density));
        if (G2 < 1) {
            return 1;
        }
        return G2;
    }

    public static String B(Context context, int i) {
        yq7 yq7;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            Object systemService = context.getSystemService("locale");
            yq7 = systemService != null ? new yq7(new zq7(ar7.a(systemService))) : yq7.b;
        } else {
            yq7 = yq7.a(od2.Q(context));
        }
        if (i2 <= 32 && !yq7.a.a.isEmpty()) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            pe3.b(configuration, yq7);
            context = context.createConfigurationContext(configuration);
        }
        return context.getString(i);
    }

    public static final ObjectAnimator C(View view, float f2) {
        return ObjectAnimator.ofFloat(view, View.TRANSLATION_Y, new float[]{view.getTranslationY(), view.getTranslationY() + f2});
    }

    public static kpa D(InputStream inputStream) {
        inputStream.skip(7);
        int read = inputStream.read() & 255;
        int read2 = inputStream.read() & 255;
        int read3 = inputStream.read() & 255;
        if (read != 157 || read2 != 1 || read3 != 42) {
            return null;
        }
        return new kpa(Integer.valueOf((inputStream.read() & 255) | ((inputStream.read() & 255) << 8)), Integer.valueOf(((inputStream.read() & 255) << 8) | (inputStream.read() & 255)));
    }

    public static kpa E(InputStream inputStream) {
        r(inputStream);
        if ((inputStream.read() & 255) != 47) {
            return null;
        }
        int read = inputStream.read();
        return new kpa(Integer.valueOf(((inputStream.read() & 255) | ((read & 63) << 8)) + 1), Integer.valueOf((((inputStream.read() & 15) << 10) | ((inputStream.read() & 255) << 2) | ((read & 192) >> 6)) + 1));
    }

    public static int F(int i) {
        return i <= 9 ? i + 48 : i + 87;
    }

    public static wva G() {
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        Map h = kp.h(allStackTraces);
        Throwable th = null;
        try {
            Throwable th2 = null;
            Throwable th3 = null;
            Throwable th4 = null;
            for (Map.Entry next : allStackTraces.entrySet()) {
                Thread thread = (Thread) next.getKey();
                StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) next.getValue();
                String str = thread.getName() + " (state=" + thread.getState() + ", pid=" + thread.getId() + ")";
                if (eae.k0(thread.getName(), "main", true)) {
                    th4 = new Throwable(str);
                    th4.setStackTrace(stackTraceElementArr);
                } else if (th3 != null) {
                    Throwable th5 = new Throwable(str, th3);
                    th5.setStackTrace(stackTraceElementArr);
                    th3 = th5;
                } else {
                    th2 = new Throwable(str);
                    th2.setStackTrace(stackTraceElementArr);
                    th3 = th2;
                }
            }
            if (!(th4 == null || th2 == null)) {
                th2.initCause(th4);
            }
            th = th3;
        } catch (Throwable unused) {
        }
        return new wva(h, 11, th);
    }

    public static final boolean H(RecyclerView recyclerView, int i) {
        View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
        if (childAt == null) {
            return false;
        }
        return RecyclerView.R(childAt) == i;
    }

    public static boolean I(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    public static e J(s02 s02, boolean z) {
        int i = s02.i(5);
        if (i == 31) {
            i = s02.i(6) + 32;
        }
        int x = x(s02);
        int i2 = s02.i(4);
        String h = z7b.h(19, i, "mp4a.40.");
        if (i == 5 || i == 29) {
            x = x(s02);
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
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Unsupported audio object type: ");
                        sb.append(i);
                        throw ParserException.c(sb.toString());
                }
            }
            s02.h();
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
                            StringBuilder sb2 = new StringBuilder(33);
                            sb2.append("Unsupported epConfig: ");
                            sb2.append(i4);
                            throw ParserException.c(sb2.toString());
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i5 = c[i2];
        if (i5 != -1) {
            return new e(x, i5, h);
        }
        throw ParserException.a((RuntimeException) null, (String) null);
    }

    public static int K(int i, wpa wpa) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return wpa.u() + 1;
            case 7:
                return wpa.A() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case Protos.Attaches.Attach.PRESENT /*12*/:
            case 13:
            case Protos.Attaches.Attach.LOCATION /*14*/:
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String L(java.io.DataInputStream r10, defpackage.y7g r11) {
        /*
            int r0 = r10.readUnsignedByte()
            r1 = 15
            r0 = r0 & r1
            if (r0 == r1) goto L_0x0027
            switch(r0) {
                case 8: goto L_0x0022;
                case 9: goto L_0x001d;
                case 10: goto L_0x0018;
                default: goto L_0x000c;
            }
        L_0x000c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Extra too long"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L_0x0018:
            int r0 = r10.readInt()
            goto L_0x0028
        L_0x001d:
            int r0 = r10.readUnsignedShort()
            goto L_0x0028
        L_0x0022:
            int r0 = r10.readUnsignedByte()
            goto L_0x0028
        L_0x0027:
            r0 = -1
        L_0x0028:
            java.lang.Object r1 = r11.c
            byte[] r1 = (byte[]) r1
            java.lang.Object r2 = r11.b
            char[] r2 = (char[]) r2
            int r3 = r1.length
            if (r3 >= r0) goto L_0x003f
        L_0x0033:
            int r3 = r3 << 1
            if (r3 < r0) goto L_0x0033
            byte[] r1 = new byte[r3]
            r11.c = r1
            char[] r2 = new char[r3]
            r11.b = r2
        L_0x003f:
            r11 = 0
            r10.readFully(r1, r11, r0)
            r10 = r11
            r3 = r10
        L_0x0045:
            if (r10 >= r0) goto L_0x0059
            byte r4 = r1[r10]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 <= r5) goto L_0x0050
            goto L_0x0059
        L_0x0050:
            int r10 = r10 + 1
            int r5 = r3 + 1
            char r4 = (char) r4
            r2[r3] = r4
            r3 = r5
            goto L_0x0045
        L_0x0059:
            if (r10 >= r0) goto L_0x00ed
            byte r4 = r1[r10]
            r5 = r4 & 255(0xff, float:3.57E-43)
            int r6 = r5 >> 4
            java.lang.String r7 = "malformed input: partial character at end"
            r8 = 128(0x80, float:1.794E-43)
            java.lang.String r9 = "malformed input around byte "
            switch(r6) {
                case 0: goto L_0x00e3;
                case 1: goto L_0x00e3;
                case 2: goto L_0x00e3;
                case 3: goto L_0x00e3;
                case 4: goto L_0x00e3;
                case 5: goto L_0x00e3;
                case 6: goto L_0x00e3;
                case 7: goto L_0x00e3;
                case 8: goto L_0x006a;
                case 9: goto L_0x006a;
                case 10: goto L_0x006a;
                case 11: goto L_0x006a;
                case 12: goto L_0x00b8;
                case 13: goto L_0x00b8;
                case 14: goto L_0x0074;
                default: goto L_0x006a;
            }
        L_0x006a:
            java.io.UTFDataFormatException r11 = new java.io.UTFDataFormatException
            java.lang.String r10 = defpackage.zr6.h(r10, r9)
            r11.<init>(r10)
            throw r11
        L_0x0074:
            int r5 = r10 + 3
            if (r5 > r0) goto L_0x00b2
            int r6 = r10 + 1
            byte r6 = r1[r6]
            r7 = r6 & 192(0xc0, float:2.69E-43)
            if (r7 != r8) goto L_0x00a6
            int r10 = r10 + 2
            byte r10 = r1[r10]
            r7 = r10 & 192(0xc0, float:2.69E-43)
            if (r7 != r8) goto L_0x009c
            int r7 = r3 + 1
            r4 = r4 & 15
            int r4 = r4 << 12
            r6 = r6 & 63
            int r6 = r6 << 6
            r4 = r4 | r6
            r10 = r10 & 63
            r10 = r10 | r4
            char r10 = (char) r10
            r2[r3] = r10
            r10 = r5
            r3 = r7
            goto L_0x0059
        L_0x009c:
            java.io.UTFDataFormatException r10 = new java.io.UTFDataFormatException
            java.lang.String r11 = defpackage.zr6.h(r5, r9)
            r10.<init>(r11)
            throw r10
        L_0x00a6:
            java.io.UTFDataFormatException r11 = new java.io.UTFDataFormatException
            int r10 = r10 + 2
            java.lang.String r10 = defpackage.zr6.h(r10, r9)
            r11.<init>(r10)
            throw r11
        L_0x00b2:
            java.io.UTFDataFormatException r10 = new java.io.UTFDataFormatException
            r10.<init>(r7)
            throw r10
        L_0x00b8:
            int r5 = r10 + 2
            if (r5 > r0) goto L_0x00dd
            int r10 = r10 + 1
            byte r10 = r1[r10]
            r6 = r10 & 192(0xc0, float:2.69E-43)
            if (r6 != r8) goto L_0x00d3
            int r6 = r3 + 1
            r4 = r4 & 31
            int r4 = r4 << 6
            r10 = r10 & 63
            r10 = r10 | r4
            char r10 = (char) r10
            r2[r3] = r10
            r10 = r5
            r3 = r6
            goto L_0x0059
        L_0x00d3:
            java.io.UTFDataFormatException r10 = new java.io.UTFDataFormatException
            java.lang.String r11 = defpackage.zr6.h(r5, r9)
            r10.<init>(r11)
            throw r10
        L_0x00dd:
            java.io.UTFDataFormatException r10 = new java.io.UTFDataFormatException
            r10.<init>(r7)
            throw r10
        L_0x00e3:
            int r10 = r10 + 1
            int r4 = r3 + 1
            char r5 = (char) r5
            r2[r3] = r5
            r3 = r4
            goto L_0x0059
        L_0x00ed:
            java.lang.String r10 = new java.lang.String
            r10.<init>(r2, r11, r3)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7.L(java.io.DataInputStream, y7g):java.lang.String");
    }

    public static final Object M(Object obj) {
        return obj instanceof lb3 ? new njc(((lb3) obj).a) : obj;
    }

    public static Intent N(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
        int i2 = i & 2;
        if (i2 == 0 && (i & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        } else if (i2 == 0 || (i & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? pt3.a(context, broadcastReceiver, intentFilter, str, (Handler) null, i) : nt3.a(context, broadcastReceiver, intentFilter, str, (Handler) null, i);
        } else {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
    }

    public static void O(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (i2 < strArr.length) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i2));
                }
                i2++;
            } else {
                throw new IllegalArgumentException(zr6.l(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[(strArr.length - size)] : strArr;
        if (size > 0) {
            if (size != strArr.length) {
                int i3 = 0;
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    if (!hashSet.contains(Integer.valueOf(i4))) {
                        strArr2[i3] = strArr[i4];
                        i3++;
                    }
                }
            } else {
                return;
            }
        }
        if (activity instanceof y7) {
            ((y7) activity).getClass();
        }
        v7.b(activity, strArr, i);
    }

    public static int P(int i, int i2, Context context) {
        TypedValue C = kq0.C(context, i);
        return (C == null || C.type != 16) ? i2 : C.data;
    }

    public static TimeInterpolator Q(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!I(valueOf, "cubic-bezier") && !I(valueOf, ClientCookie.PATH_ATTR)) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (I(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return rra.b(s(0, split), s(1, split), s(2, split), s(3, split));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            } else if (I(valueOf, ClientCookie.PATH_ATTR)) {
                return rra.c(m6d.i(valueOf.substring(5, valueOf.length() - 1)));
            } else {
                throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
            }
        } else {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
    }

    public static final long R(int i, kt4 kt4) {
        if (kt4.compareTo(kt4.SECONDS) > 0) {
            return S((long) i, kt4);
        }
        return j(kt4.NANOSECONDS.a.convert((long) i, kt4.a));
    }

    public static final long S(long j, kt4 kt4) {
        kt4 kt42 = kt4.NANOSECONDS;
        long convert = kt4.a.convert(4611686018426999999L, kt42.a);
        int i = ((-convert) > j ? 1 : ((-convert) == j ? 0 : -1));
        TimeUnit timeUnit = kt4.a;
        return (i > 0 || j > convert) ? h(ote.f(kt4.MILLISECONDS.a.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L)) : j(kt42.a.convert(j, timeUnit));
    }

    public static final Object T(Object obj, m56 m56) {
        Throwable a2 = pjc.a(obj);
        return a2 == null ? m56 != null ? new mb3(obj, m56) : obj : new lb3(a2, false);
    }

    public static String U(int i) {
        switch (i) {
            case 0:
                return "eof";
            case 34:
                return "string";
            case 39:
                return "name";
            case 44:
                return "`,`";
            case 49:
                return "number";
            case 58:
                return "`:`";
            case 91:
                return "`[`";
            case 93:
                return "`]`";
            case 98:
                return "boolean";
            case 110:
                return "null";
            case 123:
                return "`{`";
            case 125:
                return "`}`";
            default:
                throw new AssertionError();
        }
    }

    public static final void V(DataOutputStream dataOutputStream, String str, z3f z3f) {
        dataOutputStream.writeUTF(str);
        dataOutputStream.writeByte(z3f.a);
    }

    public static final void W(DataOutputStream dataOutputStream, String str, z3f z3f, z3f z3f2, String str2, y7g y7g) {
        int i;
        if (str2.length() < 21845) {
            V(dataOutputStream, str, z3f);
            dataOutputStream.writeUTF(str2);
            return;
        }
        V(dataOutputStream, str, z3f2);
        int length = str2.length();
        char[] cArr = (char[]) y7g.b;
        int length2 = cArr.length;
        if (length2 < length) {
            do {
                length2 <<= 1;
            } while (length2 < length);
            cArr = new char[length2];
            y7g.b = cArr;
        }
        str2.getChars(0, length, cArr, 0);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 3;
            if (i2 >= length) {
                break;
            }
            char c2 = cArr[i2];
            if (c2 <= 127) {
                i = 1;
            } else if (c2 <= 2047) {
                i = 2;
            }
            i3 += i;
            i2++;
        }
        int a2 = z3f2.a();
        byte[] bArr = (byte[]) y7g.c;
        if (i3 <= 127) {
            bArr[0] = (byte) (a2 | 8);
            bArr[1] = (byte) i3;
            i = 2;
        } else if (i3 <= 32767) {
            bArr[0] = (byte) (a2 | 9);
            bArr[1] = (byte) (i3 >> 8);
            bArr[2] = (byte) i3;
        } else {
            bArr[0] = (byte) (a2 | 10);
            bArr[1] = (byte) (i3 >> 24);
            bArr[2] = (byte) ((i3 >> 16) & 255);
            bArr[3] = (byte) ((i3 >> 8) & 255);
            bArr[4] = (byte) i3;
            i = 5;
        }
        dataOutputStream.write(bArr, 0, i);
        byte[] bArr2 = (byte[]) y7g.c;
        int length3 = bArr2.length;
        if (length3 < i3) {
            do {
                length3 <<= 1;
            } while (length3 < i3);
            bArr2 = new byte[length3];
            y7g.c = bArr2;
        }
        if (length == i3) {
            for (int i4 = 0; i4 < length; i4++) {
                bArr2[i4] = (byte) cArr[i4];
            }
        } else {
            int i5 = 0;
            for (int i6 = 0; i6 < length; i6++) {
                char c3 = cArr[i6];
                if (c3 <= 127) {
                    bArr2[i5] = (byte) c3;
                    i5++;
                } else if (c3 <= 2047) {
                    int i7 = i5 + 1;
                    bArr2[i5] = (byte) ((c3 >> 6) | 192);
                    i5 += 2;
                    bArr2[i7] = (byte) ((c3 & '?') | 128);
                } else {
                    bArr2[i5] = (byte) ((c3 >> 12) | 224);
                    int i8 = i5 + 2;
                    bArr2[i5 + 1] = (byte) (((c3 >> 6) & 63) | 128);
                    i5 += 3;
                    bArr2[i8] = (byte) ((c3 & '?') | 128);
                }
            }
        }
        dataOutputStream.write(bArr2, 0, i3);
    }

    public static wbd a(wbd wbd) {
        ky7 ky7 = wbd.a;
        ky7.b();
        return ky7.t0 > 0 ? wbd : wbd.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0088, code lost:
        if (r13 == r1.g) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        if ((r20.u() * 1000) == r1) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a5, code lost:
        if (r6 == r1) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(defpackage.wpa r20, defpackage.qm5 r21, int r22, defpackage.lh4 r23) {
        /*
            r0 = r20
            r1 = r21
            r2 = 10
            r3 = 1
            int r4 = r0.b
            long r5 = r20.w()
            r7 = 16
            long r7 = r5 >>> r7
            r9 = r22
            long r9 = (long) r9
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r10 = 0
            if (r9 == 0) goto L_0x001a
            return r10
        L_0x001a:
            r11 = 1
            long r7 = r7 & r11
            int r7 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x0023
            r7 = r3
            goto L_0x0024
        L_0x0023:
            r7 = r10
        L_0x0024:
            r8 = 12
            long r13 = r5 >> r8
            r15 = 15
            long r13 = r13 & r15
            int r9 = (int) r13
            r13 = 8
            long r13 = r5 >> r13
            long r13 = r13 & r15
            int r13 = (int) r13
            r14 = 4
            long r17 = r5 >> r14
            long r14 = r17 & r15
            int r14 = (int) r14
            long r15 = r5 >> r3
            r17 = 7
            r19 = r9
            long r8 = r15 & r17
            int r8 = (int) r8
            long r5 = r5 & r11
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 != 0) goto L_0x0048
            r5 = r3
            goto L_0x0049
        L_0x0048:
            r5 = r10
        L_0x0049:
            r6 = 7
            if (r14 > r6) goto L_0x0052
            int r6 = r1.h
            int r6 = r6 - r3
            if (r14 != r6) goto L_0x00c3
            goto L_0x0059
        L_0x0052:
            if (r14 > r2) goto L_0x00c3
            int r6 = r1.h
            r9 = 2
            if (r6 != r9) goto L_0x00c3
        L_0x0059:
            if (r8 != 0) goto L_0x005c
            goto L_0x0060
        L_0x005c:
            int r6 = r1.j
            if (r8 != r6) goto L_0x00c3
        L_0x0060:
            if (r5 != 0) goto L_0x00c3
            long r5 = r20.B()     // Catch:{ NumberFormatException -> 0x00c3 }
            if (r7 == 0) goto L_0x006b
        L_0x0068:
            r7 = r23
            goto L_0x0070
        L_0x006b:
            int r7 = r1.c
            long r7 = (long) r7
            long r5 = r5 * r7
            goto L_0x0068
        L_0x0070:
            r7.a = r5
            r5 = r19
            int r5 = K(r5, r0)
            r6 = -1
            if (r5 == r6) goto L_0x00c3
            int r6 = r1.c
            if (r5 > r6) goto L_0x00c3
            if (r13 != 0) goto L_0x0082
            goto L_0x00a7
        L_0x0082:
            r5 = 11
            if (r13 > r5) goto L_0x008b
            int r1 = r1.g
            if (r13 != r1) goto L_0x00c3
            goto L_0x00a7
        L_0x008b:
            int r1 = r1.f
            r5 = 12
            if (r13 != r5) goto L_0x009a
            int r2 = r20.u()
            int r2 = r2 * 1000
            if (r2 != r1) goto L_0x00c3
            goto L_0x00a7
        L_0x009a:
            r5 = 14
            if (r13 > r5) goto L_0x00c3
            int r6 = r20.A()
            if (r13 != r5) goto L_0x00a5
            int r6 = r6 * r2
        L_0x00a5:
            if (r6 != r1) goto L_0x00c3
        L_0x00a7:
            int r1 = r20.u()
            int r2 = r0.b
            byte[] r0 = r0.a
            int r2 = r2 - r3
            int r5 = defpackage.oaf.a
            r5 = r10
        L_0x00b3:
            if (r4 >= r2) goto L_0x00c0
            byte r6 = r0[r4]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 ^ r6
            int[] r6 = defpackage.oaf.q
            r5 = r6[r5]
            int r4 = r4 + r3
            goto L_0x00b3
        L_0x00c0:
            if (r1 != r5) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r3 = r10
        L_0x00c4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7.b(wpa, qm5, int, lh4):boolean");
    }

    public static int c(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : jv9.a(new pv9(context).b) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static boolean d(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        h37 h37 = new h37(0, bArr.length - 1, 1);
        if (!(h37 instanceof Collection) || !((Collection) h37).isEmpty()) {
            Iterator it = h37.iterator();
            while (((i37) it).c) {
                int a2 = ((i37) it).a();
                if (((byte) str.charAt(a2)) != bArr[a2]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final ka6 e(bg1 bg1, boolean z) {
        try {
            return f46.j(bg1, new JSONObject().put("sdk", (Object) new JSONObject().put("type", (Object) "bad-net").put("value", z)));
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static final csc f(wh9 wh9) {
        vu4 vu4 = e;
        LinkedHashMap linkedHashMap = wh9.a;
        isc isc = (isc) linkedHashMap.get(vu4);
        if (isc != null) {
            ynf ynf = (ynf) linkedHashMap.get(f);
            if (ynf != null) {
                Bundle bundle = (Bundle) linkedHashMap.get(g);
                String str = (String) linkedHashMap.get(xxc.Z);
                if (str != null) {
                    hsc d2 = isc.y().d();
                    fsc fsc = d2 instanceof fsc ? (fsc) d2 : null;
                    if (fsc != null) {
                        SavedStateHandlesVM y = y(ynf);
                        csc csc = (csc) y.b.get(str);
                        if (csc != null) {
                            return csc;
                        }
                        Class[] clsArr = csc.f;
                        fsc.b();
                        Bundle bundle2 = fsc.c;
                        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
                        Bundle bundle4 = fsc.c;
                        if (bundle4 != null) {
                            bundle4.remove(str);
                        }
                        Bundle bundle5 = fsc.c;
                        if (bundle5 != null && bundle5.isEmpty()) {
                            fsc.c = null;
                        }
                        csc h = lz7.h(bundle3, bundle);
                        y.b.put(str, h);
                        return h;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [rm4, java.lang.Object] */
    public static final rm4 g(k56 k56) {
        i45 i45 = new i45(new rxd(11, k56), 1);
        ? obj = new Object();
        obj.b = rm4.c;
        obj.a = i45;
        return obj;
    }

    public static final long h(long j) {
        long j2 = (j << 1) + 1;
        int i = ft4.o;
        int i2 = ht4.a;
        return j2;
    }

    public static final long i(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? h(ote.f(j, -4611686018427387903L, 4611686018427387903L)) : j(j * ((long) 1000000));
    }

    public static final long j(long j) {
        long j2 = j << 1;
        int i = ft4.o;
        int i2 = ht4.a;
        return j2;
    }

    public static final void k(isc isc) {
        fg7 fg7 = isc.Q().d;
        if (fg7 != fg7.b && fg7 != fg7.c) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (isc.y().d() == null) {
            fsc fsc = new fsc(isc.y(), (ynf) isc);
            isc.y().f("androidx.lifecycle.internal.SavedStateHandlesProvider", fsc);
            isc.Q().a(new fdc(7, fsc));
        }
    }

    public static final int l(RecyclerView recyclerView, float f2) {
        LinearLayoutManager t = t(recyclerView);
        if (t == null) {
            throw new IllegalStateException("Only LinearLayoutManager is supported");
        } else if (f2 == 1.0f) {
            return t.X0();
        } else {
            if (f2 == 0.0f) {
                return t.Y0();
            }
            int Y0 = t.Y0();
            View r = t.r(Y0);
            return (r == null || ((float) (recyclerView.getMeasuredHeight() - r.getTop())) < ((float) r.getMeasuredHeight()) * f2) ? t.X0() : Y0;
        }
    }

    public static zwe m(RecyclerView recyclerView) {
        zwe zwe = new zwe(new ae3(3));
        zwe.v(recyclerView);
        return zwe;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r5.c == r8.hashCode()) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList n(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            tic r1 = new tic
            r1.<init>(r0, r8)
            java.lang.Object r2 = defpackage.vic.c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = defpackage.vic.b     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x003c }
            r4 = 0
            if (r3 == 0) goto L_0x0050
            int r5 = r3.size()     // Catch:{ all -> 0x003c }
            if (r5 <= 0) goto L_0x0050
            java.lang.Object r5 = r3.get(r9)     // Catch:{ all -> 0x003c }
            sic r5 = (defpackage.sic) r5     // Catch:{ all -> 0x003c }
            if (r5 == 0) goto L_0x0050
            android.content.res.Configuration r6 = r5.b     // Catch:{ all -> 0x003c }
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch:{ all -> 0x003c }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x003c }
            if (r6 == 0) goto L_0x004d
            if (r8 != 0) goto L_0x003f
            int r6 = r5.c     // Catch:{ all -> 0x003c }
            if (r6 == 0) goto L_0x0049
            goto L_0x003f
        L_0x003c:
            r8 = move-exception
            goto L_0x00b0
        L_0x003f:
            if (r8 == 0) goto L_0x004d
            int r6 = r5.c     // Catch:{ all -> 0x003c }
            int r7 = r8.hashCode()     // Catch:{ all -> 0x003c }
            if (r6 != r7) goto L_0x004d
        L_0x0049:
            android.content.res.ColorStateList r3 = r5.a     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            goto L_0x0052
        L_0x004d:
            r3.remove(r9)     // Catch:{ all -> 0x003c }
        L_0x0050:
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            r3 = r4
        L_0x0052:
            if (r3 == 0) goto L_0x0055
            goto L_0x00af
        L_0x0055:
            java.lang.ThreadLocal r2 = defpackage.vic.a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L_0x0067
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L_0x0067:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L_0x0076
            r3 = 31
            if (r2 > r3) goto L_0x0076
            goto L_0x007e
        L_0x0076:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = defpackage.r63.a(r0, r2, r8)     // Catch:{ Exception -> 0x007e }
        L_0x007e:
            if (r4 == 0) goto L_0x00ab
            java.lang.Object r2 = defpackage.vic.c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = defpackage.vic.b     // Catch:{ all -> 0x0096 }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x0096 }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x0096 }
            if (r3 != 0) goto L_0x0098
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch:{ all -> 0x0096 }
            r3.<init>()     // Catch:{ all -> 0x0096 }
            r0.put(r1, r3)     // Catch:{ all -> 0x0096 }
            goto L_0x0098
        L_0x0096:
            r8 = move-exception
            goto L_0x00a9
        L_0x0098:
            sic r0 = new sic     // Catch:{ all -> 0x0096 }
            android.content.res.Resources r1 = r1.a     // Catch:{ all -> 0x0096 }
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch:{ all -> 0x0096 }
            r0.<init>(r4, r1, r8)     // Catch:{ all -> 0x0096 }
            r3.append(r9, r0)     // Catch:{ all -> 0x0096 }
            monitor-exit(r2)     // Catch:{ all -> 0x0096 }
            r3 = r4
            goto L_0x00af
        L_0x00a9:
            monitor-exit(r2)     // Catch:{ all -> 0x0096 }
            throw r8
        L_0x00ab:
            android.content.res.ColorStateList r3 = defpackage.ric.b(r0, r9, r8)
        L_0x00af:
            return r3
        L_0x00b0:
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7.n(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static final ObjectAnimator o(View view, boolean z) {
        float f2 = 1.0f;
        float f3 = z ? 0.0f : 1.0f;
        if (!z) {
            f2 = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, View.ALPHA, new float[]{f3, f2});
        ofFloat.addListener(new ag(view, z));
        return ofFloat;
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [vx5[], java.io.Serializable] */
    public static sh0 p(Context context, bg4 bg4) {
        Cursor cursor;
        bg4 bg42 = bg4;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = (String) bg42.b;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider != null) {
            String str2 = resolveContentProvider.packageName;
            String str3 = (String) bg42.c;
            if (str2.equals(str3)) {
                Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature byteArray : signatureArr) {
                    arrayList.add(byteArray.toByteArray());
                }
                ye4 ye4 = d;
                Collections.sort(arrayList, ye4);
                List list = (List) bg42.X;
                if (list == null) {
                    list = c37.x(resources, 0);
                }
                int i = 0;
                loop1:
                while (true) {
                    cursor = null;
                    if (i >= list.size()) {
                        resolveContentProvider = null;
                        break;
                    }
                    ArrayList arrayList2 = new ArrayList((Collection) list.get(i));
                    Collections.sort(arrayList2, ye4);
                    if (arrayList.size() == arrayList2.size()) {
                        int i2 = 0;
                        while (i2 < arrayList.size()) {
                            if (Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                                i2++;
                            }
                        }
                        break loop1;
                    }
                    i++;
                }
                if (resolveContentProvider == null) {
                    return new sh0(1, (Serializable) null, 7);
                }
                String str4 = resolveContentProvider.authority;
                ArrayList arrayList3 = new ArrayList();
                Uri build = new Uri.Builder().scheme("content").authority(str4).build();
                Uri build2 = new Uri.Builder().scheme("content").authority(str4).appendPath("file").build();
                ContentProviderClient acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(build);
                try {
                    String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                    String[] strArr2 = {(String) bg42.o};
                    if (acquireUnstableContentProviderClient != null) {
                        try {
                            cursor = acquireUnstableContentProviderClient.query(build, strArr, "query = ?", strArr2, (String) null, (CancellationSignal) null);
                        } catch (RemoteException unused) {
                        }
                    }
                    if (cursor != null) {
                        if (cursor.getCount() > 0) {
                            int columnIndex = cursor.getColumnIndex("result_code");
                            arrayList3 = new ArrayList();
                            int columnIndex2 = cursor.getColumnIndex("_id");
                            int columnIndex3 = cursor.getColumnIndex("file_id");
                            int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                            int columnIndex5 = cursor.getColumnIndex("font_weight");
                            int columnIndex6 = cursor.getColumnIndex("font_italic");
                            while (cursor.moveToNext()) {
                                arrayList3.add(new vx5(columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3)), columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : HttpStatus.SC_BAD_REQUEST, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, columnIndex != -1 ? cursor.getInt(columnIndex) : 0));
                            }
                        }
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    return new sh0(0, (Serializable) (vx5[]) arrayList3.toArray(new vx5[0]), 7);
                } catch (Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (acquireUnstableContentProviderClient != null) {
                        acquireUnstableContentProviderClient.close();
                    }
                    throw th;
                }
            } else {
                throw new PackageManager.NameNotFoundException(rh4.k("Found content provider ", str, ", but package was not ", str3));
            }
        } else {
            throw new PackageManager.NameNotFoundException(wg0.i("No package found for authority: ", str));
        }
    }

    public static final GridLayoutManager q(RecyclerView recyclerView) {
        a layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return (GridLayoutManager) layoutManager;
        }
        return null;
    }

    public static void r(InputStream inputStream) {
        inputStream.read();
        inputStream.read();
        inputStream.read();
        inputStream.read();
    }

    public static float s(int i, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static final LinearLayoutManager t(RecyclerView recyclerView) {
        a layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r8v10, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.animation.ValueAnimator u(android.widget.Space r7, defpackage.nv3 r8, defpackage.nv3 r9, int r10) {
        /*
            r0 = r10 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0006
            r8 = r1
        L_0x0006:
            r10 = r10 & 2
            if (r10 == 0) goto L_0x000b
            r9 = r1
        L_0x000b:
            kl7 r10 = defpackage.j1e.l()
            r0 = -1
            r2 = 1
            r3 = 0
            if (r8 == 0) goto L_0x0053
            int r4 = r8.b
            int r5 = r8.f
            int r4 = r4 - r5
            android.view.ViewGroup$LayoutParams r5 = r7.getLayoutParams()
            boolean r6 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r6 == 0) goto L_0x0024
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            goto L_0x0025
        L_0x0024:
            r5 = r1
        L_0x0025:
            if (r5 == 0) goto L_0x002a
            int r5 = r5.topMargin
            goto L_0x002b
        L_0x002a:
            r5 = r3
        L_0x002b:
            boolean r8 = r8.a
            if (r8 == 0) goto L_0x0031
            r8 = r2
            goto L_0x0032
        L_0x0031:
            r8 = r0
        L_0x0032:
            int r8 = r8 * r4
            int r8 = r8 + r5
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x003f
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            goto L_0x0040
        L_0x003f:
            r4 = r1
        L_0x0040:
            if (r4 == 0) goto L_0x0045
            int r4 = r4.topMargin
            goto L_0x0046
        L_0x0045:
            r4 = r3
        L_0x0046:
            int[] r8 = new int[]{r4, r8}
            java.lang.String r4 = "top"
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r4, r8)
            r10.add(r8)
        L_0x0053:
            if (r9 == 0) goto L_0x0091
            int r8 = r9.b
            int r4 = r9.f
            int r8 = r8 - r4
            android.view.ViewGroup$LayoutParams r4 = r7.getLayoutParams()
            boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x0065
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            goto L_0x0066
        L_0x0065:
            r4 = r1
        L_0x0066:
            if (r4 == 0) goto L_0x006b
            int r4 = r4.bottomMargin
            goto L_0x006c
        L_0x006b:
            r4 = r3
        L_0x006c:
            boolean r9 = r9.a
            if (r9 == 0) goto L_0x0071
            r0 = r2
        L_0x0071:
            int r0 = r0 * r8
            int r0 = r0 + r4
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            boolean r9 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L_0x007e
            r1 = r8
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
        L_0x007e:
            if (r1 == 0) goto L_0x0083
            int r8 = r1.bottomMargin
            goto L_0x0084
        L_0x0083:
            r8 = r3
        L_0x0084:
            int[] r8 = new int[]{r8, r0}
            java.lang.String r9 = "bottom"
            android.animation.PropertyValuesHolder r8 = android.animation.PropertyValuesHolder.ofInt(r9, r8)
            r10.add(r8)
        L_0x0091:
            kl7 r8 = defpackage.j1e.d(r10)
            android.animation.PropertyValuesHolder[] r9 = new android.animation.PropertyValuesHolder[r3]
            java.lang.Object[] r8 = r8.toArray(r9)
            android.animation.PropertyValuesHolder[] r8 = (android.animation.PropertyValuesHolder[]) r8
            int r9 = r8.length
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r9)
            android.animation.PropertyValuesHolder[] r8 = (android.animation.PropertyValuesHolder[]) r8
            android.animation.ValueAnimator r8 = android.animation.ValueAnimator.ofPropertyValuesHolder(r8)
            zf r9 = new zf
            r10 = 0
            r9.<init>(r7, r10)
            r8.addUpdateListener(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z7.u(android.widget.Space, nv3, nv3, int):android.animation.ValueAnimator");
    }

    public static String v(String str) {
        if (oag.t(str)) {
            hm9.k0("z7", (Exception) null, "getPhotoToken: response is empty or null", Arrays.copyOf(new Object[0], 0));
            return null;
        }
        try {
            ArrayList w = w(str);
            if (w.size() > 0) {
                return (String) w.get(0);
            }
            return null;
        } catch (Exception e2) {
            hm9.p("z7", "getPhotoToken: exception while getting photo token from response", e2);
            return null;
        }
    }

    public static ArrayList w(String str) {
        try {
            ArrayList arrayList = new ArrayList();
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("error_msg")) {
                hm9.m("z7", "getPhotoToken: got json error: %s", jSONObject.getString("error_msg"));
                return arrayList;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("photos");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                arrayList.add(jSONObject2.getJSONObject(keys.next()).getString(ApiProtocol.KEY_TOKEN));
            }
            return arrayList;
        } catch (Exception e2) {
            hm9.m("z7", "exception while parsing photo upload response: " + e2.getMessage(), new Object[0]);
            throw e2;
        }
    }

    public static int x(s02 s02) {
        int i = s02.i(4);
        if (i == 15) {
            return s02.i(24);
        }
        if (i < 13) {
            return b[i];
        }
        throw ParserException.a((RuntimeException) null, (String) null);
    }

    public static final SavedStateHandlesVM y(ynf ynf) {
        return (SavedStateHandlesVM) new k8g((Object) ynf.w(), new Object(), ynf instanceof pi6 ? ((pi6) ynf).p() : jz3.b).s(nec.a(SavedStateHandlesVM.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static String z(String str) {
        if (oag.t(str)) {
            hm9.m0("z7", "getStickerToken: response is empty or null", new Object[0]);
            return null;
        }
        try {
            JSONObject jSONObject = new JSONArray(str).getJSONObject(0);
            if (jSONObject.has(ApiProtocol.KEY_TOKEN)) {
                return jSONObject.getString(ApiProtocol.KEY_TOKEN);
            }
            return null;
        } catch (JSONException e2) {
            hm9.p("z7", "getStickerToken: error", e2);
            return null;
        }
    }
}
