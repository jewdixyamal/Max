package defpackage;

/* renamed from: lnb  reason: default package */
public final /* synthetic */ class lnb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ unb b;

    public /* synthetic */ lnb(unb unb, int i) {
        this.a = i;
        this.b = unb;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.i();
                return;
            default:
                unb unb = this.b;
                if (!unb.W0) {
                    wd8 wd8 = unb.B0;
                    wd8.getClass();
                    wd8.c(unb);
                    return;
                }
                return;
        }
    }
}
