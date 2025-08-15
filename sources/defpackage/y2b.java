package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* renamed from: y2b  reason: default package */
public final class y2b extends LayerDrawable implements kre {
    public final Context a;
    public final int b;
    public final int c;

    public y2b(Context context) {
        super(new Drawable[0]);
        this.a = context;
        int addLayer = addLayer(new ShapeDrawable(new OvalShape()));
        this.b = addLayer;
        int addLayer2 = addLayer(new RippleDrawable(ColorStateList.valueOf(-16777216), kt3.b(context, woc.L0), (Drawable) null));
        this.c = addLayer2;
        float f = (float) 44;
        setLayerSize(addLayer, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        setLayerGravity(addLayer, 17);
        float f2 = (float) 24;
        setLayerSize(addLayer2, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        setLayerGravity(addLayer2, 17);
        onThemeChanged(qp4.u0.b(context).i());
    }

    public final void a(int i) {
        Context context = this.a;
        setDrawable(this.c, new RippleDrawable(ColorStateList.valueOf(-16777216), kt3.b(context, i), (Drawable) null));
        onThemeChanged(qp4.u0.b(context).i());
    }

    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        setHotspot((float) rect.centerX(), (float) rect.centerY());
    }

    public final void onThemeChanged(fka fka) {
        Paint paint = ((ShapeDrawable) getDrawable(this.b)).getPaint();
        pq9 pq9 = qp4.u0;
        Context context = this.a;
        pq9.b(context).i().a().s().b.getClass();
        paint.setColor(1543503872);
        RippleDrawable rippleDrawable = (RippleDrawable) getDrawable(this.c);
        rippleDrawable.setColor(ColorStateList.valueOf(pq9.b(context).i().d().a.a.c));
        Drawable drawable = rippleDrawable.getDrawable(0);
        pq9.b(context).i().getIcon();
        aq4.g(drawable, -1);
    }
}
