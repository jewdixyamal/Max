package defpackage;

/* renamed from: lo0  reason: default package */
public final /* synthetic */ class lo0 implements xff {
    public final /* synthetic */ int a;
    public final /* synthetic */ no0 b;

    public /* synthetic */ lo0(no0 no0, int i) {
        this.a = i;
        this.b = no0;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                no0 no0 = this.b;
                if (no0.o.isEmpty()) {
                    sgc sgc = no0.Z;
                    sgc.getClass();
                    ((qi0) sgc).b();
                    d54.a();
                    return;
                }
                no0.u0 = true;
                return;
            case 1:
                no0 no02 = this.b;
                no02.t0++;
                no02.A();
                return;
            default:
                no0 no03 = this.b;
                hd6 hd6 = no03.s0;
                if (hd6 != null) {
                    hd6.a();
                }
                no03.o.clear();
                return;
        }
    }
}
