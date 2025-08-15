package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* renamed from: nm2  reason: default package */
public final class nm2 extends ol implements lme, hua {
    public final boolean X;
    public final long o;

    public nm2(long j, long j2, boolean z) {
        super(j);
        this.o = j2;
        this.X = z;
    }

    public final int c() {
        eoe t = t();
        iua iua = iua.TYPE_CHAT_PIN_SET_VISIBILITY;
        long j = this.a;
        for (une une : t.h(j, iua)) {
            nm2 nm2 = (nm2) une.f;
            if (nm2.o == this.o && nm2.a > j) {
                return 3;
            }
        }
        return 1;
    }

    public final void d() {
        m().W(this.o, v82.o);
        t().d(this.a);
    }

    public final void e(gle gle) {
        om2 om2 = (om2) gle;
        if (om2.c != null) {
            m().W(this.o, v82.o);
            m().c0(Collections.singletonList(om2.c));
        }
    }

    public final byte[] f() {
        Tasks.ChatPinSetVisibility chatPinSetVisibility = new Tasks.ChatPinSetVisibility();
        chatPinSetVisibility.requestId = this.a;
        chatPinSetVisibility.chatServerId = this.o;
        chatPinSetVisibility.show = this.X;
        return qw8.toByteArray(chatPinSetVisibility);
    }

    public final void g(pke pke) {
        if (!f46.U(pke.b)) {
            d();
        }
        l().c(new oi0(this.a, pke));
    }

    public final long getId() {
        return this.a;
    }

    public final iua getType() {
        return iua.TYPE_CHAT_PIN_SET_VISIBILITY;
    }

    public final dle i() {
        au auVar = new au((sla) null, 28);
        auVar.i(this.o, ApiProtocol.PARAM_CHAT_ID);
        auVar.d("show", this.X);
        return auVar;
    }
}
