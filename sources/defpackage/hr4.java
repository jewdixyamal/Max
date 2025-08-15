package defpackage;

/* renamed from: hr4  reason: default package */
public final /* synthetic */ class hr4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr4 b;
    public final /* synthetic */ nr4 c;

    public /* synthetic */ hr4(lr4 lr4, nr4 nr4, int i) {
        this.a = i;
        this.b = lr4;
        this.c = nr4;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                lr4 lr4 = this.b;
                this.c.H(lr4.a, lr4.b);
                return;
            case 1:
                lr4 lr42 = this.b;
                this.c.C(lr42.a, lr42.b);
                return;
            case 2:
                lr4 lr43 = this.b;
                this.c.z(lr43.a, lr43.b);
                return;
            default:
                lr4 lr44 = this.b;
                this.c.D(lr44.a, lr44.b);
                return;
        }
    }
}
