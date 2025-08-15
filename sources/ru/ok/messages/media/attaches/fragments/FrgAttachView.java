package ru.ok.messages.media.attaches.fragments;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.views.fragments.FrgSlideOut;
import ru.ok.messages.views.widgets.SlideOutLayout;
import ru.ok.tamtam.nano.b;

public abstract class FrgAttachView extends FrgSlideOut {
    public es8 C1;
    public l20 D1;
    public boolean E1;
    public boolean F1;
    public boolean G1;
    public boolean H1 = false;

    public static Bundle s1(l20 l20, es8 es8, boolean z, boolean z2, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("ru.ok.tamtam.extra.PHOTO_ATTACH", l20 != null ? qw8.toByteArray(b.d(l20)) : null);
        bundle.putParcelable("ru.ok.tamtam.extra.MESSAGE", new xw8(es8));
        bundle.putBoolean("ru.ok.tamtam.extra.EXTRA_ENTER_TRANSITION", z);
        bundle.putBoolean("ru.ok.tamtam.extra.EXTRA_EXIT_TRANSITION", z2);
        bundle.putBoolean("ru.ok.tamtam.extra.START_WITH_LOW_RES", z3);
        return bundle;
    }

    public final void A1(SlideOutLayout slideOutLayout, View view) {
        if (this.E1 || this.F1) {
            view.setTransitionName(this.D1.r);
        }
        if (!this.E1) {
            Y0(true);
            ai3 v1 = v1();
            if (v1 != null) {
                v1.h();
            }
            slideOutLayout.setSlideOutListener(this);
        }
    }

    public final void B1() {
        n46 u1 = r1();
        if (u1 != null) {
            ActAttachesView actAttachesView = (ActAttachesView) u1;
            if (actAttachesView.r1 == 1) {
                actAttachesView.x1.d(2, "ATTACHES_SCREEN_TOGGLE_ORIENTATION");
                actAttachesView.setRequestedOrientation(0);
                return;
            }
            actAttachesView.x1.d(1, "ATTACHES_SCREEN_TOGGLE_ORIENTATION");
            actAttachesView.setRequestedOrientation(1);
        }
    }

    public void C1() {
    }

    public final boolean D() {
        return !this.F1;
    }

    public void M(int i) {
        if (this.F1) {
            androidx.fragment.app.b b0 = b0();
            b0.getClass();
            u7.a(b0);
            return;
        }
        super.M(i);
    }

    public final void O0(View view, Bundle bundle) {
        view.setBackgroundColor(-16777216);
        if (this.H1) {
            this.H1 = false;
            y1(this.W0);
        }
    }

    public final void c1(boolean z) {
        super.c1(z);
        if (this.D1 != null) {
            y1(z);
        } else {
            this.H1 = true;
        }
    }

    public final String f1() {
        return null;
    }

    public final void m1(q5 q5Var) {
        super.m1(q5Var);
        if (!(q5Var instanceof n46)) {
            throw new RuntimeException("FrgAttachView must be attached to activity that implements FrgAttachView.Listener");
        }
    }

    public final e52 t1() {
        return this.q1.f().C(this.C1.a.t0);
    }

    /* renamed from: u1 */
    public final n46 r1() {
        if (g1() != null) {
            return (n46) g1();
        }
        return null;
    }

    public final ai3 v1() {
        androidx.fragment.app.b b0 = b0();
        if (b0 instanceof nwe) {
            return ((nwe) b0).a();
        }
        return null;
    }

    public void w0(Menu menu, MenuInflater menuInflater) {
        MenuItem e;
        boolean z = !this.C1.a.C() && this.C1.a.c != 0 && (!this.D1.f() || this.D1.b.s0 != 0);
        ai3 v1 = v1();
        if (v1 != null && (e = v1.e(xxb.menu_attachments__forward)) != null) {
            e.setVisible(z);
        }
    }

    public final void w1(l6f l6f, f6 f6Var) {
        if (!this.E1) {
            long j = l6f.c;
            ((y8a) ((ed3) this.p1.b)).getClass();
            tp7 m = jyc.a.m();
            m.getClass();
            tp7.b(m, j, true, 2).i(((jle) ((y8a) ((ed3) this.p1.b)).q()).b()).m(((jle) ((y8a) ((ed3) this.p1.b)).q()).a()).k(new iq1(new d74(this, 14, f6Var), 2, new ig5(17)));
        }
    }

    public void x1(boolean z) {
    }

    public abstract void y1(boolean z);

    public final void z1() {
        this.D1 = iz7.a(this.Z.getByteArray("ru.ok.tamtam.extra.PHOTO_ATTACH"));
        this.C1 = ((xw8) this.Z.getParcelable("ru.ok.tamtam.extra.MESSAGE")).a;
        this.E1 = this.Z.getBoolean("ru.ok.tamtam.extra.EXTRA_ENTER_TRANSITION", false);
        this.F1 = this.Z.getBoolean("ru.ok.tamtam.extra.EXTRA_EXIT_TRANSITION", false);
        this.G1 = this.Z.getBoolean("ru.ok.tamtam.extra.START_WITH_LOW_RES", false);
    }
}
