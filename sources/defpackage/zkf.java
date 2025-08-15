package defpackage;

/* renamed from: zkf  reason: default package */
public final /* synthetic */ class zkf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wva b;
    public final /* synthetic */ n54 c;

    public /* synthetic */ zkf(wva wva, n54 n54, int i) {
        this.a = i;
        this.b = wva;
        this.c = n54;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                wva wva = this.b;
                n54 n54 = this.c;
                wva.getClass();
                synchronized (n54) {
                }
                int i = maf.a;
                h74 h74 = ((n75) wva.c).a.C0;
                h74.Q(h74.J((xj8) h74.o.e), 1020, new v64(9));
                return;
            default:
                wva wva2 = this.b;
                wva2.getClass();
                int i2 = maf.a;
                t75 t75 = ((n75) wva2.c).a;
                t75.getClass();
                h74 h742 = t75.C0;
                ed P = h742.P();
                h742.Q(P, 1015, new v64((Object) P, 5, (Object) this.c));
                return;
        }
    }
}
