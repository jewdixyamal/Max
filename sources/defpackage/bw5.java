package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Locale;

/* renamed from: bw5  reason: default package */
public final class bw5 extends ndc implements kre {
    public final Object X;
    public final /* synthetic */ int a = 1;
    public final Rect b;
    public final gaa c;
    public final Object o;

    public bw5(nw4 nw4) {
        this.o = nw4;
        this.b = new Rect();
        TextPaint textPaint = new TextPaint();
        nw4.q(textPaint);
        this.X = textPaint;
        this.c = new gaa(17);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r1 = r3.l(r4);
        r2 = defpackage.oba.l;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean i(androidx.recyclerview.widget.RecyclerView r3, int r4) {
        /*
            hdc r3 = r3.getAdapter()
            r0 = 0
            if (r3 != 0) goto L_0x0008
            return r0
        L_0x0008:
            r1 = -1
            if (r4 == r1) goto L_0x001e
            if (r4 == 0) goto L_0x001e
            int r1 = r3.l(r4)
            int r2 = defpackage.oba.l
            if (r1 != r2) goto L_0x001e
            r1 = 1
            int r4 = r4 - r1
            int r3 = r3.l(r4)
            if (r3 == r2) goto L_0x001e
            r0 = r1
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw5.i(androidx.recyclerview.widget.RecyclerView, int):boolean");
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, zdc zdc) {
        int R;
        switch (this.a) {
            case 0:
                super.f(rect, view, recyclerView, zdc);
                hdc adapter = recyclerView.getAdapter();
                if (adapter != null && (R = RecyclerView.R(view)) > 0 && adapter.l(R) == oba.i) {
                    rect.top = (int) (((float) (tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density) * 2)) + 0.5f);
                }
                this.c.E(rect, view, recyclerView);
                return;
            case 1:
                super.f(rect, view, recyclerView, zdc);
                recyclerView.getClass();
                if (i(recyclerView, RecyclerView.R(view))) {
                    rect.top = tu0.G(((float) 48) * fk4.d().getDisplayMetrics().density);
                }
                this.c.E(rect, view, recyclerView);
                return;
            case 2:
                super.f(rect, view, recyclerView, zdc);
                if (j(recyclerView, view)) {
                    rect.top = (int) (((float) (tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density) * 2)) + 0.5f);
                }
                this.c.E(rect, view, recyclerView);
                return;
            default:
                super.f(rect, view, recyclerView, zdc);
                recyclerView.getClass();
                if (((nw4) this.o).m(RecyclerView.R(view))) {
                    int i = rect.top;
                    TextPaint textPaint = (TextPaint) this.X;
                    rect.top = (tu0.G(((float) 6) * fk4.d().getDisplayMetrics().density) * 2) + ((int) (textPaint.descent() - textPaint.ascent())) + i;
                }
                this.c.E(rect, view, recyclerView);
                return;
        }
    }

    public void g(Canvas canvas, RecyclerView recyclerView, zdc zdc) {
        int R;
        switch (this.a) {
            case 0:
                int i = 0;
                while (true) {
                    if (i < recyclerView.getChildCount()) {
                        int i2 = i + 1;
                        View childAt = recyclerView.getChildAt(i);
                        if (childAt != null) {
                            hdc adapter = recyclerView.getAdapter();
                            if (adapter != null && (R = RecyclerView.R(childAt)) > 0 && adapter.l(R) == oba.i) {
                                int R2 = RecyclerView.R(childAt);
                                gaa gaa = this.c;
                                Rect rect = this.b;
                                gaa.x(rect, childAt, R2);
                                float f = (float) 12;
                                Canvas canvas2 = canvas;
                                canvas2.drawRect((float) rh4.c(f, fk4.d().getDisplayMetrics().density, rect.left), (float) rect.top, (float) rh4.q(f, fk4.d().getDisplayMetrics().density, rect.right), (float) rect.bottom, (Paint) this.X);
                                float f2 = (float) 24;
                                canvas2.drawLine((float) rh4.c(f2, fk4.d().getDisplayMetrics().density, rect.left), (float) rect.centerY(), (float) rh4.q(f2, fk4.d().getDisplayMetrics().density, rect.right), (float) rect.centerY(), (Paint) this.o);
                            }
                            i = i2;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        return;
                    }
                }
            case 1:
                int i3 = 0;
                while (true) {
                    if (i3 < recyclerView.getChildCount()) {
                        int i4 = i3 + 1;
                        View childAt2 = recyclerView.getChildAt(i3);
                        if (childAt2 != null) {
                            recyclerView.getClass();
                            int R3 = RecyclerView.R(childAt2);
                            if (i(recyclerView, R3)) {
                                String upperCase = ((Context) this.o).getString(qba.b).toUpperCase(Locale.ROOT);
                                gaa gaa2 = this.c;
                                Rect rect2 = this.b;
                                gaa2.x(rect2, childAt2, R3);
                                canvas.drawText(upperCase, ((float) rect2.left) + ((float) tu0.G(((float) 28) * fk4.d().getDisplayMetrics().density)), ((float) rect2.bottom) - ((float) tu0.G(((float) 10) * fk4.d().getDisplayMetrics().density)), (TextPaint) this.X);
                            }
                            i3 = i4;
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

    public void h(Canvas canvas, RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        switch (this.a) {
            case 2:
                Canvas canvas2 = canvas;
                int i = 0;
                while (true) {
                    if (i < recyclerView.getChildCount()) {
                        int i2 = i + 1;
                        View childAt = recyclerView2.getChildAt(i);
                        if (childAt != null) {
                            if (j(recyclerView2, childAt)) {
                                int G = tu0.G(((float) 12) * fk4.d().getDisplayMetrics().density);
                                int G2 = tu0.G(((float) 18) * fk4.d().getDisplayMetrics().density);
                                int R = RecyclerView.R(childAt);
                                gaa gaa = this.c;
                                Rect rect = this.b;
                                gaa.x(rect, childAt, R);
                                canvas.drawLine((float) (rect.left + G), (float) rect.centerY(), (float) (rect.right - G2), (float) rect.centerY(), (Paint) this.o);
                            }
                            i = i2;
                        } else {
                            throw new IndexOutOfBoundsException();
                        }
                    } else {
                        return;
                    }
                }
            case 3:
                int i3 = 0;
                while (true) {
                    if (i3 < recyclerView.getChildCount()) {
                        int i4 = i3 + 1;
                        View childAt2 = recyclerView2.getChildAt(i3);
                        if (childAt2 != null) {
                            recyclerView.getClass();
                            int R2 = RecyclerView.R(childAt2);
                            if (R2 != -1) {
                                nw4 nw4 = (nw4) this.o;
                                if (nw4.m(R2)) {
                                    gaa gaa2 = this.c;
                                    Rect rect2 = this.b;
                                    gaa2.x(rect2, childAt2, R2);
                                    float G3 = ((float) rect2.left) + ((float) tu0.G(((float) 16) * fk4.d().getDisplayMetrics().density));
                                    TextPaint textPaint = (TextPaint) this.X;
                                    canvas.drawText((String) nw4.c, G3, textPaint.descent() + ((float) rect2.centerY()), textPaint);
                                    i3 = i4;
                                }
                            }
                            Canvas canvas3 = canvas;
                            i3 = i4;
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

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        r2 = r3.l((r4 = androidx.recyclerview.widget.RecyclerView.R(r4)));
        r1 = defpackage.z8a.s;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean j(androidx.recyclerview.widget.RecyclerView r3, android.view.View r4) {
        /*
            r2 = this;
            hdc r3 = r3.getAdapter()
            r0 = 0
            if (r3 != 0) goto L_0x0008
            return r0
        L_0x0008:
            int r4 = androidx.recyclerview.widget.RecyclerView.R(r4)
            if (r4 <= 0) goto L_0x002a
            java.lang.Object r2 = r2.X
            in3 r2 = (defpackage.in3) r2
            boolean r2 = r2.c(r4)
            if (r2 == 0) goto L_0x0019
            goto L_0x002a
        L_0x0019:
            int r2 = r3.l(r4)
            int r1 = defpackage.z8a.s
            if (r2 != r1) goto L_0x002a
            r2 = 1
            int r4 = r4 - r2
            int r3 = r3.l(r4)
            if (r3 == r1) goto L_0x002a
            r0 = r2
        L_0x002a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw5.j(androidx.recyclerview.widget.RecyclerView, android.view.View):boolean");
    }

    public final void onThemeChanged(fka fka) {
        switch (this.a) {
            case 0:
                ((Paint) this.o).setColor(fka.i().b.b);
                ((Paint) this.X).setColor(fka.b().g);
                return;
            case 1:
                kqe kqe = i4f.r;
                DisplayMetrics displayMetrics = ((Context) this.o).getResources().getDisplayMetrics();
                TextPaint textPaint = (TextPaint) this.X;
                kqe.a(textPaint, displayMetrics, du4.b);
                textPaint.setColor(fka.getText().g);
                return;
            case 2:
                ((Paint) this.o).setColor(fka.i().b.b);
                return;
            default:
                ((nw4) this.o).q((TextPaint) this.X);
                return;
        }
    }

    public bw5(fka fka) {
        Paint paint = new Paint();
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 0.5f);
        this.o = paint;
        this.X = new Paint();
        this.b = new Rect();
        this.c = new gaa(17);
        onThemeChanged(fka);
    }

    public bw5(fka fka, vyd vyd) {
        this.X = vyd;
        Paint paint = new Paint();
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 0.5f);
        this.o = paint;
        this.b = new Rect();
        this.c = new gaa(17);
        onThemeChanged(fka);
    }

    public bw5(Context context) {
        this.o = context;
        this.b = new Rect();
        this.X = new TextPaint();
        onThemeChanged(qp4.u0.b(context).i());
        this.c = new gaa(17);
    }
}
