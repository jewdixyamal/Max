package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: k5f  reason: default package */
public final class k5f extends LinearLayout {
    public final i4a a;
    public final i4a b;

    public k5f(Context context) {
        super(context);
        i4a i4a = new i4a(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = (float) 12;
        float f2 = (float) 8;
        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f2));
        layoutParams.weight = 1.0f;
        i4a.setLayoutParams(layoutParams);
        i4a.setAppearance(h4a.a);
        i4a.setText(oea.f);
        this.a = i4a;
        i4a i4a2 = new i4a(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        layoutParams2.weight = 1.0f;
        i4a2.setLayoutParams(layoutParams2);
        i4a2.setAppearance(h4a.b);
        i4a2.setText(oea.g);
        this.b = i4a2;
        setOrientation(0);
        addView(i4a);
        addView(i4a2);
    }

    public final void setOnAddContactClickListener(View.OnClickListener onClickListener) {
        tu0.K(this.a, 300, onClickListener);
    }

    public final void setOnBlockContactClickListener(View.OnClickListener onClickListener) {
        tu0.K(this.b, 300, onClickListener);
    }
}
