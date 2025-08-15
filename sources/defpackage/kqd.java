package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: kqd  reason: default package */
public final class kqd extends AtomicBoolean implements zl4 {
    public final erd a;
    public final lqd b;

    public kqd(erd erd, lqd lqd) {
        this.a = erd;
        this.b = lqd;
    }

    public final void g() {
        if (compareAndSet(false, true)) {
            this.b.o(this);
        }
    }

    public final boolean h() {
        return get();
    }
}
