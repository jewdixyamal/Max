package defpackage;

import android.animation.Animator;
import android.view.View;

/* renamed from: rg  reason: default package */
public final class rg implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ String b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ m56 f;

    public rg(View view, int i, String str, float f2, float f3, boolean z, m56 m56) {
        this.a = view;
        this.b = str;
        this.c = f2;
        this.d = f3;
        this.e = z;
        this.f = m56;
    }

    public final void onAnimationCancel(Animator animator) {
        View view = this.a;
        view.setAlpha(this.d);
        boolean z = false;
        view.setVisibility(this.e ? 0 : 8);
        m56 m56 = this.f;
        if (m56 != null) {
            if (view.getVisibility() == 0) {
                z = true;
            }
            m56.invoke(Boolean.valueOf(z));
        }
        view.setTag(y7a.m, (Object) null);
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        view.setAlpha(this.d);
        boolean z = false;
        view.setVisibility(this.e ? 0 : 8);
        m56 m56 = this.f;
        if (m56 != null) {
            if (view.getVisibility() == 0) {
                z = true;
            }
            m56.invoke(Boolean.valueOf(z));
        }
        view.setTag(y7a.m, (Object) null);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        int i = y7a.m;
        View view = this.a;
        view.setTag(i, this.b);
        view.setAlpha(this.c);
        view.setVisibility(0);
    }
}
