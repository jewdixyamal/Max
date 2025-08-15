package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: ny3  reason: default package */
public final class ny3 extends LinearLayout implements kre {
    public final ImageView a;
    public final TextView b;
    public final TextView c;

    public ny3(Context context) {
        super(context, (AttributeSet) null);
        ImageView imageView = new ImageView(context);
        float f = (float) 40;
        imageView.setLayoutParams(new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.a = imageView;
        TextView textView = new TextView(context);
        i4f.j.b(textView, du4.b);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density), 0);
        layoutParams.weight = 1.0f;
        textView.setLayoutParams(layoutParams);
        this.b = textView;
        TextView textView2 = new TextView(context);
        i4f.m.b(textView2, du4.b);
        this.c = textView2;
        setMinimumHeight(tu0.G(((float) 56) * fk4.d().getDisplayMetrics().density));
        setOrientation(0);
        setGravity(16);
        setOutlineProvider(new ix3(16.0f));
        setClipToOutline(true);
        addView(imageView);
        addView(textView);
        addView(textView2);
        onThemeChanged(qp4.u0.j(this));
    }

    public final void onThemeChanged(fka fka) {
        this.b.setTextColor(fka.getText().e);
        this.c.setTextColor(fka.getText().g);
    }

    public final void setCountryInfo(eaa eaa) {
        Integer num = eaa.o;
        if (num != null) {
            int intValue = num.intValue();
            ImageView imageView = this.a;
            imageView.setImageResource(intValue);
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(0, 0, tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density), 0);
                imageView.setLayoutParams(marginLayoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
        }
        this.b.setText(getContext().getString(eaa.c));
        TextView textView = this.c;
        textView.setText("+" + eaa.b);
    }
}
