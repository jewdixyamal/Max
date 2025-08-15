package defpackage;

import android.view.View;

/* renamed from: n6b  reason: default package */
public final class n6b implements View.OnLayoutChangeListener {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ View c;

    public n6b(View view, float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0028, code lost:
        r6 = r6.getInsets(8);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9) {
        /*
            r0 = this;
            r1.removeOnLayoutChangeListener(r0)
            float r1 = r0.a
            int r1 = defpackage.tu0.G(r1)
            float r2 = r0.b
            int r2 = defpackage.tu0.G(r2)
            android.view.View r0 = r0.c
            android.view.View r3 = r0.getRootView()
            android.graphics.Rect r4 = defpackage.o6b.a
            r3.getWindowVisibleDisplayFrame(r4)
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 30
            if (r5 < r6) goto L_0x0035
            int r5 = r4.bottom
            android.view.WindowInsets r6 = r3.getRootWindowInsets()
            if (r6 == 0) goto L_0x0031
            android.graphics.Insets r6 = r6.getInsets(8)
            if (r6 == 0) goto L_0x0031
            int r6 = r6.bottom
            goto L_0x0032
        L_0x0031:
            r6 = 0
        L_0x0032:
            int r5 = r5 - r6
            r4.bottom = r5
        L_0x0035:
            int r5 = r4.bottom
            int r5 = r5 - r2
            r6 = 8
            float r7 = (float) r6
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            int r5 = defpackage.rh4.q(r7, r8, r5)
            int r4 = r4.top
            int r4 = r4 + r2
            android.content.res.Resources r8 = defpackage.fk4.d()
            android.util.DisplayMetrics r8 = r8.getDisplayMetrics()
            float r8 = r8.density
            int r4 = defpackage.rh4.q(r7, r8, r4)
            int r8 = r0.getMeasuredHeight()
            if (r5 <= r8) goto L_0x006f
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int r2 = defpackage.rh4.c(r7, r4, r2)
            goto L_0x0080
        L_0x006f:
            if (r4 <= r8) goto L_0x0080
            int r2 = r2 - r8
            android.content.res.Resources r4 = defpackage.fk4.d()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int r2 = defpackage.rh4.q(r7, r4, r2)
        L_0x0080:
            int r4 = r0.getMeasuredWidth()
            int r5 = r1 + r4
            int r7 = r3.getWidth()
            if (r5 < r7) goto L_0x0092
            int r1 = r3.getWidth()
            int r1 = r1 - r4
            int r1 = r1 - r6
        L_0x0092:
            float r1 = (float) r1
            r0.setX(r1)
            float r1 = (float) r2
            r0.setY(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n6b.onLayoutChange(android.view.View, int, int, int, int, int, int, int, int):void");
    }
}
