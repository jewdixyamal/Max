package defpackage;

import one.me.sdk.tasks.chat.InvalidChatMarkException;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: pd2  reason: default package */
public final class pd2 extends ol implements lme, hua {
    public final long X;
    public final long Y;
    public final boolean Z;
    public final long o;
    public final boolean s0;
    public final boolean t0;
    public final String u0 = pd2.class.getName();

    public pd2(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = z;
        this.s0 = z2;
        this.t0 = z3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00aa, code lost:
        if ((java.lang.System.currentTimeMillis() - r8) < (r0.q(ru.ok.tamtam.android.prefs.PmsKey.f114setunreadtimeout, 31536000) * 1000)) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int c() {
        /*
            r15 = this;
            p82 r0 = r15.m()
            long r1 = r15.o
            e52 r0 = r0.z(r1)
            java.lang.String r3 = r15.u0
            r4 = 3
            if (r0 != 0) goto L_0x0030
            boolean r15 = r15.s0
            if (r15 == 0) goto L_0x0022
            java.lang.Long r15 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            java.lang.String r0 = "onPreExecute: awaiting chatServerId=%d in cache"
            defpackage.hm9.m(r3, r0, r15)
            r15 = 2
            return r15
        L_0x0022:
            java.lang.Long r15 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            java.lang.String r0 = "onPreExecute: no chat by chatServerId=%d in cache"
            defpackage.hm9.q(r3, r0, r15)
            return r4
        L_0x0030:
            boolean r5 = r0.e0()
            if (r5 != 0) goto L_0x0044
            java.lang.Long r15 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r15 = new java.lang.Object[]{r15}
            java.lang.String r0 = "onPreExecute: not participant of chat chatServerId=%d"
            defpackage.hm9.q(r3, r0, r15)
            return r4
        L_0x0044:
            long r5 = r15.X
            boolean r7 = r15.Z
            if (r7 == 0) goto L_0x00b3
            long r8 = r15.Y
            r10 = 0
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 <= 0) goto L_0x006d
            au8 r12 = r15.p()
            long r13 = r0.a
            cu8 r0 = r12.j(r13, r8)
            if (r0 == 0) goto L_0x006d
            vx8 r8 = defpackage.vx8.DELETED
            vx8 r9 = r0.v0
            if (r9 != r8) goto L_0x006a
            java.lang.String r15 = "onPreExecute: message deleted, remove task"
            defpackage.hm9.m(r3, r15, new java.lang.Object[0])
            return r4
        L_0x006a:
            long r8 = r0.o
            goto L_0x006e
        L_0x006d:
            r8 = r10
        L_0x006e:
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0073
            r8 = r5
        L_0x0073:
            pl r0 = r15.c
            if (r0 == 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r0 = 0
        L_0x0079:
            je7 r0 = r0.J
            java.lang.Object r0 = r0.getValue()
            p7c r0 = (defpackage.p7c) r0
            r0.getClass()
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ad
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r8
            je7 r0 = r0.d
            java.lang.Object r0 = r0.getValue()
            m7b r0 = (defpackage.m7b) r0
            p7b r0 = (defpackage.p7b) r0
            z7d r0 = r0.b
            r0.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r8 = ru.ok.tamtam.android.prefs.PmsKey.f114setunreadtimeout
            r12 = 31536000(0x1e13380, double:1.5580854E-316)
            long r8 = r0.q(r8, r12)
            r12 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r12
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ad
            goto L_0x00b3
        L_0x00ad:
            java.lang.String r15 = "onPreExecute: timeout expired, remove task"
            defpackage.hm9.m(r3, r15, new java.lang.Object[0])
            return r4
        L_0x00b3:
            eoe r0 = r15.t()
            iua r3 = defpackage.iua.TYPE_CHAT_MARK
            long r8 = r15.a
            java.util.List r15 = r0.h(r8, r3)
            if (r7 == 0) goto L_0x00e0
            java.util.Iterator r15 = r15.iterator()
        L_0x00c5:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r15.next()
            une r0 = (defpackage.une) r0
            hua r0 = r0.f
            pd2 r0 = (defpackage.pd2) r0
            long r5 = r0.o
            int r3 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x00c5
            boolean r0 = r0.Z
            if (r0 == 0) goto L_0x00c5
            return r4
        L_0x00e0:
            java.util.Iterator r15 = r15.iterator()
        L_0x00e4:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0105
            java.lang.Object r0 = r15.next()
            une r0 = (defpackage.une) r0
            hua r0 = r0.f
            pd2 r0 = (defpackage.pd2) r0
            long r7 = r0.o
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x00e4
            boolean r3 = r0.Z
            if (r3 != 0) goto L_0x00e4
            long r7 = r0.X
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00e4
            return r4
        L_0x0105:
            r15 = 1
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pd2.c():int");
    }

    public final void d() {
        t().d(this.a);
    }

    public final void e(gle gle) {
        es8 es8;
        qd2 qd2 = (qd2) gle;
        e52 z = m().z(this.o);
        pl plVar = null;
        if (qd2.X != null) {
            String str = this.u0;
            ir6 ir6 = hm9.m;
            if (ir6 != null && ir6.c()) {
                ir6.d(us7.Y, str, "reaction read result " + qd2.X + "!", (Throwable) null);
            }
        }
        if (this.t0 && qd2.X == null) {
            hm9.m0(this.u0, "invalid response for isReadReaction=true: " + qd2, new Object[0]);
            pl plVar2 = this.c;
            if (plVar2 == null) {
                plVar2 = null;
            }
            ((cba) ((o45) plVar2.u.getValue())).c(new InvalidChatMarkException("READ_REACTION but success is missed"), true);
        }
        long j = qd2.c;
        if (j < 0) {
            hm9.m0(this.u0, "response.mark is negative " + qd2, new Object[0]);
            pl plVar3 = this.c;
            if (plVar3 == null) {
                plVar3 = null;
            }
            long j2 = this.o;
            long j3 = this.X;
            StringBuilder k = au1.k(j2, "mark is negative chat_id=", ",orig=");
            k.append(j3);
            k.append(",mark=");
            k.append(j);
            ((cba) ((o45) plVar3.u.getValue())).c(new InvalidChatMarkException(k.toString()), true);
            j = this.X;
        }
        if (j < this.X && !this.Z) {
            hm9.m(this.u0, "onSuccess, received read mark less than our read mark", new Object[0]);
        } else if (z != null) {
            m().p0(z.a, ((p7b) r()).a.t(), j, qd2.o, true);
        }
        if (z != null && qd2.o > 0 && (es8 = z.c) != null && es8.a.o == j) {
            pl plVar4 = this.c;
            if (plVar4 != null) {
                plVar = plVar4;
            }
            hc2.a((hc2) plVar.K.getValue(), z.a, z.b.a, z.c.a.o, 0, mg4.REGULAR);
            ((k4a) j()).j(z.b.a);
        }
    }

    public final byte[] f() {
        Tasks.ChatMark chatMark = new Tasks.ChatMark();
        chatMark.requestId = this.a;
        chatMark.chatId = 0;
        chatMark.chatServerId = this.o;
        chatMark.mark = this.X;
        chatMark.messageId = this.Y;
        chatMark.setAsUnread = this.Z;
        chatMark.awaitChatInCache = this.s0;
        chatMark.isReadReaction = this.t0;
        return qw8.toByteArray(chatMark);
    }

    public final void g(pke pke) {
        l().c(new oi0(this.a, pke));
        if (!f46.U(pke.b)) {
            d();
        }
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_CHAT_MARK;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        au auVar = new au(sla.CHAT_MARK, 24);
        auVar.i(this.o, ApiProtocol.PARAM_CHAT_ID);
        auVar.i(this.X, "mark");
        long j = this.Y;
        if (j != -1) {
            auVar.i(j, "messageId");
        }
        auVar.p("type", this.Z ? "SET_AS_UNREAD" : this.t0 ? "READ_REACTION" : "READ_MESSAGE");
        return auVar;
    }
}
