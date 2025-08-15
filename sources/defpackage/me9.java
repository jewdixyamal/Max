package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: me9  reason: default package */
public final class me9 extends ol implements lme, hua, u5c {
    public static final /* synthetic */ int s0 = 0;
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;

    public me9(long j, long j2, long j3, long j4, long j5) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
    }

    public final int c() {
        au8 p = p();
        long j = this.X;
        cu8 q = p.q(j);
        p82 m = m();
        long j2 = this.o;
        e52 C = m.C(j2);
        for (une une : t().h(this.a, iua.TYPE_MSG_CANCEL_REACTION)) {
            me9 me9 = (me9) une.f;
            if (me9.o == j2 && me9.X == j) {
                hm9.m("me9", "onPreExecute: later cancel_reaction task found, REMOVE", new Object[0]);
                return 3;
            }
        }
        if (q == null || q.v0 == vx8.DELETED || C == null || (!C.C() && !C.R())) {
            hm9.m("me9", "onPreExecute: message or chat not found, REMOVE", new Object[0]);
            return 3;
        } else if (this.Z == 0) {
            hm9.m("me9", "onPreExecute: message serverId == 0, REMOVE", new Object[0]);
            return 3;
        } else if (C.b.a != 0 || m().P(C)) {
            return 1;
        } else {
            hm9.m("me9", "onPreExecute: chat serverId == 0, SKIP", new Object[0]);
            return 2;
        }
    }

    public final void d() {
        t().d(this.a);
    }

    public final void e(gle gle) {
        fx8 fx8 = ((ne9) gle).c;
        pl plVar = null;
        Integer valueOf = fx8 != null ? Integer.valueOf(fx8.b) : null;
        hm9.m("me9", "reactions, cancelTask onSuccess, reactionInfoTotalCount = " + valueOf + "}", new Object[0]);
        pl plVar2 = this.c;
        if (plVar2 != null) {
            plVar = plVar2;
        }
        ((lx8) plVar.I.getValue()).f(this.o, Collections.singletonMap(Long.valueOf(this.Z), fx8));
    }

    public final byte[] f() {
        Tasks.MsgCancelReaction msgCancelReaction = new Tasks.MsgCancelReaction();
        msgCancelReaction.requestId = this.a;
        msgCancelReaction.chatId = this.o;
        msgCancelReaction.chatServerId = this.Y;
        msgCancelReaction.messageId = this.X;
        msgCancelReaction.messageServerId = this.Z;
        return qw8.toByteArray(msgCancelReaction);
    }

    public final void g(pke pke) {
        hm9.r("me9", pke.X, "reactions, cancelTask onFail %s", pke);
        l().c(new oi0(this.a, pke));
        u5c.a(this, pke);
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_MSG_CANCEL_REACTION;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        tq2 tq2 = new tq2((sla) null, 17);
        long j = this.Z;
        if (j != 0) {
            tq2.i(this.Y, ApiProtocol.PARAM_CHAT_ID);
            tq2.i(j, "messageId");
            return tq2;
        }
        throw new IllegalArgumentException("param messageId can't be 0".toString());
    }
}
