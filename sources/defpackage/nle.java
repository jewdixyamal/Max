package defpackage;

/* renamed from: nle  reason: default package */
public final /* synthetic */ class nle implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lme b;
    public final /* synthetic */ pke c;

    public /* synthetic */ nle(lme lme, pke pke, int i) {
        this.a = i;
        this.b = lme;
        this.c = pke;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g(this.c);
                return;
            case 1:
                this.b.g(this.c);
                return;
            default:
                this.b.g(this.c);
                return;
        }
    }
}
