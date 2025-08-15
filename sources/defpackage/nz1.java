package defpackage;

/* renamed from: nz1  reason: default package */
public final /* synthetic */ class nz1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hqc b;

    public /* synthetic */ nz1(hqc hqc, int i) {
        this.a = i;
        this.b = hqc;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                return;
            case 1:
                hqc hqc = this.b;
                if (hqc != null) {
                    hqc.a();
                    return;
                }
                return;
            default:
                this.b.a();
                return;
        }
    }
}
