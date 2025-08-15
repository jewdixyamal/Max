package defpackage;

import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: uf7  reason: default package */
public final class uf7 extends c8e implements kre {
    public final TextView o;

    public uf7(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.o = appCompatTextView;
        pdc pdc = new pdc(-1, tu0.G(((float) 28) * fk4.d().getDisplayMetrics().density));
        pdc.topMargin = (int) (fk4.d().getDisplayMetrics().density * 20.5f);
        appCompatTextView.setLayoutParams(pdc);
        appCompatTextView.setGravity(16);
        float f = (float) 12;
        appCompatTextView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
        onThemeChanged(qp4.u0.j(appCompatTextView));
    }

    public final void onThemeChanged(fka fka) {
        kqe kqe = i4f.o;
        TextView textView = this.o;
        kqe.b(textView, du4.b);
        textView.setTextColor(fka.getText().i);
        textView.setBackgroundColor(fka.b().k);
    }
}
