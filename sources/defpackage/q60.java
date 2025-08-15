package defpackage;

/* renamed from: q60  reason: default package */
public final /* synthetic */ class q60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz7 b;
    public final /* synthetic */ n54 c;

    public /* synthetic */ q60(qz7 qz7, n54 n54, int i) {
        this.a = i;
        this.b = qz7;
        this.c = n54;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                qz7 qz7 = this.b;
                qz7.getClass();
                int i = oaf.a;
                u75 u75 = ((o75) qz7.c).a;
                u75.getClass();
                i74 i74 = u75.D0;
                fd F = i74.F();
                i74.I(F, 1007, new w64(F, this.c, 2));
                return;
            default:
                qz7 qz72 = this.b;
                n54 n54 = this.c;
                qz72.getClass();
                synchronized (n54) {
                }
                int i2 = oaf.a;
                i74 i742 = ((o75) qz72.c).a.D0;
                fd g = i742.g((yj8) i742.o.X);
                i742.I(g, 1013, new w64(g, n54, 0));
                return;
        }
    }
}
