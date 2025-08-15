package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;

/* renamed from: td4  reason: default package */
public final class td4 extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ View b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ovd d;
    public final /* synthetic */ ud4 e;

    public td4(ViewGroup viewGroup, View view, boolean z, ovd ovd, ud4 ud4) {
        this.a = viewGroup;
        this.b = view;
        this.c = z;
        this.d = ovd;
        this.e = ud4;
    }

    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.a;
        View view = this.b;
        viewGroup.endViewTransition(view);
        boolean z = this.c;
        ovd ovd = this.d;
        if (z) {
            k7d.a(ovd.a, view, viewGroup);
        }
        ud4 ud4 = this.e;
        ((ovd) ud4.c.b).c(ud4);
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString(ovd);
        }
    }
}
