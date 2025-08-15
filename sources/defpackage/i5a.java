package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* renamed from: i5a  reason: default package */
public final /* synthetic */ class i5a implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ s5a b;

    public /* synthetic */ i5a(s5a s5a, int i) {
        this.a = i;
        this.b = s5a;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                GradientDrawable gradientDrawable = new GradientDrawable();
                int G = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
                pq9 pq9 = qp4.u0;
                s5a s5a = this.b;
                gradientDrawable.setStroke(G, pq9.j(s5a).b().k);
                gradientDrawable.setColor(pq9.j(s5a).getIcon().k);
                gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 32.0f);
                return gradientDrawable;
            case 1:
                int i = jub.call_fill_16;
                pq9 pq92 = qp4.u0;
                s5a s5a2 = this.b;
                pq92.j(s5a2).getIcon();
                Drawable b2 = kt3.b(s5a2.getContext(), i);
                ngg.G(b2, -1);
                return b2;
            default:
                return s5a.a(this.b);
        }
    }
}
