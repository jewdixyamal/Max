package defpackage;

import android.content.Context;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: o84  reason: default package */
public class o84 implements l30, s43, sbe, wde, i78, z0a, kz3, o2a, o1f {
    public static final /* synthetic */ o84 X = new o84(3);
    public static final o84 Y = new o84(4);
    public static t7d Z = new Object();
    public static o84 b;
    public static final o84 c = new o84(1);
    public static final o84 o = new o84(2);
    public static final /* synthetic */ o84 s0 = new o84(6);
    public final /* synthetic */ int a;

    public /* synthetic */ o84(int i) {
        this.a = i;
    }

    public static synchronized o84 g() {
        o84 o84;
        synchronized (o84.class) {
            try {
                if (b == null) {
                    b = new o84(0);
                }
                o84 = b;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return o84;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x014e  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0164  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x016a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01da A[Catch:{ all -> 0x01df, all -> 0x01ed }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x01e2 A[Catch:{ all -> 0x01df, all -> 0x01ed }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void n(defpackage.qy3 r16, java.util.List r17) {
        /*
            r0 = r16
            java.lang.String r1 = "CRASH"
            java.lang.String r2 = "MINIDUMP"
            java.lang.String r3 = "NON_FATAL"
            r4 = 1
            r5 = 0
            kye r6 = defpackage.kye.a
            java.lang.String r6 = defpackage.kye.a()
            if (r6 != 0) goto L_0x0013
            return
        L_0x0013:
            java.io.File r7 = new java.io.File
            java.lang.String r8 = r0.d
            r7.<init>(r8)
            boolean r8 = r7.exists()
            if (r8 != 0) goto L_0x0021
            return
        L_0x0021:
            java.lang.String r7 = defpackage.lk5.I(r7)
            java.io.File r8 = new java.io.File
            java.lang.String r9 = r0.e
            r8.<init>(r9)
            boolean r9 = r8.exists()
            if (r9 == 0) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r8 = r5
        L_0x0034:
            if (r8 == 0) goto L_0x003b
            java.lang.String r8 = defpackage.lk5.I(r8)
            goto L_0x003c
        L_0x003b:
            r8 = r5
        L_0x003c:
            org.json.JSONObject r9 = new org.json.JSONObject
            r9.<init>((java.lang.String) r7)
            if (r8 == 0) goto L_0x004d
            org.json.JSONArray r7 = new org.json.JSONArray
            r7.<init>((java.lang.String) r8)
            java.lang.String r8 = "tags"
            r9.put((java.lang.String) r8, (java.lang.Object) r7)
        L_0x004d:
            java.lang.String r7 = r9.toString()
            java.io.File r8 = new java.io.File
            java.lang.String r9 = r0.f
            r8.<init>(r9)
            byte[] r8 = defpackage.hm9.Z(r8)
            java.io.File r9 = new java.io.File
            java.lang.String r10 = r0.g
            r9.<init>(r10)
            boolean r10 = r9.exists()
            if (r10 == 0) goto L_0x006e
            byte[] r9 = defpackage.hm9.Z(r9)
            goto L_0x006f
        L_0x006e:
            r9 = r5
        L_0x006f:
            java.io.File r10 = new java.io.File
            java.lang.String r11 = r0.h
            r10.<init>(r11)
            boolean r11 = r10.exists()
            if (r11 == 0) goto L_0x0081
            byte[] r10 = defpackage.hm9.Z(r10)
            goto L_0x0082
        L_0x0081:
            r10 = r5
        L_0x0082:
            if (r17 == 0) goto L_0x00ca
            boolean r11 = r17.isEmpty()
            r11 = r11 ^ r4
            if (r11 == 0) goto L_0x008e
            r11 = r17
            goto L_0x008f
        L_0x008e:
            r11 = r5
        L_0x008f:
            if (r11 == 0) goto L_0x00ca
            org.json.JSONArray r12 = new org.json.JSONArray
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x009a:
            boolean r13 = r11.hasNext()
            if (r13 == 0) goto L_0x00c5
            java.lang.Object r13 = r11.next()
            ls4 r13 = (defpackage.ls4) r13
            org.json.JSONObject r14 = new org.json.JSONObject
            r14.<init>()
            java.lang.String r15 = r13.a
            java.lang.String r4 = "event"
            r14.put((java.lang.String) r4, (java.lang.Object) r15)
            java.lang.String r4 = "reason"
            java.lang.String r15 = r13.b
            r14.put((java.lang.String) r4, (java.lang.Object) r15)
            java.lang.String r4 = "count"
            int r13 = r13.c
            r14.put((java.lang.String) r4, (int) r13)
            r12.put((java.lang.Object) r14)
            r4 = 1
            goto L_0x009a
        L_0x00c5:
            java.lang.String r4 = r12.toString()
            goto L_0x00cb
        L_0x00ca:
            r4 = r5
        L_0x00cb:
            int r0 = r0.b
            int r11 = defpackage.au1.s(r0)
            r12 = 9
            r13 = 8
            if (r11 == r13) goto L_0x00dc
            if (r11 == r12) goto L_0x00dc
            java.lang.String r11 = "stackTrace"
            goto L_0x00de
        L_0x00dc:
            java.lang.String r11 = "file"
        L_0x00de:
            int r14 = defpackage.au1.s(r0)
            if (r14 == r13) goto L_0x00e9
            if (r14 == r12) goto L_0x00e9
            java.lang.String r14 = "stack.gzip"
            goto L_0x00eb
        L_0x00e9:
            java.lang.String r14 = "file.gzip"
        L_0x00eb:
            int r15 = defpackage.au1.s(r0)
            if (r15 == r13) goto L_0x00f9
            if (r15 == r12) goto L_0x00f6
            java.lang.String r12 = "api/crash/upload"
            goto L_0x00fb
        L_0x00f6:
            java.lang.String r12 = "api/crash/uploadAnr"
            goto L_0x00fb
        L_0x00f9:
            java.lang.String r12 = "api/crash/uploadNative"
        L_0x00fb:
            kye r13 = defpackage.kye.a
            java.util.Map r13 = defpackage.kye.c()
            o97 r15 = defpackage.ote.b
            java.lang.Object r13 = r13.get(r15)
            boolean r15 = r13 instanceof defpackage.gx3
            if (r15 == 0) goto L_0x010e
            gx3 r13 = (defpackage.gx3) r13
            goto L_0x010f
        L_0x010e:
            r13 = r5
        L_0x010f:
            if (r13 != 0) goto L_0x0119
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            defpackage.mz7.d0(r13)
        L_0x0119:
            java.lang.String r13 = "https://sdk-api.apptracer.ru"
            android.net.Uri r13 = android.net.Uri.parse(r13)
            android.net.Uri$Builder r13 = r13.buildUpon()
            android.net.Uri$Builder r12 = r13.appendEncodedPath(r12)
            java.lang.String r13 = "crashToken"
            android.net.Uri$Builder r6 = r12.appendQueryParameter(r13, r6)
            java.lang.String r6 = r6.toString()
            ey1 r12 = new ey1
            r13 = 17
            r12.<init>((int) r13)
            switch(r0) {
                case 1: goto L_0x0143;
                case 2: goto L_0x0141;
                case 3: goto L_0x0141;
                case 4: goto L_0x0141;
                case 5: goto L_0x0141;
                case 6: goto L_0x0141;
                case 7: goto L_0x0141;
                case 8: goto L_0x0141;
                case 9: goto L_0x013f;
                case 10: goto L_0x013c;
                default: goto L_0x013b;
            }
        L_0x013b:
            throw r5
        L_0x013c:
            java.lang.String r13 = "ANR"
            goto L_0x0144
        L_0x013f:
            r13 = r2
            goto L_0x0144
        L_0x0141:
            r13 = r3
            goto L_0x0144
        L_0x0143:
            r13 = r1
        L_0x0144:
            java.lang.String r15 = "type"
            r12.f(r15, r13)
            java.lang.String r13 = "JVM_STACKTRACE"
            switch(r0) {
                case 1: goto L_0x0152;
                case 2: goto L_0x0152;
                case 3: goto L_0x0152;
                case 4: goto L_0x0152;
                case 5: goto L_0x0152;
                case 6: goto L_0x0152;
                case 7: goto L_0x0152;
                case 8: goto L_0x0152;
                case 9: goto L_0x0153;
                case 10: goto L_0x014f;
                default: goto L_0x014e;
            }
        L_0x014e:
            throw r5
        L_0x014f:
            java.lang.String r2 = "ANDROID_ANR"
            goto L_0x0153
        L_0x0152:
            r2 = r13
        L_0x0153:
            java.lang.String r13 = "format"
            r12.f(r13, r2)
            switch(r0) {
                case 1: goto L_0x0171;
                case 2: goto L_0x0170;
                case 3: goto L_0x016d;
                case 4: goto L_0x016a;
                case 5: goto L_0x0167;
                case 6: goto L_0x0164;
                case 7: goto L_0x0161;
                case 8: goto L_0x015e;
                case 9: goto L_0x0171;
                case 10: goto L_0x015c;
                default: goto L_0x015b;
            }
        L_0x015b:
            throw r5
        L_0x015c:
            r1 = r5
            goto L_0x0171
        L_0x015e:
            java.lang.String r1 = "DEBUG"
            goto L_0x0171
        L_0x0161:
            java.lang.String r1 = "INFO"
            goto L_0x0171
        L_0x0164:
            java.lang.String r1 = "NOTICE"
            goto L_0x0171
        L_0x0167:
            java.lang.String r1 = "WARNING"
            goto L_0x0171
        L_0x016a:
            java.lang.String r1 = "ERROR"
            goto L_0x0171
        L_0x016d:
            java.lang.String r1 = "FATAL"
            goto L_0x0171
        L_0x0170:
            r1 = r3
        L_0x0171:
            if (r1 == 0) goto L_0x0178
            java.lang.String r0 = "severity"
            r12.f(r0, r1)
        L_0x0178:
            rh5 r0 = new rh5
            java.lang.String r1 = "application/octet-stream"
            r2 = 1
            r0.<init>(r1, r2, r8)
            r12.e(r11, r14, r0)
            java.lang.String r0 = "application/json; charset=utf-8"
            rh5 r0 = defpackage.b46.o(r0, r7)
            java.lang.String r3 = "uploadBean"
            r12.e(r3, r5, r0)
            if (r9 == 0) goto L_0x019c
            rh5 r0 = new rh5
            r0.<init>(r1, r2, r9)
            java.lang.String r3 = "threadDump"
            java.lang.String r7 = "threads.gzip"
            r12.e(r3, r7, r0)
        L_0x019c:
            if (r10 == 0) goto L_0x01aa
            rh5 r0 = new rh5
            r0.<init>(r1, r2, r10)
            java.lang.String r1 = "logs"
            java.lang.String r2 = "logs.gzip"
            r12.e(r1, r2, r0)
        L_0x01aa:
            if (r4 == 0) goto L_0x01b9
            java.lang.String r0 = "application/json"
            rh5 r0 = defpackage.b46.o(r0, r4)
            java.lang.String r1 = "drops"
            java.lang.String r2 = "drops.json"
            r12.e(r1, r2, r0)
        L_0x01b9:
            bw4 r0 = r12.g()
            bkb r1 = new bkb
            r1.<init>((java.lang.String) r6, (defpackage.qq6) r0)
            khe r0 = defpackage.kye.h
            java.lang.Object r0 = r0.getValue()
            wq6 r0 = (defpackage.wq6) r0
            rq6 r1 = r0.b(r1)
            java.io.Closeable r0 = r1.o     // Catch:{ all -> 0x01df }
            rh5 r0 = (defpackage.rh5) r0     // Catch:{ all -> 0x01df }
            if (r0 == 0) goto L_0x01e2
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x01df }
            byte[] r0 = (byte[]) r0     // Catch:{ all -> 0x01df }
            if (r0 == 0) goto L_0x01e2
            java.lang.String r0 = defpackage.eae.j0(r0)     // Catch:{ all -> 0x01df }
            goto L_0x01e3
        L_0x01df:
            r0 = move-exception
            r2 = r0
            goto L_0x01ec
        L_0x01e2:
            r0 = r5
        L_0x01e3:
            java.lang.String r2 = "CRASH_REPORT"
            defpackage.oz7.l(r0, r2, r5)     // Catch:{ all -> 0x01df }
            defpackage.v3c.i(r1, r5)
            return
        L_0x01ec:
            throw r2     // Catch:{ all -> 0x01ed }
        L_0x01ed:
            r0 = move-exception
            r3 = r0
            defpackage.v3c.i(r1, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o84.n(qy3, java.util.List):void");
    }

    public static void o(List list) {
        List list2;
        list.size();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            qy3 qy3 = (qy3) list.get(i);
            if (i == 0) {
                kye kye = kye.a;
                list2 = kye.b().d();
            } else {
                list2 = null;
            }
            try {
                n(qy3, list2);
                qy3.getClass();
                lk5.F(new File(qy3.c));
            } catch (Throwable unused) {
                if (list2 != null) {
                    kye kye2 = kye.a;
                    kye.b().a(list2);
                }
            }
        }
    }

    public xde a(ana ana) {
        return new o36((Context) ana.c, (String) ana.o, (l0f) ana.X, ana.a, ana.b);
    }

    public do0 b(wv6 wv6, Object obj) {
        do0 do0 = new do0(c(wv6.b).toString(), wv6.i, wv6.j, wv6.h, (ww0) null, (String) null);
        do0.g = obj;
        return do0;
    }

    public Uri c(Uri uri) {
        return uri;
    }

    public c1a call() {
        return new f1a();
    }

    public tpd d(Uri uri) {
        return new tpd(c(uri).toString());
    }

    public long e() {
        throw new NoSuchElementException();
    }

    public u1d f() {
        return new pm5(-9223372036854775807L);
    }

    public long h() {
        throw new NoSuchElementException();
    }

    public void i(long j) {
    }

    public do0 j(wv6 wv6, Object obj) {
        String str;
        ww0 ww0;
        q6b q6b = wv6.q;
        if (q6b != null) {
            ww0 b2 = q6b.b();
            str = q6b.getClass().getName();
            ww0 = b2;
        } else {
            ww0 = null;
            str = null;
        }
        do0 do0 = new do0(c(wv6.b).toString(), wv6.i, wv6.j, wv6.h, ww0, str);
        do0.g = obj;
        return do0;
    }

    public ukg k(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = goc.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? j1e.r(bundle) : j1e.r((Object) null);
    }

    public long l(ra4 ra4) {
        return -1;
    }

    public p1f m(Context context, i63 i63, xw0 xw0, pgf pgf, crd crd, List list, long j) {
        return new m1f(context, i63, xw0, pgf, crd, list, j);
    }

    public boolean next() {
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0311, code lost:
        r32 = r6;
        r33 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0315, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0352, code lost:
        r32 = r6;
        r33 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0356, code lost:
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:?, code lost:
        r35.z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x05eb, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x05ec, code lost:
        r4 = r0;
        defpackage.hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", r4);
        r0 = defpackage.u7d.a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x05fa, code lost:
        if (r0.hasNext() != false) goto L_0x05fc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x05fc, code lost:
        ((defpackage.r4a) r0.next()).getClass();
        defpackage.r4a.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x0609, code lost:
        r0 = defpackage.au1.s(defpackage.k7d.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x060f, code lost:
        if (r0 != 0) goto L_0x0611;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:0x0612, code lost:
        if (r0 != 1) goto L_0x0614;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:397:0x0619, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:398:0x061a, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00ce, code lost:
        r32 = r6;
        r33 = r7;
        r6 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0159, code lost:
        r32 = r6;
        r33 = r7;
        r6 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x015e, code lost:
        r10 = 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.gle w(defpackage.gy8 r35) {
        /*
            r34 = this;
            r0 = r34
            r1 = r35
            int r0 = r0.a
            switch(r0) {
                case 2: goto L_0x0680;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            long r21 = java.lang.System.nanoTime()
            boolean r0 = r35.m()
            if (r0 != 0) goto L_0x001e
            kt7 r0 = new kt7
            r0.<init>()
            goto L_0x067f
        L_0x001e:
            r4 = 1
            int r0 = defpackage.lz7.N(r35)     // Catch:{ all -> 0x0025 }
            r6 = r0
            goto L_0x0055
        L_0x0025:
            r0 = move-exception
            r6 = r0
            defpackage.hm9.l0(r3, r2, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0030:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0043
            java.lang.Object r7 = r0.next()
            r4a r7 = (defpackage.r4a) r7
            r7.getClass()
            defpackage.r4a.a(r6)
            goto L_0x0030
        L_0x0043:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0054
            if (r0 == r4) goto L_0x0053
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0053:
            throw r6
        L_0x0054:
            r6 = 0
        L_0x0055:
            if (r6 != 0) goto L_0x005e
            kt7 r0 = new kt7
            r0.<init>()
            goto L_0x067f
        L_0x005e:
            nz4 r7 = defpackage.nz4.a
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            java.util.HashMap r13 = new java.util.HashMap
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r10 = 0
            r15 = r7
            r16 = r15
            r18 = r10
            r23 = r18
            r26 = r23
            r5 = 0
            r12 = 0
            r17 = 0
            r20 = 0
            r25 = 0
            r28 = 0
        L_0x0084:
            if (r5 >= r6) goto L_0x0664
            java.lang.String r0 = defpackage.lz7.P(r35)     // Catch:{ all -> 0x008b }
            goto L_0x00bb
        L_0x008b:
            r0 = move-exception
            r9 = r0
            defpackage.hm9.l0(r3, r2, r9)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0096:
            boolean r29 = r0.hasNext()
            if (r29 == 0) goto L_0x00a9
            java.lang.Object r29 = r0.next()
            r4a r29 = (defpackage.r4a) r29
            r29.getClass()
            defpackage.r4a.a(r9)
            goto L_0x0096
        L_0x00a9:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x00ba
            if (r0 == r4) goto L_0x00b9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00b9:
            throw r9
        L_0x00ba:
            r0 = 0
        L_0x00bb:
            if (r0 != 0) goto L_0x00c5
            r32 = r6
            r33 = r7
            r6 = r10
            r10 = r4
            goto L_0x065a
        L_0x00c5:
            int r9 = r0.hashCode()
            java.lang.String r4 = "chats"
            switch(r9) {
                case -1900708191: goto L_0x05d9;
                case -1849019982: goto L_0x058e;
                case -1354792126: goto L_0x057a;
                case -1323779342: goto L_0x041f;
                case -1276666629: goto L_0x035a;
                case -567451565: goto L_0x0309;
                case -462094004: goto L_0x0243;
                case -309425751: goto L_0x01ff;
                case 3560141: goto L_0x01bc;
                case 94425557: goto L_0x01a1;
                case 94623771: goto L_0x0161;
                case 110541305: goto L_0x0117;
                case 1097076194: goto L_0x00d5;
                default: goto L_0x00ce;
            }
        L_0x00ce:
            r32 = r6
            r33 = r7
            r6 = r10
            goto L_0x05e6
        L_0x00d5:
            java.lang.String r4 = "resetAt"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00de
            goto L_0x00ce
        L_0x00de:
            long r26 = defpackage.lz7.M(r1, r10)     // Catch:{ all -> 0x00e4 }
            goto L_0x0159
        L_0x00e4:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00ef:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0102
            java.lang.Object r9 = r0.next()
            r4a r9 = (defpackage.r4a) r9
            r9.getClass()
            defpackage.r4a.a(r4)
            goto L_0x00ef
        L_0x0102:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0114
            r9 = 1
            if (r0 == r9) goto L_0x0113
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0113:
            throw r4
        L_0x0114:
            r26 = r10
            goto L_0x0159
        L_0x0117:
            java.lang.String r4 = "token"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0120
            goto L_0x00ce
        L_0x0120:
            java.lang.String r0 = defpackage.lz7.P(r35)     // Catch:{ all -> 0x0127 }
            r17 = r0
            goto L_0x0159
        L_0x0127:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0132:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0145
            java.lang.Object r9 = r0.next()
            r4a r9 = (defpackage.r4a) r9
            r9.getClass()
            defpackage.r4a.a(r4)
            goto L_0x0132
        L_0x0145:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0157
            r9 = 1
            if (r0 == r9) goto L_0x0156
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0156:
            throw r4
        L_0x0157:
            r17 = 0
        L_0x0159:
            r32 = r6
            r33 = r7
            r6 = r10
        L_0x015e:
            r10 = 1
            goto L_0x065a
        L_0x0161:
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0169
            goto L_0x00ce
        L_0x0169:
            wz r0 = defpackage.wz.b(r35)     // Catch:{ all -> 0x016f }
            r15 = r0
            goto L_0x0159
        L_0x016f:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x017a:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x018d
            java.lang.Object r9 = r0.next()
            r4a r9 = (defpackage.r4a) r9
            r9.getClass()
            defpackage.r4a.a(r4)
            goto L_0x017a
        L_0x018d:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x019f
            r9 = 1
            if (r0 == r9) goto L_0x019e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x019e:
            throw r4
        L_0x019f:
            r15 = r7
            goto L_0x0159
        L_0x01a1:
            java.lang.String r4 = "calls"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01ab
            goto L_0x00ce
        L_0x01ab:
            int r0 = defpackage.lz7.G(r35)
            r4 = 0
        L_0x01b0:
            if (r4 >= r0) goto L_0x0159
            idf r9 = defpackage.idf.a(r35)
            r14.add(r9)
            int r4 = r4 + 1
            goto L_0x01b0
        L_0x01bc:
            java.lang.String r4 = "time"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x01c6
            goto L_0x00ce
        L_0x01c6:
            long r18 = defpackage.lz7.M(r1, r10)     // Catch:{ all -> 0x01cb }
            goto L_0x0159
        L_0x01cb:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01d6:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x01e9
            java.lang.Object r9 = r0.next()
            r4a r9 = (defpackage.r4a) r9
            r9.getClass()
            defpackage.r4a.a(r4)
            goto L_0x01d6
        L_0x01e9:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x01fb
            r9 = 1
            if (r0 == r9) goto L_0x01fa
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01fa:
            throw r4
        L_0x01fb:
            r18 = r10
            goto L_0x0159
        L_0x01ff:
            java.lang.String r4 = "profile"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0209
            goto L_0x00ce
        L_0x0209:
            nab r0 = defpackage.nd7.C(r35)     // Catch:{ all -> 0x0210 }
            r12 = r0
            goto L_0x0159
        L_0x0210:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x021b:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x022e
            java.lang.Object r9 = r0.next()
            r4a r9 = (defpackage.r4a) r9
            r9.getClass()
            defpackage.r4a.a(r4)
            goto L_0x021b
        L_0x022e:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0240
            r9 = 1
            if (r0 == r9) goto L_0x023f
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x023f:
            throw r4
        L_0x0240:
            r12 = 0
            goto L_0x0159
        L_0x0243:
            java.lang.String r4 = "messages"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x024d
            goto L_0x00ce
        L_0x024d:
            int r0 = defpackage.lz7.N(r35)     // Catch:{ all -> 0x0253 }
            r4 = r0
            goto L_0x0284
        L_0x0253:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x025e:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0271
            java.lang.Object r9 = r0.next()
            r4a r9 = (defpackage.r4a) r9
            r9.getClass()
            defpackage.r4a.a(r4)
            goto L_0x025e
        L_0x0271:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0283
            r9 = 1
            if (r0 == r9) goto L_0x0282
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0282:
            throw r4
        L_0x0283:
            r4 = 0
        L_0x0284:
            r9 = 0
        L_0x0285:
            if (r9 >= r4) goto L_0x0159
            long r30 = defpackage.lz7.M(r1, r10)     // Catch:{ all -> 0x028e }
            r10 = r30
            goto L_0x02c0
        L_0x028e:
            r0 = move-exception
            r10 = r0
            defpackage.hm9.l0(r3, r2, r10)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0299:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x02ac
            java.lang.Object r11 = r0.next()
            r4a r11 = (defpackage.r4a) r11
            r11.getClass()
            defpackage.r4a.a(r10)
            goto L_0x0299
        L_0x02ac:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x02be
            r11 = 1
            if (r0 == r11) goto L_0x02bd
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02bd:
            throw r10
        L_0x02be:
            r10 = 0
        L_0x02c0:
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            wz r0 = defpackage.wz.e(r35)     // Catch:{ all -> 0x02cb }
            r32 = r4
            goto L_0x02fe
        L_0x02cb:
            r0 = move-exception
            r11 = r0
            defpackage.hm9.l0(r3, r2, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x02d6:
            boolean r32 = r0.hasNext()
            if (r32 == 0) goto L_0x02e9
            java.lang.Object r32 = r0.next()
            r4a r32 = (defpackage.r4a) r32
            r32.getClass()
            defpackage.r4a.a(r11)
            goto L_0x02d6
        L_0x02e9:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x02fb
            r4 = 1
            if (r0 == r4) goto L_0x02fa
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02fa:
            throw r11
        L_0x02fb:
            r32 = r4
            r0 = r7
        L_0x02fe:
            r13.put(r10, r0)
            int r9 = r9 + 1
            r4 = r32
            r10 = 0
            goto L_0x0285
        L_0x0309:
            java.lang.String r4 = "contacts"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0319
        L_0x0311:
            r32 = r6
            r33 = r7
        L_0x0315:
            r6 = 0
            goto L_0x05e6
        L_0x0319:
            wz r0 = defpackage.wz.c(r35)     // Catch:{ all -> 0x0320 }
            r16 = r0
            goto L_0x0352
        L_0x0320:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x032b:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x033e
            java.lang.Object r9 = r0.next()
            r4a r9 = (defpackage.r4a) r9
            r9.getClass()
            defpackage.r4a.a(r4)
            goto L_0x032b
        L_0x033e:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0350
            r9 = 1
            if (r0 == r9) goto L_0x034f
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x034f:
            throw r4
        L_0x0350:
            r16 = r7
        L_0x0352:
            r32 = r6
            r33 = r7
        L_0x0356:
            r6 = 0
            goto L_0x015e
        L_0x035a:
            java.lang.String r4 = "presence"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0363
        L_0x0362:
            goto L_0x0311
        L_0x0363:
            int r0 = defpackage.lz7.N(r35)     // Catch:{ all -> 0x0369 }
            r4 = r0
            goto L_0x039a
        L_0x0369:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0374:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0387
            java.lang.Object r9 = r0.next()
            r4a r9 = (defpackage.r4a) r9
            r9.getClass()
            defpackage.r4a.a(r4)
            goto L_0x0374
        L_0x0387:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0399
            r9 = 1
            if (r0 == r9) goto L_0x0398
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0398:
            throw r4
        L_0x0399:
            r4 = 0
        L_0x039a:
            r9 = 0
        L_0x039b:
            if (r9 >= r4) goto L_0x0352
            r10 = 0
            long r32 = defpackage.lz7.M(r1, r10)     // Catch:{ all -> 0x03a6 }
            r10 = r32
            goto L_0x03d8
        L_0x03a6:
            r0 = move-exception
            r10 = r0
            defpackage.hm9.l0(r3, r2, r10)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x03b1:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x03c4
            java.lang.Object r11 = r0.next()
            r4a r11 = (defpackage.r4a) r11
            r11.getClass()
            defpackage.r4a.a(r10)
            goto L_0x03b1
        L_0x03c4:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x03d6
            r11 = 1
            if (r0 == r11) goto L_0x03d5
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03d5:
            throw r10
        L_0x03d6:
            r10 = 0
        L_0x03d8:
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            s7b r0 = defpackage.s7b.a(r35)     // Catch:{ all -> 0x03e3 }
            r32 = r4
            goto L_0x0416
        L_0x03e3:
            r0 = move-exception
            r11 = r0
            defpackage.hm9.l0(r3, r2, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x03ee:
            boolean r32 = r0.hasNext()
            if (r32 == 0) goto L_0x0401
            java.lang.Object r32 = r0.next()
            r4a r32 = (defpackage.r4a) r32
            r32.getClass()
            defpackage.r4a.a(r11)
            goto L_0x03ee
        L_0x0401:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0413
            r4 = 1
            if (r0 == r4) goto L_0x0412
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0412:
            throw r11
        L_0x0413:
            r32 = r4
            r0 = 0
        L_0x0416:
            r8.put(r10, r0)
            int r9 = r9 + 1
            r4 = r32
            goto L_0x039b
        L_0x041f:
            java.lang.String r9 = "drafts"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x0429
            goto L_0x0362
        L_0x0429:
            int r0 = defpackage.lz7.N(r35)     // Catch:{ all -> 0x042f }
            r9 = r0
            goto L_0x0460
        L_0x042f:
            r0 = move-exception
            r9 = r0
            defpackage.hm9.l0(r3, r2, r9)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x043a:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x044d
            java.lang.Object r10 = r0.next()
            r4a r10 = (defpackage.r4a) r10
            r10.getClass()
            defpackage.r4a.a(r9)
            goto L_0x043a
        L_0x044d:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x045f
            r10 = 1
            if (r0 == r10) goto L_0x045e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x045e:
            throw r9
        L_0x045f:
            r9 = 0
        L_0x0460:
            if (r9 != 0) goto L_0x046a
            r32 = r6
            r33 = r7
            r28 = 0
            goto L_0x0356
        L_0x046a:
            r32 = r6
            r6 = 0
            r10 = 0
            r11 = 0
        L_0x046f:
            if (r10 >= r9) goto L_0x056f
            java.lang.String r0 = defpackage.lz7.P(r35)     // Catch:{ all -> 0x047a }
            r33 = r7
            r28 = r9
            goto L_0x04af
        L_0x047a:
            r0 = move-exception
            r33 = r7
            r7 = r0
            defpackage.hm9.l0(r3, r2, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0487:
            boolean r28 = r0.hasNext()
            if (r28 == 0) goto L_0x049a
            java.lang.Object r28 = r0.next()
            r4a r28 = (defpackage.r4a) r28
            r28.getClass()
            defpackage.r4a.a(r7)
            goto L_0x0487
        L_0x049a:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x04ac
            r9 = 1
            if (r0 == r9) goto L_0x04ab
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04ab:
            throw r7
        L_0x04ac:
            r28 = r9
            r0 = 0
        L_0x04af:
            if (r0 != 0) goto L_0x04b3
            goto L_0x0567
        L_0x04b3:
            boolean r7 = r0.equals(r4)
            if (r7 == 0) goto L_0x04f3
            kp4 r0 = defpackage.j1e.y(r35)     // Catch:{ all -> 0x04c0 }
            r11 = r0
            goto L_0x0567
        L_0x04c0:
            r0 = move-exception
            r7 = r0
            defpackage.hm9.l0(r3, r2, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x04cb:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x04de
            java.lang.Object r9 = r0.next()
            r4a r9 = (defpackage.r4a) r9
            r9.getClass()
            defpackage.r4a.a(r7)
            goto L_0x04cb
        L_0x04de:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x04f0
            r9 = 1
            if (r0 == r9) goto L_0x04ef
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x04ef:
            throw r7
        L_0x04f0:
            r11 = 0
            goto L_0x0567
        L_0x04f3:
            java.lang.String r7 = "users"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0533
            kp4 r0 = defpackage.j1e.y(r35)     // Catch:{ all -> 0x0501 }
            r6 = r0
            goto L_0x0567
        L_0x0501:
            r0 = move-exception
            r6 = r0
            defpackage.hm9.l0(r3, r2, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x050c:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x051f
            java.lang.Object r7 = r0.next()
            r4a r7 = (defpackage.r4a) r7
            r7.getClass()
            defpackage.r4a.a(r6)
            goto L_0x050c
        L_0x051f:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0531
            r7 = 1
            if (r0 == r7) goto L_0x0530
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0530:
            throw r6
        L_0x0531:
            r6 = 0
            goto L_0x0567
        L_0x0533:
            r35.z()     // Catch:{ all -> 0x0537 }
            goto L_0x0567
        L_0x0537:
            r0 = move-exception
            r7 = r0
            defpackage.hm9.l0(r3, r2, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0542:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0555
            java.lang.Object r9 = r0.next()
            r4a r9 = (defpackage.r4a) r9
            r9.getClass()
            defpackage.r4a.a(r7)
            goto L_0x0542
        L_0x0555:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0567
            r9 = 1
            if (r0 == r9) goto L_0x0566
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0566:
            throw r7
        L_0x0567:
            int r10 = r10 + 1
            r9 = r28
            r7 = r33
            goto L_0x046f
        L_0x056f:
            r33 = r7
            vp4 r0 = new vp4
            r0.<init>(r11, r6)
            r28 = r0
            goto L_0x0356
        L_0x057a:
            r32 = r6
            r33 = r7
            java.lang.String r4 = "config"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0588
        L_0x0586:
            goto L_0x0315
        L_0x0588:
            le3 r20 = defpackage.nu0.C(r35)
            goto L_0x0356
        L_0x058e:
            r32 = r6
            r33 = r7
            java.lang.String r4 = "chatMarker"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x059b
            goto L_0x0586
        L_0x059b:
            r6 = 0
            long r9 = defpackage.lz7.M(r1, r6)     // Catch:{ all -> 0x05a5 }
            r23 = r9
            goto L_0x015e
        L_0x05a5:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x05b0:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x05c3
            java.lang.Object r9 = r0.next()
            r4a r9 = (defpackage.r4a) r9
            r9.getClass()
            defpackage.r4a.a(r4)
            goto L_0x05b0
        L_0x05c3:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x05d5
            r9 = 1
            if (r0 == r9) goto L_0x05d4
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x05d4:
            throw r4
        L_0x05d5:
            r23 = r6
            goto L_0x015e
        L_0x05d9:
            r32 = r6
            r33 = r7
            r6 = r10
            java.lang.String r4 = "videoChatHistory"
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x061b
        L_0x05e6:
            r35.z()     // Catch:{ all -> 0x05eb }
            goto L_0x015e
        L_0x05eb:
            r0 = move-exception
            r4 = r0
            defpackage.hm9.l0(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x05f6:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x0609
            java.lang.Object r9 = r0.next()
            r4a r9 = (defpackage.r4a) r9
            r9.getClass()
            defpackage.r4a.a(r4)
            goto L_0x05f6
        L_0x0609:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x015e
            r9 = 1
            if (r0 == r9) goto L_0x061a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x061a:
            throw r4
        L_0x061b:
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            boolean r0 = defpackage.lz7.H(r35)     // Catch:{ all -> 0x0627 }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0627 }
        L_0x0625:
            r10 = 1
            goto L_0x0656
        L_0x0627:
            r0 = move-exception
            defpackage.hm9.l0(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r9 = defpackage.u7d.a
            java.util.Iterator r9 = r9.iterator()
        L_0x0631:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0644
            java.lang.Object r10 = r9.next()
            r4a r10 = (defpackage.r4a) r10
            r10.getClass()
            defpackage.r4a.a(r0)
            goto L_0x0631
        L_0x0644:
            int r9 = defpackage.k7d.a
            int r9 = defpackage.au1.s(r9)
            if (r9 == 0) goto L_0x0625
            r10 = 1
            if (r9 == r10) goto L_0x0655
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0655:
            throw r0
        L_0x0656:
            boolean r25 = r4.booleanValue()
        L_0x065a:
            int r5 = r5 + 1
            r4 = r10
            r10 = r6
            r6 = r32
            r7 = r33
            goto L_0x0084
        L_0x0664:
            kt7 r0 = new kt7
            r4 = r0
            r5 = r12
            r6 = r15
            r7 = r16
            r9 = r17
            r10 = r18
            r12 = r20
            r1 = r14
            r14 = r23
            r16 = r1
            r17 = r25
            r18 = r26
            r20 = r28
            r4.<init>(r5, r6, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r20, r21)
        L_0x067f:
            return r0
        L_0x0680:
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            boolean r0 = r35.m()
            nz4 r4 = defpackage.nz4.a
            if (r0 != 0) goto L_0x0693
            ym3 r0 = new ym3
            r0.<init>(r4)
            goto L_0x078b
        L_0x0693:
            r5 = 1
            r6 = 0
            int r0 = defpackage.lz7.N(r35)     // Catch:{ all -> 0x069b }
            r7 = r0
            goto L_0x06cb
        L_0x069b:
            r0 = move-exception
            r7 = r0
            defpackage.hm9.l0(r3, r2, r7)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x06a6:
            boolean r8 = r0.hasNext()
            if (r8 == 0) goto L_0x06b9
            java.lang.Object r8 = r0.next()
            r4a r8 = (defpackage.r4a) r8
            r8.getClass()
            defpackage.r4a.a(r7)
            goto L_0x06a6
        L_0x06b9:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x06ca
            if (r0 == r5) goto L_0x06c9
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x06c9:
            throw r7
        L_0x06ca:
            r7 = r6
        L_0x06cb:
            if (r7 != 0) goto L_0x06d4
            ym3 r0 = new ym3
            r0.<init>(r4)
            goto L_0x078b
        L_0x06d4:
            r8 = r4
        L_0x06d5:
            if (r6 >= r7) goto L_0x0786
            java.lang.String r0 = defpackage.lz7.P(r35)     // Catch:{ all -> 0x06dc }
            goto L_0x070c
        L_0x06dc:
            r0 = move-exception
            r9 = r0
            defpackage.hm9.l0(r3, r2, r9)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x06e7:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x06fa
            java.lang.Object r10 = r0.next()
            r4a r10 = (defpackage.r4a) r10
            r10.getClass()
            defpackage.r4a.a(r9)
            goto L_0x06e7
        L_0x06fa:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x070b
            if (r0 == r5) goto L_0x070a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x070a:
            throw r9
        L_0x070b:
            r0 = 0
        L_0x070c:
            if (r0 != 0) goto L_0x0710
            goto L_0x0782
        L_0x0710:
            java.lang.String r9 = "contacts"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x074f
            wz r0 = defpackage.wz.c(r35)     // Catch:{ all -> 0x071e }
            r8 = r0
            goto L_0x0782
        L_0x071e:
            r0 = move-exception
            r8 = r0
            defpackage.hm9.l0(r3, r2, r8)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0729:
            boolean r9 = r0.hasNext()
            if (r9 == 0) goto L_0x073c
            java.lang.Object r9 = r0.next()
            r4a r9 = (defpackage.r4a) r9
            r9.getClass()
            defpackage.r4a.a(r8)
            goto L_0x0729
        L_0x073c:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x074d
            if (r0 == r5) goto L_0x074c
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x074c:
            throw r8
        L_0x074d:
            r8 = r4
            goto L_0x0782
        L_0x074f:
            r35.z()     // Catch:{ all -> 0x0753 }
            goto L_0x0782
        L_0x0753:
            r0 = move-exception
            r9 = r0
            defpackage.hm9.l0(r3, r2, r9)
            java.util.concurrent.CopyOnWriteArraySet r0 = defpackage.u7d.a
            java.util.Iterator r0 = r0.iterator()
        L_0x075e:
            boolean r10 = r0.hasNext()
            if (r10 == 0) goto L_0x0771
            java.lang.Object r10 = r0.next()
            r4a r10 = (defpackage.r4a) r10
            r10.getClass()
            defpackage.r4a.a(r9)
            goto L_0x075e
        L_0x0771:
            int r0 = defpackage.k7d.a
            int r0 = defpackage.au1.s(r0)
            if (r0 == 0) goto L_0x0782
            if (r0 == r5) goto L_0x0781
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0781:
            throw r9
        L_0x0782:
            int r6 = r6 + 1
            goto L_0x06d5
        L_0x0786:
            ym3 r0 = new ym3
            r0.<init>(r8)
        L_0x078b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o84.w(gy8):gle");
    }

    public o84(Context context) {
        this.a = 19;
        WifiManager wifiManager = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }
}
