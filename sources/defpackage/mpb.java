package defpackage;

/* renamed from: mpb  reason: default package */
public final class mpb extends di0 {
    public final int j;

    public mpb(cjg cjg, eh3 eh3, zwd zwd, ai3 ai3, int i) {
        super(cjg, eh3, zwd, ai3);
        this.j = i;
    }

    public final void close() {
    }

    public final int d() {
        return ((Number) this.f.d.getValue()).intValue();
    }

    public final void g(boolean z) {
    }

    public final String i() {
        return this.f.a;
    }

    public final int j() {
        return this.j;
    }

    public final String toString() {
        return "ProxyClient{connectionHost=" + this.f + "}";
    }
}
