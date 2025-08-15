package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: fcf  reason: default package */
public final class fcf extends ImageSpan implements kre {
    public final m56 X;
    public final Resources Y;
    public ecf Z;
    public final Context a;
    public final int b;
    public final boolean c;
    public final boolean o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fcf(Context context, int i, boolean z, m56 m56) {
        super(context, i == 1 ? woc.h2 : woc.i2, 2);
        this.a = context;
        this.b = i;
        this.c = true;
        this.o = z;
        this.X = m56;
        this.Y = Resources.getSystem();
        this.Z = new ecf(context, i, m56);
        onThemeChanged(qp4.u0.b(context).i());
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int save = canvas.save();
        try {
            Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            int i6 = fontMetricsInt.descent;
            float f2 = (float) 2;
            canvas.translate(f, (((float) (i4 + i6)) - (((float) (i6 - fontMetricsInt.ascent)) / f2)) - (((float) (this.Z.getBounds().bottom - this.Z.getBounds().top)) / f2));
            this.Z.draw(canvas);
        } finally {
            canvas.restoreToCount(save);
        }
    }

    public final Drawable getDrawable() {
        return this.Z;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        int I = i24.I(paint.getTextSize() / this.Y.getDisplayMetrics().density);
        if (I != this.b) {
            this.Z = new ecf(this.a, I, this.X);
        }
        int G = tu0.G(((float) h4f.f(I)) * fk4.d().getDisplayMetrics().density);
        int i3 = this.c ? G : 0;
        if (!this.o) {
            G = 0;
        }
        ecf ecf = this.Z;
        float i4 = (float) h4f.i(I);
        ecf.setBounds(i3, 0, rh4.c(i4, fk4.d().getDisplayMetrics().density, i3), tu0.G(fk4.d().getDisplayMetrics().density * i4));
        return wg0.d(i4, fk4.d().getDisplayMetrics().density, i3, G);
    }

    public final void onThemeChanged(fka fka) {
        ecf ecf = this.Z;
        if (!(ecf instanceof ecf)) {
            ecf = null;
        }
        if (ecf != null) {
            ecf.onThemeChanged(fka);
        }
    }
}
