package defpackage;

/* renamed from: r14  reason: default package */
public final /* synthetic */ class r14 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x14 b;

    public /* synthetic */ r14(x14 x14, int i) {
        this.a = i;
        this.b = x14;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.t();
                return;
            default:
                this.b.s(false);
                return;
        }
    }
}
