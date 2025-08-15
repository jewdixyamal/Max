package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: zwc  reason: default package */
public final class zwc implements spf {
    public final /* synthetic */ b9b a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ Rect c;
    public final /* synthetic */ Rect d;
    public final /* synthetic */ int e;

    public zwc(b9b b9b, Rect rect, Rect rect2, Rect rect3, int i) {
        this.a = b9b;
        this.b = rect;
        this.c = rect2;
        this.d = rect3;
        this.e = i;
    }

    public final void a() {
    }

    public final void b() {
        b9b b9b = this.a;
        View view = (View) b9b.c;
        RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView) view : null;
        if (recyclerView != null) {
            kp.x(recyclerView, new xya(recyclerView, 1));
        }
        b9b.c = null;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(android.graphics.Rect r6, android.view.View r7) {
        /*
            r5 = this;
            b9b r0 = r5.a
            java.lang.Object r1 = r0.c
            android.view.View r1 = (android.view.View) r1
            r2 = 0
            if (r1 != 0) goto L_0x002a
            android.view.View r1 = defpackage.b9b.j(r7)
            if (r1 != 0) goto L_0x0015
            android.view.ViewParent r1 = r7.getParent()
            android.view.View r1 = (android.view.View) r1
        L_0x0015:
            r0.c = r1
            boolean r3 = r1 instanceof androidx.recyclerview.widget.RecyclerView
            if (r3 == 0) goto L_0x001e
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            goto L_0x001f
        L_0x001e:
            r1 = r2
        L_0x001f:
            if (r1 == 0) goto L_0x002a
            xya r3 = new xya
            r4 = 2
            r3.<init>(r1, r4)
            defpackage.kp.x(r1, r3)
        L_0x002a:
            java.lang.Object r1 = r0.b
            android.view.View r1 = (android.view.View) r1
            android.graphics.Rect r3 = r5.b
            defpackage.mpf.d(r3, r1)
            android.view.ViewParent r1 = r1.getParent()
            boolean r4 = r1 instanceof defpackage.f6b
            if (r4 == 0) goto L_0x003e
            r2 = r1
            f6b r2 = (defpackage.f6b) r2
        L_0x003e:
            if (r2 == 0) goto L_0x004b
            z5b r1 = r2.getCallback()
            if (r1 == 0) goto L_0x004b
            int r1 = r1.c()
            goto L_0x004d
        L_0x004b:
            int r1 = r3.top
        L_0x004d:
            java.lang.Object r0 = r0.c
            android.view.View r0 = (android.view.View) r0
            android.graphics.Rect r2 = r5.c
            if (r0 == 0) goto L_0x0058
            defpackage.mpf.d(r2, r0)
        L_0x0058:
            int r0 = r2.top
            int r3 = r5.e
            int r0 = r0 + r3
            android.graphics.Rect r5 = r5.d
            r5.top = r0
            int r1 = r1 - r3
            r5.bottom = r1
            int r0 = r2.left
            r5.left = r0
            int r0 = r2.right
            r5.right = r0
            boolean r0 = r5.contains(r6)
            if (r0 != 0) goto L_0x007b
            v3c r7 = defpackage.b9b.i(r7)
            if (r7 == 0) goto L_0x007b
            r7.l(r6, r5)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zwc.c(android.graphics.Rect, android.view.View):void");
    }
}
