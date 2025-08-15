package defpackage;

/* renamed from: bb6  reason: default package */
public final class bb6 implements t0e {
    public final qaf a;
    public final qne b;

    public bb6(qaf qaf, qne qne) {
        this.a = qaf;
        this.b = qne;
    }

    public final boolean a(Exception exc) {
        this.b.c(exc);
        return true;
    }

    public final boolean b(hb0 hb0) {
        if (hb0.b != 4 || this.a.a(hb0)) {
            return false;
        }
        String str = hb0.c;
        if (str != null) {
            this.b.b(new ua0(hb0.e, str, hb0.f));
            return true;
        }
        throw new NullPointerException("Null token");
    }
}
