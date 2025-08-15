package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: qy0  reason: default package */
public final class qy0 extends ConstraintLayout implements kre {
    public final AppCompatImageView G0;
    public final AppCompatTextView H0;

    public qy0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(getBackgroundDrawable());
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(View.generateViewId());
        appCompatImageView.setImageTintList(getIconColor());
        int G = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
        appCompatImageView.setPadding(G, G, G, G);
        this.G0 = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(View.generateViewId());
        i4f.j.b(appCompatTextView, du4.b);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextColor(getTextColor());
        this.H0 = appCompatTextView;
        float f = (float) 24;
        addView(appCompatImageView, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        addView(appCompatTextView, tu0.G(((float) 0) * fk4.d().getDisplayMetrics().density), -2);
        dj3 q = fp3.q(this);
        int id = appCompatImageView.getId();
        q.d(id, 3, appCompatTextView.getId(), 3);
        q.d(id, 6, 0, 6);
        q.d(id, 4, appCompatTextView.getId(), 4);
        int id2 = appCompatTextView.getId();
        q.d(id2, 3, 0, 3);
        q.d(id2, 6, appCompatImageView.getId(), 7);
        au1.p((float) 16, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id2, 4));
        q.d(id2, 7, 0, 7);
        q.d(id2, 4, 0, 4);
        q.g(id2).d.l0 = true;
        q.a(this);
    }

    private final RippleDrawable getBackgroundDrawable() {
        int i = qp4.u0.j(this).d().a.a.h;
        return new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-1));
    }

    private final ColorStateList getIconColor() {
        return ColorStateList.valueOf(qp4.u0.j(this).getIcon().k);
    }

    private final int getTextColor() {
        return qp4.u0.j(this).getText().j;
    }

    public final void onThemeChanged(fka fka) {
        this.G0.setImageTintList(getIconColor());
        this.H0.setTextColor(getTextColor());
        setBackground(getBackgroundDrawable());
    }

    public final void setActionIcon(int i) {
        this.G0.setImageResource(i);
    }

    public final void setActionText(int i) {
        this.H0.setText(i);
    }
}
