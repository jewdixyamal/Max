package defpackage;

/* renamed from: w88  reason: default package */
public final /* synthetic */ class w88 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i98 b;
    public final /* synthetic */ a98 c;

    public /* synthetic */ w88(i98 i98, a98 a98, int i) {
        this.a = i;
        this.b = i98;
        this.c = a98;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                i98 i98 = this.b;
                a98 a98 = this.c;
                i98.t0 = a98;
                if (a98 != null && i98.u0) {
                    i98.l(a98);
                }
                i98.d(new w88(i98, a98, 1), new xq1(1, i98));
                return;
            default:
                i98 i982 = this.b;
                a98 a982 = this.c;
                if (i982.a instanceof q0) {
                    a982.release();
                    return;
                }
                return;
        }
    }
}
