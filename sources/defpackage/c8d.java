package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.util.Size;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.inject.Provider;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: c8d  reason: default package */
public final class c8d implements tk6, cag, tge, Provider, hpf {
    public static c8d X;
    public static final npa Y = new Object();
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public /* synthetic */ c8d(Object obj, Object obj2, Object obj3, Object obj4) {
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
        this.o = obj4;
    }

    public static synchronized c8d r() {
        c8d c8d;
        synchronized (c8d.class) {
            try {
                if (X == null) {
                    X = new c8d(0);
                }
                c8d = X;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return c8d;
    }

    public static void z(long j, Map map) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            if (((Long) entry.getValue()).longValue() <= j) {
                arrayList.add(entry.getKey());
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            map.remove(arrayList.get(i));
        }
    }

    public lk0 A(List list) {
        ArrayList l = l(list);
        if (l.size() < 2) {
            return (lk0) mqd.l(l, (Object) null);
        }
        Collections.sort(l, new v00(3));
        ArrayList arrayList = new ArrayList();
        int i = 0;
        int i2 = ((lk0) l.get(0)).c;
        int i3 = 0;
        while (true) {
            if (i3 >= l.size()) {
                break;
            }
            lk0 lk0 = (lk0) l.get(i3);
            if (i2 == lk0.c) {
                arrayList.add(new Pair(lk0.b, Integer.valueOf(lk0.d)));
                i3++;
            } else if (arrayList.size() == 1) {
                return (lk0) l.get(0);
            }
        }
        HashMap hashMap = (HashMap) this.c;
        lk0 lk02 = (lk0) hashMap.get(arrayList);
        if (lk02 == null) {
            List subList = l.subList(0, arrayList.size());
            int i4 = 0;
            for (int i5 = 0; i5 < subList.size(); i5++) {
                i4 += ((lk0) subList.get(i5)).d;
            }
            int nextInt = ((Random) this.o).nextInt(i4);
            int i6 = 0;
            while (true) {
                if (i >= subList.size()) {
                    lk02 = (lk0) mqd.m(subList);
                    break;
                }
                lk0 lk03 = (lk0) subList.get(i);
                i6 += lk03.d;
                if (nextInt < i6) {
                    lk02 = lk03;
                    break;
                }
                i++;
            }
            hashMap.put(arrayList, lk02);
        }
        return lk02;
    }

    public void a(TotalCaptureResult totalCaptureResult) {
        if (((lq1) this.c) != null) {
            CaptureRequest request = totalCaptureResult.getRequest();
            Rect rect = request == null ? null : (Rect) request.get(CaptureRequest.SCALER_CROP_REGION);
            Rect rect2 = (Rect) this.o;
            if (rect2 != null && rect2.equals(rect)) {
                ((lq1) this.c).b((Object) null);
                this.c = null;
                this.o = null;
            }
        }
    }

    public void b(re6 re6) {
        Rect rect = (Rect) this.b;
        if (rect != null) {
            re6.r0(CaptureRequest.SCALER_CROP_REGION, rect);
        }
    }

    public float c() {
        Float f = (Float) ((xv1) this.a).a(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null && f.floatValue() >= 1.0f) {
            return f.floatValue();
        }
        return 1.0f;
    }

    public float d() {
        return 1.0f;
    }

    public void dispose() {
        SparseArray sparseArray = (SparseArray) ((sh0) this.o).c;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            if (((cn9) sparseArray.valueAt(size)) == ((cn9) this.c)) {
                sparseArray.removeAt(size);
            }
        }
    }

    public Rect e() {
        Rect rect = (Rect) this.b;
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) ((xv1) this.a).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect2.getClass();
        return rect2;
    }

    public void f(float f, lq1 lq1) {
        Rect rect = (Rect) ((xv1) this.a).a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        float width = ((float) rect.width()) / f;
        float height = ((float) rect.height()) / f;
        float width2 = (((float) rect.width()) - width) / 2.0f;
        float height2 = (((float) rect.height()) - height) / 2.0f;
        this.b = new Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
        lq1 lq12 = (lq1) this.c;
        if (lq12 != null) {
            lq12.d(new Exception("There is a new zoomRatio being set"));
        }
        this.o = (Rect) this.b;
        this.c = lq1;
    }

    public void g() {
        this.o = null;
        this.b = null;
        lq1 lq1 = (lq1) this.c;
        if (lq1 != null) {
            lq1.d(new Exception("Camera is not active."));
            this.c = null;
        }
    }

    public Object get() {
        d9f d9f = (d9f) ((Provider) this.o).get();
        return new z77((Context) ((Provider) this.a).get(), (h45) ((Provider) this.b).get(), (pb0) ((Provider) this.c).get());
    }

    public int h() {
        boolean z = true;
        if ((((uia) ((i50) this.a).o).X.a & 1) == 0) {
            z = false;
        }
        wia wia = (wia) this.c;
        if (z) {
            return wia.getMeasuredHeight();
        }
        return rh4.q((float) 12, fk4.d().getDisplayMetrics().density, ((uge) this.o).getMeasuredHeight() - wia.getMeasuredHeight());
    }

    public sk6 i() {
        e52 C = ((p82) this.c).C(((e52) this.a).a);
        if (C != null) {
            this.a = C;
        }
        return new zd2(this, p82.I(((e52) this.a).b, (Set) this.o));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0072 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.l0f j(org.json.JSONObject r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.b
            yb9 r0 = (defpackage.yb9) r0
            r0.getClass()
            zad r2 = defpackage.yb9.e(r14)
            java.lang.String r0 = "participantCount"
            r1 = 0
            int r3 = r14.optInt(r0, r1)
            java.lang.String r0 = "addedParticipantIds"
            org.json.JSONArray r0 = r14.optJSONArray(r0)
            nz4 r4 = defpackage.nz4.a
            java.lang.Object r5 = r13.c
            lz1 r5 = (defpackage.lz1) r5
            if (r0 == 0) goto L_0x0025
            java.util.ArrayList r0 = r5.a(r0)
            goto L_0x0026
        L_0x0025:
            r0 = r4
        L_0x0026:
            java.lang.String r6 = "removedParticipantMarkers"
            org.json.JSONArray r6 = r14.optJSONArray(r6)
            r7 = 0
            if (r6 == 0) goto L_0x007b
            r5.getClass()
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            int r8 = r6.length()
        L_0x003b:
            if (r1 >= r8) goto L_0x0075
            org.json.JSONObject r9 = r6.getJSONObject(r1)
            java.lang.String r10 = "GRID"
            org.json.JSONObject r10 = r9.optJSONObject(r10)     // Catch:{ JSONException -> 0x0056 }
            if (r10 != 0) goto L_0x004b
        L_0x0049:
            r9 = r7
            goto L_0x006d
        L_0x004b:
            java.lang.String r11 = "id"
            java.lang.String r10 = r10.getString(r11)     // Catch:{ JSONException -> 0x0056 }
            bg1 r9 = defpackage.bg1.a(r10)     // Catch:{ JSONException -> 0x0056 }
            goto L_0x006d
        L_0x0056:
            r10 = move-exception
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Can't parse id from "
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            java.lang.String r11 = "ParticipantParser"
            a4c r12 = r5.a
            r12.logException(r11, r9, r10)
            goto L_0x0049
        L_0x006d:
            if (r9 == 0) goto L_0x0072
            r4.add(r9)
        L_0x0072:
            int r1 = r1 + 1
            goto L_0x003b
        L_0x0075:
            java.util.List r1 = defpackage.x53.D0(r4)
            r6 = r1
            goto L_0x007c
        L_0x007b:
            r6 = r4
        L_0x007c:
            java.lang.String r1 = "addedParticipants"
            org.json.JSONArray r14 = r14.optJSONArray(r1)
            if (r14 == 0) goto L_0x008e
            java.lang.Object r13 = r13.o
            die r13 = (defpackage.die) r13
            eqa r13 = r13.H(r14, r2)
            r5 = r13
            goto L_0x008f
        L_0x008e:
            r5 = r7
        L_0x008f:
            l0f r13 = new l0f
            r1 = r13
            r4 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c8d.j(org.json.JSONObject):l0f");
    }

    public int k() {
        boolean z = true;
        if ((((uia) ((i50) this.a).o).X.a & 1) == 0) {
            z = false;
        }
        wia wia = (wia) this.c;
        return z ? wia.getBottom() : wia.getTop();
    }

    public ArrayList l(List list) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = (HashMap) this.a;
        z(elapsedRealtime, hashMap);
        HashMap hashMap2 = (HashMap) this.b;
        z(elapsedRealtime, hashMap2);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            lk0 lk0 = (lk0) list.get(i);
            if (!hashMap.containsKey(lk0.b) && !hashMap2.containsKey(Integer.valueOf(lk0.c))) {
                arrayList.add(lk0);
            }
        }
        return arrayList;
    }

    public void m() {
        Handler handler = cia.a;
        cia.b((zha) ((i50) this.a).s0, yha.b);
    }

    public int n(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.b;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        StringBuilder n = rh4.n(i, "requested global type ", " does not belong to the adapter:");
        n.append(((cn9) this.c).c);
        throw new IllegalStateException(n.toString());
    }

    public int o(int i) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.a;
        int indexOfKey = sparseIntArray.indexOfKey(i);
        if (indexOfKey > -1) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        sh0 sh0 = (sh0) this.o;
        int i2 = sh0.b;
        sh0.b = i2 + 1;
        ((SparseArray) sh0.c).put(i2, (cn9) this.c);
        sparseIntArray.put(i, i2);
        ((SparseIntArray) this.b).put(i2, i);
        return i2;
    }

    public void onDismiss() {
        i50 i50 = (i50) this.a;
        ViewGroup viewGroup = (ViewGroup) ((WeakReference) i50.c).get();
        if (viewGroup != null) {
            viewGroup.post(new do9(i50, 4, (mec) this.b));
        }
        Handler handler = cia.a;
        AtomicBoolean atomicBoolean = cia.d;
        if (atomicBoolean.compareAndSet(false, true)) {
            bia bia = cia.b;
            if (bia != null ? tpa.f(bia.b.get(), (zha) i50.s0) : false) {
                cia.b = null;
                if (cia.c != null) {
                    cia.d();
                }
            }
            atomicBoolean.set(false);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x009e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map p(org.json.JSONObject r11) {
        /*
            r10 = this;
            java.lang.String r0 = "featuresPerRole"
            org.json.JSONObject r11 = r11.optJSONObject(r0)
            if (r11 != 0) goto L_0x000b
            oz4 r10 = defpackage.oz4.a
            return r10
        L_0x000b:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r1 = r11.keys()
        L_0x0014:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00a7
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r10.c
            hx9 r3 = (defpackage.hx9) r3
            r3.getClass()
            u61 r3 = defpackage.hx9.r(r2)
            if (r3 != 0) goto L_0x003d
            java.lang.String r3 = "warning: unknown feature: "
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r3 = "CallFeatureNotificationHandler"
            java.lang.Object r4 = r10.b
            a4c r4 = (defpackage.a4c) r4
            r4.log(r3, r2)
            goto L_0x0014
        L_0x003d:
            org.json.JSONArray r2 = r11.optJSONArray(r2)
            if (r2 != 0) goto L_0x0046
            wz4 r2 = defpackage.wz4.a
            goto L_0x00a2
        L_0x0046:
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            int r5 = r2.length()
            r6 = 0
        L_0x0050:
            if (r6 >= r5) goto L_0x00a1
            java.lang.String r7 = r2.optString(r6)
            if (r7 != 0) goto L_0x0059
            goto L_0x009e
        L_0x0059:
            java.lang.Object r8 = r10.o
            xxc r8 = (defpackage.xxc) r8
            r8.getClass()
            int r8 = r7.hashCode()
            r9 = -1290540065(0xffffffffb313ebdf, float:-3.4440628E-8)
            if (r8 == r9) goto L_0x008c
            r9 = 62130991(0x3b40b2f, float:1.0582017E-36)
            if (r8 == r9) goto L_0x0080
            r9 = 1746537484(0x681a0c0c, float:2.9098667E24)
            if (r8 == r9) goto L_0x0074
            goto L_0x0094
        L_0x0074:
            java.lang.String r8 = "CREATOR"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x007d
            goto L_0x0094
        L_0x007d:
            eg1 r7 = defpackage.eg1.a
            goto L_0x0098
        L_0x0080:
            java.lang.String r8 = "ADMIN"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0089
            goto L_0x0094
        L_0x0089:
            eg1 r7 = defpackage.eg1.b
            goto L_0x0098
        L_0x008c:
            java.lang.String r8 = "SPEAKER"
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x0096
        L_0x0094:
            r7 = 0
            goto L_0x0098
        L_0x0096:
            eg1 r7 = defpackage.eg1.c
        L_0x0098:
            if (r7 != 0) goto L_0x009b
            goto L_0x009e
        L_0x009b:
            r4.add(r7)
        L_0x009e:
            int r6 = r6 + 1
            goto L_0x0050
        L_0x00a1:
            r2 = r4
        L_0x00a2:
            r0.put(r3, r2)
            goto L_0x0014
        L_0x00a7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c8d.p(org.json.JSONObject):java.util.Map");
    }

    public View q() {
        return (wia) this.c;
    }

    public Size[] s(int i) {
        HashMap hashMap = (HashMap) this.c;
        if (!hashMap.containsKey(Integer.valueOf(i))) {
            Size[] outputSizes = ((StreamConfigurationMap) ((fd7) this.a).a).getOutputSizes(i);
            if (outputSizes == null || outputSizes.length == 0) {
                return outputSizes;
            }
            Size[] p = ((y7g) this.b).p(outputSizes, i);
            hashMap.put(Integer.valueOf(i), p);
            return (Size[]) p.clone();
        } else if (((Size[]) hashMap.get(Integer.valueOf(i))) == null) {
            return null;
        } else {
            return (Size[]) ((Size[]) hashMap.get(Integer.valueOf(i))).clone();
        }
    }

    public void t(JSONObject jSONObject) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("feedback");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    if (jSONObject2 != null) {
                        ((b46) this.b).getClass();
                        arrayList.add(b46.q(jSONObject2));
                    }
                }
                ((yb9) this.c).getClass();
                ((ve5) this.o).onFeedback(new a71(yb9.e(jSONObject), arrayList));
            }
        } catch (JSONException e) {
            ((a4c) this.a).logException("FeedbackNotificationHandler", "Can't parse feedback", e);
        }
    }

    public boolean u(Context context) {
        if (((Boolean) this.c) == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        ((Boolean) this.b).booleanValue();
        return ((Boolean) this.c).booleanValue();
    }

    public boolean v(Context context) {
        if (((Boolean) this.b) == null) {
            this.b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        ((Boolean) this.b).booleanValue();
        return ((Boolean) this.b).booleanValue();
    }

    public void w(JSONObject jSONObject) {
        a4c a4c = (a4c) this.b;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("features");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                String string = jSONArray.getString(i);
                ((hx9) this.c).getClass();
                u61 r = hx9.r(string);
                if (r != null) {
                    linkedHashSet.add(r);
                } else {
                    a4c.log("CallFeatureNotificationHandler", "warning: unknown feature: ".concat(string));
                }
            }
            ((a66) this.a).invoke(w51.x0, new x61(linkedHashSet));
        } catch (JSONException e) {
            a4c.logException("CallFeatureNotificationHandler", "feature set changed notification parsing error", e);
        }
    }

    public void x(JSONObject jSONObject) {
        try {
            ((a66) this.a).invoke(w51.y0, new y61(p(jSONObject)));
        } catch (JSONException e) {
            ((a4c) this.b).logException("CallFeatureNotificationHandler", "features per role changed notification parsing error", e);
        }
    }

    public int y() {
        if ((((uia) ((i50) this.a).o).X.a & 1) != 0) {
            return 0;
        }
        return ((uge) this.o).getMeasuredHeight();
    }

    public c8d(int i) {
        switch (i) {
            case 3:
                Random random = new Random();
                this.c = new HashMap();
                this.o = random;
                this.a = new HashMap();
                this.b = new HashMap();
                return;
            case 6:
                return;
            case 11:
                this.a = new l7b(1);
                this.b = new djb(0);
                this.c = new wva();
                this.o = new re6(24);
                return;
            default:
                this.a = null;
                this.b = null;
                this.c = null;
                this.o = new ArrayDeque();
                return;
        }
    }
}
