package defpackage;

/* renamed from: w64  reason: default package */
public final /* synthetic */ class w64 implements km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd b;

    public /* synthetic */ w64(fd fdVar, int i) {
        this.a = i;
        this.b = fdVar;
    }

    public final void invoke(Object obj) {
        gd gdVar = (gd) obj;
        switch (this.a) {
            case 0:
                gdVar.l0(this.b);
                return;
            case 1:
                gdVar.Q(this.b);
                return;
            case 2:
                gdVar.j0(this.b);
                return;
            case 3:
                gdVar.v0(this.b);
                return;
            case 4:
                gdVar.w(this.b);
                return;
            case 5:
                gdVar.D0(this.b);
                return;
            default:
                gdVar.s(this.b);
                return;
        }
    }

    public /* synthetic */ w64(fd fdVar, n54 n54, int i) {
        this.a = i;
        this.b = fdVar;
    }
}
