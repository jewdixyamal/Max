package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.hardware.camera2.CameraDevice;
import android.text.Spanned;
import com.facebook.fresco.animation.factory.AnimatedFactoryV2Impl;
import java.lang.reflect.Array;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.tamtam.workmanager.BacklogWorker;

/* renamed from: xfg  reason: default package */
public abstract class xfg {
    public static ClassLoader a;
    public static Thread b;
    public static final o97 c = new o97("SAMPLED_TRACE", 1);
    public static final int[] d = {16842919};
    public static final int[] e = {16842908};
    public static final int[] f = {16842913, 16842919};
    public static final int[] g = {16842913};
    public static boolean h;
    public static AnimatedFactoryV2Impl i;

    public static int A(Object obj) {
        return z(obj == null ? 0 : obj.hashCode());
    }

    public static g7g B(p7g p7g, Integer num, q8g q8g) {
        BacklogWorker backlogWorker;
        rla rla = (rla) ((qla) new qla(BacklogWorker.class).setBackoffCriteria(mf0.b, num.longValue(), TimeUnit.SECONDS)).build();
        if (!(q8g == null || (backlogWorker = BacklogWorker.Y) == null)) {
            synchronized (backlogWorker.c) {
                hm9.m("BACKLOG_WORKER", "stayAlive, isRunning = %b", Boolean.valueOf(backlogWorker.X));
                backlogWorker.o.add(q8g.a);
            }
        }
        h65 h65 = h65.b;
        p7g.getClass();
        List singletonList = Collections.singletonList(rla);
        s7g s7g = (s7g) p7g;
        if (!singletonList.isEmpty()) {
            return new g7g(s7g, "BACKLOG_WORKER", h65, singletonList);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    public static JSONArray C(Iterable iterable) {
        String str;
        JSONArray jSONArray = new JSONArray();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            fbd fbd = (fbd) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("versionName", (Object) fbd.b);
            jSONObject.put("versionCode", fbd.a);
            jSONObject.put("environment", (Object) fbd.c);
            jSONObject.put("sessionUuid", (Object) fbd.d);
            jSONObject.put("processName", (Object) fbd.e);
            int i2 = fbd.f;
            if (i2 == 1) {
                str = "BLANK";
            } else if (i2 == 2) {
                str = "CRASH";
            } else if (i2 == 3) {
                str = "ANR";
            } else if (i2 == 4) {
                str = "NATIVE";
            } else {
                throw null;
            }
            jSONObject.put("status", (Object) str);
            bjd bjd = fbd.g;
            jSONObject.put("maxSeverity", (Object) bjd != null ? bjd.equals(bjd.c) ? "FATAL" : bjd.equals(bjd.o) ? "ERROR" : bjd.equals(bjd.X) ? "WARNING" : bjd.equals(bjd.Y) ? "NOTICE" : bjd.equals(bjd.Z) ? "INFO" : "DEBUG" : null);
            jSONObject.put("isInBackground", fbd.h);
            jSONArray.put((Object) jSONObject);
        }
        return jSONArray;
    }

    public static void D(ss0 ss0, byte[] bArr) {
        long j;
        int length = bArr.length;
        int i2 = 0;
        do {
            byte[] bArr2 = ss0.X;
            int i3 = ss0.Y;
            int i4 = ss0.Z;
            if (bArr2 != null) {
                while (i3 < i4) {
                    int i5 = i2 % length;
                    bArr2[i3] = (byte) (bArr2[i3] ^ bArr[i5]);
                    i3++;
                    i2 = i5 + 1;
                }
            }
            j = ss0.o;
            if (j == ss0.a.b) {
                throw new IllegalStateException("no more bytes".toString());
            }
        } while (ss0.d(j == -1 ? 0 : j + ((long) (ss0.Z - ss0.Y))) != -1);
    }

    public static final void E(y5f y5f) {
        y5f.e(eua.class, new b6a(19));
        y5f.e(rta.class, new b6a(20));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008c, code lost:
        if (r1 == null) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.ClassLoader F() {
        /*
            java.lang.Class<xfg> r0 = defpackage.xfg.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = a     // Catch:{ all -> 0x008f }
            if (r1 != 0) goto L_0x00a7
            java.lang.Thread r1 = b     // Catch:{ all -> 0x008f }
            r2 = 0
            if (r1 != 0) goto L_0x0093
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x008f }
            java.lang.Thread r1 = r1.getThread()     // Catch:{ all -> 0x008f }
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch:{ all -> 0x008f }
            if (r1 != 0) goto L_0x001d
            r1 = r2
            goto L_0x008a
        L_0x001d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch:{ all -> 0x008f }
            int r4 = r1.activeGroupCount()     // Catch:{ SecurityException -> 0x0041 }
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch:{ SecurityException -> 0x0041 }
            r1.enumerate(r5)     // Catch:{ SecurityException -> 0x0041 }
            r6 = 0
            r7 = r6
        L_0x002b:
            if (r7 >= r4) goto L_0x0043
            r8 = r5[r7]     // Catch:{ SecurityException -> 0x0041 }
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch:{ SecurityException -> 0x0041 }
            boolean r9 = r9.equals(r10)     // Catch:{ SecurityException -> 0x0041 }
            if (r9 == 0) goto L_0x003c
            goto L_0x0044
        L_0x003c:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x003f:
            r1 = move-exception
            goto L_0x0091
        L_0x0041:
            r1 = move-exception
            goto L_0x0083
        L_0x0043:
            r8 = r2
        L_0x0044:
            if (r8 != 0) goto L_0x004d
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch:{ SecurityException -> 0x0041 }
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch:{ SecurityException -> 0x0041 }
        L_0x004d:
            int r1 = r8.activeCount()     // Catch:{ SecurityException -> 0x0041 }
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch:{ SecurityException -> 0x0041 }
            r8.enumerate(r4)     // Catch:{ SecurityException -> 0x0041 }
        L_0x0056:
            if (r6 >= r1) goto L_0x006a
            r5 = r4[r6]     // Catch:{ SecurityException -> 0x0041 }
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch:{ SecurityException -> 0x0041 }
            boolean r7 = r7.equals(r9)     // Catch:{ SecurityException -> 0x0041 }
            if (r7 == 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            int r6 = r6 + 1
            goto L_0x0056
        L_0x006a:
            r5 = r2
        L_0x006b:
            if (r5 != 0) goto L_0x0088
            tx r1 = new tx     // Catch:{ SecurityException -> 0x0081 }
            java.lang.String r4 = "GmsDynamite"
            r1.<init>((java.lang.ThreadGroup) r8, (java.lang.String) r4)     // Catch:{ SecurityException -> 0x0081 }
            r1.setContextClassLoader(r2)     // Catch:{ SecurityException -> 0x007c }
            r1.start()     // Catch:{ SecurityException -> 0x007c }
            r5 = r1
            goto L_0x0088
        L_0x007c:
            r4 = move-exception
            r5 = r1
            goto L_0x0085
        L_0x007f:
            r4 = r1
            goto L_0x0085
        L_0x0081:
            r1 = move-exception
            goto L_0x007f
        L_0x0083:
            r4 = r1
            r5 = r2
        L_0x0085:
            r4.getMessage()     // Catch:{ all -> 0x003f }
        L_0x0088:
            monitor-exit(r3)     // Catch:{ all -> 0x003f }
            r1 = r5
        L_0x008a:
            b = r1     // Catch:{ all -> 0x008f }
            if (r1 != 0) goto L_0x0093
            goto L_0x00a2
        L_0x008f:
            r1 = move-exception
            goto L_0x00ab
        L_0x0091:
            monitor-exit(r3)     // Catch:{ all -> 0x003f }
            throw r1     // Catch:{ all -> 0x008f }
        L_0x0093:
            monitor-enter(r1)     // Catch:{ all -> 0x008f }
            java.lang.Thread r3 = b     // Catch:{ SecurityException -> 0x009d }
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch:{ SecurityException -> 0x009d }
            goto L_0x00a1
        L_0x009b:
            r2 = move-exception
            goto L_0x00a5
        L_0x009d:
            r3 = move-exception
            r3.getMessage()     // Catch:{ all -> 0x009b }
        L_0x00a1:
            monitor-exit(r1)     // Catch:{ all -> 0x009b }
        L_0x00a2:
            a = r2     // Catch:{ all -> 0x008f }
            goto L_0x00a7
        L_0x00a5:
            monitor-exit(r1)     // Catch:{ all -> 0x009b }
            throw r2     // Catch:{ all -> 0x008f }
        L_0x00a7:
            java.lang.ClassLoader r1 = a     // Catch:{ all -> 0x008f }
            monitor-exit(r0)
            return r1
        L_0x00ab:
            monitor-exit(r0)     // Catch:{ all -> 0x008f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xfg.F():java.lang.ClassLoader");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [kotlinx.serialization.json.internal.JsonEncodingException, java.lang.IllegalArgumentException] */
    public static final JsonEncodingException a(r6d r6d) {
        return new IllegalArgumentException("Value of type '" + r6d.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + r6d.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [java.lang.IllegalArgumentException, kotlinx.serialization.json.internal.JsonDecodingException] */
    public static final JsonDecodingException b(String str, CharSequence charSequence, int i2) {
        StringBuilder o = rh4.o(str, "\nJSON input: ");
        if (charSequence.length() >= 200) {
            String str2 = ".....";
            if (i2 == -1) {
                int length = charSequence.length() - 60;
                if (length > 0) {
                    charSequence = str2 + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i3 = i2 - 30;
                int i4 = i2 + 30;
                String str3 = i3 <= 0 ? "" : str2;
                if (i4 >= charSequence.length()) {
                    str2 = "";
                }
                StringBuilder l = au1.l(str3);
                if (i3 < 0) {
                    i3 = 0;
                }
                int length2 = charSequence.length();
                if (i4 > length2) {
                    i4 = length2;
                }
                l.append(charSequence.subSequence(i3, i4).toString());
                l.append(str2);
                charSequence = l.toString();
            }
        }
        o.append(charSequence);
        String sb = o.toString();
        if (i2 >= 0) {
            sb = "Unexpected JSON token at offset " + i2 + ": " + sb;
        }
        return new IllegalArgumentException(sb);
    }

    public static final void c(CharSequence charSequence, fka fka) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            for (Object obj : spanned.getSpans(0, spanned.length(), kre.class)) {
                ((kre) obj).onThemeChanged(fka);
            }
        }
    }

    public static ca3 d(m56... m56Arr) {
        if (m56Arr.length > 0) {
            return new ca3(0, m56Arr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public static int e(Comparable comparable, Comparable comparable2) {
        if (comparable != null && comparable2 != null) {
            return comparable.compareTo(comparable2);
        }
        if (!(comparable == null && comparable2 == null)) {
            if (comparable != null || comparable2 == null) {
                return (comparable == null || comparable2 != null) ? 0 : 1;
            }
            return -1;
        }
    }

    public static int f(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static CameraDevice.StateCallback g(ArrayList arrayList) {
        return arrayList.isEmpty() ? new CameraDevice.StateCallback() : arrayList.size() == 1 ? (CameraDevice.StateCallback) arrayList.get(0) : new nw1(arrayList);
    }

    public static void h(ArrayList arrayList) {
        HashMap hashMap = new HashMap(arrayList.size());
        Iterator it = arrayList.iterator();
        while (true) {
            int i2 = 0;
            if (it.hasNext()) {
                nb3 nb3 = (nb3) it.next();
                b14 b14 = new b14(nb3);
                Iterator it2 = nb3.b.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        lqb lqb = (lqb) it2.next();
                        boolean z = !(nb3.e == 0);
                        c14 c14 = new c14(lqb, z);
                        if (!hashMap.containsKey(c14)) {
                            hashMap.put(c14, new HashSet());
                        }
                        Set set = (Set) hashMap.get(c14);
                        if (set.isEmpty() || z) {
                            set.add(b14);
                        } else {
                            throw new IllegalArgumentException("Multiple components provide " + lqb + ".");
                        }
                    }
                }
            } else {
                for (Set<b14> it3 : hashMap.values()) {
                    for (b14 b142 : it3) {
                        for (nh4 nh4 : b142.a.c) {
                            if (nh4.c == 0) {
                                Set<b14> set2 = (Set) hashMap.get(new c14(nh4.a, nh4.b == 2));
                                if (set2 != null) {
                                    for (b14 b143 : set2) {
                                        b142.b.add(b143);
                                        b143.c.add(b142);
                                    }
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                for (Set addAll : hashMap.values()) {
                    hashSet.addAll(addAll);
                }
                HashSet hashSet2 = new HashSet();
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    b14 b144 = (b14) it4.next();
                    if (b144.c.isEmpty()) {
                        hashSet2.add(b144);
                    }
                }
                while (!hashSet2.isEmpty()) {
                    b14 b145 = (b14) hashSet2.iterator().next();
                    hashSet2.remove(b145);
                    i2++;
                    Iterator it5 = b145.b.iterator();
                    while (it5.hasNext()) {
                        b14 b146 = (b14) it5.next();
                        b146.c.remove(b145);
                        if (b146.c.isEmpty()) {
                            hashSet2.add(b146);
                        }
                    }
                }
                if (i2 != arrayList.size()) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        b14 b147 = (b14) it6.next();
                        if (!b147.c.isEmpty() && !b147.b.isEmpty()) {
                            arrayList2.add(b147.a);
                        }
                    }
                    throw new RuntimeException("Dependency cycle detected: " + Arrays.toString(arrayList2.toArray()));
                }
                return;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [long[], java.io.Serializable] */
    public static final zw5 i(Map map) {
        zw5 zw5 = new zw5(0);
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (jz7.$EnumSwitchMapping$0[((pa2) entry.getKey()).ordinal()] == 1) {
                zw5.b = (long[]) value;
            }
        }
        return zw5;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [int[], java.io.Serializable] */
    public static final zw5 j(Collection collection) {
        zw5 zw5 = new zw5(1);
        Iterator it = collection.iterator();
        int size = collection.size();
        ? r2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            r2[i2] = ((cv5) it.next()).a;
        }
        zw5.b = r2;
        return zw5;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [ax5[], java.io.Serializable] */
    public static final zw5 k(List list) {
        zw5 zw5 = new zw5(2);
        int size = list.size();
        ? r2 = new ax5[size];
        for (int i2 = 0; i2 < size; i2++) {
            hv5 hv5 = (hv5) list.get(i2);
            ax5 ax5 = new ax5();
            ax5.a = hv5.a;
            ax5.b = hv5.b;
            ax5.c = hv5.c;
            String str = "";
            String str2 = hv5.d;
            if (str2 == null) {
                str2 = str;
            }
            ax5.d = str2;
            Long l = hv5.e;
            ax5.e = l != null ? l.longValue() : -1;
            String str3 = hv5.g;
            if (str3 == null) {
                str3 = str;
            }
            ax5.f = str3;
            String str4 = hv5.h;
            if (str4 == null) {
                str4 = str;
            }
            ax5.g = str4;
            String str5 = hv5.f;
            if (str5 != null) {
                str = str5;
            }
            ax5.h = str;
            r2[i2] = ax5;
        }
        zw5.b = r2;
        return zw5;
    }

    public static ArrayList l(String str) {
        int i2;
        bjd bjd;
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i3 = 0;
        while (i3 < length) {
            JSONObject jSONObject = jSONArray.getJSONObject(i3);
            String string = jSONObject.getString("versionName");
            long j = jSONObject.getLong("versionCode");
            String optString = jSONObject.optString("environment", "");
            String str2 = optString.length() > 0 ? optString : null;
            String optString2 = jSONObject.optString("sessionUuid", "");
            if (optString2.length() <= 0) {
                optString2 = null;
            }
            if (optString2 == null) {
                optString2 = UUID.randomUUID().toString();
            }
            String optString3 = jSONObject.optString("processName", "");
            if (optString3.length() <= 0) {
                optString3 = null;
            }
            String string2 = jSONObject.getString("status");
            if (string2 != null) {
                if (string2.equals("BLANK")) {
                    i2 = 1;
                } else if (string2.equals("CRASH")) {
                    i2 = 2;
                } else if (string2.equals("ANR")) {
                    i2 = 3;
                } else if (string2.equals("NATIVE")) {
                    i2 = 4;
                } else {
                    throw new IllegalArgumentException("No enum constant ru.ok.tracer.session.SessionState.Status.".concat(string2));
                }
                String optString4 = jSONObject.optString("maxSeverity", "");
                if (optString4.length() <= 0) {
                    optString4 = null;
                }
                if (optString4 != null) {
                    int hashCode = optString4.hashCode();
                    bjd = bjd.s0;
                    switch (hashCode) {
                        case -1986360616:
                            if (optString4.equals("NOTICE")) {
                                bjd = bjd.Y;
                                break;
                            } else {
                                break;
                            }
                        case 2251950:
                            if (optString4.equals("INFO")) {
                                bjd = bjd.Z;
                                break;
                            } else {
                                break;
                            }
                        case 64921139:
                            boolean equals = optString4.equals("DEBUG");
                            break;
                        case 66247144:
                            if (optString4.equals("ERROR")) {
                                bjd = bjd.o;
                                break;
                            } else {
                                break;
                            }
                        case 66665700:
                            if (optString4.equals("FATAL")) {
                                bjd = bjd.c;
                                break;
                            } else {
                                break;
                            }
                        case 1842428796:
                            if (optString4.equals("WARNING")) {
                                bjd = bjd.X;
                                break;
                            } else {
                                break;
                            }
                    }
                } else {
                    bjd = null;
                }
                arrayList.add(new fbd(j, string, str2, optString2, optString3, i2, bjd, jSONObject.optBoolean("isInBackground")));
                i3++;
            } else {
                throw new NullPointerException("Name is null");
            }
        }
        return arrayList;
    }

    public static final EnumSet m(zw5 zw5) {
        Object obj;
        int[] iArr = (int[]) zw5.b;
        EnumSet<E> noneOf = EnumSet.noneOf(cv5.class);
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = iArr[i2];
            cv5.b.getClass();
            v25 v25 = cv5.Y;
            v25.getClass();
            u1 u1Var = new u1(0, v25);
            while (true) {
                if (!u1Var.hasNext()) {
                    obj = null;
                    break;
                }
                obj = u1Var.next();
                if (((cv5) obj).a == i3) {
                    break;
                }
            }
            cv5 cv5 = (cv5) obj;
            if (cv5 != null) {
                noneOf.add(cv5);
                i2++;
            } else {
                throw new IllegalStateException(("unsupported type " + i3).toString());
            }
        }
        return noneOf;
    }

    public static final ArrayList n(zw5 zw5) {
        ax5[] ax5Arr = (ax5[]) zw5.b;
        ArrayList arrayList = new ArrayList(ax5Arr.length);
        for (ax5 ax5 : ax5Arr) {
            long j = ax5.a;
            String str = ax5.b;
            String str2 = ax5.c;
            String str3 = ax5.d;
            String str4 = (str3 == null || str3.length() == 0) ? null : str3;
            long j2 = ax5.e;
            Long valueOf = j2 == -1 ? null : Long.valueOf(j2);
            String str5 = ax5.f;
            String str6 = (str5 == null || str5.length() == 0) ? null : str5;
            String str7 = ax5.g;
            String str8 = (str7 == null || str7.length() == 0) ? null : str7;
            String str9 = ax5.h;
            if (str9 == null || str9.length() == 0) {
                str9 = null;
            }
            arrayList.add(new hv5(j, str, str2, str4, valueOf, str9, str6, str8));
        }
        return arrayList;
    }

    public static int o(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return s63.i(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static int p(int i2, Object obj) {
        if (obj == null) {
            return i2 * 37;
        }
        if (obj.getClass().isArray()) {
            int length = Array.getLength(obj);
            for (int i3 = 0; i3 < length; i3++) {
                i2 = p(i2, Array.get(obj, i3));
            }
            return i2;
        }
        return (i2 * 37) + obj.hashCode();
    }

    public static final void q(l0f l0f, String str) {
        l0f.t(l0f.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static /* synthetic */ void r(l0f l0f) {
        q(l0f, "object");
        throw null;
    }

    public static boolean s(Throwable th) {
        return oaf.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/NotProvisionedException;.<init>(");
    }

    public static boolean t(Throwable th) {
        return oaf.a == 34 && (th instanceof NoSuchMethodError) && th.getMessage() != null && th.getMessage().contains("Landroid/media/ResourceBusyException;.<init>(");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [u6f, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, o8f] */
    /* JADX WARNING: type inference failed for: r4v0, types: [gk8, java.lang.Object] */
    public static v6f u(e7f e7f) {
        d7f d7f;
        ? obj = new Object();
        obj.g = q8f.UNKNOWN;
        String str = e7f.b;
        mx1 mx1 = e7f.a;
        p8f p8f = null;
        if (mx1 == null) {
            d7f = null;
        } else {
            ? obj2 = new Object();
            obj2.d = str;
            obj2.a = mx1.b;
            obj2.b = mx1.a;
            obj2.c = (String) mx1.c;
            d7f = new d7f(obj2);
        }
        obj.a = d7f;
        o8f o8f = e7f.i;
        if (o8f != null) {
            ? obj3 = new Object();
            obj3.a = o8f.a;
            obj3.b = o8f.b;
            p8f = new p8f(obj3);
        }
        obj.h = p8f;
        obj.g = e7f.h;
        obj.b = e7f.c;
        obj.c = e7f.d;
        obj.d = e7f.e;
        obj.f = e7f.g;
        obj.e = e7f.f;
        obj.i = e7f.j;
        return new v6f(obj);
    }

    public static jn v(String str) {
        int i2;
        String str2;
        boolean o0 = eae.o0(str, "HTTP/1.", false);
        sob sob = sob.HTTP_1_0;
        if (o0) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt == 1) {
                    sob = sob.HTTP_1_1;
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
            }
        } else if (eae.o0(str, "ICY ", false)) {
            i2 = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        int i3 = i2 + 3;
        if (str.length() >= i3) {
            try {
                int parseInt = Integer.parseInt(str.substring(i2, i3));
                if (str.length() <= i3) {
                    str2 = "";
                } else if (str.charAt(i3) == ' ') {
                    str2 = str.substring(i2 + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                return new jn(parseInt, 21, sob, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    public static final Object w(pa2 pa2, gy8 gy8) {
        if (mk5.$EnumSwitchMapping$0[pa2.ordinal()] == 1) {
            return u7d.c(gy8);
        }
        try {
            gy8.z();
            return null;
        } catch (Throwable th) {
            hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", th);
            Iterator it = u7d.a.iterator();
            while (it.hasNext()) {
                ((r4a) it.next()).getClass();
                r4a.a(th);
            }
            int s = au1.s(k7d.a);
            if (s == 0) {
                return null;
            }
            if (s != 1) {
                throw new NoWhenBranchMatchedException();
            }
            throw th;
        }
    }

    public static t9c x(Integer num) {
        int intValue = num.intValue();
        for (t9c t9c : t9c.values()) {
            if (t9c.a == intValue) {
                return t9c;
            }
        }
        return t9c.UNKNOWN;
    }

    public static boolean y(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }

    public static int z(int i2) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i2) * -862048943), 15)) * 461845907);
    }
}
