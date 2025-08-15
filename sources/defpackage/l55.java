package defpackage;

/* renamed from: l55  reason: default package */
public final class l55 implements Runnable {
    public final Runnable a;
    public final g55 b;
    public final h55 c;

    public l55(Runnable runnable, g55 g55, h55 h55) {
        this.a = runnable;
        this.b = g55;
        this.c = h55;
    }

    public final void run() {
        h55 h55 = this.c;
        long a2 = this.b.a();
        try {
            this.a.run();
        } finally {
            h55.a(a2);
        }
    }
}
