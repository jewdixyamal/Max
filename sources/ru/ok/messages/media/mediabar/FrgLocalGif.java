package ru.ok.messages.media.mediabar;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import ru.ok.messages.views.widgets.SlideOutLayout;

public class FrgLocalGif extends FrgLocalMedia implements rq7 {
    public SimpleDraweeView I1;

    public final boolean G0(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332 || !this.o1) {
            return true;
        }
        e1();
        return true;
    }

    public final void K0() {
        super.K0();
        this.E1.b();
    }

    public final void N(up7 up7, Uri uri, int i, Uri uri2) {
        e2b a = s36.a.get();
        a.c(j47.N(uri.toString()));
        a.l = this.I1.getController();
        a.j = true;
        if (!oag.t(up7.o)) {
            a.f = wv6.a(j47.N(up7.o));
        }
        this.I1.setController(a.a());
    }

    public final void b() {
        if (r1() != null) {
            r1().e();
        }
    }

    public final View x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        SlideOutLayout slideOutLayout = (SlideOutLayout) layoutInflater.inflate(yyb.frg_local_gif, viewGroup, false);
        slideOutLayout.setSlideOutListener(this);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) slideOutLayout.findViewById(xxb.frg_local_gif__drawee);
        this.I1 = simpleDraweeView;
        ((la6) simpleDraweeView.getHierarchy()).i(new r20(d0(), -1), 3);
        tu0.K(this.I1, 300, new xx5(2, this));
        SimpleDraweeView simpleDraweeView2 = this.I1;
        if (this.D1) {
            simpleDraweeView2.setTransitionName(this.C1.a());
        }
        return slideOutLayout;
    }
}
