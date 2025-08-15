package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;

/* renamed from: bf1  reason: default package */
public final class bf1 extends hqd {
    public final ey1 F0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public bf1(android.content.Context r3, defpackage.ey1 r4) {
        /*
            r2 = this;
            lk3 r0 = new lk3
            r1 = 0
            r0.<init>(r3, r1)
            r2.<init>(r0)
            r2.F0 = r4
            pq9 r2 = defpackage.qp4.u0
            sba r2 = r2.o(r3)
            fka r2 = r2.c
            r0.setCustomTheme(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bf1.<init>(android.content.Context, ey1):void");
    }

    public final void A(ol7 ol7) {
        String str;
        ve1 ve1 = (ve1) ol7;
        View view = this.a;
        lk3 lk3 = (lk3) view;
        lk3.setId(Long.hashCode(ve1.t0));
        String str2 = ve1.b;
        lk3.setName((CharSequence) str2);
        gg1 gg1 = ve1.a;
        lk3.O(gg1.a, str2, ve1.c);
        Integer num = null;
        Integer num2 = ve1.s0;
        if (num2 != null) {
            str = lk3.getContext().getString(num2.intValue());
        } else {
            str = null;
        }
        lk3.setMessage(str);
        pq9 pq9 = qp4.u0;
        int i = pq9.p(lk3).c.d().a.a.c;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(pq9.p(lk3).c.b().k);
        lk3.setBackground(new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, (Drawable) null));
        E(gg1, ve1.o);
        if (ve1.Y) {
            num = Integer.valueOf(x7a.J);
        }
        ((lk3) view).setIconInfo(num);
        lk3.setCustomTheme(pq9.p(lk3).c);
    }

    public final void E(gg1 gg1, boolean z) {
        View view = this.a;
        ((lk3) view).R(Integer.valueOf(x7a.y0), b7a.o, z6a.X, new x2((Object) this, 14, (Object) gg1));
        if (z) {
            view.setOnClickListener((View.OnClickListener) null);
        } else {
            tu0.K(view, 300, new tb((Object) this, 5, (Object) gg1));
        }
    }
}
