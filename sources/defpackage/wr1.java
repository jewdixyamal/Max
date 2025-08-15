package defpackage;

import android.app.Application;
import android.content.Intent;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.impl.service.CallServiceImpl;
import org.apache.http.HttpStatus;
import org.apache.http.util.VersionInfo;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* renamed from: wr1  reason: default package */
public final class wr1 implements kr1 {
    public static final /* synthetic */ bc7[] K;
    public final je7 A;
    public final je7 B;
    public final je7 C;
    public vxd D;
    public final w4d E;
    public boolean F;
    public final LinkedHashSet G = new LinkedHashSet();
    public final q0e H;
    public final q0e I;
    public final or1 J;
    public final jr1 a;
    public final a41 b;
    public final ds1 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public final je7 m;
    public final je7 n;
    public final je7 o;
    public final je7 p;
    public final je7 q;
    public final je7 r;
    public final je7 s;
    public final je7 t;
    public final je7 u;
    public final je7 v;
    public final je7 w;
    public final je7 x;
    public final je7 y;
    public final je7 z;

    static {
        oi9 oi9 = new oi9(wr1.class, "cameraTrackerJob", "getCameraTrackerJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        K = new bc7[]{oi9};
    }

    public wr1(je7 je7, je7 je72, je7 je73, je7 je74, je7 je75, je7 je76, je7 je77, je7 je78, je7 je79, je7 je710, je7 je711, je7 je712, je7 je713, je7 je714, je7 je715, je7 je716, je7 je717, je7 je718, je7 je719, je7 je720, je7 je721, je7 je722, je7 je723, je7 je724, je7 je725, jr1 jr1, a41 a41, ds1 ds1, je7 je726, je7 je727) {
        jr1 jr12 = jr1;
        this.a = jr12;
        this.b = a41;
        this.c = ds1;
        this.d = je7;
        this.e = je73;
        this.f = je74;
        this.g = je75;
        this.h = je76;
        this.i = je78;
        this.j = je710;
        this.k = je712;
        this.l = je77;
        this.m = je79;
        this.n = je711;
        this.o = je715;
        this.p = je713;
        this.q = je716;
        this.r = je717;
        this.s = je72;
        this.t = je719;
        this.u = je722;
        this.v = je720;
        this.w = je721;
        this.x = je723;
        this.y = je724;
        this.z = je726;
        this.A = je727;
        this.B = je714;
        this.C = je725;
        w4d D2 = mqd.D();
        this.E = D2;
        q0e a2 = r0e.a(d04.k);
        this.H = a2;
        this.I = a2;
        this.J = new or1(this, je77, je76, je72, je7);
        ((x6a) je718.getValue()).getClass();
        D2.o1(this, K[0], j47.T(jr12, ((w9a) ((kke) je717.getValue())).b(), (vx3) null, new nr1(this, (Continuation) null), 2));
        od2.L(new zn5(new xk1(new xk1(((cra) t()).w0, 10), 9), new vr1(this, (Continuation) null), 5), jr12);
    }

    public static final void a(wr1 wr1, Throwable th) {
        q0e q0e;
        Object value;
        d04 j2;
        int i2;
        int i3;
        String message;
        wr1 wr12 = wr1;
        Exception exc = th;
        wr1.getClass();
        hm9.r("CallEngineTag", exc, "can't start call", new Object[0]);
        do {
            q0e = wr12.H;
            value = q0e.getValue();
            d04 d04 = (d04) value;
            j2 = wr1.j();
            i2 = 4;
            String str = null;
            if (exc instanceof ApiInvocationException) {
                j1e j1e = wr1.j().a;
                if (j1e != null && (!(j1e instanceof zm1))) {
                    bt1 m2 = wr1.m();
                    String str2 = wr1.k().c;
                    int i4 = ((ApiInvocationException) exc).a;
                    m2.getClass();
                    bt1.c(m2, "GROUP_CALL_JOIN_FAILED", str2, (String) null, (Long) null, (String) null, String.valueOf(i4), true, 28);
                }
                String message2 = ((ApiInvocationException) exc).getMessage();
                i3 = message2 == null ? 0 : (w9e.p0(message2, "privacy.violation", false) || w9e.p0(message2, "call.blocked", false)) ? 3 : 4;
                os1 s2 = wr1.s();
                if (i3 != 0) {
                    switch (i3) {
                        case 1:
                            str = VersionInfo.UNAVAILABLE;
                            break;
                        case 2:
                            str = "BUSY";
                            break;
                        case 3:
                            str = "PRIVACY";
                            break;
                        case 4:
                            str = "FAILED";
                            break;
                        case 5:
                            str = "CONNECTION_ERROR";
                            break;
                        case 6:
                            str = "REMOVE_FROM_CALL";
                            break;
                        case 7:
                            str = "REMOVE_FROM_WAITING_ROOM";
                            break;
                        default:
                            throw null;
                    }
                }
                s2.a(str);
            } else {
                if ((exc instanceof IllegalStateException) && (message = th.getMessage()) != null && w9e.p0(message, "endpoint is null", false)) {
                    wr1.s().a((String) null);
                }
                i3 = 0;
            }
            if (i3 != 0) {
                i2 = i3;
            }
        } while (!q0e.c(value, d04.a(j2, (j1e) null, 0, (String) null, (String) null, false, false, false, (u8b) null, new b95(i2), 511)));
        wr1.z();
        if (exc instanceof IOException) {
            exc = new Exception(wg0.i("Can't create a call due to error: ", th.getMessage()), exc);
        }
        ((ty3) wr12.t.getValue()).a("ONEME-6833", exc);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v45, resolved type: nz4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v46, resolved type: nz4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void b(defpackage.wr1 r28, ru.ok.android.externcalls.sdk.events.end.ConversationEndReason r29) {
        /*
            r1 = r28
            r2 = r29
            d04 r0 = r28.k()
            java.lang.String r5 = r0.c
            d04 r0 = r28.k()
            boolean r0 = r0.g
            d04 r3 = r28.k()
            j1e r3 = r3.a
            r12 = 1
            if (r3 == 0) goto L_0x0022
            boolean r3 = r3.A()
            if (r3 != r12) goto L_0x0022
            r3 = 2
            goto L_0x0024
        L_0x0022:
            r3 = 1
        L_0x0024:
            boolean r13 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Hangup
            r14 = 0
            java.lang.String r6 = "ERROR"
            java.lang.String r7 = "BUSY"
            java.lang.String r8 = "REJECTED"
            if (r13 == 0) goto L_0x0033
            java.lang.String r9 = "HUNGUP"
        L_0x0031:
            r10 = r14
            goto L_0x0079
        L_0x0033:
            boolean r9 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Rejected
            if (r9 == 0) goto L_0x0050
            if (r0 == 0) goto L_0x004c
            je7 r9 = r1.y
            java.lang.Object r9 = r9.getValue()
            eua r9 = (defpackage.eua) r9
            java.lang.String[] r10 = defpackage.eua.h
            boolean r9 = r9.b(r10)
            if (r9 != 0) goto L_0x004c
            java.lang.String r9 = "no_permission"
            goto L_0x004d
        L_0x004c:
            r9 = r14
        L_0x004d:
            r10 = r9
            r9 = r8
            goto L_0x0079
        L_0x0050:
            boolean r9 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.RemovedFromCall
            if (r9 == 0) goto L_0x0057
            java.lang.String r9 = "KICK_BY_ADMIN"
            goto L_0x0031
        L_0x0057:
            boolean r9 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Busy
            if (r9 == 0) goto L_0x005d
            r9 = r7
            goto L_0x0031
        L_0x005d:
            boolean r9 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Canceled
            if (r9 == 0) goto L_0x0064
            java.lang.String r9 = "CANCELED"
            goto L_0x0031
        L_0x0064:
            boolean r9 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Error
            if (r9 == 0) goto L_0x0076
            r9 = r2
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$Error r9 = (ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Error) r9
            java.lang.Throwable r9 = r9.getThrowable()
            java.lang.String r9 = r9.getMessage()
            r10 = r9
            r9 = r6
            goto L_0x0079
        L_0x0076:
            java.lang.String r9 = "OTHER"
            goto L_0x0031
        L_0x0079:
            r15 = 0
            if (r0 == 0) goto L_0x0082
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x0092
        L_0x0082:
            if (r0 == 0) goto L_0x008a
            boolean r7 = r9.equals(r7)
            if (r7 != 0) goto L_0x0092
        L_0x008a:
            if (r0 == 0) goto L_0x00ad
            boolean r0 = r9.equals(r6)
            if (r0 == 0) goto L_0x00ad
        L_0x0092:
            bt1 r0 = r28.m()
            r0.getClass()
            java.lang.Long r7 = java.lang.Long.valueOf(r3)
            java.lang.String r4 = "INCOMING_CALL_RECEIVED"
            r11 = 80
            r8 = 0
            r16 = 0
            r3 = r0
            r6 = r9
            r9 = r10
            r10 = r16
            defpackage.bt1.c(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00d0
        L_0x00ad:
            bt1 r3 = r28.m()
            d04 r0 = r28.j()
            j1e r0 = r0.a
            if (r0 == 0) goto L_0x00c0
            boolean r0 = r0 instanceof defpackage.zm1
            r0 = r0 ^ r12
            if (r0 != r12) goto L_0x00c0
            r0 = r12
            goto L_0x00c1
        L_0x00c0:
            r0 = r15
        L_0x00c1:
            r3.getClass()
            java.lang.String r4 = "FINISH_CALL"
            r11 = 24
            r7 = 0
            r8 = 0
            r6 = r9
            r9 = r10
            r10 = r0
            defpackage.bt1.c(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L_0x00d0:
            ru.ok.android.externcalls.sdk.Conversation r3 = r28.o()
            if (r3 == 0) goto L_0x0491
            je7 r4 = r1.g
            java.lang.Object r0 = r4.getValue()
            r5 = r0
            jt4 r5 = (defpackage.jt4) r5
            d04 r0 = r28.j()
            boolean r0 = r0.f
            if (r0 != 0) goto L_0x00e9
            goto L_0x024c
        L_0x00e9:
            je7 r0 = r1.w
            java.lang.Object r0 = r0.getValue()
            y7d r0 = (defpackage.y7d) r0
            qyc r0 = (defpackage.qyc) r0
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r6 = ru.ok.tamtam.android.prefs.PmsKey.f15callrate
            java.lang.String r6 = r0.w(r6, r14)
            if (r6 != 0) goto L_0x0100
            goto L_0x024c
        L_0x0100:
            r7 = 10
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x011f }
            r0.<init>((java.lang.String) r6)     // Catch:{ all -> 0x011f }
            java.lang.String r8 = "limit"
            int r8 = r0.optInt(r8, r7)     // Catch:{ all -> 0x011f }
            java.lang.String r9 = "sdk-limit"
            int r9 = r0.optInt(r9, r7)     // Catch:{ all -> 0x011f }
            java.lang.String r10 = "duration"
            int r0 = r0.optInt(r10, r7)     // Catch:{ all -> 0x011f }
            x4c r10 = new x4c     // Catch:{ all -> 0x011f }
            r10.<init>(r8, r9, r0)     // Catch:{ all -> 0x011f }
            goto L_0x0125
        L_0x011f:
            r0 = move-exception
            njc r10 = new njc
            r10.<init>(r0)
        L_0x0125:
            java.lang.Throwable r0 = defpackage.pjc.a(r10)
            if (r0 == 0) goto L_0x013b
            java.lang.String r0 = "invalid rate call params json config "
            java.lang.String r0 = r0.concat(r6)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r0)
            java.lang.String r8 = "RateCallParams"
            defpackage.hm9.p(r8, r0, r6)
        L_0x013b:
            boolean r0 = r10 instanceof defpackage.njc
            if (r0 == 0) goto L_0x0140
            r10 = r14
        L_0x0140:
            x4c r10 = (defpackage.x4c) r10
            if (r10 != 0) goto L_0x0146
            goto L_0x024c
        L_0x0146:
            je7 r0 = r1.v
            java.lang.Object r6 = r0.getValue()
            hp r6 = (defpackage.hp) r6
            jp r6 = (defpackage.jp) r6
            ne7 r6 = r6.g
            java.lang.String r8 = "call.rate.indicator"
            int r6 = r6.getInt(r8, r15)
            ru.ok.android.externcalls.sdk.rate.RateManager r9 = r3.getRateManager()
            boolean r9 = r9.getShouldRateConversation()
            if (r9 == 0) goto L_0x0165
            int r9 = r10.b
            goto L_0x0167
        L_0x0165:
            int r9 = r10.a
        L_0x0167:
            int r9 = r9 - r6
            if (r9 > r12) goto L_0x023a
            ru.ok.android.externcalls.sdk.rate.RateManager r6 = r3.getRateManager()
            boolean r6 = r6.getShouldRateConversation()
            if (r6 == 0) goto L_0x019d
            ru.ok.android.externcalls.sdk.rate.RateManager r6 = r3.getRateManager()
            java.util.List r6 = r6.getRateHints()
            java.util.ArrayList r9 = new java.util.ArrayList
            int r7 = defpackage.z53.S(r6, r7)
            r9.<init>(r7)
            java.util.Iterator r6 = r6.iterator()
        L_0x0189:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x019f
            java.lang.Object r7 = r6.next()
            ru.ok.android.externcalls.sdk.rate.RateHint r7 = (ru.ok.android.externcalls.sdk.rate.RateHint) r7
            java.lang.String r7 = r7.getReason()
            r9.add(r7)
            goto L_0x0189
        L_0x019d:
            nz4 r9 = defpackage.nz4.a
        L_0x019f:
            boolean r6 = r3.isGroupCall()
            if (r6 != 0) goto L_0x024c
            boolean r6 = r10.d
            if (r6 != 0) goto L_0x01ab
            goto L_0x024c
        L_0x01ab:
            ru.ok.android.externcalls.sdk.events.end.ConversationEndReason$Hangup r6 = ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Hangup.INSTANCE
            boolean r6 = defpackage.tpa.f(r2, r6)
            if (r6 == 0) goto L_0x024c
            q0e r5 = r5.e
            java.lang.Object r5 = r5.getValue()
            java.lang.Long r5 = (java.lang.Long) r5
            if (r5 == 0) goto L_0x024c
            long r5 = r5.longValue()
            int r7 = r10.c
            long r10 = (long) r7
            int r5 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r5 <= 0) goto L_0x024c
            je7 r5 = r1.o
            java.lang.Object r5 = r5.getValue()
            qs1 r5 = (defpackage.qs1) r5
            java.lang.String r6 = r3.getConversationId()
            boolean r7 = r1.F
            if (r7 != 0) goto L_0x01e1
            boolean r7 = r3.isInitialVideoEnabled()
            if (r7 == 0) goto L_0x01df
            goto L_0x01e1
        L_0x01df:
            r7 = r15
            goto L_0x01e2
        L_0x01e1:
            r7 = r12
        L_0x01e2:
            je7 r10 = r5.c
            java.lang.Object r10 = r10.getValue()
            lqf r10 = (defpackage.lqf) r10
            boolean r10 = r10.c()
            if (r10 == 0) goto L_0x024c
            je7 r5 = r5.b
            java.lang.Object r5 = r5.getValue()
            ya1 r5 = (defpackage.ya1) r5
            r5.getClass()
            android.content.Intent r10 = new android.content.Intent
            android.app.Application r11 = r5.c()
            java.lang.Class<one.me.android.calls.CallNotifierFixActivity> r14 = one.me.android.calls.CallNotifierFixActivity.class
            r10.<init>(r11, r14)
            java.lang.String r11 = "action-rate-call"
            r10.setAction(r11)
            java.lang.String r11 = "call_id"
            r10.putExtra(r11, r6)
            java.lang.String r6 = "is_video"
            r10.putExtra(r6, r7)
            java.lang.String[] r6 = new java.lang.String[r15]
            java.lang.Object[] r6 = r9.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            java.lang.String r7 = "sdk_reasons"
            r10.putExtra(r7, r6)
            r6 = 268435456(0x10000000, float:2.5243549E-29)
            r10.setFlags(r6)
            android.app.Application r5 = r5.c()
            r5.startActivity(r10)
            java.lang.Object r0 = r0.getValue()
            hp r0 = (defpackage.hp) r0
            jp r0 = (defpackage.jp) r0
            r0.k(r15, r8)
            goto L_0x024c
        L_0x023a:
            java.lang.Object r0 = r0.getValue()
            hp r0 = (defpackage.hp) r0
            jp r0 = (defpackage.jp) r0
            ne7 r5 = r0.g
            int r5 = r5.getInt(r8, r15)
            int r5 = r5 + r12
            r0.k(r5, r8)
        L_0x024c:
            java.lang.Object r0 = r4.getValue()
            jt4 r0 = (defpackage.jt4) r0
        L_0x0252:
            q0e r4 = r0.d
            java.lang.Object r5 = r4.getValue()
            r6 = r5
            java.lang.Long r6 = (java.lang.Long) r6
            r6 = 0
            boolean r4 = r4.c(r5, r6)
            if (r4 == 0) goto L_0x0252
            vxd r4 = r0.b
            if (r4 == 0) goto L_0x0269
            r4.cancel((java.util.concurrent.CancellationException) r6)
        L_0x0269:
            r0.b = r6
            lkc r0 = r28.u()
            r0.c()
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Missed
            q0e r4 = r1.H
            if (r0 == 0) goto L_0x02ae
        L_0x0278:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            d04 r2 = (defpackage.d04) r2
            d04 r13 = r28.j()
            b95 r2 = new b95
            r2.<init>(r12)
            r20 = 0
            r24 = 511(0x1ff, float:7.16E-43)
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = r2
            d04 r2 = defpackage.d04.a(r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r0 = r4.c(r0, r2)
            if (r0 == 0) goto L_0x0278
            lkc r0 = r28.u()
            r0.b()
            goto L_0x0491
        L_0x02ae:
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Rejected
            if (r0 == 0) goto L_0x02f8
        L_0x02b2:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            d04 r2 = (defpackage.d04) r2
            d04 r16 = r28.j()
            b95 r2 = new b95
            r2.<init>(r12)
            r23 = 0
            r27 = 511(0x1ff, float:7.16E-43)
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = r2
            d04 r2 = defpackage.d04.a(r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r0 = r4.c(r0, r2)
            if (r0 == 0) goto L_0x02b2
            lkc r0 = r28.u()
            r0.getClass()
            kkc r1 = defpackage.kkc.BUSY
            r0.c = r1
            xh1 r0 = r0.a()
            wh1 r1 = r0.b
            fd7 r1 = r1.f
            r0.a(r1, r15)
            goto L_0x0491
        L_0x02f8:
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Busy
            if (r0 == 0) goto L_0x0343
        L_0x02fc:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            d04 r2 = (defpackage.d04) r2
            d04 r16 = r28.j()
            b95 r2 = new b95
            r3 = 2
            r2.<init>(r3)
            r23 = 0
            r27 = 511(0x1ff, float:7.16E-43)
            r17 = 0
            r18 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = r2
            d04 r2 = defpackage.d04.a(r16, r17, r18, r20, r21, r22, r23, r24, r25, r26, r27)
            boolean r0 = r4.c(r0, r2)
            if (r0 == 0) goto L_0x02fc
            lkc r0 = r28.u()
            r0.getClass()
            kkc r1 = defpackage.kkc.BUSY
            r0.c = r1
            xh1 r0 = r0.a()
            wh1 r1 = r0.b
            fd7 r1 = r1.f
            r0.a(r1, r15)
            goto L_0x0491
        L_0x0343:
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.RemovedFromCall
            if (r0 == 0) goto L_0x0398
        L_0x0347:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            d04 r2 = (defpackage.d04) r2
            d04 r5 = r28.j()
            i95 r2 = r5.j
            boolean r2 = r2 instanceof defpackage.h95
            if (r2 == 0) goto L_0x036e
            b95 r15 = new b95
            r2 = 7
            r15.<init>(r2)
            r12 = 0
            r16 = 511(0x1ff, float:7.16E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            d04 r2 = defpackage.d04.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0383
        L_0x036e:
            b95 r15 = new b95
            r2 = 6
            r15.<init>(r2)
            r12 = 0
            r16 = 511(0x1ff, float:7.16E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            d04 r2 = defpackage.d04.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0383:
            boolean r0 = r4.c(r0, r2)
            if (r0 == 0) goto L_0x0347
            boolean r0 = r3.isAnswered()
            if (r0 == 0) goto L_0x0491
            lkc r0 = r28.u()
            r0.b()
            goto L_0x0491
        L_0x0398:
            c95 r17 = defpackage.c95.b
            if (r13 != 0) goto L_0x0462
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.EndedForAll
            if (r0 != 0) goto L_0x0462
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Canceled
            if (r0 != 0) goto L_0x0462
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.AcceptedOnAnotherDevice
            if (r0 == 0) goto L_0x03aa
            goto L_0x0462
        L_0x03aa:
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.ConversationAlreadyEnded
            if (r0 != 0) goto L_0x041e
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.CallTimeout
            if (r0 != 0) goto L_0x041e
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Error
            if (r0 != 0) goto L_0x041e
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.ObsoleteClient
            if (r0 != 0) goto L_0x041e
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.Unknown
            if (r0 == 0) goto L_0x03bf
            goto L_0x041e
        L_0x03bf:
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.PeerConnectionTimeout
            if (r0 != 0) goto L_0x03ce
            boolean r0 = r2 instanceof ru.ok.android.externcalls.sdk.events.end.ConversationEndReason.SignalingTimeout
            if (r0 == 0) goto L_0x03c8
            goto L_0x03ce
        L_0x03c8:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03ce:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            d04 r2 = (defpackage.d04) r2
            d04 r5 = r28.j()
            b95 r15 = new b95
            r2 = 5
            r15.<init>(r2)
            r12 = 0
            r16 = 511(0x1ff, float:7.16E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            d04 r2 = defpackage.d04.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = r4.c(r0, r2)
            if (r0 == 0) goto L_0x03ce
            bt1 r5 = r28.m()
            java.lang.String r7 = r3.getConversationId()
            boolean r12 = r3.isGroupCall()
            r5.getClass()
            r10 = 0
            r11 = 0
            java.lang.String r6 = "BAD_CONNECTION_ALERT"
            java.lang.String r8 = "DISCONNECT"
            r9 = 0
            r13 = 56
            defpackage.bt1.c(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            boolean r0 = r3.isAnswered()
            if (r0 == 0) goto L_0x0491
            lkc r0 = r28.u()
            r0.b()
            goto L_0x0491
        L_0x041e:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            d04 r2 = (defpackage.d04) r2
            d04 r5 = r28.j()
            boolean r2 = r5.g
            if (r2 == 0) goto L_0x043f
            r12 = 0
            r16 = 511(0x1ff, float:7.16E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = r17
            d04 r2 = defpackage.d04.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0454
        L_0x043f:
            b95 r15 = new b95
            r2 = 4
            r15.<init>(r2)
            r12 = 0
            r16 = 511(0x1ff, float:7.16E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            d04 r2 = defpackage.d04.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x0454:
            boolean r0 = r4.c(r0, r2)
            if (r0 == 0) goto L_0x041e
            lkc r0 = r28.u()
            r0.c()
            goto L_0x0491
        L_0x0462:
            java.lang.Object r0 = r4.getValue()
            r2 = r0
            d04 r2 = (defpackage.d04) r2
            d04 r5 = r28.j()
            r12 = 0
            r16 = 511(0x1ff, float:7.16E-43)
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = r17
            d04 r2 = defpackage.d04.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r0 = r4.c(r0, r2)
            if (r0 == 0) goto L_0x0462
            boolean r0 = r3.isAnswered()
            if (r0 == 0) goto L_0x0491
            lkc r0 = r28.u()
            r0.b()
        L_0x0491:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr1.b(wr1, ru.ok.android.externcalls.sdk.events.end.ConversationEndReason):void");
    }

    public static final void c(wr1 wr1) {
        Object value;
        d04 j2;
        q0e q0e = wr1.H;
        do {
            value = q0e.getValue();
            d04 d04 = (d04) value;
            j2 = wr1.j();
            if (!j2.f) {
                wr1.B(true);
            }
            Conversation a2 = wr1.n().a();
            Collection participants = a2 != null ? a2.getParticipants() : null;
            if (participants == null) {
                participants = nz4.a;
            }
            boolean z2 = j2.h;
            boolean z3 = (z2 || participants.size() <= 2) ? z2 : true;
            boolean z4 = j2.e;
            boolean z5 = (z4 || !wr1.x(participants)) ? z4 : true;
            if (!(z5 == z4 && z3 == z2)) {
                j2 = d04.a(j2, (j1e) null, 0, (String) null, (String) null, z5, false, z3, (u8b) null, (i95) null, 879);
            }
        } while (!q0e.c(value, j2));
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, mec] */
    public final void A(lyd lyd) {
        z31 z31;
        kyd kyd = lyd.a;
        if (!f(kyd)) {
            hm9.m("CallEngineTag", "outgoing call can't start because call already started.", new Object[0]);
            return;
        }
        i((yg1) null);
        ? obj = new Object();
        lr1 lr1 = new lr1(lyd, obj, this, 0);
        f fVar = new f(1, this, wr1.class, "handleCallCreateError", "handleCallCreateError(Ljava/lang/Throwable;)V", 0, 5);
        a41 a41 = this.b;
        a41.getClass();
        if (kyd instanceof iyd) {
            z31 = a41.a(((iyd) kyd).a, lyd, lr1, fVar);
        } else if (kyd instanceof gyd) {
            z31 = a41.b(((gyd) kyd).a, lyd, lr1, fVar);
        } else if (kyd instanceof hyd) {
            hyd hyd = (hyd) kyd;
            z31 = a41.d(hyd.a, hyd.b, lyd, lr1, fVar);
        } else if (kyd instanceof jyd) {
            j1e j1e = ((jyd) kyd).a;
            if (j1e instanceof zm1) {
                z31 = a41.a((zm1) j1e, lyd, lr1, fVar);
            } else if (j1e instanceof xm1) {
                z31 = a41.b((xm1) j1e, lyd, lr1, fVar);
            } else if (j1e instanceof ym1) {
                ym1 ym1 = (ym1) j1e;
                z31 = a41.d(ym1.d, ym1.e, lyd, lr1, fVar);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
        h(z31);
        obj.a = z31;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if ((!(r2 instanceof defpackage.zm1)) == true) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void B(boolean r19) {
        /*
            r18 = this;
            r0 = r18
            ru.ok.android.externcalls.sdk.Conversation r1 = r18.o()
            if (r1 == 0) goto L_0x017a
            d04 r2 = r18.j()
            j1e r2 = r2.a
            if (r2 == 0) goto L_0x0017
            boolean r2 = r2 instanceof defpackage.zm1
            r4 = 1
            r2 = r2 ^ r4
            if (r2 != r4) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r4 = 0
        L_0x0018:
            d04 r2 = r18.j()
            boolean r2 = r2.f
            f95 r17 = defpackage.f95.b
            q0e r15 = r0.H
            if (r19 != 0) goto L_0x006c
            if (r2 == 0) goto L_0x006c
            lkc r2 = r18.u()
            r2.c()
        L_0x002d:
            java.lang.Object r2 = r15.getValue()
            r5 = r2
            d04 r5 = (defpackage.d04) r5
            d04 r5 = r18.j()
            r13 = 0
            r14 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 1
            r16 = 479(0x1df, float:6.71E-43)
            r3 = r15
            r15 = r17
            d04 r5 = defpackage.d04.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r2 = r3.c(r2, r5)
            if (r2 == 0) goto L_0x006a
            if (r4 != 0) goto L_0x006d
            lkc r2 = r18.u()
            r2.getClass()
            kkc r5 = defpackage.kkc.CONNECTED
            r2.c = r5
            xh1 r2 = r2.a()
            wh1 r5 = r2.b
            fd7 r5 = r5.e
            r6 = 0
            r2.a(r5, r6)
            goto L_0x006d
        L_0x006a:
            r15 = r3
            goto L_0x002d
        L_0x006c:
            r3 = r15
        L_0x006d:
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection r1 = r1.getParticipants()
            boolean r2 = r1 instanceof java.util.Collection
            if (r2 == 0) goto L_0x007d
            boolean r2 = r1.isEmpty()
            if (r2 == 0) goto L_0x007d
            goto L_0x017a
        L_0x007d:
            java.util.Iterator r1 = r1.iterator()
        L_0x0081:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x017a
            java.lang.Object r2 = r1.next()
            ru.ok.android.externcalls.sdk.ConversationParticipant r2 = (ru.ok.android.externcalls.sdk.ConversationParticipant) r2
            oqa r5 = r18.t()
            cra r5 = (defpackage.cra) r5
            fqa r5 = r5.c()
            ig1 r5 = r5.a
            gg1 r5 = r5.getId()
            ru.ok.android.externcalls.sdk.id.ParticipantId r5 = defpackage.mqa.d(r5)
            boolean r6 = r2.isUseable()
            if (r6 == 0) goto L_0x0177
            boolean r6 = r2.isCallAccepted()
            if (r6 == 0) goto L_0x0177
            ru.ok.android.externcalls.sdk.id.ParticipantId r2 = r2.getExternalId()
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L_0x0177
            je7 r1 = r0.s
            java.lang.Object r1 = r1.getValue()
            hl1 r1 = (defpackage.hl1) r1
            je7 r2 = r0.d
            java.lang.Object r2 = r2.getValue()
            android.app.Application r2 = (android.app.Application) r2
            r1.getClass()
            defpackage.hl1.d(r2)
            lkc r1 = r18.u()
            r1.c()
            je7 r1 = r0.g
            java.lang.Object r1 = r1.getValue()
            jt4 r1 = (defpackage.jt4) r1
            vxd r2 = r1.b
            if (r2 != 0) goto L_0x00ef
            it4 r2 = new it4
            r5 = 0
            r2.<init>(r1, r5)
            jr1 r6 = r1.a
            r7 = 3
            vxd r2 = defpackage.j47.T(r6, r5, r5, r2, r7)
            r1.b = r2
        L_0x00ef:
            d04 r1 = r18.j()
            boolean r1 = r1.g
            if (r1 != 0) goto L_0x0110
            if (r4 != 0) goto L_0x0110
            lkc r1 = r18.u()
            r1.getClass()
            kkc r2 = defpackage.kkc.CONNECTED
            r1.c = r2
            xh1 r1 = r1.a()
            wh1 r2 = r1.b
            fd7 r2 = r2.e
            r5 = 0
            r1.a(r2, r5)
        L_0x0110:
            if (r4 == 0) goto L_0x0147
            bt1 r6 = r18.m()
            d04 r1 = r18.k()
            java.lang.String r8 = r1.c
            oqa r1 = r18.t()
            cra r1 = (defpackage.cra) r1
            java.util.concurrent.atomic.AtomicReference r1 = r1.s0
            java.lang.Object r1 = r1.get()
            pqa r1 = (defpackage.pqa) r1
            java.util.Map r1 = r1.c
            java.util.Collection r1 = r1.values()
            int r1 = r1.size()
            long r1 = (long) r1
            java.lang.Long r10 = java.lang.Long.valueOf(r1)
            r6.getClass()
            r11 = 0
            r14 = 52
            java.lang.String r7 = "GROUP_CALL_JOIN"
            r9 = 0
            r12 = 0
            r13 = 1
            defpackage.bt1.c(r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x0147:
            java.lang.Object r1 = r3.getValue()
            r2 = r1
            d04 r2 = (defpackage.d04) r2
            d04 r5 = r18.j()
            r13 = 0
            r14 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 1
            r16 = 479(0x1df, float:6.71E-43)
            r15 = r17
            d04 r2 = defpackage.d04.a(r5, r6, r7, r9, r10, r11, r12, r13, r14, r15, r16)
            boolean r1 = r3.c(r1, r2)
            if (r1 == 0) goto L_0x0147
            je7 r0 = r0.m
            java.lang.Object r0 = r0.getValue()
            era r0 = (defpackage.era) r0
            fra r0 = (defpackage.fra) r0
            r0.rebindParticipantViews()
            goto L_0x017a
        L_0x0177:
            r5 = 0
            goto L_0x0081
        L_0x017a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr1.B(boolean):void");
    }

    public final void d(zl1 zl1) {
        this.G.add(zl1);
    }

    public final void e() {
        hm9.m("CallEngineTag", "call answer", new Object[0]);
        String str = k().c;
        j1e j1e = k().a;
        long j2 = (j1e == null || !j1e.A()) ? 1 : 2;
        bt1 m2 = m();
        m2.getClass();
        bt1.c(m2, "INCOMING_CALL_RECEIVED", str, "ANSWERED", Long.valueOf(j2), (String) null, (String) null, false, 80);
        Conversation o2 = o();
        if (o2 != null && o2.isPrepared()) {
            o2.init();
            o2.connect();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r2 = r9 instanceof defpackage.hyd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f(defpackage.kyd r9) {
        /*
            r8 = this;
            d04 r0 = r8.j()
            j1e r0 = r0.a
            r1 = 1
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            boolean r2 = r9 instanceof defpackage.gyd
            r3 = 0
            if (r2 == 0) goto L_0x0025
            boolean r2 = r0 instanceof defpackage.xm1
            if (r2 == 0) goto L_0x0025
            r2 = r9
            gyd r2 = (defpackage.gyd) r2
            xm1 r2 = r2.a
            long r4 = r2.d
            r2 = r0
            xm1 r2 = (defpackage.xm1) r2
            long r6 = r2.d
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x0025
        L_0x0023:
            r1 = r3
            goto L_0x007e
        L_0x0025:
            boolean r2 = r9 instanceof defpackage.iyd
            if (r2 == 0) goto L_0x003e
            boolean r2 = r0 instanceof defpackage.zm1
            if (r2 == 0) goto L_0x003e
            r2 = r9
            iyd r2 = (defpackage.iyd) r2
            zm1 r2 = r2.a
            long r4 = r2.d
            r2 = r0
            zm1 r2 = (defpackage.zm1) r2
            long r6 = r2.d
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 != 0) goto L_0x003e
            goto L_0x0023
        L_0x003e:
            boolean r2 = r9 instanceof defpackage.hyd
            if (r2 == 0) goto L_0x005f
            boolean r4 = r0 instanceof defpackage.ym1
            if (r4 == 0) goto L_0x005f
            r4 = r9
            hyd r4 = (defpackage.hyd) r4
            java.lang.String r4 = r4.a
            java.lang.String r4 = defpackage.c37.C(r4)
            r5 = r0
            ym1 r5 = (defpackage.ym1) r5
            java.lang.String r5 = r5.d
            java.lang.String r5 = defpackage.c37.C(r5)
            boolean r4 = defpackage.tpa.f(r4, r5)
            if (r4 == 0) goto L_0x005f
            goto L_0x0023
        L_0x005f:
            if (r2 == 0) goto L_0x007e
            boolean r0 = r0 instanceof defpackage.xm1
            if (r0 == 0) goto L_0x007e
            hyd r9 = (defpackage.hyd) r9
            java.lang.String r9 = r9.a
            java.lang.String r9 = defpackage.c37.C(r9)
            d04 r8 = r8.j()
            java.lang.String r8 = r8.d
            java.lang.String r8 = defpackage.c37.C(r8)
            boolean r8 = defpackage.tpa.f(r9, r8)
            if (r8 == 0) goto L_0x007e
            goto L_0x0023
        L_0x007e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr1.f(kyd):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: ym1} */
    /* JADX WARNING: type inference failed for: r4v8, types: [a66, ffe] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void g(defpackage.z31 r33) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r4 = 1
            java.lang.String r5 = "CallEngineTag"
            java.lang.String r6 = "init prepared conversation"
            defpackage.hm9.m(r5, r6, new java.lang.Object[0])
            d04 r6 = r32.j()
            u8b r6 = r6.i
            if (r6 == 0) goto L_0x003e
            ru.ok.android.externcalls.sdk.Conversation r1 = r1.a
            java.lang.String r1 = r1.getConversationId()
            d04 r2 = r32.j()
            java.lang.String r2 = r2.c
            d04 r3 = r32.j()
            u8b r3 = r3.i
            java.lang.String r4 = "Call already destroyed, release all: prepared="
            java.lang.String r6 = " active="
            java.lang.String r7 = " previousCallState="
            java.lang.StringBuilder r1 = defpackage.k7d.k(r4, r1, r6, r2, r7)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            defpackage.hm9.m(r5, r1, new java.lang.Object[0])
            r32.z()
            return
        L_0x003e:
            java.util.LinkedHashSet r6 = r0.G
            java.util.Iterator r6 = r6.iterator()
        L_0x0044:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0054
            java.lang.Object r7 = r6.next()
            zl1 r7 = (defpackage.zl1) r7
            r7.g()
            goto L_0x0044
        L_0x0054:
            d04 r6 = r32.j()
            i95 r6 = r6.j
            ru.ok.android.externcalls.sdk.Conversation r7 = r1.a
            boolean r8 = r1.d
            if (r8 == 0) goto L_0x007b
            boolean r9 = r7.isCaller()
            if (r9 == 0) goto L_0x0067
            goto L_0x007b
        L_0x0067:
            boolean r9 = r7.isAnswered()
            if (r9 != 0) goto L_0x007b
            boolean r9 = r7.isConcurrent()
            if (r9 != 0) goto L_0x007b
            boolean r9 = r7.isCaller()
            if (r9 != 0) goto L_0x007b
            r9 = r4
            goto L_0x007c
        L_0x007b:
            r9 = 0
        L_0x007c:
            b31 r10 = r32.l()
            l31 r10 = (defpackage.l31) r10
            q0e r10 = r10.k
            java.lang.Object r10 = r10.getValue()
            y21 r10 = (defpackage.y21) r10
            r11 = 3
            r13 = 2
            j1e r14 = r1.b
            ru.ok.android.externcalls.sdk.Conversation r1 = r1.a
            if (r9 == 0) goto L_0x01b1
            java.lang.String r15 = "doAfterCallPrepared show incoming"
            defpackage.hm9.m(r5, r15, new java.lang.Object[0])
            je7 r5 = r0.o
            java.lang.Object r5 = r5.getValue()
            qs1 r5 = (defpackage.qs1) r5
            boolean r15 = r14.A()
            r5.getClass()
            java.lang.String r12 = "CallsNavigatorTag"
            java.lang.String r3 = "show showIncomingCallUi"
            defpackage.hm9.m(r12, r3, new java.lang.Object[0])
            je7 r3 = r5.a
            java.lang.Object r3 = r3.getValue()
            vs1 r3 = (defpackage.vs1) r3
            pv9 r2 = r3.e()
            android.app.NotificationManager r2 = r2.b
            int r2 = defpackage.iv9.b(r2)
            if (r2 == 0) goto L_0x00ca
            if (r2 == r4) goto L_0x00ca
            if (r2 == r13) goto L_0x0160
            if (r2 == r11) goto L_0x0160
            r11 = 4
            if (r2 == r11) goto L_0x0160
        L_0x00ca:
            pv9 r2 = r3.e()
            android.app.NotificationManager r2 = r2.b
            boolean r2 = defpackage.jv9.a(r2)
            if (r2 == 0) goto L_0x0160
            pv9 r2 = r3.e()
            android.app.NotificationManager r2 = r2.b     // Catch:{ all -> 0x0160 }
            defpackage.iv9.a(r2)     // Catch:{ all -> 0x0160 }
            pv9 r2 = r3.e()
            je7 r3 = r3.c
            java.lang.Object r3 = r3.getValue()
            p84 r3 = (defpackage.p84) r3
            r3.getClass()
            int r3 = android.os.Build.VERSION.SDK_INT
            android.app.NotificationManager r2 = r2.b
            java.lang.String r11 = "ru.oneme.app.new.incomingCalls."
            android.app.NotificationChannel r2 = defpackage.kv9.i(r2, r11)
            if (r2 == 0) goto L_0x0149
            fm5 r11 = new fm5
            java.lang.String r16 = defpackage.ht9.i(r2)
            int r13 = defpackage.ht9.j(r2)
            r4 = 8
            r11.<init>((int) r4)
            android.net.Uri r4 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            r16.getClass()
            r11.b = r13
            android.media.AudioAttributes r4 = android.app.Notification.AUDIO_ATTRIBUTES_DEFAULT
            defpackage.ht9.m(r2)
            defpackage.ht9.g(r2)
            defpackage.ht9.h(r2)
            defpackage.ht9.b(r2)
            defpackage.ht9.n(r2)
            defpackage.ht9.f(r2)
            defpackage.ht9.v(r2)
            defpackage.ht9.k(r2)
            defpackage.ht9.w(r2)
            defpackage.ht9.o(r2)
            r4 = 30
            if (r3 < r4) goto L_0x013a
            defpackage.jt9.b(r2)
            defpackage.jt9.a(r2)
        L_0x013a:
            defpackage.ht9.a(r2)
            defpackage.ht9.l(r2)
            defpackage.it9.a(r2)
            if (r3 < r4) goto L_0x014a
            defpackage.jt9.c(r2)
            goto L_0x014a
        L_0x0149:
            r11 = 0
        L_0x014a:
            if (r11 == 0) goto L_0x0153
            int r2 = r11.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0154
        L_0x0153:
            r2 = 0
        L_0x0154:
            if (r2 != 0) goto L_0x0157
            goto L_0x015e
        L_0x0157:
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x015e
            goto L_0x0160
        L_0x015e:
            r2 = 1
            goto L_0x0161
        L_0x0160:
            r2 = 0
        L_0x0161:
            if (r2 == 0) goto L_0x0169
            java.lang.String r2 = "notification available, will show via service."
            defpackage.hm9.m(r12, r2, new java.lang.Object[0])
            goto L_0x01bc
        L_0x0169:
            if (r2 != 0) goto L_0x01ab
            je7 r3 = r5.c
            java.lang.Object r3 = r3.getValue()
            lqf r3 = (defpackage.lqf) r3
            boolean r3 = r3.c()
            if (r3 == 0) goto L_0x01ab
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "show call screen areIncomingNotificationsEnabled="
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            defpackage.hm9.m(r12, r2, new java.lang.Object[0])
            je7 r2 = r5.b
            java.lang.Object r2 = r2.getValue()
            ya1 r2 = (defpackage.ya1) r2
            r2.getClass()
            android.content.Intent r3 = new android.content.Intent
            android.app.Application r4 = r2.c()
            java.lang.Class<one.me.android.calls.CallNotifierFixActivity> r5 = one.me.android.calls.CallNotifierFixActivity.class
            r3.<init>(r4, r5)
            defpackage.ya1.b(r3, r10, r15)
            android.app.Application r2 = r2.c()
            r2.startActivity(r3)
            goto L_0x01bc
        L_0x01ab:
            java.lang.String r0 = "can't show incoming call ui"
            defpackage.hm9.m(r12, r0, new java.lang.Object[0])
            return
        L_0x01b1:
            java.lang.String r2 = "doAfterCallPrepared answer"
            defpackage.hm9.m(r5, r2, new java.lang.Object[0])
            r1.init()
            r1.connect()
        L_0x01bc:
            je7 r2 = r0.s
            java.lang.Object r2 = r2.getValue()
            hl1 r2 = (defpackage.hl1) r2
            je7 r3 = r0.d
            java.lang.Object r3 = r3.getValue()
            android.app.Application r3 = (android.app.Application) r3
            r2.getClass()
            defpackage.hl1.d(r3)
            if (r9 == 0) goto L_0x0205
            lkc r2 = r32.u()
            r2.getClass()
            kkc r3 = defpackage.kkc.INCOMING
            r2.c = r3
            xh1 r2 = r2.a()
            khe r3 = r2.d
            java.lang.Object r3 = r3.getValue()
            android.media.AudioManager r3 = (android.media.AudioManager) r3
            int r3 = r3.getRingerMode()
            r4 = 1
            if (r3 == r4) goto L_0x0201
            r5 = 2
            if (r3 == r5) goto L_0x01f6
            goto L_0x0245
        L_0x01f6:
            wh1 r3 = r2.b
            fd7 r3 = r3.b
            r2.a(r3, r4)
            r2.b()
            goto L_0x0245
        L_0x0201:
            r2.b()
            goto L_0x0245
        L_0x0205:
            boolean r2 = r14 instanceof defpackage.zm1
            if (r2 == 0) goto L_0x0235
            boolean r3 = r7.isCaller()
            if (r3 == 0) goto L_0x0235
            boolean r3 = r7.isDestroyed()
            if (r3 != 0) goto L_0x0235
            boolean r3 = r7.isAnswered()
            if (r3 != 0) goto L_0x0235
            g95 r6 = defpackage.g95.b
            lkc r2 = r32.u()
            r2.getClass()
            kkc r3 = defpackage.kkc.BEEP
            r2.c = r3
            xh1 r2 = r2.a()
            wh1 r3 = r2.b
            fd7 r3 = r3.c
            r4 = 1
            r2.a(r3, r4)
            goto L_0x0245
        L_0x0235:
            if (r2 != 0) goto L_0x0245
            boolean r2 = r6 instanceof defpackage.h95
            if (r2 == 0) goto L_0x023c
            goto L_0x023e
        L_0x023c:
            f95 r6 = defpackage.f95.b
        L_0x023e:
            lkc r2 = r32.u()
            r2.c()
        L_0x0245:
            ru.ok.android.externcalls.sdk.connection.MediaConnectionManager r2 = r7.getMediaConnectionManager()
            os1 r3 = r32.s()
            r2.addListener(r3)
            ru.ok.android.externcalls.sdk.record.RecordManager r2 = r7.getRecordManager()
            je7 r3 = r0.p
            java.lang.Object r4 = r3.getValue()
            lvc r4 = (defpackage.lvc) r4
            r2.addRecordListener(r4)
            java.lang.Object r2 = r3.getValue()
            lvc r2 = (defpackage.lvc) r2
            vvc r2 = (defpackage.vvc) r2
            r2.getClass()
            java.lang.String r3 = "ScreenRecordControllerTag"
            java.lang.String r4 = "prepare recoding state"
            defpackage.hm9.h0(r3, r4, new java.lang.Object[0])
            r2.onRecordStarted()
            je7 r3 = r2.Y
            java.lang.Object r3 = r3.getValue()
            tm3 r3 = (defpackage.tm3) r3
            mn5 r3 = r3.a()
            ovc r4 = new ovc
            r5 = 1
            r4.<init>(r3, r5)
            ovc r3 = new ovc
            r5 = 0
            r3.<init>(r4, r5)
            int r4 = defpackage.ft4.o
            r4 = 300(0x12c, float:4.2E-43)
            kt4 r5 = defpackage.kt4.MILLISECONDS
            long r4 = defpackage.z7.R(r4, r5)
            ai0 r7 = new ai0
            r9 = 24
            r7.<init>(r9)
            zn5 r3 = defpackage.nu0.e(r3, r4, r7)
            svc r4 = new svc
            r5 = 0
            r7 = 2
            r4.<init>(r7, r5)
            t03 r3 = defpackage.od2.D(r3, r4)
            ap8 r4 = new ap8
            r7 = 8
            r4.<init>(r3, r2, r7)
            tvc r3 = new tvc
            r3.<init>(r2, r5)
            zn5 r5 = new zn5
            r7 = 5
            r5.<init>(r4, r3, r7)
            je7 r3 = r2.c
            java.lang.Object r3 = r3.getValue()
            jr1 r3 = (defpackage.jr1) r3
            vxd r3 = defpackage.od2.L(r5, r3)
            r2.x0 = r3
        L_0x02cc:
            q0e r2 = r0.H
            java.lang.Object r3 = r2.getValue()
            r4 = r3
            d04 r4 = (defpackage.d04) r4
            d04 r17 = r32.j()
            java.lang.String r21 = r1.getConversationId()
            java.lang.String r22 = r1.getJoinLink()
            boolean r4 = r14 instanceof defpackage.zm1
            r5 = 1
            r4 = r4 ^ r5
            if (r4 != 0) goto L_0x02ea
            r23 = r5
            goto L_0x02f4
        L_0x02ea:
            ru.ok.android.externcalls.sdk.participant.collection.ParticipantCollection r7 = r1.getParticipants()
            boolean r7 = r0.x(r7)
            r23 = r7
        L_0x02f4:
            boolean r7 = r14 instanceof defpackage.ym1
            if (r7 == 0) goto L_0x02fc
            r7 = r14
            ym1 r7 = (defpackage.ym1) r7
            goto L_0x02fd
        L_0x02fc:
            r7 = 0
        L_0x02fd:
            if (r7 == 0) goto L_0x0311
            java.lang.String r9 = r1.getJoinLink()
            if (r9 != 0) goto L_0x0307
            java.lang.String r9 = r7.d
        L_0x0307:
            ym1 r10 = new ym1
            boolean r7 = r7.e
            r10.<init>(r9, r7)
            r18 = r10
            goto L_0x0313
        L_0x0311:
            r18 = r14
        L_0x0313:
            r25 = 0
            r26 = 0
            r19 = 0
            r24 = 0
            r28 = 482(0x1e2, float:6.75E-43)
            r27 = r6
            d04 r7 = defpackage.d04.a(r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28)
            boolean r2 = r2.c(r3, r7)
            if (r2 == 0) goto L_0x02cc
            je7 r2 = r0.i
            java.lang.Object r2 = r2.getValue()
            yl4 r2 = (defpackage.yl4) r2
            vxd r3 = r2.d
            r7 = 0
            if (r3 == 0) goto L_0x0339
            r3.cancel((java.util.concurrent.CancellationException) r7)
        L_0x0339:
            r2.d = r7
            xl4 r3 = new xl4
            r3.<init>(r2, r7)
            jr1 r5 = r2.a
            r9 = 3
            vxd r3 = defpackage.j47.T(r5, r7, r7, r3, r9)
            r2.d = r3
            je7 r2 = r0.y
            if (r8 == 0) goto L_0x0353
            boolean r3 = r14.A()
            if (r3 != 0) goto L_0x0355
        L_0x0353:
            if (r4 == 0) goto L_0x037f
        L_0x0355:
            java.lang.Object r3 = r2.getValue()
            eua r3 = (defpackage.eua) r3
            java.lang.String[] r5 = defpackage.eua.l
            boolean r3 = r3.b(r5)
            if (r3 != 0) goto L_0x037f
            bt1 r23 = r32.m()
            java.lang.String r25 = r1.getConversationId()
            r23.getClass()
            r27 = 0
            r31 = 56
            java.lang.String r24 = "REQUEST_PERMISSION_CAM"
            java.lang.String r26 = "OUT_OF_CALL"
            r28 = 0
            r29 = 0
            r30 = r4
            defpackage.bt1.c(r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x037f:
            if (r4 == 0) goto L_0x03ab
            java.lang.Object r2 = r2.getValue()
            eua r2 = (defpackage.eua) r2
            java.lang.String[] r3 = defpackage.eua.h
            boolean r2 = r2.b(r3)
            if (r2 != 0) goto L_0x03ab
            bt1 r23 = r32.m()
            java.lang.String r25 = r1.getConversationId()
            r23.getClass()
            r27 = 0
            r31 = 56
            java.lang.String r24 = "REQUEST_PERMISSION_MIC"
            java.lang.String r26 = "AFTER_INITIATION"
            r28 = 0
            r29 = 0
            r30 = r4
            defpackage.bt1.c(r23, r24, r25, r26, r27, r28, r29, r30, r31)
        L_0x03ab:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wr1.g(z31):void");
    }

    public final void h(z31 z31) {
        q0e q0e;
        Object value;
        Conversation conversation;
        boolean z2;
        d04 d04;
        boolean z3;
        j1e j1e;
        z31 z312 = z31;
        do {
            q0e = this.H;
            value = q0e.getValue();
            d04 d042 = (d04) value;
            conversation = z312.a;
            String conversationId = conversation.getConversationId();
            e95 e95 = e95.b;
            String joinLink = conversation.getJoinLink();
            j1e j1e2 = z312.b;
            boolean z4 = j1e2 instanceof zm1;
            z2 = !z4;
            d04 = r9;
            z3 = z4;
            j1e = j1e2;
            d04 d043 = new d04(z312.b, conversationId, joinLink, z312.d, z2, e95, 306);
        } while (!q0e.c(value, d04));
        n().a.getAndSet(conversation);
        s().d(this.J);
        s().d((era) this.m.getValue());
        os1 s2 = s();
        je7 je7 = this.C;
        s2.d((ez0) je7.getValue());
        this.D = j47.T(this.a, (lx3) null, (vx3) null, new qr1(this, (Continuation) null), 3);
        if (!z312.d && !z2) {
            lkc u2 = u();
            u2.getClass();
            u2.c = kkc.BEEP;
            xh1 a2 = u2.a();
            a2.a(a2.b.c, true);
        }
        if (j1e instanceof xm1) {
            b31 l2 = l();
            long j2 = ((xm1) j1e).d;
            l31 l31 = (l31) l2;
            l31.n.o1(l31, l31.p[1], l31.b(((jz2) l31.a()).n(j2), j2));
        } else if (z3) {
            l31 l312 = (l31) l();
            j47.T(l312.a, ((w9a) ((kke) l312.f.getValue())).a(), (vx3) null, new k31(((zm1) j1e).d, l312, (Continuation) null), 2);
        } else if (j1e instanceof ym1) {
            ym1 ym1 = (ym1) j1e;
            l31 l313 = (l31) l();
            l313.o = Long.valueOf(((k4a) ((pk) l313.c.getValue())).A(c37.D(ym1.d), ym1.e));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        cra cra = (cra) t();
        Conversation a3 = ((fw3) cra.o.getValue()).a();
        ParticipantStatesManager participantStatesManager = a3 != null ? a3.getParticipantStatesManager() : null;
        if (participantStatesManager != null) {
            participantStatesManager.addHandListener((ParticipantStatesManager.Listener) cra.Z.getValue());
        }
        wqa wqa = new wqa(cra, (Continuation) null);
        jr1 jr1 = cra.a;
        j47.T(jr1, (lx3) null, (vx3) null, wqa, 3);
        cra.u0 = od2.L(new zn5(((xuc) cra.Y.getValue()).b, new xqa(cra, (Continuation) null), 5), jr1);
        m58 m58 = new m58(new m58(((tm3) cra.X.getValue()).a(), 19), 18);
        int i2 = ft4.o;
        kt4 kt4 = kt4.MILLISECONDS;
        cra.v0 = od2.L(new zn5(new uqa(nu0.e(m58, z7.R(HttpStatus.SC_MULTIPLE_CHOICES, kt4), new ai0(20)), cra, 0), new yqa(cra, (Continuation) null), 5), jr1);
        yz0 yz0 = (yz0) ((ez0) je7.getValue());
        yz0.y0 = od2.L(new zn5(new ac(nu0.e(new qw(new qw(((tm3) yz0.o.getValue()).a(), 8), 7), z7.R(HttpStatus.SC_MULTIPLE_CHOICES, kt4), new ai0(2)), 6, yz0), new sz0(yz0, (Continuation) null), 5), yz0.a);
        AtomicBoolean atomicBoolean = yz0.x0;
        ParticipantStatesManager f2 = yz0.f();
        atomicBoolean.set(f2 != null ? f2.isOwnHandRaised() : false);
        ParticipantStatesManager f3 = yz0.f();
        if (f3 != null) {
            f3.addHandListener((ParticipantStatesManager.Listener) yz0.Y.getValue());
        }
        MediaMuteManager e2 = yz0.e();
        if (e2 != null) {
            e2.addListener((tz0) yz0.A0.getValue());
        }
        ConversationFeatureManager g2 = yz0.g();
        if (g2 != null) {
            g2.addFeatureListener(u61.b, (uz0) yz0.B0.getValue());
        }
        Conversation o2 = o();
        if (o2 != null) {
            ((a11) ((z01) this.h.getValue())).a(o2.isCaller() ? CallsAudioManager.State.DIALING : CallsAudioManager.State.RINGING);
            hm9.m("CallEngineTag", this + " conversation is ready " + o2.getConversationId(), new Object[0]);
        }
    }

    public final void i(yg1 yg1) {
        Object value;
        String str;
        Long valueOf;
        long j2;
        hm9.m("CallEngineTag", this + " doBeforeCreateConversation push=" + yg1, new Object[0]);
        l31 l31 = (l31) l();
        if (yg1 != null) {
            q0e q0e = l31.j;
            do {
                value = q0e.getValue();
                y21 y21 = (y21) value;
                String str2 = yg1.d;
                if (str2 == null) {
                    str2 = "";
                }
                str = str2;
                long j3 = yg1.a;
                valueOf = Long.valueOf(j3);
                if (j3 == 0) {
                    valueOf = null;
                }
                j2 = yg1.b;
            } while (!q0e.c(value, new y21(Long.valueOf(j2), str, yg1.e, Long.valueOf(valueOf != null ? valueOf.longValue() : j2), 96)));
        }
        int i2 = 0;
        l31.m.o1(l31, l31.p[0], j47.T(l31.a, (lx3) null, vx3.b, new io5(new ac(od2.F(new zn5(new qw(new v7c(((cs1) l31.d.getValue()).a), 16), new h31(l31, (Continuation) null), 5), (nx3) l31.l.getValue()), 18, new f31(l31, (Continuation) null, 1)), (Continuation) null), 1));
        Application application = (Application) this.d.getValue();
        ((hl1) this.s.getValue()).getClass();
        Intent intent = new Intent(application, CallServiceImpl.class);
        gl1 gl1 = gl1.a;
        hl1.b(application, intent.putExtra("ACTION", 0));
        a11 a11 = (a11) ((z01) this.h.getValue());
        CallsAudioManager callsAudioManager = (CallsAudioManager) a11.c.updateAndGet(new iz0(2, a11));
        if (callsAudioManager != null) {
            i2 = callsAudioManager.hashCode();
        }
        hm9.m("CallAudioController", "CallAudioController prepared: " + i2, new Object[0]);
    }

    public final d04 j() {
        return (d04) this.H.getValue();
    }

    public final d04 k() {
        return (d04) this.I.getValue();
    }

    public final b31 l() {
        return (b31) this.j.getValue();
    }

    public final bt1 m() {
        return (bt1) this.x.getValue();
    }

    public final fw3 n() {
        return (fw3) this.f.getValue();
    }

    public final Conversation o() {
        return n().a();
    }

    public final boolean p() {
        i95 i95 = k().j;
        return !((i95 instanceof c95) || (i95 instanceof b95) || (i95 instanceof d95));
    }

    public final boolean q() {
        Conversation a2 = n().a();
        boolean z2 = a2 != null && a2.isAnswered();
        Conversation a3 = n().a();
        boolean z3 = a3 != null && a3.isCaller();
        i95 i95 = k().j;
        if ((i95 instanceof c95) || (i95 instanceof b95) || (i95 instanceof d95)) {
            return false;
        }
        return z2 || z3 || k().h;
    }

    public final boolean r() {
        Conversation a2 = n().a();
        boolean z2 = a2 != null && !a2.isAnswered();
        Conversation a3 = n().a();
        boolean z3 = a3 != null && !a3.isCaller();
        i95 i95 = k().j;
        return !(i95 instanceof c95) && !(i95 instanceof b95) && !(i95 instanceof d95) && z2 && z3 && !k().h;
    }

    public final os1 s() {
        return (os1) this.e.getValue();
    }

    public final oqa t() {
        return (oqa) this.k.getValue();
    }

    public final lkc u() {
        return (lkc) this.l.getValue();
    }

    public final void v() {
        w(j().j instanceof h95 ? ji6.o : null);
    }

    public final void w(ji6 ji6) {
        hm9.m("CallEngineTag", "hangup " + ji6, new Object[0]);
        Conversation o2 = o();
        if (o2 != null) {
            if (ji6 == null) {
                ji6 = null;
            }
            o2.hangup(new ii6(ji6));
            z();
        }
    }

    public final boolean x(Collection collection) {
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!tpa.f(((ConversationParticipant) it.next()).getExternalId(), mqa.d(((cra) t()).c().a.getId()))) {
                return true;
            }
        }
        return false;
    }

    public final boolean y() {
        boolean z2 = k().h;
        boolean z3 = ((pqa) ((cra) t()).w0.a.getValue()).h;
        boolean isScreenCaptureEnabled = ((pqa) ((cra) t()).w0.a.getValue()).a.a.isScreenCaptureEnabled();
        if (z2) {
            if (isScreenCaptureEnabled) {
                return false;
            }
        } else if (!z3 || isScreenCaptureEnabled) {
            return false;
        }
        return true;
    }

    public final void z() {
        q0e q0e;
        Object value;
        q0e q0e2;
        Object value2;
        Object value3;
        q0e q0e3;
        Object value4;
        q0e q0e4;
        Object value5;
        d04 d04;
        b95 b95;
        hm9.m("CallEngineTag", "release call data", new Object[0]);
        y21 y21 = (y21) ((l31) l()).k.getValue();
        Application application = (Application) this.d.getValue();
        ((hl1) this.s.getValue()).getClass();
        Intent intent = new Intent(application, CallServiceImpl.class);
        gl1 gl1 = gl1.a;
        intent.putExtra("ACTION", 1);
        hl1.b(application, intent);
        s().c(this.J);
        os1 s2 = s();
        je7 je7 = this.m;
        s2.c((era) je7.getValue());
        os1 s3 = s();
        je7 je72 = this.C;
        s3.c((ez0) je72.getValue());
        vxd vxd = this.D;
        if (vxd != null) {
            vxd.cancel((CancellationException) null);
        }
        this.D = null;
        bc7[] bc7Arr = K;
        bc7 bc7 = bc7Arr[0];
        w4d w4d = this.E;
        x77 x77 = (x77) w4d.T0(this, bc7);
        if (x77 != null) {
            x77.cancel((CancellationException) null);
        }
        w4d.o1(this, bc7Arr[0], (Object) null);
        u().c();
        yl4 yl4 = (yl4) this.i.getValue();
        vxd vxd2 = yl4.d;
        if (vxd2 != null) {
            vxd2.cancel((CancellationException) null);
        }
        yl4.d = null;
        ((fra) ((era) je7.getValue())).clear();
        ((vs1) this.n.getValue()).a();
        a11 a11 = (a11) ((z01) this.h.getValue());
        a11.getClass();
        a11.a(CallsAudioManager.State.IDLE);
        CallsAudioManager callsAudioManager = (CallsAudioManager) a11.c.getAndSet((Object) null);
        Integer valueOf = callsAudioManager != null ? Integer.valueOf(callsAudioManager.hashCode()) : null;
        hm9.m("CallAudioController", "CallAudioController released: " + valueOf, new Object[0]);
        jt4 jt4 = (jt4) this.g.getValue();
        do {
            q0e = jt4.d;
            value = q0e.getValue();
            Long l2 = (Long) value;
        } while (!q0e.c(value, (Object) null));
        vxd vxd3 = jt4.b;
        if (vxd3 != null) {
            vxd3.cancel((CancellationException) null);
        }
        jt4.b = null;
        l31 l31 = (l31) l();
        l31.o = null;
        bc7[] bc7Arr2 = l31.p;
        bc7 bc72 = bc7Arr2[0];
        w4d w4d2 = l31.m;
        x77 x772 = (x77) w4d2.T0(l31, bc72);
        if (x772 != null) {
            x772.cancel((CancellationException) null);
        }
        w4d2.o1(l31, bc7Arr2[0], (Object) null);
        bc7 bc73 = bc7Arr2[1];
        w4d w4d3 = l31.n;
        x77 x773 = (x77) w4d3.T0(l31, bc73);
        if (x773 != null) {
            x773.cancel((CancellationException) null);
        }
        w4d3.o1(l31, bc7Arr2[1], (Object) null);
        do {
            q0e2 = l31.j;
            value2 = q0e2.getValue();
            y21 y212 = (y21) value2;
        } while (!q0e2.c(value2, y21.h));
        q0e q0e5 = ((xuc) this.B.getValue()).b;
        do {
            value3 = q0e5.getValue();
            ((Boolean) value3).getClass();
        } while (!q0e5.c(value3, Boolean.FALSE));
        yz0 yz0 = (yz0) ((ez0) je72.getValue());
        x77 x774 = (x77) yz0.z0.T0(yz0, yz0.G0[0]);
        if (x774 != null) {
            x774.cancel((CancellationException) null);
        }
        vxd vxd4 = yz0.y0;
        if (vxd4 != null) {
            vxd4.cancel((CancellationException) null);
        }
        yz0.y0 = null;
        yz0.x0.set(false);
        ParticipantStatesManager f2 = yz0.f();
        if (f2 != null) {
            f2.removeHandListener((ParticipantStatesManager.Listener) yz0.Y.getValue());
        }
        MediaMuteManager e2 = yz0.e();
        if (e2 != null) {
            e2.removeListener((tz0) yz0.A0.getValue());
        }
        ConversationFeatureManager g2 = yz0.g();
        if (g2 != null) {
            g2.removeFeatureListener(u61.b, (uz0) yz0.B0.getValue());
        }
        yz0.Z.set(new xs(0));
        do {
            q0e3 = yz0.s0;
            value4 = q0e3.getValue();
            oa oaVar = (oa) value4;
        } while (!q0e3.c(value4, oa.d));
        yz0.u0.set(false);
        yz0.v0.set(false);
        yz0.w0.set(false);
        Conversation a2 = n().a();
        je7 je73 = this.p;
        if (a2 != null) {
            a2.getMediaConnectionManager().removeListener(s());
            a2.getRecordManager().removeRecordListener((lvc) je73.getValue());
            try {
                a2.release();
            } catch (Throwable th) {
                Throwable th2 = th;
                hm9.p("CallEngineTag", th2.getMessage(), th2);
            }
        }
        ((vvc) ((lvc) je73.getValue())).c(xvc.o);
        n().a.set((Object) null);
        do {
            q0e4 = this.H;
            value5 = q0e4.getValue();
            d04 = (d04) value5;
            i95 i95 = d04.j;
            b95 = i95 instanceof b95 ? (b95) i95 : null;
        } while (!q0e4.c(value5, d04.a(d04.k, (j1e) null, 0, (String) null, (String) null, false, false, false, new u8b(d04.c, (d04.h || ((b95 != null ? b95.b : 0) == 3)) ? null : d04.a, d04.j, y21), (i95) null, 767)));
    }
}
