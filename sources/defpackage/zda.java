package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: zda  reason: default package */
public final class zda extends ConstraintLayout implements kre {
    public final int G0 = getContext().getResources().getDimensionPixelSize(xfa.e);
    public final int H0 = getContext().getResources().getDimensionPixelSize(xfa.d);
    public final int I0 = getContext().getResources().getDimensionPixelSize(xfa.b);
    public final je7 J0;
    public final je7 K0;
    public final je7 L0;
    public final je7 M0;
    public final LayerDrawable N0;
    public final je7 O0;
    public final View P0;
    public final ms6 Q0;
    public final GradientDrawable R0;
    public final je7 S0;
    public final je7 T0;
    public yda U0;

    public zda(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J0 = tu0.r(3, new wda(context, this, 0));
        this.K0 = tu0.r(3, new wda(context, this, 1));
        this.L0 = tu0.r(3, new xda(context, 0));
        this.M0 = tu0.r(3, new wda(context, this, 2));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
        gradientDrawable.setColors(new int[]{452984831, 16777215}, new float[]{0.0f, 1.0f});
        gradientDrawable.setGradientType(0);
        this.N0 = new LayerDrawable(new Drawable[]{gradientDrawable, kt3.b(getContext(), woc.G)});
        this.O0 = tu0.r(3, new wda(context, this, 3));
        View view = new View(context);
        view.setId(View.generateViewId());
        ti3 ti3 = new ti3(1, 1);
        ti3.i = 0;
        ti3.v = 0;
        ti3.l = 0;
        ti3.t = 0;
        view.setLayoutParams(ti3);
        this.P0 = view;
        ms6 ms6 = new ms6(context, new ww9(11));
        ms6.setId(View.generateViewId());
        float f = (float) 128;
        ti3 ti32 = new ti3(0, tu0.G(fk4.d().getDisplayMetrics().density * f));
        ti32.i = 0;
        ti32.l = 0;
        ms6.setLayoutParams(ti32);
        ms6.setInitialRadius$common_release(fk4.d().getDisplayMetrics().density * 49.0f);
        this.Q0 = ms6;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setOrientation(GradientDrawable.Orientation.BL_TR);
        this.R0 = gradientDrawable2;
        this.S0 = tu0.r(3, new xda(context, 1));
        this.T0 = tu0.r(3, new wda(this, context));
        this.U0 = yda.a;
        setClipToOutline(true);
        setOutlineProvider(new ix3((float) getContext().getResources().getDimensionPixelSize(xfa.a)));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = -1;
            layoutParams.height = tu0.G(fk4.d().getDisplayMetrics().density * f);
            setMaxHeight(tu0.G(f * fk4.d().getDisplayMetrics().density));
        } else {
            layoutParams = new ViewGroup.LayoutParams(-1, tu0.G(fk4.d().getDisplayMetrics().density * f));
            setMaxHeight(tu0.G(f * fk4.d().getDisplayMetrics().density));
        }
        setLayoutParams(layoutParams);
        setBackground(gradientDrawable2);
        ay7.b(this, view, (Integer) null);
        ay7.b(this, ms6, (Integer) null);
        onThemeChanged(qp4.u0.b(context).i());
    }

    private final Drawable getChevronDrawable() {
        return (Drawable) this.T0.getValue();
    }

    private final EnhancedVectorDrawable getCloseBadgeDrawable() {
        return (EnhancedVectorDrawable) this.S0.getValue();
    }

    public static ImageView w(zda zda, Context context) {
        ImageView imageView = new ImageView(context);
        imageView.setId(xoc.Y);
        imageView.setImageDrawable(zda.getCloseBadgeDrawable());
        float f = (float) 24;
        ti3 ti3 = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        ti3.i = 0;
        ti3.v = 0;
        int i = zda.H0;
        ti3.setMarginEnd(i);
        ti3.topMargin = i;
        imageView.setLayoutParams(ti3);
        return imageView;
    }

    public final void A() {
        ms6 ms6 = this.Q0;
        ViewGroup.LayoutParams layoutParams = ms6.getLayoutParams();
        if (layoutParams != null) {
            ti3 ti3 = (ti3) layoutParams;
            if (this.O0.a()) {
                ti3.t = this.P0.getId();
                ti3.setMarginStart(-tu0.G(((float) 54) * fk4.d().getDisplayMetrics().density));
            }
            ms6.setLayoutParams(ti3);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final void onDraw(Canvas canvas) {
        Drawable chevronDrawable = getChevronDrawable();
        if (chevronDrawable != null) {
            int ordinal = this.U0.ordinal();
            if (ordinal == 0) {
                je7 je7 = this.J0;
                Layout layout = ((TextView) je7.getValue()).getLayout();
                if (layout != null) {
                    int G = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                    chevronDrawable.setBounds(0, 0, G, G);
                    int lineCount = layout.getLineCount() - 1;
                    float lineRight = layout.getLineRight(lineCount);
                    int lineTop = layout.getLineTop(lineCount);
                    float x = ((TextView) je7.getValue()).getX();
                    float y = ((TextView) je7.getValue()).getY();
                    float lineBottom = ((float) ((layout.getLineBottom(lineCount) - lineTop) - G)) / 2.0f;
                    int save = canvas.save();
                    canvas.translate(Math.min(lineRight + x, x + ((float) ((TextView) je7.getValue()).getWidth())), lineBottom + y + ((float) lineTop));
                    try {
                        chevronDrawable.draw(canvas);
                    } finally {
                        canvas.restoreToCount(save);
                    }
                }
            } else if (ordinal == 1) {
                je7 je72 = this.K0;
                Layout layout2 = ((TextView) je72.getValue()).getLayout();
                if (layout2 != null) {
                    int G2 = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                    chevronDrawable.setBounds(0, 0, G2, G2);
                    int lineCount2 = layout2.getLineCount() - 1;
                    float lineRight2 = layout2.getLineRight(lineCount2);
                    int lineTop2 = layout2.getLineTop(lineCount2);
                    float x2 = ((TextView) je72.getValue()).getX();
                    float y2 = ((TextView) je72.getValue()).getY();
                    float lineBottom2 = ((float) ((layout2.getLineBottom(lineCount2) - lineTop2) - G2)) / 2.0f;
                    int save2 = canvas.save();
                    canvas.translate(Math.min(lineRight2 + x2, x2 + ((float) ((TextView) je72.getValue()).getWidth())), lineBottom2 + y2 + ((float) lineTop2));
                    try {
                        chevronDrawable.draw(canvas);
                    } finally {
                        canvas.restoreToCount(save2);
                    }
                }
            } else if (ordinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public final void onThemeChanged(fka fka) {
        je7 je7 = this.J0;
        if (je7.a()) {
            fka.getText();
            ((TextView) je7.getValue()).setTextColor(-1);
        }
        je7 je72 = this.K0;
        if (je72.a()) {
            fka.getText();
            ((TextView) je72.getValue()).setTextColor(f8.G(-1, 0.7f));
        }
        EnhancedVectorDrawable closeBadgeDrawable = getCloseBadgeDrawable();
        c54.Z(closeBadgeDrawable, "cross", fka.getIcon().i);
        c54.Z(closeBadgeDrawable, "circle_background", fka.b().a.c);
        Drawable chevronDrawable = getChevronDrawable();
        if (chevronDrawable != null) {
            chevronDrawable.setTint(fka.getIcon().f);
        }
    }

    public final void setBannerClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public final void setChevronAppearance(yda yda) {
        this.U0 = yda;
        invalidate();
    }

    public final void setCloseButtonClickListener(View.OnClickListener onClickListener) {
        ((ImageView) this.M0.getValue()).setOnClickListener(onClickListener);
    }

    public final void setCloseButtonVisibility(boolean z) {
        je7 je7 = this.M0;
        if (z || je7.a()) {
            ImageView imageView = (ImageView) je7.getValue();
            imageView.setVisibility(z ? 0 : 8);
            ay7.b(this, imageView, (Integer) null);
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        A();
    }

    public final void setSubtitle(String str) {
        je7 je7 = this.K0;
        if (str != null && !w9e.C0(str)) {
            TextView textView = (TextView) je7.getValue();
            textView.setText(str);
            textView.setVisibility(0);
            ay7.b(this, textView, (Integer) null);
            y();
        } else if (je7.a()) {
            TextView textView2 = (TextView) je7.getValue();
            textView2.setVisibility(8);
            textView2.setText((CharSequence) null);
            y();
        }
    }

    public final void setTitle(String str) {
        je7 je7 = this.J0;
        if (str != null && !w9e.C0(str)) {
            TextView textView = (TextView) je7.getValue();
            textView.setText(str);
            textView.setVisibility(0);
            ay7.b(this, textView, (Integer) null);
            y();
        } else if (je7.a()) {
            TextView textView2 = (TextView) je7.getValue();
            textView2.setText((CharSequence) null);
            textView2.setVisibility(8);
            y();
        }
    }

    public final void x(Drawable drawable, int i, int i2) {
        je7 je7 = this.O0;
        je7 je72 = this.L0;
        ms6 ms6 = this.Q0;
        if (drawable != null) {
            FrameLayout frameLayout = (FrameLayout) je7.getValue();
            frameLayout.setVisibility(0);
            ImageView imageView = (ImageView) je72.getValue();
            imageView.setVisibility(0);
            imageView.setImageDrawable(drawable);
            ms6.setIcon$common_release(drawable);
            ay7.b(this, frameLayout, (Integer) null);
            ay7.b(this, imageView, (Integer) null);
            y();
        } else if (je72.a()) {
            ((FrameLayout) je7.getValue()).setVisibility(8);
            ImageView imageView2 = (ImageView) je72.getValue();
            imageView2.setVisibility(8);
            imageView2.setImageDrawable((Drawable) null);
            ms6.setIcon$common_release((Drawable) null);
            y();
        }
    }

    public final void y() {
        int i;
        int i2;
        int i3;
        je7 je7 = this.J0;
        boolean a = je7.a();
        je7 je72 = this.K0;
        je7 je73 = this.O0;
        int i4 = -1;
        if (a) {
            View view = (View) je7.getValue();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                ti3 ti3 = (ti3) layoutParams;
                if (br7.H(je73)) {
                    i2 = ((FrameLayout) je73.getValue()).getId();
                } else {
                    ti3.v = 0;
                    i2 = -1;
                }
                ti3.u = i2;
                if (br7.H(je72)) {
                    ti3.topMargin = tu0.G(((float) 26) * fk4.d().getDisplayMetrics().density);
                    i3 = ((TextView) je72.getValue()).getId();
                } else {
                    ti3.topMargin = 0;
                    ti3.l = 0;
                    i3 = -1;
                }
                ti3.k = i3;
                view.setLayoutParams(ti3);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        if (je72.a()) {
            View view2 = (View) je72.getValue();
            ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
            if (layoutParams2 != null) {
                ti3 ti32 = (ti3) layoutParams2;
                if (br7.H(je7)) {
                    ti32.topMargin = this.G0;
                    ti32.bottomMargin = tu0.G(((float) 26) * fk4.d().getDisplayMetrics().density);
                    i = ((TextView) je7.getValue()).getId();
                } else {
                    ti32.topMargin = 0;
                    ti32.bottomMargin = 0;
                    ti32.i = 0;
                    i = -1;
                }
                ti32.j = i;
                if (br7.H(je73)) {
                    i4 = ((FrameLayout) je73.getValue()).getId();
                } else {
                    ti32.v = 0;
                }
                ti32.u = i4;
                view2.setLayoutParams(ti32);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
        }
        A();
    }
}
