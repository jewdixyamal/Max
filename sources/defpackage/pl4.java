package defpackage;

import java.util.concurrent.Executor;

/* renamed from: pl4  reason: default package */
public final class pl4 implements Executor {
    public final nx3 a;

    public pl4(nx3 nx3) {
        this.a = nx3;
    }

    public final void execute(Runnable runnable) {
        hz4 hz4 = hz4.a;
        nx3 nx3 = this.a;
        if (nx3.isDispatchNeeded(hz4)) {
            nx3.dispatch(hz4, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
