package defpackage;

/* renamed from: kg  reason: default package */
public final /* synthetic */ class kg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kp b;

    public /* synthetic */ kg(kp kpVar, int i) {
        this.a = i;
        this.b = kpVar;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.r();
                return;
            default:
                this.b.p();
                return;
        }
    }
}
