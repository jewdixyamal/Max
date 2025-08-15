package defpackage;

/* renamed from: alf  reason: default package */
public final /* synthetic */ class alf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aab b;
    public final /* synthetic */ n54 c;

    public /* synthetic */ alf(aab aab, n54 n54, int i) {
        this.a = i;
        this.b = aab;
        this.c = n54;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                aab aab = this.b;
                aab.getClass();
                int i = oaf.a;
                u75 u75 = ((o75) aab.b).a;
                u75.getClass();
                i74 i74 = u75.D0;
                fd F = i74.F();
                i74.I(F, 1015, new w64(F, this.c, 1));
                return;
            default:
                aab aab2 = this.b;
                n54 n54 = this.c;
                aab2.getClass();
                synchronized (n54) {
                }
                int i2 = oaf.a;
                i74 i742 = ((o75) aab2.b).a.D0;
                fd g = i742.g((yj8) i742.o.X);
                i742.I(g, 1020, new f9(g, 29, n54));
                return;
        }
    }
}
