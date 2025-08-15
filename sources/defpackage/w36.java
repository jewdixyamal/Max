package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.Spatializer;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.apache.http.protocol.HTTP;

/* renamed from: w36  reason: default package */
public final class w36 implements wn0 {
    public boolean a;
    public Object b;
    public Object c;
    public Object o;

    public w36(die die, boolean z) {
        this.b = die;
        this.a = z;
        this.c = new SparseArray();
    }

    public static void h(float[] fArr, float[] fArr2) {
        Matrix.setIdentityM(fArr, 0);
        float f = fArr2[10];
        float f2 = fArr2[8];
        float sqrt = (float) Math.sqrt((double) ((f2 * f2) + (f * f)));
        float f3 = fArr2[10] / sqrt;
        fArr[0] = f3;
        float f4 = fArr2[8];
        fArr[2] = f4 / sqrt;
        fArr[8] = (-f4) / sqrt;
        fArr[10] = f3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] k(defpackage.q24 r16, java.lang.String r17, byte[] r18, java.util.Map r19) {
        /*
            u1e r1 = new u1e
            t24 r0 = r16.a()
            r1.<init>(r0)
            java.util.Collections.emptyMap()
            android.net.Uri r3 = android.net.Uri.parse(r17)
            java.lang.String r0 = "The uri must be set."
            defpackage.fm9.m(r3, r0)
            a34 r0 = new a34
            r14 = 1
            r15 = 0
            r4 = 0
            r6 = 2
            r9 = 0
            r11 = -1
            r13 = 0
            r2 = r0
            r7 = r18
            r8 = r19
            r2.<init>(r3, r4, r6, r7, r8, r9, r11, r13, r14, r15)
            r2 = 0
            r3 = r0
            r4 = r2
        L_0x002c:
            w24 r5 = new w24     // Catch:{ Exception -> 0x0039 }
            r5.<init>((defpackage.t24) r1, (defpackage.a34) r3)     // Catch:{ Exception -> 0x0039 }
            byte[] r0 = defpackage.zv0.b(r5)     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x003d }
            defpackage.oaf.h(r5)     // Catch:{ Exception -> 0x0039 }
            return r0
        L_0x0039:
            r0 = move-exception
            goto L_0x0083
        L_0x003b:
            r0 = move-exception
            goto L_0x007f
        L_0x003d:
            r0 = move-exception
            r6 = r0
            int r0 = r6.o     // Catch:{ all -> 0x003b }
            r7 = 307(0x133, float:4.3E-43)
            r8 = 0
            if (r0 == r7) goto L_0x004a
            r7 = 308(0x134, float:4.32E-43)
            if (r0 != r7) goto L_0x0068
        L_0x004a:
            r0 = 5
            if (r4 >= r0) goto L_0x0068
            java.util.Map r0 = r6.X     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0068
            java.lang.String r7 = "Location"
            java.lang.Object r0 = r0.get(r7)     // Catch:{ all -> 0x003b }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0068
            boolean r7 = r0.isEmpty()     // Catch:{ all -> 0x003b }
            if (r7 != 0) goto L_0x0068
            java.lang.Object r0 = r0.get(r2)     // Catch:{ all -> 0x003b }
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x003b }
        L_0x0068:
            if (r8 == 0) goto L_0x007e
            int r4 = r4 + 1
            y24 r0 = r3.a()     // Catch:{ all -> 0x003b }
            android.net.Uri r3 = android.net.Uri.parse(r8)     // Catch:{ all -> 0x003b }
            r0.b = r3     // Catch:{ all -> 0x003b }
            a34 r3 = r0.b()     // Catch:{ all -> 0x003b }
            defpackage.oaf.h(r5)     // Catch:{ Exception -> 0x0039 }
            goto L_0x002c
        L_0x007e:
            throw r6     // Catch:{ all -> 0x003b }
        L_0x007f:
            defpackage.oaf.h(r5)     // Catch:{ Exception -> 0x0039 }
            throw r0     // Catch:{ Exception -> 0x0039 }
        L_0x0083:
            androidx.media3.exoplayer.drm.MediaDrmCallbackException r2 = new androidx.media3.exoplayer.drm.MediaDrmCallbackException
            android.net.Uri r3 = r1.c
            r3.getClass()
            t24 r1 = r1.a
            r1.a()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w36.k(q24, java.lang.String, byte[], java.util.Map):byte[]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        r0 = r6.toByteArray();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        defpackage.maf.h(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0039, code lost:
        r7 = r5.read(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003e, code lost:
        if (r7 == -1) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        r6.write(r0, 0, r7);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] l(defpackage.xp6 r16, java.lang.String r17, byte[] r18, java.util.Map r19) {
        /*
            t1e r1 = new t1e
            yp6 r0 = r16.a()
            r1.<init>(r0)
            java.util.Collections.emptyMap()
            android.net.Uri r3 = android.net.Uri.parse(r17)
            if (r3 == 0) goto L_0x00a5
            z24 r0 = new z24
            r14 = 1
            r15 = 0
            r4 = 0
            r6 = 2
            r9 = 0
            r11 = -1
            r13 = 0
            r2 = r0
            r7 = r18
            r8 = r19
            r2.<init>(r3, r4, r6, r7, r8, r9, r11, r13, r14, r15)
            r2 = 0
            r3 = r0
            r4 = r2
        L_0x0029:
            w24 r5 = new w24     // Catch:{ Exception -> 0x004c }
            r5.<init>((defpackage.r24) r1, (defpackage.z24) r3)     // Catch:{ Exception -> 0x004c }
            int r0 = defpackage.maf.a     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x004e }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x004e }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x004e }
            r6.<init>()     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x004e }
        L_0x0039:
            int r7 = r5.read(r0)     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x004e }
            r8 = -1
            if (r7 == r8) goto L_0x0044
            r6.write(r0, r2, r7)     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x004e }
            goto L_0x0039
        L_0x0044:
            byte[] r0 = r6.toByteArray()     // Catch:{ HttpDataSource$InvalidResponseCodeException -> 0x004e }
            defpackage.maf.h(r5)     // Catch:{ Exception -> 0x004c }
            return r0
        L_0x004c:
            r0 = move-exception
            goto L_0x0095
        L_0x004e:
            r0 = move-exception
            int r6 = r0.c     // Catch:{ all -> 0x008e }
            r7 = 307(0x133, float:4.3E-43)
            r8 = 0
            if (r6 == r7) goto L_0x005a
            r7 = 308(0x134, float:4.32E-43)
            if (r6 != r7) goto L_0x0078
        L_0x005a:
            r6 = 5
            if (r4 >= r6) goto L_0x0078
            java.util.Map r6 = r0.o     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x0078
            java.lang.String r7 = "Location"
            java.lang.Object r6 = r6.get(r7)     // Catch:{ all -> 0x008e }
            java.util.List r6 = (java.util.List) r6     // Catch:{ all -> 0x008e }
            if (r6 == 0) goto L_0x0078
            boolean r7 = r6.isEmpty()     // Catch:{ all -> 0x008e }
            if (r7 != 0) goto L_0x0078
            java.lang.Object r6 = r6.get(r2)     // Catch:{ all -> 0x008e }
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x008e }
        L_0x0078:
            if (r8 == 0) goto L_0x0090
            int r4 = r4 + 1
            y24 r0 = r3.a()     // Catch:{ all -> 0x008e }
            android.net.Uri r3 = android.net.Uri.parse(r8)     // Catch:{ all -> 0x008e }
            r0.b = r3     // Catch:{ all -> 0x008e }
            z24 r3 = r0.a()     // Catch:{ all -> 0x008e }
            defpackage.maf.h(r5)     // Catch:{ Exception -> 0x004c }
            goto L_0x0029
        L_0x008e:
            r0 = move-exception
            goto L_0x0091
        L_0x0090:
            throw r0     // Catch:{ all -> 0x008e }
        L_0x0091:
            defpackage.maf.h(r5)     // Catch:{ Exception -> 0x004c }
            throw r0     // Catch:{ Exception -> 0x004c }
        L_0x0095:
            com.google.android.exoplayer2.drm.MediaDrmCallbackException r2 = new com.google.android.exoplayer2.drm.MediaDrmCallbackException
            android.net.Uri r3 = r1.c
            r3.getClass()
            r24 r1 = r1.a
            r1.a()
            r2.<init>(r0)
            throw r2
        L_0x00a5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "The uri must be set."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w36.l(xp6, java.lang.String, byte[], java.util.Map):byte[]");
    }

    public synchronized boolean a(int i) {
        boolean containsKey;
        die die = (die) this.b;
        cf cfVar = new cf((ww0) die.a, i);
        nw7 nw7 = (nw7) ((jy3) die.b);
        synchronized (nw7) {
            jn jnVar = nw7.c;
            synchronized (jnVar) {
                containsKey = ((LinkedHashMap) jnVar.o).containsKey(cfVar);
            }
        }
        return containsKey;
    }

    public synchronized o43 b() {
        return vu4.l(o43.o((v84) this.o));
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:16:0x0041=Splitter:B:16:0x0041, B:9:0x0038=Splitter:B:9:0x0038} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void c(int r4, defpackage.o43 r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            r3.u(r4)     // Catch:{ all -> 0x003d }
            hx6 r0 = defpackage.hx6.d     // Catch:{ all -> 0x003f }
            r1 = 0
            com.facebook.imagepipeline.image.CloseableStaticBitmap r5 = com.facebook.imagepipeline.image.CloseableStaticBitmap.of(r5, r0, r1)     // Catch:{ all -> 0x003f }
            v84 r5 = defpackage.o43.o0(r5)     // Catch:{ all -> 0x003f }
            if (r5 == 0) goto L_0x0038
            java.lang.Object r0 = r3.o     // Catch:{ all -> 0x0036 }
            v84 r0 = (defpackage.v84) r0     // Catch:{ all -> 0x0036 }
            defpackage.o43.S(r0)     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r3.b     // Catch:{ all -> 0x0036 }
            die r0 = (defpackage.die) r0     // Catch:{ all -> 0x0036 }
            cf r1 = new cf     // Catch:{ all -> 0x0036 }
            java.lang.Object r2 = r0.a     // Catch:{ all -> 0x0036 }
            ww0 r2 = (defpackage.ww0) r2     // Catch:{ all -> 0x0036 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0036 }
            java.lang.Object r4 = r0.b     // Catch:{ all -> 0x0036 }
            jy3 r4 = (defpackage.jy3) r4     // Catch:{ all -> 0x0036 }
            nw7 r4 = (defpackage.nw7) r4     // Catch:{ all -> 0x0036 }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x0036 }
            w4d r0 = (defpackage.w4d) r0     // Catch:{ all -> 0x0036 }
            v84 r4 = r4.a(r1, r5, r0)     // Catch:{ all -> 0x0036 }
            r3.o = r4     // Catch:{ all -> 0x0036 }
            goto L_0x0038
        L_0x0036:
            r4 = move-exception
            goto L_0x0041
        L_0x0038:
            defpackage.o43.S(r5)     // Catch:{ all -> 0x003d }
            monitor-exit(r3)
            return
        L_0x003d:
            r4 = move-exception
            goto L_0x0045
        L_0x003f:
            r4 = move-exception
            r5 = 0
        L_0x0041:
            defpackage.o43.S(r5)     // Catch:{ all -> 0x003d }
            throw r4     // Catch:{ all -> 0x003d }
        L_0x0045:
            monitor-exit(r3)     // Catch:{ all -> 0x003d }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w36.c(int, o43):void");
    }

    public synchronized void clear() {
        try {
            o43.S((v84) this.o);
            this.o = null;
            int size = ((SparseArray) this.c).size();
            for (int i = 0; i < size; i++) {
                o43.S((o43) ((SparseArray) this.c).valueAt(i));
            }
            ((SparseArray) this.c).clear();
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0063=Splitter:B:20:0x0063, B:14:0x005c=Splitter:B:14:0x005c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void d(int r4, defpackage.o43 r5) {
        /*
            r3 = this;
            monitor-enter(r3)
            hx6 r0 = defpackage.hx6.d     // Catch:{ all -> 0x0061 }
            r1 = 0
            com.facebook.imagepipeline.image.CloseableStaticBitmap r5 = com.facebook.imagepipeline.image.CloseableStaticBitmap.of(r5, r0, r1)     // Catch:{ all -> 0x0061 }
            v84 r5 = defpackage.o43.o0(r5)     // Catch:{ all -> 0x0061 }
            if (r5 != 0) goto L_0x0015
            defpackage.o43.S(r5)     // Catch:{ all -> 0x0013 }
            monitor-exit(r3)
            return
        L_0x0013:
            r4 = move-exception
            goto L_0x0067
        L_0x0015:
            java.lang.Object r0 = r3.b     // Catch:{ all -> 0x005a }
            die r0 = (defpackage.die) r0     // Catch:{ all -> 0x005a }
            cf r1 = new cf     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r0.a     // Catch:{ all -> 0x005a }
            ww0 r2 = (defpackage.ww0) r2     // Catch:{ all -> 0x005a }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r0.b     // Catch:{ all -> 0x005a }
            jy3 r2 = (defpackage.jy3) r2     // Catch:{ all -> 0x005a }
            nw7 r2 = (defpackage.nw7) r2     // Catch:{ all -> 0x005a }
            java.lang.Object r0 = r0.c     // Catch:{ all -> 0x005a }
            w4d r0 = (defpackage.w4d) r0     // Catch:{ all -> 0x005a }
            v84 r0 = r2.a(r1, r5, r0)     // Catch:{ all -> 0x005a }
            boolean r1 = defpackage.o43.n0(r0)     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r3.c     // Catch:{ all -> 0x005a }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x005a }
            o43 r1 = (defpackage.o43) r1     // Catch:{ all -> 0x005a }
            defpackage.o43.S(r1)     // Catch:{ all -> 0x005a }
            java.lang.Object r1 = r3.c     // Catch:{ all -> 0x005a }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x005a }
            r1.put(r4, r0)     // Catch:{ all -> 0x005a }
            java.lang.Class<w36> r0 = defpackage.w36.class
            java.lang.String r1 = "cachePreparedFrame(%d) cached. Pending frames: %s"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x005a }
            java.lang.Object r2 = r3.c     // Catch:{ all -> 0x005a }
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch:{ all -> 0x005a }
            defpackage.ta5.e(r0, r1, r4, r2)     // Catch:{ all -> 0x005a }
            goto L_0x005c
        L_0x005a:
            r4 = move-exception
            goto L_0x0063
        L_0x005c:
            defpackage.o43.S(r5)     // Catch:{ all -> 0x0013 }
            monitor-exit(r3)
            return
        L_0x0061:
            r4 = move-exception
            r5 = 0
        L_0x0063:
            defpackage.o43.S(r5)     // Catch:{ all -> 0x0013 }
            throw r4     // Catch:{ all -> 0x0013 }
        L_0x0067:
            monitor-exit(r3)     // Catch:{ all -> 0x0013 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w36.d(int, o43):void");
    }

    public synchronized o43 e() {
        if (!this.a) {
            return null;
        }
        return vu4.l(((die) this.b).t());
    }

    /* JADX WARNING: CFG modification limit reached, blocks count: 111 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized defpackage.o43 f(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.Object r0 = r3.b     // Catch:{ all -> 0x0020 }
            die r0 = (defpackage.die) r0     // Catch:{ all -> 0x0020 }
            cf r1 = new cf     // Catch:{ all -> 0x0020 }
            java.lang.Object r2 = r0.a     // Catch:{ all -> 0x0020 }
            ww0 r2 = (defpackage.ww0) r2     // Catch:{ all -> 0x0020 }
            r1.<init>(r2, r4)     // Catch:{ all -> 0x0020 }
            java.lang.Object r4 = r0.b     // Catch:{ all -> 0x0020 }
            jy3 r4 = (defpackage.jy3) r4     // Catch:{ all -> 0x0020 }
            nw7 r4 = (defpackage.nw7) r4     // Catch:{ all -> 0x0020 }
            o43 r4 = r4.get(r1)     // Catch:{ all -> 0x0020 }
            o43 r4 = defpackage.vu4.l(r4)     // Catch:{ all -> 0x0020 }
            monitor-exit(r3)
            return r4
        L_0x001e:
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            throw r4
        L_0x0020:
            r4 = move-exception
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w36.f(int):o43");
    }

    public boolean g(h30 h30, qy5 qy5) {
        boolean equals = "audio/eac3-joc".equals(qy5.n);
        int i = qy5.B;
        if (equals && i == 16) {
            i = 12;
        }
        int t = oaf.t(i);
        if (t == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(t);
        int i2 = qy5.C;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        return ((Spatializer) this.b).canBeSpatialized((AudioAttributes) h30.b().a, channelMask.build());
    }

    public byte[] i(UUID uuid, o65 o65) {
        UUID uuid2 = uuid;
        o65 o652 = o65;
        String str = o652.b;
        if (this.a || TextUtils.isEmpty(str)) {
            str = (String) this.c;
        }
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            UUID uuid3 = bw0.e;
            hashMap.put(HTTP.CONTENT_TYPE, uuid3.equals(uuid2) ? "text/xml" : bw0.c.equals(uuid2) ? "application/json" : "application/octet-stream");
            if (uuid3.equals(uuid2)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (((HashMap) this.o)) {
                hashMap.putAll((HashMap) this.o);
            }
            return l((xp6) this.b, str, o652.a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        if (uri != null) {
            new z24(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 0, (Object) null);
            throw new IOException(new IllegalStateException("No license URL"));
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public byte[] j(UUID uuid, p65 p65) {
        UUID uuid2 = uuid;
        p65 p652 = p65;
        String str = p652.b;
        if (this.a || TextUtils.isEmpty(str)) {
            str = (String) this.c;
        }
        if (!TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            UUID uuid3 = ew0.e;
            hashMap.put(HTTP.CONTENT_TYPE, uuid3.equals(uuid2) ? "text/xml" : ew0.c.equals(uuid2) ? "application/json" : "application/octet-stream");
            if (uuid3.equals(uuid2)) {
                hashMap.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
            }
            synchronized (((HashMap) this.o)) {
                hashMap.putAll((HashMap) this.o);
            }
            return k((q24) this.b, str, p652.a, hashMap);
        }
        Map emptyMap = Collections.emptyMap();
        Uri uri = Uri.EMPTY;
        fm9.m(uri, "The uri must be set.");
        new a34(uri, 0, 1, (byte[]) null, emptyMap, 0, -1, (String) null, 0, (Object) null);
        throw new IOException(new IllegalStateException("No license URL"));
    }

    public byte[] m(q65 q65) {
        String n = maf.n(q65.a);
        String str = q65.b;
        StringBuilder sb = new StringBuilder(n.length() + rh4.e(15, str));
        sb.append(str);
        sb.append("&signedRequest=");
        sb.append(n);
        return l((xp6) this.b, sb.toString(), (byte[]) null, Collections.emptyMap());
    }

    public byte[] n(r65 r65) {
        return k((q24) this.b, r65.b + "&signedRequest=" + oaf.q(r65.a), (byte[]) null, Collections.emptyMap());
    }

    public int[] o() {
        synchronized (this) {
            try {
                if (!this.a) {
                    return null;
                }
                long[] jArr = (long[]) this.b;
                int length = jArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    int i4 = 1;
                    boolean z = jArr[i] > 0;
                    boolean[] zArr = (boolean[]) this.c;
                    if (z != zArr[i2]) {
                        int[] iArr = (int[]) this.o;
                        if (!z) {
                            i4 = 2;
                        }
                        iArr[i2] = i4;
                    } else {
                        ((int[]) this.o)[i2] = 0;
                    }
                    zArr[i2] = z;
                    i++;
                    i2 = i3;
                }
                this.a = false;
                int[] iArr2 = (int[]) ((int[]) this.o).clone();
                return iArr2;
            } finally {
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, av1] */
    public synchronized void p() {
        try {
            if (!this.a) {
                Boolean t = t();
                this.c = t;
                if (t == null) {
                    ((r35) ((wae) this.b)).a(new Object());
                }
                this.a = true;
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public synchronized boolean q() {
        boolean z;
        boolean z2;
        try {
            p();
            Boolean bool = (Boolean) this.c;
            if (bool != null) {
                z = bool.booleanValue();
            } else {
                fl5 fl5 = ((FirebaseMessaging) this.o).a;
                fl5.a();
                h24 h24 = (h24) fl5.g.get();
                synchronized (h24) {
                    z2 = h24.a;
                }
                z = z2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        r2 = ((android.graphics.Rect) r2.f).height();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean r(defpackage.ve r3) {
        /*
            r2 = this;
            int r0 = r3.a
            if (r0 != 0) goto L_0x0026
            int r0 = r3.b
            if (r0 != 0) goto L_0x0026
            java.lang.Object r2 = r2.b
            ue r2 = (defpackage.ue) r2
            java.lang.Object r0 = r2.f
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r0 = r0.width()
            int r1 = r3.c
            if (r1 != r0) goto L_0x0026
            java.lang.Object r2 = r2.f
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            int r2 = r2.height()
            int r3 = r3.d
            if (r3 != r2) goto L_0x0026
            r2 = 1
            goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w36.r(ve):boolean");
    }

    public boolean s(int i) {
        if (i == 0) {
            return true;
        }
        ve[] veVarArr = (ve[]) ((ue) this.b).h;
        ve veVar = veVarArr[i];
        ve veVar2 = veVarArr[i - 1];
        veVar.getClass();
        return veVar2.e == 2 && r(veVar2);
    }

    public Boolean t() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        fl5 fl5 = ((FirebaseMessaging) this.o).a;
        fl5.a();
        Context context = fl5.a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public synchronized void u(int i) {
        o43 o43 = (o43) ((SparseArray) this.c).get(i);
        if (o43 != null) {
            ((SparseArray) this.c).delete(i);
            o43.S(o43);
            ta5.e(w36.class, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i), (SparseArray) this.c);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008e, code lost:
        r17 = r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void v(android.graphics.Bitmap r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = 0
            r4 = 1
            java.lang.Object r5 = r0.b
            ue r5 = (defpackage.ue) r5
            boolean r6 = r0.a
            if (r6 == 0) goto L_0x0044
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r1)
            java.lang.Object r1 = r5.e
            com.facebook.animated.gif.GifImage r1 = (com.facebook.animated.gif.GifImage) r1
            com.facebook.animated.gif.GifFrame r6 = r1.d(r2)
            ve r7 = r1.g(r2)
            if (r2 != 0) goto L_0x0024
            goto L_0x0029
        L_0x0024:
            int r2 = r2 - r4
            ve r3 = r1.g(r2)
        L_0x0029:
            int r1 = r6.d()     // Catch:{ all -> 0x003a }
            if (r1 <= 0) goto L_0x003c
            int r1 = r6.c()     // Catch:{ all -> 0x003a }
            if (r1 > 0) goto L_0x0036
            goto L_0x003c
        L_0x0036:
            r5.h(r0, r6, r7, r3)     // Catch:{ all -> 0x003a }
            goto L_0x003c
        L_0x003a:
            r0 = move-exception
            goto L_0x0040
        L_0x003c:
            r6.a()
            return
        L_0x0040:
            r6.a()
            throw r0
        L_0x0044:
            android.graphics.Canvas r13 = new android.graphics.Canvas
            r13.<init>(r1)
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC
            r7 = 0
            r13.drawColor(r7, r1)
            boolean r1 = r0.s(r2)
            java.lang.Object r8 = r0.o
            r14 = r8
            android.graphics.Paint r14 = (android.graphics.Paint) r14
            r15 = 2
            r12 = 3
            java.lang.Object r8 = r0.c
            r11 = r8
            fd7 r11 = (defpackage.fd7) r11
            if (r1 != 0) goto L_0x00eb
            int r1 = r2 + -1
        L_0x0063:
            if (r1 < 0) goto L_0x008e
            java.lang.Cloneable r8 = r5.h
            ve[] r8 = (defpackage.ve[]) r8
            r8 = r8[r1]
            int r9 = r8.e
            if (r9 != r4) goto L_0x0071
        L_0x006f:
            r8 = r4
            goto L_0x0080
        L_0x0071:
            if (r9 != r15) goto L_0x007b
            boolean r8 = r0.r(r8)
            if (r8 == 0) goto L_0x006f
            r8 = r15
            goto L_0x0080
        L_0x007b:
            if (r9 != r12) goto L_0x007f
            r8 = r12
            goto L_0x0080
        L_0x007f:
            r8 = 4
        L_0x0080:
            int r8 = defpackage.au1.s(r8)
            if (r8 == 0) goto L_0x0095
            if (r8 == r4) goto L_0x0092
            if (r8 == r12) goto L_0x008d
            r17 = r11
            goto L_0x00e5
        L_0x008d:
            r7 = r1
        L_0x008e:
            r17 = r11
            goto L_0x00ee
        L_0x0092:
            int r7 = r1 + 1
            goto L_0x008e
        L_0x0095:
            java.lang.Cloneable r8 = r5.h
            ve[] r8 = (defpackage.ve[]) r8
            r8 = r8[r1]
            o43 r16 = r11.F(r1)
            if (r16 == 0) goto L_0x00db
            java.lang.Object r0 = r16.e0()     // Catch:{ all -> 0x00d4 }
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0     // Catch:{ all -> 0x00d4 }
            r4 = 0
            r13.drawBitmap(r0, r4, r4, r3)     // Catch:{ all -> 0x00d4 }
            int r0 = r8.e     // Catch:{ all -> 0x00d4 }
            if (r0 != r15) goto L_0x00c8
            int r0 = r8.a     // Catch:{ all -> 0x00d4 }
            float r3 = (float) r0     // Catch:{ all -> 0x00d4 }
            int r4 = r8.b     // Catch:{ all -> 0x00d4 }
            float r9 = (float) r4     // Catch:{ all -> 0x00d4 }
            int r7 = r8.c     // Catch:{ all -> 0x00d4 }
            int r0 = r0 + r7
            float r10 = (float) r0     // Catch:{ all -> 0x00d4 }
            int r0 = r8.d     // Catch:{ all -> 0x00d4 }
            int r4 = r4 + r0
            float r0 = (float) r4     // Catch:{ all -> 0x00d4 }
            r7 = r13
            r8 = r3
            r17 = r11
            r11 = r0
            r0 = r12
            r12 = r14
            r7.drawRect(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00d4 }
            goto L_0x00cb
        L_0x00c8:
            r17 = r11
            r0 = r12
        L_0x00cb:
            int r7 = r1 + 1
            if (r6 != 0) goto L_0x00d2
            r16.close()
        L_0x00d2:
            r12 = r0
            goto L_0x00ee
        L_0x00d4:
            r0 = move-exception
            if (r6 != 0) goto L_0x00da
            r16.close()
        L_0x00da:
            throw r0
        L_0x00db:
            r17 = r11
            boolean r8 = r0.s(r1)
            if (r8 == 0) goto L_0x00e5
            r7 = r1
            goto L_0x00ee
        L_0x00e5:
            int r1 = r1 + -1
            r11 = r17
            goto L_0x0063
        L_0x00eb:
            r17 = r11
            r7 = r2
        L_0x00ee:
            r0 = r7
        L_0x00ef:
            if (r0 >= r2) goto L_0x011d
            java.lang.Cloneable r1 = r5.h
            ve[] r1 = (defpackage.ve[]) r1
            r1 = r1[r0]
            int r3 = r1.e
            if (r3 != r12) goto L_0x00fd
        L_0x00fb:
            r1 = r12
            goto L_0x0119
        L_0x00fd:
            r5.f(r13, r0)
            r17.getClass()
            if (r3 != r15) goto L_0x00fb
            int r3 = r1.a
            float r8 = (float) r3
            int r4 = r1.b
            float r9 = (float) r4
            int r6 = r1.c
            int r3 = r3 + r6
            float r10 = (float) r3
            int r1 = r1.d
            int r4 = r4 + r1
            float r11 = (float) r4
            r7 = r13
            r1 = r12
            r12 = r14
            r7.drawRect(r8, r9, r10, r11, r12)
        L_0x0119:
            int r0 = r0 + 1
            r12 = r1
            goto L_0x00ef
        L_0x011d:
            java.lang.Cloneable r0 = r5.h
            ve[] r0 = (defpackage.ve[]) r0
            r0 = r0[r2]
            r0.getClass()
            r5.f(r13, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w36.v(android.graphics.Bitmap, int):void");
    }

    public w36(ue ueVar, boolean z, fd7 fd7) {
        this.b = ueVar;
        this.c = fd7;
        this.a = z;
        Paint paint = new Paint();
        this.o = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }
}
