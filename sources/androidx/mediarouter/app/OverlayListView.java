package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.animation.Interpolator;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.Iterator;

final class OverlayListView extends ListView {
    public final ArrayList a = new ArrayList();

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        ArrayList arrayList = this.a;
        if (arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                coa coa = (coa) it.next();
                BitmapDrawable bitmapDrawable = coa.a;
                if (bitmapDrawable != null) {
                    bitmapDrawable.draw(canvas);
                }
                long drawingTime = getDrawingTime();
                if (coa.l) {
                    z = false;
                } else {
                    float f = 0.0f;
                    float max = Math.max(0.0f, Math.min(1.0f, ((float) (drawingTime - coa.j)) / ((float) coa.e)));
                    if (coa.k) {
                        f = max;
                    }
                    Interpolator interpolator = coa.d;
                    float interpolation = interpolator == null ? f : interpolator.getInterpolation(f);
                    int i = (int) (((float) coa.g) * interpolation);
                    Rect rect = coa.f;
                    Rect rect2 = coa.c;
                    rect2.top = rect.top + i;
                    rect2.bottom = rect.bottom + i;
                    float f2 = coa.h;
                    float f3 = z7b.f(coa.i, f2, interpolation, f2);
                    coa.b = f3;
                    BitmapDrawable bitmapDrawable2 = coa.a;
                    if (bitmapDrawable2 != null) {
                        bitmapDrawable2.setAlpha((int) (f3 * 255.0f));
                        bitmapDrawable2.setBounds(rect2);
                    }
                    if (coa.k && f >= 1.0f) {
                        coa.l = true;
                        h7b h7b = coa.m;
                        if (h7b != null) {
                            d dVar = (d) h7b.c;
                            dVar.T0.remove((dh8) h7b.b);
                            dVar.P0.notifyDataSetChanged();
                        }
                    }
                    z = !coa.l;
                }
                if (!z) {
                    it.remove();
                }
            }
        }
    }
}
