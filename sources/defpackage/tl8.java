package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;

/* renamed from: tl8  reason: default package */
public final class tl8 extends LinearLayout implements kre {
    public m56 a;
    public final View b;
    public final LinearLayout c;

    public tl8(Context context) {
        super(context, (AttributeSet) null, 0);
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, tu0.G(((float) 1) * fk4.d().getDisplayMetrics().density)));
        this.b = view;
        LinearLayout linearLayout = new LinearLayout(context);
        float f = (float) 12;
        linearLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), linearLayout.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), linearLayout.getPaddingBottom());
        this.c = linearLayout;
        setOrientation(1);
        addView(view);
        addView(linearLayout);
        view.setBackgroundColor(qp4.u0.j(this).i().b.c);
    }

    public final m56 getOnClickListener() {
        return this.a;
    }

    public final void onThemeChanged(fka fka) {
        pq9 pq9 = qp4.u0;
        qp4.d(pq9.b(getContext()), this);
        this.b.setBackgroundColor(pq9.j(this).i().b.c);
    }

    public final void setOnClickListener(m56 m56) {
        this.a = m56;
    }

    public final void setSelected(jm8 jm8) {
        u1 u1Var = new u1(4, this.c);
        while (u1Var.hasNext()) {
            View view = (View) u1Var.next();
            sl8 sl8 = view instanceof sl8 ? (sl8) view : null;
            if (sl8 != null) {
                sl8.setIsSelected(tpa.f(sl8.getState(), jm8));
            }
        }
    }

    public final void setState(List<? extends jm8> list) {
        LinearLayout linearLayout = this.c;
        linearLayout.removeAllViews();
        for (jm8 jm8 : list) {
            sl8 sl8 = new sl8(getContext());
            sl8.setIsSelected(false);
            sl8.setState(jm8);
            tu0.K(sl8, 300, new vu5(this, 13, jm8));
            linearLayout.addView(sl8);
        }
    }
}
