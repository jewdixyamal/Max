package defpackage;

/* renamed from: l65  reason: default package */
public final /* synthetic */ class l65 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ je7 b;
    public final /* synthetic */ m65 c;

    public /* synthetic */ l65(je7 je7, m65 m65, int i) {
        this.a = i;
        this.b = je7;
        this.c = m65;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                lw0 lw0 = new lw0();
                lw0.a = (hw0) this.b.getValue();
                lw0.c = (p24) this.c.c.getValue();
                lw0.d = 2;
                return lw0;
            case 1:
                return new vke(((tke) this.b.getValue()).e(), (h84) this.c.b.getValue());
            default:
                lw0 lw02 = new lw0();
                lw02.a = (hw0) this.b.getValue();
                lw02.c = (p24) this.c.e.getValue();
                lw02.d = 2;
                return lw02;
        }
    }
}
