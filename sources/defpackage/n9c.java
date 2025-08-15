package defpackage;

/* renamed from: n9c  reason: default package */
public final /* synthetic */ class n9c implements b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p9c b;

    public /* synthetic */ n9c(p9c p9c, int i) {
        this.a = i;
        this.b = p9c;
    }

    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                h9c h9c = (h9c) obj;
                p9c p9c = this.b;
                return new qa3(new ib3(new o28(p9c.b(), 2, new y98((Object) p9c, 26, (Object) h9c)), 2, l9c.a(h9c, 0)), 2, new n9c(p9c, 1));
            default:
                e9c e9c = (e9c) obj;
                p9c p9c2 = this.b;
                e9c.c = ((hyc) p9c2.b).n();
                return new qa3(p9c2.b(), 2, new yt8(26, (Object) e9c));
        }
    }
}
