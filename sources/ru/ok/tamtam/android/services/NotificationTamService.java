package ru.ok.tamtam.android.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ok/tamtam/android/services/NotificationTamService;", "Landroid/app/Service;", "<init>", "()V", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
public final class NotificationTamService extends Service {
    public static final /* synthetic */ int u0 = 0;
    public final khe X = new khe(new vv9(this, 3));
    public final khe Y = new khe(new vv9(this, 4));
    public final khe Z = new khe(new vv9(this, 5));
    public jyc a;
    public final khe b = new khe(new vv9(this, 0));
    public final khe c = new khe(new vv9(this, 1));
    public final khe o = new khe(new vv9(this, 2));
    public final khe s0 = new khe(new vv9(this, 6));
    public final khe t0 = new khe(new vv9(this, 7));

    public static final void a(long j, CharSequence charSequence, NotificationTamService notificationTamService, long j2) {
        if (j2 == 0) {
            hm9.q("ru.ok.tamtam.android.services.NotificationTamService", "directReply: failed to send message, no chat in cache for chatServerId=%d", Long.valueOf(j));
            return;
        }
        k9d k9d = new k9d(new i9d(j2, charSequence.toString(), true, nz4.a));
        jyc jyc = notificationTamService.a;
        if (jyc == null) {
            jyc = null;
        }
        jyc.u().a(k9d);
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.a = np8.D(getApplicationContext());
    }

    public final void onDestroy() {
        super.onDestroy();
        hm9.m("ru.ok.tamtam.android.services.NotificationTamService", "onDestroy", new Object[0]);
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0179 A[SYNTHETIC, Splitter:B:34:0x0179] */
    /* JADX WARNING: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int onStartCommand(android.content.Intent r22, int r23, int r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            if (r1 == 0) goto L_0x031c
            java.lang.String r2 = "ru.ok.tamtam.extra.CHAT_SERVER_ID"
            r3 = -1
            long r7 = r1.getLongExtra(r2, r3)
            java.lang.String r2 = r22.getAction()
            if (r2 == 0) goto L_0x031c
            int r5 = r2.hashCode()
            java.lang.String r12 = "eKey"
            java.lang.String r13 = "trid"
            java.lang.String r11 = ", eventKey="
            java.lang.String r9 = "ru.ok.tamtam.extra.MESSAGE_SERVER_ID"
            java.lang.String r10 = "ru.ok.tamtam.extra.MARK"
            r23 = r11
            java.lang.String r11 = "p_op"
            java.lang.String r6 = "Action"
            java.lang.String r14 = "ru.ok.tamtam.extra.EVENT_KEY"
            java.lang.String r15 = "ru.ok.tamtam.extra.PUSH_ID"
            r3 = 1
            switch(r5) {
                case -929068635: goto L_0x01ba;
                case -822886915: goto L_0x00e4;
                case 426083642: goto L_0x008d;
                case 1008773314: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x031c
        L_0x0032:
            java.lang.String r4 = "ru.ok.tamtam.action.MARK_AS_READ"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x003c
            goto L_0x031c
        L_0x003c:
            r4 = -1
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x031c
            r11 = 0
            long r11 = r1.getLongExtra(r15, r11)
            java.lang.String r13 = r1.getStringExtra(r14)
            long r14 = r1.getLongExtra(r10, r4)
            long r9 = r1.getLongExtra(r9, r4)
            khe r1 = r0.X
            java.lang.Object r1 = r1.getValue()
            p82 r1 = (defpackage.p82) r1
            e52 r1 = r1.z(r7)
            if (r1 != 0) goto L_0x0065
            r17 = r3
            goto L_0x0067
        L_0x0065:
            r17 = 0
        L_0x0067:
            khe r1 = r0.c
            java.lang.Object r1 = r1.getValue()
            r5 = r1
            sx3 r5 = (defpackage.sx3) r5
            wv9 r6 = new wv9
            r18 = 0
            r1 = r6
            r2 = r21
            r3 = r7
            r0 = r5
            r7 = r6
            r5 = r14
            r14 = r7
            r7 = r9
            r9 = r17
            r10 = r11
            r12 = r13
            r13 = r18
            r1.<init>(r2, r3, r5, r7, r9, r10, r12, r13)
            r1 = 3
            r2 = 0
            defpackage.j47.T(r0, r2, r2, r14, r1)
            goto L_0x031c
        L_0x008d:
            java.lang.String r1 = "ru.ok.tamtam.action.NOTIF_CANCEL"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x031c
            khe r1 = r0.b
            java.lang.Object r1 = r1.getValue()
            m7b r1 = (defpackage.m7b) r1
            p7b r1 = (defpackage.p7b) r1
            t33 r1 = r1.a
            java.lang.String r2 = "notif.isVisible"
            r4 = 0
            r1.j(r2, r4)
            khe r0 = r0.s0
            java.lang.Object r0 = r0.getValue()
            qx9 r0 = (defpackage.qx9) r0
            rx9 r1 = r0.e()
            r1.getClass()
            java.lang.String r2 = defpackage.rx9.d
            java.lang.String r0 = "onNotificationCancelled"
            defpackage.hm9.m(r2, r0, new java.lang.Object[0])
            ad r0 = r1.b()     // Catch:{ Exception -> 0x00cc }
            java.lang.String r4 = "n_canceled"
            java.util.Map r4 = java.util.Collections.singletonMap(r11, r4)     // Catch:{ Exception -> 0x00cc }
            r0.b(r6, r4)     // Catch:{ Exception -> 0x00cc }
            goto L_0x031c
        L_0x00cc:
            r0 = move-exception
            java.lang.String r4 = "onNotificationMarkAsRead: failed"
            defpackage.hm9.p(r2, r4, r0)
            o45 r1 = r1.c()
            ru.ok.tamtam.util.HandledException r2 = new ru.ok.tamtam.util.HandledException
            java.lang.String r4 = "failed to log mark as read"
            r2.<init>(r4, r0)
            cba r1 = (defpackage.cba) r1
            r1.c(r2, r3)
            goto L_0x031c
        L_0x00e4:
            java.lang.String r4 = "ru.ok.tamtam.action.NOTIF_CANCEL_BUNDLED"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto L_0x00ee
            goto L_0x031c
        L_0x00ee:
            r4 = -1
            int r2 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x031c
            long r9 = r1.getLongExtra(r10, r4)
            r4 = 0
            long r4 = r1.getLongExtra(r15, r4)
            java.lang.String r1 = r1.getStringExtra(r14)
            khe r2 = r0.t0
            java.lang.Object r2 = r2.getValue()
            rw9 r2 = (defpackage.rw9) r2
            ir6 r14 = defpackage.hm9.m
            if (r14 != 0) goto L_0x0111
        L_0x010e:
            r17 = r4
            goto L_0x0133
        L_0x0111:
            r2.getClass()
            boolean r15 = r14.c()
            if (r15 == 0) goto L_0x010e
            us7 r15 = defpackage.us7.X
            java.lang.String r3 = "onNotificationsSelfReadMarkChanged: chatServerId="
            r17 = r4
            java.lang.String r4 = ", mark="
            java.lang.StringBuilder r3 = defpackage.au1.k(r7, r3, r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "rw9"
            r5 = 0
            r14.d(r15, r4, r3, r5)
        L_0x0133:
            kotlinx.coroutines.internal.ContextScope r3 = r2.Y
            ow9 r4 = new ow9
            r14 = 0
            r19 = r17
            r5 = r4
            r15 = r6
            r6 = r2
            r2 = r23
            r17 = r15
            r15 = r11
            r11 = r14
            r5.<init>(r6, r7, r9, r11)
            r5 = 3
            r6 = 0
            defpackage.j47.T(r3, r6, r6, r4, r5)
            khe r0 = r0.s0
            java.lang.Object r0 = r0.getValue()
            qx9 r0 = (defpackage.qx9) r0
            rx9 r3 = r0.e()
            r3.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "onNotificationCancelledBundledChat: pushId="
            r0.<init>(r4)
            r4 = r19
            r0.append(r4)
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = defpackage.rx9.d
            defpackage.hm9.m(r2, r0, new java.lang.Object[0])
            if (r1 != 0) goto L_0x0179
            goto L_0x031c
        L_0x0179:
            ad r0 = r3.b()     // Catch:{ Exception -> 0x01a1 }
            java.lang.Long r4 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x01a1 }
            kpa r5 = new kpa     // Catch:{ Exception -> 0x01a1 }
            r5.<init>(r13, r4)     // Catch:{ Exception -> 0x01a1 }
            kpa r4 = new kpa     // Catch:{ Exception -> 0x01a1 }
            r4.<init>(r12, r1)     // Catch:{ Exception -> 0x01a1 }
            java.lang.String r1 = "n_canceled_ch"
            kpa r6 = new kpa     // Catch:{ Exception -> 0x01a1 }
            r6.<init>(r15, r1)     // Catch:{ Exception -> 0x01a1 }
            kpa[] r1 = new defpackage.kpa[]{r5, r4, r6}     // Catch:{ Exception -> 0x01a1 }
            us r1 = defpackage.br7.f(r1)     // Catch:{ Exception -> 0x01a1 }
            r4 = r17
            r0.b(r4, r1)     // Catch:{ Exception -> 0x01a1 }
            goto L_0x031c
        L_0x01a1:
            r0 = move-exception
            java.lang.String r1 = "onNotificationCancelledBundledChat: failed"
            defpackage.hm9.p(r2, r1, r0)
            o45 r1 = r3.c()
            ru.ok.tamtam.util.HandledException r2 = new ru.ok.tamtam.util.HandledException
            java.lang.String r3 = "failed to log mark as read chat"
            r2.<init>(r3, r0)
            cba r1 = (defpackage.cba) r1
            r3 = 1
            r1.c(r2, r3)
            goto L_0x031c
        L_0x01ba:
            r4 = r23
            r10 = r6
            r5 = r15
            r6 = 0
            r15 = r11
            java.lang.String r11 = "ru.ok.tamtam.action.DIRECT_REPLY"
            boolean r2 = r2.equals(r11)
            if (r2 != 0) goto L_0x01ca
            goto L_0x031c
        L_0x01ca:
            r2 = r4
            r3 = -1
            int r11 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r11 == 0) goto L_0x031c
            r16 = r7
            r8 = r10
            r6 = 0
            long r10 = r1.getLongExtra(r5, r6)
            java.lang.String r14 = r1.getStringExtra(r14)
            r1.getLongExtra(r9, r3)
            android.os.Bundle r1 = android.app.RemoteInput.getResultsFromIntent(r22)
            if (r1 != 0) goto L_0x01e9
            r5 = 0
            goto L_0x01f0
        L_0x01e9:
            java.lang.String r3 = "ru.ok.tamtam.extra.TEXT_REPLY"
            java.lang.CharSequence r1 = r1.getCharSequence(r3)
            r5 = r1
        L_0x01f0:
            if (r5 == 0) goto L_0x01f7
            java.lang.CharSequence r1 = defpackage.w9e.b1(r5)
            goto L_0x01f8
        L_0x01f7:
            r1 = 0
        L_0x01f8:
            if (r1 == 0) goto L_0x0200
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0205
        L_0x0200:
            r3 = r16
            r5 = 1
            goto L_0x02ab
        L_0x0205:
            khe r1 = r0.X
            java.lang.Object r1 = r1.getValue()
            p82 r1 = (defpackage.p82) r1
            boolean r1 = r1.i
            if (r1 != 0) goto L_0x0224
            ztc r7 = defpackage.muc.b()
            tb2 r9 = new tb2
            r6 = 3
            r1 = r9
            r2 = r21
            r3 = r16
            r1.<init>((java.lang.Object) r2, (long) r3, (java.lang.Object) r5, (int) r6)
            r7.b(r9)
            goto L_0x023f
        L_0x0224:
            khe r1 = r0.X
            java.lang.Object r1 = r1.getValue()
            p82 r1 = (defpackage.p82) r1
            r3 = r16
            e52 r1 = r1.z(r3)
            if (r1 == 0) goto L_0x0237
            long r1 = r1.a
            r6 = r1
        L_0x0237:
            r1 = r3
            r3 = r5
            r4 = r21
            r5 = r6
            a(r1, r3, r4, r5)
        L_0x023f:
            khe r0 = r0.s0
            java.lang.Object r0 = r0.getValue()
            qx9 r0 = (defpackage.qx9) r0
            rx9 r1 = r0.e()
            r1.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "onNotificationQuickReplied: chatServerId="
            r0.<init>(r2)
            r0.append(r10)
            java.lang.String r2 = ", lastMessage="
            r0.append(r2)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = defpackage.rx9.d
            defpackage.hm9.m(r2, r0, new java.lang.Object[0])
            if (r14 != 0) goto L_0x026d
            goto L_0x031c
        L_0x026d:
            ad r0 = r1.b()     // Catch:{ Exception -> 0x0293 }
            java.lang.Long r3 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x0293 }
            kpa r4 = new kpa     // Catch:{ Exception -> 0x0293 }
            r4.<init>(r13, r3)     // Catch:{ Exception -> 0x0293 }
            kpa r3 = new kpa     // Catch:{ Exception -> 0x0293 }
            r3.<init>(r12, r14)     // Catch:{ Exception -> 0x0293 }
            java.lang.String r5 = "n_q_rep"
            kpa r6 = new kpa     // Catch:{ Exception -> 0x0293 }
            r6.<init>(r15, r5)     // Catch:{ Exception -> 0x0293 }
            kpa[] r3 = new defpackage.kpa[]{r4, r3, r6}     // Catch:{ Exception -> 0x0293 }
            us r3 = defpackage.br7.f(r3)     // Catch:{ Exception -> 0x0293 }
            r0.b(r8, r3)     // Catch:{ Exception -> 0x0293 }
            goto L_0x031c
        L_0x0293:
            r0 = move-exception
            java.lang.String r3 = "onNotificationQuickReplied: failed"
            defpackage.hm9.p(r2, r3, r0)
            o45 r1 = r1.c()
            ru.ok.tamtam.util.HandledException r2 = new ru.ok.tamtam.util.HandledException
            java.lang.String r3 = "failed to log quick replied for chat"
            r2.<init>(r3, r0)
            cba r1 = (defpackage.cba) r1
            r5 = 1
            r1.c(r2, r5)
            goto L_0x031c
        L_0x02ab:
            khe r1 = r0.o
            java.lang.Object r1 = r1.getValue()
            cea r1 = (defpackage.cea) r1
            r1.f(r3)
            khe r0 = r0.s0
            java.lang.Object r0 = r0.getValue()
            qx9 r0 = (defpackage.qx9) r0
            rx9 r1 = r0.e()
            r1.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "onNotificationQuickRepliedWithEmptyText: pushId="
            r0.<init>(r3)
            r0.append(r10)
            r0.append(r2)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = defpackage.rx9.d
            defpackage.hm9.m(r2, r0, new java.lang.Object[0])
            if (r14 != 0) goto L_0x02e1
            goto L_0x031c
        L_0x02e1:
            ad r0 = r1.b()     // Catch:{ Exception -> 0x0306 }
            java.lang.Long r3 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x0306 }
            kpa r4 = new kpa     // Catch:{ Exception -> 0x0306 }
            r4.<init>(r13, r3)     // Catch:{ Exception -> 0x0306 }
            kpa r3 = new kpa     // Catch:{ Exception -> 0x0306 }
            r3.<init>(r12, r14)     // Catch:{ Exception -> 0x0306 }
            java.lang.String r6 = "n_q_rep_empty"
            kpa r7 = new kpa     // Catch:{ Exception -> 0x0306 }
            r7.<init>(r15, r6)     // Catch:{ Exception -> 0x0306 }
            kpa[] r3 = new defpackage.kpa[]{r4, r3, r7}     // Catch:{ Exception -> 0x0306 }
            us r3 = defpackage.br7.f(r3)     // Catch:{ Exception -> 0x0306 }
            r0.b(r8, r3)     // Catch:{ Exception -> 0x0306 }
            goto L_0x031c
        L_0x0306:
            r0 = move-exception
            java.lang.String r3 = "onNotificationQuickRepliedWithEmptyText: failed"
            defpackage.hm9.p(r2, r3, r0)
            o45 r1 = r1.c()
            ru.ok.tamtam.util.HandledException r2 = new ru.ok.tamtam.util.HandledException
            java.lang.String r3 = "failed log quick reply empty text"
            r2.<init>(r3, r0)
            cba r1 = (defpackage.cba) r1
            r1.c(r2, r5)
        L_0x031c:
            r0 = 2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.android.services.NotificationTamService.onStartCommand(android.content.Intent, int, int):int");
    }
}
