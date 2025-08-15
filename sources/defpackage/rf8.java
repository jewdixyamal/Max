package defpackage;

import android.view.animation.Animation;
import androidx.mediarouter.app.d;

/* renamed from: rf8  reason: default package */
public final class rf8 implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rf8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        switch (this.a) {
            case 0:
                ((d) this.b).k(true);
                return;
            default:
                pg8 pg8 = ((ng8) this.b).x0;
                pg8.J0 = false;
                pg8.o();
                return;
        }
    }

    public final void onAnimationRepeat(Animation animation) {
        int i = this.a;
    }

    public final void onAnimationStart(Animation animation) {
        switch (this.a) {
            case 0:
                return;
            default:
                ((ng8) this.b).x0.J0 = true;
                return;
        }
    }
}
