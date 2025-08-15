package defpackage;

/* renamed from: es5  reason: default package */
public final class es5 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final long b;
    public final Object c;

    public es5(long j, xae xae) {
        this.c = xae;
        this.b = j;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ((xae) this.c).j(this.b);
                return;
            default:
                ((a2a) this.c).a(this.b);
                return;
        }
    }

    public es5(long j, a2a a2a) {
        this.b = j;
        this.c = a2a;
    }
}
