package defpackage;

/* renamed from: tr0  reason: default package */
public final class tr0 extends rg4 {
    public final eab c;
    public final /* synthetic */ sse d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tr0(sse sse, fi0 fi0, eab eab) {
        super(fi0);
        this.d = sse;
        this.c = eab;
    }

    public final void f(Throwable th) {
        ((dab) this.d.c).a(this.b, this.c);
    }

    public final void h(int i, Object obj) {
        g05 g05 = (g05) obj;
        eab eab = this.c;
        wv6 wv6 = ((oj0) eab).a;
        boolean a = fi0.a(i);
        boolean q = tu0.q(g05, wv6.i);
        fi0 fi0 = this.b;
        if (g05 != null && (q || wv6.f)) {
            if (!a || !q) {
                fi0.g(i & -2, g05);
            } else {
                fi0.g(i, g05);
            }
        }
        if (a && !q && !wv6.g) {
            g05.d(g05);
            ((dab) this.d.c).a(fi0, eab);
        }
    }
}
