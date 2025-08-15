package defpackage;

/* renamed from: pjg  reason: default package */
public abstract class pjg implements Runnable {
    public final qne a;

    public pjg() {
        this.a = null;
    }

    public abstract void a();

    public final void run() {
        try {
            a();
        } catch (Exception e) {
            qne qne = this.a;
            if (qne != null) {
                qne.c(e);
            }
        }
    }

    public pjg(qne qne) {
        this.a = qne;
    }
}
