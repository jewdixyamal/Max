package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hld  reason: default package */
public final class hld implements cm4 {
    public final kld a;
    public final long b;
    public final Object c;
    public final Continuation o;

    public hld(kld kld, long j, Object obj, sy1 sy1) {
        this.a = kld;
        this.b = j;
        this.c = obj;
        this.o = sy1;
    }

    public final void dispose() {
        kld kld = this.a;
        synchronized (kld) {
            if (this.b >= kld.s()) {
                Object[] objArr = kld.s0;
                if (lld.c(objArr, this.b) == this) {
                    lld.d(objArr, this.b, lld.a);
                    kld.n();
                }
            }
        }
    }
}
