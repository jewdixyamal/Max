package defpackage;

/* renamed from: r64  reason: default package */
public final /* synthetic */ class r64 implements km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd b;
    public final /* synthetic */ String c;

    public /* synthetic */ r64(fd fdVar, String str, int i) {
        this.a = i;
        this.b = fdVar;
        this.c = str;
    }

    public final void invoke(Object obj) {
        gd gdVar = (gd) obj;
        switch (this.a) {
            case 0:
                gdVar.getClass();
                gdVar.C(this.b, this.c);
                return;
            case 1:
                gdVar.g0(this.b, this.c);
                return;
            case 2:
                gdVar.getClass();
                gdVar.w0(this.b, this.c);
                return;
            default:
                gdVar.x(this.b, this.c);
                return;
        }
    }

    public /* synthetic */ r64(fd fdVar, String str, long j, long j2, int i) {
        this.a = i;
        this.b = fdVar;
        this.c = str;
    }
}
