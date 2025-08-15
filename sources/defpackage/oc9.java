package defpackage;

/* renamed from: oc9  reason: default package */
public final class oc9 extends e1 implements Runnable {
    public final Runnable s0;

    public oc9(Runnable runnable) {
        runnable.getClass();
        this.s0 = runnable;
    }

    public final String j() {
        return "task=[" + this.s0 + "]";
    }

    public final void run() {
        try {
            this.s0.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
