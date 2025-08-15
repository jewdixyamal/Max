package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: asc  reason: default package */
public final class asc extends ni0 {
    public final s5a a;
    public final TextView b;
    public final TextView c;

    public asc(Context context) {
        super(context, (AttributeSet) null, 0);
        float f = (float) 24;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        s5a s5a = new s5a(context);
        float f2 = (float) 72;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        s5a.setLayoutParams(layoutParams);
        this.a = s5a;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        i4f.k.b(textView, du4.b);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.topMargin = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams3);
        i4f.s.b(textView2, du4.b);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        this.c = textView2;
        addView(s5a);
        addView(textView);
        addView(textView2);
        onThemeChanged(qp4.u0.b(context).i());
    }

    public final void onThemeChanged(fka fka) {
        super.onThemeChanged(fka);
        this.b.setTextColor(fka.getText().e);
        this.c.setTextColor(fka.getText().h);
    }

    public final void setState(zz4 zz4) {
        this.a.setAvatarUrl(zz4.a);
        this.b.setText(zz4.b.d(this));
        this.c.setText(zz4.c.d(this));
    }
}
