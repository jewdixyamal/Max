package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: xk8  reason: default package */
public final /* synthetic */ class xk8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yk8 b;

    public /* synthetic */ xk8(yk8 yk8, int i) {
        this.a = i;
        this.b = yk8;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.b.b;
                Context context = viewGroup.getContext();
                int i = woc.O1;
                qp4.u0.o(viewGroup.getContext()).c.getIcon();
                return ngg.u(i, -1, context);
            case 1:
                ViewGroup viewGroup2 = (ViewGroup) this.b.b;
                Context context2 = viewGroup2.getContext();
                int i2 = woc.L0;
                qp4.u0.o(viewGroup2.getContext()).c.getIcon();
                return ngg.u(i2, -1, context2);
            case 2:
                ViewGroup viewGroup3 = (ViewGroup) this.b.b;
                Context context3 = viewGroup3.getContext();
                int i3 = woc.H0;
                qp4.u0.o(viewGroup3.getContext()).c.getIcon();
                return ngg.u(i3, -1, context3);
            default:
                yk8 yk8 = this.b;
                ImageView imageView = new ImageView(((ViewGroup) yk8.b).getContext());
                float f = (float) 52;
                imageView.setLayoutParams(new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density), 17));
                pq9 pq9 = qp4.u0;
                int i4 = pq9.p(imageView).c.d().a.a.h;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                pq9.p(imageView).c.b();
                ngg.G(shapeDrawable, -1728053248);
                imageView.setBackground(new RippleDrawable(ColorStateList.valueOf(i4), shapeDrawable, (Drawable) null));
                rh4.p((float) 14, fk4.d().getDisplayMetrics().density, imageView);
                imageView.setImageDrawable((Drawable) ((je7) yk8.g).getValue());
                tu0.K(imageView, 300, new xx5(14, yk8));
                return imageView;
        }
    }
}
