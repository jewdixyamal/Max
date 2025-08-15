package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;

/* renamed from: rc0  reason: default package */
public final /* synthetic */ class rc0 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fka b;

    public /* synthetic */ rc0(int i, fka fka) {
        this.a = i;
        this.b = fka;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setColor(this.b.b().l);
                return paint;
            default:
                Paint paint2 = new Paint();
                this.b.getText();
                paint2.setColor(-1);
                paint2.setAntiAlias(true);
                paint2.setDither(true);
                paint2.setSubpixelText(true);
                paint2.setLinearText(true);
                paint2.setTypeface(Typeface.create(Typeface.SANS_SERIF, 600, false));
                return paint2;
        }
    }
}
