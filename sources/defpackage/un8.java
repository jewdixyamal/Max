package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: un8  reason: default package */
public final class un8 extends ndc implements kre {
    public final /* synthetic */ int a;
    public final Paint b;
    public final Rect c;
    public final Object o;

    public un8(int i, fka fka) {
        this.a = i;
        switch (i) {
            case 1:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.FILL);
                this.b = paint;
                this.o = new RectF();
                this.c = new Rect();
                onThemeChanged(fka);
                return;
            default:
                Paint paint2 = new Paint();
                paint2.setStrokeWidth(fk4.d().getDisplayMetrics().density * 0.5f);
                this.b = paint2;
                this.c = new Rect();
                this.o = new gaa(17);
                onThemeChanged(fka);
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: jn8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean i(androidx.recyclerview.widget.RecyclerView r6, android.view.View r7) {
        /*
            hdc r6 = r6.getAdapter()
            boolean r0 = r6 instanceof defpackage.ppd
            r1 = 0
            if (r0 == 0) goto L_0x000c
            ppd r6 = (defpackage.ppd) r6
            goto L_0x000d
        L_0x000c:
            r6 = r1
        L_0x000d:
            r0 = 0
            if (r6 != 0) goto L_0x0011
            return r0
        L_0x0011:
            int r7 = androidx.recyclerview.widget.RecyclerView.R(r7)
            int r2 = r7 + -1
            if (r7 > 0) goto L_0x001a
            return r0
        L_0x001a:
            int r3 = r6.l(r7)
            int r4 = r6.l(r2)
            iv r6 = r6.o
            java.util.List r5 = r6.f
            java.lang.Object r7 = defpackage.x53.j0(r7, r5)
            boolean r5 = r7 instanceof defpackage.jn8
            if (r5 == 0) goto L_0x0031
            jn8 r7 = (defpackage.jn8) r7
            goto L_0x0032
        L_0x0031:
            r7 = r1
        L_0x0032:
            r5 = 1
            if (r7 == 0) goto L_0x003b
            boolean r7 = r7.t0
            if (r7 != 0) goto L_0x003b
            r7 = r5
            goto L_0x003c
        L_0x003b:
            r7 = r0
        L_0x003c:
            java.util.List r6 = r6.f
            java.lang.Object r6 = defpackage.x53.j0(r2, r6)
            boolean r2 = r6 instanceof defpackage.jn8
            if (r2 == 0) goto L_0x0049
            r1 = r6
            jn8 r1 = (defpackage.jn8) r1
        L_0x0049:
            if (r1 == 0) goto L_0x0051
            boolean r6 = r1.t0
            if (r6 != r5) goto L_0x0051
            r6 = r5
            goto L_0x0052
        L_0x0051:
            r6 = r0
        L_0x0052:
            int r1 = defpackage.mda.F
            if (r3 != r1) goto L_0x005a
            int r1 = defpackage.mda.D
            if (r4 == r1) goto L_0x005e
        L_0x005a:
            if (r7 == 0) goto L_0x005f
            if (r6 == 0) goto L_0x005f
        L_0x005e:
            r0 = r5
        L_0x005f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.un8.i(androidx.recyclerview.widget.RecyclerView, android.view.View):boolean");
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdc) {
        int R;
        switch (this.a) {
            case 0:
                super.f(rect, view, recyclerView, zdc);
                if (i(recyclerView, view)) {
                    rect.top = (int) (((float) (tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density) * 2)) + 0.5f);
                }
                ((gaa) this.o).E(rect, view, recyclerView);
                return;
            default:
                dec T = recyclerView.T(view);
                if (T != null && (T instanceof us2) && (R = RecyclerView.R(view)) != -1) {
                    Boolean valueOf = Boolean.valueOf(((us2) T).Y == vs2.b);
                    if (zdc.b == null) {
                        zdc.b = new SparseArray();
                    }
                    zdc.b.put(R, valueOf);
                    return;
                }
                return;
        }
    }

    public void g(Canvas canvas, RecyclerView recyclerView, zdc zdc) {
        switch (this.a) {
            case 1:
                RectF rectF = (RectF) this.o;
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int R = RecyclerView.R(childAt);
                    if (recyclerView.T(childAt) instanceof us2) {
                        SparseArray sparseArray = zdc.b;
                        boolean f = tpa.f(sparseArray == null ? null : sparseArray.get(R), Boolean.TRUE);
                        if (f) {
                            Rect rect = this.c;
                            RecyclerView.V(rect, childAt);
                            if (rectF.height() == 0.0f) {
                                rectF.set(rect);
                            } else {
                                rectF.left = Math.min(rectF.left, (float) rect.left);
                                rectF.top = Math.min(rectF.top, (float) rect.top);
                                rectF.right = Math.max(rectF.right, (float) rect.right);
                                rectF.bottom = Math.max(rectF.bottom, (float) rect.bottom);
                            }
                        }
                        if ((!f || i == recyclerView.getChildCount() - 1) && rectF.height() != 0.0f) {
                            canvas.drawRect(rectF, this.b);
                            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                }
                return;
            default:
                return;
        }
    }

    public void h(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    if (i < recyclerView.getChildCount()) {
                        int i2 = i + 1;
                        View childAt = recyclerView.getChildAt(i);
                        if (childAt != null) {
                            if (i(recyclerView, childAt)) {
                                int R = RecyclerView.R(childAt);
                                Rect rect = this.c;
                                ((gaa) this.o).x(rect, childAt, R);
                                canvas.drawLine((float) rect.left, (float) rect.centerY(), (float) rect.right, (float) rect.centerY(), this.b);
                            }
                            i = i2;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        return;
                    }
                }
            default:
                return;
        }
    }

    public final void onThemeChanged(fka fka) {
        switch (this.a) {
            case 0:
                this.b.setColor(fka.i().b.b);
                return;
            default:
                this.b.setColor(fka.b().m);
                return;
        }
    }
}
