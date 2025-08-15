package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Pair;
import android.util.Size;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import io.reactivex.rxjava3.exceptions.CompositeException;
import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.apache.http.HttpHost;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: j47  reason: default package */
public abstract class j47 {
    public static final ph4 X = new ph4((Bundle) null);
    public static final int[] Y = new int[2];
    public static final /* synthetic */ int Z = 0;
    public static final int[] b = new int[0];
    public static final long[] c = new long[0];
    public static final Object[] o = new Object[0];
    public static volatile qj3 s0;
    public static volatile b66 t0;
    public static volatile b66 u0;
    public static volatile b66 v0;
    public final /* synthetic */ int a;

    public /* synthetic */ j47(int i) {
        this.a = i;
    }

    public static void A() {
        if (maf.a >= 18) {
            Trace.endSection();
        }
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static yie C(String str) {
        LinkedHashMap linkedHashMap;
        Set set;
        String str2;
        String str3;
        String str4;
        Object obj;
        String string;
        JSONObject jSONObject = new JSONObject(str);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        JSONObject jSONObject2 = jSONObject.getJSONObject("properties");
        JSONArray names = jSONObject2.names();
        int length = names != null ? names.length() : 0;
        for (int i = 0; i < length; i++) {
            if (!(names == null || (string = names.getString(i)) == null)) {
                linkedHashMap2.put(string, jSONObject2.getString(string));
            }
        }
        String str5 = "versionName";
        String string2 = jSONObject.getString(str5);
        long j = jSONObject.getLong("versionCode");
        String str6 = "packageName";
        String optString = jSONObject.optString(str6);
        if (optString.length() <= 0) {
            optString = null;
        }
        if (optString == null) {
            try {
                Context context = kye.d;
                if (context == null) {
                    context = null;
                }
                obj = context.getPackageName();
            } catch (Throwable th) {
                obj = new njc(th);
            }
            if (pjc.a(obj) != null) {
                obj = "NA";
            }
            optString = (String) obj;
        }
        String str7 = "environment";
        String optString2 = jSONObject.optString(str7);
        if (optString2.length() <= 0) {
            optString2 = null;
        }
        String optString3 = jSONObject.optString("buildUuid");
        if (optString3.length() <= 0) {
            optString3 = null;
        }
        String optString4 = jSONObject.optString("sessionUuid");
        if (optString4.length() <= 0) {
            optString4 = null;
        }
        if (optString4 == null) {
            optString4 = UUID.randomUUID().toString();
        }
        String string3 = jSONObject.getString("device");
        String string4 = jSONObject.getString("deviceId");
        String string5 = jSONObject.getString("vendor");
        String string6 = jSONObject.getString("osVersion");
        boolean z = jSONObject.getBoolean("inBackground");
        boolean z2 = jSONObject.getBoolean("isRooted");
        JSONArray optJSONArray = jSONObject.optJSONArray("hostedLibrariesInfo");
        if (optJSONArray == null || optJSONArray.length() == 0) {
            linkedHashMap = linkedHashMap2;
            set = wz4.a;
        } else {
            wbd wbd = new wbd();
            int length2 = optJSONArray.length();
            linkedHashMap = linkedHashMap2;
            int i2 = 0;
            while (i2 < length2) {
                int i3 = length2;
                JSONObject jSONObject3 = optJSONArray.getJSONObject(i2);
                JSONArray jSONArray = optJSONArray;
                String string7 = jSONObject3.getString(str6);
                String str8 = str6;
                String string8 = jSONObject3.getString(str5);
                String optString5 = jSONObject3.optString("buildUuid");
                if (optString5.length() > 0) {
                    String str9 = optString5;
                    str2 = str5;
                    str3 = str9;
                } else {
                    str2 = str5;
                    str3 = null;
                }
                String optString6 = jSONObject3.optString(str7);
                if (optString6.length() > 0) {
                    str4 = str7;
                } else {
                    str4 = str7;
                    optString6 = null;
                }
                wbd.add(new po6(string7, string8, str3, optString6));
                i2++;
                length2 = i3;
                optJSONArray = jSONArray;
                str6 = str8;
                str5 = str2;
                str7 = str4;
            }
            set = z7.a(wbd);
        }
        return new yie(string2, j, optString, optString2, optString3, optString4, string3, string4, string5, string6, z, z2, linkedHashMap, set);
    }

    public static Point D(FileDescriptor fileDescriptor, int i) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFileDescriptor(fileDescriptor, (Rect) null, options);
        Point point = new Point(options.outWidth, options.outHeight);
        return (i == 6 || i == 8) ? new Point(point.y, point.x) : point;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Point E(java.lang.String r2, boolean r3) {
        /*
            r0 = 1
            if (r3 == 0) goto L_0x000f
            c65 r3 = new c65     // Catch:{ IOException -> 0x000f }
            r3.<init>((java.lang.String) r2)     // Catch:{ IOException -> 0x000f }
            java.lang.String r1 = "Orientation"
            int r3 = r3.e(r0, r1)     // Catch:{ IOException -> 0x000f }
            goto L_0x0010
        L_0x000f:
            r3 = r0
        L_0x0010:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r1.inJustDecodeBounds = r0
            android.graphics.BitmapFactory.decodeFile(r2, r1)
            android.graphics.Point r2 = new android.graphics.Point
            int r0 = r1.outWidth
            int r1 = r1.outHeight
            r2.<init>(r0, r1)
            r0 = 6
            if (r3 == r0) goto L_0x002a
            r0 = 8
            if (r3 != r0) goto L_0x0034
        L_0x002a:
            android.graphics.Point r3 = new android.graphics.Point
            int r0 = r2.y
            int r2 = r2.x
            r3.<init>(r0, r2)
            r2 = r3
        L_0x0034:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j47.E(java.lang.String, boolean):android.graphics.Point");
    }

    public static final nb7 F(r6d r6d) {
        if (r6d instanceof s6d) {
            return F(((s6d) r6d).a);
        }
        return null;
    }

    public static int[] G(int i, int i2, int i3, int i4) {
        float f = (float) i4;
        float f2 = (float) i3;
        int i5 = (int) ((f / f2) * ((float) i));
        if (i5 > i2) {
            i = (int) ((f2 / f) * ((float) i2));
        } else {
            i2 = i5;
        }
        Size size = new Size(i, i2);
        return new int[]{size.getWidth(), size.getHeight()};
    }

    public static final hg4 H(lx3 lx3) {
        jx3 jx3 = lx3.get(vu4.b);
        hg4 hg4 = jx3 instanceof hg4 ? (hg4) jx3 : null;
        return hg4 == null ? qa4.a : hg4;
    }

    public static int I(Point point, int i, int i2) {
        int i3 = 1;
        while (true) {
            if (point.x / i3 <= i && point.y / i3 <= i2) {
                return i3;
            }
            i3 *= 2;
        }
    }

    public static int J(MediaFormat mediaFormat, String str, int i) {
        return mediaFormat.containsKey(str) ? mediaFormat.getInteger(str) : i;
    }

    public static int K(int i) {
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    public static String L(Context context, String str) {
        String packageName = context.getPackageName();
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", packageName);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public static long M(m4b m4b, long j, long j2, long j3) {
        boolean equals = m4b.c.equals(qad.l);
        qad qad = m4b.c;
        boolean z = equals || j2 < qad.c;
        if (!m4b.v) {
            return (z || j == -9223372036854775807L) ? qad.a.f : j;
        }
        if (!z && j != -9223372036854775807L) {
            return j;
        }
        if (j3 == -9223372036854775807L) {
            j3 = SystemClock.elapsedRealtime() - qad.c;
        }
        long j4 = qad.a.f + ((long) (((float) j3) * m4b.g.a));
        long j5 = qad.d;
        return j5 != -9223372036854775807L ? Math.min(j4, j5) : j4;
    }

    public static Uri N(String str) {
        String O = O(str);
        if (TextUtils.isEmpty(O)) {
            return null;
        }
        return Uri.parse(O);
    }

    public static String O(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Pattern pattern = bre.a;
        return (!str.regionMatches(true, 0, "file:", 0, 5) && !str.regionMatches(true, 0, HttpHost.DEFAULT_SCHEME_NAME, 0, 4) && !str.regionMatches(true, 0, "content", 0, 7) && !str.regionMatches(true, 0, "android.resource:/", 0, 18) && !str.regionMatches(true, 0, "res:/", 0, 5) && !str.regionMatches(true, 0, "data", 0, 4)) ? "file:".concat(str) : str;
    }

    public static final void P(qm0 qm0) {
        if (qm0.a()) {
            ((View) qm0.getValue()).setVisibility(8);
        }
    }

    public static void Q(View view, boolean z) {
        if (view != null) {
            view.setVisibility(z ? 8 : 0);
        }
    }

    public static k3b R(k3b k3b, k3b k3b2) {
        if (k3b == null || k3b2 == null) {
            return k3b.b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < k3b.e(); i++) {
            tm5 tm5 = k3b.a;
            if (k3b2.a(tm5.b(i))) {
                int b2 = tm5.b(i);
                fm9.k(!false);
                sparseBooleanArray.append(b2, true);
            }
        }
        fm9.k(!false);
        return new k3b(new tm5(sparseBooleanArray));
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [d0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.vxd S(defpackage.sx3 r1, defpackage.lx3 r2, defpackage.vx3 r3, defpackage.a66 r4) {
        /*
            lx3 r1 = defpackage.v3c.x(r1, r2)
            r3.getClass()
            vx3 r2 = defpackage.vx3.b
            if (r3 != r2) goto L_0x0011
            qe7 r2 = new qe7
            r2.<init>(r1, r4)
            goto L_0x0017
        L_0x0011:
            vxd r2 = new vxd
            r0 = 1
            r2.<init>(r1, r0, r0)
        L_0x0017:
            r2.start(r3, r2, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j47.S(sx3, lx3, vx3, a66):vxd");
    }

    public static /* synthetic */ vxd T(sx3 sx3, lx3 lx3, vx3 vx3, a66 a66, int i) {
        if ((i & 1) != 0) {
            lx3 = hz4.a;
        }
        if ((i & 2) != 0) {
            vx3 = vx3.a;
        }
        return S(sx3, lx3, vx3, a66);
    }

    public static void U(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.getMarginEnd() != i) {
            marginLayoutParams.setMarginEnd(i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void V(View view, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams.getMarginStart() != i) {
            marginLayoutParams.setMarginStart(i);
            view.setLayoutParams(marginLayoutParams);
        }
    }

    public static void W(MediaFormat mediaFormat, i63 i63) {
        if (i63 != null) {
            X(mediaFormat, "color-transfer", i63.c);
            X(mediaFormat, "color-standard", i63.a);
            X(mediaFormat, "color-range", i63.b);
            byte[] bArr = i63.d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
    }

    public static void X(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static Pair Y(m4b m4b, k4b k4b, m4b m4b2, k4b k4b2, k3b k3b) {
        boolean z = k4b2.a;
        boolean z2 = k4b2.b;
        if (z && k3b.a(17) && !k4b.a) {
            m4b2 = m4b2.l(m4b.j);
            k4b2 = new k4b(false, z2);
        }
        if (z2 && k3b.a(30) && !k4b.b) {
            m4b2 = m4b2.b(m4b.D);
            k4b2 = new k4b(k4b2.a, false);
        }
        return new Pair(m4b2, k4b2);
    }

    public static void Z(Throwable th) {
        qj3 qj3 = s0;
        if (th == null) {
            th = q45.b("onError called with a null Throwable.");
        } else if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof QueueOverflowException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
            th = new IllegalStateException("The exception could not be delivered to the consumer because it has already canceled/disposed the flow or the exception has nowhere to go to begin with. Further reading: https://github.com/ReactiveX/RxJava/wiki/What's-different-in-2.0#error-handling | " + th, th);
        }
        if (qj3 != null) {
            try {
                qj3.accept(th);
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th2);
            }
        }
        th.printStackTrace();
        Thread currentThread2 = Thread.currentThread();
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th);
    }

    public static final int a(int i, int i2, int i3) {
        int i4 = i - (i % 16);
        int i5 = i4 / i2;
        if (i5 == 9) {
            return i4;
        }
        int i6 = i2 * 9;
        int i7 = i6 % 16;
        if (i7 == 0) {
            return i6;
        }
        int i8 = i6 - i7;
        int i9 = 9 - i5;
        int i10 = i3 - i8;
        return (i9 <= 0 || i10 <= 0) ? i8 : i8 + (Math.min(i9, i10 / 16) * 16);
    }

    public static void a0(y7d y7d, String str) {
        int K = K(new c65(str).e(1, "Orientation"));
        if (K != 0) {
            Matrix matrix = new Matrix();
            matrix.setRotate((float) K);
            Bitmap decodeFile = BitmapFactory.decodeFile(str, (BitmapFactory.Options) null);
            Bitmap createBitmap = Bitmap.createBitmap(decodeFile, 0, 0, decodeFile.getWidth(), decodeFile.getHeight(), matrix, true);
            decodeFile.recycle();
            i0(str, createBitmap, y7d);
            createBitmap.recycle();
        }
    }

    public static final boolean b(Object[] objArr, int i, int i2, List list) {
        if (i2 != list.size()) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (!tpa.f(objArr[i + i3], list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public static final void b0(int i, int i2, Object[] objArr) {
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static final String c(Object[] objArr, int i, int i2, Collection collection) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Collection collection2 = objArr[i + i3];
            if (collection2 == collection) {
                sb.append("(this Collection)");
            } else {
                sb.append(collection2);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static boolean c0(y7d y7d, String str, String str2) {
        qyc qyc = (qyc) y7d;
        qyc.getClass();
        long j = (long) 1920;
        return d0(str, str2, (int) qyc.q(PmsKey.f49imagewidth, j), (int) qyc.q(PmsKey.f46imageheight, j), (int) (qyc.g.getFloat(PmsKey.f47imagequality.name(), 0.8f) * ((float) 100)));
    }

    public static boolean d0(String str, String str2, int i, int i2, int i3) {
        Point E = E(str, false);
        int i4 = E.x;
        int i5 = E.y;
        if (i4 > i5) {
            int i6 = i2;
            i2 = i;
            i = i6;
        }
        if (i4 <= i && i5 <= i2) {
            return false;
        }
        int e = new c65(str).e(1, "Orientation");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = I(E, i, i2);
        Bitmap decodeFile = BitmapFactory.decodeFile(str, options);
        try {
            h0(str2, decodeFile, i3, Bitmap.CompressFormat.JPEG);
            decodeFile.recycle();
            c65 c65 = new c65(str2);
            c65.F("Orientation", String.valueOf(e));
            c65.B();
            return true;
        } catch (Throwable th) {
            if (decodeFile != null) {
                decodeFile.recycle();
            }
            throw th;
        }
    }

    public static void e(Throwable th, Throwable th2) {
        if (th != th2) {
            Integer num = q77.a;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            Method method = u2b.a;
            if (method != null) {
                method.invoke(th, new Object[]{th2});
            }
        }
    }

    public static Bitmap e0(int i, int i2, Bitmap bitmap) {
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        return (height < i || height > i2 || width < i || width > i2) ? (height < i || width < i) ? Bitmap.createScaledBitmap(bitmap, i, i, false) : Bitmap.createScaledBitmap(bitmap, i2, i2, false) : bitmap;
    }

    public static boolean f(qad qad, qad qad2) {
        p3b p3b = qad.a;
        int i = p3b.b;
        p3b p3b2 = qad2.a;
        return i == p3b2.b && p3b.e == p3b2.e && p3b.h == p3b2.h && p3b.i == p3b2.i;
    }

    public static final Object f0(lx3 lx3, a66 a66) {
        lx3 lx32;
        a45 a45;
        Thread currentThread = Thread.currentThread();
        vu4 vu4 = vu4.b;
        iu3 iu3 = (iu3) lx3.get(vu4);
        hz4 hz4 = hz4.a;
        if (iu3 == null) {
            a45 = use.a();
            lx32 = v3c.m(hz4, lx3.plus(a45), true);
            jd4 jd4 = ql4.a;
            if (lx32 != jd4 && lx32.get(vu4) == null) {
                lx32 = lx32.plus(jd4);
            }
        } else {
            if (iu3 instanceof a45) {
                a45 a452 = (a45) iu3;
            }
            a45 = (a45) use.a.get();
            lx32 = v3c.m(hz4, lx3, true);
            jd4 jd42 = ql4.a;
            if (lx32 != jd42 && lx32.get(vu4) == null) {
                lx32 = lx32.plus(jd42);
            }
        }
        jp0 jp0 = new jp0(lx32, currentThread, a45);
        jp0.start(vx3.a, jp0, a66);
        a45 a453 = jp0.b;
        if (a453 != null) {
            int i = a45.o;
            a453.S(false);
        }
        while (!Thread.interrupted()) {
            try {
                long e0 = a453 != null ? a453.e0() : Long.MAX_VALUE;
                if (!jp0.isCompleted()) {
                    LockSupport.parkNanos(jp0, e0);
                } else {
                    if (a453 != null) {
                        int i2 = a45.o;
                        a453.d(false);
                    }
                    Object a2 = a97.a(jp0.getState$kotlinx_coroutines_core());
                    lb3 lb3 = a2 instanceof lb3 ? (lb3) a2 : null;
                    if (lb3 == null) {
                        return a2;
                    }
                    throw lb3.a;
                }
            } catch (Throwable th) {
                if (a453 != null) {
                    int i3 = a45.o;
                    a453.d(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        jp0.cancelCoroutine(interruptedException);
        throw interruptedException;
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [d0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.zf4 g(defpackage.sx3 r1, defpackage.lx3 r2, defpackage.vx3 r3, defpackage.a66 r4) {
        /*
            lx3 r1 = defpackage.v3c.x(r1, r2)
            r3.getClass()
            vx3 r2 = defpackage.vx3.b
            if (r3 != r2) goto L_0x0011
            me7 r2 = new me7
            r2.<init>(r1, r4)
            goto L_0x0017
        L_0x0011:
            zf4 r2 = new zf4
            r0 = 1
            r2.<init>(r1, r0, r0)
        L_0x0017:
            r2.start(r3, r2, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j47.g(sx3, lx3, vx3, a66):zf4");
    }

    public static /* synthetic */ zf4 h(sx3 sx3, nx3 nx3, a66 a66, int i) {
        lx3 lx3 = nx3;
        if ((i & 1) != 0) {
            lx3 = hz4.a;
        }
        return g(sx3, lx3, vx3.a, a66);
    }

    public static void h0(String str, Bitmap bitmap, int i, Bitmap.CompressFormat compressFormat) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(str);
            try {
                bitmap.compress(compressFormat, i, fileOutputStream2);
                hm9.m("j47", "save bitmap success! %s", str);
                s5c.m(fileOutputStream2);
            } catch (IOException e) {
                e = e;
                fileOutputStream = fileOutputStream2;
                try {
                    hm9.p("j47", "save bitmap failure!", e);
                    throw e;
                } catch (Throwable th) {
                    th = th;
                    s5c.m(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = fileOutputStream2;
                s5c.m(fileOutputStream);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            hm9.p("j47", "save bitmap failure!", e);
            throw e;
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [hu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void i(kotlin.coroutines.Continuation r4) {
        /*
            boolean r0 = r4 instanceof defpackage.ig4
            if (r0 == 0) goto L_0x0013
            r0 = r4
            ig4 r0 = (defpackage.ig4) r0
            int r1 = r0.X
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.X = r1
            goto L_0x0018
        L_0x0013:
            ig4 r0 = new ig4
            r0.<init>(r4)
        L_0x0018:
            java.lang.Object r4 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.X
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 == r3) goto L_0x002b
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L_0x002b:
            defpackage.od2.a0(r4)
            goto L_0x0047
        L_0x002f:
            defpackage.od2.a0(r4)
            r0.X = r3
            sy1 r4 = new sy1
            kotlin.coroutines.Continuation r0 = defpackage.v3c.u(r0)
            r4.<init>(r3, r0)
            r4.n()
            java.lang.Object r4 = r4.m()
            if (r4 != r1) goto L_0x0047
            return
        L_0x0047:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j47.i(kotlin.coroutines.Continuation):void");
    }

    public static void i0(String str, Bitmap bitmap, y7d y7d) {
        try {
            qyc qyc = (qyc) y7d;
            qyc.getClass();
            h0(str, bitmap, (int) (qyc.g.getFloat(PmsKey.f47imagequality.name(), 0.8f) * ((float) 100)), Bitmap.CompressFormat.JPEG);
        } catch (IOException unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [hu3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(defpackage.iab r4, defpackage.k56 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof defpackage.cab
            if (r0 == 0) goto L_0x0013
            r0 = r6
            cab r0 = (defpackage.cab) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            cab r0 = new cab
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            k56 r5 = r0.o
            defpackage.od2.a0(r6)     // Catch:{ all -> 0x0029 }
            goto L_0x0066
        L_0x0029:
            r4 = move-exception
            goto L_0x006c
        L_0x002b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0033:
            defpackage.od2.a0(r6)
            c32 r6 = defpackage.c32.X
            lx3 r2 = r0.b
            jx3 r6 = r2.get(r6)
            if (r6 != r4) goto L_0x0070
            r0.getClass()     // Catch:{ all -> 0x0029 }
            r0.o = r5     // Catch:{ all -> 0x0029 }
            r0.Y = r3     // Catch:{ all -> 0x0029 }
            sy1 r6 = new sy1     // Catch:{ all -> 0x0029 }
            kotlin.coroutines.Continuation r0 = defpackage.v3c.u(r0)     // Catch:{ all -> 0x0029 }
            r6.<init>(r3, r0)     // Catch:{ all -> 0x0029 }
            r6.n()     // Catch:{ all -> 0x0029 }
            c01 r0 = new c01     // Catch:{ all -> 0x0029 }
            r2 = 8
            r0.<init>(r2, r6)     // Catch:{ all -> 0x0029 }
            fab r4 = (defpackage.fab) r4     // Catch:{ all -> 0x0029 }
            r4.k(r0)     // Catch:{ all -> 0x0029 }
            java.lang.Object r4 = r6.m()     // Catch:{ all -> 0x0029 }
            if (r4 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r5.invoke()
            e5f r4 = defpackage.e5f.a
            return r4
        L_0x006c:
            r5.invoke()
            throw r4
        L_0x0070:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j47.j(iab, k56, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static Bitmap j0(int i, int i2, Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        float width = ((float) i) / ((float) bitmap.getWidth());
        float height = ((float) i2) / ((float) bitmap.getHeight());
        Matrix matrix = new Matrix();
        matrix.setScale(width, height, 0.0f, 0.0f);
        Canvas canvas = new Canvas(createBitmap);
        canvas.setMatrix(matrix);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(2));
        return createBitmap;
    }

    public static void k(String str) {
        if (maf.a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void k0(MediaFormat mediaFormat, List list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(zr6.h(i, "csd-"), ByteBuffer.wrap((byte[]) list.get(i)));
        }
    }

    public static final int l(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static void l0(ViewGroup viewGroup) {
        viewGroup.setEnabled(false);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                if (childAt instanceof Spinner) {
                    Spinner spinner = (Spinner) childAt;
                    if (spinner.getSelectedView() != null) {
                        spinner.getSelectedView().setEnabled(false);
                    }
                } else if (childAt instanceof ViewGroup) {
                    l0((ViewGroup) childAt);
                }
                childAt.setEnabled(false);
            }
        }
    }

    public static final int m(int i, long j, long[] jArr) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = (jArr[i4] > j ? 1 : (jArr[i4] == j ? 0 : -1));
            if (i5 < 0) {
                i3 = i4 + 1;
            } else if (i5 <= 0) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static void m0(q3b q3b, ph8 ph8) {
        int i = ph8.b;
        zw6 zw6 = ph8.a;
        if (i != -1) {
            boolean t1 = q3b.t1(20);
            long j = ph8.c;
            if (t1) {
                q3b.H0(ph8.b, j, zw6);
            } else if (!zw6.isEmpty()) {
                q3b.t((tb8) zw6.get(0), j);
            }
        } else if (q3b.t1(20)) {
            q3b.O0(zw6);
        } else if (!zw6.isEmpty()) {
            q3b.C0((tb8) zw6.get(0));
        }
    }

    public static int n(long j, long j2) {
        if (j == -9223372036854775807L || j2 == -9223372036854775807L) {
            return 0;
        }
        if (j2 == 0) {
            return 100;
        }
        return oaf.j((int) ((j * 100) / j2), 0, 100);
    }

    public static String n0(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    public static void o(View view, int i) {
        if (view.getPaddingBottom() != i) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
        }
    }

    public static Bitmap o0(int i, int i2, Context context) {
        Drawable b2 = kt3.b(context, i);
        if (b2 != null) {
            aq4.h(b2, ColorStateList.valueOf(i2));
        }
        Bitmap createBitmap = Bitmap.createBitmap(b2.getIntrinsicWidth(), b2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        b2.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        b2.draw(canvas);
        return createBitmap;
    }

    public static void p(View view, int i) {
        WeakHashMap weakHashMap = zmf.a;
        if (view.getPaddingEnd() != i) {
            view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), i, view.getPaddingBottom());
        }
    }

    public static final long p0(long j) {
        int i = ft4.o;
        boolean z = j > 0;
        if (z) {
            return ft4.e(ft4.h(j, z7.S(999999, kt4.NANOSECONDS)));
        }
        if (!z) {
            return 0;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void q(View view, int i) {
        WeakHashMap weakHashMap = zmf.a;
        if (view.getPaddingStart() != i) {
            view.setPaddingRelative(i, view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom());
        }
    }

    public static JSONObject q0(yie yie) {
        JSONArray jSONArray;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("versionName", (Object) yie.a);
        jSONObject.put("versionCode", yie.b);
        jSONObject.put("packageName", (Object) yie.c);
        jSONObject.put("environment", (Object) yie.d);
        jSONObject.put("buildUuid", (Object) yie.e);
        jSONObject.put("sessionUuid", (Object) yie.f);
        jSONObject.put("device", (Object) yie.g);
        jSONObject.put("deviceId", (Object) yie.h);
        jSONObject.put("vendor", (Object) yie.i);
        jSONObject.put("osVersion", (Object) yie.j);
        jSONObject.put("inBackground", yie.k);
        jSONObject.put("isRooted", yie.l);
        jSONObject.put("properties", (Object) new JSONObject((Map<?, ?>) yie.m));
        Set<po6> set = yie.n;
        if (set == null || set.isEmpty()) {
            jSONArray = null;
        } else {
            jSONArray = new JSONArray();
            for (po6 po6 : set) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("packageName", (Object) po6.a);
                jSONObject2.put("versionName", (Object) po6.b);
                jSONObject2.put("buildUuid", (Object) po6.c);
                jSONObject2.put("environment", (Object) po6.d);
                jSONArray.put((Object) jSONObject2);
            }
        }
        jSONObject.put("hostedLibrariesInfo", (Object) jSONArray);
        return jSONObject;
    }

    public static void r(View view, int i) {
        if (view.getPaddingTop() != i) {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), view.getPaddingBottom());
        }
    }

    public static nw4 r0(Object obj) {
        return new nw4(obj.getClass().getSimpleName());
    }

    public static void s(Rect rect, View view) {
        int[] iArr = Y;
        view.getLocationInWindow(iArr);
        int i = iArr[1];
        Rect rect2 = i < rect.top ? new Rect(0, rect.top - i, view.getWidth(), view.getHeight()) : null;
        if (view.getHeight() + i > rect.bottom) {
            int height = view.getHeight() - ((view.getHeight() + i) - rect.bottom);
            if (rect2 == null) {
                rect2 = new Rect(0, 0, view.getWidth(), height);
            } else {
                rect2.bottom = height;
            }
        }
        if (rect2 != null) {
            view.setClipBounds(rect2);
        } else {
            view.setClipBounds((Rect) null);
        }
    }

    public static final void s0(j5d j5d, Object obj) {
        Object n = j5d.n(obj);
        if (!(n instanceof h42)) {
            e5f e5f = (e5f) n;
            return;
        }
        Object obj2 = ((i42) f0(hz4.a, new k42(j5d, obj, (Continuation) null))).a;
    }

    public static qy5 t(MediaFormat mediaFormat) {
        float f;
        byte[] bArr;
        ny5 ny5 = new ny5();
        ny5.m = ia9.l(mediaFormat.getString("mime"));
        ny5.d = mediaFormat.getString("language");
        ny5.h = J(mediaFormat, "max-bitrate", -1);
        ny5.g = J(mediaFormat, "bitrate", -1);
        ny5.i = mediaFormat.getString("codecs-string");
        if (mediaFormat.containsKey("frame-rate")) {
            try {
                f = mediaFormat.getFloat("frame-rate");
            } catch (ClassCastException unused) {
                f = (float) mediaFormat.getInteger("frame-rate");
            }
        } else {
            f = -1.0f;
        }
        ny5.u = f;
        ny5.s = J(mediaFormat, "width", -1);
        ny5.t = J(mediaFormat, "height", -1);
        ny5.w = (!mediaFormat.containsKey("sar-width") || !mediaFormat.containsKey("sar-height")) ? 1.0f : ((float) mediaFormat.getInteger("sar-width")) / ((float) mediaFormat.getInteger("sar-height"));
        ny5.n = J(mediaFormat, "max-input-size", -1);
        int i = 0;
        ny5.v = J(mediaFormat, "rotation-degrees", 0);
        i63 i63 = null;
        if (oaf.a >= 24) {
            int J = J(mediaFormat, "color-standard", -1);
            int J2 = J(mediaFormat, "color-range", -1);
            int J3 = J(mediaFormat, "color-transfer", -1);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            if (byteBuffer != null) {
                byte[] bArr2 = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr2);
                bArr = bArr2;
            } else {
                bArr = null;
            }
            if (!(J == -1 && J2 == -1 && J3 == -1 && bArr == null)) {
                i63 = new i63(J, J2, J3, -1, -1, bArr);
            }
        }
        ny5.z = i63;
        ny5.B = J(mediaFormat, "sample-rate", -1);
        ny5.A = J(mediaFormat, "channel-count", -1);
        ny5.C = J(mediaFormat, "pcm-encoding", -1);
        wmd.i(4, "initialCapacity");
        int i2 = 0;
        Object[] objArr = new Object[4];
        while (true) {
            ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer("csd-" + i);
            if (byteBuffer2 == null) {
                ny5.p = zw6.h(i2, objArr);
                return new qy5(ny5);
            }
            byte[] bArr3 = new byte[byteBuffer2.remaining()];
            byteBuffer2.get(bArr3);
            byteBuffer2.rewind();
            int i3 = i2 + 1;
            Object[] copyOf = objArr.length < i3 ? Arrays.copyOf(objArr, pw6.h(objArr.length, i3)) : objArr;
            copyOf[i2] = bArr3;
            i++;
            i2 = i3;
            objArr = copyOf;
        }
    }

    /* JADX INFO: finally extract failed */
    public static final Object t0(lx3 lx3, a66 a66, Continuation continuation) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        lx3 context = continuation.getContext();
        lx3 plus = !((Boolean) lx3.fold(Boolean.FALSE, new ai0(11))).booleanValue() ? context.plus(lx3) : v3c.m(context, lx3, false);
        pag.j(plus);
        if (plus == context) {
            ScopeCoroutine scopeCoroutine = new ScopeCoroutine(plus, continuation);
            return oag.C(scopeCoroutine, scopeCoroutine, a66);
        }
        vu4 vu4 = vu4.b;
        if (tpa.f(plus.get(vu4), context.get(vu4))) {
            z4f z4f = new z4f(plus, continuation);
            lx3 context2 = z4f.getContext();
            Object updateThreadContext = ThreadContextKt.updateThreadContext(context2, (Object) null);
            try {
                Object C = oag.C(z4f, z4f, a66);
                ThreadContextKt.restoreThreadContext(context2, updateThreadContext);
                return C;
            } catch (Throwable th) {
                ThreadContextKt.restoreThreadContext(context2, updateThreadContext);
                throw th;
            }
        } else {
            ScopeCoroutine scopeCoroutine2 = new ScopeCoroutine(plus, continuation);
            tu0.M(a66, scopeCoroutine2, scopeCoroutine2);
            do {
                atomicIntegerFieldUpdater = nl4.a;
                int i = atomicIntegerFieldUpdater.get(scopeCoroutine2);
                if (i != 0) {
                    if (i == 2) {
                        Object a2 = a97.a(scopeCoroutine2.getState$kotlinx_coroutines_core());
                        if (!(a2 instanceof lb3)) {
                            return a2;
                        }
                        throw ((lb3) a2).a;
                    }
                    throw new IllegalStateException("Already suspended".toString());
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(scopeCoroutine2, 0, 1));
            return tx3.a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006e, code lost:
        if (r4 != 22) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.media.MediaFormat u(defpackage.qy5 r8) {
        /*
            android.media.MediaFormat r0 = new android.media.MediaFormat
            r0.<init>()
            int r1 = r8.i
            java.lang.String r2 = "bitrate"
            X(r0, r2, r1)
            java.lang.String r1 = "max-bitrate"
            int r2 = r8.h
            X(r0, r1, r2)
            java.lang.String r1 = "channel-count"
            int r2 = r8.B
            X(r0, r1, r2)
            i63 r1 = r8.A
            W(r0, r1)
            java.lang.String r1 = r8.n
            if (r1 == 0) goto L_0x0028
            java.lang.String r2 = "mime"
            r0.setString(r2, r1)
        L_0x0028:
            java.lang.String r1 = r8.j
            if (r1 == 0) goto L_0x0031
            java.lang.String r2 = "codecs-string"
            r0.setString(r2, r1)
        L_0x0031:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r8.v
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 == 0) goto L_0x003e
            java.lang.String r1 = "frame-rate"
            r0.setFloat(r1, r2)
        L_0x003e:
            java.lang.String r1 = "width"
            int r2 = r8.t
            X(r0, r1, r2)
            java.lang.String r1 = "height"
            int r2 = r8.u
            X(r0, r1, r2)
            java.util.List r1 = r8.q
            k0(r0, r1)
            r1 = 0
            r2 = -1
            r3 = 2
            int r4 = r8.D
            if (r4 != r2) goto L_0x0059
            goto L_0x0079
        L_0x0059:
            java.lang.String r2 = "exo-pcm-encoding-int"
            X(r0, r2, r4)
            if (r4 == 0) goto L_0x0073
            if (r4 == r3) goto L_0x0071
            r2 = 3
            if (r4 == r2) goto L_0x0074
            r2 = 4
            if (r4 == r2) goto L_0x0074
            r2 = 21
            if (r4 == r2) goto L_0x0074
            r2 = 22
            if (r4 == r2) goto L_0x0074
            goto L_0x0079
        L_0x0071:
            r2 = r3
            goto L_0x0074
        L_0x0073:
            r2 = r1
        L_0x0074:
            java.lang.String r4 = "pcm-encoding"
            r0.setInteger(r4, r2)
        L_0x0079:
            java.lang.String r2 = r8.d
            if (r2 == 0) goto L_0x0082
            java.lang.String r4 = "language"
            r0.setString(r4, r2)
        L_0x0082:
            java.lang.String r2 = "max-input-size"
            int r4 = r8.o
            X(r0, r2, r4)
            java.lang.String r2 = "sample-rate"
            int r4 = r8.C
            X(r0, r2, r4)
            java.lang.String r2 = "caption-service-number"
            int r4 = r8.G
            X(r0, r2, r4)
            java.lang.String r2 = "rotation-degrees"
            int r4 = r8.w
            r0.setInteger(r2, r4)
            int r2 = r8.e
            r4 = r2 & 4
            r5 = 1
            if (r4 == 0) goto L_0x00a7
            r4 = r5
            goto L_0x00a8
        L_0x00a7:
            r4 = r1
        L_0x00a8:
            java.lang.String r6 = "is-autoselect"
            r0.setInteger(r6, r4)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x00b3
            r4 = r5
            goto L_0x00b4
        L_0x00b3:
            r4 = r1
        L_0x00b4:
            java.lang.String r6 = "is-default"
            r0.setInteger(r6, r4)
            r2 = r2 & r3
            if (r2 == 0) goto L_0x00bd
            r1 = r5
        L_0x00bd:
            java.lang.String r2 = "is-forced-subtitle"
            r0.setInteger(r2, r1)
            java.lang.String r1 = "encoder-delay"
            int r2 = r8.E
            r0.setInteger(r1, r2)
            java.lang.String r1 = "encoder-padding"
            int r2 = r8.F
            r0.setInteger(r1, r2)
            java.lang.String r1 = "exo-pixel-width-height-ratio-float"
            float r8 = r8.x
            r0.setFloat(r1, r8)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r3 = 1073741824(0x40000000, float:2.0)
            if (r2 >= 0) goto L_0x00e3
            float r1 = (float) r3
            float r8 = r8 * r1
            int r5 = (int) r8
            goto L_0x00ef
        L_0x00e3:
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ee
            float r1 = (float) r3
            float r1 = r1 / r8
            int r5 = (int) r1
            r7 = r5
            r5 = r3
            r3 = r7
            goto L_0x00ef
        L_0x00ee:
            r3 = r5
        L_0x00ef:
            java.lang.String r8 = "sar-width"
            r0.setInteger(r8, r5)
            java.lang.String r8 = "sar-height"
            r0.setInteger(r8, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j47.u(qy5):android.media.MediaFormat");
    }

    public static final Object x(long j, Continuation continuation) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        e5f e5f = e5f.a;
        if (i <= 0) {
            return e5f;
        }
        sy1 sy1 = new sy1(1, v3c.u(continuation));
        sy1.n();
        if (j < Long.MAX_VALUE) {
            H(sy1.getContext()).scheduleResumeAfterDelay(j, sy1);
        }
        Object m = sy1.m();
        return m == tx3.a ? m : e5f;
    }

    public static final Object y(long j, Continuation continuation) {
        Object x = x(p0(j), continuation);
        return x == tx3.a ? x : e5f.a;
    }

    public String toString() {
        switch (this.a) {
            case 10:
                return z().toString();
            default:
                return super.toString();
        }
    }

    public e99 v(j99 j99) {
        ByteBuffer byteBuffer = j99.o;
        byteBuffer.getClass();
        np8.d(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (j99.f(Integer.MIN_VALUE)) {
            return null;
        }
        return w(j99, byteBuffer);
    }

    public abstract e99 w(j99 j99, ByteBuffer byteBuffer);

    public abstract Object z();
}
