package defpackage;

/* renamed from: if  reason: invalid class name and default package and case insensitive filesystem */
public final class C0003if extends gf {
    public final x6g h(x6g x6g) {
        v6g v6g = x6g.a;
        v27 f = v6g.f(this.j);
        v27 f2 = v6g.f(this.d);
        v27 b = v27.b(f.a - f2.a, f.b - f2.b, f.c - f2.c, f.d - f2.d);
        v27 b2 = v27.b(Math.max(b.a, 0), Math.max(b.b, 0), Math.max(b.c, 0), Math.max(b.d, 0));
        this.a.setTranslationY((float) (b2.b - b2.d));
        return x6g;
    }

    public final void i() {
        this.a.setTranslationY(0.0f);
    }
}
