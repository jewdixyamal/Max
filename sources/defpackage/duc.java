package defpackage;

import java.util.concurrent.Executor;

/* renamed from: duc  reason: default package */
public abstract class duc extends y45 {
    public final rx3 a;

    public duc(int i, int i2, long j) {
        String str = joe.a;
        this.a = new rx3(i, i2, j);
    }

    public final void dispatch(lx3 lx3, Runnable runnable) {
        rx3.o(this.a, runnable, false, 6);
    }

    public final void dispatchYield(lx3 lx3, Runnable runnable) {
        rx3.o(this.a, runnable, true, 2);
    }

    public final Executor n() {
        return this.a;
    }
}
