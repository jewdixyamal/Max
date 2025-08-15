package defpackage;

import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.SystemPropsKt;

/* renamed from: rb4  reason: default package */
public final class rb4 extends y45 implements Executor {
    public static final rb4 a = new nx3();
    public static final nx3 b;

    /* JADX WARNING: type inference failed for: r0v0, types: [rb4, nx3] */
    static {
        l5f l5f = l5f.a;
        int available_processors = SystemPropsKt.getAVAILABLE_PROCESSORS();
        b = nx3.limitedParallelism$default(l5f, SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.io.parallelism", 64 < available_processors ? available_processors : 64, 0, 0, 12, (Object) null), (String) null, 2, (Object) null);
    }

    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    public final void dispatch(lx3 lx3, Runnable runnable) {
        b.dispatch(lx3, runnable);
    }

    public final void dispatchYield(lx3 lx3, Runnable runnable) {
        b.dispatchYield(lx3, runnable);
    }

    public final void execute(Runnable runnable) {
        dispatch(hz4.a, runnable);
    }

    public final nx3 limitedParallelism(int i, String str) {
        return l5f.a.limitedParallelism(i, str);
    }

    public final Executor n() {
        return this;
    }

    public final String toString() {
        return "Dispatchers.IO";
    }
}
