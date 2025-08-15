package defpackage;

/* renamed from: rqd  reason: default package */
public final class rqd extends iqd {
    public final /* synthetic */ int a;
    public final iqd b;
    public final qj3 c;

    public /* synthetic */ rqd(iqd iqd, qj3 qj3, int i) {
        this.a = i;
        this.b = iqd;
        this.c = qj3;
    }

    public final void l(erd erd) {
        switch (this.a) {
            case 0:
                this.b.k(new cb3(erd, 6, this.c));
                return;
            case 1:
                this.b.k(new djb((Object) this, 5, (Object) erd));
                return;
            default:
                this.b.k(new wva(this, erd, false, 7));
                return;
        }
    }
}
