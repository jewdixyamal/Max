package defpackage;

import android.os.ConditionVariable;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: yg3  reason: default package */
public final /* synthetic */ class yg3 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ yg3(av6 av6, String str, zu6 zu6) {
        this.a = 6;
        this.b = av6;
        this.c = str;
        this.o = null;
        this.X = zu6;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02ba  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0312  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0314  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0344  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0361  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0409  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0418  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x0452 A[Catch:{ all -> 0x0457, all -> 0x048b }] */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x045a A[Catch:{ all -> 0x0457, all -> 0x048b }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0466  */
    /* JADX WARNING: Removed duplicated region for block: B:151:0x046b A[SYNTHETIC, Splitter:B:151:0x046b] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0291  */
    private final void a() {
        /*
            r24 = this;
            r0 = r24
            r1 = 1
            java.lang.Object r2 = r0.b
            qye r2 = (defpackage.qye) r2
            java.lang.Object r3 = r0.c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.o
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            java.lang.Object r0 = r0.X
            java.lang.String r0 = (java.lang.String) r0
            wye r5 = r2.a
            boolean r6 = r5.c
            if (r6 == 0) goto L_0x001c
            r0 = r1
            goto L_0x04c0
        L_0x001c:
            yye r6 = r5.a()
            if (r6 == 0) goto L_0x04bd
            boolean r6 = r6.isDisabled()
            if (r6 != 0) goto L_0x04bd
            glc r5 = r2.e
            r6 = 0
            r7 = 32
            if (r0 == 0) goto L_0x0048
            java.lang.CharSequence r0 = defpackage.w9e.b1(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L_0x0048
            int r8 = r0.length()
            if (r8 <= 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r0 = r6
        L_0x0041:
            if (r0 == 0) goto L_0x0048
            java.lang.String r0 = defpackage.w9e.Y0(r7, r0)
            goto L_0x0049
        L_0x0048:
            r0 = r6
        L_0x0049:
            gaa r8 = r2.c
            java.lang.Object r9 = r8.a
            hs r9 = (defpackage.hs) r9
            monitor-enter(r9)
            java.lang.Object r8 = r8.a     // Catch:{ all -> 0x04ba }
            hs r8 = (defpackage.hs) r8     // Catch:{ all -> 0x04ba }
            java.util.List r8 = defpackage.x53.D0(r8)     // Catch:{ all -> 0x04ba }
            monitor-exit(r9)
            wye r2 = r2.a
            qje r2 = r2.g
            r2.getClass()
            kl7 r9 = defpackage.j1e.l()
            java.lang.Object r10 = r2.b
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10
            monitor-enter(r10)
            java.lang.Object r2 = r2.b     // Catch:{ all -> 0x00a5 }
            java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2     // Catch:{ all -> 0x00a5 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x00a5 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00a5 }
        L_0x0075:
            boolean r11 = r2.hasNext()     // Catch:{ all -> 0x00a5 }
            if (r11 == 0) goto L_0x00a8
            java.lang.Object r11 = r2.next()     // Catch:{ all -> 0x00a5 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x00a5 }
            java.lang.Object r12 = r11.getKey()     // Catch:{ all -> 0x00a5 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x00a5 }
            java.lang.Object r11 = r11.getValue()     // Catch:{ all -> 0x00a5 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r13.<init>()     // Catch:{ all -> 0x00a5 }
            r13.append(r12)     // Catch:{ all -> 0x00a5 }
            r12 = 61
            r13.append(r12)     // Catch:{ all -> 0x00a5 }
            r13.append(r11)     // Catch:{ all -> 0x00a5 }
            java.lang.String r11 = r13.toString()     // Catch:{ all -> 0x00a5 }
            r9.add(r11)     // Catch:{ all -> 0x00a5 }
            goto L_0x0075
        L_0x00a5:
            r0 = move-exception
            goto L_0x04b8
        L_0x00a8:
            monitor-exit(r10)
            kl7 r2 = defpackage.j1e.d(r9)
            java.lang.Object r9 = r5.b
            wye r9 = (defpackage.wye) r9
            l7b r10 = r9.b     // Catch:{ Exception -> 0x04c2 }
            java.lang.Object r10 = r10.c     // Catch:{ Exception -> 0x04c2 }
            cqd r10 = (defpackage.cqd) r10     // Catch:{ Exception -> 0x04c2 }
            java.lang.Object r10 = r10.a     // Catch:{ Exception -> 0x04c2 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ Exception -> 0x04c2 }
            if (r10 != 0) goto L_0x00d4
            yye r10 = r9.a()     // Catch:{ Exception -> 0x04c2 }
            if (r10 == 0) goto L_0x00d3
            boolean r11 = r10.isDisabled()     // Catch:{ Exception -> 0x04c2 }
            r11 = r11 ^ r1
            if (r11 == 0) goto L_0x00cb
            goto L_0x00cc
        L_0x00cb:
            r10 = r6
        L_0x00cc:
            if (r10 == 0) goto L_0x00d3
            java.lang.String r10 = r10.appToken()     // Catch:{ Exception -> 0x04c2 }
            goto L_0x00d4
        L_0x00d3:
            r10 = r6
        L_0x00d4:
            if (r10 == 0) goto L_0x04ac
            android.content.Context r11 = r9.d
            java.lang.Class<kye> r12 = defpackage.kye.class
            kye r13 = defpackage.kye.a     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r13 = "INSTANCE"
            java.lang.reflect.Field r13 = r12.getField(r13)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r14 = "getAppToken"
            java.lang.reflect.Method r12 = r12.getMethod(r14, r6)     // Catch:{ Exception -> 0x00f3 }
            java.lang.Object r13 = r13.get(r6)     // Catch:{ Exception -> 0x00f3 }
            java.lang.Object r12 = r12.invoke(r13, r6)     // Catch:{ Exception -> 0x00f3 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Exception -> 0x00f3 }
            goto L_0x0116
        L_0x00f3:
            java.lang.String r12 = r11.getPackageName()
            zye r12 = defpackage.br7.u(r12)
            if (r12 == 0) goto L_0x0102
            java.lang.String r12 = r12.appToken()
            goto L_0x0116
        L_0x0102:
            java.lang.String r12 = "tracer_app_token"
            java.lang.String r11 = defpackage.j47.L(r11, r12)
            if (r11 != 0) goto L_0x010c
        L_0x010a:
            r12 = r6
            goto L_0x0116
        L_0x010c:
            java.lang.String r12 = "0000000000000000000000000000000000000000000"
            boolean r12 = r11.equals(r12)
            if (r12 == 0) goto L_0x0115
            goto L_0x010a
        L_0x0115:
            r12 = r11
        L_0x0116:
            android.content.Context r11 = r9.d
            je7 r13 = r9.f
            java.lang.Object r13 = r13.getValue()
            sye r13 = (defpackage.sye) r13
            java.util.Date r14 = new java.util.Date
            r14.<init>()
            boolean r15 = r2.isEmpty()
            r15 = r15 ^ r1
            if (r15 == 0) goto L_0x012d
            goto L_0x012e
        L_0x012d:
            r2 = r6
        L_0x012e:
            android.content.pm.PackageManager r15 = r11.getPackageManager()
            java.lang.String r7 = r11.getPackageName()
            android.content.pm.PackageInfo r7 = defpackage.ote.u(r15, r7)
            java.lang.String r15 = r11.getPackageName()
            zye r15 = defpackage.br7.u(r15)
            if (r15 == 0) goto L_0x0149
            java.lang.String r15 = r15.buildUuid()
            goto L_0x015c
        L_0x0149:
            java.lang.String r15 = "tracer_mapping_uuid"
            java.lang.String r15 = defpackage.j47.L(r11, r15)
            if (r15 != 0) goto L_0x0153
            r15 = r6
            goto L_0x015c
        L_0x0153:
            java.lang.String r6 = "00000000-0000-0000-0000-000000000000"
            boolean r6 = r15.equals(r6)
            if (r6 == 0) goto L_0x015c
            r15 = 0
        L_0x015c:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            java.lang.String r1 = r7.packageName
            r17 = r3
            java.lang.String r3 = "packageName"
            r6.put((java.lang.String) r3, (java.lang.Object) r1)
            java.lang.String r1 = r7.versionName
            r18 = r12
            java.lang.String r12 = "versionName"
            r6.put((java.lang.String) r12, (java.lang.Object) r1)
            r1 = r9
            r19 = r10
            long r9 = r7.getLongVersionCode()
            java.lang.String r7 = "versionCode"
            r6.put((java.lang.String) r7, (long) r9)
            java.lang.String r7 = "buildUuid"
            r6.put((java.lang.String) r7, (java.lang.Object) r15)
            java.lang.String r9 = defpackage.rbd.a
            java.lang.String r10 = "sessionUuid"
            r6.put((java.lang.String) r10, (java.lang.Object) r9)
            java.lang.String r9 = android.os.Build.MODEL
            java.lang.String r10 = "device"
            r6.put((java.lang.String) r10, (java.lang.Object) r9)
            java.lang.String r15 = defpackage.dy7.u(r11)
            r20 = r1
            java.lang.String r1 = "deviceId"
            r6.put((java.lang.String) r1, (java.lang.Object) r15)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r15 = "vendor"
            r6.put((java.lang.String) r15, (java.lang.Object) r1)
            int r15 = android.os.Build.VERSION.SDK_INT
            r21 = r5
            java.lang.String r5 = java.lang.String.valueOf(r15)
            r22 = r8
            java.lang.String r8 = "osVersion"
            r6.put((java.lang.String) r8, (java.lang.Object) r5)
            android.app.ActivityManager$RunningAppProcessInfo r5 = new android.app.ActivityManager$RunningAppProcessInfo
            r5.<init>()
            android.app.ActivityManager.getMyMemoryState(r5)
            int r5 = r5.importance
            r8 = 100
            r23 = r4
            r4 = 200(0xc8, float:2.8E-43)
            if (r5 == r8) goto L_0x01cc
            if (r5 != r4) goto L_0x01c8
            goto L_0x01cc
        L_0x01c8:
            r5 = 1
            r16 = 0
            goto L_0x01cf
        L_0x01cc:
            r5 = 1
            r16 = 1
        L_0x01cf:
            r8 = r16 ^ 1
            java.lang.String r5 = "inBackground"
            r6.put((java.lang.String) r5, (boolean) r8)
            android.content.ContentResolver r5 = r11.getContentResolver()
            java.lang.String r8 = "android_id"
            java.lang.String r5 = android.provider.Settings.Secure.getString(r5, r8)
            java.lang.String r8 = android.os.Build.PRODUCT
            java.lang.String r11 = "sdk"
            boolean r11 = r11.equals(r8)
            if (r11 != 0) goto L_0x01f7
            java.lang.String r11 = "google_sdk"
            boolean r8 = r11.equals(r8)
            if (r8 != 0) goto L_0x01f7
            if (r5 != 0) goto L_0x01f5
            goto L_0x01f7
        L_0x01f5:
            r5 = 0
            goto L_0x01f8
        L_0x01f7:
            r5 = 1
        L_0x01f8:
            java.lang.String r8 = android.os.Build.TAGS
            if (r5 != 0) goto L_0x0209
            if (r8 == 0) goto L_0x0209
            java.lang.String r11 = "test-keys"
            r4 = 0
            boolean r8 = defpackage.w9e.p0(r8, r11, r4)
            if (r8 == 0) goto L_0x0209
        L_0x0207:
            r4 = 1
            goto L_0x0228
        L_0x0209:
            java.io.File r4 = new java.io.File
            java.lang.String r8 = "/system/app/Superuser.apk"
            r4.<init>(r8)
            boolean r4 = r4.exists()
            if (r4 == 0) goto L_0x0217
            goto L_0x0207
        L_0x0217:
            java.io.File r4 = new java.io.File
            java.lang.String r8 = "/system/xbin/su"
            r4.<init>(r8)
            if (r5 != 0) goto L_0x0227
            boolean r4 = r4.exists()
            if (r4 == 0) goto L_0x0227
            goto L_0x0207
        L_0x0227:
            r4 = 0
        L_0x0228:
            java.lang.String r5 = "isRooted"
            r6.put((java.lang.String) r5, (boolean) r4)
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.text.SimpleDateFormat r5 = new java.text.SimpleDateFormat
            java.lang.String r8 = "yyyy-MM-dd'T'HH:mm:ssXXX"
            java.util.Locale r11 = java.util.Locale.US
            r5.<init>(r8, r11)
            java.lang.String r5 = r5.format(r14)
            java.lang.String r8 = "date"
            r4.put((java.lang.String) r8, (java.lang.Object) r5)
            java.lang.String r5 = "board"
            java.lang.String r8 = android.os.Build.BOARD
            r4.put((java.lang.String) r5, (java.lang.Object) r8)
            java.lang.String r5 = "brand"
            java.lang.String r8 = android.os.Build.BRAND
            r4.put((java.lang.String) r5, (java.lang.Object) r8)
            java.lang.String r5 = ", "
            java.lang.String[] r8 = android.os.Build.SUPPORTED_ABIS
            java.lang.String r5 = android.text.TextUtils.join(r5, r8)
            java.lang.String r8 = "cpuABI"
            r4.put((java.lang.String) r8, (java.lang.Object) r5)
            java.lang.String r5 = android.os.Build.DEVICE
            r4.put((java.lang.String) r10, (java.lang.Object) r5)
            java.lang.String r5 = "manufacturer"
            r4.put((java.lang.String) r5, (java.lang.Object) r1)
            java.lang.String r1 = "model"
            r4.put((java.lang.String) r1, (java.lang.Object) r9)
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()
            int r1 = r1.availableProcessors()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r5 = "cpuCount"
            r4.put((java.lang.String) r5, (java.lang.Object) r1)
            java.lang.String r1 = java.lang.String.valueOf(r15)
            java.lang.String r5 = "osVersionSdkInt"
            r4.put((java.lang.String) r5, (java.lang.Object) r1)
            java.lang.String r1 = "osVersionRelease"
            java.lang.String r5 = android.os.Build.VERSION.RELEASE
            r4.put((java.lang.String) r1, (java.lang.Object) r5)
            if (r0 == 0) goto L_0x0296
            java.lang.String r1 = "issueKey"
            r4.put((java.lang.String) r1, (java.lang.Object) r0)
        L_0x0296:
            java.lang.String r0 = "properties"
            r6.put((java.lang.String) r0, (java.lang.Object) r4)
            if (r2 == 0) goto L_0x02ba
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r1 = 0
            java.util.ListIterator r1 = r2.listIterator(r1)
        L_0x02a7:
            r2 = r1
            il7 r2 = (defpackage.il7) r2
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x02bb
            java.lang.Object r2 = r2.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.put((java.lang.Object) r2)
            goto L_0x02a7
        L_0x02ba:
            r0 = 0
        L_0x02bb:
            java.lang.String r1 = "tags"
            r6.put((java.lang.String) r1, (java.lang.Object) r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r13.a
            r0.put((java.lang.String) r3, (java.lang.Object) r1)
            java.lang.String r1 = r13.b
            r0.put((java.lang.String) r12, (java.lang.Object) r1)
            java.lang.String r1 = r13.c
            r0.put((java.lang.String) r7, (java.lang.Object) r1)
            java.lang.String r1 = "environment"
            java.lang.String r2 = r13.d
            r0.put((java.lang.String) r1, (java.lang.Object) r2)
            java.lang.String r1 = "libraryInfo"
            r6.put((java.lang.String) r1, (java.lang.Object) r0)
            java.lang.String r0 = r6.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r4 = r23
            defpackage.ju0.f(r4, r1)
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r2 = defpackage.a52.a
            byte[] r1 = r1.getBytes(r2)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream
            r4.<init>(r3)
            r4.write(r1)
            r4.close()
            byte[] r1 = r3.toByteArray()
            boolean r3 = r22.isEmpty()
            if (r3 == 0) goto L_0x0314
            r3 = 0
            goto L_0x0327
        L_0x0314:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.Iterator r4 = r22.iterator()
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L_0x04a3
            java.lang.String r3 = r3.toString()
        L_0x0327:
            if (r3 == 0) goto L_0x0344
            byte[] r2 = r3.getBytes(r2)
            java.io.ByteArrayOutputStream r3 = new java.io.ByteArrayOutputStream
            r3.<init>()
            java.util.zip.GZIPOutputStream r4 = new java.util.zip.GZIPOutputStream
            r4.<init>(r3)
            r4.write(r2)
            r4.close()
            byte[] r2 = r3.toByteArray()
            r3 = r21
            goto L_0x0347
        L_0x0344:
            r3 = r21
            r2 = 0
        L_0x0347:
            java.lang.Object r4 = r3.b
            wye r4 = (defpackage.wye) r4
            x67 r4 = r4.h
            khe r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            js4 r4 = (defpackage.js4) r4
            java.util.List r4 = r4.d()
            boolean r5 = r4.isEmpty()
            r6 = 1
            r5 = r5 ^ r6
            if (r5 == 0) goto L_0x0363
            r5 = r4
            goto L_0x0364
        L_0x0363:
            r5 = 0
        L_0x0364:
            if (r5 == 0) goto L_0x03a0
            org.json.JSONArray r6 = new org.json.JSONArray
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x036f:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0399
            java.lang.Object r7 = r5.next()
            ls4 r7 = (defpackage.ls4) r7
            org.json.JSONObject r8 = new org.json.JSONObject
            r8.<init>()
            java.lang.String r9 = r7.a
            java.lang.String r10 = "event"
            r8.put((java.lang.String) r10, (java.lang.Object) r9)
            java.lang.String r9 = "reason"
            java.lang.String r10 = r7.b
            r8.put((java.lang.String) r9, (java.lang.Object) r10)
            java.lang.String r9 = "count"
            int r7 = r7.c
            r8.put((java.lang.String) r9, (int) r7)
            r6.put((java.lang.Object) r8)
            goto L_0x036f
        L_0x0399:
            java.lang.String r5 = r6.toString()
            r9 = r20
            goto L_0x03a3
        L_0x03a0:
            r9 = r20
            r5 = 0
        L_0x03a3:
            l7b r6 = r9.b
            java.lang.Object r6 = r6.b
            cqd r6 = (defpackage.cqd) r6
            java.lang.Object r6 = r6.a
            java.lang.String r6 = (java.lang.String) r6
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.String r7 = "api/crash/upload"
            android.net.Uri$Builder r6 = r6.appendEncodedPath(r7)
            java.lang.String r7 = "crashToken"
            r10 = r19
            android.net.Uri$Builder r6 = r6.appendQueryParameter(r7, r10)
            if (r18 == 0) goto L_0x03cc
            java.lang.String r7 = "crashHostAppToken"
            r12 = r18
            r6.appendQueryParameter(r7, r12)
        L_0x03cc:
            java.lang.String r6 = r6.toString()
            ey1 r7 = new ey1
            r8 = 17
            r7.<init>((int) r8)
            java.lang.String r8 = "type"
            java.lang.String r9 = "NON_FATAL"
            r7.f(r8, r9)
            java.lang.String r8 = "format"
            java.lang.String r9 = "JVM_STACKTRACE"
            r7.f(r8, r9)
            java.lang.String r8 = "severity"
            r9 = r17
            r7.f(r8, r9)
            rh5 r8 = new rh5
            java.lang.String r9 = "application/octet-stream"
            r10 = 1
            r8.<init>(r9, r10, r1)
            java.lang.String r1 = "stackTrace"
            java.lang.String r10 = "stack.gzip"
            r7.e(r1, r10, r8)
            java.lang.String r1 = "application/json; charset=utf-8"
            rh5 r0 = defpackage.b46.o(r1, r0)
            java.lang.String r1 = "uploadBean"
            r8 = 0
            r7.e(r1, r8, r0)
            if (r2 == 0) goto L_0x0416
            rh5 r0 = new rh5
            r1 = 1
            r0.<init>(r9, r1, r2)
            java.lang.String r1 = "logs"
            java.lang.String r2 = "logs.gzip"
            r7.e(r1, r2, r0)
        L_0x0416:
            if (r5 == 0) goto L_0x0425
            java.lang.String r0 = "application/json"
            rh5 r0 = defpackage.b46.o(r0, r5)
            java.lang.String r1 = "drops"
            java.lang.String r2 = "drops.json"
            r7.e(r1, r2, r0)
        L_0x0425:
            bw4 r0 = r7.g()
            bkb r1 = new bkb
            r1.<init>((java.lang.String) r6, (defpackage.qq6) r0)
            java.lang.Object r0 = r3.c     // Catch:{ IOException -> 0x0491 }
            jo7 r0 = (defpackage.jo7) r0     // Catch:{ IOException -> 0x0491 }
            java.lang.Object r0 = r0.c     // Catch:{ IOException -> 0x0491 }
            khe r0 = (defpackage.khe) r0     // Catch:{ IOException -> 0x0491 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ IOException -> 0x0491 }
            wq6 r0 = (defpackage.wq6) r0     // Catch:{ IOException -> 0x0491 }
            rq6 r1 = r0.b(r1)     // Catch:{ IOException -> 0x0491 }
            int r0 = r1.b     // Catch:{ all -> 0x0457 }
            java.lang.Object r2 = r1.c     // Catch:{ all -> 0x0457 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0457 }
            java.io.Closeable r5 = r1.o     // Catch:{ all -> 0x0457 }
            rh5 r5 = (defpackage.rh5) r5     // Catch:{ all -> 0x0457 }
            if (r5 == 0) goto L_0x045a
            java.lang.Object r5 = r5.c     // Catch:{ all -> 0x0457 }
            byte[] r5 = (byte[]) r5     // Catch:{ all -> 0x0457 }
            if (r5 == 0) goto L_0x045a
            java.lang.String r5 = defpackage.eae.j0(r5)     // Catch:{ all -> 0x0457 }
            goto L_0x045b
        L_0x0457:
            r0 = move-exception
            r2 = r0
            goto L_0x048a
        L_0x045a:
            r5 = 0
        L_0x045b:
            java.lang.Object r6 = r3.o     // Catch:{ all -> 0x0457 }
            h7b r6 = (defpackage.h7b) r6     // Catch:{ all -> 0x0457 }
            r6.n(r5)     // Catch:{ all -> 0x0457 }
            r5 = 200(0xc8, float:2.8E-43)
            if (r0 != r5) goto L_0x046b
            r5 = 0
            defpackage.v3c.i(r1, r5)     // Catch:{ IOException -> 0x0491 }
            goto L_0x04c2
        L_0x046b:
            java.io.IOException r5 = new java.io.IOException     // Catch:{ all -> 0x0457 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0457 }
            r6.<init>()     // Catch:{ all -> 0x0457 }
            java.lang.String r7 = "HTTP "
            r6.append(r7)     // Catch:{ all -> 0x0457 }
            r6.append(r0)     // Catch:{ all -> 0x0457 }
            r0 = 32
            r6.append(r0)     // Catch:{ all -> 0x0457 }
            r6.append(r2)     // Catch:{ all -> 0x0457 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0457 }
            r5.<init>(r0)     // Catch:{ all -> 0x0457 }
            throw r5     // Catch:{ all -> 0x0457 }
        L_0x048a:
            throw r2     // Catch:{ all -> 0x048b }
        L_0x048b:
            r0 = move-exception
            r5 = r0
            defpackage.v3c.i(r1, r2)     // Catch:{ IOException -> 0x0491 }
            throw r5     // Catch:{ IOException -> 0x0491 }
        L_0x0491:
            java.lang.Object r0 = r3.b
            wye r0 = (defpackage.wye) r0
            x67 r0 = r0.h
            khe r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            js4 r0 = (defpackage.js4) r0
            r0.a(r4)
            goto L_0x04c2
        L_0x04a3:
            java.lang.Object r0 = r4.next()
            defpackage.au1.r(r0)
            r0 = 0
            throw r0
        L_0x04ac:
            java.lang.String r0 = "No lib token"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x04c2 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x04c2 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x04c2 }
            throw r1     // Catch:{ Exception -> 0x04c2 }
        L_0x04b8:
            monitor-exit(r10)
            throw r0
        L_0x04ba:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x04bd:
            r0 = r1
            r5.c = r0
        L_0x04c0:
            r2.f = r0
        L_0x04c2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg3.a():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008c, code lost:
        r6 = (byte[]) r6.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00af, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r0 = defpackage.kye.a;
        defpackage.kye.b().a((java.util.List) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c5, code lost:
        r4.open();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c8, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00b8 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0222 A[SYNTHETIC, Splitter:B:106:0x0222] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r0 = r20
            r1 = 0
            r3 = 0
            int r4 = r0.a
            switch(r4) {
                case 0: goto L_0x0418;
                case 1: goto L_0x03a6;
                case 2: goto L_0x0385;
                case 3: goto L_0x035b;
                case 4: goto L_0x033a;
                case 5: goto L_0x02dc;
                case 6: goto L_0x0287;
                case 7: goto L_0x0243;
                case 8: goto L_0x0226;
                case 9: goto L_0x0138;
                case 10: goto L_0x0111;
                case 11: goto L_0x00f5;
                case 12: goto L_0x00df;
                case 13: goto L_0x00c9;
                case 14: goto L_0x0066;
                case 15: goto L_0x0050;
                case 16: goto L_0x0027;
                case 17: goto L_0x0023;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r1 = r0.b
            android.os.Handler r1 = (android.os.Handler) r1
            r1.removeCallbacksAndMessages(r3)
            java.lang.Object r1 = r0.c
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r2 = r0.o
            android.view.View$OnLayoutChangeListener r2 = (android.view.View.OnLayoutChangeListener) r2
            r1.removeOnLayoutChangeListener(r2)
            java.lang.Object r0 = r0.X
            m56 r0 = (defpackage.m56) r0
            r0.invoke(r1)
            return
        L_0x0023:
            r20.a()
            return
        L_0x0027:
            java.lang.Object r1 = r0.b
            hre r1 = (defpackage.hre) r1
            u00 r2 = r1.l
            if (r2 == 0) goto L_0x0034
            r2.f()
            r1.l = r3
        L_0x0034:
            java.lang.Object r2 = r0.c
            android.view.Surface r2 = (android.view.Surface) r2
            r2.release()
            oq1 r2 = r1.g
            java.lang.Object r4 = r0.o
            bm7 r4 = (defpackage.bm7) r4
            if (r2 != r4) goto L_0x0045
            r1.g = r3
        L_0x0045:
            see r2 = r1.h
            java.lang.Object r0 = r0.X
            see r0 = (defpackage.see) r0
            if (r2 != r0) goto L_0x004f
            r1.h = r3
        L_0x004f:
            return
        L_0x0050:
            java.lang.Object r1 = r0.c
            java.util.List r1 = (java.util.List) r1
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r2 = r0.b
            ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl r2 = (ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl) r2
            java.lang.Object r3 = r0.o
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r0.X
            k56 r0 = (defpackage.k56) r0
            ru.ok.android.externcalls.sdk.stereo.internal.StereoRoomManagerImpl.resolveIdsAndThen$lambda$10(r2, r1, r3, r0)
            return
        L_0x0066:
            java.lang.Object r1 = r0.b
            bkb r1 = (defpackage.bkb) r1
            java.lang.Object r2 = r0.c
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r4 = r0.o
            android.os.ConditionVariable r4 = (android.os.ConditionVariable) r4
            java.lang.Object r0 = r0.X
            kbd r0 = (defpackage.kbd) r0
            kye r5 = defpackage.kye.a     // Catch:{ Exception -> 0x00b8 }
            khe r5 = defpackage.kye.h     // Catch:{ Exception -> 0x00b8 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ Exception -> 0x00b8 }
            wq6 r5 = (defpackage.wq6) r5     // Catch:{ Exception -> 0x00b8 }
            rq6 r1 = r5.b(r1)     // Catch:{ Exception -> 0x00b8 }
            int r5 = r1.b     // Catch:{ all -> 0x0097 }
            java.io.Closeable r6 = r1.o     // Catch:{ all -> 0x0097 }
            rh5 r6 = (defpackage.rh5) r6     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x009a
            java.lang.Object r6 = r6.c     // Catch:{ all -> 0x0097 }
            byte[] r6 = (byte[]) r6     // Catch:{ all -> 0x0097 }
            if (r6 == 0) goto L_0x009a
            java.lang.String r6 = defpackage.eae.j0(r6)     // Catch:{ all -> 0x0097 }
            goto L_0x009b
        L_0x0097:
            r0 = move-exception
            r3 = r0
            goto L_0x00b1
        L_0x009a:
            r6 = r3
        L_0x009b:
            java.lang.String r7 = "CRASH_FREE"
            defpackage.oz7.l(r6, r7, r3)     // Catch:{ all -> 0x0097 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 == r6) goto L_0x00a5
            goto L_0x00a8
        L_0x00a5:
            r0.a()     // Catch:{ all -> 0x0097 }
        L_0x00a8:
            defpackage.v3c.i(r1, r3)     // Catch:{ Exception -> 0x00b8 }
        L_0x00ab:
            r4.open()
            goto L_0x00c4
        L_0x00af:
            r0 = move-exception
            goto L_0x00c5
        L_0x00b1:
            throw r3     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            r5 = r0
            defpackage.v3c.i(r1, r3)     // Catch:{ Exception -> 0x00b8 }
            throw r5     // Catch:{ Exception -> 0x00b8 }
        L_0x00b8:
            kye r0 = defpackage.kye.a     // Catch:{ all -> 0x00af }
            js4 r0 = defpackage.kye.b()     // Catch:{ all -> 0x00af }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x00af }
            r0.a(r2)     // Catch:{ all -> 0x00af }
            goto L_0x00ab
        L_0x00c4:
            return
        L_0x00c5:
            r4.open()
            throw r0
        L_0x00c9:
            java.lang.Object r1 = r0.b
            jn r1 = (defpackage.jn) r1
            int r1 = r1.b
            java.lang.Object r2 = r0.c
            ik8 r2 = (defpackage.ik8) r2
            java.lang.Object r3 = r0.o
            yj8 r3 = (defpackage.yj8) r3
            java.lang.Object r0 = r0.X
            pc8 r0 = (defpackage.pc8) r0
            r2.A(r1, r3, r0)
            return
        L_0x00df:
            java.lang.Object r1 = r0.b
            gk8 r1 = (defpackage.gk8) r1
            int r1 = r1.b
            java.lang.Object r2 = r0.c
            hk8 r2 = (defpackage.hk8) r2
            java.lang.Object r3 = r0.o
            xj8 r3 = (defpackage.xj8) r3
            java.lang.Object r0 = r0.X
            pc8 r0 = (defpackage.pc8) r0
            r2.F(r1, r3, r0)
            return
        L_0x00f5:
            java.lang.Object r1 = r0.b
            ii8 r1 = (defpackage.ii8) r1
            boolean r2 = r1.i()
            if (r2 != 0) goto L_0x0110
            x4b r1 = r1.s
            java.lang.Object r2 = r0.o
            oh8 r2 = (defpackage.oh8) r2
            java.lang.Object r3 = r0.X
            java.util.List r3 = (java.util.List) r3
            java.lang.Object r0 = r0.c
            qj8 r0 = (defpackage.qj8) r0
            r0.b(r1, r2, r3)
        L_0x0110:
            return
        L_0x0111:
            java.lang.Object r1 = r0.o
            pj3 r1 = (defpackage.pj3) r1
            java.lang.Object r2 = r0.X
            bm7 r2 = (defpackage.bm7) r2
            java.lang.Object r4 = r0.b
            ii8 r4 = (defpackage.ii8) r4
            boolean r4 = r4.i()
            java.lang.Object r0 = r0.c
            r5 = r0
            ccd r5 = (defpackage.ccd) r5
            if (r4 == 0) goto L_0x012c
            r5.l(r3)
            goto L_0x0137
        L_0x012c:
            r1.accept(r2)     // Catch:{ all -> 0x0133 }
            r5.l(r3)     // Catch:{ all -> 0x0133 }
            goto L_0x0137
        L_0x0133:
            r0 = move-exception
            r5.m(r0)
        L_0x0137:
            return
        L_0x0138:
            java.lang.Object r3 = r0.c
            oh8 r3 = (defpackage.oh8) r3
            java.lang.Object r4 = r0.o
            ii8 r4 = (defpackage.ii8) r4
            java.lang.Object r5 = r0.X
            kr6 r5 = (defpackage.kr6) r5
            java.lang.Object r0 = r0.b
            r9 = r0
            sj8 r9 = (defpackage.sj8) r9
            m5d r0 = r9.e
            java.lang.String r6 = "Controller "
            java.util.Set r7 = r9.f     // Catch:{ all -> 0x0189 }
            r7.remove(r3)     // Catch:{ all -> 0x0189 }
            boolean r7 = r4.i()     // Catch:{ all -> 0x0189 }
            if (r7 == 0) goto L_0x015d
        L_0x0158:
            r5.c(r1)     // Catch:{ RemoteException -> 0x021f }
            goto L_0x021f
        L_0x015d:
            nh8 r7 = r3.d     // Catch:{ all -> 0x0189 }
            oj8 r7 = (defpackage.oj8) r7     // Catch:{ all -> 0x0189 }
            defpackage.fm9.l(r7)     // Catch:{ all -> 0x0189 }
            kr6 r7 = r7.a     // Catch:{ all -> 0x0189 }
            android.os.IBinder r7 = r7.asBinder()     // Catch:{ all -> 0x0189 }
            mh8 r8 = r4.l(r3)     // Catch:{ all -> 0x0189 }
            boolean r10 = r0.E(r3)     // Catch:{ all -> 0x0189 }
            if (r10 == 0) goto L_0x018d
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0189 }
            r10.<init>(r6)     // Catch:{ all -> 0x0189 }
            r10.append(r3)     // Catch:{ all -> 0x0189 }
            java.lang.String r6 = " has sent connection request multiple times"
            r10.append(r6)     // Catch:{ all -> 0x0189 }
            java.lang.String r6 = r10.toString()     // Catch:{ all -> 0x0189 }
            defpackage.z04.c0(r6)     // Catch:{ all -> 0x0189 }
            goto L_0x018d
        L_0x0189:
            r0 = move-exception
            r2 = r1
            goto L_0x0220
        L_0x018d:
            z9d r6 = r8.a     // Catch:{ all -> 0x0189 }
            k3b r10 = r8.b     // Catch:{ all -> 0x0189 }
            r0.p(r7, r3, r6, r10)     // Catch:{ all -> 0x0189 }
            cd6 r0 = r0.B(r3)     // Catch:{ all -> 0x0189 }
            if (r0 != 0) goto L_0x01a0
            java.lang.String r0 = "Ignoring connection request from unknown controller info"
            defpackage.z04.c0(r0)     // Catch:{ all -> 0x0189 }
            goto L_0x0158
        L_0x01a0:
            x4b r6 = r4.s     // Catch:{ all -> 0x0189 }
            m4b r7 = r6.o()     // Catch:{ all -> 0x0189 }
            m4b r17 = r9.G0(r7)     // Catch:{ all -> 0x0189 }
            uh3 r15 = new uh3     // Catch:{ all -> 0x0189 }
            android.app.PendingIntent r10 = r4.t     // Catch:{ all -> 0x0189 }
            zw6 r7 = r8.c     // Catch:{ all -> 0x0189 }
            if (r7 == 0) goto L_0x01b4
        L_0x01b2:
            r11 = r7
            goto L_0x01b7
        L_0x01b4:
            zw6 r7 = r4.A     // Catch:{ all -> 0x0189 }
            goto L_0x01b2
        L_0x01b7:
            z9d r12 = r8.a     // Catch:{ all -> 0x0189 }
            k3b r13 = r8.b     // Catch:{ all -> 0x0189 }
            k3b r14 = r6.s()     // Catch:{ all -> 0x0189 }
            obd r6 = r4.j     // Catch:{ all -> 0x0189 }
            nbd r6 = r6.a     // Catch:{ all -> 0x0189 }
            android.os.Bundle r16 = r6.getExtras()     // Catch:{ all -> 0x0189 }
            android.os.Bundle r8 = r4.B     // Catch:{ all -> 0x0189 }
            r7 = 1004001300(0x3bd7d814, float:0.006587038)
            r18 = 4
            r6 = r15
            r19 = r8
            r8 = r18
            r2 = r15
            r15 = r16
            r16 = r19
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0189 }
            boolean r6 = r4.i()     // Catch:{ all -> 0x0189 }
            if (r6 == 0) goto L_0x01e3
            goto L_0x0158
        L_0x01e3:
            int r0 = r0.i()     // Catch:{ RemoteException -> 0x0206 }
            boolean r6 = r5 instanceof defpackage.ga8     // Catch:{ RemoteException -> 0x0206 }
            if (r6 == 0) goto L_0x01fb
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ RemoteException -> 0x0206 }
            r6.<init>()     // Catch:{ RemoteException -> 0x0206 }
            th3 r7 = new th3     // Catch:{ RemoteException -> 0x0206 }
            r7.<init>(r2)     // Catch:{ RemoteException -> 0x0206 }
            java.lang.String r2 = defpackage.uh3.w     // Catch:{ RemoteException -> 0x0206 }
            r6.putBinder(r2, r7)     // Catch:{ RemoteException -> 0x0206 }
            goto L_0x0201
        L_0x01fb:
            int r6 = r3.c     // Catch:{ RemoteException -> 0x0206 }
            android.os.Bundle r6 = r2.b(r6)     // Catch:{ RemoteException -> 0x0206 }
        L_0x0201:
            r5.r(r0, r6)     // Catch:{ RemoteException -> 0x0206 }
            r2 = 1
            goto L_0x0207
        L_0x0206:
            r2 = r1
        L_0x0207:
            if (r2 == 0) goto L_0x021b
            boolean r0 = r4.z     // Catch:{ all -> 0x0214 }
            if (r0 == 0) goto L_0x0216
            boolean r0 = defpackage.ii8.j(r3)     // Catch:{ all -> 0x0214 }
            if (r0 == 0) goto L_0x0216
            goto L_0x021b
        L_0x0214:
            r0 = move-exception
            goto L_0x0220
        L_0x0216:
            oz7 r0 = r4.e     // Catch:{ all -> 0x0214 }
            r0.getClass()     // Catch:{ all -> 0x0214 }
        L_0x021b:
            if (r2 != 0) goto L_0x021f
            goto L_0x0158
        L_0x021f:
            return
        L_0x0220:
            if (r2 != 0) goto L_0x0225
            r5.c(r1)     // Catch:{ RemoteException -> 0x0225 }
        L_0x0225:
            throw r0
        L_0x0226:
            java.lang.Object r1 = r0.b
            cj8 r1 = (defpackage.cj8) r1
            ii8 r1 = r1.u0
            java.lang.Object r2 = r0.o
            oh8 r2 = (defpackage.oh8) r2
            mh8 r1 = r1.l(r2)
            java.lang.Object r2 = r0.c
            java.util.concurrent.atomic.AtomicReference r2 = (java.util.concurrent.atomic.AtomicReference) r2
            r2.set(r1)
            java.lang.Object r0 = r0.X
            ae3 r0 = (defpackage.ae3) r0
            r0.g()
            return
        L_0x0243:
            java.lang.Object r2 = r0.c
            bm7 r2 = (defpackage.bm7) r2
            java.lang.Object r3 = r0.o
            pd8 r3 = (defpackage.pd8) r3
            java.lang.Object r4 = r0.X
            qh8 r4 = (defpackage.qh8) r4
            java.lang.Object r0 = r0.b
            ue r0 = (defpackage.ue) r0
            r0.getClass()
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x027f }
            r6 = 0
            java.lang.Object r2 = r2.get(r6, r5)     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x027f }
            a98 r2 = (defpackage.a98) r2     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x027f }
            a98 r5 = r0.b(r4)     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x027f }
            if (r5 == 0) goto L_0x0278
            mue r6 = r5.x0()     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x027f }
            boolean r6 = r6.q()     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x027f }
            if (r6 != 0) goto L_0x0278
            int r5 = r5.getPlaybackState()     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x027f }
            r6 = 1
            if (r5 == r6) goto L_0x0278
            r1 = 1
        L_0x0278:
            r3.s(r1)     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x027f }
            r2.z(r3)     // Catch:{ InterruptedException | CancellationException | ExecutionException | TimeoutException -> 0x027f }
            goto L_0x0286
        L_0x027f:
            java.lang.Object r0 = r0.c
            bj8 r0 = (defpackage.bj8) r0
            r0.h(r4)
        L_0x0286:
            return
        L_0x0287:
            java.lang.Object r1 = r0.c
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r0.o
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r0.X
            zu6 r3 = (defpackage.zu6) r3
            java.lang.Object r0 = r0.b
            av6 r0 = (defpackage.av6) r0
            r0.getClass()
            boolean r4 = defpackage.pag.l(r2)     // Catch:{ all -> 0x02d8 }
            if (r4 == 0) goto L_0x02ac
            if (r3 == 0) goto L_0x02db
            vs5 r1 = new vs5     // Catch:{ all -> 0x02d8 }
            r4 = 6
            r1.<init>(r3, r4, r2)     // Catch:{ all -> 0x02d8 }
            r0.c(r1)     // Catch:{ all -> 0x02d8 }
            goto L_0x02db
        L_0x02ac:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x02d8 }
            if (r2 == 0) goto L_0x02b6
            r0.b(r3)     // Catch:{ all -> 0x02d8 }
            goto L_0x02db
        L_0x02b6:
            if (r3 == 0) goto L_0x02c1
            wu6 r2 = new wu6     // Catch:{ all -> 0x02d8 }
            r4 = 1
            r2.<init>(r3, r4)     // Catch:{ all -> 0x02d8 }
            r0.c(r2)     // Catch:{ all -> 0x02d8 }
        L_0x02c1:
            wv6 r1 = defpackage.wv6.b(r1)     // Catch:{ all -> 0x02d8 }
            iv6 r2 = defpackage.s36.o()     // Catch:{ all -> 0x02d8 }
            g0 r2 = r2.c(r1)     // Catch:{ all -> 0x02d8 }
            xu6 r4 = new xu6     // Catch:{ all -> 0x02d8 }
            r4.<init>(r0, r3, r1)     // Catch:{ all -> 0x02d8 }
            qq1 r1 = defpackage.qq1.a     // Catch:{ all -> 0x02d8 }
            r2.m(r4, r1)     // Catch:{ all -> 0x02d8 }
            goto L_0x02db
        L_0x02d8:
            r0.b(r3)
        L_0x02db:
            return
        L_0x02dc:
            long r13 = java.lang.System.nanoTime()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            java.lang.Object r3 = r0.b
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            int r2 = defpackage.z53.S(r3, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r3.iterator()
        L_0x02f3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0305
            java.lang.Object r3 = r2.next()
            iy5 r3 = (defpackage.iy5) r3
            jy5 r3 = r3.b
            r1.add(r3)
            goto L_0x02f3
        L_0x0305:
            java.util.concurrent.ForkJoinTask.invokeAll(r1)
            long r1 = java.lang.System.nanoTime()
            java.lang.Object r3 = r0.c
            k56 r3 = (defpackage.k56) r3
            r3.invoke()
            java.lang.Object r3 = r0.o
            ly5 r3 = (defpackage.ly5) r3
            java.util.concurrent.ConcurrentSkipListSet r3 = r3.a
            l38 r4 = new l38
            long r7 = r1 - r13
            long r5 = java.lang.System.nanoTime()
            long r9 = r5 - r1
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.NANOSECONDS
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r12 = r1.getName()
            java.lang.Object r0 = r0.X
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            r5 = r4
            r5.<init>(r6, r7, r9, r11, r12, r13)
            r3.add(r4)
            return
        L_0x033a:
            java.lang.Object r1 = r0.c
            eu4 r1 = (defpackage.eu4) r1
            java.lang.Object r2 = r0.o
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r4 = r0.X
            lq1 r4 = (defpackage.lq1) r4
            java.lang.Object r0 = r0.b
            vs4 r0 = (defpackage.vs4) r0
            r0.getClass()
            ts4 r0 = r0.a     // Catch:{ RuntimeException -> 0x0356 }
            r0.n(r1, r2)     // Catch:{ RuntimeException -> 0x0356 }
            r4.b(r3)     // Catch:{ RuntimeException -> 0x0356 }
            goto L_0x035a
        L_0x0356:
            r0 = move-exception
            r4.d(r0)
        L_0x035a:
            return
        L_0x035b:
            java.lang.Object r1 = r0.b
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r2 = r0.c
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            if (r1 == 0) goto L_0x0368
            r2.removeView(r1)
        L_0x0368:
            java.lang.Object r1 = r0.o
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x0377
            android.view.ViewParent r3 = r1.getParent()
            if (r3 != 0) goto L_0x0377
            r2.addView(r1)
        L_0x0377:
            android.os.IBinder r1 = r2.getWindowToken()
            if (r1 == 0) goto L_0x0384
            java.lang.Object r0 = r0.X
            xu3 r0 = (defpackage.xu3) r0
            r0.q()
        L_0x0384:
            return
        L_0x0385:
            java.lang.Object r1 = r0.c
            eu4 r1 = (defpackage.eu4) r1
            java.lang.Object r2 = r0.o
            java.util.Map r2 = (java.util.Map) r2
            java.lang.Object r4 = r0.X
            lq1 r4 = (defpackage.lq1) r4
            java.lang.Object r0 = r0.b
            ce4 r0 = (defpackage.ce4) r0
            r0.getClass()
            zm4 r0 = r0.a     // Catch:{ RuntimeException -> 0x03a1 }
            r0.n(r1, r2)     // Catch:{ RuntimeException -> 0x03a1 }
            r4.b(r3)     // Catch:{ RuntimeException -> 0x03a1 }
            goto L_0x03a5
        L_0x03a1:
            r0 = move-exception
            r4.d(r0)
        L_0x03a5:
            return
        L_0x03a6:
            java.lang.Object r1 = r0.c
            hc0 r1 = (defpackage.hc0) r1
            java.lang.Object r2 = r0.o
            av1 r2 = (defpackage.av1) r2
            java.lang.Object r3 = r0.X
            ja0 r3 = (defpackage.ja0) r3
            java.lang.Object r0 = r0.b
            kd4 r0 = (defpackage.kd4) r0
            r0.getClass()
            java.util.logging.Logger r4 = defpackage.kd4.f
            java.lang.String r5 = "Transport backend '"
            g99 r6 = r0.c     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r7 = r1.a     // Catch:{ Exception -> 0x03e6 }
            k2f r6 = r6.a(r7)     // Catch:{ Exception -> 0x03e6 }
            if (r6 != 0) goto L_0x03e8
            java.lang.String r0 = r1.a     // Catch:{ Exception -> 0x03e6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03e6 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x03e6 }
            r1.append(r0)     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r0 = "' is not registered"
            r1.append(r0)     // Catch:{ Exception -> 0x03e6 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x03e6 }
            r4.warning(r0)     // Catch:{ Exception -> 0x03e6 }
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ Exception -> 0x03e6 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x03e6 }
            r2.getClass()     // Catch:{ Exception -> 0x03e6 }
            goto L_0x0417
        L_0x03e6:
            r0 = move-exception
            goto L_0x03ff
        L_0x03e8:
            h02 r6 = (defpackage.h02) r6     // Catch:{ Exception -> 0x03e6 }
            ja0 r3 = r6.a(r3)     // Catch:{ Exception -> 0x03e6 }
            fhe r5 = r0.e     // Catch:{ Exception -> 0x03e6 }
            u00 r6 = new u00     // Catch:{ Exception -> 0x03e6 }
            r7 = 4
            r6.<init>((java.lang.Object) r0, (java.lang.Object) r1, (java.lang.Object) r3, (int) r7)     // Catch:{ Exception -> 0x03e6 }
            gqc r5 = (defpackage.gqc) r5     // Catch:{ Exception -> 0x03e6 }
            r5.e0(r6)     // Catch:{ Exception -> 0x03e6 }
            r2.getClass()     // Catch:{ Exception -> 0x03e6 }
            goto L_0x0417
        L_0x03ff:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Error scheduling event "
            r1.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r4.warning(r0)
            r2.getClass()
        L_0x0417:
            return
        L_0x0418:
            java.lang.Object r1 = r0.b
            m5d r1 = (defpackage.m5d) r1
            java.lang.Object r2 = r0.c
            java.util.concurrent.atomic.AtomicBoolean r2 = (java.util.concurrent.atomic.AtomicBoolean) r2
            java.lang.Object r3 = r0.X
            ah3 r3 = (defpackage.ah3) r3
            java.lang.Object r0 = r0.o
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            java.lang.Object r4 = r1.b
            monitor-enter(r4)
            boolean r2 = r2.get()     // Catch:{ all -> 0x0435 }
            if (r2 != 0) goto L_0x0437
            r1.v(r3)     // Catch:{ all -> 0x0435 }
            goto L_0x043b
        L_0x0435:
            r0 = move-exception
            goto L_0x043d
        L_0x0437:
            r1 = 1
            r0.set(r1)     // Catch:{ all -> 0x0435 }
        L_0x043b:
            monitor-exit(r4)     // Catch:{ all -> 0x0435 }
            return
        L_0x043d:
            monitor-exit(r4)     // Catch:{ all -> 0x0435 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yg3.run():void");
    }

    public /* synthetic */ yg3(bkb bkb, lbd lbd, List list, ConditionVariable conditionVariable, kbd kbd) {
        this.a = 14;
        this.b = bkb;
        this.c = list;
        this.o = conditionVariable;
        this.X = kbd;
    }

    public /* synthetic */ yg3(m5d m5d, AtomicBoolean atomicBoolean, ah3 ah3, AtomicBoolean atomicBoolean2) {
        this.a = 0;
        this.b = m5d;
        this.c = atomicBoolean;
        this.X = ah3;
        this.o = atomicBoolean2;
    }

    public /* synthetic */ yg3(qye qye, Throwable th, String str) {
        this.a = 17;
        this.b = qye;
        this.c = "NON_FATAL";
        this.o = th;
        this.X = str;
    }

    public /* synthetic */ yg3(View view, boolean z, og4 og4, ViewGroup viewGroup, View view2, xu3 xu3) {
        this.a = 3;
        this.b = view;
        this.c = viewGroup;
        this.o = view2;
        this.X = xu3;
    }

    public /* synthetic */ yg3(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.o = obj3;
        this.X = obj4;
    }
}
