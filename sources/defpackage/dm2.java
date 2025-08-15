package defpackage;

import android.widget.TextView;

/* renamed from: dm2  reason: default package */
public final class dm2 extends c8e implements kre {
    public final TextView o;

    public dm2(TextView textView) {
        super(textView);
        this.o = textView;
        textView.setLayoutParams(new pdc(-1, -2));
        float f = (float) 16;
        float f2 = (float) 7;
        textView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        i4f.o.b(textView, du4.b);
        onThemeChanged(qp4.u0.j(textView));
    }

    public final void onThemeChanged(fka fka) {
        xoe text = fka.getText();
        TextView textView = this.o;
        textView.setTextColor(text.i);
        textView.setBackgroundColor(fka.b().j);
    }
}
