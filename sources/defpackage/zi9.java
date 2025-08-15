package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* renamed from: zi9  reason: default package */
public final class zi9 implements ry1, irf {
    public final sy1 a;
    public final Object b = null;
    public final /* synthetic */ aj9 c;

    public zi9(aj9 aj9, sy1 sy1) {
        this.c = aj9;
        this.a = sy1;
    }

    public final void a(Segment segment, int i) {
        this.a.a(segment, i);
    }

    public final void b(nx3 nx3) {
        this.a.b(nx3);
    }

    public final boolean cancel(Throwable th) {
        return this.a.cancel(th);
    }

    public final void d(m56 m56) {
        this.a.d(m56);
    }

    public final void e(Object obj, c66 c66) {
        e5f e5f = e5f.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = aj9.h;
        Object obj2 = this.b;
        aj9 aj9 = this.c;
        atomicReferenceFieldUpdater.set(aj9, obj2);
        ga gaVar = new ga(aj9, 21, this);
        sy1 sy1 = this.a;
        sy1.v(e5f, sy1.resumeMode, new vq0(2, gaVar));
    }

    public final lx3 getContext() {
        return this.a.b;
    }

    public final boolean isActive() {
        return this.a.isActive();
    }

    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    public final Symbol j(Throwable th) {
        return this.a.j(th);
    }

    public final Symbol l(Object obj, c66 c66) {
        aj9 aj9 = this.c;
        rt0 rt0 = new rt0(aj9, 1, this);
        Symbol x = this.a.x((e5f) obj, rt0);
        if (x != null) {
            aj9.h.set(aj9, this.b);
        }
        return x;
    }

    public final void q(Object obj) {
        this.a.q(obj);
    }

    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
