package defpackage;

/* renamed from: vtc  reason: default package */
public final class vtc implements zl4, Runnable {
    public final Runnable a;
    public final xtc b;
    public Thread c;

    public vtc(Runnable runnable, xtc xtc) {
        this.a = runnable;
        this.b = xtc;
    }

    public final void g() {
        if (this.c == Thread.currentThread()) {
            xtc xtc = this.b;
            if (xtc instanceof zp9) {
                zp9 zp9 = (zp9) xtc;
                if (!zp9.b) {
                    zp9.b = true;
                    zp9.a.shutdown();
                    return;
                }
                return;
            }
        }
        this.b.g();
    }

    public final boolean h() {
        return this.b.h();
    }

    public final void run() {
        this.c = Thread.currentThread();
        try {
            this.a.run();
            g();
            this.c = null;
        } catch (Throwable th) {
            g();
            this.c = null;
            throw th;
        }
    }
}
