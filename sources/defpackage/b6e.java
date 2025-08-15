package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: b6e  reason: default package */
public final class b6e {
    public final je7 a;
    public final je7 b;
    public final ContextScope c;
    public final q0e d;
    public final w7c e;
    public final AtomicReference f = new AtomicReference(0L);
    public vxd g;

    public b6e(je7 je7, je7 je72, o2e o2e, kke kke) {
        this.a = je7;
        this.b = je72;
        ContextScope a2 = j1e.a(((w9a) kke).b());
        this.c = a2;
        q0e a3 = r0e.a(nz4.a);
        this.d = a3;
        this.e = new w7c(a3);
        od2.L(new zn5(new ap8(c37.c(o2e.l), this, 12), new x5e(this, (Continuation) null), 5), a2);
    }
}
