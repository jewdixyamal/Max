package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;

/* renamed from: yz0  reason: default package */
public final class yz0 implements ez0 {
    public static final /* synthetic */ bc7[] G0;
    public final khe A0;
    public final khe B0;
    public final kld C0;
    public final kld D0;
    public final q0e E0;
    public final q0e F0;
    public final je7 X;
    public final khe Y = new khe(new kz0(this, 2));
    public final AtomicReference Z = new AtomicReference(new xs(0));
    public final jr1 a;
    public final so1 b;
    public final je7 c;
    public final je7 o;
    public final q0e s0;
    public final q0e t0;
    public final AtomicBoolean u0;
    public final AtomicBoolean v0;
    public final AtomicBoolean w0;
    public final AtomicBoolean x0;
    public vxd y0;
    public final w4d z0;

    static {
        oi9 oi9 = new oi9(yz0.class, "usersUpdateJob", "getUsersUpdateJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        G0 = new bc7[]{oi9};
    }

    public yz0(je7 je7, je7 je72, je7 je73, je7 je74, jr1 jr1, je7 je75, so1 so1, je7 je76) {
        this.a = jr1;
        this.b = so1;
        this.c = je7;
        this.o = je75;
        this.X = je76;
        q0e a2 = r0e.a(oa.d);
        this.s0 = a2;
        this.t0 = a2;
        this.u0 = new AtomicBoolean(false);
        this.v0 = new AtomicBoolean(false);
        this.w0 = new AtomicBoolean(false);
        this.x0 = new AtomicBoolean(false);
        this.z0 = mqd.D();
        this.A0 = new khe(new bp(this, je72, je73, je74));
        this.B0 = new khe(new kz0(this, 3));
        kld a3 = lld.a(1, 1, 2);
        this.C0 = a3;
        this.D0 = a3;
        q0e a4 = r0e.a(aa.h);
        this.E0 = a4;
        this.F0 = a4;
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [qpd, java.lang.Object, us] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01b8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object b(defpackage.yz0 r26, defpackage.xs r27, kotlin.coroutines.Continuation r28) {
        /*
            r0 = r26
            r1 = r28
            r26.getClass()
            boolean r2 = r1 instanceof defpackage.wz0
            if (r2 == 0) goto L_0x001a
            r2 = r1
            wz0 r2 = (defpackage.wz0) r2
            int r3 = r2.A0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L_0x001a
            int r3 = r3 - r4
            r2.A0 = r3
            goto L_0x001f
        L_0x001a:
            wz0 r2 = new wz0
            r2.<init>(r0, r1)
        L_0x001f:
            java.lang.Object r1 = r2.y0
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.A0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L_0x0070
            if (r4 == r7) goto L_0x0059
            if (r4 != r6) goto L_0x0051
            long r8 = r2.x0
            us r0 = r2.w0
            java.util.Iterator r4 = r2.v0
            java.lang.Object r10 = r2.u0
            xs r10 = (defpackage.xs) r10
            java.lang.Object r11 = r2.t0
            java.util.Map r11 = (java.util.Map) r11
            oa r12 = r2.s0
            java.lang.Object r13 = r2.Z
            ti9 r14 = r2.Y
            xs r15 = r2.X
            yz0 r6 = r2.o
            defpackage.od2.a0(r1)
            r5 = r4
            r7 = r14
            r14 = 2
            r4 = r2
            r2 = r0
            r0 = r6
            r6 = r12
            goto L_0x01b0
        L_0x0051:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0059:
            java.lang.Object r0 = r2.u0
            us r0 = (defpackage.us) r0
            java.lang.Object r4 = r2.t0
            xs r4 = (defpackage.xs) r4
            oa r6 = r2.s0
            java.lang.Object r8 = r2.Z
            ti9 r9 = r2.Y
            xs r10 = r2.X
            yz0 r11 = r2.o
            defpackage.od2.a0(r1)
            goto L_0x015e
        L_0x0070:
            defpackage.od2.a0(r1)
            q0e r1 = r0.s0
            r9 = r1
            r1 = r27
        L_0x0078:
            java.lang.Object r8 = r9.getValue()
            r6 = r8
            oa r6 = (defpackage.oa) r6
            java.util.Map r4 = r6.a
            us r10 = new us
            r11 = 0
            r10.<init>(r11)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x008f:
            boolean r12 = r4.hasNext()
            if (r12 == 0) goto L_0x00c6
            java.lang.Object r12 = r4.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getValue()
            bo1 r13 = (defpackage.bo1) r13
            boolean r13 = r13.c()
            if (r13 != 0) goto L_0x008f
            java.lang.Object r13 = r12.getKey()
            gg1 r13 = (defpackage.gg1) r13
            long r13 = r13.a
            java.lang.Long r15 = new java.lang.Long
            r15.<init>(r13)
            boolean r13 = r1.contains(r15)
            if (r13 == 0) goto L_0x008f
            java.lang.Object r13 = r12.getKey()
            java.lang.Object r12 = r12.getValue()
            r10.put(r13, r12)
            goto L_0x008f
        L_0x00c6:
            xs r4 = new xs
            r4.<init>((int) r11)
            r1.getClass()
            qs r11 = new qs
            r11.<init>((defpackage.xs) r1)
        L_0x00d3:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0138
            java.lang.Object r12 = r11.next()
            java.lang.Number r12 = (java.lang.Number) r12
            long r12 = r12.longValue()
            java.util.ArrayList r14 = new java.util.ArrayList
            int r15 = r10.c
            r14.<init>(r15)
            java.util.Set r15 = r10.entrySet()
            ps r15 = (defpackage.ps) r15
            java.util.Iterator r15 = r15.iterator()
        L_0x00f4:
            r16 = r15
            ss r16 = (defpackage.ss) r16
            boolean r17 = r16.hasNext()
            if (r17 == 0) goto L_0x011b
            r16.next()
            java.util.Map$Entry r16 = (java.util.Map.Entry) r16
            java.lang.Object r16 = r16.getKey()
            r7 = r16
            gg1 r7 = (defpackage.gg1) r7
            r26 = r6
            long r5 = r7.a
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r5)
            r14.add(r7)
            r6 = r26
            r7 = 1
            goto L_0x00f4
        L_0x011b:
            r26 = r6
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r12)
            boolean r5 = r14.contains(r5)
            if (r5 != 0) goto L_0x012e
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r12)
            goto L_0x012f
        L_0x012e:
            r5 = 0
        L_0x012f:
            if (r5 == 0) goto L_0x0134
            r4.add(r5)
        L_0x0134:
            r6 = r26
            r7 = 1
            goto L_0x00d3
        L_0x0138:
            r26 = r6
            so1 r5 = r0.b
            r2.o = r0
            r2.X = r1
            r2.Y = r9
            r2.Z = r8
            r2.s0 = r6
            r2.t0 = r4
            r2.u0 = r10
            r7 = 0
            r2.v0 = r7
            r2.w0 = r7
            r7 = 1
            r2.A0 = r7
            java.lang.Object r5 = r5.b(r4, r2)
            if (r5 != r3) goto L_0x015a
            goto L_0x0237
        L_0x015a:
            r11 = r0
            r0 = r10
            r10 = r1
            r1 = r5
        L_0x015e:
            java.util.Map r1 = (java.util.Map) r1
            xs r5 = new xs
            r5.<init>((defpackage.xs) r4)
            java.util.Set r4 = r1.keySet()
            java.util.Iterator r4 = r4.iterator()
            r13 = r8
            r24 = r1
            r1 = r0
            r0 = r11
            r11 = r24
        L_0x0174:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x01c7
            java.lang.Object r7 = r4.next()
            java.lang.Number r7 = (java.lang.Number) r7
            long r7 = r7.longValue()
            so1 r12 = r0.b
            r2.o = r0
            r2.X = r10
            r2.Y = r9
            r2.Z = r13
            r2.s0 = r6
            r2.t0 = r11
            r2.u0 = r5
            r2.v0 = r4
            r2.w0 = r1
            r2.x0 = r7
            r14 = 2
            r2.A0 = r14
            java.lang.Object r12 = r12.c(r7, r2)
            if (r12 != r3) goto L_0x01a5
            goto L_0x0237
        L_0x01a5:
            r15 = r10
            r10 = r5
            r5 = r4
            r4 = r2
            r2 = r1
            r1 = r12
            r24 = r7
            r7 = r9
            r8 = r24
        L_0x01b0:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x01c0
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r8)
            r10.remove(r1)
        L_0x01c0:
            r1 = r2
            r2 = r4
            r4 = r5
            r9 = r7
            r5 = r10
            r10 = r15
            goto L_0x0174
        L_0x01c7:
            r14 = 2
            boolean r4 = r5.isEmpty()
            r7 = 1
            r4 = r4 ^ r7
            if (r4 == 0) goto L_0x01dd
            jr1 r4 = r0.a
            xz0 r8 = new xz0
            r12 = 0
            r8.<init>(r0, r5, r12)
            r5 = 3
            defpackage.j47.T(r4, r12, r12, r8, r5)
            goto L_0x01de
        L_0x01dd:
            r12 = 0
        L_0x01de:
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = defpackage.mz7.Z(r5)
            r4.<init>(r5)
            java.util.Set r5 = r11.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x01f3:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L_0x0219
            java.lang.Object r8 = r5.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r11 = r8.getKey()
            java.lang.Number r11 = (java.lang.Number) r11
            long r15 = r11.longValue()
            ru.ok.android.externcalls.sdk.id.ParticipantId r11 = defpackage.mqa.c(r15)
            gg1 r11 = defpackage.mqa.b(r11)
            java.lang.Object r8 = r8.getValue()
            r4.put(r11, r8)
            goto L_0x01f3
        L_0x0219:
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r1)
            r5.putAll(r4)
            r21 = 0
            r23 = 6
            r20 = 0
            r18 = r6
            r19 = r5
            oa r1 = defpackage.oa.a(r18, r19, r20, r21, r23)
            boolean r1 = r9.c(r13, r1)
            if (r1 == 0) goto L_0x0238
            e5f r3 = defpackage.e5f.a
        L_0x0237:
            return r3
        L_0x0238:
            r1 = r10
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz0.b(yz0, xs, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static boolean h(rd8 rd8) {
        return rd8 != rd8.c;
    }

    public final void c(gg1 gg1, boolean z) {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            us7 us7 = us7.X;
            ir6.d(us7, "CallAdminSettingsController", "Update user from waiting room " + gg1 + " with apply state=" + z, (Throwable) null);
        }
        if (z) {
            bt1 bt1 = (bt1) this.X.getValue();
            Long valueOf = Long.valueOf(gg1.a);
            bt1.getClass();
            bt1.c(bt1, "PROMOTE_JOIN_WAITING_ROOM", (String) null, (String) null, valueOf, (String) null, (String) null, true, 54);
        } else {
            bt1 bt12 = (bt1) this.X.getValue();
            Long valueOf2 = Long.valueOf(gg1.a);
            bt12.getClass();
            bt1.c(bt12, "REJECT_JOIN_WAITING_ROOM", (String) null, (String) null, valueOf2, (String) null, (String) null, true, 54);
        }
        ParticipantId d = mqa.d(gg1);
        if (z) {
            Conversation a2 = d().a();
            if (a2 != null) {
                a2.promoteParticipant(d, true);
            }
        } else {
            Conversation a3 = d().a();
            if (a3 != null) {
                a3.removeParticipant(d);
            }
        }
        if (!z) {
            this.Z.getAndUpdate(new iz0(1, gg1));
            l();
        }
    }

    public final fw3 d() {
        return (fw3) this.c.getValue();
    }

    public final MediaMuteManager e() {
        Conversation a2 = d().a();
        if (a2 != null) {
            return a2.getMediaMuteManager();
        }
        return null;
    }

    public final ParticipantStatesManager f() {
        Conversation a2 = d().a();
        if (a2 != null) {
            return a2.getParticipantStatesManager();
        }
        return null;
    }

    public final ConversationFeatureManager g() {
        Conversation a2 = d().a();
        if (a2 != null) {
            return a2.getFeatureManager();
        }
        return null;
    }

    public final void i(boolean z) {
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, "CallAdminSettingsController", ey8.j("Screen record change state to ", z), (Throwable) null);
        }
        u61 u61 = u61.b;
        if (z) {
            ConversationFeatureManager g = g();
            if (g != null) {
                ConversationFeatureManager.enableFeatureForAll$default(g, u61, (k56) null, (m56) null, 6, (Object) null);
                return;
            }
            return;
        }
        ConversationFeatureManager g2 = g();
        if (g2 != null) {
            ConversationFeatureManager.enableFeatureForRoles$default(g2, u61, bcd.a0(eg1.b, eg1.a), (k56) null, (m56) null, 12, (Object) null);
        }
    }

    public final void j() {
        AtomicBoolean atomicBoolean = this.w0;
        if (!atomicBoolean.get() && this.v0.get() && this.u0.get()) {
            q0e q0e = this.E0;
            if (!((aa) q0e.getValue()).a) {
                boolean z = ((aa) q0e.getValue()).b;
                boolean z2 = ((aa) q0e.getValue()).c;
                kld kld = this.C0;
                if (!z && !z2) {
                    kld.g(new Object());
                } else if (!z && z2) {
                    kld.g(new xa(true, false));
                } else if (z && !z2) {
                    kld.g(new za(true, false));
                }
            }
            atomicBoolean.set(true);
        }
    }

    public final void k(boolean z, boolean z2, boolean z3) {
        q0e q0e;
        Object value;
        boolean z4;
        boolean isMeCreatorOrAdmin;
        boolean isWaitingRoomEnabled;
        do {
            q0e = this.E0;
            value = q0e.getValue();
            aa aaVar = (aa) value;
            ConversationFeatureManager g = g();
            z4 = (g != null ? g.getFeatureRoles(u61.b) : null) instanceof FeatureRoles.EnabledForAll;
            Conversation a2 = d().a();
            isMeCreatorOrAdmin = a2 != null ? a2.isMeCreatorOrAdmin() : false;
            Conversation a3 = d().a();
            isWaitingRoomEnabled = a3 != null ? a3.isWaitingRoomEnabled() : false;
            aaVar.getClass();
        } while (!q0e.c(value, new aa(isMeCreatorOrAdmin, z, z2, z3, z4, false, isWaitingRoomEnabled)));
    }

    public final void l() {
        vxd T = j47.T(this.a, (lx3) null, (vx3) null, new vz0(this, (Continuation) null), 3);
        this.z0.o1(this, G0[0], T);
    }

    public final void onParticipantsAdded(List list) {
        this.Z.getAndUpdate(new iz0(0, list));
        l();
    }

    public final void onRolesChanged(ConversationParticipant conversationParticipant) {
        q0e q0e;
        Object value;
        boolean z;
        sd8 mediaOptionsForCall$default;
        rd8 rd8;
        sd8 mediaOptionsForCall$default2;
        rd8 rd82;
        sd8 mediaOptionsForCall$default3;
        rd8 rd83;
        ConversationParticipant me2;
        super.onRolesChanged(conversationParticipant);
        ParticipantId externalId = conversationParticipant != null ? conversationParticipant.getExternalId() : null;
        Conversation a2 = d().a();
        if (tpa.f(externalId, (a2 == null || (me2 = a2.getMe()) == null) ? null : me2.getExternalId())) {
            do {
                q0e = this.E0;
                value = q0e.getValue();
                z = false;
            } while (!q0e.c(value, aa.a((aa) value, (conversationParticipant != null ? conversationParticipant.isAdmin() : false) || (conversationParticipant != null ? conversationParticipant.isCreator() : false), false, false, false, false, false, 126)));
            MediaMuteManager e = e();
            boolean h = (e == null || (mediaOptionsForCall$default3 = MediaMuteManager.getMediaOptionsForCall$default(e, (zad) null, 1, (Object) null)) == null || (rd83 = mediaOptionsForCall$default3.b) == null) ? false : h(rd83);
            MediaMuteManager e2 = e();
            boolean h2 = (e2 == null || (mediaOptionsForCall$default2 = MediaMuteManager.getMediaOptionsForCall$default(e2, (zad) null, 1, (Object) null)) == null || (rd82 = mediaOptionsForCall$default2.a) == null) ? false : h(rd82);
            MediaMuteManager e3 = e();
            if (!(e3 == null || (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(e3, (zad) null, 1, (Object) null)) == null || (rd8 = mediaOptionsForCall$default.c) == null)) {
                z = h(rd8);
            }
            k(h, h2, z);
            this.v0.set(true);
            j();
        }
    }

    public final void onWaitingRoomEnabledChanged(boolean z) {
        Object value;
        super.onWaitingRoomEnabledChanged(z);
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, "CallAdminSettingsController", ey8.j("Waiting room change state updating ", z), (Throwable) null);
        }
        q0e q0e = this.E0;
        do {
            value = q0e.getValue();
        } while (!q0e.c(value, aa.a((aa) value, false, false, false, false, false, z, 63)));
    }

    public final void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        super.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
        this.Z.getAndUpdate(new oz0(waitingRoomParticipantsUpdate, 0, this));
        l();
    }
}
