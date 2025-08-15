package defpackage;

/* renamed from: m43  reason: default package */
public final class m43 extends g0 {
    public final fcd h;
    public final thc i;
    public final /* synthetic */ int j;

    public m43(dab dab, fcd fcd, b47 b47, int i2) {
        this.j = i2;
        this.h = fcd;
        this.i = b47;
        f46.I();
        this.a = fcd.Y;
        f46.I();
        b47.c(fcd);
        f46.I();
        dab.a(new f3(0, this), fcd);
    }

    public final boolean a() {
        if (!super.a()) {
            return false;
        }
        if (h()) {
            return true;
        }
        thc thc = this.i;
        fcd fcd = this.h;
        thc.h(fcd);
        fcd.e();
        return true;
    }

    public void b(Object obj) {
        switch (this.j) {
            case 0:
                o43.S((o43) obj);
                return;
            default:
                return;
        }
    }

    public Object e() {
        switch (this.j) {
            case 0:
                return o43.o((o43) super.e());
            default:
                return super.e();
        }
    }

    public void o(Object obj, int i2, eab eab) {
        switch (this.j) {
            case 0:
                p(o43.o((o43) obj), i2, eab);
                return;
            default:
                p(obj, i2, eab);
                return;
        }
    }

    public final void p(Object obj, int i2, eab eab) {
        boolean a = fi0.a(i2);
        if (l(obj, a, ((oj0) eab).Y) && a) {
            this.i.g(this.h);
        }
    }
}
