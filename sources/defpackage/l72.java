package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: l72  reason: default package */
public final class l72 extends ol implements lme, hua {
    public final long X;
    public final long Y;
    public final boolean Z;
    public final long o;

    public l72(long j, long j2, long j3, long j4, boolean z) {
        super(j);
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = z;
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
        t().d(this.a);
        p().y(this.o, this.Y, vx8.ACTIVE);
        p82 m = m();
        long j = this.o;
        m.w(j);
        l().c(new vz2(Collections.singletonList(Long.valueOf(j)), true, false, (mg4) null, (h9b) null, 124));
    }

    public final void e(gle gle) {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((u23) plVar.L.getValue()).a(this.o, this.Y);
    }

    public final byte[] f() {
        Tasks.ChatClear chatClear = new Tasks.ChatClear();
        chatClear.requestId = this.a;
        chatClear.chatId = this.o;
        chatClear.chatServerId = this.X;
        chatClear.lastEventTime = this.Y;
        chatClear.forAll = this.Z;
        return qw8.toByteArray(chatClear);
    }

    public final void g(pke pke) {
        if (!(pke instanceof gke)) {
            d();
        }
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_CHAT_CLEAR;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        au auVar = new au((sla) null, 14);
        auVar.i(this.X, ApiProtocol.PARAM_CHAT_ID);
        auVar.i(this.Y, "lastEventTime");
        auVar.d("forAll", this.Z);
        return auVar;
    }
}
