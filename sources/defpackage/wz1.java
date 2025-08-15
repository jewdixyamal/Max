package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: wz1  reason: default package */
public final class wz1 extends ndc {
    public final Paint a;
    public final List b = Collections.unmodifiableList(new ArrayList());

    public wz1() {
        Paint paint = new Paint();
        this.a = paint;
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(stb.m3_carousel_debug_keyline_width));
        for (kd7 kd7 : this.b) {
            kd7.getClass();
            paint.setColor(s63.c(-65281, 0.0f, -16776961));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).O0()) {
                kd7.getClass();
                canvas.drawLine(0.0f, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.m(), 0.0f, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.h(), paint);
            } else {
                kd7.getClass();
                canvas.drawLine((float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.j(), 0.0f, (float) ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.k(), 0.0f, paint);
            }
        }
    }
}
