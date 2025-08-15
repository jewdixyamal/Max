package defpackage;

/* renamed from: s64  reason: default package */
public final /* synthetic */ class s64 implements km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd b;
    public final /* synthetic */ int c;

    public /* synthetic */ s64(fd fdVar, int i, int i2) {
        this.a = i2;
        this.b = fdVar;
        this.c = i;
    }

    public final void invoke(Object obj) {
        gd gdVar = (gd) obj;
        switch (this.a) {
            case 0:
                gdVar.C0(this.b, this.c);
                return;
            case 1:
                gdVar.F(this.b, this.c);
                return;
            case 2:
                gdVar.E(this.b, this.c);
                return;
            case 3:
                gdVar.K(this.b, this.c);
                return;
            case 4:
                gdVar.getClass();
                gdVar.k0(this.b, this.c);
                return;
            case 5:
                gdVar.U(this.b, this.c);
                return;
            default:
                gdVar.Z(this.b, this.c);
                return;
        }
    }

    public /* synthetic */ s64(fd fdVar, int i, long j) {
        this.a = 1;
        this.b = fdVar;
        this.c = i;
    }

    public /* synthetic */ s64(fd fdVar, tb8 tb8, int i) {
        this.a = 6;
        this.b = fdVar;
        this.c = i;
    }
}
