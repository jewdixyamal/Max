package defpackage;

/* renamed from: x64  reason: default package */
public final /* synthetic */ class x64 implements km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fd b;
    public final /* synthetic */ qy5 c;

    public /* synthetic */ x64(fd fdVar, qy5 qy5, s54 s54, int i) {
        this.a = i;
        this.b = fdVar;
        this.c = qy5;
    }

    public final void invoke(Object obj) {
        gd gdVar = (gd) obj;
        switch (this.a) {
            case 0:
                gdVar.V(this.b, this.c);
                return;
            default:
                gdVar.H(this.b, this.c);
                return;
        }
    }
}
