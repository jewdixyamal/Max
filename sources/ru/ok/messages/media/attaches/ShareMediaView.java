package ru.ok.messages.media.attaches;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public class ShareMediaView extends ts8 {
    public float Y0 = ((float) fk4.b((int) 9.0f));

    public ShareMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        bk4.b();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, m20] */
    public final void m(es8 es8) {
        k8g k8g;
        cu8 cu8 = es8.a;
        l20 l20 = cu8.i().g;
        es8 es82 = this.y0;
        boolean z = true;
        boolean z2 = es82 == null || es82.a.b != cu8.b || s5c.h(es82, es8);
        boolean z3 = z2 || this.y0 == null || (k8g = this.w0) == null || ts8.H(l20, k8g.h(0));
        ? obj = new Object();
        obj.a(l20);
        k8g c = obj.c();
        this.w0 = c;
        this.y0 = es8;
        sz t = t(es8, 0, c.h(0));
        if (z3) {
            rq4 rq4 = t.o;
            rq4.getClass();
            ((la6) rq4).h(ssc.l);
            l20 h = this.w0.h(0);
            if (s5c.C(h) <= s5c.E(h)) {
                z = false;
            }
            if (z) {
                rq4 rq42 = t.o;
                rq42.getClass();
                ((la6) rq42).n(wnc.a(0.0f, 0.0f, 0.0f, 0.0f));
            } else {
                rq4 rq43 = t.o;
                rq43.getClass();
                float f = this.Y0;
                ((la6) rq43).n(wnc.a(0.0f, 0.0f, f, f));
            }
            Q(this.w0.h(0), t, false);
        }
        if (z2) {
            N();
        }
        requestLayout();
    }

    public final void onMeasure(int i, int i2) {
        l20 h = this.w0.h(0);
        if (s5c.C(h) > s5c.E(h)) {
            int size = (int) ((((float) View.MeasureSpec.getSize(i)) * 2.0f) / 3.0f);
            setMeasuredDimension((int) ((((float) s5c.E(h)) / ((float) s5c.C(h))) * ((float) size)), size);
        } else {
            int size2 = View.MeasureSpec.getSize(i);
            setMeasuredDimension(size2, (int) ((((float) s5c.C(h)) / ((float) s5c.E(h))) * ((float) size2)));
        }
        ((sz) this.o.i(0)).Z.d(getMeasuredWidth(), getMeasuredHeight());
        J();
    }

    public final int u(l20 l20) {
        return 0;
    }
}
