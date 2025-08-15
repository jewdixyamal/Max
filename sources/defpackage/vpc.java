package defpackage;

/* renamed from: vpc  reason: default package */
public final /* synthetic */ class vpc implements bb3, grd {
    public final /* synthetic */ sx3 a = zd6.a;
    public final /* synthetic */ lx3 b;
    public final /* synthetic */ a66 c;

    public /* synthetic */ vpc(lx3 lx3, ms3 ms3) {
        this.b = lx3;
        this.c = ms3;
    }

    public void b(ra3 ra3) {
        upc upc = new upc(v3c.x(this.a, this.b), ra3, 0);
        dm4.d(ra3, new uy1((Object) new tpc(upc)));
        upc.start(vx3.a, upc, this.c);
    }

    public void j(nqd nqd) {
        upc upc = new upc(v3c.x(this.a, this.b), nqd, 1);
        dm4.d(nqd, new uy1((Object) new tpc(upc)));
        upc.start(vx3.a, upc, this.c);
    }

    public /* synthetic */ vpc(lx3 lx3, rie rie) {
        this.b = lx3;
        this.c = rie;
    }
}
