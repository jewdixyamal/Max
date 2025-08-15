package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: q92  reason: default package */
public final class q92 extends ol implements lme, hua {
    public final long X;
    public final long Y;
    public final boolean Z;
    public final long o;

    public q92(long j, long j2, long j3, long j4, boolean z) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = z;
    }

    public final int c() {
        p82 m = m();
        long j = this.o;
        e52 C = m.C(j);
        if (C == null || C.b.c != i92.o) {
            return 1;
        }
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((u23) plVar.L.getValue()).a(j, this.Y);
        return 3;
    }

    public final void d() {
        t().d(this.a);
    }

    public final void e(gle gle) {
        p82 m = m();
        i92 i92 = i92.o;
        long j = this.o;
        m.i(j, i92);
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((u23) plVar.L.getValue()).a(j, this.Y);
        l().c(new xfc(j));
    }

    public final byte[] f() {
        Tasks.ChatDelete chatDelete = new Tasks.ChatDelete();
        chatDelete.requestId = this.a;
        chatDelete.chatId = this.o;
        chatDelete.chatServerId = this.X;
        chatDelete.lastEventTime = this.Y;
        chatDelete.forAll = this.Z;
        return qw8.toByteArray(chatDelete);
    }

    public final void g(pke pke) {
        if (!f46.U(pke.b)) {
            d();
        }
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_CHAT_DELETE;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        au auVar = new au((sla) null, 18);
        auVar.i(this.X, ApiProtocol.PARAM_CHAT_ID);
        auVar.i(this.Y, "lastEventTime");
        auVar.d("forAll", this.Z);
        return auVar;
    }
}
