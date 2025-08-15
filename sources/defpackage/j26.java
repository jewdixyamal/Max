package defpackage;

/* renamed from: j26  reason: default package */
public final /* synthetic */ class j26 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l26 b;
    public final /* synthetic */ z26 c;

    public /* synthetic */ j26(l26 l26, z26 z26, int i) {
        this.a = i;
        this.b = l26;
        this.c = z26;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.Z = this.c;
                return;
            default:
                this.b.s0 = this.c;
                return;
        }
    }
}
