package defpackage;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: yk8  reason: default package */
public final class yk8 {
    public int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public Object i;

    public yk8(k33 k33, mbd mbd, uxc uxc, bs9 bs9, mh3 mh3, e6a e6a, o6a o6a) {
        this.b = k33;
        this.c = mbd;
        this.d = uxc;
        this.e = bs9;
        this.f = mh3;
        this.g = e6a;
        this.h = o6a;
    }

    public ImageView a() {
        return (ImageView) ((je7) this.i).getValue();
    }

    public void b(int i2) {
        ImageView a2;
        float f2;
        float f3;
        String str = (String) this.d;
        ir6 ir6 = hm9.m;
        if (ir6 != null && ir6.c()) {
            ir6.d(us7.X, str, "Media viewer. New state media page: ".concat(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "null" : "REFRESH" : "LOADING" : "PAUSE" : "PLAY" : "NONE"), (Throwable) null);
        }
        if (i2 != 1) {
            br7.b((ViewGroup) this.b, a(), -1);
            c(true);
            if (i2 == 4) {
                a2 = a();
                f2 = (float) 4;
                f3 = fk4.d().getDisplayMetrics().density;
            } else {
                a2 = a();
                f2 = (float) 14;
                f3 = fk4.d().getDisplayMetrics().density;
            }
            rh4.p(f2, f3, a2);
        }
        int s = au1.s(i2);
        if (s == 0) {
            c(false);
        } else if (s == 1) {
            a().setImageDrawable((Drawable) ((je7) this.g).getValue());
        } else if (s == 2) {
            a().setImageDrawable((Drawable) ((je7) this.h).getValue());
        } else if (s == 3) {
            a().setImageDrawable((sz6) this.e);
        } else if (s == 4) {
            a().setImageDrawable((Drawable) ((je7) this.f).getValue());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.a = i2;
    }

    public void c(boolean z) {
        a().setVisibility(z ? 0 : 8);
    }

    public yk8(pge pge, gaa gaa) {
        this.b = pge;
        this.c = gaa;
        this.d = yk8.class.getName();
        sz6 sz6 = new sz6();
        sz6.b = new int[]{0, qp4.u0.o(pge.getContext()).b.e().e.a.a};
        this.e = sz6;
        this.f = tu0.r(3, new xk8(this, 0));
        this.g = tu0.r(3, new xk8(this, 1));
        this.h = tu0.r(3, new xk8(this, 2));
        this.a = 1;
        this.i = tu0.r(3, new xk8(this, 3));
    }
}
