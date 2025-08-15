package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: yre  reason: default package */
public final class yre extends ConstraintLayout implements kre {
    public final AppCompatTextView G0;
    public final AppCompatImageView H0;

    public yre(Context context) {
        super(context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(View.generateViewId());
        appCompatTextView.setGravity(8388611);
        i4f.j.b(appCompatTextView, du4.b);
        pq9 pq9 = qp4.u0;
        appCompatTextView.setTextColor(pq9.j(appCompatTextView).getText().e);
        this.G0 = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(View.generateViewId());
        float f = (float) 24;
        appCompatImageView.setLayoutParams(new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9.j(appCompatImageView).getIcon().k));
        appCompatImageView.setImageResource(woc.m);
        this.H0 = appCompatImageView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, tu0.G(((float) 48) * fk4.d().getDisplayMetrics().density)));
        setBackgroundColor(pq9.j(this).b().g);
        addView(appCompatTextView);
        addView(appCompatImageView);
        dj3 q = fp3.q(this);
        int id = appCompatImageView.getId();
        q.d(id, 3, 0, 3);
        q.d(id, 4, 0, 4);
        q.d(id, 6, 0, 6);
        l2a l2a = new l2a(q, 6, id, 4);
        float f2 = (float) 12;
        l2a.e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        int id2 = appCompatTextView.getId();
        q.d(id2, 3, 0, 3);
        q.d(id2, 4, 0, 4);
        q.d(id2, 6, appCompatImageView.getId(), 7);
        new l2a(q, 6, id2, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        q.a(this);
    }

    public final void onThemeChanged(fka fka) {
        setBackgroundColor(fka.b().g);
        this.H0.setImageTintList(ColorStateList.valueOf(fka.getIcon().k));
        this.G0.setTextColor(fka.getText().e);
    }

    public final void setSelected(boolean z) {
        this.H0.setVisibility(z ^ true ? 4 : 0);
    }
}
