package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;

/* renamed from: t8f  reason: default package */
public final class t8f {
    public final Context a;
    public final g99 b;
    public final h45 c;
    public final z77 d;
    public final Executor e;
    public final fhe f;
    public final d9f g;
    public final d9f h;
    public final l33 i;

    public t8f(Context context, g99 g99, h45 h45, z77 z77, Executor executor, fhe fhe, d9f d9f, d9f d9f2, l33 l33) {
        this.a = context;
        this.b = g99;
        this.c = h45;
        this.d = z77;
        this.e = executor;
        this.f = fhe;
        this.g = d9f;
        this.h = d9f2;
        this.i = l33;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v24, resolved type: java.util.zip.GZIPInputStream} */
    /* JADX WARNING: type inference failed for: r4v64, types: [fc3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v24, types: [fc3, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v11, types: [java.lang.Object, ai3] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:219:0x052b */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x0517 A[SYNTHETIC, Splitter:B:210:0x0517] */
    /* JADX WARNING: Removed duplicated region for block: B:230:0x0557 A[Catch:{ IOException -> 0x05c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x056d A[Catch:{ IOException -> 0x05c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x0570 A[Catch:{ IOException -> 0x05c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x0587 A[Catch:{ IOException -> 0x05c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0590  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x05f5  */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x0520 A[EDGE_INSN: B:296:0x0520->B:216:0x0520 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:297:0x05d5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:310:0x0580 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.hc0 r47, int r48) {
        /*
            r46 = this;
            r7 = r46
            r8 = r47
            r1 = 4
            r9 = 1
            r2 = 0
            g99 r0 = r7.b
            java.lang.String r3 = r8.a
            k2f r3 = r0.a(r3)
            r10 = 0
        L_0x0011:
            s8f r0 = new s8f
            r0.<init>(r7, r8, r2)
            fhe r6 = r7.f
            r12 = r6
            gqc r12 = (defpackage.gqc) r12
            java.lang.Object r0 = r12.e0(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x067a
            s8f r0 = new s8f
            r0.<init>(r7, r8, r9)
            java.lang.Object r0 = r12.e0(r0)
            r6 = r0
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r0 = r6.iterator()
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L_0x003e
            return
        L_0x003e:
            r14 = 3
            r4 = -1
            byte[] r15 = r8.b
            if (r3 != 0) goto L_0x0060
            java.lang.String r0 = "Uploader"
            java.lang.String r13 = "Unknown backend for %s, deleting event batch for it..."
            defpackage.j1e.m(r0, r13, r8)
            r90 r0 = new r90
            r0.<init>(r14, r4)
            r30 = r3
            r31 = r6
            r33 = r10
            r32 = r12
        L_0x0059:
            r29 = r15
            r1 = 0
        L_0x005d:
            r3 = 2
            goto L_0x05d1
        L_0x0060:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r13 = r6.iterator()
        L_0x0069:
            boolean r16 = r13.hasNext()
            if (r16 == 0) goto L_0x007e
            java.lang.Object r16 = r13.next()
            r9 = r16
            fb0 r9 = (defpackage.fb0) r9
            ja0 r9 = r9.c
            r0.add(r9)
            r9 = 1
            goto L_0x0069
        L_0x007e:
            if (r15 == 0) goto L_0x0082
            r9 = 1
            goto L_0x0083
        L_0x0082:
            r9 = r2
        L_0x0083:
            java.lang.String r13 = "proto"
            if (r9 == 0) goto L_0x00ed
            l33 r9 = r7.i
            java.util.Objects.requireNonNull(r9)
            gte r4 = new gte
            r4.<init>((int) r1, (java.lang.Object) r9)
            java.lang.Object r4 = r12.e0(r4)
            p33 r4 = (defpackage.p33) r4
            ai3 r5 = new ai3
            r5.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            r5.Y = r9
            d9f r9 = r7.g
            long r17 = r9.a()
            java.lang.Long r9 = java.lang.Long.valueOf(r17)
            r5.o = r9
            d9f r9 = r7.h
            long r17 = r9.a()
            java.lang.Long r9 = java.lang.Long.valueOf(r17)
            r5.X = r9
            java.lang.String r9 = "GDT_CLIENT_METRICS"
            r5.a = r9
            i05 r9 = new i05
            i15 r1 = new i15
            r1.<init>(r13)
            r4.getClass()
            pl8 r14 = defpackage.lob.a
            r14.getClass()
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>()
            r14.v(r4, r2)     // Catch:{ IOException -> 0x00d6 }
        L_0x00d6:
            byte[] r2 = r2.toByteArray()
            r9.<init>(r1, r2)
            r5.c = r9
            ja0 r1 = r5.c()
            r2 = r3
            h02 r2 = (defpackage.h02) r2
            ja0 r1 = r2.a(r1)
            r0.add(r1)
        L_0x00ed:
            r1 = r3
            h02 r1 = (defpackage.h02) r1
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Iterator r0 = r0.iterator()
        L_0x00f9:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0123
            java.lang.Object r4 = r0.next()
            ja0 r4 = (defpackage.ja0) r4
            java.lang.String r5 = r4.a
            boolean r9 = r2.containsKey(r5)
            if (r9 != 0) goto L_0x0119
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r9.add(r4)
            r2.put(r5, r9)
            goto L_0x00f9
        L_0x0119:
            java.lang.Object r5 = r2.get(r5)
            java.util.List r5 = (java.util.List) r5
            r5.add(r4)
            goto L_0x00f9
        L_0x0123:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0130:
            boolean r4 = r2.hasNext()
            java.lang.String r5 = "TRuntime."
            java.lang.String r9 = "CctTransportBackend"
            if (r4 == 0) goto L_0x033e
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r20 = r4.getValue()
            r14 = r20
            java.util.List r14 = (java.util.List) r14
            r20 = r2
            r2 = 0
            java.lang.Object r14 = r14.get(r2)
            ja0 r14 = (defpackage.ja0) r14
            hqb r2 = defpackage.hqb.a
            d9f r2 = r1.f
            long r22 = r2.a()
            d9f r2 = r1.e
            long r24 = r2.a()
            java.lang.String r2 = "sdk-version"
            int r2 = r14.b(r2)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "model"
            java.lang.String r28 = r14.a(r2)
            java.lang.String r2 = "hardware"
            java.lang.String r29 = r14.a(r2)
            java.lang.String r2 = "device"
            java.lang.String r30 = r14.a(r2)
            java.lang.String r2 = "product"
            java.lang.String r31 = r14.a(r2)
            java.lang.String r2 = "os-uild"
            java.lang.String r32 = r14.a(r2)
            java.lang.String r2 = "manufacturer"
            java.lang.String r33 = r14.a(r2)
            java.lang.String r2 = "fingerprint"
            java.lang.String r34 = r14.a(r2)
            java.lang.String r2 = "country"
            java.lang.String r36 = r14.a(r2)
            java.lang.String r2 = "locale"
            java.lang.String r35 = r14.a(r2)
            java.lang.String r2 = "mcc_mnc"
            java.lang.String r37 = r14.a(r2)
            java.lang.String r2 = "application_build"
            java.lang.String r38 = r14.a(r2)
            k90 r2 = new k90
            r26 = r2
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            z90 r14 = new z90
            r14.<init>(r2)
            java.lang.Object r2 = r4.getKey()     // Catch:{ NumberFormatException -> 0x01ca }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x01ca }
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x01ca }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ NumberFormatException -> 0x01ca }
            r27 = r2
            r28 = 0
            goto L_0x01d4
        L_0x01ca:
            java.lang.Object r2 = r4.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r28 = r2
            r27 = 0
        L_0x01d4:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r4 = r4.getValue()
            java.util.List r4 = (java.util.List) r4
            java.util.Iterator r4 = r4.iterator()
        L_0x01e3:
            boolean r19 = r4.hasNext()
            if (r19 == 0) goto L_0x031c
            java.lang.Object r19 = r4.next()
            r30 = r3
            r3 = r19
            ja0 r3 = (defpackage.ja0) r3
            r19 = r4
            i05 r4 = r3.c
            i15 r8 = r4.a
            i15 r7 = new i15
            r7.<init>(r13)
            boolean r7 = r8.equals(r7)
            byte[] r4 = r4.b
            if (r7 == 0) goto L_0x0212
            fc3 r7 = new fc3
            r7.<init>()
            r7.o = r4
            r32 = r12
            r31 = r13
            goto L_0x0236
        L_0x0212:
            i15 r7 = new i15
            r31 = r13
            java.lang.String r13 = "json"
            r7.<init>(r13)
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x030b
            java.lang.String r7 = new java.lang.String
            java.lang.String r8 = "UTF-8"
            java.nio.charset.Charset r8 = java.nio.charset.Charset.forName(r8)
            r7.<init>(r4, r8)
            fc3 r4 = new fc3
            r4.<init>()
            r4.X = r7
            r7 = r4
            r32 = r12
        L_0x0236:
            long r12 = r3.d
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            r7.a = r4
            long r12 = r3.e
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            r7.c = r4
            java.util.Map r4 = r3.f
            java.lang.String r8 = "tz-offset"
            java.lang.Object r4 = r4.get(r8)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0255
            r12 = 0
            goto L_0x025d
        L_0x0255:
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            long r12 = r4.longValue()
        L_0x025d:
            java.lang.Long r4 = java.lang.Long.valueOf(r12)
            r7.Y = r4
            java.lang.String r4 = "net-type"
            int r4 = r3.b(r4)
            android.util.SparseArray r8 = defpackage.rn9.a
            java.lang.Object r4 = r8.get(r4)
            rn9 r4 = (defpackage.rn9) r4
            java.lang.String r8 = "mobile-subtype"
            int r8 = r3.b(r8)
            android.util.SparseArray r12 = defpackage.qn9.a
            java.lang.Object r8 = r12.get(r8)
            qn9 r8 = (defpackage.qn9) r8
            bb0 r12 = new bb0
            r12.<init>(r4, r8)
            r7.Z = r12
            java.lang.Integer r3 = r3.b
            if (r3 == 0) goto L_0x028c
            r7.b = r3
        L_0x028c:
            java.lang.Object r3 = r7.a
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 != 0) goto L_0x0295
            java.lang.String r3 = " eventTimeMs"
            goto L_0x0297
        L_0x0295:
            java.lang.String r3 = ""
        L_0x0297:
            java.lang.Object r4 = r7.c
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto L_0x02a3
            java.lang.String r4 = " eventUptimeMs"
            java.lang.String r3 = r3.concat(r4)
        L_0x02a3:
            java.lang.Object r4 = r7.Y
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 != 0) goto L_0x02af
            java.lang.String r4 = " timezoneOffsetSeconds"
            java.lang.String r3 = defpackage.au1.g(r3, r4)
        L_0x02af:
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x02ff
            xa0 r3 = new xa0
            java.lang.Object r4 = r7.a
            java.lang.Long r4 = (java.lang.Long) r4
            long r34 = r4.longValue()
            java.lang.Object r4 = r7.b
            r36 = r4
            java.lang.Integer r36 = (java.lang.Integer) r36
            java.lang.Object r4 = r7.c
            java.lang.Long r4 = (java.lang.Long) r4
            long r37 = r4.longValue()
            java.lang.Object r4 = r7.o
            r39 = r4
            byte[] r39 = (byte[]) r39
            java.lang.Object r4 = r7.X
            r40 = r4
            java.lang.String r40 = (java.lang.String) r40
            java.lang.Object r4 = r7.Y
            java.lang.Long r4 = (java.lang.Long) r4
            long r41 = r4.longValue()
            java.lang.Object r4 = r7.Z
            sn9 r4 = (defpackage.sn9) r4
            r43 = r4
            bb0 r43 = (defpackage.bb0) r43
            r33 = r3
            r33.<init>(r34, r36, r37, r39, r40, r41, r43)
            r2.add(r3)
        L_0x02f1:
            r7 = r46
            r8 = r47
            r4 = r19
            r3 = r30
            r13 = r31
            r12 = r32
            goto L_0x01e3
        L_0x02ff:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Missing required properties:"
            java.lang.String r1 = r1.concat(r3)
            r0.<init>(r1)
            throw r0
        L_0x030b:
            r32 = r12
            java.lang.String r3 = r5.concat(r9)
            r4 = 5
            boolean r3 = android.util.Log.isLoggable(r3, r4)
            if (r3 == 0) goto L_0x02f1
            r8.toString()
            goto L_0x02f1
        L_0x031c:
            r30 = r3
            r32 = r12
            r31 = r13
            ya0 r3 = new ya0
            r21 = r3
            r26 = r14
            r29 = r2
            r21.<init>(r22, r24, r26, r27, r28, r29)
            r0.add(r3)
            r7 = r46
            r8 = r47
            r2 = r20
            r3 = r30
            r13 = r31
            r12 = r32
            goto L_0x0130
        L_0x033e:
            r30 = r3
            r32 = r12
            r4 = 5
            s90 r2 = new s90
            r2.<init>(r0)
            java.net.URL r0 = r1.d
            if (r15 == 0) goto L_0x036d
            fw0 r3 = defpackage.fw0.a(r15)     // Catch:{ IllegalArgumentException -> 0x035f }
            java.lang.String r7 = r3.b     // Catch:{ IllegalArgumentException -> 0x035f }
            if (r7 == 0) goto L_0x0355
            goto L_0x0356
        L_0x0355:
            r7 = 0
        L_0x0356:
            java.lang.String r3 = r3.a     // Catch:{ IllegalArgumentException -> 0x035f }
            if (r3 == 0) goto L_0x036e
            java.net.URL r0 = defpackage.h02.b(r3)     // Catch:{ IllegalArgumentException -> 0x035f }
            goto L_0x036e
        L_0x035f:
            r90 r0 = new r90
            r1 = 3
            r2 = -1
            r0.<init>(r1, r2)
            r31 = r6
            r33 = r10
            goto L_0x0059
        L_0x036d:
            r7 = 0
        L_0x036e:
            cjg r3 = new cjg     // Catch:{ IOException -> 0x05be }
            r3.<init>(r0, r2, r7)     // Catch:{ IOException -> 0x05be }
            r14 = r4
        L_0x0374:
            java.lang.Object r0 = r3.a     // Catch:{ IOException -> 0x05be }
            java.net.URL r0 = (java.net.URL) r0     // Catch:{ IOException -> 0x05be }
            java.lang.String r2 = r5.concat(r9)     // Catch:{ IOException -> 0x05be }
            r4 = 4
            boolean r2 = android.util.Log.isLoggable(r2, r4)     // Catch:{ IOException -> 0x05be }
            if (r2 == 0) goto L_0x0386
            java.util.Objects.toString(r0)     // Catch:{ IOException -> 0x05be }
        L_0x0386:
            java.lang.Object r0 = r3.a     // Catch:{ IOException -> 0x05be }
            java.net.URL r0 = (java.net.URL) r0     // Catch:{ IOException -> 0x05be }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ IOException -> 0x05be }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ IOException -> 0x05be }
            r2 = 30000(0x7530, float:4.2039E-41)
            r0.setConnectTimeout(r2)     // Catch:{ IOException -> 0x05be }
            int r2 = r1.g     // Catch:{ IOException -> 0x05be }
            r0.setReadTimeout(r2)     // Catch:{ IOException -> 0x05be }
            r2 = 1
            r0.setDoOutput(r2)     // Catch:{ IOException -> 0x05be }
            r2 = 0
            r0.setInstanceFollowRedirects(r2)     // Catch:{ IOException -> 0x05be }
            java.lang.String r4 = "POST"
            r0.setRequestMethod(r4)     // Catch:{ IOException -> 0x05be }
            java.lang.String r4 = "User-Agent"
            java.lang.String r7 = "datatransport/3.1.9 android/"
            r0.setRequestProperty(r4, r7)     // Catch:{ IOException -> 0x05be }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r7 = "gzip"
            r0.setRequestProperty(r4, r7)     // Catch:{ IOException -> 0x05be }
            java.lang.String r8 = "Content-Type"
            java.lang.String r12 = "application/json"
            r0.setRequestProperty(r8, r12)     // Catch:{ IOException -> 0x05be }
            java.lang.String r12 = "Accept-Encoding"
            r0.setRequestProperty(r12, r7)     // Catch:{ IOException -> 0x05be }
            java.lang.Object r12 = r3.c     // Catch:{ IOException -> 0x05be }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ IOException -> 0x05be }
            if (r12 == 0) goto L_0x03cc
            java.lang.String r13 = "X-Goog-Api-Key"
            r0.setRequestProperty(r13, r12)     // Catch:{ IOException -> 0x05be }
        L_0x03cc:
            java.io.OutputStream r12 = r0.getOutputStream()     // Catch:{ ConnectException | UnknownHostException -> 0x053a, EncodingException | IOException -> 0x0521 }
            java.util.zip.GZIPOutputStream r13 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0509 }
            r13.<init>(r12)     // Catch:{ all -> 0x0509 }
            rxd r2 = r1.a     // Catch:{ all -> 0x04f3 }
            r22 = r1
            java.lang.Object r1 = r3.b     // Catch:{ all -> 0x04f1 }
            fl0 r1 = (defpackage.fl0) r1     // Catch:{ all -> 0x04f1 }
            r29 = r15
            java.io.BufferedWriter r15 = new java.io.BufferedWriter     // Catch:{ all -> 0x04eb }
            r33 = r10
            java.io.OutputStreamWriter r10 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x04e5 }
            r10.<init>(r13)     // Catch:{ all -> 0x04e5 }
            r15.<init>(r10)     // Catch:{ all -> 0x04e5 }
            ib7 r10 = new ib7     // Catch:{ all -> 0x04df }
            java.lang.Object r2 = r2.b     // Catch:{ all -> 0x04df }
            pa7 r2 = (defpackage.pa7) r2     // Catch:{ all -> 0x04df }
            java.util.HashMap r11 = r2.a     // Catch:{ all -> 0x04df }
            r31 = r6
            java.util.HashMap r6 = r2.b     // Catch:{ all -> 0x04dd }
            r35 = r14
            ma7 r14 = r2.c     // Catch:{ all -> 0x04db }
            boolean r2 = r2.d     // Catch:{ all -> 0x04db }
            r23 = r10
            r24 = r15
            r25 = r11
            r26 = r6
            r27 = r14
            r28 = r2
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ all -> 0x04db }
            r10.f(r1)     // Catch:{ all -> 0x04db }
            r10.h()     // Catch:{ all -> 0x04db }
            android.util.JsonWriter r1 = r10.b     // Catch:{ all -> 0x04db }
            r1.flush()     // Catch:{ all -> 0x04db }
            r13.close()     // Catch:{ all -> 0x04d8 }
            if (r12 == 0) goto L_0x041f
            r12.close()     // Catch:{ ConnectException | UnknownHostException -> 0x0544, EncodingException | IOException -> 0x052b }
        L_0x041f:
            int r1 = r0.getResponseCode()     // Catch:{ IOException -> 0x05c4 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ IOException -> 0x05c4 }
            java.lang.String r6 = r5.concat(r9)     // Catch:{ IOException -> 0x05c4 }
            r10 = 4
            boolean r6 = android.util.Log.isLoggable(r6, r10)     // Catch:{ IOException -> 0x05c4 }
            if (r6 == 0) goto L_0x043b
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch:{ IOException -> 0x05c4 }
            java.lang.String r6 = "Status Code: %d"
            java.lang.String.format(r6, r2)     // Catch:{ IOException -> 0x05c4 }
        L_0x043b:
            java.lang.String r2 = "Content-Type: %s"
            java.lang.String r6 = r0.getHeaderField(r8)     // Catch:{ IOException -> 0x05c4 }
            defpackage.j1e.m(r9, r2, r6)     // Catch:{ IOException -> 0x05c4 }
            java.lang.String r2 = "Content-Encoding: %s"
            java.lang.String r6 = r0.getHeaderField(r4)     // Catch:{ IOException -> 0x05c4 }
            defpackage.j1e.m(r9, r2, r6)     // Catch:{ IOException -> 0x05c4 }
            r2 = 302(0x12e, float:4.23E-43)
            if (r1 == r2) goto L_0x04c4
            r2 = 301(0x12d, float:4.22E-43)
            if (r1 == r2) goto L_0x04c4
            r2 = 307(0x133, float:4.3E-43)
            if (r1 != r2) goto L_0x045b
            goto L_0x04c4
        L_0x045b:
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L_0x046f
            mx1 r0 = new mx1     // Catch:{ IOException -> 0x05c4 }
            r2 = 0
            r6 = 0
            r0.<init>(r1, r2, r6)     // Catch:{ IOException -> 0x046c }
        L_0x0467:
            r1 = 0
            r4 = 0
            goto L_0x0551
        L_0x046c:
            r1 = r6
            goto L_0x05c6
        L_0x046f:
            java.io.InputStream r2 = r0.getInputStream()     // Catch:{ IOException -> 0x05c4 }
            java.lang.String r0 = r0.getHeaderField(r4)     // Catch:{ all -> 0x04a1 }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x04a1 }
            if (r0 == 0) goto L_0x0484
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ all -> 0x04a1 }
            r0.<init>(r2)     // Catch:{ all -> 0x04a1 }
            r4 = r0
            goto L_0x0485
        L_0x0484:
            r4 = r2
        L_0x0485:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x04aa }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x04aa }
            r6.<init>(r4)     // Catch:{ all -> 0x04aa }
            r0.<init>(r6)     // Catch:{ all -> 0x04aa }
            za0 r0 = defpackage.za0.a(r0)     // Catch:{ all -> 0x04aa }
            long r6 = r0.a     // Catch:{ all -> 0x04aa }
            mx1 r0 = new mx1     // Catch:{ all -> 0x04aa }
            r8 = 0
            r0.<init>(r1, r8, r6)     // Catch:{ all -> 0x04aa }
            if (r4 == 0) goto L_0x04a4
            r4.close()     // Catch:{ all -> 0x04a1 }
            goto L_0x04a4
        L_0x04a1:
            r0 = move-exception
            r1 = r0
            goto L_0x04b8
        L_0x04a4:
            if (r2 == 0) goto L_0x0467
            r2.close()     // Catch:{ IOException -> 0x05c4 }
            goto L_0x0467
        L_0x04aa:
            r0 = move-exception
            r1 = r0
            if (r4 == 0) goto L_0x04b7
            r4.close()     // Catch:{ all -> 0x04b2 }
            goto L_0x04b7
        L_0x04b2:
            r0 = move-exception
            r3 = r0
            r1.addSuppressed(r3)     // Catch:{ all -> 0x04a1 }
        L_0x04b7:
            throw r1     // Catch:{ all -> 0x04a1 }
        L_0x04b8:
            if (r2 == 0) goto L_0x04c3
            r2.close()     // Catch:{ all -> 0x04be }
            goto L_0x04c3
        L_0x04be:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ IOException -> 0x05c4 }
        L_0x04c3:
            throw r1     // Catch:{ IOException -> 0x05c4 }
        L_0x04c4:
            java.lang.String r2 = "Location"
            java.lang.String r0 = r0.getHeaderField(r2)     // Catch:{ IOException -> 0x05c4 }
            mx1 r2 = new mx1     // Catch:{ IOException -> 0x05c4 }
            java.net.URL r4 = new java.net.URL     // Catch:{ IOException -> 0x05c4 }
            r4.<init>(r0)     // Catch:{ IOException -> 0x05c4 }
            r6 = 0
            r2.<init>(r1, r4, r6)     // Catch:{ IOException -> 0x05c4 }
            r0 = r2
            goto L_0x0467
        L_0x04d8:
            r0 = move-exception
        L_0x04d9:
            r1 = r0
            goto L_0x0515
        L_0x04db:
            r0 = move-exception
            goto L_0x04e3
        L_0x04dd:
            r0 = move-exception
            goto L_0x04e8
        L_0x04df:
            r0 = move-exception
            r31 = r6
            goto L_0x04e8
        L_0x04e3:
            r1 = r0
            goto L_0x04ff
        L_0x04e5:
            r0 = move-exception
            r31 = r6
        L_0x04e8:
            r35 = r14
            goto L_0x04e3
        L_0x04eb:
            r0 = move-exception
            r31 = r6
            r33 = r10
            goto L_0x04e8
        L_0x04f1:
            r0 = move-exception
            goto L_0x04f6
        L_0x04f3:
            r0 = move-exception
            r22 = r1
        L_0x04f6:
            r31 = r6
            r33 = r10
            r35 = r14
            r29 = r15
            goto L_0x04e3
        L_0x04ff:
            r13.close()     // Catch:{ all -> 0x0503 }
            goto L_0x0508
        L_0x0503:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ all -> 0x04d8 }
        L_0x0508:
            throw r1     // Catch:{ all -> 0x04d8 }
        L_0x0509:
            r0 = move-exception
            r22 = r1
            r31 = r6
            r33 = r10
            r35 = r14
            r29 = r15
            goto L_0x04d9
        L_0x0515:
            if (r12 == 0) goto L_0x0520
            r12.close()     // Catch:{ all -> 0x051b }
            goto L_0x0520
        L_0x051b:
            r0 = move-exception
            r2 = r0
            r1.addSuppressed(r2)     // Catch:{ ConnectException | UnknownHostException -> 0x0544, EncodingException | IOException -> 0x052b }
        L_0x0520:
            throw r1     // Catch:{ ConnectException | UnknownHostException -> 0x0544, EncodingException | IOException -> 0x052b }
        L_0x0521:
            r22 = r1
            r31 = r6
            r33 = r10
            r35 = r14
            r29 = r15
        L_0x052b:
            defpackage.j1e.u(r9)     // Catch:{ IOException -> 0x05c4 }
            mx1 r0 = new mx1     // Catch:{ IOException -> 0x05c4 }
            r1 = 0
            r4 = 0
            r6 = 400(0x190, float:5.6E-43)
            r0.<init>(r6, r4, r1)     // Catch:{ IOException -> 0x05c4 }
            goto L_0x0467
        L_0x053a:
            r22 = r1
            r31 = r6
            r33 = r10
            r35 = r14
            r29 = r15
        L_0x0544:
            defpackage.j1e.u(r9)     // Catch:{ IOException -> 0x05c4 }
            mx1 r0 = new mx1     // Catch:{ IOException -> 0x05c4 }
            r1 = 0
            r4 = 0
            r6 = 500(0x1f4, float:7.0E-43)
            r0.<init>(r6, r4, r1)     // Catch:{ IOException -> 0x05c6 }
        L_0x0551:
            java.lang.Object r6 = r0.c     // Catch:{ IOException -> 0x05c6 }
            java.net.URL r6 = (java.net.URL) r6     // Catch:{ IOException -> 0x05c6 }
            if (r6 == 0) goto L_0x056d
            java.lang.String r7 = "Following redirect to: %s"
            defpackage.j1e.m(r9, r7, r6)     // Catch:{ IOException -> 0x05c6 }
            cjg r7 = new cjg     // Catch:{ IOException -> 0x05c6 }
            java.lang.Object r8 = r3.b     // Catch:{ IOException -> 0x05c6 }
            fl0 r8 = (defpackage.fl0) r8     // Catch:{ IOException -> 0x05c6 }
            java.lang.Object r3 = r3.c     // Catch:{ IOException -> 0x05c6 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x05c6 }
            s90 r8 = (defpackage.s90) r8     // Catch:{ IOException -> 0x05c6 }
            r7.<init>(r6, r8, r3)     // Catch:{ IOException -> 0x05c6 }
            r3 = r7
            goto L_0x056e
        L_0x056d:
            r3 = r4
        L_0x056e:
            if (r3 == 0) goto L_0x0580
            int r14 = r35 + -1
            r6 = 1
            if (r14 >= r6) goto L_0x0576
            goto L_0x0581
        L_0x0576:
            r1 = r22
            r15 = r29
            r6 = r31
            r10 = r33
            goto L_0x0374
        L_0x0580:
            r6 = 1
        L_0x0581:
            int r3 = r0.a     // Catch:{ IOException -> 0x05c6 }
            r4 = 200(0xc8, float:2.8E-43)
            if (r3 != r4) goto L_0x0590
            long r3 = r0.b     // Catch:{ IOException -> 0x05c6 }
            r90 r0 = new r90     // Catch:{ IOException -> 0x05c6 }
            r0.<init>(r6, r3)     // Catch:{ IOException -> 0x05c6 }
            goto L_0x005d
        L_0x0590:
            r4 = 500(0x1f4, float:7.0E-43)
            if (r3 >= r4) goto L_0x0598
            r0 = 404(0x194, float:5.66E-43)
            if (r3 != r0) goto L_0x059b
        L_0x0598:
            r3 = -1
            goto L_0x05b6
        L_0x059b:
            r4 = 400(0x190, float:5.6E-43)
            if (r3 != r4) goto L_0x05ac
            r90 r0 = new r90     // Catch:{ IOException -> 0x05a9 }
            r3 = -1
            r5 = 4
            r0.<init>(r5, r3)     // Catch:{ IOException -> 0x05c6 }
            goto L_0x005d
        L_0x05a9:
            r3 = -1
            goto L_0x05c6
        L_0x05ac:
            r3 = -1
            r90 r0 = new r90     // Catch:{ IOException -> 0x05c6 }
            r5 = 3
            r0.<init>(r5, r3)     // Catch:{ IOException -> 0x05c6 }
            goto L_0x005d
        L_0x05b6:
            r90 r0 = new r90     // Catch:{ IOException -> 0x05c6 }
            r5 = 2
            r0.<init>(r5, r3)     // Catch:{ IOException -> 0x05c6 }
            goto L_0x005d
        L_0x05be:
            r31 = r6
            r33 = r10
            r29 = r15
        L_0x05c4:
            r1 = 0
        L_0x05c6:
            defpackage.j1e.u(r9)
            r90 r0 = new r90
            r3 = 2
            r4 = -1
            r0.<init>(r3, r4)
        L_0x05d1:
            int r4 = r0.a
            if (r4 != r3) goto L_0x05f5
            vg4 r0 = new vg4
            r1 = r0
            r2 = r46
            r3 = r31
            r4 = r47
            r5 = r33
            r1.<init>((defpackage.t8f) r2, (java.lang.Iterable) r3, (defpackage.hc0) r4, (long) r5)
            r7 = r32
            r7.e0(r0)
            r3 = 1
            int r0 = r48 + 1
            r5 = r46
            z77 r1 = r5.d
            r6 = r47
            r1.a(r6, r0, r3)
            return
        L_0x05f5:
            r5 = r46
            r6 = r47
            r7 = r32
            r3 = 1
            ypc r8 = new ypc
            r9 = 16
            r10 = r31
            r8.<init>(r5, r9, r10)
            r7.e0(r8)
            if (r4 != r3) goto L_0x0621
            long r3 = r0.b
            r8 = r33
            long r10 = java.lang.Math.max(r8, r3)
            if (r29 == 0) goto L_0x061d
            gte r0 = new gte
            r3 = 6
            r0.<init>((int) r3, (java.lang.Object) r5)
            r7.e0(r0)
        L_0x061d:
            r8 = r10
            r3 = 4
        L_0x061f:
            r11 = 1
            goto L_0x066d
        L_0x0621:
            r8 = r33
            r3 = 4
            if (r4 != r3) goto L_0x061f
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Iterator r4 = r10.iterator()
        L_0x062f:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0662
            java.lang.Object r10 = r4.next()
            fb0 r10 = (defpackage.fb0) r10
            ja0 r10 = r10.c
            java.lang.String r10 = r10.a
            boolean r11 = r0.containsKey(r10)
            if (r11 != 0) goto L_0x064e
            r11 = 1
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)
            r0.put(r10, r12)
            goto L_0x062f
        L_0x064e:
            r11 = 1
            java.lang.Object r12 = r0.get(r10)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            int r12 = r12 + r11
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r0.put(r10, r12)
            goto L_0x062f
        L_0x0662:
            r11 = 1
            ypc r4 = new ypc
            r10 = 17
            r4.<init>(r5, r10, r0)
            r7.e0(r4)
        L_0x066d:
            r1 = r3
            r7 = r5
            r3 = r30
            r2 = 0
            r44 = r8
            r8 = r6
            r9 = r11
            r10 = r44
            goto L_0x0011
        L_0x067a:
            r5 = r7
            r6 = r8
            r8 = r10
            r7 = r12
            x72 r0 = new x72
            r10 = 11
            r1 = r0
            r2 = r46
            r3 = r47
            r4 = r8
            r6 = r10
            r1.<init>((java.lang.Object) r2, (java.lang.Object) r3, (long) r4, (int) r6)
            r7.e0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t8f.a(hc0, int):void");
    }
}
