package defpackage;

import android.view.ViewTreeObserver;

/* renamed from: qp0  reason: default package */
public final /* synthetic */ class qp0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qp0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final boolean onPreDraw() {
        switch (this.a) {
            case 0:
                ((sp0) this.b).c();
                return true;
            default:
                p85 p85 = (p85) this.b;
                if (!p85.x0 && p85.getMeasuredWidth() > 0) {
                    p85.b(p85.getMeasuredWidth());
                    p85.x0 = true;
                    p85.requestLayout();
                }
                if (p85.x0) {
                    p85.getViewTreeObserver().removeOnPreDrawListener(p85.B0);
                    p85.B0 = null;
                }
                return true;
        }
    }
}
