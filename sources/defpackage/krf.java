package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* renamed from: krf  reason: default package */
public final /* synthetic */ class krf implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lrf b;

    public /* synthetic */ krf(lrf lrf, int i) {
        this.a = i;
        this.b = lrf;
    }

    public final Object invoke() {
        pq9 pq9 = qp4.u0;
        lrf lrf = this.b;
        switch (this.a) {
            case 0:
                int i = x7a.u;
                Context context = lrf.a;
                Drawable b2 = kt3.b(context, i);
                b2.setTintList(ColorStateList.valueOf(pq9.o(context).c.getIcon().e));
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setAlpha(40);
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, b2});
                float f = (float) 8;
                layerDrawable.setLayerInset(1, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                return layerDrawable;
            default:
                int i2 = x7a.k0;
                Context context2 = lrf.a;
                Drawable b3 = kt3.b(context2, i2);
                b3.setTintList(ColorStateList.valueOf(pq9.o(context2).c.getIcon().c));
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setAlpha(40);
                LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{shapeDrawable2, b3});
                float f2 = (float) 8;
                layerDrawable2.setLayerInset(1, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
                return layerDrawable2;
        }
    }
}
