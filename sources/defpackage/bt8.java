package defpackage;

/* renamed from: bt8  reason: default package */
public final /* synthetic */ class bt8 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ bt8(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public final Object invoke(Object obj) {
        fka fka = (fka) obj;
        switch (this.a) {
            case 0:
                return new dcf(0, this.b ? fka.a().g().b.m : fka.a().k().b.m);
            case 1:
                return new dcf(0, this.b ? fka.a().g().b.o : fka.a().k().b.o);
            default:
                return new dcf(0, this.b ? fka.getIcon().a.e : fka.a().s().g.a);
        }
    }
}
