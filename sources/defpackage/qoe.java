package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: qoe  reason: default package */
public final class qoe extends cx7 implements hg4 {
    public final poe a;

    public qoe(cx7 cx7) {
        this.a = new poe(cx7);
    }

    public final Object delay(long j, Continuation continuation) {
        return c37.j(this, j, continuation);
    }

    public final void dispatch(lx3 lx3, Runnable runnable) {
        ((nx3) this.a.a()).dispatch(lx3, runnable);
    }

    public final void dispatchYield(lx3 lx3, Runnable runnable) {
        ((nx3) this.a.a()).dispatchYield(lx3, runnable);
    }

    public final cx7 getImmediate() {
        cx7 immediate;
        Object a2 = this.a.a();
        cx7 cx7 = a2 instanceof cx7 ? (cx7) a2 : null;
        return (cx7 == null || (immediate = cx7.getImmediate()) == null) ? this : immediate;
    }

    public final cm4 invokeOnTimeout(long j, Runnable runnable, lx3 lx3) {
        Object a2 = this.a.a();
        hg4 hg4 = a2 instanceof hg4 ? (hg4) a2 : null;
        if (hg4 == null) {
            hg4 = qa4.a;
        }
        return hg4.invokeOnTimeout(j, runnable, lx3);
    }

    public final boolean isDispatchNeeded(lx3 lx3) {
        return ((nx3) this.a.a()).isDispatchNeeded(lx3);
    }

    public final void scheduleResumeAfterDelay(long j, ry1 ry1) {
        Object a2 = this.a.a();
        hg4 hg4 = a2 instanceof hg4 ? (hg4) a2 : null;
        if (hg4 == null) {
            hg4 = qa4.a;
        }
        hg4.scheduleResumeAfterDelay(j, ry1);
    }
}
