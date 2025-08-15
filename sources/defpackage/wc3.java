package defpackage;

import java.util.concurrent.Executor;

/* renamed from: wc3  reason: default package */
public final /* synthetic */ class wc3 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ di6 b;

    public /* synthetic */ wc3(di6 di6, int i) {
        this.a = i;
        this.b = di6;
    }

    public final void execute(Runnable runnable) {
        int i = this.a;
        ((bie) this.b).d(runnable);
    }
}
