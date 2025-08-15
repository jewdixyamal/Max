package defpackage;

/* renamed from: nl8  reason: default package */
public final /* synthetic */ class nl8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pl8 b;
    public final /* synthetic */ h1f c;

    public /* synthetic */ nl8(pl8 pl8, h1f h1f, int i) {
        this.a = i;
        this.b = pl8;
        this.c = h1f;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.o(this.c);
                return;
            case 1:
                this.b.o(this.c);
                return;
            default:
                this.b.f(this.c);
                return;
        }
    }
}
