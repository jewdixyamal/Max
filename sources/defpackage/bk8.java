package defpackage;

/* renamed from: bk8  reason: default package */
public final /* synthetic */ class bk8 implements Runnable {
    public final /* synthetic */ pc8 X;
    public final /* synthetic */ int a;
    public final /* synthetic */ gk8 b;
    public final /* synthetic */ hk8 c;
    public final /* synthetic */ xn7 o;

    public /* synthetic */ bk8(gk8 gk8, hk8 hk8, xn7 xn7, pc8 pc8, int i) {
        this.a = i;
        this.b = gk8;
        this.c = hk8;
        this.o = xn7;
        this.X = pc8;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                gk8 gk8 = this.b;
                this.c.N(gk8.b, (xj8) gk8.c, this.o, this.X);
                return;
            case 1:
                gk8 gk82 = this.b;
                this.c.M(gk82.b, (xj8) gk82.c, this.o, this.X);
                return;
            default:
                gk8 gk83 = this.b;
                this.c.b(gk83.b, (xj8) gk83.c, this.o, this.X);
                return;
        }
    }
}
