package defpackage;

import android.widget.FrameLayout;
import android.widget.TextView;

/* renamed from: r7c  reason: default package */
public final class r7c extends c8e implements kre {
    public final TextView o;

    public r7c(FrameLayout frameLayout) {
        super(frameLayout);
        TextView textView = (TextView) frameLayout.getChildAt(0);
        this.o = textView;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        int G = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
        layoutParams.topMargin = G;
        layoutParams.bottomMargin = G;
        textView.setLayoutParams(layoutParams);
        textView.setTextAlignment(4);
        i4f.o.b(textView, du4.b);
        int G2 = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
        int G3 = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        textView.setPadding(G3, G2, G3, G2);
        onThemeChanged(qp4.u0.j(textView));
    }

    public final void onThemeChanged(fka fka) {
        this.o.setTextColor(fka.getText().i);
        this.a.setBackgroundColor(fka.b().g);
    }
}
