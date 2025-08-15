package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: td2  reason: default package */
public final class td2 extends ConstraintLayout implements kre {
    public final TextView G0;
    public final TextView H0;
    public final GradientDrawable I0;
    public final AppCompatImageView J0;
    public o50 K0;
    public x77 L0;
    public Long M0;

    public td2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        ti3 ti3 = new ti3(-1, -2);
        float f = (float) 4;
        ti3.bottomMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        textView.setLayoutParams(ti3);
        i4f.j.b(textView, du4.b);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        this.G0 = textView;
        TextView textView2 = new TextView(context);
        ti3 ti32 = new ti3(-1, -2);
        ti32.bottomMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(ti32);
        i4f.n.b(textView2, du4.b);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        textView2.setVisibility(8);
        this.H0 = textView2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 48.0f);
        pq9 pq9 = qp4.u0;
        gradientDrawable.setColor(ColorStateList.valueOf(pq9.j(this).getIcon().k));
        this.I0 = gradientDrawable;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(wea.j0);
        float f2 = (float) 40;
        appCompatImageView.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
        appCompatImageView.setBackground(gradientDrawable);
        pq9.j(appCompatImageView).getClass();
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-1));
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        this.J0 = appCompatImageView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setId(wea.i0);
        linearLayout.setLayoutParams(new ti3(0, -2));
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        setLayoutParams(new ti3(-1, -2));
        float f3 = (float) 12;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f3);
        setPadding(G, G, G, G);
        int i = pq9.j(this).d().a.a.h;
        setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1)));
        addView(appCompatImageView);
        addView(linearLayout);
        dj3 q = fp3.q(this);
        int id = appCompatImageView.getId();
        q.d(id, 6, 0, 6);
        q.d(id, 3, 0, 3);
        q.d(id, 4, 0, 4);
        int id2 = linearLayout.getId();
        q.d(id2, 3, 0, 3);
        q.d(id2, 4, 0, 4);
        q.d(id2, 7, 0, 7);
        q.d(id2, 6, appCompatImageView.getId(), 7);
        new l2a(q, 6, id2, 4).e(tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        q.a(this);
        onThemeChanged(pq9.j(this));
    }

    private final void setButtonState(l30 l30) {
        boolean f = tpa.f(l30, sp3.a);
        AppCompatImageView appCompatImageView = this.J0;
        if (f) {
            appCompatImageView.setImageDrawable(kt3.b(getContext(), woc.c2));
        } else if (tpa.f(l30, dp3.a) || tpa.f(l30, o84.c) || tpa.f(l30, vu4.a)) {
            appCompatImageView.setImageDrawable(kt3.b(getContext(), woc.I1));
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    private final void setState(j0e j0e) {
        o50 o50;
        this.K0 = new o50(this, 1, j0e);
        if (isAttachedToWindow() && (o50 = this.K0) != null) {
            o50.onViewAttachedToWindow(this);
        }
        addOnAttachStateChangeListener(this.K0);
    }

    private final void setSubtitle(CharSequence charSequence) {
        TextView textView = this.H0;
        int i = 0;
        if (!(true ^ (charSequence == null || charSequence.length() == 0))) {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    private final void setTitle(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }

    public static final void w(td2 td2, v50 v50) {
        td2.getClass();
        l30 l30 = v50 != null ? v50.c : null;
        if (l30 == null || !tpa.f(v50.a, td2.M0)) {
            td2.setButtonState(o84.c);
        } else {
            td2.setButtonState(l30);
        }
    }

    public final void onThemeChanged(fka fka) {
        this.G0.setTextColor(fka.getText().e);
        this.H0.setTextColor(fka.getText().g);
        this.I0.setColor(ColorStateList.valueOf(fka.getIcon().k));
        this.J0.setImageTintList(ColorStateList.valueOf(-1));
    }

    public final void setupAudio(qm8 qm8) {
        this.M0 = Long.valueOf(qm8.b);
        setTitle(qm8.Y);
        setSubtitle(qm8.Z);
        setState(qm8.t0);
    }
}
