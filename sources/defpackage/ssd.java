package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import ru.ok.messages.views.widgets.SlideOutLayout;

/* renamed from: ssd  reason: default package */
public final class ssd extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ SlideOutLayout b;

    public ssd(SlideOutLayout slideOutLayout, int i) {
        this.b = slideOutLayout;
        this.a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        tsd tsd = this.b.y0;
        if (tsd != null) {
            tsd.M(this.a);
        }
    }
}
