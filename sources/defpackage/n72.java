package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: n72  reason: default package */
public final class n72 extends ol implements lme, hua {
    public final long X;
    public final long o;

    public n72(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = j3;
    }

    public final int c() {
        e52 C = m().C(this.o);
        if (C == null) {
            return 1;
        }
        i92 i92 = C.b.c;
        return (i92 == i92.o || i92 == i92.X) ? 3 : 1;
    }

    public final void d() {
        i92 i92;
        t().d(this.a);
        p82 m = m();
        long j = this.o;
        e52 C = m.C(j);
        if (C != null && ((i92 = C.b.c) == i92.o || i92 == i92.X)) {
            m().i(j, i92.a);
        }
        l().c(new vz2(Collections.singletonList(Long.valueOf(j)), true, false, (mg4) null, (h9b) null, 124));
    }

    public final void e(gle gle) {
        l().c(new vz2(Collections.singletonList(Long.valueOf(this.o)), true, false, (mg4) null, (h9b) null, 124));
    }

    public final byte[] f() {
        Tasks.ChatClose chatClose = new Tasks.ChatClose();
        chatClose.requestId = this.a;
        chatClose.chatId = this.o;
        chatClose.chatServerId = this.X;
        return qw8.toByteArray(chatClose);
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
        return iua.TYPE_CHAT_CLOSE;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        au auVar = new au((sla) null, 15);
        auVar.i(this.X, ApiProtocol.PARAM_CHAT_ID);
        return auVar;
    }
}
