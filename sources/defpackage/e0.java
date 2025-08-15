package defpackage;

/* renamed from: e0  reason: default package */
public abstract class e0 implements jx3 {
    private final kx3 key;

    public e0(kx3 kx3) {
        this.key = kx3;
    }

    public <R> R fold(R r, a66 a66) {
        return a66.invoke(r, this);
    }

    public jx3 get(kx3 kx3) {
        return tpa.r(this, kx3);
    }

    public kx3 getKey() {
        return this.key;
    }

    public lx3 minusKey(kx3 kx3) {
        return tpa.y(this, kx3);
    }

    public lx3 plus(lx3 lx3) {
        return ema.z(this, lx3);
    }
}
