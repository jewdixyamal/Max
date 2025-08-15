package defpackage;

import android.content.Context;
import java.util.HashMap;

/* renamed from: oc4  reason: default package */
public final class oc4 implements wj8 {
    public final od a;
    public q24 b;
    public mbe c;
    public final long d;
    public final long e;
    public final long f;
    public final float g;
    public final float h;
    public boolean i;

    /* JADX WARNING: type inference failed for: r3v1, types: [mbe, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v0, types: [od, java.lang.Object] */
    public oc4(Context context, va4 va4) {
        q24 h94 = new h94(context);
        this.b = h94;
        ? obj = new Object();
        this.c = obj;
        ? obj2 = new Object();
        obj2.b = va4;
        obj2.Y = obj;
        obj2.c = new HashMap();
        obj2.o = new HashMap();
        obj2.a = true;
        this.a = obj2;
        if (h94 != ((q24) obj2.X)) {
            obj2.X = h94;
            ((HashMap) obj2.c).clear();
            ((HashMap) obj2.o).clear();
        }
        this.d = -9223372036854775807L;
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -3.4028235E38f;
        this.h = -3.4028235E38f;
        this.i = true;
    }

    public static wj8 f(Class cls, q24 q24) {
        try {
            return (wj8) cls.getConstructor(new Class[]{q24.class}).newInstance(new Object[]{q24});
        } catch (Exception e2) {
            throw new IllegalStateException(e2);
        }
    }

    public final wj8 a() {
        fm9.i((Object) null, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final void b(boolean z) {
        this.i = z;
        od odVar = this.a;
        odVar.a = z;
        ((ra5) odVar.b).h(z);
        for (wj8 b2 : ((HashMap) odVar.o).values()) {
            b2.b(z);
        }
    }

    public final wj8 c() {
        fm9.i((Object) null, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        throw null;
    }

    public final void d(b46 b46) {
        b46.getClass();
        this.c = b46;
        od odVar = this.a;
        odVar.Y = b46;
        ((ra5) odVar.b).d(b46);
        for (wj8 d2 : ((HashMap) odVar.o).values()) {
            d2.d(b46);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: e43} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: bb8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v0, resolved type: db8} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: ba4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: pr4} */
    /* JADX WARNING: type inference failed for: r8v5, types: [huc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r16v0, types: [huc, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ej0 e(defpackage.tb8 r33) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r2 = 1
            ib8 r3 = r1.b
            r3.getClass()
            ib8 r3 = r1.b
            android.net.Uri r3 = r3.a
            java.lang.String r3 = r3.getScheme()
            r4 = 0
            if (r3 == 0) goto L_0x001f
            java.lang.String r5 = "ssai"
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            throw r4
        L_0x001f:
            ib8 r3 = r1.b
            java.lang.String r3 = r3.b
            java.lang.String r5 = "application/x-image-uri"
            boolean r3 = java.util.Objects.equals(r3, r5)
            if (r3 != 0) goto L_0x0257
            ib8 r3 = r1.b
            android.net.Uri r5 = r3.a
            java.lang.String r3 = r3.b
            int r3 = defpackage.oaf.J(r5, r3)
            ib8 r5 = r1.b
            long r5 = r5.i
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L_0x0056
            od r5 = r0.a
            java.lang.Object r5 = r5.b
            ra5 r5 = (defpackage.ra5) r5
            boolean r6 = r5 instanceof defpackage.va4
            if (r6 == 0) goto L_0x0056
            va4 r5 = (defpackage.va4) r5
            monitor-enter(r5)
            r5.Z = r2     // Catch:{ all -> 0x0053 }
            monitor-exit(r5)
            goto L_0x0056
        L_0x0053:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0053 }
            throw r0
        L_0x0056:
            od r5 = r0.a     // Catch:{ ClassNotFoundException -> 0x0250 }
            wj8 r3 = r5.c(r3)     // Catch:{ ClassNotFoundException -> 0x0250 }
            hb8 r5 = r1.c
            fb8 r5 = r5.a()
            hb8 r6 = r1.c
            long r9 = r6.a
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x006e
            long r9 = r0.d
            r5.a = r9
        L_0x006e:
            float r9 = r6.d
            r10 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x007b
            float r9 = r0.g
            r5.d = r9
        L_0x007b:
            float r9 = r6.e
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x0085
            float r9 = r0.h
            r5.e = r9
        L_0x0085:
            long r9 = r6.b
            int r9 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x008f
            long r9 = r0.e
            r5.b = r9
        L_0x008f:
            long r9 = r6.c
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x0099
            long r6 = r0.f
            r5.c = r6
        L_0x0099:
            hb8 r6 = new hb8
            r6.<init>(r5)
            hb8 r5 = r1.c
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L_0x00b4
            ya8 r1 = r33.a()
            fb8 r5 = r6.a()
            r1.m = r5
            tb8 r1 = r1.a()
        L_0x00b4:
            ej0 r3 = r3.e(r1)
            ib8 r5 = r1.b
            zw6 r5 = r5.g
            boolean r6 = r5.isEmpty()
            if (r6 != 0) goto L_0x0215
            int r6 = r5.size()
            int r6 = r6 + r2
            ej0[] r6 = new defpackage.ej0[r6]
            r7 = 0
            r6[r7] = r3
            r3 = r7
        L_0x00cd:
            int r8 = r5.size()
            if (r3 >= r8) goto L_0x0210
            boolean r8 = r0.i
            if (r8 == 0) goto L_0x01f3
            ny5 r8 = new ny5
            r8.<init>()
            java.lang.Object r9 = r5.get(r3)
            pb8 r9 = (defpackage.pb8) r9
            java.lang.String r9 = r9.b
            java.lang.String r9 = defpackage.ia9.l(r9)
            r8.m = r9
            java.lang.Object r9 = r5.get(r3)
            pb8 r9 = (defpackage.pb8) r9
            java.lang.String r9 = r9.c
            r8.d = r9
            java.lang.Object r9 = r5.get(r3)
            pb8 r9 = (defpackage.pb8) r9
            int r9 = r9.d
            r8.e = r9
            java.lang.Object r9 = r5.get(r3)
            pb8 r9 = (defpackage.pb8) r9
            int r9 = r9.e
            r8.f = r9
            java.lang.Object r9 = r5.get(r3)
            pb8 r9 = (defpackage.pb8) r9
            java.lang.String r9 = r9.f
            r8.b = r9
            java.lang.Object r9 = r5.get(r3)
            pb8 r9 = (defpackage.pb8) r9
            java.lang.String r9 = r9.g
            r8.a = r9
            qy5 r9 = new qy5
            r9.<init>(r8)
            d74 r8 = new d74
            r10 = 3
            r8.<init>(r0, r10, r9)
            q24 r13 = r0.b
            yt8 r14 = new yt8
            r9 = 24
            r14.<init>((int) r9, (java.lang.Object) r8)
            java.lang.Object r8 = new java.lang.Object
            r8.<init>()
            huc r16 = new huc
            r16.<init>()
            int r9 = r3 + 1
            java.lang.Object r10 = r5.get(r3)
            pb8 r10 = (defpackage.pb8) r10
            android.net.Uri r10 = r10.a
            java.lang.String r10 = r10.toString()
            za8 r11 = new za8
            r11.<init>()
            s74 r12 = new s74
            r12.<init>()
            java.util.List r22 = java.util.Collections.emptyList()
            ffc r24 = defpackage.ffc.X
            fb8 r15 = new fb8
            r15.<init>()
            lb8 r31 = defpackage.lb8.d
            if (r10 != 0) goto L_0x0164
            r18 = r4
            goto L_0x016a
        L_0x0164:
            android.net.Uri r10 = android.net.Uri.parse(r10)
            r18 = r10
        L_0x016a:
            java.lang.Object r10 = r12.e
            android.net.Uri r10 = (android.net.Uri) r10
            if (r10 == 0) goto L_0x0179
            java.lang.Object r10 = r12.d
            java.util.UUID r10 = (java.util.UUID) r10
            if (r10 == 0) goto L_0x0177
            goto L_0x0179
        L_0x0177:
            r10 = r7
            goto L_0x017a
        L_0x0179:
            r10 = r2
        L_0x017a:
            defpackage.fm9.k(r10)
            if (r18 == 0) goto L_0x01a4
            ib8 r10 = new ib8
            java.lang.Object r7 = r12.d
            java.util.UUID r7 = (java.util.UUID) r7
            if (r7 == 0) goto L_0x018f
            eb8 r7 = new eb8
            r7.<init>(r12)
            r20 = r7
            goto L_0x0191
        L_0x018f:
            r20 = r4
        L_0x0191:
            r21 = 0
            r23 = 0
            r19 = 0
            r25 = 0
            r26 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = r10
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            goto L_0x01a5
        L_0x01a4:
            r10 = r4
        L_0x01a5:
            tb8 r12 = new tb8
            db8 r7 = new db8
            r7.<init>(r11)
            hb8 r11 = new hb8
            r11.<init>(r15)
            gd8 r30 = defpackage.gd8.J
            java.lang.String r26 = ""
            r25 = r12
            r27 = r7
            r28 = r10
            r29 = r11
            r25.<init>(r26, r27, r28, r29, r30, r31)
            r10.getClass()
            aob r7 = new aob
            ib8 r10 = r12.b
            r10.getClass()
            ib8 r10 = r12.b
            eb8 r10 = r10.c
            if (r10 != 0) goto L_0x01d4
            pr4 r8 = defpackage.tr4.a
            r15 = r8
            goto L_0x01e8
        L_0x01d4:
            monitor-enter(r8)
            boolean r11 = r10.equals(r4)     // Catch:{ all -> 0x01e0 }
            if (r11 != 0) goto L_0x01e2
            ba4 r10 = defpackage.pl8.s(r10)     // Catch:{ all -> 0x01e0 }
            goto L_0x01e3
        L_0x01e0:
            r0 = move-exception
            goto L_0x01f1
        L_0x01e2:
            r10 = r4
        L_0x01e3:
            r10.getClass()     // Catch:{ all -> 0x01e0 }
            monitor-exit(r8)     // Catch:{ all -> 0x01e0 }
            r15 = r10
        L_0x01e8:
            r17 = 1048576(0x100000, float:1.469368E-39)
            r11 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r6[r9] = r7
            goto L_0x020c
        L_0x01f1:
            monitor-exit(r8)     // Catch:{ all -> 0x01e0 }
            throw r0
        L_0x01f3:
            q24 r7 = r0.b
            r7.getClass()
            huc r8 = new huc
            r8.<init>()
            int r9 = r3 + 1
            java.lang.Object r10 = r5.get(r3)
            pb8 r10 = (defpackage.pb8) r10
            qrd r11 = new qrd
            r11.<init>(r10, r7, r8)
            r6[r9] = r11
        L_0x020c:
            int r3 = r3 + r2
            r7 = 0
            goto L_0x00cd
        L_0x0210:
            cs8 r3 = new cs8
            r3.<init>(r6)
        L_0x0215:
            r8 = r3
            db8 r0 = r1.e
            long r9 = r0.b
            r3 = 0
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 != 0) goto L_0x022d
            long r3 = r0.d
            r5 = -9223372036854775808
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x022d
            boolean r3 = r0.f
            if (r3 != 0) goto L_0x022d
            goto L_0x023e
        L_0x022d:
            e43 r3 = new e43
            long r11 = r0.d
            boolean r4 = r0.g
            r13 = r4 ^ 1
            boolean r14 = r0.e
            boolean r15 = r0.f
            r7 = r3
            r7.<init>(r8, r9, r11, r13, r14, r15)
            r8 = r3
        L_0x023e:
            ib8 r0 = r1.b
            r0.getClass()
            ib8 r0 = r1.b
            xa8 r0 = r0.d
            if (r0 != 0) goto L_0x024a
            goto L_0x024f
        L_0x024a:
            java.lang.String r0 = "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider."
            defpackage.z04.c0(r0)
        L_0x024f:
            return r8
        L_0x0250:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        L_0x0257:
            ib8 r0 = r1.b
            long r0 = r0.i
            int r0 = defpackage.oaf.a
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oc4.e(tb8):ej0");
    }
}
