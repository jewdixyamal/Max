package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: dt0  reason: default package */
public final /* synthetic */ class dt0 implements mq1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AtomicReference b;

    public /* synthetic */ dt0(AtomicReference atomicReference, int i) {
        this.a = i;
        this.b = atomicReference;
    }

    public final String q(lq1 lq1) {
        switch (this.a) {
            case 0:
                this.b.set(lq1);
                return "Data closed";
            case 1:
                this.b.set(new wu1(0, lq1));
                return "OnScreenFlashUiApplied";
            case 2:
                this.b.set(lq1);
                return "Data closed";
            case 3:
                this.b.set(lq1);
                return "acquireInputBuffer";
            case 4:
                this.b.set(lq1);
                return "mReleasedFuture";
            default:
                this.b.set(lq1);
                return "Terminate InputBuffer";
        }
    }
}
