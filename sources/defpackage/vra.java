package defpackage;

import kotlinx.coroutines.internal.MainDispatcherLoader;

/* renamed from: vra  reason: default package */
public final class vra extends nx3 {
    public final jl4 a = new jl4();

    public final void dispatch(lx3 lx3, Runnable runnable) {
        jl4 jl4 = this.a;
        jl4.getClass();
        jd4 jd4 = ql4.a;
        cx7 immediate = MainDispatcherLoader.dispatcher.getImmediate();
        if (!immediate.isDispatchNeeded(lx3)) {
            if (!(jl4.b || !jl4.a)) {
                if (jl4.d.offer(runnable)) {
                    jl4.a();
                    return;
                }
                throw new IllegalStateException("cannot enqueue any more runnables".toString());
            }
        }
        immediate.dispatch(lx3, new wt1(jl4, 29, runnable));
    }

    public final boolean isDispatchNeeded(lx3 lx3) {
        jd4 jd4 = ql4.a;
        if (MainDispatcherLoader.dispatcher.getImmediate().isDispatchNeeded(lx3)) {
            return true;
        }
        jl4 jl4 = this.a;
        return !(jl4.b || !jl4.a);
    }
}
