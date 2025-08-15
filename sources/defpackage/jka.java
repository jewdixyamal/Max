package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;

/* renamed from: jka  reason: default package */
public final /* synthetic */ class jka implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ cla c;

    public /* synthetic */ jka(Context context, cla cla, int i) {
        this.a = i;
        this.b = context;
        this.c = cla;
    }

    public final Object invoke() {
        ViewGroup.LayoutParams layoutParams;
        switch (this.a) {
            case 0:
                fmd fmd = new fmd(this.b);
                fmd.setId(xoc.N0);
                fmd.setEllipsize(TextUtils.TruncateAt.END);
                pq9 pq9 = qp4.u0;
                fmd.setTextColor(pq9.j(fmd).getText().e);
                fmd.setSingleLine();
                bkg bkg = new bkg(25);
                yld yld = (yld) bkg.b;
                yld.k = false;
                yld.d = pq9.j(fmd).getText().a;
                bkg.v(pq9.j(fmd).getText().h);
                yld.i = 0.0f;
                bkg.w(900);
                bkg.u();
                bkg.x(tu0.G(((float) 360) * fk4.d().getDisplayMetrics().density));
                yld.q = new LinearInterpolator();
                yld m = bkg.m();
                fmd.b.b(m);
                if (m.j) {
                    fmd.setLayerType(2, fmd.a);
                } else {
                    fmd.setLayerType(0, (Paint) null);
                }
                np8.n(fmd);
                i4f.p.b(fmd, du4.b);
                cla cla = this.c;
                cla.getClass();
                bc7 bc7 = cla.H0[5];
                fmd.a(((Boolean) cla.t0.b).booleanValue());
                cla.addView(fmd);
                return fmd;
            case 1:
                s5a s5a = new s5a(this.b);
                s5a.setId(xoc.P0);
                cla cla2 = this.c;
                if (cla2.getForm() == uka.c) {
                    float f = (float) 40;
                    layoutParams = new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                } else {
                    float f2 = (float) 24;
                    layoutParams = new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                }
                s5a.setLayoutParams(layoutParams);
                s5a.setAvatarShape(j5a.a);
                cla2.addView(s5a);
                return s5a;
            case 2:
                ImageView imageView = new ImageView(this.b);
                imageView.setId(xoc.Q0);
                float f3 = (float) 16;
                imageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density)));
                imageView.setImageDrawable(kt3.b(imageView.getContext(), woc.Y));
                imageView.setImageTintList(ColorStateList.valueOf(qp4.u0.j(imageView).getIcon().f));
                this.c.addView(imageView);
                return imageView;
            default:
                ela ela = new ela(this.b);
                ela.setId(xoc.M0);
                ela.setVisibility(8);
                ela.setAlpha(0.0f);
                ela.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                this.c.addView(ela);
                return ela;
        }
    }
}
