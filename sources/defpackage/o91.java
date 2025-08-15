package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: o91  reason: default package */
public final class o91 extends ConstraintLayout implements bk1 {
    public static final /* synthetic */ bc7[] J0;
    public final AppCompatTextView G0;
    public final AppCompatTextView H0;
    public final yj I0 = new yj(this);

    static {
        oi9 oi9 = new oi9(o91.class, "indicatorState", "getIndicatorState()Lone/me/calls/ui/view/indicator/CallIndicatorView$Companion$CallIndicatorState;");
        nec.a.getClass();
        J0 = new bc7[]{oi9};
    }

    public o91(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new u91(context));
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(y7a.Q);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setGravity(17);
        appCompatTextView.setLayoutParams(new ti3(-2, -2));
        kqe kqe = i4f.n;
        kqe.b(appCompatTextView, du4.b);
        appCompatTextView.setTextColor(getTitleColor());
        this.H0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView2.setId(y7a.R);
        appCompatTextView2.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView2.setMaxLines(1);
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setLayoutParams(new ti3(-2, -1));
        kqe.b(appCompatTextView2, du4.b);
        appCompatTextView2.setTextColor(getTitleColor());
        this.G0 = appCompatTextView2;
        addView(appCompatTextView);
        addView(appCompatTextView2);
        float f = (float) 24;
        float f2 = (float) 0;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        dj3 q = fp3.q(this);
        int id = appCompatTextView2.getId();
        q.d(id, 3, 0, 3);
        q.d(id, 6, 0, 6);
        q.d(id, 7, appCompatTextView.getId(), 6);
        q.g(id).d.l0 = true;
        q.g(id).d.V = 2;
        int id2 = appCompatTextView.getId();
        q.d(id2, 4, appCompatTextView2.getId(), 4);
        q.d(id2, 3, appCompatTextView2.getId(), 3);
        q.d(id2, 6, appCompatTextView2.getId(), 7);
        q.d(id2, 7, 0, 7);
        q.a(this);
    }

    private final int getTitleColor() {
        return qp4.u0.p(this).c.getText().e;
    }

    public final void a(boolean z) {
        u91 background = getBackground();
        if (background != null) {
            t91 t91 = t91.b;
            background.Z.o1(background, u91.s0[0], t91);
        }
        u91 background2 = getBackground();
        if (background2 != null) {
            background2.start();
        }
        this.H0.setTranslationY(0.0f);
        this.G0.setTranslationY(0.0f);
        setAlpha(1.0f);
    }

    public final void b(boolean z) {
        u91 background = getBackground();
        if (background != null) {
            t91 t91 = t91.a;
            background.Z.o1(background, u91.s0[0], t91);
        }
        u91 background2 = getBackground();
        if (background2 != null) {
            background2.stop();
        }
    }

    public final n91 getIndicatorState() {
        bc7 bc7 = J0[0];
        return (n91) this.I0.b;
    }

    public final void h(kl7 kl7, boolean z, long j) {
        float f = 1.0f;
        float f2 = z ? 0.0f : 1.0f;
        if (!z) {
            f = 0.0f;
        }
        kl7.add(ObjectAnimator.ofFloat(this, View.ALPHA, new float[]{f2, f}));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u91 background = getBackground();
        if (background != null) {
            background.start();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u91 background = getBackground();
        if (background != null) {
            background.stop();
        }
    }

    public final void setIndicatorState(n91 n91) {
        this.I0.o1(this, J0[0], n91);
    }

    public final void setTime(CharSequence charSequence) {
        this.H0.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }

    public u91 getBackground() {
        Drawable background = super.getBackground();
        if (background instanceof u91) {
            return (u91) background;
        }
        return null;
    }
}
