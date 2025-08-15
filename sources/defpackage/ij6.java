package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: ij6  reason: default package */
public final class ij6 implements pi4 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final ContextScope e;
    public vxd f;
    public final w7c g;

    public ij6(je7 je7, je7 je72, je7 je73, je7 je74) {
        this.a = je7;
        this.b = je73;
        this.c = je72;
        this.d = je74;
        long incrementAndGet = ei4.b.incrementAndGet();
        this.e = j1e.a(((w9a) ((kke) je73.getValue())).a());
        this.g = new w7c(r0e.a(Collections.singletonList(new b54(incrementAndGet, new eqe(m0c.oneme_settings_dump_heap), woc.c, (jqe) null, (fp3) null, 24))));
    }

    public final j0e c() {
        return this.g;
    }

    public final void d(b54 b54) {
        vxd vxd = this.f;
        if (vxd == null || !vxd.isActive()) {
            this.f = j47.T(this.e, ((w9a) ((kke) this.b.getValue())).b(), (vx3) null, new hj6(this, (Continuation) null), 2);
            return;
        }
        wha wha = (wha) this.d.getValue();
        wha.h("Дамп памяти уже происходит, нужно немного подождать");
        wha.i();
    }
}
