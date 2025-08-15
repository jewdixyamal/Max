package defpackage;

/* renamed from: j03  reason: default package */
public final class j03 {
    public final znc a;

    public j03(znc znc) {
        this.a = znc;
    }

    public final void a() {
        this.a.P(nz4.a, (zu3) null);
    }

    public final uu3 b() {
        coc coc = (coc) x53.i0(this.a.e());
        if (coc != null) {
            return coc.a;
        }
        return null;
    }

    public final String c() {
        coc coc = (coc) x53.i0(this.a.e());
        if (coc != null) {
            return coc.b;
        }
        return null;
    }

    public final void d(String str, k56 k56) {
        if (!tpa.f(c(), str)) {
            coc coc = new coc((uu3) k56.invoke(), (String) null, (zu3) null, (zu3) null, false, -1);
            coc.d(str);
            this.a.R(coc);
        }
    }
}
