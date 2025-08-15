package defpackage;

import android.view.View;
import android.view.animation.Interpolator;

/* renamed from: tg  reason: default package */
public final class tg implements lg {
    public final lg a;
    public final lde b;

    public tg(l84 l84, y8 y8Var) {
        this.a = l84;
        this.b = y8Var;
    }

    public final ph4 a(View view) {
        if (p()) {
            return this.a.a(view);
        }
        view.setVisibility(0);
        return ph4.c;
    }

    public final long b() {
        return this.a.b();
    }

    public final ph4 c(View view) {
        if (p()) {
            return this.a.c(view);
        }
        view.setVisibility(8);
        return ph4.c;
    }

    public final Interpolator d() {
        return this.a.d();
    }

    public final ph4 e(View view) {
        if (p()) {
            return this.a.e(view);
        }
        view.setVisibility(0);
        return ph4.c;
    }

    public final Interpolator f() {
        return this.a.f();
    }

    public final ph4 g(View view) {
        if (p()) {
            return this.a.g(view);
        }
        view.setVisibility(8);
        return ph4.c;
    }

    public final long h() {
        return this.a.h();
    }

    public final ph4 i(View view) {
        if (p()) {
            return this.a.i(view);
        }
        view.setVisibility(0);
        return ph4.c;
    }

    public final ph4 j(View view) {
        if (p()) {
            return this.a.j(view);
        }
        view.setVisibility(0);
        return ph4.c;
    }

    public final Interpolator k() {
        return this.a.k();
    }

    public final Interpolator l() {
        return this.a.l();
    }

    public final ph4 m(View view) {
        if (p()) {
            return this.a.m(view);
        }
        view.setVisibility(8);
        return ph4.c;
    }

    public final Interpolator n() {
        return this.a.n();
    }

    public final ph4 o(View view) {
        if (p()) {
            return this.a.o(view);
        }
        view.setVisibility(8);
        return ph4.c;
    }

    public final boolean p() {
        return ((Boolean) this.b.get()).booleanValue();
    }
}
