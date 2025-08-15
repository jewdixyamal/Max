package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: z47  reason: default package */
public final class z47 extends LinearLayout implements kre {
    public final AppCompatImageView a;
    public final AppCompatTextView b;
    public final RippleDrawable c;

    public z47(Context context) {
        super(context, (AttributeSet) null);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        float f = (float) 24;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        float f2 = (float) 18;
        layoutParams.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        appCompatImageView.setLayoutParams(layoutParams);
        addView(appCompatImageView);
        this.a = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        i4f.j.b(appCompatTextView, du4.b);
        addView(appCompatTextView);
        this.b = appCompatTextView;
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        pq9 pq9 = qp4.u0;
        RippleDrawable rippleDrawable = new RippleDrawable(ColorStateList.valueOf(pq9.j(this).b().g), (Drawable) null, shapeDrawable);
        this.c = rippleDrawable;
        setLayoutParams(new LinearLayout.LayoutParams(-1, tu0.G(((float) 56) * fk4.d().getDisplayMetrics().density)));
        setGravity(16);
        float f3 = (float) 12;
        setPadding(tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        setBackground(rippleDrawable);
        setClipChildren(false);
        setClipToOutline(false);
        onThemeChanged(pq9.j(this));
    }

    public final Drawable getIcon() {
        return this.a.getDrawable();
    }

    public final CharSequence getText() {
        return this.b.getText();
    }

    public final void onThemeChanged(fka fka) {
        this.a.setImageTintList(ColorStateList.valueOf(fka.getText().j));
        this.b.setTextColor(fka.getText().j);
        this.c.setColor(ColorStateList.valueOf(fka.d().a.a.h));
    }

    public final void setIcon(Drawable drawable) {
        this.a.setImageDrawable(drawable);
    }

    public final void setText(CharSequence charSequence) {
        this.b.setText(charSequence);
    }
}
