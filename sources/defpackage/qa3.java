package defpackage;

/* renamed from: qa3  reason: default package */
public final class qa3 extends pa3 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ qa3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public final void j(ab3 ab3) {
        switch (this.a) {
            case 0:
                ((pa3) this.b).i(new iq1(ab3, 1, (pa3) this.c));
                return;
            case 1:
                ((pa3) this.b).i(new y7g(this, ab3, false, 11));
                return;
            default:
                iq1 iq1 = new iq1(ab3, 7, (b66) this.c);
                ab3.c(iq1);
                ((iqd) this.b).k(iq1);
                return;
        }
    }
}
