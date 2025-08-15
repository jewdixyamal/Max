package defpackage;

/* renamed from: y64  reason: default package */
public final /* synthetic */ class y64 implements km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd b;
    public final /* synthetic */ a70 c;

    public /* synthetic */ y64(fd fdVar, a70 a70, int i) {
        this.a = i;
        this.b = fdVar;
        this.c = a70;
    }

    public final void invoke(Object obj) {
        gd gdVar = (gd) obj;
        switch (this.a) {
            case 0:
                gdVar.P(this.b, this.c);
                return;
            default:
                gdVar.h0(this.b, this.c);
                return;
        }
    }
}
