package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: m6g  reason: default package */
public class m6g extends o6g {
    public final WindowInsets.Builder c;

    public m6g() {
        this.c = new WindowInsets.Builder();
    }

    public x6g b() {
        a();
        x6g f = x6g.f((View) null, this.c.build());
        f.a.p(this.b);
        return f;
    }

    public void d(v27 v27) {
        this.c.setMandatorySystemGestureInsets(v27.d());
    }

    public void e(v27 v27) {
        this.c.setSystemGestureInsets(v27.d());
    }

    public void f(v27 v27) {
        this.c.setSystemWindowInsets(v27.d());
    }

    public void g(v27 v27) {
        this.c.setTappableElementInsets(v27.d());
    }

    public void i(v27 v27) {
        this.c.setStableInsets(v27.d());
    }

    public m6g(x6g x6g) {
        super(x6g);
        WindowInsets.Builder builder;
        WindowInsets e = x6g.e();
        if (e != null) {
            builder = new WindowInsets.Builder(e);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.c = builder;
    }
}
