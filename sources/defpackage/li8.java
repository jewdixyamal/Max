package defpackage;

/* renamed from: li8  reason: default package */
public final /* synthetic */ class li8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ si8 b;
    public final /* synthetic */ x4b c;

    public /* synthetic */ li8(si8 si8, x4b x4b, int i) {
        this.a = i;
        this.b = si8;
        this.c = x4b;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                si8 si8 = this.b;
                si8.getClass();
                x4b x4b = this.c;
                si8.j.c(x4b.j());
                si8.h.F(x4b.s().a(17) ? x4b.x0() : mue.a);
                return;
            default:
                si8 si82 = this.b;
                si82.getClass();
                si82.j.c(this.c.j());
                return;
        }
    }
}
