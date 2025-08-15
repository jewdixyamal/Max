package defpackage;

import android.text.Layout;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: y5d  reason: default package */
public final class y5d {
    public final ViewGroup a;
    public final je7 b = tu0.r(3, new lwa(25, this));

    public y5d(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final int a() {
        return ((w5d) this.b.getValue()).getMeasuredHeight();
    }

    public final int b() {
        return ((w5d) this.b.getValue()).getMeasuredWidth();
    }

    public final void c(int i, int i2) {
        ote.E((View) this.b.getValue(), i, i2, 0, 12);
    }

    public final void d(int i, int i2) {
        ((w5d) this.b.getValue()).measure(i, i2);
    }

    public final void e(Layout layout) {
        je7 je7 = this.b;
        if (layout != null) {
            w5d w5d = (w5d) je7.getValue();
            w5d.a = layout;
            TextPaint paint = layout.getPaint();
            if (paint != null) {
                paint.setColor(w5d.b);
            }
            w5d.requestLayout();
            w5d.invalidate();
            if (w5d.getParent() == null) {
                this.a.addView(w5d, new ViewGroup.LayoutParams(-2, -2));
            }
            w5d.setVisibility(0);
        } else if (je7.a()) {
            ((w5d) je7.getValue()).setVisibility(8);
        }
    }

    public final void f(int i) {
        TextPaint paint;
        je7 je7 = this.b;
        if (je7.a()) {
            w5d w5d = (w5d) je7.getValue();
            w5d.b = i;
            Layout layout = w5d.a;
            if (!(layout == null || (paint = layout.getPaint()) == null)) {
                paint.setColor(i);
            }
            w5d.invalidate();
        }
    }
}
