package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: br2  reason: default package */
public final class br2 extends ol implements lme, hua {
    public final boolean X;
    public final long o;

    public br2(long j, long j2, boolean z) {
        super(j);
        this.o = j2;
        this.X = z;
    }

    public final int c() {
        return 1;
    }

    public final void d() {
        t().d(this.a);
    }

    public final void e(gle gle) {
    }

    public final byte[] f() {
        Tasks.ChatSubscribe chatSubscribe = new Tasks.ChatSubscribe();
        chatSubscribe.requestId = this.a;
        chatSubscribe.chatServerId = this.o;
        chatSubscribe.subscribe = this.X;
        return qw8.toByteArray(chatSubscribe);
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
        return iua.TYPE_CHAT_SUBSCRIBE;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        tq2 tq2 = new tq2((sla) null, 1);
        tq2.i(this.o, ApiProtocol.PARAM_CHAT_ID);
        tq2.d("subscribe", this.X);
        return tq2;
    }
}
