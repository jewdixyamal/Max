package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: xc2  reason: default package */
public final class xc2 extends ConstraintLayout implements kre {
    public final je7 G0;
    public final je7 H0;
    public final s5a I0;
    public final AppCompatTextView J0;
    public final AppCompatImageView K0;
    public final ImageView L0;

    public xc2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G0 = tu0.r(3, new wc2(context, this, 0));
        je7 r = tu0.r(3, new wc2(context, this, 1));
        this.H0 = r;
        s5a s5a = new s5a(context);
        s5a.setId(wea.F);
        float f = (float) 40;
        s5a.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        s5a.setAvatarShape(j5a.a);
        addView(s5a);
        this.I0 = s5a;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setId(wea.L);
        appCompatTextView.setLayoutParams(new ViewGroup.LayoutParams(0, -2));
        appCompatTextView.setTextAlignment(2);
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        kqe kqe = os2.a;
        i4f.n.b(appCompatTextView, du4.b);
        addView(appCompatTextView);
        this.J0 = appCompatTextView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(wea.H);
        float f2 = (float) 24;
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2)));
        int i = gpc.u;
        pq9 pq9 = qp4.u0;
        bs6 icon = pq9.j(appCompatImageView).getIcon();
        Drawable b = kt3.b(appCompatImageView.getContext(), i);
        ngg.G(b, icon.f);
        appCompatImageView.setImageDrawable(b);
        addView(appCompatImageView);
        this.K0 = appCompatImageView;
        ImageView imageView = new ImageView(context);
        imageView.setId(wea.J);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density)));
        imageView.setImageDrawable(kt3.b(imageView.getContext(), woc.t0));
        addView(imageView);
        this.L0 = imageView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, tu0.G(((float) 48) * fk4.d().getDisplayMetrics().density)));
        w();
        if (r.a()) {
            nfa nfa = (nfa) r.getValue();
            int G = tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density);
            ViewGroup.LayoutParams layoutParams = nfa.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = G;
                layoutParams.height = G;
                nfa.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        requestLayout();
        onThemeChanged(pq9.j(this));
    }

    public final void onThemeChanged(fka fka) {
        int i = fka.d().a.a.d;
        setBackground(new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, new ColorDrawable(-65536)));
        je7 je7 = this.G0;
        if (je7.a()) {
            ((AppCompatTextView) je7.getValue()).setTextColor(fka.getText().e);
        }
        this.J0.setTextColor(fka.getText().g);
        this.K0.setImageTintList(ColorStateList.valueOf(fka.getIcon().f));
        this.L0.setImageTintList(ColorStateList.valueOf(fka.getIcon().f));
    }

    public final void setChatTitle(String str) {
        this.J0.setText(str);
        w();
    }

    public final void setLink(String str) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.G0.getValue();
        appCompatTextView.setText(str);
        appCompatTextView.setVisibility(0);
        je7 je7 = this.H0;
        if (je7.a()) {
            ((nfa) je7.getValue()).setVisibility(8);
        }
        w();
    }

    public final void setLoading(boolean z) {
        je7 je7 = this.H0;
        je7 je72 = this.G0;
        if (z) {
            if (je72.a()) {
                ((AppCompatTextView) je72.getValue()).setVisibility(8);
            }
            ((nfa) je7.getValue()).setVisibility(0);
        } else {
            if (je72.a()) {
                ((AppCompatTextView) je72.getValue()).setVisibility(0);
            }
            ((nfa) je7.getValue()).setVisibility(8);
        }
        w();
    }

    public final void setOnMoreActionsClickListener(k56 k56) {
        tu0.K(this.L0, 300, new m6(3, k56));
    }

    public final void w() {
        l2a l2a;
        float f;
        dj3 q = fp3.q(this);
        s5a s5a = this.I0;
        int id = s5a.getId();
        q.d(id, 6, 0, 6);
        float f2 = (float) 12;
        au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id, 4));
        q.d(id, 3, 0, 3);
        q.d(id, 4, 0, 4);
        je7 je7 = this.G0;
        boolean a = je7.a();
        AppCompatImageView appCompatImageView = this.K0;
        if (a) {
            int id2 = ((AppCompatTextView) je7.getValue()).getId();
            q.d(id2, 6, s5a.getId(), 7);
            new l2a(q, 6, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
            q.d(id2, 3, s5a.getId(), 3);
            q.d(id2, 7, appCompatImageView.getId(), 6);
            new l2a(q, 7, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
            ((AppCompatTextView) je7.getValue()).getId();
        } else {
            je7 je72 = this.H0;
            int id3 = ((nfa) je72.getValue()).getId();
            q.d(id3, 6, s5a.getId(), 7);
            au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 6, id3, 4));
            q.d(id3, 3, 0, 3);
            new l2a(q, 3, id3, 4).e(tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density));
            ((nfa) je72.getValue()).getId();
        }
        int id4 = this.J0.getId();
        q.d(id4, 6, s5a.getId(), 7);
        new l2a(q, 6, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        q.d(id4, 4, s5a.getId(), 4);
        q.d(id4, 7, appCompatImageView.getId(), 6);
        new l2a(q, 7, id4, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f2));
        int id5 = appCompatImageView.getId();
        ImageView imageView = this.L0;
        if (imageView.getVisibility() == 0) {
            q.d(id5, 7, imageView.getId(), 6);
            l2a = new l2a(q, 7, id5, 4);
            f = fk4.d().getDisplayMetrics().density;
        } else {
            q.d(id5, 7, 0, 7);
            l2a = new l2a(q, 7, id5, 4);
            f = fk4.d().getDisplayMetrics().density;
        }
        au1.p(f2, f, l2a);
        q.d(id5, 3, 0, 3);
        q.d(id5, 4, 0, 4);
        if (imageView.getVisibility() == 0) {
            int id6 = imageView.getId();
            q.d(id6, 7, 0, 7);
            au1.p(f2, fk4.d().getDisplayMetrics().density, new l2a(q, 7, id6, 4));
            q.d(id6, 3, 0, 3);
            q.d(id6, 4, 0, 4);
        }
        q.a(this);
    }
}
