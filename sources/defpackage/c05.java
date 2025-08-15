package defpackage;

import android.graphics.Rect;
import android.view.View;

/* renamed from: c05  reason: default package */
public final class c05 extends gf {
    public final View l;
    public final Rect m = new Rect();
    public int n;
    public int o;
    public int p;
    public boolean q;

    public c05(ni0 ni0, View view) {
        super(ni0, new x27(0, (yq0) null, 3), 1, (m56) null, 56);
        this.l = view;
    }

    public final void g(x6g x6g, l7b l7b) {
        v6g v6g = x6g.a;
        int i = v6g.f(8).d;
        int i2 = v6g.f(7).d;
        boolean z = i == 0;
        int i3 = ((v27) l7b.c).d;
        this.p = i3;
        Rect rect = this.m;
        this.o = Math.abs(((this.a.getHeight() + ((z ? (rect.bottom + i2) - i3 : (rect.bottom + i3) - i2) - rect.top)) / 2) - this.n);
    }

    public final x6g h(x6g x6g) {
        if (this.q) {
            return x6g;
        }
        v6g v6g = x6g.a;
        v27 f = v6g.f(this.j);
        v27 f2 = v6g.f(this.d);
        int i = f.d;
        int i2 = f2.d;
        v27 b = v27.b(f.a - f2.a, f.b - f2.b, f.c - f2.c, i - i2);
        this.a.setTranslationY((((float) v27.b(Math.max(b.a, 0), Math.max(b.b, 0), Math.max(b.c, 0), Math.max(b.d, 0)).d) / ((float) (this.p - i2))) * ((float) this.o));
        return x6g;
    }

    public final void i() {
        this.a.setTranslationY(0.0f);
        this.q = false;
    }

    public final void j() {
        this.l.getGlobalVisibleRect(this.m);
        this.n = this.a.getBottom();
    }
}
