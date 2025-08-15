package defpackage;

/* renamed from: kod  reason: default package */
public final class kod implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ood b;

    public /* synthetic */ kod(ood ood, int i) {
        this.a = i;
        this.b = ood;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.requestLayout();
                return;
            default:
                ood ood = this.b;
                ood.p1 = false;
                ood.b();
                return;
        }
    }
}
