package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: uc2  reason: default package */
public final class uc2 extends ol implements lme, hua {
    public final long X;
    public final long o;

    public uc2(long j, long j2, long j3) {
        super(j);
        this.o = j2;
        this.X = j3;
    }

    public final int c() {
        return m().C(this.o) != null ? 1 : 3;
    }

    public final void d() {
        t().d(this.a);
    }

    public final void e(gle gle) {
        l().c(new vc2(this.a, this.o));
    }

    public final byte[] f() {
        Tasks.ChannelLeave channelLeave = new Tasks.ChannelLeave();
        channelLeave.requestId = this.a;
        channelLeave.chatId = this.o;
        channelLeave.chatServerId = this.X;
        return qw8.toByteArray(channelLeave);
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
        return iua.TYPE_CHAT_LEAVE;
    }

    public final int h() {
        return 1000000;
    }

    public final dle i() {
        au auVar = new au((sla) null, 23);
        auVar.i(this.X, ApiProtocol.PARAM_CHAT_ID);
        return auVar;
    }
}
