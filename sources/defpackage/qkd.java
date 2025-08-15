package defpackage;

import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: qkd  reason: default package */
public final class qkd implements pi4 {
    public static final je7 h = tu0.r(3, new xid(3));
    public final je7 a;
    public final je7 b;
    public final ContextScope c;
    public int d;
    public boolean e;
    public vxd f;
    public final w7c g;

    public qkd(je7 je7, je7 je72) {
        this.a = je72;
        this.b = je7;
        long incrementAndGet = ei4.b.incrementAndGet();
        this.c = j1e.a(((w9a) ((kke) je72.getValue())).a());
        this.g = new w7c(r0e.a(Collections.singletonList(new b54(incrementAndGet, new eqe(m0c.oneme_settings_send_logs), woc.c, (jqe) null, (fp3) null, 24))));
    }

    public final j0e c() {
        return this.g;
    }

    public final void d(b54 b54) {
        vxd vxd = this.f;
        if (vxd == null || !vxd.isActive()) {
            this.f = j47.T(this.c, ((w9a) ((kke) this.a.getValue())).b(), (vx3) null, new pkd(this, (Continuation) null), 2);
            return;
        }
        wha wha = (wha) fi4.a.getAccessor().c(wha.class);
        wha.h("Логи уже скачиваются");
        if (this.e) {
            List list = (List) h.getValue();
            int i = this.d;
            if (i > 3) {
                i = 3;
            }
            wha.b((CharSequence) list.get(i));
        }
        wha.i();
        this.d++;
    }
}
