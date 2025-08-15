package ru.ok.messages.media.mediabar;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import java.util.WeakHashMap;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgLocalVideo extends FrgLocalMedia implements ik9 {
    public we8 I1;
    public wk9 J1;
    public bk9 K1;
    public SimpleDraweeView L1;
    public y38 M1;

    public final boolean G0(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || !this.o1) {
            return true;
        }
        e1();
        return true;
    }

    public final void H0() {
        super.H0();
        w1();
    }

    public final void K0() {
        super.K0();
        this.E1.c();
    }

    public final void N(up7 up7, Uri uri, int i, Uri uri2) {
        if (uri != null) {
            this.L1.setImageURI(uri);
        }
    }

    public final void T() {
        b56 r1 = r1();
        if (r1 != null) {
            r1.e();
        }
    }

    public final void X() {
        b56 r1 = r1();
        if (r1 != null) {
            r1.c(true, true, false);
        }
    }

    public final void Y(Throwable th) {
        a14.N(0, d0(), zqe.b(d0(), th));
    }

    public final void i1() {
        bk9 bk9 = this.K1;
        if (bk9 != null) {
            kk9 kk9 = (kk9) bk9.b;
            if (kk9 instanceof nse) {
                ((nse) kk9).c();
            }
        }
    }

    public final void t1() {
        if (this.K1 != null) {
            b56 r1 = r1();
            if (r1 == null || !r1.f()) {
                this.K1.k1(false);
            } else {
                this.K1.k1(true);
            }
        }
    }

    public final void u1() {
        if (this.K1 != null) {
            up7 up7 = this.C1;
            if (up7 == null || ((up7 instanceof j00) && oag.t(((j00) up7).u0.s))) {
                hm9.m("ru.ok.messages.media.mediabar.FrgLocalMedia", "bindLocalMedia: Can't bind local media. Skip", new Object[0]);
                ((View) this.J1.c).setVisibility(8);
                return;
            }
            hm9.m("ru.ok.messages.media.mediabar.FrgLocalMedia", "bindLocalMedia: Bind local media success", new Object[0]);
            ((View) this.J1.c).setVisibility(0);
            bk9 bk9 = this.K1;
            up7 up72 = this.C1;
            bk9.getClass();
            hm9.m("bk9", "Bind local media %s", Long.valueOf(up72.b));
            ((bq7) bk9.c).j = false;
            cqc.b(bk9.u0);
            bk9.c2();
            bk9.b2();
            hkf a = bk9.t0.a();
            a.c = true;
            a.e = true;
            a.f = false;
            a.g = false;
            a.n = null;
            a.s = true;
            hkf hkf = new hkf(a);
            bk9.t0 = hkf;
            ((pl9) ((kk9) bk9.b)).d(hkf);
            boolean z = up72 instanceof j00;
            hle hle = bk9.Y;
            if (z) {
                j00 j00 = (j00) up72;
                if (oag.t(j00.u0.s)) {
                    jle jle = (jle) hle;
                    drd i = bk9.s0.c(j00.u0, j00.v0, j00.w0).m(jle.a()).i(jle.b());
                    iq1 iq1 = new iq1(new ak9(bk9, 0), 2, new ak9(bk9, 1));
                    i.k(iq1);
                    bk9.u0 = iq1;
                    return;
                }
            }
            q1a q1a = new q1a(1, new y98((Object) bk9, 15, (Object) up72));
            hle.getClass();
            jle jle2 = (jle) hle;
            drd i2 = q1a.m(jle2.a()).i(jle2.b());
            iq1 iq12 = new iq1(new ak9(bk9, 0), 2, new ak9(bk9, 1));
            i2.k(iq12);
            bk9.u0 = iq12;
        }
    }

    public final void v1() {
        w1();
        View view = (View) this.J1.c;
        if (view != null) {
            view.setVisibility(0);
        }
        this.K1 = new bk9(this.J1, this.I1, d0(), ((y8a) ((ed3) this.p1.b)).j().f, ((y8a) ((ed3) this.p1.b)).q(), this, ((y8a) ((ed3) this.p1.b)).s(), this.M1);
        u1();
    }

    public final void w1() {
        if (this.K1 != null) {
            hm9.m("ru.ok.messages.media.mediabar.FrgLocalMedia", "Release", new Object[0]);
            ((bq7) this.K1.c).n();
            this.K1.l1(false);
            this.K1 = null;
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(yyb.frg_local_video, viewGroup, false);
        slideOutLayout.setSlideOutListener(this);
        slideOutLayout.setBackgroundColor(this.r1.m);
        this.I1 = ((xe8) b0()).b();
        this.M1 = b0() instanceof y38 ? (y38) b0() : null;
        this.J1 = new wk9(d0(), slideOutLayout.findViewById(xxb.frg_local_video__player), ((y8a) ((ed3) this.p1.b)).c(), ((y8a) ((ed3) this.p1.b)).b());
        if (bundle != null || !this.Z.getBoolean("ru.ok.messages.extra.ANIMATED_FRAGMENT")) {
            ((View) this.J1.c).setVisibility(8);
        } else {
            this.K1 = new bk9(this.J1, this.I1, d0(), ((y8a) ((ed3) this.p1.b)).j().f, ((y8a) ((ed3) this.p1.b)).q(), this, ((y8a) ((ed3) this.p1.b)).s(), this.M1);
            u1();
        }
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) slideOutLayout.findViewById(xxb.frg_local_video__iv_video);
        this.L1 = simpleDraweeView;
        nd7.h(simpleDraweeView, new e5(9, this));
        SimpleDraweeView simpleDraweeView2 = this.L1;
        if (this.D1) {
            simpleDraweeView2.setTransitionName(this.C1.a());
        }
        z16 z16 = new z16(3, this);
        WeakHashMap weakHashMap = zmf.a;
        omf.u(slideOutLayout, z16);
        mmf.c(slideOutLayout);
        return slideOutLayout;
    }

    public final void y0() {
        super.y0();
        w1();
    }
}
