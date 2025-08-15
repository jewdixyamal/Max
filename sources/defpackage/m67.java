package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: m67  reason: default package */
public final class m67 extends k87 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(m67.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final m56 b;

    public m67(m56 m56) {
        this.b = m56;
    }

    public final boolean c() {
        return true;
    }

    public final void d(Throwable th) {
        if (c.compareAndSet(this, 0, 1)) {
            this.b.invoke(th);
        }
    }
}
