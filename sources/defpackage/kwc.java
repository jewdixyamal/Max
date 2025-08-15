package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: kwc  reason: default package */
public final /* synthetic */ class kwc implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ rwc c;

    public /* synthetic */ kwc(Context context, rwc rwc, int i) {
        this.a = i;
        this.b = context;
        this.c = rwc;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                iwc iwc = new iwc(this.b);
                iwc.setImageDrawable(kt3.b(iwc.getContext(), yfa.t));
                tu0.K(iwc, 300, new jwc(this.c, 0));
                ViewGroup.LayoutParams layoutParams = iwc.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density));
                    iwc.setLayoutParams(marginLayoutParams);
                    return iwc;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            case 1:
                iwc iwc2 = new iwc(this.b);
                iwc2.setImageDrawable(kt3.b(iwc2.getContext(), yfa.p));
                tu0.K(iwc2, 300, new jwc(this.c, 1));
                ViewGroup.LayoutParams layoutParams2 = iwc2.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density));
                    iwc2.setLayoutParams(marginLayoutParams2);
                    return iwc2;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            default:
                iwc iwc3 = new iwc(this.b);
                iwc3.setImageDrawable(kt3.b(iwc3.getContext(), yfa.o));
                tu0.K(iwc3, 300, new jwc(this.c, 2));
                ViewGroup.LayoutParams layoutParams3 = iwc3.getLayoutParams();
                if (layoutParams3 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams3.setMargins(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density));
                    iwc3.setLayoutParams(marginLayoutParams3);
                    return iwc3;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }
}
