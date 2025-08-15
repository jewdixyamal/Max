package defpackage;

/* renamed from: x4f  reason: default package */
public final class x4f extends nx3 {
    public static final x4f a = new nx3();

    public final void dispatch(lx3 lx3, Runnable runnable) {
        u9g u9g = (u9g) lx3.get(u9g.b);
        if (u9g != null) {
            u9g.a = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    public final boolean isDispatchNeeded(lx3 lx3) {
        return false;
    }

    public final nx3 limitedParallelism(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
