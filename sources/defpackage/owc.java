package defpackage;

import android.animation.Animator;
import android.view.View;

/* renamed from: owc  reason: default package */
public final class owc implements Animator.AnimatorListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ rwc b;
    public final /* synthetic */ lwc c;
    public final /* synthetic */ rwc d;
    public final /* synthetic */ iwc e;

    public owc(iwc iwc, rwc rwc, lwc lwc, rwc rwc2, iwc iwc2) {
        this.a = iwc;
        this.b = rwc;
        this.c = lwc;
        this.d = rwc2;
        this.e = iwc2;
    }

    public final void onAnimationCancel(Animator animator) {
        View view = this.a;
        view.setVisibility(8);
        view.setTranslationY(0.0f);
        this.b.v0.put(this.c, (Object) null);
        this.d.removeView(this.e);
    }

    public final void onAnimationEnd(Animator animator) {
        View view = this.a;
        view.setVisibility(8);
        view.setTranslationY(0.0f);
        this.b.v0.put(this.c, (Object) null);
        this.d.removeView(this.e);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
