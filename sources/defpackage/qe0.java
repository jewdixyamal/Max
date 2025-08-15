package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: qe0  reason: default package */
public final class qe0 {
    public final je7 a;
    public final je7 b;

    public qe0(je7 je7, je7 je72) {
        this.a = je7;
        this.b = je72;
    }

    public static final kge a(qe0 qe0, byte[] bArr, fbf fbf) {
        qe0.getClass();
        kge kge = new kge(new String(bArr, a52.a), fbf.b, fbf.c);
        kge.setAlpha(fbf.d);
        kge.a.g.setXfermode(new PorterDuffXfermode(fbf.e ? PorterDuff.Mode.OVERLAY : PorterDuff.Mode.SRC_OVER));
        Object a2 = hp0.a(gp0.a);
        kge.setColorFilter(a2 != null ? fp0.a(fbf.f, a2) : null);
        return kge;
    }

    public static ArrayList b(JSONArray jSONArray, int[] iArr) {
        int[] iArr2 = iArr;
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            JSONArray jSONArray2 = jSONObject.getJSONArray("stops");
            int i2 = i * 3;
            int min = Math.min(i2 + 3, iArr2.length);
            dy7.m(min, iArr2.length);
            int[] copyOfRange = Arrays.copyOfRange(iArr2, i2, min);
            if (copyOfRange.length >= 2) {
                int length2 = copyOfRange.length;
                int length3 = jSONArray2.length();
                float[] fArr = new float[length3];
                int length4 = jSONArray2.length();
                int i3 = 0;
                while (i3 < length4) {
                    fArr[i3] = (float) jSONArray2.getDouble(i3);
                    i3++;
                    i = i;
                }
                int i4 = i;
                if (length2 == length3) {
                    arrayList.add(new ebf((float) jSONObject.getDouble("x"), (float) jSONObject.getDouble("y"), (float) jSONObject.getDouble("radiusX"), (float) jSONObject.getDouble("radiusY"), (float) jSONObject.getDouble("angle"), fArr, copyOfRange));
                    i = i4 + 1;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0257, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0259, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x025b, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0274, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0275, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0277, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0278, code lost:
        r4 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e0, code lost:
        r4 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ee, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0110, code lost:
        if (r1.equals(r7) == false) goto L_0x0112;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0274 A[ExcHandler: IOException (e java.io.IOException), Splitter:B:8:0x0055] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ee A[ExcHandler: JSONException (e org.json.JSONException), Splitter:B:35:0x00f1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.LinkedHashMap c(android.content.Context r44, defpackage.ze0 r45) {
        /*
            r43 = this;
            r0 = r44
            r1 = r45
            r2 = r43
            je7 r2 = r2.b
            java.lang.Object r2 = r2.getValue()
            qe5 r2 = (defpackage.qe5) r2
            se5 r2 = (defpackage.se5) r2
            r2.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r3 = ru.ok.tamtam.android.prefs.PmsKey.f7appearancemultithemescreenenabled
            r4 = 0
            boolean r2 = r2.n(r3, r4)
            pq9 r3 = defpackage.qp4.u0
            java.lang.String r6 = "load assets failed: "
            java.lang.String r7 = "parse theme json failed: "
            java.lang.String r8 = "angle"
            java.lang.String r10 = "is_overlay"
            java.lang.String r11 = "height"
            java.lang.String r12 = "width"
            java.lang.String r13 = "image"
            java.lang.String r14 = "gradient"
            java.lang.String r15 = "pattern"
            java.lang.String r4 = "name"
            java.lang.String r5 = "BackgroundDataLoader"
            if (r2 == 0) goto L_0x02d3
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            java.lang.String r9 = "themes.json"
            r17 = r6
            android.content.res.AssetManager r6 = r44.getAssets()     // Catch:{ IOException -> 0x02bd }
            java.io.InputStream r6 = r6.open(r9)     // Catch:{ IOException -> 0x02bd }
            int r9 = r6.available()     // Catch:{ IOException -> 0x02bd }
            byte[] r9 = new byte[r9]     // Catch:{ IOException -> 0x02bd }
            r6.read(r9)     // Catch:{ IOException -> 0x02bd }
            r6.close()     // Catch:{ IOException -> 0x02bd }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ JSONException -> 0x029f, IOException -> 0x029a }
            r18 = r5
            java.lang.String r5 = new java.lang.String     // Catch:{ JSONException -> 0x0295, IOException -> 0x0274 }
            r19 = r7
            java.nio.charset.Charset r7 = defpackage.a52.a     // Catch:{ JSONException -> 0x0277, IOException -> 0x0274 }
            r5.<init>(r9, r7)     // Catch:{ JSONException -> 0x0277, IOException -> 0x0274 }
            r6.<init>((java.lang.String) r5)     // Catch:{ JSONException -> 0x0277, IOException -> 0x0274 }
            int r5 = r6.length()     // Catch:{ JSONException -> 0x0277, IOException -> 0x0274 }
            r7 = 0
        L_0x0066:
            if (r7 >= r5) goto L_0x0293
            org.json.JSONObject r9 = r6.getJSONObject(r7)     // Catch:{ JSONException -> 0x0277, IOException -> 0x0274 }
            v25 r20 = defpackage.oe0.o     // Catch:{ JSONException -> 0x0277, IOException -> 0x0274 }
            java.util.Iterator r20 = r20.iterator()     // Catch:{ JSONException -> 0x0277, IOException -> 0x0274 }
        L_0x0072:
            r21 = r20
            u1 r21 = (defpackage.u1) r21     // Catch:{ JSONException -> 0x0277, IOException -> 0x0274 }
            boolean r22 = r21.hasNext()     // Catch:{ JSONException -> 0x0277, IOException -> 0x0274 }
            if (r22 == 0) goto L_0x027a
            java.lang.Object r21 = r21.next()     // Catch:{ JSONException -> 0x0277, IOException -> 0x0274 }
            r22 = r5
            r5 = r21
            oe0 r5 = (defpackage.oe0) r5     // Catch:{ JSONException -> 0x0277, IOException -> 0x0274 }
            r21 = r6
            java.lang.String r6 = r9.getString(r4)     // Catch:{ JSONException -> 0x0277, IOException -> 0x0274 }
            r43 = r7
            ze0 r7 = new ze0     // Catch:{ JSONException -> 0x0277, IOException -> 0x0274 }
            r23 = r2
            java.lang.String r2 = r9.getString(r4)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            r24 = r4
            java.lang.String r4 = r5.a     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            r25 = r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            r8.<init>()     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            r8.append(r2)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            r8.append(r4)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            java.lang.String r2 = r8.toString()     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            r7.<init>(r2)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            qp4 r2 = r3.b(r0)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            java.lang.Object r2 = r2.X     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            adb r2 = (defpackage.adb) r2     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            java.lang.Object r2 = r2.c     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            je7 r2 = (defpackage.je7) r2     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            java.util.Collection r2 = r2.values()     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
        L_0x00c8:
            boolean r4 = r2.hasNext()     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            if (r4 == 0) goto L_0x00f0
            java.lang.Object r4 = r2.next()     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            r8 = r4
            sba r8 = (defpackage.sba) r8     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            if (r8 == 0) goto L_0x00e4
            java.lang.String r8 = r8.a     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            goto L_0x00e5
        L_0x00da:
            r5 = r18
            r4 = r23
            goto L_0x02bf
        L_0x00e0:
            r4 = r23
            goto L_0x02a4
        L_0x00e4:
            r8 = 0
        L_0x00e5:
            boolean r8 = defpackage.tpa.f(r8, r6)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            if (r8 == 0) goto L_0x00c8
            goto L_0x00f1
        L_0x00ec:
            r0 = move-exception
            goto L_0x00da
        L_0x00ee:
            r0 = move-exception
            goto L_0x00e0
        L_0x00f0:
            r4 = 0
        L_0x00f1:
            sba r4 = (defpackage.sba) r4     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            if (r4 == 0) goto L_0x0112
            boolean r2 = r5.b     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            fka r2 = r4.a(r2)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            if (r2 != 0) goto L_0x00fe
            goto L_0x0112
        L_0x00fe:
            nr2 r2 = r2.a()     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            v83 r2 = r2.s()     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            m73 r2 = r2.b     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            l73 r2 = r2.a     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            if (r1 == 0) goto L_0x0122
            boolean r4 = r1.equals(r7)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            if (r4 != 0) goto L_0x0122
        L_0x0112:
            r35 = r9
            r27 = r11
            r36 = r12
            r26 = r14
            r4 = r23
            r34 = r25
            r25 = r10
            goto L_0x025d
        L_0x0122:
            boolean r4 = r9.has(r15)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x025b }
            if (r4 == 0) goto L_0x012d
            org.json.JSONObject r4 = r9.getJSONObject(r15)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x025b }
            goto L_0x012e
        L_0x012d:
            r4 = 0
        L_0x012e:
            boolean r5 = r9.has(r14)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0259 }
            if (r5 == 0) goto L_0x0139
            org.json.JSONObject r5 = r9.getJSONObject(r14)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0259 }
            goto L_0x013a
        L_0x0139:
            r5 = 0
        L_0x013a:
            java.lang.String r6 = "radial_gradient"
            boolean r8 = r9.has(r6)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0257 }
            if (r8 == 0) goto L_0x0147
            org.json.JSONArray r6 = r9.getJSONArray(r6)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0257 }
            goto L_0x0148
        L_0x0147:
            r6 = 0
        L_0x0148:
            java.lang.String r8 = "pattern_radial_gradient"
            boolean r26 = r9.has(r8)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0255 }
            if (r26 == 0) goto L_0x0157
            org.json.JSONArray r8 = r9.getJSONArray(r8)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0255 }
            r26 = r14
            goto L_0x015a
        L_0x0157:
            r26 = r14
            r8 = 0
        L_0x015a:
            java.lang.String r14 = "fill_color"
            java.lang.Boolean r14 = defpackage.ote.n(r9, r14)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            if (r4 == 0) goto L_0x01ac
            fbf r34 = new fbf     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            java.lang.String r28 = r4.getString(r13)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            r35 = r9
            int r9 = r4.getInt(r12)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            float r9 = (float) r9     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            android.content.res.Resources r27 = defpackage.fk4.d()     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            r36 = r12
            android.util.DisplayMetrics r12 = r27.getDisplayMetrics()     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            float r12 = r12.density     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            float r9 = r9 * r12
            int r29 = defpackage.tu0.G(r9)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            int r9 = r4.getInt(r11)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            float r9 = (float) r9     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            android.content.res.Resources r12 = defpackage.fk4.d()     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            float r12 = r12.density     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            float r9 = r9 * r12
            int r30 = defpackage.tu0.G(r9)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            int r9 = r2.i     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            int r31 = android.graphics.Color.alpha(r9)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            boolean r32 = r4.getBoolean(r10)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            int r4 = r2.i     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r33 = r4 | r9
            r27 = r34
            r27.<init>(r28, r29, r30, r31, r32, r33)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            r38 = r34
            goto L_0x01b2
        L_0x01ac:
            r35 = r9
            r36 = r12
            r38 = 0
        L_0x01b2:
            if (r5 == 0) goto L_0x01cf
            int r4 = r2.g     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            int r9 = r2.h     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            int[] r4 = new int[]{r4, r9}     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            dbf r9 = new dbf     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            r27 = r11
            r12 = r25
            r25 = r10
            double r10 = r5.getDouble(r12)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            float r5 = (float) r10     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            r9.<init>(r4, r5)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            r39 = r9
            goto L_0x01d7
        L_0x01cf:
            r27 = r11
            r12 = r25
            r25 = r10
            r39 = 0
        L_0x01d7:
            if (r6 == 0) goto L_0x01fe
            int r4 = r2.a     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            int r5 = r2.e     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            int r9 = r2.f     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            int r10 = r2.b     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            int r11 = r2.c     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            r34 = r12
            int r12 = r2.d     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            r28 = r4
            r29 = r10
            r30 = r11
            r31 = r12
            r32 = r5
            r33 = r9
            int[] r4 = new int[]{r28, r29, r30, r31, r32, r33}     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            java.util.ArrayList r4 = b(r6, r4)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            r40 = r4
            goto L_0x0202
        L_0x01fe:
            r34 = r12
            r40 = 0
        L_0x0202:
            if (r8 == 0) goto L_0x0227
            int r4 = r2.j     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            int r5 = r2.n     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            int r6 = r2.o     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            int r9 = r2.k     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            int r10 = r2.l     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            int r11 = r2.m     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            r28 = r4
            r29 = r9
            r30 = r10
            r31 = r11
            r32 = r5
            r33 = r6
            int[] r4 = new int[]{r28, r29, r30, r31, r32, r33}     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            java.util.ArrayList r4 = b(r8, r4)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            r41 = r4
            goto L_0x0229
        L_0x0227:
            r41 = 0
        L_0x0229:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            boolean r4 = defpackage.tpa.f(r14, r4)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            if (r4 == 0) goto L_0x023a
            int r2 = r2.g     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x00ec }
            r42 = r2
            goto L_0x023c
        L_0x023a:
            r42 = 0
        L_0x023c:
            gbf r2 = new gbf     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            r37 = r2
            r37.<init>(r38, r39, r40, r41, r42)     // Catch:{ JSONException -> 0x00ee, IOException -> 0x0251 }
            r4 = r23
            r4.put(r7, r2)     // Catch:{ JSONException -> 0x024e }
            goto L_0x025d
        L_0x0249:
            r0 = move-exception
        L_0x024a:
            r5 = r18
            goto L_0x02bf
        L_0x024e:
            r0 = move-exception
            goto L_0x02a4
        L_0x0251:
            r0 = move-exception
        L_0x0252:
            r4 = r23
            goto L_0x024a
        L_0x0255:
            r0 = move-exception
            goto L_0x0252
        L_0x0257:
            r0 = move-exception
            goto L_0x0252
        L_0x0259:
            r0 = move-exception
            goto L_0x0252
        L_0x025b:
            r0 = move-exception
            goto L_0x0252
        L_0x025d:
            r7 = r43
            r2 = r4
            r6 = r21
            r5 = r22
            r4 = r24
            r10 = r25
            r14 = r26
            r11 = r27
            r8 = r34
            r9 = r35
            r12 = r36
            goto L_0x0072
        L_0x0274:
            r0 = move-exception
            r4 = r2
            goto L_0x024a
        L_0x0277:
            r0 = move-exception
            r4 = r2
            goto L_0x02a4
        L_0x027a:
            r24 = r4
            r22 = r5
            r21 = r6
            r43 = r7
            r34 = r8
            r25 = r10
            r27 = r11
            r36 = r12
            r26 = r14
            r4 = r2
            int r7 = r43 + 1
            r4 = r24
            goto L_0x0066
        L_0x0293:
            r4 = r2
            goto L_0x02d0
        L_0x0295:
            r0 = move-exception
            r4 = r2
        L_0x0297:
            r19 = r7
            goto L_0x02a4
        L_0x029a:
            r0 = move-exception
            r4 = r2
            r18 = r5
            goto L_0x02bf
        L_0x029f:
            r0 = move-exception
            r4 = r2
            r18 = r5
            goto L_0x0297
        L_0x02a4:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0249 }
            r1.<init>()     // Catch:{ IOException -> 0x0249 }
            r2 = r19
            r1.append(r2)     // Catch:{ IOException -> 0x0249 }
            r1.append(r0)     // Catch:{ IOException -> 0x0249 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0249 }
            r5 = r18
            defpackage.hm9.m(r5, r0, new java.lang.Object[0])     // Catch:{ IOException -> 0x02bb }
            goto L_0x02d0
        L_0x02bb:
            r0 = move-exception
            goto L_0x02bf
        L_0x02bd:
            r0 = move-exception
            r4 = r2
        L_0x02bf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r6 = r17
            r1.<init>(r6)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.hm9.m(r5, r0, new java.lang.Object[0])
        L_0x02d0:
            r2 = r4
            goto L_0x04ac
        L_0x02d3:
            r24 = r4
            r2 = r7
            r34 = r8
            r25 = r10
            r27 = r11
            r36 = r12
            r26 = r14
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.lang.String r7 = "legacy_themes.json"
            android.content.res.AssetManager r8 = r44.getAssets()     // Catch:{ IOException -> 0x0373 }
            java.io.InputStream r7 = r8.open(r7)     // Catch:{ IOException -> 0x0373 }
            int r8 = r7.available()     // Catch:{ IOException -> 0x0373 }
            byte[] r8 = new byte[r8]     // Catch:{ IOException -> 0x0373 }
            r7.read(r8)     // Catch:{ IOException -> 0x0373 }
            r7.close()     // Catch:{ IOException -> 0x0373 }
            org.json.JSONArray r7 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0376 }
            java.lang.String r9 = new java.lang.String     // Catch:{ JSONException -> 0x0376 }
            java.nio.charset.Charset r10 = defpackage.a52.a     // Catch:{ JSONException -> 0x0376 }
            r9.<init>(r8, r10)     // Catch:{ JSONException -> 0x0376 }
            r7.<init>((java.lang.String) r9)     // Catch:{ JSONException -> 0x0376 }
            int r8 = r7.length()     // Catch:{ JSONException -> 0x0376 }
            r9 = 0
        L_0x030c:
            if (r9 >= r8) goto L_0x02d0
            org.json.JSONObject r10 = r7.getJSONObject(r9)     // Catch:{ JSONException -> 0x0376 }
            ze0 r11 = new ze0     // Catch:{ JSONException -> 0x0376 }
            r12 = r24
            java.lang.String r14 = r10.getString(r12)     // Catch:{ JSONException -> 0x0376 }
            r11.<init>(r14)     // Catch:{ JSONException -> 0x0376 }
            if (r1 == 0) goto L_0x0335
            boolean r14 = r1.equals(r11)     // Catch:{ JSONException -> 0x0376 }
            if (r14 != 0) goto L_0x0335
        L_0x0325:
            r43 = r3
        L_0x0327:
            r28 = r7
            r29 = r8
            r16 = r9
            r7 = r25
            r14 = r26
            r3 = r34
            goto L_0x0471
        L_0x0335:
            qp4 r14 = r3.b(r0)     // Catch:{ JSONException -> 0x0376 }
            java.lang.Object r14 = r14.X     // Catch:{ JSONException -> 0x0376 }
            adb r14 = (defpackage.adb) r14     // Catch:{ JSONException -> 0x0376 }
            java.lang.Object r14 = r14.c     // Catch:{ JSONException -> 0x0376 }
            je7 r14 = (defpackage.je7) r14     // Catch:{ JSONException -> 0x0376 }
            java.lang.Object r14 = r14.getValue()     // Catch:{ JSONException -> 0x0376 }
            java.util.concurrent.ConcurrentHashMap r14 = (java.util.concurrent.ConcurrentHashMap) r14     // Catch:{ JSONException -> 0x0376 }
            java.util.Collection r14 = r14.values()     // Catch:{ JSONException -> 0x0376 }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ JSONException -> 0x0376 }
        L_0x034f:
            boolean r17 = r14.hasNext()     // Catch:{ JSONException -> 0x0376 }
            if (r17 == 0) goto L_0x0379
            java.lang.Object r17 = r14.next()     // Catch:{ JSONException -> 0x0376 }
            r0 = r17
            sba r0 = (defpackage.sba) r0     // Catch:{ JSONException -> 0x0376 }
            if (r0 == 0) goto L_0x0362
            java.lang.String r0 = r0.a     // Catch:{ JSONException -> 0x0376 }
            goto L_0x0363
        L_0x0362:
            r0 = 0
        L_0x0363:
            sba r1 = defpackage.sba.d     // Catch:{ JSONException -> 0x0376 }
            java.lang.String r1 = r1.a     // Catch:{ JSONException -> 0x0376 }
            boolean r0 = defpackage.tpa.f(r0, r1)     // Catch:{ JSONException -> 0x0376 }
            if (r0 == 0) goto L_0x036e
            goto L_0x037b
        L_0x036e:
            r0 = r44
            r1 = r45
            goto L_0x034f
        L_0x0373:
            r0 = move-exception
            goto L_0x049b
        L_0x0376:
            r0 = move-exception
            goto L_0x0487
        L_0x0379:
            r17 = 0
        L_0x037b:
            r0 = r17
            sba r0 = (defpackage.sba) r0     // Catch:{ JSONException -> 0x0376 }
            if (r0 == 0) goto L_0x0325
            java.lang.String r1 = r11.a     // Catch:{ JSONException -> 0x0376 }
            java.lang.String r14 = "dark"
            r43 = r3
            r3 = 1
            boolean r1 = defpackage.w9e.p0(r1, r14, r3)     // Catch:{ JSONException -> 0x0376 }
            fka r0 = r0.a(r1)     // Catch:{ JSONException -> 0x0376 }
            if (r0 == 0) goto L_0x0327
            nr2 r0 = r0.a()     // Catch:{ JSONException -> 0x0376 }
            v83 r0 = r0.s()     // Catch:{ JSONException -> 0x0376 }
            m73 r0 = r0.b     // Catch:{ JSONException -> 0x0376 }
            l73 r0 = r0.a     // Catch:{ JSONException -> 0x0376 }
            boolean r1 = r10.has(r15)     // Catch:{ JSONException -> 0x0376 }
            if (r1 == 0) goto L_0x03ab
            org.json.JSONObject r1 = r10.getJSONObject(r15)     // Catch:{ JSONException -> 0x0376 }
            r14 = r26
            goto L_0x03ae
        L_0x03ab:
            r14 = r26
            r1 = 0
        L_0x03ae:
            boolean r17 = r10.has(r14)     // Catch:{ JSONException -> 0x0376 }
            if (r17 == 0) goto L_0x03b9
            org.json.JSONObject r10 = r10.getJSONObject(r14)     // Catch:{ JSONException -> 0x0376 }
            goto L_0x03ba
        L_0x03b9:
            r10 = 0
        L_0x03ba:
            if (r1 == 0) goto L_0x0413
            fbf r24 = new fbf     // Catch:{ JSONException -> 0x0376 }
            java.lang.String r18 = r1.getString(r13)     // Catch:{ JSONException -> 0x0376 }
            r28 = r7
            r3 = r36
            int r7 = r1.getInt(r3)     // Catch:{ JSONException -> 0x0376 }
            float r7 = (float) r7     // Catch:{ JSONException -> 0x0376 }
            android.content.res.Resources r17 = defpackage.fk4.d()     // Catch:{ JSONException -> 0x0376 }
            r36 = r3
            android.util.DisplayMetrics r3 = r17.getDisplayMetrics()     // Catch:{ JSONException -> 0x0376 }
            float r3 = r3.density     // Catch:{ JSONException -> 0x0376 }
            float r7 = r7 * r3
            int r19 = defpackage.tu0.G(r7)     // Catch:{ JSONException -> 0x0376 }
            r3 = r27
            int r7 = r1.getInt(r3)     // Catch:{ JSONException -> 0x0376 }
            float r7 = (float) r7     // Catch:{ JSONException -> 0x0376 }
            android.content.res.Resources r17 = defpackage.fk4.d()     // Catch:{ JSONException -> 0x0376 }
            r27 = r3
            android.util.DisplayMetrics r3 = r17.getDisplayMetrics()     // Catch:{ JSONException -> 0x0376 }
            float r3 = r3.density     // Catch:{ JSONException -> 0x0376 }
            float r7 = r7 * r3
            int r20 = defpackage.tu0.G(r7)     // Catch:{ JSONException -> 0x0376 }
            java.lang.String r3 = "opacity"
            r29 = r8
            double r7 = r1.getDouble(r3)     // Catch:{ JSONException -> 0x0376 }
            int r3 = (int) r7     // Catch:{ JSONException -> 0x0376 }
            r7 = r25
            boolean r22 = r1.getBoolean(r7)     // Catch:{ JSONException -> 0x0376 }
            int r1 = r0.i     // Catch:{ JSONException -> 0x0376 }
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r23 = r1 | r8
            r17 = r24
            r21 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23)     // Catch:{ JSONException -> 0x0376 }
            r38 = r24
            goto L_0x041d
        L_0x0413:
            r28 = r7
            r29 = r8
            r7 = r25
            r8 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r38 = 0
        L_0x041d:
            if (r10 == 0) goto L_0x045b
            int r1 = r0.g     // Catch:{ JSONException -> 0x0376 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ JSONException -> 0x0376 }
            int r0 = r0.h     // Catch:{ JSONException -> 0x0376 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ JSONException -> 0x0376 }
            java.lang.Integer[] r0 = new java.lang.Integer[]{r1, r0}     // Catch:{ JSONException -> 0x0376 }
            java.util.List r0 = defpackage.y53.M(r0)     // Catch:{ JSONException -> 0x0376 }
            int r1 = r0.size()     // Catch:{ JSONException -> 0x0376 }
            r3 = 1
            if (r1 <= r3) goto L_0x044f
            dbf r1 = new dbf     // Catch:{ JSONException -> 0x0376 }
            int[] r0 = defpackage.x53.C0(r0)     // Catch:{ JSONException -> 0x0376 }
            r16 = r9
            r3 = r34
            double r8 = r10.getDouble(r3)     // Catch:{ JSONException -> 0x0376 }
            float r8 = (float) r8     // Catch:{ JSONException -> 0x0376 }
            r1.<init>(r0, r8)     // Catch:{ JSONException -> 0x0376 }
            r39 = r1
            goto L_0x0461
        L_0x044f:
            java.lang.String r0 = "Failed requirement."
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ JSONException -> 0x0376 }
            java.lang.String r0 = r0.toString()     // Catch:{ JSONException -> 0x0376 }
            r1.<init>(r0)     // Catch:{ JSONException -> 0x0376 }
            throw r1     // Catch:{ JSONException -> 0x0376 }
        L_0x045b:
            r16 = r9
            r3 = r34
            r39 = 0
        L_0x0461:
            gbf r0 = new gbf     // Catch:{ JSONException -> 0x0376 }
            r41 = 0
            r42 = 0
            r40 = 0
            r37 = r0
            r37.<init>(r38, r39, r40, r41, r42)     // Catch:{ JSONException -> 0x0376 }
            r4.put(r11, r0)     // Catch:{ JSONException -> 0x0376 }
        L_0x0471:
            int r9 = r16 + 1
            r0 = r44
            r1 = r45
            r34 = r3
            r25 = r7
            r24 = r12
            r26 = r14
            r7 = r28
            r8 = r29
            r3 = r43
            goto L_0x030c
        L_0x0487:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0373 }
            r1.<init>()     // Catch:{ IOException -> 0x0373 }
            r1.append(r2)     // Catch:{ IOException -> 0x0373 }
            r1.append(r0)     // Catch:{ IOException -> 0x0373 }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x0373 }
            defpackage.hm9.m(r5, r0, new java.lang.Object[0])     // Catch:{ IOException -> 0x0373 }
            goto L_0x02d0
        L_0x049b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r6)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            defpackage.hm9.m(r5, r0, new java.lang.Object[0])
            goto L_0x02d0
        L_0x04ac:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe0.c(android.content.Context, ze0):java.util.LinkedHashMap");
    }

    public final Object d(Context context, fbf fbf, Continuation continuation) {
        return j47.t0(((w9a) ((kke) this.a.getValue())).b(), new pe0(this, context, fbf, (Continuation) null), continuation);
    }
}
