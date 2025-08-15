package defpackage;

/* renamed from: ty9  reason: default package */
public final class ty9 extends w2 {
    public final /* synthetic */ int b;
    public final b7b c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ty9(r1a r1a, b7b b7b, int i) {
        super(r1a);
        this.b = i;
        this.c = b7b;
    }

    public final void q(f2a f2a) {
        switch (this.b) {
            case 0:
                this.a.a(new sy9(f2a, this.c, 0));
                return;
            case 1:
                this.a.a(new wz9(f2a, this.c, 0));
                return;
            case 2:
                this.a.a(new sy9(f2a, (aoe) this.c, 1));
                return;
            default:
                this.a.a(new sy9(f2a, (doe) this.c, 2));
                return;
        }
    }
}
