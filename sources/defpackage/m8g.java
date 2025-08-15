package defpackage;

/* renamed from: m8g  reason: default package */
public final class m8g implements Runnable {
    public final n8g a;
    public final l7g b;

    public m8g(n8g n8g, l7g l7g) {
        this.a = n8g;
        this.b = l7g;
    }

    public final void run() {
        synchronized (this.a.d) {
            try {
                if (((m8g) this.a.b.remove(this.b)) != null) {
                    l8g l8g = (l8g) this.a.c.remove(this.b);
                    if (l8g != null) {
                        l7g l7g = this.b;
                        kg4 kg4 = (kg4) l8g;
                        a14 u = a14.u();
                        u.n(kg4.x0, "Exceeded time limits on execution for " + l7g);
                        kg4.s0.execute(new jg4(kg4, 0));
                    }
                } else {
                    a14 u2 = a14.u();
                    l7g l7g2 = this.b;
                    u2.n("WrkTimerRunnable", "Timer with " + l7g2 + " is already marked as complete.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
