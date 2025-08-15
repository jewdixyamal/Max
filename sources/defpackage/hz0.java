package defpackage;

/* renamed from: hz0  reason: default package */
public final /* synthetic */ class hz0 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yz0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ hz0(yz0 yz0, boolean z, int i) {
        this.a = i;
        this.b = yz0;
        this.c = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f8, code lost:
        r7 = (r7 = ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.getMediaOptionsForCall$default(r7, (defpackage.zad) null, 1, (java.lang.Object) null)).a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L_0x00b5;
                case 1: goto L_0x005d;
                default: goto L_0x0005;
            }
        L_0x0005:
            yz0 r0 = r6.b
            boolean r6 = r6.c
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            ir6 r1 = defpackage.hm9.m
            r2 = 0
            if (r1 != 0) goto L_0x0011
            goto L_0x0038
        L_0x0011:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x0038
            us7 r3 = defpackage.us7.X
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Screen sharing in call wasn't changed on "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r6 = " due to: "
            r4.append(r6)
            r4.append(r7)
            java.lang.String r6 = r4.toString()
            java.lang.String r7 = "CallAdminSettingsController"
            r1.d(r3, r7, r6, r2)
        L_0x0038:
            kld r6 = r0.C0
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r7 = r0.e()
            r0 = 0
            if (r7 == 0) goto L_0x0051
            r1 = 1
            sd8 r7 = ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.getMediaOptionsForCall$default(r7, r2, r1, r2)
            if (r7 == 0) goto L_0x0051
            rd8 r7 = r7.c
            if (r7 == 0) goto L_0x0051
            boolean r7 = defpackage.yz0.h(r7)
            goto L_0x0052
        L_0x0051:
            r7 = r0
        L_0x0052:
            db r1 = new db
            r1.<init>(r0, r7)
            r6.g(r1)
            e5f r6 = defpackage.e5f.a
            return r6
        L_0x005d:
            yz0 r0 = r6.b
            boolean r6 = r6.c
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            ir6 r1 = defpackage.hm9.m
            r2 = 0
            if (r1 != 0) goto L_0x0069
            goto L_0x0090
        L_0x0069:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x0090
            us7 r3 = defpackage.us7.X
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Cameras in call wasn't changed on "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r6 = " due to: "
            r4.append(r6)
            r4.append(r7)
            java.lang.String r6 = r4.toString()
            java.lang.String r7 = "CallAdminSettingsController"
            r1.d(r3, r7, r6, r2)
        L_0x0090:
            kld r6 = r0.C0
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r7 = r0.e()
            r0 = 0
            if (r7 == 0) goto L_0x00a9
            r1 = 1
            sd8 r7 = ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.getMediaOptionsForCall$default(r7, r2, r1, r2)
            if (r7 == 0) goto L_0x00a9
            rd8 r7 = r7.b
            if (r7 == 0) goto L_0x00a9
            boolean r7 = defpackage.yz0.h(r7)
            goto L_0x00aa
        L_0x00a9:
            r7 = r0
        L_0x00aa:
            xa r1 = new xa
            r1.<init>(r0, r7)
            r6.g(r1)
            e5f r6 = defpackage.e5f.a
            return r6
        L_0x00b5:
            yz0 r0 = r6.b
            boolean r6 = r6.c
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            ir6 r1 = defpackage.hm9.m
            r2 = 0
            if (r1 != 0) goto L_0x00c1
            goto L_0x00e8
        L_0x00c1:
            boolean r3 = r1.c()
            if (r3 == 0) goto L_0x00e8
            us7 r3 = defpackage.us7.X
            java.lang.String r7 = r7.getMessage()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Microphone in call wasn't changed on "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r6 = " due to: "
            r4.append(r6)
            r4.append(r7)
            java.lang.String r6 = r4.toString()
            java.lang.String r7 = "CallAdminSettingsController"
            r1.d(r3, r7, r6, r2)
        L_0x00e8:
            kld r6 = r0.C0
            ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager r7 = r0.e()
            r0 = 0
            if (r7 == 0) goto L_0x0101
            r1 = 1
            sd8 r7 = ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager.getMediaOptionsForCall$default(r7, r2, r1, r2)
            if (r7 == 0) goto L_0x0101
            rd8 r7 = r7.a
            if (r7 == 0) goto L_0x0101
            boolean r7 = defpackage.yz0.h(r7)
            goto L_0x0102
        L_0x0101:
            r7 = r0
        L_0x0102:
            za r1 = new za
            r1.<init>(r0, r7)
            r6.g(r1)
            e5f r6 = defpackage.e5f.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz0.invoke(java.lang.Object):java.lang.Object");
    }
}
