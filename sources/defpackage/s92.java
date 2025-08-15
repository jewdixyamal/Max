package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: s92  reason: default package */
public final class s92 extends View implements kre {
    public final int a = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
    public final int b;
    public final int c;
    public final TextPaint o;
    public final Drawable s0;
    public List t0;

    public s92(Context context) {
        super(context, (AttributeSet) null);
        float f = (float) 12;
        this.b = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.c = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
        TextPaint textPaint = new TextPaint(1);
        i4f.s.a(textPaint, context.getResources().getDisplayMetrics(), du4.b);
        this.o = textPaint;
        Drawable b2 = kt3.b(getContext(), woc.h);
        b2.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        this.s0 = b2;
        this.t0 = nz4.a;
        onThemeChanged(qp4.u0.j(this));
    }

    public final void onDraw(Canvas canvas) {
        String str;
        super.onDraw(canvas);
        TextPaint textPaint = this.o;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        int i = this.a;
        int i2 = ((int) (fontMetrics.descent - fontMetrics.ascent)) + i;
        int paddingTop = getPaddingTop() + i;
        for (CharSequence charSequence : this.t0) {
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            float f = fontMetrics.ascent;
            float f2 = ((float) paddingTop) - f;
            float f3 = ((f + fontMetrics.descent) / ((float) 2)) + f2;
            int i3 = this.b;
            int paddingLeft = getPaddingLeft();
            int paddingLeft2 = getPaddingLeft() + i3;
            Drawable drawable = this.s0;
            drawable.setBounds(paddingLeft, (int) (f3 - ((float) (i3 / 2))), paddingLeft2, (int) (f3 + ((float) (i3 / 2))));
            drawable.draw(canvas);
            canvas.drawText(str, (float) (getPaddingLeft() + i3 + this.c), f2, textPaint);
            paddingTop += i2;
        }
    }

    public final void onMeasure(int i, int i2) {
        Float f;
        String str;
        TextPaint textPaint = this.o;
        Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + ((int) (((float) this.t0.size()) * ((fontMetrics.descent - fontMetrics.ascent) + ((float) this.a))));
        List<CharSequence> list = this.t0;
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        for (CharSequence charSequence : list) {
            if (charSequence == null || (str = charSequence.toString()) == null) {
                str = "";
            }
            arrayList.add(Float.valueOf(textPaint.measureText(str)));
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            f = null;
        } else {
            float floatValue = ((Number) it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, ((Number) it.next()).floatValue());
            }
            f = Float.valueOf(floatValue);
        }
        setMeasuredDimension(View.resolveSize((int) (((float) (getPaddingLeft() + this.b + this.c)) + (f != null ? f.floatValue() : 0.0f) + ((float) getPaddingRight())), i), View.resolveSize(paddingBottom, i2));
    }

    public final void onThemeChanged(fka fka) {
        this.o.setColor(fka.getText().h);
        this.s0.setTint(fka.a().s().a.b.b);
        invalidate();
    }
}
