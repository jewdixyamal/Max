package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: kge  reason: default package */
public final class kge extends Drawable {
    public final pte a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;

    public kge(String str, int i, int i2, int i3, pte pte) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.a = pte;
    }

    /* renamed from: a */
    public final kge mutate() {
        pte pte = this.a;
        pte.getClass();
        Paint paint = new Paint(pte.g);
        pte pte2 = new pte(pte.a, pte.b, pte.c);
        pte2.g = paint;
        pte2.j = true;
        return new kge(this.b, this.c, this.d, this.e, pte2);
    }

    public final void draw(Canvas canvas) {
        pte pte = this.a;
        if (pte.j) {
            float f = pte.f;
            int save = canvas.save();
            canvas.scale(f, f, 0.0f, 0.0f);
            try {
                canvas.drawPaint(pte.g);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            hm9.m0(pte.class.getSimpleName(), "error: cant' render svg, incorrect data!", new Object[0]);
        }
    }

    public final int getAlpha() {
        return this.a.g.getAlpha();
    }

    public final int getIntrinsicHeight() {
        return this.a.e;
    }

    public final int getIntrinsicWidth() {
        return this.a.d;
    }

    public final int getOpacity() {
        return -2;
    }

    public final void setAlpha(int i) {
        this.a.g.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.g.setColorFilter(colorFilter);
    }

    public kge(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
        this.e = 1;
        if (jge.$EnumSwitchMapping$0[au1.s(1)] == 1) {
            pte pte = new pte(str, i, i2);
            e5f e5f = (e5f) pte.h.getValue();
            this.a = pte;
            return;
        }
        throw new NoWhenBranchMatchedException();
    }
}
