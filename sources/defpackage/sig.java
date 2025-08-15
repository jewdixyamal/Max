package defpackage;

/* renamed from: sig  reason: default package */
public abstract class sig implements Runnable {
    public final qne a;

    public sig() {
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

    public sig(qne qne) {
        this.a = qne;
    }
}
