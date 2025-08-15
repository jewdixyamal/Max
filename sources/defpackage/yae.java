package defpackage;

/* renamed from: yae  reason: default package */
public final class yae extends kld implements j0e {
    public final Object getValue() {
        Integer valueOf;
        synchronized (this) {
            valueOf = Integer.valueOf(((Number) lld.c(this.s0, (this.t0 + ((long) ((int) ((s() + ((long) this.v0)) - this.t0)))) - 1)).intValue());
        }
        return valueOf;
    }

    public final void z(int i) {
        synchronized (this) {
            g(Integer.valueOf(((Number) lld.c(this.s0, (this.t0 + ((long) ((int) ((s() + ((long) this.v0)) - this.t0)))) - 1)).intValue() + i));
        }
    }
}
