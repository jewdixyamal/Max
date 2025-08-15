package defpackage;

/* renamed from: dr1  reason: default package */
public final class dr1 implements ipb {
    public final /* synthetic */ ir1 a;

    public dr1(ir1 ir1) {
        this.a = ir1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007e, code lost:
        if (r0.a.m() == false) goto L_0x0081;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r8 = this;
            ir1 r8 = r8.a
            oqa r0 = r8.d
            cra r0 = (defpackage.cra) r0
            fqa r0 = r0.c()
            z01 r1 = r8.b
            a11 r1 = (defpackage.a11) r1
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r1 = r1.b()
            ru.ok.android.externcalls.sdk.audio.CallsAudioManager$AudioDeviceType r1 = r1.getDeviceType()
            java.lang.String r1 = r1.name()
            java.lang.String r2 = "speakerphone"
            boolean r1 = defpackage.tpa.f(r1, r2)
            xuc r2 = r8.h
            boolean r2 = r2.c()
            kr1 r3 = r8.a
            wr1 r3 = (defpackage.wr1) r3
            d04 r3 = r3.k()
            boolean r3 = r3.h
            r4 = 0
            r5 = 1
            if (r3 != 0) goto L_0x0049
            oqa r3 = r8.d
            cra r3 = (defpackage.cra) r3
            w7c r3 = r3.w0
            j0e r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            pqa r3 = (defpackage.pqa) r3
            boolean r3 = r3.h
            if (r3 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r3 = r4
            goto L_0x004a
        L_0x0049:
            r3 = r5
        L_0x004a:
            q0e r6 = r8.f()
            java.lang.Object r6 = r6.getValue()
            wvc r6 = (defpackage.wvc) r6
            xvc r6 = r6.a
            xvc r7 = defpackage.xvc.a
            if (r6 != r7) goto L_0x0081
            q0e r6 = r8.f()
            java.lang.Object r6 = r6.getValue()
            wvc r6 = (defpackage.wvc) r6
            kvc r6 = r6.b
            if (r6 == 0) goto L_0x006b
            gg1 r6 = r6.c
            goto L_0x006c
        L_0x006b:
            r6 = 0
        L_0x006c:
            ig1 r7 = r0.a
            gg1 r7 = r7.getId()
            boolean r6 = defpackage.tpa.f(r6, r7)
            if (r6 != 0) goto L_0x0082
            ig1 r0 = r0.a
            boolean r0 = r0.m()
            if (r0 == 0) goto L_0x0081
            goto L_0x0082
        L_0x0081:
            r5 = r4
        L_0x0082:
            jpb r8 = r8.j
            if (r3 != 0) goto L_0x00a5
            if (r1 != 0) goto L_0x00a5
            if (r2 != 0) goto L_0x00a5
            if (r5 == 0) goto L_0x008d
            goto L_0x00a5
        L_0x008d:
            r8.getClass()
            android.os.PowerManager$WakeLock r8 = r8.f     // Catch:{ Exception -> 0x0098 }
            if (r8 == 0) goto L_0x00a4
            r8.acquire()     // Catch:{ Exception -> 0x0098 }
            goto L_0x00a4
        L_0x0098:
            r8 = move-exception
            java.lang.String r0 = r8.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r2 = "ProximityHelperTag"
            defpackage.hm9.r(r2, r8, r0, r1)
        L_0x00a4:
            return
        L_0x00a5:
            r8.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr1.a():void");
    }

    public final void b() {
        this.a.j.c();
    }
}
