package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;

/* renamed from: k62  reason: default package */
public final /* synthetic */ class k62 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ m62 b;

    public /* synthetic */ k62(m62 m62, int i) {
        this.a = i;
        this.b = m62;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                int i = woc.k;
                m62 m62 = this.b;
                Drawable b2 = kt3.b(m62.getContext(), i);
                ngg.G(b2, qp4.u0.j(m62).getIcon().k);
                return b2;
            case 1:
                int i2 = woc.i;
                m62 m622 = this.b;
                Drawable b3 = kt3.b(m622.getContext(), i2);
                ngg.G(b3, qp4.u0.j(m622).getIcon().k);
                return b3;
            default:
                return new RippleDrawable(ColorStateList.valueOf(qp4.u0.j(this.b).d().a.a.h), (Drawable) null, new ColorDrawable(-1));
        }
    }
}
