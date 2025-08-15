package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: ff9  reason: default package */
public final class ff9 extends ol implements lme, hua, u5c {
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final bx8 s0;
    public final String t0 = ff9.class.getName();

    public ff9(long j, long j2, long j3, long j4, long j5, bx8 bx8) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
        this.s0 = bx8;
    }

    public final int c() {
        au8 p = p();
        long j = this.X;
        cu8 q = p.q(j);
        p82 m = m();
        long j2 = this.o;
        e52 C = m.C(j2);
        Iterator it = t().h(this.a, iua.TYPE_MSG_REACT).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String str = this.t0;
            if (hasNext) {
                ff9 ff9 = (ff9) ((une) it.next()).f;
                if (ff9.o == j2 && ff9.X == j) {
                    hm9.m(str, "onPreExecute: later react task found, REMOVE", new Object[0]);
                    return 3;
                }
            } else if (q == null || q.v0 == vx8.DELETED || C == null || (!C.C() && !C.R())) {
                hm9.m(str, "onPreExecute: message or chat not found, REMOVE", new Object[0]);
                return 3;
            } else if (this.Z == 0) {
                hm9.m(str, "onPreExecute: message serverId == 0, REMOVE", new Object[0]);
                return 3;
            } else if (C.b.a != 0 || m().P(C)) {
                hm9.m(str, "onPreExecute, READY", new Object[0]);
                return 1;
            } else {
                hm9.m(str, "onPreExecute: chat serverId == 0, SKIP", new Object[0]);
                return 2;
            }
        }
    }

    public final void d() {
        ix8 ix8;
        t().d(this.a);
        cu8 q = p().q(this.X);
        if (q != null && (ix8 = q.S0) != null) {
            pl plVar = this.c;
            if (plVar == null) {
                plVar = null;
            }
            v5c b = ((jx8) plVar.U.getValue()).b(this.s0.b);
            List<hx8> list = ix8.a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (hx8 hx8 : list) {
                    if (tpa.f(hx8.a.b, b)) {
                        hm9.m(this.t0, "reactions, onMaxFailCount, remove reaction from message", new Object[0]);
                        return;
                    }
                }
            }
        }
    }

    public final void e(gle gle) {
        gf9 gf9 = (gf9) gle;
        fx8 fx8 = gf9.c;
        pl plVar = null;
        String str = this.t0;
        if (fx8 == null) {
            av0 l = l();
            String str2 = gf9.o;
            if (str2 == null) {
                str2 = "server bug";
            }
            l.c(new oi0(this.a, new pke(str2, "", (String) null)));
            hm9.m0(str, "onSuccess: its server bug!, skip", new Object[0]);
            return;
        }
        hm9.m(str, "reactions, reactTamTask onSuccess, reactionInfoTotalCount = " + fx8.b + "}", new Object[0]);
        pl plVar2 = this.c;
        if (plVar2 != null) {
            plVar = plVar2;
        }
        ((lx8) plVar.I.getValue()).f(this.o, Collections.singletonMap(Long.valueOf(this.Z), fx8));
    }

    public final byte[] f() {
        Tasks.MsgReact msgReact = new Tasks.MsgReact();
        msgReact.requestId = this.a;
        msgReact.chatId = this.o;
        msgReact.chatServerId = this.Y;
        msgReact.messageId = this.X;
        msgReact.messageServerId = this.Z;
        bx8 bx8 = this.s0;
        msgReact.reaction = bx8.b;
        msgReact.reactionType = bx8.a.ordinal();
        return qw8.toByteArray(msgReact);
    }

    public final void g(pke pke) {
        hm9.r(this.t0, pke.X, "reactions, reactTamTask onFail: %s", pke);
        l().c(new oi0(this.a, pke));
        u5c.a(this, pke);
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_MSG_REACT;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        tq2 tq2 = new tq2((sla) null, 24);
        long j = this.Z;
        if (j != 0) {
            bx8 bx8 = this.s0;
            String str = bx8.b;
            if (str.length() != 0) {
                tq2.i(this.Y, ApiProtocol.PARAM_CHAT_ID);
                tq2.i(j, "messageId");
                tq2.n("reaction", mz7.a0(new kpa("reactionType", bx8.a.name()), new kpa("id", str)));
                return tq2;
            }
            throw new IllegalArgumentException("param reaction.id can't be empty");
        }
        throw new IllegalArgumentException("param messageId can't be 0");
    }
}
