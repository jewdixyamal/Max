package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: wrd  reason: default package */
public final class wrd extends AtomicReference implements zl4 {
    public final erd a;

    public wrd(erd erd, xrd xrd) {
        this.a = erd;
        lazySet(xrd);
    }

    public final void g() {
        xrd xrd = (xrd) getAndSet((Object) null);
        if (xrd != null) {
            xrd.o(this);
        }
    }

    public final boolean h() {
        return get() == null;
    }
}
