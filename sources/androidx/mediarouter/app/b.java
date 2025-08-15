package androidx.mediarouter.app;

import android.view.animation.Animation;
import java.util.Iterator;

public final class b implements Animation.AnimationListener {
    public final /* synthetic */ d a;

    public b(d dVar) {
        this.a = dVar;
    }

    public final void onAnimationEnd(Animation animation) {
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
        d dVar = this.a;
        OverlayListView overlayListView = dVar.O0;
        Iterator it = overlayListView.a.iterator();
        while (it.hasNext()) {
            coa coa = (coa) it.next();
            if (!coa.k) {
                coa.j = overlayListView.getDrawingTime();
                coa.k = true;
            }
        }
        dVar.O0.postDelayed(dVar.y1, (long) dVar.r1);
    }
}
