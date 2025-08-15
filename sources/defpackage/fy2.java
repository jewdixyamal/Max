package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: fy2  reason: default package */
public final class fy2 extends View implements kre {
    public final e23 a;
    public ey2 b;
    public final tz6 c;

    public fy2(Context context) {
        super(context);
        e23 e23 = new e23(context, (AttributeSet) null);
        float f = (float) 28;
        e23.h = tu0.G(fk4.d().getDisplayMetrics().density * f);
        e23.j = 0;
        e23.c = new int[]{qp4.u0.b(context).i().e().e.e.a};
        e23.b = tu0.G(((float) 20) * fk4.d().getDisplayMetrics().density);
        e23.a = tu0.G(((float) 3) * fk4.d().getDisplayMetrics().density);
        e23.g = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
        this.a = e23;
        tz6 tz6 = new tz6(context, e23, new wq4(e23), new a23(e23));
        Resources resources = context.getResources();
        int i = yub.indeterminate_static;
        qbf qbf = new qbf();
        ThreadLocal threadLocal = vic.a;
        qbf.a = qic.a(resources, i, (Resources.Theme) null);
        new pbf(qbf.a.getConstantState());
        tz6.y0 = qbf;
        tz6.setBounds(0, 0, tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f));
        tz6.d(true, true, true);
        tz6.setCallback(this);
        this.c = tz6;
        setLayerType(2, (Paint) null);
        float f2 = (float) 10;
        setPadding(0, tu0.G(fk4.d().getDisplayMetrics().density * f2), 0, tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        setLayoutParams(new ViewGroup.LayoutParams(-1, rh4.c(f, fk4.d().getDisplayMetrics().density, getPaddingBottom() + getPaddingTop())));
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        tz6 tz6 = this.c;
        int save = canvas.save();
        canvas.translate((((float) getWidth()) / 2.0f) - (((float) tz6.getBounds().width()) / 2.0f), (((float) getHeight()) / 2.0f) - (((float) tz6.getBounds().height()) / 2.0f));
        try {
            tz6.draw(canvas);
            canvas.restoreToCount(save);
            tz6.invalidateSelf();
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
    }

    public final void onThemeChanged(fka fka) {
        this.a.c = new int[]{fka.e().e.e.a};
    }

    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.c;
    }
}
