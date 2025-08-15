package defpackage;

/* renamed from: aic  reason: default package */
public final /* synthetic */ class aic implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bic b;

    public /* synthetic */ aic(bic bic, int i) {
        this.a = i;
        this.b = bic;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                gb0 gb0 = this.b.c;
                if (((bic) gb0.g) != null) {
                    gb0.b();
                    return;
                }
                return;
            default:
                gb0 gb02 = this.b.c;
                if (((bic) gb02.g) != null && (gb02.b & 3) != 0) {
                    gb02.b();
                    return;
                }
                return;
        }
    }
}
