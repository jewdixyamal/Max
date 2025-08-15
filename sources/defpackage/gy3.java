package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;

/* renamed from: gy3  reason: default package */
public final class gy3 extends AppCompatTextView implements kre {
    public long u0;
    public final ValueAnimator v0 = ValueAnimator.ofFloat(new float[]{360.0f, 0.0f});
    public final c23 w0;

    public gy3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c23 c23 = new c23();
        pq9 pq9 = qp4.u0;
        c23.a.setColor(pq9.j(this).i().c);
        this.w0 = c23;
        setBackground(c23);
        i4f.o.b(this, du4.b);
        setTextAlignment(4);
        pq9.j(this).getText();
        setTextColor(-1);
        setGravity(17);
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        long j = this.u0;
        ValueAnimator valueAnimator = this.v0;
        valueAnimator.setDuration(j);
        valueAnimator.addUpdateListener(new z00(5, (Object) this));
        valueAnimator.start();
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.v0.cancel();
    }

    public final void onThemeChanged(fka fka) {
        this.w0.a.setColor(fka.i().c);
        setTextColor(-1);
    }

    public final void setMaxValue(long j) {
        this.u0 = j;
    }
}
