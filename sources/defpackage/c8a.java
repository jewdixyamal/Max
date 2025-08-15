package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: c8a  reason: default package */
public final class c8a extends LinearLayout implements kre, mkc {
    public final ShapeDrawable a = new ShapeDrawable();
    public final AppCompatTextView b;
    public final AppCompatTextView c;

    public c8a(Context context) {
        super(context, (AttributeSet) null);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        i4f.j.b(appCompatTextView, du4.b);
        addView(appCompatTextView);
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
        i4f.n.b(appCompatTextView2, du4.b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(layoutParams.leftMargin, tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density), layoutParams.rightMargin, layoutParams.bottomMargin);
        appCompatTextView2.setLayoutParams(layoutParams);
        addView(appCompatTextView2, appCompatTextView2.getLayoutParams());
        this.c = appCompatTextView2;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setMinimumHeight(tu0.G(((float) 64) * fk4.d().getDisplayMetrics().density));
        setOrientation(1);
        setGravity(16);
        float f = (float) 12;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), getPaddingBottom());
        onThemeChanged(qp4.u0.j(this));
    }

    public final CharSequence getTextSubtitle() {
        return this.c.getText();
    }

    public final CharSequence getTextTitle() {
        return this.b.getText();
    }

    public final void onThemeChanged(fka fka) {
        this.b.setTextColor(fka.getText().e);
        this.c.setTextColor(fka.getText().g);
        setBackground(new RippleDrawable(ColorStateList.valueOf(fka.d().a.a.h), (Drawable) null, this.a));
    }

    public void setRippleMask(Shape shape) {
        this.a.setShape(shape);
    }

    public final void setTextSubtitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void setTextTitle(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
