package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: c03  reason: default package */
public final class c03 extends ndc implements kre {
    public Drawable X;
    public final Rect Y = new Rect();
    public final Rect Z = new Rect();
    public final k56 a;
    public final m56 b;
    public final m56 c;
    public final m56 o;
    public final int[] s0 = {16842912};
    public final int[] t0 = {-16842912};

    public c03(k56 k56, m56 m56, m56 m562, m56 m563) {
        this.a = k56;
        this.b = m56;
        this.c = m562;
        this.o = m563;
        this.X = (Drawable) k56.invoke();
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdc) {
        recyclerView.getClass();
        if (((Boolean) this.c.invoke(Integer.valueOf(RecyclerView.R(view)))).booleanValue()) {
            rect.left = rh4.c((float) 36, fk4.d().getDisplayMetrics().density, rect.left);
        }
    }

    public final void g(Canvas canvas, RecyclerView recyclerView, zdc zdc) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((Boolean) this.c.invoke(Integer.valueOf(i))).booleanValue()) {
                Drawable background = recyclerView.getChildAt(i).getBackground();
                RippleDrawable rippleDrawable = background instanceof RippleDrawable ? (RippleDrawable) background : null;
                if (rippleDrawable != null) {
                    f8.D(rippleDrawable, tu0.G(((float) -36) * fk4.d().getDisplayMetrics().density), 0, 0, 14);
                }
            }
        }
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        int G = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
        int G2 = tu0.G(((float) 24) * fk4.d().getDisplayMetrics().density) / 2;
        int i = 0;
        while (true) {
            if (i < recyclerView.getChildCount()) {
                int i2 = i + 1;
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null) {
                    recyclerView.getClass();
                    int R = RecyclerView.R(childAt);
                    if (((Boolean) this.o.invoke(Integer.valueOf(R))).booleanValue()) {
                        Rect rect = this.Y;
                        RecyclerView.V(rect, childAt);
                        Rect rect2 = this.Z;
                        childAt.getDrawingRect(rect2);
                        int height = (rect.height() - rect2.height()) / 2;
                        this.X.setAlpha(tu0.G(childAt.getAlpha() * ((float) 255)));
                        if (((Boolean) this.b.invoke(Integer.valueOf(R))).booleanValue()) {
                            Drawable drawable = this.X;
                            drawable.setState(this.s0);
                            drawable.setBounds(rect.left + G, (rect.centerY() - G2) + height, (G2 * 2) + rect.left + G, rect.centerY() + G2 + height);
                            drawable.draw(canvas);
                        } else {
                            Drawable drawable2 = this.X;
                            drawable2.setState(this.t0);
                            drawable2.setBounds(rect.left + G, (rect.centerY() - G2) + height, (G2 * 2) + rect.left + G, rect.centerY() + G2 + height);
                            drawable2.draw(canvas);
                        }
                    }
                    i = i2;
                } else {
                    throw new IndexOutOfBoundsException();
                }
            } else {
                return;
            }
        }
    }

    public final void onThemeChanged(fka fka) {
        this.X = (Drawable) this.a.invoke();
    }
}
