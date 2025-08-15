package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: v21  reason: default package */
public final class v21 extends FrameLayout {
    public final Drawable a;
    public final Drawable b;

    public v21(Context context) {
        super(context, (AttributeSet) null);
        je7 r = tu0.r(3, new k11(3));
        Drawable b2 = kt3.b(context, ztb.ic_call_speaker_24);
        pq9 pq9 = qp4.u0;
        pq9.p(this).c.getIcon();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        b2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.a = b2;
        Drawable b3 = kt3.b(context, woc.a0);
        pq9.p(this).c.getIcon();
        b3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.b = b3;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) r.getValue(), (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(pq9.p(this).c.b().k);
        setBackground(shapeDrawable);
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int paddingTop = getPaddingTop();
        int height = ((getHeight() - getPaddingTop()) - paddingTop) / 2;
        Drawable drawable = this.a;
        drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), (getHeight() - paddingTop) - height);
        drawable.draw(canvas);
        Drawable drawable2 = this.b;
        drawable2.setBounds(getPaddingLeft(), getPaddingTop() + height + paddingTop, getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        drawable2.draw(canvas);
    }
}
