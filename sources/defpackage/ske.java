package defpackage;

/* renamed from: ske  reason: default package */
public final class ske implements p37 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tke b;

    public /* synthetic */ ske(tke tke, int i) {
        this.a = i;
        this.b = tke;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.yic a(defpackage.h8c r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            java.lang.String r2 = "ClassCastException"
            java.lang.String r3 = "tke"
            java.lang.String r4 = "Host"
            r5 = 0
            int r6 = r0.a
            switch(r6) {
                case 0: goto L_0x00b1;
                default: goto L_0x0010;
            }
        L_0x0010:
            r6 = 61453(0xf00d, float:8.6114E-41)
            android.net.TrafficStats.setThreadStatsTag(r6)
            java.lang.Object r6 = r1.i
            mhc r6 = (defpackage.mhc) r6
            l84 r7 = r6.a()
            tke r8 = r0.b
            java.lang.String r8 = r8.h
            java.lang.Object r9 = r7.c
            bj6 r9 = (defpackage.bj6) r9
            java.lang.String r10 = "User-Agent"
            r9.h(r10, r8)
            tke r8 = r0.b
            boolean r8 = r8.c
            if (r8 == 0) goto L_0x0096
            vq6 r8 = r6.b
            java.lang.String r9 = r8.e
            tke r10 = r0.b
            boolean r10 = r10.d(r9)
            if (r10 != 0) goto L_0x0055
            ru.ok.tamtam.util.HandledException r10 = new ru.ok.tamtam.util.HandledException
            java.lang.String r11 = r8.b()
            java.lang.Object[] r11 = new java.lang.Object[]{r9, r11}
            java.lang.String r12 = "Http request behind the proxy. Host = %s, path = %s"
            r10.<init>(r12, r11)
            tke r11 = r0.b
            o45 r11 = r11.b
            cba r11 = (defpackage.cba) r11
            r11.c(r10, r5)
        L_0x0055:
            tke r10 = r0.b
            java.lang.String r10 = r10.f
            boolean r10 = r9.equals(r10)
            if (r10 == 0) goto L_0x0077
            ru.ok.tamtam.util.HandledException r10 = new ru.ok.tamtam.util.HandledException
            java.lang.String r11 = r8.b()
            java.lang.Object[] r11 = new java.lang.Object[]{r9, r11}
            java.lang.String r12 = "Http request with direct proxy Host = %s, path = %s"
            r10.<init>(r12, r11)
            tke r11 = r0.b
            o45 r11 = r11.b
            cba r11 = (defpackage.cba) r11
            r11.c(r10, r5)
        L_0x0077:
            tke r5 = r0.b
            od3 r8 = r8.f()
            vq6 r6 = r6.b
            boolean r6 = r6.a
            defpackage.tke.c(r5, r8, r6)
            vq6 r5 = r8.b()
            tke r0 = r0.b
            r0.getClass()
            java.lang.Object r0 = r7.c
            bj6 r0 = (defpackage.bj6) r0
            r0.h(r4, r9)
            r7.a = r5
        L_0x0096:
            mhc r0 = r7.r()     // Catch:{ ClassCastException -> 0x00ab, RuntimeException -> 0x009f }
            yic r0 = r1.d(r0)     // Catch:{ ClassCastException -> 0x00ab, RuntimeException -> 0x009f }
            return r0
        L_0x009f:
            r0 = move-exception
            java.lang.String r1 = "Http request failed"
            defpackage.hm9.p(r3, r1, r0)
            ru.ok.messages.http.UnknownOkhttpException r2 = new ru.ok.messages.http.UnknownOkhttpException
            r2.<init>(r1, r0)
            throw r2
        L_0x00ab:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            throw r0
        L_0x00b1:
            java.lang.Object r6 = r1.i
            mhc r6 = (defpackage.mhc) r6
            vq6 r7 = r6.b
            tke r8 = r0.b
            boolean r8 = r8.c
            r9 = 0
            if (r8 == 0) goto L_0x0120
            java.util.List r8 = r7.g
            if (r8 != 0) goto L_0x00c4
        L_0x00c2:
            r5 = r9
            goto L_0x00f9
        L_0x00c4:
            int r10 = r8.size()
            j37 r5 = defpackage.ote.Y(r5, r10)
            r10 = 2
            h37 r5 = defpackage.ote.X(r5, r10)
            int r10 = r5.a
            int r11 = r5.b
            int r5 = r5.c
            if (r5 < 0) goto L_0x00dc
            if (r10 > r11) goto L_0x00c2
            goto L_0x00de
        L_0x00dc:
            if (r10 < r11) goto L_0x00c2
        L_0x00de:
            java.lang.Object r12 = r8.get(r10)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r13 = "TAM_TAM_ORIGINAL_HOST"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x00f5
            int r10 = r10 + 1
            java.lang.Object r5 = r8.get(r10)
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x00f9
        L_0x00f5:
            if (r10 == r11) goto L_0x00c2
            int r10 = r10 + r5
            goto L_0x00de
        L_0x00f9:
            boolean r8 = defpackage.oag.t(r5)
            if (r8 != 0) goto L_0x0120
            od3 r7 = r7.f()
            r7.l()
            vq6 r7 = r7.b()
            tke r8 = r0.b
            l84 r6 = r6.a()
            r8.getClass()
            java.lang.Object r8 = r6.c
            bj6 r8 = (defpackage.bj6) r8
            r8.h(r4, r5)
            r6.a = r7
            mhc r6 = r6.r()
        L_0x0120:
            yic r1 = r1.d(r6)     // Catch:{ ClassCastException -> 0x01e3, RuntimeException -> 0x01d6 }
            tke r2 = r0.b
            boolean r2 = r2.c
            if (r2 == 0) goto L_0x01d5
            int r2 = r1.o
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto L_0x0139
            r4 = 308(0x134, float:4.32E-43)
            if (r2 == r4) goto L_0x0139
            switch(r2) {
                case 300: goto L_0x0139;
                case 301: goto L_0x0139;
                case 302: goto L_0x0139;
                case 303: goto L_0x0139;
                default: goto L_0x0137;
            }
        L_0x0137:
            goto L_0x01d5
        L_0x0139:
            cj6 r2 = r1.Y
            java.lang.String r4 = "Location"
            java.lang.String r2 = r2.a(r4)
            if (r2 == 0) goto L_0x0144
            goto L_0x0145
        L_0x0144:
            r2 = r9
        L_0x0145:
            boolean r5 = defpackage.oag.t(r2)
            if (r5 == 0) goto L_0x0152
            java.lang.String r0 = "Redirect, but Location is empty"
            defpackage.hm9.p(r3, r0, r9)
            goto L_0x01d5
        L_0x0152:
            od3 r5 = new od3     // Catch:{ IllegalArgumentException -> 0x015f }
            r5.<init>()     // Catch:{ IllegalArgumentException -> 0x015f }
            r5.j(r9, r2)     // Catch:{ IllegalArgumentException -> 0x015f }
            vq6 r5 = r5.b()     // Catch:{ IllegalArgumentException -> 0x015f }
            goto L_0x0160
        L_0x015f:
            r5 = r9
        L_0x0160:
            if (r5 != 0) goto L_0x0176
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't parse location "
            r0.<init>(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            defpackage.hm9.p(r3, r0, r9)
            goto L_0x01d5
        L_0x0176:
            java.lang.String r10 = r5.e
            tke r0 = r0.b
            od3 r2 = r5.f()
            vq6 r3 = r6.b
            boolean r3 = r3.a
            defpackage.tke.c(r0, r2, r3)
            r2.l()
            java.util.ArrayList r0 = r2.d
            if (r0 != 0) goto L_0x0193
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.d = r0
        L_0x0193:
            java.util.ArrayList r0 = r2.d
            r17 = 1
            r18 = 0
            java.lang.String r11 = "TAM_TAM_ORIGINAL_HOST"
            r12 = 0
            r13 = 0
            java.lang.String r14 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
            r15 = 0
            r16 = 0
            r19 = 219(0xdb, float:3.07E-43)
            java.lang.String r3 = defpackage.buc.e(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.add(r3)
            java.util.ArrayList r0 = r2.d
            if (r10 == 0) goto L_0x01bf
            r16 = 1
            r17 = 0
            r11 = 0
            r12 = 0
            java.lang.String r13 = " !\"#$&'(),/:;<=>?@[]\\^`{|}~"
            r14 = 0
            r15 = 0
            r18 = 219(0xdb, float:3.07E-43)
            java.lang.String r9 = defpackage.buc.e(r10, r11, r12, r13, r14, r15, r16, r17, r18)
        L_0x01bf:
            r0.add(r9)
            vq6 r0 = r2.b()
            xic r1 = r1.n()
            java.lang.String r0 = r0.i
            bj6 r2 = r1.f
            r2.h(r4, r0)
            yic r1 = r1.a()
        L_0x01d5:
            return r1
        L_0x01d6:
            r0 = move-exception
            r1 = r0
            java.lang.String r0 = "Http redirect failed"
            defpackage.hm9.p(r3, r0, r1)
            ru.ok.messages.http.UnknownOkhttpException r2 = new ru.ok.messages.http.UnknownOkhttpException
            r2.<init>(r0, r1)
            throw r2
        L_0x01e3:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ske.a(h8c):yic");
    }
}
