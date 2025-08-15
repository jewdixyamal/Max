package defpackage;

import android.animation.AnimatorSet;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import java.util.Objects;

/* renamed from: ud4  reason: default package */
public final class ud4 extends nvd {
    public final sd4 c;
    public AnimatorSet d;

    public ud4(sd4 sd4) {
        this.c = sd4;
    }

    public final void a(ViewGroup viewGroup) {
        AnimatorSet animatorSet = this.d;
        sd4 sd4 = this.c;
        if (animatorSet == null) {
            ((ovd) sd4.b).c(this);
            return;
        }
        ovd ovd = (ovd) sd4.b;
        if (ovd.g) {
            wd4.a.a(animatorSet);
        } else {
            animatorSet.end();
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            ovd.toString();
        }
    }

    public final void b(ViewGroup viewGroup) {
        ovd ovd = (ovd) this.c.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            ovd.c(this);
            return;
        }
        animatorSet.start();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(ovd);
        }
    }

    public final void c(ge0 ge0) {
        ovd ovd = (ovd) this.c.b;
        AnimatorSet animatorSet = this.d;
        if (animatorSet == null) {
            ovd.c(this);
        } else if (Build.VERSION.SDK_INT >= 34 && ovd.c.y0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                ovd.toString();
            }
            long a = vd4.a.a(animatorSet);
            long j = (long) (ge0.c * ((float) a));
            if (j == 0) {
                j = 1;
            }
            if (j == a) {
                j = a - 1;
            }
            if (Log.isLoggable("FragmentManager", 2)) {
                animatorSet.toString();
                ovd.toString();
            }
            wd4.a.b(animatorSet, j);
        }
    }

    public final void d(ViewGroup viewGroup) {
        sd4 sd4 = this.c;
        if (!sd4.U1()) {
            ph4 Z1 = sd4.Z1(viewGroup.getContext());
            this.d = Z1 != null ? (AnimatorSet) Z1.b : null;
            ovd ovd = (ovd) sd4.b;
            a aVar = ovd.c;
            boolean z = ovd.a == 3;
            View view = aVar.U0;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.d;
            if (animatorSet != null) {
                animatorSet.addListener(new td4(viewGroup, view, z, ovd, this));
            }
            AnimatorSet animatorSet2 = this.d;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }
    }
}
