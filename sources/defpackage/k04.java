package defpackage;

/* renamed from: k04  reason: default package */
public final class k04 extends ez1 {
    public final float X;
    public final rxd o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k04(rxd rxd, float f) {
        super(3, rxd, Float.valueOf(f));
        fp3.o(rxd, "bitmapDescriptor must not be null");
        if (f > 0.0f) {
            this.o = rxd;
            this.X = f;
            return;
        }
        throw new IllegalArgumentException("refWidth must be positive");
    }

    public final String toString() {
        StringBuilder m = au1.m("[CustomCap: bitmapDescriptor=", String.valueOf(this.o), " refWidth=");
        m.append(this.X);
        m.append("]");
        return m.toString();
    }
}
