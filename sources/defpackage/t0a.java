package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: t0a  reason: default package */
public final class t0a extends AtomicReference implements zl4 {
    public final f2a a;

    public t0a(f2a f2a, u0a u0a) {
        this.a = f2a;
        lazySet(u0a);
    }

    public final void g() {
        u0a u0a = (u0a) getAndSet((Object) null);
        if (u0a != null) {
            u0a.a(this);
        }
    }

    public final boolean h() {
        return get() == null;
    }
}
