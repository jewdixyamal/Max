package defpackage;

/* renamed from: ae4  reason: default package */
public final /* synthetic */ class ae4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ see b;

    public /* synthetic */ ae4(see see, int i) {
        this.a = i;
        this.b = see;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                return;
            default:
                this.b.g.cancel(true);
                return;
        }
    }
}
