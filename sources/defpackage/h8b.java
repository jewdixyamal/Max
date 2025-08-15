package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: h8b  reason: default package */
public final class h8b extends l9f {
    public static final f8b x = new Object();
    public static final zh6 y = ju0.D();
    public g8b p;
    public Executor q;
    public bad r;
    public xf4 s;
    public iee t;
    public see u;
    public nw4 v;
    public cad w;

    public final void C(Rect rect) {
        this.i = rect;
        ax1 c = c();
        iee iee = this.t;
        if (c != null && iee != null) {
            kq0.H(new ft0(iee, h(c, n(c)), b(), 5));
        }
    }

    public final void F() {
        cad cad = this.w;
        if (cad != null) {
            cad.b();
            this.w = null;
        }
        xf4 xf4 = this.s;
        if (xf4 != null) {
            xf4.a();
            this.s = null;
        }
        nw4 nw4 = this.v;
        if (nw4 != null) {
            nw4.n();
            this.v = null;
        }
        iee iee = this.t;
        if (iee != null) {
            iee.c();
            this.t = null;
        }
        this.u = null;
    }

    public final void G(g8b g8b) {
        kq0.e();
        Size size = null;
        if (g8b == null) {
            this.p = null;
            this.c = 2;
            r();
            return;
        }
        this.p = g8b;
        this.q = y;
        vb0 vb0 = this.g;
        if (vb0 != null) {
            size = vb0.a;
        }
        if (size != null) {
            H((i8b) this.f, vb0);
            q();
        }
        p();
    }

    public final void H(i8b i8b, vb0 vb0) {
        Rect rect;
        vb0 vb02 = vb0;
        kq0.e();
        ax1 c = c();
        Objects.requireNonNull(c);
        F();
        Rect rect2 = null;
        c54.p((String) null, this.t == null);
        Matrix matrix = this.j;
        boolean n = c.n();
        Size size = vb02.a;
        Rect rect3 = this.i;
        if (rect3 != null) {
            rect = rect3;
        } else {
            if (size != null) {
                rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
            }
            rect = rect2;
        }
        Objects.requireNonNull(rect);
        iee iee = new iee(1, 34, vb0, matrix, n, rect, h(c, n(c)), b(), c.n() && n(c));
        this.t = iee;
        zgf zgf = this.m;
        if (zgf != null) {
            this.v = new nw4(c, (lee) new mee(zgf));
            this.t.a(new nn6(28, this));
            iee iee2 = this.t;
            int i = iee2.f;
            int i2 = iee2.i;
            Rect rect4 = iee2.d;
            cb0 cb0 = new cb0(UUID.randomUUID(), i, iee2.a, rect4, e1f.g(e1f.e(rect4), i2), iee2.i, iee2.e, false);
            iee iee3 = (iee) this.v.r(new ac0(this.t, Collections.singletonList(cb0))).get(cb0);
            Objects.requireNonNull(iee3);
            iee3.a(new do9(this, 14, c));
            this.u = iee3.d(c, true);
            iee iee4 = this.t;
            iee4.getClass();
            kq0.e();
            iee4.b();
            c54.p("Consumer can only be linked once.", !iee4.j);
            iee4.j = true;
            this.s = iee4.l;
        } else {
            iee.a(new nn6(28, this));
            see d = this.t.d(c, true);
            this.u = d;
            this.s = d.l;
        }
        if (this.p != null) {
            ax1 c2 = c();
            iee iee5 = this.t;
            if (!(c2 == null || iee5 == null)) {
                kq0.H(new ft0(iee5, h(c2, n(c2)), b(), 5));
            }
            g8b g8b = this.p;
            g8b.getClass();
            see see = this.u;
            see.getClass();
            this.q.execute(new do9(g8b, 15, see));
        }
        bad d2 = bad.d(i8b, vb02.a);
        u40 u40 = d2.b;
        u40.getClass();
        ((mi9) u40.f).j(kz1.k, vb02.c);
        int X = i8b.X();
        if (X != 0) {
            u40.getClass();
            if (X != 0) {
                ((mi9) u40.f).j(o9f.p0, Integer.valueOf(X));
            }
        }
        ce3 ce3 = vb02.d;
        if (ce3 != null) {
            u40.c(ce3);
        }
        if (this.p != null) {
            d2.b(this.s, vb02.b, ((Integer) ((ev6) this.f).f(ev6.E, -1)).intValue());
        }
        cad cad = this.w;
        if (cad != null) {
            cad.b();
        }
        cad cad2 = new cad(new kt6(3, this));
        this.w = cad2;
        d2.f = cad2;
        this.r = d2;
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{d2.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
    }

    public final o9f f(boolean z, r9f r9f) {
        x.getClass();
        i8b i8b = f8b.a;
        ce3 a = r9f.a(i8b.N(), 1);
        if (z) {
            a = ce3.K(a, i8b);
        }
        if (a == null) {
            return null;
        }
        return new i8b(wma.a(((mt6) l(a)).b));
    }

    public final Set j() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    public final n9f l(ce3 ce3) {
        return new mt6(mi9.c(ce3), 2);
    }

    public final String toString() {
        return "Preview:".concat(g());
    }

    public final o9f u(yw1 yw1, n9f n9f) {
        ((mi9) n9f.F()).j(tu6.z, 34);
        return n9f.J();
    }

    public final vb0 x(ce3 ce3) {
        this.r.a(ce3);
        ArrayList arrayList = new ArrayList(1);
        Object obj = new Object[]{this.r.c()}[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        E(Collections.unmodifiableList(arrayList));
        x3c a = this.g.a();
        a.X = ce3;
        return a.c();
    }

    public final vb0 y(vb0 vb0, vb0 vb02) {
        H((i8b) this.f, vb0);
        return vb0;
    }

    public final void z() {
        F();
    }
}
