package defpackage;

/* renamed from: qg1  reason: default package */
public final /* synthetic */ class qg1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rg1 b;

    public /* synthetic */ qg1(rg1 rg1, int i) {
        this.a = i;
        this.b = rg1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((se5) ((qe5) this.b.f.getValue())).r());
            default:
                return Boolean.valueOf(((se5) ((qe5) this.b.f.getValue())).s());
        }
    }
}
