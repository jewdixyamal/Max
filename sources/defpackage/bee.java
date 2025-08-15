package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: bee  reason: default package */
public final class bee {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final String i;
    public final ht1 j;
    public final xv1 k;
    public final rxd l;
    public final int m;
    public final boolean n = false;
    public final boolean o = false;
    public final boolean p = false;
    public final boolean q = false;
    public final boolean r = false;
    public dc0 s;
    public final ArrayList t = new ArrayList();
    public final ul4 u;
    public final huc v = new Object();
    public final wmc w = new wmc(20);
    public final td x;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v36, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v23, resolved type: int[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v60, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v61, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v64, resolved type: java.util.ArrayList} */
    /* JADX WARNING: type inference failed for: r4v1, types: [huc, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bee(android.content.Context r18, java.lang.String r19, defpackage.dx1 r20, defpackage.ht1 r21) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = 1
            r17.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.a = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.b = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.c = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.d = r3
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            r0.e = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.f = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.g = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.h = r3
            r3 = 0
            r0.n = r3
            r0.o = r3
            r0.p = r3
            r0.q = r3
            r0.r = r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.t = r4
            huc r4 = new huc
            r4.<init>()
            r0.v = r4
            wmc r4 = new wmc
            r5 = 20
            r4.<init>(r5)
            r0.w = r4
            r19.getClass()
            r0.i = r1
            r21.getClass()
            r4 = r21
            r0.j = r4
            rxd r4 = new rxd
            r5 = 15
            r4.<init>((int) r5)
            r0.l = r4
            ul4 r4 = defpackage.ul4.b(r18)
            r0.u = r4
            r4 = r20
            xv1 r1 = r4.a(r1)     // Catch:{ CameraAccessExceptionCompat -> 0x0095 }
            r0.k = r1     // Catch:{ CameraAccessExceptionCompat -> 0x0095 }
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL     // Catch:{ CameraAccessExceptionCompat -> 0x0095 }
            java.lang.Object r4 = r1.a(r4)     // Catch:{ CameraAccessExceptionCompat -> 0x0095 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ CameraAccessExceptionCompat -> 0x0095 }
            r5 = 2
            if (r4 == 0) goto L_0x0098
            int r4 = r4.intValue()     // Catch:{ CameraAccessExceptionCompat -> 0x0095 }
            goto L_0x0099
        L_0x0095:
            r0 = move-exception
            goto L_0x085a
        L_0x0098:
            r4 = r5
        L_0x0099:
            r0.m = r4     // Catch:{ CameraAccessExceptionCompat -> 0x0095 }
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            java.lang.Object r1 = r1.a(r4)
            int[] r1 = (int[]) r1
            r4 = 3
            if (r1 == 0) goto L_0x00c5
            int r6 = r1.length
            r7 = r3
        L_0x00a8:
            if (r7 >= r6) goto L_0x00c5
            r8 = r1[r7]
            if (r8 != r4) goto L_0x00b1
            r0.n = r2
            goto L_0x00c3
        L_0x00b1:
            r9 = 6
            if (r8 != r9) goto L_0x00b7
            r0.o = r2
            goto L_0x00c3
        L_0x00b7:
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 31
            if (r9 < r10) goto L_0x00c3
            r9 = 16
            if (r8 != r9) goto L_0x00c3
            r0.r = r2
        L_0x00c3:
            int r7 = r7 + r2
            goto L_0x00a8
        L_0x00c5:
            td r1 = new td
            xv1 r6 = r0.k
            r1.<init>((defpackage.xv1) r6)
            r0.x = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            cee r7 = new cee
            r7.<init>()
            dee r8 = defpackage.dee.MAXIMUM
            r9 = 0
            defpackage.k7d.m(r2, r8, r9, r7)
            cee r7 = defpackage.k7d.i(r6, r7)
            defpackage.k7d.m(r4, r8, r9, r7)
            cee r7 = defpackage.k7d.i(r6, r7)
            defpackage.k7d.m(r5, r8, r9, r7)
            cee r7 = defpackage.k7d.i(r6, r7)
            dee r11 = defpackage.dee.PREVIEW
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r7.a(r12)
            defpackage.k7d.m(r4, r8, r9, r7)
            cee r7 = defpackage.k7d.i(r6, r7)
            xb0 r12 = new xb0
            r12.<init>(r5, r11, r9)
            r7.a(r12)
            defpackage.k7d.m(r4, r8, r9, r7)
            cee r7 = defpackage.k7d.i(r6, r7)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r7.a(r12)
            defpackage.k7d.m(r2, r11, r9, r7)
            cee r7 = defpackage.k7d.i(r6, r7)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r7.a(r12)
            defpackage.k7d.m(r5, r11, r9, r7)
            cee r7 = defpackage.k7d.i(r6, r7)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r7.a(r12)
            xb0 r12 = new xb0
            r12.<init>(r5, r11, r9)
            r7.a(r12)
            defpackage.k7d.m(r4, r8, r9, r7)
            r6.add(r7)
            r1.addAll(r6)
            int r6 = r0.m
            dee r7 = defpackage.dee.RECORD
            if (r6 == 0) goto L_0x0157
            if (r6 == r2) goto L_0x0157
            if (r6 != r4) goto L_0x01d5
        L_0x0157:
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            cee r13 = new cee
            r13.<init>()
            xb0 r14 = new xb0
            r14.<init>(r2, r11, r9)
            r13.a(r14)
            defpackage.k7d.m(r2, r7, r9, r13)
            cee r13 = defpackage.k7d.i(r12, r13)
            xb0 r14 = new xb0
            r14.<init>(r2, r11, r9)
            r13.a(r14)
            defpackage.k7d.m(r5, r7, r9, r13)
            cee r13 = defpackage.k7d.i(r12, r13)
            xb0 r14 = new xb0
            r14.<init>(r5, r11, r9)
            r13.a(r14)
            defpackage.k7d.m(r5, r7, r9, r13)
            cee r13 = defpackage.k7d.i(r12, r13)
            xb0 r14 = new xb0
            r14.<init>(r2, r11, r9)
            r13.a(r14)
            xb0 r14 = new xb0
            r14.<init>(r2, r7, r9)
            r13.a(r14)
            defpackage.k7d.m(r4, r7, r9, r13)
            cee r13 = defpackage.k7d.i(r12, r13)
            xb0 r14 = new xb0
            r14.<init>(r2, r11, r9)
            r13.a(r14)
            xb0 r14 = new xb0
            r14.<init>(r5, r7, r9)
            r13.a(r14)
            defpackage.k7d.m(r4, r7, r9, r13)
            cee r13 = defpackage.k7d.i(r12, r13)
            xb0 r14 = new xb0
            r14.<init>(r5, r11, r9)
            r13.a(r14)
            xb0 r14 = new xb0
            r14.<init>(r5, r11, r9)
            r13.a(r14)
            defpackage.k7d.m(r4, r8, r9, r13)
            r12.add(r13)
            r1.addAll(r12)
        L_0x01d5:
            dee r12 = defpackage.dee.VGA
            if (r6 == r2) goto L_0x01db
            if (r6 != r4) goto L_0x0259
        L_0x01db:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            cee r14 = new cee
            r14.<init>()
            xb0 r15 = new xb0
            r15.<init>(r2, r11, r9)
            r14.a(r15)
            defpackage.k7d.m(r2, r8, r9, r14)
            cee r14 = defpackage.k7d.i(r13, r14)
            xb0 r15 = new xb0
            r15.<init>(r2, r11, r9)
            r14.a(r15)
            defpackage.k7d.m(r5, r8, r9, r14)
            cee r14 = defpackage.k7d.i(r13, r14)
            xb0 r15 = new xb0
            r15.<init>(r5, r11, r9)
            r14.a(r15)
            defpackage.k7d.m(r5, r8, r9, r14)
            cee r14 = defpackage.k7d.i(r13, r14)
            xb0 r15 = new xb0
            r15.<init>(r2, r11, r9)
            r14.a(r15)
            xb0 r15 = new xb0
            r15.<init>(r2, r11, r9)
            r14.a(r15)
            defpackage.k7d.m(r4, r8, r9, r14)
            cee r14 = defpackage.k7d.i(r13, r14)
            xb0 r15 = new xb0
            r15.<init>(r5, r12, r9)
            r14.a(r15)
            xb0 r15 = new xb0
            r15.<init>(r2, r11, r9)
            r14.a(r15)
            defpackage.k7d.m(r5, r8, r9, r14)
            cee r14 = defpackage.k7d.i(r13, r14)
            xb0 r15 = new xb0
            r15.<init>(r5, r12, r9)
            r14.a(r15)
            xb0 r15 = new xb0
            r15.<init>(r5, r11, r9)
            r14.a(r15)
            defpackage.k7d.m(r5, r8, r9, r14)
            r13.add(r14)
            r1.addAll(r13)
        L_0x0259:
            boolean r13 = r0.n
            r14 = 5
            if (r13 == 0) goto L_0x0302
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            cee r15 = new cee
            r15.<init>()
            defpackage.k7d.m(r14, r8, r9, r15)
            cee r15 = defpackage.k7d.i(r13, r15)
            xb0 r3 = new xb0
            r3.<init>(r2, r11, r9)
            r15.a(r3)
            defpackage.k7d.m(r14, r8, r9, r15)
            cee r3 = defpackage.k7d.i(r13, r15)
            xb0 r15 = new xb0
            r15.<init>(r5, r11, r9)
            r3.a(r15)
            defpackage.k7d.m(r14, r8, r9, r3)
            cee r3 = defpackage.k7d.i(r13, r3)
            xb0 r15 = new xb0
            r15.<init>(r2, r11, r9)
            r3.a(r15)
            xb0 r15 = new xb0
            r15.<init>(r2, r11, r9)
            r3.a(r15)
            defpackage.k7d.m(r14, r8, r9, r3)
            cee r3 = defpackage.k7d.i(r13, r3)
            xb0 r15 = new xb0
            r15.<init>(r2, r11, r9)
            r3.a(r15)
            xb0 r15 = new xb0
            r15.<init>(r5, r11, r9)
            r3.a(r15)
            defpackage.k7d.m(r14, r8, r9, r3)
            cee r3 = defpackage.k7d.i(r13, r3)
            xb0 r15 = new xb0
            r15.<init>(r5, r11, r9)
            r3.a(r15)
            xb0 r15 = new xb0
            r15.<init>(r5, r11, r9)
            r3.a(r15)
            defpackage.k7d.m(r14, r8, r9, r3)
            cee r3 = defpackage.k7d.i(r13, r3)
            xb0 r15 = new xb0
            r15.<init>(r2, r11, r9)
            r3.a(r15)
            xb0 r15 = new xb0
            r15.<init>(r4, r8, r9)
            r3.a(r15)
            defpackage.k7d.m(r14, r8, r9, r3)
            cee r3 = defpackage.k7d.i(r13, r3)
            xb0 r15 = new xb0
            r15.<init>(r5, r11, r9)
            r3.a(r15)
            xb0 r15 = new xb0
            r15.<init>(r4, r8, r9)
            r3.a(r15)
            defpackage.k7d.m(r14, r8, r9, r3)
            r13.add(r3)
            r1.addAll(r13)
        L_0x0302:
            boolean r3 = r0.o
            if (r3 == 0) goto L_0x0341
            if (r6 != 0) goto L_0x0341
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            cee r13 = new cee
            r13.<init>()
            xb0 r15 = new xb0
            r15.<init>(r2, r11, r9)
            r13.a(r15)
            defpackage.k7d.m(r2, r8, r9, r13)
            cee r13 = defpackage.k7d.i(r3, r13)
            xb0 r15 = new xb0
            r15.<init>(r2, r11, r9)
            r13.a(r15)
            defpackage.k7d.m(r5, r8, r9, r13)
            cee r13 = defpackage.k7d.i(r3, r13)
            xb0 r15 = new xb0
            r15.<init>(r5, r11, r9)
            r13.a(r15)
            defpackage.k7d.m(r5, r8, r9, r13)
            r3.add(r13)
            r1.addAll(r3)
        L_0x0341:
            if (r6 != r4) goto L_0x038d
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            cee r6 = new cee
            r6.<init>()
            xb0 r13 = new xb0
            r13.<init>(r2, r11, r9)
            r6.a(r13)
            xb0 r13 = new xb0
            r13.<init>(r2, r12, r9)
            r6.a(r13)
            xb0 r13 = new xb0
            r13.<init>(r5, r8, r9)
            r6.a(r13)
            defpackage.k7d.m(r14, r8, r9, r6)
            cee r6 = defpackage.k7d.i(r3, r6)
            xb0 r13 = new xb0
            r13.<init>(r2, r11, r9)
            r6.a(r13)
            xb0 r13 = new xb0
            r13.<init>(r2, r12, r9)
            r6.a(r13)
            xb0 r12 = new xb0
            r12.<init>(r4, r8, r9)
            r6.a(r12)
            defpackage.k7d.m(r14, r8, r9, r6)
            r3.add(r6)
            r1.addAll(r3)
        L_0x038d:
            java.util.ArrayList r3 = r0.a
            r3.addAll(r1)
            rxd r1 = r0.l
            java.lang.Object r1 = r1.b
            androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk r1 = (androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk) r1
            if (r1 != 0) goto L_0x03a0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            goto L_0x03f8
        L_0x03a0:
            cee r1 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.a
            java.lang.String r1 = android.os.Build.DEVICE
            java.lang.String r6 = "heroqltevzw"
            boolean r6 = r6.equalsIgnoreCase(r1)
            if (r6 != 0) goto L_0x03e4
            java.lang.String r6 = "heroqltetmo"
            boolean r1 = r6.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x03b5
            goto L_0x03e4
        L_0x03b5:
            java.lang.String r1 = "google"
            java.lang.String r6 = android.os.Build.BRAND
            boolean r1 = r1.equalsIgnoreCase(r6)
            if (r1 != 0) goto L_0x03c1
            r1 = 0
            goto L_0x03cf
        L_0x03c1:
            java.lang.String r1 = android.os.Build.MODEL
            java.util.Locale r6 = java.util.Locale.US
            java.lang.String r1 = r1.toUpperCase(r6)
            java.util.HashSet r6 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.c
            boolean r1 = r6.contains(r1)
        L_0x03cf:
            if (r1 != 0) goto L_0x03dd
            boolean r1 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.e()
            if (r1 == 0) goto L_0x03d8
            goto L_0x03dd
        L_0x03d8:
            java.util.List r1 = java.util.Collections.emptyList()
            goto L_0x03f8
        L_0x03dd:
            cee r1 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.b
            java.util.List r1 = java.util.Collections.singletonList(r1)
            goto L_0x03f8
        L_0x03e4:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r6 = "1"
            java.lang.String r12 = r0.i
            boolean r6 = r12.equals(r6)
            if (r6 == 0) goto L_0x03f8
            cee r6 = androidx.camera.camera2.internal.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.a
            r1.add(r6)
        L_0x03f8:
            r3.addAll(r1)
            boolean r1 = r0.r
            if (r1 == 0) goto L_0x0523
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            cee r3 = new cee
            r3.<init>()
            dee r6 = defpackage.dee.ULTRA_MAXIMUM
            xb0 r12 = new xb0
            r12.<init>(r5, r6, r9)
            r3.a(r12)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            defpackage.k7d.m(r2, r7, r9, r3)
            cee r3 = defpackage.k7d.i(r1, r3)
            xb0 r12 = new xb0
            r12.<init>(r4, r6, r9)
            r3.a(r12)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            defpackage.k7d.m(r2, r7, r9, r3)
            cee r3 = defpackage.k7d.i(r1, r3)
            xb0 r12 = new xb0
            r12.<init>(r14, r6, r9)
            r3.a(r12)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            defpackage.k7d.m(r2, r7, r9, r3)
            cee r3 = defpackage.k7d.i(r1, r3)
            xb0 r12 = new xb0
            r12.<init>(r5, r6, r9)
            r3.a(r12)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            defpackage.k7d.m(r4, r8, r9, r3)
            cee r3 = defpackage.k7d.i(r1, r3)
            xb0 r12 = new xb0
            r12.<init>(r4, r6, r9)
            r3.a(r12)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            defpackage.k7d.m(r4, r8, r9, r3)
            cee r3 = defpackage.k7d.i(r1, r3)
            xb0 r12 = new xb0
            r12.<init>(r14, r6, r9)
            r3.a(r12)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            defpackage.k7d.m(r4, r8, r9, r3)
            cee r3 = defpackage.k7d.i(r1, r3)
            xb0 r12 = new xb0
            r12.<init>(r5, r6, r9)
            r3.a(r12)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            defpackage.k7d.m(r5, r8, r9, r3)
            cee r3 = defpackage.k7d.i(r1, r3)
            xb0 r12 = new xb0
            r12.<init>(r4, r6, r9)
            r3.a(r12)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            defpackage.k7d.m(r5, r8, r9, r3)
            cee r3 = defpackage.k7d.i(r1, r3)
            xb0 r12 = new xb0
            r12.<init>(r14, r6, r9)
            r3.a(r12)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            defpackage.k7d.m(r5, r8, r9, r3)
            cee r3 = defpackage.k7d.i(r1, r3)
            xb0 r12 = new xb0
            r12.<init>(r5, r6, r9)
            r3.a(r12)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            defpackage.k7d.m(r14, r8, r9, r3)
            cee r3 = defpackage.k7d.i(r1, r3)
            xb0 r12 = new xb0
            r12.<init>(r4, r6, r9)
            r3.a(r12)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r3.a(r12)
            defpackage.k7d.m(r14, r8, r9, r3)
            cee r3 = defpackage.k7d.i(r1, r3)
            xb0 r12 = new xb0
            r12.<init>(r14, r6, r9)
            r3.a(r12)
            xb0 r6 = new xb0
            r6.<init>(r2, r11, r9)
            r3.a(r6)
            defpackage.k7d.m(r14, r8, r9, r3)
            r1.add(r3)
            java.util.ArrayList r3 = r0.b
            r3.addAll(r1)
        L_0x0523:
            android.content.pm.PackageManager r1 = r18.getPackageManager()
            java.lang.String r3 = "android.hardware.camera.concurrent"
            boolean r1 = r1.hasSystemFeature(r3)
            r0.p = r1
            dee r3 = defpackage.dee.s1440p
            if (r1 == 0) goto L_0x05b2
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            cee r6 = new cee
            r6.<init>()
            defpackage.k7d.m(r5, r3, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            defpackage.k7d.m(r2, r3, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            defpackage.k7d.m(r4, r3, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            dee r12 = defpackage.dee.s720p
            xb0 r13 = new xb0
            r13.<init>(r5, r12, r9)
            r6.a(r13)
            defpackage.k7d.m(r4, r3, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            xb0 r13 = new xb0
            r13.<init>(r2, r12, r9)
            r6.a(r13)
            defpackage.k7d.m(r4, r3, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            xb0 r13 = new xb0
            r13.<init>(r5, r12, r9)
            r6.a(r13)
            defpackage.k7d.m(r5, r3, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            xb0 r13 = new xb0
            r13.<init>(r5, r12, r9)
            r6.a(r13)
            defpackage.k7d.m(r2, r3, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            xb0 r13 = new xb0
            r13.<init>(r2, r12, r9)
            r6.a(r13)
            defpackage.k7d.m(r5, r3, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            xb0 r13 = new xb0
            r13.<init>(r2, r12, r9)
            r6.a(r13)
            defpackage.k7d.m(r2, r3, r9, r6)
            r1.add(r6)
            java.util.ArrayList r6 = r0.c
            r6.addAll(r1)
        L_0x05b2:
            td r1 = r0.x
            boolean r1 = r1.b
            if (r1 == 0) goto L_0x063e
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            cee r6 = new cee
            r6.<init>()
            defpackage.k7d.m(r2, r8, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            defpackage.k7d.m(r5, r8, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r6.a(r12)
            defpackage.k7d.m(r4, r8, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r6.a(r12)
            defpackage.k7d.m(r5, r8, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            xb0 r12 = new xb0
            r12.<init>(r5, r11, r9)
            r6.a(r12)
            defpackage.k7d.m(r5, r8, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r6.a(r12)
            defpackage.k7d.m(r2, r7, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r6.a(r12)
            xb0 r12 = new xb0
            r12.<init>(r2, r7, r9)
            r6.a(r12)
            defpackage.k7d.m(r5, r7, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            xb0 r12 = new xb0
            r12.<init>(r2, r11, r9)
            r6.a(r12)
            xb0 r12 = new xb0
            r12.<init>(r2, r7, r9)
            r6.a(r12)
            defpackage.k7d.m(r4, r7, r9, r6)
            r1.add(r6)
            java.util.ArrayList r6 = r0.f
            r6.addAll(r1)
        L_0x063e:
            xv1 r1 = r0.k
            c8d r1 = r1.b()
            java.lang.Object r1 = r1.a
            fd7 r1 = (defpackage.fd7) r1
            r1.getClass()
            r6 = 0
            java.lang.Object r1 = r1.a     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0655 }
            android.hardware.camera2.params.StreamConfigurationMap r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0655 }
            int[] r1 = r1.getOutputFormats()     // Catch:{ IllegalArgumentException | NullPointerException -> 0x0655 }
            goto L_0x0656
        L_0x0655:
            r1 = r6
        L_0x0656:
            if (r1 != 0) goto L_0x0659
            goto L_0x0660
        L_0x0659:
            java.lang.Object r1 = r1.clone()
            r6 = r1
            int[] r6 = (int[]) r6
        L_0x0660:
            if (r6 != 0) goto L_0x0663
            goto L_0x0695
        L_0x0663:
            int r1 = r6.length
            r12 = 0
        L_0x0665:
            if (r12 >= r1) goto L_0x0695
            r13 = r6[r12]
            r14 = 4101(0x1005, float:5.747E-42)
            if (r13 != r14) goto L_0x0693
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            cee r6 = new cee
            r6.<init>()
            r12 = 4
            defpackage.k7d.m(r12, r8, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            xb0 r13 = new xb0
            r13.<init>(r2, r11, r9)
            r6.a(r13)
            defpackage.k7d.m(r12, r8, r9, r6)
            r1.add(r6)
            java.util.ArrayList r6 = r0.g
            r6.addAll(r1)
            goto L_0x0695
        L_0x0693:
            int r12 = r12 + r2
            goto L_0x0665
        L_0x0695:
            xv1 r1 = r0.k
            aa0 r6 = defpackage.e9e.a
            int r6 = android.os.Build.VERSION.SDK_INT
            r12 = 33
            if (r6 >= r12) goto L_0x06a1
        L_0x069f:
            r1 = 0
            goto L_0x06b2
        L_0x06a1:
            android.hardware.camera2.CameraCharacteristics$Key r13 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES
            java.lang.Object r1 = r1.a(r13)
            long[] r1 = (long[]) r1
            if (r1 == 0) goto L_0x069f
            int r1 = r1.length
            if (r1 != 0) goto L_0x06b1
            goto L_0x069f
        L_0x06b1:
            r1 = r2
        L_0x06b2:
            r0.q = r1
            if (r1 == 0) goto L_0x0794
            if (r6 < r12) goto L_0x0794
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            cee r13 = new cee
            r13.<init>()
            r14 = 4
            defpackage.k7d.m(r2, r3, r14, r13)
            cee r13 = defpackage.k7d.i(r1, r13)
            defpackage.k7d.m(r5, r3, r14, r13)
            cee r13 = defpackage.k7d.i(r1, r13)
            r14 = 3
            defpackage.k7d.m(r2, r7, r14, r13)
            cee r13 = defpackage.k7d.i(r1, r13)
            defpackage.k7d.m(r5, r7, r14, r13)
            cee r13 = defpackage.k7d.i(r1, r13)
            r9 = 2
            defpackage.k7d.m(r4, r8, r9, r13)
            cee r13 = defpackage.k7d.i(r1, r13)
            defpackage.k7d.m(r5, r8, r9, r13)
            cee r13 = defpackage.k7d.i(r1, r13)
            xb0 r12 = new xb0
            r14 = 1
            r12.<init>(r2, r11, r14)
            r13.a(r12)
            defpackage.k7d.m(r4, r8, r9, r13)
            cee r12 = defpackage.k7d.i(r1, r13)
            xb0 r13 = new xb0
            r13.<init>(r2, r11, r14)
            r12.a(r13)
            defpackage.k7d.m(r5, r8, r9, r12)
            cee r12 = defpackage.k7d.i(r1, r12)
            xb0 r13 = new xb0
            r13.<init>(r2, r11, r14)
            r12.a(r13)
            r9 = 3
            defpackage.k7d.m(r2, r7, r9, r12)
            cee r12 = defpackage.k7d.i(r1, r12)
            xb0 r13 = new xb0
            r13.<init>(r2, r11, r14)
            r12.a(r13)
            defpackage.k7d.m(r5, r7, r9, r12)
            cee r9 = defpackage.k7d.i(r1, r12)
            xb0 r10 = new xb0
            r10.<init>(r2, r11, r14)
            r9.a(r10)
            defpackage.k7d.m(r5, r11, r14, r9)
            cee r9 = defpackage.k7d.i(r1, r9)
            xb0 r10 = new xb0
            r10.<init>(r2, r11, r14)
            r9.a(r10)
            xb0 r10 = new xb0
            r12 = 3
            r10.<init>(r2, r7, r12)
            r9.a(r10)
            r12 = 2
            defpackage.k7d.m(r4, r7, r12, r9)
            cee r9 = defpackage.k7d.i(r1, r9)
            xb0 r10 = new xb0
            r10.<init>(r2, r11, r14)
            r9.a(r10)
            xb0 r10 = new xb0
            r12 = 3
            r10.<init>(r5, r7, r12)
            r9.a(r10)
            r12 = 2
            defpackage.k7d.m(r4, r7, r12, r9)
            cee r7 = defpackage.k7d.i(r1, r9)
            xb0 r9 = new xb0
            r9.<init>(r2, r11, r14)
            r7.a(r9)
            xb0 r9 = new xb0
            r9.<init>(r5, r11, r14)
            r7.a(r9)
            r9 = 2
            defpackage.k7d.m(r4, r8, r9, r7)
            r1.add(r7)
            java.util.ArrayList r7 = r0.h
            r7.addAll(r1)
        L_0x0794:
            xv1 r1 = r0.k
            r7 = 33
            if (r6 >= r7) goto L_0x079d
        L_0x079a:
            r16 = 0
            goto L_0x07b8
        L_0x079d:
            android.hardware.camera2.CameraCharacteristics$Key r6 = android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES
            java.lang.Object r1 = r1.a(r6)
            int[] r1 = (int[]) r1
            if (r1 == 0) goto L_0x079a
            int r6 = r1.length
            if (r6 != 0) goto L_0x07ab
            goto L_0x079a
        L_0x07ab:
            int r6 = r1.length
            r7 = 0
        L_0x07ad:
            if (r7 >= r6) goto L_0x079a
            r9 = r1[r7]
            if (r9 != r5) goto L_0x07b6
            r16 = r2
            goto L_0x07b8
        L_0x07b6:
            int r7 = r7 + r2
            goto L_0x07ad
        L_0x07b8:
            if (r16 == 0) goto L_0x0856
            int r1 = android.os.Build.VERSION.SDK_INT
            r6 = 33
            if (r1 < r6) goto L_0x0856
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            cee r6 = new cee
            r6.<init>()
            r9 = 0
            defpackage.k7d.m(r2, r3, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            defpackage.k7d.m(r5, r3, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            xb0 r7 = new xb0
            r7.<init>(r2, r3, r9)
            r6.a(r7)
            defpackage.k7d.m(r4, r8, r9, r6)
            cee r6 = defpackage.k7d.i(r1, r6)
            xb0 r7 = new xb0
            r7.<init>(r5, r3, r9)
            r6.a(r7)
            defpackage.k7d.m(r4, r8, r9, r6)
            cee r4 = defpackage.k7d.i(r1, r6)
            xb0 r6 = new xb0
            r6.<init>(r2, r3, r9)
            r4.a(r6)
            defpackage.k7d.m(r5, r8, r9, r4)
            cee r4 = defpackage.k7d.i(r1, r4)
            xb0 r6 = new xb0
            r6.<init>(r5, r3, r9)
            r4.a(r6)
            defpackage.k7d.m(r5, r8, r9, r4)
            cee r4 = defpackage.k7d.i(r1, r4)
            xb0 r6 = new xb0
            r6.<init>(r2, r11, r9)
            r4.a(r6)
            defpackage.k7d.m(r2, r3, r9, r4)
            cee r4 = defpackage.k7d.i(r1, r4)
            xb0 r6 = new xb0
            r6.<init>(r5, r11, r9)
            r4.a(r6)
            defpackage.k7d.m(r2, r3, r9, r4)
            cee r4 = defpackage.k7d.i(r1, r4)
            xb0 r6 = new xb0
            r6.<init>(r2, r11, r9)
            r4.a(r6)
            defpackage.k7d.m(r5, r3, r9, r4)
            cee r2 = defpackage.k7d.i(r1, r4)
            xb0 r4 = new xb0
            r4.<init>(r5, r11, r9)
            r2.a(r4)
            defpackage.k7d.m(r5, r3, r9, r2)
            r1.add(r2)
            java.util.ArrayList r2 = r0.d
            r2.addAll(r1)
        L_0x0856:
            r17.b()
            return
        L_0x085a:
            androidx.camera.core.CameraUnavailableException r1 = new androidx.camera.core.CameraUnavailableException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bee.<init>(android.content.Context, java.lang.String, dx1, ht1):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: android.util.Size} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Size c(android.hardware.camera2.params.StreamConfigurationMap r3, int r4, boolean r5) {
        /*
            r0 = 34
            if (r4 != r0) goto L_0x000b
            java.lang.Class<android.graphics.SurfaceTexture> r0 = android.graphics.SurfaceTexture.class
            android.util.Size[] r0 = r3.getOutputSizes(r0)
            goto L_0x000f
        L_0x000b:
            android.util.Size[] r0 = r3.getOutputSizes(r4)
        L_0x000f:
            if (r0 == 0) goto L_0x004c
            int r1 = r0.length
            if (r1 != 0) goto L_0x0015
            goto L_0x004c
        L_0x0015:
            x93 r1 = new x93
            r2 = 0
            r1.<init>(r2)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.Object r0 = java.util.Collections.max(r0, r1)
            android.util.Size r0 = (android.util.Size) r0
            android.util.Size r2 = defpackage.msd.a
            if (r5 == 0) goto L_0x003d
            android.util.Size[] r3 = r3.getHighResolutionOutputSizes(r4)
            if (r3 == 0) goto L_0x003d
            int r4 = r3.length
            if (r4 <= 0) goto L_0x003d
            java.util.List r3 = java.util.Arrays.asList(r3)
            java.lang.Object r3 = java.util.Collections.max(r3, r1)
            r2 = r3
            android.util.Size r2 = (android.util.Size) r2
        L_0x003d:
            android.util.Size[] r3 = new android.util.Size[]{r0, r2}
            java.util.List r3 = java.util.Arrays.asList(r3)
            java.lang.Object r3 = java.util.Collections.max(r3, r1)
            android.util.Size r3 = (android.util.Size) r3
            return r3
        L_0x004c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bee.c(android.hardware.camera2.params.StreamConfigurationMap, int, boolean):android.util.Size");
    }

    public static int e(Range range, Range range2) {
        c54.p("Ranges must not intersect", !range.contains((Integer) range2.getUpper()) && !range.contains((Integer) range2.getLower()));
        return ((Integer) range.getLower()).intValue() > ((Integer) range2.getUpper()).intValue() ? ((Integer) range.getLower()).intValue() - ((Integer) range2.getUpper()).intValue() : ((Integer) range2.getLower()).intValue() - ((Integer) range.getUpper()).intValue();
    }

    public static int f(Range range) {
        return (((Integer) range.getUpper()).intValue() - ((Integer) range.getLower()).intValue()) + 1;
    }

    public final boolean a(wb0 wb0, List list) {
        List<cee> list2;
        HashMap hashMap = this.e;
        if (hashMap.containsKey(wb0)) {
            list2 = (List) hashMap.get(wb0);
        } else {
            ArrayList arrayList = new ArrayList();
            boolean z = wb0.d;
            int i2 = wb0.a;
            if (!z) {
                int i3 = wb0.b;
                if (i3 == 8) {
                    if (i2 != 1) {
                        ArrayList arrayList2 = this.a;
                        if (i2 != 2) {
                            if (wb0.c) {
                                arrayList2 = this.d;
                            }
                            arrayList.addAll(arrayList2);
                        } else {
                            arrayList.addAll(this.b);
                            arrayList.addAll(arrayList2);
                        }
                    } else {
                        list2 = this.c;
                        hashMap.put(wb0, list2);
                    }
                } else if (i3 == 10 && i2 == 0) {
                    arrayList.addAll(this.f);
                }
            } else if (i2 == 0) {
                arrayList.addAll(this.g);
            }
            list2 = arrayList;
            hashMap.put(wb0, list2);
        }
        boolean z2 = false;
        for (cee c2 : list2) {
            if (c2.c(list) != null) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        return z2;
    }

    public final void b() {
        Size size;
        Size size2;
        Size e2 = this.u.e();
        try {
            int parseInt = Integer.parseInt(this.i);
            ht1 ht1 = this.j;
            CamcorderProfile camcorderProfile = null;
            CamcorderProfile a2 = ht1.c(parseInt, 1) ? ht1.a(parseInt, 1) : null;
            if (a2 != null) {
                size = new Size(a2.videoFrameWidth, a2.videoFrameHeight);
                this.s = new dc0(msd.c, new HashMap(), e2, new HashMap(), size, new HashMap(), new HashMap());
            }
            size2 = msd.d;
            if (ht1.c(parseInt, 10)) {
                camcorderProfile = ht1.a(parseInt, 10);
            } else if (ht1.c(parseInt, 8)) {
                camcorderProfile = ht1.a(parseInt, 8);
            } else if (ht1.c(parseInt, 12)) {
                camcorderProfile = ht1.a(parseInt, 12);
            } else if (ht1.c(parseInt, 6)) {
                camcorderProfile = ht1.a(parseInt, 6);
            } else if (ht1.c(parseInt, 5)) {
                camcorderProfile = ht1.a(parseInt, 5);
            } else if (ht1.c(parseInt, 4)) {
                camcorderProfile = ht1.a(parseInt, 4);
            }
            if (camcorderProfile != null) {
                size2 = new Size(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            }
            size = size2;
            this.s = new dc0(msd.c, new HashMap(), e2, new HashMap(), size, new HashMap(), new HashMap());
        } catch (NumberFormatException unused) {
            Size[] outputSizes = ((StreamConfigurationMap) ((fd7) this.k.b().a).a).getOutputSizes(MediaRecorder.class);
            if (outputSizes != null) {
                Arrays.sort(outputSizes, new x93(true));
                int length = outputSizes.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        size2 = msd.d;
                        break;
                    }
                    Size size3 = outputSizes[i2];
                    int width = size3.getWidth();
                    Size size4 = msd.f;
                    if (width <= size4.getWidth() && size3.getHeight() <= size4.getHeight()) {
                        size2 = size3;
                        break;
                    }
                    i2++;
                }
            } else {
                size2 = msd.d;
            }
        }
    }

    public final List d(wb0 wb0, List list) {
        aa0 aa0 = e9e.a;
        if (wb0.a == 0 && wb0.b == 8) {
            Iterator it = this.h.iterator();
            while (it.hasNext()) {
                List c2 = ((cee) it.next()).c(list);
                if (c2 != null) {
                    return c2;
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v1, resolved type: android.util.Range} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v1, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r24v2, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: android.util.Range} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: android.util.Range} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: android.util.Range} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v10, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v62, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v0, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v51, resolved type: java.util.ArrayList} */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x07ce, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0a5c, code lost:
        if (r5 < r0) goto L_0x0a89;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x0b02, code lost:
        if (f(r14) < f(r2)) goto L_0x0abb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01d1, code lost:
        if (r5.contains(r12) != false) goto L_0x01d3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x04c3  */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:451:0x0ace  */
    /* JADX WARNING: Removed duplicated region for block: B:643:0x028a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:671:0x04df A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0273  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.util.Pair g(int r41, java.util.ArrayList r42, java.util.HashMap r43, boolean r44, boolean r45) {
        /*
            r40 = this;
            r9 = r40
            r10 = r41
            r11 = r42
            r0 = r43
            ul4 r1 = r9.u
            android.util.Size r2 = r1.a()
            r1.b = r2
            dc0 r1 = r9.s
            if (r1 != 0) goto L_0x0018
            r40.b()
            goto L_0x0046
        L_0x0018:
            ul4 r1 = r9.u
            android.util.Size r17 = r1.e()
            dc0 r1 = r9.s
            android.util.Size r15 = r1.a
            java.util.Map r2 = r1.b
            java.util.Map r3 = r1.d
            android.util.Size r4 = r1.e
            java.util.Map r5 = r1.f
            java.util.Map r1 = r1.g
            dc0 r6 = new dc0
            r16 = r2
            java.util.HashMap r16 = (java.util.HashMap) r16
            r18 = r3
            java.util.HashMap r18 = (java.util.HashMap) r18
            r20 = r5
            java.util.HashMap r20 = (java.util.HashMap) r20
            r21 = r1
            java.util.HashMap r21 = (java.util.HashMap) r21
            r14 = r6
            r19 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r9.s = r6
        L_0x0046:
            java.util.ArrayList r14 = new java.util.ArrayList
            java.util.Set r1 = r43.keySet()
            r14.<init>(r1)
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r14.iterator()
        L_0x005d:
            boolean r3 = r2.hasNext()
            r8 = 0
            if (r3 == 0) goto L_0x0083
            java.lang.Object r3 = r2.next()
            o9f r3 = (defpackage.o9f) r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            aa0 r5 = defpackage.o9f.k0
            java.lang.Object r3 = r3.f(r5, r4)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r3.getClass()
            boolean r4 = r1.contains(r3)
            if (r4 != 0) goto L_0x005d
            r1.add(r3)
            goto L_0x005d
        L_0x0083:
            java.util.Collections.sort(r1)
            java.util.Collections.reverse(r1)
            java.util.Iterator r1 = r1.iterator()
        L_0x008d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00cb
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.util.Iterator r3 = r14.iterator()
        L_0x00a1:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x008d
            java.lang.Object r4 = r3.next()
            o9f r4 = (defpackage.o9f) r4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            aa0 r6 = defpackage.o9f.k0
            java.lang.Object r5 = r4.f(r6, r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r2 != r5) goto L_0x00a1
            int r4 = r14.indexOf(r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r15.add(r4)
            goto L_0x00a1
        L_0x00cb:
            td r1 = r9.x
            r1.getClass()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.Iterator r3 = r42.iterator()
        L_0x00d9:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x00eb
            java.lang.Object r4 = r3.next()
            l90 r4 = (defpackage.l90) r4
            eu4 r4 = r4.d
            r2.add(r4)
            goto L_0x00d9
        L_0x00eb:
            java.lang.Object r3 = r1.o
            o9g r3 = (defpackage.o9g) r3
            java.lang.Object r4 = r3.b
            iu4 r4 = (defpackage.iu4) r4
            java.util.Set r4 = r4.a()
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r4)
            java.util.Iterator r6 = r2.iterator()
        L_0x0100:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0110
            java.lang.Object r7 = r6.next()
            eu4 r7 = (defpackage.eu4) r7
            defpackage.td.w(r5, r7, r3)
            goto L_0x0100
        L_0x0110:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r17 = r15.iterator()
        L_0x0123:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L_0x016a
            java.lang.Object r18 = r17.next()
            java.lang.Integer r18 = (java.lang.Integer) r18
            int r13 = r18.intValue()
            java.lang.Object r13 = r14.get(r13)
            o9f r13 = (defpackage.o9f) r13
            eu4 r8 = r13.u()
            eu4 r11 = defpackage.eu4.c
            boolean r11 = r8.equals(r11)
            if (r11 == 0) goto L_0x014b
            r12.add(r13)
            r21 = r14
            goto L_0x0164
        L_0x014b:
            int r11 = r8.a
            r21 = r14
            r14 = 2
            if (r11 == r14) goto L_0x0161
            int r8 = r8.b
            if (r11 == 0) goto L_0x0158
            if (r8 == 0) goto L_0x0161
        L_0x0158:
            if (r11 != 0) goto L_0x015d
            if (r8 == 0) goto L_0x015d
            goto L_0x0161
        L_0x015d:
            r6.add(r13)
            goto L_0x0164
        L_0x0161:
            r7.add(r13)
        L_0x0164:
            r11 = r42
            r14 = r21
            r8 = 0
            goto L_0x0123
        L_0x016a:
            r21 = r14
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.LinkedHashSet r8 = new java.util.LinkedHashSet
            r8.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r13.addAll(r6)
            r13.addAll(r7)
            r13.addAll(r12)
            java.util.Iterator r6 = r13.iterator()
        L_0x0188:
            boolean r7 = r6.hasNext()
            eu4 r12 = defpackage.eu4.d
            if (r7 == 0) goto L_0x02c8
            java.lang.Object r7 = r6.next()
            o9f r7 = (defpackage.o9f) r7
            eu4 r14 = r7.u()
            aa0 r13 = defpackage.cne.d0
            java.lang.Object r13 = r7.h(r13)
            java.lang.String r13 = (java.lang.String) r13
            boolean r13 = r14.b()
            if (r13 == 0) goto L_0x01c0
            boolean r12 = r5.contains(r14)
            if (r12 == 0) goto L_0x01b7
            r17 = r1
            r24 = r6
            r12 = r14
            r25 = r15
            goto L_0x0271
        L_0x01b7:
            r17 = r1
            r24 = r6
            r25 = r15
        L_0x01bd:
            r12 = 0
            goto L_0x0271
        L_0x01c0:
            int r13 = r14.a
            r24 = r6
            int r6 = r14.b
            r25 = r15
            r15 = 1
            if (r13 != r15) goto L_0x01da
            if (r6 != 0) goto L_0x01da
            boolean r6 = r5.contains(r12)
            if (r6 == 0) goto L_0x01d7
        L_0x01d3:
            r17 = r1
            goto L_0x0271
        L_0x01d7:
            r17 = r1
            goto L_0x01bd
        L_0x01da:
            eu4 r15 = defpackage.td.q(r14, r2, r5)
            if (r15 == 0) goto L_0x01eb
            r14.toString()
            r15.toString()
        L_0x01e6:
            r17 = r1
            r12 = r15
            goto L_0x0271
        L_0x01eb:
            eu4 r15 = defpackage.td.q(r14, r8, r5)
            if (r15 == 0) goto L_0x01f8
            r14.toString()
            r15.toString()
            goto L_0x01e6
        L_0x01f8:
            boolean r15 = defpackage.td.f(r14, r12, r5)
            if (r15 == 0) goto L_0x0205
            r14.toString()
            r12.toString()
            goto L_0x01d3
        L_0x0205:
            r15 = 2
            if (r13 != r15) goto L_0x0240
            r13 = 10
            if (r6 == r13) goto L_0x020e
            if (r6 != 0) goto L_0x0240
        L_0x020e:
            java.util.LinkedHashSet r6 = new java.util.LinkedHashSet
            r6.<init>()
            int r13 = android.os.Build.VERSION.SDK_INT
            r15 = 33
            if (r13 < r15) goto L_0x0227
            java.lang.Object r13 = r1.c
            xv1 r13 = (defpackage.xv1) r13
            eu4 r13 = defpackage.gu4.b(r13)
            if (r13 == 0) goto L_0x0228
            r6.add(r13)
            goto L_0x0228
        L_0x0227:
            r13 = 0
        L_0x0228:
            eu4 r15 = defpackage.eu4.e
            r6.add(r15)
            eu4 r6 = defpackage.td.q(r14, r6, r5)
            if (r6 == 0) goto L_0x0240
            r6.equals(r13)
            r14.toString()
            r6.toString()
            r17 = r1
            r12 = r6
            goto L_0x0271
        L_0x0240:
            java.util.Iterator r6 = r5.iterator()
        L_0x0244:
            boolean r13 = r6.hasNext()
            if (r13 == 0) goto L_0x01d7
            java.lang.Object r13 = r6.next()
            eu4 r13 = (defpackage.eu4) r13
            boolean r15 = r13.b()
            r17 = r1
            java.lang.String r1 = "Candidate dynamic range must be fully specified."
            defpackage.c54.p(r1, r15)
            boolean r1 = r13.equals(r12)
            if (r1 == 0) goto L_0x0264
        L_0x0261:
            r1 = r17
            goto L_0x0244
        L_0x0264:
            boolean r1 = defpackage.td.e(r14, r13)
            if (r1 == 0) goto L_0x0261
            r14.toString()
            r13.toString()
            r12 = r13
        L_0x0271:
            if (r12 == 0) goto L_0x028a
            defpackage.td.w(r5, r12, r3)
            r11.put(r7, r12)
            boolean r1 = r2.contains(r12)
            if (r1 != 0) goto L_0x0282
            r8.add(r12)
        L_0x0282:
            r1 = r17
            r6 = r24
            r15 = r25
            goto L_0x0188
        L_0x028a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            aa0 r1 = defpackage.cne.d0
            java.lang.Object r1 = r7.h(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "\n  "
            java.lang.String r3 = android.text.TextUtils.join(r2, r4)
            java.lang.String r2 = android.text.TextUtils.join(r2, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = "\nRequested dynamic range:\n  "
            r4.append(r1)
            r4.append(r14)
            java.lang.String r1 = "\nSupported dynamic ranges:\n  "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = "\nConstrained set of concurrent dynamic ranges:\n  "
            r4.append(r1)
            r4.append(r2)
            java.lang.String r1 = r4.toString()
            r0.<init>(r1)
            throw r0
        L_0x02c8:
            r25 = r15
            java.util.Iterator r1 = r42.iterator()
        L_0x02ce:
            boolean r2 = r1.hasNext()
            r3 = 4101(0x1005, float:5.747E-42)
            if (r2 == 0) goto L_0x02e2
            java.lang.Object r2 = r1.next()
            l90 r2 = (defpackage.l90) r2
            int r2 = r2.b
            if (r2 != r3) goto L_0x02ce
        L_0x02e0:
            r1 = 1
            goto L_0x02fe
        L_0x02e2:
            java.util.Set r1 = r43.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x02ea:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x02fd
            java.lang.Object r2 = r1.next()
            o9f r2 = (defpackage.o9f) r2
            int r2 = r2.getInputFormat()
            if (r2 != r3) goto L_0x02ea
            goto L_0x02e0
        L_0x02fd:
            r1 = 0
        L_0x02fe:
            java.util.Collection r2 = r11.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x0306:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x031b
            java.lang.Object r3 = r2.next()
            eu4 r3 = (defpackage.eu4) r3
            int r3 = r3.b
            r4 = 10
            if (r3 != r4) goto L_0x0306
            r13 = 10
            goto L_0x031d
        L_0x031b:
            r13 = 8
        L_0x031d:
            java.lang.String r2 = r9.i
            java.lang.String r3 = "CONCURRENT_CAMERA"
            java.lang.String r4 = "ULTRA_HIGH_RESOLUTION_CAMERA"
            java.lang.String r5 = "DEFAULT"
            java.lang.String r6 = " camera mode."
            java.lang.String r7 = "Camera device id is "
            if (r10 == 0) goto L_0x0343
            if (r1 != 0) goto L_0x032e
            goto L_0x0343
        L_0x032e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            if (r10 == r1) goto L_0x0339
            r1 = 2
            if (r10 == r1) goto L_0x0338
            r3 = r5
            goto L_0x0339
        L_0x0338:
            r3 = r4
        L_0x0339:
            java.lang.String r1 = ". Ultra HDR is not currently supported in "
            java.lang.String r1 = defpackage.k7d.j(r7, r2, r1, r3, r6)
            r0.<init>(r1)
            throw r0
        L_0x0343:
            if (r10 == 0) goto L_0x035f
            r8 = 10
            if (r13 == r8) goto L_0x034a
            goto L_0x035f
        L_0x034a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            if (r10 == r1) goto L_0x0355
            r1 = 2
            if (r10 == r1) goto L_0x0354
            r3 = r5
            goto L_0x0355
        L_0x0354:
            r3 = r4
        L_0x0355:
            java.lang.String r1 = ". 10 bit dynamic range is not currently supported in "
            java.lang.String r1 = defpackage.k7d.j(r7, r2, r1, r3, r6)
            r0.<init>(r1)
            throw r0
        L_0x035f:
            wb0 r14 = new wb0
            r2 = r44
            r14.<init>(r10, r13, r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r42.iterator()
        L_0x036f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0381
            java.lang.Object r3 = r2.next()
            l90 r3 = (defpackage.l90) r3
            xb0 r3 = r3.a
            r1.add(r3)
            goto L_0x036f
        L_0x0381:
            x93 r2 = new x93
            r3 = 0
            r2.<init>(r3)
            java.util.Set r3 = r43.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x038f:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x03da
            java.lang.Object r4 = r3.next()
            o9f r4 = (defpackage.o9f) r4
            java.lang.Object r5 = r0.get(r4)
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto L_0x03ab
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x03ab
            r6 = 1
            goto L_0x03ac
        L_0x03ab:
            r6 = 0
        L_0x03ac:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "No available output size is found for "
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r8 = "."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            defpackage.c54.j(r7, r6)
            java.lang.Object r5 = java.util.Collections.min(r5, r2)
            android.util.Size r5 = (android.util.Size) r5
            int r4 = r4.getInputFormat()
            int r6 = r14.a
            dc0 r7 = r9.i(r4)
            xb0 r4 = defpackage.xb0.b(r6, r4, r5, r7)
            r1.add(r4)
            goto L_0x038f
        L_0x03da:
            boolean r13 = r9.a(r14, r1)
            java.lang.String r15 = ".  May be attempting to bind too many use cases. Existing surfaces: "
            java.lang.String r8 = " New configs: "
            java.lang.String r7 = "No supported surface combination is found for camera device - Id : "
            if (r13 == 0) goto L_0x0f03
            java.util.Iterator r1 = r42.iterator()
            r2 = 0
        L_0x03eb:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0404
            java.lang.Object r3 = r1.next()
            l90 r3 = (defpackage.l90) r3
            android.util.Range r3 = r3.g
            if (r2 != 0) goto L_0x03fd
            r2 = r3
            goto L_0x03eb
        L_0x03fd:
            if (r3 == 0) goto L_0x03eb
            android.util.Range r2 = r2.intersect(r3)     // Catch:{ IllegalArgumentException -> 0x03eb }
            goto L_0x03eb
        L_0x0404:
            java.util.Iterator r1 = r25.iterator()
            r6 = r2
        L_0x0409:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0438
            java.lang.Object r2 = r1.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r5 = r21
            java.lang.Object r2 = r5.get(r2)
            o9f r2 = (defpackage.o9f) r2
            aa0 r3 = defpackage.o9f.l0
            r4 = 0
            java.lang.Object r2 = r2.f(r3, r4)
            android.util.Range r2 = (android.util.Range) r2
            if (r6 != 0) goto L_0x042e
        L_0x042c:
            r6 = r2
            goto L_0x0435
        L_0x042e:
            if (r2 == 0) goto L_0x0435
            android.util.Range r2 = r6.intersect(r2)     // Catch:{ IllegalArgumentException -> 0x0435 }
            goto L_0x042c
        L_0x0435:
            r21 = r5
            goto L_0x0409
        L_0x0438:
            r5 = r21
            r4 = 0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set r2 = r43.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0448:
            boolean r3 = r2.hasNext()
            r21 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            if (r3 == 0) goto L_0x0505
            java.lang.Object r3 = r2.next()
            o9f r3 = (defpackage.o9f) r3
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.Object r24 = r0.get(r3)
            java.util.List r24 = (java.util.List) r24
            java.util.Iterator r24 = r24.iterator()
        L_0x046d:
            boolean r26 = r24.hasNext()
            if (r26 == 0) goto L_0x04ef
            java.lang.Object r26 = r24.next()
            r0 = r26
            android.util.Size r0 = (android.util.Size) r0
            r26 = r2
            int r2 = r3.getInputFormat()
            r27 = r7
            int r7 = r14.a
            r28 = r8
            dc0 r8 = r9.i(r2)
            xb0 r7 = defpackage.xb0.b(r7, r2, r0, r8)
            if (r6 == 0) goto L_0x04b0
            xv1 r8 = r9.k
            r29 = r6
            android.hardware.camera2.CameraCharacteristics$Key r6 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ Exception -> 0x04aa }
            java.lang.Object r6 = r8.a(r6)     // Catch:{ Exception -> 0x04aa }
            android.hardware.camera2.params.StreamConfigurationMap r6 = (android.hardware.camera2.params.StreamConfigurationMap) r6     // Catch:{ Exception -> 0x04aa }
            r31 = r11
            r30 = r12
            long r11 = r6.getOutputMinFrameDuration(r2, r0)     // Catch:{ Exception -> 0x04ae }
            double r11 = (double) r11
            double r11 = r21 / r11
            int r2 = (int) r11
            goto L_0x04b9
        L_0x04aa:
            r31 = r11
            r30 = r12
        L_0x04ae:
            r2 = 0
            goto L_0x04b9
        L_0x04b0:
            r29 = r6
            r31 = r11
            r30 = r12
            r2 = 2147483647(0x7fffffff, float:NaN)
        L_0x04b9:
            dee r6 = r7.b
            java.lang.Object r7 = r10.get(r6)
            java.util.Set r7 = (java.util.Set) r7
            if (r7 != 0) goto L_0x04cb
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r10.put(r6, r7)
        L_0x04cb:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            boolean r6 = r7.contains(r6)
            if (r6 != 0) goto L_0x04df
            r4.add(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r7.add(r0)
        L_0x04df:
            r0 = r43
            r2 = r26
            r7 = r27
            r8 = r28
            r6 = r29
            r12 = r30
            r11 = r31
            goto L_0x046d
        L_0x04ef:
            r26 = r2
            r29 = r6
            r27 = r7
            r28 = r8
            r31 = r11
            r30 = r12
            r1.put(r3, r4)
            r10 = r41
            r0 = r43
            r4 = 0
            goto L_0x0448
        L_0x0505:
            r29 = r6
            r27 = r7
            r28 = r8
            r31 = r11
            r30 = r12
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r2 = r25.iterator()
        L_0x0518:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x05fe
            java.lang.Object r3 = r2.next()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            java.lang.Object r3 = r5.get(r3)
            o9f r3 = (defpackage.o9f) r3
            java.lang.Object r4 = r1.get(r3)
            java.util.List r4 = (java.util.List) r4
            int r3 = r3.getInputFormat()
            huc r6 = r9.v
            xv1 r7 = r9.k
            r6.getClass()
            bj6 r6 = defpackage.zi4.a
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk> r8 = androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.class
            vrb r6 = r6.e(r8)
            androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk r6 = (androidx.camera.camera2.internal.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk) r6
            if (r6 == 0) goto L_0x054d
        L_0x054b:
            r6 = 2
            goto L_0x055d
        L_0x054d:
            bj6 r6 = defpackage.ft.i(r7)
            java.lang.Class<androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk> r7 = androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk.class
            vrb r6 = r6.e(r7)
            androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk r6 = (androidx.camera.camera2.internal.compat.quirk.AspectRatioLegacyApi21Quirk) r6
            if (r6 == 0) goto L_0x055c
            goto L_0x054b
        L_0x055c:
            r6 = 3
        L_0x055d:
            if (r6 == 0) goto L_0x058b
            r7 = 1
            if (r6 == r7) goto L_0x0587
            r7 = 2
            if (r6 == r7) goto L_0x0567
            r8 = 0
            goto L_0x058e
        L_0x0567:
            r6 = 256(0x100, float:3.59E-43)
            dc0 r8 = r9.i(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.util.Map r8 = r8.f
            java.lang.Object r6 = r8.get(r6)
            android.util.Size r6 = (android.util.Size) r6
            android.util.Rational r8 = new android.util.Rational
            int r10 = r6.getWidth()
            int r6 = r6.getHeight()
            r8.<init>(r10, r6)
            goto L_0x058e
        L_0x0587:
            r7 = 2
            android.util.Rational r8 = defpackage.lt.c
            goto L_0x058e
        L_0x058b:
            r7 = 2
            android.util.Rational r8 = defpackage.lt.a
        L_0x058e:
            if (r8 != 0) goto L_0x0591
            goto L_0x05c2
        L_0x0591:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x059f:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x05bd
            java.lang.Object r11 = r4.next()
            android.util.Size r11 = (android.util.Size) r11
            android.util.Rational r12 = defpackage.lt.a
            android.util.Size r12 = defpackage.msd.c
            boolean r12 = defpackage.lt.a(r11, r8, r12)
            if (r12 == 0) goto L_0x05b9
            r6.add(r11)
            goto L_0x059f
        L_0x05b9:
            r10.add(r11)
            goto L_0x059f
        L_0x05bd:
            r11 = 0
            r10.addAll(r11, r6)
            r4 = r10
        L_0x05c2:
            wmc r6 = r9.w
            int r3 = defpackage.xb0.a(r3)
            java.lang.Object r6 = r6.a
            androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk r6 = (androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk) r6
            if (r6 != 0) goto L_0x05cf
            goto L_0x05f9
        L_0x05cf:
            android.util.Size r3 = androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk.e(r3)
            if (r3 != 0) goto L_0x05d6
            goto L_0x05f9
        L_0x05d6:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r6.add(r3)
            java.util.Iterator r4 = r4.iterator()
        L_0x05e2:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x05f8
            java.lang.Object r8 = r4.next()
            android.util.Size r8 = (android.util.Size) r8
            boolean r10 = r8.equals(r3)
            if (r10 != 0) goto L_0x05e2
            r6.add(r8)
            goto L_0x05e2
        L_0x05f8:
            r4 = r6
        L_0x05f9:
            r0.add(r4)
            goto L_0x0518
        L_0x05fe:
            java.util.Iterator r1 = r0.iterator()
            r2 = 1
        L_0x0603:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0615
            java.lang.Object r3 = r1.next()
            java.util.List r3 = (java.util.List) r3
            int r3 = r3.size()
            int r2 = r2 * r3
            goto L_0x0603
        L_0x0615:
            if (r2 == 0) goto L_0x0efb
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r1 = 0
        L_0x061d:
            if (r1 >= r2) goto L_0x062a
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10.add(r3)
            r3 = 1
            int r1 = r1 + r3
            goto L_0x061d
        L_0x062a:
            r1 = 0
            java.lang.Object r3 = r0.get(r1)
            java.util.List r3 = (java.util.List) r3
            int r1 = r3.size()
            int r1 = r2 / r1
            r4 = r2
            r3 = 0
        L_0x0639:
            int r6 = r0.size()
            if (r3 >= r6) goto L_0x067a
            java.lang.Object r6 = r0.get(r3)
            java.util.List r6 = (java.util.List) r6
            r7 = 0
        L_0x0646:
            if (r7 >= r2) goto L_0x065d
            java.lang.Object r8 = r10.get(r7)
            java.util.List r8 = (java.util.List) r8
            int r11 = r7 % r4
            int r11 = r11 / r1
            java.lang.Object r11 = r6.get(r11)
            android.util.Size r11 = (android.util.Size) r11
            r8.add(r11)
            r8 = 1
            int r7 = r7 + r8
            goto L_0x0646
        L_0x065d:
            r8 = 1
            int r6 = r0.size()
            int r6 = r6 - r8
            if (r3 >= r6) goto L_0x0678
            int r4 = r3 + 1
            java.lang.Object r4 = r0.get(r4)
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            int r4 = r1 / r4
            r39 = r4
            r4 = r1
            r1 = r39
        L_0x0678:
            int r3 = r3 + r8
            goto L_0x0639
        L_0x067a:
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            aa0 r0 = defpackage.e9e.a
            java.util.Iterator r0 = r42.iterator()
        L_0x0694:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x06b3
            java.lang.Object r1 = r0.next()
            l90 r1 = (defpackage.l90) r1
            java.util.List r2 = r1.e
            r6 = 0
            java.lang.Object r2 = r2.get(r6)
            q9f r2 = (defpackage.q9f) r2
            ce3 r1 = r1.f
            boolean r1 = defpackage.e9e.c(r1, r2)
            if (r1 == 0) goto L_0x0694
        L_0x06b1:
            r0 = 1
            goto L_0x06d0
        L_0x06b3:
            r6 = 0
            java.util.Iterator r0 = r5.iterator()
        L_0x06b8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x06cf
            java.lang.Object r1 = r0.next()
            o9f r1 = (defpackage.o9f) r1
            q9f r2 = r1.N()
            boolean r1 = defpackage.e9e.c(r1, r2)
            if (r1 == 0) goto L_0x06b8
            goto L_0x06b1
        L_0x06cf:
            r0 = r6
        L_0x06d0:
            java.util.Iterator r1 = r42.iterator()
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x06d7:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0705
            java.lang.Object r2 = r1.next()
            l90 r2 = (defpackage.l90) r2
            int r3 = r2.b
            android.util.Size r2 = r2.c
            xv1 r6 = r9.k
            r43 = r1
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch:{ Exception -> 0x06fc }
            java.lang.Object r1 = r6.a(r1)     // Catch:{ Exception -> 0x06fc }
            android.hardware.camera2.params.StreamConfigurationMap r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1     // Catch:{ Exception -> 0x06fc }
            long r1 = r1.getOutputMinFrameDuration(r3, r2)     // Catch:{ Exception -> 0x06fc }
            double r1 = (double) r1
            double r1 = r21 / r1
            int r3 = (int) r1
            goto L_0x06fd
        L_0x06fc:
            r3 = 0
        L_0x06fd:
            int r4 = java.lang.Math.min(r4, r3)
            r1 = r43
            r6 = 0
            goto L_0x06d7
        L_0x0705:
            boolean r1 = r9.q
            java.lang.String r6 = "SurfaceConfig does not map to any use case"
            if (r1 == 0) goto L_0x088e
            if (r0 != 0) goto L_0x088e
            java.util.Iterator r18 = r10.iterator()
            r0 = 0
        L_0x0712:
            boolean r1 = r18.hasNext()
            if (r1 == 0) goto L_0x0847
            java.lang.Object r0 = r18.next()
            r3 = r0
            java.util.List r3 = (java.util.List) r3
            r0 = r40
            r1 = r41
            r2 = r42
            r43 = r4
            r21 = 0
            r4 = r5
            r22 = r11
            r11 = r5
            r5 = r25
            r23 = r12
            r19 = 0
            r12 = r6
            r6 = r43
            r26 = r7
            r24 = r10
            r10 = r27
            r7 = r8
            r27 = r11
            r32 = r28
            r11 = r8
            r8 = r26
            android.util.Pair r0 = r0.h(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r0.first
            java.util.List r0 = (java.util.List) r0
            java.util.List r4 = r9.d(r14, r0)
            if (r4 == 0) goto L_0x07dc
            r8 = 0
        L_0x0753:
            int r0 = r4.size()
            if (r8 >= r0) goto L_0x07dc
            java.lang.Object r0 = r4.get(r8)
            xb0 r0 = (defpackage.xb0) r0
            long r0 = r0.c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            boolean r2 = r11.containsKey(r2)
            q9f r3 = defpackage.q9f.X
            if (r2 == 0) goto L_0x0798
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Object r2 = r11.get(r2)
            l90 r2 = (defpackage.l90) r2
            java.util.List r5 = r2.e
            int r5 = r5.size()
            java.util.List r2 = r2.e
            r6 = 1
            if (r5 != r6) goto L_0x078a
            r7 = 0
            java.lang.Object r3 = r2.get(r7)
            q9f r3 = (defpackage.q9f) r3
            goto L_0x078b
        L_0x078a:
            r7 = 0
        L_0x078b:
            boolean r0 = defpackage.e9e.b(r3, r0, r2)
            if (r0 != 0) goto L_0x0794
            r6 = r26
            goto L_0x07ce
        L_0x0794:
            r6 = r26
        L_0x0796:
            r0 = 1
            goto L_0x07d1
        L_0x0798:
            r7 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            r6 = r26
            boolean r2 = r6.containsKey(r2)
            if (r2 == 0) goto L_0x07d6
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            java.lang.Object r2 = r6.get(r2)
            o9f r2 = (defpackage.o9f) r2
            q9f r5 = r2.N()
            q9f r7 = r2.N()
            if (r7 != r3) goto L_0x07c4
            d9e r2 = (defpackage.d9e) r2
            aa0 r3 = defpackage.d9e.b
            java.lang.Object r2 = r2.h(r3)
            java.util.List r2 = (java.util.List) r2
            goto L_0x07c8
        L_0x07c4:
            java.util.List r2 = java.util.Collections.emptyList()
        L_0x07c8:
            boolean r0 = defpackage.e9e.b(r5, r0, r2)
            if (r0 != 0) goto L_0x0796
        L_0x07ce:
            r4 = r21
            goto L_0x07de
        L_0x07d1:
            int r8 = r8 + r0
            r26 = r6
            goto L_0x0753
        L_0x07d6:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r12)
            throw r0
        L_0x07dc:
            r6 = r26
        L_0x07de:
            if (r4 == 0) goto L_0x082d
            xv1 r0 = r9.k
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 33
            if (r1 >= r2) goto L_0x07e9
            goto L_0x082a
        L_0x07e9:
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES
            java.lang.Object r0 = r0.a(r1)
            long[] r0 = (long[]) r0
            if (r0 == 0) goto L_0x082a
            int r1 = r0.length
            if (r1 != 0) goto L_0x07f9
            goto L_0x082a
        L_0x07f9:
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            int r2 = r0.length
            r8 = 0
        L_0x0800:
            if (r8 >= r2) goto L_0x080e
            r33 = r0[r8]
            java.lang.Long r3 = java.lang.Long.valueOf(r33)
            r1.add(r3)
            r3 = 1
            int r8 = r8 + r3
            goto L_0x0800
        L_0x080e:
            java.util.Iterator r0 = r4.iterator()
        L_0x0812:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x085b
            java.lang.Object r2 = r0.next()
            xb0 r2 = (defpackage.xb0) r2
            long r2 = r2.c
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L_0x0812
        L_0x082a:
            r0 = r21
            goto L_0x082e
        L_0x082d:
            r0 = r4
        L_0x082e:
            r11.clear()
            r6.clear()
            r4 = r43
            r7 = r6
            r8 = r11
            r6 = r12
            r11 = r22
            r12 = r23
            r5 = r27
            r28 = r32
            r27 = r10
            r10 = r24
            goto L_0x0712
        L_0x0847:
            r43 = r4
            r24 = r10
            r22 = r11
            r23 = r12
            r10 = r27
            r32 = r28
            r21 = 0
            r27 = r5
            r12 = r6
            r6 = r7
            r11 = r8
            r4 = r0
        L_0x085b:
            if (r4 != 0) goto L_0x085f
            if (r13 == 0) goto L_0x0866
        L_0x085f:
            r13 = r42
            r8 = r27
            r15 = r32
            goto L_0x088c
        L_0x0866:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            java.lang.String r2 = r9.i
            r1.append(r2)
            r1.append(r15)
            r13 = r42
            r1.append(r13)
            r15 = r32
            r1.append(r15)
            r8 = r27
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x088c:
            r7 = r4
            goto L_0x08a4
        L_0x088e:
            r13 = r42
            r43 = r4
            r24 = r10
            r22 = r11
            r23 = r12
            r10 = r27
            r15 = r28
            r21 = 0
            r12 = r6
            r6 = r7
            r11 = r8
            r8 = r5
            r7 = r21
        L_0x08a4:
            java.util.Iterator r18 = r24.iterator()
            r24 = r21
            r26 = r24
            r4 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
            r27 = 0
            r28 = 0
        L_0x08b6:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x096f
            java.lang.Object r0 = r18.next()
            r32 = r0
            java.util.List r32 = (java.util.List) r32
            r33 = 0
            r34 = 0
            r0 = r40
            r1 = r41
            r2 = r42
            r3 = r32
            r35 = r4
            r4 = r8
            r36 = r5
            r5 = r25
            r37 = r6
            r6 = r43
            r38 = r15
            r19 = 0
            r15 = r7
            r7 = r33
            r33 = r8
            r8 = r34
            android.util.Pair r0 = r0.h(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r0.first
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r5 = r0.intValue()
            r4 = r43
            if (r29 == 0) goto L_0x090b
            if (r4 <= r5) goto L_0x090b
            java.lang.Comparable r0 = r29.getLower()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r5 >= r0) goto L_0x090b
            r8 = r19
            goto L_0x090c
        L_0x090b:
            r8 = 1
        L_0x090c:
            if (r27 != 0) goto L_0x0933
            boolean r0 = r9.a(r14, r1)
            if (r0 == 0) goto L_0x0933
            r2 = r36
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r0) goto L_0x091c
            goto L_0x091e
        L_0x091c:
            if (r2 >= r5) goto L_0x0921
        L_0x091e:
            r2 = r5
            r24 = r32
        L_0x0921:
            if (r8 == 0) goto L_0x0935
            if (r28 == 0) goto L_0x092d
            r1 = r26
            r0 = r32
            r4 = r35
            goto L_0x097e
        L_0x092d:
            r2 = r5
            r24 = r32
            r27 = 1
            goto L_0x0935
        L_0x0933:
            r2 = r36
        L_0x0935:
            if (r15 == 0) goto L_0x095d
            if (r28 != 0) goto L_0x095d
            java.util.List r0 = r9.d(r14, r1)
            if (r0 == 0) goto L_0x095d
            r1 = r35
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r0) goto L_0x0947
            goto L_0x0949
        L_0x0947:
            if (r1 >= r5) goto L_0x094c
        L_0x0949:
            r1 = r5
            r26 = r32
        L_0x094c:
            if (r8 == 0) goto L_0x0962
            if (r27 == 0) goto L_0x0957
            r4 = r5
            r0 = r24
            r1 = r32
            r5 = r2
            goto L_0x097e
        L_0x0957:
            r1 = r5
            r26 = r32
            r28 = 1
            goto L_0x0962
        L_0x095d:
            r1 = r35
            r0 = 2147483647(0x7fffffff, float:NaN)
        L_0x0962:
            r5 = r2
            r43 = r4
            r7 = r15
            r8 = r33
            r6 = r37
            r15 = r38
            r4 = r1
            goto L_0x08b6
        L_0x096f:
            r1 = r4
            r2 = r5
            r37 = r6
            r33 = r8
            r38 = r15
            r19 = 0
            r15 = r7
            r0 = r24
            r1 = r26
        L_0x097e:
            if (r0 == 0) goto L_0x0ec9
            if (r29 == 0) goto L_0x0b37
            android.util.Range r2 = defpackage.vb0.f
            r6 = r29
            boolean r3 = r6.equals(r2)
            if (r3 == 0) goto L_0x099b
        L_0x098c:
            r43 = r0
            r44 = r1
            r14 = r2
            r24 = r4
            r26 = r5
            r27 = r11
            r18 = r12
            goto L_0x0b45
        L_0x099b:
            xv1 r3 = r9.k
            android.hardware.camera2.CameraCharacteristics$Key r7 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES
            java.lang.Object r3 = r3.a(r7)
            android.util.Range[] r3 = (android.util.Range[]) r3
            if (r3 != 0) goto L_0x09a8
            goto L_0x098c
        L_0x09a8:
            android.util.Range r7 = new android.util.Range
            java.lang.Comparable r8 = r6.getLower()
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r8 = java.lang.Math.min(r8, r5)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Comparable r6 = r6.getUpper()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            int r6 = java.lang.Math.min(r6, r5)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.<init>(r8, r6)
            int r6 = r3.length
            r8 = r19
            r10 = r8
        L_0x09d5:
            if (r8 >= r6) goto L_0x0b29
            r14 = r3[r8]
            java.lang.Comparable r18 = r14.getLower()
            java.lang.Integer r18 = (java.lang.Integer) r18
            r41 = r3
            int r3 = r18.intValue()
            if (r5 < r3) goto L_0x0b05
            android.util.Range r3 = defpackage.vb0.f
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L_0x09f0
            r2 = r14
        L_0x09f0:
            boolean r3 = r14.equals(r7)
            if (r3 == 0) goto L_0x0a05
            r43 = r0
            r44 = r1
            r24 = r4
            r26 = r5
            r27 = r11
            r18 = r12
            r2 = r14
            goto L_0x0b35
        L_0x0a05:
            android.util.Range r3 = r14.intersect(r7)     // Catch:{ IllegalArgumentException -> 0x0abe }
            int r3 = f(r3)     // Catch:{ IllegalArgumentException -> 0x0abe }
            if (r10 != 0) goto L_0x0a20
            r43 = r0
            r44 = r1
            r10 = r3
            r24 = r4
            r26 = r5
            r21 = r6
            r27 = r11
            r18 = r12
            goto L_0x0abb
        L_0x0a20:
            if (r3 < r10) goto L_0x0aac
            android.util.Range r3 = r2.intersect(r7)     // Catch:{ IllegalArgumentException -> 0x0abe }
            int r3 = f(r3)     // Catch:{ IllegalArgumentException -> 0x0abe }
            r18 = r12
            double r12 = (double) r3
            android.util.Range r3 = r14.intersect(r7)     // Catch:{ IllegalArgumentException -> 0x0aa1 }
            int r3 = f(r3)     // Catch:{ IllegalArgumentException -> 0x0aa1 }
            r24 = r4
            double r3 = (double) r3
            r21 = r6
            int r6 = f(r14)     // Catch:{ IllegalArgumentException -> 0x0a98 }
            r26 = r5
            double r5 = (double) r6
            double r5 = r3 / r5
            r27 = r11
            int r11 = f(r2)     // Catch:{ IllegalArgumentException -> 0x0a93 }
            r43 = r0
            r44 = r1
            double r0 = (double) r11
            double r0 = r12 / r0
            int r3 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            r11 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r3 <= 0) goto L_0x0a60
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x0a5e
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0a89
        L_0x0a5e:
            r2 = r14
            goto L_0x0a89
        L_0x0a60:
            if (r3 != 0) goto L_0x0a80
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0a67
            goto L_0x0a5e
        L_0x0a67:
            if (r0 != 0) goto L_0x0a89
            java.lang.Comparable r0 = r14.getLower()     // Catch:{ IllegalArgumentException -> 0x0acc }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalArgumentException -> 0x0acc }
            int r0 = r0.intValue()     // Catch:{ IllegalArgumentException -> 0x0acc }
            java.lang.Comparable r1 = r2.getLower()     // Catch:{ IllegalArgumentException -> 0x0acc }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ IllegalArgumentException -> 0x0acc }
            int r1 = r1.intValue()     // Catch:{ IllegalArgumentException -> 0x0acc }
            if (r0 <= r1) goto L_0x0a89
            goto L_0x0a5e
        L_0x0a80:
            int r3 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r3 >= 0) goto L_0x0a89
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0a89
            goto L_0x0a5e
        L_0x0a89:
            android.util.Range r0 = r7.intersect(r2)     // Catch:{ IllegalArgumentException -> 0x0acc }
            int r10 = f(r0)     // Catch:{ IllegalArgumentException -> 0x0acc }
        L_0x0a91:
            r14 = r2
            goto L_0x0abb
        L_0x0a93:
            r43 = r0
            r44 = r1
            goto L_0x0acc
        L_0x0a98:
            r43 = r0
            r44 = r1
            r26 = r5
        L_0x0a9e:
            r27 = r11
            goto L_0x0acc
        L_0x0aa1:
            r43 = r0
            r44 = r1
            r24 = r4
            r26 = r5
            r21 = r6
            goto L_0x0a9e
        L_0x0aac:
            r43 = r0
            r44 = r1
            r24 = r4
            r26 = r5
            r21 = r6
            r27 = r11
            r18 = r12
            goto L_0x0a91
        L_0x0abb:
            r2 = r14
        L_0x0abc:
            r0 = 1
            goto L_0x0b14
        L_0x0abe:
            r43 = r0
            r44 = r1
            r24 = r4
            r26 = r5
            r21 = r6
            r27 = r11
            r18 = r12
        L_0x0acc:
            if (r10 != 0) goto L_0x0abc
            int r0 = e(r14, r7)
            int r1 = e(r2, r7)
            if (r0 >= r1) goto L_0x0ad9
            goto L_0x0b04
        L_0x0ad9:
            int r0 = e(r14, r7)
            int r1 = e(r2, r7)
            if (r0 != r1) goto L_0x0abc
            java.lang.Comparable r0 = r14.getLower()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.Comparable r1 = r2.getUpper()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r0 <= r1) goto L_0x0afa
            goto L_0x0b04
        L_0x0afa:
            int r0 = f(r14)
            int r1 = f(r2)
            if (r0 >= r1) goto L_0x0abc
        L_0x0b04:
            goto L_0x0abb
        L_0x0b05:
            r43 = r0
            r44 = r1
            r24 = r4
            r26 = r5
            r21 = r6
            r27 = r11
            r18 = r12
            goto L_0x0abc
        L_0x0b14:
            int r8 = r8 + r0
            r3 = r41
            r13 = r42
            r0 = r43
            r1 = r44
            r12 = r18
            r6 = r21
            r4 = r24
            r5 = r26
            r11 = r27
            goto L_0x09d5
        L_0x0b29:
            r43 = r0
            r44 = r1
            r24 = r4
            r26 = r5
            r27 = r11
            r18 = r12
        L_0x0b35:
            r14 = r2
            goto L_0x0b45
        L_0x0b37:
            r43 = r0
            r44 = r1
            r24 = r4
            r26 = r5
            r27 = r11
            r18 = r12
            r14 = r21
        L_0x0b45:
            java.util.Iterator r0 = r33.iterator()
        L_0x0b49:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "Null resolution"
            java.lang.String r3 = "Null expectedFrameRateRange"
            if (r1 == 0) goto L_0x0c14
            java.lang.Object r1 = r0.next()
            o9f r1 = (defpackage.o9f) r1
            r4 = r33
            int r5 = r4.indexOf(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = r25
            int r5 = r6.indexOf(r5)
            r7 = r43
            java.lang.Object r5 = r7.get(r5)
            android.util.Size r5 = (android.util.Size) r5
            android.util.Range r8 = defpackage.vb0.f
            x3c r8 = new x3c
            r10 = 1
            r8.<init>(r10)
            if (r5 == 0) goto L_0x0c0e
            r8.b = r5
            android.util.Range r2 = defpackage.vb0.f
            if (r2 == 0) goto L_0x0c08
            r8.o = r2
            r5 = r30
            r8.c = r5
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r8.Y = r2
            r2 = r31
            java.lang.Object r3 = r2.get(r1)
            eu4 r3 = (defpackage.eu4) r3
            r3.getClass()
            r8.c = r3
            mi9 r3 = defpackage.mi9.b()
            aa0 r10 = defpackage.cv1.s0
            boolean r11 = r1.o(r10)
            if (r11 == 0) goto L_0x0bad
            java.lang.Object r11 = r1.h(r10)
            java.lang.Long r11 = (java.lang.Long) r11
            r3.j(r10, r11)
        L_0x0bad:
            aa0 r10 = defpackage.o9f.m0
            boolean r11 = r1.o(r10)
            if (r11 == 0) goto L_0x0bbe
            java.lang.Object r11 = r1.h(r10)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r3.j(r10, r11)
        L_0x0bbe:
            aa0 r10 = defpackage.gu6.b
            boolean r11 = r1.o(r10)
            if (r11 == 0) goto L_0x0bcf
            java.lang.Object r11 = r1.h(r10)
            java.lang.Integer r11 = (java.lang.Integer) r11
            r3.j(r10, r11)
        L_0x0bcf:
            aa0 r10 = defpackage.tu6.z
            boolean r11 = r1.o(r10)
            if (r11 == 0) goto L_0x0be0
            java.lang.Object r11 = r1.h(r10)
            java.lang.Integer r11 = (java.lang.Integer) r11
            r3.j(r10, r11)
        L_0x0be0:
            cv1 r10 = new cv1
            r11 = 8
            r10.<init>((int) r11, (java.lang.Object) r3)
            r8.X = r10
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r45)
            r8.Y = r3
            if (r14 == 0) goto L_0x0bf3
            r8.o = r14
        L_0x0bf3:
            vb0 r3 = r8.c()
            r8 = r23
            r8.put(r1, r3)
            r31 = r2
            r33 = r4
            r30 = r5
            r25 = r6
            r43 = r7
            goto L_0x0b49
        L_0x0c08:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r3)
            throw r0
        L_0x0c0e:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x0c14:
            r7 = r43
            r8 = r23
            r5 = r30
            if (r15 == 0) goto L_0x0c46
            r1 = r24
            r0 = r26
            if (r0 != r1) goto L_0x0c46
            int r0 = r7.size()
            int r1 = r44.size()
            if (r0 != r1) goto L_0x0c46
            r0 = r19
        L_0x0c2e:
            int r1 = r7.size()
            if (r0 >= r1) goto L_0x0c4f
            java.lang.Object r1 = r7.get(r0)
            android.util.Size r1 = (android.util.Size) r1
            r4 = r44
            java.lang.Object r6 = r4.get(r0)
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0c4a
        L_0x0c46:
            r9 = r22
            goto L_0x0ec3
        L_0x0c4a:
            r1 = 1
            int r0 = r0 + r1
            r44 = r4
            goto L_0x0c2e
        L_0x0c4f:
            xv1 r0 = r9.k
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r4 = "Null dynamicRange"
            r6 = 33
            if (r1 >= r6) goto L_0x0c5d
        L_0x0c59:
            r9 = r22
            goto L_0x0e0e
        L_0x0c5d:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r6 = r8.keySet()
            r1.<init>(r6)
            java.util.Iterator r6 = r42.iterator()
        L_0x0c6a:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0c7c
            java.lang.Object r7 = r6.next()
            l90 r7 = (defpackage.l90) r7
            ce3 r7 = r7.f
            r7.getClass()
            goto L_0x0c6a
        L_0x0c7c:
            java.util.Iterator r6 = r1.iterator()
        L_0x0c80:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0c9b
            java.lang.Object r7 = r6.next()
            o9f r7 = (defpackage.o9f) r7
            java.lang.Object r7 = r8.get(r7)
            vb0 r7 = (defpackage.vb0) r7
            r7.getClass()
            ce3 r7 = r7.d
            r7.getClass()
            goto L_0x0c80
        L_0x0c9b:
            android.hardware.camera2.CameraCharacteristics$Key r6 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES
            java.lang.Object r0 = r0.a(r6)
            long[] r0 = (long[]) r0
            if (r0 == 0) goto L_0x0c59
            int r6 = r0.length
            if (r6 != 0) goto L_0x0cab
            goto L_0x0c59
        L_0x0cab:
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            int r7 = r0.length
            r9 = r19
        L_0x0cb3:
            if (r9 >= r7) goto L_0x0cc1
            r10 = r0[r9]
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            r6.add(r10)
            r10 = 1
            int r9 = r9 + r10
            goto L_0x0cb3
        L_0x0cc1:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Iterator r7 = r42.iterator()
            boolean r9 = r7.hasNext()
            r10 = 0
            if (r9 == 0) goto L_0x0cfb
            java.lang.Object r7 = r7.next()
            l90 r7 = (defpackage.l90) r7
            ce3 r9 = r7.f
            aa0 r12 = defpackage.cv1.s0
            boolean r9 = r9.o(r12)
            if (r9 != 0) goto L_0x0ce6
        L_0x0ce2:
            r7 = r19
            r9 = 1
            goto L_0x0cfe
        L_0x0ce6:
            ce3 r7 = r7.f
            java.lang.Object r7 = r7.h(r12)
            java.lang.Long r7 = (java.lang.Long) r7
            long r12 = r7.longValue()
            int r7 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x0cf7
            goto L_0x0ce2
        L_0x0cf7:
            r9 = r19
            r7 = 1
            goto L_0x0cfe
        L_0x0cfb:
            r7 = r19
            r9 = r7
        L_0x0cfe:
            java.util.Iterator r12 = r1.iterator()
        L_0x0d02:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto L_0x0d4d
            java.lang.Object r13 = r12.next()
            o9f r13 = (defpackage.o9f) r13
            aa0 r14 = defpackage.cv1.s0
            boolean r16 = r13.o(r14)
            java.lang.String r10 = "Either all use cases must have non-default stream use case assigned or none should have it"
            if (r16 != 0) goto L_0x0d24
            if (r7 != 0) goto L_0x0d1e
            r9 = 1
            r16 = 0
            goto L_0x0d44
        L_0x0d1e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        L_0x0d24:
            java.lang.Object r11 = r13.h(r14)
            java.lang.Long r11 = (java.lang.Long) r11
            long r13 = r11.longValue()
            r16 = 0
            int r13 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r13 != 0) goto L_0x0d3e
            if (r7 != 0) goto L_0x0d38
            r9 = 1
            goto L_0x0d44
        L_0x0d38:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        L_0x0d3e:
            if (r9 != 0) goto L_0x0d47
            r0.add(r11)
            r7 = 1
        L_0x0d44:
            r10 = r16
            goto L_0x0d02
        L_0x0d47:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r10)
            throw r0
        L_0x0d4d:
            if (r9 != 0) goto L_0x0c59
            java.util.Iterator r0 = r0.iterator()
        L_0x0d53:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0d67
            java.lang.Object r7 = r0.next()
            java.lang.Long r7 = (java.lang.Long) r7
            boolean r7 = r6.contains(r7)
            if (r7 != 0) goto L_0x0d53
            goto L_0x0c59
        L_0x0d67:
            java.util.Iterator r0 = r42.iterator()
        L_0x0d6b:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x0dd4
            java.lang.Object r6 = r0.next()
            l90 r6 = (defpackage.l90) r6
            ce3 r7 = r6.f
            aa0 r9 = defpackage.cv1.s0
            java.lang.Object r9 = r7.h(r9)
            java.lang.Long r9 = (java.lang.Long) r9
            long r9 = r9.longValue()
            cv1 r7 = defpackage.e9e.a(r7, r9)
            if (r7 == 0) goto L_0x0dcf
            android.util.Range r9 = defpackage.vb0.f
            x3c r9 = new x3c
            r10 = 1
            r9.<init>(r10)
            android.util.Size r10 = r6.c
            if (r10 == 0) goto L_0x0dc9
            r9.b = r10
            android.util.Range r10 = defpackage.vb0.f
            if (r10 == 0) goto L_0x0dc3
            r9.o = r10
            r9.c = r5
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r9.Y = r10
            eu4 r10 = r6.d
            if (r10 == 0) goto L_0x0dbd
            r9.c = r10
            r9.X = r7
            android.util.Range r7 = r6.g
            if (r7 == 0) goto L_0x0db3
            r9.o = r7
        L_0x0db3:
            vb0 r7 = r9.c()
            r9 = r22
            r9.put(r6, r7)
            goto L_0x0dd1
        L_0x0dbd:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L_0x0dc3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r3)
            throw r0
        L_0x0dc9:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x0dcf:
            r9 = r22
        L_0x0dd1:
            r22 = r9
            goto L_0x0d6b
        L_0x0dd4:
            r9 = r22
            java.util.Iterator r0 = r1.iterator()
        L_0x0dda:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0ec3
            java.lang.Object r1 = r0.next()
            o9f r1 = (defpackage.o9f) r1
            java.lang.Object r2 = r8.get(r1)
            vb0 r2 = (defpackage.vb0) r2
            ce3 r3 = r2.d
            aa0 r4 = defpackage.cv1.s0
            java.lang.Object r4 = r3.h(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r4 = r4.longValue()
            cv1 r3 = defpackage.e9e.a(r3, r4)
            if (r3 == 0) goto L_0x0dda
            x3c r2 = r2.a()
            r2.X = r3
            vb0 r2 = r2.c()
            r8.put(r1, r2)
            goto L_0x0dda
        L_0x0e0e:
            r0 = r19
        L_0x0e10:
            int r1 = r15.size()
            if (r0 >= r1) goto L_0x0ec3
            java.lang.Object r1 = r15.get(r0)
            xb0 r1 = (defpackage.xb0) r1
            long r6 = r1.c
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r10 = r27
            boolean r1 = r10.containsKey(r1)
            if (r1 == 0) goto L_0x0e82
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r10.get(r1)
            l90 r1 = (defpackage.l90) r1
            ce3 r11 = r1.f
            cv1 r6 = defpackage.e9e.a(r11, r6)
            if (r6 == 0) goto L_0x0e7e
            android.util.Range r7 = defpackage.vb0.f
            x3c r7 = new x3c
            r11 = 1
            r7.<init>(r11)
            android.util.Size r11 = r1.c
            if (r11 == 0) goto L_0x0e78
            r7.b = r11
            android.util.Range r11 = defpackage.vb0.f
            if (r11 == 0) goto L_0x0e72
            r7.o = r11
            r7.c = r5
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            r7.Y = r11
            eu4 r11 = r1.d
            if (r11 == 0) goto L_0x0e6c
            r7.c = r11
            r7.X = r6
            android.util.Range r6 = r1.g
            if (r6 == 0) goto L_0x0e64
            r7.o = r6
        L_0x0e64:
            vb0 r6 = r7.c()
            r9.put(r1, r6)
            goto L_0x0e7e
        L_0x0e6c:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r4)
            throw r0
        L_0x0e72:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r3)
            throw r0
        L_0x0e78:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r2)
            throw r0
        L_0x0e7e:
            r11 = r37
        L_0x0e80:
            r1 = 1
            goto L_0x0eb4
        L_0x0e82:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r11 = r37
            boolean r1 = r11.containsKey(r1)
            if (r1 == 0) goto L_0x0ebb
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r11.get(r1)
            o9f r1 = (defpackage.o9f) r1
            java.lang.Object r12 = r8.get(r1)
            vb0 r12 = (defpackage.vb0) r12
            ce3 r13 = r12.d
            cv1 r6 = defpackage.e9e.a(r13, r6)
            if (r6 == 0) goto L_0x0e80
            x3c r7 = r12.a()
            r7.X = r6
            vb0 r6 = r7.c()
            r8.put(r1, r6)
            goto L_0x0e80
        L_0x0eb4:
            int r0 = r0 + r1
            r27 = r10
            r37 = r11
            goto L_0x0e10
        L_0x0ebb:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r1 = r18
            r0.<init>(r1)
            throw r0
        L_0x0ec3:
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r8, r9)
            return r0
        L_0x0ec9:
            r4 = r33
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            java.lang.String r2 = r9.i
            r1.append(r2)
            java.lang.String r2 = " and Hardware level: "
            r1.append(r2)
            int r2 = r9.m
            r1.append(r2)
            java.lang.String r2 = ". May be the specified resolution is too large and not supported. Existing surfaces: "
            r1.append(r2)
            r2 = r42
            r1.append(r2)
            r2 = r38
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0efb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Failed to find supported resolutions."
            r0.<init>(r1)
            throw r0
        L_0x0f03:
            r2 = r42
            r10 = r7
            r0 = r8
            r4 = r21
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r10)
            java.lang.String r5 = r9.i
            r3.append(r5)
            r3.append(r15)
            r3.append(r2)
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bee.g(int, java.util.ArrayList, java.util.HashMap, boolean, boolean):android.util.Pair");
    }

    public final Pair h(int i2, ArrayList arrayList, List list, ArrayList arrayList2, ArrayList arrayList3, int i3, HashMap hashMap, HashMap hashMap2) {
        int i4;
        ArrayList arrayList4 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            l90 l90 = (l90) it.next();
            arrayList4.add(l90.a);
            if (hashMap != null) {
                hashMap.put(Integer.valueOf(arrayList4.size() - 1), l90);
            }
        }
        for (int i5 = 0; i5 < list.size(); i5++) {
            Size size = (Size) list.get(i5);
            o9f o9f = (o9f) arrayList2.get(((Integer) arrayList3.get(i5)).intValue());
            int inputFormat = o9f.getInputFormat();
            arrayList4.add(xb0.b(i2, inputFormat, size, i(inputFormat)));
            if (hashMap2 != null) {
                hashMap2.put(Integer.valueOf(arrayList4.size() - 1), o9f);
            }
            try {
                i4 = (int) (1.0E9d / ((double) ((StreamConfigurationMap) this.k.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputMinFrameDuration(o9f.getInputFormat(), size)));
            } catch (Exception unused) {
                i4 = 0;
            }
            i3 = Math.min(i3, i4);
        }
        return new Pair(arrayList4, Integer.valueOf(i3));
    }

    public final dc0 i(int i2) {
        StreamConfigurationMap streamConfigurationMap;
        ArrayList arrayList = this.t;
        if (!arrayList.contains(Integer.valueOf(i2))) {
            j((HashMap) this.s.b, msd.e, i2);
            j((HashMap) this.s.d, msd.g, i2);
            Map map = this.s.f;
            xv1 xv1 = this.k;
            Size c2 = c((StreamConfigurationMap) ((fd7) xv1.b().a).a, i2, true);
            if (c2 != null) {
                map.put(Integer.valueOf(i2), c2);
            }
            Map map2 = this.s.g;
            if (Build.VERSION.SDK_INT >= 31 && this.r && (streamConfigurationMap = (StreamConfigurationMap) xv1.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP_MAXIMUM_RESOLUTION)) != null) {
                map2.put(Integer.valueOf(i2), c(streamConfigurationMap, i2, true));
            }
            arrayList.add(Integer.valueOf(i2));
        }
        return this.s;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: android.util.Size} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void j(java.util.HashMap r2, android.util.Size r3, int r4) {
        /*
            r1 = this;
            boolean r0 = r1.p
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            xv1 r1 = r1.k
            c8d r1 = r1.b()
            java.lang.Object r1 = r1.a
            fd7 r1 = (defpackage.fd7) r1
            java.lang.Object r1 = r1.a
            android.hardware.camera2.params.StreamConfigurationMap r1 = (android.hardware.camera2.params.StreamConfigurationMap) r1
            r0 = 0
            android.util.Size r1 = c(r1, r4, r0)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            if (r1 != 0) goto L_0x001f
            goto L_0x0033
        L_0x001f:
            android.util.Size[] r1 = new android.util.Size[]{r3, r1}
            java.util.List r1 = java.util.Arrays.asList(r1)
            x93 r3 = new x93
            r3.<init>(r0)
            java.lang.Object r1 = java.util.Collections.min(r1, r3)
            r3 = r1
            android.util.Size r3 = (android.util.Size) r3
        L_0x0033:
            r2.put(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bee.j(java.util.HashMap, android.util.Size, int):void");
    }
}
