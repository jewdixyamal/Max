package defpackage;

/* renamed from: f5a  reason: default package */
public final class f5a {
    public final z4 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;

    public f5a(je7 je7, je7 je72, z4 z4Var, je7 je73) {
        this.a = z4Var;
        this.b = je7;
        this.c = je72;
        this.d = je73;
    }

    public final b5 a() {
        return (b5) this.c.getValue();
    }

    public final m7b b() {
        return (m7b) this.b.getValue();
    }

    public final oq0 c() {
        boolean d2 = d();
        boolean z = false;
        boolean d3 = ((p7b) b()).d.d("auth.account.external", false);
        if (d2 && d3) {
            z = true;
        }
        return new oq0(d2, z);
    }

    public final boolean d() {
        if (((p7b) b()).a.t() != -1) {
            String string = ((p7b) b()).d.g.getString("auth.token", (String) null);
            if (string != null && string.length() != 0) {
                return true;
            }
            b5 a2 = a();
            a2.a();
            a2.a.getClass();
        }
        return false;
    }

    public final boolean e() {
        return d() && ((p7b) b()).d.d("auth.account.external", false);
    }

    public final String f() {
        String string;
        if (((p7b) b()).a.t() == 0 || (string = ((p7b) b()).d.g.getString("auth.token", (String) null)) == null || string.length() == 0) {
            return null;
        }
        String string2 = ((p7b) b()).d.g.getString("auth.token", (String) null);
        if (string2 != null && string2.length() != 0) {
            return string2;
        }
        b5 a2 = a();
        a2.a();
        a2.a.getClass();
        return null;
    }

    public final void g(boolean z) {
        hm9.m("f5a", "removeAccount", new Object[0]);
        ((p7b) b()).d.c();
        a().b();
        if (z) {
            int i = t8d.o;
            boolean e = e();
            int i2 = ft4.o;
            t8d.c = z7.S(System.nanoTime(), kt4.NANOSECONDS);
            ((s8g) this.d.getValue()).a(new t8d(e));
        }
    }

    public final void h(String str, boolean z) {
        ((p7b) b()).d.o(a().a(), str, z);
        a().getClass();
    }
}
