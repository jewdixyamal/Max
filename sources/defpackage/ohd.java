package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ohd  reason: default package */
public final class ohd extends ndc implements kre {
    public final float a = 0.5f;
    public final Rect b = new Rect();
    public final Paint c;

    public ohd(Context context) {
        Paint paint = new Paint();
        paint.setColor(qp4.u0.b(context).i().i().b.b);
        this.c = paint;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r4 = androidx.recyclerview.widget.RecyclerView.U(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(android.graphics.Rect r3, android.view.View r4, androidx.recyclerview.widget.RecyclerView r5, defpackage.zdc r6) {
        /*
            r2 = this;
            hdc r5 = r5.A0
            r0 = -1
            if (r5 == 0) goto L_0x0014
            boolean r5 = r5.b
            if (r5 != 0) goto L_0x000b
            goto L_0x0014
        L_0x000b:
            dec r4 = androidx.recyclerview.widget.RecyclerView.U(r4)
            if (r4 == 0) goto L_0x0014
            long r4 = r4.X
            goto L_0x0015
        L_0x0014:
            r4 = r0
        L_0x0015:
            int r6 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x001a
            return
        L_0x001a:
            long r0 = defpackage.jha.h
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0034
            int r4 = r3.bottom
            android.content.res.Resources r5 = defpackage.fk4.d()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r2 = r2.a
            int r2 = defpackage.rh4.c(r2, r5, r4)
            r3.bottom = r2
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ohd.f(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, zdc):void");
    }

    public final void h(Canvas canvas, RecyclerView recyclerView) {
        dec U;
        int i = 0;
        while (true) {
            if (i < recyclerView.getChildCount()) {
                int i2 = i + 1;
                View childAt = recyclerView.getChildAt(i);
                if (childAt != null) {
                    hdc hdc = recyclerView.A0;
                    long j = -1;
                    if (!(hdc == null || !hdc.b || (U = RecyclerView.U(childAt)) == null)) {
                        j = U.X;
                    }
                    if (j == jha.h) {
                        int left = childAt.getLeft();
                        Rect rect = this.b;
                        rect.left = left;
                        rect.top = childAt.getBottom();
                        rect.bottom = rh4.c(this.a, fk4.d().getDisplayMetrics().density, childAt.getBottom());
                        rect.right = childAt.getRight();
                        canvas.drawRect(rect, this.c);
                        return;
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
        this.c.setColor(fka.i().b.b);
    }
}
