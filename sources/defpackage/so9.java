package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: so9  reason: default package */
public final class so9 extends ndc implements kre {
    public final Paint X;
    public final /* synthetic */ int a = 1;
    public final m56 b;
    public final gaa c;
    public final RectF o;

    public so9(zo9 zo9, Context context) {
        this.b = zo9;
        this.c = new gaa(17);
        Paint paint = new Paint(1);
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 3.0f);
        paint.setStyle(Paint.Style.STROKE);
        this.X = paint;
        this.o = new RectF();
        onThemeChanged(qp4.u0.b(context).i());
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdc) {
        switch (this.a) {
            case 0:
                int G = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
                rect.set(G, G, G, G);
                this.c.E(rect, view, recyclerView);
                return;
            default:
                int G2 = tu0.G(((float) 2) * fk4.d().getDisplayMetrics().density);
                rect.set(G2, G2, G2, G2);
                this.c.E(rect, view, recyclerView);
                return;
        }
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int R = RecyclerView.R(childAt);
                    if (R != -1) {
                        if (((Boolean) this.b.invoke(Integer.valueOf(R))).booleanValue()) {
                            int G = tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density);
                            RectF rectF = this.o;
                            rectF.set((float) (childAt.getLeft() - G), (float) (childAt.getTop() - G), (float) (childAt.getRight() + G), (float) (childAt.getBottom() + G));
                            float f = (float) 2;
                            canvas.drawRoundRect(rectF, rectF.width() / f, rectF.width() / f, this.X);
                        }
                    }
                }
                return;
            default:
                int childCount2 = recyclerView.getChildCount();
                for (int i2 = 0; i2 < childCount2; i2++) {
                    View childAt2 = recyclerView.getChildAt(i2);
                    int R2 = RecyclerView.R(childAt2);
                    if (R2 != -1) {
                        if (((Boolean) this.b.invoke(Integer.valueOf(R2))).booleanValue()) {
                            int G2 = tu0.G(((float) 4) * fk4.d().getDisplayMetrics().density);
                            RectF rectF2 = this.o;
                            rectF2.set((float) (childAt2.getLeft() - G2), (float) (childAt2.getTop() - G2), (float) (childAt2.getRight() + G2), (float) (childAt2.getBottom() + G2));
                            canvas.drawRoundRect(rectF2, fk4.d().getDisplayMetrics().density * 12.0f, fk4.d().getDisplayMetrics().density * 12.0f, this.X);
                        }
                    }
                }
                return;
        }
    }

    public final void onThemeChanged(fka fka) {
        switch (this.a) {
            case 0:
                this.X.setColor(fka.b().a.m);
                return;
            default:
                this.X.setColor(fka.i().h);
                return;
        }
    }

    public so9(Context context, nq nqVar) {
        this.b = nqVar;
        this.c = new gaa(17);
        this.o = new RectF();
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 2.0f);
        this.X = paint;
        onThemeChanged(qp4.u0.b(context).i());
    }
}
