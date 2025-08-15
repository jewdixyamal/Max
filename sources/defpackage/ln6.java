package defpackage;

/* renamed from: ln6  reason: default package */
public final /* synthetic */ class ln6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sn6 b;

    public /* synthetic */ ln6(sn6 sn6, int i) {
        this.a = i;
        this.b = sn6;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                return;
            default:
                sn6 sn6 = this.b;
                sn6.N0 = true;
                sn6.p();
                return;
        }
    }
}
