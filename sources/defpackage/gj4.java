package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: gj4  reason: default package */
public final class gj4 extends ni0 {
    public static final /* synthetic */ int s0 = 0;
    public k56 a = new zf3(16);
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final iw7 o;

    public gj4(Context context) {
        super(context, (AttributeSet) null, 0);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 1;
        float f = (float) 8;
        appCompatTextView.setPadding(0, tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(fk4.d().getDisplayMetrics().density * f));
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setTextAlignment(4);
        appCompatTextView.setTextColor(getTitleColor());
        i4f.j.b(appCompatTextView, du4.b);
        this.b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
        appCompatTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        appCompatTextView2.setGravity(1);
        appCompatTextView2.setTextAlignment(4);
        appCompatTextView2.setTextColor(getSubtitleColor());
        i4f.n.b(appCompatTextView2, du4.b);
        this.c = appCompatTextView2;
        iw7 iw7 = new iw7(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        iw7.setPadding(0, tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density));
        iw7.setLayoutParams(layoutParams2);
        iw7.setTextAlignment(4);
        tu0.K(iw7, 300, new c5(25, (Object) this));
        this.o = iw7;
        addView(appCompatTextView);
        addView(appCompatTextView2);
        addView(iw7);
        onThemeChanged(qp4.u0.b(context).i());
    }

    private final int getSubtitleColor() {
        return qp4.u0.j(this).getText().g;
    }

    private final int getTitleColor() {
        return qp4.u0.j(this).getText().e;
    }

    public final void onThemeChanged(fka fka) {
        super.onThemeChanged(fka);
        this.b.setTextColor(getTitleColor());
        this.c.setTextColor(getSubtitleColor());
    }
}
