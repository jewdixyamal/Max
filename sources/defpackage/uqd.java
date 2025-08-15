package defpackage;

/* renamed from: uqd  reason: default package */
public final class uqd extends iqd {
    public final /* synthetic */ int a;
    public final iqd b;
    public final b66 c;

    public /* synthetic */ uqd(iqd iqd, b66 b66, int i) {
        this.a = i;
        this.c = b66;
        this.b = iqd;
    }

    public final void l(erd erd) {
        switch (this.a) {
            case 0:
                this.b.k(new tqd(0, this.c, erd));
                return;
            case 1:
                this.b.k(new l7b(erd, this.c, false, 7));
                return;
            default:
                this.b.k(new tqd(1, this.c, erd));
                return;
        }
    }
}
