package defpackage;

import android.view.Surface;
import android.view.View;
import java.util.Set;

/* renamed from: qj9  reason: default package */
public final class qj9 extends u2 implements ol9, jk9, slf, ve8, ue8 {
    public final ik9 X;
    public wc6 Y;
    public final we8 c;
    public final zi5 o;

    public qj9(fl9 fl9, we8 we8, zi5 zi5, ik9 ik9) {
        super(0, (Object) fl9);
        this.c = we8;
        this.o = zi5;
        this.X = ik9;
        fl9.r(this);
        ((bq7) we8).e = this;
    }

    public final void D1(Throwable th) {
        ik9 ik9 = this.X;
        if (ik9 != null) {
            ik9.Y(th);
        }
    }

    public final void G(Surface surface) {
        ((bq7) this.c).r(surface);
    }

    public final int M0() {
        return ((bq7) this.c).h();
    }

    public final void P(int i, int i2, int i3) {
        ((pl9) ((kk9) this.b)).a(i, i2);
    }

    public final int R() {
        return ((bq7) this.c).j();
    }

    public final void T() {
        ik9 ik9 = this.X;
        if (ik9 != null) {
            ik9.T();
        }
    }

    public final void W() {
        ik9 ik9 = this.X;
        if (ik9 != null) {
            ik9.W();
        }
    }

    public final void W0() {
        hm9.k("qj9", "onMediaPlayerControllerDetach");
    }

    public final boolean b() {
        return ((bq7) this.c).k();
    }

    public final long c() {
        return ((bq7) this.c).g();
    }

    public final boolean c0() {
        return false;
    }

    public final void c1() {
        ik9 ik9;
        if (this.Y != null && (ik9 = this.X) != null) {
            ik9.X();
        }
    }

    public final void f1() {
    }

    public final int i1() {
        return ((bq7) this.c).i();
    }

    public final int j() {
        fef fef = ((bq7) this.c).f;
        if (fef == null) {
            return 0;
        }
        return fef.j();
    }

    public final long k() {
        return ((bq7) this.c).f();
    }

    public final void l1(boolean z) {
        bq7 bq7 = (bq7) this.c;
        if (bq7.g == this) {
            bq7.u();
            bq7.e = null;
            bq7.r((Surface) null);
            bq7.g = null;
            this.Y = null;
            pl9 pl9 = (pl9) ((kk9) this.b);
            ((Set) ((v2) pl9).a).remove(this);
            pl9.release();
        }
    }

    public final View u1() {
        View view = (View) ((v2) ((pl9) ((kk9) this.b))).c;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Mvc view root is null");
    }
}
