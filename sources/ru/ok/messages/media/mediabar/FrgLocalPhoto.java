package ru.ok.messages.media.mediabar;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.b;
import ru.ok.messages.views.dialogs.ConfirmationDialog;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgLocalPhoto extends FrgLocalMedia implements rq7, qg3 {
    public LocalPhotoView I1;

    public final boolean G0(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            n1();
            q5 g1 = g1();
            if (g1 == null || !this.o1) {
                return true;
            }
            g1.onBackPressed();
            return true;
        } else if (menuItem.getItemId() != xxb.menu_local_photo__clear_edit) {
            return true;
        } else {
            Bundle bundle = new Bundle();
            bundle.putInt("ru.ok.tamtam.extra.CONTENT_RES_ID", jpc.k2);
            bundle.putInt("ru.ok.tamtam.extra.POSITIVE_TEXT_RES_ID", jpc.n2);
            bundle.putInt("ru.ok.tamtam.extra.NEGATIVE_TEXT_RES_ID", jpc.r);
            ConfirmationDialog confirmationDialog = new ConfirmationDialog();
            confirmationDialog.X0(bundle);
            confirmationDialog.b1(0, this);
            confirmationDialog.k1(this.F0, "ru.ok.messages.views.dialogs.ConfirmationDialog");
            return true;
        }
    }

    public final void K0() {
        super.K0();
        this.E1.b();
    }

    public final void N(up7 up7, Uri uri, int i, Uri uri2) {
        xv6 d = xv6.d(j47.N(uri.toString()));
        if (uri2 != null) {
            d.l = new doa(uri2);
        }
        e2b a = s36.a.get();
        a.e = d.a();
        a.l = this.I1.getController();
        p4d p4d = ((y8a) ((ed3) this.p1.b)).j().f;
        if (!oag.t(up7.o) && !awa.b(p4d.e(up7), up7)) {
            xv6 d2 = xv6.d(j47.N(up7.o));
            int i2 = up7.X;
            if (i2 != 0) {
                d2.l = new bwa(i2, 0);
            }
            a.f = d2.a();
        }
        this.I1.setController(a.a());
        u1();
    }

    public final void O() {
        super.O();
        this.I1.getZoomableController().reset();
    }

    public final void O0(View view, Bundle bundle) {
        super.O0(view, bundle);
        this.E1.b();
    }

    public final void R(Bundle bundle) {
        b b0 = b0();
        if (b0 instanceof ActLocalMedias) {
            zj9 zj9 = ((ActLocalMedias) b0).i1;
            zj9.getClass();
            zj9.u0 = new awa((Uri) null, (Uri) null, (nz3) null, (ov4) null, (Uri) null);
            zj9.b2();
            zj9.d2(new uj9(zj9, 4));
            zj9.d2(new uj9(zj9, 0));
        }
    }

    public final void b() {
        if (r1() != null) {
            r1().e();
        }
    }

    public final boolean n1() {
        this.I1.getZoomableController().reset();
        return false;
    }

    public final void u1() {
        MenuItem e;
        b b0 = b0();
        ai3 a = b0 instanceof nwe ? ((nwe) b0).a() : null;
        if (a != null && (e = a.e(xxb.menu_local_photo__clear_edit)) != null) {
            r4d h = ((y8a) ((ed3) this.p1.b)).j().f.h(this.C1);
            if (h != null) {
                e.setVisible(awa.b(h.c, h.a));
            } else {
                e.setVisible(false);
            }
            b b02 = b0();
            if (b02 instanceof im) {
                b02.invalidateOptionsMenu();
            }
        }
    }

    public final void w0(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        menuInflater.inflate(azb.menu_local_photo, menu);
        ngg.g(this.r1, menu, (Integer) null);
        u1();
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(yyb.frg_local_photo, viewGroup, false);
        slideOutLayout.setSlideOutListener(this);
        slideOutLayout.setBackgroundColor(this.r1.m);
        LocalPhotoView localPhotoView = (LocalPhotoView) slideOutLayout.findViewById(xxb.frg_local_photo__iv_photo);
        this.I1 = localPhotoView;
        localPhotoView.setListener(this);
        this.I1.setZoomEnabled(true);
        LocalPhotoView localPhotoView2 = this.I1;
        if (this.D1) {
            localPhotoView2.setTransitionName(this.C1.a());
        }
        return slideOutLayout;
    }
}
