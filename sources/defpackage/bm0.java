package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;

/* renamed from: bm0  reason: default package */
public final class bm0 extends FrameLayout implements kre {
    public final wjc a;
    public final jic b;
    public final TextView c;
    public final TextView o;
    public final SimpleDraweeView s0;

    public bm0(Context context) {
        super(context);
        wjc wjc = new wjc();
        this.a = wjc;
        float f = (float) 32;
        int G = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.b = G <= 0 ? null : new jic(0.0f, G, G, 12);
        TextView textView = new TextView(context);
        textView.setId(uvb.oneme_folder_widget_title);
        textView.setMaxLines(2);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        i4f.z.b(textView, du4.b);
        this.c = textView;
        TextView textView2 = new TextView(context);
        textView2.setId(uvb.oneme_folder_widget_description);
        textView2.setMaxLines(2);
        textView2.setEllipsize(truncateAt);
        i4f.n.b(textView2, du4.b);
        this.o = textView2;
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(context);
        simpleDraweeView.setId(uvb.oneme_folder_widget_icon);
        e2b a2 = s36.a.get();
        a2.g = wjc;
        a2.k = true;
        simpleDraweeView.setController(a2.a());
        this.s0 = simpleDraweeView;
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        addView(simpleDraweeView, new FrameLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density)));
        addView(textView, new FrameLayout.LayoutParams(-2, -2));
        addView(textView2, new FrameLayout.LayoutParams(-2, -2));
        setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 20.0f));
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        onThemeChanged(qp4.u0.j(this));
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        TextView textView = this.c;
        int measuredHeight = textView.getMeasuredHeight();
        TextView textView2 = this.o;
        int measuredHeight2 = textView2.getMeasuredHeight() + measuredHeight;
        float f = (float) 4;
        int measuredHeight3 = (getMeasuredHeight() / 2) - ((tu0.G(fk4.d().getDisplayMetrics().density * f) + measuredHeight2) / 2);
        float f2 = (float) 16;
        ote.E(textView, tu0.G(fk4.d().getDisplayMetrics().density * f2), measuredHeight3, 0, 12);
        ote.E(textView2, tu0.G(f2 * fk4.d().getDisplayMetrics().density), wg0.d(f, fk4.d().getDisplayMetrics().density, textView.getMeasuredHeight(), measuredHeight3), 0, 12);
        SimpleDraweeView simpleDraweeView = this.s0;
        float f3 = (float) 32;
        simpleDraweeView.layout(rh4.q(f3, fk4.d().getDisplayMetrics().density, getMeasuredWidth()) - simpleDraweeView.getMeasuredWidth(), (getMeasuredHeight() / 2) - (simpleDraweeView.getMeasuredHeight() / 2), rh4.q(f3, fk4.d().getDisplayMetrics().density, getMeasuredWidth()), (simpleDraweeView.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = (float) 32;
        int q = rh4.q((float) 12, fk4.d().getDisplayMetrics().density, rh4.q(f, fk4.d().getDisplayMetrics().density, rh4.q(f, fk4.d().getDisplayMetrics().density, rh4.q((float) 16, fk4.d().getDisplayMetrics().density, size))));
        this.c.measure(View.MeasureSpec.makeMeasureSpec(q, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.o.measure(View.MeasureSpec.makeMeasureSpec(q, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(0, 0));
        this.s0.measure(View.MeasureSpec.makeMeasureSpec(tu0.G(fk4.d().getDisplayMetrics().density * f), 1073741824), View.MeasureSpec.makeMeasureSpec(tu0.G(f * fk4.d().getDisplayMetrics().density), 1073741824));
        setMeasuredDimension(size, size2);
    }

    public final void onThemeChanged(fka fka) {
        TextView textView = this.c;
        fka.getText();
        textView.setTextColor(-1);
        this.o.setTextColor(f8.G(-1, 0.7f));
    }
}
