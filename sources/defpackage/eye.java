package defpackage;

import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import java.util.Set;

/* renamed from: eye  reason: default package */
public final class eye extends FrameLayout {
    public dye a;

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.a != null) {
            int action = motionEvent.getAction();
            if (action == 0) {
                el9 el9 = (el9) this.a;
                if (el9.D0.getVisibility() == 0) {
                    ViewPropertyAnimator translationY = el9.C0.animate().translationY((float) (-el9.M0.n));
                    tg tgVar = el9.v0;
                    translationY.setInterpolator(tgVar.a.n()).setDuration(tgVar.a.b());
                }
                el9.n(new fj0(8));
            } else if (action == 1) {
                el9 el92 = (el9) this.a;
                if (el92.D0.getVisibility() == 0) {
                    ViewPropertyAnimator translationY2 = el92.C0.animate().translationY(0.0f);
                    tg tgVar2 = el92.v0;
                    translationY2.setInterpolator(tgVar2.a.n()).setDuration(tgVar2.a.b());
                }
                el92.n(new fj0(0));
            } else if (action == 2) {
                for (fk9 fk9 : (Set) ((el9) this.a).a) {
                    fk9.F0 = false;
                    d08 a2 = fk9.E0.a();
                    a2.a = er7.Z;
                    fk9.E0 = a2.a();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setListener(dye dye) {
        this.a = dye;
    }
}
