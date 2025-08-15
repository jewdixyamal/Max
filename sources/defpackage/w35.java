package defpackage;

/* renamed from: w35  reason: default package */
public final class w35 extends x35 {
    public final Runnable c;

    public w35(Runnable runnable, long j) {
        super(j);
        this.c = runnable;
    }

    public final void run() {
        this.c.run();
    }

    public final String toString() {
        return super.toString() + this.c;
    }
}
