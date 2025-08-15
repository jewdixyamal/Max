package defpackage;

/* renamed from: h2e  reason: default package */
public final class h2e extends lz {
    public final je7 c;
    public final je7 d;
    public final zi5 e;
    public rx f;
    public final g2e g = new g2e(this);

    public h2e(l20 l20, khe khe, khe khe2, zi5 zi5) {
        super(l20);
        this.c = khe;
        this.d = khe2;
        this.e = zi5;
    }

    public final void a() {
        b(this.f, new Exception("cancelled"));
    }

    public final qy9 d() {
        qy9 d2 = super.d();
        if (d2 != null) {
            return d2;
        }
        rx rxVar = this.f;
        if (rxVar != null) {
            return rxVar;
        }
        this.f = new rx();
        f20 f20 = this.a.f;
        if (f20.j == 4) {
            om9.a(f20.l, 1, true).e(this.g);
        } else {
            String str = f20.h;
            if (oag.t(str)) {
                str = f20.b;
            }
            ((av6) this.d.getValue()).a(str, new w4d(26, (Object) this));
        }
        return this.f;
    }
}
