package defpackage;

/* renamed from: ykf  reason: default package */
public final /* synthetic */ class ykf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object o;

    public /* synthetic */ ykf(Object obj, int i, long j, int i2) {
        this.a = i2;
        this.o = obj;
        this.b = i;
        this.c = j;
    }

    public final void run() {
        long j = this.c;
        int i = this.b;
        Object obj = this.o;
        switch (this.a) {
            case 0:
                wva wva = (wva) obj;
                wva.getClass();
                int i2 = maf.a;
                h74 h74 = ((n75) wva.c).a.C0;
                ed J = h74.J((xj8) h74.o.e);
                h74.Q(J, 1018, new z64(J, i, j));
                return;
            default:
                aab aab = (aab) obj;
                aab.getClass();
                int i3 = oaf.a;
                i74 i74 = ((o75) aab.b).a.D0;
                fd g = i74.g((yj8) i74.o.X);
                i74.I(g, 1018, new s64(g, i, j));
                return;
        }
    }
}
