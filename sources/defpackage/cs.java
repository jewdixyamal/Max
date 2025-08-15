package defpackage;

import java.util.concurrent.Executor;

/* renamed from: cs  reason: default package */
public final /* synthetic */ class cs implements Executor {
    public final /* synthetic */ int a;

    public /* synthetic */ cs(int i) {
        this.a = i;
    }

    private final void a(Runnable runnable) {
    }

    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ds.g0().d.e.execute(runnable);
                return;
            case 1:
                return;
            default:
                runnable.run();
                return;
        }
    }
}
