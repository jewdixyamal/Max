package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: x9f  reason: default package */
public final class x9f extends FrameLayout implements kre {
    public v9f a;
    public final AppCompatImageView b;
    public final AppCompatTextView c;
    public final AppCompatImageView o;

    public x9f(v9f v9f, Context context) {
        super(context);
        this.a = v9f;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(View.generateViewId());
        float f = (float) 36;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        float f2 = (float) 12;
        layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        layoutParams.gravity = 8388627;
        appCompatImageView.setLayoutParams(layoutParams);
        int G = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(G, G, G, G);
        this.b = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(View.generateViewId());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.setMarginEnd(tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density));
        layoutParams2.gravity = 16;
        appCompatTextView.setLayoutParams(layoutParams2);
        i4f.j.b(appCompatTextView, du4.b);
        this.c = appCompatTextView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView2.setId(View.generateViewId());
        float f3 = (float) 28;
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        layoutParams3.setMarginEnd(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        layoutParams3.gravity = 8388629;
        appCompatImageView2.setLayoutParams(layoutParams3);
        this.o = appCompatImageView2;
        setId(View.generateViewId());
        setLayoutParams(new FrameLayout.LayoutParams(-1, tu0.G(((float) 48) * fk4.d().getDisplayMetrics().density)));
        addView(appCompatImageView);
        addView(appCompatTextView);
        addView(appCompatImageView2);
        onThemeChanged(qp4.u0.j(this));
    }

    public final void onThemeChanged(fka fka) {
        setBackground(new RippleDrawable(ColorStateList.valueOf(qp4.u0.j(this).d().a.a.h), new ColorDrawable(fka.b().g), new ColorDrawable(-65536)));
        int ordinal = this.a.ordinal();
        AppCompatImageView appCompatImageView = this.o;
        AppCompatTextView appCompatTextView = this.c;
        AppCompatImageView appCompatImageView2 = this.b;
        if (ordinal == 0 || ordinal == 1) {
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(fka.getIcon().f));
            appCompatTextView.setTextColor(fka.getText().e);
            appCompatImageView.setImageTintList(ColorStateList.valueOf(fka.getIcon().f));
        } else if (ordinal == 2) {
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(fka.getIcon().k));
            appCompatTextView.setTextColor(fka.getText().j);
            appCompatImageView.setImageTintList(ColorStateList.valueOf(fka.getIcon().k));
        } else if (ordinal == 3) {
            appCompatImageView2.setImageTintList(ColorStateList.valueOf(fka.getIcon().f));
            appCompatTextView.setTextColor(fka.getText().e);
            Drawable drawable = appCompatImageView.getDrawable();
            EnhancedVectorDrawable enhancedVectorDrawable = drawable instanceof EnhancedVectorDrawable ? (EnhancedVectorDrawable) drawable : null;
            if (enhancedVectorDrawable != null) {
                c54.Z(enhancedVectorDrawable, "background", fka.b().a.f);
                c54.Z(enhancedVectorDrawable, "plus", fka.getIcon().b);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void setActionMenuIconClickListener(m56 m56) {
        tu0.K(this.o, 300, new v7d(m56, 16, this));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void setOnDragIconTouchListener(a66 a66) {
        this.b.setOnTouchListener(new ei1(5, a66));
    }

    public final void setTitle(CharSequence charSequence) {
        this.c.setText(charSequence);
    }

    public final void setType(v9f v9f) {
        int i;
        this.a = v9f;
        AppCompatImageView appCompatImageView = this.b;
        v9f v9f2 = v9f.o;
        int i2 = 0;
        appCompatImageView.setVisibility(v9f != v9f2 ? 0 : 8);
        int ordinal = v9f.ordinal();
        if (ordinal == 0) {
            i = woc.n1;
        } else if (ordinal == 1) {
            i = gpc.b0;
        } else if (ordinal == 2) {
            i = gpc.h;
        } else if (ordinal == 3) {
            i = 0;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        appCompatImageView.setImageResource(i);
        ((FrameLayout.LayoutParams) this.c.getLayoutParams()).setMarginStart(v9f != v9f2 ? tu0.G(((float) 60) * fk4.d().getDisplayMetrics().density) : tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density));
        AppCompatImageView appCompatImageView2 = this.o;
        if (!(v9f == v9f.b || v9f == v9f2)) {
            i2 = 8;
        }
        appCompatImageView2.setVisibility(i2);
        int ordinal2 = v9f.ordinal();
        pq9 pq9 = qp4.u0;
        if (ordinal2 == 1) {
            int i3 = pq9.j(appCompatImageView2).d().a.a.h;
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(-1);
            appCompatImageView2.setBackground(new RippleDrawable(ColorStateList.valueOf(i3), (Drawable) null, shapeDrawable));
            appCompatImageView2.setImageResource(woc.a);
        } else if (ordinal2 == 3) {
            appCompatImageView2.setImageDrawable(new EnhancedVectorDrawable(appCompatImageView2.getContext(), pub.ic_add_button_28));
        }
        onThemeChanged(pq9.j(this));
    }
}
