package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: u21  reason: default package */
public final class u21 extends LinearLayout {
    public final int a;
    public final int b;
    public final int c;
    public final int o = tu0.G(((float) 44) * fk4.d().getDisplayMetrics().density);
    public final int s0 = tu0.G(((float) 72) * fk4.d().getDisplayMetrics().density);
    public final int t0 = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
    public final TextView u0;
    public final v21 v0;

    public u21(Context context) {
        super(context, (AttributeSet) null);
        int G = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
        this.a = G;
        int G2 = tu0.G(((float) 28) * fk4.d().getDisplayMetrics().density);
        this.b = G2;
        int G3 = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
        this.c = G3;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        textView.setText(z7.B(context, f0c.call_change_mode_text_hint));
        textView.setGravity(17);
        textView.setTextColor(qp4.u0.p(textView).c.getText().g);
        i4f.q.b(textView, du4.b);
        this.u0 = textView;
        v21 v21 = new v21(context);
        v21.setLayoutParams(new LinearLayout.LayoutParams(G, G2));
        v21.setPadding(G3, G3, G3, G3);
        this.v0 = v21;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setOrientation(1);
        setGravity(17);
        addView(textView);
        addView(v21);
    }
}
