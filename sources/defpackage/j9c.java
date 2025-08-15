package defpackage;

/* renamed from: j9c  reason: default package */
public final /* synthetic */ class j9c implements b7b, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k9c b;

    public /* synthetic */ j9c(k9c k9c, int i) {
        this.a = i;
        this.b = k9c;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 4:
                k9c k9c = this.b;
                k9c.getClass();
                return new sa3(1, new p00(k9c, 7, (uj3) obj));
            default:
                k9c k9c2 = this.b;
                k9c2.getClass();
                return new sa3(1, new p00(k9c2, 8, (e52) obj));
        }
    }

    public boolean test(Object obj) {
        uj3 l;
        uj3 l2;
        uj3 l3;
        es8 es8;
        switch (this.a) {
            case 0:
                e52 F = this.b.a.F(((uj3) obj).n());
                return F == null || F.b.Y == 0;
            case 1:
                e52 e52 = (e52) obj;
                return !this.b.a.P(e52) && e52.b.Z != 0 && e52.M() && ((l = e52.l()) == null || !l.s());
            case 2:
                e52 e522 = (e52) obj;
                this.b.getClass();
                return e522.b.Y != 0 && ((l2 = e522.l()) == null || !l2.s());
            case 3:
                e52 e523 = (e52) obj;
                this.b.getClass();
                return e523.M() && ((l3 = e523.l()) == null || !l3.s()) && e523.b.g() && (es8 = e523.c) != null && !es8.a.x();
            default:
                uj3 uj3 = (uj3) obj;
                this.b.getClass();
                return uj3.a.c.r != 0 && !uj3.s();
        }
    }
}
