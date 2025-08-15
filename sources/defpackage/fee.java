package defpackage;

/* renamed from: fee  reason: default package */
public final /* synthetic */ class fee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hee b;

    public /* synthetic */ fee(hee hee, int i) {
        this.a = i;
        this.b = hee;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                return;
            case 1:
                this.b.b();
                return;
            default:
                hee hee = this.b;
                kee kee = hee.q;
                if (kee != null) {
                    kee.m();
                }
                if (hee.p == null) {
                    hee.o.c();
                    return;
                }
                return;
        }
    }
}
