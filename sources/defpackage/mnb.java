package defpackage;

/* renamed from: mnb  reason: default package */
public final /* synthetic */ class mnb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vnb b;

    public /* synthetic */ mnb(vnb vnb, int i) {
        this.a = i;
        this.b = vnb;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.S0 = true;
                return;
            case 1:
                this.b.u();
                return;
            default:
                vnb vnb = this.b;
                if (!vnb.Y0) {
                    xd8 xd8 = vnb.C0;
                    xd8.getClass();
                    xd8.j(vnb);
                    return;
                }
                return;
        }
    }
}
