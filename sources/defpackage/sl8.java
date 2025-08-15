package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: sl8  reason: default package */
public final class sl8 extends LinearLayout implements kre {
    public boolean a;
    public jm8 b;
    public final AppCompatImageView c;
    public final AppCompatTextView o;

    public sl8(Context context) {
        super(context, (AttributeSet) null, 0);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        float f = (float) 4;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f);
        appCompatImageView.setPadding(G, G, G, G);
        appCompatImageView.setLayoutParams(layoutParams);
        this.c = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView.setMaxWidth(tu0.G(((float) 72) * fk4.d().getDisplayMetrics().density));
        i4f.s.b(appCompatTextView, du4.b);
        this.o = appCompatTextView;
        setId(t8a.z);
        setOrientation(1);
        setGravity(1);
        setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        float f2 = (float) 6;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density), getPaddingBottom());
        addView(appCompatImageView);
        addView(appCompatTextView);
        a();
    }

    public final void a() {
        boolean z = this.a;
        AppCompatImageView appCompatImageView = this.c;
        pq9 pq9 = qp4.u0;
        AppCompatTextView appCompatTextView = this.o;
        if (z) {
            appCompatTextView.setTextColor(pq9.j(this).getText().e);
            appCompatImageView.setColorFilter(pq9.j(this).getIcon().f);
            return;
        }
        appCompatTextView.setTextColor(pq9.j(this).getText().g);
        appCompatImageView.setColorFilter(pq9.j(this).getIcon().j);
    }

    public final jm8 getState() {
        return this.b;
    }

    public final void onThemeChanged(fka fka) {
        a();
    }

    public final void setIsSelected(boolean z) {
        this.a = z;
        a();
    }

    public final void setState(jm8 jm8) {
        int i;
        int i2;
        this.b = jm8;
        AppCompatTextView appCompatTextView = this.o;
        gm8 gm8 = gm8.a;
        boolean f = tpa.f(jm8, gm8);
        fm8 fm8 = fm8.a;
        em8 em8 = em8.a;
        hm8 hm8 = hm8.a;
        im8 im8 = im8.a;
        if (f) {
            i = u8a.I;
        } else if (tpa.f(jm8, im8)) {
            i = u8a.K;
        } else if (tpa.f(jm8, hm8)) {
            i = u8a.T;
        } else if (tpa.f(jm8, em8)) {
            i = u8a.C;
        } else if (tpa.f(jm8, fm8)) {
            i = u8a.D;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        appCompatTextView.setText(i);
        AppCompatImageView appCompatImageView = this.c;
        if (tpa.f(jm8, gm8)) {
            i2 = s8a.m;
        } else if (tpa.f(jm8, im8)) {
            i2 = s8a.o;
        } else if (tpa.f(jm8, hm8)) {
            i2 = s8a.b;
        } else if (tpa.f(jm8, em8)) {
            i2 = s8a.n;
        } else if (tpa.f(jm8, fm8)) {
            i2 = s8a.a;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        appCompatImageView.setImageResource(i2);
    }
}
