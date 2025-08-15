package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.Animation;

/* renamed from: tk9  reason: default package */
public final class tk9 extends kp {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tk9(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    public final void p() {
        switch (this.e) {
            case 0:
                uk9 uk9 = (uk9) this.f;
                uk9.Y.setAnimation((Animation) null);
                uk9.Y.setVisibility(8);
                uk9.n(new fj0(23));
                return;
            default:
                o1b o1b = (o1b) this.f;
                jn5 jn5 = o1b.D0;
                if (jn5 != null) {
                    try {
                        ValueAnimator valueAnimator = jn5.v0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        nd7.z(o1b.D0.getContext()).removeView(o1b.D0);
                    } catch (Exception unused) {
                    }
                }
                o1b.D0 = null;
                return;
        }
    }
}
