package defpackage;

/* renamed from: y60  reason: default package */
public final /* synthetic */ class y60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph4 b;
    public final /* synthetic */ n54 c;

    public /* synthetic */ y60(ph4 ph4, n54 n54, int i) {
        this.a = i;
        this.b = ph4;
        this.c = n54;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                ph4 ph4 = this.b;
                ph4.getClass();
                int i = maf.a;
                t75 t75 = ((n75) ph4.b).a;
                t75.getClass();
                h74 h74 = t75.C0;
                ed P = h74.P();
                h74.Q(P, 1007, new b74(P, this.c, 2));
                return;
            default:
                ph4 ph42 = this.b;
                n54 n54 = this.c;
                ph42.getClass();
                synchronized (n54) {
                }
                int i2 = maf.a;
                h74 h742 = ((n75) ph42.b).a.C0;
                h742.Q(h742.J((xj8) h742.o.e), 1013, new v64(10));
                return;
        }
    }
}
