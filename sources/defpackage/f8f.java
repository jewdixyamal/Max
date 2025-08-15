package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: f8f  reason: default package */
public final /* synthetic */ class f8f implements b66, b7b {
    public final /* synthetic */ int a;
    public final /* synthetic */ g8f b;

    public /* synthetic */ f8f(g8f g8f, int i) {
        this.a = i;
        this.b = g8f;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 0:
                iy8 iy8 = (iy8) obj;
                g8f g8f = this.b;
                g8f.getClass();
                return iy8.d == 2 ? ((kw3) g8f.d.get()).a(iy8) : qy9.m(iy8);
            case 1:
                this.b.getClass();
                return g8f.b((iy8) obj);
            default:
                v6f v6f = (v6f) obj;
                g8f g8f2 = this.b;
                g8f2.getClass();
                if (!h4f.b(v6f.a.c) || !v6f.a()) {
                    return qy9.m(new ly8(v6f, (d2e) null));
                }
                return new e0a(g8f2.b.a(v6f.h.a).n(), new a7f(v6f, 3), 3);
        }
    }

    public boolean test(Object obj) {
        Throwable th = (Throwable) obj;
        this.b.getClass();
        return (th instanceof TamErrorException) && "invalid.token".equals(((TamErrorException) th).a.b);
    }
}
