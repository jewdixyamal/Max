package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: qaa  reason: default package */
public final class qaa extends View {
    public static final /* synthetic */ bc7[] o;
    public final int a = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
    public final yj b = new yj(this);
    public final Paint c;

    static {
        oi9 oi9 = new oi9(qaa.class, "appearance", "getAppearance()Lone/me/common/dot/OneMeDot$Appearance;");
        nec.a.getClass();
        o = new bc7[]{oi9};
    }

    public qaa(Context context) {
        super(context, (AttributeSet) null);
        int i;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paa appearance = getAppearance();
        fka j = qp4.u0.j(this);
        int ordinal = appearance.ordinal();
        if (ordinal == 0) {
            i = j.b().a.m;
        } else if (ordinal == 1) {
            i = j.b().a.c;
        } else if (ordinal == 2) {
            i = j.b().a.g;
        } else if (ordinal == 3) {
            i = j.b().a.e;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        paint.setColor(i);
        this.c = paint;
    }

    public final paa getAppearance() {
        bc7 bc7 = o[0];
        return (paa) this.b.b;
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = (float) getMeasuredWidth();
        float measuredHeight = (float) getMeasuredHeight();
        int i = this.a;
        canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, ((float) i) / 2.0f, ((float) i) / 2.0f, this.c);
    }

    public final void onMeasure(int i, int i2) {
        int i3 = this.a;
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public final void setAppearance(paa paa) {
        this.b.o1(this, o[0], paa);
    }
}
