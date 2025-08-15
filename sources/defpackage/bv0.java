package defpackage;

/* renamed from: bv0  reason: default package */
public final class bv0 extends ez1 {
    public final /* synthetic */ int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bv0(int i, rxd rxd, Float f, int i2) {
        super(i, rxd, f);
        this.o = i2;
    }

    public final String toString() {
        switch (this.o) {
            case 0:
                return "[ButtCap]";
            case 1:
                return "[RoundCap]";
            default:
                return "[SquareCap]";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bv0() {
        super(0, (rxd) null, (Float) null);
        this.o = 0;
    }
}
