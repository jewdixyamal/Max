package defpackage;

/* renamed from: wg4  reason: default package */
public final /* synthetic */ class wg4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ bkg c;

    public /* synthetic */ wg4(Runnable runnable, bkg bkg, int i) {
        this.a = i;
        this.b = runnable;
        this.c = bkg;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    this.b.run();
                    return;
                } catch (Exception e) {
                    ((ch4) this.c.b).j(e);
                    throw e;
                }
            case 1:
                try {
                    this.b.run();
                    return;
                } catch (Exception e2) {
                    ((ch4) this.c.b).j(e2);
                    return;
                }
            default:
                Runnable runnable = this.b;
                bkg bkg = this.c;
                try {
                    runnable.run();
                    ((ch4) bkg.b).i((Object) null);
                    return;
                } catch (Exception e3) {
                    ((ch4) bkg.b).j(e3);
                    return;
                }
        }
    }
}
