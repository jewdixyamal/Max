package defpackage;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: wq0  reason: default package */
public final class wq0 extends ConstraintLayout implements kre {
    public final TextView G0;
    public final AppCompatImageView H0;
    public final caa I0;
    public int J0 = 2;
    public final vq0 K0;
    public c66 L0;

    public wq0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextView textView = new TextView(context);
        textView.setId(xoc.e);
        textView.setVisibility(0);
        textView.setLayoutParams(new ti3(-2, -2));
        i4f.w.b(textView, du4.b);
        this.G0 = textView;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        appCompatImageView.setId(xoc.d);
        float f = (float) 28;
        appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        appCompatImageView.setVisibility(0);
        this.H0 = appCompatImageView;
        caa caa = new caa(context);
        caa.setId(xoc.b);
        caa.setLayoutParams(new ti3(-2, -2));
        caa.setAppearance(x9a.o);
        caa.setHasBackgroundStroke(true);
        caa.setVisibility(8);
        this.I0 = caa;
        qaa qaa = new qaa(context);
        qaa.setId(xoc.c);
        float f2 = (float) 6;
        ti3 ti3 = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2));
        ti3.setMarginStart(tu0.G(((float) 7) * fk4.d().getDisplayMetrics().density));
        qaa.setLayoutParams(ti3);
        qaa.setAppearance(paa.c);
        qaa.setVisibility(8);
        vq0 vq0 = new vq0(0, this);
        this.K0 = vq0;
        this.L0 = vq0;
        setLayoutParams(new ViewGroup.LayoutParams(0, -1));
        addView(appCompatImageView);
        addView(caa);
        addView(qaa);
        addView(textView);
        dj3 q = fp3.q(this);
        int id = appCompatImageView.getId();
        q.d(id, 3, 0, 3);
        new l2a(q, 3, id, 4).e(tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        q.d(id, 6, 0, 6);
        q.d(id, 7, 0, 7);
        int id2 = textView.getId();
        q.d(id2, 6, 0, 6);
        q.d(id2, 7, 0, 7);
        q.d(id2, 3, appCompatImageView.getId(), 4);
        float f3 = (float) 2;
        new l2a(q, 3, id2, 4).e(tu0.G(fk4.d().getDisplayMetrics().density * f3));
        int id3 = caa.getId();
        q.d(id3, 6, appCompatImageView.getId(), 6);
        new l2a(q, 6, id3, 4).e(tu0.G(((float) 14) * fk4.d().getDisplayMetrics().density));
        q.d(id3, 4, appCompatImageView.getId(), 4);
        new l2a(q, 4, id3, 4).e(tu0.G(((float) 9) * fk4.d().getDisplayMetrics().density));
        int id4 = qaa.getId();
        q.d(id4, 3, appCompatImageView.getId(), 3);
        q.d(id4, 7, appCompatImageView.getId(), 7);
        new l2a(q, 7, id4, 4).e(-tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        q.a(this);
    }

    public final void onThemeChanged(fka fka) {
        w();
    }

    public final void setCounter(int i) {
        int i2 = i > 0 ? 0 : 8;
        caa caa = this.I0;
        caa.setVisibility(i2);
        caa.g(i, true);
        if (i > 0) {
            w();
        }
    }

    public final void setIcon(int i) {
        this.H0.setImageDrawable(s36.n(getContext(), i));
        this.L0 = this.K0;
        w();
    }

    public void setSelected(boolean z) {
        this.J0 = z ? 1 : 2;
        w();
        if (z) {
            Drawable drawable = this.H0.getDrawable();
            Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
            if (animatable != null) {
                animatable.start();
            }
        }
        super.setSelected(z);
    }

    public final void setText(int i) {
        this.G0.setText(i);
    }

    public final void w() {
        int i;
        TextView textView = this.G0;
        int i2 = this.J0;
        pq9 pq9 = qp4.u0;
        fka j = pq9.j(this);
        int s = au1.s(i2);
        boolean z = true;
        if (s == 0) {
            i = j.getText().j;
        } else if (s == 1) {
            i = j.getText().g;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        textView.setTextColor(i);
        c66 c66 = this.L0;
        AppCompatImageView appCompatImageView = this.H0;
        if (this.J0 != 1) {
            z = false;
        }
        c66.invoke(appCompatImageView, Boolean.valueOf(z), pq9.j(this));
        this.I0.f(pq9.j(this));
        invalidate();
    }

    public final void setText(CharSequence charSequence) {
        this.G0.setText(charSequence);
    }
}
