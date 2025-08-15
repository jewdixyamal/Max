package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.TextView;

/* renamed from: l34  reason: default package */
public final class l34 extends c8e implements kre {
    public final GradientDrawable X;
    public final TextView o;

    public l34(FrameLayout frameLayout, du4 du4) {
        super(frameLayout);
        this.o = (TextView) frameLayout.getChildAt(0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float f = fk4.d().getDisplayMetrics().density * 12.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        gradientDrawable.setCornerRadii(fArr);
        pq9 pq9 = qp4.u0;
        gradientDrawable.setColors(pq9.j(this.o).a().s().b.v);
        this.X = gradientDrawable;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TextView textView = this.o;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        int G = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
        layoutParams.topMargin = G;
        layoutParams.bottomMargin = G;
        textView.setLayoutParams(layoutParams);
        textView.setTextAlignment(4);
        os2.f.b(textView, du4);
        float f2 = (float) 12;
        float f3 = (float) 2;
        textView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f3), tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f3 * fk4.d().getDisplayMetrics().density));
        textView.setBackground(textView.getBackground());
        onThemeChanged(pq9.j(textView));
    }

    public final void onThemeChanged(fka fka) {
        pq9 pq9 = qp4.u0;
        TextView textView = this.o;
        textView.setTextColor(pq9.j(textView).a().s().g.a);
        int[] iArr = fka.a().s().b.v;
        GradientDrawable gradientDrawable = this.X;
        gradientDrawable.setColors(iArr);
        textView.setBackground(gradientDrawable);
    }
}
