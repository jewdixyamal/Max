package defpackage;

/* renamed from: ad3  reason: default package */
public final /* synthetic */ class ad3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bd3 b;
    public final /* synthetic */ hlf c;

    public /* synthetic */ ad3(bd3 bd3, hlf hlf, int i) {
        this.a = i;
        this.b = bd3;
        this.c = hlf;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.getClass();
                this.c.getClass();
                return;
            case 1:
                this.b.getClass();
                this.c.M();
                return;
            default:
                this.b.getClass();
                this.c.onFirstFrameRendered();
                return;
        }
    }

    public /* synthetic */ ad3(bd3 bd3, hlf hlf, jlf jlf) {
        this.a = 0;
        this.b = bd3;
        this.c = hlf;
    }
}
