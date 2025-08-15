package defpackage;

/* renamed from: r93  reason: default package */
public final class r93 extends t93 {
    public final /* synthetic */ int X;
    public final /* synthetic */ v93 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r93(v93 v93, int i) {
        super(v93);
        this.X = i;
        this.Y = v93;
    }

    public final Object a(int i) {
        switch (this.X) {
            case 0:
                return this.Y.i()[i];
            case 1:
                return new u93(this.Y, i);
            default:
                return this.Y.j()[i];
        }
    }
}
