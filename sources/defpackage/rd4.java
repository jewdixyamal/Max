package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* renamed from: rd4  reason: default package */
public final class rd4 extends nvd {
    public final sd4 c;

    public rd4(sd4 sd4) {
        this.c = sd4;
    }

    public final void a(ViewGroup viewGroup) {
        sd4 sd4 = this.c;
        ovd ovd = (ovd) sd4.b;
        View view = ovd.c.U0;
        view.clearAnimation();
        viewGroup.endViewTransition(view);
        ((ovd) sd4.b).c(this);
        if (Log.isLoggable("FragmentManager", 2)) {
            ovd.toString();
        }
    }

    public final void b(ViewGroup viewGroup) {
        sd4 sd4 = this.c;
        boolean U1 = sd4.U1();
        ovd ovd = (ovd) sd4.b;
        if (U1) {
            ovd.c(this);
            return;
        }
        Context context = viewGroup.getContext();
        View view = ovd.c.U0;
        ph4 Z1 = sd4.Z1(context);
        if (Z1 != null) {
            Animation animation = (Animation) Z1.a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.".toString());
            } else if (ovd.a != 1) {
                view.startAnimation(animation);
                ovd.c(this);
            } else {
                viewGroup.startViewTransition(view);
                a16 a16 = new a16(animation, viewGroup, view);
                a16.setAnimationListener(new qd4(ovd, viewGroup, view, this));
                view.startAnimation(a16);
                if (Log.isLoggable("FragmentManager", 2)) {
                    ovd.toString();
                }
            }
        } else {
            throw new IllegalStateException("Required value was null.".toString());
        }
    }
}
