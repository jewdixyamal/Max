package defpackage;

/* renamed from: gba  reason: default package */
public final /* synthetic */ class gba implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ iba b;

    public /* synthetic */ gba(iba iba, int i) {
        this.a = i;
        this.b = iba;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.b;
            case 1:
                iba iba = this.b;
                return new eba(new bkb(iba.c, new gba(iba, 0)));
            default:
                return this.b.c();
        }
    }
}
