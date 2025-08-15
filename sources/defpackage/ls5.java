package defpackage;

/* renamed from: ls5  reason: default package */
public final class ls5 extends o1 {
    public final Iterable X;
    public final /* synthetic */ int o = 0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ls5(ms5 ms5, int i) {
        super(i, 0);
        this.X = ms5;
    }

    public final Object a(int i) {
        switch (this.o) {
            case 0:
                return ((ms5) this.X).a[i].iterator();
            default:
                return ((zw6) this.X).get(i);
        }
    }

    public ls5(zw6 zw6, int i) {
        super(zw6.size(), i);
        this.X = zw6;
    }
}
