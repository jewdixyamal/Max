package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: wpb  reason: default package */
public final class wpb extends AtomicBoolean implements zl4 {
    public final f2a a;
    public final xpb b;

    public wpb(f2a f2a, xpb xpb) {
        this.a = f2a;
        this.b = xpb;
    }

    public final void g() {
        if (compareAndSet(false, true)) {
            this.b.z(this);
        }
    }

    public final boolean h() {
        return get();
    }
}
