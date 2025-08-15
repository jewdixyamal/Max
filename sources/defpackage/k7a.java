package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: k7a  reason: default package */
public final class k7a extends LinearLayout implements kre {
    public static final /* synthetic */ bc7[] t0;
    public final je7 a;
    public final je7 b;
    public final j7a c = new j7a(this, 0);
    public final j7a o = new j7a(this, 1);
    public final j7a s0 = new j7a(this, 2);

    static {
        Class<k7a> cls = k7a.class;
        t0 = new bc7[]{new oi9(cls, "customTheme", "getCustomTheme()Lone/me/sdk/design/OneMeTheme;"), rh4.g(nec.a, cls, "mode", "getMode()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Mode;"), new oi9(cls, "appearance", "getAppearance()Lone/me/sdk/uikit/common/buttontool/OneMeButtonTool$Appearance;")};
    }

    public k7a(Context context) {
        super(context, (AttributeSet) null);
        this.a = tu0.r(3, new hy4(context, 24));
        this.b = tu0.r(3, new hy4(context, 25));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setGravity(17);
        c(this, getAppearance());
        setClipToOutline(true);
        setOutlineProvider(new ix3((float) tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density)));
        setClickable(true);
        setOrientation(1);
        addView(getIconView());
    }

    private final fka getCurrentTheme() {
        fka customTheme = getCustomTheme();
        return customTheme == null ? qp4.u0.j(this) : customTheme;
    }

    private final ImageView getIconView() {
        return (ImageView) this.a.getValue();
    }

    /* access modifiers changed from: private */
    public final AppCompatTextView getTextView() {
        return (AppCompatTextView) this.b.getValue();
    }

    public final void b() {
        invalidate();
        requestLayout();
    }

    public final void c(View view, g7a g7a) {
        RippleDrawable rippleDrawable;
        int ordinal = g7a.ordinal();
        pq9 pq9 = qp4.u0;
        if (ordinal == 0) {
            pq9.j(view);
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(getCurrentTheme().d().a.a.h), new ColorDrawable(getCurrentTheme().b().g), new ColorDrawable(-65536));
        } else if (ordinal == 1) {
            rippleDrawable = new RippleDrawable(ColorStateList.valueOf(pq9.j(view).d().a.a.d), new ColorDrawable(getCurrentTheme().d().a.a.d), new ColorDrawable(-65536));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        view.setBackground(rippleDrawable);
    }

    public final g7a getAppearance() {
        bc7 bc7 = t0[2];
        return (g7a) this.s0.b;
    }

    public final fka getCustomTheme() {
        bc7 bc7 = t0[0];
        return (fka) this.c.b;
    }

    public final h7a getMode() {
        bc7 bc7 = t0[1];
        return (h7a) this.o.b;
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int max = Math.max(getMeasuredHeight(), tu0.G(((float) 60) * fk4.d().getDisplayMetrics().density));
        if (getMeasuredWidth() < max) {
            setMeasuredDimension(max, max);
        } else {
            setMeasuredDimension(getMeasuredWidth(), max);
        }
    }

    public final void onThemeChanged(fka fka) {
        getIconView().setImageTintList(ColorStateList.valueOf(getCurrentTheme().getIcon().f));
        Drawable background = getIconView().getBackground();
        if (background != null) {
            background.setTint(getCurrentTheme().getIcon().f);
        }
        c(this, getAppearance());
        getTextView().setTextColor(getCurrentTheme().getText().e);
    }

    public final void setAppearance(g7a g7a) {
        this.s0.o1(this, t0[2], g7a);
    }

    public final void setCustomTheme(fka fka) {
        this.c.o1(this, t0[0], fka);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setAlpha(z ? 1.0f : 0.48f);
    }

    public final void setIcon(Drawable drawable) {
        if (getIconView().getDrawable() != drawable) {
            if (drawable != null) {
                drawable.setTint(qp4.u0.j(this).getIcon().f);
            }
            getIconView().setImageDrawable(drawable);
            b();
        }
    }

    public final void setMode(h7a h7a) {
        this.o.o1(this, t0[1], h7a);
    }

    public final void setText(CharSequence charSequence) {
        if (getMode() == h7a.b && !tpa.f(getTextView().getText(), charSequence)) {
            getTextView().setText(charSequence);
            if (getTextView().getParent() == null) {
                addView(getTextView());
            }
            b();
        }
    }

    public final void setIcon(int i) {
        setIcon(kt3.b(getContext(), i));
    }

    public final void setText(int i) {
        setText((CharSequence) getContext().getString(i));
    }
}
