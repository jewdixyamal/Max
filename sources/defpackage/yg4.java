package defpackage;

/* renamed from: yg4  reason: default package */
public final /* synthetic */ class yg4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ah4 b;
    public final /* synthetic */ Runnable c;
    public final /* synthetic */ bkg o;

    public /* synthetic */ yg4(ah4 ah4, Runnable runnable, bkg bkg, int i) {
        this.a = i;
        this.b = ah4;
        this.c = runnable;
        this.o = bkg;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ah4 ah4 = this.b;
                ah4.getClass();
                ah4.a.execute(new wg4(this.c, this.o, 0));
                return;
            case 1:
                ah4 ah42 = this.b;
                ah42.getClass();
                ah42.a.execute(new wg4(this.c, this.o, 2));
                return;
            default:
                ah4 ah43 = this.b;
                ah43.getClass();
                ah43.a.execute(new wg4(this.c, this.o, 1));
                return;
        }
    }
}
