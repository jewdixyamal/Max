package com.google.firebase.messaging;

import java.util.ArrayDeque;

public class FirebaseMessagingService extends f25 {
    public static final ArrayDeque Z = new ArrayDeque(10);
    public goc Y;

    /* JADX WARNING: Removed duplicated region for block: B:61:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x017e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Intent r10) {
        /*
            r9 = this;
            r0 = 3
            r1 = 1
            r2 = 0
            java.lang.String r3 = r10.getAction()
            java.lang.String r4 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x0030
            java.lang.String r4 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L_0x0018
            goto L_0x0030
        L_0x0018:
            java.lang.String r0 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x002b
            java.lang.String r0 = "token"
            java.lang.String r10 = r10.getStringExtra(r0)
            r9.e(r10)
            goto L_0x0188
        L_0x002b:
            r10.getAction()
            goto L_0x0188
        L_0x0030:
            java.lang.String r3 = "google.message_id"
            java.lang.String r4 = r10.getStringExtra(r3)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r6 = "message_id"
            if (r5 == 0) goto L_0x003f
            goto L_0x0057
        L_0x003f:
            java.util.ArrayDeque r5 = Z
            boolean r7 = r5.contains(r4)
            if (r7 == 0) goto L_0x0049
            goto L_0x011c
        L_0x0049:
            int r7 = r5.size()
            r8 = 10
            if (r7 < r8) goto L_0x0054
            r5.remove()
        L_0x0054:
            r5.add(r4)
        L_0x0057:
            java.lang.String r4 = "message_type"
            java.lang.String r4 = r10.getStringExtra(r4)
            if (r4 != 0) goto L_0x0061
            java.lang.String r4 = "gcm"
        L_0x0061:
            r5 = -1
            int r7 = r4.hashCode()
            switch(r7) {
                case -2062414158: goto L_0x008b;
                case 102161: goto L_0x0080;
                case 814694033: goto L_0x0075;
                case 814800675: goto L_0x006a;
                default: goto L_0x0069;
            }
        L_0x0069:
            goto L_0x0095
        L_0x006a:
            java.lang.String r7 = "send_event"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0073
            goto L_0x0095
        L_0x0073:
            r5 = r0
            goto L_0x0095
        L_0x0075:
            java.lang.String r7 = "send_error"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x007e
            goto L_0x0095
        L_0x007e:
            r5 = 2
            goto L_0x0095
        L_0x0080:
            java.lang.String r7 = "gcm"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0089
            goto L_0x0095
        L_0x0089:
            r5 = r1
            goto L_0x0095
        L_0x008b:
            java.lang.String r7 = "deleted_messages"
            boolean r4 = r4.equals(r7)
            if (r4 != 0) goto L_0x0094
            goto L_0x0095
        L_0x0094:
            r5 = r2
        L_0x0095:
            switch(r5) {
                case 0: goto L_0x0119;
                case 1: goto L_0x00c0;
                case 2: goto L_0x009f;
                case 3: goto L_0x009a;
                default: goto L_0x0098;
            }
        L_0x0098:
            goto L_0x011c
        L_0x009a:
            r10.getStringExtra(r3)
            goto L_0x011c
        L_0x009f:
            java.lang.String r4 = r10.getStringExtra(r3)
            if (r4 != 0) goto L_0x00a8
            r10.getStringExtra(r6)
        L_0x00a8:
            com.google.firebase.messaging.SendException r4 = new com.google.firebase.messaging.SendException
            java.lang.String r5 = "error"
            java.lang.String r5 = r10.getStringExtra(r5)
            r4.<init>(r5)
            if (r5 != 0) goto L_0x00b6
            goto L_0x011c
        L_0x00b6:
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r4 = r5.toLowerCase(r4)
            r4.getClass()
            goto L_0x011c
        L_0x00c0:
            defpackage.m6d.v(r10)
            android.os.Bundle r4 = r10.getExtras()
            if (r4 != 0) goto L_0x00ce
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
        L_0x00ce:
            java.lang.String r5 = "androidx.content.wakelockid"
            r4.remove(r5)
            boolean r5 = defpackage.sy4.D(r4)
            if (r5 == 0) goto L_0x0110
            sy4 r5 = new sy4
            r5.<init>((android.os.Bundle) r4)
            cm9 r7 = new cm9
            java.lang.String r8 = "Firebase-Messaging-Network-Io"
            r7.<init>(r8, r2)
            java.util.concurrent.ExecutorService r7 = java.util.concurrent.Executors.newSingleThreadExecutor(r7)
            k8g r8 = new k8g
            r8.<init>((android.content.Context) r9, (defpackage.sy4) r5, (java.util.concurrent.ExecutorService) r7)
            boolean r5 = r8.t()     // Catch:{ all -> 0x010b }
            if (r5 == 0) goto L_0x00f8
            r7.shutdown()
            goto L_0x011c
        L_0x00f8:
            r7.shutdown()
            boolean r5 = defpackage.m6d.N(r10)
            if (r5 == 0) goto L_0x0110
            java.lang.String r5 = "_nf"
            android.os.Bundle r7 = r10.getExtras()
            defpackage.m6d.w(r5, r7)
            goto L_0x0110
        L_0x010b:
            r9 = move-exception
            r7.shutdown()
            throw r9
        L_0x0110:
            wfc r5 = new wfc
            r5.<init>(r4)
            r9.d(r5)
            goto L_0x011c
        L_0x0119:
            r9.c()
        L_0x011c:
            goc r4 = r9.Y
            if (r4 != 0) goto L_0x012b
            goc r4 = new goc
            android.content.Context r5 = r9.getApplicationContext()
            r4.<init>(r5)
            r9.Y = r4
        L_0x012b:
            goc r9 = r9.Y
            l2a r4 = r9.c
            int r4 = r4.g()
            r5 = 233700000(0xdedfaa0, float:1.46665885E-30)
            if (r4 < r5) goto L_0x017e
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r5 = r10.getStringExtra(r3)
            if (r5 != 0) goto L_0x0147
            java.lang.String r5 = r10.getStringExtra(r6)
        L_0x0147:
            r4.putString(r3, r5)
            java.lang.String r3 = "google.product_id"
            boolean r5 = r10.hasExtra(r3)
            if (r5 == 0) goto L_0x015b
            int r10 = r10.getIntExtra(r3, r2)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x015c
        L_0x015b:
            r10 = 0
        L_0x015c:
            if (r10 == 0) goto L_0x0165
            int r10 = r10.intValue()
            r4.putInt(r3, r10)
        L_0x0165:
            android.content.Context r9 = r9.b
            pkg r9 = defpackage.pkg.f(r9)
            ckg r10 = new ckg
            monitor-enter(r9)
            int r3 = r9.b     // Catch:{ all -> 0x017b }
            int r1 = r1 + r3
            r9.b = r1     // Catch:{ all -> 0x017b }
            monitor-exit(r9)
            r10.<init>(r3, r0, r4, r2)
            r9.h(r10)
            goto L_0x0188
        L_0x017b:
            r10 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x017b }
            throw r10
        L_0x017e:
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "SERVICE_NOT_AVAILABLE"
            r9.<init>(r10)
            defpackage.j1e.q(r9)
        L_0x0188:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.b(android.content.Intent):void");
    }

    public void c() {
    }

    public void d(wfc wfc) {
    }

    public void e(String str) {
    }
}
