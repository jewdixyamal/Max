package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: nn1  reason: default package */
public final /* synthetic */ class nn1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ on1 c;

    public /* synthetic */ nn1(Context context, on1 on1, int i) {
        this.a = i;
        this.b = context;
        this.c = on1;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                mn1 mn1 = new mn1(this.b, (AttributeSet) null);
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, tu0.G(((float) 68) * fk4.d().getDisplayMetrics().density));
                on1 on1 = this.c;
                on1.setLayoutParams(layoutParams);
                float f = (float) 8;
                on1.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density));
                on1.removeAllViews();
                on1.addView(mn1);
                return mn1;
            default:
                in1 in1 = new in1(this.b, (AttributeSet) null);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, tu0.G(((float) 54) * fk4.d().getDisplayMetrics().density));
                on1 on12 = this.c;
                on12.setLayoutParams(layoutParams2);
                float f2 = (float) 12;
                float f3 = (float) 6;
                on12.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
                on12.removeAllViews();
                on12.addView(in1);
                return in1;
        }
    }
}
