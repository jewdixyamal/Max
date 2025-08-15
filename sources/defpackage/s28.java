package defpackage;

/* renamed from: s28  reason: default package */
public final class s28 extends n2 {
    public final /* synthetic */ int b;
    public final b66 c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s28(f38 f38, b66 b66, int i) {
        super(f38);
        this.b = i;
        this.c = b66;
    }

    public final void g(b38 b38) {
        switch (this.b) {
            case 0:
                this.a.a(new g28(b38, this.c));
                return;
            default:
                this.a.a(new cb3(b38, 1, this.c));
                return;
        }
    }
}
