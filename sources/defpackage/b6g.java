package defpackage;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* renamed from: b6g  reason: default package */
public final class b6g extends yof {
    public final /* synthetic */ int a;
    public final /* synthetic */ d6g b;

    public /* synthetic */ b6g(d6g d6g, int i) {
        this.a = i;
        this.b = d6g;
    }

    public final void c() {
        View view;
        d6g d6g = this.b;
        switch (this.a) {
            case 0:
                if (d6g.C0 && (view = d6g.u0) != null) {
                    view.setTranslationY(0.0f);
                    d6g.Z.setTranslationY(0.0f);
                }
                d6g.Z.setVisibility(8);
                d6g.Z.setTransitioning(false);
                d6g.G0 = null;
                i7 i7Var = d6g.y0;
                if (i7Var != null) {
                    i7Var.l(d6g.x0);
                    d6g.x0 = null;
                    d6g.y0 = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = d6g.Y;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = zmf.a;
                    mmf.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                d6g.G0 = null;
                d6g.Z.requestLayout();
                return;
        }
    }
}
