package defpackage;

/* renamed from: fo0  reason: default package */
public class fo0 implements dab {
    public final /* synthetic */ int a;
    public final lq8 b;
    public final o84 c;
    public final dab d;

    public /* synthetic */ fo0(lq8 lq8, o84 o84, dab dab, int i) {
        this.a = i;
        this.b = lq8;
        this.c = o84;
        this.d = dab;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e7, code lost:
        if (r7 != false) goto L_0x01e9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.fi0 r13, defpackage.eab r14) {
        /*
            r12 = this;
            int r0 = r12.a
            switch(r0) {
                case 0: goto L_0x0155;
                case 1: goto L_0x0080;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = r14
            oj0 r0 = (defpackage.oj0) r0
            hab r1 = r0.c
            wv6 r2 = r0.a
            q6b r3 = r2.q
            dab r4 = r12.d
            if (r3 == 0) goto L_0x007c
            ww0 r3 = r3.b()
            if (r3 != 0) goto L_0x0019
            goto L_0x007c
        L_0x0019:
            java.lang.String r3 = "PostprocessedBitmapMemoryCacheProducer"
            r1.j(r14, r3)
            o84 r5 = r12.c
            java.lang.Object r6 = r0.o
            do0 r5 = r5.j(r2, r6)
            r6 = 1
            boolean r7 = r2.d(r6)
            lq8 r12 = r12.b
            r8 = 0
            if (r7 == 0) goto L_0x0035
            o43 r7 = r12.get(r5)
            goto L_0x0036
        L_0x0035:
            r7 = r8
        L_0x0036:
            java.lang.String r9 = "cached_value_found"
            if (r7 == 0) goto L_0x005f
            boolean r12 = r1.i(r14, r3)
            if (r12 == 0) goto L_0x0046
            java.lang.String r12 = "true"
            java.util.Map r8 = defpackage.dx6.a(r9, r12)
        L_0x0046:
            r1.a(r14, r3, r8)
            r1.e(r14, r3, r6)
            java.lang.String r12 = "memory_bitmap"
            java.lang.String r14 = "postprocessed"
            r0.h(r12, r14)
            r12 = 1065353216(0x3f800000, float:1.0)
            r13.i(r12)
            r13.g(r6, r7)
            r7.close()
            goto L_0x007f
        L_0x005f:
            r0 = 2
            boolean r0 = r2.d(r0)
            h05 r2 = new h05
            r2.<init>((defpackage.fi0) r13, (defpackage.do0) r5, (defpackage.lq8) r12, (boolean) r0)
            boolean r12 = r1.i(r14, r3)
            if (r12 == 0) goto L_0x0075
            java.lang.String r12 = "false"
            java.util.Map r8 = defpackage.dx6.a(r9, r12)
        L_0x0075:
            r1.a(r14, r3, r8)
            r4.a(r2, r14)
            goto L_0x007f
        L_0x007c:
            r4.a(r13, r14)
        L_0x007f:
            return
        L_0x0080:
            java.lang.String r0 = "EncodedMemoryCacheProducer"
            defpackage.f46.I()     // Catch:{ all -> 0x00b1 }
            r1 = r14
            oj0 r1 = (defpackage.oj0) r1     // Catch:{ all -> 0x00b1 }
            hab r1 = r1.c     // Catch:{ all -> 0x00b1 }
            r1.j(r14, r0)     // Catch:{ all -> 0x00b1 }
            r2 = r14
            oj0 r2 = (defpackage.oj0) r2     // Catch:{ all -> 0x00b1 }
            wv6 r2 = r2.a     // Catch:{ all -> 0x00b1 }
            o84 r3 = r12.c     // Catch:{ all -> 0x00b1 }
            r3.getClass()     // Catch:{ all -> 0x00b1 }
            android.net.Uri r2 = r2.b     // Catch:{ all -> 0x00b1 }
            tpd r2 = r3.d(r2)     // Catch:{ all -> 0x00b1 }
            r3 = r14
            oj0 r3 = (defpackage.oj0) r3     // Catch:{ all -> 0x00b1 }
            wv6 r3 = r3.a     // Catch:{ all -> 0x00b1 }
            r4 = 4
            boolean r3 = r3.d(r4)     // Catch:{ all -> 0x00b1 }
            lq8 r4 = r12.b
            r5 = 0
            if (r3 == 0) goto L_0x00b4
            o43 r3 = r4.get(r2)     // Catch:{ all -> 0x00b1 }
            goto L_0x00b5
        L_0x00b1:
            r12 = move-exception
            goto L_0x0151
        L_0x00b4:
            r3 = r5
        L_0x00b5:
            java.lang.String r6 = "memory_encoded"
            r7 = 1
            java.lang.String r8 = "cached_value_found"
            if (r3 == 0) goto L_0x00f5
            g05 r12 = new g05     // Catch:{ all -> 0x00ef }
            r12.<init>(r3)     // Catch:{ all -> 0x00ef }
            boolean r2 = r1.i(r14, r0)     // Catch:{ all -> 0x00ce }
            if (r2 == 0) goto L_0x00d0
            java.lang.String r2 = "true"
            java.util.Map r5 = defpackage.dx6.a(r8, r2)     // Catch:{ all -> 0x00ce }
            goto L_0x00d0
        L_0x00ce:
            r13 = move-exception
            goto L_0x00f1
        L_0x00d0:
            r1.a(r14, r0, r5)     // Catch:{ all -> 0x00ce }
            r1.e(r14, r0, r7)     // Catch:{ all -> 0x00ce }
            oj0 r14 = (defpackage.oj0) r14     // Catch:{ all -> 0x00ce }
            java.lang.String r0 = "default"
            r14.h(r6, r0)     // Catch:{ all -> 0x00ce }
            r14 = 1065353216(0x3f800000, float:1.0)
            r13.i(r14)     // Catch:{ all -> 0x00ce }
            r13.g(r7, r12)     // Catch:{ all -> 0x00ce }
            defpackage.g05.d(r12)     // Catch:{ all -> 0x00ef }
        L_0x00e8:
            defpackage.o43.S(r3)     // Catch:{ all -> 0x00b1 }
            defpackage.f46.I()
            goto L_0x014c
        L_0x00ef:
            r12 = move-exception
            goto L_0x014d
        L_0x00f1:
            defpackage.g05.d(r12)     // Catch:{ all -> 0x00ef }
            throw r13     // Catch:{ all -> 0x00ef }
        L_0x00f5:
            r9 = r14
            oj0 r9 = (defpackage.oj0) r9     // Catch:{ all -> 0x00ef }
            vv6 r9 = r9.X     // Catch:{ all -> 0x00ef }
            int r9 = r9.a     // Catch:{ all -> 0x00ef }
            r10 = 3
            java.lang.String r11 = "false"
            if (r9 < r10) goto L_0x011f
            boolean r12 = r1.i(r14, r0)     // Catch:{ all -> 0x00ef }
            if (r12 == 0) goto L_0x010c
            java.util.Map r12 = defpackage.dx6.a(r8, r11)     // Catch:{ all -> 0x00ef }
            goto L_0x010d
        L_0x010c:
            r12 = r5
        L_0x010d:
            r1.a(r14, r0, r12)     // Catch:{ all -> 0x00ef }
            r12 = 0
            r1.e(r14, r0, r12)     // Catch:{ all -> 0x00ef }
            java.lang.String r12 = "nil-result"
            oj0 r14 = (defpackage.oj0) r14     // Catch:{ all -> 0x00ef }
            r14.h(r6, r12)     // Catch:{ all -> 0x00ef }
            r13.g(r7, r5)     // Catch:{ all -> 0x00ef }
            goto L_0x00e8
        L_0x011f:
            h05 r6 = new h05     // Catch:{ all -> 0x00ef }
            r7 = r14
            oj0 r7 = (defpackage.oj0) r7     // Catch:{ all -> 0x00ef }
            wv6 r7 = r7.a     // Catch:{ all -> 0x00ef }
            r9 = 8
            boolean r7 = r7.d(r9)     // Catch:{ all -> 0x00ef }
            r9 = r14
            oj0 r9 = (defpackage.oj0) r9     // Catch:{ all -> 0x00ef }
            kv6 r9 = r9.w0     // Catch:{ all -> 0x00ef }
            ho9 r9 = r9.v     // Catch:{ all -> 0x00ef }
            r9.getClass()     // Catch:{ all -> 0x00ef }
            r6.<init>((defpackage.fi0) r13, (defpackage.lq8) r4, (defpackage.tpd) r2, (boolean) r7)     // Catch:{ all -> 0x00ef }
            boolean r13 = r1.i(r14, r0)     // Catch:{ all -> 0x00ef }
            if (r13 == 0) goto L_0x0143
            java.util.Map r5 = defpackage.dx6.a(r8, r11)     // Catch:{ all -> 0x00ef }
        L_0x0143:
            r1.a(r14, r0, r5)     // Catch:{ all -> 0x00ef }
            dab r12 = r12.d     // Catch:{ all -> 0x00ef }
            r12.a(r6, r14)     // Catch:{ all -> 0x00ef }
            goto L_0x00e8
        L_0x014c:
            return
        L_0x014d:
            defpackage.o43.S(r3)     // Catch:{ all -> 0x00b1 }
            throw r12     // Catch:{ all -> 0x00b1 }
        L_0x0151:
            defpackage.f46.I()
            throw r12
        L_0x0155:
            defpackage.f46.I()     // Catch:{ all -> 0x0188 }
            r0 = r14
            oj0 r0 = (defpackage.oj0) r0     // Catch:{ all -> 0x0188 }
            hab r0 = r0.c     // Catch:{ all -> 0x0188 }
            java.lang.String r1 = r12.d()     // Catch:{ all -> 0x0188 }
            r0.j(r14, r1)     // Catch:{ all -> 0x0188 }
            r1 = r14
            oj0 r1 = (defpackage.oj0) r1     // Catch:{ all -> 0x0188 }
            wv6 r1 = r1.a     // Catch:{ all -> 0x0188 }
            r2 = r14
            oj0 r2 = (defpackage.oj0) r2     // Catch:{ all -> 0x0188 }
            java.lang.Object r2 = r2.o     // Catch:{ all -> 0x0188 }
            o84 r3 = r12.c     // Catch:{ all -> 0x0188 }
            do0 r1 = r3.b(r1, r2)     // Catch:{ all -> 0x0188 }
            r2 = r14
            oj0 r2 = (defpackage.oj0) r2     // Catch:{ all -> 0x0188 }
            wv6 r2 = r2.a     // Catch:{ all -> 0x0188 }
            r3 = 1
            boolean r2 = r2.d(r3)     // Catch:{ all -> 0x0188 }
            r4 = 0
            if (r2 == 0) goto L_0x018b
            lq8 r2 = r12.b     // Catch:{ all -> 0x0188 }
            o43 r2 = r2.get(r1)     // Catch:{ all -> 0x0188 }
            goto L_0x018c
        L_0x0188:
            r12 = move-exception
            goto L_0x0255
        L_0x018b:
            r2 = r4
        L_0x018c:
            java.lang.String r5 = "memory_bitmap"
            java.lang.String r6 = "cached_value_found"
            if (r2 == 0) goto L_0x01ed
            java.lang.Object r7 = r2.e0()     // Catch:{ all -> 0x0188 }
            ru6 r7 = (defpackage.ru6) r7     // Catch:{ all -> 0x0188 }
            java.util.Map r7 = r7.getExtras()     // Catch:{ all -> 0x0188 }
            r8 = r14
            oj0 r8 = (defpackage.oj0) r8     // Catch:{ all -> 0x0188 }
            r8.putExtras(r7)     // Catch:{ all -> 0x0188 }
            java.lang.Object r7 = r2.e0()     // Catch:{ all -> 0x0188 }
            l43 r7 = (defpackage.l43) r7     // Catch:{ all -> 0x0188 }
            pqb r7 = r7.getQualityInfo()     // Catch:{ all -> 0x0188 }
            hx6 r7 = (defpackage.hx6) r7     // Catch:{ all -> 0x0188 }
            boolean r7 = r7.c     // Catch:{ all -> 0x0188 }
            if (r7 == 0) goto L_0x01e1
            java.lang.String r8 = r12.d()     // Catch:{ all -> 0x0188 }
            java.lang.String r9 = r12.d()     // Catch:{ all -> 0x0188 }
            boolean r9 = r0.i(r14, r9)     // Catch:{ all -> 0x0188 }
            if (r9 == 0) goto L_0x01c7
            java.lang.String r9 = "true"
            java.util.Map r9 = defpackage.dx6.a(r6, r9)     // Catch:{ all -> 0x0188 }
            goto L_0x01c8
        L_0x01c7:
            r9 = r4
        L_0x01c8:
            r0.a(r14, r8, r9)     // Catch:{ all -> 0x0188 }
            java.lang.String r8 = r12.d()     // Catch:{ all -> 0x0188 }
            r0.e(r14, r8, r3)     // Catch:{ all -> 0x0188 }
            java.lang.String r8 = r12.c()     // Catch:{ all -> 0x0188 }
            r9 = r14
            oj0 r9 = (defpackage.oj0) r9     // Catch:{ all -> 0x0188 }
            r9.h(r5, r8)     // Catch:{ all -> 0x0188 }
            r8 = 1065353216(0x3f800000, float:1.0)
            r13.i(r8)     // Catch:{ all -> 0x0188 }
        L_0x01e1:
            r13.g(r7, r2)     // Catch:{ all -> 0x0188 }
            r2.close()     // Catch:{ all -> 0x0188 }
            if (r7 == 0) goto L_0x01ed
        L_0x01e9:
            defpackage.f46.I()
            goto L_0x0254
        L_0x01ed:
            r2 = r14
            oj0 r2 = (defpackage.oj0) r2     // Catch:{ all -> 0x0188 }
            vv6 r2 = r2.X     // Catch:{ all -> 0x0188 }
            int r2 = r2.a     // Catch:{ all -> 0x0188 }
            r7 = 4
            java.lang.String r8 = "false"
            if (r2 < r7) goto L_0x0225
            java.lang.String r1 = r12.d()     // Catch:{ all -> 0x0188 }
            java.lang.String r2 = r12.d()     // Catch:{ all -> 0x0188 }
            boolean r2 = r0.i(r14, r2)     // Catch:{ all -> 0x0188 }
            if (r2 == 0) goto L_0x020c
            java.util.Map r2 = defpackage.dx6.a(r6, r8)     // Catch:{ all -> 0x0188 }
            goto L_0x020d
        L_0x020c:
            r2 = r4
        L_0x020d:
            r0.a(r14, r1, r2)     // Catch:{ all -> 0x0188 }
            java.lang.String r1 = r12.d()     // Catch:{ all -> 0x0188 }
            r2 = 0
            r0.e(r14, r1, r2)     // Catch:{ all -> 0x0188 }
            java.lang.String r12 = r12.c()     // Catch:{ all -> 0x0188 }
            oj0 r14 = (defpackage.oj0) r14     // Catch:{ all -> 0x0188 }
            r14.h(r5, r12)     // Catch:{ all -> 0x0188 }
            r13.g(r3, r4)     // Catch:{ all -> 0x0188 }
            goto L_0x01e9
        L_0x0225:
            r2 = r14
            oj0 r2 = (defpackage.oj0) r2     // Catch:{ all -> 0x0188 }
            wv6 r2 = r2.a     // Catch:{ all -> 0x0188 }
            r3 = 2
            boolean r2 = r2.d(r3)     // Catch:{ all -> 0x0188 }
            fi0 r13 = r12.e(r13, r1, r2)     // Catch:{ all -> 0x0188 }
            java.lang.String r1 = r12.d()     // Catch:{ all -> 0x0188 }
            java.lang.String r2 = r12.d()     // Catch:{ all -> 0x0188 }
            boolean r2 = r0.i(r14, r2)     // Catch:{ all -> 0x0188 }
            if (r2 == 0) goto L_0x0245
            java.util.Map r4 = defpackage.dx6.a(r6, r8)     // Catch:{ all -> 0x0188 }
        L_0x0245:
            r0.a(r14, r1, r4)     // Catch:{ all -> 0x0188 }
            defpackage.f46.I()     // Catch:{ all -> 0x0188 }
            dab r12 = r12.d     // Catch:{ all -> 0x0188 }
            r12.a(r13, r14)     // Catch:{ all -> 0x0188 }
            defpackage.f46.I()     // Catch:{ all -> 0x0188 }
            goto L_0x01e9
        L_0x0254:
            return
        L_0x0255:
            defpackage.f46.I()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fo0.a(fi0, eab):void");
    }

    public String c() {
        return "pipe_bg";
    }

    public String d() {
        return "BitmapMemoryCacheProducer";
    }

    public fi0 e(fi0 fi0, do0 do0, boolean z) {
        return new h05(this, fi0, do0, z);
    }
}
