package defpackage;

/* renamed from: scc  reason: default package */
public final /* synthetic */ class scc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ adc b;
    public final /* synthetic */ nb0 c;

    public /* synthetic */ scc(adc adc, nb0 nb0, int i) {
        this.a = i;
        this.b = adc;
        this.c = nb0;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                this.b.t(this.c);
                return;
            default:
                adc adc = this.b;
                if (adc.q == this.c && !adc.r) {
                    if (adc.n()) {
                        adc.H.k();
                    }
                    n05 n05 = adc.F;
                    if (n05 != null) {
                        ((d15) n05).k();
                        nb0 nb0 = adc.q;
                        nb0.n(new xkf(nb0.s0, adc.k()));
                        return;
                    }
                    adc.d0 = true;
                    return;
                }
                return;
        }
    }
}
