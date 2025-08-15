package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: v8a  reason: default package */
public final /* synthetic */ class v8a implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ x8a c;

    public /* synthetic */ v8a(x8a x8a, Context context) {
        this.a = 4;
        this.c = x8a;
        this.b = context;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                TextView textView = new TextView(this.b);
                textView.setId(xoc.q);
                int i = 0;
                ti3 ti3 = new ti3(0, -2);
                ti3.t = 0;
                ti3.i = 0;
                x8a x8a = this.c;
                je7 je7 = x8a.L0;
                ti3.u = je7.a() ? ((ImageView) je7.getValue()).getId() : 0;
                je7 je72 = x8a.K0;
                if (je72.a()) {
                    i = ((TextView) je72.getValue()).getId();
                }
                ti3.k = i;
                int i2 = x8a.I0;
                ti3.setMarginStart(i2);
                ti3.topMargin = i2;
                ti3.setMarginEnd(i2);
                textView.setLayoutParams(ti3);
                textView.setMaxLines(2);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                i4f.B.b(textView, du4.b);
                qp4.u0.j(textView).getText();
                textView.setTextColor(-1);
                return textView;
            case 1:
                TextView textView2 = new TextView(this.b);
                textView2.setId(xoc.p);
                ti3 ti32 = new ti3(0, -2);
                ti32.t = 0;
                x8a x8a2 = this.c;
                je7 je73 = x8a2.J0;
                ti32.j = je73.a() ? ((TextView) je73.getValue()).getId() : 0;
                je7 je74 = x8a2.L0;
                ti32.u = je74.a() ? ((ImageView) je74.getValue()).getId() : 0;
                ti32.l = 0;
                int i3 = x8a2.I0;
                ti32.setMarginStart(i3);
                ti32.topMargin = x8a2.G0;
                ti32.setMarginEnd(i3);
                ti32.bottomMargin = i3;
                textView2.setLayoutParams(ti32);
                textView2.setMaxLines(2);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                i4f.p.b(textView2, du4.b);
                qp4.u0.j(textView2).getText();
                textView2.setTextColor(f8.G(-1, 0.7f));
                return textView2;
            case 2:
                return x8a.w(this.c, this.b);
            case 3:
                FrameLayout frameLayout = new FrameLayout(this.b);
                frameLayout.setId(xoc.o);
                float f = (float) x8a.Z0;
                ti3 ti33 = new ti3(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                ti33.i = 0;
                ti33.v = 0;
                ti33.l = 0;
                ti33.setMarginEnd(tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density));
                frameLayout.setLayoutParams(ti33);
                frameLayout.setBackground(this.c.N0);
                return frameLayout;
            default:
                Drawable b2 = kt3.b(this.c.getContext(), yfa.q);
                b2.setTint(k7d.h(qp4.u0, this.b).f);
                return b2;
        }
    }

    public /* synthetic */ v8a(Context context, x8a x8a, int i) {
        this.a = i;
        this.b = context;
        this.c = x8a;
    }
}
