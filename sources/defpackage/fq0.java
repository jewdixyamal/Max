package defpackage;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: fq0  reason: default package */
public final class fq0 extends ni0 {
    public final kk7 a;
    public final s5a b;
    public final bu6 c;
    public final TextView o;
    public final TextView s0;

    /* JADX WARNING: type inference failed for: r5v8, types: [android.text.method.LinkMovementMethod, bk7] */
    public fq0(Context context) {
        super(context, (AttributeSet) null, 0);
        kk7 kk7 = new kk7((hk7) null, new x5(19, this), 5);
        this.a = kk7;
        s5a s5a = new s5a(context);
        float f = (float) 72;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        s5a.setLayoutParams(layoutParams);
        this.b = s5a;
        bu6 bu6 = new bu6(context);
        bu6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.c = bu6;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(1);
        if (bk7.a == null) {
            bk7.a = new LinkMovementMethod();
        }
        textView.setMovementMethod(bk7.a);
        textView.setTransformationMethod(kk7);
        i4f.d.b(textView, du4.b);
        this.o = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.topMargin = tu0.G(((float) 8) * fk4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(1);
        i4f.s.b(textView2, du4.b);
        this.s0 = textView2;
        addView(s5a);
        addView(bu6);
        addView(textView);
        addView(textView2);
        onThemeChanged(qp4.u0.b(context).i());
    }

    private final void setupWithAvatar(xz4 xz4) {
        float f = (float) 24;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        this.c.setVisibility(8);
        s5a s5a = this.b;
        s5a.setVisibility(0);
        String str = xz4.a;
        Long valueOf = Long.valueOf(xz4.c);
        CharSequence charSequence = xz4.b;
        if (charSequence == null) {
            charSequence = "";
        }
        s5a.i(s5a, str, valueOf, charSequence);
    }

    private final void setupWithCustomImage(yt6 yt6) {
        float f = (float) 24;
        setPadding(0, 0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f));
        this.o.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), 0, tu0.G(f * fk4.d().getDisplayMetrics().density), 0);
        this.b.setVisibility(8);
        bu6 bu6 = this.c;
        bu6.setVisibility(0);
        bu6.setImageAttach(yt6);
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.a = null;
    }

    public final void onThemeChanged(fka fka) {
        super.onThemeChanged(fka);
        this.o.setTextColor(fka.getText().e);
        this.s0.setTextColor(fka.getText().h);
    }

    public final void setLinkListener(hk7 hk7) {
        this.a.a = hk7;
    }

    public final void setState(xz4 xz4) {
        yt6 yt6 = xz4.d;
        if (yt6 != null) {
            setupWithCustomImage(yt6);
        } else {
            setupWithAvatar(xz4);
        }
        CharSequence d = xz4.e.d(this);
        CharSequence charSequence = "";
        if (d == null) {
            d = charSequence;
        }
        this.o.setText(d);
        TextView textView = this.s0;
        jqe jqe = xz4.f;
        CharSequence d2 = jqe.d(this);
        int i = 0;
        if (!(!(d2 == null || d2.length() == 0))) {
            i = 8;
        }
        textView.setVisibility(i);
        CharSequence d3 = jqe.d(this);
        if (d3 != null) {
            charSequence = d3;
        }
        textView.setText(charSequence);
        this.a.c(d);
    }
}
