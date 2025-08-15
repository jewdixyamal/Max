package defpackage;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.RatingBar;

/* renamed from: nn  reason: default package */
public final class nn extends RatingBar {
    public final va8 a;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public nn(android.content.Context r3, android.util.AttributeSet r4) {
        /*
            r2 = this;
            int r0 = defpackage.vsb.ratingBarStyle
            r2.<init>(r3, r4, r0)
            android.content.Context r3 = r2.getContext()
            defpackage.gse.a(r3, r2)
            va8 r3 = new va8
            r1 = 1
            r3.<init>((int) r1, (java.lang.Object) r2)
            r2.a = r3
            r3.A(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.a.c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
