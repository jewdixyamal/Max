package defpackage;

import android.content.BroadcastReceiver;

/* renamed from: an  reason: default package */
public final class an extends BroadcastReceiver {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ an() {
        this.a = 13;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v2 */
    /* JADX WARNING: type inference failed for: r9v3, types: [int] */
    /* JADX WARNING: type inference failed for: r9v4 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: type inference failed for: r9v7 */
    /* JADX WARNING: type inference failed for: r9v8 */
    /* JADX WARNING: type inference failed for: r9v9 */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0120, code lost:
        if (defpackage.maf.a >= 29) goto L_0x0128;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0142 A[Catch:{ RuntimeException -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0146 A[Catch:{ RuntimeException -> 0x014f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onReceive(android.content.Context r17, android.content.Intent r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.lang.String r4 = "android.media.AUDIO_BECOMING_NOISY"
            java.lang.String r5 = "phone"
            r6 = 31
            r8 = 29
            r11 = 4
            r12 = 6
            r13 = 9
            java.lang.String r14 = "connectivity"
            r15 = 0
            r9 = 1
            r10 = 0
            r7 = 5
            int r3 = r0.a
            switch(r3) {
                case 0: goto L_0x028e;
                case 1: goto L_0x0274;
                case 2: goto L_0x0242;
                case 3: goto L_0x023a;
                case 4: goto L_0x01e5;
                case 5: goto L_0x01b2;
                case 6: goto L_0x0188;
                case 7: goto L_0x0153;
                case 8: goto L_0x00e5;
                case 9: goto L_0x0072;
                case 10: goto L_0x006a;
                case 11: goto L_0x005c;
                case 12: goto L_0x004b;
                default: goto L_0x001d;
            }
        L_0x001d:
            java.lang.Object r1 = r0.b
            i0e r1 = (defpackage.i0e) r1
            if (r1 != 0) goto L_0x0024
            goto L_0x004a
        L_0x0024:
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x002b
            goto L_0x004a
        L_0x002b:
            java.lang.Object r1 = r0.b
            i0e r1 = (defpackage.i0e) r1
            java.lang.Object r2 = r1.o
            com.google.firebase.messaging.FirebaseMessaging r2 = (com.google.firebase.messaging.FirebaseMessaging) r2
            r2.getClass()
            r2 = 0
            com.google.firebase.messaging.FirebaseMessaging.b(r1, r2)
            java.lang.Object r1 = r0.b
            i0e r1 = (defpackage.i0e) r1
            java.lang.Object r1 = r1.o
            com.google.firebase.messaging.FirebaseMessaging r1 = (com.google.firebase.messaging.FirebaseMessaging) r1
            android.content.Context r1 = r1.b
            r1.unregisterReceiver(r0)
            r0.b = r15
        L_0x004a:
            return
        L_0x004b:
            java.lang.Object r0 = r0.b
            f9e r0 = (defpackage.f9e) r0
            android.os.Handler r1 = r0.a
            u3c r2 = new u3c
            r3 = 21
            r2.<init>(r3, r0)
            r1.post(r2)
            return
        L_0x005c:
            boolean r1 = r16.isInitialStickyBroadcast()
            if (r1 != 0) goto L_0x0069
            java.lang.Object r0 = r0.b
            gb0 r0 = (defpackage.gb0) r0
            r0.b()
        L_0x0069:
            return
        L_0x006a:
            java.lang.Object r0 = r0.b
            xu3 r0 = (defpackage.xu3) r0
            r0.u()
            return
        L_0x0072:
            java.lang.Object r2 = r1.getSystemService(r14)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            if (r2 != 0) goto L_0x007c
        L_0x007a:
            r9 = r10
            goto L_0x00ba
        L_0x007c:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x007a }
            if (r2 == 0) goto L_0x00ba
            boolean r3 = r2.isConnected()
            if (r3 != 0) goto L_0x0089
            goto L_0x00ba
        L_0x0089:
            int r3 = r2.getType()
            if (r3 == 0) goto L_0x00a2
            if (r3 == r9) goto L_0x00a0
            if (r3 == r11) goto L_0x00a2
            if (r3 == r7) goto L_0x00a2
            if (r3 == r12) goto L_0x009e
            if (r3 == r13) goto L_0x009c
            r9 = 8
            goto L_0x00ba
        L_0x009c:
            r9 = 7
            goto L_0x00ba
        L_0x009e:
            r9 = r7
            goto L_0x00ba
        L_0x00a0:
            r9 = 2
            goto L_0x00ba
        L_0x00a2:
            int r2 = r2.getSubtype()
            switch(r2) {
                case 1: goto L_0x00b8;
                case 2: goto L_0x00b8;
                case 3: goto L_0x00b6;
                case 4: goto L_0x00b6;
                case 5: goto L_0x00b6;
                case 6: goto L_0x00b6;
                case 7: goto L_0x00b6;
                case 8: goto L_0x00b6;
                case 9: goto L_0x00b6;
                case 10: goto L_0x00b6;
                case 11: goto L_0x00b6;
                case 12: goto L_0x00b6;
                case 13: goto L_0x00b4;
                case 14: goto L_0x00b6;
                case 15: goto L_0x00b6;
                case 16: goto L_0x00a9;
                case 17: goto L_0x00b6;
                case 18: goto L_0x00b2;
                case 19: goto L_0x00a9;
                case 20: goto L_0x00ab;
                default: goto L_0x00a9;
            }
        L_0x00a9:
            r13 = r12
            goto L_0x00b9
        L_0x00ab:
            int r2 = defpackage.oaf.a
            if (r2 < r8) goto L_0x00b0
            goto L_0x00b9
        L_0x00b0:
            r13 = r10
            goto L_0x00b9
        L_0x00b2:
            r13 = 2
            goto L_0x00b9
        L_0x00b4:
            r13 = r7
            goto L_0x00b9
        L_0x00b6:
            r13 = r11
            goto L_0x00b9
        L_0x00b8:
            r13 = 3
        L_0x00b9:
            r9 = r13
        L_0x00ba:
            int r2 = defpackage.oaf.a
            java.lang.Object r0 = r0.b
            ho9 r0 = (defpackage.ho9) r0
            if (r2 < r6) goto L_0x00e1
            if (r9 != r7) goto L_0x00e1
            java.lang.Object r2 = r1.getSystemService(r5)     // Catch:{ RuntimeException -> 0x00dd }
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2     // Catch:{ RuntimeException -> 0x00dd }
            r2.getClass()     // Catch:{ RuntimeException -> 0x00dd }
            eo9 r3 = new eo9     // Catch:{ RuntimeException -> 0x00dd }
            r3.<init>(r0)     // Catch:{ RuntimeException -> 0x00dd }
            java.util.concurrent.Executor r1 = r17.getMainExecutor()     // Catch:{ RuntimeException -> 0x00dd }
            r2.registerTelephonyCallback(r1, r3)     // Catch:{ RuntimeException -> 0x00dd }
            r2.unregisterTelephonyCallback(r3)     // Catch:{ RuntimeException -> 0x00dd }
            goto L_0x00e4
        L_0x00dd:
            defpackage.ho9.g(r7, r0)
            goto L_0x00e4
        L_0x00e1:
            defpackage.ho9.g(r9, r0)
        L_0x00e4:
            return
        L_0x00e5:
            java.lang.Object r2 = r1.getSystemService(r14)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            if (r2 != 0) goto L_0x00ef
        L_0x00ed:
            r13 = r10
            goto L_0x0128
        L_0x00ef:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch:{ SecurityException -> 0x00ed }
            if (r2 == 0) goto L_0x0127
            boolean r3 = r2.isConnected()
            if (r3 != 0) goto L_0x00fc
            goto L_0x0127
        L_0x00fc:
            int r3 = r2.getType()
            if (r3 == 0) goto L_0x0115
            if (r3 == r9) goto L_0x0113
            if (r3 == r11) goto L_0x0115
            if (r3 == r7) goto L_0x0115
            if (r3 == r12) goto L_0x0111
            if (r3 == r13) goto L_0x010f
            r13 = 8
            goto L_0x0128
        L_0x010f:
            r13 = 7
            goto L_0x0128
        L_0x0111:
            r13 = r7
            goto L_0x0128
        L_0x0113:
            r13 = 2
            goto L_0x0128
        L_0x0115:
            int r2 = r2.getSubtype()
            switch(r2) {
                case 1: goto L_0x0125;
                case 2: goto L_0x0125;
                case 3: goto L_0x0123;
                case 4: goto L_0x0123;
                case 5: goto L_0x0123;
                case 6: goto L_0x0123;
                case 7: goto L_0x0123;
                case 8: goto L_0x0123;
                case 9: goto L_0x0123;
                case 10: goto L_0x0123;
                case 11: goto L_0x0123;
                case 12: goto L_0x0123;
                case 13: goto L_0x0111;
                case 14: goto L_0x0123;
                case 15: goto L_0x0123;
                case 16: goto L_0x011c;
                case 17: goto L_0x0123;
                case 18: goto L_0x0113;
                case 19: goto L_0x011c;
                case 20: goto L_0x011e;
                default: goto L_0x011c;
            }
        L_0x011c:
            r13 = r12
            goto L_0x0128
        L_0x011e:
            int r2 = defpackage.maf.a
            if (r2 < r8) goto L_0x00ed
            goto L_0x0128
        L_0x0123:
            r13 = r11
            goto L_0x0128
        L_0x0125:
            r13 = 3
            goto L_0x0128
        L_0x0127:
            r13 = r9
        L_0x0128:
            int r2 = defpackage.maf.a
            java.lang.Object r0 = r0.b
            go9 r0 = (defpackage.go9) r0
            if (r2 < r8) goto L_0x014f
            if (r13 != r7) goto L_0x014f
            java.lang.Object r1 = r1.getSystemService(r5)     // Catch:{ RuntimeException -> 0x014f }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ RuntimeException -> 0x014f }
            r1.getClass()     // Catch:{ RuntimeException -> 0x014f }
            fo9 r3 = new fo9     // Catch:{ RuntimeException -> 0x014f }
            r3.<init>(r0)     // Catch:{ RuntimeException -> 0x014f }
            if (r2 >= r6) goto L_0x0146
            r1.listen(r3, r9)     // Catch:{ RuntimeException -> 0x014f }
            goto L_0x014b
        L_0x0146:
            r2 = 1048576(0x100000, float:1.469368E-39)
            r1.listen(r3, r2)     // Catch:{ RuntimeException -> 0x014f }
        L_0x014b:
            r1.listen(r3, r10)     // Catch:{ RuntimeException -> 0x014f }
            goto L_0x0152
        L_0x014f:
            defpackage.go9.b(r0, r13)
        L_0x0152:
            return
        L_0x0153:
            java.lang.String r1 = r18.getAction()
            java.lang.String r3 = "android.intent.action.MEDIA_BUTTON"
            boolean r1 = defpackage.oaf.a(r1, r3)
            if (r1 != 0) goto L_0x0160
            goto L_0x0187
        L_0x0160:
            android.net.Uri r1 = r18.getData()
            boolean r1 = defpackage.oaf.a(r1, r1)
            if (r1 != 0) goto L_0x016b
            goto L_0x0187
        L_0x016b:
            java.lang.String r1 = "android.intent.extra.KEY_EVENT"
            android.os.Parcelable r1 = r2.getParcelableExtra(r1)
            android.view.KeyEvent r1 = (android.view.KeyEvent) r1
            if (r1 != 0) goto L_0x0176
            goto L_0x0187
        L_0x0176:
            java.lang.Object r0 = r0.b
            si8 r0 = (defpackage.si8) r0
            bi8 r0 = r0.j
            qz7 r0 = r0.b
            java.lang.Object r0 = r0.b
            e98 r0 = (defpackage.e98) r0
            android.media.session.MediaController r0 = r0.a
            r0.dispatchMediaButtonEvent(r1)
        L_0x0187:
            return
        L_0x0188:
            java.lang.String r1 = r18.getAction()
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x01b1
            java.lang.Object r0 = r0.b
            u65 r0 = (defpackage.u65) r0
            boolean r1 = r0.b()
            if (r1 == 0) goto L_0x01b1
            zpd r1 = r0.a
            float r1 = r1.e()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x01b1
            java.lang.String r1 = "u65"
            java.lang.String r2 = "onReceive ACTION_AUDIO_BECOMING_NOISY. Pause player"
            defpackage.hm9.k(r1, r2)
            r0.pause()
        L_0x01b1:
            return
        L_0x01b2:
            java.lang.Object r1 = r0.b
            lh3 r1 = (defpackage.lh3) r1
            java.lang.String r1 = r1.l
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L_0x01bd
            goto L_0x01ca
        L_0x01bd:
            boolean r3 = r2.c()
            if (r3 == 0) goto L_0x01ca
            us7 r3 = defpackage.us7.X
            java.lang.String r4 = "onBackgroundDataEnabledChange"
            r2.d(r3, r1, r4, r15)
        L_0x01ca:
            java.lang.Object r0 = r0.b
            lh3 r0 = (defpackage.lh3) r0
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.i
            java.util.Iterator r0 = r0.iterator()
        L_0x01d4:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01e4
            java.lang.Object r1 = r0.next()
            fh3 r1 = (defpackage.fh3) r1
            r1.a()
            goto L_0x01d4
        L_0x01e4:
            return
        L_0x01e5:
            java.lang.Object r0 = r0.b
            o23 r0 = (defpackage.o23) r0
            java.lang.Object r1 = r0.o
            ey1 r1 = (defpackage.ey1) r1
            if (r1 == 0) goto L_0x0239
            r0.getClass()
            java.lang.String r3 = "level"
            int r3 = r2.getIntExtra(r3, r10)
            java.lang.Object r0 = r0.c
            vte r0 = (defpackage.vte) r0
            wte r0 = (defpackage.wte) r0
            r0.getClass()
            long r4 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r0 = "status"
            r6 = -1
            int r0 = r2.getIntExtra(r0, r6)
            r2 = 2
            if (r0 == r2) goto L_0x0213
            if (r0 != r7) goto L_0x0212
            goto L_0x0213
        L_0x0212:
            r9 = r10
        L_0x0213:
            b11 r0 = new b11
            r0.<init>((int) r3, (long) r4, (boolean) r9)
            java.lang.Object r1 = r1.b
            c11 r1 = (defpackage.c11) r1
            if (r9 == 0) goto L_0x0220
            r1.a = r10
        L_0x0220:
            java.lang.Object r2 = r1.e
            b11 r2 = (defpackage.b11) r2
            if (r2 != 0) goto L_0x0229
            r1.e = r0
            goto L_0x0239
        L_0x0229:
            java.lang.Object r4 = r1.f
            b11 r4 = (defpackage.b11) r4
            if (r4 != 0) goto L_0x0237
            int r2 = r2.b
            if (r2 != r3) goto L_0x0234
            goto L_0x0239
        L_0x0234:
            r1.f = r0
            goto L_0x0239
        L_0x0237:
            r1.g = r0
        L_0x0239:
            return
        L_0x023a:
            java.lang.Object r0 = r0.b
            il0 r0 = (defpackage.il0) r0
            r0.v(r2)
            return
        L_0x0242:
            java.lang.String r1 = r18.getAction()
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0273
            java.lang.Object r0 = r0.b
            q40 r0 = (defpackage.q40) r0
            java.lang.Object r1 = r0.b
            p40 r1 = (defpackage.p40) r1
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x0273
            java.lang.Object r1 = r0.b
            p40 r1 = (defpackage.p40) r1
            float r2 = r1.e()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0273
            java.lang.String r2 = "Player. Audio Focus. Receiver: ACTION_AUDIO_BECOMING_NOISY. Pause player"
            java.lang.Object r0 = r0.c
            java.lang.String r0 = (java.lang.String) r0
            defpackage.hm9.m(r0, r2, new java.lang.Object[0])
            r1.pause()
        L_0x0273:
            return
        L_0x0274:
            boolean r3 = r16.isInitialStickyBroadcast()
            if (r3 != 0) goto L_0x028d
            java.lang.Object r0 = r0.b
            x30 r0 = (defpackage.x30) r0
            java.lang.Object r3 = r0.u0
            h30 r3 = (defpackage.h30) r3
            java.lang.Object r4 = r0.t0
            g40 r4 = (defpackage.g40) r4
            t30 r1 = defpackage.t30.c(r1, r2, r3, r4)
            r0.d(r1)
        L_0x028d:
            return
        L_0x028e:
            java.lang.Object r0 = r0.b
            dle r0 = (defpackage.dle) r0
            r0.X()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an.onReceive(android.content.Context, android.content.Intent):void");
    }

    public /* synthetic */ an(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
