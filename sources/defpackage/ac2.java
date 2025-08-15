package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: ac2  reason: default package */
public final class ac2 extends ol implements lme, hua {
    public final long X;
    public final String Y = ac2.class.getName();
    public final long o;

    public ac2(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = j3;
    }

    public final int c() {
        return m().C(this.o) != null ? 1 : 3;
    }

    public final void d() {
        long j = this.a;
        hm9.q(this.Y, "onMaxFailCount: remove task, requestId = %d", Long.valueOf(j));
        t().d(j);
    }

    public final void e(gle gle) {
        l().c(new vz2(Collections.singletonList(Long.valueOf(this.o)), true, false, (mg4) null, (h9b) null, 124));
    }

    public final byte[] f() {
        Tasks.ChatHide chatHide = new Tasks.ChatHide();
        chatHide.requestId = this.a;
        chatHide.chatId = this.o;
        chatHide.chatServerId = this.X;
        return qw8.toByteArray(chatHide);
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
        return iua.TYPE_CHAT_HIDE;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        au auVar = new au((sla) null, 19);
        auVar.i(this.X, ApiProtocol.PARAM_CHAT_ID);
        return auVar;
    }
}
