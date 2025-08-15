package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.ProgressBar;
import com.facebook.drawee.view.SimpleDraweeView;

/* renamed from: u48  reason: default package */
public final class u48 extends dec implements qq7 {
    public final tg F0;
    public final t48 G0;
    public final o20 H0;
    public final boolean I0;
    public final jic J0;
    public final cq7 K0;
    public r4d L0;
    public final SimpleDraweeView M0;
    public final ProgressBar N0;
    public final View O0;
    public boolean P0;
    public dq7 Q0;

    public u48(View view, tg tgVar, t48 t48, o20 o20, boolean z, jic jic, cq7 cq7) {
        super(view);
        sme sme;
        this.F0 = tgVar;
        this.G0 = t48;
        this.H0 = o20;
        this.I0 = z;
        this.J0 = jic;
        this.K0 = cq7;
        this.M0 = (SimpleDraweeView) view.findViewById(xxb.row_media_bar_selected__drawee);
        ProgressBar progressBar = (ProgressBar) view.findViewById(xxb.row_media_bar_selected__progress_bar);
        this.N0 = progressBar;
        this.O0 = view.findViewById(xxb.row_media_bar_selected__progress_background);
        tu0.K(view, 300, new xx5(11, this));
        if (view.isInEditMode()) {
            sme = ee4.e0;
        } else {
            Context context = view.getContext();
            khe khe = sme.a0;
            sme = fm9.R(context);
        }
        view.setBackgroundColor(sme.m);
        ngg.H(progressBar, lt3.a(view.getContext(), epc.f));
    }

    public final void C(boolean z) {
        int i = 8;
        this.N0.setVisibility(z ? 0 : 8);
        if (z) {
            i = 0;
        }
        this.O0.setVisibility(i);
    }

    public final void N(up7 up7, Uri uri, int i, Uri uri2) {
        up7 up72;
        r4d r4d = this.L0;
        if (r4d != null && (up72 = r4d.a) != null && up7.b == up72.b) {
            SimpleDraweeView simpleDraweeView = this.M0;
            if (uri == null) {
                simpleDraweeView.setController((mq4) null);
                return;
            }
            xv6 d = xv6.d(uri);
            if (uri2 != null) {
                d.l = new doa(uri2);
            }
            d.d = this.J0;
            if (i != 0) {
                d.l = new bwa(i, 0);
            }
            e2b a = s36.a.get();
            a.e = d.a();
            a.l = simpleDraweeView.getController();
            simpleDraweeView.setController(a.a());
        }
    }
}
