package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: eha  reason: default package */
public final class eha extends FrameLayout implements kre {
    public static final /* synthetic */ int I0 = 0;
    public cha A0 = cha.a;
    public final je7 B0;
    public final je7 C0;
    public final je7 D0;
    public final je7 E0;
    public final je7 F0;
    public final ValueAnimator G0;
    public final ValueAnimator H0;
    public final int a = getResources().getDimensionPixelSize(utb.spacing_size_s);
    public final int b = getResources().getDimensionPixelSize(utb.spacing_size_l);
    public final int c = getResources().getDimensionPixelSize(utb.spacing_size_xl);
    public CharSequence o;
    public String s0 = getResources().getString(a2c.oneme_search_view_default_hint);
    public aha t0 = aha.a;
    public bha u0;
    public boolean v0 = true;
    public boolean w0 = true;
    public boolean x0 = true;
    public boolean y0 = true;
    public boolean z0 = true;

    public eha(Context context) {
        super(context, (AttributeSet) null);
        this.B0 = tu0.r(3, new wga(context, (AttributeSet) null, this, 0));
        this.C0 = tu0.r(3, new wga(context, (AttributeSet) null, this, 1));
        this.D0 = tu0.r(3, new wga(context, (AttributeSet) null, this, 2));
        this.E0 = tu0.r(3, new wga(context, (AttributeSet) null, this, 3));
        this.F0 = tu0.r(3, new wga(context, (AttributeSet) null, this, 4));
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{120}).setDuration(120);
        duration.addListener(new dha(this, 1));
        duration.addUpdateListener(new yga(this, 0));
        this.G0 = duration;
        ValueAnimator duration2 = ValueAnimator.ofInt(new int[]{120}).setDuration(120);
        duration2.addListener(new lf(this, 4, context));
        duration2.addUpdateListener(new yga(this, 1));
        this.H0 = duration2;
    }

    public static void a(Animator animator) {
        ArrayList arrayList = new ArrayList(animator.getListeners());
        animator.removeAllListeners();
        animator.cancel();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            animator.addListener((Animator.AnimatorListener) it.next());
        }
    }

    public final void b() {
        if (this.x0) {
            a(this.G0);
            float f = this.z0 ? 0.0f : 1.0f;
            ValueAnimator valueAnimator = this.H0;
            valueAnimator.setCurrentFraction(f);
            valueAnimator.start();
        }
    }

    public final void c(boolean z) {
        if (this.w0) {
            a(this.H0);
            float f = this.y0 ? 0.0f : 1.0f;
            ValueAnimator valueAnimator = this.G0;
            valueAnimator.setCurrentFraction(f);
            if (z) {
                valueAnimator.addListener(new dha(this, 0));
            }
            addOnLayoutChangeListener(new qq0(8, this));
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -1;
                layoutParams.height = -2;
                setMinimumHeight(tu0.G(((float) 52) * fk4.d().getDisplayMetrics().density));
                setLayoutParams(layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public final void d() {
        c(true);
        bha bha = this.u0;
        if (bha != null) {
            bha.g();
        }
    }

    public final boolean getCollapseWithAnimation() {
        return this.z0;
    }

    public final boolean getExpandWithAnimation() {
        return this.y0;
    }

    public final boolean getShouldShowSearchIcon() {
        return this.v0;
    }

    public final cha getState() {
        return this.A0;
    }

    public final void onThemeChanged(fka fka) {
        je7 je7 = this.D0;
        if (je7.a()) {
            ((AppCompatImageView) je7.getValue()).setImageTintList(ColorStateList.valueOf(fka.getIcon().f));
        }
        je7 je72 = this.B0;
        if (je72.a()) {
            ((AppCompatImageView) je72.getValue()).setImageTintList(ColorStateList.valueOf(fka.getIcon().f));
        }
        je7 je73 = this.F0;
        if (je73.a()) {
            ((AppCompatImageView) je73.getValue()).setImageTintList(ColorStateList.valueOf(fka.getIcon().j));
        }
        je7 je74 = this.C0;
        if (je74.a()) {
            AppCompatEditText appCompatEditText = (AppCompatEditText) je74.getValue();
            Drawable textCursorDrawable = appCompatEditText.getTextCursorDrawable();
            if (textCursorDrawable != null) {
                ngg.G(textCursorDrawable, fka.getText().j);
            }
            appCompatEditText.setBackgroundColor(fka.b().a.g);
            appCompatEditText.setHintTextColor(fka.getText().g);
            appCompatEditText.setTextColor(fka.getText().e);
        }
    }

    public final void setCollapseWithAnimation(boolean z) {
        this.z0 = z;
    }

    public final void setCollapsedStyle(aha aha) {
        this.t0 = aha;
        int ordinal = aha.ordinal();
        je7 je7 = this.D0;
        cha cha = cha.a;
        je7 je72 = this.E0;
        int i = 0;
        if (ordinal == 0) {
            if (je7.a()) {
                ((AppCompatImageView) je7.getValue()).setVisibility(8);
            }
            if (this.A0 == cha) {
                View view = (View) je72.getValue();
                if (!this.v0) {
                    i = 8;
                }
                view.setVisibility(i);
            }
        } else if (ordinal == 1) {
            if (je72.a()) {
                ((ImageView) je72.getValue()).setVisibility(8);
            }
            if (this.A0 == cha) {
                View view2 = (View) je7.getValue();
                if (!this.v0) {
                    i = 8;
                }
                view2.setVisibility(i);
            }
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void setCollapsible(boolean z) {
        this.x0 = z;
    }

    public final void setExpandWithAnimation(boolean z) {
        this.y0 = z;
    }

    public final void setExpandable(boolean z) {
        this.w0 = z;
    }

    public final void setListener(bha bha) {
        this.u0 = bha;
    }

    public final void setSearchHint(String str) {
        this.s0 = str;
        je7 je7 = this.C0;
        if (je7.a()) {
            ((AppCompatEditText) je7.getValue()).setHint(str);
        }
    }

    public final void setSearchText(CharSequence charSequence) {
        this.o = charSequence;
        je7 je7 = this.C0;
        if (je7.a()) {
            AppCompatEditText appCompatEditText = (AppCompatEditText) je7.getValue();
            appCompatEditText.setText(charSequence);
            appCompatEditText.setSelection(appCompatEditText.length());
        }
    }

    public final void setShouldShowSearchIcon(boolean z) {
        this.v0 = z;
    }
}
