package defpackage;

/* renamed from: mn6  reason: default package */
public final /* synthetic */ class mn6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tn6 b;

    public /* synthetic */ mn6(tn6 tn6, int i) {
        this.a = i;
        this.b = tn6;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.A();
                return;
            default:
                tn6 tn6 = this.b;
                tn6.N0 = true;
                tn6.A();
                return;
        }
    }
}
