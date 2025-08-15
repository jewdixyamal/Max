package defpackage;

import android.widget.TextView;

/* renamed from: nz2  reason: default package */
public final class nz2 extends c8e implements kre {
    public final TextView o;

    public nz2(TextView textView) {
        super(textView);
        this.o = textView;
        textView.setLayoutParams(new pdc(-1, tu0.G(((float) 40) * fk4.d().getDisplayMetrics().density)));
        textView.setGravity(16);
        float f = (float) 12;
        textView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
        onThemeChanged(qp4.u0.j(textView));
    }

    public final void onThemeChanged(fka fka) {
        kqe kqe = i4f.r;
        TextView textView = this.o;
        kqe.b(textView, du4.b);
        textView.setTextColor(fka.getText().i);
        textView.setBackgroundColor(fka.b().k);
    }
}
