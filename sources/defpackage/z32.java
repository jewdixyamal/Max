package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: z32  reason: default package */
public final class z32 extends ConstraintLayout implements kre {
    public final AppCompatTextView G0;
    public final AppCompatTextView H0;
    public final AppCompatImageView I0;

    public z32(Context context) {
        super(context);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(wea.u);
        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        appCompatTextView.setTextAlignment(2);
        appCompatTextView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setText(context.getText(yea.D));
        pq9 pq9 = qp4.u0;
        appCompatTextView.setTextColor(pq9.j(appCompatTextView).getText().g);
        kqe kqe = os2.a;
        i4f.f.b(appCompatTextView, du4.b);
        this.G0 = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView2.setId(wea.v);
        appCompatTextView2.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        appCompatTextView2.setTextAlignment(2);
        appCompatTextView2.setSingleLine(true);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setTextColor(pq9.j(appCompatTextView2).getText().j);
        i4f.g.b(appCompatTextView2, du4.b);
        this.H0 = appCompatTextView2;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(wea.w);
        float f = (float) 24;
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        appCompatImageView.setImageResource(woc.j0);
        float f2 = (float) 2;
        appCompatImageView.setPadding(tu0.F(((double) fk4.d().getDisplayMetrics().density) * 3.5d), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.F(((double) fk4.d().getDisplayMetrics().density) * 3.5d), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        appCompatImageView.setImageTintList(ColorStateList.valueOf(pq9.j(appCompatImageView).getText().j));
        this.I0 = appCompatImageView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        float f3 = (float) 12;
        float f4 = (float) 8;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(fk4.d().getDisplayMetrics().density * f4), tu0.G(f3 * fk4.d().getDisplayMetrics().density), tu0.G(f4 * fk4.d().getDisplayMetrics().density));
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(appCompatImageView);
        dj3 q = fp3.q(this);
        int id = appCompatTextView.getId();
        q.d(id, 6, 0, 6);
        q.d(id, 3, 0, 3);
        q.d(id, 4, appCompatTextView2.getId(), 3);
        float f5 = (float) 1;
        new l2a(q, 4, id, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f5));
        q.d(id, 7, appCompatImageView.getId(), 6);
        l2a l2a = new l2a(q, 7, id, 4);
        float f6 = (float) 16;
        l2a.e(tu0.G(fk4.d().getDisplayMetrics().density * f6));
        int id2 = appCompatTextView2.getId();
        q.d(id2, 6, 0, 6);
        q.d(id2, 3, appCompatTextView.getId(), 4);
        au1.p(f5, fk4.d().getDisplayMetrics().density, new l2a(q, 3, id2, 4));
        q.d(id2, 4, 0, 4);
        q.d(id2, 7, appCompatImageView.getId(), 6);
        new l2a(q, 7, id2, 4).e(tu0.G(f6 * fk4.d().getDisplayMetrics().density));
        int id3 = appCompatImageView.getId();
        q.d(id3, 3, 0, 3);
        q.d(id3, 4, 0, 4);
        q.d(id3, 7, 0, 7);
        q.a(this);
        onThemeChanged(pq9.j(this));
    }

    public final void onThemeChanged(fka fka) {
        pq9 pq9 = qp4.u0;
        this.G0.setTextColor(pq9.j(this).getText().g);
        this.H0.setTextColor(pq9.j(this).getText().j);
        this.I0.setImageTintList(ColorStateList.valueOf(fka.getIcon().k));
    }

    public final void setLink(CharSequence charSequence) {
        this.H0.setText(charSequence);
    }

    public final void setOnShareLinkClickListener(m56 m56) {
        tu0.K(this.I0, 300, new tb((Object) this, m56, 9));
    }
}
