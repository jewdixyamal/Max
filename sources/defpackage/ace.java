package defpackage;

/* renamed from: ace  reason: default package */
public final /* synthetic */ class ace implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q40 b;
    public final /* synthetic */ String c;

    public /* synthetic */ ace(q40 q40, String str, int i) {
        this.a = i;
        this.b = q40;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        uj3 uj3 = (uj3) obj;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((b0d) this.b.a).g(uj3, this.c));
            case 1:
                return ((b0d) this.b.a).b(uj3, this.c);
            default:
                return this.b.p(uj3, this.c);
        }
    }
}
