package defpackage;

/* renamed from: gr4  reason: default package */
public final /* synthetic */ class gr4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kr4 b;
    public final /* synthetic */ mr4 c;

    public /* synthetic */ gr4(kr4 kr4, mr4 mr4, int i) {
        this.a = i;
        this.b = kr4;
        this.c = mr4;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                kr4 kr4 = this.b;
                this.c.B(kr4.a, kr4.b);
                return;
            case 1:
                kr4 kr42 = this.b;
                this.c.K(kr42.a, kr42.b);
                return;
            case 2:
                kr4 kr43 = this.b;
                this.c.I(kr43.a, kr43.b);
                return;
            default:
                kr4 kr44 = this.b;
                this.c.v(kr44.a, kr44.b);
                return;
        }
    }
}
