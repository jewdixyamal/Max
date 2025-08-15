package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;

/* renamed from: bo6  reason: default package */
public final class bo6 extends ndc {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public bo6(em2 em2) {
        this.b = em2;
    }

    public void f(Rect rect, View view, RecyclerView recyclerView, zdc zdc) {
        switch (this.a) {
            case 2:
                super.f(rect, view, recyclerView, zdc);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                em2 em2 = (em2) this.b;
                Character d = em2.d(R);
                if (d != null) {
                    char charValue = d.charValue();
                    if (R > 0) {
                        Character d2 = em2.d(R - 1);
                        if (d2 == null || charValue != d2.charValue()) {
                            rect.top = tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.f(rect, view, recyclerView, zdc);
                return;
        }
    }

    public void g(Canvas canvas, RecyclerView recyclerView, zdc zdc) {
        switch (this.a) {
            case 1:
                if ((recyclerView.getAdapter() instanceof t9g) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    t9g t9g = (t9g) recyclerView.getAdapter();
                    GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                    ((MaterialCalendar) this.b).getClass();
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    public void h(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                int paddingLeft = recyclerView.getPaddingLeft();
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int bottom = childAt.getBottom() + ((pdc) childAt.getLayoutParams()).bottomMargin;
                    Drawable drawable = (Drawable) this.b;
                    drawable.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
                    drawable.draw(canvas);
                }
                return;
            default:
                return;
        }
    }

    public bo6(ColorDrawable colorDrawable) {
        this.b = colorDrawable.mutate();
    }

    public bo6(MaterialCalendar materialCalendar) {
        this.b = materialCalendar;
        jaf.d((Calendar) null);
        jaf.d((Calendar) null);
    }
}
