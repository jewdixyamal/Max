package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.os.Build;
import android.text.TextUtils;
import android.util.Rational;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.IceCandidate;
import org.webrtc.RTCStats;
import org.webrtc.SessionDescription;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: f46  reason: default package */
public abstract class f46 {
    public static e46 a;
    public static final Object[] b = new Object[0];
    public static final float[] c = new float[9];
    public static final qx7 d = new qx7(17);
    public static String e;
    public static final /* synthetic */ int f = 0;

    public static final void A() {
        I();
    }

    public static boolean B(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static final void C(View view, int i, int i2) {
        Rect rect = new Rect();
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new cye(view, rect, i, i2));
            return;
        }
        view.getHitRect(rect);
        if (rect.width() < i) {
            int width = (i - rect.width()) / 2;
            rect.left -= width;
            rect.right += width;
        }
        if (rect.height() < i2) {
            int height = (i2 - rect.height()) / 2;
            rect.top -= height;
            rect.bottom += height;
        }
        view.setTouchDelegate(new o85(rect, view));
    }

    public static void D(int i, View view, ViewGroup viewGroup) {
        if (viewGroup != null) {
            viewGroup.post(new uc3(view, 0, 0, i, 0, viewGroup, 1));
        }
    }

    public static bg1 E(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("participantId");
        String optString = jSONObject.optString("participantType");
        return new bg1("GROUP".equals(optString) ? 2 : 1, jSONObject.optInt("deviceIdx"), optLong);
    }

    public static bg1 F(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("id");
        String optString = jSONObject.optString("idType");
        return new bg1("GROUP".equals(optString) ? 2 : 1, jSONObject.optInt("deviceIdx"), optLong);
    }

    public static ssa G(JSONObject jSONObject, String str) {
        JSONObject optJSONObject = jSONObject.optJSONObject(str);
        usa usa = null;
        if (optJSONObject == null) {
            return null;
        }
        int optInt = optJSONObject.optInt("maxDimension");
        int optInt2 = optJSONObject.optInt("maxBitrateK");
        int optInt3 = optJSONObject.optInt("maxFramerate");
        String optString = optJSONObject.optString("degradationPreference");
        try {
            usa = usa.a(optJSONObject.getJSONObject("bitrates"));
        } catch (Exception unused) {
        }
        return new ssa(optInt, optInt, optInt2, optInt3, optString, usa, 1, 0, "");
    }

    public static String H(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        String str = null;
        for (Map.Entry entry : map.entrySet()) {
            int Q = Q((String) entry.getKey());
            if (Q != 0 && (str == null || Q > Q(str))) {
                str = (String) entry.getKey();
            }
        }
        if (str != null) {
            return (String) map.get(str);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [e46, java.lang.Object] */
    public static e46 I() {
        ? obj;
        e46 e46 = a;
        if (e46 != null) {
            return e46;
        }
        synchronized (f46.class) {
            obj = new Object();
            a = obj;
        }
        return obj;
    }

    public static final rg7 J(eh7 eh7) {
        rg7 rg7;
        gh7 Q = eh7.Q();
        loop0:
        while (true) {
            AtomicReference atomicReference = Q.a;
            rg7 = (rg7) atomicReference.get();
            if (rg7 != null) {
                break;
            }
            hde a2 = a();
            jd4 jd4 = ql4.a;
            rg7 = new rg7(Q, a2.plus(MainDispatcherLoader.dispatcher.getImmediate()));
            while (true) {
                if (atomicReference.compareAndSet((Object) null, rg7)) {
                    jd4 jd42 = ql4.a;
                    j47.T(rg7, MainDispatcherLoader.dispatcher.getImmediate(), (vx3) null, new qg7(rg7, (Continuation) null), 2);
                    break loop0;
                } else if (atomicReference.get() != null) {
                }
            }
        }
        return rg7;
    }

    public static float K(Matrix matrix) {
        double pow = Math.pow((double) L(matrix, 0), 2.0d);
        float[] fArr = c;
        matrix.getValues(fArr);
        return (float) Math.sqrt(Math.pow((double) fArr[3], 2.0d) + pow);
    }

    public static float L(Matrix matrix, int i) {
        float[] fArr = c;
        matrix.getValues(fArr);
        return fArr[i];
    }

    public static String M(rd8 rd8) {
        if (rd8 == null) {
            return null;
        }
        int i = uh6.a[rd8.ordinal()];
        if (i == 1) {
            return "UNMUTE";
        }
        if (i == 2) {
            return "MUTE";
        }
        if (i == 3) {
            return "MUTE_PERMANENT";
        }
        if (i == 4) {
            return null;
        }
        throw new IllegalArgumentException("Unknown media option state: " + rd8);
    }

    public static ArrayList N(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            try {
                bg1 b2 = bg1.b(optJSONArray.getString(i));
                if (b2 != null) {
                    arrayList.add(b2);
                }
            } catch (JSONException unused) {
            }
        }
        return arrayList;
    }

    public static Rational O(int i, Rational rational) {
        return (i == 90 || i == 270) ? rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator()) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static String P(m7d m7d) {
        String str;
        String str2;
        cd9 cd9 = m7d.a.c;
        if (cd9 != null) {
            str = ":m" + cd9.a;
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        fp1 fp1 = m7d.a;
        sb.append(fp1.b.c());
        sb.append(":");
        int i = uh6.b[fp1.a.ordinal()];
        if (i == 1) {
            str2 = "sCAMERA";
        } else if (i == 2) {
            str2 = "sSCREEN";
        } else if (i == 3) {
            str2 = "sMOVIE";
        } else if (i == 4) {
            str2 = "sSTREAM";
        } else if (i == 5) {
            str2 = "sANIMOJI";
        } else {
            throw new RuntimeException("Unknown VideoTrackType");
        }
        return zr6.l(sb, str2, str);
    }

    public static int Q(String str) {
        if (oag.t(str)) {
            return 0;
        }
        if (!str.startsWith("MP4") && !str.startsWith("mp4")) {
            return 0;
        }
        try {
            return Integer.parseInt(str.split("_")[1]);
        } catch (Exception e2) {
            hm9.p("f46", "failed to parse mp4 video key: ".concat(str), e2);
            return 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.k43 R(defpackage.qnf r4) {
        /*
            qx7 r0 = d
            monitor-enter(r0)
            java.lang.String r1 = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY"
            java.lang.AutoCloseable r1 = r4.c(r1)     // Catch:{ all -> 0x002b }
            k43 r1 = (defpackage.k43) r1     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x002d
            hz4 r1 = defpackage.hz4.a     // Catch:{ all -> 0x002b }
            jd4 r2 = defpackage.ql4.a     // Catch:{ IllegalStateException | jr9 -> 0x0017 }
            cx7 r2 = kotlinx.coroutines.internal.MainDispatcherLoader.dispatcher     // Catch:{ IllegalStateException | jr9 -> 0x0017 }
            cx7 r1 = r2.getImmediate()     // Catch:{ IllegalStateException | jr9 -> 0x0017 }
        L_0x0017:
            k43 r2 = new k43     // Catch:{ all -> 0x002b }
            hde r3 = a()     // Catch:{ all -> 0x002b }
            lx3 r1 = r1.plus(r3)     // Catch:{ all -> 0x002b }
            r2.<init>(r1)     // Catch:{ all -> 0x002b }
            java.lang.String r1 = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY"
            r4.a(r1, r2)     // Catch:{ all -> 0x002b }
            r1 = r2
            goto L_0x002d
        L_0x002b:
            r4 = move-exception
            goto L_0x002f
        L_0x002d:
            monitor-exit(r0)
            return r1
        L_0x002f:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f46.R(qnf):k43");
    }

    public static final void S(lx3 lx3, Throwable th) {
        if (!(th instanceof CancellationException)) {
            try {
                j47.Z(th);
            } catch (Throwable th2) {
                j47.e(th, th2);
                wmd.v(lx3, th);
            }
        }
    }

    public static hv5 T(gy8 gy8) {
        int i;
        String str;
        long j;
        gy8 gy82 = gy8;
        try {
            i = lz7.N(gy8);
        } catch (Throwable th) {
            Throwable th2 = th;
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th2);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                i = 0;
            } else if (s != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th2;
            }
        }
        long j2 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Long l = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = lz7.P(gy8);
            } catch (Throwable th3) {
                hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = u7d.a.iterator();
                while (it2.hasNext()) {
                    ((r4a) it2.next()).getClass();
                    r4a.a(th3);
                }
                int s2 = au1.s(k7d.a);
                if (s2 != 0) {
                    if (s2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
            }
            if (str != null) {
                try {
                    switch (str.hashCode()) {
                        case -1724546052:
                            if (str.equals("description")) {
                                str4 = lz7.P(gy8);
                                continue;
                            }
                            break;
                        case -1587556021:
                            if (str.equals("startParam")) {
                                str5 = lz7.P(gy8);
                                continue;
                            }
                            break;
                        case -1332194002:
                            if (str.equals("background")) {
                                str3 = lz7.P(gy8);
                                continue;
                            }
                            break;
                        case 3355:
                            if (str.equals("id")) {
                                j2 = lz7.M(gy82, 0);
                                continue;
                            }
                            break;
                        case 116079:
                            if (str.equals("url")) {
                                str6 = lz7.P(gy8);
                                continue;
                            }
                            break;
                        case 3373707:
                            if (str.equals("name")) {
                                str2 = lz7.P(gy8);
                                continue;
                            }
                            break;
                        case 93028124:
                            if (str.equals("appId")) {
                                j = lz7.M(gy82, 0);
                                Long valueOf = Long.valueOf(j);
                                if (j != 0) {
                                    l = valueOf;
                                    break;
                                } else {
                                    l = null;
                                    continue;
                                }
                            }
                            break;
                        case 1638765110:
                            if (str.equals("iconUrl")) {
                                str7 = lz7.P(gy8);
                                continue;
                            }
                            break;
                    }
                    gy8.z();
                } catch (Throwable th4) {
                    hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                    Iterator it3 = u7d.a.iterator();
                    while (it3.hasNext()) {
                        ((r4a) it3.next()).getClass();
                        r4a.a(th4);
                    }
                    int s3 = au1.s(k7d.a);
                    if (s3 != 0) {
                        if (s3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th4;
                    }
                }
            }
        }
        if (j2 == 0 || str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0) {
            return null;
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (str3 != null) {
            return new hv5(j2, str2, str3, str4, l, str5, str6, str7);
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public static boolean U(String str) {
        return "service.unavailable".equals(str) || "io.exception".equals(str) || "service.timeout".equals(str);
    }

    public static boolean V(int i) {
        return i == 256 || i == 4101;
    }

    public static final boolean W() {
        I();
        return false;
    }

    public static final boolean X(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static HashSet Y(JSONObject jSONObject) {
        JSONArray optJSONArray;
        gi6 gi6;
        if (!"hungup".equals(jSONObject.optString("notification")) || (optJSONArray = jSONObject.optJSONArray("errors")) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < optJSONArray.length(); i++) {
            int optInt = optJSONArray.optInt(i, Integer.MIN_VALUE);
            if (optInt != Integer.MIN_VALUE) {
                gi6[] values = gi6.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        gi6 = null;
                        break;
                    }
                    gi6 = values[i2];
                    gi6.getClass();
                    if (optInt == 1) {
                        break;
                    }
                    i2++;
                }
                if (gi6 != null) {
                    hashSet.add(gi6);
                }
            }
        }
        return hashSet;
    }

    public static fp1 Z(String str) {
        String[] split = str.split(":");
        olf olf = olf.a;
        olf olf2 = olf;
        bg1 bg1 = null;
        cd9 cd9 = null;
        for (String str2 : split) {
            if (str2 != null) {
                if (str2.startsWith("u") || str2.startsWith("g")) {
                    bg1 = bg1.b(str);
                }
                if (str2.startsWith("s")) {
                    char c2 = 65535;
                    switch (str2.hashCode()) {
                        case -1579214262:
                            if (str2.equals("sANIMOJI")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case -929065347:
                            if (str2.equals("sMOVIE")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 964253016:
                            if (str2.equals("sCAMERA")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1424315039:
                            if (str2.equals("sSCREEN")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 1440014771:
                            if (str2.equals("sSTREAM")) {
                                c2 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                            olf2 = olf.c;
                            break;
                        case 1:
                            olf2 = olf.o;
                            break;
                        case 2:
                            olf2 = olf;
                            break;
                        case 3:
                            olf2 = olf.b;
                            break;
                        case 4:
                            olf2 = olf.X;
                            break;
                        default:
                            throw new RuntimeException("Unknown video track type");
                    }
                }
                if (str2.startsWith("m")) {
                    cd9 = new cd9(Long.parseLong(str2.substring(1)));
                }
            }
        }
        if (bg1 == null) {
            return null;
        }
        adb adb = new adb(3);
        adb.a = bg1;
        adb.b = olf2;
        adb.c = cd9;
        return adb.c();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [y77, hde] */
    public static hde a() {
        return new y77((x77) null);
    }

    public static bg1 a0(String str) {
        if (TextUtils.isEmpty(str) || !str.startsWith("video-") || str.length() == 6) {
            return null;
        }
        return bg1.b(str.substring(6));
    }

    public static ka6 b(JSONObject jSONObject, String str) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("command", (Object) str);
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
            return new ka6(jSONObject2);
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static oq1 b0(List list, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(kq0.w(((xf4) it.next()).c()));
        }
        return f8.g(new u00((Object) f8.g(new x72((Object) kq0.J(arrayList), (Object) scheduledExecutorService, (long) MultiFileUploader.UPLOAD_NEXT_INTERVAL, 7)), (Object) executor, (Object) list, 6));
    }

    public static Object c(RTCStats rTCStats, String str) {
        return rTCStats.getMembers().get(str);
    }

    public static final int c0(int i) {
        switch (au1.s(i)) {
            case 0:
            case 1:
            case 2:
                return 2;
            case 3:
            case 4:
                return 1;
            case 5:
            case 6:
                return 3;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static void d(bg1 bg1, JSONObject jSONObject, boolean z) {
        jSONObject.put("participantId", bg1.a);
        jSONObject.put("participantType", (Object) wg0.n(bg1.b));
        if (z) {
            jSONObject.put("deviceIdx", bg1.c);
        }
    }

    public static final Object[] d0(Collection collection) {
        int size = collection.size();
        Object[] objArr = b;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i2);
            }
            i = i2;
        }
    }

    public static final void e(String str) {
        I();
    }

    public static final Object[] e0(Collection collection, Object[] objArr) {
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArr2 = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length <= 0) {
                return objArr;
            } else {
                objArr[0] = null;
                return objArr;
            }
        } else if (objArr.length <= 0) {
            return objArr;
        } else {
            objArr[0] = null;
            return objArr;
        }
    }

    public static ka6 f(Collection collection, Boolean bool, boolean z) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            bg1 bg1 = (bg1) it.next();
            jSONArray.put((Object) String.valueOf(wg0.b(bg1.b)) + bg1.a);
        }
        jSONObject.put("participantIds", (Object) jSONArray);
        if (bool != null && bool.booleanValue()) {
            jSONObject.put("unban", true);
        }
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("show_chat_history", true);
            jSONObject.put(ApiProtocol.PARAM_PAYLOAD, (Object) jSONObject2.toString());
        }
        return b(jSONObject, "add-participant");
    }

    public static final void f0(y5f y5f) {
        y5f.e(k29.class, new x4(8));
        y5f.e(fwa.class, new x4(9));
        y5f.e(uva.class, new x4(10));
        y5f.e(xcf.class, new x4(11));
        y5f.e(vz.class, new x4(12));
        y5f.e(dt8.class, new x4(13));
        y5f.e(tpe.class, new cl(1));
        y5f.e(u9a.class, new x4(14));
        y5f.e(z3b.class, new cl(2));
        y5f.e(i00.class, new cl(3));
        y5f.e(w80.class, new cl(4));
        y5f.c(pi4.class, new g(1));
        y5f.e(nif.class, new cl(5));
        y5f.e(pb6.class, new cl(6));
        y5f.e(jhf.class, new cl(7));
        y5f.e(vhf.class, new cl(8));
    }

    public static Bitmap g(ov6 ov6) {
        int k0 = ov6.k0();
        if (k0 == 1) {
            Bitmap createBitmap = Bitmap.createBitmap(ov6.getWidth(), ov6.getHeight(), Bitmap.Config.ARGB_8888);
            ov6.v()[0].t().rewind();
            ImageProcessingUtil.e(createBitmap, ov6.v()[0].t(), ov6.v()[0].A());
            return createBitmap;
        } else if (k0 == 35) {
            return ImageProcessingUtil.b(ov6);
        } else {
            if (k0 != 256 && k0 != 4101) {
                throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + ov6.k0() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
            } else if (V(ov6.k0())) {
                ByteBuffer t = ov6.v()[0].t();
                int capacity = t.capacity();
                byte[] bArr = new byte[capacity];
                t.rewind();
                t.get(bArr);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, capacity, (BitmapFactory.Options) null);
                if (decodeByteArray != null) {
                    return decodeByteArray;
                }
                throw new UnsupportedOperationException("Decode jpeg byte array failed");
            } else {
                throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + ov6.k0());
            }
        }
    }

    public static final Object g0(lx3 lx3, Object obj, Object obj2, a66 a66, Continuation continuation) {
        Object obj3;
        Object updateThreadContext = ThreadContextKt.updateThreadContext(lx3, obj2);
        try {
            mxd mxd = new mxd(lx3, continuation);
            if (!(a66 instanceof gi0)) {
                obj3 = v3c.H(a66, obj, mxd);
            } else {
                f8.c(2, a66);
                obj3 = a66.invoke(obj, mxd);
            }
            return obj3;
        } finally {
            ThreadContextKt.restoreThreadContext(lx3, updateThreadContext);
        }
    }

    public static ka6 h(Set set, Set set2) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    jSONObject.put(((oy0) it.next()).name(), true);
                }
            }
            if (set2 != null) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    jSONObject.put(((oy0) it2.next()).name(), false);
                }
            }
            ka6 b2 = b((JSONObject) null, "change-options");
            b2.a.put("options", (Object) jSONObject);
            return b2;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static byte[] h0(ov6 ov6, Rect rect, int i, int i2) {
        if (ov6.k0() == 35) {
            sy4 sy4 = ov6.v()[0];
            sy4 sy42 = ov6.v()[1];
            sy4 sy43 = ov6.v()[2];
            ByteBuffer t = sy4.t();
            ByteBuffer t2 = sy42.t();
            ByteBuffer t3 = sy43.t();
            t.rewind();
            t2.rewind();
            t3.rewind();
            int remaining = t.remaining();
            byte[] bArr = new byte[(((ov6.getHeight() * ov6.getWidth()) / 2) + remaining)];
            int i3 = 0;
            for (int i4 = 0; i4 < ov6.getHeight(); i4++) {
                t.get(bArr, i3, ov6.getWidth());
                i3 += ov6.getWidth();
                t.position(Math.min(remaining, sy4.A() + (t.position() - ov6.getWidth())));
            }
            int height = ov6.getHeight() / 2;
            int width = ov6.getWidth() / 2;
            int A = sy43.A();
            int A2 = sy42.A();
            int w = sy43.w();
            int w2 = sy42.w();
            byte[] bArr2 = new byte[A];
            byte[] bArr3 = new byte[A2];
            for (int i5 = 0; i5 < height; i5++) {
                t3.get(bArr2, 0, Math.min(A, t3.remaining()));
                t2.get(bArr3, 0, Math.min(A2, t2.remaining()));
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < width; i8++) {
                    int i9 = i3 + 1;
                    bArr[i3] = bArr2[i6];
                    i3 += 2;
                    bArr[i9] = bArr3[i7];
                    i6 += w;
                    i7 += w2;
                }
            }
            YuvImage yuvImage = new YuvImage(bArr, 17, ov6.getWidth(), ov6.getHeight(), (int[]) null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            g65[] g65Arr = u55.c;
            t55 t55 = new t55(ByteOrder.BIG_ENDIAN);
            String valueOf = String.valueOf(1);
            ArrayList arrayList = t55.a;
            t55.c("Orientation", valueOf, arrayList);
            t55.c("XResolution", "72/1", arrayList);
            t55.c("YResolution", "72/1", arrayList);
            t55.c("ResolutionUnit", String.valueOf(2), arrayList);
            t55.c("YCbCrPositioning", String.valueOf(1), arrayList);
            t55.c("Make", Build.MANUFACTURER, arrayList);
            t55.c("Model", Build.MODEL, arrayList);
            if (ov6.getImageInfo() != null) {
                ov6.getImageInfo().b(t55);
            }
            t55.d(i2);
            t55.c("ImageWidth", String.valueOf(ov6.getWidth()), arrayList);
            t55.c("ImageLength", String.valueOf(ov6.getHeight()), arrayList);
            ArrayList list = Collections.list(new s55(t55));
            if (!((Map) list.get(1)).isEmpty()) {
                t55.b("ExposureProgram", String.valueOf(0), list);
                t55.b("ExifVersion", "0230", list);
                t55.b("ComponentsConfiguration", "1,2,3,0", list);
                t55.b("MeteringMode", String.valueOf(0), list);
                t55.b("LightSource", String.valueOf(0), list);
                t55.b("FlashpixVersion", "0100", list);
                t55.b("FocalPlaneResolutionUnit", String.valueOf(2), list);
                t55.b("FileSource", String.valueOf(3), list);
                t55.b("SceneType", String.valueOf(1), list);
                t55.b("CustomRendered", String.valueOf(0), list);
                t55.b("SceneCaptureType", String.valueOf(0), list);
                t55.b("Contrast", String.valueOf(0), list);
                t55.b("Saturation", String.valueOf(0), list);
                t55.b("Sharpness", String.valueOf(0), list);
            }
            if (!((Map) list.get(2)).isEmpty()) {
                t55.b("GPSVersionID", "2300", list);
                t55.b("GPSSpeedRef", "K", list);
                t55.b("GPSTrackRef", "T", list);
                t55.b("GPSImgDirectionRef", "T", list);
                t55.b("GPSDestBearingRef", "T", list);
                t55.b("GPSDestDistanceRef", "K", list);
            }
            if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, ov6.getWidth(), ov6.getHeight()) : rect, i, new f65(byteArrayOutputStream, new u55(t55.b, list)))) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new Exception("YuvImage failed to encode jpeg.");
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + ov6.k0());
    }

    public static ka6 i(Map map, bg1 bg1) {
        try {
            ka6 b2 = b((JSONObject) null, "change-participant-state");
            JSONObject jSONObject = b2.a;
            jSONObject.put("participantState", (Object) new JSONObject().put("state", (Object) new JSONObject((Map<?, ?>) map)));
            if (bg1 != null) {
                jSONObject.put("participantId", (Object) bg1.c());
            }
            return b2;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static ka6 j(bg1 bg1, JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("participantId", bg1.a);
            jSONObject2.put("participantType", (Object) wg0.n(bg1.b));
            jSONObject2.put("deviceIdx", bg1.c);
            jSONObject2.put("data", (Object) jSONObject);
            return b(jSONObject2, "custom-data");
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:19:0x0045=Splitter:B:19:0x0045, B:31:0x0075=Splitter:B:31:0x0075} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.o61 k(org.json.JSONObject r11) {
        /*
            java.lang.String r0 = "decorativeExternalParticipantId"
            r1 = 0
            if (r11 != 0) goto L_0x0006
            return r1
        L_0x0006:
            java.lang.String r2 = "deviceIdx"
            r3 = 0
            int r2 = r11.optInt(r2, r3)     // Catch:{ JSONException -> 0x007b }
            boolean r3 = r11.has(r0)     // Catch:{ JSONException -> 0x007b }
            r4 = 3
            r5 = 2
            r6 = 1
            java.lang.String r7 = "vk"
            java.lang.String r8 = "anonym"
            java.lang.String r9 = "type"
            java.lang.String r10 = "id"
            if (r3 == 0) goto L_0x004c
            org.json.JSONObject r11 = r11.getJSONObject(r0)     // Catch:{ JSONException -> 0x007b }
            if (r11 != 0) goto L_0x0025
            goto L_0x004b
        L_0x0025:
            java.lang.String r0 = r11.getString(r10)     // Catch:{ JSONException -> 0x007b }
            java.lang.String r11 = r11.getString(r9)     // Catch:{ JSONException -> 0x007b }
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch:{ JSONException -> 0x007b }
            java.lang.String r11 = r11.toLowerCase(r3)     // Catch:{ JSONException -> 0x007b }
            r11.getClass()     // Catch:{ JSONException -> 0x007b }
            boolean r3 = r11.equals(r8)
            if (r3 != 0) goto L_0x0045
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x0044
            r4 = r6
            goto L_0x0045
        L_0x0044:
            r4 = r5
        L_0x0045:
            o61 r11 = new o61     // Catch:{ JSONException -> 0x007b }
            r11.<init>(r0, r4, r2)     // Catch:{ JSONException -> 0x007b }
            r1 = r11
        L_0x004b:
            return r1
        L_0x004c:
            java.lang.String r0 = "externalId"
            org.json.JSONObject r11 = r11.getJSONObject(r0)     // Catch:{ JSONException -> 0x007b }
            if (r11 != 0) goto L_0x0055
            goto L_0x007b
        L_0x0055:
            java.lang.String r0 = r11.getString(r10)     // Catch:{ JSONException -> 0x007b }
            java.lang.String r11 = r11.getString(r9)     // Catch:{ JSONException -> 0x007b }
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch:{ JSONException -> 0x007b }
            java.lang.String r11 = r11.toLowerCase(r3)     // Catch:{ JSONException -> 0x007b }
            r11.getClass()     // Catch:{ JSONException -> 0x007b }
            boolean r3 = r11.equals(r8)
            if (r3 != 0) goto L_0x0075
            boolean r11 = r11.equals(r7)
            if (r11 != 0) goto L_0x0074
            r4 = r6
            goto L_0x0075
        L_0x0074:
            r4 = r5
        L_0x0075:
            o61 r11 = new o61     // Catch:{ JSONException -> 0x007b }
            r11.<init>(r0, r4, r2)     // Catch:{ JSONException -> 0x007b }
            r1 = r11
        L_0x007b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f46.k(org.json.JSONObject):o61");
    }

    public static JSONObject l(bg1 bg1, SessionDescription sessionDescription) {
        JSONObject jSONObject = new JSONObject();
        d(bg1, jSONObject, true);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("type", (Object) sessionDescription.type.canonicalForm());
        jSONObject2.put("sdp", (Object) sessionDescription.description);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("sdp", (Object) jSONObject2);
        jSONObject.put("data", (Object) jSONObject3);
        return jSONObject;
    }

    public static rd8 m(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("UNMUTE")) {
            return rd8.a;
        }
        if (str.equals("MUTE")) {
            return rd8.b;
        }
        if (str.equals("MUTE_PERMANENT")) {
            return rd8.c;
        }
        return null;
    }

    public static HashMap n(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        JSONObject optJSONObject = jSONObject.optJSONObject("muteStates");
        if (optJSONObject != null) {
            hashMap.put(qd8.a, m(optJSONObject.optString("AUDIO")));
            hashMap.put(qd8.b, m(optJSONObject.optString("VIDEO")));
            hashMap.put(qd8.c, m(optJSONObject.optString("SCREEN_SHARING")));
            hashMap.put(qd8.o, m(optJSONObject.optString("MOVIE_SHARING")));
        }
        return hashMap;
    }

    public static ji9 o(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject("mediaSettings");
        if (optJSONObject == null) {
            return null;
        }
        return new ji9(optJSONObject.optBoolean("isAudioEnabled", false), optJSONObject.optBoolean("isVideoEnabled", false), optJSONObject.optBoolean("isScreenSharingEnabled", false), optJSONObject.optBoolean("isAnimojiEnabled", false));
    }

    public static JSONObject p(dpd dpd, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isVideoEnabled", dpd.a);
            jSONObject.put("isAudioEnabled", dpd.b);
            jSONObject.put("isScreenSharingEnabled", dpd.c);
            jSONObject.put("isAnimojiEnabled", dpd.e);
            if (z) {
                jSONObject.put("isFastScreenSharingEnabled", dpd.d);
            }
            if (z2) {
                jSONObject.put("isAudioSharingEnabled", dpd.f);
            }
            return jSONObject;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static kpa q(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONObject(ApiProtocol.PARAM_PEER_ID);
        if (optJSONObject != null) {
            return new kpa(optJSONObject.getString("id"), optJSONObject.optString("type", "WEB_SOCKET"));
        }
        return null;
    }

    public static ka6 r(bg1 bg1, boolean z) {
        try {
            ka6 b2 = b((JSONObject) null, "promote-participant");
            JSONObject jSONObject = b2.a;
            jSONObject.put("demote", !z);
            jSONObject.put("participantId", (Object) bg1.c());
            return b2;
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static ka6 s(bg1 bg1, Boolean bool, boolean z) {
        JSONObject jSONObject = new JSONObject();
        d(bg1, jSONObject, false);
        if (bool != null && bool.booleanValue()) {
            jSONObject.put("unban", true);
        }
        if (z) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("show_chat_history", true);
            jSONObject.put(ApiProtocol.PARAM_PAYLOAD, (Object) jSONObject2.toString());
        }
        return b(jSONObject, "add-participant");
    }

    public static ka6 t(int i, Integer num, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i3, boolean z7, boolean z8, boolean z9) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("maxH264Decoders", i);
        if (num != null) {
            jSONObject.put("estimatedPerformanceIndex", (Object) num);
        }
        jSONObject.put("producerNotificationDataChannelVersion", 7);
        jSONObject.put("producerCommandDataChannelVersion", i2);
        jSONObject.put("audioMix", true);
        jSONObject.put("consumerUpdate", z);
        jSONObject.put("onDemandTracks", z2);
        jSONObject.put("singleSession", true);
        jSONObject.put("unifiedPlan", true);
        jSONObject.put("fastScreenShare", true);
        if (z3) {
            jSONObject.put("producerScreenDataChannelVersion", 1);
        }
        if (z4) {
            jSONObject.put("consumerScreenDataChannelVersion", 1);
        }
        if (z6) {
            jSONObject.put("animojiDataChannelVersion", 2);
        }
        if (z7) {
            jSONObject.put("asrDataChannelVersion", 1);
        }
        if (z8) {
            jSONObject.put("consumerFastScreenShare", true);
        }
        jSONObject.put("consumerFastScreenShareQualityOnDemand", true);
        if (z9) {
            jSONObject.put("audioShare", true);
        }
        jSONObject.put("red", z5);
        if (i3 > 0) {
            jSONObject.put("videoTracksCount", i3);
            jSONObject.put("csrcAccessible", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("capabilities", (Object) jSONObject);
        return b(jSONObject2, "allocate-consumer");
    }

    public static ka6 u(bg1 bg1, List list, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", (Object) bg1.c());
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put((Object) (eg1) it.next());
        }
        jSONObject.put("roles", (Object) jSONArray);
        jSONObject.put("revoke", z);
        return b(jSONObject, "grant-roles");
    }

    public static ka6 v(bg1 bg1, zad zad, boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("participantId", (Object) bg1.c());
        if (zad instanceof yad) {
            jSONObject.put("roomId", ((yad) zad).a);
        }
        jSONObject.put("unpin", !z);
        return b(jSONObject, "pin-participant");
    }

    public static ka6 w(bg1 bg1, IceCandidate iceCandidate) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("candidate", (Object) iceCandidate.sdp.replaceAll("(raddr|rport)\\s.+?\\s", ""));
        jSONObject.put("sdpMid", (Object) iceCandidate.sdpMid);
        jSONObject.put("sdpMLineIndex", iceCandidate.sdpMLineIndex);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("candidate", (Object) jSONObject);
        JSONObject jSONObject3 = new JSONObject();
        d(bg1, jSONObject3, true);
        jSONObject3.put("data", (Object) jSONObject2);
        return b(jSONObject3, "transmit-data");
    }

    public static ka6 x(bg1 bg1, IceCandidate[] iceCandidateArr) {
        JSONArray jSONArray = new JSONArray();
        for (IceCandidate iceCandidate : iceCandidateArr) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("candidate", (Object) iceCandidate.sdp.replaceAll("(raddr|rport)\\s.+?\\s", ""));
            jSONObject.put("sdpMid", (Object) iceCandidate.sdpMid);
            jSONObject.put("sdpMLineIndex", iceCandidate.sdpMLineIndex);
            jSONArray.put((Object) jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("candidates-removed", (Object) jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        d(bg1, jSONObject3, true);
        jSONObject3.put("data", (Object) jSONObject2);
        return b(jSONObject3, "transmit-data");
    }

    public static ArrayList y(JSONObject jSONObject) {
        JSONArray optJSONArray;
        ArrayList arrayList = new ArrayList();
        if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray("roles")) == null)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    arrayList.add(eg1.valueOf(optJSONArray.getString(i)));
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return arrayList;
    }

    public static ka6 z(zge zge) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("command", (Object) "switch-room");
        if (zge == null) {
            return new ka6(jSONObject);
        }
        zad zad = zge.a;
        if (zad != null && (zad instanceof yad)) {
            jSONObject.put("toRoomId", ((yad) zad).a);
        }
        bg1 bg1 = zge.b;
        if (bg1 != null) {
            jSONObject.put("participantId", (Object) bg1.c());
        }
        return new ka6(jSONObject);
    }
}
