package defpackage;

/* renamed from: nne  reason: default package */
public abstract class nne implements Runnable {
    public long submissionTime;
    public sne taskContext;

    public nne(long j, sne sne) {
        this.submissionTime = j;
        this.taskContext = sne;
    }

    public final int getMode$kotlinx_coroutines_core() {
        return ((fm5) this.taskContext).b;
    }
}
